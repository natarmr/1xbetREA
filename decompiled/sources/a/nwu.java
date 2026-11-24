package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class nwu extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ yhi j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nwu(yhi yhiVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.j = yhiVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        yhi yhiVar = this.j;
        switch (b) {
            case 0:
                return new nwu(yhiVar, yjeVar, (byte) 0);
            default:
                return new nwu(yhiVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((nwu) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yhi yhiVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(((g8n0) ((b3c) yhiVar.j).f1895a.b).c.c.getValue() == null);
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(((g8n0) ((tvt) yhiVar.i).f34618a.b).b.c.getValue() == null);
        }
    }
}
