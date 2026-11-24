package a;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;

/* JADX INFO: loaded from: classes4.dex */
public final class cnp extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ nnp k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnp(nnp nnpVar, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.k = nnpVar;
        this.j = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        nnp nnpVar = this.k;
        switch (b) {
            case 0:
                return new cnp(nnpVar, this.j, yjeVar);
            case 1:
                cnp cnpVar = new cnp(nnpVar, yjeVar, (byte) 1);
                cnpVar.j = ((Boolean) obj).booleanValue();
                return cnpVar;
            default:
                cnp cnpVar2 = new cnp(nnpVar, yjeVar, (byte) 2);
                cnpVar2.j = ((Boolean) obj).booleanValue();
                return cnpVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cnp) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((cnp) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((cnp) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        bby bbyVar;
        byte b = this.i;
        nnp nnpVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = this.j;
                int i = nnp.a0;
                p7m0 p7m0Var = nnpVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    nnpVar.f.getClass();
                } while (!p7m0Var.m(value, xmp.a((xmp) value, null, null, null, null, null, z, false, null, false, null, false, 16351)));
                break;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = nnp.a0;
                rlp rlpVar = ((xmp) nnpVar.D()).b;
                if ((rlpVar != null ? rlpVar.d : null) != j8l0.MEDIUM_ITEMS_LINE_SEPARATOR_WITH_EVENTS) {
                    Set set = !z2 ? xun.f41520a : ((xmp) nnpVar.D()).e.b;
                    set.getClass();
                    FeedsChampsItemsSelectionState feedsChampsItemsSelectionState = new FeedsChampsItemsSelectionState(set, z2);
                    if (!((xmp) nnpVar.D()).e.equals(feedsChampsItemsSelectionState)) {
                        nnpVar.o.e("SELECTION_STATE_KEY", feedsChampsItemsSelectionState);
                        p7m0 p7m0Var2 = nnpVar.i.f25029a;
                        do {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                            nnpVar.f.getClass();
                        } while (!p7m0Var2.m(value2, xmp.a((xmp) value2, null, null, null, null, feedsChampsItemsSelectionState, false, false, null, z2, null, false, 15343)));
                    }
                }
                break;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3 && ((bbyVar = nnpVar.W) == null || !bbyVar.isActive())) {
                    nnp.Q(nnpVar, 7);
                }
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cnp(nnp nnpVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nnpVar;
    }
}
