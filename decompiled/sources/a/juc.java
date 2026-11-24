package a;

import android.R;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class juc extends AppCompatEditText {
    public Function0 h;
    public Function0 i;
    public Function0 j;

    public final Function0<Unit> getOnTextCopy() {
        return this.i;
    }

    public final Function0<Unit> getOnTextCut() {
        return this.h;
    }

    public final Function0<Unit> getOnTextPaste() {
        return this.j;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        switch (i) {
            case R.id.cut:
                this.h.invoke();
                break;
            case R.id.copy:
                this.i.invoke();
                break;
            case R.id.paste:
                this.j.invoke();
                break;
        }
        return super.onTextContextMenuItem(i);
    }

    public final void setOnTextCopy(Function0<Unit> function0) {
        function0.getClass();
        this.i = function0;
    }

    public final void setOnTextCut(Function0<Unit> function0) {
        function0.getClass();
        this.h = function0;
    }

    public final void setOnTextPaste(Function0<Unit> function0) {
        function0.getClass();
        this.j = function0;
    }
}
