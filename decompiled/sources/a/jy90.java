package a;

/* JADX INFO: loaded from: classes.dex */
public final class jy90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjq f17349a;

    public jy90(jjq jjqVar) {
        this.f17349a = jjqVar;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.f17349a.f16630a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jy90) {
            return this.f17349a.equals(((jy90) obj).f17349a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17349a.f16630a.hashCode();
    }
}
