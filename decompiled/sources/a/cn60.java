package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cn60 implements dn60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbv f4639a;
    public final String b;

    public cn60(pbv pbvVar, String str) {
        str.getClass();
        this.f4639a = pbvVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn60)) {
            return false;
        }
        cn60 cn60Var = (cn60) obj;
        return this.f4639a.equals(cn60Var.f4639a) && Intrinsics.d(this.b, cn60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4639a.hashCode() * 31);
    }

    public final String toString() {
        return "OnOpenDeeplinkGame(game=" + this.f4639a + ", webGameSessionId=" + this.b + Separators.RPAREN;
    }
}
