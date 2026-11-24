package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f9q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final smk0 f9167a;
    public final smk0 b;
    public final smk0 c;
    public final smk0 d;

    public f9q0(smk0 smk0Var, smk0 smk0Var2, smk0 smk0Var3, smk0 smk0Var4) {
        this.f9167a = smk0Var;
        this.b = smk0Var2;
        this.c = smk0Var3;
        this.d = smk0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f9q0)) {
            return false;
        }
        f9q0 f9q0Var = (f9q0) obj;
        return Intrinsics.d(this.f9167a, f9q0Var.f9167a) && Intrinsics.d(this.b, f9q0Var.b) && Intrinsics.d(this.c, f9q0Var.c) && Intrinsics.d(this.d, f9q0Var.d);
    }

    public final int hashCode() {
        smk0 smk0Var = this.f9167a;
        int iHashCode = (smk0Var != null ? smk0Var.hashCode() : 0) * 31;
        smk0 smk0Var2 = this.b;
        int iHashCode2 = (iHashCode + (smk0Var2 != null ? smk0Var2.hashCode() : 0)) * 31;
        smk0 smk0Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (smk0Var3 != null ? smk0Var3.hashCode() : 0)) * 31;
        smk0 smk0Var4 = this.d;
        return iHashCode3 + (smk0Var4 != null ? smk0Var4.hashCode() : 0);
    }
}
