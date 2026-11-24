package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class s9y extends q9y implements diy, ciy {
    public final a8z c = maz.a(wez.f39042a, new aaw(this, (byte) 11));
    public final t9y d;

    public s9y(t9y t9yVar) {
        this.d = t9yVar;
    }

    @Override // a.ere0, a.dre0
    public final List a() {
        return this.d.a();
    }

    @Override // a.biy
    public final iiy c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s9y) {
            return Intrinsics.d(this.d, ((s9y) obj).d);
        }
        return false;
    }

    @Override // a.qgy
    public final String getName() {
        return "<get-" + this.d.getName() + '>';
    }

    @Override // a.qgy
    public final List getParameters() {
        return this.d.getParameters();
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return this.d.getReturnType();
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.d.get();
    }

    @Override // a.q9y
    public final t9y p() {
        return this.d;
    }

    public final String toString() {
        return "getter of " + this.d;
    }

    @Override // a.dre0
    public final bv9 x() {
        return (bv9) this.c.getValue();
    }
}
