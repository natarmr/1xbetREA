package a;

import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pi3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ij3 j;
    public final /* synthetic */ String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pi3(ij3 ij3Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = ij3Var;
        this.k = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.k;
        ij3 ij3Var = this.j;
        switch (b) {
            case 0:
                return new pi3(ij3Var, str, yjeVar, (byte) 0);
            default:
                return new pi3(ij3Var, str, yjeVar, (byte) 1);
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
        return ((pi3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ij3 ij3Var = this.j;
                boolean z = ij3Var.y().Q0.b == eh3.VIDEO && Build.VERSION.SDK_INT >= 29;
                boolean z2 = ij3Var.y().Q0.b == eh3.REMOTE_IMAGE;
                if (z || z2) {
                    sac.V(jiu0.a(ij3Var), xi3.f40923a, null, ij3Var.e.c, new yi3(ij3Var, this.k, z, z2, null, (byte) 0), 10);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ij3 ij3Var2 = this.j;
                boolean z3 = ij3Var2.y().R0.d == qm3.VIDEO && Build.VERSION.SDK_INT >= 29;
                boolean z4 = ij3Var2.y().R0.d == qm3.REMOTE_IMAGE;
                if (z3 || z4) {
                    sac.V(jiu0.a(ij3Var2), zi3.f44421a, null, ij3Var2.e.c, new yi3(ij3Var2, this.k, z3, z4, null, (byte) 1), 10);
                }
                break;
        }
        return Unit.f46060a;
    }
}
