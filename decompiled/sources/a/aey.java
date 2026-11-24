package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final swq f753a;
    public static final qlc b;

    static {
        swq swqVar = new swq("kotlin.jvm.JvmField");
        f753a = swqVar;
        plc.S(swqVar);
        plc.S(new swq("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = plc.D("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        str.getClass();
        if (c(str)) {
            return str;
        }
        return "get" + zgc.J(str);
    }

    public static final String b(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder("set");
        sb.append(c(str) ? str.substring(2) : zgc.J(str));
        return sb.toString();
    }

    public static final boolean c(String str) {
        char cCharAt;
        str.getClass();
        return kotlin.text.c.x(str, "is", false) && str.length() != 2 && ('a' > (cCharAt = str.charAt(2)) || cCharAt > 'z');
    }
}
