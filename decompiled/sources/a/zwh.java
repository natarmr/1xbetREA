package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zwh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45105a;
    public final List b;

    public zwh(int i, List list) {
        list.getClass();
        this.f45105a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwh)) {
            return false;
        }
        zwh zwhVar = (zwh) obj;
        return this.f45105a == zwhVar.f45105a && Intrinsics.d(this.b, zwhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f45105a) * 31);
    }

    public final String toString() {
        return "CyclingResultsModel(sportId=" + this.f45105a + ", results=" + this.b + Separators.RPAREN;
    }
}
