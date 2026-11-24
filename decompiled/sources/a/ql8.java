package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ql8 implements rl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28921a;

    public ql8(boolean z) {
        this.f28921a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql8) && this.f28921a == ((ql8) obj).f28921a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Boolean.hashCode(this.f28921a) * 31);
    }

    public final String toString() {
        return defpackage.c.d("Refuse(isLoading=", ", isEnable=true)", this.f28921a);
    }
}
