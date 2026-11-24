package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fiw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9608a;
    public final List b;

    public fiw(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f9608a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fiw)) {
            return false;
        }
        fiw fiwVar = (fiw) obj;
        return Intrinsics.d(this.f9608a, fiwVar.f9608a) && Intrinsics.d(this.b, fiwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9608a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("HomeChampsStateMapModel(liveTopChamps=", ", lineTopChamps=", this.f9608a, Separators.RPAREN, this.b);
    }
}
