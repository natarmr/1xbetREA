package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.favorites.impl.presentation.screen.classic.models.ClassicFavoriteTab;

/* JADX INFO: loaded from: classes4.dex */
public final class xnc extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ boc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xnc(boc bocVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bocVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boc bocVar = this.k;
        switch (b) {
            case 0:
                return new xnc(bocVar, yjeVar, (byte) 0);
            case 1:
                return new xnc(bocVar, yjeVar, (byte) 1);
            default:
                return new xnc(bocVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((xnc) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        boc bocVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    h2c h2cVarA = bocVar.t.a();
                    this.j = true;
                    obj = ntb.K(h2cVarA, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i = boc.D;
                p7m0 p7m0Var = bocVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, onc.a((onc) value, null, ClassicFavoriteTab.b, null, 0, null, false, false, null, false, 509)));
                if (zBooleanValue) {
                    bocVar.G(knc.f18578a);
                }
                return Unit.f46060a;
            case 1:
                Object obj2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    i89 i89VarM = bocVar.s.m();
                    h2c h2cVarA2 = bocVar.t.a();
                    ko0 ko0Var = new ko0(bocVar, (yje) null, (byte) 6);
                    idc idcVar = new idc(bocVar, (byte) 6);
                    this.j = true;
                    Object objG = tdc.G(this, idcVar, new kh1((Object) ko0Var, (yje) null, (byte) 9), pul.j, new gmq[]{i89VarM, h2cVarA2});
                    if (objG != obj2) {
                        objG = Unit.f46060a;
                    }
                    if (objG == obj2) {
                        return obj2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    urt urtVar = bocVar.u;
                    tl5 tl5Var = tl5.f34128a;
                    this.j = true;
                    if (urtVar.f36180a.i(tl5Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
