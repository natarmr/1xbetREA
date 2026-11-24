package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ysw implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43189a;
    public final String b;
    public final String c;
    public final String d;

    public ysw(String str, String str2, String str3, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f43189a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean a() {
        return this.f43189a.length() == 0 && this.b.length() == 0 && this.c.length() == 0 && this.d.length() == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysw)) {
            return false;
        }
        ysw yswVar = (ysw) obj;
        return Intrinsics.d(this.f43189a, yswVar.f43189a) && Intrinsics.d(this.b, yswVar.b) && Intrinsics.d(this.c, yswVar.c) && Intrinsics.d(this.d, yswVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f43189a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("HrefModel(link=", this.f43189a, ", deeplink=", this.b, ", title="), this.c, ", img=", this.d, Separators.RPAREN);
    }

    public /* synthetic */ ysw(String str, int i) {
        this("", "", "", (i & 8) != 0 ? "" : str);
    }
}
