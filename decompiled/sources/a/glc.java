package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class glc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h950 f11484a;
    public final s2d0 b;
    public final e28 c;
    public final gmk0 d;

    public glc(h950 h950Var, s2d0 s2d0Var, e28 e28Var, gmk0 gmk0Var) {
        h950Var.getClass();
        s2d0Var.getClass();
        e28Var.getClass();
        gmk0Var.getClass();
        this.f11484a = h950Var;
        this.b = s2d0Var;
        this.c = e28Var;
        this.d = gmk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glc)) {
            return false;
        }
        glc glcVar = (glc) obj;
        return Intrinsics.d(this.f11484a, glcVar.f11484a) && Intrinsics.d(this.b, glcVar.b) && Intrinsics.d(this.c, glcVar.c) && Intrinsics.d(this.d, glcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f11484a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f11484a + ", classProto=" + this.b + ", metadataVersion=" + this.c + ", sourceElement=" + this.d + ')';
    }
}
