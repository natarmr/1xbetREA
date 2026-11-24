package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qof0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ vof0 k;
    public final /* synthetic */ ArrayList l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ mrf0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qof0(vof0 vof0Var, ArrayList arrayList, boolean z, mrf0 mrf0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vof0Var;
        this.l = arrayList;
        this.m = z;
        this.n = mrf0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new qof0(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            default:
                return new qof0(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
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
        return ((qof0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    iiy[] iiyVarArr = vof0.O1;
                    vof0 vof0Var = this.k;
                    b0c0 b0c0Var = new b0c0(0, vof0Var.I0(), aqf0.class, "onGameApplied", "onGameApplied()V", 0, (byte) 18);
                    this.j = true;
                    if (vof0Var.L0(this.l, this.m, this.n, b0c0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    vof0 vof0Var2 = this.k;
                    b0c0 b0c0Var2 = new b0c0(0, vof0Var2, vof0.class, "applyDoors", "applyDoors()V", 0, (byte) 19);
                    this.j = true;
                    iiy[] iiyVarArr2 = vof0.O1;
                    if (vof0Var2.L0(this.l, this.m, this.n, b0c0Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
