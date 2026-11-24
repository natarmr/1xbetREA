package a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g5d0 implements t960 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final sqp f = new sqp("key", rz4.q(rw2.r(a5d0.class, new v04(1))));
    public static final sqp g = new sqp("value", rz4.q(rw2.r(a5d0.class, new v04(2))));
    public static final ecy h = new ecy((byte) 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f10712a;
    public final HashMap b;
    public final HashMap c;
    public final h5d0 d = new h5d0(this);

    public g5d0(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2) {
        this.f10712a = byteArrayOutputStream;
        this.b = map;
        this.c = map2;
    }

    public static int k(sqp sqpVar) {
        a5d0 a5d0Var = (a5d0) ((Annotation) sqpVar.b.get(a5d0.class));
        if (a5d0Var != null) {
            return a5d0Var.tag();
        }
        throw new hwn("Field has no @Protobuf config");
    }

    @Override // a.t960
    public final t960 a(sqp sqpVar, Object obj) {
        i(sqpVar, obj, true);
        return this;
    }

    public final void b(sqp sqpVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return;
        }
        l((k(sqpVar) << 3) | 1);
        this.f10712a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    @Override // a.t960
    public final t960 c(sqp sqpVar, long j) throws IOException {
        h(sqpVar, j, true);
        return this;
    }

    @Override // a.t960
    public final t960 d(sqp sqpVar, int i) {
        g(sqpVar, i, true);
        return this;
    }

    @Override // a.t960
    public final t960 e(sqp sqpVar, double d) throws IOException {
        b(sqpVar, d, true);
        return this;
    }

    @Override // a.t960
    public final t960 f(sqp sqpVar, boolean z) {
        g(sqpVar, z ? 1 : 0, true);
        return this;
    }

    public final void g(sqp sqpVar, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        a5d0 a5d0Var = (a5d0) ((Annotation) sqpVar.b.get(a5d0.class));
        if (a5d0Var == null) {
            throw new hwn("Field has no @Protobuf config");
        }
        int iOrdinal = a5d0Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(a5d0Var.tag() << 3);
            l(i);
        } else if (iOrdinal == 1) {
            l(a5d0Var.tag() << 3);
            l((i << 1) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((a5d0Var.tag() << 3) | 5);
            this.f10712a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    public final void h(sqp sqpVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        a5d0 a5d0Var = (a5d0) ((Annotation) sqpVar.b.get(a5d0.class));
        if (a5d0Var == null) {
            throw new hwn("Field has no @Protobuf config");
        }
        int iOrdinal = a5d0Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            l(a5d0Var.tag() << 3);
            m(j);
        } else if (iOrdinal == 1) {
            l(a5d0Var.tag() << 3);
            m((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            l((a5d0Var.tag() << 3) | 1);
            this.f10712a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    public final void i(sqp sqpVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            l((k(sqpVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(e);
            l(bytes.length);
            this.f10712a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                i(sqpVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(h, sqpVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(sqpVar, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            l((k(sqpVar) << 3) | 5);
            this.f10712a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            h(sqpVar, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            g(sqpVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            l((k(sqpVar) << 3) | 2);
            l(bArr.length);
            this.f10712a.write(bArr);
            return;
        }
        s960 s960Var = (s960) this.b.get(obj.getClass());
        if (s960Var != null) {
            j(s960Var, sqpVar, obj, z);
            return;
        }
        c3u0 c3u0Var = (c3u0) this.c.get(obj.getClass());
        if (c3u0Var != null) {
            h5d0 h5d0Var = this.d;
            h5d0Var.f12475a = false;
            h5d0Var.c = sqpVar;
            h5d0Var.b = z;
            c3u0Var.a(obj, h5d0Var);
            return;
        }
        if (obj instanceof t4d0) {
            g(sqpVar, ((t4d0) obj).a(), true);
        } else if (obj instanceof Enum) {
            g(sqpVar, ((Enum) obj).ordinal(), true);
        } else {
            j(s5x0.l, sqpVar, obj, z);
        }
    }

    public final void j(s960 s960Var, sqp sqpVar, Object obj, boolean z) throws IOException {
        zjz zjzVar = new zjz();
        zjzVar.f44503a = 0L;
        try {
            OutputStream outputStream = this.f10712a;
            this.f10712a = zjzVar;
            try {
                s960Var.a(obj, this);
                this.f10712a = outputStream;
                long j = zjzVar.f44503a;
                zjzVar.close();
                if (z && j == 0) {
                    return;
                }
                l((k(sqpVar) << 3) | 2);
                m(j);
                s960Var.a(obj, this);
            } catch (Throwable th) {
                this.f10712a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zjzVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void l(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.f10712a;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    public final void m(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.f10712a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
