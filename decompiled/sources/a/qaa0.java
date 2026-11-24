package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qaa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28386a;
    public final List b;

    public qaa0(String str, List list) {
        str.getClass();
        list.getClass();
        this.f28386a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaa0)) {
            return false;
        }
        qaa0 qaa0Var = (qaa0) obj;
        return Intrinsics.d(this.f28386a, qaa0Var.f28386a) && Intrinsics.d(this.b, qaa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28386a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("PlayerStatisticModel(playerId=", this.f28386a, ", statistics=", this.b, Separators.RPAREN);
    }
}
