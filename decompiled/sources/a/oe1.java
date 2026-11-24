package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oe1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25100a;
    public final /* synthetic */ gg1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ oe1(gg1 gg1Var, Function1 function1, byte b) {
        this.f25100a = b;
        this.b = gg1Var;
        this.c = function1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object cd1Var;
        byte b = this.f25100a;
        String str = "";
        gg1 gg1Var = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                ozh ozhVar = ((bg1) gg1Var).f2532a;
                if (ozhVar instanceof kzh) {
                    str = "start";
                } else if (ozhVar instanceof izh) {
                    str = "progress";
                } else if (ozhVar instanceof jzh) {
                    str = "finish";
                }
                function1.invoke(new dd1(str));
                break;
            case 1:
                ozh ozhVar2 = ((bg1) gg1Var).f2532a;
                long jL = thb.L(ozhVar2);
                boolean z = ozhVar2 instanceof izh;
                if (z) {
                    izh izhVar = (izh) ozhVar2;
                    if (izhVar.s == qll.GAMING) {
                        cd1Var = new ed1(izhVar.q, izhVar.t);
                    } else if (jL == 0) {
                        if (ozhVar2 instanceof kzh) {
                            str = "start";
                        } else if (z) {
                            str = "progress";
                        } else if (ozhVar2 instanceof jzh) {
                            str = "finish";
                        }
                        cd1Var = new dd1(str);
                    } else {
                        cd1Var = new cd1(thb.L(ozhVar2));
                    }
                } else if (jL == 0) {
                    if (ozhVar2 instanceof kzh) {
                        str = "start";
                    } else if (z) {
                        str = "progress";
                    } else if (ozhVar2 instanceof jzh) {
                        str = "finish";
                    }
                    cd1Var = new dd1(str);
                } else {
                    cd1Var = new cd1(thb.L(ozhVar2));
                }
                function1.invoke(cd1Var);
                break;
            case 2:
                fxb.D(ivb0.b, new oe1(gg1Var, function1, (byte) 1)).a();
                break;
            default:
                fxb.D(ivb0.b, new oe1(function1, gg1Var, (byte) 0)).a();
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ oe1(Function1 function1, gg1 gg1Var, byte b) {
        this.f25100a = b;
        this.c = function1;
        this.b = gg1Var;
    }
}
