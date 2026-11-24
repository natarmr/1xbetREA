package a;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24671a;
    public final HashMap b;
    public final Executor c;
    public final mz9 d;
    public final Rect e;
    public final Matrix f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final List k;

    public o55(Executor executor, mz9 mz9Var, Rect rect, Matrix matrix, int i, int i2, int i3, boolean z, List list) {
        this.f24671a = ((CaptureFailedRetryQuirk) khk.f18297a.b(CaptureFailedRetryQuirk.class)) == null ? 0 : 1;
        this.b = new HashMap();
        if (executor == null) {
            hny.u("Null appExecutor");
            throw null;
        }
        this.c = executor;
        this.d = mz9Var;
        this.e = rect;
        if (matrix == null) {
            hny.u("Null sensorToBufferTransform");
            throw null;
        }
        this.f = matrix;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = z;
        if (list != null) {
            this.k = list;
        } else {
            hny.u("Null sessionConfigCameraCaptureCallbacks");
            throw null;
        }
    }

    public final boolean a() {
        Iterator it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final void b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        if (map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), Boolean.TRUE);
        } else {
            l8x.X("TakePictureRequest", "The format is not supported in simultaneous capture");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o55) {
            o55 o55Var = (o55) obj;
            if (this.c.equals(o55Var.c)) {
                mz9 mz9Var = o55Var.d;
                mz9 mz9Var2 = this.d;
                if (mz9Var2 == null) {
                    if (mz9Var == null) {
                    }
                } else if (mz9Var2 != mz9Var) {
                    return false;
                }
                if (this.e.equals(o55Var.e) && this.f.equals(o55Var.f) && this.g == o55Var.g && this.h == o55Var.h && this.i == o55Var.i && this.j == o55Var.j && this.k.equals(o55Var.k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() ^ 1000003) * 1000003;
        mz9 mz9Var = this.d;
        return this.k.hashCode() ^ ((((((((((((((iHashCode ^ (mz9Var == null ? 0 : mz9Var.hashCode())) * 1525764945) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TakePictureRequest{appExecutor=");
        sb.append(this.c);
        sb.append(", inMemoryCallback=");
        sb.append(this.d);
        sb.append(", onDiskCallback=null, outputFileOptions=null, secondaryOutputFileOptions=null, cropRect=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform=");
        sb.append(this.f);
        sb.append(", rotationDegrees=");
        sb.append(this.g);
        sb.append(", jpegQuality=");
        sb.append(this.h);
        sb.append(", captureMode=");
        sb.append(this.i);
        sb.append(", simultaneousCapture=");
        sb.append(this.j);
        sb.append(", sessionConfigCameraCaptureCallbacks=");
        return dw9.r(sb, this.k, "}");
    }
}
