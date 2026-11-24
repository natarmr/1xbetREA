package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class lnr implements pnr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20360a;
    public final List b;

    public lnr(int i, List list) {
        this.f20360a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnr)) {
            return false;
        }
        lnr lnrVar = (lnr) obj;
        return this.f20360a == lnrVar.f20360a && this.b.equals(lnrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f20360a) * 31);
    }

    public final String toString() {
        return "ShowImageGalleryDialog(position=" + this.f20360a + ", imageList=" + this.b + Separators.RPAREN;
    }
}
