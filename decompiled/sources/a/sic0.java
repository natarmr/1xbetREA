package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sic0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32257a;
    public final /* synthetic */ vic0 b;

    public /* synthetic */ sic0(vic0 vic0Var, byte b) {
        this.f32257a = b;
        this.b = vic0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f32257a;
        d16 d16Var = d16.f5295a;
        vic0 vic0Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = vic0.S1;
                view.getClass();
                hjc0 hjc0VarH0 = vic0Var.H0();
                if (!hjc0VarH0.f.c()) {
                    hjc0VarH0.w(d16Var);
                } else if (hjc0VarH0.e == s470.ONE_X_LOTTERY) {
                    hjc0VarH0.w(new f16(true));
                } else {
                    hjc0VarH0.w(new f16(false));
                }
                break;
            case 1:
                iiy[] iiyVarArr2 = vic0.S1;
                view.getClass();
                hjc0 hjc0VarH1 = vic0Var.H0();
                if (hjc0VarH1.f.c()) {
                    p7m0 p7m0Var = hjc0VarH1.k;
                    cjc0 cjc0Var = new cjc0(hjc0VarH1.e);
                    p7m0Var.getClass();
                    p7m0Var.o(null, cjc0Var);
                    hjc0VarH1.x();
                } else {
                    hjc0VarH1.w(d16Var);
                }
                break;
            default:
                iiy[] iiyVarArr3 = vic0.S1;
                view.getClass();
                vic0Var.H0().x();
                break;
        }
        return Unit.f46060a;
    }
}
