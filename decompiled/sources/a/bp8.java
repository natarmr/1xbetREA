package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bp8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2969a;
    public final String b;
    public final String c;
    public final String d;
    public final a4x e;
    public final mdm f;

    public bp8(boolean z, String str, String str2, String str3, a4x a4xVar, mdm mdmVar) {
        a4xVar.getClass();
        this.f2969a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = a4xVar;
        this.f = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp8)) {
            return false;
        }
        bp8 bp8Var = (bp8) obj;
        return this.f2969a == bp8Var.f2969a && this.b.equals(bp8Var.b) && this.c.equals(bp8Var.c) && this.d.equals(bp8Var.d) && Intrinsics.d(this.e, bp8Var.e) && this.f.equals(bp8Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + cs0.b(this.e, ua80.b(ua80.b(ua80.b(Boolean.hashCode(this.f2969a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("BottomSheetLanguageUiModel(showLoader=", ", title=", this.b, this.f2969a, ", searchHint=");
        f140.v(sbQ, this.c, ", searchQuery=", this.d, ", languages=");
        sbQ.append(this.e);
        sbQ.append(", emptyConfig=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
