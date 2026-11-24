package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qry extends sry {
    public final upy j;
    public final a8z k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qry(ihy ihyVar, String str, Object obj, upy upyVar) {
        super(ihyVar, str, obj, rgy.k);
        ihyVar.getClass();
        str.getClass();
        upyVar.getClass();
        this.j = upyVar;
        this.k = maz.a(wez.f39042a, new g9y(ihyVar, (byte) 2));
    }

    @Override // a.sry
    public final hfy B() {
        upy upyVar = this.j;
        upyVar.getClass();
        zpy zpyVar = sey.b;
        zpyVar.getClass();
        hfy hfyVar = ((sey) slb.V(upyVar.f, zpyVar)).f32094a;
        if (hfyVar != null) {
            return hfyVar;
        }
        ohq.u(this, "No signature for constructor: ");
        return null;
    }

    @Override // a.sry
    public final List D() {
        return this.j.b;
    }

    @Override // a.dre0
    public final dre0 H(ihy ihyVar, rgy rgyVar) {
        ihyVar.getClass();
        rgyVar.getClass();
        if (!Intrinsics.d(rgyVar, rgy.k)) {
            hny.v(this, "Constructors cannot have fake overrides: ");
            return null;
        }
        return new qry(ihyVar, this.d, op9.NO_RECEIVER, this.j);
    }

    @Override // a.qgy
    public final String getName() {
        return "<init>";
    }

    @Override // a.qgy
    public final kiy getReturnType() {
        return (kiy) this.k.getValue();
    }

    @Override // a.qgy
    public final viy getVisibility() {
        iiy[] iiyVarArr = j24.f15764a;
        upy upyVar = this.j;
        upyVar.getClass();
        return jwb.b0((nuu0) j24.g.v(j24.f15764a[17], upyVar));
    }

    @Override // a.jhy
    public final boolean isExternal() {
        return false;
    }

    @Override // a.jhy
    public final boolean isInfix() {
        return false;
    }

    @Override // a.jhy
    public final boolean isInline() {
        return false;
    }

    @Override // a.jhy
    public final boolean isOperator() {
        return false;
    }

    @Override // a.qgy
    public final boolean isSuspend() {
        return false;
    }

    @Override // a.dre0
    public final fm40 m() {
        return fm40.FINAL;
    }
}
