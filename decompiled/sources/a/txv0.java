package a;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class txv0 implements pf80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34723a;
    public final ob50 b;
    public final List c;
    public final List d;
    public final mwv0 e;
    public final nwv0 f;
    public final Function0 g;
    public final List h;
    public final ugd i;

    public txv0(Object obj, ob50 ob50Var, List list, List list2, mwv0 mwv0Var, nwv0 nwv0Var, Function0 function0) {
        obj.getClass();
        list.getClass();
        list2.getClass();
        function0.getClass();
        this.f34723a = obj;
        this.b = ob50Var;
        this.c = list;
        this.d = list2;
        this.e = mwv0Var;
        this.f = nwv0Var;
        this.g = function0;
        mwv0Var.d = function0;
        this.h = kotlin.collections.a.c(ob50Var);
        this.i = new ugd(322817142, true, new sxv0(this, (byte) 0));
    }

    @Override // a.y1h0
    public final List a() {
        return this.c;
    }

    @Override // a.pf80
    public final List b() {
        return this.d;
    }

    @Override // a.pf80
    public final Unit c() {
        mwv0 mwv0Var = this.e;
        try {
            ywv0 ywv0Var = (ywv0) ((hgk0) mwv0Var.f22524a).getValue();
            if (ywv0Var != null) {
                ywv0Var.j.c();
                buv0 buv0Var = ywv0Var.h;
                cuv0 cuv0Var = buv0Var.k;
                cuv0Var.getClass();
                buv0Var.a(cuv0Var, 0.0f, true);
                glt0 glt0Var = ywv0Var.d;
                ((hgk0) ((pz40) glt0Var.d)).setValue(jxv0.f17330a);
            }
            Object obj = this.b.b;
            obj.getClass();
            nwv0 nwv0Var = this.f;
            mwv0 mwv0Var2 = (mwv0) nwv0Var.f24254a.remove(obj);
            if (mwv0Var2 != null) {
                nwv0Var.b.remove(mwv0Var2);
            }
            return Unit.f46060a;
        } catch (CancellationException e) {
            mwv0Var.b.g(Unit.f46060a);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txv0)) {
            return false;
        }
        txv0 txv0Var = (txv0) obj;
        return Intrinsics.d(this.f34723a, txv0Var.f34723a) && Intrinsics.d(this.c, txv0Var.c) && Intrinsics.d(this.d, txv0Var.d) && Intrinsics.d(this.b.b, txv0Var.b.b);
    }

    @Override // a.y1h0
    public final ugd getContent() {
        return this.i;
    }

    @Override // a.y1h0
    public final List getEntries() {
        return this.h;
    }

    @Override // a.y1h0
    public final Object getKey() {
        return this.f34723a;
    }

    public final int hashCode() {
        return this.b.b.hashCode() + dw9.a(dw9.a(this.f34723a.hashCode() * 31, 31, this.c), 31, this.d);
    }
}
