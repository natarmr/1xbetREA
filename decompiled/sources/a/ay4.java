package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.make_bet.impl.presentation.model.CoefStepInputUiModel;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class ay4 extends bnn0 implements Function2 {
    public double i;
    public double j;
    public double k;
    public hru l;
    public qvo0 m;
    public long n;
    public int o;
    public byte p;
    public final /* synthetic */ fy4 q;
    public final /* synthetic */ CoefStepInputUiModel r;
    public final /* synthetic */ StepInputUiModel s;
    public final /* synthetic */ double t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay4(fy4 fy4Var, CoefStepInputUiModel coefStepInputUiModel, StepInputUiModel stepInputUiModel, double d, yje yjeVar) {
        super(2, yjeVar);
        this.q = fy4Var;
        this.r = coefStepInputUiModel;
        this.s = stepInputUiModel;
        this.t = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ay4(this.q, this.r, this.s, this.t, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ay4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0103  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011d, code lost:
    
        if (r0 == r11) goto L31;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ay4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
