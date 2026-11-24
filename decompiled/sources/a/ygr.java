package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ygr extends mir {
    public static final xgr Companion = new xgr();
    public final pir c;
    public final String d;

    public /* synthetic */ ygr(int i, String str, pir pirVar, String str2) {
        super(i, str);
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = pirVar;
        }
        if ((i & 4) == 0) {
            this.d = "GPWebAppSetGameBonusVer2";
        } else {
            this.d = str2;
        }
    }

    @Override // a.mir
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygr)) {
            return false;
        }
        ygr ygrVar = (ygr) obj;
        return Intrinsics.d(this.c, ygrVar.c) && Intrinsics.d(this.d, ygrVar.d);
    }

    public final int hashCode() {
        pir pirVar = this.c;
        return this.d.hashCode() + ((pirVar == null ? 0 : pirVar.hashCode()) * 31);
    }

    public final String toString() {
        return "GPWebAppSetGameBonusVer2(bonus=" + this.c + ", eventName=" + this.d + Separators.RPAREN;
    }

    public ygr(pir pirVar) {
        this.c = pirVar;
        this.d = "GPWebAppSetGameBonusVer2";
    }
}
