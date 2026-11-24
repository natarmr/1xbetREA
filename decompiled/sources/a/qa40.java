package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class qa40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28377a;
    public final String b;
    public final pa40 c;
    public final pa40 d;
    public final byte e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public qa40(long j, String str, pa40 pa40Var, pa40 pa40Var2, int i, boolean z) {
        this.f28377a = j;
        this.b = str;
        this.c = pa40Var;
        this.d = pa40Var2;
        this.e = i;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa40)) {
            return false;
        }
        qa40 qa40Var = (qa40) obj;
        return this.f28377a == qa40Var.f28377a && this.b.equals(qa40Var.b) && this.c.equals(qa40Var.c) && this.d.equals(qa40Var.d) && this.e == qa40Var.e && this.f == qa40Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.a(R.drawable.ic_sport_color_dota_97, twn.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ua80.b(Long.hashCode(this.f28377a) * 31, 31, this.b)) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f28377a, "MetaEventCardUiModel(eventId=", ", championshipName=", this.b);
        sbO.append(", firstOpponent=");
        sbO.append(this.c);
        sbO.append(", secondOpponent=");
        sbO.append(this.d);
        rw2.s(this.e, R.drawable.ic_sport_color_dota_97, ", totalCount=", ", sportImageRes=", sbO);
        return f140.n(sbO, ", supportRtl=", this.f, Separators.RPAREN);
    }
}
