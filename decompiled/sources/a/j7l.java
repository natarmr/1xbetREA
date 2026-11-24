package a;

import android.content.Context;
import android.graphics.Canvas;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.cyber.dota.impl.presentation.common.DotaAdditionalTeamInformationView;
import org.xplatform.cyber.dota.impl.presentation.statistic.skills.view.DotaSkillsHeroesTableView;
import org.xplatform.cyber.dota.impl.presentation.statistic.skills.view.DotaSkillsViewContainer;

/* JADX INFO: loaded from: classes3.dex */
public final class j7l extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd7 f16046a;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final n0o0 h;
    public final DotaAdditionalTeamInformationView i;

    public j7l(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.cybergame_dota_skills_view, this);
        int i = R.id.additionalInformation;
        DotaAdditionalTeamInformationView dotaAdditionalTeamInformationView = (DotaAdditionalTeamInformationView) yum0.f(this, R.id.additionalInformation);
        if (dotaAdditionalTeamInformationView != null) {
            i = R.id.heroes;
            DotaSkillsHeroesTableView dotaSkillsHeroesTableView = (DotaSkillsHeroesTableView) yum0.f(this, R.id.heroes);
            if (dotaSkillsHeroesTableView != null) {
                i = R.id.skillsContainer;
                DotaSkillsViewContainer dotaSkillsViewContainer = (DotaSkillsViewContainer) yum0.f(this, R.id.skillsContainer);
                if (dotaSkillsViewContainer != null) {
                    this.f16046a = new vd7(this, dotaAdditionalTeamInformationView, dotaSkillsHeroesTableView, dotaSkillsViewContainer, (byte) 8);
                    this.b = context.getResources().getBoolean(R.bool.isTablet);
                    this.c = getResources().getDimensionPixelSize(R.dimen.size_32);
                    this.d = getResources().getDimensionPixelSize(R.dimen.space_36);
                    this.e = getResources().getDimensionPixelSize(R.dimen.shimmer_size_126);
                    this.f = getResources().getDimensionPixelSize(R.dimen.space_6);
                    this.g = getResources().getDimensionPixelSize(R.dimen.space_4);
                    this.h = maz.b(new ucj(this, (byte) 19));
                    this.i = dotaAdditionalTeamInformationView;
                    setWillNotDraw(false);
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public static final Unit a(j7l j7lVar, int i, int i2, int i3, int i4) {
        j7lVar.getTeamDelegate().b(i, i2, i3, i4);
        return Unit.f46060a;
    }

    private final z6p0 getTeamDelegate() {
        return (z6p0) this.h.getValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        getTeamDelegate().a(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        vd7 vd7Var = this.f16046a;
        final byte b = 0;
        cww.B(this, 0, 0, ((DotaSkillsHeroesTableView) vd7Var.c).getMeasuredWidth() - this.f, this.c, new ydr(this) { // from class: a.i7l
            public final /* synthetic */ j7l b;

            {
                this.b = this;
            }

            @Override // a.ydr
            public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                byte b2 = b;
                j7l j7lVar = this.b;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                switch (b2) {
                    case 0:
                        return j7l.a(j7lVar, iIntValue, iIntValue2, iIntValue3, iIntValue4);
                    default:
                        j7lVar.i.layout(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        return Unit.f46060a;
                }
            }
        });
        DotaSkillsHeroesTableView dotaSkillsHeroesTableView = (DotaSkillsHeroesTableView) vd7Var.c;
        final byte b2 = 1;
        cww.B(this, dotaSkillsHeroesTableView.getMeasuredWidth(), 0, getMeasuredWidth(), this.c, new ydr(this) { // from class: a.i7l
            public final /* synthetic */ j7l b;

            {
                this.b = this;
            }

            @Override // a.ydr
            public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                byte b3 = b2;
                j7l j7lVar = this.b;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                int iIntValue4 = ((Integer) obj4).intValue();
                switch (b3) {
                    case 0:
                        return j7l.a(j7lVar, iIntValue, iIntValue2, iIntValue3, iIntValue4);
                    default:
                        j7lVar.i.layout(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                        return Unit.f46060a;
                }
            }
        });
        int measuredWidth = dotaSkillsHeroesTableView.getMeasuredWidth();
        int measuredHeight = dotaSkillsHeroesTableView.getMeasuredHeight();
        int i5 = this.d;
        int i6 = measuredHeight + i5;
        cww.z(0, i5, measuredWidth, i6, dotaSkillsHeroesTableView, this);
        cww.z(measuredWidth, this.d, i3, i6, (DotaSkillsViewContainer) vd7Var.d, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        vd7 vd7Var = this.f16046a;
        DotaSkillsViewContainer dotaSkillsViewContainer = (DotaSkillsViewContainer) vd7Var.d;
        DotaSkillsViewContainer dotaSkillsViewContainer2 = (DotaSkillsViewContainer) vd7Var.d;
        dotaSkillsViewContainer.measure(i, i2);
        DotaSkillsHeroesTableView dotaSkillsHeroesTableView = (DotaSkillsHeroesTableView) vd7Var.c;
        if (this.b) {
            dotaSkillsHeroesTableView.measure(View.MeasureSpec.makeMeasureSpec(size - dotaSkillsViewContainer2.getMinimumWidth(), 1073741824), i2);
        } else {
            dotaSkillsHeroesTableView.measure(View.MeasureSpec.makeMeasureSpec(this.e, 1073741824), i2);
        }
        int measuredWidth = dotaSkillsHeroesTableView.getMeasuredWidth();
        int i3 = this.f;
        this.i.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - i3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.c, 1073741824));
        z6p0 teamDelegate = getTeamDelegate();
        int measuredWidth2 = dotaSkillsHeroesTableView.getMeasuredWidth() - i3;
        View.MeasureSpec.getSize(i2);
        teamDelegate.c(measuredWidth2);
        setMeasuredDimension(size, View.MeasureSpec.makeMeasureSpec(dotaSkillsViewContainer2.getMeasuredHeight() + this.d + this.g, 1073741824));
    }

    public final void setAdditionalInformation(List<h00> list) {
        list.getClass();
        this.i.setItemParams(list);
    }

    public final void setHeroes(List<l4l> list) {
        list.getClass();
        ((DotaSkillsHeroesTableView) this.f16046a.c).setHeroes(list);
    }

    public final void setHeroesItems(List<g7l> list) {
        list.getClass();
        ((DotaSkillsHeroesTableView) this.f16046a.c).setHeroesItems(list);
    }

    public final void setItems(List<? extends List<n4l>> list) {
        list.getClass();
        ((DotaSkillsViewContainer) this.f16046a.d).setSkills(list);
    }

    public final void setScrollViewKeeper(amw amwVar) {
        amwVar.getClass();
        ((DotaSkillsViewContainer) this.f16046a.d).setScrollViewKeeper(amwVar);
    }

    public final void setTeam(xnp0 xnp0Var) {
        xnp0Var.getClass();
        getTeamDelegate().d(xnp0Var.f41180a, xnp0Var.b, xnp0Var.c, true, xnp0Var.g);
    }
}
