package a;

import android.gov.nist.core.Separators;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class do80 extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final un80 f6405a = new un80();
    public final tb00 b = new tb00();

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    @Override // a.a1
    public final void a(CharSequence charSequence) {
        int iH;
        int i;
        tb00 tb00Var = this.b;
        StringBuilder sb = tb00Var.b;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int iA = 0;
        while (iA < charSequence.length()) {
            int iE = hne.E(tb00Var.f33638a);
            if (iE == 0) {
                int iA2 = x8x.A(charSequence, iA, charSequence.length());
                if (iA2 >= charSequence.length() || charSequence.charAt(iA2) != '[') {
                    iA = -1;
                } else {
                    tb00Var.f33638a = 2;
                    tb00Var.d = new StringBuilder();
                    iA = iA2 + 1;
                    if (iA >= charSequence.length()) {
                        tb00Var.d.append('\n');
                    }
                }
            } else if (iE == 1) {
                iH = ufx.H(iA, charSequence);
                if (iH == -1) {
                    iA = -1;
                } else {
                    tb00Var.d.append(charSequence, iA, iH);
                    if (iH >= charSequence.length()) {
                        tb00Var.d.append('\n');
                        iA = iH;
                    } else if (charSequence.charAt(iH) != ']' || (i = iH + 1) >= charSequence.length() || charSequence.charAt(i) != ':' || tb00Var.d.length() > 999) {
                        iA = -1;
                    } else {
                        String string = tb00Var.d.toString();
                        Pattern pattern = k2o.f17584a;
                        String strReplaceAll = k2o.c.matcher(string.trim().toLowerCase(Locale.ROOT)).replaceAll(Separators.SP);
                        if (strReplaceAll.isEmpty()) {
                            iA = -1;
                        } else {
                            tb00Var.e = strReplaceAll;
                            tb00Var.f33638a = 3;
                            iA = x8x.A(charSequence, iH + 2, charSequence.length());
                        }
                    }
                }
            } else if (iE == 2) {
                int iA3 = x8x.A(charSequence, iA, charSequence.length());
                int iG = ufx.G(iA3, charSequence);
                if (iG != -1) {
                    tb00Var.f = charSequence.charAt(iA3) == '<' ? charSequence.subSequence(iA3 + 1, iG - 1).toString() : charSequence.subSequence(iA3, iG).toString();
                    iA = x8x.A(charSequence, iG, charSequence.length());
                    if (iA >= charSequence.length()) {
                        tb00Var.i = true;
                        sb.setLength(0);
                    } else if (iA == iG) {
                        iA = -1;
                    }
                    tb00Var.f33638a = 4;
                } else {
                    iA = -1;
                }
            } else if (iE == 3) {
                iA = x8x.A(charSequence, iA, charSequence.length());
                if (iA >= charSequence.length()) {
                    tb00Var.f33638a = 1;
                } else {
                    tb00Var.g = (char) 0;
                    char cCharAt = charSequence.charAt(iA);
                    if (cCharAt == '\"' || cCharAt == '\'') {
                        tb00Var.g = cCharAt;
                    } else if (cCharAt == '(') {
                        tb00Var.g = ')';
                    }
                    if (tb00Var.g != 0) {
                        tb00Var.f33638a = 5;
                        tb00Var.h = new StringBuilder();
                        iA++;
                        if (iA == charSequence.length()) {
                            tb00Var.h.append('\n');
                        }
                    } else {
                        tb00Var.a();
                        tb00Var.f33638a = 1;
                    }
                }
            } else if (iE == 4) {
                iH = ufx.I(charSequence, iA, tb00Var.g);
                if (iH == -1) {
                    iA = -1;
                } else {
                    tb00Var.h.append(charSequence.subSequence(iA, iH));
                    if (iH >= charSequence.length()) {
                        tb00Var.h.append('\n');
                        iA = iH;
                    } else {
                        iA = x8x.A(charSequence, iH + 1, charSequence.length());
                        if (iA != charSequence.length()) {
                            iA = -1;
                        } else {
                            tb00Var.i = true;
                            tb00Var.a();
                            sb.setLength(0);
                            tb00Var.f33638a = 1;
                        }
                    }
                }
            } else if (iE == 5) {
                return;
            }
            if (iA == -1) {
                tb00Var.f33638a = 6;
                return;
            }
        }
    }

    @Override // a.a1
    public final void c() {
        if (this.b.b.length() == 0) {
            this.f6405a.j();
        }
    }

    @Override // a.a1
    public final p78 d() {
        return this.f6405a;
    }

    @Override // a.a1
    public final void f(kdx kdxVar) {
        StringBuilder sb = this.b.b;
        if (sb.length() > 0) {
            kdxVar.f(sb.toString(), this.f6405a);
        }
    }

    @Override // a.a1
    public final iyc g(yxk yxkVar) {
        if (yxkVar.h) {
            return null;
        }
        return iyc.a(yxkVar.b);
    }
}
