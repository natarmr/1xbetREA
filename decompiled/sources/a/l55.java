package a;

import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class l55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f19438a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    public final boolean f;

    public l55(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        this.f19438a = rect;
        this.b = i;
        this.c = i2;
        this.d = z;
        if (matrix == null) {
            hny.u("Null getSensorToBufferTransform");
            throw null;
        }
        this.e = matrix;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l55)) {
            return false;
        }
        l55 l55Var = (l55) obj;
        return this.f19438a.equals(l55Var.f19438a) && this.b == l55Var.b && this.c == l55Var.c && this.d == l55Var.d && this.e.equals(l55Var.e) && this.f == l55Var.f;
    }

    public final int hashCode() {
        return ((((((((((this.f19438a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.f19438a);
        sb.append(", getRotationDegrees=");
        sb.append(this.b);
        sb.append(", getTargetRotation=");
        sb.append(this.c);
        sb.append(", hasCameraTransform=");
        sb.append(this.d);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", isMirroring=");
        return rw2.p(sb, this.f, "}");
    }
}
