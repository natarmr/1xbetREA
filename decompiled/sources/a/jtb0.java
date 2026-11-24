package a;

import android.graphics.Rect;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class jtb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f17091a;
    public final Size b;
    public final Size c;

    public jtb0(Rect rect, Size size, Size size2) {
        size.getClass();
        size2.getClass();
        this.f17091a = rect;
        this.b = size;
        this.c = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtb0)) {
            return false;
        }
        jtb0 jtb0Var = (jtb0) obj;
        return this.f17091a.equals(jtb0Var.f17091a) && Intrinsics.d(this.b, jtb0Var.b) && Intrinsics.d(this.c, jtb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f17091a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.f17091a + ", childSizeToScale=" + this.b + ", originalSelectedChildSize=" + this.c + ')';
    }
}
