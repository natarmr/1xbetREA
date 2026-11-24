package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class sod0 extends bnn0 implements Function2 {
    public final /* synthetic */ boolean i;
    public final /* synthetic */ tod0 j;
    public final /* synthetic */ double k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sod0(boolean z, tod0 tod0Var, double d, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = z;
        this.j = tod0Var;
        this.k = d;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new sod0(this.i, this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sod0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ol60 ol60Var = this.j.n;
        if (this.i) {
            ol60Var.f(new god0(this.l, this.k));
        } else {
            ol60Var.f(fod0.f9877a);
        }
        return Unit.f46060a;
    }
}
