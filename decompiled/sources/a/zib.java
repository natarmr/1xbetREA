package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zib extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ajb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zib(ajb ajbVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ajbVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ajb ajbVar = this.k;
        switch (b) {
            case 0:
                zib zibVar = new zib(ajbVar, yjeVar, (byte) 0);
                zibVar.j = obj;
                return zibVar;
            default:
                zib zibVar2 = new zib(ajbVar, yjeVar, (byte) 1);
                zibVar2.j = obj;
                return zibVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zib) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zib) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String str;
        bby bbyVar;
        byte b = this.i;
        ajb ajbVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                String str2 = (String) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if ((((kib) ajbVar.D()).d || ((bbyVar = ajbVar.A) != null && bbyVar.isActive())) && (str = ajbVar.D) != null && !str.equals(str2)) {
                    e3c.n(ajbVar.A);
                    ajbVar.P();
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = ajb.E;
                ajbVar.O((Throwable) obj2);
                break;
        }
        return Unit.f46060a;
    }
}
