package com.base.engine.components;

import com.base.engine.core.Vector3f;
import com.base.engine.rendering.Attenuation;
import com.base.engine.rendering.Shader;

public class SpotLight extends PointLight
{
	private float m_cutoff;
	
	public SpotLight(Vector3f color, float intensity, Attenuation attenuation, float cutoff)
	{
		super(color, intensity, attenuation);
		this.m_cutoff = cutoff;

		SetShader(new Shader("forward-spot"));
	}
	
	public Vector3f GetDirection()
	{
		return GetTransform().GetTransformedRot().GetForward();
	}

	public float GetCutoff()
	{
		return m_cutoff;
	}

	public void SetCutoff(float cutoff)
	{
		this.m_cutoff = cutoff;
	}
}
