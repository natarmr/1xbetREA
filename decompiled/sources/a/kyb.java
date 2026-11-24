package a;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kyb extends vw5 {
    public final pru d;
    public final kh3 e;
    public final gsd f;
    public final List g;
    public final p7m0 h;
    public Function1 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyb(o8f o8fVar, nff0 nff0Var, pru pruVar, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        nff0Var.getClass();
        this.d = pruVar;
        this.e = kh3.CONFIG;
        this.f = gsd.APP_BLOCK;
        this.g = kotlin.collections.a.c(nff0Var);
        this.h = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        i8d i8dVar = i8d.b;
        p7m0 p7m0Var = this.h;
        p7m0Var.o(null, i8dVar);
        boolean z = this.d.a().G1;
        p7m0Var.o(null, z ? i8d.d : i8d.c);
        Function1 function1 = this.i;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.e;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.h;
    }

    @Override // a.vw5
    public final List d() {
        return this.g;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.f;
    }
}
