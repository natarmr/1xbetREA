package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class s2s implements y2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31517a;
    public final List b;

    public s2s(int i, List list) {
        this.f31517a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2s)) {
            return false;
        }
        s2s s2sVar = (s2s) obj;
        return this.f31517a == s2sVar.f31517a && this.b.equals(s2sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f31517a) * 31);
    }

    public final String toString() {
        return "ShowImageGalleryDialog(position=" + this.f31517a + ", imageList=" + this.b + Separators.RPAREN;
    }
}
