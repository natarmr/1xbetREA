package a;

/* JADX INFO: loaded from: classes3.dex */
public final class zie implements kje {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f44436a;

    public zie(mdm mdmVar) {
        this.f44436a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zie) && this.f44436a.equals(((zie) obj).f44436a);
    }

    public final int hashCode() {
        return Long.hashCode(10000L) + (this.f44436a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.j("Error(lottieConfigurator=", this.f44436a, ", countDownTimeMillis=10000)");
    }
}
