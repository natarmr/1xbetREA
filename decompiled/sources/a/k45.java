package a;

/* JADX INFO: loaded from: classes.dex */
public final class k45 extends sk50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rk50 f17651a;
    public final qk50 b;

    public k45(rk50 rk50Var, qk50 qk50Var) {
        this.f17651a = rk50Var;
        this.b = qk50Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sk50) {
            sk50 sk50Var = (sk50) obj;
            rk50 rk50Var = this.f17651a;
            if (rk50Var != null ? rk50Var.equals(((k45) sk50Var).f17651a) : ((k45) sk50Var).f17651a == null) {
                qk50 qk50Var = this.b;
                if (qk50Var != null ? qk50Var.equals(((k45) sk50Var).b) : ((k45) sk50Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        rk50 rk50Var = this.f17651a;
        int iHashCode = ((rk50Var == null ? 0 : rk50Var.hashCode()) ^ 1000003) * 1000003;
        qk50 qk50Var = this.b;
        return iHashCode ^ (qk50Var != null ? qk50Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f17651a + ", mobileSubtype=" + this.b + "}";
    }
}
