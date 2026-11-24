package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rng implements vng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30786a;
    public final ArrayList b;

    public rng(ArrayList arrayList, List list) {
        list.getClass();
        this.f30786a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rng)) {
            return false;
        }
        rng rngVar = (rng) obj;
        return Intrinsics.d(this.f30786a, rngVar.f30786a) && this.b.equals(rngVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30786a.hashCode() * 31);
    }

    public final String toString() {
        return "SecondPlayerCardList(cards=" + this.f30786a + ", cardsOnTable=" + this.b + Separators.RPAREN;
    }
}
