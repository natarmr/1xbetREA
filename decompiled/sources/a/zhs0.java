package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zhs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44408a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public zhs0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        str4.getClass();
        str5.getClass();
        this.f44408a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhs0)) {
            return false;
        }
        zhs0 zhs0Var = (zhs0) obj;
        return this.f44408a.equals(zhs0Var.f44408a) && this.b.equals(zhs0Var.b) && this.c.equals(zhs0Var.c) && Intrinsics.d(this.d, zhs0Var.d) && Intrinsics.d(this.e, zhs0Var.e) && this.f.equals(zhs0Var.f) && this.g.equals(zhs0Var.g) && this.h.equals(zhs0Var.h) && this.i.equals(zhs0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f44408a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TransferUiModel(playerImageUrl=", this.f44408a, ", playerCountryImageUrl=", this.b, ", playerName=");
        f140.v(sbN, this.c, ", transferDate=", this.d, ", transferType=");
        f140.v(sbN, this.e, ", teamFromName=", this.f, ", teamFromImageUrl=");
        f140.v(sbN, this.g, ", teamToName=", this.h, ", teamToImageUrl=");
        return axq.n(sbN, this.i, Separators.RPAREN);
    }
}
