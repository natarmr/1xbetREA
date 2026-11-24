package a;

import android.text.method.DigitsKeyListener;
import java.util.List;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes.dex */
public abstract class z7q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f43931a = q3d.j('-', '.', '\'', ' ', ',', '/', '(', ')');

    public static final void a(DsTextField dsTextField, w2c0 w2c0Var) {
        int i;
        w2c0Var.getClass();
        dsTextField.setOnFocusChangeListener(new b7n(dsTextField, (byte) 1));
        int iOrdinal = w2c0Var.ordinal();
        if (iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
            i = 8193;
        } else {
            i = iOrdinal != 17 ? 524288 : 2;
        }
        if (w2c0Var == w2c0.s) {
            dsTextField.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        }
        dsTextField.setInputType(i);
        dsTextField.a(new da0(new c7n(dsTextField, (byte) 1)));
    }
}
