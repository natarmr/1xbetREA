package com.vk.api.sdk.ui;

import a.fwt0;
import a.gx5;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.vk.api.sdk.ui.VKConfirmationActivity;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class VKConfirmationActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f46051a;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        fwt0.b();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final byte b = 0;
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        final byte b2 = 1;
        new AlertDialog.Builder(this, 5).setTitle(R.string.vk_confirm).setMessage(getIntent().getStringExtra("key_message")).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener(this) { // from class: a.mvt0
            public final /* synthetic */ VKConfirmationActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                byte b3 = b;
                VKConfirmationActivity vKConfirmationActivity = this.b;
                switch (b3) {
                    case 0:
                        VKConfirmationActivity.f46051a = true;
                        vKConfirmationActivity.finish();
                        break;
                    default:
                        VKConfirmationActivity.f46051a = false;
                        vKConfirmationActivity.finish();
                        break;
                }
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: a.mvt0
            public final /* synthetic */ VKConfirmationActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                byte b3 = b2;
                VKConfirmationActivity vKConfirmationActivity = this.b;
                switch (b3) {
                    case 0:
                        VKConfirmationActivity.f46051a = true;
                        vKConfirmationActivity.finish();
                        break;
                    default:
                        VKConfirmationActivity.f46051a = false;
                        vKConfirmationActivity.finish();
                        break;
                }
            }
        }).setOnCancelListener(new gx5(this, (byte) 4)).show();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        fwt0.b();
    }
}
