package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class au extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ cu k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(cu cuVar, long j, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = cuVar;
        this.l = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        switch (this.i) {
            case 0:
                return new au(this.k, this.l, yjeVar, (byte) 0);
            default:
                return new au(this.k, this.l, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((au) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        long j = this.l;
        cu cuVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                y3v y3vVar = (y3v) cuVar.c;
                this.j = true;
                Object objA = ((y9n0) y3vVar.b).a(j, this, true);
                return objA == wneVar ? wneVar : objA;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    y3v y3vVar2 = (y3v) cuVar.c;
                    this.j = true;
                    Object objB = ((z9n0) ((enj0) ((epi0) y3vVar2.c).b).invoke()).b(((btt0) y3vVar2.d).a(), new o6n0(j), this);
                    if (objB != wneVar2) {
                        objB = Unit.f46060a;
                    }
                    if (objB != wneVar2) {
                        objB = Unit.f46060a;
                    }
                    if (objB == wneVar2) {
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
