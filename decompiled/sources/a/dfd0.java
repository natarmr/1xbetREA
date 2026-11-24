package a;

import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dfd0 implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5995a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dfd0(Object obj, byte b) {
        this.f5995a = b;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.f5995a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gfd0 gfd0Var = (gfd0) obj;
                mi70 mi70Var = gfd0.S1;
                if ((keyEvent != null && keyEvent.getKeyCode() == 66) || i == 6) {
                    gfd0Var.I0().A();
                }
                break;
            case 1:
                jgd0 jgd0Var = (jgd0) obj;
                xi70 xi70Var = jgd0.V1;
                if ((keyEvent != null && keyEvent.getKeyCode() == 66) || i == 6) {
                    jgd0Var.I0().A();
                }
                break;
            case 2:
                xhd0 xhd0Var = (xhd0) obj;
                fl70 fl70Var = xhd0.S1;
                if ((keyEvent != null && keyEvent.getKeyCode() == 66) || i == 6) {
                    xhd0Var.H0().x();
                }
                break;
            case 3:
                np30 np30Var = (np30) obj;
                if ((keyEvent != null && keyEvent.getKeyCode() == 66) || i == 6) {
                    np30Var.invoke();
                }
                break;
            default:
                Function0 function0 = (Function0) obj;
                if ((keyEvent != null && keyEvent.getKeyCode() == 66) || i == 6) {
                    function0.invoke();
                }
                break;
        }
        return false;
    }
}
