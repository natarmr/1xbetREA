package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f5w implements j5w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8982a;
    public final String b;
    public final int c;

    public f5w(int i, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f8982a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5w)) {
            return false;
        }
        f5w f5wVar = (f5w) obj;
        return Intrinsics.d(this.f8982a, f5wVar.f8982a) && Intrinsics.d(this.b, f5wVar.b) && this.c == f5wVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f8982a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("ShowBetNotificationSnackbarAlt(title=", this.f8982a, ", subtitle=", this.b, ", icon="));
    }
}
