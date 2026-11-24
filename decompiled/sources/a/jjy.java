package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jjy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16640a;
    public final ArrayList b;
    public final long c;
    public final ArrayList d;

    public jjy(List list, ArrayList arrayList, long j, ArrayList arrayList2) {
        list.getClass();
        this.f16640a = list;
        this.b = arrayList;
        this.c = j;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjy)) {
            return false;
        }
        jjy jjyVar = (jjy) obj;
        return Intrinsics.d(this.f16640a, jjyVar.f16640a) && this.b.equals(jjyVar.b) && this.c == jjyVar.c && this.d.equals(jjyVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(twn.g(this.b, this.f16640a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "KabaddiTopPlayersModel(teams=" + this.f16640a + ", players=" + this.b + ", sportId=" + this.c + ", teamsWithPlayers=" + this.d + Separators.RPAREN;
    }
}
