package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kdb extends odb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18097a;
    public final String b;
    public final long c;
    public final long d;
    public final String e;
    public final String f;
    public final List g;
    public final boolean h;

    public kdb(long j, String str, long j2, long j3, String str2, String str3, List list, boolean z) {
        str.getClass();
        str3.getClass();
        this.f18097a = j;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = str2;
        this.f = str3;
        this.g = list;
        this.h = z;
    }

    public static kdb c(kdb kdbVar, long j, long j2, String str, ArrayList arrayList, boolean z, int i) {
        long j3 = kdbVar.f18097a;
        String str2 = kdbVar.b;
        long j4 = (i & 4) != 0 ? kdbVar.c : j;
        long j5 = (i & 8) != 0 ? kdbVar.d : j2;
        String str3 = kdbVar.e;
        String str4 = (i & 32) != 0 ? kdbVar.f : str;
        boolean z2 = (i & 128) != 0 ? kdbVar.h : z;
        str2.getClass();
        str4.getClass();
        return new kdb(j3, str2, j4, j5, str3, str4, arrayList, z2);
    }

    @Override // a.odb
    public final long a() {
        return this.f18097a;
    }

    @Override // a.odb
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        kdb kdbVar = obj instanceof kdb ? (kdb) obj : null;
        return kdbVar != null && this.e.equals(kdbVar.e) && Intrinsics.d(this.b, kdbVar.b) && Intrinsics.d(this.f, kdbVar.f) && this.h == kdbVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ua80.b(ua80.b(this.e.hashCode() * 31, 31, this.b), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f18097a, "ChampGroupItem(id=", ", title=", this.b);
        kng0.A(sbO, ", sportId=", this.c, ", subSportId=");
        kng0.z(sbO, this.d, ", image=", this.e);
        ua80.t(", gamesCount=", this.f, ", champSubItems=", sbO, this.g);
        return f140.n(sbO, ", expanded=", this.h, Separators.RPAREN);
    }
}
