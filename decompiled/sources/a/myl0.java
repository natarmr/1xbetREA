package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class myl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22607a;
    public final /* synthetic */ syl0 b;

    public /* synthetic */ myl0(syl0 syl0Var, byte b) {
        this.f22607a = b;
        this.b = syl0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22607a;
        syl0 syl0Var = this.b;
        switch (b) {
            case 0:
                eke0 eke0Var = syl0.f2;
                ((View) obj).getClass();
                syl0Var.H0().x(qzl0.f29584a);
                break;
            case 1:
                eke0 eke0Var2 = syl0.f2;
                ((View) obj).getClass();
                syl0Var.H0().x(lzl0.f20912a);
                break;
            default:
                mk50 mk50Var = (mk50) obj;
                eke0 eke0Var3 = syl0.f2;
                mk50Var.getClass();
                syl0Var.H0().x(new jzl0(mk50Var));
                break;
        }
        return Unit.f46060a;
    }
}
