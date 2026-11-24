package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class wdz implements waz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f38995a;
    public final Function1 b;
    public final Function1 c;
    public final ugd d;

    public wdz(Function1 function1, Function1 function2, Function1 function3, ugd ugdVar) {
        this.f38995a = function1;
        this.b = function2;
        this.c = function3;
        this.d = ugdVar;
    }

    @Override // a.waz
    public final Function1 getKey() {
        return this.f38995a;
    }

    @Override // a.waz
    public final Function1 getType() {
        return this.b;
    }
}
