package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class nuk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24152a;
    public final String b;
    public final jkm c;

    public nuk(List list, String str, jkm jkmVar) {
        list.getClass();
        this.f24152a = list;
        this.b = str;
        this.c = jkmVar;
    }

    public static nuk a(nuk nukVar, List list, String str, int i) {
        if ((i & 1) != 0) {
            list = nukVar.f24152a;
        }
        if ((i & 2) != 0) {
            str = nukVar.b;
        }
        jkm jkmVar = nukVar.c;
        nukVar.getClass();
        list.getClass();
        return new nuk(list, str, jkmVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nuk)) {
            return false;
        }
        nuk nukVar = (nuk) obj;
        return Intrinsics.d(this.f24152a, nukVar.f24152a) && this.b.equals(nukVar.b) && this.c.equals(nukVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f24152a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("DisciplinesContentStateModel(disciplines=", ", searchQuery=", this.b, this.f24152a, ", lottieConfig=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
