package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class dv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xd2 f6723a = new xd2(22);
    public static final sjj b = new sjj(new qek0());

    public static mm40 a(mm40 mm40Var, rv2 rv2Var, boolean z, gy40 gy40Var, qkq qkqVar, int i) {
        ma80 ma80Var = ma80.f21447a;
        if ((i & 8) != 0) {
            gy40Var = null;
        }
        return mm40Var.e(new ou2(rv2Var, z, null, gy40Var, qkqVar));
    }

    public static mm40 b(mm40 mm40Var, rv2 rv2Var, boolean z, afk0 afk0Var, int i) {
        ma80 ma80Var = ma80.f21447a;
        if ((i & 8) != 0) {
            z = true;
        }
        return mm40Var.e(new ou2(rv2Var, z, Boolean.FALSE, null, afk0Var));
    }

    public static final Object c(rv2 rv2Var, Object obj, uts0 uts0Var, yje yjeVar) {
        Object objA = rv2Var.a(obj, c050.f3507a, new uu2(rv2Var, uts0Var, null), yjeVar);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public static Object d(rv2 rv2Var, Object obj, yje yjeVar) {
        rv2Var.getClass();
        return c(rv2Var, obj, nu2.f24127a, yjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(Function0 function0, Function2 function2, zje zjeVar) {
        wu2 wu2Var;
        if (zjeVar instanceof wu2) {
            wu2Var = (wu2) zjeVar;
            int i = wu2Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                wu2Var.j = i - Integer.MIN_VALUE;
            } else {
                wu2Var = new wu2(zjeVar);
            }
        } else {
            wu2Var = new wu2(zjeVar);
        }
        Object obj = wu2Var.i;
        wne wneVar = wne.f39444a;
        int i2 = wu2Var.j;
        yje yjeVar = null;
        byte b2 = 1;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                bv2 bv2Var = new bv2(function0, function2, yjeVar, b2);
                wu2Var.j = 1;
                if (d5c.J(wu2Var, bv2Var) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
        } catch (mu2 unused) {
        }
        return Unit.f46060a;
    }

    public static final Object f(rv2 rv2Var, Object obj, bnn0 bnn0Var) {
        Object objA = rv2Var.a(obj, c050.f3507a, new cv2(4, (yje) null, (byte) 0), bnn0Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }
}
