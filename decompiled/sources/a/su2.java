package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class su2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32801a;
    public final /* synthetic */ mv2 b;
    public final /* synthetic */ jie0 c;

    public /* synthetic */ su2(mv2 mv2Var, jie0 jie0Var, byte b) {
        this.f32801a = b;
        this.b = mv2Var;
        this.c = jie0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32801a;
        jie0 jie0Var = this.c;
        mv2 mv2Var = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        switch (b) {
            case 0:
                qv2 qv2Var = mv2Var.f22438a;
                ((agk0) qv2Var.l).m(fFloatValue);
                ((agk0) qv2Var.m).m(fFloatValue2);
                jie0Var.f16571a = fFloatValue;
                break;
            default:
                qv2 qv2Var2 = mv2Var.f22438a;
                ((agk0) qv2Var2.l).m(fFloatValue);
                ((agk0) qv2Var2.m).m(fFloatValue2);
                jie0Var.f16571a = fFloatValue;
                break;
        }
        return Unit.f46060a;
    }
}
