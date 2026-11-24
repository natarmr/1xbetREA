package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mdk extends fdk implements fiy {
    public final ndk k;

    public mdk(ndk ndkVar) {
        this.k = ndkVar;
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
        return this.k.get(obj);
    }
}
