package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rwy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31237a;
    public final /* synthetic */ fql0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ rwy(fql0 fql0Var, Function1 function1, byte b) {
        this.f31237a = b;
        this.b = fql0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31237a;
        Function1 function1 = this.c;
        fql0 fql0Var = this.b;
        h2l0 h2l0Var = (h2l0) obj;
        switch (b) {
            case 0:
                h2l0Var.getClass();
                sfl0 sfl0Var = fql0Var.g;
                if (sfl0Var == sfl0.c || sfl0Var == sfl0.b) {
                    function1.invoke(new j62(fql0Var.f9981a));
                } else {
                    function1.invoke(new p62(fql0Var));
                }
                break;
            case 1:
                h2l0Var.getClass();
                sfl0 sfl0Var2 = fql0Var.g;
                if (sfl0Var2 == sfl0.c || sfl0Var2 == sfl0.b) {
                    function1.invoke(new j62(fql0Var.f9981a));
                } else {
                    function1.invoke(new p62(fql0Var));
                }
                break;
            case 2:
                h2l0Var.getClass();
                sfl0 sfl0Var3 = fql0Var.g;
                if (sfl0Var3 == sfl0.c || sfl0Var3 == sfl0.b) {
                    function1.invoke(new j62(fql0Var.f9981a));
                } else {
                    function1.invoke(new p62(fql0Var));
                }
                break;
            default:
                h2l0Var.getClass();
                sfl0 sfl0Var4 = fql0Var.g;
                if (sfl0Var4 == sfl0.c || sfl0Var4 == sfl0.b) {
                    function1.invoke(new j62(fql0Var.f9981a));
                } else {
                    function1.invoke(new p62(fql0Var));
                }
                break;
        }
        return Unit.f46060a;
    }
}
