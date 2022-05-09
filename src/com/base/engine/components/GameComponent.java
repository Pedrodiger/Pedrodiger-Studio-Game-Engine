package com.base.engine.components;

import com.base.engine.core.CoreEngine;
import com.base.engine.core.GameObject;
import com.base.engine.rendering.RenderingEngine;
import com.base.engine.core.Transform;
import com.base.engine.rendering.Shader;

public abstract class GameComponent
{
	private GameObject m_parent;

	public void Input(float delta) {}
	public void Update(float delta) {}
	public void Render(Shader shader, RenderingEngine renderingEngine) {}

	public void SetParent(GameObject parent)
	{
		this.m_parent = parent;
	}

	public Transform GetTransform()
	{
		return m_parent.GetTransform();
	}

	public void AddToEngine(CoreEngine engine) {}
}

