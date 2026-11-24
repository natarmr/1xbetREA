package com.vk.api.sdk.ui;

import a.fwt0;
import a.gx5;
import a.qaq0;
import a.wvt0;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.vk.api.sdk.ui.VKCaptchaActivity;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class VKCaptchaActivity extends Activity {
    public static String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f46050a;
    public ImageView b;
    public ProgressBar c;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final byte b = 0;
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        LinearLayout linearLayout = new LinearLayout(this);
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        displayMetrics.getClass();
        int iCeil = (int) Math.ceil(displayMetrics.density * 12.0f);
        int intExtra = getIntent().getIntExtra("key_width", -1);
        float f = intExtra <= 0 ? 130.0f : intExtra;
        DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
        displayMetrics2.getClass();
        int iMax = (int) (Math.max(1.0f, displayMetrics2.density) * f);
        int intExtra2 = getIntent().getIntExtra("key_height", -1);
        float f2 = intExtra2 <= 0 ? 50.0f : intExtra2;
        DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
        displayMetrics3.getClass();
        int iMax2 = (int) (Math.max(1.0f, displayMetrics3.density) * f2);
        linearLayout.setPadding(iCeil, iCeil, iCeil, iCeil);
        final byte b2 = 1;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMax, iMax2);
        layoutParams.bottomMargin = iCeil;
        frameLayout.setLayoutParams(layoutParams);
        this.c = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        ProgressBar progressBar = this.c;
        if (progressBar == null) {
            Intrinsics.h("progress");
            throw null;
        }
        progressBar.setLayoutParams(layoutParams2);
        ProgressBar progressBar2 = this.c;
        if (progressBar2 == null) {
            Intrinsics.h("progress");
            throw null;
        }
        frameLayout.addView(progressBar2);
        this.b = new ImageView(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        ImageView imageView = this.b;
        if (imageView == null) {
            Intrinsics.h("image");
            throw null;
        }
        imageView.setLayoutParams(layoutParams3);
        ImageView imageView2 = this.b;
        if (imageView2 == null) {
            Intrinsics.h("image");
            throw null;
        }
        frameLayout.addView(imageView2);
        linearLayout.addView(frameLayout);
        EditText editText = new EditText(this);
        this.f46050a = editText;
        editText.setInputType(176);
        EditText editText2 = this.f46050a;
        if (editText2 == null) {
            Intrinsics.h("input");
            throw null;
        }
        editText2.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iMax, -2);
        EditText editText3 = this.f46050a;
        if (editText3 == null) {
            Intrinsics.h("input");
            throw null;
        }
        editText3.setLayoutParams(layoutParams4);
        View view = this.f46050a;
        if (view == null) {
            Intrinsics.h("input");
            throw null;
        }
        linearLayout.addView(view);
        new AlertDialog.Builder(this, 5).setView(linearLayout).setTitle(R.string.vk_captcha_hint).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener(this) { // from class: a.lvt0
            public final /* synthetic */ VKCaptchaActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                byte b3 = b;
                VKCaptchaActivity vKCaptchaActivity = this.b;
                switch (b3) {
                    case 0:
                        String str = VKCaptchaActivity.d;
                        EditText editText4 = vKCaptchaActivity.f46050a;
                        if (editText4 == null) {
                            Intrinsics.h("input");
                            throw null;
                        }
                        VKCaptchaActivity.d = editText4.getText().toString();
                        fwt0.b();
                        vKCaptchaActivity.finish();
                        return;
                    default:
                        VKCaptchaActivity.d = null;
                        fwt0.b();
                        vKCaptchaActivity.setResult(0);
                        vKCaptchaActivity.finish();
                        return;
                }
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: a.lvt0
            public final /* synthetic */ VKCaptchaActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                byte b3 = b2;
                VKCaptchaActivity vKCaptchaActivity = this.b;
                switch (b3) {
                    case 0:
                        String str = VKCaptchaActivity.d;
                        EditText editText4 = vKCaptchaActivity.f46050a;
                        if (editText4 == null) {
                            Intrinsics.h("input");
                            throw null;
                        }
                        VKCaptchaActivity.d = editText4.getText().toString();
                        fwt0.b();
                        vKCaptchaActivity.finish();
                        return;
                    default:
                        VKCaptchaActivity.d = null;
                        fwt0.b();
                        vKCaptchaActivity.setResult(0);
                        vKCaptchaActivity.finish();
                        return;
                }
            }
        }).setOnCancelListener(new gx5(this, (byte) 3)).show();
        EditText editText4 = this.f46050a;
        if (editText4 == null) {
            Intrinsics.h("input");
            throw null;
        }
        editText4.requestFocus();
        String stringExtra = getIntent().getStringExtra("key_url");
        if (stringExtra == null) {
            return;
        }
        Object value = wvt0.c.getValue();
        value.getClass();
        ((ExecutorService) value).submit(new qaq0(stringExtra, this, (byte) 12));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        fwt0.b();
        super.onDestroy();
    }
}
