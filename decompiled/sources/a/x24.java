package a;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class x24 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lin0 f40149a;
    public final Handler b;
    public dmo c;
    public m24 d;
    public int f;
    public a34 h;
    public float g = 1.0f;
    public byte e = 0;

    public x24(Context context, Looper looper, dmo dmoVar) {
        this.f40149a = hfm0.z(new w24(context, (byte) 0));
        this.c = dmoVar;
        this.b = new Handler(looper);
    }

    public final void a() {
        byte b = this.e;
        if (b == 1 || b == 0 || this.h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f40149a.get();
        a34 a34Var = this.h;
        if (Build.VERSION.SDK_INT < 26) {
            audioManager.abandonAudioFocus(a34Var.b);
            return;
        }
        Object obj = a34Var.e;
        obj.getClass();
        audioManager.abandonAudioFocusRequest(y6.g(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.g == f) {
            return;
        }
        this.g = f;
        dmo dmoVar = this.c;
        if (dmoVar != null) {
            dmoVar.g.h(34);
        }
    }

    public final int c(int i, boolean z) {
        int i2;
        int iRequestAudioFocus;
        x860 x860Var;
        if (i == 1 || (i2 = this.f) != 1) {
            a();
            b(0);
            return 1;
        }
        byte b = this.e;
        int i3 = 3;
        if (z) {
            if (b != 2) {
                a34 a34Var = this.h;
                if (a34Var == null) {
                    if (a34Var == null) {
                        x860Var = new x860();
                        m24 m24Var = m24.b;
                        x860Var.f40449a = i2;
                    } else {
                        x860 x860Var2 = new x860();
                        x860Var2.f40449a = a34Var.f155a;
                        x860Var = x860Var2;
                    }
                    m24 m24Var2 = this.d;
                    m24Var2.getClass();
                    this.h = new a34(x860Var.f40449a, new AudioManager.OnAudioFocusChangeListener() { // from class: a.v24
                        @Override // android.media.AudioManager.OnAudioFocusChangeListener
                        public final void onAudioFocusChange(int i4) {
                            x24 x24Var = this.f36666a;
                            x24Var.getClass();
                            if (i4 == -3 || i4 == -2) {
                                if (i4 != -2) {
                                    x24Var.b(4);
                                    return;
                                }
                                dmo dmoVar = x24Var.c;
                                if (dmoVar != null) {
                                    dmoVar.g.b(33, 0, 0).b();
                                }
                                x24Var.b(3);
                                return;
                            }
                            if (i4 == -1) {
                                dmo dmoVar2 = x24Var.c;
                                if (dmoVar2 != null) {
                                    dmoVar2.g.b(33, -1, 0).b();
                                }
                                x24Var.a();
                                x24Var.b(1);
                                return;
                            }
                            if (i4 != 1) {
                                rw2.u(i4, "Unknown focus change type: ", "AudioFocusManager");
                                return;
                            }
                            x24Var.b(2);
                            dmo dmoVar3 = x24Var.c;
                            if (dmoVar3 != null) {
                                dmoVar3.g.b(33, 1, 0).b();
                            }
                        }
                    }, this.b, m24Var2, true);
                }
                AudioManager audioManager = (AudioManager) this.f40149a.get();
                a34 a34Var2 = this.h;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 26) {
                    Object obj = a34Var2.e;
                    obj.getClass();
                    iRequestAudioFocus = audioManager.requestAudioFocus(y6.g(obj));
                } else {
                    AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = a34Var2.b;
                    m24 m24Var3 = a34Var2.d;
                    m24Var3.getClass();
                    if (i4 >= 26) {
                        try {
                            int volumeControlStream = m24Var3.a().getVolumeControlStream();
                            if (volumeControlStream != Integer.MIN_VALUE) {
                                i3 = volumeControlStream;
                            }
                        } catch (RuntimeException unused) {
                        }
                    }
                    iRequestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener, i3, a34Var2.f155a);
                }
                if (iRequestAudioFocus == 1 || iRequestAudioFocus == 2) {
                    b(2);
                    return 1;
                }
                b(1);
                return -1;
            }
        } else {
            if (b == 1) {
                return -1;
            }
            if (b == 3) {
                return 0;
            }
        }
        return 1;
    }
}
