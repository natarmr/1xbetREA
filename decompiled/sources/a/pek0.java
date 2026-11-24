package a;

import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class pek0 implements sek0, cqg, e8q0, kyr0, vgu0, l7w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pek0 f26859a = new pek0();
    public static final pn20 b = new pn20(16);
    public static final pek0 c = new pek0();
    public static final pek0 d = new pek0();
    public static final pek0 e = new pek0();
    public static final pek0 f = new pek0();
    public static final pek0 g = new pek0();
    public static final pek0 h = new pek0();

    public static void n(androidx.fragment.app.e eVar, boolean z) {
        eVar.getClass();
        a64.l2.getClass();
        if (eVar.J("AUTH_ENTRY_POINTS_DIALOG_TAG") != null) {
            return;
        }
        a64 a64Var = new a64();
        a64Var.k2.v(a64Var, a64.m2[1], z);
        a64Var.H0(eVar, "AUTH_ENTRY_POINTS_DIALOG_TAG");
    }

    public static mgw0 o(Object obj) {
        mew0 mew0Var = (mew0) obj;
        mgw0 mgw0Var = mew0Var.zzc;
        if (mgw0Var != mgw0.f) {
            return mgw0Var;
        }
        mgw0 mgw0VarA = mgw0.a();
        mew0Var.zzc = mgw0VarA;
        return mgw0VarA;
    }

    public static boolean p(int i, hu5 hu5Var, Object obj) throws zew0 {
        tdw0 tdw0Var = (tdw0) hu5Var.e;
        int i2 = hu5Var.b;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            hu5Var.u0(0);
            ((mgw0) obj).d(i3 << 3, Long.valueOf(tdw0Var.D()));
            return true;
        }
        if (i4 == 1) {
            hu5Var.u0(1);
            ((mgw0) obj).d((i3 << 3) | 1, Long.valueOf(tdw0Var.G()));
            return true;
        }
        if (i4 == 2) {
            ((mgw0) obj).d((i3 << 3) | 2, hu5Var.b1());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                if (i != 0) {
                    return false;
                }
                itt0.x("Protocol message end-group tag did not match expected tag.");
                return false;
            }
            if (i4 != 5) {
                itt0.p();
                return false;
            }
            hu5Var.u0(5);
            ((mgw0) obj).d(5 | (i3 << 3), Integer.valueOf(tdw0Var.H()));
            return true;
        }
        mgw0 mgw0VarA = mgw0.a();
        int i5 = i3 << 3;
        int i6 = i + 1;
        if (i6 >= 100) {
            itt0.x("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return false;
        }
        while (hu5Var.F0() != Integer.MAX_VALUE && p(i6, hu5Var, mgw0VarA)) {
        }
        if ((i5 | 4) != hu5Var.b) {
            itt0.x("Protocol message end-group tag did not match expected tag.");
            return false;
        }
        if (mgw0VarA.e) {
            mgw0VarA.e = false;
        }
        ((mgw0) obj).d(i5 | 3, mgw0VarA);
        return true;
    }

    @Override // a.l7w0
    public int a() {
        return R.string.fake_vers;
    }

    @Override // a.l7w0
    public String b() {
        return "2";
    }

    @Override // a.l7w0
    public String c() {
        return "5";
    }

    @Override // a.vgu0
    public Function0 d(x1 x1Var) {
        sgu0 sgu0Var = new sgu0(x1Var, (byte) 1);
        x1Var.addOnAttachStateChangeListener(sgu0Var);
        tgu0 tgu0Var = new tgu0(x1Var);
        b8k0.J(x1Var).f45046a.add(tgu0Var);
        return new hot0(x1Var, sgu0Var, tgu0Var, (byte) 2);
    }

    @Override // a.l7w0
    public String e() {
        return "3";
    }

    @Override // a.l7w0
    public String f() {
        return "1";
    }

    @Override // a.e8q0
    public float g() {
        return Float.NaN;
    }

    @Override // a.e8q0
    public long h() {
        int i = y3d.h;
        return y3d.g;
    }

    @Override // a.l7w0
    public int i() {
        return R.string.fake_second_k;
    }

    @Override // a.l7w0
    public String j() {
        return "4";
    }

    @Override // a.l7w0
    public int k() {
        return R.string.fake_first_k;
    }

    @Override // a.e8q0
    public t89 l() {
        return null;
    }

    @Override // a.l7w0
    public int m() {
        return R.string.fake_first_v;
    }

    @Override // a.l7w0
    public int d() {
        return R.string.fake_second_v;
    }
}
