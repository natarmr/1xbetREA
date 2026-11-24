package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p760 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26493a;
    public final String b;
    public final boolean c;

    public p760(String str, String str2, boolean z) {
        str2.getClass();
        this.f26493a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p760)) {
            return false;
        }
        p760 p760Var = (p760) obj;
        return this.f26493a.equals(p760Var.f26493a) && Intrinsics.d(this.b, p760Var.b) && this.c == p760Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f26493a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("NotificationParamsModel(soundPath=", this.f26493a, ", channelId=", this.b, ", indicatorEnabled="), this.c, Separators.RPAREN);
    }
}
