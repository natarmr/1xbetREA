package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wrb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39633a;
    public final List b;

    static {
        new wrb0(false);
    }

    public wrb0(boolean z) {
        iun iunVar = iun.f15405a;
        iunVar.getClass();
        this.f39633a = z;
        this.b = iunVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wrb0)) {
            return false;
        }
        wrb0 wrb0Var = (wrb0) obj;
        return this.f39633a == wrb0Var.f39633a && this.b.equals(wrb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f39633a) * 31);
    }

    public final String toString() {
        return "PreReleaseInfo(isInvisible=" + this.f39633a + ", poisoningFeatures=" + this.b + ')';
    }
}
