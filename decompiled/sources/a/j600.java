package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class j600 {
    public static final float b;
    public static final float c;
    public static final float d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15960a;

    static {
        a(0.0f);
        a(0.5f);
        b = 0.5f;
        a(-1.0f);
        c = -1.0f;
        a(1.0f);
        d = 1.0f;
    }

    public static void a(float f) {
        if ((0.0f > f || f > 1.0f) && f != -1.0f) {
            ycx.b("topRatio should be in [0..1] range or -1");
        }
    }

    public static String b(float f) {
        if (f == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        return f == d ? "LineHeightStyle.Alignment.Bottom" : rw2.j(f, "LineHeightStyle.Alignment(topPercentage = ", Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j600) {
            return Float.compare(this.f15960a, ((j600) obj).f15960a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15960a);
    }

    public final String toString() {
        return b(this.f15960a);
    }
}
