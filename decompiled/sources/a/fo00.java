package a;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class fo00 extends bnn0 implements Function1 {
    public byte i;
    public final /* synthetic */ pzu j;
    public final /* synthetic */ j700 k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Set m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Set o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo00(pzu pzuVar, j700 j700Var, int i, Set set, boolean z, Set set2, boolean z2, yje yjeVar) {
        super(1, yjeVar);
        this.j = pzuVar;
        this.k = j700Var;
        this.l = i;
        this.m = set;
        this.n = z;
        this.o = set2;
        this.p = z2;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new fo00(this.j, this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((fo00) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        wne wneVar = wne.f39444a;
        byte b = this.i;
        j700 j700Var = this.k;
        pzu pzuVar = this.j;
        if (b == 0) {
            z1x.P(obj);
            rtu rtuVar = (rtu) pzuVar.f27863a;
            boolean zJ = t9x.J(j700Var);
            this.i = (byte) 1;
            objA = rtuVar.a(zJ, 0, this);
            if (objA != wneVar) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        objA = obj;
        c3c0 c3c0Var = (c3c0) objA;
        long jF = ynq0.f(((viu) pzuVar.c).a());
        pzu pzuVar2 = (pzu) pzuVar.b;
        boolean z = c3c0Var.b;
        long j = c3c0Var.c;
        boolean z2 = ((pru) pzuVar.e).a().O1;
        this.i = (byte) 2;
        hie0 hie0Var = new hie0();
        yje yjeVar = null;
        utb utbVarC = aoq.c(aoq.c(new dnq(new fnq(aoq.c(((uzc) pzuVar2.c).c(), new go00(null, j700Var, pzuVar2, this.l, this.m, z, j, this.o, this.n, jF)), new uwu(hie0Var, null, (byte) 1), (byte) 4), new qos((Object) hie0Var, yjeVar, (byte) 10), (byte) 1), new b9u((byte) 8, yjeVar, pzuVar2, this.p, z2)), new sot(yjeVar, (Object) pzuVar2, (byte) 24));
        wneVar = wneVar;
        return utbVarC == wneVar ? wneVar : utbVarC;
    }
}
