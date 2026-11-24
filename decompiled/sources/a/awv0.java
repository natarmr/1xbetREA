package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class awv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dwv0 f1594a;
    public final zvv0 b;
    public final boolean c;

    public awv0(dwv0 dwv0Var, zvv0 zvv0Var, boolean z) {
        zvv0Var.getClass();
        this.f1594a = dwv0Var;
        this.b = zvv0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awv0)) {
            return false;
        }
        awv0 awv0Var = (awv0) obj;
        return this.f1594a.equals(awv0Var.f1594a) && Intrinsics.d(this.b, awv0Var.b) && this.c == awv0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f1594a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XBottomSheetResizeRead(scrollSnapshot=");
        sb.append(this.f1594a);
        sb.append(", rects=");
        sb.append(this.b);
        sb.append(", isSheetQuiet=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
