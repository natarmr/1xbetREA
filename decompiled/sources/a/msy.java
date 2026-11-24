package a;

/* JADX INFO: loaded from: classes2.dex */
public final class msy extends fsy implements fiy {
    public final nsy d;

    public msy(nsy nsyVar) {
        this.d = nsyVar;
    }

    @Override // a.biy
    public final iiy c() {
        return this.d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return this.d.get(obj);
    }

    @Override // a.esy
    public final osy u() {
        return this.d;
    }
}
