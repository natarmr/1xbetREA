package a;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.feed.linelive.presentation.feeds.child.sports.models.SportItemsSelectionState;

/* JADX INFO: loaded from: classes4.dex */
public final class uop extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ fpp k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uop(fpp fppVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.k = fppVar;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fpp fppVar = this.k;
        switch (b) {
            case 0:
                return new uop(fppVar, this.j, yjeVar);
            case 1:
                uop uopVar = new uop(fppVar, yjeVar, (byte) 1);
                uopVar.j = ((Boolean) obj).booleanValue();
                return uopVar;
            default:
                uop uopVar2 = new uop(fppVar, yjeVar, (byte) 2);
                uopVar2.j = ((Boolean) obj).booleanValue();
                return uopVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((uop) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((uop) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((uop) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        fpp fppVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = this.j;
                int i = fpp.P;
                p7m0 p7m0Var = fppVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ngl0.a((ngl0) value, null, null, null, null, null, z, false, false, false, 8127)));
                break;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = fpp.P;
                Set set = !z2 ? xun.f41520a : ((ngl0) fppVar.D()).f.b;
                set.getClass();
                SportItemsSelectionState sportItemsSelectionState = new SportItemsSelectionState(set, z2);
                if (!((ngl0) fppVar.D()).f.equals(sportItemsSelectionState)) {
                    fppVar.o.e("SELECTION_STATE_KEY", sportItemsSelectionState);
                    p7m0 p7m0Var2 = fppVar.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        fppVar.f.getClass();
                    } while (!p7m0Var2.m(value2, ngl0.a((ngl0) value2, null, null, null, null, sportItemsSelectionState, false, false, false, z2, 4063)));
                    fppVar.M(((ngl0) fppVar.D()).b);
                }
                break;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    int i3 = fpp.P;
                    fppVar.N(false);
                }
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uop(fpp fppVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fppVar;
    }
}
