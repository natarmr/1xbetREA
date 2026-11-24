package a;

/* JADX INFO: loaded from: classes.dex */
public final class mg00 extends ng00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final maj f21719a;

    public mg00(maj majVar) {
        this.f21719a = majVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mg00.class != obj.getClass()) {
            return false;
        }
        return this.f21719a.equals(((mg00) obj).f21719a);
    }

    public final int hashCode() {
        return this.f21719a.hashCode() + (mg00.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f21719a + '}';
    }
}
