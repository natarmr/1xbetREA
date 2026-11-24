package a;

import android.gov.nist.core.Separators;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.Regex;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;

/* JADX INFO: loaded from: classes7.dex */
public abstract class jii0 {
    /* JADX WARN: Code duplicated, block: B:386:0x08e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:588:0x0900 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x08eb A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static wtw a(y9g0 y9g0Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        q8x q8xVar;
        int i;
        int i2;
        q8x[] q8xVarArr;
        int i3;
        int i4;
        q8x qo80Var;
        q8x mo80Var;
        ho80 ho80Var;
        ho80 ho80Var2;
        omf0 omf0Var = new omf0(y9g0Var, cls, method);
        Annotation[] annotationArr = omf0Var.d;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String str = "HEAD";
            boolean z4 = true;
            q8x q8xVar2 = null;
            if (i6 >= length) {
                if (omf0Var.o == null) {
                    throw ay3.Y(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!omf0Var.p) {
                    if (omf0Var.r) {
                        throw ay3.Y(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (omf0Var.q) {
                        throw ay3.Y(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = omf0Var.e;
                int length2 = annotationArr2.length;
                omf0Var.w = new q8x[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    q8x[] q8xVarArr2 = omf0Var.w;
                    Type type = omf0Var.f[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        q8xVar = q8xVar2;
                        int i10 = i5;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr3[i10];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = length2;
                            if (annotation instanceof bot0) {
                                omf0Var.c(i8, type);
                                if (omf0Var.n) {
                                    throw ay3.Z(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (omf0Var.j) {
                                    throw ay3.Z(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (omf0Var.k) {
                                    throw ay3.Z(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (omf0Var.l) {
                                    throw ay3.Z(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (omf0Var.m) {
                                    throw ay3.Z(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (omf0Var.s != null) {
                                    throw ay3.Z(method, i8, "@Url cannot be used with @%s URL", omf0Var.o);
                                }
                                omf0Var.n = true;
                                if (type != HttpUrl.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw ay3.Z(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                qo80Var = new lo80(method, i8, (byte) 1);
                                i = i7;
                            } else {
                                i = i7;
                                boolean z5 = annotation instanceof z190;
                                y9g0 y9g0Var2 = omf0Var.f25502a;
                                if (z5) {
                                    omf0Var.c(i8, type);
                                    if (omf0Var.k) {
                                        throw ay3.Z(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (omf0Var.l) {
                                        throw ay3.Z(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (omf0Var.m) {
                                        throw ay3.Z(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (omf0Var.n) {
                                        throw ay3.Z(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (omf0Var.s == null) {
                                        throw ay3.Z(method, i8, "@Path can only be used with relative url on @%s", omf0Var.o);
                                    }
                                    omf0Var.j = true;
                                    z190 z190Var = (z190) annotation;
                                    String strValue = z190Var.value();
                                    if (!omf0.z.matcher(strValue).matches()) {
                                        throw ay3.Z(method, i8, "@Path parameter name must match %s. Found: %s", omf0.y.pattern(), strValue);
                                    }
                                    if (!omf0Var.v.contains(strValue)) {
                                        throw ay3.Z(method, i8, "URL \"%s\" does not contain \"{%s}\".", omf0Var.s, strValue);
                                    }
                                    y9g0Var2.e(type, annotationArr3);
                                    qo80Var = new no80(omf0Var.c, i8, strValue, z190Var.encoded());
                                } else {
                                    i2 = i10;
                                    q8xVarArr = q8xVarArr2;
                                    if (annotation instanceof nkd0) {
                                        omf0Var.c(i8, type);
                                        nkd0 nkd0Var = (nkd0) annotation;
                                        String strValue2 = nkd0Var.value();
                                        boolean zEncoded = nkd0Var.encoded();
                                        i3 = i9;
                                        Class clsS = ay3.S(type);
                                        i4 = length3;
                                        omf0Var.k = true;
                                        if (!Iterable.class.isAssignableFrom(clsS)) {
                                            if (clsS.isArray()) {
                                                y9g0Var2.e(omf0.a(clsS.getComponentType()), annotationArr3);
                                                ho80Var2 = new ho80(new jo80((byte) 2, strValue2, zEncoded), (byte) 1);
                                            } else {
                                                y9g0Var2.e(type, annotationArr3);
                                                qo80Var = new jo80((byte) 2, strValue2, zEncoded);
                                            }
                                            str = str;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw ay3.Z(method, i8, clsS.getSimpleName() + " must include generic type (e.g., " + clsS.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            y9g0Var2.e(ay3.R(0, (ParameterizedType) type), annotationArr3);
                                            ho80Var2 = new ho80(new jo80((byte) 2, strValue2, zEncoded), (byte) 0);
                                        }
                                        qo80Var = ho80Var2;
                                        str = str;
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof pkd0) {
                                            omf0Var.c(i8, type);
                                            boolean zEncoded2 = ((pkd0) annotation).encoded();
                                            Class clsS2 = ay3.S(type);
                                            omf0Var.l = true;
                                            if (Iterable.class.isAssignableFrom(clsS2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw ay3.Z(method, i8, clsS2.getSimpleName() + " must include generic type (e.g., " + clsS2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                y9g0Var2.e(ay3.R(0, (ParameterizedType) type), annotationArr3);
                                                ho80Var2 = new ho80(new oo80(zEncoded2), (byte) 0);
                                            } else if (clsS2.isArray()) {
                                                y9g0Var2.e(omf0.a(clsS2.getComponentType()), annotationArr3);
                                                ho80Var2 = new ho80(new oo80(zEncoded2), (byte) 1);
                                            } else {
                                                y9g0Var2.e(type, annotationArr3);
                                                qo80Var = new oo80(zEncoded2);
                                            }
                                            qo80Var = ho80Var2;
                                        } else if (annotation instanceof okd0) {
                                            omf0Var.c(i8, type);
                                            Class clsS3 = ay3.S(type);
                                            omf0Var.m = true;
                                            if (!Map.class.isAssignableFrom(clsS3)) {
                                                throw ay3.Z(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeT = ay3.T(type, clsS3);
                                            if (!(typeT instanceof ParameterizedType)) {
                                                throw ay3.Z(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeT;
                                            Type typeR = ay3.R(0, parameterizedType);
                                            if (String.class != typeR) {
                                                throw ay3.Z(method, i8, "@QueryMap keys must be of type String: " + typeR, new Object[0]);
                                            }
                                            y9g0Var2.e(ay3.R(1, parameterizedType), annotationArr3);
                                            qo80Var = new ko80((byte) 2, i8, method, ((okd0) annotation).encoded());
                                        } else {
                                            str = str;
                                            if (annotation instanceof xpv) {
                                                omf0Var.c(i8, type);
                                                xpv xpvVar = (xpv) annotation;
                                                String strValue3 = xpvVar.value();
                                                Class clsS4 = ay3.S(type);
                                                if (Iterable.class.isAssignableFrom(clsS4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw ay3.Z(method, i8, clsS4.getSimpleName() + " must include generic type (e.g., " + clsS4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    y9g0Var2.e(ay3.R(0, (ParameterizedType) type), annotationArr3);
                                                    mo80Var = new ho80(new jo80((byte) 1, strValue3, xpvVar.allowUnsafeNonAsciiValues()), (byte) 0);
                                                } else if (clsS4.isArray()) {
                                                    y9g0Var2.e(omf0.a(clsS4.getComponentType()), annotationArr3);
                                                    mo80Var = new ho80(new jo80((byte) 1, strValue3, xpvVar.allowUnsafeNonAsciiValues()), (byte) 1);
                                                } else {
                                                    y9g0Var2.e(type, annotationArr3);
                                                    qo80Var = new jo80((byte) 1, strValue3, xpvVar.allowUnsafeNonAsciiValues());
                                                }
                                                qo80Var = mo80Var;
                                            } else if (annotation instanceof jrv) {
                                                if (type == Headers.class) {
                                                    qo80Var = new lo80(method, i8, (byte) 0);
                                                } else {
                                                    omf0Var.c(i8, type);
                                                    Class clsS5 = ay3.S(type);
                                                    if (!Map.class.isAssignableFrom(clsS5)) {
                                                        throw ay3.Z(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeT2 = ay3.T(type, clsS5);
                                                    if (!(typeT2 instanceof ParameterizedType)) {
                                                        throw ay3.Z(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeT2;
                                                    Type typeR2 = ay3.R(0, parameterizedType2);
                                                    if (String.class != typeR2) {
                                                        throw ay3.Z(method, i8, "@HeaderMap keys must be of type String: " + typeR2, new Object[0]);
                                                    }
                                                    y9g0Var2.e(ay3.R(1, parameterizedType2), annotationArr3);
                                                    qo80Var = new ko80((byte) 1, i8, method, ((jrv) annotation).allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof pqp) {
                                                omf0Var.c(i8, type);
                                                if (!omf0Var.q) {
                                                    throw ay3.Z(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                pqp pqpVar = (pqp) annotation;
                                                String strValue4 = pqpVar.value();
                                                boolean zEncoded3 = pqpVar.encoded();
                                                omf0Var.g = true;
                                                Class clsS6 = ay3.S(type);
                                                if (Iterable.class.isAssignableFrom(clsS6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw ay3.Z(method, i8, clsS6.getSimpleName() + " must include generic type (e.g., " + clsS6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    y9g0Var2.e(ay3.R(0, (ParameterizedType) type), annotationArr3);
                                                    mo80Var = new ho80(new jo80((byte) 0, strValue4, zEncoded3), (byte) 0);
                                                } else if (clsS6.isArray()) {
                                                    y9g0Var2.e(omf0.a(clsS6.getComponentType()), annotationArr3);
                                                    mo80Var = new ho80(new jo80((byte) 0, strValue4, zEncoded3), (byte) 1);
                                                } else {
                                                    y9g0Var2.e(type, annotationArr3);
                                                    qo80Var = new jo80((byte) 0, strValue4, zEncoded3);
                                                }
                                                qo80Var = mo80Var;
                                            } else if (annotation instanceof uqp) {
                                                omf0Var.c(i8, type);
                                                if (!omf0Var.q) {
                                                    throw ay3.Z(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsS7 = ay3.S(type);
                                                if (!Map.class.isAssignableFrom(clsS7)) {
                                                    throw ay3.Z(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeT3 = ay3.T(type, clsS7);
                                                if (!(typeT3 instanceof ParameterizedType)) {
                                                    throw ay3.Z(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeT3;
                                                byte b = 0;
                                                Type typeR3 = ay3.R(0, parameterizedType3);
                                                if (String.class != typeR3) {
                                                    throw ay3.Z(method, i8, "@FieldMap keys must be of type String: " + typeR3, new Object[0]);
                                                }
                                                y9g0Var2.e(ay3.R(1, parameterizedType3), annotationArr3);
                                                omf0Var.g = true;
                                                qo80Var = new ko80(b, i8, method, ((uqp) annotation).encoded());
                                            } else if (annotation instanceof nq80) {
                                                omf0Var.c(i8, type);
                                                if (!omf0Var.r) {
                                                    throw ay3.Z(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                nq80 nq80Var = (nq80) annotation;
                                                omf0Var.h = true;
                                                String strValue5 = nq80Var.value();
                                                Class clsS8 = ay3.S(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsS8);
                                                    po80 po80Var = po80.f27317a;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw ay3.Z(method, i8, clsS8.getSimpleName() + " must include generic type (e.g., " + clsS8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        byte b2 = 0;
                                                        if (!MultipartBody.Part.class.isAssignableFrom(ay3.S(ay3.R(0, (ParameterizedType) type)))) {
                                                            throw ay3.Z(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        qo80Var = new ho80(po80Var, b2);
                                                    } else if (clsS8.isArray()) {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(clsS8.getComponentType())) {
                                                            throw ay3.Z(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        qo80Var = new ho80(po80Var, (byte) 1);
                                                    } else {
                                                        if (!MultipartBody.Part.class.isAssignableFrom(clsS8)) {
                                                            throw ay3.Z(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        qo80Var = po80Var;
                                                    }
                                                } else {
                                                    String[] strArr = {"Content-Disposition", kng0.l("form-data; name=\"", strValue5, Separators.DOUBLE_QUOTE), "Content-Transfer-Encoding", nq80Var.encoding()};
                                                    Headers headers = Headers.b;
                                                    Headers headersA = Headers.Companion.a(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsS8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw ay3.Z(method, i8, clsS8.getSimpleName() + " must include generic type (e.g., " + clsS8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        byte b3 = 0;
                                                        Type typeR4 = ay3.R(0, (ParameterizedType) type);
                                                        if (MultipartBody.Part.class.isAssignableFrom(ay3.S(typeR4))) {
                                                            throw ay3.Z(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        ho80Var = new ho80(new mo80(method, i8, headersA, y9g0Var2.c(typeR4, annotationArr3, annotationArr)), b3);
                                                    } else if (clsS8.isArray()) {
                                                        Class clsA = omf0.a(clsS8.getComponentType());
                                                        if (MultipartBody.Part.class.isAssignableFrom(clsA)) {
                                                            throw ay3.Z(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        ho80Var = new ho80(new mo80(method, i8, headersA, y9g0Var2.c(clsA, annotationArr3, annotationArr)), (byte) 1);
                                                    } else {
                                                        if (MultipartBody.Part.class.isAssignableFrom(clsS8)) {
                                                            throw ay3.Z(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        mo80Var = new mo80(method, i8, headersA, y9g0Var2.c(type, annotationArr3, annotationArr));
                                                        qo80Var = mo80Var;
                                                    }
                                                    qo80Var = ho80Var;
                                                }
                                            } else if (annotation instanceof oq80) {
                                                omf0Var.c(i8, type);
                                                if (!omf0Var.r) {
                                                    throw ay3.Z(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                omf0Var.h = true;
                                                Class clsS9 = ay3.S(type);
                                                if (!Map.class.isAssignableFrom(clsS9)) {
                                                    throw ay3.Z(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeT4 = ay3.T(type, clsS9);
                                                if (!(typeT4 instanceof ParameterizedType)) {
                                                    throw ay3.Z(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeT4;
                                                Type typeR5 = ay3.R(0, parameterizedType4);
                                                if (String.class != typeR5) {
                                                    throw ay3.Z(method, i8, "@PartMap keys must be of type String: " + typeR5, new Object[0]);
                                                }
                                                Type typeR6 = ay3.R(1, parameterizedType4);
                                                if (MultipartBody.Part.class.isAssignableFrom(ay3.S(typeR6))) {
                                                    throw ay3.Z(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                qo80Var = new mo80(method, i8, y9g0Var2.c(typeR6, annotationArr3, annotationArr), ((oq80) annotation).encoding());
                                            } else if (annotation instanceof jb8) {
                                                omf0Var.c(i8, type);
                                                if (omf0Var.q || omf0Var.r) {
                                                    throw ay3.Z(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (omf0Var.i) {
                                                    throw ay3.Z(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    vke vkeVarC = y9g0Var2.c(type, annotationArr3, annotationArr);
                                                    omf0Var.i = true;
                                                    qo80Var = new io80(method, i8, vkeVarC);
                                                } catch (RuntimeException e) {
                                                    throw ay3.a0(method, e, i8, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof doo0) {
                                                omf0Var.c(i8, type);
                                                Class clsA2 = omf0.a(ay3.S(type));
                                                for (int i12 = i8 - 1; i12 >= 0; i12--) {
                                                    q8x q8xVar3 = omf0Var.w[i12];
                                                    if ((q8xVar3 instanceof qo80) && ((qo80) q8xVar3).f29061a.equals(clsA2)) {
                                                        throw ay3.Z(method, i8, "@Tag type " + clsA2.getName() + " is duplicate of " + ov90.b.d(method, i12) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                qo80Var = new qo80(clsA2);
                                            } else {
                                                qo80Var = null;
                                            }
                                        }
                                        str = str;
                                    }
                                }
                                if (qo80Var != null) {
                                    if (q8xVar == null) {
                                        throw ay3.Z(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    q8xVar = qo80Var;
                                }
                                i10 = i2 + 1;
                                annotationArr2 = annotationArr4;
                                i7 = i;
                                length2 = i11;
                                i9 = i3;
                                str = str;
                                q8xVarArr2 = q8xVarArr;
                                length3 = i4;
                            }
                            i2 = i10;
                            q8xVarArr = q8xVarArr2;
                            i3 = i9;
                            i4 = length3;
                            if (qo80Var != null) {
                                if (q8xVar == null) {
                                    throw ay3.Z(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                q8xVar = qo80Var;
                            }
                            i10 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i11;
                            i9 = i3;
                            str = str;
                            q8xVarArr2 = q8xVarArr;
                            length3 = i4;
                        }
                    } else {
                        q8xVar = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i13 = length2;
                    String str2 = str;
                    int i14 = i7;
                    q8x[] q8xVarArr3 = q8xVarArr2;
                    int i15 = i9;
                    if (q8xVar == null) {
                        if (i15 != 0) {
                            try {
                                if (ay3.S(type) == yje.class) {
                                    omf0Var.x = true;
                                    q8xVar = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw ay3.Z(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    q8xVarArr3[i8] = q8xVar;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i14;
                    length2 = i13;
                    str = str2;
                    i5 = 0;
                    q8xVar2 = null;
                }
                String str3 = str;
                if (omf0Var.s == null && !omf0Var.n) {
                    throw ay3.Y(method, null, "Missing either @%s URL or @Url parameter.", omf0Var.o);
                }
                boolean z6 = omf0Var.q;
                if (!z6 && !omf0Var.r && !omf0Var.p && omf0Var.i) {
                    throw ay3.Y(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !omf0Var.g) {
                    throw ay3.Y(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (omf0Var.r && !omf0Var.h) {
                    throw ay3.Y(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                pmf0 pmf0Var = new pmf0(omf0Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (ay3.U(genericReturnType2)) {
                    throw ay3.Y(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw ay3.Y(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = pmf0Var.l;
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeR7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeR7 instanceof WildcardType) {
                        typeR7 = ((WildcardType) typeR7).getLowerBounds()[0];
                    }
                    if (ay3.S(typeR7) == jtf0.class && (typeR7 instanceof ParameterizedType)) {
                        typeR7 = ay3.R(0, (ParameterizedType) typeR7);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (ay3.S(typeR7) == to9.class) {
                            throw ay3.Y(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", ay3.R(0, (ParameterizedType) typeR7));
                        }
                        z3 = ay3.o && typeR7 == Unit.class;
                        z2 = false;
                    }
                    genericReturnType = new aut0(null, to9.class, typeR7);
                    if (!ay3.X(annotations, w7k0.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = x7k0.b;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    vo9 vo9VarA = y9g0Var.a(genericReturnType, annotations);
                    Type typeE = vo9VarA.e();
                    if (typeE == Response.class) {
                        throw ay3.Y(method, null, Separators.QUOTE + ay3.S(typeE).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeE == jtf0.class) {
                        throw ay3.Y(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (pmf0Var.d.equals(str3) && !Void.class.equals(typeE) && (!ay3.o || typeE != Unit.class)) {
                        throw ay3.Y(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        vke vkeVarD = y9g0Var.d(typeE, method.getAnnotations());
                        Call.Factory factory = y9g0Var.b;
                        if (z7) {
                            return z2 ? new vtw(pmf0Var, factory, vkeVarD, vo9VarA) : new utw(pmf0Var, factory, vkeVarD, vo9VarA, z);
                        }
                        return new ttw(pmf0Var, factory, vkeVarD, vo9VarA);
                    } catch (RuntimeException e2) {
                        throw ay3.Y(method, e2, "Unable to create converter for %s", typeE);
                    }
                } catch (RuntimeException e3) {
                    throw ay3.Y(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof qyh) {
                omf0Var.b("DELETE", ((qyh) annotation2).value(), false);
            } else if (annotation2 instanceof ofr) {
                omf0Var.b("GET", ((ofr) annotation2).value(), false);
            } else if (annotation2 instanceof tjv) {
                omf0Var.b("HEAD", ((tjv) annotation2).value(), false);
            } else if (annotation2 instanceof fg80) {
                omf0Var.b("PATCH", ((fg80) annotation2).value(), true);
            } else if (annotation2 instanceof kg80) {
                omf0Var.b("POST", ((kg80) annotation2).value(), true);
            } else if (annotation2 instanceof lg80) {
                omf0Var.b("PUT", ((lg80) annotation2).value(), true);
            } else if (annotation2 instanceof p960) {
                omf0Var.b("OPTIONS", ((p960) annotation2).value(), false);
            } else if (annotation2 instanceof ujv) {
                ujv ujvVar = (ujv) annotation2;
                omf0Var.b(ujvVar.method(), ujvVar.path(), ujvVar.hasBody());
            } else if (annotation2 instanceof dtv) {
                dtv dtvVar = (dtv) annotation2;
                String[] strArrValue = dtvVar.value();
                if (strArrValue.length == 0) {
                    throw ay3.Y(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = dtvVar.allowUnsafeNonAsciiValues();
                Headers.Builder builder = new Headers.Builder();
                int length4 = strArrValue.length;
                int i16 = 0;
                while (i16 < length4) {
                    String str4 = strArrValue[i16];
                    int iIndexOf = str4.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw ay3.Y(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            Regex regex = MediaType.e;
                            omf0Var.u = MediaType.Companion.a(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw ay3.Y(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        builder.c(strSubstring, strTrim);
                    } else {
                        builder.a(strSubstring, strTrim);
                    }
                    i16++;
                    z4 = z8;
                }
                omf0Var.t = _HeadersCommonKt.b(builder);
            } else if (annotation2 instanceof nx40) {
                if (omf0Var.q) {
                    throw ay3.Y(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                omf0Var.r = true;
            } else if (!(annotation2 instanceof zvq)) {
                continue;
            } else {
                if (omf0Var.r) {
                    throw ay3.Y(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                omf0Var.q = true;
            }
            i6++;
        }
    }
}
