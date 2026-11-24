package a;

import android.gov.nist.core.Separators;
import org.xplatform.aggregator.api.model.tournaments.UserActionButtonModel;

/* JADX INFO: loaded from: classes3.dex */
public final class myr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22617a;
    public final z1s0 b;
    public final lyr0 c;
    public final kyr0 d;
    public final iyr0 e;
    public final hyr0 f;
    public final boolean g;
    public final boolean h;
    public final UserActionButtonModel i;
    public final lf9 j;
    public final UserActionButtonModel k;
    public final re9 l;

    public myr0(long j, z1s0 z1s0Var, lyr0 lyr0Var, kyr0 kyr0Var, iyr0 iyr0Var, hyr0 hyr0Var, boolean z, boolean z2, UserActionButtonModel userActionButtonModel, lf9 lf9Var, UserActionButtonModel userActionButtonModel2, re9 re9Var) {
        this.f22617a = j;
        this.b = z1s0Var;
        this.c = lyr0Var;
        this.d = kyr0Var;
        this.e = iyr0Var;
        this.f = hyr0Var;
        this.g = z;
        this.h = z2;
        this.i = userActionButtonModel;
        this.j = lf9Var;
        this.k = userActionButtonModel2;
        this.l = re9Var;
    }

    public static myr0 a(myr0 myr0Var, boolean z, boolean z2, UserActionButtonModel userActionButtonModel) {
        long j = myr0Var.f22617a;
        z1s0 z1s0Var = myr0Var.b;
        lyr0 lyr0Var = myr0Var.c;
        kyr0 kyr0Var = myr0Var.d;
        iyr0 iyr0Var = myr0Var.e;
        hyr0 hyr0Var = myr0Var.f;
        lf9 lf9Var = myr0Var.j;
        UserActionButtonModel userActionButtonModel2 = myr0Var.k;
        re9 re9Var = myr0Var.l;
        userActionButtonModel.getClass();
        return new myr0(j, z1s0Var, lyr0Var, kyr0Var, iyr0Var, hyr0Var, z, z2, userActionButtonModel, lf9Var, userActionButtonModel2, re9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof myr0)) {
            return false;
        }
        myr0 myr0Var = (myr0) obj;
        return this.f22617a == myr0Var.f22617a && this.b == myr0Var.b && this.c.equals(myr0Var.c) && this.d.equals(myr0Var.d) && this.e.equals(myr0Var.e) && this.f.equals(myr0Var.f) && this.g == myr0Var.g && this.h == myr0Var.h && this.i.equals(myr0Var.i) && this.j.equals(myr0Var.j) && this.k.equals(myr0Var.k) && this.l == myr0Var.l;
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + brm0.e(brm0.e((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f22617a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.g), 31, this.h)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentCardModel(id=");
        sb.append(this.f22617a);
        sb.append(", kind=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", chipStatus=");
        sb.append(this.d);
        sb.append(", blockImage=");
        sb.append(this.e);
        sb.append(", blockHeader=");
        sb.append(this.f);
        w6x.A(", meParticipating=", ", providerTournamentWithStages=", sb, this.g, this.h);
        sb.append(", userActionButton=");
        sb.append(this.i);
        sb.append(", buttons=");
        sb.append(this.j);
        sb.append(", moreButton=");
        sb.append(this.k);
        sb.append(", buttonStatus=");
        sb.append(this.l);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
