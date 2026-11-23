package com.duckcraftian.upf.engine;

import com.duckcraftian.upf.UPF;
import com.duckcraftian.upf.engine.system.EntryPoint;
import com.duckcraftian.upf.impl.IDisposable;

public class Game implements EntryPoint {

    public Game() {
        UPF.REGISTRY_MANAGER.createNamespace("REPLACE ME");
    }

    @Override
    public void init() {}

    @Override
    public void update(float delta) {}

    @Override
    public void render() {}

    @Override
    public void resize(int width, int height) {}

    @Override
    public void onDispose() {}

}