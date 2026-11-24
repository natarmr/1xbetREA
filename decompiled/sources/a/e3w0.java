package a;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class e3w0 extends yzp {
    public static final y190 f;
    public final y190 c;
    public final yzp d;
    public final LinkedHashMap e;

    static {
        String str = y190.b;
        f = rl70.b(Separators.SLASH);
    }

    public e3w0(y190 y190Var, yzp yzpVar, LinkedHashMap linkedHashMap) {
        yzpVar.getClass();
        this.c = y190Var;
        this.d = yzpVar;
        this.e = linkedHashMap;
    }

    @Override // a.yzp
    public final s5k0 a(y190 y190Var) throws IOException {
        y190Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // a.yzp
    public final void c(y190 y190Var, y190 y190Var2) throws IOException {
        y190Var.getClass();
        y190Var2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // a.yzp
    public final void e(y190 y190Var) throws IOException {
        y190Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // a.yzp
    public final void k(y190 y190Var) throws IOException {
        y190Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // a.yzp
    public final List q(y190 y190Var) throws IOException {
        y190Var.getClass();
        y190 y190Var2 = f;
        y190Var2.getClass();
        d3w0 d3w0Var = (d3w0) this.e.get(c.a(y190Var2, y190Var, true));
        if (d3w0Var == null) {
            itt0.j(y190Var, "not a directory: ");
            return null;
        }
        List listL0 = CollectionsKt.L0(d3w0Var.q);
        listL0.getClass();
        return listL0;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cf  */
    @Override // a.yzp
    public final h7k v(y190 y190Var) throws Throwable {
        Long lValueOf;
        Long lValueOf2;
        Long l;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        y190Var.getClass();
        y190 y190Var2 = f;
        y190Var2.getClass();
        d3w0 d3w0VarW = (d3w0) this.e.get(c.a(y190Var2, y190Var, true));
        if (d3w0VarW == null) {
            return null;
        }
        long j = d3w0VarW.h;
        if (j != -1) {
            uey ueyVarW = this.d.w(this.c);
            try {
                zae0 zae0Var = new zae0(ueyVarW.a(j));
                try {
                    d3w0VarW = s7n0.w(zae0Var, d3w0VarW);
                    d3w0VarW.getClass();
                    try {
                        zae0Var.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        zae0Var.close();
                    } catch (Throwable th5) {
                        tjo.a(th4, th5);
                    }
                    th2 = th4;
                    d3w0VarW = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                try {
                    ueyVarW.close();
                    th = null;
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Throwable th7) {
                if (ueyVarW != null) {
                    try {
                        ueyVarW.close();
                    } catch (Throwable th8) {
                        tjo.a(th7, th8);
                    }
                }
                th = th7;
                d3w0VarW = null;
            }
            if (th != null) {
                throw th;
            }
        }
        boolean z = d3w0VarW.b;
        boolean z2 = !z;
        Long lValueOf4 = z ? null : Long.valueOf(d3w0VarW.f);
        Long l2 = d3w0VarW.m;
        if (l2 != null) {
            lValueOf = Long.valueOf((l2.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num = d3w0VarW.p;
            lValueOf = num != null ? Long.valueOf(((long) num.intValue()) * 1000) : null;
        }
        Long l3 = d3w0VarW.k;
        if (l3 != null) {
            lValueOf2 = Long.valueOf((l3.longValue() / 10000) - 11644473600000L);
        } else {
            Integer num2 = d3w0VarW.n;
            if (num2 != null) {
                lValueOf2 = Long.valueOf(((long) num2.intValue()) * 1000);
            } else {
                int i = d3w0VarW.j;
                if (i != -1) {
                    int i2 = d3w0VarW.i;
                    if (i == -1) {
                        lValueOf2 = null;
                    } else {
                        int i3 = (i >> 11) & 31;
                        int i4 = (i >> 5) & 63;
                        int i5 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, i3, i4, i5);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                } else {
                    lValueOf2 = null;
                }
            }
        }
        Long l4 = d3w0VarW.l;
        if (l4 == null) {
            Integer num3 = d3w0VarW.o;
            if (num3 != null) {
                lValueOf3 = Long.valueOf(((long) num3.intValue()) * 1000);
            } else {
                l = null;
            }
            return new h7k(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
        }
        lValueOf3 = Long.valueOf((l4.longValue() / 10000) - 11644473600000L);
        l = lValueOf3;
        return new h7k(z2, z, null, lValueOf4, lValueOf, lValueOf2, l);
    }

    @Override // a.yzp
    public final uey w(y190 y190Var) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // a.yzp
    public final s5k0 x(y190 y190Var, boolean z) throws IOException {
        y190Var.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // a.yzp
    public final emk0 y(y190 y190Var) throws Throwable {
        Throwable th;
        zae0 zae0Var;
        y190Var.getClass();
        y190 y190Var2 = f;
        y190Var2.getClass();
        d3w0 d3w0Var = (d3w0) this.e.get(c.a(y190Var2, y190Var, true));
        if (d3w0Var == null) {
            udk.h(y190Var, "no such file: ");
            return null;
        }
        long j = d3w0Var.f;
        uey ueyVarW = this.d.w(this.c);
        try {
            zae0Var = new zae0(ueyVarW.a(d3w0Var.h));
            try {
                ueyVarW.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (ueyVarW != null) {
                try {
                    ueyVarW.close();
                } catch (Throwable th4) {
                    tjo.a(th3, th4);
                }
            }
            th = th3;
            zae0Var = null;
        }
        if (th != null) {
            throw th;
        }
        zae0Var.getClass();
        s7n0.w(zae0Var, null);
        if (d3w0Var.g == 0) {
            return new jrz(zae0Var, j, false);
        }
        return new jrz(new e8x(new zae0(new jrz(zae0Var, d3w0Var.e, false)), new Inflater(true)), j, true);
    }
}
