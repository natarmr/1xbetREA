package androidx.camera.view;

import a.avb0;
import a.bvb0;
import a.cvb0;
import a.dvb0;
import a.e9d0;
import a.evb0;
import a.g14;
import a.hny;
import a.hy40;
import a.jls0;
import a.kzw;
import a.l8x;
import a.lhk;
import a.mf80;
import a.n0a;
import a.n8z;
import a.nub0;
import a.nv20;
import a.ofm0;
import a.pmn0;
import a.q7h0;
import a.raq0;
import a.rgu0;
import a.sxs0;
import a.uy9;
import a.wh00;
import a.wju0;
import a.wpd0;
import a.wvk;
import a.xd40;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {
    public static final /* synthetic */ int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public avb0 f45339a;
    public dvb0 b;
    public final q7h0 c;
    public final n8z d;
    public boolean e;
    public final hy40 f;
    public final AtomicReference g;
    public final evb0 h;
    public n0a i;
    public final wvk j;
    public final g14 k;
    public final nv20 l;

    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        this.f45339a = avb0.PERFORMANCE;
        n8z n8zVar = new n8z();
        n8zVar.h = bvb0.FILL_CENTER;
        this.d = n8zVar;
        this.e = true;
        this.f = new hy40(cvb0.f5022a);
        this.g = new AtomicReference();
        this.h = new evb0(n8zVar);
        this.j = new wvk(this, (byte) 1);
        this.k = new g14(this, (byte) 4);
        this.l = new nv20(this);
        ofm0.m();
        Resources.Theme theme = context.getTheme();
        int[] iArr = wpd0.f39539a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        rgu0.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, ((bvb0) n8zVar.h).f3271a);
            for (bvb0 bvb0Var : bvb0.values()) {
                if (bvb0Var.f3271a == integer) {
                    setScaleType(bvb0Var);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (avb0 avb0Var : avb0.values()) {
                        if (avb0Var.f1517a == integer2) {
                            setImplementationMode(avb0Var);
                            typedArrayObtainStyledAttributes.recycle();
                            new sxs0(context, new hny((byte) 25));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            q7h0 q7h0Var = new q7h0(context, null, 0, 0);
                            q7h0Var.setBackgroundColor(-1);
                            q7h0Var.setAlpha(0.0f);
                            q7h0Var.setElevation(Float.MAX_VALUE);
                            this.c = q7h0Var;
                            q7h0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean b(pmn0 pmn0Var, avb0 avb0Var) {
        boolean zEquals = pmn0Var.d.h().A().equals("androidx.camera.camera2.legacy");
        boolean z = (lhk.f20060a.b(SurfaceViewStretchedQuirk.class) == null && lhk.f20060a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT > 24 && !zEquals && !z) {
            int iOrdinal = avb0Var.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                e9d0.i(avb0Var, "Invalid implementation mode: ");
                return false;
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService(CommonConstant.ReqAccessTokenParam.DISPLAY_LABEL);
    }

    private kzw getScreenFlashInternal() {
        return this.c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    hny.w(getScaleType(), "Unexpected scale type: ");
                    return 0;
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(kzw kzwVar) {
        l8x.U("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public final void a() {
        Rect rect;
        Display defaultDisplay;
        n0a n0aVar;
        ofm0.m();
        if (this.b != null) {
            if (this.e && (defaultDisplay = getDefaultDisplay()) != null && (n0aVar = this.i) != null) {
                n8z n8zVar = this.d;
                int iB = n0aVar.B(defaultDisplay.getRotation());
                int rotation = defaultDisplay.getRotation();
                if (n8zVar.d) {
                    n8zVar.f23114a = iB;
                    n8zVar.b = rotation;
                }
            }
            this.b.f();
        }
        evb0 evb0Var = this.h;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        evb0Var.getClass();
        ofm0.m();
        synchronized (evb0Var) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = evb0Var.b) != null) {
                    evb0Var.f8459a.c(size, layoutDirection, rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bitmap getBitmap() {
        ofm0.m();
        dvb0 dvb0Var = this.b;
        if (dvb0Var == null) {
            return null;
        }
        FrameLayout frameLayout = dvb0Var.b;
        Bitmap bitmapB = dvb0Var.b();
        if (bitmapB == null) {
            return null;
        }
        n8z n8zVar = dvb0Var.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!n8zVar.h()) {
            return bitmapB;
        }
        Matrix matrixF = n8zVar.f();
        RectF rectFG = n8zVar.g(layoutDirection, size);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapB.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixF);
        matrix.postScale(rectFG.width() / ((Size) n8zVar.e).getWidth(), rectFG.height() / ((Size) n8zVar.e).getHeight());
        matrix.postTranslate(rectFG.left, rectFG.top);
        canvas.drawBitmap(bitmapB, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public uy9 getController() {
        ofm0.m();
        return null;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public avb0 getImplementationMode() {
        ofm0.m();
        return this.f45339a;
    }

    public xd40 getMeteringPointFactory() {
        ofm0.m();
        return this.h;
    }

    public mf80 getOutputTransform() {
        Matrix matrixE;
        n8z n8zVar = this.d;
        ofm0.m();
        try {
            matrixE = n8zVar.e(getLayoutDirection(), new Size(getWidth(), getHeight()));
        } catch (IllegalStateException unused) {
            matrixE = null;
        }
        Rect rect = (Rect) n8zVar.f;
        if (matrixE == null || rect == null) {
            l8x.U("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = jls0.f16733a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(jls0.f16733a, rectF2, Matrix.ScaleToFit.FILL);
        matrixE.preConcat(matrix);
        if (this.b instanceof raq0) {
            matrixE.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            l8x.E0("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new mf80();
    }

    public wh00 getPreviewStreamState() {
        return this.f;
    }

    public bvb0 getScaleType() {
        ofm0.m();
        return (bvb0) this.d.h;
    }

    public kzw getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        ofm0.m();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        n8z n8zVar = this.d;
        if (!n8zVar.h()) {
            return null;
        }
        Matrix matrix = new Matrix((Matrix) n8zVar.g);
        matrix.postConcat(n8zVar.e(layoutDirection, size));
        return matrix;
    }

    public nub0 getSurfaceProvider() {
        ofm0.m();
        return this.l;
    }

    public wju0 getViewPort() {
        ofm0.m();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        int rotation = defaultDisplay.getRotation();
        ofm0.m();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        wju0 wju0Var = new wju0();
        wju0Var.f39281a = viewPortScaleType;
        wju0Var.b = rational;
        wju0Var.c = rotation;
        wju0Var.d = layoutDirection;
        return wju0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        DisplayManager displayManager;
        super.onAttachedToWindow();
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.registerDisplayListener(this.j, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.k);
        dvb0 dvb0Var = this.b;
        if (dvb0Var != null) {
            dvb0Var.c();
        }
        ofm0.m();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DisplayManager displayManager;
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.k);
        dvb0 dvb0Var = this.b;
        if (dvb0Var != null) {
            dvb0Var.d();
        }
        if (isInEditMode() || (displayManager = getDisplayManager()) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.j);
    }

    public void setController(uy9 uy9Var) {
        ofm0.m();
        ofm0.m();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(avb0 avb0Var) {
        ofm0.m();
        this.f45339a = avb0Var;
    }

    public void setScaleType(bvb0 bvb0Var) {
        ofm0.m();
        this.d.h = bvb0Var;
        a();
        ofm0.m();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        ofm0.m();
        this.c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public PreviewView(Context context) {
        this(context, null);
    }
}
