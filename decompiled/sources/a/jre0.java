package a;

/* JADX INFO: loaded from: classes.dex */
public final class jre0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f16999a;
    public final cry b;

    public jre0(Class cls, cry cryVar) {
        this.f16999a = cls;
        this.b = cryVar;
    }

    public final String a() {
        String strReplace = this.f16999a.getName().replace('.', '/');
        strReplace.getClass();
        return strReplace.concat(".class");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jre0) {
            return this.f16999a.equals(((jre0) obj).f16999a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16999a.hashCode();
    }

    public final String toString() {
        return jre0.class.getName() + ": " + this.f16999a;
    }
}
