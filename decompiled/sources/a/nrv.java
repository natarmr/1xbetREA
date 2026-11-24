package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nrv implements prv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f24024a;
    public final boolean b;
    public final CharSequence c;
    public final CharSequence d;
    public final Integer e;
    public final o0x f;
    public final Integer g;

    public nrv(CharSequence charSequence, boolean z, String str, CharSequence charSequence2, Integer num, l0x l0xVar, Integer num2, int i) {
        z = (i & 2) != 0 ? false : z;
        str = (i & 4) != 0 ? null : str;
        charSequence2 = (i & 8) != 0 ? null : charSequence2;
        num = (i & 16) != 0 ? null : num;
        l0xVar = (i & 32) != 0 ? null : l0xVar;
        num2 = (i & 128) != 0 ? null : num2;
        charSequence.getClass();
        this.f24024a = charSequence;
        this.b = z;
        this.c = str;
        this.d = charSequence2;
        this.e = num;
        this.f = l0xVar;
        this.g = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrv)) {
            return false;
        }
        nrv nrvVar = (nrv) obj;
        return Intrinsics.d(this.f24024a, nrvVar.f24024a) && this.b == nrvVar.b && Intrinsics.d(this.c, nrvVar.c) && Intrinsics.d(this.d, nrvVar.d) && Intrinsics.d(this.e, nrvVar.e) && Intrinsics.d(this.f, nrvVar.f) && Intrinsics.d(this.g, nrvVar.g);
    }

    public final int hashCode() {
        int iE = brm0.e(this.f24024a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int iHashCode = (iE + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        o0x o0xVar = this.f;
        int iHashCode4 = (iHashCode3 + (o0xVar == null ? 0 : o0xVar.hashCode())) * 961;
        Integer num2 = this.g;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(label=");
        sb.append((Object) this.f24024a);
        sb.append(", showBadge=");
        sb.append(this.b);
        sb.append(", tag=");
        sb.append((Object) this.c);
        sb.append(", buttonLabel=");
        sb.append((Object) this.d);
        sb.append(", buttonIconResId=");
        sb.append(this.e);
        sb.append(", iconImageLink=");
        sb.append(this.f);
        sb.append(", iconPlaceholderImageLink=null, count=");
        return dw9.q(sb, this.g, Separators.RPAREN);
    }
}
