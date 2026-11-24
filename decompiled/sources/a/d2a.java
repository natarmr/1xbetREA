package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d2a extends ViewGroup {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q0a f5345a;
    public WindowManager b;
    public Handler c;
    public boolean d;
    public SurfaceView e;
    public TextureView f;
    public boolean g;
    public sbx0 h;
    public int i;
    public final ArrayList j;
    public zz2 k;
    public o2a l;
    public g7k0 m;
    public g7k0 n;
    public Rect o;
    public g7k0 p;
    public Rect q;
    public Rect r;
    public g7k0 s;
    public double t;
    public tub0 u;
    public boolean v;
    public final b2a w;
    public final yu5 x;
    public final yk50 y;
    public final c2a z;

    public d2a(Context context) {
        super(context);
        this.d = false;
        this.g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.l = new o2a();
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 0.1d;
        this.u = null;
        this.v = false;
        BarcodeView barcodeView = (BarcodeView) this;
        this.w = new b2a(barcodeView);
        this.x = new yu5(barcodeView, (byte) 1);
        this.y = new yk50((Object) barcodeView, (byte) 17);
        this.z = new c2a(barcodeView, (byte) 0);
        a(context, null);
    }

    private int getDisplayRotation() {
        return this.b.getDefaultDisplay().getRotation();
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        b(attributeSet);
        this.b = (WindowManager) context.getSystemService("window");
        this.c = new Handler(this.x);
        this.h = new sbx0((byte) 10, false);
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, spd0.f32588a);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.s = new g7k0(dimension, dimension2);
        }
        this.d = typedArrayObtainStyledAttributes.getBoolean(3, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.u = new tab((byte) 0);
        } else if (integer == 2) {
            this.u = new tab((byte) 1);
        } else if (integer == 3) {
            this.u = new tab((byte) 2);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public abstract void c();

    public final void d() {
        cvm0.q();
        Log.d("d2a", "resume()");
        byte b = 0;
        if (this.f5345a != null) {
            Log.w("d2a", "initCamera called twice");
        } else {
            Context context = getContext();
            q0a q0aVar = new q0a();
            q0aVar.f = false;
            q0aVar.g = true;
            q0aVar.i = new o2a();
            p0a p0aVar = new p0a(q0aVar, b);
            q0aVar.j = new p0a(q0aVar, (byte) 1);
            q0aVar.k = new p0a(q0aVar, (byte) 2);
            q0aVar.l = new p0a(q0aVar, (byte) 3);
            cvm0.q();
            sbx0 sbx0Var = sbx0.g;
            if (sbx0Var == null) {
                sbx0Var = new sbx0((byte) 3);
                sbx0.g = sbx0Var;
            }
            q0aVar.f27887a = sbx0Var;
            a1a a1aVar = new a1a(context);
            q0aVar.c = a1aVar;
            a1aVar.g = q0aVar.i;
            q0aVar.h = new Handler();
            o2a o2aVar = this.l;
            if (!q0aVar.f) {
                q0aVar.i = o2aVar;
                a1aVar.g = o2aVar;
            }
            this.f5345a = q0aVar;
            q0aVar.d = this.c;
            cvm0.q();
            q0aVar.f = true;
            q0aVar.g = false;
            synchronized (sbx0Var.e) {
                sbx0Var.b++;
                sbx0Var.e(p0aVar);
            }
            this.i = getDisplayRotation();
        }
        if (this.p != null) {
            g();
        } else {
            SurfaceView surfaceView = this.e;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.w);
            } else {
                TextureView textureView = this.f;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.f.getSurfaceTexture();
                        this.p = new g7k0(this.f.getWidth(), this.f.getHeight());
                        g();
                    } else {
                        this.f.setSurfaceTextureListener(new a2a(this, b));
                    }
                }
            }
        }
        requestLayout();
        sbx0 sbx0Var2 = this.h;
        Context context2 = getContext();
        yk50 yk50Var = this.y;
        teg0 teg0Var = (teg0) sbx0Var2.d;
        if (teg0Var != null) {
            teg0Var.disable();
        }
        sbx0Var2.d = null;
        sbx0Var2.c = null;
        sbx0Var2.e = null;
        Context applicationContext = context2.getApplicationContext();
        sbx0Var2.e = yk50Var;
        sbx0Var2.c = (WindowManager) applicationContext.getSystemService("window");
        teg0 teg0Var2 = new teg0(sbx0Var2, applicationContext);
        sbx0Var2.d = teg0Var2;
        teg0Var2.enable();
        sbx0Var2.b = ((WindowManager) sbx0Var2.c).getDefaultDisplay().getRotation();
    }

    public final void e() {
        if (this.f5345a == null || getDisplayRotation() == this.i) {
            return;
        }
        c();
        d();
    }

    public final void f(c5k c5kVar) {
        if (this.g || this.f5345a == null) {
            return;
        }
        Log.i("d2a", "Starting preview");
        q0a q0aVar = this.f5345a;
        q0aVar.b = c5kVar;
        cvm0.q();
        if (!q0aVar.f) {
            jf4.n("CameraInstance is not open");
            return;
        }
        q0aVar.f27887a.e(q0aVar.k);
        this.g = true;
        ((BarcodeView) this).i();
        this.z.g();
    }

    public final void g() {
        Rect rect;
        float f;
        g7k0 g7k0Var = this.p;
        if (g7k0Var == null || this.n == null || (rect = this.o) == null) {
            return;
        }
        if (this.e != null && g7k0Var.equals(new g7k0(rect.width(), this.o.height()))) {
            SurfaceHolder holder = this.e.getHolder();
            c5k c5kVar = new c5k();
            if (holder == null) {
                jf4.o("surfaceHolder may not be null");
                return;
            } else {
                c5kVar.f3775a = holder;
                f(c5kVar);
                return;
            }
        }
        TextureView textureView = this.f;
        if (textureView == null || textureView.getSurfaceTexture() == null) {
            return;
        }
        if (this.n != null) {
            int width = this.f.getWidth();
            int height = this.f.getHeight();
            g7k0 g7k0Var2 = this.n;
            float f2 = height;
            float f3 = width / f2;
            float f4 = g7k0Var2.f10819a / g7k0Var2.b;
            float f5 = 1.0f;
            if (f3 < f4) {
                float f6 = f4 / f3;
                f = 1.0f;
                f5 = f6;
            } else {
                f = f3 / f4;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(f5, f);
            float f7 = width;
            matrix.postTranslate((f7 - (f5 * f7)) / 2.0f, (f2 - (f * f2)) / 2.0f);
            this.f.setTransform(matrix);
        }
        SurfaceTexture surfaceTexture = this.f.getSurfaceTexture();
        c5k c5kVar2 = new c5k();
        if (surfaceTexture == null) {
            jf4.o("surfaceTexture may not be null");
        } else {
            c5kVar2.b = surfaceTexture;
            f(c5kVar2);
        }
    }

    public q0a getCameraInstance() {
        return this.f5345a;
    }

    public o2a getCameraSettings() {
        return this.l;
    }

    public Rect getFramingRect() {
        return this.q;
    }

    public g7k0 getFramingRectSize() {
        return this.s;
    }

    public double getMarginFraction() {
        return this.t;
    }

    public Rect getPreviewFramingRect() {
        return this.r;
    }

    public tub0 getPreviewScalingStrategy() {
        tub0 tub0Var = this.u;
        if (tub0Var != null) {
            return tub0Var;
        }
        return this.f != null ? new tab((byte) 0) : new tab((byte) 1);
    }

    public g7k0 getPreviewSize() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.d) {
            TextureView textureView = new TextureView(getContext());
            this.f = textureView;
            textureView.setSurfaceTextureListener(new a2a(this, (byte) 0));
            addView(this.f);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.e = surfaceView;
        surfaceView.getHolder().addCallback(this.w);
        addView(this.e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g7k0 g7k0Var = new g7k0(i3 - i, i4 - i2);
        this.m = g7k0Var;
        q0a q0aVar = this.f5345a;
        if (q0aVar != null && q0aVar.e == null) {
            int displayRotation = getDisplayRotation();
            zz2 zz2Var = new zz2();
            zz2Var.c = new tab((byte) 1);
            zz2Var.f45232a = displayRotation;
            zz2Var.b = g7k0Var;
            this.k = zz2Var;
            zz2Var.c = getPreviewScalingStrategy();
            q0a q0aVar2 = this.f5345a;
            zz2 zz2Var2 = this.k;
            q0aVar2.e = zz2Var2;
            q0aVar2.c.h = zz2Var2;
            cvm0.q();
            if (!q0aVar2.f) {
                jf4.n("CameraInstance is not open");
                return;
            }
            q0aVar2.f27887a.e(q0aVar2.j);
            boolean z2 = this.v;
            if (z2) {
                q0a q0aVar3 = this.f5345a;
                q0aVar3.getClass();
                cvm0.q();
                if (q0aVar3.f) {
                    q0aVar3.f27887a.e(new hp2((Object) q0aVar3, z2, (byte) 2));
                }
            }
        }
        SurfaceView surfaceView = this.e;
        if (surfaceView == null) {
            TextureView textureView = this.f;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.o;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.v);
        return bundle;
    }

    public void setCameraSettings(o2a o2aVar) {
        this.l = o2aVar;
    }

    public void setFramingRectSize(g7k0 g7k0Var) {
        this.s = g7k0Var;
    }

    public void setMarginFraction(double d) {
        if (d < 0.5d) {
            this.t = d;
        } else {
            jf4.o("The margin fraction must be less than 0.5");
        }
    }

    public void setPreviewScalingStrategy(tub0 tub0Var) {
        this.u = tub0Var;
    }

    public void setTorch(boolean z) {
        this.v = z;
        q0a q0aVar = this.f5345a;
        if (q0aVar != null) {
            cvm0.q();
            if (q0aVar.f) {
                q0aVar.f27887a.e(new hp2((Object) q0aVar, z, (byte) 2));
            }
        }
    }

    public void setUseTextureView(boolean z) {
        this.d = z;
    }

    public d2a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = false;
        this.g = false;
        this.i = -1;
        this.j = new ArrayList();
        this.l = new o2a();
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = 0.1d;
        this.u = null;
        this.v = false;
        BarcodeView barcodeView = (BarcodeView) this;
        this.w = new b2a(barcodeView);
        this.x = new yu5(barcodeView, (byte) 1);
        this.y = new yk50((Object) barcodeView, (byte) 17);
        this.z = new c2a(barcodeView, (byte) 0);
        a(context, attributeSet);
    }
}
