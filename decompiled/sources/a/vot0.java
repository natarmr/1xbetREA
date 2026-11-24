package a;

import android.util.Log;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vot0 extends bnn0 implements Function1 {
    public List i;
    public List j;
    public List k;
    public boolean l;
    public final /* synthetic */ xot0 m;
    public final /* synthetic */ List n;
    public final /* synthetic */ List o;
    public final /* synthetic */ List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vot0(xot0 xot0Var, List list, List list2, List list3, yje yjeVar) {
        super(1, yjeVar);
        this.m = xot0Var;
        this.n = list;
        this.o = list2;
        this.p = list3;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new vot0(this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((vot0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List listC;
        List listC2;
        List listC3;
        wne wneVar = wne.f39444a;
        boolean z = this.l;
        try {
            if (!z) {
                z1x.P(obj);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#update3aRegions");
                }
                xot0 xot0Var = this.m;
                List list = this.n;
                List list2 = this.o;
                List list3 = this.p;
                b0a b0aVarA = xot0Var.c.a();
                this.i = list;
                this.j = list2;
                this.k = list3;
                this.l = true;
                obj = b0aVarA.c(this);
                if (obj == wneVar) {
                    return wneVar;
                }
                listC = list;
                listC2 = list2;
                listC3 = list3;
            } else {
                if (!z) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                listC3 = this.k;
                listC2 = this.j;
                listC = this.i;
                z1x.P(obj);
            }
            AutoCloseable autoCloseable = (AutoCloseable) obj;
            try {
                e0a e0aVar = (e0a) autoCloseable;
                if (listC == null) {
                    listC = qx3.c(uz9.f36526a);
                }
                List list4 = listC;
                if (listC2 == null) {
                    listC2 = qx3.c(uz9.f36526a);
                }
                List list5 = listC2;
                if (listC3 == null) {
                    listC3 = qx3.c(uz9.f36526a);
                }
                jzj jzjVarA = vy9.a(e0aVar, null, null, null, list4, list5, listC3, 7);
                ay3.L(autoCloseable, null);
                return jzjVarA;
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
