#verison 330

layout (location = 0) in vec3 position;

void Main()
{
gl_Position = vec4(0.25 * position, 1.0);
}

