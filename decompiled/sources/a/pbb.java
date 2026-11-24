package a;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class pbb implements cr30 {
    public final String b;
    public final cr30[] c;

    public pbb(String str, cr30[] cr30VarArr) {
        this.b = str;
        this.c = cr30VarArr;
    }

    @Override // a.cr30
    public final Collection a(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        cr30[] cr30VarArr = this.c;
        int length = cr30VarArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        if (length == 1) {
            return cr30VarArr[0].a(g950Var, ux50Var);
        }
        Collection collectionH = null;
        for (cr30 cr30Var : cr30VarArr) {
            collectionH = k9x.H(collectionH, cr30Var.a(g950Var, ux50Var));
        }
        return collectionH == null ? xun.f41520a : collectionH;
    }

    @Override // a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        cr30[] cr30VarArr = this.c;
        int length = cr30VarArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        if (length == 1) {
            return cr30VarArr[0].b(cekVar, function1);
        }
        Collection collectionH = null;
        for (cr30 cr30Var : cr30VarArr) {
            collectionH = k9x.H(collectionH, cr30Var.b(cekVar, function1));
        }
        return collectionH == null ? xun.f41520a : collectionH;
    }

    @Override // a.cr30
    public final Set c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (cr30 cr30Var : this.c) {
            w3d.u(linkedHashSet, cr30Var.c());
        }
        return linkedHashSet;
    }

    @Override // a.cr30
    public final foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        foc focVar = null;
        for (cr30 cr30Var : this.c) {
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
        return xdx.x(tx3.s(this.c));
    }

    @Override // a.cr30
    public final Collection f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        cr30[] cr30VarArr = this.c;
        int length = cr30VarArr.length;
        if (length == 0) {
            return iun.f15405a;
        }
        if (length == 1) {
            return cr30VarArr[0].f(g950Var, ux50Var);
        }
        Collection collectionH = null;
        for (cr30 cr30Var : cr30VarArr) {
            collectionH = k9x.H(collectionH, cr30Var.f(g950Var, ux50Var));
        }
        return collectionH == null ? xun.f41520a : collectionH;
    }

    @Override // a.cr30
    public final Set g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (cr30 cr30Var : this.c) {
            w3d.u(linkedHashSet, cr30Var.g());
        }
        return linkedHashSet;
    }

    public final String toString() {
        return this.b;
    }
}
