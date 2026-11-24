package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class lir extends mir {
    public static final kir Companion = new kir();
    public static final a8z[] e = {null, maz.a(wez.f39042a, new s9r(13)), null};
    public final ajr c;
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lir(int i, String str, ajr ajrVar, String str2) {
        super(i, str);
        if (2 != (i & 2)) {
            m2x.I(i, 2, jir.f16589a.getDescriptor());
            throw null;
        }
        this.c = ajrVar;
        if ((i & 4) == 0) {
            this.d = "GPWebAppSwitchTheme";
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
        if (!(obj instanceof lir)) {
            return false;
        }
        lir lirVar = (lir) obj;
        return this.c == lirVar.c && Intrinsics.d(this.d, lirVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "GPWebAppSwitchTheme(theme=" + this.c + ", eventName=" + this.d + Separators.RPAREN;
    }

    public lir(ajr ajrVar) {
        this.c = ajrVar;
        this.d = "GPWebAppSwitchTheme";
    }
}
