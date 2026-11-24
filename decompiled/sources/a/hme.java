package a;

import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hme implements c930 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ime f13301a;

    public hme(ime imeVar) {
        this.f13301a = imeVar;
    }

    @Override // a.c930
    public final void a(dgu dguVar, b4e b4eVar) {
        String str = ((e2q0) b4eVar).g;
        xmk0 xmk0Var = (xmk0) dguVar.c;
        w5z w5zVar = (w5z) dguVar.f6058a;
        xmk0Var.f41130a.append(str);
        ArrayList arrayList = this.f13301a.f15020a;
        if (arrayList.isEmpty()) {
            return;
        }
        int iA = dguVar.A() - str.length();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xb00) it.next()).getClass();
            j98 j98Var = (j98) ((Map) ((pv00) w5zVar.e).f27640a).get(hb00.class);
            if (j98Var != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                if (Linkify.addLinks(spannableStringBuilder, 5)) {
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    if (uRLSpanArr != null && uRLSpanArr.length > 0) {
                        ljf0 ljf0Var = (ljf0) dguVar.b;
                        for (URLSpan uRLSpan : uRLSpanArr) {
                            ljf0Var.e(uc9.r, uRLSpan.getURL());
                            Object objA = j98Var.a(w5zVar, ljf0Var);
                            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan) + iA;
                            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan) + iA;
                            int length = xmk0Var.f41130a.length();
                            if (spanEnd > spanStart && spanStart >= 0 && spanEnd <= length) {
                                xmk0.c(xmk0Var, objA, spanStart, spanEnd);
                            }
                        }
                    }
                }
            }
        }
    }
}
