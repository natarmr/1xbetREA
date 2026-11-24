package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uvr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vvr0 f36362a;
    public final plr0 b;
    public final boolean c;
    public final int d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;

    public uvr0(vvr0 vvr0Var, plr0 plr0Var, boolean z, int i, long j, String str, String str2, String str3) {
        this.f36362a = vvr0Var;
        this.b = plr0Var;
        this.c = z;
        this.d = i;
        this.e = j;
        this.f = str;
        this.g = str2;
        this.h = str3;
    }

    public static uvr0 a(uvr0 uvr0Var, vvr0 vvr0Var, plr0 plr0Var, boolean z, int i, long j, String str, String str2, String str3, int i2) {
        if ((i2 & 1) != 0) {
            vvr0Var = uvr0Var.f36362a;
        }
        vvr0 vvr0Var2 = vvr0Var;
        if ((i2 & 2) != 0) {
            plr0Var = uvr0Var.b;
        }
        plr0 plr0Var2 = plr0Var;
        if ((i2 & 4) != 0) {
            z = uvr0Var.c;
        }
        boolean z2 = z;
        uvr0Var.getClass();
        if ((i2 & 16) != 0) {
            i = uvr0Var.d;
        }
        int i3 = i;
        long j2 = (i2 & 32) != 0 ? uvr0Var.e : j;
        String str4 = (i2 & 64) != 0 ? uvr0Var.f : str;
        String str5 = (i2 & 128) != 0 ? uvr0Var.g : str2;
        String str6 = (i2 & 256) != 0 ? uvr0Var.h : str3;
        uvr0Var.getClass();
        return new uvr0(vvr0Var2, plr0Var2, z2, i3, j2, str4, str5, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvr0)) {
            return false;
        }
        uvr0 uvr0Var = (uvr0) obj;
        return this.f36362a.equals(uvr0Var.f36362a) && this.b.equals(uvr0Var.b) && this.c == uvr0Var.c && this.d == uvr0Var.d && this.e == uvr0Var.e && this.f.equals(uvr0Var.f) && this.g.equals(uvr0Var.g) && this.h.equals(uvr0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(rw2.b(twn.a(this.d, twn.a(0, brm0.e((this.b.hashCode() + (this.f36362a.hashCode() * 31)) * 31, 31, this.c), 31), 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoTirageState(topBarState=");
        sb.append(this.f36362a);
        sb.append(", totoBetTirageListState=");
        sb.append(this.b);
        sb.append(", isScrollToTopRequested=");
        ua80.q(this.d, ", currentTotoTypeId=0, initialTotoTypeId=", ", retryCountDownTimerValue=", sb, this.c);
        kng0.z(sb, this.e, ", fileForLoadUrl=", this.f);
        f140.v(sb, ", fileForLoadName=", this.g, ", fileForLoadSizeText=", this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
