package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class knb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18576a;
    public final List b;

    public knb(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f18576a = list;
        this.b = list2;
    }

    public static knb a(knb knbVar, List list) {
        List list2 = knbVar.b;
        knbVar.getClass();
        list.getClass();
        list2.getClass();
        return new knb(list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knb)) {
            return false;
        }
        knb knbVar = (knb) obj;
        return Intrinsics.d(this.f18576a, knbVar.f18576a) && Intrinsics.d(this.b, knbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18576a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.l("ChampsWithTabsModel(champs=", ", tabs=", this.f18576a, Separators.RPAREN, this.b);
    }
}
