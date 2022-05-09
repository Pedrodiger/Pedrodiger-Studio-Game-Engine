package com.base.engine.components;

import com.base.engine.core.Vector3f;
import com.base.engine.rendering.Shader;

public class DirectionalLight extends BaseLight
{
	public DirectionalLight(Vector3f color, float intensity)
	{
		super(color, intensity);

		SetShader(new Shader("forward-directional"));
	}

	public Vector3f GetDirection()
	{
		return GetTransform().GetTransformedRot().GetForward();
	}
}
