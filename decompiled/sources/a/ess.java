package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8345a;
    public final List b;

    public ess(String str, List list) {
        list.getClass();
        this.f8345a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ess)) {
            return false;
        }
        ess essVar = (ess) obj;
        return this.f8345a.equals(essVar.f8345a) && Intrinsics.d(this.b, essVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8345a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("GameStatisticModel(title=", this.f8345a, ", periodStatistics=", this.b, Separators.RPAREN);
    }
}
