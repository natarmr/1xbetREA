package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mvh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22456a;
    public final String b;

    public mvh(List list, String str) {
        list.getClass();
        this.f22456a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvh)) {
            return false;
        }
        mvh mvhVar = (mvh) obj;
        return Intrinsics.d(this.f22456a, mvhVar.f22456a) && this.b.equals(mvhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22456a.hashCode() * 31);
    }

    public final String toString() {
        return "CyclingPlayerResultModel(results=" + this.f22456a + ", title=" + this.b + Separators.RPAREN;
    }
}
