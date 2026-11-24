package com.journeyapps.barcodescanner;

import a.clj;
import a.dlj;
import a.ekj;
import a.fkj;
import a.gkj;
import a.iu5;
import a.jf4;
import a.ju5;
import a.o2a;
import a.sbx0;
import a.spd0;
import a.ukj;
import a.vv40;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BarcodeView f46047a;
    public ViewfinderView b;
    public TextView c;

    public DecoratedBarcodeView(Context context) {
        super(context);
        b(null);
    }

    public final void a(iu5 iu5Var) {
        BarcodeView barcodeView = this.f46047a;
        dlj dljVar = new dlj(this, iu5Var);
        barcodeView.B = 2;
        barcodeView.f1 = dljVar;
        barcodeView.i();
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, spd0.c);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.zxing_barcode_scanner);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(R.id.zxing_barcode_surface);
        this.f46047a = barcodeView;
        if (barcodeView == null) {
            jf4.o("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
            return;
        }
        barcodeView.b(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R.id.zxing_viewfinder_view);
        this.b = viewfinderView;
        if (viewfinderView == null) {
            jf4.o("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        } else {
            viewfinderView.setCameraPreview(this.f46047a);
            this.c = (TextView) findViewById(R.id.zxing_status_view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    public final void c(Intent intent) {
        Set setNoneOf;
        int intExtra;
        Pattern pattern = ekj.f7954a;
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        EnumMap enumMap = null;
        List listAsList = stringExtra != null ? Arrays.asList(ekj.f7954a.split(stringExtra)) : null;
        String stringExtra2 = intent.getStringExtra("SCAN_MODE");
        if (listAsList != null) {
            setNoneOf = EnumSet.noneOf(ju5.class);
            try {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    setNoneOf.add(ju5.valueOf((String) it.next()));
                }
            } catch (IllegalArgumentException unused) {
                if (stringExtra2 != null) {
                    setNoneOf = (Set) ekj.b.get(stringExtra2);
                } else {
                    setNoneOf = null;
                }
            }
        } else if (stringExtra2 != null) {
            setNoneOf = (Set) ekj.b.get(stringExtra2);
        } else {
            setNoneOf = null;
        }
        int i = fkj.f9695a;
        Bundle extras = intent.getExtras();
        boolean z = false;
        if (extras != null && !extras.isEmpty()) {
            enumMap = new EnumMap(gkj.class);
            for (gkj gkjVar : gkj.values()) {
                if (gkjVar != gkj.e && gkjVar != gkj.j && gkjVar != gkj.c) {
                    String strName = gkjVar.name();
                    Class cls = gkjVar.f11447a;
                    if (extras.containsKey(strName)) {
                        if (cls.equals(Void.class)) {
                            enumMap.put(gkjVar, Boolean.TRUE);
                        } else {
                            Object obj = extras.get(strName);
                            if (cls.isInstance(obj)) {
                                enumMap.put(gkjVar, obj);
                            } else {
                                Log.w("fkj", "Ignoring hint " + gkjVar + " because it is not assignable from " + obj);
                            }
                        }
                    }
                }
            }
            Log.i("fkj", "Hints from the Intent: " + enumMap);
        }
        o2a o2aVar = new o2a();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            o2aVar.f24522a = intExtra;
        }
        if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
            this.f46047a.setTorch(true);
        }
        String stringExtra3 = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra3 != null) {
            setStatusText(stringExtra3);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra4 = intent.getStringExtra("CHARACTER_SET");
        new vv40().c(enumMap);
        this.f46047a.setCameraSettings(o2aVar);
        BarcodeView barcodeView = this.f46047a;
        sbx0 sbx0Var = new sbx0((byte) 4, z);
        sbx0Var.c = setNoneOf;
        sbx0Var.d = enumMap;
        sbx0Var.e = stringExtra4;
        sbx0Var.b = intExtra2;
        barcodeView.setDecoderFactory(sbx0Var);
    }

    public final void d() {
        this.f46047a.c();
    }

    public final void e() {
        this.f46047a.d();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(R.id.zxing_barcode_surface);
    }

    public o2a getCameraSettings() {
        return this.f46047a.getCameraSettings();
    }

    public ukj getDecoderFactory() {
        return this.f46047a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.c;
    }

    public ViewfinderView getViewFinder() {
        return this.b;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            this.f46047a.setTorch(true);
            return true;
        }
        if (i == 25) {
            this.f46047a.setTorch(false);
            return true;
        }
        if (i == 27 || i == 80) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void setCameraSettings(o2a o2aVar) {
        this.f46047a.setCameraSettings(o2aVar);
    }

    public void setDecoderFactory(ukj ukjVar) {
        this.f46047a.setDecoderFactory(ukjVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(attributeSet);
    }

    public void setTorchListener(clj cljVar) {
    }
}
