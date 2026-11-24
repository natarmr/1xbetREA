package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes6.dex */
public final class vex {
    public int c;
    public boolean e;
    public Function1 i;
    public final n0o0 j;
    public final n0o0 k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37306a = "";
    public String b = "";
    public String d = "";
    public int f = 255;
    public final Regex g = new Regex("\\d");
    public final Regex h = new Regex("\\W{2,}");

    public vex() {
        final byte b = 0;
        this.j = maz.b(new Function0(this) { // from class: a.sex
            public final /* synthetic */ vex b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                vex vexVar = this.b;
                switch (b2) {
                    case 0:
                        return new uex(vexVar);
                    default:
                        return new jt6(vexVar, (byte) 9);
                }
            }
        });
        final byte b2 = 1;
        this.k = maz.b(new Function0(this) { // from class: a.sex
            public final /* synthetic */ vex b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                vex vexVar = this.b;
                switch (b3) {
                    case 0:
                        return new uex(vexVar);
                    default:
                        return new jt6(vexVar, (byte) 9);
                }
            }
        });
    }

    public static boolean b(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            for (int i = 0; i < charSequence.length(); i++) {
                if (!Character.isDigit(charSequence.charAt(i))) {
                }
            }
            return true;
        }
        return false;
    }

    public static Character d(stm0 stm0Var) {
        if (stm0Var.hasNext()) {
            return Character.valueOf(stm0Var.a());
        }
        return null;
    }

    public final boolean a(CharSequence charSequence) {
        if (this.b.length() != 0) {
            String strR = kotlin.text.c.r(this.b, Separators.POUND, "", false);
            for (int i = 0; i < charSequence.length(); i++) {
                char cCharAt = charSequence.charAt(i);
                if (!Character.isDigit(cCharAt)) {
                    for (int i2 = 0; i2 < strR.length(); i2++) {
                        if (cCharAt != strR.charAt(i2)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean c() {
        return this.b.length() > 0 && this.f != 255;
    }
}
