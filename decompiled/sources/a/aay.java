package a;

/* JADX INFO: loaded from: classes2.dex */
public final class aay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qlc f553a;
    public final qlc b;
    public final qlc c;

    public aay(qlc qlcVar, qlc qlcVar2, qlc qlcVar3) {
        this.f553a = qlcVar;
        this.b = qlcVar2;
        this.c = qlcVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aay)) {
            return false;
        }
        aay aayVar = (aay) obj;
        return this.f553a.equals(aayVar.f553a) && this.b.equals(aayVar.b) && this.c.equals(aayVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f553a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlatformMutabilityMapping(javaClass=" + this.f553a + ", kotlinReadOnly=" + this.b + ", kotlinMutable=" + this.c + ')';
    }
}
