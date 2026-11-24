package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class jwk implements jff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f17255a;
    public kwk b;

    public jwk(Function1 function1) {
        this.f17255a = function1;
    }

    @Override // a.jff0
    public final void c() {
        this.b = (kwk) this.f17255a.invoke(m0x0.j);
    }

    @Override // a.jff0
    public final void g() {
        kwk kwkVar = this.b;
        if (kwkVar != null) {
            kwkVar.a();
        }
        this.b = null;
    }

    @Override // a.jff0
    public final void f() {
    }
}
