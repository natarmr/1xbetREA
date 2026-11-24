package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5g f30023a;
    public final List b;

    public r8g(x5g x5gVar, List list) {
        list.getClass();
        this.f30023a = x5gVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8g)) {
            return false;
        }
        r8g r8gVar = (r8g) obj;
        return this.f30023a.equals(r8gVar.f30023a) && Intrinsics.d(this.b, r8gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30023a.hashCode() * 31);
    }

    public final String toString() {
        return "MonthGridParams(weekParams=" + this.f30023a + ", monthParams=" + this.b + Separators.RPAREN;
    }
}
