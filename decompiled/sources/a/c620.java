package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.coupon.impl.make_bet.presentation.model.CoefStepInputUiModel;
import org.xplatform.coupon.impl.make_bet.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class c620 extends bnn0 implements Function2 {
    public kxu i;
    public q4f j;
    public double k;
    public byte l;
    public final /* synthetic */ h620 m;
    public final /* synthetic */ StepInputUiModel n;
    public final /* synthetic */ q4f o;
    public final /* synthetic */ CoefStepInputUiModel p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c620(h620 h620Var, StepInputUiModel stepInputUiModel, q4f q4fVar, CoefStepInputUiModel coefStepInputUiModel, yje yjeVar) {
        super(2, yjeVar);
        this.m = h620Var;
        this.n = stepInputUiModel;
        this.o = q4fVar;
        this.p = coefStepInputUiModel;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new c620(this.m, this.n, this.o, this.p, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c620) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0096, code lost:
    
        if (r0 == r11) goto L19;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c620.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
