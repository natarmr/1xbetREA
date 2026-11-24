package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x0f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ String m;
    public final /* synthetic */ mii0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0f(long j, long j2, String str, mii0 mii0Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = j;
        this.l = j2;
        this.m = str;
        this.n = mii0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new x0f(this.n, this.k, this.l, this.m, yjeVar);
            default:
                return new x0f(this.k, this.l, this.m, this.n, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((x0f) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        Object objA;
        byte b = this.i;
        mii0 mii0Var = this.n;
        switch (b) {
            case 0:
                knf0 knf0Var = (knf0) mii0Var.d;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    String strC = knf0Var.c();
                    String strC2 = knf0Var.c();
                    String strA = knf0Var.a();
                    cwe cweVar = new cwe(this.k, this.l, strA, strC, this.m, strC2);
                    ok50 ok50Var = (ok50) mii0Var.c;
                    String strA2 = ((btt0) mii0Var.e).a();
                    this.j = true;
                    objC = ((v37) ((zm) ok50Var.f25390a).invoke()).c(strA2, cweVar, this);
                    if (objC == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                return d7x.O(g7x.z((q16) objC));
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bug0 bug0Var = new bug0(this.k, this.l, this.m, ((knf0) mii0Var.d).c());
                    ok50 ok50Var2 = (ok50) mii0Var.c;
                    String strA3 = ((btt0) mii0Var.e).a();
                    this.j = true;
                    objA = ((v37) ((zm) ok50Var2.f25390a).invoke()).a(strA3, bug0Var, this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                return d7x.O(g7x.z((q16) objA));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0f(mii0 mii0Var, long j, long j2, String str, yje yjeVar) {
        super(2, yjeVar);
        this.n = mii0Var;
        this.k = j;
        this.l = j2;
        this.m = str;
    }
}
