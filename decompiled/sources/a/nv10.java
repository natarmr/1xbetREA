package a;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes4.dex */
public final class nv10 extends zx5 {
    public final /* synthetic */ qv10 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv10(qv10 qv10Var, androidx.fragment.app.e eVar, glz glzVar, c0o c0oVar) {
        super(eVar, glzVar, c0oVar);
        eVar.getClass();
        glzVar.getClass();
        c0oVar.getClass();
        this.o = qv10Var;
    }

    @Override // a.f5r
    public final Fragment B(int i) {
        gl5 gl5Var = il5.Q1;
        l4b l4bVar = (l4b) l4b.i.get(i);
        htz htzVar = qv10.O1;
        qv10 qv10Var = this.o;
        boolean zBooleanValue = qv10Var.K1.n(qv10Var, qv10.P1[0]).booleanValue();
        gl5Var.getClass();
        l4bVar.getClass();
        il5 il5Var = new il5();
        iiy[] iiyVarArr = il5.R1;
        il5Var.K1.u(il5Var, iiyVarArr[0], l4bVar);
        il5Var.L1.v(il5Var, iiyVarArr[1], zBooleanValue);
        return il5Var;
    }
}
