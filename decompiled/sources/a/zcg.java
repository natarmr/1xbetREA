package a;

import java.util.List;
import kotlin.Unit;
import org.xplatform.cyber.section.api.championships.list.presentation.CyberChampsMainParams;

/* JADX INFO: loaded from: classes4.dex */
public final class zcg extends bnn0 implements aer {
    public /* synthetic */ String i;
    public /* synthetic */ boolean j;
    public /* synthetic */ boolean k;
    public /* synthetic */ hhq0 l;
    public /* synthetic */ List m;
    public final /* synthetic */ CyberChampsMainParams n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zcg(CyberChampsMainParams cyberChampsMainParams, yje yjeVar) {
        super(6, yjeVar);
        this.n = cyberChampsMainParams;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String str = this.i;
        boolean z = this.j;
        boolean z2 = this.k;
        hhq0 hhq0Var = this.l;
        List list = this.m;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return new whg(this.n, bnb.f2874a, str, z, z2, hhq0Var, list != null && list.isEmpty(), 128);
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
        zcg zcgVar = new zcg(this.n, (yje) obj6);
        zcgVar.i = (String) obj;
        zcgVar.j = zBooleanValue;
        zcgVar.k = zBooleanValue2;
        zcgVar.l = (hhq0) obj4;
        zcgVar.m = (List) obj5;
        return zcgVar.invokeSuspend(Unit.f46060a);
    }
}
