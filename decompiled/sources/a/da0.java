package a;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class da0 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f5724a;

    public /* synthetic */ da0() {
        this(new b5((byte) 19));
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        editable.getClass();
        try {
            this.f5724a.invoke(editable);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                cause.printStackTrace();
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
    }

    public da0(Function1 function1) {
        this.f5724a = function1;
    }
}
