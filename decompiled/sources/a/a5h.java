package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class a5h extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ c5h k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a5h(c5h c5hVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = c5hVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        c5h c5hVar = this.k;
        switch (b) {
            case 0:
                a5h a5hVar = new a5h(c5hVar, yjeVar, (byte) 0);
                a5hVar.j = ((Boolean) obj).booleanValue();
                return a5hVar;
            default:
                return new a5h(c5hVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((a5h) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a5h) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        c5h c5hVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z) {
                    c5hVar.w();
                } else {
                    bby bbyVar = c5hVar.v;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    h2c h2cVar = new h2c(((or30) c5hVar.f.f13740a.f1850a.c).f25719a, (byte) 16);
                    b5h b5hVar = new b5h(c5hVar, (byte) 0);
                    this.j = true;
                    Object objC = h2cVar.c(new uap(b5hVar, (byte) 12), this);
                    if (objC != wne.f39444a) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
