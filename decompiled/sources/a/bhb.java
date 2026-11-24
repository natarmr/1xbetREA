package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bhb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2596a;
    public final String b;
    public final String c;
    public final List d;

    public bhb(int i, String str, String str2, List list) {
        list.getClass();
        this.f2596a = i;
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public static bhb a(bhb bhbVar, ArrayList arrayList) {
        return new bhb(bhbVar.f2596a, bhbVar.b, bhbVar.c, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhb)) {
            return false;
        }
        bhb bhbVar = (bhb) obj;
        return this.f2596a == bhbVar.f2596a && this.b.equals(bhbVar.b) && this.c.equals(bhbVar.c) && Intrinsics.d(this.d, bhbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(Integer.hashCode(this.f2596a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return rw2.m(this.c, ", gameList=", Separators.RPAREN, vqd.r(this.f2596a, "ChampWithGamesModel(id=", ", name=", this.b, ", countryImage="), this.d);
    }
}
