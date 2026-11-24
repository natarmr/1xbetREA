package a;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class i8l extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7l f14344a;
    public final a8z b;
    public final a8z c;
    public final s1g d;
    public final s1g e;
    public final x23 f;
    public final p8l g;
    public final p8l h;
    public boolean i;
    public boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8l(final Context context) {
        super(context, null, 0);
        final byte b = 0;
        p7l p7lVar = new p7l(context);
        this.f14344a = p7lVar;
        Function0 function0 = new Function0() { // from class: a.h8l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                i8l i8lVar = this;
                Context context2 = context;
                switch (b2) {
                    case 0:
                        ImageView imageView = new ImageView(context2);
                        p7l p7lVar2 = i8lVar.f14344a;
                        hxm0.x(imageView, (int) (p7lVar2.g * p7lVar2.e));
                        i8lVar.addView(imageView);
                        return imageView;
                    default:
                        j8l j8lVar = new j8l(context2, false);
                        i8lVar.addView(j8lVar);
                        return j8lVar;
                }
            }
        };
        wez wezVar = wez.b;
        this.b = maz.a(wezVar, function0);
        final byte b2 = 1;
        this.c = maz.a(wezVar, new Function0() { // from class: a.h8l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                i8l i8lVar = this;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        ImageView imageView = new ImageView(context2);
                        p7l p7lVar2 = i8lVar.f14344a;
                        hxm0.x(imageView, (int) (p7lVar2.g * p7lVar2.e));
                        i8lVar.addView(imageView);
                        return imageView;
                    default:
                        j8l j8lVar = new j8l(context2, false);
                        i8lVar.addView(j8lVar);
                        return j8lVar;
                }
            }
        });
        s1g s1gVar = new s1g(this, R.color.static_black_40);
        s1gVar.c(p7lVar.g * p7lVar.e);
        this.d = s1gVar;
        s1g s1gVar2 = new s1g(this, R.color.dota_statistic_bg);
        s1gVar2.c(p7lVar.a());
        this.e = s1gVar2;
        this.f = new x23(getMapImageView());
        this.g = new p8l(p7lVar, this);
        this.h = new p8l(p7lVar, this);
        setWillNotDraw(false);
    }

    private final ImageView getMapImageView() {
        return (ImageView) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j8l getRoshanTextView() {
        return (j8l) this.c.getValue();
    }

    public final void b(d8l d8lVar, vne vneVar) {
        vneVar.getClass();
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new pva(this, d8lVar, vneVar, (byte) 2));
            return;
        }
        j8l roshanTextView = getRoshanTextView();
        boolean z = d8lVar.b;
        p7l p7lVar = this.f14344a;
        j8l.l(roshanTextView, R.drawable.dota_roshan_ic, d8lVar.f5654a, vneVar, p7lVar.e(), p7lVar.f(), null, 32);
        getRoshanTextView().setVisibility(z ? 0 : 8);
        this.j = z;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        this.d.a(canvas);
        if (this.j) {
            this.e.a(canvas);
        }
        this.g.d(canvas);
        this.h.d(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        j8l roshanTextView = getRoshanTextView();
        p7l p7lVar = this.f14344a;
        int iB = (p7lVar.b() - getRoshanTextView().getMeasuredWidth()) / 2;
        int measuredHeight = getMeasuredHeight();
        int i5 = p7lVar.c;
        cww.A(roshanTextView, this, iB, (measuredHeight - i5) - ((getRoshanTextView().getMeasuredHeight() + p7lVar.d()) / 2));
        cww.A(getMapImageView(), this, i5, i5);
        final byte b = 0;
        this.g.p(p7lVar.b() + i5, 0, getMeasuredWidth(), (((p7lVar.d() + p7lVar.b()) + i5) - i5) / 2);
        this.h.p(p7lVar.b() + i5, ((((p7lVar.d() + p7lVar.b()) + i5) - i5) / 2) + i5, getMeasuredWidth(), getMeasuredHeight());
        cww.C(this, getMeasuredWidth(), 0, 0, p7lVar.b(), getMeasuredHeight(), new ydr(this) { // from class: a.f8l
            public final /* synthetic */ i8l b;

            {
                this.b = this;
            }

            @Override // a.ydr
            public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                byte b2 = b;
                i8l i8lVar = this.b;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                switch (b2) {
                    case 0:
                        i8lVar.d.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        break;
                    default:
                        i8lVar.e.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        cww.C(this, getMeasuredWidth(), p7lVar.c, (getMeasuredHeight() - p7lVar.d()) - i5, p7lVar.b() - i5, getMeasuredHeight() - i5, new ydr(this) { // from class: a.f8l
            public final /* synthetic */ i8l b;

            {
                this.b = this;
            }

            @Override // a.ydr
            public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                byte b3 = b2;
                i8l i8lVar = this.b;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                switch (b3) {
                    case 0:
                        i8lVar.d.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        break;
                    default:
                        i8lVar.e.b(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        p7l p7lVar = this.f14344a;
        p7lVar.getClass();
        p7lVar.e = size / p7lVar.d;
        bcm0.u(getRoshanTextView());
        ImageView mapImageView = getMapImageView();
        int i3 = p7lVar.l;
        bcm0.t(mapImageView, si30.b(i3 * p7lVar.e), si30.b(i3 * p7lVar.e));
        this.f.e();
        this.g.r();
        this.h.r();
        setMeasuredDimension(View.MeasureSpec.getSize(i), p7lVar.d() + p7lVar.b() + p7lVar.c + View.MeasureSpec.getSize(i2));
    }

    public final void setDireSelectedHeroes(List<u6l> list) {
        list.getClass();
        this.h.y(list);
    }

    public final void setDireTeamIcon(String str) {
        str.getClass();
        p8l p8lVar = this.h;
        p8lVar.getClass();
        List list = u0d.f34849a;
        u0d.n((ImageView) ((a8z) p8lVar.k).getValue(), str, R.drawable.icon_globe_empty, 3);
    }

    public final void setDireTeamName(String str) {
        str.getClass();
        p8l p8lVar = this.h;
        p8lVar.getClass();
        p8lVar.l = str;
    }

    public final void setMapBuildings(List<? extends a3l> list) {
        list.getClass();
        if (this.i) {
            int i = 0;
            int i2 = 1;
            Class<i8l> cls = i8l.class;
            this.f.g(list, new k0l(i2, this, cls, "addView", "addView(Landroid/view/View;)V", i, (byte) 6), new k0l(i2, this, cls, "removeView", "removeView(Landroid/view/View;)V", i, (byte) 7));
        }
    }

    public final void setMapHeroes(List<o5l> list) {
        list.getClass();
        if (this.i) {
            this.f.h(list, new k0l(1, this, i8l.class, "addView", "addView(Landroid/view/View;)V", 0, (byte) 8));
        }
    }

    public final void setNetWorthDire(r7l r7lVar) {
        r7lVar.getClass();
        this.h.x(r7lVar.f29981a, r7lVar.b);
    }

    public final void setNetWorthRadiant(z7l z7lVar) {
        z7lVar.getClass();
        this.g.x(z7lVar.f43922a, z7lVar.b);
    }

    public final void setRadiantSelectedHeroes(List<u6l> list) {
        list.getClass();
        this.g.y(list);
    }

    public final void setRadiantTeamIcon(String str) {
        str.getClass();
        p8l p8lVar = this.g;
        p8lVar.getClass();
        List list = u0d.f34849a;
        u0d.n((ImageView) ((a8z) p8lVar.k).getValue(), str, R.drawable.icon_globe_empty, 3);
    }

    public final void setRadiantTeamName(String str) {
        str.getClass();
        p8l p8lVar = this.g;
        p8lVar.getClass();
        p8lVar.l = str;
    }
}
