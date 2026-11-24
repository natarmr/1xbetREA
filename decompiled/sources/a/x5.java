package a;

import android.content.DialogInterface;
import android.webkit.WebView;
import androidx.biometric.internal.ui.FingerprintDialogActivity;
import org.xbet.client1.R;
import ru.ok.android.sdk.OkAuthActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x5 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40289a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x5(Object obj, byte b) {
        this.f40289a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.f40289a;
        Object obj = this.b;
        switch (b) {
            case 0:
                a6 a6Var = (a6) obj;
                ((WebView) a6Var.findViewById(R.id.web_view)).loadUrl(a6Var.d());
                break;
            case 1:
                ((b8a) obj).f2147a.finish();
                break;
            case 2:
                int i2 = FingerprintDialogActivity.Z;
                uo4 uo4VarS = ((FingerprintDialogActivity) obj).s();
                qjj.W(jiu0.a(uo4VarS), null, null, new to4(uo4VarS, null, (byte) 1), 3);
                break;
            default:
                int i3 = OkAuthActivity.i;
                ((OkAuthActivity) obj).a();
                break;
        }
    }
}
