package a;

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: loaded from: classes.dex */
public final class a2a implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f115a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a2a(Object obj, byte b) {
        this.f115a = b;
        this.b = obj;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.f115a) {
            case 0:
                onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
                break;
            default:
                l8x.U("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
                raq0 raq0Var = (raq0) this.b;
                raq0Var.f = surfaceTexture;
                if (raq0Var.g == null) {
                    raq0Var.h();
                } else {
                    raq0Var.h.getClass();
                    l8x.U("TextureViewImpl", "Surface invalidated " + raq0Var.h);
                    raq0Var.h.k.a();
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        boolean z = false;
        Object[] objArr = 0;
        switch (this.f115a) {
            case 0:
                return false;
            default:
                raq0 raq0Var = (raq0) this.b;
                raq0Var.f = null;
                wu9 wu9Var = raq0Var.g;
                if (wu9Var == null) {
                    l8x.U("TextureViewImpl", "SurfaceTexture about to be destroyed");
                    return true;
                }
                trm0 trm0Var = new trm0((Object) this, (Object) surfaceTexture, z, (byte) 4);
                wu9Var.a(new mfr((Object) wu9Var, (Object) trm0Var, (byte) (objArr == true ? 1 : 0)), jiq0.o0(raq0Var.e.getContext()));
                raq0Var.j = surfaceTexture;
                return false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        switch (this.f115a) {
            case 0:
                d2a d2aVar = (d2a) this.b;
                d2aVar.p = new g7k0(i, i2);
                d2aVar.g();
                break;
            default:
                l8x.U("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.f115a) {
            case 0:
                break;
            default:
                tu9 tu9Var = (tu9) ((raq0) this.b).k.getAndSet(null);
                if (tu9Var != null) {
                    tu9Var.b(null);
                }
                break;
        }
    }

    private final void a(SurfaceTexture surfaceTexture) {
    }
}
