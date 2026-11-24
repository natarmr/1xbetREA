package a;

import android.view.Window;

/* JADX INFO: loaded from: classes5.dex */
public final class fxv0 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10331a;
    public final /* synthetic */ Window b;
    public final /* synthetic */ Window c;

    public fxv0(boolean z, Window window, Window window2) {
        this.f10331a = z;
        this.b = window;
        this.c = window2;
    }

    @Override // a.kwk
    public final void a() {
        if (this.f10331a) {
            Window window = this.b;
            if (window != null) {
                hxv0.b(window);
            }
            Window window2 = this.c;
            if (window2 != null) {
                hxv0.b(window2);
            }
        }
    }
}
