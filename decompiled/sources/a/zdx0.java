package a;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class zdx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44230a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public final Object f;
    public Object g;

    public zdx0(ubw0 ubw0Var, Object[] objArr, StringBuilder sb) {
        this.f44230a = (byte) 1;
        this.b = 0;
        this.c = -1;
        fem0.p(ubw0Var, "context");
        this.e = ubw0Var;
        this.d = 0;
        this.f = objArr;
        this.g = sb;
    }

    public static void f(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(yhx0.a(obj));
        sb.append("]");
    }

    public void a() {
        if (this.c == 0) {
            return;
        }
        HashMap map = ((xdx0) this.g).d;
        int[] iArr = (int[]) this.e;
        xdx0 xdx0Var = (xdx0) map.get(Integer.valueOf(iArr[this.b]));
        while (true) {
            int i = (xdx0Var.b - xdx0Var.f40717a) + 1;
            int i2 = this.c;
            if (i > i2) {
                return;
            }
            int i3 = this.b + i;
            this.b = i3;
            this.g = xdx0Var;
            int i4 = i2 - i;
            this.c = i4;
            if (i4 > 0) {
                xdx0Var = (xdx0) xdx0Var.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public void b() {
        xdx0 xdx0Var = ((xdx0) this.g).c;
        if (xdx0Var != null) {
            this.g = xdx0Var;
        } else {
            this.g = (xdx0) this.f;
            int i = this.c;
            if (i > 0) {
                this.c = i - 1;
            }
            if (this.d > 0) {
                this.b++;
            }
        }
        a();
    }

    /* JADX WARN: Code duplicated, block: B:106:0x012a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0130  */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:64:0x0092  */
    public void c(Object obj, rhx0 rhx0Var, uhx0 uhx0Var) {
        String simpleName;
        uhx0 uhx0Var2;
        boolean zIsValidCodePoint;
        StringBuilder sb = (StringBuilder) this.g;
        int i = rhx0Var.b;
        String string = rhx0Var.d;
        int iE = hne.E(i);
        if (iE != 0) {
            if (iE == 1) {
                zIsValidCodePoint = obj instanceof Boolean;
            } else if (iE != 2) {
                if (iE != 3) {
                    if (iE != 4) {
                        throw null;
                    }
                    if ((obj instanceof Double) || (obj instanceof Float) || (obj instanceof BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short)) {
                zIsValidCodePoint = Character.isValidCodePoint(((Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                f(sb, obj, string);
                return;
            }
        }
        int iOrdinal = rhx0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (uhx0Var.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal == 5) {
                        if (uhx0Var.a()) {
                            uhx0Var2 = uhx0Var;
                        } else {
                            int i2 = uhx0Var.f35704a;
                            int i3 = i2 & 128;
                            if (i3 == 0) {
                                uhx0Var2 = uhx0.e;
                            } else if (i3 == i2 && uhx0Var.b == -1 && uhx0Var.c == -1) {
                                uhx0Var2 = uhx0Var;
                            } else {
                                uhx0Var2 = new uhx0(i3, -1, -1);
                            }
                        }
                        if (uhx0Var2.equals(uhx0Var)) {
                            Number number = (Number) obj;
                            Locale locale = yhx0.f42659a;
                            boolean zC = uhx0Var.c();
                            long jLongValue = number.longValue();
                            if (number instanceof Long) {
                                yhx0.b(sb, jLongValue, zC);
                                return;
                            }
                            if (number instanceof Integer) {
                                yhx0.b(sb, jLongValue & 4294967295L, zC);
                                return;
                            }
                            if (number instanceof Byte) {
                                yhx0.b(sb, jLongValue & 255, zC);
                                return;
                            }
                            if (number instanceof Short) {
                                yhx0.b(sb, jLongValue & 65535, zC);
                                return;
                            }
                            if (!(number instanceof BigInteger)) {
                                jf4.n("unsupported number type: ".concat(String.valueOf(number.getClass())));
                                return;
                            }
                            String string2 = ((BigInteger) number).toString(16);
                            if (zC) {
                                string2 = string2.toUpperCase(yhx0.f42659a);
                            }
                            sb.append(string2);
                            return;
                        }
                    }
                } else if (uhx0Var.a()) {
                    sb.append(obj);
                    return;
                }
            } else if (uhx0Var.a()) {
                if (obj instanceof Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof Formattable) {
                Formattable formattable = (Formattable) obj;
                Locale locale2 = yhx0.f42659a;
                int i4 = uhx0Var.f35704a;
                int i5 = i4 & 162;
                if (i5 != 0) {
                    i5 = ((i4 & 32) == 0 ? 0 : 1) | ((i4 & 128) != 0 ? 2 : 0) | ((i4 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                Formatter formatter = new Formatter(sb, yhx0.f42659a);
                try {
                    formattable.formatTo(formatter, i5, uhx0Var.b, uhx0Var.c);
                    return;
                } catch (RuntimeException e) {
                    sb.setLength(length);
                    try {
                        Appendable appendableOut = formatter.out();
                        try {
                            simpleName = e.toString();
                        } catch (RuntimeException e2) {
                            simpleName = e2.getClass().getSimpleName();
                        }
                        appendableOut.append(yhx0.c(formattable, simpleName));
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            }
            if (uhx0Var.a()) {
                sb.append(yhx0.a(obj));
                return;
            }
        }
        if (!uhx0Var.a()) {
            int i6 = rhx0Var.f30511a;
            if (uhx0Var.c()) {
                i6 &= 65503;
            }
            StringBuilder sb2 = new StringBuilder(Separators.PERCENT);
            uhx0Var.d(sb2);
            sb2.append((char) i6);
            string = sb2.toString();
        }
        sb.append(String.format(yhx0.f42659a, string, obj));
    }

    public void d(xdx0 xdx0Var, StringBuilder sb) {
        for (xdx0 xdx0Var2 : xdx0Var.d.values()) {
            sb.append("  ");
            sb.append(xdx0Var);
            sb.append(" -> ");
            sb.append(xdx0Var2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, xdx0Var2.f40717a, Math.min(iArr.length, xdx0Var2.b + 1))));
            sb.append("\"]\n");
            d(xdx0Var2, sb);
        }
    }

    public boolean e(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = (int[]) this.e;
        int length = iArr.length;
        int iMin = Math.min(length, i2);
        if (iMin - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        switch (this.f44230a) {
            case 0:
                StringBuilder sb = new StringBuilder("digraph {\n");
                d((xdx0) this.f, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public zdx0(int[] iArr) {
        this.f44230a = (byte) 0;
        this.e = iArr;
        xdx0 xdx0Var = new xdx0(-1, -1);
        this.f = xdx0Var;
        this.g = xdx0Var;
    }
}
