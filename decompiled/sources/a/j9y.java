package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class j9y extends q9y implements qhy, phy {
    public final a8z c;
    public final a8z d;
    public final k9y e;

    public j9y(k9y k9yVar) {
        wez wezVar = wez.f39042a;
        this.c = maz.a(wezVar, new r9y(this, (byte) 0));
        this.d = maz.a(wezVar, new r9y(this, (byte) 1));
        this.e = k9yVar;
    }

    @Override // a.ere0, a.dre0
    public final List a() {
        return CollectionsKt.r0(this.e.a(), this.c.getValue());
    }

    @Override // a.biy
    public final iiy c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j9y) {
            return Intrinsics.d(this.e, ((j9y) obj).e);
        }
        return false;
    }

    @Override // a.qgy
    public final String getName() {
        return "<set-" + this.e.getName() + '>';
    }

    @Override // a.qgy
    public final List getParameters() {
        return CollectionsKt.r0(this.e.getParameters(), this.c.getValue());
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return g4m0.e;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.e.set(obj);
        return Unit.f46060a;
    }

    @Override // a.q9y
    public final t9y p() {
        return this.e;
    }

    public final String toString() {
        return "setter of " + this.e;
    }

    @Override // a.dre0
    public final bv9 x() {
        return (bv9) this.d.getValue();
    }
}
