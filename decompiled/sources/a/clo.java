package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class clo implements nyq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oyq0 f4569a;
    public final nul0 b;
    public final sjj c;
    public final Function0 d;
    public final c3d e = new c3d(this, (byte) 3);

    public clo(sjj sjjVar, nul0 nul0Var, oyq0 oyq0Var, Function0 function0) {
        this.f4569a = oyq0Var;
        this.b = nul0Var;
        this.c = sjjVar;
        this.d = function0;
    }

    @Override // a.nyq0
    public final vj50 a() {
        return this.e;
    }

    @Override // a.nyq0
    public final sjj b() {
        return this.c;
    }

    @Override // a.nyq0
    public final j73 c() {
        return this.b;
    }

    @Override // a.nyq0
    public final oyq0 getState() {
        return this.f4569a;
    }
}
