package a;

import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class s6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pz40 f31722a;
    public static final pz40 b;

    static {
        long j = y3d.g;
        f31722a = androidx.compose.runtime.e.e(new taq0(new ThemeColors(j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, j, null), new IndividualColors(j, j, j, j, j, j, j, j, j, j, j, j, j, null), new idv0(j, j, j, j, j)));
        b = androidx.compose.runtime.e.e(Boolean.FALSE);
    }

    public static ThemeColors a() {
        return b().f33626a;
    }

    public static taq0 b() {
        return (taq0) ((hgk0) f31722a).getValue();
    }

    public static boolean c() {
        return ((Boolean) ((hgk0) b).getValue()).booleanValue();
    }

    public static void d(taq0 taq0Var, boolean z) {
        taq0Var.getClass();
        if (Intrinsics.d(b(), taq0Var)) {
            return;
        }
        ((hgk0) f31722a).setValue(taq0Var);
        ((hgk0) b).setValue(Boolean.valueOf(z));
    }
}
