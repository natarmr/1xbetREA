package a;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class uuw0 extends ryw0 {
    public char d;
    public long e;
    public String f;
    public final quw0 g;
    public final quw0 h;
    public final quw0 i;
    public final quw0 j;
    public final quw0 k;
    public final quw0 l;
    public final quw0 m;
    public final quw0 n;
    public final quw0 o;

    public uuw0(kxw0 kxw0Var) {
        super(kxw0Var);
        this.d = (char) 0;
        this.e = -1L;
        this.g = new quw0(this, 6, false, false);
        this.h = new quw0(this, 6, true, false);
        this.i = new quw0(this, 6, false, true);
        this.j = new quw0(this, 5, false, false);
        this.k = new quw0(this, 5, true, false);
        this.l = new quw0(this, 5, false, true);
        this.m = new quw0(this, 4, false, false);
        this.n = new quw0(this, 3, false, false);
        this.o = new quw0(this, 2, false, false);
    }

    public static tuw0 q1(String str) {
        if (str == null) {
            return null;
        }
        return new tuw0(str);
    }

    public static String t1(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strU1 = u1(obj, z);
        String strU2 = u1(obj2, z);
        String strU3 = u1(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strU1)) {
            sb.append(str2);
            sb.append(strU1);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strU2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strU2);
        }
        if (!TextUtils.isEmpty(strU3)) {
            sb.append(str3);
            sb.append(strU3);
        }
        return sb.toString();
    }

    public static String u1(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            kng0.A(sb, str, jRound, "...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof tuw0) {
                return ((tuw0) obj).f34571a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = kxw0.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    public final void r1(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(s1(), i)) {
            Log.println(i, s1(), t1(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        s0x.H(str);
        fxw0 fxw0Var = ((kxw0) this.b).g;
        if (fxw0Var == null) {
            Log.println(6, s1(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!fxw0Var.c) {
                Log.println(6, s1(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            fxw0Var.v1(new ouw0(this, i, str, obj, obj2, obj3));
        }
    }

    public final String s1() {
        String str;
        synchronized (this) {
            try {
                str = this.f;
                if (str == null) {
                    ((kxw0) ((kxw0) this.b).d.b).getClass();
                    str = "FA";
                    this.f = "FA";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
