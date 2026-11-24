package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pdb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26800a;
    public final /* synthetic */ rah0 b;

    public /* synthetic */ pdb(rah0 rah0Var, byte b) {
        this.f26800a = b;
        this.b = rah0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26800a;
        boolean z = true;
        rah0 rah0Var = this.b;
        switch (b) {
            case 0:
                if (!rah0Var.c() && !rah0Var.d()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                return Boolean.valueOf(rah0Var.h.a());
            case 2:
                if (!rah0Var.c() && !rah0Var.d()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                return Boolean.valueOf(rah0Var.f30133a.l() < rah0Var.f.l());
            case 4:
                return Boolean.valueOf(rah0Var.f30133a.l() > 0);
            default:
                if (rah0Var.f30133a.l() == 0 && !rah0Var.d()) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
