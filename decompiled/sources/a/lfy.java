package a;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class lfy implements cr30 {
    public static final /* synthetic */ iiy[] f = {new j0d0(lfy.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};
    public final f7u b;
    public final r9z c;
    public final x9z d;
    public final cu00 e;

    public lfy(f7u f7uVar, wqe0 wqe0Var, r9z r9zVar) {
        this.b = f7uVar;
        this.c = r9zVar;
        this.d = new x9z(f7uVar, wqe0Var, r9zVar);
        this.e = new cu00((eu00) ((v7i) f7uVar.b).i, new aaw(this, (byte) 16));
    }

    @Override // a.cr30
    public final Collection a(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        i(g950Var, ux50Var);
        cr30[] cr30VarArrH = h();
        Collection collectionA = this.d.a(g950Var, ux50Var);
        for (cr30 cr30Var : cr30VarArrH) {
            collectionA = k9x.H(collectionA, cr30Var.a(g950Var, ux50Var));
        }
        return collectionA == null ? xun.f41520a : collectionA;
    }

    @Override // a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        cr30[] cr30VarArrH = h();
        Collection collectionB = this.d.b(cekVar, function1);
        for (cr30 cr30Var : cr30VarArrH) {
            collectionB = k9x.H(collectionB, cr30Var.b(cekVar, function1));
        }
        return collectionB == null ? xun.f41520a : collectionB;
    }

    @Override // a.cr30
    public final Set c() {
        cr30[] cr30VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (cr30 cr30Var : cr30VarArrH) {
            w3d.u(linkedHashSet, cr30Var.c());
        }
        linkedHashSet.addAll(this.d.c());
        return linkedHashSet;
    }

    @Override // a.cr30
    public final foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        i(g950Var, ux50Var);
        x9z x9zVar = this.d;
        x9zVar.getClass();
        foc focVar = null;
        wm40 wm40VarV = x9zVar.v(g950Var, null);
        if (wm40VarV != null) {
            return wm40VarV;
        }
        for (cr30 cr30Var : h()) {
            foc focVarD = cr30Var.d(g950Var, ux50Var);
            if (focVarD != null) {
                if (!(focVarD instanceof goc) || !((sq30) focVarD).Q()) {
                    return focVarD;
                }
                if (focVar == null) {
                    focVar = focVarD;
                }
            }
        }
        return focVar;
    }

    @Override // a.cr30
    public final Set e() {
        HashSet hashSetX = xdx.x(tx3.s(h()));
        if (hashSetX == null) {
            return null;
        }
        hashSetX.addAll(this.d.e());
        return hashSetX;
    }

    @Override // a.cr30
    public final Collection f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        i(g950Var, ux50Var);
        cr30[] cr30VarArrH = h();
        this.d.getClass();
        Collection collectionH = iun.f15405a;
        for (cr30 cr30Var : cr30VarArrH) {
            collectionH = k9x.H(collectionH, cr30Var.f(g950Var, ux50Var));
        }
        return collectionH == null ? xun.f41520a : collectionH;
    }

    @Override // a.cr30
    public final Set g() {
        cr30[] cr30VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (cr30 cr30Var : cr30VarArrH) {
            w3d.u(linkedHashSet, cr30Var.g());
        }
        linkedHashSet.addAll(this.d.g());
        return linkedHashSet;
    }

    public final cr30[] h() {
        return (cr30[]) yqm0.s(this.e, f[0]);
    }

    public final void i(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        String str = this.c.f.f32934a.f34663a;
        g950Var.b().getClass();
        str.getClass();
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
