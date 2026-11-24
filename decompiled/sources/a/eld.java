package a;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class eld implements bo30, ail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7990a;
    public zhl b;
    public zhl c;
    public final /* synthetic */ gld d;

    public eld(gld gldVar, Object obj) {
        this.d = gldVar;
        int i = 0;
        vn30 vn30Var = null;
        this.b = new zhl(gldVar.c.c, i, vn30Var);
        this.c = new zhl(gldVar.d.c, i, vn30Var);
        this.f7990a = obj;
    }

    @Override // a.bo30
    public final void B(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var, IOException iOException, boolean z) {
        if (a(i, vn30Var)) {
            zhl zhlVar = this.b;
            zhlVar.a(new zn30(zhlVar, wn00Var, b(in30Var, vn30Var), iOException, z));
        }
    }

    public final boolean a(int i, vn30 vn30Var) {
        vn30 vn30VarS;
        Object obj = this.f7990a;
        gld gldVar = this.d;
        if (vn30Var != null) {
            vn30VarS = gldVar.s(obj, vn30Var);
            if (vn30VarS == null) {
                return false;
            }
        } else {
            vn30VarS = null;
        }
        int iU = gldVar.u(i, obj);
        zhl zhlVar = this.b;
        if (zhlVar.f44398a != iU || !Objects.equals(zhlVar.b, vn30VarS)) {
            this.b = new zhl(gldVar.c.c, iU, vn30VarS);
        }
        zhl zhlVar2 = this.c;
        if (zhlVar2.f44398a == iU && Objects.equals(zhlVar2.b, vn30VarS)) {
            return true;
        }
        this.c = new zhl(gldVar.d.c, iU, vn30VarS);
        return true;
    }

    public final in30 b(in30 in30Var, vn30 vn30Var) {
        long j = in30Var.f;
        gld gldVar = this.d;
        Object obj = this.f7990a;
        long jT = gldVar.t(obj, j);
        long j2 = in30Var.g;
        long jT2 = gldVar.t(obj, j2);
        return (jT == j && jT2 == j2) ? in30Var : new in30(in30Var.f15054a, in30Var.b, in30Var.c, in30Var.d, in30Var.e, jT, jT2);
    }

    @Override // a.bo30
    public final void i(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var, int i2) {
        if (a(i, vn30Var)) {
            zhl zhlVar = this.b;
            zhlVar.a(new xn30(zhlVar, wn00Var, b(in30Var, vn30Var), i2));
        }
    }

    @Override // a.bo30
    public final void j(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var) {
        if (a(i, vn30Var)) {
            zhl zhlVar = this.b;
            zhlVar.a(new yn30(zhlVar, wn00Var, b(in30Var, vn30Var), (byte) 1));
        }
    }

    @Override // a.bo30
    public final void p(int i, vn30 vn30Var, in30 in30Var) {
        if (a(i, vn30Var)) {
            zhl zhlVar = this.b;
            zhlVar.a(new uq((Object) zhlVar, (Object) b(in30Var, vn30Var), (byte) 20));
        }
    }

    @Override // a.bo30
    public final void r(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var) {
        if (a(i, vn30Var)) {
            zhl zhlVar = this.b;
            zhlVar.a(new yn30(zhlVar, wn00Var, b(in30Var, vn30Var), (byte) 0));
        }
    }

    @Override // a.bo30
    public final void z(int i, vn30 vn30Var, in30 in30Var) {
        if (a(i, vn30Var)) {
            zhl zhlVar = this.b;
            in30 in30VarB = b(in30Var, vn30Var);
            vn30 vn30Var2 = zhlVar.b;
            vn30Var2.getClass();
            zhlVar.a(new hi(zhlVar, vn30Var2, in30VarB, (byte) 9));
        }
    }
}
