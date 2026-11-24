package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qud0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29341a;
    public final a4x b;

    public qud0(i4 i4Var, String str) {
        i4Var.getClass();
        this.f29341a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qud0)) {
            return false;
        }
        qud0 qud0Var = (qud0) obj;
        return this.f29341a.equals(qud0Var.f29341a) && Intrinsics.d(this.b, qud0Var.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f29341a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29341a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("RainbowBansUiModel(key=", this.f29341a, ", bans=", this.b, Separators.RPAREN);
    }
}
