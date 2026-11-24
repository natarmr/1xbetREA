package a;

/* JADX INFO: loaded from: classes2.dex */
public final class chy extends dhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tlc f4385a;

    public chy(tlc tlcVar) {
        this.f4385a = tlcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chy) && this.f4385a.equals(((chy) obj).f4385a);
    }

    public final int hashCode() {
        return this.f4385a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f4385a + ')';
    }
}
