package a;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Set;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public abstract class fcr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f9324a = cui0.b(q4f.g);

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public static final boolean a(hx4 hx4Var) {
        boolean z;
        tw6 tw6Var = hx4Var.c.b;
        double d = tw6Var.f34633a;
        if (d == -1.0d) {
            z = false;
        } else {
            double d2 = tw6Var.d;
            double d3 = tw6Var.e;
            if (d2 > d || d > d3) {
                z = false;
            } else {
                z = true;
            }
        }
        yyc yycVar = hx4Var.b;
        BigDecimal bigDecimal = yycVar.f43459a;
        return z && (!bigDecimal.equals(new BigDecimal(String.valueOf(-1.0d))) && bigDecimal.compareTo(yycVar.d) >= 0);
    }

    public static final boolean b(pvj0 pvj0Var, q4f q4fVar) {
        bx6 bx6Var = pvj0Var.f27665a;
        boolean z = pvj0Var.f;
        tw6 tw6Var = bx6Var.b;
        boolean z2 = tw6Var.k;
        if (q4fVar == q4f.m || q4fVar == q4f.h) {
            return z2 || z;
        }
        double d = tw6Var.f34633a;
        if (!z2) {
            return false;
        }
        if (d != -1.0d) {
            double d2 = tw6Var.d;
            double dB = tw6Var.b();
            if (d2 <= d && d <= dB) {
                return true;
            }
            if (tw6Var.m && d > tw6Var.b()) {
                return true;
            }
        }
        return z;
    }

    public static final mtl c(ctf0 ctf0Var) {
        nul nulVar = nul.e;
        oe9 oe9Var = oe9.f25112a;
        return new mtl(dyb.g0(new itl(new wul(nulVar, oe9Var, new ue9(ctf0Var.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.b), new itl(new wul(iul.e, oe9Var, new ue9(ctf0Var.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0))), true, false, true), ybr.c)));
    }

    public static final double d(a820 a820Var) {
        ko7 ko7Var = a820Var.c;
        if (ko7Var instanceof ho7) {
            return a820Var.g.c.b.f34633a;
        }
        if (ko7Var.equals(jo7.b)) {
            return a820Var.e.f27665a.b.f34633a;
        }
        if (ko7Var.equals(io7.b)) {
            return 0.0d;
        }
        t9f.b();
        return 0.0d;
    }

    public static final mtl e(ctf0 ctf0Var, boolean z) {
        return new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ctf0Var.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), z, false, true), ybr.f42352a)));
    }

    public static final df6 f(a820 a820Var) {
        xm5 xm5Var = a820Var.d;
        return new df6(xm5Var, a820Var.c, d(a820Var) > xm5Var.c.b, a820Var.q);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public static final fn8 g(a820 a820Var) {
        boolean z = a820Var.i;
        ko7 ko7Var = a820Var.c;
        boolean z2 = a820Var.q;
        boolean z3 = false;
        if (ko7Var instanceof jo7) {
            if (b(a820Var.e, a820Var.j) && !z2) {
                z3 = true;
            }
        } else if (ko7Var instanceof ho7) {
            if (a(a820Var.g) && !z2) {
                z3 = true;
            }
        } else {
            if (!(ko7Var instanceof io7)) {
                t9f.b();
                return null;
            }
            if (a820Var.f.e && !z2) {
                z3 = true;
            }
        }
        return new fn8(z, z3);
    }
}
