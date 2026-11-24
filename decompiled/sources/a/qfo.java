package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class qfo {
    public static final pfo Companion = new pfo();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28645a;
    public final String b;

    public /* synthetic */ qfo(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f28645a = null;
        } else {
            this.f28645a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qfo)) {
            return false;
        }
        qfo qfoVar = (qfo) obj;
        return Intrinsics.d(this.f28645a, qfoVar.f28645a) && Intrinsics.d(this.b, qfoVar.b);
    }

    public final int hashCode() {
        Long l = this.f28645a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f28645a, "EventPlayerResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
