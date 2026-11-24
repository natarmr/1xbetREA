package a;

import android.util.Log;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tot0 extends bnn0 implements Function1 {
    public int i;
    public boolean j;
    public final /* synthetic */ xot0 k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tot0(xot0 xot0Var, int i, yje yjeVar) {
        super(1, yjeVar);
        this.k = xot0Var;
        this.l = i;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new tot0(this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((tot0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        odd oddVarB;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        try {
            if (!z) {
                z1x.P(obj);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#setTorchOffAsync");
                }
                xot0 xot0Var = this.k;
                int i2 = this.l;
                b0a b0aVarA = xot0Var.c.a();
                this.i = i2;
                this.j = true;
                obj = b0aVarA.c(this);
                if (obj == wneVar) {
                    return wneVar;
                }
                i = i2;
            } else {
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = this.i;
                z1x.P(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                e0a e0aVar = (e0a) autoCloseable;
                z40 z40Var = new z40(i);
                if (e0aVar.f6978a.a()) {
                    c99.t(e0aVar, " after close.", "Cannot call setTorchOff on ");
                    oddVarB = null;
                } else {
                    hke hkeVar = e0aVar.c;
                    hkeVar.getClass();
                    oddVarB = hke.b(hkeVar, z40Var, null, null, new xjq(0), null, null, null, 118);
                }
                ay3.L(autoCloseable, null);
                return oddVarB;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ay3.L(autoCloseable, th);
                    throw th2;
                }
            }
        } catch (CancellationException e) {
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "Cannot acquire the CameraGraph.Session", e);
            }
            return xot0.l;
        }
    }
}
