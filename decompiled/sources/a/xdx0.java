package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class xdx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40717a;
    public final int b;
    public xdx0 c;
    public final HashMap d = new HashMap(0);

    public xdx0(int i, int i2) {
        if (i > i2) {
            e9d0.o();
            throw null;
        }
        this.f40717a = i;
        this.b = i2;
        this.c = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        return b1j.h(iIdentityHashCode, "Node", new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4));
    }
}
