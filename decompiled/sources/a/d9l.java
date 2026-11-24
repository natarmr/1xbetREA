package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class d9l extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5706a;
    public final int b;
    public final int c;
    public final int d;
    public int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final a8z j;
    public final a8z k;
    public final a8z l;
    public final a8z m;
    public final a8z n;
    public final a8z o;
    public final a8z p;
    public final a8z q;
    public final a8z r;
    public int s;
    public final l7l t;
    public final x23 u;
    public boolean v;
    public boolean w;
    public boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9l(final Context context) {
        super(context, null, 0);
        final byte b = 0;
        this.f5706a = getResources().getDimensionPixelSize(R.dimen.size_216);
        this.b = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_28);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_108);
        this.f = getResources().getDimensionPixelSize(R.dimen.size_42);
        this.g = getResources().getDimensionPixelSize(R.dimen.space_24);
        this.h = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.i = getResources().getDimensionPixelSize(R.dimen.space_8);
        Function0 function0 = new Function0() { // from class: a.c9l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                d9l d9lVar = this;
                Context context2 = context;
                switch (b2) {
                    case 0:
                        o7l o7lVar = new o7l(context2);
                        d9lVar.addView(o7lVar);
                        o7lVar.setTag("RadiantSideTextView");
                        return o7lVar;
                    case 1:
                        o7l o7lVar2 = new o7l(context2);
                        d9lVar.addView(o7lVar2);
                        o7lVar2.setTag("DireSideTextView");
                        return o7lVar2;
                    case 2:
                        j8l j8lVar = new j8l(context2, true);
                        d9lVar.addView(j8lVar);
                        return j8lVar;
                    case 3:
                        j8l j8lVar2 = new j8l(context2, true);
                        d9lVar.addView(j8lVar2);
                        return j8lVar2;
                    case 4:
                        j8l j8lVar3 = new j8l(context2, true);
                        d9lVar.addView(j8lVar3);
                        return j8lVar3;
                    case 5:
                        j8l j8lVar4 = new j8l(context2, false);
                        d9lVar.addView(j8lVar4);
                        j8lVar4.setTag("RoshanTextView");
                        return j8lVar4;
                    case 6:
                        ImageView imageView = new ImageView(context2);
                        d9lVar.addView(imageView);
                        imageView.setTag("RadiantTeamIcon");
                        return imageView;
                    case 7:
                        ImageView imageView2 = new ImageView(context2);
                        d9lVar.addView(imageView2);
                        imageView2.setTag("DireTeamIcon");
                        return imageView2;
                    default:
                        ImageView imageView3 = new ImageView(context2);
                        hxm0.x(imageView3, context2.getResources().getDimensionPixelSize(R.dimen.corner_radius_16));
                        d9lVar.addView(imageView3);
                        imageView3.setTag("MapImageView");
                        return imageView3;
                }
            }
        };
        wez wezVar = wez.b;
        this.j = maz.a(wezVar, function0);
        final byte b2 = 1;
        this.k = maz.a(wezVar, new Function0() { // from class: a.c9l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                d9l d9lVar = this;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        o7l o7lVar = new o7l(context2);
                        d9lVar.addView(o7lVar);
                        o7lVar.setTag("RadiantSideTextView");
                        return o7lVar;
                    case 1:
                        o7l o7lVar2 = new o7l(context2);
                        d9lVar.addView(o7lVar2);
                        o7lVar2.setTag("DireSideTextView");
                        return o7lVar2;
                    case 2:
                        j8l j8lVar = new j8l(context2, true);
                        d9lVar.addView(j8lVar);
                        return j8lVar;
                    case 3:
                        j8l j8lVar2 = new j8l(context2, true);
                        d9lVar.addView(j8lVar2);
                        return j8lVar2;
                    case 4:
                        j8l j8lVar3 = new j8l(context2, true);
                        d9lVar.addView(j8lVar3);
                        return j8lVar3;
                    case 5:
                        j8l j8lVar4 = new j8l(context2, false);
                        d9lVar.addView(j8lVar4);
                        j8lVar4.setTag("RoshanTextView");
                        return j8lVar4;
                    case 6:
                        ImageView imageView = new ImageView(context2);
                        d9lVar.addView(imageView);
                        imageView.setTag("RadiantTeamIcon");
                        return imageView;
                    case 7:
                        ImageView imageView2 = new ImageView(context2);
                        d9lVar.addView(imageView2);
                        imageView2.setTag("DireTeamIcon");
                        return imageView2;
                    default:
                        ImageView imageView3 = new ImageView(context2);
                        hxm0.x(imageView3, context2.getResources().getDimensionPixelSize(R.dimen.corner_radius_16));
                        d9lVar.addView(imageView3);
                        imageView3.setTag("MapImageView");
                        return imageView3;
                }
            }
        });
        final byte b3 = 2;
        this.l = maz.a(wezVar, new Function0() { // from class: a.c9l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                d9l d9lVar = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        o7l o7lVar = new o7l(context2);
                        d9lVar.addView(o7lVar);
                        o7lVar.setTag("RadiantSideTextView");
                        return o7lVar;
                    case 1:
                        o7l o7lVar2 = new o7l(context2);
                        d9lVar.addView(o7lVar2);
                        o7lVar2.setTag("DireSideTextView");
                        return o7lVar2;
                    case 2:
                        j8l j8lVar = new j8l(context2, true);
                        d9lVar.addView(j8lVar);
                        return j8lVar;
                    case 3:
                        j8l j8lVar2 = new j8l(context2, true);
                        d9lVar.addView(j8lVar2);
                        return j8lVar2;
                    case 4:
                        j8l j8lVar3 = new j8l(context2, true);
                        d9lVar.addView(j8lVar3);
                        return j8lVar3;
                    case 5:
                        j8l j8lVar4 = new j8l(context2, false);
                        d9lVar.addView(j8lVar4);
                        j8lVar4.setTag("RoshanTextView");
                        return j8lVar4;
                    case 6:
                        ImageView imageView = new ImageView(context2);
                        d9lVar.addView(imageView);
                        imageView.setTag("RadiantTeamIcon");
                        return imageView;
                    case 7:
                        ImageView imageView2 = new ImageView(context2);
                        d9lVar.addView(imageView2);
                        imageView2.setTag("DireTeamIcon");
                        return imageView2;
                    default:
                        ImageView imageView3 = new ImageView(context2);
                        hxm0.x(imageView3, context2.getResources().getDimensionPixelSize(R.dimen.corner_radius_16));
                        d9lVar.addView(imageView3);
                        imageView3.setTag("MapImageView");
                        return imageView3;
                }
            }
        });
        final byte b4 = 3;
        this.m = maz.a(wezVar, new Function0() { // from class: a.c9l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                d9l d9lVar = this;
                Context context2 = context;
                switch (b5) {
                    case 0:
                        o7l o7lVar = new o7l(context2);
                        d9lVar.addView(o7lVar);
                        o7lVar.setTag("RadiantSideTextView");
                        return o7lVar;
                    case 1:
                        o7l o7lVar2 = new o7l(context2);
                        d9lVar.addView(o7lVar2);
                        o7lVar2.setTag("DireSideTextView");
                        return o7lVar2;
                    case 2:
                        j8l j8lVar = new j8l(context2, true);
                        d9lVar.addView(j8lVar);
                        return j8lVar;
                    case 3:
                        j8l j8lVar2 = new j8l(context2, true);
                        d9lVar.addView(j8lVar2);
                        return j8lVar2;
                    case 4:
                        j8l j8lVar3 = new j8l(context2, true);
                        d9lVar.addView(j8lVar3);
                        return j8lVar3;
                    case 5:
                        j8l j8lVar4 = new j8l(context2, false);
                        d9lVar.addView(j8lVar4);
                        j8lVar4.setTag("RoshanTextView");
                        return j8lVar4;
                    case 6:
                        ImageView imageView = new ImageView(context2);
                        d9lVar.addView(imageView);
                        imageView.setTag("RadiantTeamIcon");
                        return imageView;
                    case 7:
                        ImageView imageView2 = new ImageView(context2);
                        d9lVar.addView(imageView2);
                        imageView2.setTag("DireTeamIcon");
                        return imageView2;
                    default:
                        ImageView imageView3 = new ImageView(context2);
                        hxm0.x(imageView3, context2.getResources().getDimensionPixelSize(R.dimen.corner_radius_16));
                        d9lVar.addView(imageView3);
                        imageView3.setTag("MapImageView");
                        return imageView3;
                }
            }
        });
        final byte b5 = 4;
        this.n = maz.a(wezVar, new Function0() { // from class: a.c9l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                d9l d9lVar = this;
                Context context2 = context;
                switch (b6) {
                    case 0:
                        o7l o7lVar = new o7l(context2);
                        d9lVar.addView(o7lVar);
                        o7lVar.setTag("RadiantSideTextView");
                        return o7lVar;
                    case 1:
                        o7l o7lVar2 = new o7l(context2);
                        d9lVar.addView(o7lVar2);
                        o7lVar2.setTag("DireSideTextView");
                        return o7lVar2;
                    case 2:
                        j8l j8lVar = new j8l(context2, true);
                        d9lVar.addView(j8lVar);
                        return j8lVar;
                    case 3:
                        j8l j8lVar2 = new j8l(context2, true);
                        d9lVar.addView(j8lVar2);
                        return j8lVar2;
                    case 4:
                        j8l j8lVar3 = new j8l(context2, true);
                        d9lVar.addView(j8lVar3);
                        return j8lVar3;
                    case 5:
                        j8l j8lVar4 = new j8l(context2, false);
                        d9lVar.addView(j8lVar4);
                        j8lVar4.setTag("RoshanTextView");
                        return j8lVar4;
                    case 6:
                        ImageView imageView = new ImageView(context2);
                        d9lVar.addView(imageView);
                        imageView.setTag("RadiantTeamIcon");
                        return imageView;
                    case 7:
                        ImageView imageView2 = new ImageView(context2);
                        d9lVar.addView(imageView2);
                        imageView2.setTag("DireTeamIcon");
                        return imageView2;
                    default:
                        ImageView imageView3 = new ImageView(context2);
                        hxm0.x(imageView3, context2.getResources().getDimensionPixelSize(R.dimen.corner_radius_16));
                        d9lVar.addView(imageView3);
                        imageView3.setTag("MapImageView");
                        return imageView3;
                }
            }
        });
        final byte b6 = 5;
        this.o = maz.a(wezVar, new Function0() { // from class: a.c9l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                d9l d9lVar = this;
                Context context2 = context;
                switch (b7) {
                    case 0:
                        o7l o7lVar = new o7l(context2);
                        d9lVar.addView(o7lVar);
                        o7lVar.setTag("RadiantSideTextView");
                        return o7lVar;
                    case 1:
                        o7l o7lVar2 = new o7l(context2);
                        d9lVar.addView(o7lVar2);
                        o7lVar2.setTag("DireSideTextView");
                        return o7lVar2;
                    case 2:
                        j8l j8lVar = new j8l(context2, true);
                        d9lVar.addView(j8lVar);
                        return j8lVar;
                    case 3:
                        j8l j8lVar2 = new j8l(context2, true);
                        d9lVar.addView(j8lVar2);
                        return j8lVar2;
                    case 4:
                        j8l j8lVar3 = new j8l(context2, true);
                        d9lVar.addView(j8lVar3);
                        return j8lVar3;
                    case 5:
                        j8l j8lVar4 = new j8l(context2, false);
                        d9lVar.addView(j8lVar4);
                        j8lVar4.setTag("RoshanTextView");
                        return j8lVar4;
                    case 6:
                        ImageView imageView = new ImageView(context2);
                        d9lVar.addView(imageView);
                        imageView.setTag("RadiantTeamIcon");
                        return imageView;
                    case 7:
                        ImageView imageView2 = new ImageView(context2);
                        d9lVar.addView(imageView2);
                        imageView2.setTag("DireTeamIcon");
                        return imageView2;
                    default:
                        ImageView imageView3 = new ImageView(context2);
                        hxm0.x(imageView3, context2.getResources().getDimensionPixelSize(R.dimen.corner_radius_16));
                        d9lVar.addView(imageView3);
                        imageView3.setTag("MapImageView");
                        return imageView3;
                }
            }
        });
        final byte b7 = 6;
        this.p = maz.a(wezVar, new Function0() { // from class: a.c9l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b8 = b7;
                d9l d9lVar = this;
                Context context2 = context;
                switch (b8) {
                    case 0:
                        o7l o7lVar = new o7l(context2);
                        d9lVar.addView(o7lVar);
                        o7lVar.setTag("RadiantSideTextView");
                        return o7lVar;
                    case 1:
                        o7l o7lVar2 = new o7l(context2);
                        d9lVar.addView(o7lVar2);
                        o7lVar2.setTag("DireSideTextView");
                        return o7lVar2;
                    case 2:
                        j8l j8lVar = new j8l(context2, true);
                        d9lVar.addView(j8lVar);
                        return j8lVar;
                    case 3:
                        j8l j8lVar2 = new j8l(context2, true);
                        d9lVar.addView(j8lVar2);
                        return j8lVar2;
                    case 4:
                        j8l j8lVar3 = new j8l(context2, true);
                        d9lVar.addView(j8lVar3);
                        return j8lVar3;
                    case 5:
                        j8l j8lVar4 = new j8l(context2, false);
                        d9lVar.addView(j8lVar4);
                        j8lVar4.setTag("RoshanTextView");
                        return j8lVar4;
                    case 6:
                        ImageView imageView = new ImageView(context2);
                        d9lVar.addView(imageView);
                        imageView.setTag("RadiantTeamIcon");
                        return imageView;
                    case 7:
                        ImageView imageView2 = new ImageView(context2);
                        d9lVar.addView(imageView2);
                        imageView2.setTag("DireTeamIcon");
                        return imageView2;
                    default:
                        ImageView imageView3 = new ImageView(context2);
                        hxm0.x(imageView3, context2.getResources().getDimensionPixelSize(R.dimen.corner_radius_16));
                        d9lVar.addView(imageView3);
                        imageView3.setTag("MapImageView");
                        return imageView3;
                }
            }
        });
        final byte b8 = 7;
        this.q = maz.a(wezVar, new Function0() { // from class: a.c9l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b9 = b8;
                d9l d9lVar = this;
                Context context2 = context;
                switch (b9) {
                    case 0:
                        o7l o7lVar = new o7l(context2);
                        d9lVar.addView(o7lVar);
                        o7lVar.setTag("RadiantSideTextView");
                        return o7lVar;
                    case 1:
                        o7l o7lVar2 = new o7l(context2);
                        d9lVar.addView(o7lVar2);
                        o7lVar2.setTag("DireSideTextView");
                        return o7lVar2;
                    case 2:
                        j8l j8lVar = new j8l(context2, true);
                        d9lVar.addView(j8lVar);
                        return j8lVar;
                    case 3:
                        j8l j8lVar2 = new j8l(context2, true);
                        d9lVar.addView(j8lVar2);
                        return j8lVar2;
                    case 4:
                        j8l j8lVar3 = new j8l(context2, true);
                        d9lVar.addView(j8lVar3);
                        return j8lVar3;
                    case 5:
                        j8l j8lVar4 = new j8l(context2, false);
                        d9lVar.addView(j8lVar4);
                        j8lVar4.setTag("RoshanTextView");
                        return j8lVar4;
                    case 6:
                        ImageView imageView = new ImageView(context2);
                        d9lVar.addView(imageView);
                        imageView.setTag("RadiantTeamIcon");
                        return imageView;
                    case 7:
                        ImageView imageView2 = new ImageView(context2);
                        d9lVar.addView(imageView2);
                        imageView2.setTag("DireTeamIcon");
                        return imageView2;
                    default:
                        ImageView imageView3 = new ImageView(context2);
                        hxm0.x(imageView3, context2.getResources().getDimensionPixelSize(R.dimen.corner_radius_16));
                        d9lVar.addView(imageView3);
                        imageView3.setTag("MapImageView");
                        return imageView3;
                }
            }
        });
        final byte b9 = 8;
        this.r = maz.a(wezVar, new Function0() { // from class: a.c9l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b10 = b9;
                d9l d9lVar = this;
                Context context2 = context;
                switch (b10) {
                    case 0:
                        o7l o7lVar = new o7l(context2);
                        d9lVar.addView(o7lVar);
                        o7lVar.setTag("RadiantSideTextView");
                        return o7lVar;
                    case 1:
                        o7l o7lVar2 = new o7l(context2);
                        d9lVar.addView(o7lVar2);
                        o7lVar2.setTag("DireSideTextView");
                        return o7lVar2;
                    case 2:
                        j8l j8lVar = new j8l(context2, true);
                        d9lVar.addView(j8lVar);
                        return j8lVar;
                    case 3:
                        j8l j8lVar2 = new j8l(context2, true);
                        d9lVar.addView(j8lVar2);
                        return j8lVar2;
                    case 4:
                        j8l j8lVar3 = new j8l(context2, true);
                        d9lVar.addView(j8lVar3);
                        return j8lVar3;
                    case 5:
                        j8l j8lVar4 = new j8l(context2, false);
                        d9lVar.addView(j8lVar4);
                        j8lVar4.setTag("RoshanTextView");
                        return j8lVar4;
                    case 6:
                        ImageView imageView = new ImageView(context2);
                        d9lVar.addView(imageView);
                        imageView.setTag("RadiantTeamIcon");
                        return imageView;
                    case 7:
                        ImageView imageView2 = new ImageView(context2);
                        d9lVar.addView(imageView2);
                        imageView2.setTag("DireTeamIcon");
                        return imageView2;
                    default:
                        ImageView imageView3 = new ImageView(context2);
                        hxm0.x(imageView3, context2.getResources().getDimensionPixelSize(R.dimen.corner_radius_16));
                        d9lVar.addView(imageView3);
                        imageView3.setTag("MapImageView");
                        return imageView3;
                }
            }
        });
        this.t = new l7l(this);
        this.u = new x23(getMapImageView());
        this.v = true;
        this.w = true;
        setLayoutDirection(0);
        setWillNotDraw(false);
    }

    public static final Unit b(d9l d9lVar) {
        d9lVar.getAegisTextView().setVisibility(8);
        d9lVar.t.q = false;
        return Unit.f46060a;
    }

    private final j8l getAegisTextView() {
        return (j8l) this.l.getValue();
    }

    private final o7l getDireSideTextView() {
        return (o7l) this.k.getValue();
    }

    private final ImageView getDireTeamIcon() {
        return (ImageView) this.q.getValue();
    }

    private final ImageView getMapImageView() {
        return (ImageView) this.r.getValue();
    }

    private final j8l getNetWorthTextView() {
        return (j8l) this.m.getValue();
    }

    private final o7l getRadiantSideTextView() {
        return (o7l) this.j.getValue();
    }

    private final ImageView getRadiantTeamIcon() {
        return (ImageView) this.p.getValue();
    }

    private final j8l getRoshanTextView() {
        return (j8l) this.o.getValue();
    }

    private final j8l getTormentorTextView() {
        return (j8l) this.n.getValue();
    }

    public final void a(q8l q8lVar, vne vneVar) {
        vneVar.getClass();
        boolean z = q8lVar.b;
        this.v = z;
        j8l.l(getAegisTextView(), R.drawable.dota_aegis_ic, q8lVar.f28306a, vneVar, 0, 0.0f, new ucj(this, (byte) 21), 24);
        j8l aegisTextView = getAegisTextView();
        boolean z2 = q8lVar.c;
        aegisTextView.setVisibility(z2 ? 0 : 8);
        l7l l7lVar = this.t;
        l7lVar.q = z2;
        l7lVar.m = z;
    }

    public final void c(z8l z8lVar, vne vneVar) {
        vneVar.getClass();
        j8l.l(getRoshanTextView(), R.drawable.dota_roshan_ic, z8lVar.f43972a, vneVar, 0, 0.0f, null, 56);
        j8l roshanTextView = getRoshanTextView();
        boolean z = z8lVar.b;
        roshanTextView.setVisibility(z ? 0 : 8);
        this.t.r = z;
    }

    public final void d(a9l a9lVar, vne vneVar) {
        vneVar.getClass();
        j8l.l(getTormentorTextView(), R.drawable.dota_tormentor_active_ic, a9lVar.f483a, vneVar, 0, 0.0f, null, 56);
        j8l tormentorTextView = getTormentorTextView();
        boolean z = a9lVar.b;
        tormentorTextView.setVisibility(z ? 0 : 8);
        this.t.p = z;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        l7l l7lVar = this.t;
        d9l d9lVar = l7lVar.f19564a;
        a8z a8zVar = l7lVar.u;
        int i = l7lVar.g;
        float f = l7lVar.d;
        int i2 = l7lVar.c;
        RectF rectF = l7lVar.s;
        float f2 = l7lVar.l;
        int i3 = l7lVar.f;
        rectF.set(0.0f, 0.0f, f2, i3);
        float f3 = l7lVar.e;
        canvas.drawRoundRect(rectF, f3, f3, l7lVar.b());
        int i4 = l7lVar.k;
        rectF.set(i4 + 0.0f, 0.0f, l7lVar.l + i4, i3);
        canvas.drawRoundRect(rectF, f3, f3, l7lVar.b());
        int i5 = l7lVar.l;
        int i6 = l7lVar.b;
        int i7 = i5 + i6;
        rectF.set(i7, 0.0f, i7 + i3, i3);
        canvas.drawRoundRect(rectF, f3, f3, l7lVar.b());
        l7lVar.a(0, canvas);
        l7lVar.a(l7lVar.k, canvas);
        if (l7lVar.o) {
            int i8 = l7lVar.n ? 0 : l7lVar.k;
            int i9 = l7lVar.h;
            rectF.set(i2 + i8, i9 + i + i2, (l7lVar.l - i2) + i8, vqd.a(i, 2, i9, i2));
            canvas.drawRoundRect(rectF, f, f, (Paint) a8zVar.getValue());
        }
        if (l7lVar.p) {
            if (l7lVar.r) {
                rectF.set((d9lVar.getMeasuredWidth() / 2) + i6, i3 + i6, hne.D((d9lVar.getMeasuredWidth() / 2) + i2, l7lVar.j, i2, i6), d9lVar.getMeasuredHeight());
                canvas.drawRoundRect(rectF, f, f, l7lVar.b());
            } else {
                rectF.set(((d9lVar.getMeasuredWidth() / 2) - (l7lVar.j / 2)) - i2, i3 + i6, (l7lVar.j / 2) + (d9lVar.getMeasuredWidth() / 2) + i2, d9lVar.getMeasuredHeight());
                canvas.drawRoundRect(rectF, f, f, l7lVar.b());
            }
        }
        if (l7lVar.q) {
            int i10 = l7lVar.m ? 0 : l7lVar.k;
            int i11 = i3 - i2;
            rectF.set(i2 + i10, i11 - i, (l7lVar.l - i2) + i10, i11);
            canvas.drawRoundRect(rectF, f, f, (Paint) a8zVar.getValue());
        }
        if (l7lVar.r) {
            if (l7lVar.p) {
                rectF.set(((((d9lVar.getMeasuredWidth() / 2) - l7lVar.i) - i2) - i2) - i6, i3 + i6, (d9lVar.getMeasuredWidth() / 2) - i6, d9lVar.getMeasuredHeight());
                canvas.drawRoundRect(rectF, f, f, l7lVar.b());
            } else {
                rectF.set(((d9lVar.getMeasuredWidth() / 2) - (l7lVar.i / 2)) - i2, i3 + i6, (l7lVar.i / 2) + (d9lVar.getMeasuredWidth() / 2) + i2, d9lVar.getMeasuredHeight());
                canvas.drawRoundRect(rectF, f, f, l7lVar.b());
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getRoshanTextView().getMeasuredWidth();
        int measuredWidth2 = getTormentorTextView().getMeasuredWidth();
        l7l l7lVar = this.t;
        l7lVar.i = measuredWidth;
        l7lVar.j = measuredWidth2;
        int measuredWidth3 = l7lVar.f19564a.getMeasuredWidth();
        int i5 = l7lVar.f;
        int i6 = l7lVar.b;
        int i7 = ((measuredWidth3 - i5) / 2) - i6;
        l7lVar.l = i7;
        l7lVar.k = vqd.a(i6, 2, i5, i7);
        int i8 = this.h;
        int i9 = this.f5706a;
        int i10 = (i8 * 2) + i9 + this.e;
        int i11 = this.v ? 0 : i10;
        int i12 = this.w ? 0 : i10;
        o7l radiantSideTextView = getRadiantSideTextView();
        int measuredWidth4 = (this.e - getRadiantSideTextView().getMeasuredWidth()) / 2;
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = getRadiantSideTextView().getMeasuredHeight();
        int i13 = this.b;
        bcm0.s(radiantSideTextView, measuredWidth4, measuredHeight - ((measuredHeight2 + i13) / 2));
        bcm0.s(getDireSideTextView(), ((this.e - getDireSideTextView().getMeasuredWidth()) / 2) + i10, getMeasuredHeight() - ((getDireSideTextView().getMeasuredHeight() + i13) / 2));
        j8l aegisTextView = getAegisTextView();
        int measuredWidth5 = ((this.e - getAegisTextView().getMeasuredWidth()) / 2) + i11;
        int i14 = this.i;
        int measuredHeight3 = getAegisTextView().getMeasuredHeight();
        int i15 = this.c;
        bcm0.s(aegisTextView, measuredWidth5, (i9 - i14) - ((measuredHeight3 + i15) / 2));
        bcm0.s(getNetWorthTextView(), ((this.e - getNetWorthTextView().getMeasuredWidth()) / 2) + i12, ((i15 - getNetWorthTextView().getMeasuredHeight()) / 2) + this.d + i15 + i14);
        bcm0.s(getRoshanTextView(), getTormentorTextView().getVisibility() == 0 ? (((getMeasuredWidth() / 2) - getRoshanTextView().getMeasuredWidth()) - i8) - i14 : (getMeasuredWidth() - getRoshanTextView().getMeasuredWidth()) / 2, getMeasuredHeight() - ((getRoshanTextView().getMeasuredHeight() + i13) / 2));
        bcm0.s(getTormentorTextView(), getRoshanTextView().getVisibility() == 0 ? (getMeasuredWidth() / 2) + i14 + i8 : (getMeasuredWidth() - getTormentorTextView().getMeasuredWidth()) / 2, getMeasuredHeight() - ((getTormentorTextView().getMeasuredHeight() + i13) / 2));
        ImageView radiantTeamIcon = getRadiantTeamIcon();
        int measuredWidth6 = (this.e - getRadiantTeamIcon().getMeasuredWidth()) / 2;
        int i16 = this.g;
        bcm0.s(radiantTeamIcon, measuredWidth6, i16);
        bcm0.s(getDireTeamIcon(), ((this.e - getDireTeamIcon().getMeasuredWidth()) / 2) + i10, i16);
        bcm0.s(getMapImageView(), this.e + i8 + i14, i14);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth = getMeasuredWidth();
        int i3 = this.f5706a;
        int i4 = this.h;
        int i5 = ((measuredWidth - i3) / 2) - i4;
        this.e = i5;
        int i6 = this.i * 2;
        this.s = (i5 - i6) - i4;
        bcm0.u(getRadiantSideTextView());
        bcm0.u(getDireSideTextView());
        getAegisTextView().measure(View.MeasureSpec.makeMeasureSpec(this.s, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        getNetWorthTextView().measure(View.MeasureSpec.makeMeasureSpec(this.s, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        ImageView radiantTeamIcon = getRadiantTeamIcon();
        int i7 = this.f;
        bcm0.t(radiantTeamIcon, i7, i7);
        bcm0.t(getDireTeamIcon(), i7, i7);
        getTormentorTextView().measure(View.MeasureSpec.makeMeasureSpec(this.s, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        bcm0.u(getRoshanTextView());
        int i8 = i3 - i6;
        bcm0.t(getMapImageView(), i8, i8);
        this.u.e();
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public final void setDireSide(r8l r8lVar) {
        r8lVar.getClass();
        o7l direSideTextView = getDireSideTextView();
        String str = r8lVar.f30033a;
        direSideTextView.j(direSideTextView.i, R.drawable.dota_dire_dot, direSideTextView.j, str);
    }

    public final void setDireTeamIcon(String str) {
        str.getClass();
        List list = u0d.f34849a;
        u0d.n(getDireTeamIcon(), str, R.drawable.icon_globe_empty, 3);
    }

    public final void setMapBuildings(List<? extends a3l> list) {
        list.getClass();
        if (this.x) {
            int i = 0;
            int i2 = 1;
            Class<d9l> cls = d9l.class;
            this.u.g(list, new k0l(i2, this, cls, "addView", "addView(Landroid/view/View;)V", i, (byte) 9), new k0l(i2, this, cls, "removeView", "removeView(Landroid/view/View;)V", i, (byte) 10));
        }
    }

    public final void setMapHeroes(List<o5l> list) {
        list.getClass();
        if (this.x) {
            this.u.h(list, new k0l(1, this, d9l.class, "addView", "addView(Landroid/view/View;)V", 0, (byte) 11));
        }
    }

    public final void setNetWorth(w8l w8lVar) {
        w8lVar.getClass();
        boolean z = w8lVar.b;
        this.w = z;
        j8l netWorthTextView = getNetWorthTextView();
        String str = w8lVar.f38727a;
        int i = netWorthTextView.j;
        float f = netWorthTextView.i;
        str.getClass();
        netWorthTextView.setTextSize(0, f);
        netWorthTextView.j(R.drawable.dota_gold_ic, i);
        netWorthTextView.setText(str);
        j8l netWorthTextView2 = getNetWorthTextView();
        boolean z2 = w8lVar.c;
        netWorthTextView2.setVisibility(z2 ? 0 : 8);
        l7l l7lVar = this.t;
        l7lVar.o = z2;
        l7lVar.n = z;
    }

    public final void setRadiantSide(x8l x8lVar) {
        x8lVar.getClass();
        o7l radiantSideTextView = getRadiantSideTextView();
        String str = x8lVar.f40467a;
        radiantSideTextView.j(radiantSideTextView.i, R.drawable.dota_radiant_dot, radiantSideTextView.j, str);
    }

    public final void setRadiantTeamIcon(String str) {
        str.getClass();
        List list = u0d.f34849a;
        u0d.n(getRadiantTeamIcon(), str, R.drawable.icon_globe_empty, 3);
    }
}
