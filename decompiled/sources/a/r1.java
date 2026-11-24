package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ s1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(s1 s1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = s1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        s1 s1Var = this.j;
        switch (b) {
            case 0:
                return new r1(s1Var, yjeVar, (byte) 0);
            default:
                return new r1(s1Var, yjeVar, (byte) 1);
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
        return ((r1) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        yje yjeVar = null;
        s1 s1Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (s1Var.Z == null) {
                    rsw rswVar = new rsw();
                    gy40 gy40Var = s1Var.q;
                    if (gy40Var != null) {
                        qjj.W(s1Var.N0(), null, null, new l1(gy40Var, rswVar, yjeVar, (byte) 0), 3);
                    }
                    s1Var.Z = rswVar;
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                rsw rswVar2 = s1Var.Z;
                if (rswVar2 != null) {
                    ssw sswVar = new ssw(rswVar2);
                    gy40 gy40Var2 = s1Var.q;
                    if (gy40Var2 != null) {
                        qjj.W(s1Var.N0(), null, null, new l1(gy40Var2, sswVar, yjeVar, (byte) 1), 3);
                    }
                    s1Var.Z = null;
                }
                break;
        }
        return Unit.f46060a;
    }
}
