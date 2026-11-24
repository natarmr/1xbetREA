package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class htw extends x9x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dgu f13654a;

    public htw(dgu dguVar, tqt tqtVar) {
        this.f13654a = dguVar;
    }

    @Override // a.x9x
    public final void e0(j jVar) {
        Unit unit;
        jVar.getClass();
        dgu dguVar = this.f13654a;
        qjt qjtVar = (qjt) ((HashMap) dguVar.c).get(jVar.f15657a);
        if (qjtVar != null) {
            qjtVar.a(this, (String) dguVar.f6058a, jVar);
            unit = Unit.f46060a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Iterator it = jVar.a().iterator();
            while (it.hasNext()) {
                aad.F((j) it.next(), this);
            }
        }
    }

    public final void f0(CharSequence charSequence) {
        charSequence.getClass();
        ((StringBuilder) this.f13654a.d).append(charSequence);
    }

    public final void g0(CharSequence charSequence) {
        ((StringBuilder) this.f13654a.d).append((CharSequence) ("</" + ((Object) charSequence) + '>'));
    }

    public final void h0(j jVar, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z) {
        jVar.getClass();
        StringBuilder sb = (StringBuilder) this.f13654a.d;
        CharSequence[] charSequenceArr2 = (CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length);
        StringBuilder sb2 = new StringBuilder(Separators.LESS_THAN + ((Object) charSequence));
        Iterable<CharSequence> iterableS = tx3.s(charSequenceArr2);
        iterableS.getClass();
        for (CharSequence charSequence2 : iterableS) {
            if (charSequence2 != null) {
                sb2.append(Separators.SP + ((Object) charSequence2));
            }
        }
        if (z) {
            sb2.append(" />");
        } else {
            sb2.append(Separators.GREATER_THAN);
        }
        sb.append((CharSequence) sb2.toString());
    }
}
