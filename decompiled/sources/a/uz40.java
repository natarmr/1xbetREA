package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uz40 extends p4 {
    public final pz40 c;
    public final pz40 d;

    public uz40(Object obj) {
        super((byte) 12);
        this.c = androidx.compose.runtime.e.e(obj);
        this.d = androidx.compose.runtime.e.e(obj);
    }

    @Override // a.p4
    public final Object A0() {
        return ((hgk0) this.d).getValue();
    }

    @Override // a.p4
    public final void I0(Object obj) {
        ((hgk0) this.c).setValue(obj);
    }

    public final boolean n1() {
        return Intrinsics.d(((hgk0) this.c).getValue(), ((hgk0) this.d).getValue()) && !((Boolean) ((hgk0) ((pz40) this.b)).getValue()).booleanValue();
    }

    public final void o1(Object obj) {
        ((hgk0) this.d).setValue(obj);
    }

    @Override // a.p4
    public final Object y0() {
        return ((hgk0) this.c).getValue();
    }
}
