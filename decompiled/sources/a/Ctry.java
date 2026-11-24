package a;

import kotlin.Unit;

/* JADX INFO: renamed from: a.try, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class Ctry extends hsy implements qhy {
    public final ury e;

    public Ctry(ury uryVar) {
        this.e = uryVar;
    }

    @Override // a.biy
    public final iiy c() {
        return this.e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws c44 {
        this.e.set(obj);
        return Unit.f46060a;
    }

    @Override // a.esy
    public final osy u() {
        return this.e;
    }
}
