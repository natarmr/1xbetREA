package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ofj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f25173a;
    public final boolean b;
    public final boolean c;

    public ofj(Date date, boolean z, boolean z2) {
        date.getClass();
        this.f25173a = date;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofj)) {
            return false;
        }
        ofj ofjVar = (ofj) obj;
        return Intrinsics.d(this.f25173a, ofjVar.f25173a) && this.b == ofjVar.b && this.c == ofjVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f25173a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DateWithLiveStatusModel(date=");
        sb.append(this.f25173a);
        sb.append(", liveEvent=");
        sb.append(this.b);
        sb.append(", lineEvent=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
