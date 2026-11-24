package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vs90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37940a;
    public final /* synthetic */ jie0 b;
    public final /* synthetic */ qah0 c;

    public /* synthetic */ vs90(jie0 jie0Var, qah0 qah0Var, byte b) {
        this.f37940a = b;
        this.b = jie0Var;
        this.c = qah0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37940a;
        qah0 qah0Var = this.c;
        jie0 jie0Var = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        ((Float) obj2).getClass();
        switch (b) {
            case 0:
                float f = fFloatValue - jie0Var.f16571a;
                jie0Var.f16571a = fFloatValue;
                Math.abs(qah0Var.a(f) - f);
                break;
            default:
                float f2 = jie0Var.f16571a;
                jie0Var.f16571a = qah0Var.a(fFloatValue - f2) + f2;
                break;
        }
        return Unit.f46060a;
    }
}
