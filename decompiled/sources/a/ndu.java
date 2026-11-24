package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ndu extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ wdu j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ String l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(wdu wduVar, boolean z, String str, boolean z2, boolean z3, yje yjeVar) {
        super(2, yjeVar);
        this.j = wduVar;
        this.k = z;
        this.l = str;
        this.m = z2;
        this.n = z3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ndu(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ndu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zhi0 {
        Object objD;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            this.i = true;
            objD = this.j.D(this.k, this.l, this.m, this.n, this);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objD = ((j0g0) obj).f15681a;
        }
        return new j0g0(objD);
    }
}
