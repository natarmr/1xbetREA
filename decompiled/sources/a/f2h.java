package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8812a;
    public final long b;
    public final String c;
    public final String d;

    public f2h(long j, String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f8812a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2h)) {
            return false;
        }
        f2h f2hVar = (f2h) obj;
        return this.f8812a.equals(f2hVar.f8812a) && this.b == f2hVar.b && Intrinsics.d(this.c, f2hVar.c) && Intrinsics.d(this.d, f2hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(rw2.b(this.f8812a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "CyberLastMatchesTeamModel(id=", this.f8812a, ", translationId=");
        f140.v(sbO, ", title=", this.c, ", image=", this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
