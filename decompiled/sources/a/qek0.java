package a;

import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class qek0 implements sek0, fko0, lyr0, kotlin.coroutines.f, vgu0, l7w0, glq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qek0 f28589a = new qek0();
    public static final qek0 b = new qek0();
    public static final qek0 c = new qek0();
    public static final v4i0 d = new v4i0(11);
    public static final v4i0 e = new v4i0(12);
    public static final qek0 f = new qek0();
    public static final qek0 g = new qek0();
    public static final qek0 h = new qek0();
    public static final qek0 i = new qek0();

    public static boolean l(int i2, hu5 hu5Var, Object obj) throws qkw0 {
        int i3 = hu5Var.b;
        tdw0 tdw0Var = (tdw0) hu5Var.e;
        int i4 = i3 >>> 3;
        int i5 = i3 & 7;
        if (i5 == 0) {
            hu5Var.G0(0);
            ((klw0) obj).c(i4 << 3, Long.valueOf(tdw0Var.K()));
            return true;
        }
        if (i5 == 1) {
            hu5Var.G0(1);
            ((klw0) obj).c((i4 << 3) | 1, Long.valueOf(tdw0Var.I()));
            return true;
        }
        if (i5 == 2) {
            ((klw0) obj).c((i4 << 3) | 2, hu5Var.Z0());
            return true;
        }
        if (i5 != 3) {
            if (i5 == 4) {
                if (i2 != 0) {
                    return false;
                }
                throw new qkw0("Protocol message end-group tag did not match expected tag.");
            }
            if (i5 != 5) {
                throw qkw0.a();
            }
            hu5Var.G0(5);
            ((klw0) obj).c(5 | (i4 << 3), Integer.valueOf(tdw0Var.z()));
            return true;
        }
        klw0 klw0VarE = klw0.e();
        int i6 = i4 << 3;
        int i7 = i6 | 4;
        int i8 = i2 + 1;
        if (i8 >= 100) {
            throw new qkw0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (hu5Var.J0() != Integer.MAX_VALUE && l(i8, hu5Var, klw0VarE)) {
        }
        if (i7 != hu5Var.b) {
            throw new qkw0("Protocol message end-group tag did not match expected tag.");
        }
        if (klw0VarE.e) {
            klw0VarE.e = false;
        }
        ((klw0) obj).c(i6 | 3, klw0VarE);
        return true;
    }

    public static klw0 n(Object obj) {
        jkw0 jkw0Var = (jkw0) obj;
        klw0 klw0Var = jkw0Var.zzb;
        if (klw0Var != klw0.f) {
            return klw0Var;
        }
        klw0 klw0VarE = klw0.e();
        jkw0Var.zzb = klw0VarE;
        return klw0VarE;
    }

    @Override // a.l7w0
    public int a() {
        return R.string.one_x_bet_vers;
    }

    @Override // a.l7w0
    public String b() {
        return "WCqBas6IvvauioMHNvnYmZY0w0=";
    }

    @Override // a.l7w0
    public String c() {
        return "NC8hT1RML03pzH";
    }

    @Override // a.vgu0
    public Function0 d(x1 x1Var) {
        if (!x1Var.isAttachedToWindow()) {
            mie0 mie0Var = new mie0();
            j14 j14Var = new j14(x1Var, mie0Var, (byte) 6);
            x1Var.addOnAttachStateChangeListener(j14Var);
            mie0Var.f21842a = new ugu0(x1Var, j14Var, (byte) 0);
            return new sbe0(mie0Var, (byte) 2);
        }
        clz clzVarL = s7n0.l(x1Var);
        if (clzVarL != null) {
            return lvm0.l(x1Var, clzVarL.x());
        }
        xcx.c("View tree for " + x1Var + " has no ViewTreeLifecycleOwner");
        csj.b();
        return null;
    }

    @Override // a.l7w0
    public String e() {
        return "Dub/65e2hqGKuw3yTziE7";
    }

    @Override // a.l7w0
    public String f() {
        return "kNEFR19TEzB4r7SJ";
    }

    @Override // a.glq
    public float g() {
        return 0.0f;
    }

    @Override // a.glq
    public long h(float f2) {
        return 0L;
    }

    @Override // a.l7w0
    public int i() {
        return R.string.one_x_bet_second_k;
    }

    @Override // a.l7w0
    public String j() {
        return "jLfBemyJYULSW+caQ3WN";
    }

    @Override // a.l7w0
    public int k() {
        return R.string.one_x_bet_first_k;
    }

    @Override // a.l7w0
    public int m() {
        return R.string.one_x_bet_first_v;
    }

    @Override // a.glq
    public float b(float f2, float f3, long j) {
        return 0.0f;
    }

    @Override // a.glq
    public float a(float f2, long j) {
        return 0.0f;
    }

    @Override // a.glq
    public float i(float f2, float f3) {
        return 0.0f;
    }

    @Override // a.l7w0
    public int d() {
        return R.string.one_x_bet_second_v;
    }
}
