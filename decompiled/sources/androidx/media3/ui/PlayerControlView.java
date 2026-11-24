package androidx.media3.ui;

import a.a1a0;
import a.amq0;
import a.b1a0;
import a.b4x;
import a.bmq0;
import a.c1a0;
import a.e1a0;
import a.e3c;
import a.eku0;
import a.g14;
import a.g1a0;
import a.hn30;
import a.ig00;
import a.itf0;
import a.j44;
import a.jf4;
import a.jqd0;
import a.l910;
import a.lfr;
import a.my90;
import a.n1a0;
import a.ohq;
import a.ouu;
import a.psc;
import a.qds0;
import a.r3x;
import a.rcf0;
import a.rds0;
import a.scs0;
import a.so;
import a.ulo;
import a.uo;
import a.v3x;
import a.vtt0;
import a.wm30;
import a.wss;
import a.x0x;
import a.y0a0;
import a.yge0;
import a.yx90;
import a.z0a0;
import a.zx90;
import a.zxj;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.common.Timeline$Window;
import androidx.media3.common.b;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {
    public static final float[] i2;
    public final ImageView A;
    public final String A1;
    public final ImageView B;
    public final String B1;
    public final Drawable C1;
    public final Drawable D1;
    public final float E1;
    public final float F1;
    public final String G1;
    public final String H1;
    public final Drawable I1;
    public final Drawable J1;
    public final String K1;
    public final String L1;
    public final Drawable M1;
    public final Drawable N1;
    public final String O1;
    public final String P1;
    public my90 Q1;
    public boolean R1;
    public boolean S1;
    public boolean U1;
    public boolean V1;
    public boolean W1;
    public boolean X1;
    public int Y1;
    public boolean Z1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1a0 f45391a;
    public int a2;
    public final Resources b;
    public int b2;
    public final Handler c;
    public long[] c2;
    public final z0a0 d;
    public boolean[] d2;
    public final Class e;
    public final long[] e2;
    public final Method f;
    public final ImageView f1;
    public final boolean[] f2;
    public final Method g;
    public final ImageView g1;
    public long g2;
    public final Class h;
    public final ImageView h1;
    public boolean h2;
    public final Method i;
    public final ImageView i1;
    public final Method j;
    public final View j1;
    public final CopyOnWriteArrayList k;
    public final View k1;
    public final RecyclerView l;
    public final View l1;
    public final e1a0 m;
    public final TextView m1;
    public final b1a0 n;
    public final TextView n1;
    public final y0a0 o;
    public final zxj o1;
    public final y0a0 p;
    public final StringBuilder p1;
    public final psc q;
    public final Formatter q1;
    public final PopupWindow r;
    public final amq0 r1;
    public final int s;
    public final Timeline$Window s1;
    public final ImageView t;
    public final wss t1;
    public final ImageView u;
    public final Drawable u1;
    public final ImageView v;
    public final Drawable v1;
    public final View w;
    public final Drawable w1;
    public final View x;
    public final Drawable x1;
    public final TextView y;
    public final Drawable y1;
    public final TextView z;
    public final String z1;

    static {
        hn30.a("media3.ui");
        i2 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:31:0x0274  */
    /* JADX WARN: Code duplicated, block: B:34:0x028d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0290  */
    /* JADX WARN: Code duplicated, block: B:39:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x02f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x031b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0321  */
    /* JADX WARN: Code duplicated, block: B:60:0x0344  */
    /* JADX WARN: Code duplicated, block: B:63:0x0356  */
    /* JADX WARN: Code duplicated, block: B:66:0x0373  */
    /* JADX WARN: Code duplicated, block: B:69:0x039e  */
    /* JADX WARN: Code duplicated, block: B:70:0x03af  */
    /* JADX WARN: Code duplicated, block: B:72:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:73:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:76:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:79:0x03db  */
    /* JADX WARN: Code duplicated, block: B:80:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:83:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0411  */
    /* JADX WARN: Code duplicated, block: B:92:0x0423  */
    /* JADX WARN: Code duplicated, block: B:95:0x044d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0606  */
    /* JADX WARN: Code duplicated, block: B:99:0x0608  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public PlayerControlView(Context context, AttributeSet attributeSet) throws NoSuchMethodException {
        int i;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z7;
        int i18;
        boolean z8;
        Method method;
        Method method2;
        Class<?> cls;
        Method method3;
        Method method4;
        ImageView imageView;
        ImageView imageView2;
        l910 l910Var;
        int i19;
        ImageView imageView3;
        l910 l910Var2;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        zxj zxjVar;
        View viewFindViewById4;
        wm30 wm30Var;
        Resources resources;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        Typeface typefaceA;
        ImageView imageView7;
        TextView textView;
        View view;
        ImageView imageView8;
        TextView textView2;
        View view2;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        boolean z9;
        super(context, null, 0);
        Class cls2 = Boolean.TYPE;
        this.V1 = true;
        this.Y1 = 5000;
        this.b2 = 0;
        this.a2 = Response.OK;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, jqd0.c, 0, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(42, R.drawable.exo_styled_controls_vr);
                this.Y1 = typedArrayObtainStyledAttributes.getInt(32, this.Y1);
                this.b2 = typedArrayObtainStyledAttributes.getInt(19, this.b2);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                this.Z1 = typedArrayObtainStyledAttributes.getBoolean(39, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.a2));
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i7 = resourceId4;
                i13 = resourceId17;
                i = resourceId5;
                i3 = resourceId8;
                i4 = resourceId;
                i5 = resourceId2;
                i12 = resourceId13;
                z6 = z12;
                i15 = resourceId7;
                i9 = resourceId10;
                i16 = resourceId15;
                z7 = z11;
                z3 = z15;
                i6 = resourceId3;
                i10 = resourceId11;
                z4 = z14;
                i14 = resourceId6;
                i17 = resourceId16;
                z = z17;
                i18 = resourceId14;
                z8 = z10;
                i11 = resourceId12;
                z5 = z13;
                i8 = resourceId9;
                z2 = z16;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = R.drawable.exo_styled_controls_simple_fastforward;
            i3 = R.drawable.exo_styled_controls_fullscreen_exit;
            i4 = R.layout.exo_player_control_view;
            i5 = R.drawable.exo_styled_controls_play;
            i6 = R.drawable.exo_styled_controls_pause;
            i7 = R.drawable.exo_styled_controls_next;
            i8 = R.drawable.exo_styled_controls_fullscreen_enter;
            i9 = R.drawable.exo_styled_controls_repeat_off;
            i10 = R.drawable.exo_styled_controls_repeat_one;
            i11 = R.drawable.exo_styled_controls_repeat_all;
            i12 = R.drawable.exo_styled_controls_shuffle_on;
            z = true;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = true;
            z6 = true;
            i13 = R.drawable.exo_styled_controls_vr;
            i14 = R.drawable.exo_styled_controls_previous;
            i15 = R.drawable.exo_styled_controls_simple_rewind;
            i16 = R.drawable.exo_styled_controls_subtitle_on;
            i17 = R.drawable.exo_styled_controls_subtitle_off;
            z7 = true;
            i18 = R.drawable.exo_styled_controls_shuffle_off;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(i4, this);
        setDescendantFocusability(262144);
        this.d = new z0a0(this);
        this.k = new CopyOnWriteArrayList();
        this.r1 = new amq0();
        this.s1 = new Timeline$Window();
        StringBuilder sb = new StringBuilder();
        this.p1 = sb;
        int i20 = i5;
        this.q1 = new Formatter(sb, Locale.getDefault());
        this.c2 = new long[0];
        this.d2 = new boolean[0];
        this.e2 = new long[0];
        this.f2 = new boolean[0];
        this.t1 = new wss(this, (byte) 15);
        try {
            method = ExoPlayer.class.getMethod("setScrubbingModeEnabled", cls2);
            try {
                method2 = ExoPlayer.class.getMethod("isScrubbingModeEnabled", null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.e = ExoPlayer.class;
        this.f = method;
        this.g = method2;
        try {
            cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method3 = cls.getMethod("setScrubbingModeEnabled", cls2);
                try {
                    method4 = cls.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    method4 = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                method3 = null;
                method4 = null;
                this.h = cls;
                this.i = method3;
                this.j = method4;
                this.m1 = (TextView) findViewById(R.id.exo_duration);
                this.n1 = (TextView) findViewById(R.id.exo_position);
                imageView = (ImageView) findViewById(R.id.exo_subtitle);
                this.g1 = imageView;
                if (imageView != null) {
                    imageView.setOnClickListener(this.d);
                }
                imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
                this.h1 = imageView2;
                byte b = 15;
                l910Var = new l910(this, b);
                if (imageView2 == null) {
                    i19 = 8;
                } else {
                    i19 = 8;
                    imageView2.setVisibility(8);
                    imageView2.setOnClickListener(l910Var);
                }
                imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
                this.i1 = imageView3;
                l910Var2 = new l910(this, b);
                if (imageView3 != null) {
                    imageView3.setVisibility(i19);
                    imageView3.setOnClickListener(l910Var2);
                }
                viewFindViewById = findViewById(R.id.exo_settings);
                this.j1 = viewFindViewById;
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(this.d);
                }
                viewFindViewById2 = findViewById(R.id.exo_playback_speed);
                this.k1 = viewFindViewById2;
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setOnClickListener(this.d);
                }
                viewFindViewById3 = findViewById(R.id.exo_audio_track);
                this.l1 = viewFindViewById3;
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setOnClickListener(this.d);
                }
                zxjVar = (zxj) findViewById(R.id.exo_progress);
                viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
                if (zxjVar != null) {
                    if (viewFindViewById4 != null) {
                        zxjVar = new zxj(context, attributeSet);
                        zxjVar.setId(R.id.exo_progress);
                        zxjVar.setLayoutParams(viewFindViewById4.getLayoutParams());
                        ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
                        int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
                        viewGroup.removeView(viewFindViewById4);
                        viewGroup.addView(zxjVar, iIndexOfChild);
                        this.o1 = zxjVar;
                    } else {
                        wm30Var = null;
                        this.o1 = null;
                        zxjVar = null;
                    }
                    if (zxjVar != null) {
                        z0a0 z0a0Var = this.d;
                        z0a0Var.getClass();
                        zxjVar.x.add(z0a0Var);
                    }
                    this.c = vtt0.n(wm30Var);
                    resources = context.getResources();
                    this.b = resources;
                    imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
                    this.v = imageView4;
                    if (imageView4 != null) {
                        imageView4.setOnClickListener(this.d);
                    }
                    imageView5 = (ImageView) findViewById(R.id.exo_prev);
                    this.t = imageView5;
                    if (imageView5 != null) {
                        imageView5.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
                        imageView5.setOnClickListener(this.d);
                    }
                    imageView6 = (ImageView) findViewById(R.id.exo_next);
                    this.u = imageView6;
                    if (imageView6 != null) {
                        imageView6.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
                        imageView6.setOnClickListener(this.d);
                    }
                    typefaceA = itf0.a(R.font.roboto_medium_numbers, context);
                    imageView7 = (ImageView) findViewById(R.id.exo_rew);
                    textView = (TextView) findViewById(R.id.exo_rew_with_amount);
                    if (imageView7 != null) {
                        imageView7.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
                        this.x = imageView7;
                        this.z = null;
                    } else if (textView != null) {
                        textView.setTypeface(typefaceA);
                        this.z = textView;
                        this.x = textView;
                    } else {
                        this.z = null;
                        this.x = null;
                    }
                    view = this.x;
                    if (view != null) {
                        view.setOnClickListener(this.d);
                    }
                    imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
                    textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
                    if (imageView8 != null) {
                        imageView8.setImageDrawable(resources.getDrawable(i, context.getTheme()));
                        this.w = imageView8;
                        this.y = null;
                    } else if (textView2 != null) {
                        textView2.setTypeface(typefaceA);
                        this.y = textView2;
                        this.w = textView2;
                    } else {
                        this.y = null;
                        this.w = null;
                    }
                    view2 = this.w;
                    if (view2 != null) {
                        view2.setOnClickListener(this.d);
                    }
                    imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
                    this.A = imageView9;
                    if (imageView9 != null) {
                        imageView9.setOnClickListener(this.d);
                    }
                    imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
                    this.B = imageView10;
                    if (imageView10 != null) {
                        imageView10.setOnClickListener(this.d);
                    }
                    this.E1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                    this.F1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                    imageView11 = (ImageView) findViewById(R.id.exo_vr);
                    this.f1 = imageView11;
                    if (imageView11 != null) {
                        imageView11.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
                        n(imageView11, false);
                    }
                    n1a0 n1a0Var = new n1a0(this);
                    this.f45391a = n1a0Var;
                    n1a0Var.D = z;
                    e1a0 e1a0Var = new e1a0(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
                    this.m = e1a0Var;
                    this.s = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
                    RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                    this.l = recyclerView;
                    recyclerView.setAdapter(e1a0Var);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
                    PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
                    this.r = popupWindow;
                    popupWindow.setOnDismissListener(this.d);
                    this.h2 = true;
                    this.q = new psc(getResources());
                    this.I1 = resources.getDrawable(i16, context.getTheme());
                    this.J1 = resources.getDrawable(i17, context.getTheme());
                    this.K1 = resources.getString(R.string.exo_controls_cc_enabled_description);
                    this.L1 = resources.getString(R.string.exo_controls_cc_disabled_description);
                    this.o = new y0a0(this, (byte) 1);
                    this.p = new y0a0(this, (byte) 0);
                    this.n = new b1a0(this, resources.getStringArray(R.array.exo_controls_playback_speeds), i2);
                    this.u1 = resources.getDrawable(i20, context.getTheme());
                    this.v1 = resources.getDrawable(i6, context.getTheme());
                    this.M1 = resources.getDrawable(i3, context.getTheme());
                    this.N1 = resources.getDrawable(i8, context.getTheme());
                    this.w1 = resources.getDrawable(i9, context.getTheme());
                    this.x1 = resources.getDrawable(i10, context.getTheme());
                    this.y1 = resources.getDrawable(i11, context.getTheme());
                    this.C1 = resources.getDrawable(i12, context.getTheme());
                    this.D1 = resources.getDrawable(i18, context.getTheme());
                    this.O1 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
                    this.P1 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
                    this.z1 = resources.getString(R.string.exo_controls_repeat_off_description);
                    this.A1 = resources.getString(R.string.exo_controls_repeat_one_description);
                    this.B1 = resources.getString(R.string.exo_controls_repeat_all_description);
                    this.G1 = resources.getString(R.string.exo_controls_shuffle_on_description);
                    this.H1 = resources.getString(R.string.exo_controls_shuffle_off_description);
                    n1a0Var.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
                    n1a0Var.h(this.w, z7);
                    n1a0Var.h(this.x, z8);
                    n1a0Var.h(imageView5, z6);
                    n1a0Var.h(imageView6, z5);
                    n1a0Var.h(imageView10, z4);
                    n1a0Var.h(this.g1, z3);
                    n1a0Var.h(imageView11, z2);
                    if (this.b2 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    n1a0Var.h(imageView9, z9);
                    addOnLayoutChangeListener(new g14(this, (byte) 2));
                }
                this.o1 = zxjVar;
                wm30Var = null;
                if (zxjVar != null) {
                    z0a0 z0a0Var2 = this.d;
                    z0a0Var2.getClass();
                    zxjVar.x.add(z0a0Var2);
                }
                this.c = vtt0.n(wm30Var);
                resources = context.getResources();
                this.b = resources;
                imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
                this.v = imageView4;
                if (imageView4 != null) {
                    imageView4.setOnClickListener(this.d);
                }
                imageView5 = (ImageView) findViewById(R.id.exo_prev);
                this.t = imageView5;
                if (imageView5 != null) {
                    imageView5.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
                    imageView5.setOnClickListener(this.d);
                }
                imageView6 = (ImageView) findViewById(R.id.exo_next);
                this.u = imageView6;
                if (imageView6 != null) {
                    imageView6.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
                    imageView6.setOnClickListener(this.d);
                }
                typefaceA = itf0.a(R.font.roboto_medium_numbers, context);
                imageView7 = (ImageView) findViewById(R.id.exo_rew);
                textView = (TextView) findViewById(R.id.exo_rew_with_amount);
                if (imageView7 != null) {
                    imageView7.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
                    this.x = imageView7;
                    this.z = null;
                } else if (textView != null) {
                    textView.setTypeface(typefaceA);
                    this.z = textView;
                    this.x = textView;
                } else {
                    this.z = null;
                    this.x = null;
                }
                view = this.x;
                if (view != null) {
                    view.setOnClickListener(this.d);
                }
                imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
                textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
                if (imageView8 != null) {
                    imageView8.setImageDrawable(resources.getDrawable(i, context.getTheme()));
                    this.w = imageView8;
                    this.y = null;
                } else if (textView2 != null) {
                    textView2.setTypeface(typefaceA);
                    this.y = textView2;
                    this.w = textView2;
                } else {
                    this.y = null;
                    this.w = null;
                }
                view2 = this.w;
                if (view2 != null) {
                    view2.setOnClickListener(this.d);
                }
                imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
                this.A = imageView9;
                if (imageView9 != null) {
                    imageView9.setOnClickListener(this.d);
                }
                imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
                this.B = imageView10;
                if (imageView10 != null) {
                    imageView10.setOnClickListener(this.d);
                }
                this.E1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                this.F1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                imageView11 = (ImageView) findViewById(R.id.exo_vr);
                this.f1 = imageView11;
                if (imageView11 != null) {
                    imageView11.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
                    n(imageView11, false);
                }
                n1a0 n1a0Var2 = new n1a0(this);
                this.f45391a = n1a0Var2;
                n1a0Var2.D = z;
                e1a0 e1a0Var2 = new e1a0(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
                this.m = e1a0Var2;
                this.s = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
                RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                this.l = recyclerView2;
                recyclerView2.setAdapter(e1a0Var2);
                recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
                PopupWindow popupWindow2 = new PopupWindow((View) recyclerView2, -2, -2, true);
                this.r = popupWindow2;
                popupWindow2.setOnDismissListener(this.d);
                this.h2 = true;
                this.q = new psc(getResources());
                this.I1 = resources.getDrawable(i16, context.getTheme());
                this.J1 = resources.getDrawable(i17, context.getTheme());
                this.K1 = resources.getString(R.string.exo_controls_cc_enabled_description);
                this.L1 = resources.getString(R.string.exo_controls_cc_disabled_description);
                this.o = new y0a0(this, (byte) 1);
                this.p = new y0a0(this, (byte) 0);
                this.n = new b1a0(this, resources.getStringArray(R.array.exo_controls_playback_speeds), i2);
                this.u1 = resources.getDrawable(i20, context.getTheme());
                this.v1 = resources.getDrawable(i6, context.getTheme());
                this.M1 = resources.getDrawable(i3, context.getTheme());
                this.N1 = resources.getDrawable(i8, context.getTheme());
                this.w1 = resources.getDrawable(i9, context.getTheme());
                this.x1 = resources.getDrawable(i10, context.getTheme());
                this.y1 = resources.getDrawable(i11, context.getTheme());
                this.C1 = resources.getDrawable(i12, context.getTheme());
                this.D1 = resources.getDrawable(i18, context.getTheme());
                this.O1 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
                this.P1 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
                this.z1 = resources.getString(R.string.exo_controls_repeat_off_description);
                this.A1 = resources.getString(R.string.exo_controls_repeat_one_description);
                this.B1 = resources.getString(R.string.exo_controls_repeat_all_description);
                this.G1 = resources.getString(R.string.exo_controls_shuffle_on_description);
                this.H1 = resources.getString(R.string.exo_controls_shuffle_off_description);
                n1a0Var2.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
                n1a0Var2.h(this.w, z7);
                n1a0Var2.h(this.x, z8);
                n1a0Var2.h(imageView5, z6);
                n1a0Var2.h(imageView6, z5);
                n1a0Var2.h(imageView10, z4);
                n1a0Var2.h(this.g1, z3);
                n1a0Var2.h(imageView11, z2);
                if (this.b2 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                n1a0Var2.h(imageView9, z9);
                addOnLayoutChangeListener(new g14(this, (byte) 2));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            cls = null;
        }
        this.h = cls;
        this.i = method3;
        this.j = method4;
        this.m1 = (TextView) findViewById(R.id.exo_duration);
        this.n1 = (TextView) findViewById(R.id.exo_position);
        imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.g1 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.d);
        }
        imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.h1 = imageView2;
        byte b2 = 15;
        l910Var = new l910(this, b2);
        if (imageView2 == null) {
            i19 = 8;
        } else {
            i19 = 8;
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(l910Var);
        }
        imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.i1 = imageView3;
        l910Var2 = new l910(this, b2);
        if (imageView3 != null) {
            imageView3.setVisibility(i19);
            imageView3.setOnClickListener(l910Var2);
        }
        viewFindViewById = findViewById(R.id.exo_settings);
        this.j1 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.d);
        }
        viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.k1 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.d);
        }
        viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.l1 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.d);
        }
        zxjVar = (zxj) findViewById(R.id.exo_progress);
        viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (zxjVar != null) {
            if (viewFindViewById4 != null) {
                zxjVar = new zxj(context, attributeSet);
                zxjVar.setId(R.id.exo_progress);
                zxjVar.setLayoutParams(viewFindViewById4.getLayoutParams());
                ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4.getParent();
                int iIndexOfChild2 = viewGroup2.indexOfChild(viewFindViewById4);
                viewGroup2.removeView(viewFindViewById4);
                viewGroup2.addView(zxjVar, iIndexOfChild2);
                this.o1 = zxjVar;
            } else {
                wm30Var = null;
                this.o1 = null;
                zxjVar = null;
            }
            if (zxjVar != null) {
                z0a0 z0a0Var3 = this.d;
                z0a0Var3.getClass();
                zxjVar.x.add(z0a0Var3);
            }
            this.c = vtt0.n(wm30Var);
            resources = context.getResources();
            this.b = resources;
            imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
            this.v = imageView4;
            if (imageView4 != null) {
                imageView4.setOnClickListener(this.d);
            }
            imageView5 = (ImageView) findViewById(R.id.exo_prev);
            this.t = imageView5;
            if (imageView5 != null) {
                imageView5.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
                imageView5.setOnClickListener(this.d);
            }
            imageView6 = (ImageView) findViewById(R.id.exo_next);
            this.u = imageView6;
            if (imageView6 != null) {
                imageView6.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
                imageView6.setOnClickListener(this.d);
            }
            typefaceA = itf0.a(R.font.roboto_medium_numbers, context);
            imageView7 = (ImageView) findViewById(R.id.exo_rew);
            textView = (TextView) findViewById(R.id.exo_rew_with_amount);
            if (imageView7 != null) {
                imageView7.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
                this.x = imageView7;
                this.z = null;
            } else if (textView != null) {
                textView.setTypeface(typefaceA);
                this.z = textView;
                this.x = textView;
            } else {
                this.z = null;
                this.x = null;
            }
            view = this.x;
            if (view != null) {
                view.setOnClickListener(this.d);
            }
            imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
            textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
            if (imageView8 != null) {
                imageView8.setImageDrawable(resources.getDrawable(i, context.getTheme()));
                this.w = imageView8;
                this.y = null;
            } else if (textView2 != null) {
                textView2.setTypeface(typefaceA);
                this.y = textView2;
                this.w = textView2;
            } else {
                this.y = null;
                this.w = null;
            }
            view2 = this.w;
            if (view2 != null) {
                view2.setOnClickListener(this.d);
            }
            imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
            this.A = imageView9;
            if (imageView9 != null) {
                imageView9.setOnClickListener(this.d);
            }
            imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
            this.B = imageView10;
            if (imageView10 != null) {
                imageView10.setOnClickListener(this.d);
            }
            this.E1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
            this.F1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
            imageView11 = (ImageView) findViewById(R.id.exo_vr);
            this.f1 = imageView11;
            if (imageView11 != null) {
                imageView11.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
                n(imageView11, false);
            }
            n1a0 n1a0Var3 = new n1a0(this);
            this.f45391a = n1a0Var3;
            n1a0Var3.D = z;
            e1a0 e1a0Var3 = new e1a0(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
            this.m = e1a0Var3;
            this.s = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
            RecyclerView recyclerView3 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
            this.l = recyclerView3;
            recyclerView3.setAdapter(e1a0Var3);
            recyclerView3.setLayoutManager(new LinearLayoutManager(getContext()));
            PopupWindow popupWindow3 = new PopupWindow((View) recyclerView3, -2, -2, true);
            this.r = popupWindow3;
            popupWindow3.setOnDismissListener(this.d);
            this.h2 = true;
            this.q = new psc(getResources());
            this.I1 = resources.getDrawable(i16, context.getTheme());
            this.J1 = resources.getDrawable(i17, context.getTheme());
            this.K1 = resources.getString(R.string.exo_controls_cc_enabled_description);
            this.L1 = resources.getString(R.string.exo_controls_cc_disabled_description);
            this.o = new y0a0(this, (byte) 1);
            this.p = new y0a0(this, (byte) 0);
            this.n = new b1a0(this, resources.getStringArray(R.array.exo_controls_playback_speeds), i2);
            this.u1 = resources.getDrawable(i20, context.getTheme());
            this.v1 = resources.getDrawable(i6, context.getTheme());
            this.M1 = resources.getDrawable(i3, context.getTheme());
            this.N1 = resources.getDrawable(i8, context.getTheme());
            this.w1 = resources.getDrawable(i9, context.getTheme());
            this.x1 = resources.getDrawable(i10, context.getTheme());
            this.y1 = resources.getDrawable(i11, context.getTheme());
            this.C1 = resources.getDrawable(i12, context.getTheme());
            this.D1 = resources.getDrawable(i18, context.getTheme());
            this.O1 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
            this.P1 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
            this.z1 = resources.getString(R.string.exo_controls_repeat_off_description);
            this.A1 = resources.getString(R.string.exo_controls_repeat_one_description);
            this.B1 = resources.getString(R.string.exo_controls_repeat_all_description);
            this.G1 = resources.getString(R.string.exo_controls_shuffle_on_description);
            this.H1 = resources.getString(R.string.exo_controls_shuffle_off_description);
            n1a0Var3.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
            n1a0Var3.h(this.w, z7);
            n1a0Var3.h(this.x, z8);
            n1a0Var3.h(imageView5, z6);
            n1a0Var3.h(imageView6, z5);
            n1a0Var3.h(imageView10, z4);
            n1a0Var3.h(this.g1, z3);
            n1a0Var3.h(imageView11, z2);
            if (this.b2 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            n1a0Var3.h(imageView9, z9);
            addOnLayoutChangeListener(new g14(this, (byte) 2));
        }
        this.o1 = zxjVar;
        wm30Var = null;
        if (zxjVar != null) {
            z0a0 z0a0Var4 = this.d;
            z0a0Var4.getClass();
            zxjVar.x.add(z0a0Var4);
        }
        this.c = vtt0.n(wm30Var);
        resources = context.getResources();
        this.b = resources;
        imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.v = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.d);
        }
        imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.t = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(i14, context.getTheme()));
            imageView5.setOnClickListener(this.d);
        }
        imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.u = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
            imageView6.setOnClickListener(this.d);
        }
        typefaceA = itf0.a(R.font.roboto_medium_numbers, context);
        imageView7 = (ImageView) findViewById(R.id.exo_rew);
        textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i15, context.getTheme()));
            this.x = imageView7;
            this.z = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceA);
            this.z = textView;
            this.x = textView;
        } else {
            this.z = null;
            this.x = null;
        }
        view = this.x;
        if (view != null) {
            view.setOnClickListener(this.d);
        }
        imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i, context.getTheme()));
            this.w = imageView8;
            this.y = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceA);
            this.y = textView2;
            this.w = textView2;
        } else {
            this.y = null;
            this.w = null;
        }
        view2 = this.w;
        if (view2 != null) {
            view2.setOnClickListener(this.d);
        }
        imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.A = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.d);
        }
        imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.B = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.d);
        }
        this.E1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.F1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.f1 = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
            n(imageView11, false);
        }
        n1a0 n1a0Var4 = new n1a0(this);
        this.f45391a = n1a0Var4;
        n1a0Var4.D = z;
        e1a0 e1a0Var4 = new e1a0(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.m = e1a0Var4;
        this.s = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView4 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.l = recyclerView4;
        recyclerView4.setAdapter(e1a0Var4);
        recyclerView4.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow4 = new PopupWindow((View) recyclerView4, -2, -2, true);
        this.r = popupWindow4;
        popupWindow4.setOnDismissListener(this.d);
        this.h2 = true;
        this.q = new psc(getResources());
        this.I1 = resources.getDrawable(i16, context.getTheme());
        this.J1 = resources.getDrawable(i17, context.getTheme());
        this.K1 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.L1 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.o = new y0a0(this, (byte) 1);
        this.p = new y0a0(this, (byte) 0);
        this.n = new b1a0(this, resources.getStringArray(R.array.exo_controls_playback_speeds), i2);
        this.u1 = resources.getDrawable(i20, context.getTheme());
        this.v1 = resources.getDrawable(i6, context.getTheme());
        this.M1 = resources.getDrawable(i3, context.getTheme());
        this.N1 = resources.getDrawable(i8, context.getTheme());
        this.w1 = resources.getDrawable(i9, context.getTheme());
        this.x1 = resources.getDrawable(i10, context.getTheme());
        this.y1 = resources.getDrawable(i11, context.getTheme());
        this.C1 = resources.getDrawable(i12, context.getTheme());
        this.D1 = resources.getDrawable(i18, context.getTheme());
        this.O1 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.P1 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.z1 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.A1 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.B1 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.G1 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.H1 = resources.getString(R.string.exo_controls_shuffle_off_description);
        n1a0Var4.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        n1a0Var4.h(this.w, z7);
        n1a0Var4.h(this.x, z8);
        n1a0Var4.h(imageView5, z6);
        n1a0Var4.h(imageView6, z5);
        n1a0Var4.h(imageView10, z4);
        n1a0Var4.h(this.g1, z3);
        n1a0Var4.h(imageView11, z2);
        if (this.b2 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        n1a0Var4.h(imageView9, z9);
        addOnLayoutChangeListener(new g14(this, (byte) 2));
    }

    public static boolean b(my90 my90Var, Timeline$Window timeline$Window) {
        bmq0 bmq0VarN;
        int iO;
        ulo uloVar = (ulo) my90Var;
        if (!uloVar.w(17) || (iO = (bmq0VarN = uloVar.n()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i = 0; i < iO; i++) {
            if (bmq0VarN.m(i, timeline$Window, 0L).l == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        my90 my90Var = this.Q1;
        if (my90Var == null || !((ulo) my90Var).w(13)) {
            return;
        }
        ulo uloVar = (ulo) this.Q1;
        uloVar.c0();
        zx90 zx90Var = new zx90(f, uloVar.n0.o.b);
        uloVar.c0();
        if (uloVar.n0.o.equals(zx90Var)) {
            return;
        }
        yx90 yx90VarG = uloVar.n0.g(zx90Var);
        uloVar.J++;
        uloVar.l.g.c(4, zx90Var).b();
        uloVar.a0(yx90VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    public final boolean c(KeyEvent keyEvent) {
        ulo uloVar;
        int keyCode = keyEvent.getKeyCode();
        my90 my90Var = this.Q1;
        if (my90Var == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                ulo uloVar2 = (ulo) my90Var;
                if (uloVar2.s() != 4 && uloVar2.w(12)) {
                    uloVar2.c0();
                    long jL = uloVar2.l() + ((long) uloVar2.k0);
                    long jQ = uloVar2.q();
                    if (jQ != -9223372036854775807L) {
                        jL = Math.min(jL, jQ);
                    }
                    uloVar2.J(Math.max(jL, 0L));
                }
            } else if (keyCode == 89) {
                ulo uloVar3 = (ulo) my90Var;
                if (uloVar3.w(11)) {
                    uloVar3.c0();
                    long jL2 = uloVar3.l() + (-uloVar3.j0);
                    long jQ2 = uloVar3.q();
                    if (jQ2 != -9223372036854775807L) {
                        jL2 = Math.min(jL2, jQ2);
                    }
                    uloVar3.J(Math.max(jL2, 0L));
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 || keyCode == 85) {
                        if (vtt0.V(my90Var, this.V1)) {
                            vtt0.E(my90Var);
                        } else {
                            uloVar = (ulo) my90Var;
                            if (uloVar.w(1)) {
                                uloVar.P(false);
                            }
                        }
                    } else if (keyCode == 87) {
                        ulo uloVar4 = (ulo) my90Var;
                        if (uloVar4.w(9)) {
                            uloVar4.K();
                        }
                    } else if (keyCode == 88) {
                        ulo uloVar5 = (ulo) my90Var;
                        if (uloVar5.w(7)) {
                            uloVar5.L();
                        }
                    } else if (keyCode == 126) {
                        vtt0.E(my90Var);
                    } else if (keyCode == 127) {
                        String str = vtt0.f38024a;
                        ulo uloVar6 = (ulo) my90Var;
                        if (uloVar6.w(1)) {
                            uloVar6.P(false);
                        }
                    }
                }
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode != 79) {
                    if (vtt0.V(my90Var, this.V1)) {
                        vtt0.E(my90Var);
                    } else {
                        uloVar = (ulo) my90Var;
                        if (uloVar.w(1)) {
                            uloVar.P(false);
                        }
                    }
                } else if (vtt0.V(my90Var, this.V1)) {
                    vtt0.E(my90Var);
                } else {
                    uloVar = (ulo) my90Var;
                    if (uloVar.w(1)) {
                        uloVar.P(false);
                    }
                }
            }
        }
        return true;
    }

    public final void d(yge0 yge0Var, View view) {
        this.l.setAdapter(yge0Var);
        u();
        this.h2 = false;
        PopupWindow popupWindow = this.r;
        popupWindow.dismiss();
        this.h2 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.s;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final rcf0 e(rds0 rds0Var, int i) {
        e3c.s(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        b4x b4xVar = rds0Var.f30305a;
        int i3 = 0;
        for (int i4 = 0; i4 < b4xVar.size(); i4++) {
            qds0 qds0Var = (qds0) b4xVar.get(i4);
            if (qds0Var.b.c == i) {
                for (int i5 = 0; i5 < qds0Var.f28550a; i5++) {
                    if (qds0Var.a(i5)) {
                        b bVar = qds0Var.b.d[i5];
                        if ((bVar.e & 2) == 0) {
                            g1a0 g1a0Var = new g1a0(rds0Var, i4, i5, this.q.i(bVar));
                            int i6 = i3 + 1;
                            int iE = r3x.e(objArrCopyOf.length, i6);
                            if (iE > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
                            }
                            objArrCopyOf[i3] = g1a0Var;
                            i3 = i6;
                        }
                    }
                }
            }
        }
        return b4x.k(i3, objArrCopyOf);
    }

    public final void f() {
        n1a0 n1a0Var = this.f45391a;
        byte b = n1a0Var.A;
        if (b == 3 || b == 2) {
            return;
        }
        n1a0Var.f();
        if (!n1a0Var.D) {
            n1a0Var.i(2);
        } else if (n1a0Var.A == 1) {
            n1a0Var.n.start();
        } else {
            n1a0Var.o.start();
        }
    }

    public final boolean g(my90 my90Var) {
        Class cls;
        return (my90Var == null || (cls = this.h) == null || !cls.isAssignableFrom(my90Var.getClass())) ? false : true;
    }

    public my90 getPlayer() {
        return this.Q1;
    }

    public int getRepeatToggleModes() {
        return this.b2;
    }

    public boolean getShowShuffleButton() {
        return this.f45391a.b(this.B);
    }

    public boolean getShowSubtitleButton() {
        return this.f45391a.b(this.g1);
    }

    public int getShowTimeoutMs() {
        return this.Y1;
    }

    public boolean getShowVrButton() {
        return this.f45391a.b(this.f1);
    }

    public final boolean h(my90 my90Var) {
        Class cls;
        return (my90Var == null || (cls = this.e) == null || !cls.isAssignableFrom(my90Var.getClass())) ? false : true;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        n1a0 n1a0Var = this.f45391a;
        return n1a0Var.A == 0 && n1a0Var.f22741a.k();
    }

    public final boolean j(my90 my90Var) {
        try {
            if (h(my90Var)) {
                Method method = this.g;
                method.getClass();
                Object objInvoke = method.invoke(my90Var, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (g(my90Var)) {
                Method method2 = this.j;
                method2.getClass();
                Object objInvoke2 = method2.invoke(my90Var, null);
                objInvoke2.getClass();
                if (((Boolean) objInvoke2).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalAccessException e) {
            e = e;
            ohq.p(e);
            return false;
        } catch (InvocationTargetException e2) {
            e = e2;
            ohq.p(e);
            return false;
        }
    }

    public final boolean k() {
        return getVisibility() == 0;
    }

    public final void l(my90 my90Var, long j) {
        if (this.W1) {
            ulo uloVar = (ulo) my90Var;
            if (uloVar.w(17) && uloVar.w(10)) {
                bmq0 bmq0VarN = uloVar.n();
                int iO = bmq0VarN.o();
                int i = 0;
                while (true) {
                    long jY = vtt0.Y(bmq0VarN.m(i, this.s1, 0L).l);
                    if (j < jY) {
                        break;
                    }
                    if (i == iO - 1) {
                        j = jY;
                        break;
                    } else {
                        j -= jY;
                        i++;
                    }
                }
                uloVar.I(i, j, false);
            }
        } else {
            ulo uloVar2 = (ulo) my90Var;
            if (uloVar2.w(5)) {
                uloVar2.J(j);
            }
        }
        s();
    }

    public final void m() {
        q();
        p();
        t();
        v();
        x();
        r();
        w();
    }

    public final void n(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.E1 : this.F1);
    }

    public final void o(boolean z) {
        if (this.R1 == z) {
            return;
        }
        this.R1 = z;
        String str = this.P1;
        Drawable drawable = this.N1;
        String str2 = this.O1;
        Drawable drawable2 = this.M1;
        ImageView imageView = this.h1;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.i1;
        if (imageView2 == null) {
            return;
        }
        if (z) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n1a0 n1a0Var = this.f45391a;
        n1a0Var.f22741a.addOnLayoutChangeListener(n1a0Var.y);
        this.S1 = true;
        if (i()) {
            n1a0Var.g();
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n1a0 n1a0Var = this.f45391a;
        n1a0Var.f22741a.removeOnLayoutChangeListener(n1a0Var.y);
        this.S1 = false;
        removeCallbacks(this.t1);
        n1a0Var.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i3, int i4, int i5) {
        super.onLayout(z, i, i3, i4, i5);
        View view = this.f45391a.b;
        if (view != null) {
            view.layout(0, 0, i4 - i, i5 - i3);
        }
    }

    public final void p() {
        boolean zW;
        boolean zW2;
        boolean zW3;
        boolean zW4;
        boolean zW5;
        long j;
        long j2;
        if (k() && this.S1) {
            my90 my90Var = this.Q1;
            if (my90Var != null) {
                zW = (this.U1 && b(my90Var, this.s1)) ? ((ulo) my90Var).w(10) : ((ulo) my90Var).w(5);
                ulo uloVar = (ulo) my90Var;
                zW3 = uloVar.w(7);
                zW4 = uloVar.w(11);
                zW5 = uloVar.w(12);
                zW2 = uloVar.w(9);
            } else {
                zW = false;
                zW2 = false;
                zW3 = false;
                zW4 = false;
                zW5 = false;
            }
            Resources resources = this.b;
            View view = this.x;
            if (zW4) {
                my90 my90Var2 = this.Q1;
                if (my90Var2 != null) {
                    ulo uloVar2 = (ulo) my90Var2;
                    uloVar2.c0();
                    j2 = uloVar2.j0;
                } else {
                    j2 = 5000;
                }
                int i = (int) (j2 / 1000);
                TextView textView = this.z;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            View view2 = this.w;
            if (zW5) {
                my90 my90Var3 = this.Q1;
                if (my90Var3 != null) {
                    ulo uloVar3 = (ulo) my90Var3;
                    uloVar3.c0();
                    j = uloVar3.k0;
                } else {
                    j = 15000;
                }
                int i3 = (int) (j / 1000);
                TextView textView2 = this.y;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i3));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i3, Integer.valueOf(i3)));
                }
            }
            n(this.t, zW3);
            n(view, zW4);
            n(view2, zW5);
            n(this.u, zW2);
            zxj zxjVar = this.o1;
            if (zxjVar != null) {
                zxjVar.setEnabled(zW);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    public final void q() {
        ImageView imageView;
        boolean z;
        if (k() && this.S1 && (imageView = this.v) != null) {
            boolean zV = vtt0.V(this.Q1, this.V1);
            Drawable drawable = zV ? this.u1 : this.v1;
            int i = zV ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.b.getString(i));
            my90 my90Var = this.Q1;
            boolean z2 = false;
            if (my90Var != null) {
                ulo uloVar = (ulo) my90Var;
                int iS = uloVar.s();
                if (uloVar.w(16)) {
                    bmq0 bmq0VarN = uloVar.n();
                    if ((bmq0VarN.p() ? null : bmq0VarN.m(uloVar.j(), uloVar.f35882a, 0L).b) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                boolean zW = uloVar.w(1);
                boolean z3 = iS == 1 && uloVar.w(2);
                boolean z4 = iS == 4 && uloVar.w(4);
                if (z && (zW || z3 || z4)) {
                    z2 = true;
                }
            }
            n(imageView, z2);
        }
    }

    public final void r() {
        b1a0 b1a0Var;
        my90 my90Var = this.Q1;
        if (my90Var == null) {
            return;
        }
        ulo uloVar = (ulo) my90Var;
        uloVar.c0();
        float f = uloVar.n0.o.f45148a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i3 = 0;
        while (true) {
            b1a0Var = this.n;
            float[] fArr = b1a0Var.e;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i3 = i;
                f2 = fAbs;
            }
            i++;
        }
        b1a0Var.f = i3;
        String str = b1a0Var.d[i3];
        e1a0 e1a0Var = this.m;
        ((String[]) e1a0Var.f)[0] = str;
        n(this.j1, e1a0Var.A(1) || e1a0Var.A(0));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public final void s() {
        long jG;
        long jF;
        if (k() && this.S1) {
            my90 my90Var = this.Q1;
            if (my90Var != null) {
                ulo uloVar = (ulo) my90Var;
                if (uloVar.w(16)) {
                    long j = this.g2;
                    uloVar.c0();
                    jG = uloVar.g(uloVar.n0) + j;
                    jF = uloVar.f() + this.g2;
                } else {
                    jG = 0;
                    jF = 0;
                }
            } else {
                jG = 0;
                jF = 0;
            }
            TextView textView = this.n1;
            if (textView != null && !this.X1) {
                textView.setText(vtt0.B(this.p1, this.q1, jG));
            }
            zxj zxjVar = this.o1;
            if (zxjVar != null) {
                zxjVar.setPosition(jG);
                if (j(my90Var)) {
                    jF = jG;
                }
                zxjVar.setBufferedPosition(jF);
            }
            wss wssVar = this.t1;
            removeCallbacks(wssVar);
            int iS = my90Var == null ? 1 : ((ulo) my90Var).s();
            if (my90Var != null) {
                ulo uloVar2 = (ulo) my90Var;
                if (uloVar2.y()) {
                    long jMin = Math.min(zxjVar != null ? zxjVar.getPreferredUpdateDelay() : 1000L, 1000 - (jG % 1000));
                    uloVar2.c0();
                    float f = uloVar2.n0.o.f45148a;
                    postDelayed(wssVar, vtt0.j(f > 0.0f ? (long) (jMin / f) : 1000L, this.a2, 1000L));
                    return;
                }
            }
            if (iS == 4 || iS == 1) {
                return;
            }
            postDelayed(wssVar, 1000L);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f45391a.D = z;
    }

    public void setMediaRouteButtonViewProvider(eku0 eku0Var) {
        View viewFindViewById = findViewById(R.id.exo_media_route_button_placeholder);
        if (viewFindViewById == null) {
            jf4.n("The media route button placeholder is missing.");
            return;
        }
        if (eku0Var == null) {
            viewFindViewById.setVisibility(8);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
        if (viewGroup == null) {
            jf4.n("The media route button placeholder has no parent view.");
            return;
        }
        ig00 view = eku0Var.getView();
        ouu ouuVar = new ouu(this, viewFindViewById, viewGroup);
        Handler handler = this.c;
        Objects.requireNonNull(handler);
        view.a(new lfr((Object) view, (Object) ouuVar, (byte) 0), new j44(handler, (byte) 1));
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(a1a0 a1a0Var) {
        boolean z = a1a0Var != null;
        ImageView imageView = this.h1;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = a1a0Var != null;
        ImageView imageView2 = this.i1;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(my90 my90Var) {
        x0x.K(Looper.myLooper() == Looper.getMainLooper());
        x0x.A(my90Var == null || ((ulo) my90Var).t == Looper.getMainLooper());
        my90 my90Var2 = this.Q1;
        if (my90Var2 == my90Var) {
            return;
        }
        z0a0 z0a0Var = this.d;
        if (my90Var2 != null) {
            ((ulo) my90Var2).G(z0a0Var);
        }
        this.Q1 = my90Var;
        if (my90Var != null) {
            ((ulo) my90Var).a(z0a0Var);
        }
        m();
    }

    public void setRepeatToggleModes(int i) {
        this.b2 = i;
        my90 my90Var = this.Q1;
        if (my90Var != null && ((ulo) my90Var).w(15)) {
            ulo uloVar = (ulo) this.Q1;
            uloVar.c0();
            int i3 = uloVar.H;
            if (i == 0 && i3 != 0) {
                ((ulo) this.Q1).Q(0);
            } else if (i == 1 && i3 == 2) {
                ((ulo) this.Q1).Q(1);
            } else if (i == 2 && i3 == 1) {
                ((ulo) this.Q1).Q(2);
            }
        }
        this.f45391a.h(this.A, i != 0);
        t();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f45391a.h(this.w, z);
        p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.U1 = z;
        w();
    }

    public void setShowNextButton(boolean z) {
        this.f45391a.h(this.u, z);
        p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.V1 = z;
        q();
    }

    public void setShowPreviousButton(boolean z) {
        this.f45391a.h(this.t, z);
        p();
    }

    public void setShowRewindButton(boolean z) {
        this.f45391a.h(this.x, z);
        p();
    }

    public void setShowShuffleButton(boolean z) {
        this.f45391a.h(this.B, z);
        v();
    }

    public void setShowSubtitleButton(boolean z) {
        this.f45391a.h(this.g1, z);
    }

    public void setShowTimeoutMs(int i) {
        this.Y1 = i;
        if (i()) {
            this.f45391a.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.f45391a.h(this.f1, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.a2 = vtt0.i(i, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.Z1 = z;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f1;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            n(imageView, onClickListener != null);
        }
    }

    public final void t() {
        ImageView imageView;
        if (k() && this.S1 && (imageView = this.A) != null) {
            if (this.b2 == 0) {
                n(imageView, false);
                return;
            }
            my90 my90Var = this.Q1;
            String str = this.z1;
            Drawable drawable = this.w1;
            if (my90Var != null) {
                ulo uloVar = (ulo) my90Var;
                if (uloVar.w(15)) {
                    n(imageView, true);
                    uloVar.c0();
                    int i = uloVar.H;
                    if (i == 0) {
                        imageView.setImageDrawable(drawable);
                        imageView.setContentDescription(str);
                        return;
                    } else if (i == 1) {
                        imageView.setImageDrawable(this.x1);
                        imageView.setContentDescription(this.A1);
                        return;
                    } else {
                        if (i != 2) {
                            return;
                        }
                        imageView.setImageDrawable(this.y1);
                        imageView.setContentDescription(this.B1);
                        return;
                    }
                }
            }
            n(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void u() {
        RecyclerView recyclerView = this.l;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.s;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.r;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void v() {
        ImageView imageView;
        if (k() && this.S1 && (imageView = this.B) != null) {
            my90 my90Var = this.Q1;
            if (!this.f45391a.b(imageView)) {
                n(imageView, false);
                return;
            }
            String str = this.H1;
            Drawable drawable = this.D1;
            if (my90Var != null) {
                ulo uloVar = (ulo) my90Var;
                if (uloVar.w(14)) {
                    n(imageView, true);
                    uloVar.c0();
                    if (uloVar.I) {
                        drawable = this.C1;
                    }
                    imageView.setImageDrawable(drawable);
                    uloVar.c0();
                    if (uloVar.I) {
                        str = this.G1;
                    }
                    imageView.setContentDescription(str);
                    return;
                }
            }
            n(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.amq0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r2v11, types: [a.bmq0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [a.bmq0] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16, types: [a.uo] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void w() {
        boolean z;
        long j;
        long jM;
        int i;
        long jY;
        ?? r24;
        boolean z2;
        boolean[] zArr;
        boolean z3;
        ?? r25;
        my90 my90Var = this.Q1;
        if (my90Var == null) {
            return;
        }
        boolean z4 = this.U1;
        Timeline$Window timeline$Window = this.s1;
        boolean z5 = false;
        boolean z6 = true;
        this.W1 = z4 && b(my90Var, timeline$Window);
        long j2 = 0;
        this.g2 = 0L;
        ulo uloVar = (ulo) my90Var;
        bmq0 bmq0VarN = uloVar.w(17) ? uloVar.n() : bmq0.f2849a;
        if (bmq0VarN.p()) {
            z = true;
            if (uloVar.w(16)) {
                bmq0 bmq0VarN2 = uloVar.n();
                if (bmq0VarN2.p()) {
                    jY = -9223372036854775807L;
                    j = 0;
                } else {
                    j = 0;
                    jY = vtt0.Y(bmq0VarN2.m(uloVar.j(), uloVar.f35882a, 0L).l);
                }
                if (jY != -9223372036854775807L) {
                    jM = vtt0.M(jY);
                }
                i = 0;
            } else {
                j = 0;
            }
            jM = j;
            i = 0;
        } else {
            int iJ = uloVar.j();
            boolean z7 = this.W1;
            int i3 = z7 ? 0 : iJ;
            int iO = z7 ? bmq0VarN.o() - 1 : iJ;
            i = 0;
            long j3 = 0;
            ?? r2 = bmq0VarN;
            while (i3 <= iO) {
                long j4 = -9223372036854775807L;
                if (i3 == iJ) {
                    this.g2 = vtt0.Y(j3);
                }
                r2.n(i3, timeline$Window);
                if (timeline$Window.l == -9223372036854775807L) {
                    x0x.K(this.W1 ^ z6);
                    break;
                }
                int i4 = timeline$Window.m;
                ?? r3 = r2;
                boolean z8 = z5;
                while (i4 <= timeline$Window.n) {
                    ?? r10 = this.r1;
                    r3.f(i4, r10, z8);
                    r10.getClass();
                    long j5 = j4;
                    int i5 = uo.c.f35986a;
                    ?? r4 = r3;
                    for (?? r5 = z8; r5 < i5; r5++) {
                        r10.d(r5);
                        long j6 = j2;
                        long j7 = r10.e;
                        if (j7 >= j6) {
                            long[] jArr = this.c2;
                            if (i == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.c2 = Arrays.copyOf(jArr, length);
                                this.d2 = Arrays.copyOf(this.d2, length);
                            }
                            this.c2[i] = vtt0.Y(j7 + j3);
                            boolean[] zArr2 = this.d2;
                            so soVarA = uo.c.a(r5);
                            int i6 = soVarA.f32518a;
                            if (i6 == -1) {
                                zArr = zArr2;
                                r25 = r4;
                                z2 = true;
                            } else {
                                int i7 = 0;
                                ?? r6 = r4;
                                while (true) {
                                    if (i7 >= i6) {
                                        zArr = zArr2;
                                        r24 = r6;
                                        z2 = true;
                                        z3 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i8 = soVarA.d[i7];
                                    r25 = r6;
                                    z2 = true;
                                    if (i8 != 0 && i8 != 1) {
                                        i7++;
                                        zArr2 = zArr;
                                        r6 = r25;
                                    }
                                }
                                zArr[i] = z3 ^ z2;
                                i++;
                            }
                            z3 = z2;
                            r24 = r25;
                            zArr[i] = z3 ^ z2;
                            i++;
                        } else {
                            r24 = r4;
                            z2 = z6;
                        }
                        z6 = z2;
                        j2 = j6;
                        iJ = iJ;
                        r4 = r24;
                    }
                    i4++;
                    j4 = j5;
                    r3 = r4;
                    z8 = false;
                }
                j3 += timeline$Window.l;
                i3++;
                z6 = z6;
                r2 = r3;
                z5 = false;
            }
            z = z6;
            jM = j3;
        }
        long jY2 = vtt0.Y(jM);
        TextView textView = this.m1;
        if (textView != null) {
            textView.setText(vtt0.B(this.p1, this.q1, jY2));
        }
        zxj zxjVar = this.o1;
        if (zxjVar != null) {
            zxjVar.setDuration(jY2);
            long[] jArr2 = this.e2;
            int length2 = jArr2.length;
            int i9 = i + length2;
            long[] jArr3 = this.c2;
            if (i9 > jArr3.length) {
                this.c2 = Arrays.copyOf(jArr3, i9);
                this.d2 = Arrays.copyOf(this.d2, i9);
            }
            System.arraycopy(jArr2, 0, this.c2, i, length2);
            System.arraycopy(this.f2, 0, this.d2, i, length2);
            long[] jArr4 = this.c2;
            boolean[] zArr3 = this.d2;
            if (i9 != 0 && (jArr4 == null || zArr3 == null)) {
                z = false;
            }
            x0x.A(z);
            zxjVar.p1 = i9;
            zxjVar.q1 = jArr4;
            zxjVar.r1 = zArr3;
            zxjVar.e();
        }
        s();
    }

    public final void x() {
        y0a0 y0a0Var = this.o;
        y0a0Var.getClass();
        List list = Collections.EMPTY_LIST;
        y0a0Var.e = list;
        y0a0 y0a0Var2 = this.p;
        y0a0Var2.getClass();
        y0a0Var2.e = list;
        my90 my90Var = this.Q1;
        ImageView imageView = this.g1;
        if (my90Var != null && ((ulo) my90Var).w(30) && ((ulo) this.Q1).w(29)) {
            rds0 rds0VarO = ((ulo) this.Q1).o();
            rcf0 rcf0VarE = e(rds0VarO, 1);
            y0a0Var2.e = rcf0VarE;
            PlayerControlView playerControlView = y0a0Var2.h;
            my90 my90Var2 = playerControlView.Q1;
            e1a0 e1a0Var = playerControlView.m;
            my90Var2.getClass();
            scs0 scs0VarV = ((ulo) my90Var2).v();
            if (rcf0VarE.isEmpty()) {
                ((String[]) e1a0Var.f)[1] = playerControlView.getResources().getString(R.string.exo_track_selection_none);
            } else if (y0a0Var2.H(scs0VarV)) {
                for (int i = 0; i < rcf0VarE.d; i++) {
                    g1a0 g1a0Var = (g1a0) rcf0VarE.get(i);
                    if (g1a0Var.f10503a.e[g1a0Var.b]) {
                        ((String[]) e1a0Var.f)[1] = g1a0Var.c;
                        break;
                    }
                }
            } else {
                ((String[]) e1a0Var.f)[1] = playerControlView.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.f45391a.b(imageView)) {
                y0a0Var.I(e(rds0VarO, 3));
            } else {
                v3x v3xVar = b4x.b;
                y0a0Var.I(rcf0.e);
            }
        }
        n(imageView, y0a0Var.d() > 0);
        e1a0 e1a0Var2 = this.m;
        n(this.j1, e1a0Var2.A(1) || e1a0Var2.A(0));
    }

    public void setProgressUpdateListener(c1a0 c1a0Var) {
    }
}
