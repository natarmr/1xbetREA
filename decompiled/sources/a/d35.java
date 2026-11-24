package a;

/* JADX INFO: loaded from: classes2.dex */
public final class d35 extends k9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5385a;
    public final String b;

    public d35(String str, String str2) {
        this.f5385a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k9f) {
            d35 d35Var = (d35) ((k9f) obj);
            if (this.f5385a.equals(d35Var.f5385a) && this.b.equals(d35Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f5385a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.f5385a);
        sb.append(", variantId=");
        return axq.n(sb, this.b, "}");
    }
}
