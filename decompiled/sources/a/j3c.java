package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class j3c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjl0 f15824a;

    public j3c(sjl0 sjl0Var, byte b) {
        sjl0Var.getClass();
        switch (b) {
            case 1:
                this.f15824a = sjl0Var;
                break;
            case 2:
                this.f15824a = sjl0Var;
                break;
            default:
                this.f15824a = sjl0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(long j, long j2, yje yjeVar) {
        fvu fvuVar;
        if (yjeVar instanceof fvu) {
            fvuVar = (fvu) yjeVar;
            int i = fvuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fvuVar.k = i - Integer.MIN_VALUE;
            } else {
                fvuVar = new fvu(this, yjeVar);
            }
        } else {
            fvuVar = new fvu(this, yjeVar);
        }
        fvu fvuVar2 = fvuVar;
        Object objF = fvuVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = fvuVar2.k;
        try {
            if (i2 == 0) {
                z1x.P(objF);
                sjl0 sjl0Var = this.f15824a;
                fvuVar2.k = 1;
                objF = sjl0Var.f(j, j2, fvuVar2);
                if (objF == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objF);
            }
            return (ypl0) objF;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            e2.printStackTrace();
            lel0.Companion.getClass();
            return new ypl0(0L, "", kel0.a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(long j, zje zjeVar) {
        i3c i3cVar;
        Object g0g0Var;
        if (zjeVar instanceof i3c) {
            i3cVar = (i3c) zjeVar;
            int i = i3cVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                i3cVar.k = i - Integer.MIN_VALUE;
            } else {
                i3cVar = new i3c(this, zjeVar);
            }
        } else {
            i3cVar = new i3c(this, zjeVar);
        }
        Object objC = i3cVar.i;
        wne wneVar = wne.f39444a;
        int i2 = i3cVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objC);
                e0g0 e0g0Var = j0g0.b;
                sjl0 sjl0Var = this.f15824a;
                i3cVar.k = 1;
                objC = sjl0Var.c(j, i3cVar);
                if (objC == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objC);
            }
            g0g0Var = (ril0) objC;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        ril0 ril0Var = (ril0) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        return Boolean.valueOf(ril0Var != null ? ril0Var.e : false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(yje yjeVar) {
        xwt xwtVar;
        if (yjeVar instanceof xwt) {
            xwtVar = (xwt) yjeVar;
            int i = xwtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xwtVar.k = i - Integer.MIN_VALUE;
            } else {
                xwtVar = new xwt(this, yjeVar);
            }
        } else {
            xwtVar = new xwt(this, yjeVar);
        }
        Object objD = xwtVar.i;
        Object obj = wne.f39444a;
        int i2 = xwtVar.k;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objD);
            xwtVar.k = 1;
            objD = this.f15824a.d(xwtVar);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        Iterable<ril0> iterableM0 = (List) objD;
        StringBuilder sb = new StringBuilder(ujn.h);
        if (StringsKt.O("%s", ujn.h, false) || kotlin.text.c.x("%s", "https://", false)) {
            sb.setLength(0);
            sb.append("%s");
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0("%s", '/'));
        }
        String string = sb.toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : iterableM0) {
            if (((ril0) obj3).f30549a == 40) {
                obj2 = obj3;
                break;
            }
        }
        ril0 ril0Var = (ril0) obj2;
        if (ril0Var != null) {
            for (f3n0 f3n0Var : ril0Var.f) {
                if (f3n0Var.c.j.length() > 0) {
                    linkedHashMap.put(new vcb(f3n0Var.f8872a), String.format(string, Arrays.copyOf(new Object[]{f3n0Var.c.j}, 1)));
                }
            }
            iterableM0 = CollectionsKt.m0(iterableM0, ril0Var);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (ril0 ril0Var2 : iterableM0) {
            if (ril0Var2.g.j.length() > 0) {
                linkedHashMap2.put(new tcb(ril0Var2.f30549a), new ucb(ril0Var2.g.j, ril0Var2.e));
            }
        }
        return new wcb(String.format(string, Arrays.copyOf(new Object[]{"/static/svg/sports_v2/%s.svg"}, 1)), linkedHashMap, linkedHashMap2);
    }
}
