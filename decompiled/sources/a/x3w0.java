package a;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes.dex */
public final class x3w0 implements r0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xx f40240a;
    public final ca6 b;
    public final ca6 c;
    public final Handler d = new Handler(Looper.getMainLooper());

    public x3w0(xx xxVar, ca6 ca6Var, ca6 ca6Var2) {
        this.f40240a = xxVar;
        this.b = ca6Var;
        this.c = ca6Var2;
    }

    @Override // a.r0t
    @JavascriptInterface
    public void canChangeViewZone(boolean z) {
        this.d.post(new hp2(this, z, (byte) 6));
    }

    @Override // a.r0t
    @JavascriptInterface
    public void getModeZone(int i) {
        this.d.post(new n23(this, i, (byte) 14));
    }

    @Override // a.r0t
    @JavascriptInterface
    public void returnResult() {
        this.d.post(new apj0(this, (byte) 24));
    }
}
