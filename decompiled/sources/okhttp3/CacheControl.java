package okhttp3;

import a.bfn;
import a.c99;
import a.h97;
import a.ibc;
import a.rw2;
import a.uen;
import a.wen;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/CacheControl;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CacheControl {
    public static final CacheControl n = new CacheControl(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46078a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "Lokhttp3/CacheControl;", "FORCE_CACHE", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Code duplicated, block: B:108:0x0061 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:109:0x0067 A[EDGE_INSN: B:109:0x0067->B:22:0x0067 BREAK  A[LOOP:2: B:16:0x0049->B:20:0x005a], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:15:0x0044  */
        /* JADX WARN: Code duplicated, block: B:17:0x004b  */
        /* JADX WARN: Code duplicated, block: B:20:0x005a A[LOOP:2: B:16:0x0049->B:20:0x005a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:54:0x0102  */
        /* JADX WARN: Code duplicated, block: B:56:0x010b  */
        /* JADX WARN: Code duplicated, block: B:58:0x0113  */
        /* JADX WARN: Code duplicated, block: B:59:0x0119  */
        /* JADX WARN: Code duplicated, block: B:61:0x0121  */
        /* JADX WARN: Code duplicated, block: B:63:0x012a  */
        /* JADX WARN: Code duplicated, block: B:65:0x0133  */
        /* JADX WARN: Code duplicated, block: B:66:0x0138  */
        /* JADX WARN: Code duplicated, block: B:68:0x0140  */
        /* JADX WARN: Code duplicated, block: B:69:0x0146  */
        /* JADX WARN: Code duplicated, block: B:71:0x014e  */
        /* JADX WARN: Code duplicated, block: B:72:0x0154  */
        /* JADX WARN: Code duplicated, block: B:74:0x015c  */
        /* JADX WARN: Code duplicated, block: B:75:0x0162  */
        /* JADX WARN: Code duplicated, block: B:77:0x016a  */
        /* JADX WARN: Code duplicated, block: B:78:0x0172  */
        /* JADX WARN: Code duplicated, block: B:80:0x017a  */
        /* JADX WARN: Code duplicated, block: B:81:0x0180  */
        /* JADX WARN: Code duplicated, block: B:83:0x0189  */
        /* JADX WARN: Code duplicated, block: B:84:0x0190  */
        /* JADX WARN: Code duplicated, block: B:86:0x0198  */
        /* JADX WARN: Code duplicated, block: B:87:0x019f  */
        /* JADX WARN: Code duplicated, block: B:89:0x01a7  */
        public static CacheControl a(Headers headers) {
            int i;
            int length;
            int length2;
            int i2;
            String string;
            String string2;
            Headers headers2 = headers;
            int size = headers2.size();
            int i3 = 0;
            boolean z = true;
            String str = null;
            boolean z2 = false;
            boolean z3 = false;
            int iQ = -1;
            int iQ2 = -1;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            int iQ3 = -1;
            int iQ4 = -1;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            while (i3 < size) {
                String strC = _HeadersCommonKt.c(headers2, i3);
                String strE = _HeadersCommonKt.e(headers2, i3);
                if (strC.equalsIgnoreCase("Cache-Control")) {
                    if (str == null) {
                        str = strE;
                    }
                    i = 0;
                    while (i < strE.length()) {
                        length = strE.length();
                        length2 = i;
                        while (true) {
                            if (length2 < length) {
                                i2 = size;
                                length2 = strE.length();
                                break;
                            }
                            i2 = size;
                            if (StringsKt.P("=,;", strE.charAt(length2))) {
                                break;
                            }
                            length2++;
                            size = i2;
                        }
                        string = StringsKt.u0(strE.substring(i, length2)).toString();
                        if (length2 != strE.length() || strE.charAt(length2) == ',' || strE.charAt(length2) == ';') {
                            i = length2 + 1;
                            string2 = null;
                        } else {
                            int length3 = length2 + 1;
                            byte[] bArr = _UtilCommonKt.f46121a;
                            int length4 = strE.length();
                            while (true) {
                                if (length3 < length4) {
                                    char cCharAt = strE.charAt(length3);
                                    if (cCharAt != ' ' && cCharAt != '\t') {
                                        break;
                                    }
                                    length3++;
                                } else {
                                    length3 = strE.length();
                                    break;
                                }
                            }
                            if (length3 >= strE.length() || strE.charAt(length3) != '\"') {
                                int length5 = strE.length();
                                int length6 = length3;
                                while (true) {
                                    if (length6 >= length5) {
                                        length6 = strE.length();
                                        break;
                                    }
                                    int i4 = length5;
                                    if (StringsKt.P(",;", strE.charAt(length6))) {
                                        break;
                                    }
                                    length6++;
                                    length5 = i4;
                                }
                                int i5 = length6;
                                string2 = StringsKt.u0(strE.substring(length3, length6)).toString();
                                i = i5;
                            } else {
                                int i6 = length3 + 1;
                                int iU = StringsKt.U('\"', i6, 4, strE);
                                string2 = strE.substring(i6, iU);
                                i = iU + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z3 = true;
                        } else if ("max-age".equalsIgnoreCase(string)) {
                            iQ = _UtilCommonKt.q(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iQ2 = _UtilCommonKt.q(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iQ3 = _UtilCommonKt.q(Integer.MAX_VALUE, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iQ4 = _UtilCommonKt.q(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z9 = true;
                        }
                        size = i2;
                    }
                    i3++;
                    headers2 = headers;
                    size = size;
                } else {
                    if (strC.equalsIgnoreCase("Pragma")) {
                    }
                    i3++;
                    headers2 = headers;
                    size = size;
                }
                z = false;
                i = 0;
                while (i < strE.length()) {
                    length = strE.length();
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strE.length();
                            break;
                        }
                        i2 = size;
                        if (StringsKt.P("=,;", strE.charAt(length2))) {
                            break;
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = StringsKt.u0(strE.substring(i, length2)).toString();
                    if (length2 != strE.length()) {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        i = length2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z3 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iQ = _UtilCommonKt.q(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iQ2 = _UtilCommonKt.q(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z4 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z5 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z6 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iQ3 = _UtilCommonKt.q(Integer.MAX_VALUE, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iQ4 = _UtilCommonKt.q(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z7 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z8 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z9 = true;
                    }
                    size = i2;
                }
                i3++;
                headers2 = headers;
                size = size;
            }
            return new CacheControl(z2, z3, iQ, iQ2, z4, z5, z6, iQ3, iQ4, z7, z8, z9, !z ? null : str);
        }
    }

    static {
        uen uenVar = wen.b;
        bfn bfnVar = bfn.SECONDS;
        long jL = wen.l(ibc.v0(Integer.MAX_VALUE, bfnVar), bfnVar);
        if (jL >= 0) {
            return;
        }
        c99.s(h97.h(jL, "maxStale < 0: "));
    }

    public CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f46078a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f46078a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        int i = this.c;
        if (i != -1) {
            rw2.x(sb, "max-age=", i, ", ");
        }
        int i2 = this.d;
        if (i2 != -1) {
            rw2.x(sb, "s-maxage=", i2, ", ");
        }
        if (this.e) {
            sb.append("private, ");
        }
        if (this.f) {
            sb.append("public, ");
        }
        if (this.g) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.h;
        if (i3 != -1) {
            rw2.x(sb, "max-stale=", i3, ", ");
        }
        int i4 = this.i;
        if (i4 != -1) {
            rw2.x(sb, "min-fresh=", i4, ", ");
        }
        if (this.j) {
            sb.append("only-if-cached, ");
        }
        if (this.k) {
            sb.append("no-transform, ");
        }
        if (this.l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String string = sb.toString();
        this.m = string;
        return string;
    }
}
