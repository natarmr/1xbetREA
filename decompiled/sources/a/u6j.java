package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class u6j extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ v6j k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6j(v6j v6jVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = v6jVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        v6j v6jVar = this.k;
        switch (b) {
            case 0:
                u6j u6jVar = new u6j(v6jVar, yjeVar, (byte) 0);
                u6jVar.j = ((Boolean) obj).booleanValue();
                return u6jVar;
            default:
                return new u6j(v6jVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((u6j) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((u6j) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        v6j v6jVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (!z && !v6jVar.g) {
                    v6jVar.x(new r6j(v6jVar.w()));
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    vae0 vae0VarM = vtb.M(((yzi) ((ali) v6jVar.b.f13365a).b).f43514a);
                    b5h b5hVar = new b5h(v6jVar, (byte) 11);
                    this.j = true;
                    if (vae0VarM.f37082a.c(b5hVar, this) == wneVar2) {
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
