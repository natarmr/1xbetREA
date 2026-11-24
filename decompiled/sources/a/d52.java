package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5483a;
    public final a4x b;
    public final wul c;
    public final wul d;
    public final wul e;
    public final boolean f;

    public d52(String str, a4x a4xVar, wul wulVar, wul wulVar2, wul wulVar3, boolean z) {
        str.getClass();
        a4xVar.getClass();
        this.f5483a = str;
        this.b = a4xVar;
        this.c = wulVar;
        this.d = wulVar2;
        this.e = wulVar3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d52)) {
            return false;
        }
        d52 d52Var = (d52) obj;
        return Intrinsics.d(this.f5483a, d52Var.f5483a) && Intrinsics.d(this.b, d52Var.b) && this.c.equals(d52Var.c) && this.d.equals(d52Var.d) && Intrinsics.d(this.e, d52Var.e) && this.f == d52Var.f;
    }

    public final int hashCode() {
        int iA = i8i.a(this.d, i8i.a(this.c, cs0.b(this.b, this.f5483a.hashCode() * 31, 31), 31), 31);
        wul wulVar = this.e;
        return Boolean.hashCode(this.f) + ((iA + (wulVar == null ? 0 : wulVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("AllFiltersUiState(title=", this.f5483a, ", sectionUiItemList=", this.b, ", resetButtonUiModel=");
        sbU.append(this.c);
        sbU.append(", applyButtonUiModel=");
        sbU.append(this.d);
        sbU.append(", requestHistoryButtonUiModel=");
        sbU.append(this.e);
        sbU.append(", hasHistoryPeriodFilter=");
        sbU.append(this.f);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
