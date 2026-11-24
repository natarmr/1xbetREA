package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class hcv0 implements mcv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12842a;
    public final a4x b;
    public final String c;
    public final String d;

    public hcv0(i4 i4Var, String str, String str2) {
        i4Var.getClass();
        str2.getClass();
        this.f12842a = str;
        this.b = i4Var;
        this.c = str2;
        this.d = hcv0.class.getSimpleName().concat(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcv0)) {
            return false;
        }
        hcv0 hcv0Var = (hcv0) obj;
        return this.f12842a.equals(hcv0Var.f12842a) && Intrinsics.d(this.b, hcv0Var.b) && Intrinsics.d(this.c, hcv0Var.c);
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f12842a.hashCode() * 31, 31);
    }

    public final String toString() {
        return axq.n(kng0.u("WhoWinCellAdditionalUiModel(sectionKey=", this.f12842a, ", logoList=", this.b, ", title="), this.c, Separators.RPAREN);
    }
}
