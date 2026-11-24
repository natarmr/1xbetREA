package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jzo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0t f17426a;
    public final ArrayList b;

    public jzo0(d0t d0tVar, ArrayList arrayList) {
        this.f17426a = d0tVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzo0)) {
            return false;
        }
        jzo0 jzo0Var = (jzo0) obj;
        return Intrinsics.d(this.f17426a, jzo0Var.f17426a) && this.b.equals(jzo0Var.b);
    }

    public final int hashCode() {
        d0t d0tVar = this.f17426a;
        return this.b.hashCode() + ((d0tVar == null ? 0 : d0tVar.hashCode()) * 31);
    }

    public final String toString() {
        return "TeamBetEventsModel(nearestEvent=" + this.f17426a + ", upcomingEvents=" + this.b + Separators.RPAREN;
    }
}
