package a;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class ecw0 extends dwb {
    public final Set b;
    public final cmt0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ecw0(String str) {
        super(str);
        Level level = Level.ALL;
        this.b = gcw0.f;
        this.c = gcw0.g;
    }

    @Override // a.dwb
    public final void b(lfx0 lfx0Var) {
        String strA = (String) lfx0Var.c().C(nhx0.f23558a);
        if (strA == null) {
            strA = this.f6789a;
        }
        if (strA == null) {
            jgx0 jgx0Var = lfx0Var.d;
            if (jgx0Var == null) {
                jf4.n("cannot request log site information prior to postProcess()");
                return;
            }
            strA = jgx0Var.a();
            int iIndexOf = strA.indexOf(36, strA.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strA = strA.substring(0, iIndexOf);
            }
        }
        gcw0.d(lfx0Var, aem0.B(strA), Level.ALL, this.b, this.c);
    }
}
