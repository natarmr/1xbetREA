package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bfk0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2508a;
    public final /* synthetic */ float b;
    public final /* synthetic */ jie0 c;
    public final /* synthetic */ qah0 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ bfk0(float f, jie0 jie0Var, qah0 qah0Var, Function1 function1, byte b) {
        this.f2508a = b;
        this.b = f;
        this.c = jie0Var;
        this.d = qah0Var;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fA;
        byte b = this.f2508a;
        Function1 function1 = this.e;
        qah0 qah0Var = this.d;
        jie0 jie0Var = this.c;
        float f = this.b;
        i73 i73Var = (i73) obj;
        switch (b) {
            case 0:
                float fAbs = Math.abs(((Number) ((hgk0) i73Var.e).getValue()).floatValue());
                float fAbs2 = Math.abs(f);
                pz40 pz40Var = i73Var.e;
                if (fAbs >= fAbs2) {
                    float fA0 = bdx.a0(((Number) ((hgk0) pz40Var).getValue()).floatValue(), f);
                    bdx.R(i73Var, qah0Var, function1, fA0 - jie0Var.f16571a);
                    i73Var.a();
                    jie0Var.f16571a = fA0;
                } else {
                    hgk0 hgk0Var = (hgk0) pz40Var;
                    bdx.R(i73Var, qah0Var, function1, ((Number) hgk0Var.getValue()).floatValue() - jie0Var.f16571a);
                    jie0Var.f16571a = ((Number) hgk0Var.getValue()).floatValue();
                }
                break;
            default:
                float fA1 = bdx.a0(((Number) ((hgk0) i73Var.e).getValue()).floatValue(), f);
                float f2 = fA1 - jie0Var.f16571a;
                try {
                    fA = qah0Var.a(f2);
                } catch (CancellationException unused) {
                    i73Var.a();
                    fA = 0.0f;
                }
                function1.invoke(Float.valueOf(fA));
                if (Math.abs(f2 - fA) > 0.5f || fA1 != ((Number) ((hgk0) i73Var.e).getValue()).floatValue()) {
                    i73Var.a();
                }
                jie0Var.f16571a += fA;
                break;
        }
        return Unit.f46060a;
    }
}
