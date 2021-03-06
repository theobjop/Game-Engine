package com.github.theobjop.engine;

import com.github.theobjop.engine.render.light.DirectionalLight;
import com.github.theobjop.engine.render.light.PointLight;
import com.github.theobjop.engine.render.light.SpotLight;
import org.joml.Vector3f;

/**
 * Created by Brandon on 2/23/2017.
 */
public class SceneLight {

    public static final SceneLight DEFAULT;
    static {
        SceneLight defaultSceneLight = new SceneLight();
        defaultSceneLight.setAmbientLight(new Vector3f(1,1,1));
        DirectionalLight defaultDirectionalLight = new DirectionalLight(new Vector3f(1,1,1), new Vector3f(1,1,1), 1f);
        defaultSceneLight.setDirectionalLight(defaultDirectionalLight);

        DEFAULT = defaultSceneLight;
    }

    private Vector3f ambientLight;
    private Vector3f skyBoxLight;
    private PointLight[] pointLightList;
    private SpotLight[] spotLightList;
    private DirectionalLight directionalLight;

    public Vector3f getAmbientLight() {
        return ambientLight;
    }

    public void setAmbientLight(Vector3f ambientLight) {
        this.ambientLight = ambientLight;
    }

    public PointLight[] getPointLightList() {
        return pointLightList;
    }

    public void setPointLightList(PointLight[] pointLightList) {
        this.pointLightList = pointLightList;
    }

    public SpotLight[] getSpotLightList() {
        return spotLightList;
    }

    public void setSpotLightList(SpotLight[] spotLightList) {
        this.spotLightList = spotLightList;
    }

    public DirectionalLight getDirectionalLight() {
        return directionalLight;
    }

    public void setDirectionalLight(DirectionalLight directionalLight) {
        this.directionalLight = directionalLight;
    }

    public Vector3f getSkyBoxLight() {
        return skyBoxLight;
    }

    public void setSkyBoxLight(Vector3f skyBoxLight) {
        this.skyBoxLight = skyBoxLight;
    }
}
