package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22184a;
    public final List b;

    public mpk(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f22184a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpk)) {
            return false;
        }
        mpk mpkVar = (mpk) obj;
        return Intrinsics.d(this.f22184a, mpkVar.f22184a) && Intrinsics.d(this.b, mpkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22184a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("DisciplineDetailsDefaultChampsMapModel(liveTopChamps=", ", lineTopChamps=", this.f22184a, Separators.RPAREN, this.b);
    }
}
