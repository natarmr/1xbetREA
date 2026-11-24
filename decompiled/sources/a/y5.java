package a;

import android.app.Activity;
import android.content.DialogInterface;
import ru.ok.android.sdk.OkAuthActivity;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y5 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42026a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ y5(Activity activity, String str, byte b) {
        this.f42026a = b;
        this.c = activity;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.f42026a;
        String str = this.b;
        Activity activity = this.c;
        switch (b) {
            case 0:
                str.getClass();
                ((a6) activity).f(str);
                break;
            default:
                int i2 = OkAuthActivity.i;
                str.getClass();
                ((OkAuthActivity) activity).c(str);
                break;
        }
    }
}
