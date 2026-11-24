package a;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.List;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.cyber.dota.impl.presentation.common.DotaAdditionalTeamInformationView;
import org.xplatform.cyber.dota.impl.presentation.statistic.items.view.DotaItemsHeroesTableView;
import org.xplatform.cyber.dota.impl.presentation.statistic.items.view.DotaItemsTableView;

/* JADX INFO: loaded from: classes3.dex */
public final class m5l extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dc3 f21225a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final n0o0 g;
    public final DotaAdditionalTeamInformationView h;
    public amw i;
    public List j;

    public m5l(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.cybergame_dota_items_view, this);
        int i = R.id.additionalInformation;
        DotaAdditionalTeamInformationView dotaAdditionalTeamInformationView = (DotaAdditionalTeamInformationView) yum0.f(this, R.id.additionalInformation);
        if (dotaAdditionalTeamInformationView != null) {
            i = R.id.heroes;
            DotaItemsHeroesTableView dotaItemsHeroesTableView = (DotaItemsHeroesTableView) yum0.f(this, R.id.heroes);
            if (dotaItemsHeroesTableView != null) {
                i = R.id.items;
                DotaItemsTableView dotaItemsTableView = (DotaItemsTableView) yum0.f(this, R.id.items);
                if (dotaItemsTableView != null) {
                    i = R.id.scrollView;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) yum0.f(this, R.id.scrollView);
                    if (horizontalScrollView != null) {
                        this.f21225a = new dc3(this, dotaAdditionalTeamInformationView, dotaItemsHeroesTableView, dotaItemsTableView, horizontalScrollView);
                        this.b = context.getResources().getBoolean(R.bool.isTablet);
                        this.c = getResources().getDimensionPixelSize(R.dimen.size_32);
                        this.d = getResources().getDimensionPixelSize(R.dimen.space_36);
                        this.e = getResources().getDimensionPixelSize(R.dimen.size_164);
                        this.f = getResources().getDimensionPixelSize(R.dimen.space_6);
                        this.g = maz.b(new ucj(this, (byte) 18));
                        this.h = dotaAdditionalTeamInformationView;
                        this.j = iun.f15405a;
                        setWillNotDraw(false);
                        return;
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public static final Unit a(m5l m5lVar, int i, int i2, int i3, int i4) {
        m5lVar.getTeamDelegate().b(i, i2, i3, i4);
        return Unit.f46060a;
    }

    private final z6p0 getTeamDelegate() {
        return (z6p0) this.g.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        getTeamDelegate().a(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        dc3 dc3Var = this.f21225a;
        final byte b = 0;
        cww.B(this, 0, 0, ((DotaItemsHeroesTableView) dc3Var.c).getMeasuredWidth() - this.f, this.c, new ydr(this) { // from class: a.l5l
            public final /* synthetic */ m5l b;

            {
                this.b = this;
            }

            @Override // a.ydr
            public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                byte b2 = b;
                m5l m5lVar = this.b;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                switch (b2) {
                    case 0:
                        return m5l.a(m5lVar, iIntValue, iIntValue2, iIntValue3, iIntValue4);
                    default:
                        m5lVar.h.layout(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        return Unit.f46060a;
                }
            }
        });
        DotaItemsHeroesTableView dotaItemsHeroesTableView = (DotaItemsHeroesTableView) dc3Var.c;
        final byte b2 = 1;
        cww.B(this, dotaItemsHeroesTableView.getMeasuredWidth(), 0, getMeasuredWidth(), this.c, new ydr(this) { // from class: a.l5l
            public final /* synthetic */ m5l b;

            {
                this.b = this;
            }

            @Override // a.ydr
            public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                byte b3 = b2;
                m5l m5lVar = this.b;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                switch (b3) {
                    case 0:
                        return m5l.a(m5lVar, iIntValue, iIntValue2, iIntValue3, iIntValue4);
                    default:
                        m5lVar.h.layout(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        return Unit.f46060a;
                }
            }
        });
        int measuredWidth = dotaItemsHeroesTableView.getMeasuredWidth();
        int measuredHeight = dotaItemsHeroesTableView.getMeasuredHeight();
        int i5 = this.d;
        int i6 = measuredHeight + i5;
        cww.z(0, i5, measuredWidth, i6, dotaItemsHeroesTableView, this);
        cww.z(measuredWidth, this.d, i3, i6, (HorizontalScrollView) dc3Var.e, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        dc3 dc3Var = this.f21225a;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) dc3Var.e;
        DotaItemsTableView dotaItemsTableView = (DotaItemsTableView) dc3Var.d;
        horizontalScrollView.measure(i, i2);
        DotaItemsHeroesTableView dotaItemsHeroesTableView = (DotaItemsHeroesTableView) dc3Var.c;
        if (this.b) {
            dotaItemsHeroesTableView.measure(View.MeasureSpec.makeMeasureSpec(size - dotaItemsTableView.getMinimumWidth(), 1073741824), i2);
        } else {
            dotaItemsHeroesTableView.measure(View.MeasureSpec.makeMeasureSpec(this.e, 1073741824), i2);
        }
        z6p0 teamDelegate = getTeamDelegate();
        int measuredWidth = dotaItemsHeroesTableView.getMeasuredWidth();
        int i3 = this.f;
        View.MeasureSpec.getSize(i2);
        teamDelegate.c(measuredWidth - i3);
        this.h.measure(View.MeasureSpec.makeMeasureSpec(dotaItemsHeroesTableView.getMeasuredWidth() - i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        setMeasuredDimension(size, View.MeasureSpec.makeMeasureSpec(dotaItemsTableView.getMeasuredHeight() + this.d, 1073741824));
    }

    public final void setAdditionalInformation(List<h00> list) {
        list.getClass();
        this.h.setItemParams(list);
    }

    public final void setHeroes(List<l4l> list) {
        list.getClass();
        ((DotaItemsHeroesTableView) this.f21225a.c).setHeroes(list);
    }

    public final void setHeroesItems(List<v4l> list) {
        list.getClass();
        ((DotaItemsHeroesTableView) this.f21225a.c).setHeroesItems(list);
    }

    public final void setItems(List<k5l> list) {
        list.getClass();
        ((DotaItemsTableView) this.f21225a.d).setItems(list);
        if (this.j.isEmpty()) {
            tl60.a(this, new mx2(this, this, (byte) 6));
        }
        this.j = list;
    }

    public final void setScrollViewKeeper(amw amwVar) {
        amwVar.getClass();
        this.i = amwVar;
    }

    public final void setTeam(xnp0 xnp0Var) {
        xnp0Var.getClass();
        getTeamDelegate().d(xnp0Var.f41180a, xnp0Var.b, xnp0Var.c, true, xnp0Var.g);
    }
}
