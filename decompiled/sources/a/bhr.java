package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class bhr extends mir {
    public static final ahr Companion = new ahr();
    public final int c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bhr(int i, String str, int i2, String str2) {
        super(i, str);
        if (2 != (i & 2)) {
            m2x.I(i, 2, zgr.f44357a.getDescriptor());
            throw null;
        }
        this.c = i2;
        if ((i & 4) == 0) {
            this.d = "GPWebAppSetGameUnderMaintenance";
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
        if (!(obj instanceof bhr)) {
            return false;
        }
        bhr bhrVar = (bhr) obj;
        return this.c == bhrVar.c && Intrinsics.d(this.d, bhrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.c, "GPWebAppSetGameUnderMaintenance(gameId=", ", eventName=", this.d, Separators.RPAREN);
    }
}
