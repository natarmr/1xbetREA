package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class pmr implements umr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27250a;
    public final List b;

    public pmr(int i, List list) {
        this.f27250a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmr)) {
            return false;
        }
        pmr pmrVar = (pmr) obj;
        return this.f27250a == pmrVar.f27250a && this.b.equals(pmrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f27250a) * 31);
    }

    public final String toString() {
        return "PictureStadiumClick(index=" + this.f27250a + ", imageList=" + this.b + Separators.RPAREN;
    }
}
