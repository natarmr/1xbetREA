package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fsy extends esy implements ciy {
    public final a8z c = maz.a(wez.f39042a, new aaw(this, 22));

    @Override // a.ere0, a.dre0
    public final List a() {
        return u().a();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fsy) && Intrinsics.d(u(), ((fsy) obj).u());
    }

    @Override // a.qgy
    public final String getName() {
        return axq.m(new StringBuilder("<get-"), u().f.b, '>');
    }

    @Override // a.qgy
    public final List getParameters() {
        return u().getParameters();
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return u().getReturnType();
    }

    public final int hashCode() {
        return u().hashCode();
    }

    @Override // a.esy
    public final eqy p() {
        return u().f.c;
    }

    public final String toString() {
        return "getter of " + u();
    }

    @Override // a.dre0
    public final bv9 x() {
        return (bv9) this.c.getValue();
    }
}
