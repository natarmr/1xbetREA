package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class aos implements uqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f1216a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public final ohm0 f;
    public final boolean g;

    public aos(ank0 ank0Var, String str, String str2, ArrayList arrayList, ArrayList arrayList2, ohm0 ohm0Var, boolean z) {
        str2.getClass();
        this.f1216a = ank0Var;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = ohm0Var;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aos)) {
            return false;
        }
        aos aosVar = (aos) obj;
        return this.f1216a.equals(aosVar.f1216a) && this.b.equals(aosVar.b) && Intrinsics.d(this.c, aosVar.c) && this.d.equals(aosVar.d) && this.e.equals(aosVar.e) && this.f.equals(aosVar.f) && this.g == aosVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + twn.g(this.e, twn.g(this.d, ua80.b(ua80.b(this.f1216a.f1159a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamePenaltyUiModel(penaltyScore=");
        sb.append(this.f1216a);
        sb.append(", gameStatus=");
        sb.append(this.b);
        sb.append(", penaltyName=");
        sb.append(this.c);
        sb.append(", penaltyOneTeamUiModelList=");
        sb.append(this.d);
        sb.append(", penaltyTwoTeamUiModelList=");
        sb.append(this.e);
        sb.append(", teamsInfoUiModel=");
        sb.append(this.f);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
