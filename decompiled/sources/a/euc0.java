package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class euc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8414a;
    public final String b;
    public final n0x c;
    public final n0x d;
    public final Function2 e;
    public final Function1 f;

    public euc0(long j, n0x n0xVar, n0x n0xVar2, String str) {
        ksc0 ksc0Var = new ksc0((byte) 5);
        ljc0 ljc0Var = new ljc0((byte) 14);
        str.getClass();
        this.f8414a = j;
        this.b = str;
        this.c = n0xVar;
        this.d = n0xVar2;
        this.e = ksc0Var;
        this.f = ljc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euc0)) {
            return false;
        }
        euc0 euc0Var = (euc0) obj;
        return this.f8414a == euc0Var.f8414a && Intrinsics.d(this.b, euc0Var.b) && this.c.equals(euc0Var.c) && Intrinsics.d(this.d, euc0Var.d) && this.e.equals(euc0Var.e) && this.f.equals(euc0Var.f);
    }

    public final int hashCode() {
        int iF = f140.f(this.c, twn.a(0, ua80.b(Long.hashCode(this.f8414a) * 31, 31, this.b), 961), 31);
        n0x n0xVar = this.d;
        int iHashCode = n0xVar != null ? n0xVar.hashCode() : 0;
        return this.f.hashCode() + ((this.e.hashCode() + ((iF + iHashCode) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f8414a, "PromoStoreCollectionItemModel(promoId=", ", label=", this.b);
        sbO.append(", count=0, unit=, picture=");
        sbO.append(this.c);
        sbO.append(", pictureFallback=");
        sbO.append(this.d);
        sbO.append(", onLoaded=");
        sbO.append(this.e);
        sbO.append(", onError=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
