package org.xplatform.uikit.components.search_field;

import a.ozp0;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class TextInputEditText extends com.google.android.material.textfield.TextInputEditText {
    public static final /* synthetic */ int n = 0;
    public Function0 j;
    public Function0 k;
    public Function0 l;
    public boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.j = new ozp0((byte) 9);
        this.k = new ozp0((byte) 10);
        this.l = new ozp0((byte) 11);
    }

    public final Function0<Unit> getOnTextCopy() {
        return this.k;
    }

    public final Function0<Unit> getOnTextCut() {
        return this.j;
    }

    public final Function0<Unit> getOnTextPaste() {
        return this.l;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        boolean z = this.m;
        int i2 = R.attr.state_error;
        if (!z) {
            i2 = -R.attr.state_error;
        }
        int[] iArrMergeDrawableStates = View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{i2});
        iArrMergeDrawableStates.getClass();
        return iArrMergeDrawableStates;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        switch (i) {
            case android.R.id.cut:
                this.j.invoke();
                break;
            case android.R.id.copy:
                this.k.invoke();
                break;
            case android.R.id.paste:
                this.l.invoke();
                break;
        }
        return super.onTextContextMenuItem(i);
    }

    public final void setError(boolean z) {
        this.m = z;
        refreshDrawableState();
        if (Build.VERSION.SDK_INT >= 29) {
            setTextCursorDrawable(getContext().getDrawable(R.drawable.custom_cursor));
        }
    }

    public final void setOnTextCopy(Function0<Unit> function0) {
        function0.getClass();
        this.k = function0;
    }

    public final void setOnTextCut(Function0<Unit> function0) {
        function0.getClass();
        this.j = function0;
    }

    public final void setOnTextPaste(Function0<Unit> function0) {
        function0.getClass();
        this.l = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextInputEditText(Context context) {
        this(context, null);
        context.getClass();
    }
}
