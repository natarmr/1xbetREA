package a;

import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w9k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38784a;
    public final long b;
    public final int c;

    public w9k0(int i, long j, long j2) {
        x0x.A(j < j2);
        this.f38784a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w9k0.class == obj.getClass()) {
            w9k0 w9k0Var = (w9k0) obj;
            if (this.f38784a == w9k0Var.f38784a && this.b == w9k0Var.b && this.c == w9k0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f38784a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        String str = vtt0.f38024a;
        Locale locale = Locale.US;
        StringBuilder sbQ = kng0.q(this.f38784a, "Segment: startTimeMs=", ", endTimeMs=");
        sbQ.append(this.b);
        sbQ.append(", speedDivisor=");
        sbQ.append(this.c);
        return sbQ.toString();
    }
}
