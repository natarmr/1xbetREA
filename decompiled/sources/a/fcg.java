package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fcg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9311a;
    public final String b;

    public fcg(List list, String str) {
        list.getClass();
        str.getClass();
        this.f9311a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcg)) {
            return false;
        }
        fcg fcgVar = (fcg) obj;
        return Intrinsics.d(this.f9311a, fcgVar.f9311a) && Intrinsics.d(this.b, fcgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9311a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberChampEventModel(games=" + this.f9311a + ", champImage=" + this.b + Separators.RPAREN;
    }
}
