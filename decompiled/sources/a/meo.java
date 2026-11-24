package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class meo implements aeo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21656a;
    public final String b;
    public final String c;
    public final String d;

    public meo(String str, String str2, String str3, String str4) {
        str2.getClass();
        this.f21656a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // a.aeo
    public final String a() {
        return this.f21656a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meo)) {
            return false;
        }
        meo meoVar = (meo) obj;
        return this.f21656a.equals(meoVar.f21656a) && Intrinsics.d(this.b, meoVar.b) && this.c.equals(meoVar.c) && this.d.equals(meoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f21656a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("EventMarketInfoUiModel(eventKey=", this.f21656a, ", market=", this.b, ", submarket="), this.c, ", coefficient=", this.d, Separators.RPAREN);
    }
}
