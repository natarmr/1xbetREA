package a;

import android.app.Activity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.registration.api.domain.models.BonusInfoModel;

/* JADX INFO: loaded from: classes4.dex */
public class ivn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15453a;

    public ivn(bek bekVar, cad cadVar, us00 us00Var, oeg0 oeg0Var, gii0 gii0Var, btt0 btt0Var, yox yoxVar, gst0 gst0Var, azj0 azj0Var, nhv0 nhv0Var, ysr ysrVar, atr atrVar, rsr rsrVar, m49 m49Var, n49 n49Var, knf0 knf0Var, tgk tgkVar, us3 us3Var, meu0 meu0Var, c49 c49Var) {
        oeg0Var.getClass();
        gii0Var.getClass();
        btt0Var.getClass();
        gst0Var.getClass();
        azj0Var.getClass();
        nhv0Var.getClass();
        ysrVar.getClass();
        atrVar.getClass();
        rsrVar.getClass();
        m49Var.getClass();
        n49Var.getClass();
        knf0Var.getClass();
        tgkVar.getClass();
        us3Var.getClass();
        meu0Var.getClass();
        c49Var.getClass();
        this.f15453a = new v5i(cadVar, us00Var, gii0Var, btt0Var, gst0Var, azj0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, knf0Var, tgkVar, us3Var, meu0Var, c49Var);
    }

    public u7r b() {
        return null;
    }

    public xhl c() {
        return (xhl) this.f15453a;
    }

    public UUID d() {
        return tg9.f33898a;
    }

    public int e() {
        return 1;
    }

    public void f(Throwable th, Function1 function1) {
        th.getClass();
        ((duj) this.f15453a).b(th, new fun(th, function1, (byte) 29));
    }

    public azc g(double d, double d2, boolean z) {
        if (((ave) ((tqc) this.f15453a).f34374a.c).h) {
            return azc.d;
        }
        if (z) {
            return azc.f1709a;
        }
        if (d == 0.0d || d2 == 0.0d) {
            return azc.f1709a;
        }
        if (d > d2) {
            return azc.b;
        }
        return d < d2 ? azc.c : azc.f1709a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable h(long j, zje zjeVar, boolean z) {
        eut eutVar;
        if (zjeVar instanceof eut) {
            eutVar = (eut) zjeVar;
            int i = eutVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                eutVar.k = i - Integer.MIN_VALUE;
            } else {
                eutVar = new eut(this, zjeVar);
            }
        } else {
            eutVar = new eut(this, zjeVar);
        }
        Object objG = eutVar.i;
        wne wneVar = wne.f39444a;
        int i2 = eutVar.k;
        if (i2 == 0) {
            z1x.P(objG);
            phf0 phf0Var = (phf0) this.f15453a;
            eutVar.k = 1;
            objG = phf0Var.g(j, eutVar, z);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objG) {
            if (((csr) obj).c != dsr.d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(int i, int i2, zje zjeVar) {
        r4u r4uVar;
        if (zjeVar instanceof r4u) {
            r4uVar = (r4u) zjeVar;
            int i3 = r4uVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r4uVar.k = i3 - Integer.MIN_VALUE;
            } else {
                r4uVar = new r4u(this, zjeVar);
            }
        } else {
            r4uVar = new r4u(this, zjeVar);
        }
        Object objB = r4uVar.i;
        wne wneVar = wne.f39444a;
        int i4 = r4uVar.k;
        Object obj = null;
        if (i4 == 0) {
            z1x.P(objB);
            r4uVar.k = 1;
            objB = ((oue0) this.f15453a).b(i, i2, r4uVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        List list = (List) objB;
        for (Object obj2 : list) {
            if (((BonusInfoModel) obj2).d) {
                obj = obj2;
                break;
            }
        }
        BonusInfoModel bonusInfoModel = (BonusInfoModel) obj;
        if (bonusInfoModel != null) {
            return bonusInfoModel;
        }
        BonusInfoModel bonusInfoModel2 = (BonusInfoModel) CollectionsKt.firstOrNull(list);
        return bonusInfoModel2 == null ? new BonusInfoModel(0, "", "", true) : bonusInfoModel2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(int i, zje zjeVar, CyberGamesPage cyberGamesPage) {
        h2u h2uVar;
        Object g0g0Var;
        if (zjeVar instanceof h2u) {
            h2uVar = (h2u) zjeVar;
            int i2 = h2uVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h2uVar.k = i2 - Integer.MIN_VALUE;
            } else {
                h2uVar = new h2u(this, zjeVar);
            }
        } else {
            h2uVar = new h2u(this, zjeVar);
        }
        Object objA = h2uVar.i;
        wne wneVar = wne.f39444a;
        int i3 = h2uVar.k;
        try {
            if (i3 == 0) {
                z1x.P(objA);
                e0g0 e0g0Var = j0g0.b;
                img imgVar = (img) this.f15453a;
                h2uVar.k = 1;
                objA = imgVar.a(cyberGamesPage, i, false, h2uVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objA);
            }
            g0g0Var = (List) objA;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? iun.f15405a : g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(long j, zje zjeVar) {
        uwt uwtVar;
        if (zjeVar instanceof uwt) {
            uwtVar = (uwt) zjeVar;
            int i = uwtVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                uwtVar.l = i - Integer.MIN_VALUE;
            } else {
                uwtVar = new uwt(this, zjeVar);
            }
        } else {
            uwtVar = new uwt(this, zjeVar);
        }
        Object objJ = uwtVar.j;
        wne wneVar = wne.f39444a;
        int i2 = uwtVar.l;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objJ);
            qgd qgdVar = (qgd) this.f15453a;
            Long l = new Long(j);
            uwtVar.i = j;
            uwtVar.l = 1;
            objJ = qgdVar.J(true, l, uwtVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = uwtVar.i;
            z1x.P(objJ);
        }
        for (Object obj2 : (Iterable) objJ) {
            if (((asc0) obj2).f1385a == j) {
                obj = obj2;
                break;
            }
        }
        asc0 asc0Var = (asc0) obj;
        if (asc0Var != null) {
            return asc0Var;
        }
        throw new IllegalStateException(("No such category " + j).toString());
    }

    public String l() {
        return ((us3) ((peg0) this.f15453a).b).b();
    }

    public void n(Activity activity) {
        o24 o24Var = (o24) this.f15453a;
        ArrayList<WeakReference> arrayList = (ArrayList) o24Var.c;
        for (WeakReference weakReference : arrayList) {
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener((c7r) o24Var.d);
    }

    public void a(zhl zhlVar) {
    }

    public void m(zhl zhlVar) {
    }

    public ivn(ju9 ju9Var) {
        ju9Var.getClass();
        this.f15453a = ju9Var;
    }

    public ivn(axh axhVar) {
        axhVar.getClass();
        this.f15453a = axhVar;
    }

    public ivn(as20 as20Var) {
        as20Var.getClass();
        this.f15453a = as20Var;
    }

    public ivn(oue0 oue0Var) {
        oue0Var.getClass();
        this.f15453a = oue0Var;
    }

    public ivn(gii0 gii0Var) {
        gii0Var.getClass();
        this.f15453a = new wgn(gii0Var, (byte) 23);
    }

    public ivn(azj0 azj0Var) {
        azj0Var.getClass();
        this.f15453a = new jcs(azj0Var, (byte) 7);
    }

    public ivn(q2m0 q2m0Var) {
        q2m0Var.getClass();
        this.f15453a = q2m0Var;
    }

    public ivn(cad cadVar, duj dujVar, gii0 gii0Var, btt0 btt0Var, vwb0 vwb0Var, iqt iqtVar) {
        gii0Var.getClass();
        btt0Var.getClass();
        vwb0Var.getClass();
        esg0 esg0Var = new esg0();
        esg0Var.f8326a = btt0Var;
        esg0Var.b = cadVar;
        esg0Var.c = vwb0Var;
        esg0Var.d = gii0Var;
        esg0Var.e = iqtVar;
        esg0Var.f = dujVar;
        this.f15453a = esg0Var;
    }

    public /* synthetic */ ivn(Object obj) {
        this.f15453a = obj;
    }

    public ivn() {
        this.f15453a = new o24((byte) 5);
    }
}
