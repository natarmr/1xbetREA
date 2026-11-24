package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class ssv implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32745a;

    public ssv(String str) {
        this.f32745a = str;
    }

    @Override // a.hej0
    public final void d(ArrayList arrayList, p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssv) && this.f32745a.equals(((ssv) obj).f32745a);
    }

    public final int hashCode() {
        return this.f32745a.hashCode();
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return kng0.l("HeaderUiModel(title=", this.f32745a, Separators.RPAREN);
    }
}
