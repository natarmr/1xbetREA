package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class aip implements dip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f935a;
    public final List b;

    public aip(Throwable th, List list) {
        this.f935a = th;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aip)) {
            return false;
        }
        aip aipVar = (aip) obj;
        return this.f935a.equals(aipVar.f935a) && Intrinsics.d(this.b, aipVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f935a.hashCode() * 31;
        List list = this.b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "InWaitingSuccess(error=" + this.f935a + ", cachedData=" + this.b + Separators.RPAREN;
    }
}
