package a;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u4m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0o0 f35057a = maz.b(new knl((byte) 22));

    public static String a(int i, z4m z4mVar) {
        if (z4mVar.equals(x4m.f40272a)) {
            String str = ((DecimalFormat) f35057a.getValue()).format(Integer.valueOf(i));
            str.getClass();
            return str;
        }
        if (!(z4mVar instanceof y4m)) {
            t9f.b();
            return null;
        }
        int iD = l1e0.d(i, 0, 5999);
        return String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iD / 60), Integer.valueOf(iD % 60)}, 2));
    }
}
