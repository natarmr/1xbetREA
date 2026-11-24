package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a68 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f305a;
    public final /* synthetic */ e68 b;

    public /* synthetic */ a68(e68 e68Var, byte b) {
        this.f305a = b;
        this.b = e68Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f305a;
        e68 e68Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                cl5 cl5Var = e68.N1;
                str.getClass();
                e68Var.H0().w(new v58(str));
                break;
            default:
                cl5 cl5Var2 = e68.N1;
                ((View) obj).getClass();
                e68Var.H0().k.f(h68.f12518a);
                break;
        }
        return Unit.f46060a;
    }
}
