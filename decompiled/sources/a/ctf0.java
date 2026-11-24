package a;

import android.text.format.DateFormat;
import java.util.Arrays;
import java.util.Locale;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ctf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ksm0 f4934a;
    public final lsm0 b;
    public final q4d c;
    public final pmk d;
    public final ihk e;
    public final wyu f;

    public ctf0(ksm0 ksm0Var, lsm0 lsm0Var, q4d q4dVar, pmk pmkVar, ihk ihkVar, wrq wrqVar, wyu wyuVar) {
        ksm0Var.getClass();
        lsm0Var.getClass();
        q4dVar.getClass();
        pmkVar.getClass();
        ihkVar.getClass();
        wrqVar.getClass();
        wyuVar.getClass();
        this.f4934a = ksm0Var;
        this.b = lsm0Var;
        this.c = q4dVar;
        this.d = pmkVar;
        this.e = ihkVar;
        this.f = wyuVar;
    }

    public static int b(int i, ctf0 ctf0Var) {
        q4d q4dVar = ctf0Var.c;
        int iO = fem0.o(ctf0Var.f.a());
        us00 us00Var = q4dVar.f28092a;
        return m5d.f(us00Var, i, false, m5d.e(iO, us00Var));
    }

    public static String e(ctf0 ctf0Var, String str, Object[] objArr) {
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        ctf0Var.getClass();
        str.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public final int a(int i) {
        return this.c.f28092a.getColor(i);
    }

    public final int c() {
        us00 us00Var = this.e.f14784a;
        return (int) (us00Var.getResources().getDisplayMetrics().widthPixels / us00Var.getResources().getDisplayMetrics().density);
    }

    public final int d(int i) {
        return this.d.f27239a.getResources().getDimensionPixelSize(i);
    }

    public final String f(int i, Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        ksm0 ksm0Var = this.f4934a;
        ksm0Var.getClass();
        int length = objArrCopyOf.length;
        us00 us00Var = ksm0Var.f18821a;
        if (length == 0) {
            String string = us00Var.getString(i);
            string.getClass();
            return string;
        }
        String string2 = us00Var.getString(i, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        string2.getClass();
        return string2;
    }

    public final String[] g(int i) {
        String[] stringArray = this.f4934a.f18821a.getResources().getStringArray(i);
        stringArray.getClass();
        return stringArray;
    }

    public final boolean h() {
        return DateFormat.is24HourFormat(this.e.f14784a);
    }

    public final boolean i() {
        return sj3.J(this.e.f14784a);
    }

    public final boolean j() {
        return this.e.f14784a.getResources().getBoolean(R.bool.isTablet);
    }

    public final String k(int i, Object... objArr) {
        return this.b.a(i, Arrays.copyOf(objArr, objArr.length));
    }
}
