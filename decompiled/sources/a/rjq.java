package a;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class rjq extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ short k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public rjq(long j, Function0 function0, yje yjeVar) {
        super(2, yjeVar);
        this.k = (int) j;
        this.l = function0;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.l;
        short s = this.k;
        switch (b) {
            case 0:
                return new rjq((ndd) obj2, s, yjeVar);
            default:
                return new rjq(s, (Function0) obj2, yjeVar);
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
        return ((rjq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.l;
        short s = this.k;
        switch (b) {
            case 0:
                long j = s;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "applyScreenFlash: Waiting for ScreenFlashListener to be completed");
                    }
                    this.j = true;
                    obj = vzb.y((ndd) obj2, j, this);
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
                if (((Boolean) obj).booleanValue()) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "applyScreenFlash: ScreenFlashListener completed");
                    }
                } else if (l8x.j0()) {
                    Log.w("CXCP", "applyScreenFlash: ScreenFlashListener completion timed out after " + j + " ms");
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(s, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((Function0) obj2).invoke();
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public rjq(ndd nddVar, long j, yje yjeVar) {
        super(2, yjeVar);
        this.l = nddVar;
        this.k = (int) j;
    }
}
