package a;

import android.text.Selection;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class vhd extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37424a = 0;
    public final Object b;

    public vhd(Pair pair) {
        this.b = pair;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        byte b = this.f37424a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kb00 kb00Var = (kb00) obj;
                sa4 sa4VarA = kb00Var.a();
                if (sa4VarA != null) {
                    sa4VarA.a(kb00Var);
                }
                break;
            default:
                view.getClass();
                CharSequence text = ((TextView) view).getText();
                text.getClass();
                Selection.setSelection((Spannable) text, 0);
                view.invalidate();
                ((Function1) ((Pair) obj).b).invoke(view);
                break;
        }
    }

    public vhd(kb00 kb00Var) {
        this.b = kb00Var;
    }
}
