package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class x35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40199a;
    public final ArrayList b;

    public x35(String str, ArrayList arrayList) {
        if (str == null) {
            hny.u("Null userAgent");
            throw null;
        }
        this.f40199a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x35)) {
            return false;
        }
        x35 x35Var = (x35) obj;
        return this.f40199a.equals(x35Var.f40199a) && this.b.equals(x35Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f40199a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(this.f40199a);
        sb.append(", usedDates=");
        return rz4.n(sb, this.b, "}");
    }
}
