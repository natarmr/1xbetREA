package a;

/* JADX INFO: loaded from: classes2.dex */
public final class n25 extends n9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22783a;
    public final String b;
    public final h9f c;
    public final i9f d;
    public final j9f e;
    public final m9f f;

    public n25(long j, String str, h9f h9fVar, i9f i9fVar, j9f j9fVar, m9f m9fVar) {
        this.f22783a = j;
        this.b = str;
        this.c = h9fVar;
        this.d = i9fVar;
        this.e = j9fVar;
        this.f = m9fVar;
    }

    public final m25 a() {
        m25 m25Var = new m25();
        m25Var.f21039a = this.f22783a;
        m25Var.b = this.b;
        m25Var.c = this.c;
        m25Var.d = this.d;
        m25Var.e = this.e;
        m25Var.f = this.f;
        m25Var.g = (byte) 1;
        return m25Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n9f) {
            n25 n25Var = (n25) ((n9f) obj);
            if (this.f22783a == n25Var.f22783a && this.b.equals(n25Var.b) && this.c.equals(n25Var.c) && this.d.equals(n25Var.d)) {
                j9f j9fVar = n25Var.e;
                j9f j9fVar2 = this.e;
                if (j9fVar2 != null ? j9fVar2.equals(j9fVar) : j9fVar == null) {
                    m9f m9fVar = n25Var.f;
                    m9f m9fVar2 = this.f;
                    if (m9fVar2 != null ? m9fVar2.equals(m9fVar) : m9fVar == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f22783a;
        int iHashCode = (((((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        j9f j9fVar = this.e;
        int iHashCode2 = (iHashCode ^ (j9fVar == null ? 0 : j9fVar.hashCode())) * 1000003;
        m9f m9fVar = this.f;
        return iHashCode2 ^ (m9fVar != null ? m9fVar.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f22783a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }
}
