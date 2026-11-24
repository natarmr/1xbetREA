package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes2.dex */
public final class b180 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1796a;
    public static final b180 b = new b180(0);
    public static final b180 c = new b180(1);
    public static final b180 d = new b180(2);
    public static final b180 e = new b180(3);
    public static final b180 f = new b180(4);
    public static final b180 g = new b180(5);
    public static final b180 h = new b180(6);
    public static final b180 i = new b180(7);
    public static final b180 j = new b180(8);
    public static final b180 k = new b180(9);
    public static final b180 l = new b180(10);
    public static final b180 m = new b180(11);
    public static final b180 n = new b180(12);
    public static final b180 o = new b180(13);
    public static final b180 p = new b180(14);
    public static final b180 q = new b180(15);
    public static final b180 r = new b180(16);
    public static final b180 s = new b180(17);
    public static final b180 t = new b180(18);
    public static final b180 u = new b180(19);
    public static final b180 v = new b180(20);
    public static final b180 w = new b180(21);
    public static final b180 x = new b180(22);
    public static final b180 y = new b180(23);
    public static final b180 z = new b180(24);
    public static final b180 A = new b180(25);
    public static final b180 B = new b180(26);
    public static final b180 Y = new b180(27);
    public static final b180 Z = new b180(28);
    public static final b180 f1 = new b180(29);

    public /* synthetic */ b180(byte b2) {
        this.f1796a = b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kzj0 kzj0VarI;
        tft0 tft0VarZ;
        wsy returnType;
        qlc qlcVarF;
        wsy returnType2;
        boolean zV = false;
        switch (this.f1796a) {
            case 0:
                mer merVar = (mer) obj;
                List list = c180.f3563a;
                merVar.getClass();
                vjj vjjVarJ = merVar.j();
                vjjVarJ.getClass();
                if (vjjVarJ instanceof wm40) {
                    g950 g950Var = ary.e;
                    if (ary.b((wm40) vjjVarJ, i4m0.f14153a)) {
                        return null;
                    }
                }
                Collection collectionK = merVar.k();
                collectionK.getClass();
                Collection collection = collectionK;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        vjj vjjVarJ2 = ((mer) it.next()).j();
                        vjjVarJ2.getClass();
                        if (vjjVarJ2 instanceof wm40) {
                            g950 g950Var2 = ary.e;
                            if (ary.b((wm40) vjjVarJ2, i4m0.f14153a)) {
                                return null;
                            }
                        }
                    }
                }
                vjj vjjVarJ3 = merVar.j();
                wm40 wm40Var = vjjVarJ3 instanceof wm40 ? (wm40) vjjVarJ3 : null;
                if (wm40Var != null) {
                    if (!ddx.a(wm40Var)) {
                        wm40Var = null;
                    }
                    if (wm40Var != null && (kzj0VarI = wm40Var.I()) != null && (tft0VarZ = vsm0.z(kzj0VarI)) != null && (returnType = merVar.getReturnType()) != null && Intrinsics.d(((wjj) merVar).getName(), d180.d)) {
                        g950 g950Var3 = ary.e;
                        if ((ary.C(returnType, i4m0.h) || ary.F(returnType)) && merVar.z().size() == 1) {
                            wsy type = ((k3u0) merVar.z().get(0)).getType();
                            type.getClass();
                            if (Intrinsics.d(vsm0.z(type), tft0VarZ) && merVar.W().isEmpty() && merVar.F() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                vjj vjjVarJ4 = merVar.j();
                vjjVarJ4.getClass();
                if (ddx.a(vjjVarJ4)) {
                    iek iekVar = iek.d;
                    vjj vjjVarJ5 = merVar.j();
                    vjjVarJ5.getClass();
                    kzj0 kzj0VarI2 = ((wm40) vjjVarJ5).I();
                    kzj0VarI2.getClass();
                    sb.append(" or define ''equals(other: " + iekVar.P(vsm0.z(kzj0VarI2)) + "): Boolean''");
                }
                return sb.toString();
            case 1:
                mer merVar2 = (mer) obj;
                List list2 = c180.f3563a;
                merVar2.getClass();
                c8z c8zVarC = merVar2.C();
                if (c8zVarC == null) {
                    c8zVarC = merVar2.F();
                }
                if (c8zVarC != null) {
                    wsy returnType3 = merVar2.getReturnType();
                    if (returnType3 != null ? vsm0.v(returnType3, c8zVarC.getType()) : false) {
                        return null;
                    }
                    vde0 vde0VarP1 = c8zVarC.p1();
                    vde0VarP1.getClass();
                    if (vde0VarP1 instanceof k4x) {
                        wm40 wm40Var2 = ((k4x) vde0VarP1).f17690a;
                        if (wm40Var2.Q() && (qlcVarF = rek.f(wm40Var2)) != null) {
                            ym40 ym40VarC = oek.c(wm40Var2);
                            ym40VarC.getClass();
                            foc focVarW = obb.W(ym40VarC, qlcVarF);
                            tfk tfkVar = focVarW instanceof tfk ? (tfk) focVarW : null;
                            if (tfkVar != null && (returnType2 = merVar2.getReturnType()) != null) {
                                zV = vsm0.v(returnType2, tfkVar.q1());
                            }
                        }
                    }
                    if (zV) {
                        return null;
                    }
                }
                return "receiver must be a supertype of the return type";
            case 2:
                mg80 mg80Var = (mg80) obj;
                mg80Var.getClass();
                return ((ng80) mg80Var).f;
            case 3:
                t2e t2eVar = (t2e) obj;
                t2eVar.getClass();
                yzn0 yzn0Var = t2eVar.f;
                u2e u2eVar = t2eVar.c;
                yzn0.p(yzn0Var, u2eVar.e, 0.0f, 6);
                xr.o(t2eVar.d, u2eVar.c, 0.0f, 6);
                return Unit.f46060a;
            case 4:
                return Boolean.valueOf(obj instanceof dab0);
            case 5:
                return Boolean.valueOf(obj instanceof hz6);
            case 6:
                String str = (String) obj;
                str.getClass();
                return "(raw) ".concat(str);
            case 7:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                List list3 = bqe0.f3025a;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 8:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                List list4 = bqe0.f3025a;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return tx3.t(actualTypeArguments);
            case 9:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            case 10:
                String simpleName = ((Class) obj).getSimpleName();
                if (!g950.f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return g950.e(simpleName);
                }
                return null;
            case 11:
                hre0 hre0Var = (hre0) obj;
                hre0Var.getClass();
                String name = hre0Var.getName();
                if (name == null) {
                    name = BundleUtil.UNDERLINE_TAG;
                }
                return name + ": " + hre0Var.p();
            case 12:
                hre0 hre0Var2 = (hre0) obj;
                hre0Var2.getClass();
                return rv00.z(hre0Var2.p(), false);
            case 13:
                hre0 hre0Var3 = (hre0) obj;
                hre0Var3.getClass();
                return rv00.z(hre0Var3.p(), false);
            case 14:
                g950 g950Var4 = (g950) obj;
                g950Var4.getClass();
                return xdx.A(g950Var4);
            case 15:
                String str2 = (String) obj;
                str2.getClass();
                return str2;
            case 16:
                ary aryVar = (ary) obj;
                pag0 pag0Var = pag0.c;
                aryVar.getClass();
                return aryVar.t(iwb0.BOOLEAN);
            case 17:
                ary aryVar2 = (ary) obj;
                qag0 qag0Var = qag0.c;
                aryVar2.getClass();
                return aryVar2.t(iwb0.INT);
            case 18:
                ary aryVar3 = (ary) obj;
                rag0 rag0Var = rag0.c;
                aryVar3.getClass();
                return aryVar3.x();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.h(1);
                return Unit.f46060a;
            case 20:
                Class cls = (Class) obj;
                cls.getClass();
                return bqe0.b(cls);
            case 21:
                Class cls2 = (Class) obj;
                cls2.getClass();
                return bqe0.b(cls2);
            case 22:
                if (Intrinsics.d(obj, Boolean.FALSE)) {
                    return new y3d(y3d.g);
                }
                obj.getClass();
                return new y3d(fbc.d(((Integer) obj).intValue()));
            case 23:
                return Boolean.valueOf(obj instanceof DsShimmerView);
            case 24:
                String str3 = (String) obj;
                str3.getClass();
                return str3.length() > 1 ? hne.l(';', TokenNames.L, str3) : str3;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                mp9 mp9Var = (mp9) obj;
                mp9Var.getClass();
                c8z c8zVarF = mp9Var.F();
                c8zVarF.getClass();
                return c8zVarF.getType();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                mp9 mp9Var2 = (mp9) obj;
                mp9Var2.getClass();
                wsy returnType4 = mp9Var2.getReturnType();
                returnType4.getClass();
                return returnType4;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                tft0 tft0Var = (tft0) obj;
                tft0Var.getClass();
                return Boolean.valueOf(tft0Var instanceof dae0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                foc focVarN = ((tft0) obj).S().n();
                if (focVarN == null) {
                    return Boolean.FALSE;
                }
                g950 name2 = focVarN.getName();
                swq swqVar = bay.f;
                return Boolean.valueOf(Intrinsics.d(name2, swqVar.f32934a.g()) && Intrinsics.d(rek.c(focVarN), swqVar));
            default:
                mp9 mp9Var3 = (mp9) obj;
                mp9Var3.getClass();
                return Boolean.valueOf(lmc.L(rek.j(mp9Var3)));
        }
    }
}
