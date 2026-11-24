package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class wg4 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ fh4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wg4(fh4 fh4Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = fh4Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        fh4 fh4Var = this.k;
        switch (b) {
            case 0:
                return new wg4(fh4Var, yjeVar, (byte) 0);
            default:
                return new wg4(fh4Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((wg4) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        fh4 fh4Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = fh4.c0;
                    p7m0 p7m0Var = fh4Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        oyg0 oyg0Var = fh4Var.f;
                        oyg0Var.getClass();
                        q7x.F(oyg0Var, Boolean.FALSE, "KEY_CONTENT_VISIBILITY_STATUS");
                    } while (!p7m0Var.m(value, zf4.a((zf4) value, false, false, false, null, null, null, 0, false, null, null, false, false, 16383)));
                    this.j = true;
                    if (qcc.O(200L, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                fh4Var.x.d(new or3((byte) 28));
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                boolean z3 = true;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(200L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = fh4.c0;
                p7m0 p7m0Var2 = fh4Var.i.f25029a;
                while (true) {
                    Object value2 = p7m0Var2.getValue();
                    value2.getClass();
                    oyg0 oyg0Var2 = fh4Var.f;
                    boolean z4 = z3;
                    oyg0Var2.getClass();
                    q7x.F(oyg0Var2, Boolean.TRUE, "KEY_CONTENT_VISIBILITY_STATUS");
                    if (p7m0Var2.m(value2, zf4.a((zf4) value2, false, false, false, null, null, null, 0, false, null, null, false, z4, 16383))) {
                        return Unit.f46060a;
                    }
                    z3 = z4;
                }
                break;
        }
    }
}
