package a;

import android.view.View;
import org.xplatform.ui_core.viewcomponents.views.MakeBetBalanceViewDs;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dvj0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6746a;
    public final /* synthetic */ jvj0 b;

    public /* synthetic */ dvj0(jvj0 jvj0Var, MakeBetBalanceViewDs makeBetBalanceViewDs) {
        this.f6746a = (byte) 1;
        this.b = jvj0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f6746a;
        jvj0 jvj0Var = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = jvj0.W1;
                jvj0Var.J0().L(jvj0.class.getSimpleName());
                break;
            case 1:
                zie0 zie0Var2 = jvj0.W1;
                jvj0Var.J0().L("MakeBetBalanceViewDs");
                break;
            default:
                zie0 zie0Var3 = jvj0.W1;
                jvj0Var.J0().K();
                break;
        }
    }

    public /* synthetic */ dvj0(jvj0 jvj0Var, byte b) {
        this.f6746a = b;
        this.b = jvj0Var;
    }
}
