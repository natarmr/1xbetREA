package a;

import java.util.Arrays;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class uor0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f36028a = q3d.j(i0w.d, i0w.e);

    public static final x680 a(for0 for0Var, ctf0 ctf0Var) {
        if (!f36028a.contains(for0Var.g) || for0Var.b == q4f.u) {
            return null;
        }
        return new x680("COEF_ID", ctf0Var.b.a(R.string.coefficient, Arrays.copyOf(new Object[0], 0)), new auy("\u200e".concat(for0Var.h)));
    }
}
