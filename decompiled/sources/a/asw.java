package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class asw implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1408a;
    public final /* synthetic */ bbl0 b;
    public final /* synthetic */ cp c;

    public /* synthetic */ asw(bbl0 bbl0Var, cp cpVar, byte b) {
        this.f1408a = b;
        this.b = bbl0Var;
        this.c = cpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1408a;
        cp cpVar = this.c;
        bbl0 bbl0Var = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                view.getClass();
                LinearLayout linearLayout = ((rsx) cpVar.u).f31053a;
                linearLayout.getClass();
                bbl0Var.invoke(linearLayout, view);
                break;
            case 1:
                view.getClass();
                LinearLayout linearLayout2 = ((ssx) cpVar.u).f32748a;
                linearLayout2.getClass();
                bbl0Var.invoke(linearLayout2, view);
                break;
            case 2:
                view.getClass();
                ConstraintLayout constraintLayout = ((vsx) cpVar.u).f37974a;
                constraintLayout.getClass();
                bbl0Var.invoke(constraintLayout, view);
                break;
            default:
                view.getClass();
                ConstraintLayout constraintLayout2 = ((wsx) cpVar.u).f39713a;
                constraintLayout2.getClass();
                bbl0Var.invoke(constraintLayout2, view);
                break;
        }
        return Unit.f46060a;
    }
}
