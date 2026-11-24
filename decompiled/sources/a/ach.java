package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.core.betting.domain.model.RelatedParams;

/* JADX INFO: loaded from: classes4.dex */
public final class ach extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dch k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ach(dch dchVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dchVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dch dchVar = this.k;
        switch (b) {
            case 0:
                ach achVar = new ach(dchVar, yjeVar, (byte) 0);
                achVar.j = obj;
                return achVar;
            default:
                ach achVar2 = new ach(dchVar, yjeVar, (byte) 1);
                achVar2.j = obj;
                return achVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ach) create((jlr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ach) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        dch dchVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                jlr jlrVar = (jlr) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (jlrVar != null) {
                    int i = dch.F;
                    RelatedParams relatedParamsP = dchVar.P(jlrVar);
                    if (relatedParamsP != null) {
                        dchVar.x(new nbh(relatedParamsP));
                    }
                }
                break;
            default:
                Pair pair = (Pair) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
                RelatedParams relatedParams = (RelatedParams) pair.b;
                dchVar.x(new kbh(!zBooleanValue));
                if (zBooleanValue || relatedParams == null) {
                    bby bbyVar = dchVar.D;
                    if (bbyVar != null) {
                        e3c.n(bbyVar);
                    }
                } else {
                    dchVar.N(relatedParams);
                }
                break;
        }
        return Unit.f46060a;
    }
}
