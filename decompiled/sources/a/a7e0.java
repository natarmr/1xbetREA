package a;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a7e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f365a;
    public final /* synthetic */ j2m0 b;
    public final /* synthetic */ c3m0 c;

    public /* synthetic */ a7e0(j2m0 j2m0Var, c3m0 c3m0Var, byte b) {
        this.f365a = b;
        this.b = j2m0Var;
        this.c = c3m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f365a;
        c3m0 c3m0Var = this.c;
        j2m0 j2m0Var = this.b;
        FrameLayout frameLayout = (FrameLayout) obj;
        switch (b) {
            case 0:
                frameLayout.getClass();
                j2m0Var.c(c3m0Var);
                break;
            default:
                frameLayout.getClass();
                j2m0Var.c(c3m0Var);
                break;
        }
        return Unit.f46060a;
    }
}
