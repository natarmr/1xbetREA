package a;

import androidx.work.CoroutineWorker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class aoe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ CoroutineWorker k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aoe(CoroutineWorker coroutineWorker, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = coroutineWorker;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        CoroutineWorker coroutineWorker = this.k;
        switch (b) {
            case 0:
                return new aoe(coroutineWorker, yjeVar, (byte) 0);
            default:
                return new aoe(coroutineWorker, yjeVar, (byte) 1);
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
        return ((aoe) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        CoroutineWorker coroutineWorker = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    Object objD = coroutineWorker.d();
                    return objD == wneVar ? wneVar : objD;
                }
                if (z) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    Object objC = coroutineWorker.c(this);
                    return objC == wneVar2 ? wneVar2 : objC;
                }
                if (z2) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
