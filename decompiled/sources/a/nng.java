package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nng implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23818a;
    public final ArrayList b;

    public nng(ArrayList arrayList, List list) {
        list.getClass();
        this.f23818a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nng)) {
            return false;
        }
        nng nngVar = (nng) obj;
        return Intrinsics.d(this.f23818a, nngVar.f23818a) && this.b.equals(nngVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f23818a.hashCode() * 31);
    }

    public final String toString() {
        return "FirstPlayerCardList(cards=" + this.f23818a + ", cardsOnTable=" + this.b + Separators.RPAREN;
    }
}
