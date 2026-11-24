package a;

import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class iw2 implements r55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f15469a;
    public final w55 b;
    public final AutofillId c;

    public iw2(AndroidComposeView androidComposeView, w55 w55Var) {
        this.f15469a = androidComposeView;
        this.b = w55Var;
        androidComposeView.setImportantForAutofill(1);
        i7 i7VarG = cvm0.g(androidComposeView);
        AutofillId autofillIdC = i7VarG != null ? y24.c(i7VarG.f14266a) : null;
        if (autofillIdC == null) {
            throw cs0.g("Required value was null.");
        }
        this.c = autofillIdC;
    }
}
