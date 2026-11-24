package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c7v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3882a;
    public final List b;

    public c7v(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f3882a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7v)) {
            return false;
        }
        c7v c7vVar = (c7v) obj;
        return Intrinsics.d(this.f3882a, c7vVar.f3882a) && Intrinsics.d(this.b, c7vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3882a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("GiftsByAccountModel(availableBonuses=", ", availableFreeSpins=", this.f3882a, Separators.RPAREN, this.b);
    }
}
