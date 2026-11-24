package a;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class i55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f14178a;
    public final Rect b;
    public final s0a c;
    public final int d;
    public final boolean e;

    public i55(Size size, Rect rect, s0a s0aVar, int i, boolean z) {
        if (size == null) {
            hny.u("Null inputSize");
            throw null;
        }
        this.f14178a = size;
        this.b = rect;
        this.c = s0aVar;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i55)) {
            return false;
        }
        i55 i55Var = (i55) obj;
        if (!this.f14178a.equals(i55Var.f14178a) || !this.b.equals(i55Var.b)) {
            return false;
        }
        s0a s0aVar = i55Var.c;
        s0a s0aVar2 = this.c;
        if (s0aVar2 == null) {
            if (s0aVar != null) {
                return false;
            }
        } else if (!s0aVar2.equals(s0aVar)) {
            return false;
        }
        return this.d == i55Var.d && this.e == i55Var.e;
    }

    public final int hashCode() {
        int iHashCode = (((this.f14178a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        s0a s0aVar = this.c;
        return (this.e ? 1231 : 1237) ^ ((((iHashCode ^ (s0aVar == null ? 0 : s0aVar.hashCode())) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.f14178a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return rw2.p(sb, this.e, "}");
    }
}
