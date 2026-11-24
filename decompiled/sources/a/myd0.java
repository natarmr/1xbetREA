package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class myd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22599a;
    public final List b;
    public final List c;

    public myd0(String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f22599a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myd0)) {
            return false;
        }
        myd0 myd0Var = (myd0) obj;
        return this.f22599a.equals(myd0Var.f22599a) && Intrinsics.d(this.b, myd0Var.b) && Intrinsics.d(this.c, myd0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f22599a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return dw9.r(defpackage.c.f("RainbowSixStatisticModel(currentMapName=", this.f22599a, ", previousMaps=", this.b, ", mapDraftModels="), this.c, Separators.RPAREN);
    }
}
