package a;

/* JADX INFO: loaded from: classes6.dex */
public final class bee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2445a;

    public bee(boolean z) {
        this.f2445a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bee) && this.f2445a == ((bee) obj).f2445a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(Boolean.hashCode(this.f2445a) * 31, 31, true);
    }

    public final String toString() {
        return defpackage.c.d("ContentDialogState(isVisible=", ", isTouchEnable=true, isDragEnable=true)", this.f2445a);
    }
}
