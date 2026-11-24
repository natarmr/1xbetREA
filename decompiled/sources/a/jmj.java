package a;

/* JADX INFO: loaded from: classes3.dex */
public final class jmj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16768a;
    public final long b;
    public final int c;

    public jmj(int i, long j, long j2) {
        this.f16768a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmj)) {
            return false;
        }
        jmj jmjVar = (jmj) obj;
        return this.f16768a == jmjVar.f16768a && this.b == jmjVar.b && this.c == jmjVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + twn.a(this.c, rw2.b(Long.hashCode(this.f16768a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f16768a, "CyberChamp(champId=", ", sportId=");
        ua80.v(sbQ, this.b, ", cyberType=", this.c);
        sbQ.append(", hasBackStack=false)");
        return sbQ.toString();
    }
}
