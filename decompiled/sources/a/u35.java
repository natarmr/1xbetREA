package a;

/* JADX INFO: loaded from: classes.dex */
public final class u35 extends wto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t35 f34980a;

    public u35(t35 t35Var) {
        this.f34980a = t35Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wto)) {
            return false;
        }
        return this.f34980a.equals(((u35) ((wto) obj)).f34980a);
    }

    public final int hashCode() {
        return this.f34980a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f34980a + "}";
    }
}
