package a;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hsy extends esy implements phy {
    public final a8z c;
    public final a8z d;

    public hsy() {
        wez wezVar = wez.f39042a;
        this.c = maz.a(wezVar, new gsy(this, (byte) 0));
        this.d = maz.a(wezVar, new gsy(this, (byte) 1));
    }

    @Override // a.ere0, a.dre0
    public final List a() {
        return CollectionsKt.r0(u().a(), this.c.getValue());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hsy) && Intrinsics.d(u(), ((hsy) obj).u());
    }

    @Override // a.qgy
    public final String getName() {
        return axq.m(new StringBuilder("<set-"), u().f.b, '>');
    }

    @Override // a.qgy
    public final List getParameters() {
        return CollectionsKt.r0(u().getParameters(), this.c.getValue());
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return g4m0.e;
    }

    public final int hashCode() {
        return u().hashCode();
    }

    public final String toString() {
        return "setter of " + u();
    }

    @Override // a.dre0
    public final bv9 x() {
        return (bv9) this.d.getValue();
    }
}
