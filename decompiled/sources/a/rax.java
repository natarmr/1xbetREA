package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class rax extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tax k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rax(tax taxVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = taxVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tax taxVar = this.k;
        switch (b) {
            case 0:
                rax raxVar = new rax(taxVar, yjeVar, (byte) 0);
                raxVar.j = obj;
                return raxVar;
            default:
                rax raxVar2 = new rax(taxVar, yjeVar, (byte) 1);
                raxVar2.j = obj;
                return raxVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((rax) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((rax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        tax taxVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = ((sw00) obj2).f32897a;
                taxVar.A = sac.V(jiu0.a(taxVar), qax.f28419a, null, taxVar.e.f22085a, new ys8(taxVar, z, (yje) null, (byte) 17), 10);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                taxVar.A = sac.V(jiu0.a(taxVar), qax.f28419a, null, taxVar.e.f22085a, new ys8((Object) taxVar, false, (yje) null, (byte) 17), 10);
                ((Throwable) obj2).printStackTrace();
                break;
        }
        return Unit.f46060a;
    }
}
