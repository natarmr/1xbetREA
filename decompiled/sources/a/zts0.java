package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zts0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44978a;
    public final String b;
    public final List c;
    public final d4d d;

    public zts0(String str, String str2, List list, d4d d4dVar) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f44978a = str;
        this.b = str2;
        this.c = list;
        this.d = d4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zts0)) {
            return false;
        }
        zts0 zts0Var = (zts0) obj;
        return Intrinsics.d(this.f44978a, zts0Var.f44978a) && Intrinsics.d(this.b, zts0Var.b) && Intrinsics.d(this.c, zts0Var.c) && this.d == zts0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(ua80.b(this.f44978a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TwentyOneClassicPlayerInfoUiModel(name=", this.f44978a, ", score=", this.b, ", cardsList=");
        sbN.append(this.c);
        sbN.append(", scoreColor=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
