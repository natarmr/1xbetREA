package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w9u extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ a6u k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w9u(a6u a6uVar, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = a6uVar;
        this.l = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new w9u(this.k, this.l, yjeVar, (byte) 0);
            default:
                return new w9u(this.k, this.l, yjeVar, (byte) 1);
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
        return ((w9u) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objH;
        Object objF;
        byte b = this.i;
        long j = this.l;
        a6u a6uVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    n4u n4uVar = (n4u) a6uVar.b;
                    this.j = true;
                    objH = n4uVar.h(j, this);
                    if (objH == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH = ((j0g0) obj).f15681a;
                }
                return new j0g0(objH);
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    f4u f4uVar = (f4u) a6uVar.c;
                    this.j = true;
                    objF = f4uVar.f(j, this);
                    if (objF == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objF = ((j0g0) obj).f15681a;
                }
                return new j0g0(objF);
        }
    }
}
