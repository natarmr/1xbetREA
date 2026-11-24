package a;

import android.view.View;
import android.widget.LinearLayout;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class utf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36252a = 0;
    public final /* synthetic */ due0 b;
    public final /* synthetic */ cp c;

    public /* synthetic */ utf0(cp cpVar, due0 due0Var) {
        this.c = cpVar;
        this.b = due0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36252a;
        cp cpVar = this.c;
        due0 due0Var = this.b;
        switch (b) {
            case 0:
                ((List) obj).getClass();
                yfu0 yfu0Var = cpVar.u;
                LinearLayout linearLayout = ((axx) yfu0Var).f1643a;
                linearLayout.getClass();
                dyb.c0(linearLayout, new utf0(due0Var, cpVar));
                axx axxVar = (axx) yfu0Var;
                axxVar.b.setImageResource(((zvf0) cpVar.u()).f45054a);
                axxVar.c.setText(cpVar.v(((zvf0) cpVar.u()).b));
                break;
            default:
                ((View) obj).getClass();
                Object objU = cpVar.u();
                File filesDir = ((axx) cpVar.u).f1643a.getContext().getFilesDir();
                filesDir.getClass();
                due0Var.invoke(objU, filesDir);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ utf0(due0 due0Var, cp cpVar) {
        this.b = due0Var;
        this.c = cpVar;
    }
}
