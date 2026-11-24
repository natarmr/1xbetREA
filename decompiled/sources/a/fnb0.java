package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fnb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mcy f9827a;
    public final String b;
    public final boolean c;

    public fnb0(mcy mcyVar, String str, boolean z) {
        mcyVar.getClass();
        str.getClass();
        this.f9827a = mcyVar;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fnb0)) {
            return false;
        }
        fnb0 fnb0Var = (fnb0) obj;
        return Intrinsics.d(this.f9827a, fnb0Var.f9827a) && Intrinsics.d(this.b, fnb0Var.b) && this.c == fnb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f9827a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PossibleValueUiModel(value=");
        sb.append(this.f9827a);
        sb.append(", label=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
