package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cn5 implements on5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4637a;

    public cn5(String str) {
        str.getClass();
        this.f4637a = str;
    }

    @Override // a.on5
    public final String a() {
        return this.f4637a;
    }

    @Override // a.on5
    public final String b() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cn5) && Intrinsics.d(this.f4637a, ((cn5) obj).f4637a);
    }

    public final int hashCode() {
        return this.f4637a.hashCode();
    }

    public final String toString() {
        return kng0.l("BalanceLoading(balanceName=, topUpTitle=", this.f4637a, Separators.RPAREN);
    }
}
