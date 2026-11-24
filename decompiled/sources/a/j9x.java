package a;

import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class j9x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16162a;
    public static final j9x b = new j9x(0);
    public static final j9x c = new j9x(1);
    public static final j9x d = new j9x(2);
    public static final j9x e = new j9x(3);
    public static final j9x f = new j9x(4);
    public static final j9x g = new j9x(5);
    public static final j9x h = new j9x(6);
    public static final j9x i = new j9x(7);
    public static final j9x j = new j9x(8);
    public static final j9x k = new j9x(9);
    public static final j9x l = new j9x(10);
    public static final j9x m = new j9x(11);
    public static final j9x n = new j9x(12);
    public static final j9x o = new j9x(13);
    public static final j9x p = new j9x(14);
    public static final j9x q = new j9x(15);
    public static final j9x r = new j9x(16);
    public static final j9x s = new j9x(17);
    public static final j9x t = new j9x(18);
    public static final j9x u = new j9x(19);
    public static final j9x v = new j9x(20);
    public static final j9x w = new j9x(21);
    public static final j9x x = new j9x(22);
    public static final j9x y = new j9x(23);
    public static final j9x z = new j9x(24);
    public static final j9x A = new j9x(25);
    public static final j9x B = new j9x(26);
    public static final j9x Y = new j9x(27);
    public static final j9x Z = new j9x(28);
    public static final j9x f1 = new j9x(29);

    public /* synthetic */ j9x(byte b2) {
        this.f16162a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wsy type;
        switch (this.f16162a) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(16.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                pz40 pz40Var = s6t0.f31722a;
                fhl.o0(fhlVar, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, jFloatToRawIntBits, null, 246);
                return Unit.f46060a;
            case 1:
                wsy wsyVar = (wsy) obj;
                wsyVar.getClass();
                return wsyVar.toString();
            case 2:
                wsy wsyVar2 = (wsy) obj;
                wsyVar2.getClass();
                return wsyVar2.toString();
            case 3:
                t2e t2eVar = (t2e) obj;
                t2eVar.getClass();
                u2e u2eVar = t2eVar.c;
                c3e c3eVar = u2eVar.c;
                b3e b3eVar = u2eVar.e;
                c3e c3eVar2 = u2eVar.f;
                b3e b3eVar2 = u2eVar.h;
                t2eVar.d.n(c3eVar, 0.0f);
                t2eVar.g.n(c3eVar2, 0.0f);
                bh9 bh9Var = t2eVar.b;
                bh9Var.F("hRtlBias", new zg9(0.5f));
                t2eVar.f.o(b3eVar, 0.0f);
                t2eVar.i.o(b3eVar2, 0.0f);
                bh9Var.F("vBias", new zg9(0.5f));
                return Unit.f46060a;
            case 4:
                hre0 hre0Var = (hre0) obj;
                hre0Var.getClass();
                return bqe0.b(azw.G(g7x.G(hre0Var.p())));
            case 5:
                ym40 ym40Var = (ym40) obj;
                Map map = n8y.f23113a;
                ym40Var.getClass();
                k3u0 k3u0VarM0 = rcb.m0(l8y.b, ym40Var.c().j(i4m0.t));
                return (k3u0VarM0 == null || (type = k3u0VarM0.getType()) == null) ? f2o.c(c2o.Y, new String[0]) : type;
            case 6:
                ym40 ym40Var2 = (ym40) obj;
                sqt sqtVar = fey.d;
                ym40Var2.getClass();
                List list = (List) yqm0.s(ym40Var2.c0(fey.f).f, gdz.i[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof ed9) {
                        arrayList.add(obj2);
                    }
                }
                return (vjj) CollectionsKt.U(arrayList);
            case 7:
                Class<?> returnType = ((Method) obj).getReturnType();
                returnType.getClass();
                return bqe0.b(returnType);
            case 8:
                sso ssoVar = (sso) obj;
                sso ssoVar2 = egy.f7784a;
                ssoVar.getClass();
                ssoVar.a(dgy.f6066a);
                ssoVar.a(dgy.b);
                ssoVar.a(dgy.c);
                ssoVar.a(dgy.d);
                ssoVar.a(dgy.e);
                ssoVar.a(dgy.f);
                ssoVar.a(dgy.g);
                ssoVar.a(dgy.h);
                ssoVar.a(dgy.i);
                ssoVar.a(dgy.j);
                ssoVar.a(dgy.k);
                ssoVar.a(dgy.l);
                ssoVar.a(ghi0.f11301a);
                return Unit.f46060a;
            case 9:
                d0d0 d0d0Var = (d0d0) obj;
                Regex regex = ihy.f14802a;
                d0d0Var.getClass();
                return iek.e.n(d0d0Var) + " | " + sog0.b(d0d0Var).o();
            case 10:
                bqy bqyVar = (bqy) obj;
                Regex regex2 = ihy.f14802a;
                bqyVar.getClass();
                return bqyVar.b + " | " + j0x.u(bqyVar).f39041a;
            case 11:
                mer merVar = (mer) obj;
                Regex regex3 = ihy.f14802a;
                merVar.getClass();
                return iek.e.n(merVar) + " | " + sog0.c(merVar).H();
            case 12:
                Method method = (Method) obj;
                Regex regex4 = ihy.f14802a;
                method.getClass();
                return azw.L(method);
            case 13:
                upy upyVar = (upy) obj;
                Regex regex5 = ihy.f14802a;
                upyVar.getClass();
                zpy zpyVar = sey.b;
                zpyVar.getClass();
                return String.valueOf(((sey) slb.V(upyVar.f, zpyVar)).f32094a);
            case 14:
                Constructor constructor = (Constructor) obj;
                Regex regex6 = ihy.f14802a;
                constructor.getClass();
                return azw.J(constructor);
            case 15:
                Field field = (Field) obj;
                Regex regex7 = ihy.f14802a;
                return field.getName() + ' ' + field.getType();
            case 16:
                kiy kiyVar = (kiy) obj;
                kiyVar.getClass();
                fhy fhyVarO = kiyVar.o();
                miy miyVar = fhyVarO instanceof miy ? (miy) fhyVarO : null;
                if (miyVar != null) {
                    return (kiy) CollectionsKt.firstOrNull(miyVar.getUpperBounds());
                }
                return null;
            case 17:
                Pair pair = (Pair) obj;
                pair.getClass();
                return ((String) pair.f46059a) + " = " + ((ppy) pair.b);
            case 18:
                ((Number) obj).intValue();
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                uqe0 uqe0Var = (uqe0) obj;
                int i2 = p9z.v;
                uqe0Var.getClass();
                return Boolean.valueOf(!Modifier.isStatic(uqe0Var.b().getModifiers()));
            case 20:
                fyj0 fyj0Var = (fyj0) obj;
                iiy[] iiyVarArr = baz.m;
                fyj0Var.getClass();
                return fyj0Var;
            case 21:
                uqe0 uqe0Var2 = (uqe0) obj;
                int i3 = eaz.p;
                uqe0Var2.getClass();
                return Boolean.valueOf(Modifier.isStatic(uqe0Var2.b().getModifiers()));
            case 22:
                cr30 cr30Var = (cr30) obj;
                int i4 = eaz.p;
                cr30Var.getClass();
                return cr30Var.g();
            case 23:
                int i5 = eaz.p;
                foc focVarN = ((wsy) obj).S().n();
                if (focVarN instanceof wm40) {
                    return (wm40) focVarN;
                }
                return null;
            case 24:
                ((Number) obj).intValue();
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Number) obj).intValue();
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Boolean.valueOf(obj instanceof AppBarLayout);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rv00 rv00Var = rv00.t;
                ((g950) obj).getClass();
                return Boolean.TRUE;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Boolean.valueOf(obj instanceof yx5);
            default:
                mer merVar2 = (mer) obj;
                List list2 = c180.f3563a;
                merVar2.getClass();
                List listZ = merVar2.z();
                listZ.getClass();
                k3u0 k3u0Var = (k3u0) CollectionsKt.f0(listZ);
                if (k3u0Var == null || rek.a(k3u0Var) || k3u0Var.k != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
        }
    }
}
