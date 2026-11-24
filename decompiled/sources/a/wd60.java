package a;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wd60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38958a = 1;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ ywv0 c;

    public /* synthetic */ wd60(l7m0 l7m0Var, ywv0 ywv0Var) {
        this.b = l7m0Var;
        this.c = ywv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0052  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        byte b = this.f38958a;
        ywv0 ywv0Var = this.c;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                return new Pair(Boolean.valueOf(ywv0Var.d.f()), l7m0Var.getValue());
            default:
                if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                    vkr0 vkr0Var = ywv0Var.m;
                    if (((h0q0) vkr0Var.b).p().e) {
                        trm0 trm0Var = (trm0) vkr0Var.d;
                        if (((Number) ((hgk0) ((pz40) trm0Var.b)).getValue()).intValue() > ((Number) ((hgk0) ((pz40) trm0Var.c)).getValue()).intValue() * 1.5f) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ wd60(ywv0 ywv0Var, l7m0 l7m0Var) {
        this.c = ywv0Var;
        this.b = l7m0Var;
    }
}
