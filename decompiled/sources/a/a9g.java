package a;

import android.gov.nist.core.Separators;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class a9g extends nju0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f474a;
    public final Object b;
    public Object c;

    public /* synthetic */ a9g(Object obj, Object obj2, byte b) {
        this.f474a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // a.nju0
    public void a(int i) {
        switch (this.f474a) {
            case 0:
                b9g b9gVar = (b9g) this.b;
                if (i == 0) {
                    try {
                        nl9 nl9Var = b9gVar.P1;
                        if (nl9Var != null) {
                            CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel = (CyberCalendarPeriodUiModel) ((ArrayList) nl9Var.n).get(((c9g) this.c).c.getCurrentItem());
                            if (cyberCalendarPeriodUiModel != null) {
                                g9g g9gVar = (g9g) b9gVar.O1.getValue();
                                sac.V(jiu0.a(g9gVar), new d9g(g9gVar, (byte) 1), null, g9gVar.i.f22085a, new b1f((Object) cyberCalendarPeriodUiModel, (Object) g9gVar, (yje) null, (byte) 9), 10);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                break;
        }
    }

    @Override // a.nju0
    public void b(int i, float f, int i2) {
        switch (this.f474a) {
            case 1:
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.b;
                if (((oju0) this.c) != null) {
                    float f2 = -f;
                    for (int i3 = 0; i3 < linearLayoutManager.I(); i3++) {
                        View viewH = linearLayoutManager.H(i3);
                        if (viewH == null) {
                            Locale locale = Locale.US;
                            jf4.n(ohs0.m("LayoutManager returned a null child at pos ", i3, Separators.SLASH, " while transforming pages", linearLayoutManager.I()));
                        } else {
                            float fT = (androidx.recyclerview.widget.b.T(viewH) - i) + f2;
                            x860 x860Var = (x860) ((oju0) this.c);
                            x860Var.getClass();
                            ViewParent parent = viewH.getParent();
                            ViewParent parent2 = parent.getParent();
                            if ((parent instanceof RecyclerView) && (parent2 instanceof ViewPager2)) {
                                ViewPager2 viewPager2 = (ViewPager2) parent2;
                                float f3 = x860Var.f40449a * fT;
                                if (viewPager2.getOrientation() == 0) {
                                    if (viewPager2.b()) {
                                        f3 = -f3;
                                    }
                                    viewH.setTranslationX(f3);
                                } else {
                                    viewH.setTranslationY(f3);
                                }
                            } else {
                                jf4.n("Expected the page view to be managed by a ViewPager2 instance.");
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
        }
    }

    @Override // a.nju0
    public void c(int i) {
        switch (this.f474a) {
            case 2:
                gym0 gym0Var = (gym0) this.b;
                gym0Var.h = i;
                swm0 swm0Var = (swm0) CollectionsKt.W(i, gym0Var.e);
                ((nfj0) this.c).invoke(Long.valueOf(swm0Var != null ? swm0Var.b() : 0L), Integer.valueOf(i));
                break;
        }
    }

    public a9g(y6e y6eVar) {
        this.f474a = (byte) 1;
        this.b = y6eVar;
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }
}
