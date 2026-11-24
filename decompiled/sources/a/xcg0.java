package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class xcg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ int k;
    public final /* synthetic */ xcz l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;
    public final /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xcg0(xcz xczVar, float f, float f2, float f3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = xczVar;
        this.m = f;
        this.n = f2;
        this.o = f3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                xcg0 xcg0Var = new xcg0(this.l, this.m, this.n, this.o, yjeVar, (byte) 0);
                xcg0Var.k = ((Number) obj).intValue();
                return xcg0Var;
            default:
                xcg0 xcg0Var2 = new xcg0(this.l, this.m, this.n, this.o, yjeVar, (byte) 1);
                xcg0Var2.k = ((Number) obj).intValue();
                return xcg0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        int iIntValue = ((Number) obj).intValue();
        yje yjeVar = (yje) obj2;
        switch (b) {
            case 0:
                break;
        }
        return ((xcg0) create(Integer.valueOf(iIntValue), yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a1  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        switch (this.i) {
            case 0:
                int i = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.k = i;
                    this.j = true;
                    if (i != -1) {
                        xcz xczVar = this.l;
                        if (xczVar.j().o == 0) {
                            objB = Unit.f46060a;
                        } else {
                            float fH = (int) (xczVar.j().h() >> 32);
                            if (fH == 0.0f) {
                                objB = Unit.f46060a;
                            } else {
                                int iH = xczVar.h();
                                float fI = xczVar.i();
                                float f = this.m;
                                objB = xczVar.b(c050.f3507a, new ycz(((((f / 2.0f) + ((i - iH) * (this.n + f))) - fI) - (fH / 2.0f)) + this.o, null), this);
                                if (objB != wneVar) {
                                    objB = Unit.f46060a;
                                }
                            }
                        }
                    } else {
                        objB = Unit.f46060a;
                    }
                    if (objB == wneVar) {
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
                int i2 = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.k = i2;
                    this.j = true;
                    if (idm0.w(this.l, i2, this.m, this.n, this.o, Response.BUSY_EVERYWHERE, this) == wneVar2) {
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
