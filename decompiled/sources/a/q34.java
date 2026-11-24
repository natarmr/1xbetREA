package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q34 {
    public static final q34 e = new q34(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28032a;
    public final int b;
    public final int c;
    public final int d;

    public q34(int i, int i2, int i3) {
        this.f28032a = i;
        this.b = i2;
        this.c = i3;
        this.d = vtt0.I(i3) ? vtt0.q(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q34)) {
            return false;
        }
        q34 q34Var = (q34) obj;
        return this.f28032a == q34Var.f28032a && this.b == q34Var.b && this.c == q34Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f28032a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.f28032a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return brm0.n(sb, this.c, ']');
    }
}
