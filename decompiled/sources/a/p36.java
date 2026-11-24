package a;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p36 implements g56 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26285a = 0;
    public final h0q0 b;
    public final ot10 c;
    public final yo4 d;
    public final au0 e;
    public final n0o0 f;
    public String g;
    public final sje h;
    public final sje i;
    public boolean j;
    public final qoj0 k;
    public Long l;
    public bby m;
    public bby n;

    public p36(h0q0 h0q0Var, ot10 ot10Var, yo4 yo4Var, au0 au0Var, c1d0 c1d0Var, pru pruVar) {
        h0q0Var.getClass();
        ot10Var.getClass();
        yo4Var.getClass();
        au0Var.getClass();
        c1d0Var.getClass();
        pruVar.getClass();
        this.b = h0q0Var;
        this.c = ot10Var;
        this.d = yo4Var;
        this.e = au0Var;
        this.f = maz.b(new hc0(pruVar, (byte) 9));
        this.g = Locale.getDefault().getDisplayLanguage();
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.h = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
        sje sjeVarA = d5c.a(kotlin.coroutines.e.c(dvjVar, qem0.e()));
        this.i = sjeVarA;
        this.k = roj0.a(1, 1, i99.b);
        p7m0 p7m0VarA = c1d0Var.f().a();
        yje yjeVar = null;
        slb.U(new dnq(new fnq(p7m0VarA, new j36(this, yjeVar, (byte) 0), (byte) 4), new lo3(3, yjeVar, (byte) 2), (byte) 1), sjeVarA);
    }

    @Override // a.g56
    public final void a() {
        yje yjeVar = null;
        byte b = 1;
        switch (this.f26285a) {
            case 0:
                bby bbyVar = this.n;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                this.n = sac.V(this.h, new i36(this, b), null, null, new n36(this, yjeVar, b), 14);
                break;
            default:
                bby bbyVar2 = this.n;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                this.n = sac.V(this.h, new q36(this, (byte) 0), null, null, new v36(this, yjeVar, b), 14);
                break;
        }
    }

    @Override // a.g56
    public final s6n0 b() {
        byte b = this.f26285a;
        yje yjeVar = null;
        qoj0 qoj0Var = this.k;
        switch (b) {
            case 0:
                return new s6n0(vtb.M(qoj0Var), new wa(this, yjeVar, (byte) 17));
            default:
                return new s6n0(vtb.M(qoj0Var), new wa(this, yjeVar, (byte) 18));
        }
    }

    @Override // a.g56
    public final void c() {
        switch (this.f26285a) {
            case 0:
                String displayLanguage = Locale.getDefault().getDisplayLanguage();
                if (!Intrinsics.d(this.g, displayLanguage)) {
                    this.g = displayLanguage;
                    zvw.I(this.h.f32300a);
                    this.k.g(new b56(iun.f15405a));
                    f();
                }
                break;
            default:
                String displayLanguage2 = Locale.getDefault().getDisplayLanguage();
                if (!Intrinsics.d(this.g, displayLanguage2)) {
                    this.g = displayLanguage2;
                    zvw.I(this.h.f32300a);
                    this.k.g(new b56(iun.f15405a));
                    g();
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(zje zjeVar) {
        k36 k36Var;
        ujn ujnVar;
        if (zjeVar instanceof k36) {
            k36Var = (k36) zjeVar;
            int i = k36Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                k36Var.l = i - Integer.MIN_VALUE;
            } else {
                k36Var = new k36(this, zjeVar);
            }
        } else {
            k36Var = new k36(this, zjeVar);
        }
        Object obj = k36Var.j;
        wne wneVar = wne.f39444a;
        int i2 = k36Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            ujn ujnVar2 = ujn.g;
            k36Var.i = ujnVar2;
            k36Var.l = 1;
            Object objD = this.c.d(k36Var);
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
            ujnVar = k36Var.i;
            z1x.P(obj);
        }
        String str = (String) obj;
        ujnVar.getClass();
        str.getClass();
        ujn.h = str;
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(zje zjeVar) {
        s36 s36Var;
        ujn ujnVar;
        if (zjeVar instanceof s36) {
            s36Var = (s36) zjeVar;
            int i = s36Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                s36Var.l = i - Integer.MIN_VALUE;
            } else {
                s36Var = new s36(this, zjeVar);
            }
        } else {
            s36Var = new s36(this, zjeVar);
        }
        Object obj = s36Var.j;
        wne wneVar = wne.f39444a;
        int i2 = s36Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            ujn ujnVar2 = ujn.g;
            s36Var.i = ujnVar2;
            s36Var.l = 1;
            Object objD = this.c.d(s36Var);
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
            ujnVar = s36Var.i;
            z1x.P(obj);
        }
        String str = (String) obj;
        ujnVar.getClass();
        str.getClass();
        ujn.h = str;
        return Unit.f46060a;
    }

    public synchronized void f() {
        bby bbyVar;
        try {
            if (!this.j && ((bbyVar = this.m) == null || !bbyVar.isActive())) {
                byte b = 0;
                this.m = sac.V(this.h, new i36(this, b), null, null, new n36(this, null, b), 14);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void g() {
        try {
            if (!this.j) {
                bby bbyVar = this.m;
                byte b = 1;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.m = sac.V(this.h, new q36(this, b), null, null, new v36(this, null, (byte) 0), 14);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // a.g56
    public final void onDestroy() {
        switch (this.f26285a) {
            case 0:
                d5c.G(this.h, null);
                d5c.G(this.i, null);
                break;
            default:
                d5c.G(this.h, null);
                d5c.G(this.i, null);
                break;
        }
    }

    public p36(h0q0 h0q0Var, ot10 ot10Var, yo4 yo4Var, au0 au0Var, pru pruVar, c1d0 c1d0Var) {
        h0q0Var.getClass();
        ot10Var.getClass();
        yo4Var.getClass();
        au0Var.getClass();
        pruVar.getClass();
        c1d0Var.getClass();
        this.b = h0q0Var;
        this.c = ot10Var;
        this.d = yo4Var;
        this.e = au0Var;
        this.f = maz.b(new hc0(pruVar, (byte) 10));
        this.g = Locale.getDefault().getDisplayLanguage();
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.h = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
        sje sjeVarA = d5c.a(kotlin.coroutines.e.c(dvjVar, qem0.e()));
        this.i = sjeVarA;
        this.k = roj0.a(1, 1, i99.b);
        slb.U(new fnq(c1d0Var.f().a(), new r36(this, null, (byte) 0), (byte) 4), sjeVarA);
    }
}
