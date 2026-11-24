package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class j5r0 extends bnn0 implements Function1 {
    public v5l0 i;
    public y78 j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final /* synthetic */ m5r0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5r0(m5r0 m5r0Var, yje yjeVar) {
        super(1, yjeVar);
        this.o = m5r0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new j5r0(this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((j5r0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        boolean z;
        y78 y78Var;
        boolean z2;
        boolean z3;
        v5l0 v5l0Var;
        Object value;
        wne wneVar = wne.f39444a;
        boolean z4 = this.n;
        m5r0 m5r0Var = this.o;
        if (!z4) {
            z1x.P(obj);
            sff0 sff0VarA = m5r0Var.r.a();
            v5l0 v5l0Var2 = sff0VarA.g.y;
            boolean z5 = sff0VarA.J;
            boolean zJ = m5r0Var.s.j();
            r9u r9uVar = m5r0Var.t;
            ygp ygpVar = ygp.t;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            boolean zD = j1q0Var.f15748a.d(ygpVar);
            y78 y78Var2 = m5r0Var.w;
            j3c j3cVar = m5r0Var.u;
            this.i = v5l0Var2;
            this.j = y78Var2;
            this.k = z5;
            this.l = zJ;
            this.m = zD;
            this.n = true;
            objC = j3cVar.c(this);
            if (objC == wneVar) {
                return wneVar;
            }
            z = zD;
            y78Var = y78Var2;
            z2 = z5;
            z3 = zJ;
            v5l0Var = v5l0Var2;
        } else {
            if (!z4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z6 = this.m;
            boolean z7 = this.l;
            boolean z8 = this.k;
            y78 y78Var3 = this.j;
            v5l0 v5l0Var3 = this.i;
            z1x.P(obj);
            v5l0Var = v5l0Var3;
            z = z6;
            z3 = z7;
            z2 = z8;
            y78Var = y78Var3;
            objC = obj;
        }
        w4r0 w4r0Var = new w4r0(v5l0Var, z2, z3, z, y78Var, (wcb) objC, m5r0Var.v.f20692a.a());
        p7m0 p7m0Var = m5r0Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, h5r0.a((h5r0) value, w4r0Var, null, false, 14)));
        return Unit.f46060a;
    }
}
