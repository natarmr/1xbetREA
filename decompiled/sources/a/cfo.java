package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4272a;
    public final List b;

    public cfo(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f4272a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfo)) {
            return false;
        }
        cfo cfoVar = (cfo) obj;
        return Intrinsics.d(this.f4272a, cfoVar.f4272a) && Intrinsics.d(this.b, cfoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4272a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("EventParams(params=", ", playerNames=", this.f4272a, Separators.RPAREN, this.b);
    }
}
