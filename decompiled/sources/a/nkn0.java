package a;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class nkn0 implements qpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w7r f23689a;

    public nkn0(w7r w7rVar) {
        this.f23689a = w7rVar;
    }

    @Override // a.qpg0
    public final boolean P0() {
        return this.f23689a.f38688a.inTransaction();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // a.qpg0
    public final xpg0 Z0(String str) {
        wkn0 wkn0Var;
        int i;
        str.getClass();
        w7r w7rVar = this.f23689a;
        hfk0 hfk0Var = null;
        if (!w7rVar.f38688a.isOpen()) {
            m2x.J(21, "connection is closed");
            throw null;
        }
        String upperCase = StringsKt.u0(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int iU = 0;
            loop0: while (iU < length) {
                char cCharAt = upperCase.charAt(iU);
                if (Intrinsics.e(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iU2 = iU + 1;
                            if (upperCase.charAt(iU2) == '*') {
                                do {
                                    iU2 = StringsKt.U('*', iU2 + 1, 4, upperCase);
                                    if (iU2 < 0) {
                                        break loop0;
                                    }
                                    i = iU2 + 1;
                                    if (i >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                iU = iU2 + 2;
                            }
                        }
                        i2 = iU;
                        break;
                    }
                    if (upperCase.charAt(iU + 1) != '-') {
                        i2 = iU;
                        break;
                    }
                    iU = StringsKt.U('\n', iU + 2, 4, upperCase);
                    if (iU < 0) {
                        break;
                    }
                }
                iU++;
            }
        }
        String strSubstring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (strSubstring == null) {
            return new xkn0(w7rVar, str);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    wkn0Var = null;
                } else if (!StringsKt.O(upperCase, "EXCLUSIVE", false)) {
                    wkn0Var = !StringsKt.O(upperCase, "IMMEDIATE", false) ? wkn0.e : wkn0.d;
                } else {
                    wkn0Var = wkn0.c;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    wkn0Var = null;
                } else {
                    wkn0Var = wkn0.f39315a;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    wkn0Var = null;
                } else {
                    wkn0Var = wkn0.f39315a;
                }
                break;
            case 81327:
                wkn0Var = (!strSubstring.equals("ROL") || StringsKt.O(upperCase, " TO ", false)) ? null : wkn0.b;
                break;
            default:
                wkn0Var = null;
                break;
        }
        if (wkn0Var != null) {
            return new xkn0(w7rVar, str, wkn0Var);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (StringsKt.O(StringsKt.m0(lowerCase, "journal_mode", ""), "=", false)) {
                hfk0Var = hfk0.c;
            }
        }
        if (hfk0Var != null) {
            return new xkn0(w7rVar, str, new ykn0(w7rVar, str));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new xkn0(w7rVar, str) : new ykn0(w7rVar, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f23689a.close();
    }
}
