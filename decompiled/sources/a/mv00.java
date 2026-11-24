package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class mv00 implements hej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22436a;

    public mv00(boolean z) {
        this.f22436a = z;
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
        return (obj instanceof mv00) && this.f22436a == ((mv00) obj).f22436a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22436a);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return defpackage.c.d("LogOutUiModel(lastElement=", Separators.RPAREN, this.f22436a);
    }
}
