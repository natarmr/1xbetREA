package a;

/* JADX INFO: loaded from: classes.dex */
public final class kg00 extends ng00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final maj f18218a = maj.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kg00.class != obj.getClass()) {
            return false;
        }
        return this.f18218a.equals(((kg00) obj).f18218a);
    }

    public final int hashCode() {
        return this.f18218a.hashCode() + (kg00.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f18218a + '}';
    }
}
