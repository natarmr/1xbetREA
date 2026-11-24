package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ncy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final scx f23316a;

    static {
        mrv.o0(jsm0.f17060a);
        f23316a = ucx.i(ysm0.f43175a, "kotlinx.serialization.json.JsonUnquotedLiteral");
    }

    public static final jdy a(Boolean bool) {
        return bool == null ? bdy.INSTANCE : new xcy(bool, false, null);
    }

    public static final jdy b(Number number) {
        return number == null ? bdy.INSTANCE : new xcy(number, false, null);
    }

    public static final jdy c(String str) {
        return str == null ? bdy.INSTANCE : new xcy(str, true, null);
    }

    public static final void d(mcy mcyVar, String str) {
        throw new IllegalArgumentException("Element " + sre0.f32672a.b(mcyVar.getClass()) + " is not a " + str);
    }

    public static final boolean e(jdy jdyVar) {
        Boolean boolB = wsm0.b(jdyVar.b());
        if (boolB != null) {
            return boolB.booleanValue();
        }
        throw new IllegalStateException(jdyVar + " does not represent a Boolean");
    }

    public static final int f(jdy jdyVar) {
        try {
            long jK = k(jdyVar);
            if (-2147483648L <= jK && jK <= 2147483647L) {
                return (int) jK;
            }
            throw new NumberFormatException(jdyVar.b() + " is not an Int");
        } catch (kcy e) {
            throw new NumberFormatException(e.f35453a);
        }
    }

    public static final Integer g(jdy jdyVar) {
        Long lValueOf;
        jdyVar.getClass();
        try {
            lValueOf = Long.valueOf(k(jdyVar));
        } catch (kcy unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    public static final yby h(mcy mcyVar) {
        mcyVar.getClass();
        yby ybyVar = mcyVar instanceof yby ? (yby) mcyVar : null;
        if (ybyVar != null) {
            return ybyVar;
        }
        d(mcyVar, "JsonArray");
        throw null;
    }

    public static final edy i(mcy mcyVar) {
        mcyVar.getClass();
        edy edyVar = mcyVar instanceof edy ? (edy) mcyVar : null;
        if (edyVar != null) {
            return edyVar;
        }
        d(mcyVar, "JsonObject");
        throw null;
    }

    public static final jdy j(mcy mcyVar) {
        mcyVar.getClass();
        jdy jdyVar = mcyVar instanceof jdy ? (jdy) mcyVar : null;
        if (jdyVar != null) {
            return jdyVar;
        }
        d(mcyVar, "JsonPrimitive");
        throw null;
    }

    public static final long k(jdy jdyVar) {
        jdyVar.getClass();
        fp fpVarE = qsm0.e(vby.d, jdyVar.b());
        String str = (String) fpVarE.g;
        long jK = fpVarE.k();
        if (fpVarE.h() == 10) {
            return jK;
        }
        int i = fpVarE.b;
        int i2 = i > 0 ? i - 1 : i;
        fp.t(fpVarE, kng0.l("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
