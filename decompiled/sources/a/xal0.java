package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class xal0 implements abl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40562a;
    public final List b;

    public xal0(int i, List list) {
        this.f40562a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xal0)) {
            return false;
        }
        xal0 xal0Var = (xal0) obj;
        return this.f40562a == xal0Var.f40562a && this.b.equals(xal0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f40562a) * 31);
    }

    public final String toString() {
        return "ShowImageGalleryDialog(position=" + this.f40562a + ", imageList=" + this.b + Separators.RPAREN;
    }
}
