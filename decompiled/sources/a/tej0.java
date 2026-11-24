package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class tej0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ org.xplatform.settings.impl.presentation.a k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tej0(org.xplatform.settings.impl.presentation.a aVar, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = aVar;
        this.l = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.l;
        org.xplatform.settings.impl.presentation.a aVar = this.k;
        switch (b) {
            case 0:
                return new tej0(aVar, z, yjeVar, (byte) 0);
            default:
                return new tej0(aVar, z, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((tej0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                org.xplatform.settings.impl.presentation.a aVar = this.k;
                if (!z) {
                    z1x.P(obj);
                    nhf0 nhf0Var = aVar.s0;
                    this.j = true;
                    obj = nhf0Var.f(false, true, this);
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
                gm3 gm3Var = (gm3) obj;
                String str = gm3Var.f11523a;
                boolean z2 = gm3Var.b;
                String str2 = gm3Var.c;
                int length = str.length();
                boolean z3 = this.l;
                if (length > 0) {
                    aVar.M(true);
                    if (z3) {
                        aVar.k.d(new t13((Object) aVar, (Object) str, z2, (Object) str2, (byte) 23));
                    }
                } else {
                    if (z3 && aVar.O0) {
                        aVar.L();
                        aVar.P0++;
                    }
                    aVar.O0 = true;
                    aVar.M(false);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                org.xplatform.settings.impl.presentation.a aVar2 = this.k;
                if (!z4) {
                    z1x.P(obj);
                    ahu ahuVar = aVar2.f;
                    this.j = true;
                    obj = ahuVar.b(bm5.f2822a, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                sac.V(jiu0.a(aVar2), new kej0(aVar2, (byte) 11), null, aVar2.s.b, new qej0(aVar2, ((ql5) obj).f28916a, this.l, null), 10);
                return Unit.f46060a;
        }
    }
}
