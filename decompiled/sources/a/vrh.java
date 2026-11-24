package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vrh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37897a;
    public final String b;
    public final List c;
    public final List d;

    public vrh(List list, List list2, String str, String str2) {
        list.getClass();
        list2.getClass();
        this.f37897a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrh)) {
            return false;
        }
        vrh vrhVar = (vrh) obj;
        return this.f37897a.equals(vrhVar.f37897a) && this.b.equals(vrhVar.b) && Intrinsics.d(this.c, vrhVar.c) && Intrinsics.d(this.d, vrhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(ua80.b(ua80.b(Boolean.hashCode(false) * 31, 31, this.f37897a), 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kng0.n(", mapPool=", Separators.RPAREN, b1j.n("CyberValorantTeamCompositionModel(isEmpty=false, teamName=", this.f37897a, ", teamImage=", this.b, ", playersInfo="), this.c, this.d);
    }
}
