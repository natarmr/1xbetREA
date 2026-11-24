package a;

import android.util.Log;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class pnk0 implements Function1 {
    public static final pnk0 b = new pnk0(0);
    public static final pnk0 c = new pnk0(1);
    public static final pnk0 d = new pnk0(2);
    public static final pnk0 e = new pnk0(3);
    public static final pnk0 f = new pnk0(4);
    public static final pnk0 g = new pnk0(5);
    public static final pnk0 h = new pnk0(6);
    public static final pnk0 i = new pnk0(7);
    public static final pnk0 j = new pnk0(8);
    public static final pnk0 k = new pnk0(9);
    public static final pnk0 l = new pnk0(10);
    public static final pnk0 m = new pnk0(11);
    public static final pnk0 n = new pnk0(12);
    public static final pnk0 o = new pnk0(13);
    public static final pnk0 p = new pnk0(14);
    public static final pnk0 q = new pnk0(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27293a;

    public /* synthetic */ pnk0(byte b2) {
        this.f27293a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mp9 mp9VarB;
        String strX;
        gxk0 gxk0Var = null;
        boolean z = false;
        switch (this.f27293a) {
            case 0:
                mp9 mp9Var = (mp9) obj;
                mp9Var.getClass();
                int i2 = jd9.l;
                fyj0 fyj0Var = (fyj0) mp9Var;
                if (ary.A(fyj0Var) && rek.b(fyj0Var, new w0((Object) fyj0Var, (byte) 10)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                mp9 mp9Var2 = (mp9) obj;
                mp9Var2.getClass();
                if (ary.A(mp9Var2)) {
                    int i3 = kd9.l;
                    if (jxk0.e.contains(mp9Var2.getName()) && (mp9VarB = rek.b(mp9Var2, i13.h)) != null && (strX = m7x.x(mp9VarB)) != null) {
                        if (jxk0.b.contains(strX)) {
                            gxk0Var = gxk0.f12081a;
                        } else {
                            gxk0Var = ((ixk0) xp20.d(jxk0.d, strX)) == ixk0.b ? gxk0.c : gxk0.b;
                        }
                    }
                    if (gxk0Var != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                lwv0 lwv0Var = (lwv0) obj;
                lwv0Var.getClass();
                return lwv0Var.toString();
            case 3:
                lwv0 lwv0Var2 = (lwv0) obj;
                lwv0Var2.getClass();
                return jtt0.w(lwv0Var2);
            case 4:
                a4d0 a4d0Var = (a4d0) obj;
                a4d0Var.getClass();
                return Integer.valueOf(a4d0Var.d.size());
            case 5:
                fyj0 fyj0Var2 = (fyj0) obj;
                fyj0Var2.getClass();
                return fyj0Var2;
            case 6:
                d0d0 d0d0Var = (d0d0) obj;
                d0d0Var.getClass();
                return d0d0Var;
            case 7:
                kp9 kp9Var = (kp9) obj;
                kp9Var.getClass();
                return kp9Var;
            case 8:
                vjj vjjVar = (vjj) obj;
                vjjVar.getClass();
                return Boolean.valueOf(vjjVar instanceof kp9);
            case 9:
                vjj vjjVar2 = (vjj) obj;
                vjjVar2.getClass();
                return Boolean.valueOf(!(vjjVar2 instanceof x4e));
            case 10:
                vjj vjjVar3 = (vjj) obj;
                vjjVar3.getClass();
                List typeParameters = ((kp9) vjjVar3).getTypeParameters();
                typeParameters.getClass();
                return new sx3(typeParameters, (byte) 1);
            case 11:
                tft0 tft0Var = (tft0) obj;
                tft0Var.getClass();
                foc focVarN = tft0Var.S().n();
                if (focVarN != null && (focVarN instanceof hzs0) && (((hzs0) focVarN).j() instanceof tfk)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                tft0 tft0Var2 = (tft0) obj;
                tft0Var2.getClass();
                foc focVarN2 = tft0Var2.S().n();
                if (focVarN2 != null && ((focVarN2 instanceof tfk) || (focVarN2 instanceof hzs0))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException) && l8x.g0()) {
                    Log.e("CXCP", "Surface setup error!", th);
                }
                return Unit.f46060a;
            case 14:
                kiy kiyVar = (kiy) obj;
                swq swqVar = xtt0.f41480a;
                kiyVar.getClass();
                return xtt0.s(kiyVar);
            case 15:
                return null;
            case 16:
                ((cty) obj).getClass();
                return null;
            case 17:
                ((qlc) obj).getClass();
                return gmk0.x0;
            case 18:
                mp9 mp9Var3 = (mp9) obj;
                if (mp9Var3.l() == 1) {
                    vjj vjjVarJ = mp9Var3.j();
                    vjjVarJ.getClass();
                    String str = bay.f2281a;
                    if (bay.j.containsKey(oek.f((wm40) vjjVarJ))) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((au00) obj).b.invoke();
            case 20:
                return (mp9) obj;
            case 21:
                return (mp9) obj;
            case 22:
                euj0 euj0Var = (euj0) obj;
                euj0Var.getClass();
                iay iayVar = jsb0.b;
                euj0Var.c("java/util/Spliterator", iayVar, iayVar);
                nag0 nag0Var = nag0.f23190a;
                return Unit.f46060a;
            default:
                swq swqVar2 = (swq) obj;
                if (swqVar2 != null) {
                    return Boolean.valueOf(!swqVar2.equals(i4m0.y));
                }
                jf4.o("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
                return null;
        }
    }

    public /* synthetic */ pnk0(Object obj, byte b2) {
        this.f27293a = b2;
    }
}
