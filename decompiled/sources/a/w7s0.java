package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;

/* JADX INFO: loaded from: classes6.dex */
public final class w7s0 extends k5 {
    public static final List n = q3d.j(4, 5, 6, 8, 10, 11);
    public nmo0 l;
    public final elk0 m;

    public w7s0(nmo0 nmo0Var, elk0 elk0Var) {
        super(nmo0Var, true, R.dimen.text_12);
        this.l = nmo0Var;
        this.m = elk0Var;
        this.c.j = 2;
        Iterator it = n.iterator();
        while (it.hasNext()) {
            mhe0 mhe0VarB = this.c.i.b(((Number) it.next()).intValue());
            mhe0VarB.b = (byte) 100;
            ArrayList arrayList = mhe0VarB.f21789a;
            while (arrayList.size() > 100) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    public static void s(int i, w5 w5Var) {
        if (i != -1) {
            Context context = w5Var.f40887a.getContext();
            context.getClass();
            w5Var.u(m5d.b(i, context));
        }
    }

    @Override // a.k5
    public final int b(int i, int i2) {
        y8b y8bVarE = e(i2);
        if (y8bVarE == null) {
            return 0;
        }
        if (y8bVarE instanceof i5s0) {
            return a(i, i2) instanceof rzr0 ? 11 : 6;
        }
        if (y8bVarE instanceof k5s0) {
            return 4;
        }
        if (y8bVarE instanceof h5s0) {
            return 5;
        }
        if (y8bVarE instanceof j5s0) {
            return 8;
        }
        return y8bVarE instanceof l5s0 ? 10 : 0;
    }

    @Override // a.k5
    public final int f(int i) {
        y8b y8bVarE = e(i);
        if (y8bVarE == null) {
            return 0;
        }
        if (y8bVarE instanceof k5s0) {
            return 2;
        }
        if (y8bVarE instanceof i5s0) {
            return 1;
        }
        if (y8bVarE instanceof h5s0) {
            return 3;
        }
        if (y8bVarE instanceof j5s0) {
            return 7;
        }
        return y8bVarE instanceof l5s0 ? 9 : 0;
    }

    @Override // a.k5
    public final nmo0 g() {
        return this.l;
    }

    @Override // a.k5
    public final void j(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof ozr0) {
            jzr0 jzr0Var = w5Var instanceof jzr0 ? (jzr0) w5Var : null;
            if (jzr0Var != null) {
                jzr0Var.u.c.setText(((ozr0) y8bVar).d);
                s(R.attr.uikitBackgroundGroup, jzr0Var);
                return;
            }
            return;
        }
        if (y8bVar instanceof tzr0) {
            d8s0 d8s0Var = w5Var instanceof d8s0 ? (d8s0) w5Var : null;
            if (d8s0Var != null) {
                tzr0 tzr0Var = (tzr0) y8bVar;
                TextView textView = d8s0Var.u.b;
                textView.setText(tzr0Var.d);
                textView.setTextColor(d8s0Var.v);
                s(tzr0Var.e, d8s0Var);
                return;
            }
            return;
        }
        if (!(y8bVar instanceof rzr0)) {
            if (y8bVar instanceof szr0) {
                izr0 izr0Var = w5Var instanceof izr0 ? (izr0) w5Var : null;
                if (izr0Var != null) {
                    s(R.attr.uikitBackground, izr0Var);
                    return;
                }
                return;
            }
            if (y8bVar instanceof qzr0) {
                hzr0 hzr0Var = w5Var instanceof hzr0 ? (hzr0) w5Var : null;
                if (hzr0Var != null) {
                    s(R.attr.uikitBackgroundGroupSecondary, hzr0Var);
                    View rootView = hzr0Var.f40887a.getRootView();
                    rootView.getClass();
                    ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
                    if (layoutParams == null) {
                        hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    } else {
                        layoutParams.height = ((qzr0) y8bVar).e;
                        rootView.setLayoutParams(layoutParams);
                        return;
                    }
                }
                return;
            }
            if (y8bVar instanceof pzr0) {
                izr0 izr0Var2 = w5Var instanceof izr0 ? (izr0) w5Var : null;
                if (izr0Var2 != null) {
                    View rootView2 = izr0Var2.f40887a.getRootView();
                    rootView2.getClass();
                    ViewGroup.LayoutParams layoutParams2 = rootView2.getLayoutParams();
                    if (layoutParams2 == null) {
                        hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    } else {
                        layoutParams2.height = this.l.getContext().getResources().getDimensionPixelSize(R.dimen.size_50);
                        rootView2.setLayoutParams(layoutParams2);
                        return;
                    }
                }
                return;
            }
            return;
        }
        uzr0 uzr0Var = w5Var instanceof uzr0 ? (uzr0) w5Var : null;
        if (uzr0Var != null) {
            rzr0 rzr0Var = (rzr0) y8bVar;
            iab iabVar = uzr0Var.u;
            TextView textView2 = (TextView) iabVar.c;
            TextView textView3 = (TextView) iabVar.e;
            TextView textView4 = (TextView) iabVar.f;
            TextView textView5 = (TextView) iabVar.h;
            TextView textView6 = (TextView) iabVar.g;
            TextView textView7 = (TextView) iabVar.b;
            for (TextView textView8 : q3d.j(textView7, textView6, textView5, textView4, textView3, textView2)) {
                textView8.getClass();
                textView8.setText("");
                textView8.setBackgroundTintList(null);
            }
            int i = 0;
            for (Object obj : rzr0Var.e) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                rss rssVar = (rss) obj;
                if (i == 0) {
                    uzr0.v(textView7, rssVar);
                } else if (i == 1) {
                    uzr0.v(textView6, rssVar);
                } else if (i == 2) {
                    uzr0.v(textView5, rssVar);
                } else if (i == 3) {
                    uzr0.v(textView4, rssVar);
                } else if (i == 4) {
                    uzr0.v(textView3, rssVar);
                } else if (i == 5) {
                    uzr0.v(textView2, rssVar);
                }
                i = i2;
            }
            s(rzr0Var.d, uzr0Var);
        }
    }

