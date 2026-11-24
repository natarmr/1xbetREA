package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ii10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f14808a;
    public final og10 b;

    /* JADX WARN: Multi-variable type inference failed */
    public ii10(int i, og10 og10Var) {
        this.f14808a = i;
        this.b = og10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii10)) {
            return false;
        }
        ii10 ii10Var = (ii10) obj;
        return this.f14808a == ii10Var.f14808a && this.b == ii10Var.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Integer.hashCode(this.f14808a) * 31)) * 961;
    }

    public final String toString() {
        return "LoyaltyProgramLevelPrivilegeModel(id=" + ((int) this.f14808a) + ", type=" + this.b + ", description=, image=)";
    }
}
