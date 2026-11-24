package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yeo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f42496a;
    public final List b;

    public yeo(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f42496a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yeo)) {
            return false;
        }
        yeo yeoVar = (yeo) obj;
        return Intrinsics.d(this.f42496a, yeoVar.f42496a) && Intrinsics.d(this.b, yeoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42496a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("EventParams(params=", ", playerNames=", this.f42496a, Separators.RPAREN, this.b);
    }
}
