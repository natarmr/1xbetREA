package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kpp0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18686a;
    public final /* synthetic */ pw4 b;

    public /* synthetic */ kpp0(pw4 pw4Var, byte b) {
        this.f18686a = b;
        this.b = pw4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18686a;
        pw4 pw4Var = this.b;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                ConstraintLayout constraintLayout = ((es6) cpVar.u).f8314a;
                constraintLayout.getClass();
                dyb.O(constraintLayout, new kpp0(pw4Var, (byte) 1));
                cpVar.t(new pgj0(cpVar, cpVar, (byte) 16));
                break;
            default:
                ((View) obj).getClass();
                pw4Var.invoke();
                break;
        }
        return Unit.f46060a;
    }
}
