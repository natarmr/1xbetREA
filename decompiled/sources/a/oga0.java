package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class oga0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ka00 f25209a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function1 c;

    public oga0(ka00 ka00Var, boolean z, Function1 function1) {
        this.f25209a = ka00Var;
        this.b = z;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            g1x.i((ia00) this.f25209a, this.b, this.c, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
