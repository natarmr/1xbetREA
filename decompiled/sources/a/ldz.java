package a;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ldz implements fzg0, bzg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gzg0 f19877a;
    public final bzg0 b;
    public final iz40 c;

    public ldz(fzg0 fzg0Var, Map map, bzg0 bzg0Var) {
        ebz ebzVar = new ebz(fzg0Var, (byte) 6);
        zfn zfnVar = hzg0.f13904a;
        this.f19877a = new gzg0(map, ebzVar);
        this.b = bzg0Var;
        iz40 iz40Var = v1h0.f36630a;
        this.c = new iz40();
    }

    @Override // a.fzg0
    public final ezg0 a(String str, Function0 function0) {
        return this.f19877a.a(str, function0);
    }

    @Override // a.bzg0
    public final void b(Object obj, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-858296452);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(this) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            this.b.b(obj, ugdVar, fetVar, i2 & 126);
            boolean zI = fetVar.i(this) | fetVar.i(obj);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new okw(this, obj, (byte) 20);
                fetVar.o0(objP);
            }
            m0x0.o(obj, (Function1) objP, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) this, obj, (Object) ugdVar, i, (byte) 25);
        }
    }

    @Override // a.bzg0
    public final void c(Object obj) {
        this.b.c(obj);
    }

    @Override // a.fzg0
    public final boolean d(Object obj) {
        return this.f19877a.d(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // a.fzg0
    public final Map e() {
        iz40 iz40Var = this.c;
        Object[] objArr = iz40Var.b;
        long[] jArr = iz40Var.f15620a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.b.c(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f19877a.e();
    }

    @Override // a.fzg0
    public final Object f(String str) {
        return this.f19877a.f(str);
    }
}
