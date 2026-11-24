package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ypf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43028a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;

    public ypf(long j, String str, String str2, int i, String str3, String str4, String str5, String str6, List list) {
        list.getClass();
        this.f43028a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypf)) {
            return false;
        }
        ypf ypfVar = (ypf) obj;
        return this.f43028a == ypfVar.f43028a && this.b.equals(ypfVar.b) && this.c.equals(ypfVar.c) && this.d == ypfVar.d && this.e.equals(ypfVar.e) && this.f.equals(ypfVar.f) && this.g.equals(ypfVar.g) && this.h.equals(ypfVar.h) && Intrinsics.d(this.i, ypfVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.d, ua80.b(ua80.b(Long.hashCode(this.f43028a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f43028a, "Cs2PlayerDuelModel(id=", ", nick=", this.b);
        axq.s(this.d, ", name=", this.c, ", age=", sbO);
        f140.v(sbO, ", country=", this.e, ", imageS3=", this.f);
        f140.v(sbO, ", teamImage=", this.g, ", teamName=", this.h);
        return ohs0.s(sbO, ", stats=", this.i, Separators.RPAREN);
    }
}
