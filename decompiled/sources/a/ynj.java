package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ynj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tw70 f42944a;
    public final String b;
    public final String c;

    public ynj(tw70 tw70Var, String str, String str2) {
        str2.getClass();
        this.f42944a = tw70Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ynj)) {
            return false;
        }
        ynj ynjVar = (ynj) obj;
        return this.f42944a == ynjVar.f42944a && this.b.equals(ynjVar.b) && Intrinsics.d(this.c, ynjVar.c);
    }

    public final int hashCode() {
        tw70 tw70Var = this.f42944a;
        return Boolean.hashCode(false) + ua80.b(ua80.b((tw70Var == null ? 0 : tw70Var.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenLink(type=");
        sb.append(this.f42944a);
        sb.append(", subType=");
        sb.append(this.b);
        sb.append(", url=");
        return axq.n(sb, this.c, ", hasBackStack=false)");
    }
}
