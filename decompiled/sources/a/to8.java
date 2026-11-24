package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class to8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f34270a;
    public final /* synthetic */ float b;

    public to8(float f, float f2) {
        this.f34270a = f;
        this.b = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            zq8.a(0, fetVar, o7k0.p(jm40.b, this.f34270a, this.b));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
