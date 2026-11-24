package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hsp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f13596a;
    public final f5h0 b;
    public final isp c;

    public /* synthetic */ hsp(String str, f5h0 f5h0Var, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? f5h0.f8962a : f5h0Var, (i & 4) != 0 ? null : isp.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsp)) {
            return false;
        }
        hsp hspVar = (hsp) obj;
        return Intrinsics.d(this.f13596a, hspVar.f13596a) && this.b == hspVar.b && this.c == hspVar.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.f13596a;
        int iHashCode = (this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31)) * 31;
        isp ispVar = this.c;
        return iHashCode + (ispVar != null ? ispVar.hashCode() : 0);
    }

    public final String toString() {
        return "FightCellContent(text=" + ((Object) this.f13596a) + ", scoreState=" + this.b + ", drawable=" + this.c + Separators.RPAREN;
    }

    public hsp(CharSequence charSequence, f5h0 f5h0Var, isp ispVar) {
        f5h0Var.getClass();
        this.f13596a = charSequence;
        this.b = f5h0Var;
        this.c = ispVar;
    }
}
