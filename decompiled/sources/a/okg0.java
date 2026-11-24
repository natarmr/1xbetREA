package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class okg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25405a;
    public final String b;

    public okg0(List list, String str) {
        list.getClass();
        str.getClass();
        this.f25405a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okg0)) {
            return false;
        }
        okg0 okg0Var = (okg0) obj;
        return Intrinsics.d(this.f25405a, okg0Var.f25405a) && Intrinsics.d(this.b, okg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25405a.hashCode() * 31);
    }

    public final String toString() {
        return "RpsWinnerInfoUiModel(winners=" + this.f25405a + ", winnerTitle=" + this.b + Separators.RPAREN;
    }
}
