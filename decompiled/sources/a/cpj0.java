package a;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cpj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ gpj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cpj0(gpj0 gpj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gpj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gpj0 gpj0Var = this.k;
        switch (b) {
            case 0:
                return new cpj0(gpj0Var, yjeVar, (byte) 0);
            default:
                return new cpj0(gpj0Var, yjeVar, (byte) 1);
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
        return ((cpj0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        gpj0 gpj0Var = this.k;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    dnq dnqVar = new dnq(gpj0Var.e.getData(), new za60((Object) gpj0Var, yjeVar, (byte) 11), (byte) 1);
                    anj0 anj0Var = new anj0(gpj0Var, b2);
                    this.j = true;
                    if (dnqVar.c(anj0Var, this) == wneVar) {
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
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                try {
                    if (!z2) {
                        z1x.P(obj);
                        wbj wbjVar = gpj0Var.e;
                        epj0 epj0Var = new epj0(gpj0Var, yjeVar, (byte) 0);
                        this.j = true;
                        if (wbjVar.a(epj0Var, this) == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        if (!z2) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    break;
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e.getMessage());
                    gji0 gji0Var = gpj0Var.h;
                    if (gji0Var == null) {
                        Intrinsics.h("localSessionData");
                        throw null;
                    }
                    gpj0Var.d.getClass();
                    gpj0Var.h = gji0.a(gji0Var, null, olq0.a(), null, 5);
                }
                return Unit.f46060a;
        }
    }
}
