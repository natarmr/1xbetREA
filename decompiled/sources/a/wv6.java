package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wv6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39826a;
    public final String b;
    public final ArrayList c;

    public wv6(long j, String str, ArrayList arrayList) {
        str.getClass();
        this.f39826a = j;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv6)) {
            return false;
        }
        wv6 wv6Var = (wv6) obj;
        return this.f39826a == wv6Var.f39826a && Intrinsics.d(this.b, wv6Var.b) && this.c.equals(wv6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f39826a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f39826a, "BetEventsGroup(groupId=", ", groupName=", this.b);
        sbO.append(", betEvents=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
