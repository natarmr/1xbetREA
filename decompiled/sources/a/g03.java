package a;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class g03 extends lr20 {
    @Override // a.zv00
    public final boolean a() {
        return Log.isLoggable(this.f20508a, 5);
    }

    @Override // a.zv00
    public final boolean b() {
        return Log.isLoggable(this.f20508a, 3);
    }

    @Override // a.zv00
    public final void d(String str) {
        r(6, str);
    }

    @Override // a.zv00
    public final boolean e() {
        return Log.isLoggable(this.f20508a, 4);
    }

    @Override // a.zv00
    public final boolean f() {
        return Log.isLoggable(this.f20508a, 2);
    }

    @Override // a.zv00
    public final boolean i() {
        return Log.isLoggable(this.f20508a, 6);
    }

    @Override // a.zv00
    public final void j(String str) {
        r(3, str);
    }

    @Override // a.zv00
    public final void l(String str) {
        r(4, str);
    }

    @Override // a.zv00
    public final void m(String str) {
        r(5, str);
    }

    @Override // a.zv00
    public final void n(String str) {
        r(2, str);
    }

    public final void r(int i, String str) {
        if (Log.isLoggable(this.f20508a, i)) {
            Log.println(i, this.f20508a, str);
        }
    }
}
