package a;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public final class nb00 extends x9x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CharSequence f23216a;
    public final /* synthetic */ HashMap b;

    public nb00(CharSequence charSequence, HashMap map) {
        this.f23216a = charSequence;
        this.b = map;
    }

    @Override // a.x9x
    public final void e0(j jVar) {
        String strA;
        Object next;
        CharSequence charSequenceN;
        jVar.getClass();
        if (!Intrinsics.d(jVar.f15657a, wb.y)) {
            if (jVar instanceof zkd) {
                Iterator it = ((zkd) jVar).e.iterator();
                while (it.hasNext()) {
                    e0((j) it.next());
                }
                return;
            }
            return;
        }
        Regex regex = pb00.b;
        for (j jVar2 : jVar.a()) {
            if (Intrinsics.d(jVar2.f15657a, wb.z)) {
                CharSequence charSequence = this.f23216a;
                CharSequence charSequenceN2 = dwi0.N(jVar2, charSequence);
                charSequenceN2.getClass();
                String lowerCase = pb00.b.replace(charSequenceN2, Separators.SP).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                HashMap map = this.b;
                if (map.containsKey(lowerCase)) {
                    return;
                }
                for (j jVar3 : jVar.a()) {
                    if (Intrinsics.d(jVar3.f15657a, wb.A)) {
                        String strE = efx.E(dwi0.N(jVar3, charSequence), true);
                        Iterator it2 = jVar.a().iterator();
                        do {
                            strA = null;
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!Intrinsics.d(((j) next).f15657a, wb.B));
                        j jVar4 = (j) next;
                        if (jVar4 != null && (charSequenceN = dwi0.N(jVar4, charSequence)) != null) {
                            Regex regex2 = pb00.b;
                            Map map2 = tzn.f34812a;
                            strA = tzn.a(efx.r(charSequenceN, "\"\"", "''", "()"), true, true);
                        }
                        map.put(lowerCase, new ob00(jVar, strE, strA));
                        return;
                    }
                }
                v4i0.o("Collection contains no element matching the predicate.");
                return;
            }
        }
        v4i0.o("Collection contains no element matching the predicate.");
    }
}
