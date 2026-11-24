package androidx.media3.ui;

import a.a1a0;
import a.b4x;
import a.cy3;
import a.dlo;
import a.eku0;
import a.hny;
import a.i1a0;
import a.jqd0;
import a.my90;
import a.n1a0;
import a.n1o;
import a.ohq;
import a.peu0;
import a.qds0;
import a.qea0;
import a.qfu0;
import a.qxk0;
import a.rea0;
import a.ro;
import a.sea0;
import a.tea0;
import a.ulo;
import a.x0x;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.PlayerView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int j1 = 0;
    public CharSequence A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qea0 f45392a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final boolean e;
    public final tea0 f;
    public boolean f1;
    public final ImageView g;
    public boolean g1;
    public final ImageView h;
    public boolean h1;
    public final SubtitleView i;
    public boolean i1;
    public final View j;
    public final TextView k;
    public final PlayerControlView l;
    public final FrameLayout m;
    public final FrameLayout n;
    public final Handler o;
    public final Class p;
    public final Method q;
    public final Object r;
    public my90 s;
    public boolean t;
    public i1a0 u;
    public int v;
    public int w;
    public Drawable x;
    public int y;
    public boolean z;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        int i9;
        boolean z6;
        boolean z7;
        int i10;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, attributeSet, 0);
        qea0 qea0Var = new qea0(this);
        this.f45392a = qea0Var;
        this.o = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.p = null;
            this.q = null;
            this.r = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, jqd0.d, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i11 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i12 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(51, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i14 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z5 = z9;
                i = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.z = typedArrayObtainStyledAttributes.getBoolean(16, this.z);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                i2 = resourceId;
                z2 = z11;
                i5 = i12;
                z6 = zHasValue;
                i3 = integer;
                i8 = color;
                i7 = i13;
                i6 = i14;
                i4 = resourceId2;
                z3 = z12;
                z = z10;
                i9 = i11;
                z4 = z8;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = 5000;
            i2 = R.layout.exo_player_view;
            z = true;
            z2 = true;
            z3 = true;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 1;
            i8 = 0;
            z4 = true;
            z5 = true;
            i9 = 1;
            z6 = false;
        }
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i6);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z6) {
            viewFindViewById.setBackgroundColor(i8);
        }
        if (aspectRatioFrameLayout == null || i7 == 0) {
            this.d = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 != 2) {
                if (i7 == 3) {
                    try {
                        int i15 = qxk0.l;
                        this.d = (View) qxk0.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e) {
                        hny.q("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                        throw r6;
                    }
                } else if (i7 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (Build.VERSION.SDK_INT >= 34) {
                        surfaceView.setSurfaceLifecycle(2);
                    }
                    this.d = surfaceView;
                } else {
                    try {
                        int i16 = peu0.b;
                        this.d = (View) peu0.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        hny.q("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                        throw r6;
                    }
                }
                this.d.setLayoutParams(layoutParams);
                this.d.setOnClickListener(qea0Var);
                this.d.setClickable(false);
                aspectRatioFrameLayout.addView(this.d, 0);
            } else {
                this.d = new TextureView(context);
            }
            z7 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(qea0Var);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
        }
        this.e = z7;
        this.f = Build.VERSION.SDK_INT == 34 ? new tea0() : null;
        this.m = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.n = (FrameLayout) findViewById(R.id.exo_overlay);
        this.g = (ImageView) findViewById(R.id.exo_image);
        this.w = i5;
        try {
            cls = ExoPlayer.class;
            Class<?>[] clsArr = new Class[1];
            i10 = 0;
            try {
                clsArr[0] = ImageOutput.class;
                method = cls.getMethod("setImageOutput", clsArr);
                objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: a.pea0
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        int i17 = PlayerView.j1;
                        if (!method2.getName().equals("onImageAvailable")) {
                            return null;
                        }
                        Bitmap bitmap = (Bitmap) objArr[1];
                        PlayerView playerView = this.f26843a;
                        playerView.o.post(new oh60(playerView, bitmap, (byte) 5));
                        return null;
                    }
                });
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                cls = null;
                objNewProxyInstance = null;
                method = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            i10 = 0;
        }
        this.p = cls;
        this.q = method;
        this.r = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.h = imageView2;
        this.v = (!z4 || i9 == 0 || imageView2 == null) ? i10 : i9;
        if (i4 != 0) {
            this.x = getContext().getDrawable(i4);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.i = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.j = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.y = i3;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.k = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.l = playerControlView;
        } else if (viewFindViewById3 != null) {
            playerControlView = new PlayerControlView(context, attributeSet);
            this.l = playerControlView;
            playerControlView.setId(R.id.exo_controller);
            playerControlView.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView, iIndexOfChild);
        } else {
            this.l = null;
            playerControlView = null;
        }
        this.B = playerControlView != null ? i : i10;
        this.h1 = z;
        this.f1 = z2;
        this.g1 = z3;
        this.t = (!z5 || playerControlView == null) ? i10 : 1;
        if (playerControlView != null) {
            n1a0 n1a0Var = playerControlView.f45391a;
            byte b = n1a0Var.A;
            if (b != 3 && b != 2) {
                n1a0Var.f();
                n1a0Var.i(2);
            }
            qea0 qea0Var2 = this.f45392a;
            qea0Var2.getClass();
            playerControlView.k.add(qea0Var2);
        }
        if (z5) {
            setClickable(true);
        }
        l();
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(my90 my90Var) {
        Class cls = this.p;
        if (cls == null || !cls.isAssignableFrom(my90Var.getClass())) {
            return;
        }
        try {
            Method method = this.q;
            method.getClass();
            Object obj = this.r;
            obj.getClass();
            method.invoke(my90Var, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            ohq.p(e);
        }
    }

    public final boolean a() {
        my90 my90Var = this.s;
        if (my90Var == null || this.r == null) {
            return false;
        }
        ulo uloVar = (ulo) my90Var;
        return uloVar.w(30) && uloVar.o().a(4);
    }

    public final void b() {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean c() {
        my90 my90Var = this.s;
        return my90Var != null && ((ulo) my90Var).w(16) && ((ulo) this.s).z() && ((ulo) this.s).r();
    }

    public final void d(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        my90 my90Var = this.s;
        if (my90Var != null) {
            ulo uloVar = (ulo) my90Var;
            if (uloVar.w(30) && uloVar.o().a(2)) {
                return;
            }
        }
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(0);
            o();
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        tea0 tea0Var;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT != 34 || (tea0Var = this.f) == null || !this.i1 || (surfaceSyncGroup = tea0Var.f33811a) == null) {
            return;
        }
        surfaceSyncGroup.markSyncReady();
        tea0Var.f33811a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        my90 my90Var = this.s;
        if (my90Var != null && ((ulo) my90Var).w(16) && ((ulo) this.s).z()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.l;
        if (z && p() && !playerControlView.i()) {
            e(true);
            return true;
        }
        if ((p() && playerControlView.c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z) {
        if (!(c() && this.g1) && p()) {
            PlayerControlView playerControlView = this.l;
            boolean z2 = playerControlView.i() && playerControlView.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if (z || z2 || zG) {
                h(zG);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.h;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.v == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        my90 my90Var = this.s;
        if (my90Var == null) {
            return true;
        }
        int iS = ((ulo) my90Var).s();
        if (!this.f1) {
            return false;
        }
        if (((ulo) this.s).w(17) && ((ulo) this.s).n().p()) {
            return false;
        }
        if (iS != 1 && iS != 4) {
            my90 my90Var2 = this.s;
            my90Var2.getClass();
            if (((ulo) my90Var2).r()) {
                return false;
            }
        }
        return true;
    }

    public List<ro> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.n;
        if (frameLayout != null) {
            arrayList.add(new ro(frameLayout));
        }
        PlayerControlView playerControlView = this.l;
        if (playerControlView != null) {
            arrayList.add(new ro(playerControlView));
        }
        return b4x.o(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.m;
        x0x.G(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.v;
    }

    public boolean getControllerAutoShow() {
        return this.f1;
    }

    public boolean getControllerHideOnTouch() {
        return this.h1;
    }

    public int getControllerShowTimeoutMs() {
        return this.B;
    }

    public Drawable getDefaultArtwork() {
        return this.x;
    }

    public int getImageDisplayMode() {
        return this.w;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.n;
    }

    public my90 getPlayer() {
        return this.s;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.i;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.v != 0;
    }

    public boolean getUseController() {
        return this.t;
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    public final void h(boolean z) {
        if (p()) {
            int i = z ? 0 : this.B;
            PlayerControlView playerControlView = this.l;
            playerControlView.setShowTimeoutMs(i);
            n1a0 n1a0Var = playerControlView.f45391a;
            PlayerControlView playerControlView2 = n1a0Var.f22741a;
            if (!playerControlView2.k()) {
                playerControlView2.setVisibility(0);
                playerControlView2.m();
                ImageView imageView = playerControlView2.v;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            n1a0Var.k();
        }
    }

    public final void i() {
        if (!p() || this.s == null) {
            return;
        }
        PlayerControlView playerControlView = this.l;
        if (!playerControlView.i()) {
            e(true);
        } else if (this.h1) {
            playerControlView.f();
        }
    }

    public final void j() {
        qfu0 qfu0Var;
        my90 my90Var = this.s;
        if (my90Var != null) {
            ulo uloVar = (ulo) my90Var;
            uloVar.c0();
            qfu0Var = uloVar.i0;
        } else {
            qfu0Var = qfu0.d;
        }
        int i = qfu0Var.f28655a;
        int i2 = qfu0Var.b;
        float f = this.e ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * qfu0Var.c) / i2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final void k() {
        boolean z;
        View view = this.j;
        if (view != null) {
            my90 my90Var = this.s;
            if (my90Var == null || ((ulo) my90Var).s() != 2) {
                z = false;
            } else {
                int i = this.y;
                z = true;
                if (i != 2 && (i != 1 || !((ulo) this.s).r())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void l() {
        PlayerControlView playerControlView = this.l;
        if (playerControlView == null || !this.t) {
            setContentDescription(null);
        } else if (playerControlView.i()) {
            setContentDescription(this.h1 ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void m() {
        TextView textView = this.k;
        if (textView != null) {
            CharSequence charSequence = this.A;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            my90 my90Var = this.s;
            if (my90Var != null) {
                ulo uloVar = (ulo) my90Var;
                uloVar.c0();
                dlo dloVar = uloVar.n0.f;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final void n(boolean z) {
        boolean z2;
        boolean z3;
        Drawable drawable;
        my90 my90Var = this.s;
        boolean zF = false;
        if (my90Var != null) {
            ulo uloVar = (ulo) my90Var;
            if (!uloVar.w(30) || uloVar.o().f30305a.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        boolean z4 = this.z;
        ImageView imageView = this.h;
        View view = this.c;
        if (!z4 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            b();
        }
        if (z2) {
            my90 my90Var2 = this.s;
            if (my90Var2 != null) {
                ulo uloVar2 = (ulo) my90Var2;
                if (uloVar2.w(30) && uloVar2.o().a(2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            boolean zA = a();
            if (!z3 && !zA) {
                if (view != null) {
                    view.setVisibility(0);
                }
                b();
            }
            ImageView imageView2 = this.g;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zA && !z3 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z3 && !zA && z5) {
                b();
            }
            if (!z3 && !zA && this.v != 0) {
                imageView.getClass();
                if (my90Var != null) {
                    ulo uloVar3 = (ulo) my90Var;
                    if (uloVar3.w(18)) {
                        uloVar3.c0();
                        byte[] bArr = uloVar3.R.f;
                        if (bArr != null) {
                            zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                        }
                    }
                }
                if (zF || f(this.x)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.w == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.b) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.s == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.t) {
            return false;
        }
        this.l.getClass();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        x0x.K(i == 0 || this.h != null);
        if (this.v != i) {
            this.v = i;
            n(false);
        }
    }

    public void setAspectRatioListener(cy3 cy3Var) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setAspectRatioListener(cy3Var);
    }

    public void setControllerAnimationEnabled(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.f1 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.g1 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        this.l.getClass();
        this.h1 = z;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(a1a0 a1a0Var) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setOnFullScreenModeChangedListener(a1a0Var);
    }

    public void setControllerShowTimeoutMs(int i) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        this.B = i;
        if (playerControlView.i()) {
            h(g());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(i1a0 i1a0Var) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        i1a0 i1a0Var2 = this.u;
        if (i1a0Var2 == i1a0Var) {
            return;
        }
        if (i1a0Var2 != null) {
            playerControlView.k.remove(i1a0Var2);
        }
        this.u = i1a0Var;
        if (i1a0Var != null) {
            playerControlView.getClass();
            playerControlView.k.add(i1a0Var);
            setControllerVisibilityListener((rea0) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        x0x.K(this.k != null);
        this.A = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.x != drawable) {
            this.x = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.i1 = z;
    }

    public void setErrorMessageProvider(n1o n1oVar) {
        if (n1oVar != null) {
            m();
        }
    }

    public void setFullscreenButtonClickListener(sea0 sea0Var) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setOnFullScreenModeChangedListener(this.f45392a);
    }

    public void setFullscreenButtonState(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.o(z);
    }

    public void setImageDisplayMode(int i) {
        x0x.K(this.g != null);
        if (this.w != i) {
            this.w = i;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.z != z) {
            this.z = z;
            n(false);
        }
    }

    public void setMediaRouteButtonViewProvider(eku0 eku0Var) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setMediaRouteButtonViewProvider(eku0Var);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0106  */
    public void setPlayer(my90 my90Var) {
        boolean z = true;
        x0x.K(Looper.myLooper() == Looper.getMainLooper());
        x0x.A(my90Var == null || ((ulo) my90Var).t == Looper.getMainLooper());
        my90 my90Var2 = this.s;
        if (my90Var2 == my90Var) {
            return;
        }
        View view = this.d;
        qea0 qea0Var = this.f45392a;
        if (my90Var2 != null) {
            ulo uloVar = (ulo) my90Var2;
            uloVar.G(qea0Var);
            if (uloVar.w(27)) {
                if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    uloVar.c0();
                    if (textureView == uloVar.X) {
                        uloVar.d();
                    }
                } else if (view instanceof SurfaceView) {
                    uloVar.c0();
                    SurfaceHolder holder = ((SurfaceView) view).getHolder();
                    uloVar.c0();
                    if (holder != null && holder == uloVar.U) {
                        uloVar.d();
                    }
                }
            }
            Class cls = this.p;
            if (cls != null && cls.isAssignableFrom(my90Var2.getClass())) {
                try {
                    Method method = this.q;
                    method.getClass();
                    method.invoke(my90Var2, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    ohq.p(e);
                    return;
                }
            }
        }
        SubtitleView subtitleView = this.i;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.s = my90Var;
        boolean zP = p();
        PlayerControlView playerControlView = this.l;
        if (zP) {
            playerControlView.setPlayer(my90Var);
        }
        k();
        m();
        n(true);
        if (my90Var == null) {
            if (playerControlView != null) {
                playerControlView.f();
                return;
            }
            return;
        }
        ulo uloVar2 = (ulo) my90Var;
        if (uloVar2.w(27)) {
            if (view instanceof TextureView) {
                uloVar2.U((TextureView) view);
            } else if (view instanceof SurfaceView) {
                uloVar2.T((SurfaceView) view);
            }
            if (uloVar2.w(30)) {
                b4x b4xVar = uloVar2.o().f30305a;
                int i = 0;
                loop0: while (true) {
                    if (i >= b4xVar.size()) {
                        z = false;
                        break;
                    }
                    if (((qds0) b4xVar.get(i)).b.c == 2) {
                        qds0 qds0Var = (qds0) b4xVar.get(i);
                        for (int i2 = 0; i2 < qds0Var.d.length; i2++) {
                            if (qds0Var.a(i2)) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                }
                if (z) {
                    j();
                }
            } else {
                j();
            }
        }
        if (subtitleView != null && uloVar2.w(28)) {
            uloVar2.c0();
            subtitleView.setCues(uloVar2.d0.f6653a);
        }
        uloVar2.a(qea0Var);
        setImageOutput(my90Var);
        e(false);
    }

    public void setRepeatToggleModes(int i) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.y != i) {
            this.y = i;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        PlayerControlView playerControlView = this.l;
        playerControlView.getClass();
        playerControlView.setTimeBarScrubbingEnabled(z);
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        PlayerControlView playerControlView = this.l;
        x0x.K((z && playerControlView == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.t == z) {
            return;
        }
        this.t = z;
        if (p()) {
            playerControlView.setPlayer(this.s);
        } else if (playerControlView != null) {
            playerControlView.f();
            playerControlView.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setControllerVisibilityListener(rea0 rea0Var) {
        if (rea0Var != null) {
            setControllerVisibilityListener((i1a0) null);
        }
    }

    public PlayerView(Context context) {
        this(context, null);
    }
}
