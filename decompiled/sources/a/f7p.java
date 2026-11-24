package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f7p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f9069a;
    public final boolean b;

    public f7p(a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f9069a = a4xVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7p)) {
            return false;
        }
        f7p f7pVar = (f7p) obj;
        return Intrinsics.d(this.f9069a, f7pVar.f9069a) && this.b == f7pVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f9069a.hashCode() * 31);
    }

    public final String toString() {
        return "FavoriteClearUiState(itemList=" + this.f9069a + ", clearButtonEnabled=" + this.b + Separators.RPAREN;
    }
}
