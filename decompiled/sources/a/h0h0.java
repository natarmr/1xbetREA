package a;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class h0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0h0 f12236a;
    public final a7g0 b;
    public final y2m0 c = new y2m0((byte) 9);
    public final hz40 d;
    public boolean e;
    public Bundle f;
    public boolean g;
    public boolean h;

    public h0h0(i0h0 i0h0Var, a7g0 a7g0Var) {
        this.f12236a = i0h0Var;
        this.b = a7g0Var;
        long[] jArr = u1h0.f34903a;
        this.d = new hz40();
        this.h = true;
    }

    public final void a() {
        i0h0 i0h0Var = this.f12236a;
        if (i0h0Var.x().i != lkz.b) {
            jf4.n("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.e) {
                jf4.n("SavedStateRegistry was already attached.");
                return;
            }
            this.b.invoke();
            i0h0Var.x().a(new g02(this, (byte) 3));
            this.e = true;
        }
    }
}
