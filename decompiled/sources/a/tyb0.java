package a;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class tyb0 implements clz {
    public static final tyb0 i = new tyb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f34745a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final glz f = new glz(this, true);
    public final wss g = new wss(this, 22);
    public final nr00 h = new nr00(this);

    public final void a() {
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == 1) {
            if (this.c) {
                this.f.d(kkz.ON_RESUME);
                this.c = false;
            } else {
                Handler handler = this.e;
                handler.getClass();
                handler.removeCallbacks(this.g);
            }
        }
    }

    @Override // a.clz
    public final glz x() {
        return this.f;
    }
}
