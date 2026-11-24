package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t400 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f33295a = q3d.j(bnz.c, bnz.f2907a, bnz.b);
    public static final List b = q3d.j(bnz.g, bnz.e);

    public static final wui0 a(int i, int i2, boolean z) {
        if (i2 == 0 && z) {
            return wui0.b;
        }
        if (i2 == 0) {
            return wui0.f39793a;
        }
        if (i == 0) {
            return wui0.b;
        }
        if (i == i2 && z) {
            return wui0.c;
        }
        return i == i2 ? wui0.d : wui0.c;
    }
}
