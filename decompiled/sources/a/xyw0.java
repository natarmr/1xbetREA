package a;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.EnumMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xyw0 {
    public static final xyw0 c = new xyw0(100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f41726a;
    public final int b;

    public xyw0(int i) {
        EnumMap enumMap = new EnumMap(wyw0.class);
        this.f41726a = enumMap;
        wyw0 wyw0Var = wyw0.AD_STORAGE;
        tyw0 tyw0Var = tyw0.UNINITIALIZED;
        enumMap.put(wyw0Var, tyw0Var);
        enumMap.put(wyw0.ANALYTICS_STORAGE, tyw0Var);
        this.b = i;
    }

    public static String a(int i) {
        if (i == -30) {
            return "TCF";
        }
        if (i == -20) {
            return "API";
        }
        if (i == -10) {
            return "MANIFEST";
        }
        if (i == 0) {
            return "1P_API";
        }
        if (i == 30) {
            return "1P_INIT";
        }
        if (i != 90) {
            return i != 100 ? "OTHER" : GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        return "REMOTE_CONFIG";
    }

    public static xyw0 b(int i, Bundle bundle) {
        if (bundle == null) {
            return new xyw0(i);
        }
        EnumMap enumMap = new EnumMap(wyw0.class);
        for (wyw0 wyw0Var : vyw0.STORAGE.f38270a) {
            enumMap.put(wyw0Var, d(bundle.getString(wyw0Var.f39994a)));
        }
        return new xyw0(enumMap, i);
    }

    public static xyw0 c(int i, String str) {
        EnumMap enumMap = new EnumMap(wyw0.class);
        wyw0[] wyw0VarArr = vyw0.STORAGE.f38270a;
        for (int i2 = 0; i2 < wyw0VarArr.length; i2++) {
            String str2 = str == null ? "" : str;
            wyw0 wyw0Var = wyw0VarArr[i2];
            int i3 = i2 + 2;
            if (i3 < str2.length()) {
                enumMap.put(wyw0Var, e(str2.charAt(i3)));
            } else {
                enumMap.put(wyw0Var, tyw0.UNINITIALIZED);
            }
        }
        return new xyw0(enumMap, i);
    }

    public static tyw0 d(String str) {
        tyw0 tyw0Var = tyw0.UNINITIALIZED;
        if (str == null) {
            return tyw0Var;
        }
        if (str.equals("granted")) {
            return tyw0.GRANTED;
        }
        return str.equals("denied") ? tyw0.DENIED : tyw0Var;
    }

    public static tyw0 e(char c2) {
        if (c2 == '+') {
            return tyw0.POLICY;
        }
        if (c2 != '0') {
            return c2 != '1' ? tyw0.UNINITIALIZED : tyw0.GRANTED;
        }
        return tyw0.DENIED;
    }

    public static char h(tyw0 tyw0Var) {
        if (tyw0Var == null) {
            return '-';
        }
        int iOrdinal = tyw0Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i, int i2) {
        int i3 = -30;
        if (i == -20) {
            if (i2 == -30) {
                return true;
            }
            i = -20;
        }
        if (i != -30) {
            i3 = i;
        } else if (i2 == -20) {
            return true;
        }
        return i3 == i2 || i < i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xyw0) {
            xyw0 xyw0Var = (xyw0) obj;
            for (wyw0 wyw0Var : vyw0.STORAGE.f38270a) {
                if (this.f41726a.get(wyw0Var) == xyw0Var.f41726a.get(wyw0Var)) {
                }
            }
            if (this.b == xyw0Var.b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0030  */
    public final String f() {
        int iOrdinal;
        StringBuilder sb = new StringBuilder("G1");
        for (wyw0 wyw0Var : vyw0.STORAGE.f38270a) {
            tyw0 tyw0Var = (tyw0) this.f41726a.get(wyw0Var);
            char c2 = '-';
            if (tyw0Var != null && (iOrdinal = tyw0Var.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c2 = '1';
                } else if (iOrdinal == 2) {
                    c2 = '0';
                } else if (iOrdinal == 3) {
                    c2 = '1';
                }
            }
            sb.append(c2);
        }
        return sb.toString();
    }

    public final String g() {
        StringBuilder sb = new StringBuilder("G1");
        for (wyw0 wyw0Var : vyw0.STORAGE.f38270a) {
            sb.append(h((tyw0) this.f41726a.get(wyw0Var)));
        }
        return sb.toString();
    }

    public final int hashCode() {
        Iterator it = this.f41726a.values().iterator();
        int iHashCode = this.b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((tyw0) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(wyw0 wyw0Var) {
        return ((tyw0) this.f41726a.get(wyw0Var)) != tyw0.DENIED;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final xyw0 j(xyw0 xyw0Var) {
        EnumMap enumMap = new EnumMap(wyw0.class);
        for (wyw0 wyw0Var : vyw0.STORAGE.f38270a) {
            tyw0 tyw0Var = (tyw0) this.f41726a.get(wyw0Var);
            tyw0 tyw0Var2 = (tyw0) xyw0Var.f41726a.get(wyw0Var);
            if (tyw0Var == null) {
                tyw0Var = tyw0Var2;
            } else if (tyw0Var2 != null) {
                tyw0 tyw0Var3 = tyw0.UNINITIALIZED;
                if (tyw0Var == tyw0Var3) {
                    tyw0Var = tyw0Var2;
                } else if (tyw0Var2 != tyw0Var3) {
                    tyw0 tyw0Var4 = tyw0.POLICY;
                    if (tyw0Var == tyw0Var4) {
                        tyw0Var = tyw0Var2;
                    } else if (tyw0Var2 != tyw0Var4) {
                        tyw0 tyw0Var5 = tyw0.DENIED;
                        tyw0Var = (tyw0Var == tyw0Var5 || tyw0Var2 == tyw0Var5) ? tyw0Var5 : tyw0.GRANTED;
                    }
                }
            }
            if (tyw0Var != null) {
                enumMap.put(wyw0Var, tyw0Var);
            }
        }
        return new xyw0(enumMap, 100);
    }

    public final xyw0 k(xyw0 xyw0Var) {
        EnumMap enumMap = new EnumMap(wyw0.class);
        for (wyw0 wyw0Var : vyw0.STORAGE.f38270a) {
            tyw0 tyw0Var = (tyw0) this.f41726a.get(wyw0Var);
            if (tyw0Var == tyw0.UNINITIALIZED) {
                tyw0Var = (tyw0) xyw0Var.f41726a.get(wyw0Var);
            }
            if (tyw0Var != null) {
                enumMap.put(wyw0Var, tyw0Var);
            }
        }
        return new xyw0(enumMap, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(a(this.b));
        for (wyw0 wyw0Var : vyw0.STORAGE.f38270a) {
            sb.append(Separators.COMMA);
            sb.append(wyw0Var.f39994a);
            sb.append("=");
            tyw0 tyw0Var = (tyw0) this.f41726a.get(wyw0Var);
            if (tyw0Var == null) {
                tyw0Var = tyw0.UNINITIALIZED;
            }
            sb.append(tyw0Var);
        }
        return sb.toString();
    }

    public xyw0(EnumMap enumMap, int i) {
        EnumMap enumMap2 = new EnumMap(wyw0.class);
        this.f41726a = enumMap2;
        enumMap2.putAll(enumMap);
        this.b = i;
    }
}
