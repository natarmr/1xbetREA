package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class dvy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xdr f6768a;
    public final /* synthetic */ int b;

    public dvy(xdr xdrVar, int i) {
        this.f6768a = xdrVar;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Long lValueOf = Long.valueOf(((Number) obj).longValue());
        Integer numValueOf = Integer.valueOf(this.b);
        this.f6768a.F(lValueOf, numValueOf, (String) obj2);
        return Unit.f46060a;
    }
}
