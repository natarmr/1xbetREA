package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.ChoosenDate;

/* JADX INFO: loaded from: classes4.dex */
public final class h4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12433a;
    public final long b;
    public final ChoosenDate c;
    public final String d;

    public h4i0(long j, long j2, ChoosenDate choosenDate, String str) {
        yg40 yg40Var = yg40.ONE;
        choosenDate.getClass();
        str.getClass();
        this.f12433a = j;
        this.b = j2;
        this.c = choosenDate;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4i0)) {
            return false;
        }
        h4i0 h4i0Var = (h4i0) obj;
        yg40 yg40Var = yg40.ONE;
        return this.f12433a == h4i0Var.f12433a && this.b == h4i0Var.b && Intrinsics.d(this.c, h4i0Var.c) && Intrinsics.d(this.d, h4i0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + rw2.b(rw2.b(yg40.FIVE.hashCode() * 31, 31, this.f12433a), 31, this.b)) * 31);
    }

    public final String toString() {
        yg40 yg40Var = yg40.FIVE;
        StringBuilder sb = new StringBuilder("SelectTimeRangeViewModelState(step=");
        sb.append(yg40Var);
        sb.append(", minTimeMs=");
        sb.append(this.f12433a);
        kng0.A(sb, ", maxTimeMs=", this.b, ", chosenDate=");
        sb.append(this.c);
        sb.append(", requestKey=");
        sb.append(this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
