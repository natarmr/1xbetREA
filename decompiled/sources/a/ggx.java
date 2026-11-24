package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ggx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11272a;
    public final long b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;

    public ggx(long j, long j2, String str, String str2, String str3, ArrayList arrayList) {
        this.f11272a = arrayList;
        this.b = j;
        this.c = str;
        this.d = j2;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggx)) {
            return false;
        }
        ggx ggxVar = (ggx) obj;
        return this.f11272a.equals(ggxVar.f11272a) && this.b == ggxVar.b && this.c.equals(ggxVar.c) && this.d == ggxVar.d && this.e.equals(ggxVar.e) && this.f.equals(ggxVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(rw2.b(ua80.b(rw2.b(this.f11272a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsightMarketGroupModel(eventsBets=");
        sb.append(this.f11272a);
        sb.append(", marketGroupId=");
        sb.append(this.b);
        hne.B(sb, ", marketGroupName=", this.c, ", subGameId=");
        kng0.z(sb, this.d, ", subGameName=", this.e);
        return rw2.o(sb, ", marketGroupDescription=", this.f, Separators.RPAREN);
    }
}
