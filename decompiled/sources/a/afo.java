package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class afo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f788a;
    public final List b;

    public afo(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f788a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afo)) {
            return false;
        }
        afo afoVar = (afo) obj;
        return Intrinsics.d(this.f788a, afoVar.f788a) && Intrinsics.d(this.b, afoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f788a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("EventParams(params=", ", playerNames=", this.f788a, Separators.RPAREN, this.b);
    }
}
