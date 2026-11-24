package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qpw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29140a;
    public final String b;
    public final List c;
    public final lho d;
    public final String e;

    public qpw(long j, String str, List list, lho lhoVar, String str2) {
        str.getClass();
        list.getClass();
        this.f29140a = j;
        this.b = str;
        this.c = list;
        this.d = lhoVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qpw)) {
            return false;
        }
        qpw qpwVar = (qpw) obj;
        return this.f29140a == qpwVar.f29140a && Intrinsics.d(this.b, qpwVar.b) && Intrinsics.d(this.c, qpwVar.c) && this.d == qpwVar.d && this.e.equals(qpwVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + dw9.a(ua80.b(Long.hashCode(this.f29140a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f29140a, "HorsesModel(dateStart=", ", id=", this.b);
        sbO.append(", menu=");
        sbO.append(this.c);
        sbO.append(", status=");
        sbO.append(this.d);
        return rw2.o(sbO, ", title=", this.e, Separators.RPAREN);
    }
}
