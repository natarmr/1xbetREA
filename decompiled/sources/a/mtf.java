package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class mtf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22368a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ cgk0 c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ mtf(a4x a4xVar, cgk0 cgk0Var, pz40 pz40Var, byte b) {
        this.f22368a = b;
        this.b = a4xVar;
        this.c = cgk0Var;
        this.d = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22368a;
        pz40 pz40Var = this.d;
        cgk0 cgk0Var = this.c;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                cgk0Var.m(a4xVar.size());
                pz40Var.setValue(Boolean.FALSE);
                break;
            default:
                cgk0Var.m(a4xVar.size());
                pz40Var.setValue(Boolean.FALSE);
                break;
        }
        return Unit.f46060a;
    }
}
