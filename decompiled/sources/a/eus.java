package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class eus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8438a;
    public final String b;
    public final List c;
    public final int d;

    public eus(int i, long j, String str, List list) {
        str.getClass();
        list.getClass();
        this.f8438a = j;
        this.b = str;
        this.c = list;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eus)) {
            return false;
        }
        eus eusVar = (eus) obj;
        return this.f8438a == eusVar.f8438a && Intrinsics.d(this.b, eusVar.b) && Intrinsics.d(this.c, eusVar.c) && this.d == eusVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + dw9.a(ua80.b(Long.hashCode(this.f8438a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f8438a, "GameTeam(id=", ", name=", this.b);
        sbO.append(", imageNew=");
        sbO.append(this.c);
        sbO.append(", redCarsCount=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
