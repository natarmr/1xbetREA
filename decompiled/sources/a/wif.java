package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wif {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjf f39211a;
    public final sjf b;
    public final List c;
    public final List d;
    public final hjf e;
    public final hjf f;

    public wif(sjf sjfVar, sjf sjfVar2, List list, List list2, hjf hjfVar, hjf hjfVar2) {
        list.getClass();
        list2.getClass();
        this.f39211a = sjfVar;
        this.b = sjfVar2;
        this.c = list;
        this.d = list2;
        this.e = hjfVar;
        this.f = hjfVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wif)) {
            return false;
        }
        wif wifVar = (wif) obj;
        return this.f39211a.equals(wifVar.f39211a) && this.b.equals(wifVar.b) && Intrinsics.d(this.c, wifVar.c) && Intrinsics.d(this.d, wifVar.d) && this.e.equals(wifVar.e) && this.f.equals(wifVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + dw9.a(dw9.a((this.b.hashCode() + (this.f39211a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2CompositionModel(firstTeam=");
        sb.append(this.f39211a);
        sb.append(", secondTeam=");
        sb.append(this.b);
        sb.append(", firstTeamPlayers=");
        b1j.y(", secondTeamPlayers=", ", firstTeamStatistics=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", secondTeamStatistics=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
