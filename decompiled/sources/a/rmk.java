package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class rmk implements umk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30747a;

    public /* synthetic */ rmk(int i) {
        this.f30747a = i;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        jf4.o("px must be > 0.");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rmk) {
            return this.f30747a == ((rmk) obj).f30747a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30747a);
    }

    public final String toString() {
        return ua80.e(this.f30747a, "Pixels(px=", Separators.RPAREN);
    }
}
