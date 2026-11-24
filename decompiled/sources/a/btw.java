package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class btw implements Serializable {
    public static final atw Companion = new atw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3203a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ btw(int i, String str, String str2, String str3, String str4) {
        if ((i & 1) == 0) {
            this.f3203a = "";
        } else {
            this.f3203a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof btw)) {
            return false;
        }
        btw btwVar = (btw) obj;
        return Intrinsics.d(this.f3203a, btwVar.f3203a) && Intrinsics.d(this.b, btwVar.b) && Intrinsics.d(this.c, btwVar.c) && Intrinsics.d(this.d, btwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f3203a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("HrefResponse(link=", this.f3203a, ", deeplink=", this.b, ", title="), this.c, ", img=", this.d, Separators.RPAREN);
    }

    public btw(String str, String str2, String str3, String str4) {
        brm0.B(str, str2, str3);
        this.f3203a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public /* synthetic */ btw() {
        this("", "", "", "");
    }
}
