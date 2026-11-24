package okhttp3.tls.internal.der;

import a.iun;
import a.jf4;
import a.m1b;
import a.qg9;
import a.sgy;
import a.sre0;
import a.tre0;
import a.tx3;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/CertificateAdapters;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CertificateAdapters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BasicDerAdapter f46255a;
    public static final BasicDerAdapter b;
    public static final BasicDerAdapter c;
    public static final BasicDerAdapter d;
    public static final BasicDerAdapter e;
    public static final BasicDerAdapter f;
    public static final BasicDerAdapter g;
    public static final BasicDerAdapter h;

    static {
        CertificateAdapters$time$1 certificateAdapters$time$1 = new CertificateAdapters$time$1();
        BasicDerAdapter basicDerAdapterA = Adapters.a("Validity", new DerAdapter[]{certificateAdapters$time$1, certificateAdapters$time$1}, new m1b((byte) 4), new m1b((byte) 6));
        final m1b m1bVar = new m1b((byte) 7);
        DerAdapter<Object> derAdapter = new DerAdapter<Object>() { // from class: okhttp3.tls.internal.der.Adapters$usingTypeHint$1
            @Override // okhttp3.tls.internal.der.DerAdapter
            public final void b(DerWriter derWriter, Object obj) {
                derWriter.getClass();
                DerAdapter derAdapter2 = (DerAdapter) m1bVar.invoke(CollectionsKt.f0(derWriter.b));
                if (derAdapter2 != null) {
                    derAdapter2.b(derWriter, obj);
                    return;
                }
                obj.getClass();
                derWriter.a().N0((qg9) obj);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final boolean c(DerHeader derHeader) {
                return true;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Object d(DerReader derReader) {
                derReader.getClass();
                DerAdapter derAdapter2 = (DerAdapter) m1bVar.invoke(CollectionsKt.f0(derReader.d));
                return derAdapter2 != null ? derAdapter2.d(derReader) : derReader.b.q0(derReader.b());
            }
        };
        BasicDerAdapter basicDerAdapter = Adapters.g;
        basicDerAdapter.getClass();
        BasicDerAdapter basicDerAdapterA2 = Adapters.a("AlgorithmIdentifier", new DerAdapter[]{BasicDerAdapter.g(basicDerAdapter, 0L, null, 63), derAdapter}, new m1b((byte) 8), new m1b((byte) 9));
        BasicDerAdapter basicDerAdapter2 = Adapters.f46243a;
        Boolean bool = Boolean.FALSE;
        BasicDerAdapter basicDerAdapterH = basicDerAdapter2.h(bool);
        BasicDerAdapter basicDerAdapter3 = Adapters.b;
        f46255a = Adapters.a("BasicConstraints", new DerAdapter[]{basicDerAdapterH, basicDerAdapter3.h(null)}, new m1b((byte) 10), new m1b((byte) 11));
        BasicDerAdapter basicDerAdapterI = BasicDerAdapter.i(Adapters.j, 2L);
        b = basicDerAdapterI;
        BasicDerAdapter basicDerAdapter4 = Adapters.e;
        BasicDerAdapter basicDerAdapterI2 = BasicDerAdapter.i(basicDerAdapter4, 7L);
        c = basicDerAdapterI2;
        Adapters$ANY_VALUE$1 adapters$ANY_VALUE$1 = Adapters.m;
        final DerAdapter[] derAdapterArr = {basicDerAdapterI, basicDerAdapterI2, adapters$ANY_VALUE$1};
        d = new DerAdapter<Pair<? extends DerAdapter<?>, ? extends Object>>() { // from class: okhttp3.tls.internal.der.Adapters$choice$1
            @Override // okhttp3.tls.internal.der.DerAdapter
            public final void b(DerWriter derWriter, Object obj) {
                Pair pair = (Pair) obj;
                derWriter.getClass();
                pair.getClass();
                DerAdapter derAdapter2 = (DerAdapter) pair.f46059a;
                Object obj2 = pair.b;
                derAdapter2.getClass();
                derAdapter2.b(derWriter, obj2);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final boolean c(DerHeader derHeader) {
                return true;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Object d(DerReader derReader) throws ProtocolException {
                DerAdapter derAdapter2;
                derReader.getClass();
                DerHeader derHeaderC = derReader.c();
                if (derHeaderC == null) {
                    throw new ProtocolException("expected a value at " + derReader);
                }
                DerAdapter[] derAdapterArr2 = derAdapterArr;
                int length = derAdapterArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        derAdapter2 = null;
                        break;
                    }
                    derAdapter2 = derAdapterArr2[i];
                    if (derAdapter2.c(derHeaderC)) {
                        break;
                    }
                    i++;
                }
                if (derAdapter2 != null) {
                    return new Pair(derAdapter2, derAdapter2.d(derReader));
                }
                jf4.j(derHeaderC, derReader, "expected a matching choice but was ");
                return null;
            }

            public final String toString() {
                return tx3.N(derAdapterArr, " OR ", null, null, null, 62);
            }
        }.e(16L, "SEQUENCE OF");
        final m1b m1bVar2 = new m1b((byte) 12);
        BasicDerAdapter basicDerAdapterA3 = Adapters.a("Extension", new DerAdapter[]{BasicDerAdapter.g(basicDerAdapter, 0L, null, 63), basicDerAdapter2.h(bool), new DerAdapter<Object>() { // from class: okhttp3.tls.internal.der.Adapters$usingTypeHint$1
            @Override // okhttp3.tls.internal.der.DerAdapter
            public final void b(DerWriter derWriter, Object obj) {
                derWriter.getClass();
                DerAdapter derAdapter2 = (DerAdapter) m1bVar2.invoke(CollectionsKt.f0(derWriter.b));
                if (derAdapter2 != null) {
                    derAdapter2.b(derWriter, obj);
                    return;
                }
                obj.getClass();
                derWriter.a().N0((qg9) obj);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final boolean c(DerHeader derHeader) {
                return true;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Object d(DerReader derReader) {
                derReader.getClass();
                DerAdapter derAdapter2 = (DerAdapter) m1bVar2.invoke(CollectionsKt.f0(derReader.d));
                return derAdapter2 != null ? derAdapter2.d(derReader) : derReader.b.q0(derReader.b());
            }
        }.f(basicDerAdapter4.b, basicDerAdapter4.c, bool)}, new m1b((byte) 13), new m1b((byte) 14));
        tre0 tre0Var = sre0.f32672a;
        final Pair[] pairArr = {new Pair(tre0Var.b(String.class), Adapters.h), new Pair(tre0Var.b(Void.class), Adapters.i), new Pair(tre0Var.b(AnyValue.class), adapters$ANY_VALUE$1)};
        BasicDerAdapter basicDerAdapterE = Adapters.a("AttributeTypeAndValue", new DerAdapter[]{basicDerAdapter, new DerAdapter<Object>() { // from class: okhttp3.tls.internal.der.Adapters$any$1
            @Override // okhttp3.tls.internal.der.DerAdapter
            public final void b(DerWriter derWriter, Object obj) {
                derWriter.getClass();
                for (Pair pair : pairArr) {
                    sgy sgyVar = (sgy) pair.f46059a;
                    DerAdapter derAdapter2 = (DerAdapter) pair.b;
                    if (sgyVar.r(obj) || (obj == null && sgyVar.equals(sre0.f32672a.b(Unit.class)))) {
                        derAdapter2.getClass();
                        derAdapter2.b(derWriter, obj);
                        return;
                    }
                }
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final boolean c(DerHeader derHeader) {
                return true;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Object d(DerReader derReader) throws ProtocolException {
                derReader.getClass();
                DerHeader derHeaderC = derReader.c();
                if (derHeaderC == null) {
                    throw new ProtocolException("expected a value at " + derReader);
                }
                for (Pair pair : pairArr) {
                    DerAdapter derAdapter2 = (DerAdapter) pair.b;
                    if (derAdapter2.c(derHeaderC)) {
                        return derAdapter2.d(derReader);
                    }
                }
                jf4.j(derHeaderC, derReader, "expected any but was ");
                return null;
            }
        }}, new m1b((byte) 15), new m1b((byte) 16)).e(17L, "SET OF").e(16L, "SEQUENCE OF");
        e = basicDerAdapterE;
        final DerAdapter[] derAdapterArr2 = {basicDerAdapterE};
        DerAdapter<Pair<? extends DerAdapter<?>, ? extends Object>> derAdapter2 = new DerAdapter<Pair<? extends DerAdapter<?>, ? extends Object>>() { // from class: okhttp3.tls.internal.der.Adapters$choice$1
            @Override // okhttp3.tls.internal.der.DerAdapter
            public final void b(DerWriter derWriter, Object obj) {
                Pair pair = (Pair) obj;
                derWriter.getClass();
                pair.getClass();
                DerAdapter derAdapter3 = (DerAdapter) pair.f46059a;
                Object obj2 = pair.b;
                derAdapter3.getClass();
                derAdapter3.b(derWriter, obj2);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final boolean c(DerHeader derHeader) {
                return true;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Object d(DerReader derReader) throws ProtocolException {
                DerAdapter derAdapter3;
                derReader.getClass();
                DerHeader derHeaderC = derReader.c();
                if (derHeaderC == null) {
                    throw new ProtocolException("expected a value at " + derReader);
                }
                DerAdapter[] derAdapterArr3 = derAdapterArr2;
                int length = derAdapterArr3.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        derAdapter3 = null;
                        break;
                    }
                    derAdapter3 = derAdapterArr3[i];
                    if (derAdapter3.c(derHeaderC)) {
                        break;
                    }
                    i++;
                }
                if (derAdapter3 != null) {
                    return new Pair(derAdapter3, derAdapter3.d(derReader));
                }
                jf4.j(derHeaderC, derReader, "expected a matching choice but was ");
                return null;
            }

            public final String toString() {
                return tx3.N(derAdapterArr2, " OR ", null, null, null, 62);
            }
        };
        BasicDerAdapter basicDerAdapter5 = Adapters.d;
        BasicDerAdapter basicDerAdapterA4 = Adapters.a("SubjectPublicKeyInfo", new DerAdapter[]{basicDerAdapterA2, basicDerAdapter5}, new m1b((byte) 17), new m1b((byte) 18));
        f = basicDerAdapterA4;
        BasicDerAdapter basicDerAdapterA5 = Adapters.a("TBSCertificate", new DerAdapter[]{basicDerAdapter3.f(128, 0L, null).h(0L), Adapters.c, basicDerAdapterA2, derAdapter2, basicDerAdapterA, derAdapter2, basicDerAdapterA4, BasicDerAdapter.i(basicDerAdapter5, 1L).h(null), BasicDerAdapter.g(basicDerAdapter5, 2L, null, 121).h(null), basicDerAdapterA3.e(16L, "SEQUENCE OF").f(128, 3L, null).h(iun.f15405a)}, new m1b((byte) 19), new m1b((byte) 20));
        g = basicDerAdapterA5;
        h = Adapters.a("Certificate", new DerAdapter[]{basicDerAdapterA5, basicDerAdapterA2, basicDerAdapter5}, new m1b((byte) 21), new m1b((byte) 22));
        Adapters.a("PrivateKeyInfo", new DerAdapter[]{basicDerAdapter3, basicDerAdapterA2, basicDerAdapter4}, new m1b((byte) 23), new m1b((byte) 5));
    }
}
