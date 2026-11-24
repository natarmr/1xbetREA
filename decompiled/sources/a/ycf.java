package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ycf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42383a;
    public final List b;

    public ycf(String str, List list) {
        list.getClass();
        this.f42383a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycf)) {
            return false;
        }
        ycf ycfVar = (ycf) obj;
        return this.f42383a.equals(ycfVar.f42383a) && Intrinsics.d(this.b, ycfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42383a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CricketBallsModel(players=", this.f42383a, ", balls=", this.b, Separators.RPAREN);
    }
}
