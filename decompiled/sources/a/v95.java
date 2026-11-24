package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class v95 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37017a;
    public final String b;
    public final String c;
    public final wui0 d;
    public final boolean e;

    public v95(long j, String str, String str2, wui0 wui0Var, boolean z) {
        this.f37017a = j;
        this.b = str;
        this.c = str2;
        this.d = wui0Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v95)) {
            return false;
        }
        v95 v95Var = (v95) obj;
        return this.f37017a == v95Var.f37017a && this.b.equals(v95Var.b) && this.c.equals(v95Var.c) && this.d == v95Var.d && this.e == v95Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.c(this.d, ua80.b(ua80.b(Long.hashCode(this.f37017a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f37017a, "AvailableValueUiModel(value=", ", measure=", this.b);
        sbO.append(", valueView=");
        sbO.append(this.c);
        sbO.append(", position=");
        sbO.append(this.d);
        return f140.n(sbO, ", selected=", this.e, Separators.RPAREN);
    }
}
