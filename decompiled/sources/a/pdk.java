package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class pdk extends fdk implements Function2 {
    public final qdk k;

    public pdk(qdk qdkVar) {
        this.k = qdkVar;
    }

    @Override // a.cdk
    public final rdk B() {
        return this.k;
    }

    @Override // a.biy
    public final iiy c() {
        return this.k;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pdk) this.k.q.getValue()).call(obj, obj2);
    }
}
