package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mb00 implements qjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hos0 f21482a = new hos0(0, 0);
    public static final hos0 b = new hos0(1, -1);

    @Override // a.qjt
    public final void a(htw htwVar, String str, j jVar) {
        jVar.getClass();
        lb00 lb00VarB = b(jVar, str);
        if (lb00VarB == null) {
            f21482a.a(htwVar, str, jVar);
        } else {
            d(htwVar, str, jVar, lb00VarB);
        }
    }

    public abstract lb00 b(j jVar, String str);

    public final CharSequence c(CharSequence charSequence) {
        charSequence.getClass();
        StringsKt.k0(charSequence, '#');
        return charSequence;
    }

    public void d(htw htwVar, String str, j jVar, lb00 lb00Var) {
        String str2;
        jVar.getClass();
        StringBuilder sb = new StringBuilder("href=\"");
        CharSequence charSequence = lb00Var.b;
        c(charSequence);
        sb.append((Object) charSequence);
        sb.append('\"');
        String string = sb.toString();
        CharSequence charSequence2 = lb00Var.c;
        if (charSequence2 != null) {
            str2 = "title=\"" + ((Object) charSequence2) + '\"';
        } else {
            str2 = null;
        }
        htwVar.h0(jVar, "a", new CharSequence[]{string, str2}, false);
        b.a(htwVar, str, lb00Var.f19733a);
        htwVar.g0("a");
    }
}
