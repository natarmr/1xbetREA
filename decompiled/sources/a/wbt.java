package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class wbt {
    public static final vbt Companion = new vbt();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38896a;
    public final String b;

    public /* synthetic */ wbt(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f38896a = null;
        } else {
            this.f38896a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbt)) {
            return false;
        }
        wbt wbtVar = (wbt) obj;
        return Intrinsics.d(this.f38896a, wbtVar.f38896a) && Intrinsics.d(this.b, wbtVar.b);
    }

    public final int hashCode() {
        String str = this.f38896a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("GamesResultItemSubGameResponse(title=", this.f38896a, ", score=", this.b, Separators.RPAREN);
    }
}
