package a;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class lw90 implements hw90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f20755a;
    public final Context b;
    public final r4i0 c;
    public final rs00 d;
    public TextClassifier f;
    public final k050 e = new k050();
    public final pz40 g = androidx.compose.runtime.e.e(null);
    public final Object h = new Object();

    public lw90(CoroutineContext coroutineContext, Context context, r4i0 r4i0Var, rs00 rs00Var) {
        this.f20755a = coroutineContext;
        this.b = context;
        this.c = r4i0Var;
        this.d = rs00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c4, code lost:
    
        if (r11 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.CharSequence r11, long r12, android.view.textclassifier.TextClassifier r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.lw90.a(java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, a.zje):java.lang.Object");
    }

    public final l4q0 b(CharSequence charSequence, long j, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Object obj = textClassification.getActions().get(i);
            RemoteAction remoteActionC = jw90.c(obj);
            Drawable drawableLoadDrawable = null;
            if (i != 0 && !remoteActionC.shouldShowIcon()) {
                obj = null;
            }
            RemoteAction remoteActionC2 = jw90.c(obj);
            if (remoteActionC2 != null && (icon = remoteActionC2.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.b);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new l4q0(charSequence, j, textClassification, arrayList);
    }

    public final LocaleList c() {
        rs00 rs00Var = this.d;
        if (rs00Var == null) {
            return new LocaleList(((qs00) wv90.f39830a.u().f31011a.get(0)).f29235a);
        }
        ArrayList arrayList = new ArrayList(r3d.q(rs00Var, 10));
        Iterator it = rs00Var.f31011a.iterator();
        while (it.hasNext()) {
            arrayList.add(((qs00) it.next()).f29235a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
