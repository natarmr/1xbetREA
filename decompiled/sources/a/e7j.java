package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class e7j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ f7j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e7j(f7j f7jVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f7jVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f7j f7jVar = this.k;
        switch (b) {
            case 0:
                return new e7j(f7jVar, yjeVar, (byte) 0);
            default:
                e7j e7jVar = new e7j(f7jVar, yjeVar, (byte) 1);
                e7jVar.j = ((Boolean) obj).booleanValue();
                return e7jVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((e7j) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((e7j) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        f7j f7jVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bzu bzuVar = f7jVar.b;
                    this.j = true;
                    if (bzuVar.d(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                f7jVar.k = true;
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2) {
                    f7jVar.w();
                } else if (f7jVar.k) {
                    ((yzi) ((ali) f7jVar.c.b).b).d = 0L;
                } else {
                    f7jVar.x(new b7j(g2v.d(f7jVar.f, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new e8g(f7jVar, (byte) 28), 94)));
                }
                return Unit.f46060a;
        }
    }
}
