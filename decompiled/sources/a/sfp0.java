package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class sfp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32128a;
    public final String b;
    public final ArrayList c;
    public final ArrayList d;

    public sfp0(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.f32128a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfp0)) {
            return false;
        }
        sfp0 sfp0Var = (sfp0) obj;
        return this.f32128a.equals(sfp0Var.f32128a) && this.b.equals(sfp0Var.b) && this.c.equals(sfp0Var.c) && this.d.equals(sfp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.g(this.c, ua80.b(this.f32128a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamModel(teamId=", this.f32128a, ", teamName=", this.b, ", lineUpTeams=");
        sbN.append(this.c);
        sbN.append(", substitutePlayers=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
