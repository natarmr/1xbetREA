package a;

import java.util.Map;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class gdx extends mb00 {
    @Override // a.mb00
    public final lb00 b(j jVar, String str) {
        String strE;
        CharSequence charSequenceN;
        CharSequence charSequenceN2;
        jVar.getClass();
        j jVarL = dwi0.L(jVar, wb.C);
        String strA = null;
        if (jVarL == null) {
            return null;
        }
        j jVarL2 = dwi0.L(jVar, wb.A);
        if (jVarL2 == null || (charSequenceN2 = dwi0.N(jVarL2, str)) == null) {
            strE = "";
        } else {
            Regex regex = pb00.b;
            strE = efx.E(charSequenceN2, true);
        }
        j jVarL3 = dwi0.L(jVar, wb.B);
        if (jVarL3 != null && (charSequenceN = dwi0.N(jVarL3, str)) != null) {
            Regex regex2 = pb00.b;
            Map map = tzn.f34812a;
            strA = tzn.a(efx.r(charSequenceN, "\"\"", "''", "()"), true, true);
        }
        return new lb00(jVarL, strE, strA);
    }
}
