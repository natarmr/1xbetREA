package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jsw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdp0 f17073a;
    public final mdp0 b;
    public final String c;

    public jsw(mdp0 mdp0Var, mdp0 mdp0Var2, String str) {
        this.f17073a = mdp0Var;
        this.b = mdp0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsw)) {
            return false;
        }
        jsw jswVar = (jsw) obj;
        return this.f17073a.equals(jswVar.f17073a) && this.b.equals(jswVar.b) && Intrinsics.d(this.c, jswVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f17073a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostsVsGuestsInfoUiModel(teamOne=");
        sb.append(this.f17073a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", score=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
