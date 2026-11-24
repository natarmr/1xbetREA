package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class my1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22584a;
    public final ly1 b;

    public my1(String str, ly1 ly1Var) {
        str.getClass();
        this.f22584a = str;
        this.b = ly1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my1)) {
            return false;
        }
        my1 my1Var = (my1) obj;
        return Intrinsics.d(this.f22584a, my1Var.f22584a) && this.b == my1Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22584a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorTournamentsCardsNativeMainTagUiModel(label=" + this.f22584a + ", state=" + this.b + Separators.RPAREN;
    }
}
