package a;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ubh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35381a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ ubh0(pz40 pz40Var, pz40 pz40Var2, byte b) {
        this.f35381a = b;
        this.b = pz40Var;
        this.c = pz40Var2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35381a;
        pz40 pz40Var = this.c;
        pz40 pz40Var2 = this.b;
        switch (b) {
            case 0:
                return new Pair(pz40Var2.getValue(), pz40Var.getValue());
            case 1:
                return new Pair(pz40Var2.getValue(), pz40Var.getValue());
            default:
                return Float.valueOf(((Number) ((Function0) pz40Var2.getValue()).invoke()).floatValue() / (((Number) pz40Var.getValue()).floatValue() / 1000.0f));
        }
    }
}
