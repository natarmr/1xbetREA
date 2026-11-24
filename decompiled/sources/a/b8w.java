package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b8w implements c8w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i4 f2179a;
    public final boolean b;

    public b8w(i4 i4Var, boolean z) {
        i4Var.getClass();
        this.f2179a = i4Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8w)) {
            return false;
        }
        b8w b8wVar = (b8w) obj;
        return Intrinsics.d(this.f2179a, b8wVar.f2179a) && this.b == b8wVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f2179a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(historyTypeItemList=" + this.f2179a + ", isShowHideHistoryItem=" + this.b + Separators.RPAREN;
    }
}
