package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c280 f26462a;
    public final String b;

    public p6m(c280 c280Var, String str) {
        this.f26462a = c280Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6m)) {
            return false;
        }
        p6m p6mVar = (p6m) obj;
        return this.f26462a.equals(p6mVar.f26462a) && Intrinsics.d(this.b, p6mVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f26462a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DsCyberGameMapOpponentUiModel(logo=" + this.f26462a + ", tagLabel=" + this.b + Separators.RPAREN;
    }
}
