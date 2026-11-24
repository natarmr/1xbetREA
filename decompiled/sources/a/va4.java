package a;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes5.dex */
public final class va4 implements kwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37067a = 0;
    public final /* synthetic */ Fragment b;

    public va4(jdk0 jdk0Var, Fragment fragment) {
        this.b = fragment;
    }

    @Override // a.kwk
    public final void a() {
        byte b = this.f37067a;
        Fragment fragment = this.b;
        switch (b) {
            case 0:
                v1r v1rVarR = fragment.n0().r();
                v1rVarR.g("OTP_CONFIRMATION_RESULT_KEY");
                v1rVarR.g("KEY_LOGIN_QR_SCANNER_REQUEST");
                androidx.fragment.app.e eVarC = fragment.C();
                eVarC.g("KEY_REQUEST_CONFIRMATION_NEW_PLACE");
                eVarC.g("AUTH_LOGIN_DEFAULT_KEY_REQUEST_SUPPORT");
                eVarC.g("KEY_AUTH_ENTRY_POINT_REQUEST");
                eVarC.g("KEY_PICKER_MODEL_REQUEST");
                eVarC.g("KEY_PICKER_COUNTRY_ID_REQUEST");
                break;
            default:
                androidx.fragment.app.e eVarC2 = fragment.C();
                eVarC2.getClass();
                zss.d(eVarC2, "video_fragment_tag");
                zss.d(eVarC2, "zone_fragment_tag");
                break;
        }
    }

    public va4(Fragment fragment) {
        this.b = fragment;
    }
}
