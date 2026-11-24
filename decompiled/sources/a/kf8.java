package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class kf8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ lf8 j;
    public final /* synthetic */ List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf8(lf8 lf8Var, List list, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = lf8Var;
        this.k = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        List list = this.k;
        lf8 lf8Var = this.j;
        switch (b) {
            case 0:
                return new kf8(lf8Var, list, yjeVar, (byte) 0);
            default:
                return new kf8(lf8Var, list, yjeVar, (byte) 1);
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
        return ((kf8) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        List list = this.k;
        lf8 lf8Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                l570 l570Var = lf8Var.w;
                bvc bvcVarA = jiu0.a(lf8Var);
                d38 d38Var = new d38(lf8Var, (byte) 6);
                l570Var.getClass();
                list.getClass();
                l570Var.v(bvcVarA, list, "BonusGamesViewModel.updateGamesWorkStatus", d38Var);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                tpx tpxVar = lf8Var.z;
                tpxVar.getClass();
                list.getClass();
                tpxVar.f34357a.a(list);
                lf8Var.N();
                break;
        }
        return Unit.f46060a;
    }
}
