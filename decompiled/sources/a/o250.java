package a;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f24516a = q3d.j(825, 847, 824);

    public static final ue9 a(xi0 xi0Var, ctf0 ctf0Var) {
        if (xi0Var.h != null) {
            return new ue9(ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0)));
        }
        if (CollectionsKt.L(f24516a, xi0Var.c)) {
            return new ue9(ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0)));
        }
        return null;
    }
}
