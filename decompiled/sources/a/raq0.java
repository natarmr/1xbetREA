package a;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class raq0 extends dvb0 {
    public TextureView e;
    public SurfaceTexture f;
    public wu9 g;
    public pmn0 h;
    public boolean i;
    public SurfaceTexture j;
    public AtomicReference k;
    public hi l;

    @Override // a.dvb0
    public final View a() {
        return this.e;
    }

    @Override // a.dvb0
    public final Bitmap b() {
        TextureView textureView = this.e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.e.getBitmap();
    }

    @Override // a.dvb0
    public final void c() {
        if (!this.i || this.j == null) {
            return;
        }
        SurfaceTexture surfaceTexture = this.e.getSurfaceTexture();
        SurfaceTexture surfaceTexture2 = this.j;
        if (surfaceTexture != surfaceTexture2) {
            this.e.setSurfaceTexture(surfaceTexture2);
            this.j = null;
            this.i = false;
        }
    }

    @Override // a.dvb0
    public final void d() {
        this.i = true;
    }

    @Override // a.dvb0
    public final void e(pmn0 pmn0Var, hi hiVar) {
        hi hiVar2;
        Size size = pmn0Var.b;
        this.f6735a = size;
        size.getClass();
        FrameLayout frameLayout = this.b;
        TextureView textureView = new TextureView(frameLayout.getContext());
        this.e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f6735a.getWidth(), this.f6735a.getHeight()));
        this.e.setSurfaceTextureListener(new a2a(this, (byte) 1));
        frameLayout.removeAllViews();
        frameLayout.addView(this.e);
        pmn0 pmn0Var2 = this.h;
        if (pmn0Var2 != null && pmn0Var2.c() && (hiVar2 = this.l) != null) {
            hiVar2.b();
            this.l = null;
        }
        this.h = pmn0Var;
        this.l = hiVar;
        pmn0Var.j.a(new qaq0(this, pmn0Var, (byte) 0), jiq0.o0(this.e.getContext()));
        h();
    }

    @Override // a.dvb0
    public final ig00 g() {
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = hne.class;
        try {
            this.k.set(tu9Var);
            tu9Var.f34540a = "textureViewImpl_waitForNextFrame";
            return wu9Var;
        } catch (Exception e) {
            wu9Var.b(e);
            return wu9Var;
        }
    }

    public final void h() {
        SurfaceTexture surfaceTexture;
        Size size = this.f6735a;
        if (size == null || (surfaceTexture = this.f) == null || this.h == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f6735a.getHeight());
        Surface surface = new Surface(this.f);
        pmn0 pmn0Var = this.h;
        wu9 wu9VarI = y0x0.I(new lmn0(this, surface, (byte) 2));
        this.g = wu9VarI;
        wu9VarI.b.a(new qx9((Object) this, (Object) surface, (Object) wu9VarI, (Object) pmn0Var, (byte) 9), jiq0.o0(this.e.getContext()));
        this.d = true;
        f();
    }
}
