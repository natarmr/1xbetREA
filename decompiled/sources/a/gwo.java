package a;

/* JADX INFO: loaded from: classes6.dex */
public final class gwo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugd f12036a;

    public gwo(ugd ugdVar) {
        this.f12036a = ugdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwo) && this.f12036a == ((gwo) obj).f12036a;
    }

    public final int hashCode() {
        return this.f12036a.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=null, transition=" + this.f12036a + ')';
    }
}
