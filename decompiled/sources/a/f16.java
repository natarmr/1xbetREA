package a;

/* JADX INFO: loaded from: classes3.dex */
public final class f16 extends i16 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8750a;

    public f16(boolean z) {
        this.f8750a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f16) && this.f8750a == ((f16) obj).f8750a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(this.f8750a) * 31);
    }

    public final String toString() {
        return defpackage.c.d("PlayCommand(enableBackIcon=", ", enableRulesIcon=false)", this.f8750a);
    }
}
