package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public enum mfy {
    BOOLEAN(iwb0.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(iwb0.CHAR, "char", TokenNames.C, "java.lang.Character"),
    BYTE(iwb0.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(iwb0.SHORT, "short", TokenNames.S, "java.lang.Short"),
    INT(iwb0.INT, "int", TokenNames.I, "java.lang.Integer"),
    FLOAT(iwb0.FLOAT, "float", TokenNames.F, "java.lang.Float"),
    LONG(iwb0.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(iwb0.DOUBLE, "double", "D", "java.lang.Double");

    public static final HashMap m = new HashMap();
    public static final EnumMap n = new EnumMap(iwb0.class);
    public static final HashMap o = new HashMap();
    public static final HashSet p = new HashSet();
    public static final HashMap q = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iwb0 f21715a;
    public final String b;
    public final String c;
    public final swq d;

    static {
        for (mfy mfyVar : values()) {
            HashMap map = m;
            String str = mfyVar.b;
            String str2 = mfyVar.c;
            map.put(str, mfyVar);
            n.put(mfyVar.d(), mfyVar);
            o.put(str2, mfyVar);
            String strReplace = mfyVar.d.f32934a.f34663a.replace('.', '/');
            p.add(strReplace);
            q.put(strReplace, b1j.k(Separators.LPAREN, str2, ")L", strReplace, Separators.SEMICOLON));
        }
    }

    mfy(iwb0 iwb0Var, String str, String str2, String str3) {
        if (iwb0Var == null) {
            a(8);
            throw null;
        }
        this.f21715a = iwb0Var;
        this.b = str;
        this.c = str2;
        this.d = new swq(str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = Payload.TYPE;
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case 13:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case 14:
                    objArr[1] = "getDesc";
                    break;
                case 15:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 6) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static mfy b(String str) {
        mfy mfyVar = (mfy) m.get(str);
        if (mfyVar != null) {
            return mfyVar;
        }
        c99.l("Non-primitive type name passed: ".concat(str));
        return null;
    }

    public final iwb0 d() {
        iwb0 iwb0Var = this.f21715a;
        if (iwb0Var != null) {
            return iwb0Var;
        }
        a(12);
        throw null;
    }
}
