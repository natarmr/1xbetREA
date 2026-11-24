package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class zhr extends mir {
    public static final yhr Companion = new yhr();
    public final sbv c;
    public final String d;

    public /* synthetic */ zhr(int i, String str, sbv sbvVar, String str2) {
        super(i, str);
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = sbvVar;
        }
        if ((i & 4) == 0) {
            this.d = "GPWebAppShowGameBonus";
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
        if (!(obj instanceof zhr)) {
            return false;
        }
        zhr zhrVar = (zhr) obj;
        return Intrinsics.d(this.c, zhrVar.c) && Intrinsics.d(this.d, zhrVar.d);
    }

    public final int hashCode() {
        sbv sbvVar = this.c;
        return this.d.hashCode() + ((sbvVar == null ? 0 : sbvVar.hashCode()) * 31);
    }

    public final String toString() {
        return "GPWebAppShowGameBonus(bonus=" + this.c + ", eventName=" + this.d + Separators.RPAREN;
    }
}
