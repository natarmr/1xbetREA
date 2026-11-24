package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gio {
    public static final gio d = new gio("", "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11358a;
    public final String b;
    public final String c;

    public gio(String str, String str2, String str3) {
        str3.getClass();
        this.f11358a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gio)) {
            return false;
        }
        gio gioVar = (gio) obj;
        return this.f11358a.equals(gioVar.f11358a) && this.b.equals(gioVar.b) && Intrinsics.d(this.c, gioVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f11358a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("EventsNamesModel(firstOpponentWinName=", this.f11358a, ", drawName=", this.b, ", secondOpponentWinName="), this.c, Separators.RPAREN);
    }
}
