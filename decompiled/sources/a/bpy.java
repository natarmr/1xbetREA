package a;

/* JADX INFO: loaded from: classes6.dex */
public final class bpy extends hpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f3005a;

    public bpy(char c) {
        this.f3005a = c;
    }

    @Override // a.hpy
    public final Object a() {
        return Character.valueOf(this.f3005a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bpy) && this.f3005a == ((bpy) obj).f3005a;
    }

    public final int hashCode() {
        return Character.hashCode(this.f3005a);
    }
}
