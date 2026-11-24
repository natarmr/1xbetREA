package a;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kw90 extends bnn0 implements Function2 {
    public k050 i;
    public lw90 j;
    public long k;
    public byte l;
    public /* synthetic */ Object m;
    public final /* synthetic */ CharSequence n;
    public final /* synthetic */ long o;
    public final /* synthetic */ lw90 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw90(long j, yje yjeVar, lw90 lw90Var, CharSequence charSequence) {
        super(2, yjeVar);
        this.n = charSequence;
        this.o = j;
        this.p = lw90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        kw90 kw90Var = new kw90(this.o, yjeVar, this.p, this.n);
        kw90Var.m = obj;
        return kw90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kw90) create(jw90.g(obj), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        long j;
        l4q0 l4q0Var;
        k050 k050Var;
        lw90 lw90Var;
        wne wneVar = wne.f39444a;
        byte b = this.l;
        if (b == 0) {
            z1x.P(obj);
            TextClassifier textClassifier = (TextClassifier) this.m;
            long j2 = this.o;
            int iF = o9q0.f(j2);
            int iE = o9q0.e(j2);
            CharSequence charSequence = this.n;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, iF, iE);
            lw90 lw90Var2 = this.p;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(lw90Var2.c());
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jE = s7n0.e(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.k = jE;
                this.l = (byte) 2;
                if (this.p.a(this.n, jE, textClassifier, this) != wneVar) {
                    j = jE;
                }
            } else {
                TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                textClassification.getClass();
                l4q0 l4q0VarB = lw90Var2.b(charSequence, jE, textClassification);
                k050 k050Var2 = lw90Var2.e;
                this.m = l4q0VarB;
                this.i = k050Var2;
                this.j = lw90Var2;
                this.k = jE;
                this.l = (byte) 1;
                if (k050Var2.d(this) != wneVar) {
                    l4q0Var = l4q0VarB;
                    k050Var = k050Var2;
                    j = jE;
                    lw90Var = lw90Var2;
                    ((hgk0) lw90Var.g).setValue(l4q0Var);
                }
            }
            return wneVar;
        }
        if (b == 1) {
            j = this.k;
            lw90Var = this.j;
            k050Var = this.i;
            l4q0Var = (l4q0) this.m;
            z1x.P(obj);
            try {
                ((hgk0) lw90Var.g).setValue(l4q0Var);
            } finally {
                k050Var.c(null);
            }
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.k;
            z1x.P(obj);
        }
        return new o9q0(j);
    }
}
