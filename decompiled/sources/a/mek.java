package a;

import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class mek extends g8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1o f21649a;
    public final /* synthetic */ LinkedHashSet b;
    public final /* synthetic */ boolean c;

    public mek(q1o q1oVar, LinkedHashSet linkedHashSet, boolean z) {
        this.f21649a = q1oVar;
        this.b = linkedHashSet;
        this.c = z;
    }

    public static /* synthetic */ void b0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // a.g8x
    public final void V(mp9 mp9Var, Collection collection) {
        if (mp9Var == null) {
            b0(3);
            throw null;
        }
        if (!this.c || mp9Var.l() == 2) {
            mp9Var.d0(collection);
        }
    }

    @Override // a.g8x
    public final void t(mp9 mp9Var) {
        if (mp9Var == null) {
            b0(0);
            throw null;
        }
        sf80.r(mp9Var, new w0(this, (byte) 19));
        this.b.add(mp9Var);
    }
}
