package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ezy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdp0 f8693a;
    public final mdp0 b;
    public final String c;
    public final String d;
    public final String e;
    public final gkv0 f;

    public ezy(mdp0 mdp0Var, mdp0 mdp0Var2, String str, String str2, String str3, gkv0 gkv0Var) {
        str.getClass();
        str2.getClass();
        this.f8693a = mdp0Var;
        this.b = mdp0Var2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = gkv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezy)) {
            return false;
        }
        ezy ezyVar = (ezy) obj;
        return this.f8693a.equals(ezyVar.f8693a) && this.b.equals(ezyVar.b) && Intrinsics.d(this.c, ezyVar.c) && Intrinsics.d(this.d, ezyVar.d) && this.e.equals(ezyVar.e) && this.f == ezyVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f8693a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastGameInfoUiModel(teamOne=");
        sb.append(this.f8693a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", date=");
        f140.v(sb, this.c, ", score=", this.d, ", statGameId=");
        sb.append(this.e);
        sb.append(", winningIndicator=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
