package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b8y implements e8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2181a;
    public final String b;
    public final String c;
    public final ArrayList d;

    public b8y(String str, String str2, String str3, ArrayList arrayList) {
        this.f2181a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8y)) {
            return false;
        }
        b8y b8yVar = (b8y) obj;
        return this.f2181a.equals(b8yVar.f2181a) && this.b.equals(b8yVar.b) && this.c.equals(b8yVar.c) && this.d.equals(b8yVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f2181a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(backUrl=", this.f2181a, ", frontUrl=", this.b, ", pictureUrl=");
        sbN.append(this.c);
        sbN.append(", periods=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
