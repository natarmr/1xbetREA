package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class mgs implements ogs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21758a;
    public final p6q b;

    public mgs(String str, p6q p6qVar) {
        str.getClass();
        this.f21758a = str;
        this.b = p6qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgs)) {
            return false;
        }
        mgs mgsVar = (mgs) obj;
        return Intrinsics.d(this.f21758a, mgsVar.f21758a) && this.b.equals(mgsVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21758a.hashCode() * 31);
    }

    public final String toString() {
        return "SubGameFinBetLevelUiModel(subGameText=" + this.f21758a + ", finBetLevelUiModel=" + this.b + Separators.RPAREN;
    }
}
