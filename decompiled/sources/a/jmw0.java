package a;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import java.util.EnumMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class jmw0 {
    public static final jmw0 f = new jmw0(100, (Boolean) null, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16787a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final EnumMap e;

    public jmw0(int i, Boolean bool, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(wyw0.class);
        this.e = enumMap;
        enumMap.put(wyw0.AD_USER_DATA, bool == null ? tyw0.UNINITIALIZED : bool.booleanValue() ? tyw0.GRANTED : tyw0.DENIED);
        this.f16787a = i;
        this.b = d();
        this.c = bool2;
        this.d = str;
    }

    public static jmw0 b(String str) {
        if (str == null || str.length() <= 0) {
            return f;
        }
        String[] strArrSplit = str.split(Separators.COLON);
        int i = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(wyw0.class);
        wyw0[] wyw0VarArr = vyw0.DMA.f38270a;
        int length = wyw0VarArr.length;
        int i2 = 1;
        int i3 = 0;
        while (i3 < length) {
            enumMap.put(wyw0VarArr[i3], xyw0.e(strArrSplit[i2].charAt(0)));
            i3++;
            i2++;
        }
        return new jmw0(enumMap, i, (Boolean) null, (String) null);
    }

    public static jmw0 c(int i, Bundle bundle) {
        if (bundle == null) {
            return new jmw0(i, (Boolean) null, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(wyw0.class);
        for (wyw0 wyw0Var : vyw0.DMA.f38270a) {
            enumMap.put(wyw0Var, xyw0.d(bundle.getString(wyw0Var.f39994a)));
        }
        return new jmw0(enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public final tyw0 a() {
        tyw0 tyw0Var = (tyw0) this.e.get(wyw0.AD_USER_DATA);
        return tyw0Var == null ? tyw0.UNINITIALIZED : tyw0Var;
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16787a);
        for (wyw0 wyw0Var : vyw0.DMA.f38270a) {
            sb.append(Separators.COLON);
            sb.append(xyw0.h((tyw0) this.e.get(wyw0Var)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jmw0)) {
            return false;
        }
        jmw0 jmw0Var = (jmw0) obj;
        if (this.b.equalsIgnoreCase(jmw0Var.b) && Objects.equals(this.c, jmw0Var.c)) {
            return Objects.equals(this.d, jmw0Var.d);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Boolean bool = this.c;
        if (bool == null) {
            i = 3;
        } else {
            i = true != bool.booleanValue() ? 13 : 7;
        }
        String str = this.d;
        return ((str == null ? 17 : str.hashCode()) * 137) + this.b.hashCode() + (i * 29);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(xyw0.a(this.f16787a));
        for (wyw0 wyw0Var : vyw0.DMA.f38270a) {
            sb.append(Separators.COMMA);
            sb.append(wyw0Var.f39994a);
            sb.append("=");
            tyw0 tyw0Var = (tyw0) this.e.get(wyw0Var);
            if (tyw0Var == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = tyw0Var.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public jmw0(EnumMap enumMap, int i, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(wyw0.class);
        this.e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f16787a = i;
        this.b = d();
        this.c = bool;
        this.d = str;
    }
}
