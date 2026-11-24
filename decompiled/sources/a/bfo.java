package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2511a;
    public final List b;

    public bfo(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f2511a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfo)) {
            return false;
        }
        bfo bfoVar = (bfo) obj;
        return Intrinsics.d(this.f2511a, bfoVar.f2511a) && Intrinsics.d(this.b, bfoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2511a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("EventParams(params=", ", playerNames=", this.f2511a, Separators.RPAREN, this.b);
    }
}
