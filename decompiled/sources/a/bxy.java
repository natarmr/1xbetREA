package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class bxy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3398a;
    public final /* synthetic */ ek00 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ bxy(ek00 ek00Var, Function1 function1, byte b) {
        this.f3398a = b;
        this.b = ek00Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f3398a;
        Function1 function1 = this.c;
        ek00 ek00Var = this.b;
        switch (b) {
            case 0:
                if (ek00Var.d) {
                    function1.invoke(new oc2(ek00Var.f7932a));
                }
                break;
            case 1:
                if (ek00Var.d) {
                    function1.invoke(new tc2(ek00Var.f7932a));
                }
                break;
            case 2:
                if (ek00Var.d) {
                    function1.invoke(new oc2(ek00Var.f7932a));
                }
                break;
            case 3:
                if (ek00Var.d) {
                    function1.invoke(new tc2(ek00Var.f7932a));
                }
                break;
            case 4:
                if (ek00Var.d) {
                    function1.invoke(new oc2(ek00Var.f7932a));
                }
                break;
            case 5:
                if (ek00Var.d) {
                    function1.invoke(new tc2(ek00Var.f7932a));
                }
                break;
            case 6:
                if (ek00Var.d) {
                    function1.invoke(new oc2(ek00Var.f7932a));
                }
                break;
            default:
                if (ek00Var.d) {
                    function1.invoke(new tc2(ek00Var.f7932a));
                }
                break;
        }
        return Unit.f46060a;
    }
}