    @Override // a.k5
    public final void k(w5 w5Var, y8b y8bVar) {
        yzr0 yzr0Var = w5Var instanceof yzr0 ? (yzr0) w5Var : null;
        if (yzr0Var != null) {
            d5e0 d5e0Var = yzr0Var.u;
            d5e0Var.c.setText(((xzr0) y8bVar).d);
            d5e0Var.b.getLayoutParams().width = -2;
        }
    }

    @Override // a.k5
    public final void l(w5 w5Var, y8b y8bVar) {
        if (y8bVar instanceof k5s0) {
            g5s0 g5s0Var = w5Var instanceof g5s0 ? (g5s0) w5Var : null;
            if (g5s0Var != null) {
                FrameLayout frameLayout = g5s0Var.u.b;
                Context context = frameLayout.getContext();
                context.getClass();
                g5s0Var.u(m5d.b(R.attr.uikitBackground, context));
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                } else {
                    layoutParams.width = -1;
                    frameLayout.setLayoutParams(layoutParams);
                    return;
                }
            }
            return;
        }
        if (y8bVar instanceof j5s0) {
            f5s0 f5s0Var = w5Var instanceof f5s0 ? (f5s0) w5Var : null;
            if (f5s0Var != null) {
                f5s0Var.v(((j5s0) y8bVar).b);
                return;
            }
            return;
        }
        if (y8bVar instanceof i5s0) {
            m5s0 m5s0Var = w5Var instanceof m5s0 ? (m5s0) w5Var : null;
            if (m5s0Var != null) {
                i5s0 i5s0Var = (i5s0) y8bVar;
                String str = i5s0Var.f;
                dc3 dc3Var = m5s0Var.u;
                DsTeamLogo dsTeamLogo = (DsTeamLogo) dc3Var.c;
                dsTeamLogo.setImageResource(R.drawable.no_photo_statistic);
                if (str.length() > 0) {
                    List list = u0d.f34849a;
                    u0d.m(dsTeamLogo, qzw.f29598a, vsm0.s(0L, str), R.drawable.no_photo_statistic);
                }
                ((TextView) dc3Var.d).setText(i5s0Var.d);
                ((TextView) dc3Var.e).setText(i5s0Var.h);
                s(i5s0Var.e, m5s0Var);
            }
            w5Var.f40887a.setOnClickListener(new bs50((Object) this, (Object) y8bVar, (byte) 19));
            return;
        }
        if (!(y8bVar instanceof h5s0)) {
            if (y8bVar instanceof l5s0) {
                f5s0 f5s0Var2 = w5Var instanceof f5s0 ? (f5s0) w5Var : null;
                if (f5s0Var2 != null) {
                    f5s0Var2.v(this.l.getContext().getResources().getDimensionPixelSize(R.dimen.size_50));
                    return;
                }
                return;
            }
            return;
        }
        e5s0 e5s0Var = w5Var instanceof e5s0 ? (e5s0) w5Var : null;
        if (e5s0Var != null) {
            h5s0 h5s0Var = (h5s0) y8bVar;
            qn5 qn5Var = e5s0Var.u;
            TextView textView = qn5Var.d;
            ConstraintLayout constraintLayout = qn5Var.b;
            textView.setText(h5s0Var.e);
            qn5Var.c.setText(h5s0Var.d);
            Context context2 = constraintLayout.getContext();
            context2.getClass();
            e5s0Var.u(m5d.b(R.attr.uikitBackgroundGroup, context2));
            ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            if (layoutParams2 == null) {
                hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            } else {
                layoutParams2.width = -1;
                constraintLayout.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // a.k5
    public final w5 m(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 4) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(vqd.d(viewGroup, R.dimen.size_10), vqd.d(viewGroup, R.dimen.size_42)));
            return new izr0(frameLayout);
        }
        if (i == 5) {
            return new jzr0(d5e0.c(layoutInflaterFrom, viewGroup));
        }
        if (i == 8) {
            FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
            Context context = frameLayout2.getContext();
            context.getClass();
            jmu0.j(frameLayout2, ColorStateList.valueOf(m5d.b(R.attr.uikitBackgroundGroupSecondary, context)));
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(vqd.d(viewGroup, R.dimen.size_10), vqd.d(viewGroup, R.dimen.size_50)));
            return new hzr0(frameLayout2);
        }
        if (i == 10) {
            FrameLayout frameLayout3 = new FrameLayout(viewGroup.getContext());
            frameLayout3.setLayoutParams(new FrameLayout.LayoutParams(vqd.d(viewGroup, R.dimen.size_10), vqd.d(viewGroup, R.dimen.size_50)));
            return new izr0(frameLayout3);
        }
        if (i == 11) {
            return new uzr0(iab.c(layoutInflaterFrom, viewGroup));
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.tournament_table_text_cell, viewGroup, false);
        if (viewInflate != null) {
            return new d8s0(new cck((TextView) viewInflate, (byte) 3));
        }
        hny.u("rootView");
        return null;
    }

    @Override // a.k5
    public final w5 n(ViewGroup viewGroup, int i) {
        return new yzr0(d5e0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }

    @Override // a.k5
    public final View o(ViewGroup viewGroup, y8b y8bVar) {
        y8bVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tournament_table_title_cell, viewGroup, false);
        viewInflate.getClass();
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return null;
        }
        layoutParams.height = 0;
        viewInflate.setLayoutParams(layoutParams);
        return viewInflate;
    }

    @Override // a.k5
    public final w5 p(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.group_row_header, viewGroup, false);
            if (viewInflate != null) {
                return new g5s0(new auh((FrameLayout) viewInflate, (byte) 5));
            }
            hny.u("rootView");
            return null;
        }
        if (i == 3) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.tournament_table_title_cell, viewGroup, false);
            int i2 = R.id.position;
            TextView textView = (TextView) yum0.f(viewInflate2, R.id.position);
            if (textView != null) {
                i2 = R.id.title;
                TextView textView2 = (TextView) yum0.f(viewInflate2, R.id.title);
                if (textView2 != null) {
                    return new e5s0(new qn5((ConstraintLayout) viewInflate2, textView, textView2, (byte) 2));
                }
            }
            hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
            return null;
        }
        if (i == 7) {
            View viewInflate3 = layoutInflaterFrom.inflate(R.layout.footer_row_header, viewGroup, false);
            if (viewInflate3 != null) {
                return new f5s0(new auh((FrameLayout) viewInflate3, (byte) 3));
            }
            hny.u("rootView");
            return null;
        }
        if (i != 9) {
            return new m5s0(dc3.f(layoutInflaterFrom, viewGroup));
        }
        View viewInflate4 = layoutInflaterFrom.inflate(R.layout.footer_row_header, viewGroup, false);
        if (viewInflate4 != null) {
            return new f5s0(new auh((FrameLayout) viewInflate4, (byte) 3));
        }
        hny.u("rootView");
        return null;
    }

    @Override // a.k5
    public final void r(TableViewImpl tableViewImpl) {
        this.l = tableViewImpl;
    }
}
