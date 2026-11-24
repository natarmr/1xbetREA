package a;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class by7 {
    public static final String b;
    public static final String c;
    public static final by7 d;
    public static final by7 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3402a;

    static {
        s88 s88Var = o5q0.c;
        b = Character.toString((char) 8206);
        c = Character.toString((char) 8207);
        d = new by7(false);
        e = new by7(true);
    }

    public by7(boolean z) {
        s88 s88Var = o5q0.f24700a;
        this.f3402a = z;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        ay7 ay7Var = new ay7(charSequence);
        ay7Var.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = ay7Var.c;
            if (i4 < ay7Var.b && i == 0) {
                CharSequence charSequence2 = ay7Var.f1657a;
                char cCharAt = charSequence2.charAt(i4);
                ay7Var.d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = ay7Var.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    ay7Var.c = Character.charCount(iCodePointAt) + ay7Var.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    ay7Var.c = i5 + 1;
                    char c2 = ay7Var.d;
                    directionality = c2 < 1792 ? ay7.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (ay7Var.c > 0) {
                    switch (ay7Var.a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        ay7 ay7Var = new ay7(charSequence);
        ay7Var.c = ay7Var.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (ay7Var.c > 0) {
                byte bA = ay7Var.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public static by7 c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? e : d;
    }

    public final SpannableStringBuilder d(CharSequence charSequence) {
        String str;
        s88 s88Var = o5q0.c;
        if (charSequence == null) {
            return null;
        }
        boolean zL = s88Var.l(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zL2 = (zL ? o5q0.b : o5q0.f24700a).l(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = c;
        String str4 = b;
        boolean z = this.f3402a;
        if (z || !(zL2 || a(charSequence) == 1)) {
            str = (!z || (zL2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zL != z) {
            spannableStringBuilder.append(zL ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zL3 = (zL ? o5q0.b : o5q0.f24700a).l(charSequence.length(), charSequence);
        if (!z && (zL3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zL3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }

    public final String e(String str) {
        s88 s88Var = o5q0.f24700a;
        if (str == null) {
            return null;
        }
        return d(str).toString();
    }
}
