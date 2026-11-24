package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.championships.esports_world_cup.presentation.discipline.discipline_banner.DisciplineBannerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b8o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b8o f2164a = new b8o(3, bmg.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/section/impl/databinding/CyberDisciplineBannerViewBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.cyber_discipline_banner_view, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        if (viewInflate != null) {
            return new bmg((DisciplineBannerView) viewInflate);
        }
        hny.u("rootView");
        return null;
    }
}
