package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class szv implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33087a;
    public final String b;
    public final float c;

    public szv(float f, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f33087a = str;
        this.b = str2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szv)) {
            return false;
        }
        szv szvVar = (szv) obj;
        return Intrinsics.d(this.f33087a, szvVar.f33087a) && Intrinsics.d(this.b, szvVar.b) && Float.compare(this.c, szvVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ua80.b(this.f33087a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return kng0.o(b1j.n("HistoryCounterUiModel(titleText=", this.f33087a, ", descriptionText=", this.b, ", progress="), this.c, Separators.RPAREN);
    }
}
