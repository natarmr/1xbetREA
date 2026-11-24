package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class swr implements uwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32936a;
    public final ArrayList b;
    public final String c;

    public swr(String str, String str2, ArrayList arrayList) {
        str.getClass();
        this.f32936a = str;
        this.b = arrayList;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swr)) {
            return false;
        }
        swr swrVar = (swr) obj;
        return Intrinsics.d(this.f32936a, swrVar.f32936a) && this.b.equals(swrVar.b) && this.c.equals(swrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.g(this.b, this.f32936a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SecondTeam(playerName=");
        sb.append(this.f32936a);
        sb.append(", playerDice=");
        sb.append(this.b);
        sb.append(", teamCombination=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
