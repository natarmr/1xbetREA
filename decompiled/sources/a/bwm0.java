package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bwm0 implements dwm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3333a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public bwm0(String str, String str2, String str3, String str4, String str5, List list) {
        str.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        this.f3333a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    @Override // a.dwm0
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwm0)) {
            return false;
        }
        bwm0 bwm0Var = (bwm0) obj;
        return Intrinsics.d(this.f3333a, bwm0Var.f3333a) && Intrinsics.d(this.b, bwm0Var.b) && Intrinsics.d(this.c, bwm0Var.c) && Intrinsics.d(this.d, bwm0Var.d) && Intrinsics.d(this.e, bwm0Var.e) && Intrinsics.d(this.f, bwm0Var.f);
    }

    @Override // a.dwm0
    public final String h() {
        return this.f3333a;
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(dw9.a(this.f3333a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("Cricket(fullScoreStr=", this.f3333a, ", periodScoreList=", this.b, ", teamOneScoreWithWickets=");
        f140.v(sbF, this.c, ", teamTwoScoreWithWickets=", this.d, ", teamOneOvers=");
        return ua80.m(sbF, this.e, ", teamTwoOvers=", this.f, Separators.RPAREN);
    }
}
