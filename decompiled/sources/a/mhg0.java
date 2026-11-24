package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class mhg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f21792a = 0.0f;
    public boolean b = true;
    public wvb c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhg0)) {
            return false;
        }
        mhg0 mhg0Var = (mhg0) obj;
        return Float.compare(this.f21792a, mhg0Var.f21792a) == 0 && this.b == mhg0Var.b && Intrinsics.d(this.c, mhg0Var.c);
    }

    public final int hashCode() {
        int iE = brm0.e(Float.hashCode(this.f21792a) * 31, 31, this.b);
        wvb wvbVar = this.c;
        return (iE + (wvbVar == null ? 0 : wvbVar.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f21792a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}
