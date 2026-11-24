package a;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class zys0 {
    public static Collection a(Object obj) {
        if ((obj instanceof khy) && !(obj instanceof lhy)) {
            g(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            Intrinsics.g(e, zys0.class.getName());
            throw e;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof khy) && !(obj instanceof mhy)) {
            g(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            Intrinsics.g(e, zys0.class.getName());
            throw e;
        }
    }

    public static Map c(Object obj) {
        if ((obj instanceof khy) && !(obj instanceof ohy)) {
            g(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            Intrinsics.g(e, zys0.class.getName());
            throw e;
        }
    }

    public static Set d(Object obj) {
        if ((obj instanceof khy) && !(obj instanceof vhy)) {
            g(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            Intrinsics.g(e, zys0.class.getName());
            throw e;
        }
    }

    public static Object e(int i, Object obj) {
        if (obj == null || f(i, obj)) {
            return obj;
        }
        g(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean f(int i, Object obj) {
        int arity;
        if (obj instanceof wdr) {
            if (obj instanceof ger) {
                arity = ((ger) obj).getArity();
            } else if (obj instanceof Function0) {
                arity = 0;
            } else if (obj instanceof Function1) {
                arity = 1;
            } else if (obj instanceof Function2) {
                arity = 2;
            } else if (obj instanceof xdr) {
                arity = 3;
            } else if (obj instanceof ydr) {
                arity = 4;
            } else if (obj instanceof zdr) {
                arity = 5;
            } else if (obj instanceof aer) {
                arity = 6;
            } else if (obj instanceof ber) {
                arity = 7;
            } else if (obj instanceof cer) {
                arity = 8;
            } else if (obj instanceof der) {
                arity = 9;
            } else if (obj instanceof kdr) {
                arity = 10;
            } else if (obj instanceof ldr) {
                arity = 11;
            } else {
                boolean z = obj instanceof zer;
                if (z) {
                    arity = 12;
                } else if (obj instanceof mdr) {
                    arity = 13;
                } else if (obj instanceof ndr) {
                    arity = 14;
                } else if (obj instanceof odr) {
                    arity = 15;
                } else if (obj instanceof pdr) {
                    arity = 16;
                } else if (obj instanceof qdr) {
                    arity = 17;
                } else if (obj instanceof rdr) {
                    arity = 18;
                } else if (obj instanceof sdr) {
                    arity = 19;
                } else if (obj instanceof udr) {
                    arity = 20;
                } else if (obj instanceof vdr) {
                    arity = 21;
                } else {
                    arity = z ? 22 : -1;
                }
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    public static void g(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(kng0.l(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        Intrinsics.g(classCastException, zys0.class.getName());
        throw classCastException;
    }
}
