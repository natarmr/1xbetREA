package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qwy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29457a;
    public final /* synthetic */ fql0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ qwy(Function1 function1, fql0 fql0Var) {
        this.f29457a = (byte) 8;
        this.c = function1;
        this.b = fql0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29457a;
        fql0 fql0Var = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                sfl0 sfl0Var = fql0Var.g;
                long j = fql0Var.f9981a;
                if (sfl0Var == sfl0.c || sfl0Var == sfl0.b) {
                    function1.invoke(new j62(j));
                } else {
                    function1.invoke(new i62(j));
                }
                break;
            case 1:
                sfl0 sfl0Var2 = fql0Var.g;
                if (sfl0Var2 != sfl0.c && sfl0Var2 != sfl0.b) {
                    function1.invoke(new l62(fql0Var.f9981a));
                }
                break;
            case 2:
                sfl0 sfl0Var3 = fql0Var.g;
                long j2 = fql0Var.f9981a;
                if (sfl0Var3 == sfl0.c || sfl0Var3 == sfl0.b) {
                    function1.invoke(new j62(j2));
                } else {
                    function1.invoke(new i62(j2));
                }
                break;
            case 3:
                sfl0 sfl0Var4 = fql0Var.g;
                if (sfl0Var4 != sfl0.c && sfl0Var4 != sfl0.b) {
                    function1.invoke(new l62(fql0Var.f9981a));
                }
                break;
            case 4:
                sfl0 sfl0Var5 = fql0Var.g;
                long j3 = fql0Var.f9981a;
                if (sfl0Var5 == sfl0.c || sfl0Var5 == sfl0.b) {
                    function1.invoke(new j62(j3));
                } else {
                    function1.invoke(new i62(j3));
                }
                break;
            case 5:
                sfl0 sfl0Var6 = fql0Var.g;
                if (sfl0Var6 != sfl0.c && sfl0Var6 != sfl0.b) {
                    function1.invoke(new l62(fql0Var.f9981a));
                }
                break;
            case 6:
                sfl0 sfl0Var7 = fql0Var.g;
                long j4 = fql0Var.f9981a;
                if (sfl0Var7 == sfl0.c || sfl0Var7 == sfl0.b) {
                    function1.invoke(new j62(j4));
                } else {
                    function1.invoke(new i62(j4));
                }
                break;
            case 7:
                sfl0 sfl0Var8 = fql0Var.g;
                if (sfl0Var8 != sfl0.c && sfl0Var8 != sfl0.b) {
                    function1.invoke(new l62(fql0Var.f9981a));
                }
                break;
            default:
                function1.invoke(new p62(fql0Var));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ qwy(fql0 fql0Var, Function1 function1, byte b) {
        this.f29457a = b;
        this.b = fql0Var;
        this.c = function1;
    }
}
