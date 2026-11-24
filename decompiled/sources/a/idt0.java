package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class idt0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ jdt0 k;
    public final /* synthetic */ uog l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ idt0(jdt0 jdt0Var, uog uogVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = jdt0Var;
        this.l = uogVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        uog uogVar = this.l;
        jdt0 jdt0Var = this.k;
        switch (b) {
            case 0:
                return new idt0(jdt0Var, uogVar, yjeVar, (byte) 0);
            default:
                return new idt0(jdt0Var, uogVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((idt0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        uog uogVar = this.l;
        jdt0 jdt0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    qyg0 qyg0Var = jdt0Var.z;
                    int i = uogVar.f36012a;
                    this.j = true;
                    if (qyg0Var.a(i, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    pyg0 pyg0Var = jdt0Var.y;
                    int i2 = uogVar.f36012a;
                    this.j = true;
                    if (pyg0Var.a(i2, this) == wneVar2) {
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
