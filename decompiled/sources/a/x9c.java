package a;

import android.content.Context;
import android.database.Cursor;
import android.text.TextPaint;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.security.impl.presentation.secret_question_choice.params.SecretQuestionChoiceScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x9c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40503a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x9c(int i, l7m0 l7m0Var) {
        this.f40503a = (byte) 7;
        this.b = i;
        this.c = l7m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40503a;
        Object obj = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((ImageView) ((z9c) obj2).f44009a.c).setImageResource(i > 0 ? R.drawable.ic_chest_gold : R.drawable.ic_chest_empty);
                return Unit.f46060a;
            case 1:
                kud kudVar = i5e.q2;
                return ((Cursor) obj2).getString(i);
            case 2:
                ((fae) obj2).B(i);
                return Unit.f46060a;
            case 3:
                TextPaint textPaint = new TextPaint();
                textPaint.setAntiAlias(true);
                Context context = ((eue) obj2).f8416a.getContext();
                context.getClass();
                r7x.r(textPaint, context, i);
                return textPaint;
            case 4:
                r7f r7fVar = (r7f) obj2;
                sac.V(jiu0.a(r7fVar), h6f.f12526a, null, r7fVar.Y0.b, new m5f(r7fVar, i, objArr == true ? 1 : 0, (byte) 2), 10);
                return Unit.f46060a;
            case 5:
                for (Object obj3 : ((xcz) obj2).j().l) {
                    if (((ncz) obj3).f23317a == i) {
                        obj = obj3;
                        return (ncz) obj;
                    }
                }
                return (ncz) obj;
            case 6:
                ((h5m) obj2).f12487a.m(i);
                return Unit.f46060a;
            case 7:
                return Integer.valueOf(i != 0 ? ((((Number) ((l7m0) obj2).getValue()).intValue() % i) + i) % i : 0);
            case 8:
                kw50 kw50Var = (kw50) obj2;
                sac.V(jiu0.a(kw50Var), new r750(1, kw50Var, kw50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, kw50Var.B.f22085a, new u52((Object) kw50Var, i, (yje) (objArr2 == true ? 1 : 0), (byte) 16), 10);
                return Unit.f46060a;
            case 9:
                cge0 cge0Var = slh0.O1;
                gne0 gne0Var = xkh0.n2;
                androidx.fragment.app.e eVarC = ((slh0) obj2).C();
                eVarC.getClass();
                SecretQuestionChoiceScreenParams secretQuestionChoiceScreenParams = new SecretQuestionChoiceScreenParams("CHOOSE_QUESTION_DIALOG_KEY", i);
                gne0Var.getClass();
                String str = xkh0.p2;
                if (eVarC.J(str) == null) {
                    xkh0 xkh0Var = new xkh0();
                    xkh0Var.m2.J(xkh0Var, xkh0.o2[0], secretQuestionChoiceScreenParams);
                    xkh0Var.H0(eVarC, str);
                }
                return Unit.f46060a;
            case 10:
                return Integer.valueOf(((a9q0) ((hu5) obj2).e).b.d(i));
            case 11:
                ((k3t0) obj2).x(new feo0(i));
                return Unit.f46060a;
            default:
                return Integer.valueOf(((xk80) obj2).k() % i);
        }
    }

    public /* synthetic */ x9c(Object obj, int i, byte b) {
        this.f40503a = b;
        this.c = obj;
        this.b = i;
    }
}
