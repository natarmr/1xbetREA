package a;

import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class uwv0 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Window f36411a;
    public final /* synthetic */ boolean b;

    public uwv0(Window window, boolean z) {
        this.f36411a = window;
        this.b = z;
    }

    @Override // a.kwk
    public final void a() {
        Window window = this.f36411a;
        if (window == null || !this.b) {
            return;
        }
        nkk0.a(window);
    }
}
