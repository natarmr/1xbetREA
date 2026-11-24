package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10486a;
    public final /* synthetic */ r11 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ g11(r11 r11Var, Function1 function1, byte b) {
        this.f10486a = b;
        this.b = r11Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10486a;
        r11 r11Var = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                fxb.D(ivb0.b, new g11(r11Var, function1, (byte) 6)).a();
                break;
            case 1:
                fxb.D(ivb0.b, new g11(r11Var, function1, (byte) 9)).a();
                break;
            case 2:
                fxb.D(ivb0.b, new g11(function1, r11Var, (byte) 10)).a();
                break;
            case 3:
                fxb.D(ivb0.b, new g11(r11Var, function1, (byte) 7)).a();
                break;
            case 4:
                fxb.D(ivb0.b, new g11(r11Var, function1, (byte) 8)).a();
                break;
            case 5:
                function1.invoke(new o01(r11Var.g));
                break;
            case 6:
                vf8 vf8Var = r11Var.c;
                if (vf8Var != null) {
                    function1.invoke(new j01(vf8Var.f37319a, vf8Var.b, vf8Var.c, vf8Var.d));
                }
                break;
            case 7:
                vf8 vf8Var2 = r11Var.e;
                if (vf8Var2 != null) {
                    nw80 nw80Var = vf8Var2.f37319a;
                    m7m0 m7m0Var = vf8Var2.b;
                    function1.invoke(new h01(vf8Var2.c, vf8Var2.e, nw80Var, m7m0Var, vf8Var2.d));
                }
                break;
            case 8:
                vf8 vf8Var3 = r11Var.f;
                if (vf8Var3 != null) {
                    nw80 nw80Var2 = vf8Var3.f37319a;
                    m7m0 m7m0Var2 = vf8Var3.b;
                    function1.invoke(new l01(vf8Var3.c, vf8Var3.e, nw80Var2, m7m0Var2, vf8Var3.d));
                }
                break;
            case 9:
                vf8 vf8Var4 = r11Var.d;
                if (vf8Var4 != null) {
                    function1.invoke(new i01(vf8Var4.f37319a, vf8Var4.b, vf8Var4.c, vf8Var4.d));
                }
                break;
            default:
                function1.invoke(new g01(r11Var.g));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ g11(Function1 function1, r11 r11Var, byte b) {
        this.f10486a = b;
        this.c = function1;
        this.b = r11Var;
    }
}
