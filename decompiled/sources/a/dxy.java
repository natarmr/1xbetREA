package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class dxy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6868a;
    public final /* synthetic */ ek00 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ dxy(ek00 ek00Var, Function1 function1, byte b) {
        this.f6868a = b;
        this.b = ek00Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f6868a;
        Function1 function1 = this.c;
        ek00 ek00Var = this.b;
        switch (b) {
            case 0:
                ((h2l0) obj).getClass();
                if (ek00Var.d) {
                    function1.invoke(new tc2(ek00Var.f7932a));
                }
                break;
            case 1:
                ((h2l0) obj).getClass();
                if (ek00Var.d) {
                    function1.invoke(new tc2(ek00Var.f7932a));
                }
                break;
            case 2:
                ((h2l0) obj).getClass();
                if (ek00Var.d) {
                    function1.invoke(new tc2(ek00Var.f7932a));
                }
                break;
            default:
                ((h2l0) obj).getClass();
                if (ek00Var.d) {
                    function1.invoke(new tc2(ek00Var.f7932a));
                }
                break;
        }
        return Unit.f46060a;
    }
}
