package a;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class n7z implements uj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23063a;
    public final /* synthetic */ uj30 b;
    public final /* synthetic */ r7z c;
    public final /* synthetic */ int d;
    public final /* synthetic */ uj30 e;

    public /* synthetic */ n7z(uj30 uj30Var, r7z r7zVar, int i, uj30 uj30Var2, byte b) {
        this.f23063a = b;
        this.c = r7zVar;
        this.d = i;
        this.e = uj30Var2;
        this.b = uj30Var;
    }

    @Override // a.uj30
    public final Map a() {
        switch (this.f23063a) {
            case 0:
                break;
        }
        return this.b.a();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[LOOP:0: B:11:0x002f->B:30:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[SYNTHETIC] */
    @Override // a.uj30
    public final void b() {
        byte b = this.f23063a;
        uj30 uj30Var = this.e;
        int i = this.d;
        r7z r7zVar = this.c;
        switch (b) {
            case 0:
                r7zVar.e = i;
                uj30Var.b();
                xz40 xz40Var = r7zVar.m;
                hz40 hz40Var = r7zVar.l;
                long[] jArr = hz40Var.f13891a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    int i5 = (i2 << 3) + i4;
                                    Object obj = hz40Var.b[i5];
                                    a5n0 a5n0Var = (a5n0) hz40Var.c[i5];
                                    int i6 = xz40Var.i(obj);
                                    if (i6 < 0 || i6 >= r7zVar.e) {
                                        if (i6 >= 0) {
                                            Object[] objArr = xz40Var.f41739a;
                                            Object obj2 = objArr[i6];
                                            objArr[i6] = x4n0.b;
                                        }
                                        if (r7zVar.j.b(obj)) {
                                            a5n0Var.a();
                                        }
                                        hz40Var.m(i5);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i3 == 8) {
                                if (i2 != length) {
                                    i2++;
                                }
                            }
                        } else if (i2 != length) {
                            i2++;
                        }
                    }
                }
                r7zVar.g(r7zVar.d);
                break;
            default:
                r7zVar.d = i;
                uj30Var.b();
                if (r7zVar.f30000a.i == null) {
                    r7zVar.g(r7zVar.d);
                }
                break;
        }
    }

    @Override // a.uj30
    public final Function1 c() {
        switch (this.f23063a) {
            case 0:
                break;
        }
        return this.b.c();
    }

    @Override // a.uj30
    public final Function2 d() {
        switch (this.f23063a) {
            case 0:
                break;
        }
        return this.b.d();
    }

    @Override // a.uj30
    public final Function1 e() {
        switch (this.f23063a) {
            case 0:
                break;
        }
        return this.b.e();
    }

    @Override // a.uj30
    public final int f() {
        switch (this.f23063a) {
            case 0:
                break;
        }
        return this.b.f();
    }

    @Override // a.uj30
    public final int j() {
        switch (this.f23063a) {
            case 0:
                break;
        }
        return this.b.j();
    }
}
