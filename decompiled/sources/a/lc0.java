package a;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.webkit.WebView;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalFieldView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19776a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lc0(CrystalFieldView crystalFieldView, egf egfVar, ArrayList arrayList, int i, cgf cgfVar) {
        this.f19776a = (byte) 1;
        this.c = crystalFieldView;
        this.d = egfVar;
        this.e = arrayList;
        this.b = i;
        this.f = cgfVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19776a;
        Object obj = this.f;
        Object obj2 = this.e;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((nc0) obj4).z((lr5) obj3, i, (bvc) obj2, (Function1) obj);
                return Unit.f46060a;
            case 1:
                int i2 = CrystalFieldView.e;
                CrystalFieldView.c((egf) obj3, ((Number) ((ArrayList) obj2).get(i)).intValue() * ((CrystalFieldView) obj4).c, (cgf) obj, 0L);
                return Unit.f46060a;
            case 2:
                return hb90.c((hb90) obj4, (WebView) obj3, i, (String) obj2, (String) obj);
            default:
                TextView textView = (TextView) obj4;
                vic0 vic0Var = (vic0) obj3;
                Rect rect = (Rect) obj;
                iiy[] iiyVarArr = vic0.S1;
                textView.setVisibility(4);
                textView.setX(rect.left);
                textView.setY(rect.top);
                textView.setAlpha(1.0f);
                Integer intOrNull = StringsKt.toIntOrNull(((TextView) obj2).getText().toString());
                int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                ValueAnimator valueAnimator = vic0Var.O1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new IntEvaluator(), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue + i));
                valueAnimatorOfObject.setDuration(((long) i) * 100);
                valueAnimatorOfObject.addUpdateListener(new yp3(vic0Var, iIntValue, (byte) 2));
                valueAnimatorOfObject.addListener(new x73(null, new b0c0(0, vic0Var.H0(), hjc0.class, "onCountingAnimationEnd", "onCountingAnimationEnd()V", 0, (byte) 7), 11));
                valueAnimatorOfObject.start();
                vic0Var.O1 = valueAnimatorOfObject;
                return Unit.f46060a;
        }
    }

    public /* synthetic */ lc0(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.f19776a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
        this.f = obj4;
    }
}
