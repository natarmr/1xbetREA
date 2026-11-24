package a;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qjq extends bnn0 implements Function2 {
    public final /* synthetic */ short i;
    public final /* synthetic */ vjq j;
    public final /* synthetic */ viq k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public qjq(long j, vjq vjqVar, viq viqVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (int) j;
        this.j = vjqVar;
        this.k = viqVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new qjq(this.i, this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qjq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        long jCurrentTimeMillis = System.currentTimeMillis() + ((long) this.i);
        kzw kzwVar = this.j.h;
        if (kzwVar != null) {
            kzwVar.a(jCurrentTimeMillis, this.k);
        }
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "applyScreenFlash: ScreenFlash.apply() invoked, expirationTimeMillis = " + jCurrentTimeMillis);
        }
        return Unit.f46060a;
    }
}
