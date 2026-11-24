package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class pcc {
    public static final occ Companion = new occ();
    public static final a8z[] c = {maz.a(wez.f39042a, new zxb(7)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f26752a;
    public final String b;

    public /* synthetic */ pcc(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f26752a = null;
        } else {
            this.f26752a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcc)) {
            return false;
        }
        pcc pccVar = (pcc) obj;
        return Intrinsics.d(this.f26752a, pccVar.f26752a) && Intrinsics.d(this.b, pccVar.b);
    }

    public final int hashCode() {
        List list = this.f26752a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ChipsResultResponse(results=" + this.f26752a + ", title=" + this.b + Separators.RPAREN;
    }
}
