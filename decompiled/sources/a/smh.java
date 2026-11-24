package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class smh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32446a;
    public final String b;
    public final omh c;
    public final String d;
    public final String e;
    public final rmh f;

    public smh(long j, String str, omh omhVar, String str2, String str3, rmh rmhVar) {
        str2.getClass();
        this.f32446a = j;
        this.b = str;
        this.c = omhVar;
        this.d = str2;
        this.e = str3;
        this.f = rmhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof smh)) {
            return false;
        }
        smh smhVar = (smh) obj;
        return this.f32446a == smhVar.f32446a && this.b.equals(smhVar.b) && this.c.equals(smhVar.c) && Intrinsics.d(this.d, smhVar.d) && this.e.equals(smhVar.e) && this.f.equals(smhVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b((this.c.hashCode() + ua80.b(Long.hashCode(this.f32446a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f32446a, "CyberTournamentCardCollectionItemUiModel(id=", ", imageBackgroundUrl=", this.b);
        sbO.append(", icon=");
        sbO.append(this.c);
        sbO.append(", tournamentTitle=");
        sbO.append(this.d);
        sbO.append(", tournamentDisciplineLabel=");
        sbO.append(this.e);
        sbO.append(", tag=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
