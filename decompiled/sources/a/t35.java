package a;

/* JADX INFO: loaded from: classes.dex */
public final class t35 extends vto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f33249a;

    public t35(Integer num) {
        this.f33249a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vto)) {
            return false;
        }
        Integer num = this.f33249a;
        t35 t35Var = (t35) ((vto) obj);
        if (num == null) {
            return t35Var.f33249a == null;
        }
        return num.equals(t35Var.f33249a);
    }

    public final int hashCode() {
        Integer num = this.f33249a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return dw9.q(new StringBuilder("ExternalPRequestContext{originAssociatedProductId="), this.f33249a, "}");
    }
}
