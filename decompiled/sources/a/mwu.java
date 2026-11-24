package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class mwu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ hie0 k;
    public final /* synthetic */ yhi l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwu(byte b, yje yjeVar, yhi yhiVar, hie0 hie0Var) {
        super(2, yjeVar);
        this.i = b;
        this.k = hie0Var;
        this.l = yhiVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yhi yhiVar = this.l;
        hie0 hie0Var = this.k;
        switch (b) {
            case 0:
                mwu mwuVar = new mwu((byte) 0, yjeVar, yhiVar, hie0Var);
                mwuVar.j = obj;
                return mwuVar;
            default:
                mwu mwuVar2 = new mwu((byte) 1, yjeVar, yhiVar, hie0Var);
                mwuVar2.j = obj;
                return mwuVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((mwu) create(list, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yhi yhiVar = this.l;
        hie0 hie0Var = this.k;
        List list = (List) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                hie0Var.f13108a = false;
                cj9 cj9Var = (cj9) yhiVar.l;
                list.getClass();
                g8n0 g8n0Var = (g8n0) cj9Var.f4449a.b;
                g8n0Var.getClass();
                ir30 ir30Var = g8n0Var.c;
                ir30Var.a();
                ir30Var.d(list);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                hie0Var.f13108a = false;
                dj9 dj9Var = (dj9) yhiVar.k;
                list.getClass();
                g8n0 g8n0Var2 = (g8n0) dj9Var.f6172a.b;
                g8n0Var2.getClass();
                ir30 ir30Var2 = g8n0Var2.b;
                ir30Var2.a();
                ir30Var2.d(list);
                break;
        }
        return Unit.f46060a;
    }
}
