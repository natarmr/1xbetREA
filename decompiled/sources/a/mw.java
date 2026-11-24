package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mw implements ow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f22480a;
    public final String b;
    public final long c;
    public final boolean d;
    public final String e;
    public final String f;
    public final boolean g;
    public final mtl h;
    public final c6q0 i;
    public final rqm j;

    public mw(imm immVar, String str, long j, boolean z, String str2, String str3, boolean z2, mtl mtlVar, c6q0 c6q0Var, rqm rqmVar) {
        immVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        mtlVar.getClass();
        c6q0Var.getClass();
        rqmVar.getClass();
        this.f22480a = immVar;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = z2;
        this.h = mtlVar;
        this.i = c6q0Var;
        this.j = rqmVar;
    }

    @Override // a.ow
    public final imm a() {
        return this.f22480a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw)) {
            return false;
        }
        mw mwVar = (mw) obj;
        return Intrinsics.d(this.f22480a, mwVar.f22480a) && Intrinsics.d(this.b, mwVar.b) && this.c == mwVar.c && this.d == mwVar.d && Intrinsics.d(this.e, mwVar.e) && Intrinsics.d(this.f, mwVar.f) && this.g == mwVar.g && Intrinsics.d(this.h, mwVar.h) && Intrinsics.d(this.i, mwVar.i) && Intrinsics.d(this.j, mwVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + cs0.b(this.h.f22376a, brm0.e(ua80.b(ua80.b(brm0.e(rw2.b(ua80.b(this.f22480a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(navigationBarUiModel=");
        sb.append(this.f22480a);
        sb.append(", currencySelectorTitle=");
        sb.append(this.b);
        sb.append(", currencyId=");
        hne.t(this.c, ", hasError=", sb, this.d);
        f140.v(sb, ", errorMessage=", this.e, ", walletName=", this.f);
        sb.append(", showAddWalletButton=");
        sb.append(this.g);
        sb.append(", bottomBarModel=");
        sb.append(this.h);
        sb.append(", textFieldUiModel=");
        sb.append(this.i);
        sb.append(", settingCellStyle=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
