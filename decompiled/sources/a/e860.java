package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e860 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c860 f7358a;
    public final lxl b;
    public final boolean c;

    public e860(c860 c860Var, lxl lxlVar, boolean z) {
        this.f7358a = c860Var;
        this.b = lxlVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e860)) {
            return false;
        }
        e860 e860Var = (e860) obj;
        return this.f7358a == e860Var.f7358a && this.b.equals(e860Var.b) && this.c == e860Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f7358a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationTypeUiModel(type=");
        sb.append(this.f7358a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", selected=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
