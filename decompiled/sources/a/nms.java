package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nms {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23786a;
    public final List b;
    public final String c;
    public final String d;
    public final List e;
    public final String f;
    public final String g;
    public final Long h;
    public final String i;

    public nms(int i, List list, String str, String str2, List list2, String str3, String str4, Long l, String str5) {
        list.getClass();
        list2.getClass();
        this.f23786a = i;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = list2;
        this.f = str3;
        this.g = str4;
        this.h = l;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nms)) {
            return false;
        }
        nms nmsVar = (nms) obj;
        return this.f23786a == nmsVar.f23786a && Intrinsics.d(this.b, nmsVar.b) && this.c.equals(nmsVar.c) && this.d.equals(nmsVar.d) && Intrinsics.d(this.e, nmsVar.e) && this.f.equals(nmsVar.f) && this.g.equals(nmsVar.g) && Intrinsics.d(this.h, nmsVar.h) && this.i.equals(nmsVar.i);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(dw9.a(ua80.b(ua80.b(dw9.a(Integer.hashCode(this.f23786a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        Long l = this.h;
        return this.i.hashCode() + ((iB + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameModel(gameId=");
        sb.append(this.f23786a);
        sb.append(", teamOneIds=");
        sb.append(this.b);
        sb.append(", opponent1Name=");
        f140.v(sb, this.c, ", teamOneImage=", this.d, ", teamTwoIds=");
        h97.y(", opponent2Name=", this.f, ", teamTwoImage=", sb, this.e);
        h97.w(this.h, this.g, ", startTs=", ", ligaName=", sb);
        return axq.n(sb, this.i, Separators.RPAREN);
    }
}
