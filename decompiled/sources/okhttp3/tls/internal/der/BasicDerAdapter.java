package okhttp3.tls.internal.der;

import a.brm0;
import a.e9d0;
import a.jf4;
import a.on;
import a.rw2;
import a.twn;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.Serializable;
import java.net.ProtocolException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/tls/internal/der/BasicDerAdapter;", TokenNames.T, "Lokhttp3/tls/internal/der/DerAdapter;", "Codec", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BasicDerAdapter<T> implements DerAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46252a;
    public final int b;
    public final long c;
    public final Codec d;
    public final boolean e;
    public final Object f;
    public final boolean g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lokhttp3/tls/internal/der/BasicDerAdapter$Codec;", TokenNames.T, "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Codec<T> {
        Object a(DerReader derReader);

        void b(DerWriter derWriter, Object obj);
    }

    public BasicDerAdapter(String str, int i, long j, Codec codec, boolean z, Object obj, boolean z2) {
        this.f46252a = str;
        this.b = i;
        this.c = j;
        this.d = codec;
        this.e = z;
        this.f = obj;
        this.g = z2;
        if (i < 0) {
            jf4.o("Failed requirement.");
            throw null;
        }
        if (j >= 0) {
            return;
        }
        jf4.o("Failed requirement.");
        throw null;
    }

    public static BasicDerAdapter g(BasicDerAdapter basicDerAdapter, long j, Object obj, int i) {
        String str = basicDerAdapter.f46252a;
        int i2 = (i & 2) != 0 ? basicDerAdapter.b : 128;
        if ((i & 4) != 0) {
            j = basicDerAdapter.c;
        }
        long j2 = j;
        Codec codec = basicDerAdapter.d;
        boolean z = (i & 16) != 0 ? basicDerAdapter.e : true;
        if ((i & 32) != 0) {
            obj = basicDerAdapter.f;
        }
        Object obj2 = obj;
        boolean z2 = (i & 64) != 0 ? basicDerAdapter.g : true;
        basicDerAdapter.getClass();
        str.getClass();
        codec.getClass();
        return new BasicDerAdapter(str, i2, j2, codec, z, obj2, z2);
    }

    public static BasicDerAdapter i(BasicDerAdapter basicDerAdapter, long j) {
        basicDerAdapter.getClass();
        return g(basicDerAdapter, j, null, 121);
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final void b(DerWriter derWriter, Object obj) {
        derWriter.getClass();
        if (this.g) {
            ArrayList arrayList = derWriter.b;
            arrayList.set(arrayList.size() - 1, obj);
        }
        if (this.e && Intrinsics.d(obj, this.f)) {
            return;
        }
        derWriter.b(this.f46252a, this.b, this.c, new on((Object) this, (Object) derWriter, obj, (byte) 25));
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final boolean c(DerHeader derHeader) {
        return derHeader.f46258a == this.b && derHeader.b == this.c;
    }

    @Override // okhttp3.tls.internal.der.DerAdapter
    public final Object d(DerReader derReader) throws ProtocolException {
        derReader.getClass();
        DerHeader derHeaderC = derReader.c();
        ArrayList arrayList = derReader.e;
        if (derHeaderC == null || derHeaderC.f46258a != this.b || derHeaderC.b != this.c) {
            if (this.e) {
                return this.f;
            }
            throw new ProtocolException("expected " + this + " but was " + derHeaderC + " at " + derReader);
        }
        if (derReader.c() == null) {
            e9d0.j("expected a value");
            return null;
        }
        DerHeader derHeader = derReader.g;
        derHeader.getClass();
        long j = derHeader.d;
        derReader.g = null;
        long j2 = derReader.c;
        boolean z = derReader.f;
        long jA = j != -1 ? derReader.a() + j : -1L;
        if (j2 != -1 && jA > j2) {
            e9d0.j("enclosed object too large");
            return null;
        }
        derReader.c = jA;
        derReader.f = derHeader.c;
        String str = this.f46252a;
        if (str != null) {
            arrayList.add(str);
        }
        try {
            Object objA = this.d.a(derReader);
            if (jA != -1 && derReader.a() > jA) {
                throw new ProtocolException("unexpected byte count at " + derReader);
            }
            derReader.g = null;
            derReader.c = j2;
            derReader.f = z;
            if (str != null) {
                arrayList.remove(arrayList.size() - 1);
            }
            if (this.g) {
                ArrayList arrayList2 = derReader.d;
                arrayList2.set(arrayList2.size() - 1, objA);
            }
            return objA;
        } catch (Throwable th) {
            derReader.g = null;
            derReader.c = j2;
            derReader.f = z;
            if (str != null) {
                arrayList.remove(arrayList.size() - 1);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicDerAdapter)) {
            return false;
        }
        BasicDerAdapter basicDerAdapter = (BasicDerAdapter) obj;
        return Intrinsics.d(this.f46252a, basicDerAdapter.f46252a) && this.b == basicDerAdapter.b && this.c == basicDerAdapter.c && Intrinsics.d(this.d, basicDerAdapter.d) && this.e == basicDerAdapter.e && Intrinsics.d(this.f, basicDerAdapter.f) && this.g == basicDerAdapter.g;
    }

    public final BasicDerAdapter h(Serializable serializable) {
        return g(this, 0L, serializable, 79);
    }

    public final int hashCode() {
        int iE = brm0.e((this.d.hashCode() + rw2.b(twn.a(this.b, this.f46252a.hashCode() * 31, 31), 31, this.c)) * 31, 31, this.e);
        Object obj = this.f;
        return Boolean.hashCode(this.g) + ((iE + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        return this.f46252a + " [" + this.b + '/' + this.c + ']';
    }
}
