package a;

/* JADX INFO: loaded from: classes.dex */
public final class t15 extends mfd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u35 f33152a;

    public t15(u35 u35Var) {
        lfd lfdVar = lfd.f19949a;
        this.f33152a = u35Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mfd)) {
            return false;
        }
        if (!this.f33152a.equals(((t15) ((mfd) obj)).f33152a)) {
            return false;
        }
        Object obj2 = lfd.f19949a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f33152a.hashCode() ^ 1000003) * 1000003) ^ lfd.f19949a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f33152a + ", productIdOrigin=" + lfd.f19949a + "}";
    }
}
