package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract class roj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pfw f30841a = new pfw("NO_VALUE", (byte) 6);

    public static final qoj0 a(int i, int i2, i99 i99Var) {
        if (i < 0) {
            c99.s(twn.m(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            c99.s(twn.m(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && i99Var != i99.f14377a) {
            hny.v(i99Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new qoj0(i, i3, i99Var);
    }

    public static /* synthetic */ qoj0 b(int i, int i2, i99 i99Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            i99Var = i99.f14377a;
        }
        return a(i, i2, i99Var);
    }

    public static final gmq c(noj0 noj0Var, CoroutineContext coroutineContext, int i, i99 i99Var) {
        return ((i == 0 || i == -3) && i99Var == i99.f14377a) ? noj0Var : new rtb(noj0Var, coroutineContext, i, i99Var);
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
