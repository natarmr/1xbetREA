package a;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class go30 implements bo30, ail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io30 f11611a;
    public final /* synthetic */ jo30 b;

    public go30(jo30 jo30Var, io30 io30Var) {
        this.b = jo30Var;
        this.f11611a = io30Var;
    }

    @Override // a.bo30
    public final void B(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var, IOException iOException, boolean z) {
        Pair pairA = a(i, vn30Var);
        if (pairA != null) {
            this.b.j.e(new ha6((byte) 1, this, pairA, wn00Var, in30Var, iOException, z));
        }
    }

    public final Pair a(int i, vn30 vn30Var) {
        vn30 vn30VarA;
        io30 io30Var = this.f11611a;
        vn30 vn30Var2 = null;
        if (vn30Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= io30Var.c.size()) {
                    vn30VarA = null;
                    break;
                }
                if (((vn30) io30Var.c.get(i2)).d == vn30Var.d) {
                    Object obj = vn30Var.f37698a;
                    Object obj2 = io30Var.b;
                    int i3 = wna0.k;
                    vn30VarA = vn30Var.a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (vn30VarA == null) {
                return null;
            }
            vn30Var2 = vn30VarA;
        }
        return Pair.create(Integer.valueOf(i + io30Var.d), vn30Var2);
    }

    @Override // a.bo30
    public final void i(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var, int i2) {
        Pair pairA = a(i, vn30Var);
        if (pairA != null) {
            this.b.j.e(new v6e(this, pairA, wn00Var, in30Var, i2));
        }
    }

    @Override // a.bo30
    public final void j(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var) {
        Pair pairA = a(i, vn30Var);
        if (pairA != null) {
            this.b.j.e(new fo30(this, pairA, wn00Var, in30Var, (byte) 0));
        }
    }

    @Override // a.bo30
    public final void p(int i, vn30 vn30Var, in30 in30Var) {
        Pair pairA = a(i, vn30Var);
        if (pairA != null) {
            this.b.j.e(new eo30(this, pairA, in30Var, (byte) 1));
        }
    }

    @Override // a.bo30
    public final void r(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var) {
        Pair pairA = a(i, vn30Var);
        if (pairA != null) {
            this.b.j.e(new fo30(this, pairA, wn00Var, in30Var, (byte) 1));
        }
    }

    @Override // a.bo30
    public final void z(int i, vn30 vn30Var, in30 in30Var) {
        Pair pairA = a(i, vn30Var);
        if (pairA != null) {
            this.b.j.e(new eo30(this, pairA, in30Var, (byte) 0));
        }
    }
}
