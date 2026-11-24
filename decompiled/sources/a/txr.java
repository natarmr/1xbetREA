package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class txr implements yxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34715a;
    public final List b;

    public txr(String str, List list) {
        str.getClass();
        list.getClass();
        this.f34715a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txr)) {
            return false;
        }
        txr txrVar = (txr) obj;
        return Intrinsics.d(this.f34715a, txrVar.f34715a) && Intrinsics.d(this.b, txrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34715a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("FirstTeam(playerName=", this.f34715a, ", playerCards=", this.b, Separators.RPAREN);
    }
}
