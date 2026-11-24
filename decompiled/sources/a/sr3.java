package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes.dex */
public final class sr3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ApplicationActivity k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr3(ApplicationActivity applicationActivity, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = applicationActivity;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ApplicationActivity applicationActivity = this.k;
        switch (b) {
            case 0:
                return new sr3(applicationActivity, yjeVar, (byte) 0);
            default:
                return new sr3(applicationActivity, yjeVar, (byte) 1);
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
        return ((sr3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ApplicationActivity applicationActivity = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    uhv0.T0.getClass();
                    gmq gmqVarW = i120.W(new lr(thv0.a(applicationActivity).g(applicationActivity), (byte) 20));
                    pr3 pr3Var = new pr3(applicationActivity, (byte) 0);
                    this.j = true;
                    if (gmqVarW.c(pr3Var, this) == wneVar) {
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
                if (!z2) {
                    z1x.P(obj);
                    glz glzVar = applicationActivity.f44297a;
                    lkz lkzVar = lkz.d;
                    y32 y32Var = new y32(applicationActivity, yjeVar, (byte) 18);
                    this.j = true;
                    if (efx.H(glzVar, lkzVar, y32Var, this) == wneVar2) {
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
