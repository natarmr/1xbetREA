package a;

/* JADX INFO: loaded from: classes2.dex */
public final class qg00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28660a;
    public final String b;

    public qg00(Object obj, String str) {
        this.f28660a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg00)) {
            return false;
        }
        qg00 qg00Var = (qg00) obj;
        return this.f28660a == qg00Var.f28660a && this.b.equals(qg00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.f28660a) * 31);
    }
}
