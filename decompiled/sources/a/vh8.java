package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vh8 implements ci8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37416a;
    public final csr b;
    public final String c;

    public vh8(int i, csr csrVar, String str) {
        csrVar.getClass();
        this.f37416a = i;
        this.b = csrVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh8)) {
            return false;
        }
        vh8 vh8Var = (vh8) obj;
        return this.f37416a == vh8Var.f37416a && Intrinsics.d(this.b, vh8Var.b) && Intrinsics.d(this.c, vh8Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.f37416a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnCellButtonClick(buttonId=");
        sb.append(this.f37416a);
        sb.append(", bonus=");
        sb.append(this.b);
        sb.append(", loadedPictureUrl=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
