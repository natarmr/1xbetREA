package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class gav {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10988a;
    public final String b;

    public gav(String str, String str2) {
        str2.getClass();
        this.f10988a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gav)) {
            return false;
        }
        gav gavVar = (gav) obj;
        return this.f10988a.equals(gavVar.f10988a) && Intrinsics.d(this.b, gavVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10988a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("GoldRushPlayerUiModel(playerImage=", this.f10988a, ", playerScore=", this.b, Separators.RPAREN);
    }
}
