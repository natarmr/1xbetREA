package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z8l0 implements b9l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43973a;
    public final ArrayList b;

    public z8l0(ArrayList arrayList, List list) {
        list.getClass();
        this.f43973a = list;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8l0)) {
            return false;
        }
        z8l0 z8l0Var = (z8l0) obj;
        return Intrinsics.d(this.f43973a, z8l0Var.f43973a) && this.b.equals(z8l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43973a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(contentItems=" + this.f43973a + ", items=" + this.b + Separators.RPAREN;
    }
}
