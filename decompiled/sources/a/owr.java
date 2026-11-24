package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class owr implements uwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25978a;
    public final ArrayList b;
    public final String c;

    public owr(String str, String str2, ArrayList arrayList) {
        str.getClass();
        this.f25978a = str;
        this.b = arrayList;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owr)) {
            return false;
        }
        owr owrVar = (owr) obj;
        return Intrinsics.d(this.f25978a, owrVar.f25978a) && this.b.equals(owrVar.b) && this.c.equals(owrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.g(this.b, this.f25978a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirstTeam(playerName=");
        sb.append(this.f25978a);
        sb.append(", playerDice=");
        sb.append(this.b);
        sb.append(", teamCombination=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
