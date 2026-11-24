package a;

/* JADX INFO: loaded from: classes.dex */
public final class wiu0 extends diu0 {
    public final hz40 b;

    public wiu0() {
        long[] jArr = u1h0.f34903a;
        this.b = new hz40();
    }

    @Override // a.diu0
    public final void v() {
        hz40 hz40Var;
        hz40 hz40Var2 = this.b;
        if (hz40Var2.i()) {
            hz40Var = u1h0.b;
            hz40Var.getClass();
        } else {
            hz40 hz40Var3 = new hz40(hz40Var2.e);
            hz40Var3.k(hz40Var2);
            hz40Var = hz40Var3;
        }
        Object[] objArr = hz40Var.c;
        long[] jArr = hz40Var.f13891a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        viu0 viu0Var = (viu0) objArr[(i << 3) + i3];
                        viu0Var.d = true;
                        if (viu0Var.c <= 0) {
                            w(viu0Var.f37500a);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void w(Object obj) {
        viu0 viu0Var = (viu0) this.b.l(obj);
        if (viu0Var != null) {
            viu0Var.b.a();
        }
    }
}
