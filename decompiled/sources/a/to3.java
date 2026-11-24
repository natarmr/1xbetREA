package a;

import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class to3 implements g56 {
    public static boolean t;
    public static boolean u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vkr0 f34263a;
    public final h0q0 b;
    public final ikt0 c;
    public final mj50 d;
    public final mj50 e;
    public final rkt0 f;
    public final ot10 g;
    public final yo4 h;
    public final au0 i;
    public final n0o0 j;
    public String k;
    public final sje l;
    public final sje m;
    public boolean n;
    public bby o;
    public bby p;
    public bby q;
    public Long r;
    public final qoj0 s;

    public to3(vkr0 vkr0Var, h0q0 h0q0Var, ikt0 ikt0Var, mj50 mj50Var, mj50 mj50Var2, rkt0 rkt0Var, ot10 ot10Var, yo4 yo4Var, au0 au0Var, c1d0 c1d0Var, pru pruVar) {
        vkr0Var.getClass();
        h0q0Var.getClass();
        ikt0Var.getClass();
        mj50Var.getClass();
        mj50Var2.getClass();
        rkt0Var.getClass();
        ot10Var.getClass();
        yo4Var.getClass();
        au0Var.getClass();
        c1d0Var.getClass();
        pruVar.getClass();
        this.f34263a = vkr0Var;
        this.b = h0q0Var;
        this.c = ikt0Var;
        this.d = mj50Var;
        this.e = mj50Var2;
        this.f = rkt0Var;
        this.g = ot10Var;
        this.h = yo4Var;
        this.i = au0Var;
        this.j = maz.b(new hc0(pruVar, (byte) 8));
        this.k = Locale.getDefault().getDisplayLanguage();
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.l = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
        sje sjeVarA = d5c.a(kotlin.coroutines.e.c(dvjVar, qem0.e()));
        this.m = sjeVarA;
        yje yjeVar = null;
        this.s = roj0.b(1, 1, null, 4);
        slb.U(new dnq(new fnq(c1d0Var.f().a(), new y32(this, yjeVar, (byte) 12), (byte) 4), new lo3(3, yjeVar, (byte) 0), (byte) 1), sjeVarA);
    }

    @Override // a.g56
    public final void a() {
        synchronized (this) {
            try {
                bby bbyVar = this.q;
                yje yjeVar = null;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.q = sac.V(this.l, new ko3(this, (byte) 1), null, null, new ro3(this, yjeVar, (byte) 2), 14);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.g56
    public final s6n0 b() {
        return new s6n0(vtb.M(this.s), new wa(this, null, (byte) 10));
    }

    @Override // a.g56
    public final void c() {
        String displayLanguage = Locale.getDefault().getDisplayLanguage();
        if (Intrinsics.d(this.k, displayLanguage)) {
            return;
        }
        this.k = displayLanguage;
        d();
        this.s.g(new b56(iun.f15405a));
        g();
    }

    public final void d() {
        zvw.I(this.l.f32300a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zje zjeVar) {
        mo3 mo3Var;
        ujn ujnVar;
        if (zjeVar instanceof mo3) {
            mo3Var = (mo3) zjeVar;
            int i = mo3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                mo3Var.l = i - Integer.MIN_VALUE;
            } else {
                mo3Var = new mo3(this, zjeVar);
            }
        } else {
            mo3Var = new mo3(this, zjeVar);
        }
        Object obj = mo3Var.j;
        wne wneVar = wne.f39444a;
        int i2 = mo3Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            ujn ujnVar2 = ujn.g;
            mo3Var.i = ujnVar2;
            mo3Var.l = 1;
            Object objD = this.g.d(mo3Var);
            if (objD == wneVar) {
                return wneVar;
            }
            obj = objD;
            ujnVar = ujnVar2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ujnVar = mo3Var.i;
            z1x.P(obj);
        }
        String str = (String) obj;
        ujnVar.getClass();
        str.getClass();
        ujn.h = str;
        return Unit.f46060a;
    }

    public final Object f(List list, bnn0 bnn0Var) {
        Object objA = this.s.a(new b56(list), bnn0Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public final void g() {
        bby bbyVar = this.p;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        if (this.n) {
            return;
        }
        this.p = sac.V(this.l, new bk2(1, this, to3.class, "parseError", "parseError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, null, new ro3(this, yjeVar, (byte) 0), 14);
    }

    public final void h() {
        if (ua80.x((vwb0) ((yox) this.c.f14945a).f43005a, "EMPTY_FAVORITE_LOG", false) || t) {
            return;
        }
        this.h.f42966a.c("widget_favor_empty");
        this.i.f1455a.a(xun.f41520a, 3153L);
        t = true;
        u = false;
        ((vwb0) this.d.f21879a.f43005a).e("EMPTY_FAVORITE_LOG", true);
        ((vwb0) ((yox) this.f.b).f43005a).e("HAS_FAVORITE_LOG", false);
    }

    public final void i(Throwable th) {
        d();
        if (Intrinsics.d(th.getMessage(), "PROPHYLAXIS_CANCEL")) {
            return;
        }
        sac.V(this.l, so3.f32524a, null, null, new y32((Object) th, (Object) this, (yje) null, (byte) 13), 14);
    }

    public final void j(Throwable th) {
        boolean z = th instanceof zhi0;
        au0 au0Var = this.i;
        yo4 yo4Var = this.h;
        if (!z) {
            yo4Var.f42966a.c("widget_favor_error");
            au0Var.f1455a.a(xun.f41520a, 3152L);
            return;
        }
        zhi0 zhi0Var = (zhi0) th;
        b1j.w("error_code", Integer.valueOf(zhi0Var.c.getErrorCode()), yo4Var.f42966a, "widget_favor_error");
        int errorCode = zhi0Var.c.getErrorCode();
        if (errorCode > 0) {
            b1j.r(errorCode, au0Var.f1455a, 3152L);
        } else {
            au0Var.f1455a.a(xun.f41520a, 3152L);
        }
    }

    @Override // a.g56
    public final void onDestroy() {
        d5c.G(this.l, null);
        d5c.G(this.m, null);
        t = false;
        u = false;
        ((vwb0) this.d.f21879a.f43005a).e("EMPTY_FAVORITE_LOG", false);
        ((vwb0) ((yox) this.f.b).f43005a).e("HAS_FAVORITE_LOG", false);
    }
}
