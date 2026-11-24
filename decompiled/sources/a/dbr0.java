package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.special_event.impl.top_players.presentation.model.TopPlayersSearchModel;

/* JADX INFO: loaded from: classes5.dex */
public final class dbr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5819a;
    public final boolean b;
    public final long c;
    public final boolean d;
    public final TopPlayersSearchModel e;
    public final qar0 f;
    public final wcr0 g;
    public final boolean h;

    public dbr0(int i, boolean z, long j, boolean z2, TopPlayersSearchModel topPlayersSearchModel, qar0 qar0Var, wcr0 wcr0Var, boolean z3) {
        topPlayersSearchModel.getClass();
        this.f5819a = i;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.e = topPlayersSearchModel;
        this.f = qar0Var;
        this.g = wcr0Var;
        this.h = z3;
    }

    public static dbr0 a(dbr0 dbr0Var, boolean z, TopPlayersSearchModel topPlayersSearchModel, qar0 qar0Var, wcr0 wcr0Var, int i) {
        int i2 = dbr0Var.f5819a;
        dbr0Var.getClass();
        if ((i & 4) != 0) {
            z = dbr0Var.b;
        }
        boolean z2 = z;
        long j = dbr0Var.c;
        boolean z3 = (i & 16) != 0 ? dbr0Var.d : false;
        if ((i & 32) != 0) {
            topPlayersSearchModel = dbr0Var.e;
        }
        TopPlayersSearchModel topPlayersSearchModel2 = topPlayersSearchModel;
        if ((i & 64) != 0) {
            qar0Var = dbr0Var.f;
        }
        qar0 qar0Var2 = qar0Var;
        if ((i & 128) != 0) {
            wcr0Var = dbr0Var.g;
        }
        boolean z4 = dbr0Var.h;
        dbr0Var.getClass();
        topPlayersSearchModel2.getClass();
        return new dbr0(i2, z2, j, z3, topPlayersSearchModel2, qar0Var2, wcr0Var, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbr0)) {
            return false;
        }
        dbr0 dbr0Var = (dbr0) obj;
        return this.f5819a == dbr0Var.f5819a && this.b == dbr0Var.b && this.c == dbr0Var.c && this.d == dbr0Var.d && Intrinsics.d(this.e, dbr0Var.e) && this.f.equals(dbr0Var.f) && this.g.equals(dbr0Var.g) && this.h == dbr0Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + brm0.e(rw2.b(brm0.e(brm0.e(Integer.hashCode(this.f5819a) * 31, 31, true), 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f5819a, "TopPlayersState(eventId=", ", isNetworkAvailable=true, isLoading=", ", sportId=", this.b);
        hne.t(this.c, ", isFirstTabClick=", sbL, this.d);
        sbL.append(", searchModel=");
        sbL.append(this.e);
        sbL.append(", lottieModel=");
        sbL.append(this.f);
        sbL.append(", tabsModel=");
        sbL.append(this.g);
        sbL.append(", supportRtl=");
        sbL.append(this.h);
        sbL.append(Separators.RPAREN);
        return sbL.toString();
    }
}
