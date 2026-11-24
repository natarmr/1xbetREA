package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class aaw implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f551a;
    public final Object b;

    public /* synthetic */ aaw(Object obj, byte b) {
        this.f551a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        h0o h0oVar;
        Map mapB;
        usy usyVar;
        mx3 mx3VarA;
        ?? C;
        List<String> listAsList;
        byte b = this.f551a;
        Object obj = this.b;
        switch (b) {
            case 0:
                naw nawVar = (naw) obj;
                td9 td9Var = nawVar.J;
                sys0 sys0Var = nawVar.d;
                s77 s77Var = nawVar.D0;
                ql5 ql5Var = nawVar.C0;
                if (ql5Var == null || (str = ql5Var.f) == null) {
                    str = "";
                }
                String str2 = str;
                String str3 = nawVar.A0;
                String str4 = str3.length() > 0 ? str3 : null;
                td9Var.getClass();
                sys0Var.getClass();
                s77Var.getClass();
                x5w x5wVar = new x5w(sys0Var, (afm0) td9Var.b, (s5w) td9Var.c, s77Var, str2, td9Var.f33756a, str4);
                ((CopyOnWriteArrayList) td9Var.d).add(x5wVar);
                return x5wVar;
            case 1:
                return new q0h0((p0h0) ((s8x) obj).invoke());
            case 2:
                return (v8x) obj;
            case 3:
                return (riu0) ((aaw) obj).invoke();
            case 4:
                return (yax) obj;
            case 5:
                return (riu0) ((aaw) obj).invoke();
            case 6:
                return (k6y) obj;
            case 7:
                return (riu0) ((aaw) obj).invoke();
            case 8:
                Type genericReturnType = ((j8y) obj).b.getGenericReturnType();
                genericReturnType.getClass();
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return tke.j0(genericReturnType, lunVar, gzs0.f12197a, true, false, null, 24);
            case 9:
                i9y i9yVar = (i9y) obj;
                return tke.k0(i9yVar.u(), i9yVar);
            case 10:
                return new j9y((k9y) obj);
            case 11:
                return uvw.q((s9y) obj, true);
            case 12:
                Map map = n8y.f23113a;
                dqe0 dqe0Var = ((y9y) obj).d;
                rqe0 rqe0Var = dqe0Var instanceof rqe0 ? (rqe0) dqe0Var : null;
                if (rqe0Var == null || (usyVar = (usy) n8y.b.get(g950.e(rqe0Var.b.name()).b())) == null) {
                    h0oVar = null;
                } else {
                    swq swqVar = i4m0.v;
                    swqVar.getClass();
                    h0oVar = new h0o(new qlc(swqVar.b(), swqVar.f32934a.g()), g950.e(usyVar.name()));
                }
                mapB = h0oVar != null ? wp20.b(new Pair(l8y.c, h0oVar)) : null;
                if (mapB != null) {
                    return mapB;
                }
                lun lunVar2 = lun.f20680a;
                lunVar2.getClass();
                return lunVar2;
            case 13:
                dqe0 dqe0Var2 = ((z9y) obj).d;
                if (dqe0Var2 instanceof fqe0) {
                    Map map2 = n8y.f23113a;
                    mx3VarA = n8y.a(((fqe0) dqe0Var2).a());
                } else if (dqe0Var2 instanceof rqe0) {
                    Map map3 = n8y.f23113a;
                    mx3VarA = n8y.a(kotlin.collections.a.c(dqe0Var2));
                } else {
                    mx3VarA = null;
                }
                mapB = mx3VarA != null ? wp20.b(new Pair(l8y.b, mx3VarA)) : null;
                if (mapB != null) {
                    return mapB;
                }
                lun lunVar3 = lun.f20680a;
                lunVar3.getClass();
                return lunVar3;
            case 14:
                ydy ydyVar = (ydy) obj;
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(ydyVar.f42462a.f44579a);
                zlf0 zlf0Var = ydyVar.b;
                if (zlf0Var != null) {
                    lc00VarB.add("under-migration:".concat(zlf0Var.f44579a));
                }
                for (Map.Entry entry : ydyVar.c.entrySet()) {
                    lc00VarB.add(Separators.AT + entry.getKey() + ':' + ((zlf0) entry.getValue()).f44579a);
                }
                return (String[]) kotlin.collections.a.a(lc00VarB).toArray(new String[0]);
            case 15:
                jey jeyVar = (jey) obj;
                gey geyVar = jeyVar.f;
                if (geyVar == null) {
                    c99.l("JvmBuiltins instance has not been initialized properly");
                    return null;
                }
                iey ieyVar = (iey) geyVar.invoke();
                jeyVar.f = null;
                return ieyVar;
            case 16:
                lfy lfyVar = (lfy) obj;
                r9z r9zVar = lfyVar.c;
                Collection collectionValues = ((Map) yqm0.s(r9zVar.j, r9z.n[0])).values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    qfk qfkVarA = ((jfk) ((v7i) lfyVar.b.b).f).a(r9zVar, (jre0) it.next());
                    if (qfkVarA != null) {
                        arrayList.add(qfkVarA);
                    }
                }
                return (cr30[]) k9x.N(arrayList).toArray(new cr30[0]);
            case 17:
                yhy yhyVar = (yhy) obj;
                mre0 mre0Var = yhyVar.d;
                iiy iiyVar = yhy.g[0];
                jre0 jre0Var = (jre0) mre0Var.invoke();
                if (jre0Var == null) {
                    return br30.b;
                }
                Class cls = jre0Var.f16999a;
                mre0 mre0Var2 = yhyVar.f13087a;
                iiy iiyVar2 = hhy.b[0];
                Object objInvoke = mre0Var2.invoke();
                objInvoke.getClass();
                yuu yuuVar = ((pog0) objInvoke).b;
                jfk jfkVar = (jfk) yuuVar.b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) yuuVar.d;
                qlc qlcVarA = bqe0.a(cls);
                Object obj2 = concurrentHashMap.get(qlcVarA);
                if (obj2 == null) {
                    swq swqVar2 = bqe0.a(cls).f28927a;
                    cry cryVar = jre0Var.b;
                    bry bryVar = (bry) cryVar.c;
                    bry bryVar2 = bry.MULTIFILE_CLASS;
                    if (bryVar == bryVar2) {
                        String[] strArr = (String[]) cryVar.e;
                        if (bryVar != bryVar2) {
                            strArr = null;
                        }
                        if (strArr != null) {
                            listAsList = Arrays.asList(strArr);
                            listAsList.getClass();
                        } else {
                            listAsList = null;
                        }
                        if (listAsList == null) {
                            listAsList = iun.f15405a;
                        }
                        C = new ArrayList();
                        for (String str5 : listAsList) {
                            if (str5 == null) {
                                rey.a(0);
                                throw null;
                            }
                            swq swqVar3 = new swq(str5.replace('/', '.'));
                            swq swqVarB = swqVar3.b();
                            g950 g950VarG = swqVar3.f32934a.g();
                            g950VarG.getClass();
                            swq swqVar4 = swq.c;
                            twq twqVar = mbc.g0(g950VarG).f32934a;
                            twqVar.c();
                            yox yoxVar = (yox) yuuVar.c;
                            ((lwf) jfkVar.c().c).getClass();
                            vd40.g.getClass();
                            String strS = kotlin.text.c.s(twqVar.f34663a, '.', '$');
                            if (!swqVarB.f32934a.c()) {
                                strS = swqVarB + '.' + strS;
                            }
                            g2v g2vVarG = yoxVar.g(strS);
                            jre0 jre0Var2 = g2vVarG != null ? (jre0) g2vVarG.f10580a : null;
                            if (jre0Var2 != null) {
                                C.add(jre0Var2);
                            }
                        }
                    } else {
                        C = kotlin.collections.a.c(jre0Var);
                    }
                    nun nunVar = new nun((ym40) jfkVar.c().f, swqVar2, (byte) 0);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = C.iterator();
                    while (it2.hasNext()) {
                        qfk qfkVarA2 = jfkVar.a(nunVar, (jre0) it2.next());
                        if (qfkVarA2 != null) {
                            arrayList2.add(qfkVarA2);
                        }
                    }
                    cr30 cr30VarL = obb.L("package " + swqVar2 + " (" + jre0Var + ')', CollectionsKt.L0(arrayList2));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(qlcVarA, cr30VarL);
                    obj2 = objPutIfAbsent == null ? cr30VarL : objPutIfAbsent;
                }
                obj2.getClass();
                return (cr30) obj2;
            case 18:
                return new Ctry((ury) obj);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new vry((wry) obj);
            case 20:
                return new xry((yry) obj);
            case 21:
                csy csyVar = (csy) obj;
                pry pryVar = csyVar.f4912a;
                if ((pryVar.K() instanceof zhy) || fre0.X(pryVar)) {
                    return (Type) pryVar.x().a().get(csyVar.c);
                }
                StringBuilder sb = new StringBuilder("Only constructors and top-level callables are supported for now: ");
                sb.append(pryVar.K());
                hny.r(sb, pryVar.getName(), csyVar.e);
                return null;
            case 22:
                return x9x.H((fsy) obj, true);
            case 23:
                return new psy((qsy) obj);
            case 24:
                return (jty) obj;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (riu0) ((aaw) obj).invoke();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((x9z) obj).o.f.getClass();
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                aty atyVar = (aty) ((zez) obj).c.invoke();
                atyVar.getClass();
                return (wsy) atyVar;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (uvz) obj;
            default:
                return (riu0) ((aaw) obj).invoke();
        }
    }

    public /* synthetic */ aaw(Object obj, Object obj2, byte b) {
        this.f551a = b;
        this.b = obj2;
    }
}
