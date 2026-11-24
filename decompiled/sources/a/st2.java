package a;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class st2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32754a;
    public final /* synthetic */ rv2 b;

    public /* synthetic */ st2(rv2 rv2Var, byte b) {
        this.f32754a = b;
        this.b = rv2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32754a;
        rv2 rv2Var = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(Float.isNaN(rv2Var.f.l()) ? 0.0f : rv2Var.f.l());
            case 1:
                return Float.valueOf(Float.isNaN(rv2Var.f.l()) ? 0.0f : rv2Var.f.l());
            case 2:
                return Float.valueOf(Float.isNaN(rv2Var.f.l()) ? 0.0f : rv2Var.f.l());
            case 3:
                return androidx.compose.runtime.e.a(rv2Var.f.l());
            case 4:
                Object value = ((hgk0) rv2Var.h).getValue();
                if (value != null) {
                    return value;
                }
                float fL = rv2Var.f.l();
                pz40 pz40Var = rv2Var.c;
                if (Float.isNaN(fL)) {
                    return ((hgk0) pz40Var).getValue();
                }
                hgk0 hgk0Var = (hgk0) pz40Var;
                float fD = rv2Var.d().d(hgk0Var.getValue());
                if (Float.isNaN(fD) || fL == fD) {
                    return hgk0Var.getValue();
                }
                Object objA = rv2Var.d().a(fL);
                return objA == null ? hgk0Var.getValue() : objA;
            case 5:
                return rv2Var.d();
            case 6:
                return new Pair(rv2Var.d(), rv2Var.e.getValue());
            default:
                return (py20) ((hgk0) rv2Var.d).getValue();
        }
    }
}
