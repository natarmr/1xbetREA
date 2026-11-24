package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class slw0 implements Iterable, jlw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32420a;

    public slw0(String str) {
        if (str != null) {
            this.f32420a = str;
        } else {
            jf4.o("StringValue cannot be null.");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02e4 A[PHI: r8
  0x02e4: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02d0, B:101:0x02d2, B:103:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.jlw0
    public final jlw0 c(String str, h0q0 h0q0Var, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        h0q0 h0q0Var2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                jf4.o(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strZzc = "undefined";
        String str3 = this.f32420a;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    pvm0.D("hasOwnProperty", arrayList, 1);
                    jlw0 jlw0VarS = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0));
                    boolean zEquals = "length".equals(jlw0VarS.zzc());
                    pfw0 pfw0Var = jlw0.a1;
                    if (zEquals) {
                        return pfw0Var;
                    }
                    double dDoubleValue = jlw0VarS.zzd().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? jlw0.b1 : pfw0Var;
                }
                jf4.o("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    pvm0.D("toString", arrayList, 0);
                    return this;
                }
                jf4.o("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    pvm0.D("toLocaleLowerCase", arrayList, 0);
                    return new slw0(str3.toLowerCase());
                }
                jf4.o("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    pvm0.F(1, "charAt", arrayList);
                    int iK = arrayList.isEmpty() ? 0 : (int) pvm0.K(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue());
                    return (iK < 0 || iK >= str3.length()) ? jlw0.c1 : new slw0(String.valueOf(str3.charAt(iK)));
                }
                jf4.o("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(i4)).zzc());
                        }
                        return new slw0(sb.toString());
                    }
                    return this;
                }
                jf4.o("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    pvm0.D("toLowerCase", arrayList, 0);
                    return new slw0(str3.toLowerCase(Locale.ENGLISH));
                }
                jf4.o("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    pvm0.F(1, "search", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzc()).matcher(str3);
                    return matcher.find() ? new ihw0(Double.valueOf(matcher.start())) : new ihw0(Double.valueOf(-1.0d));
                }
                jf4.o("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    pvm0.D("toLocaleUpperCase", arrayList, 0);
                    return new slw0(str3.toUpperCase());
                }
                jf4.o("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    pvm0.F(2, "lastIndexOf", arrayList);
                    String strZzc2 = arrayList.size() > 0 ? ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzc() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue();
                    return new ihw0(Double.valueOf(str3.lastIndexOf(strZzc2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : pvm0.K(dDoubleValue2)))));
                }
                jf4.o("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    pvm0.D("toUpperCase", arrayList, 0);
                    return new slw0(str3.toUpperCase(Locale.ENGLISH));
                }
                jf4.o("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    pvm0.D("toUpperCase", arrayList, 0);
                    return new slw0(str3.trim());
                }
                jf4.o("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    pvm0.F(1, "match", arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzc()).matcher(str3);
                    return matcher2.find() ? new rew0(Arrays.asList(new slw0(matcher2.group()))) : jlw0.W0;
                }
                jf4.o("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    pvm0.F(2, "slice", arrayList);
                    double dK = pvm0.K(!arrayList.isEmpty() ? ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue() : 0.0d);
                    double dMax = dK < 0.0d ? Math.max(((double) str3.length()) + dK, 0.0d) : Math.min(dK, str3.length());
                    double dK2 = pvm0.K(arrayList.size() > 1 ? ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new slw0(str3.substring(i5, Math.max(0, ((int) (dK2 < 0.0d ? Math.max(((double) str3.length()) + dK2, 0.0d) : Math.min(dK2, str3.length()))) - i5) + i5));
                }
                jf4.o("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    pvm0.F(2, "split", arrayList);
                    if (str3.length() == 0) {
                        return new rew0(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strZzc3 = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzc();
                        long J = arrayList.size() > 1 ? ((long) pvm0.J(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue())) & 4294967295L : 2147483647L;
                        if (J == 0) {
                            return new rew0();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strZzc3), ((int) J) + 1);
                        int length = strArrSplit.length;
                        if (!strZzc3.isEmpty() || length <= 0) {
                            i2 = length;
                            i3 = z;
                        } else {
                            boolean zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            if (!strArrSplit[i2].isEmpty()) {
                                i2 = length;
                                i3 = z;
                            }
                        }
                        if (length > J) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new slw0(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new rew0(arrayList2);
                }
                jf4.o("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    pvm0.F(2, "substring", arrayList);
                    int iK2 = !arrayList.isEmpty() ? (int) pvm0.K(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzd().doubleValue()) : 0;
                    int iK3 = arrayList.size() > 1 ? (int) pvm0.K(((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1)).zzd().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iK2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iK3, 0), str3.length());
                    return new slw0(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                jf4.o("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    pvm0.F(2, "replace", arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    jlw0 jlw0VarA = jlw0.V0;
                    if (!zIsEmpty2) {
                        strZzc = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(0)).zzc();
                        if (arrayList.size() > 1) {
                            jlw0VarA = ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) arrayList.get(1));
                        }
                    }
                    String str4 = strZzc;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (jlw0VarA instanceof giw0) {
                            jlw0VarA = ((giw0) jlw0VarA).a(h0q0Var, Arrays.asList(new slw0(str4), new ihw0(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strZzc4 = jlw0VarA.zzc();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new slw0(rw2.o(new StringBuilder(strSubstring.length() + String.valueOf(strZzc4).length() + strSubstring2.length()), strSubstring, strZzc4, strSubstring2));
                    }
                    return this;
                }
                jf4.o("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    pvm0.F(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        h0q0Var2 = h0q0Var;
                    } else {
                        h0q0Var2 = h0q0Var;
                        strZzc = ((okt0) h0q0Var2.b).s(h0q0Var2, (jlw0) arrayList.get(0)).zzc();
                    }
                    return new ihw0(Double.valueOf(str3.indexOf(strZzc, (int) pvm0.K(arrayList.size() < 2 ? 0.0d : ((okt0) h0q0Var2.b).s(h0q0Var2, (jlw0) arrayList.get(1)).zzd().doubleValue()))));
                }
                jf4.o("Command not supported");
                return null;
            default:
                jf4.o("Command not supported");
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof slw0) {
            return this.f32420a.equals(((slw0) obj).f32420a);
        }
        return false;
    }

    @Override // a.jlw0
    public final jlw0 h() {
        return new slw0(this.f32420a);
    }

    public final int hashCode() {
        return this.f32420a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qlw0(this, (byte) 1);
    }

    public final String toString() {
        String str = this.f32420a;
        return rw2.o(new StringBuilder(str.length() + 2), Separators.DOUBLE_QUOTE, str, Separators.DOUBLE_QUOTE);
    }

    @Override // a.jlw0
    public final String zzc() {
        return this.f32420a;
    }

    @Override // a.jlw0
    public final Double zzd() {
        String str = this.f32420a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // a.jlw0
    public final Boolean zze() {
        return Boolean.valueOf(!this.f32420a.isEmpty());
    }

    @Override // a.jlw0
    public final Iterator zzf() {
        return new qlw0(this, (byte) 0);
    }
}
