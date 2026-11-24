package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9334a;
    public final String b;
    public final String c;
    public final String d;

    public fd(String str, String str2, String str3, String str4) {
        str2.getClass();
        this.f9334a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj;
        return this.f9334a.equals(fdVar.f9334a) && Intrinsics.d(this.b, fdVar.b) && this.c.equals(fdVar.c) && this.d.equals(fdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f9334a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ua80.m(b1j.n("AccountCellUiModel(iconUrl=", this.f9334a, ", title=", this.b, ", subtitle="), this.c, ", amount=", this.d, Separators.RPAREN);
    }
}
