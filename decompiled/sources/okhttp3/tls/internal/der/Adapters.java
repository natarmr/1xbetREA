package okhttp3.tls.internal.der;

import a.q3d;
import a.qg9;
import a.sre0;
import a.tre0;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/tls/internal/der/Adapters;", "", "okhttp-tls"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Adapters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BasicDerAdapter f46243a;
    public static final BasicDerAdapter b;
    public static final BasicDerAdapter c;
    public static final BasicDerAdapter d;
    public static final BasicDerAdapter e;
    public static final BasicDerAdapter f;
    public static final BasicDerAdapter g;
    public static final BasicDerAdapter h;
    public static final BasicDerAdapter i;
    public static final BasicDerAdapter j;
    public static final BasicDerAdapter k;
    public static final BasicDerAdapter l;
    public static final Adapters$ANY_VALUE$1 m;
    public static final List n;

    static {
        BasicDerAdapter basicDerAdapter = new BasicDerAdapter("BOOLEAN", 0, 1L, new Adapters$BOOLEAN$1(), false, null, false);
        f46243a = basicDerAdapter;
        b = new BasicDerAdapter("INTEGER", 0, 2L, new Adapters$INTEGER_AS_LONG$1(), false, null, false);
        BasicDerAdapter basicDerAdapter2 = new BasicDerAdapter("INTEGER", 0, 2L, new Adapters$INTEGER_AS_BIG_INTEGER$1(), false, null, false);
        c = basicDerAdapter2;
        BasicDerAdapter basicDerAdapter3 = new BasicDerAdapter("BIT STRING", 0, 3L, new Adapters$BIT_STRING$1(), false, null, false);
        d = basicDerAdapter3;
        BasicDerAdapter basicDerAdapter4 = new BasicDerAdapter("OCTET STRING", 0, 4L, new Adapters$OCTET_STRING$1(), false, null, false);
        e = basicDerAdapter4;
        BasicDerAdapter basicDerAdapter5 = new BasicDerAdapter("NULL", 0, 5L, new Adapters$NULL$1(), false, null, false);
        f = basicDerAdapter5;
        BasicDerAdapter basicDerAdapter6 = new BasicDerAdapter("OBJECT IDENTIFIER", 0, 6L, new Adapters$OBJECT_IDENTIFIER$1(), false, null, false);
        g = basicDerAdapter6;
        BasicDerAdapter basicDerAdapter7 = new BasicDerAdapter("UTF8", 0, 12L, new Adapters$UTF8_STRING$1(), false, null, false);
        h = basicDerAdapter7;
        BasicDerAdapter basicDerAdapter8 = new BasicDerAdapter("PRINTABLE STRING", 0, 19L, new Adapters$PRINTABLE_STRING$1(), false, null, false);
        i = basicDerAdapter8;
        BasicDerAdapter basicDerAdapter9 = new BasicDerAdapter("IA5 STRING", 0, 22L, new Adapters$IA5_STRING$1(), false, null, false);
        j = basicDerAdapter9;
        BasicDerAdapter basicDerAdapter10 = new BasicDerAdapter("UTC TIME", 0, 23L, new Adapters$UTC_TIME$1(), false, null, false);
        k = basicDerAdapter10;
        BasicDerAdapter basicDerAdapter11 = new BasicDerAdapter("GENERALIZED TIME", 0, 24L, new Adapters$GENERALIZED_TIME$1(), false, null, false);
        l = basicDerAdapter11;
        Adapters$ANY_VALUE$1 adapters$ANY_VALUE$1 = new Adapters$ANY_VALUE$1();
        m = adapters$ANY_VALUE$1;
        tre0 tre0Var = sre0.f32672a;
        n = q3d.j(new Pair(tre0Var.b(Boolean.TYPE), basicDerAdapter), new Pair(tre0Var.b(BigInteger.class), basicDerAdapter2), new Pair(tre0Var.b(BitString.class), basicDerAdapter3), new Pair(tre0Var.b(qg9.class), basicDerAdapter4), new Pair(tre0Var.b(Unit.class), basicDerAdapter5), new Pair(tre0Var.b(Void.class), basicDerAdapter6), new Pair(tre0Var.b(Void.class), basicDerAdapter7), new Pair(tre0Var.b(String.class), basicDerAdapter8), new Pair(tre0Var.b(Void.class), basicDerAdapter9), new Pair(tre0Var.b(Void.class), basicDerAdapter10), new Pair(tre0Var.b(Long.TYPE), basicDerAdapter11), new Pair(tre0Var.b(AnyValue.class), adapters$ANY_VALUE$1));
    }

    public static BasicDerAdapter a(String str, final DerAdapter[] derAdapterArr, final Function1 function1, final Function1 function2) {
        return new BasicDerAdapter(str, 0, 16L, new BasicDerAdapter.Codec<Object>() { // from class: okhttp3.tls.internal.der.Adapters$sequence$codec$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final Object a(DerReader derReader) {
                derReader.getClass();
                DerAdapter[] derAdapterArr2 = derAdapterArr;
                Function1 function3 = function2;
                ArrayList arrayList = derReader.d;
                arrayList.add(null);
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (arrayList2.size() < derAdapterArr2.length) {
                        arrayList2.add(derAdapterArr2[arrayList2.size()].d(derReader));
                    }
                    if (derReader.c() == null) {
                        Object objInvoke = function3.invoke(arrayList2);
                        arrayList.remove(arrayList.size() - 1);
                        return objInvoke;
                    }
                    throw new ProtocolException("unexpected " + derReader.c() + " at " + derReader);
                } catch (Throwable th) {
                    arrayList.remove(arrayList.size() - 1);
                    throw th;
                }
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void b(DerWriter derWriter, Object obj) {
                derWriter.getClass();
                List list = (List) function1.invoke(obj);
                DerAdapter[] derAdapterArr2 = derAdapterArr;
                ArrayList arrayList = derWriter.b;
                arrayList.add(null);
                try {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        DerAdapter derAdapter = derAdapterArr2[i2];
                        derAdapter.getClass();
                        derAdapter.b(derWriter, list.get(i2));
                    }
                    arrayList.remove(arrayList.size() - 1);
                } catch (Throwable th) {
                    arrayList.remove(arrayList.size() - 1);
                    throw th;
                }
            }
        }, false, null, false);
    }
}
