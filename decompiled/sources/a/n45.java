package a;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class n45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22883a;
    public final fko b;
    public final int c;
    public final Size d;
    public final Rect e;
    public final int f;
    public final Matrix g;
    public final cy9 h;

    public n45(Object obj, fko fkoVar, int i, Size size, Rect rect, int i2, Matrix matrix, cy9 cy9Var) {
        if (obj == null) {
            hny.u("Null data");
            throw null;
        }
        this.f22883a = obj;
        this.b = fkoVar;
        this.c = i;
        this.d = size;
        this.e = rect;
        this.f = i2;
        this.g = matrix;
        if (cy9Var != null) {
            this.h = cy9Var;
        } else {
            hny.u("Null cameraCaptureResult");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n45) {
            n45 n45Var = (n45) obj;
            if (this.f22883a.equals(n45Var.f22883a)) {
                fko fkoVar = n45Var.b;
                fko fkoVar2 = this.b;
                if (fkoVar2 == null) {
                    if (fkoVar == null) {
                    }
                } else if (fkoVar2 != fkoVar) {
                    return false;
                }
                if (this.c == n45Var.c && this.d.equals(n45Var.d) && this.e.equals(n45Var.e) && this.f == n45Var.f && this.g.equals(n45Var.g) && this.h.equals(n45Var.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f22883a.hashCode() ^ 1000003) * 1000003;
        fko fkoVar = this.b;
        return this.h.hashCode() ^ ((((((((((((iHashCode ^ (fkoVar == null ? 0 : fkoVar.hashCode())) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Packet{data=" + this.f22883a + ", exif=" + this.b + ", format=" + this.c + ", size=" + this.d + ", cropRect=" + this.e + ", rotationDegrees=" + this.f + ", sensorToBufferTransform=" + this.g + ", cameraCaptureResult=" + this.h + "}";
    }
}
