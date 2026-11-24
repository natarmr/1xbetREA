package a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$authenticatorScreen$1;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class rek0 implements sek0, igk0, tlu0, lyr0, vpt0, l7w0, hrq {
    public static final rek0 b = new rek0((byte) 0);
    public static final rek0 c = new rek0((byte) 1);
    public static final pn20 d = new pn20(19);
    public static final rek0 e = new rek0((byte) 3);
    public static final rek0 f = new rek0((byte) 4);
    public static final rek0 g = new rek0((byte) 5);
    public static final rek0 h = new rek0((byte) 6);
    public static final rek0 i = new rek0((byte) 7);
    public static final rek0 j = new rek0((byte) 8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30340a;

    public rek0(btt0 btt0Var, gii0 gii0Var) {
        this.f30340a = (byte) 11;
        btt0Var.getClass();
        gii0Var.getClass();
    }

    public static AuthenticatorScreenFactoryImpl$authenticatorScreen$1 b(rek0 rek0Var, mq4 mq4Var) {
        r080 r080Var = r080.f29619a;
        rek0Var.getClass();
        return new AuthenticatorScreenFactoryImpl$authenticatorScreen$1(mq4Var, "", r080Var);
    }

    public static AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1 l(rek0 rek0Var) {
        rek0Var.getClass();
        return new AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1(false);
    }

    @Override // a.l7w0
    public int a() {
        return R.string.one_x_casino_vers;
    }

    @Override // a.l7w0
    public String c() {
        return "yraHroWO2j5y5ILhB";
    }

    @Override // a.l7w0
    public int d() {
        return R.string.one_x_casino_second_v;
    }

    @Override // a.tlu0
    public View e(View view, AttributeSet attributeSet) {
        view.getClass();
        attributeSet.getClass();
        if (view instanceof TextInputLayout) {
            TextInputLayout textInputLayout = (TextInputLayout) view;
            Context context = textInputLayout.getContext();
            context.getClass();
            int iD = tlu0.d(context, attributeSet, android.R.attr.hint);
            if (iD > 0) {
                textInputLayout.setHint(textInputLayout.getContext().getText(iD));
            }
        }
        return view;
    }

    @Override // a.l7w0
    public String f() {
        return "quMLDYX9B3ypI51aPJxKZKD";
    }

    @Override // a.igk0
    public boolean g(Object obj, Object obj2) {
        return Intrinsics.d(obj, obj2);
    }

    @Override // a.vpt0
    public boolean h() {
        return true;
    }

    @Override // a.l7w0
    public int i() {
        return R.string.one_x_casino_second_k;
    }

    @Override // a.l7w0
    public String j() {
        return "G5wQLC3aSAL2Pg/ou";
    }

    @Override // a.l7w0
    public int k() {
        return R.string.one_x_casino_first_k;
    }

    @Override // a.l7w0
    public int m() {
        return R.string.one_x_casino_first_v;
    }

    public String toString() {
        switch (this.f30340a) {
            case 1:
                return "StructuralEqualityPolicy";
            default:
                return super.toString();
        }
    }

    @Override // a.l7w0
    public String b() {
        return "kS7bNmXrHMmGL8WKXJJycnhYeRsjc/1Ga2M=";
    }

    public rek0(gfk0 gfk0Var) {
        this.f30340a = (byte) 23;
    }

    public /* synthetic */ rek0(byte b2) {
        this.f30340a = b2;
    }

    public rek0(us00 us00Var, knf0 knf0Var, mne mneVar) {
        this.f30340a = (byte) 12;
        knf0Var.getClass();
    }

    @Override // a.l7w0
    public String e() {
        return "od0ysyGH4LfUwd+NwZ+1BMGizly18/H";
    }
}
