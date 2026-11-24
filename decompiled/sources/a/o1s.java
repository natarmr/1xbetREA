package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class o1s implements v1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24497a;
    public final List b;

    public o1s(int i, List list) {
        this.f24497a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1s)) {
            return false;
        }
        o1s o1sVar = (o1s) obj;
        return this.f24497a == o1sVar.f24497a && this.b.equals(o1sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f24497a) * 31);
    }

    public final String toString() {
        return "PictureStadiumClick(index=" + this.f24497a + ", imageList=" + this.b + Separators.RPAREN;
    }
}
