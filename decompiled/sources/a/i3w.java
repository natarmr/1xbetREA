package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i3w implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14117a;
    public final String b;
    public final String c;

    public i3w(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f14117a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3w)) {
            return false;
        }
        i3w i3wVar = (i3w) obj;
        return Intrinsics.d(this.f14117a, i3wVar.f14117a) && Intrinsics.d(this.b, i3wVar.b) && Intrinsics.d(this.c, i3wVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f14117a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("HistoryItemEventsTextUiModel(eventName=", this.f14117a, ", count=", this.b, ", description="), this.c, Separators.RPAREN);
    }
}
