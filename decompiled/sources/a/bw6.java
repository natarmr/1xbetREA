package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bw6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3311a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ pz40 c;

    public /* synthetic */ bw6(byte b, pz40 pz40Var, Function0 function0) {
        this.f3311a = b;
        this.b = function0;
        this.c = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3311a;
        pz40 pz40Var = this.c;
        Function0 function0 = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                pz40Var.setValue(bool);
                if (zBooleanValue && function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                pz40Var.setValue(bool);
                if (zBooleanValue2 && function0 != null) {
                    function0.invoke();
                }
                break;
        }
        return Unit.f46060a;
    }
}
