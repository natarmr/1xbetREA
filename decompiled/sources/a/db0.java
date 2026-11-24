package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class db0 implements fb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5777a;
    public final k7k b;
    public final String c;

    public db0(String str, k7k k7kVar, String str2) {
        str.getClass();
        this.f5777a = str;
        this.b = k7kVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db0)) {
            return false;
        }
        db0 db0Var = (db0) obj;
        return Intrinsics.d(this.f5777a, db0Var.f5777a) && this.b == db0Var.b && this.c.equals(db0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f5777a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnTopUpBalanceClick(screenName=");
        sb.append(this.f5777a);
        sb.append(", depositCallScreenType=");
        sb.append(this.b);
        sb.append(", deviceId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
