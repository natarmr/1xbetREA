package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class abw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f598a;
    public final byte b;
    public final double c;
    public final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public abw(int i, String str, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        x0x.K(z);
        this.f598a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abw)) {
            return false;
        }
        abw abwVar = (abw) obj;
        return this.b == abwVar.b && Double.compare(this.c, abwVar.c) == 0 && this.f598a.equals(abwVar.f598a) && Objects.equals(this.d, abwVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.f598a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public abw(String str, double d) {
        this.f598a = str;
        this.b = (byte) 2;
        this.c = d;
        this.d = null;
    }
}
