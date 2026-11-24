package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class fhb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9532a;
    public final long b;
    public final String c;
    public final List d;
    public final long e;
    public final boolean f;
    public final long g;
    public final List h;
    public final boolean i;
    public final int j;
    public final String k;
    public final String l;
    public final String m;

    public fhb(int i, long j, String str, List list, long j2, boolean z, long j3, List list2, boolean z2, int i2, String str2, String str3, String str4) {
        list.getClass();
        list2.getClass();
        this.f9532a = i;
        this.b = j;
        this.c = str;
        this.d = list;
        this.e = j2;
        this.f = z;
        this.g = j3;
        this.h = list2;
        this.i = z2;
        this.j = i2;
        this.k = str2;
        this.l = str3;
        this.m = str4;
    }

    public static fhb a(fhb fhbVar, ArrayList arrayList) {
        int i = fhbVar.f9532a;
        long j = fhbVar.b;
        String str = fhbVar.c;
        List list = fhbVar.d;
        long j2 = fhbVar.e;
        boolean z = fhbVar.f;
        long j3 = fhbVar.g;
        boolean z2 = fhbVar.i;
        int i2 = fhbVar.j;
        String str2 = fhbVar.k;
        String str3 = fhbVar.l;
        String str4 = fhbVar.m;
        fhbVar.getClass();
        fhbVar.getClass();
        list.getClass();
        return new fhb(i, j, str, list, j2, z, j3, arrayList, z2, i2, str2, str3, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!fhb.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        fhb fhbVar = (fhb) obj;
        return this.e == fhbVar.e && this.g == fhbVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + (Long.hashCode(this.e) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f9532a, this.b, "ChampZip(idCountry=", ", count=");
        ua80.t(", name=", this.c, ", subChamps=", sbQ, this.d);
        kng0.A(sbQ, ", id=", this.e, ", top=");
        rw2.v(this.g, ", sportId=", sbQ, this.f);
        esw0.k(sbQ, ", games=", this.h, ", isNew=", this.i);
        w6x.w(this.j, ", ssi=", ", sportName=", this.k, sbQ);
        f140.v(sbQ, ", champImage=", this.l, ", countryImage=", this.m);
        sbQ.append(", live=true)");
        return sbQ.toString();
    }
}
