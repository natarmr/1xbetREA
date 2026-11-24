package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nk40 implements qk40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f23665a;
    public final List b;

    public nk40(i4 i4Var, List list) {
        i4Var.getClass();
        list.getClass();
        this.f23665a = i4Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk40)) {
            return false;
        }
        nk40 nk40Var = (nk40) obj;
        return Intrinsics.d(this.f23665a, nk40Var.f23665a) && Intrinsics.d(this.b, nk40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23665a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(itemList=" + this.f23665a + ", teams=" + this.b + Separators.RPAREN;
    }
}
