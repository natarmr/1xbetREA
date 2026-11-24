package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class h8z implements waz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f12653a;
    public final Function2 b;
    public final Function1 c;
    public final ugd d;

    public h8z(Function1 function1, Function2 function2, Function1 function3, ugd ugdVar) {
        this.f12653a = function1;
        this.b = function2;
        this.c = function3;
        this.d = ugdVar;
    }

    @Override // a.waz
    public final Function1 getKey() {
        return this.f12653a;
    }

    @Override // a.waz
    public final Function1 getType() {
        return this.c;
    }
}
