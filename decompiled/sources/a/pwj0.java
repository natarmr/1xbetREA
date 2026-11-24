package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class pwj0 extends bnn0 implements Function2 {
    public final /* synthetic */ xxj0 i;
    public final /* synthetic */ hxu j;
    public final /* synthetic */ StepInputUiModel k;
    public final /* synthetic */ double l;
    public final /* synthetic */ txu m;
    public final /* synthetic */ double n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pwj0(xxj0 xxj0Var, hxu hxuVar, StepInputUiModel stepInputUiModel, double d, txu txuVar, double d2, yje yjeVar) {
        super(2, yjeVar);
        this.i = xxj0Var;
        this.j = hxuVar;
        this.k = stepInputUiModel;
        this.l = d;
        this.m = txuVar;
        this.n = d2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new pwj0(this.i, this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pwj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        xxj0 xxj0Var = this.i;
        xxj0Var.getClass();
        StepInputUiModel stepInputUiModel = this.k;
        double dW = xxj0Var.w(stepInputUiModel.f46773a, this.l, this.n);
        String str = stepInputUiModel.f;
        ctf0 ctf0Var = xxj0Var.m;
        nwo0 nwo0Var = xxj0Var.o0;
        boolean z = nwo0Var.f24244a;
        hxu hxuVar = this.j;
        xxj0Var.P(new pnb0(ydx.D(dW, str, hxuVar, this.m, ctf0Var, z || (nwo0Var.b && !Intrinsics.d(hxuVar, hxu.h)), ((StepInputUiModel) xxj0Var.C0.getValue()).q)));
        return Unit.f46060a;
    }
}
