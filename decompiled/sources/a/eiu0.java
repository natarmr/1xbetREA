package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eiu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public diu0 f7878a;
    public vzg0 b;

    public final diu0 s() {
        diu0 diu0Var = this.f7878a;
        if (diu0Var != null) {
            return diu0Var;
        }
        Intrinsics.h("viewModel");
        throw null;
    }

    public void u(diu0 diu0Var, vzg0 vzg0Var) {
        vzg0Var.getClass();
        this.f7878a = diu0Var;
        this.b = vzg0Var;
    }

    public void t() {
    }
}
