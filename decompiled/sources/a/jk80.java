package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class jk80 extends androidx.compose.foundation.lazy.layout.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f16655a;
    public final zz2 b;

    public jk80(ydr ydrVar, Function1 function1, int i) {
        this.f16655a = function1;
        zz2 zz2Var = new zz2((byte) 14);
        zz2Var.a(i, new gk80(function1, ydrVar));
        this.b = zz2Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final zz2 b() {
        return this.b;
    }
}
