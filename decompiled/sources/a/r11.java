package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wzh f29655a;
    public final hnl b;
    public final vf8 c;
    public final vf8 d;
    public final vf8 e;
    public final vf8 f;
    public final int g;

    public r11(wzh wzhVar, hnl hnlVar, vf8 vf8Var, vf8 vf8Var2, vf8 vf8Var3, vf8 vf8Var4, int i) {
        this.f29655a = wzhVar;
        this.b = hnlVar;
        this.c = vf8Var;
        this.d = vf8Var2;
        this.e = vf8Var3;
        this.f = vf8Var4;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r11)) {
            return false;
        }
        r11 r11Var = (r11) obj;
        return this.f29655a.equals(r11Var.f29655a) && this.b.equals(r11Var.b) && Intrinsics.d(this.c, r11Var.c) && Intrinsics.d(this.d, r11Var.d) && Intrinsics.d(this.e, r11Var.e) && Intrinsics.d(this.f, r11Var.f) && this.g == r11Var.g;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f29655a.hashCode() * 31)) * 31;
        vf8 vf8Var = this.c;
        int iHashCode2 = (iHashCode + (vf8Var == null ? 0 : vf8Var.hashCode())) * 31;
        vf8 vf8Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (vf8Var2 == null ? 0 : vf8Var2.hashCode())) * 31;
        vf8 vf8Var3 = this.e;
        int iHashCode4 = (iHashCode3 + (vf8Var3 == null ? 0 : vf8Var3.hashCode())) * 31;
        vf8 vf8Var4 = this.f;
        return Integer.hashCode(this.g) + ((iHashCode4 + (vf8Var4 != null ? vf8Var4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AggregatorGiftsUiItem(uiModel=");
        sb.append(this.f29655a);
        sb.append(", configurationType=");
        sb.append(this.b);
        sb.append(", topTagsParams=");
        sb.append(this.c);
        sb.append(", bottomTagParams=");
        sb.append(this.d);
        sb.append(", topButtonParams=");
        sb.append(this.e);
        sb.append(", bottomButtonParams=");
        sb.append(this.f);
        sb.append(", giftId=");
        return rz4.j(this.g, Separators.RPAREN, sb);
    }
}
