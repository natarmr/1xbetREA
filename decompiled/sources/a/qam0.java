package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;

/* JADX INFO: loaded from: classes4.dex */
public final class qam0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f28403a;
    public final vby b;
    public final LinkedHashMap c;

    public qam0(vby vbyVar, q7d0 q7d0Var) {
        q7d0Var.getClass();
        vbyVar.getClass();
        this.f28403a = q7d0Var;
        this.b = vbyVar;
        this.c = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    public final Set a(String str) {
        t9m0 t9m0Var;
        Object g0g0Var;
        Object g0g0Var2;
        Object next;
        vby vbyVar = this.b;
        try {
            vbyVar.getClass();
            return (Set) vbyVar.b(new zw3(StatisticBlockModel.Companion.serializer(), (byte) 2), str);
        } catch (Exception unused) {
            yby ybyVarH = ncy.h(vbyVar.e(str));
            ArrayList arrayList = new ArrayList();
            Iterator it = ybyVarH.f42361a.iterator();
            while (it.hasNext()) {
                edy edyVarI = ncy.i((mcy) it.next());
                mcy mcyVar = (mcy) edyVarI.get("statId");
                StatisticBlockModel statisticBlockModel = null;
                if (mcyVar != null) {
                    jdy jdyVarJ = ncy.j(mcyVar);
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        Integer numG = ncy.g(jdyVarJ);
                        if (numG != null) {
                            s9m0 s9m0Var = t9m0.b;
                            int iIntValue = numG.intValue();
                            s9m0Var.getClass();
                            Integer num = (Integer) u9m0.f35291a.get(Integer.valueOf(iIntValue));
                            if (num != null) {
                                int iIntValue2 = num.intValue();
                                Iterator it2 = t9m0.h2.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (((t9m0) next).f33572a != iIntValue2);
                                g0g0Var = (t9m0) next;
                            } else {
                                g0g0Var = null;
                            }
                        } else {
                            g0g0Var = null;
                        }
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    e0g0 e0g0Var3 = j0g0.b;
                    if (g0g0Var instanceof g0g0) {
                        g0g0Var = null;
                    }
                    t9m0Var = (t9m0) g0g0Var;
                    if (t9m0Var == null) {
                        try {
                            g0g0Var2 = t9m0.valueOf(jdyVarJ.b());
                        } catch (Throwable th2) {
                            e0g0 e0g0Var4 = j0g0.b;
                            g0g0Var2 = new g0g0(th2);
                        }
                        if (g0g0Var2 instanceof g0g0) {
                            g0g0Var2 = null;
                        }
                        t9m0Var = (t9m0) g0g0Var2;
                    }
                } else {
                    t9m0Var = null;
                }
                mcy mcyVar2 = (mcy) edyVarI.get("statPosition");
                Integer numG2 = mcyVar2 != null ? ncy.g(ncy.j(mcyVar2)) : null;
                mcy mcyVar3 = (mcy) edyVarI.get("selected");
                Boolean boolB = mcyVar3 != null ? wsm0.b(ncy.j(mcyVar3).b()) : null;
                if (t9m0Var != null && numG2 != null && boolB != null) {
                    statisticBlockModel = new StatisticBlockModel(t9m0Var, numG2.intValue(), boolB.booleanValue());
                }
                if (statisticBlockModel != null) {
                    arrayList.add(statisticBlockModel);
                }
            }
            return CollectionsKt.P0(arrayList);
        }
    }

    public final Set b(dam0 dam0Var) {
        String str;
        Object g0g0Var;
        dam0Var.getClass();
        int iOrdinal = dam0Var.ordinal();
        if (iOrdinal == 0) {
            str = "GAME_";
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            str = "POST_GAME_";
        }
        String strConcat = str.concat("STATISTIC_BLOCKS_PREF_KEY");
        q7d0 q7d0Var = this.f28403a;
        String strC = q7d0.c(q7d0Var, strConcat);
        if (strC == null) {
            strC = "";
        }
        if (strC.length() == 0) {
            return xun.f41520a;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = a(strC);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            g0g0Var = xun.f41520a;
        }
        Set set = (Set) g0g0Var;
        if (!set.isEmpty()) {
            try {
                vby vbyVar = this.b;
                vbyVar.getClass();
                String strD = vbyVar.d(new zw3(StatisticBlockModel.Companion.serializer(), (byte) 2), set);
                if (!strD.equals(strC)) {
                    q7d0Var.g(strConcat, strD);
                }
            } catch (Throwable unused) {
                e0g0 e0g0Var3 = j0g0.b;
            }
        }
        return set;
    }
}
