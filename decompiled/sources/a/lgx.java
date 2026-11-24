package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class lgx implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ugd f20027a;
    public final /* synthetic */ zgx b;
    public final /* synthetic */ int c;
    public final /* synthetic */ g9z d;

    public lgx(ugd ugdVar, zgx zgxVar, int i, g9z g9zVar) {
        this.f20027a = ugdVar;
        this.b = zgxVar;
        this.c = i;
        this.d = g9zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            this.f20027a.O(this.b.f44365a, Integer.valueOf(this.c), g9z.b(this.d, jm40.b, null, 7), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
