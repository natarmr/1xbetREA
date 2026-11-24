package com.journeyapps.barcodescanner;

import a.cvm0;
import a.d2a;
import a.dlj;
import a.gkj;
import a.hh40;
import a.jrs0;
import a.mz4;
import a.nox;
import a.o0a;
import a.q0a;
import a.qkj;
import a.sbx0;
import a.teg0;
import a.ukj;
import a.vv40;
import a.yqc;
import a.yu5;
import a.zkj;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Set;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public class BarcodeView extends d2a {
    public int B;
    public dlj f1;
    public jrs0 g1;
    public ukj h1;
    public final Handler i1;

    public BarcodeView(Context context) {
        super(context);
        this.B = 1;
        this.f1 = null;
        yu5 yu5Var = new yu5(this, (byte) 0);
        this.h1 = new sbx0((byte) 4, false);
        this.i1 = new Handler(yu5Var);
    }

    @Override // a.d2a
    public final void c() {
        TextureView textureView;
        SurfaceView surfaceView;
        j();
        cvm0.q();
        Log.d("d2a", "pause()");
        this.i = -1;
        q0a q0aVar = this.f5345a;
        if (q0aVar != null) {
            cvm0.q();
            if (q0aVar.f) {
                q0aVar.f27887a.e(q0aVar.l);
            } else {
                q0aVar.g = true;
            }
            q0aVar.f = false;
            this.f5345a = null;
            this.g = false;
        } else {
            this.c.sendEmptyMessage(R.id.zxing_camera_closed);
        }
        if (this.p == null && (surfaceView = this.e) != null) {
            surfaceView.getHolder().removeCallback(this.w);
        }
        if (this.p == null && (textureView = this.f) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.m = null;
        this.n = null;
        this.r = null;
        sbx0 sbx0Var = this.h;
        teg0 teg0Var = (teg0) sbx0Var.d;
        if (teg0Var != null) {
            teg0Var.disable();
        }
        sbx0Var.d = null;
        sbx0Var.c = null;
        sbx0Var.e = null;
        this.z.j();
    }

    public ukj getDecoderFactory() {
        return this.h1;
    }

    public final qkj h() {
        qkj qkjVar;
        if (this.h1 == null) {
            this.h1 = new sbx0((byte) 4, false);
        }
        zkj zkjVar = new zkj();
        HashMap map = new HashMap();
        map.put(gkj.j, zkjVar);
        sbx0 sbx0Var = (sbx0) this.h1;
        sbx0Var.getClass();
        EnumMap enumMap = new EnumMap(gkj.class);
        enumMap.putAll(map);
        EnumMap enumMap2 = (EnumMap) sbx0Var.d;
        if (enumMap2 != null) {
            enumMap.putAll(enumMap2);
        }
        Set set = (Set) sbx0Var.c;
        if (set != null) {
            enumMap.put(gkj.c, set);
        }
        String str = (String) sbx0Var.e;
        if (str != null) {
            enumMap.put(gkj.e, str);
        }
        vv40 vv40Var = new vv40();
        vv40Var.c(enumMap);
        int i = sbx0Var.b;
        if (i == 0) {
            qkjVar = new qkj(vv40Var);
        } else if (i == 1) {
            qkjVar = new nox(vv40Var);
        } else if (i != 2) {
            qkjVar = new qkj(vv40Var);
        } else {
            hh40 hh40Var = new hh40(vv40Var);
            hh40Var.c = true;
            qkjVar = hh40Var;
        }
        zkjVar.f44536a = qkjVar;
        return qkjVar;
    }

    public final void i() {
        j();
        if (this.B == 1 || !this.g) {
            return;
        }
        jrs0 jrs0Var = new jrs0(getCameraInstance(), h(), this.i1);
        this.g1 = jrs0Var;
        jrs0Var.g = getPreviewFramingRect();
        jrs0 jrs0Var2 = this.g1;
        jrs0Var2.getClass();
        cvm0.q();
        HandlerThread handlerThread = new HandlerThread("jrs0");
        jrs0Var2.c = handlerThread;
        handlerThread.start();
        jrs0Var2.d = new Handler(((HandlerThread) jrs0Var2.c).getLooper(), (mz4) jrs0Var2.i);
        jrs0Var2.f17020a = true;
        q0a q0aVar = (q0a) jrs0Var2.b;
        q0aVar.h.post(new o0a(q0aVar, (yqc) jrs0Var2.j, (byte) 0));
    }

    public final void j() {
        jrs0 jrs0Var = this.g1;
        if (jrs0Var != null) {
            cvm0.q();
            synchronized (jrs0Var.h) {
                jrs0Var.f17020a = false;
                ((Handler) jrs0Var.d).removeCallbacksAndMessages(null);
                ((HandlerThread) jrs0Var.c).quit();
            }
            this.g1 = null;
        }
    }

    public void setDecoderFactory(ukj ukjVar) {
        cvm0.q();
        this.h1 = ukjVar;
        jrs0 jrs0Var = this.g1;
        if (jrs0Var != null) {
            jrs0Var.e = h();
        }
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = 1;
        this.f1 = null;
        yu5 yu5Var = new yu5(this, (byte) 0);
        this.h1 = new sbx0((byte) 4, false);
        this.i1 = new Handler(yu5Var);
    }
}
