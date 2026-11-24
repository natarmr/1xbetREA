package a;

import android.util.Size;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r15 {
    public vx9 b;
    public o3x c;
    public o3x d;
    public final Size f;
    public final int g;
    public final ArrayList h;
    public final boolean i;
    public final gjn j;
    public final gjn k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vx9 f29660a = new e8a();
    public final o3x e = null;

    public r15(Size size, int i, ArrayList arrayList, boolean z, gjn gjnVar, gjn gjnVar2) {
        if (size == null) {
            hny.u("Null size");
            throw null;
        }
        this.f = size;
        this.g = i;
        this.h = arrayList;
        this.i = z;
        this.j = gjnVar;
        this.k = gjnVar2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r15) {
            r15 r15Var = (r15) obj;
            return this.f.equals(r15Var.f) && this.g == r15Var.g && this.h.equals(r15Var.h) && this.i == r15Var.i && this.j == r15Var.j && this.k == r15Var.k;
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() ^ ((((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 583896283) ^ this.j.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.f + ", inputFormat=" + this.g + ", outputFormats=" + this.h + ", virtualCamera=" + this.i + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.j + ", errorEdge=" + this.k + "}";
    }
}
