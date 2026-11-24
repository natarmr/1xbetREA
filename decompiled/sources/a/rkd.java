package a;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class rkd implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ skd f30642a;

    public rkd(skd skdVar) {
        this.f30642a = skdVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f30642a.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        skd skdVar = this.f30642a;
        skdVar.g.f34967a.clear();
        btf0 btf0Var = skdVar.h;
        synchronized (btf0Var) {
            btf0Var.f3181a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        skd skdVar = this.f30642a;
        skdVar.g.f34967a.clear();
        btf0 btf0Var = skdVar.h;
        synchronized (btf0Var) {
            btf0Var.f3181a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        ((hgk0) this.f30642a.t.c).setValue(Boolean.valueOf(z));
    }
}
