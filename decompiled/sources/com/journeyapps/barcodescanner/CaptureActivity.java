package com.journeyapps.barcodescanner;

import a.b8a;
import a.cwj;
import a.jiq0;
import a.md3;
import a.q0a;
import a.z7a;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import com.appsflyer.sdk_base.referrer.Payload;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class CaptureActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b8a f46046a;
    public DecoratedBarcodeView b;

    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.zxing_capture);
        this.b = (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
        DecoratedBarcodeView decoratedBarcodeView = this.b;
        b8a b8aVar = new b8a(this, decoratedBarcodeView);
        this.f46046a = b8aVar;
        Intent intent = getIntent();
        getWindow().addFlags(128);
        if (bundle != null) {
            b8aVar.c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                int i = b8aVar.c;
                if (i == -1) {
                    int rotation = getWindowManager().getDefaultDisplay().getRotation();
                    int i2 = getResources().getConfiguration().orientation;
                    if (i2 == 2) {
                        if (rotation == 0 || rotation == 1) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                    } else if (i2 == 1) {
                        i = (rotation == 0 || rotation == 3) ? 1 : 9;
                    } else {
                        i = 0;
                    }
                    b8aVar.c = i;
                }
                setRequestedOrientation(i);
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                decoratedBarcodeView.c(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                b8aVar.i.b = false;
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                boolean booleanExtra = intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true);
                String stringExtra = intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE");
                b8aVar.e = booleanExtra;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                b8aVar.f = stringExtra;
            }
            if (intent.hasExtra(Payload.RESPONSE_TIMEOUT)) {
                b8aVar.j.postDelayed(new z7a(b8aVar, (byte) 1), intent.getLongExtra(Payload.RESPONSE_TIMEOUT, 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                b8aVar.d = true;
            }
        }
        b8a b8aVar2 = this.f46046a;
        b8aVar2.b.a(b8aVar2.l);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        b8a b8aVar = this.f46046a;
        b8aVar.g = true;
        b8aVar.h.c();
        b8aVar.j.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.b.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        b8a b8aVar = this.f46046a;
        b8aVar.h.c();
        BarcodeView barcodeView = b8aVar.b.f46047a;
        q0a cameraInstance = barcodeView.getCameraInstance();
        barcodeView.c();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.g && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        b8a b8aVar = this.f46046a;
        b8aVar.getClass();
        if (i == 250) {
            if (iArr.length > 0 && iArr[0] == 0) {
                b8aVar.b.e();
                return;
            }
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("MISSING_CAMERA_PERMISSION", true);
            b8aVar.f2147a.setResult(0, intent);
            if (b8aVar.e) {
                b8aVar.b(b8aVar.f);
            } else {
                b8aVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        b8a b8aVar = this.f46046a;
        CaptureActivity captureActivity = b8aVar.f2147a;
        if (jiq0.j0(captureActivity, "android.permission.CAMERA") == 0) {
            b8aVar.b.e();
        } else if (!b8aVar.m) {
            jiq0.u0(captureActivity, new String[]{"android.permission.CAMERA"}, 250);
            b8aVar.m = true;
        }
        cwj cwjVar = b8aVar.h;
        if (!cwjVar.f5083a) {
            ((CaptureActivity) cwjVar.c).registerReceiver((md3) cwjVar.d, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            cwjVar.f5083a = true;
        }
        Handler handler = (Handler) cwjVar.e;
        handler.removeCallbacksAndMessages(null);
        if (cwjVar.b) {
            handler.postDelayed((z7a) cwjVar.f, 300000L);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f46046a.c);
    }
}
