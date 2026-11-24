package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class fsl extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Function0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fsl(boolean z, boolean z2, Function0 function0, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = z;
        this.k = z2;
        this.l = function0;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new fsl(this.j, this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new fsl(this.j, this.k, this.l, yjeVar, (byte) 1);
            case 2:
                return new fsl(this.j, this.k, this.l, yjeVar, (byte) 2);
            default:
                return new fsl(this.j, this.k, this.l, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((fsl) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function0 function0 = this.l;
        boolean z = this.k;
        boolean z2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z2 && z) {
                    function0.invoke();
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (z2 && z) {
                    function0.invoke();
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z2 && z) {
                    function0.invoke();
                }
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (z2 && z) {
                    function0.invoke();
                }
                break;
        }
        return Unit.f46060a;
    }
}
