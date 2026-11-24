package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dv10 implements k4r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6722a;
    public final /* synthetic */ hv10 b;

    public /* synthetic */ dv10(hv10 hv10Var, byte b) {
        this.f6722a = b;
        this.b = hv10Var;
    }

    @Override // a.k4r
    public final void i(Bundle bundle, String str) {
        Fragment fragmentI;
        glz glzVar;
        byte b = this.f6722a;
        hv10 hv10Var = this.b;
        switch (b) {
            case 0:
                atz atzVar = hv10.X1;
                str.getClass();
                sao0 sao0VarG0 = hv10Var.G0();
                if (sao0VarG0 != null && (fragmentI = sao0VarG0.C().I(R.id.container)) != null && (glzVar = fragmentI.u1) != null) {
                    glzVar.a(new tvj(new ev10(hv10Var, (byte) 3), null, null, 59));
                    break;
                }
                break;
            default:
                atz atzVar2 = hv10.X1;
                str.getClass();
                if (str.equals("USER_AGREEMENT_DIALOG_REQUEST_KEY")) {
                    hv10Var.I0().B();
                }
                break;
        }
    }
}
