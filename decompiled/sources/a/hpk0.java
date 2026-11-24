package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hpk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13447a;
    public final String b;
    public final String c;
    public final String d;

    public hpk0(String str, int i, String str2, String str3) {
        str2.getClass();
        this.f13447a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpk0)) {
            return false;
        }
        hpk0 hpk0Var = (hpk0) obj;
        return this.f13447a == hpk0Var.f13447a && this.b.equals(hpk0Var.b) && Intrinsics.d(this.c, hpk0Var.c) && this.d.equals(hpk0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(Integer.hashCode(this.f13447a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(vqd.r(this.f13447a, "SpecialEventMainScreenInitParams(eventId=", ", screenName=", this.b, ", specialEventTitle="), this.c, ", screenTag=", this.d, Separators.RPAREN);
    }
}
