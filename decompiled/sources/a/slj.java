package a;

/* JADX INFO: loaded from: classes3.dex */
public final class slj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32401a;

    public slj(boolean z) {
        this.f32401a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof slj) && this.f32401a == ((slj) obj).f32401a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(this.f32401a) * 31);
    }

    public final String toString() {
        return defpackage.c.d("Authorization(limitedLogin=", ", hasBackStack=false)", this.f32401a);
    }
}
