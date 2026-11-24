package a;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline$Window;
import com.huawei.hms.adapter.internal.CommonCode;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fsj implements ky90, bo30, ail {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l9o0 f10066a;
    public final amq0 b;
    public final Timeline$Window c;
    public final uii d;
    public final SparseArray e;
    public vg00 f;
    public my90 g;
    public q9o0 h;
    public boolean i;

    public fsj(l9o0 l9o0Var) {
        l9o0Var.getClass();
        this.f10066a = l9o0Var;
        this.f = new vg00(vtt0.u().getThread());
        amq0 amq0Var = new amq0();
        this.b = amq0Var;
        this.c = new Timeline$Window();
        this.d = new uii(amq0Var);
        this.e = new SparseArray();
    }

    @Override // a.ky90
    public final void A(jn30 jn30Var) {
        N(I(), 14, new csj((byte) 1));
    }

    @Override // a.bo30
    public final void B(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var, IOException iOException, boolean z) {
        ft2 ft2VarL = L(i, vn30Var);
        N(ft2VarL, 1003, new z9f(ft2VarL, wn00Var, in30Var, iOException, z));
    }

    @Override // a.ky90
    public final void C(dtf dtfVar) {
        N(I(), 27, new t9f((byte) 23));
    }

    @Override // a.ky90
    public final void D(int i) {
        N(I(), 8, new t9f((byte) 20));
    }

    @Override // a.ky90
    public final void E(rds0 rds0Var) {
        N(I(), 2, new t9f((byte) 16));
    }

    @Override // a.ky90
    public final void F(int i, boolean z) {
        N(I(), -1, new t9f((byte) 8));
    }

    @Override // a.ky90
    public final void G(dlo dloVar) {
        vn30 vn30Var;
        ft2 ft2VarI = (!(dloVar instanceof dlo) || (vn30Var = dloVar.h) == null) ? I() : J(vn30Var);
        N(ft2VarI, 10, new z9f(ft2VarI, dloVar, (byte) 8));
    }

    @Override // a.ky90
    public final void H(boolean z) {
        N(I(), 7, new t9f((byte) 10));
    }

    public final ft2 I() {
        return J((vn30) this.d.d);
    }

    public final ft2 J(vn30 vn30Var) {
        this.g.getClass();
        bmq0 bmq0Var = vn30Var == null ? null : (bmq0) ((wcf0) this.d.c).get(vn30Var);
        if (vn30Var != null && bmq0Var != null) {
            return K(bmq0Var, bmq0Var.g(vn30Var.f37698a, this.b).c, vn30Var);
        }
        int iJ = ((ulo) this.g).j();
        bmq0 bmq0VarN = ((ulo) this.g).n();
        if (iJ >= bmq0VarN.o()) {
            bmq0VarN = bmq0.f2849a;
        }
        return K(bmq0VarN, iJ, null);
    }

    public final ft2 K(bmq0 bmq0Var, int i, vn30 vn30Var) {
        vn30 vn30Var2 = bmq0Var.p() ? null : vn30Var;
        this.f10066a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = bmq0Var.equals(((ulo) this.g).n()) && i == ((ulo) this.g).j();
        long jY = 0;
        if (vn30Var2 == null || !vn30Var2.c()) {
            if (z) {
                ulo uloVar = (ulo) this.g;
                uloVar.c0();
                jY = uloVar.g(uloVar.n0);
            } else if (!bmq0Var.p()) {
                jY = vtt0.Y(bmq0Var.m(i, this.c, 0L).k);
            }
        } else if (z && ((ulo) this.g).h() == vn30Var2.b && ((ulo) this.g).i() == vn30Var2.c) {
            jY = ((ulo) this.g).l();
        }
        long j = jY;
        vn30 vn30Var3 = (vn30) this.d.d;
        bmq0 bmq0VarN = ((ulo) this.g).n();
        int iJ = ((ulo) this.g).j();
        long jL = ((ulo) this.g).l();
        ulo uloVar2 = (ulo) this.g;
        uloVar2.c0();
        return new ft2(jElapsedRealtime, bmq0Var, i, vn30Var2, j, bmq0VarN, iJ, vn30Var3, jL, vtt0.Y(uloVar2.n0.r));
    }

    public final ft2 L(int i, vn30 vn30Var) {
        this.g.getClass();
        if (vn30Var != null) {
            return ((bmq0) ((wcf0) this.d.c).get(vn30Var)) != null ? J(vn30Var) : K(bmq0.f2849a, i, vn30Var);
        }
        bmq0 bmq0VarN = ((ulo) this.g).n();
        if (i >= bmq0VarN.o()) {
            bmq0VarN = bmq0.f2849a;
        }
        return K(bmq0VarN, i, null);
    }

    public final ft2 M() {
        return J((vn30) this.d.f);
    }

    public final void N(ft2 ft2Var, int i, sg00 sg00Var) {
        this.e.put(i, ft2Var);
        this.f.e(i, sg00Var);
    }

    public final void O(ulo uloVar, Looper looper) {
        x0x.K(this.g == null || ((b4x) this.d.b).isEmpty());
        uloVar.getClass();
        this.g = uloVar;
        this.h = this.f10066a.a(looper, null);
        vg00 vg00Var = this.f;
        uq uqVar = new uq((Object) this, (Object) uloVar, (byte) 11);
        l9o0 l9o0Var = this.f10066a;
        x0x.K(l9o0Var != null);
        this.f = new vg00(vg00Var.d, looper, looper.getThread(), l9o0Var, uqVar, vg00Var.i);
    }

    @Override // a.ky90
    public final void a(qfu0 qfu0Var) {
        ft2 ft2VarM = M();
        N(ft2VarM, 25, new esj(ft2VarM, qfu0Var));
    }

    @Override // a.ky90
    public final void b(int i) {
        N(I(), 6, new t9f((byte) 12));
    }

    @Override // a.ky90
    public final void c(zx90 zx90Var) {
        N(I(), 12, new t9f((byte) 6));
    }

    @Override // a.ky90
    public final void d(iy90 iy90Var) {
        N(I(), 13, new csj((byte) 21));
    }

    @Override // a.ky90
    public final void e(int i) {
        N(M(), 21, new csj((byte) 6));
    }

    @Override // a.ky90
    public final void f(int i) {
        N(I(), 4, new t9f((byte) 18));
    }

    @Override // a.ky90
    public final void g(boolean z) {
        N(I(), 9, new csj((byte) 13));
    }

    @Override // a.bo30
    public final void i(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var, int i2) {
        N(L(i, vn30Var), 1000, new t9f((byte) 24));
    }

    @Override // a.bo30
    public final void j(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var) {
        N(L(i, vn30Var), CommonCode.BusInterceptor.PRIVACY_CANCEL, new csj((byte) 2));
    }

    @Override // a.ky90
    public final void k(int i) {
        my90 my90Var = this.g;
        my90Var.getClass();
        uii uiiVar = this.d;
        uiiVar.d = uii.g(my90Var, (b4x) uiiVar.b, (vn30) uiiVar.e, (amq0) uiiVar.f35730a);
        uiiVar.K(((ulo) my90Var).n());
        ft2 ft2VarI = I();
        N(ft2VarI, 0, new csj(ft2VarI, i));
    }

    @Override // a.ky90
    public final void m(boolean z) {
        N(M(), 23, new csj((byte) 15));
    }

    @Override // a.ky90
    public final void n(List list) {
        ft2 ft2VarI = I();
        N(ft2VarI, 27, new asj(ft2VarI, list));
    }

    @Override // a.ky90
    public final void o(MediaItem mediaItem, int i) {
        N(I(), 1, new csj((byte) 23));
    }

    @Override // a.bo30
    public final void p(int i, vn30 vn30Var, in30 in30Var) {
        ft2 ft2VarL = L(i, vn30Var);
        N(ft2VarL, 1004, new uq((Object) ft2VarL, (Object) in30Var, (byte) 12));
    }

    @Override // a.ky90
    public final void q(int i, int i2) {
        N(M(), 24, new t9f((byte) 22));
    }

    @Override // a.bo30
    public final void r(int i, vn30 vn30Var, wn00 wn00Var, in30 in30Var) {
        N(L(i, vn30Var), 1001, new csj((byte) 4));
    }

    @Override // a.ky90
    public final void s(scs0 scs0Var) {
        N(I(), 19, new csj((byte) 12));
    }

    @Override // a.ky90
    public final void t(ed40 ed40Var) {
        N(I(), 28, new t9f((byte) 9));
    }

    @Override // a.ky90
    public final void u(int i, ly90 ly90Var, ly90 ly90Var2) {
        if (i == 1) {
            this.i = false;
        }
        my90 my90Var = this.g;
        my90Var.getClass();
        uii uiiVar = this.d;
        uiiVar.d = uii.g(my90Var, (b4x) uiiVar.b, (vn30) uiiVar.e, (amq0) uiiVar.f35730a);
        ft2 ft2VarI = I();
        N(ft2VarI, 11, new bsj(ft2VarI, i, ly90Var, ly90Var2));
    }

    @Override // a.ky90
    public final void v(dlo dloVar) {
        vn30 vn30Var;
        N((!(dloVar instanceof dlo) || (vn30Var = dloVar.h) == null) ? I() : J(vn30Var), 10, new t9f((byte) 13));
    }

    @Override // a.ky90
    public final void w(boolean z) {
        N(I(), 3, new csj((byte) 19));
    }

    @Override // a.ky90
    public final void x(int i, boolean z) {
        N(I(), 5, new t9f((byte) 14));
    }

    @Override // a.ky90
    public final void y(float f) {
        N(M(), 22, new t9f((byte) 7));
    }

    @Override // a.bo30
    public final void z(int i, vn30 vn30Var, in30 in30Var) {
        N(L(i, vn30Var), 1005, new csj((byte) 9));
    }

    @Override // a.ky90
    public final void l() {
    }

    @Override // a.ky90
    public final void h(jy90 jy90Var) {
    }
}
