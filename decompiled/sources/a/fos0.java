package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class fos0 {
    public static final bos0 Companion = new bos0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new xns0(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9898a;
    public final List b;

    public /* synthetic */ fos0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f9898a = null;
        } else {
            this.f9898a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fos0)) {
            return false;
        }
        fos0 fos0Var = (fos0) obj;
        return Intrinsics.d(this.f9898a, fos0Var.f9898a) && Intrinsics.d(this.b, fos0Var.b);
    }

    public final int hashCode() {
        String str = this.f9898a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("TranslationKVResponse(keyText=", this.f9898a, ", translations=", this.b, Separators.RPAREN);
    }
}
