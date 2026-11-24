package a;

import java.io.File;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class b8u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2175a;

    public b8u(k41 k41Var) {
        k41Var.getClass();
        this.f2175a = k41Var;
    }

    public i89 a(bm5 bm5Var) {
        bm5Var.getClass();
        o7h0 o7h0Var = (o7h0) ((pv00) this.f2175a).f27640a;
        o7h0Var.getClass();
        return new i89(o7h0Var.a(bm5Var).b, (byte) 22);
    }

    public duw b() {
        return ((cuw) ((pyu) this.f2175a).f27815a).f5005a;
    }

    public qg40 c() {
        return ((my60) ((uyn) this.f2175a).f36498a).b;
    }

    public p7m0 d() {
        return ((ros) this.f2175a).b.b;
    }

    public Object e(File file, dxk dxkVar, bnn0 bnn0Var) {
        n660 n660Var = (n660) this.f2175a;
        file.getClass();
        File fileP = n660Var.p(file, dxkVar);
        return (!fileP.exists() || System.currentTimeMillis() - vwb0.a((vwb0) n660Var.f22981a, "RULES_UPDATE_TIME") >= 180000) ? qjj.d0(((mne) n660Var.c).b, new w090((Object) n660Var, (Object) dxkVar, (Object) file, (yje) null, (byte) 12), bnn0Var) : fileP;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(RatingStatisticScreenParams ratingStatisticScreenParams, zje zjeVar) throws Throwable {
        dtu dtuVar;
        if (zjeVar instanceof dtu) {
            dtuVar = (dtu) zjeVar;
            int i = dtuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dtuVar.k = i - Integer.MIN_VALUE;
            } else {
                dtuVar = new dtu(this, zjeVar);
            }
        } else {
            dtuVar = new dtu(this, zjeVar);
        }
        Object objO = dtuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = dtuVar.k;
        if (i2 == 0) {
            z1x.P(objO);
            uiu uiuVar = (uiu) this.f2175a;
            dtuVar.k = 1;
            objO = uiuVar.f35749a.o(ratingStatisticScreenParams, dtuVar);
            if (objO == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objO);
        }
        j6i0 j6i0Var = (j6i0) objO;
        if (j6i0Var != null) {
            return sek.r(j6i0Var);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object g(long j, long j2, long j3, zje zjeVar) {
        s9u s9uVar;
        if (zjeVar instanceof s9u) {
            s9uVar = (s9u) zjeVar;
            int i = s9uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                s9uVar.k = i - Integer.MIN_VALUE;
            } else {
                s9uVar = new s9u(this, zjeVar);
            }
        } else {
            s9uVar = new s9u(this, zjeVar);
        }
        s9u s9uVar2 = s9uVar;
        Object obj = s9uVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = s9uVar2.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        d4t0 d4t0Var = (d4t0) this.f2175a;
        s9uVar2.k = 1;
        Object objB = d4t0Var.b(j, j2, j3, s9uVar2);
        return objB == wneVar ? wneVar : objB;
    }

    public /* synthetic */ b8u(Object obj) {
        this.f2175a = obj;
    }

    public b8u(zfo zfoVar) {
        zfoVar.getClass();
        this.f2175a = zfoVar;
    }

    public b8u(goo gooVar) {
        gooVar.getClass();
        this.f2175a = gooVar;
    }

    public b8u(uiu uiuVar, sek sekVar) {
        this.f2175a = uiuVar;
    }

    public b8u(t090 t090Var) {
        t090Var.getClass();
        this.f2175a = t090Var;
    }

    public b8u(ros rosVar) {
        rosVar.getClass();
        this.f2175a = rosVar;
    }

    public b8u(rkc0 rkc0Var) {
        rkc0Var.getClass();
        this.f2175a = rkc0Var;
    }

    public b8u(xyp0 xyp0Var) {
        xyp0Var.getClass();
        this.f2175a = xyp0Var;
    }

    public b8u(d4t0 d4t0Var) {
        d4t0Var.getClass();
        this.f2175a = d4t0Var;
    }

    public b8u(jdu jduVar, ntu ntuVar, tqt tqtVar) {
        this.f2175a = tqtVar;
    }

    public b8u(jtj jtjVar, bst bstVar, rzt rztVar, tqt tqtVar) {
        this.f2175a = jtjVar;
    }
}
