package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n7j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ o7j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7j(o7j o7jVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = o7jVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        o7j o7jVar = this.k;
        switch (b) {
            case 0:
                return new n7j(o7jVar, yjeVar, (byte) 0);
            default:
                n7j n7jVar = new n7j(o7jVar, yjeVar, (byte) 1);
                n7jVar.j = ((Boolean) obj).booleanValue();
                return n7jVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((n7j) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((n7j) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yje yjeVar = null;
        o7j o7jVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    tru truVar = o7jVar.b;
                    this.j = true;
                    obj = truVar.a(this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                o7jVar.j = true;
                o7jVar.y(new k7j((List) obj));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    bby bbyVar = o7jVar.i;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        o7jVar.i = sac.V(jiu0.a(o7jVar), new h7j(o7jVar, (byte) 0), null, o7jVar.d.b, new n7j(o7jVar, yjeVar, (byte) 0), 10);
                    }
                } else if (!o7jVar.j) {
                    o7jVar.y(new j7j(o7jVar.w()));
                }
                return Unit.f46060a;
        }
    }
}
