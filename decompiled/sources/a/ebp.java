package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ebp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7530a;
    public final String b;
    public final String c;
    public final int d;
    public final npn e;

    public ebp(boolean z, String str, String str2, int i, npn npnVar) {
        str.getClass();
        str2.getClass();
        this.f7530a = z;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = npnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ebp) {
            ebp ebpVar = (ebp) obj;
            return this.f7530a == ebpVar.f7530a && Intrinsics.d(this.b, ebpVar.b) && Intrinsics.d(this.c, ebpVar.c) && this.d == ebpVar.d && this.e == ebpVar.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, ua80.b(ua80.b(Boolean.hashCode(this.f7530a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("FavoriteOtherChampUiModel(isFavorite=", ", image=", this.b, this.f7530a, ", name=");
        twn.w(this.d, this.c, ", iconRight=", ", champ=", sbQ);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
