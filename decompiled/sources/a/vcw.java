package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vcw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37207a;
    public final String b;
    public final List c;

    public vcw(long j, String str, List list) {
        list.getClass();
        this.f37207a = j;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcw)) {
            return false;
        }
        vcw vcwVar = (vcw) obj;
        return this.f37207a == vcwVar.f37207a && this.b.equals(vcwVar.b) && Intrinsics.d(this.c, vcwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f37207a) * 31, 31, this.b);
    }

    public final String toString() {
        return ohs0.s(axq.o(this.f37207a, "HltvAwardsCategoriesModel(id=", ", title=", this.b), ", nominations=", this.c, Separators.RPAREN);
    }
}
