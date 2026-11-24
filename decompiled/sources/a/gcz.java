package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gcz implements waz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f11082a;
    public final Function1 b;
    public final ydr c;

    public gcz(Function1 function1, Function1 function2, ydr ydrVar) {
        this.f11082a = function1;
        this.b = function2;
        this.c = ydrVar;
    }

    @Override // a.waz
    public final Function1 getKey() {
        return this.f11082a;
    }

    @Override // a.waz
    public final Function1 getType() {
        return this.b;
    }
}
