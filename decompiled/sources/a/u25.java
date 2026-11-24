package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class u25 extends e9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34930a;
    public final int b;
    public final List c;

    public u25(String str, List list, int i) {
        this.f34930a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e9f) {
            u25 u25Var = (u25) ((e9f) obj);
            if (this.f34930a.equals(u25Var.f34930a) && this.b == u25Var.b && this.c.equals(u25Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.f34930a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.f34930a);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        return dw9.r(sb, this.c, "}");
    }
}
