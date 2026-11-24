package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.security.impl.presentation.secret_question_choice.params.SecretQuestionChoiceScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wkh0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39308a;
    public final /* synthetic */ xkh0 b;

    public /* synthetic */ wkh0(xkh0 xkh0Var, byte b) {
        this.f39308a = b;
        this.b = xkh0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39308a;
        xkh0 xkh0Var = this.b;
        switch (b) {
            case 0:
                gne0 gne0Var = xkh0.n2;
                xkh0Var.P0().x(skh0.f32349a);
                return Unit.f46060a;
            case 1:
                gne0 gne0Var2 = xkh0.n2;
                xkh0Var.P0().x(tkh0.f34094a);
                return Unit.f46060a;
            case 2:
                return new fiu0(Collections.singletonMap(hlh0.class, ((tsi) xkh0Var.l2.getValue()).e));
            default:
                gne0 gne0Var3 = xkh0.n2;
                ComponentCallbacks2 application = xkh0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ykh0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ykh0)) {
                        ze3Var = null;
                    }
                    ykh0 ykh0Var = (ykh0) ze3Var;
                    if (ykh0Var != null) {
                        SecretQuestionChoiceScreenParams secretQuestionChoiceScreenParams = (SecretQuestionChoiceScreenParams) xkh0Var.m2.n(xkh0Var, xkh0.o2[0]);
                        ctf0 ctf0Var = ykh0Var.f42788a;
                        mne mneVar = ykh0Var.b;
                        wdk0 wdk0Var = ykh0Var.c;
                        lef0 lef0Var = ykh0Var.d;
                        ctf0Var.getClass();
                        wdk0Var.getClass();
                        return new tsi(lef0Var, secretQuestionChoiceScreenParams, ctf0Var, mneVar);
                    }
                }
                jf4.n(b1j.i(ykh0.class, "Cannot create dependency "));
                return null;
        }
    }
}
