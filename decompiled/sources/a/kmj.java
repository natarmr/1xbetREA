package a;

/* JADX INFO: loaded from: classes3.dex */
public final class kmj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18541a;
    public final int b;
    public final boolean c;

    public kmj(int i, long j, boolean z) {
        this.f18541a = j;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmj)) {
            return false;
        }
        kmj kmjVar = (kmj) obj;
        return this.f18541a == kmjVar.f18541a && this.b == kmjVar.b && this.c == kmjVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(twn.a(this.b, Long.hashCode(this.f18541a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return f140.n(brm0.q(this.b, this.f18541a, "CyberDiscipline(sportId=", ", cyberType="), ", randomDiscipline=", this.c, ", hasBackStack=false)");
    }
}
