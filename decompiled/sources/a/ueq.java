package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ueq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final meq f35541a;
    public final meq b;
    public final tul0 c;

    public ueq(meq meqVar, meq meqVar2, tul0 tul0Var) {
        this.f35541a = meqVar;
        this.b = meqVar2;
        this.c = tul0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ueq)) {
            return false;
        }
        ueq ueqVar = (ueq) obj;
        return this.f35541a == ueqVar.f35541a && this.b == ueqVar.b && this.c == ueqVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.f35541a.hashCode() * 31;
        meq meqVar = this.b;
        return this.c.hashCode() + ((iHashCode + (meqVar == null ? 0 : meqVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Info(addedInVersion=" + this.f35541a + ", removedInVersion=" + this.b + ", stabilityLevel=" + this.c + ')';
    }
}
