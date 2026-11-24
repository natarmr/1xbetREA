package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ygy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42609a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ygy(Object obj, Object obj2, byte b) {
        this.f42609a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        g2v g2vVarG;
        String str;
        switch (this.f42609a) {
            case 0:
                n9y n9yVar = (n9y) this.b;
                xgy xgyVar = (xgy) this.c;
                String str2 = (String) obj;
                str2.getClass();
                if (Intrinsics.d(n9yVar.getName(), str2)) {
                    return kotlin.collections.a.c(n9yVar);
                }
                List listA0 = ahy.a0(xgyVar);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listA0) {
                    if (Intrinsics.d(((n9y) obj2).getName(), str2)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 1:
                return ((djx) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 2:
                return ((djx) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 3:
                return ((djx) this.b).invoke(((a4x) this.c).get(((Number) obj).intValue()));
            case 4:
                return ((djx) this.b).invoke(((a4x) this.c).get(((Number) obj).intValue()));
            case 5:
                ((bem) obj).getClass();
                ((Function1) this.b).invoke(((xyy) this.c).b);
                return Unit.f46060a;
            case 6:
                int iIntValue = ((Number) obj).intValue();
                return ((hvy) this.b).invoke(Integer.valueOf(iIntValue), ((List) this.c).get(iIntValue));
            case 7:
                o24 o24Var = (o24) this.b;
                Object obj3 = o24Var.b;
                n5a n5aVar = (n5a) this.c;
                synchronized (obj3) {
                    ((ArrayList) o24Var.c).remove(n5aVar);
                }
                return Unit.f46060a;
            case 8:
                p9z p9zVar = (p9z) this.b;
                f7u f7uVar = (f7u) this.c;
                g950 g950Var = (g950) obj;
                g950Var.getClass();
                cu00 cu00Var = p9zVar.r;
                wm40 wm40Var = p9zVar.n;
                if (!((Set) cu00Var.invoke()).contains(g950Var)) {
                    if (!((Set) p9zVar.s.invoke()).contains(g950Var)) {
                        sqe0 sqe0Var = (sqe0) ((Map) p9zVar.t.invoke()).get(g950Var);
                        if (sqe0Var == null) {
                            return null;
                        }
                        eu00 eu00Var = (eu00) ((v7i) f7uVar.b).i;
                        return f0o.u0(eu00Var, p9zVar.n, g950Var, new cu00(eu00Var, new n9z(p9zVar, (byte) 2)), r8x.W(f7uVar, sqe0Var), m2a.v(sqe0Var));
                    }
                    lc00 lc00VarB = kotlin.collections.a.b();
                    ((kld) ((e6o0) ((v7i) f7uVar.b).o)).c(wm40Var, g950Var, lc00VarB, f7uVar);
                    lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                    int iB = lc00VarA.b();
                    if (iB == 0) {
                        return null;
                    }
                    if (iB == 1) {
                        return (wm40) CollectionsKt.v0(lc00VarA);
                    }
                    hny.t(lc00VarA, "Multiple classes with same name are generated: ");
                    return null;
                }
                zx10 zx10Var = (zx10) ((v7i) f7uVar.b).g;
                qlc qlcVarF = rek.f(wm40Var);
                qlcVarF.getClass();
                qlc qlcVarD = qlcVarF.d(g950Var);
                swq swqVar = qlcVarD.f28927a;
                String strS = kotlin.text.c.s(qlcVarD.b.f32934a.f34663a, '.', '$');
                if (!swqVar.f32934a.c()) {
                    strS = swqVar.f32934a.f34663a + '.' + strS;
                }
                Class clsQ = ufx.Q((ClassLoader) zx10Var.f45137a, strS);
                mqe0 mqe0Var = clsQ != null ? new mqe0(clsQ) : null;
                if (mqe0Var != null) {
                    return new l9z(f7uVar, wm40Var, mqe0Var, null);
                }
                return null;
            case 9:
                fyj0 fyj0Var = (fyj0) this.b;
                p9z p9zVar2 = (p9z) this.c;
                g950 g950Var2 = (g950) obj;
                g950Var2.getClass();
                return Intrinsics.d(fyj0Var.getName(), g950Var2) ? kotlin.collections.a.c(fyj0Var) : CollectionsKt.q0(p9zVar2.N(g950Var2), p9zVar2.O(g950Var2));
            case 10:
                x9z x9zVar = (x9z) this.b;
                f7u f7uVar2 = x9zVar.b;
                f7u f7uVar3 = (f7u) this.c;
                t9z t9zVar = (t9z) obj;
                t9zVar.getClass();
                r9z r9zVar = x9zVar.o;
                swq swqVar2 = r9zVar.f;
                g950 g950Var3 = t9zVar.f33590a;
                swqVar2.getClass();
                twq twqVar = swqVar2.f32934a;
                g950Var3.getClass();
                swq swqVar3 = swq.c;
                twq twqVar2 = mbc.g0(g950Var3).f32934a;
                twqVar2.c();
                String str3 = twqVar2.f34663a;
                mqe0 mqe0Var2 = t9zVar.b;
                v7i v7iVar = (v7i) f7uVar3.b;
                if (mqe0Var2 != null) {
                    yox yoxVar = (yox) v7iVar.e;
                    ((lwf) ((jfk) ((v7i) f7uVar2.b).f).c().c).getClass();
                    vd40.g.getClass();
                    swq swqVarC = mqe0Var2.c();
                    g2vVarG = (swqVarC == null || (str = swqVarC.f32934a.f34663a) == null) ? null : yoxVar.g(str);
                } else {
                    yox yoxVar2 = (yox) v7iVar.e;
                    ((lwf) ((jfk) ((v7i) f7uVar2.b).f).c().c).getClass();
                    vd40.g.getClass();
                    String strS2 = kotlin.text.c.s(str3, '.', '$');
                    if (!twqVar.c()) {
                        strS2 = swqVar2 + '.' + strS2;
                    }
                    g2vVarG = yoxVar2.g(strS2);
                }
                jre0 jre0Var = g2vVarG != null ? (jre0) g2vVarG.f10580a : null;
                qlc qlcVarA = jre0Var != null ? bqe0.a(jre0Var.f16999a) : null;
                if (qlcVarA != null && (qlcVarA.g() || qlcVarA.c)) {
                    return null;
                }
                x8x u9zVar = v9z.f37058a;
                if (jre0Var != null) {
                    if (((bry) jre0Var.b.c) == bry.CLASS) {
                        jfk jfkVar = (jfk) ((v7i) f7uVar2.b).f;
                        glc glcVarG = jfkVar.g(jre0Var);
                        wm40 wm40VarA = glcVarG == null ? null : ((nlc) jfkVar.c().d).a(bqe0.a(jre0Var.f16999a), glcVarG);
                        if (wm40VarA != null) {
                            u9zVar = new u9z(wm40VarA);
                        }
                    } else {
                        u9zVar = w9z.f38803a;
                    }
                }
                if (u9zVar instanceof u9z) {
                    return ((u9z) u9zVar).f35306a;
                }
                if (u9zVar instanceof w9z) {
                    return null;
                }
                if (!(u9zVar instanceof v9z)) {
                    t9f.b();
                    return null;
                }
                if (mqe0Var2 == null) {
                    zx10 zx10Var2 = (zx10) v7iVar.g;
                    String strS3 = kotlin.text.c.s(str3, '.', '$');
                    if (!twqVar.c()) {
                        strS3 = twqVar.f34663a + '.' + strS3;
                    }
                    Class clsQ2 = ufx.Q((ClassLoader) zx10Var2.f45137a, strS3);
                    mqe0Var2 = clsQ2 != null ? new mqe0(clsQ2) : null;
                }
                imz[] imzVarArr = imz.f15049a;
                swq swqVarC2 = mqe0Var2 != null ? mqe0Var2.c() : null;
                if (swqVarC2 == null || swqVarC2.f32934a.c() || !swqVarC2.b().equals(r9zVar.f)) {
                    return null;
                }
                return new l9z(f7uVar3, r9zVar, mqe0Var2, null);
            case 11:
                return ((w800) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 12:
                odd oddVar = (odd) this.b;
                ge10 ge10Var = (ge10) this.c;
                if (oddVar == ge10Var.h) {
                    ge10Var.h = null;
                }
                return Unit.f46060a;
            case 13:
                int iIntValue2 = ((Number) obj).intValue();
                return ((gm10) this.b).invoke(Integer.valueOf(iIntValue2), ((List) this.c).get(iIntValue2));
            case 14:
                int iIntValue3 = ((Number) obj).intValue();
                return ((ei20) this.b).invoke(Integer.valueOf(iIntValue3), ((List) this.c).get(iIntValue3));
            case 15:
                return ((tr20) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 16:
                return ((tr20) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 17:
                return ((tr20) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 18:
                return ((tr20) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((tr20) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 20:
                int iIntValue4 = ((Number) obj).intValue();
                return ((o240) this.b).invoke(Integer.valueOf(iIntValue4), ((List) this.c).get(iIntValue4));
            case 21:
                int iIntValue5 = ((Number) obj).intValue();
                return ((o240) this.b).invoke(Integer.valueOf(iIntValue5), ((List) this.c).get(iIntValue5));
            case 22:
                int iIntValue6 = ((Number) obj).intValue();
                return ((o240) this.b).invoke(Integer.valueOf(iIntValue6), ((a4x) this.c).get(iIntValue6));
            case 23:
                ((Function2) this.b).invoke((r370) this.c, (String) obj);
                return Unit.f46060a;
            case 24:
                return ((da40) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue7 = ((Number) obj).intValue();
                return ((o240) this.b).invoke(Integer.valueOf(iIntValue7), ((List) this.c).get(iIntValue7));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((da40) this.b).invoke(((a4x) this.c).get(((Number) obj).intValue()));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iIntValue8 = ((Number) obj).intValue();
                return ((o240) this.b).invoke(Integer.valueOf(iIntValue8), ((List) this.c).get(iIntValue8));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iIntValue9 = ((Number) obj).intValue();
                return ((rj50) this.b).invoke(Integer.valueOf(iIntValue9), ((List) this.c).get(iIntValue9));
            default:
                return ((mb50) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
        }
    }
}
