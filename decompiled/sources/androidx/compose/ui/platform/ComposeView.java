package androidx.compose.ui.platform;

import a.cnc;
import a.fet;
import a.hgk0;
import a.pz40;
import a.x1;
import a.yfe0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends x1 {
    public static final /* synthetic */ int l = 0;
    public final pz40 j;
    public boolean k;

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet);
        this.j = e.e(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // a.x1
    public final void a(int i, fet fetVar) {
        fetVar.g0(420213850);
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Function2 function2 = (Function2) ((hgk0) this.j).getValue();
            if (function2 == null) {
                fetVar.e0(-1238823553);
            } else {
                fetVar.e0(98585282);
                function2.invoke(fetVar, 0);
            }
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cnc(this, i, (byte) 9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // a.x1
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.k;
    }

    public final void setContent(Function2<? super fet, ? super Integer, Unit> function2) {
        this.k = true;
        ((hgk0) this.j).setValue(function2);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ComposeView(Context context) {
        this(context, null, 6);
    }
}
