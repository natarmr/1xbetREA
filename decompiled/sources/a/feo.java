package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class feo extends heo {
    public final n5a c;
    public final /* synthetic */ jeo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feo(jeo jeoVar, long j, n5a n5aVar) {
        super(j);
        this.d = jeoVar;
        this.c = n5aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.D(this.d, Unit.f46060a);
    }

    @Override // a.heo
    public final String toString() {
        return super.toString() + this.c;
    }
}
