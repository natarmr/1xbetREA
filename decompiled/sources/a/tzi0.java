package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class tzi0 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34806a;
    public final boolean b;

    public tzi0(String str, boolean z) {
        this.f34806a = str;
        this.b = z;
    }

    @Override // a.hej0
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof tzi0) && (p6t0Var2 instanceof tzi0)) {
            tzi0 tzi0Var = (tzi0) p6t0Var;
            tzi0 tzi0Var2 = (tzi0) p6t0Var2;
            k9x.G(arrayList, new qzi0(tzi0Var.b), new qzi0(tzi0Var2.b));
            k9x.G(arrayList, new rzi0(tzi0Var.f34806a), new rzi0(tzi0Var2.f34806a));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tzi0)) {
            return false;
        }
        tzi0 tzi0Var = (tzi0) obj;
        return this.f34806a.equals(tzi0Var.f34806a) && this.b == tzi0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f34806a.hashCode() * 31);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return b1j.k("SettingsAppVersionUiModel(subTitle=", kng0.l("SubTitle(value=", this.f34806a, Separators.RPAREN), ", needUpdate=", defpackage.c.d("NeedUpdate(value=", Separators.RPAREN, this.b), Separators.RPAREN);
    }
}
