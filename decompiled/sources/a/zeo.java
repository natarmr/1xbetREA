package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zeo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f44262a;
    public final List b;

    public zeo(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f44262a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zeo)) {
            return false;
        }
        zeo zeoVar = (zeo) obj;
        return Intrinsics.d(this.f44262a, zeoVar.f44262a) && Intrinsics.d(this.b, zeoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44262a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("EventParams(params=", ", playerNames=", this.f44262a, Separators.RPAREN, this.b);
    }
}
