package a;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class t0a extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ u0a k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0a(u0a u0aVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = u0aVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        u0a u0aVar = this.k;
        switch (b) {
            case 0:
                return new t0a(u0aVar, yjeVar, (byte) 0);
            default:
                return new t0a(u0aVar, yjeVar, (byte) 1);
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
        return ((t0a) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    r2a r2aVar = this.k.e;
                    p15 p15Var = new p15(8);
                    synchronized (r2aVar.f29720a) {
                        try {
                            if (!r2aVar.g) {
                                if (l8x.f0("CXCP")) {
                                    Log.d("CXCP", "Camera is removed, forcing state to CLOSED.");
                                }
                                r2aVar.g = true;
                                r0a r0aVar = r0a.c;
                                r2aVar.e = r0aVar;
                                r2aVar.f = p15Var;
                                r2aVar.c(r0aVar, p15Var);
                                r2aVar.d = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    ppt0 ppt0Var = this.k.f34846a;
                    this.j = true;
                    if (ppt0Var.d(this) == wneVar) {
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
                u0a u0aVar = this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ppt0 ppt0Var2 = u0aVar.f34846a;
                    this.j = true;
                    if (ppt0Var2.d(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                d5c.G(u0aVar.d.f34352a, null);
                return Unit.f46060a;
        }
    }
}
