package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class rck extends hdk implements qhy {
    public final sck k;

    public rck(sck sckVar) {
        this.k = sckVar;
    }

    @Override // a.cdk
    public final rdk B() {
        return this.k;
    }

    @Override // a.biy
    public final iiy c() {
        return this.k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.k.set(obj);
        return Unit.f46060a;
    }
}
