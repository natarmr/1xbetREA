package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class sag0 implements eyb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f31886a;
    public final String b;

    public sag0(String str, Function1 function1) {
        this.f31886a = function1;
        this.b = "must return ".concat(str);
    }

    @Override // a.eyb
    public final /* bridge */ String a(u9y u9yVar) {
        return dyb.d0(this, u9yVar);
    }

    @Override // a.eyb
    public final boolean b(u9y u9yVar) {
        wsy wsyVar = u9yVar.h;
        int i = rek.f30339a;
        ym40 ym40VarC = oek.c(u9yVar);
        ym40VarC.getClass();
        return Intrinsics.d(wsyVar, this.f31886a.invoke(ym40VarC.c()));
    }

    @Override // a.eyb
    public final String getDescription() {
        return this.b;
    }
}
