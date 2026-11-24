package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gjn f29820a;
    public final gjn b;
    public final int c;
    public final ArrayList d;

    public r45(gjn gjnVar, gjn gjnVar2, int i, ArrayList arrayList) {
        this.f29820a = gjnVar;
        this.b = gjnVar2;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r45) {
            r45 r45Var = (r45) obj;
            if (this.f29820a == r45Var.f29820a && this.b == r45Var.b && this.c == r45Var.c && this.d.equals(r45Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.f29820a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.f29820a);
        sb.append(", postviewEdge=");
        sb.append(this.b);
        sb.append(", inputFormat=");
        sb.append(this.c);
        sb.append(", outputFormats=");
        return rz4.n(sb, this.d, "}");
    }
}
