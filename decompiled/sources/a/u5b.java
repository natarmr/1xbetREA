package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class u5b extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ w5b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u5b(w5b w5bVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = w5bVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        w5b w5bVar = this.k;
        switch (b) {
            case 0:
                return new u5b(w5bVar, yjeVar, (byte) 0);
            default:
                return new u5b(w5bVar, yjeVar, (byte) 1);
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
        return ((u5b) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        w5b w5bVar = this.k;
        byte b2 = 1;
        switch (b) {
            case 0:
                Object obj2 = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    i89 i89VarM = w5bVar.t.m();
                    h2c h2cVarA = w5bVar.u.a();
                    ko0 ko0Var = new ko0(w5bVar, (yje) null, (byte) 5);
                    f5b f5bVar = new f5b(w5bVar, b2);
                    this.j = true;
                    Object objG = tdc.G(this, f5bVar, new kh1((Object) ko0Var, (yje) null, (byte) 9), pul.j, new gmq[]{i89VarM, h2cVarA});
                    if (objG != obj2) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj2) {
                        return obj2;
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
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    urt urtVar = w5bVar.v;
                    tl5 tl5Var = tl5.f34128a;
                    this.j = true;
                    if (urtVar.f36180a.i(tl5Var, this) == wneVar) {
                        return wneVar;
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
