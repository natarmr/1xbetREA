package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d5g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5503a;
    public final List b;

    public d5g(int i, List list) {
        list.getClass();
        this.f5503a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5g)) {
            return false;
        }
        d5g d5gVar = (d5g) obj;
        return this.f5503a == d5gVar.f5503a && Intrinsics.d(this.b, d5gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f5503a) * 31);
    }

    public final String toString() {
        return "CyberCalendarDatesModel(year=" + this.f5503a + ", months=" + this.b + Separators.RPAREN;
    }
}
