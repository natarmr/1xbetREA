package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class gpd implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11677a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ ObjectAnimator c;
    public final /* synthetic */ ObjectAnimator d;
    public final /* synthetic */ cp e;
    public final /* synthetic */ ObjectAnimator f;
    public final /* synthetic */ ObjectAnimator g;
    public final /* synthetic */ zz3 h;
    public final /* synthetic */ zz3 i;

    public /* synthetic */ gpd(cp cpVar, zz3 zz3Var, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, cp cpVar2, zz3 zz3Var2, ObjectAnimator objectAnimator3, ObjectAnimator objectAnimator4, byte b) {
        this.f11677a = b;
        this.b = cpVar;
        this.h = zz3Var;
        this.c = objectAnimator;
        this.d = objectAnimator2;
        this.e = cpVar2;
        this.i = zz3Var2;
        this.f = objectAnimator3;
        this.g = objectAnimator4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11677a;
        zz3 zz3Var = this.i;
        cp cpVar = this.e;
        zz3 zz3Var2 = this.h;
        cp cpVar2 = this.b;
        ObjectAnimator objectAnimator = this.c;
        ObjectAnimator objectAnimator2 = this.d;
        ObjectAnimator objectAnimator3 = this.f;
        ObjectAnimator objectAnimator4 = this.g;
        switch (b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (list.isEmpty()) {
                    cpd cpdVar = (cpd) cpVar2.u();
                    mtx mtxVar = (mtx) cpVar2.u;
                    TextView textView = mtxVar.n;
                    RoundCornerImageView roundCornerImageView = mtxVar.e;
                    zmk0 zmk0Var = cpdVar.b;
                    Context context = cpVar2.w;
                    textView.setText(zmk0Var.a(context));
                    mtxVar.r.setText(cpdVar.c.a(context));
                    mtxVar.q.setText(cpdVar.h.a(context));
                    mtxVar.u.setText(cpdVar.i.a(context));
                    mtxVar.l.setText(cpdVar.j.a(context));
                    ArrayList arrayList = cpdVar.k;
                    ((gkz) zz3Var2).A(arrayList);
                    zmk0 zmk0Var2 = cpdVar.l;
                    boolean zD = Intrinsics.d(zmk0Var2.f44630a, "");
                    Group group = mtxVar.c;
                    if (zD) {
                        group.setVisibility(8);
                    } else {
                        group.setVisibility(0);
                        mtxVar.k.setText(cpVar2.v(R.string.tennis_game_column));
                        mtxVar.p.setText(zmk0Var2.a(context));
                        mtxVar.t.setText(cpdVar.m.a(context));
                    }
                    mtxVar.b.setVisibility(cpdVar.p ? 0 : 8);
                    mtxVar.m.setText(cpVar2.v(R.string.dt_points));
                    mtxVar.o.setText(cpdVar.n.a(context));
                    mtxVar.s.setText(cpdVar.o.a(context));
                    mtxVar.j.y0(arrayList.size() - 1);
                    boolean z = cpdVar.q;
                    boolean z2 = cpdVar.r;
                    String str = cpdVar.d;
                    String str2 = cpdVar.f;
                    String str3 = cpdVar.e;
                    String str4 = cpdVar.g;
                    int dimensionPixelSize = z2 ? context.getResources().getDimensionPixelSize(R.dimen.icon_size_16) : context.getResources().getDimensionPixelSize(R.dimen.icon_size_20);
                    roundCornerImageView.getLayoutParams().height = dimensionPixelSize;
                    RoundCornerImageView roundCornerImageView2 = mtxVar.i;
                    RoundCornerImageView roundCornerImageView3 = mtxVar.f;
                    RoundCornerImageView roundCornerImageView4 = mtxVar.h;
                    roundCornerImageView.getLayoutParams().width = dimensionPixelSize;
                    roundCornerImageView4.getLayoutParams().height = dimensionPixelSize;
                    roundCornerImageView4.getLayoutParams().width = dimensionPixelSize;
                    if (z) {
                        roundCornerImageView.setImageResource(R.drawable.ic_glyph_color_logo_home);
                        roundCornerImageView4.setImageResource(R.drawable.ic_glyph_color_logo_away);
                    } else if (z2) {
                        List list2 = u0d.f34849a;
                        u0d.n(roundCornerImageView, str, 0, 11);
                        u0d.n(roundCornerImageView4, str2, 0, 11);
                        u0d.n(roundCornerImageView3, str3, 0, 11);
                        u0d.n(roundCornerImageView2, str4, 0, 11);
                        roundCornerImageView3.setVisibility(0);
                        roundCornerImageView2.setVisibility(0);
                    } else {
                        List list3 = u0d.f34849a;
                        u0d.n(roundCornerImageView, str, 0, 11);
                        u0d.n(roundCornerImageView4, str2, 0, 11);
                        roundCornerImageView3.setVisibility(8);
                        roundCornerImageView2.setVisibility(8);
                    }
                    hic.z(cpVar2, ((cpd) cpVar2.u()).s, objectAnimator, objectAnimator2);
                } else {
                    ArrayList<List> arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        obj2.getClass();
                        w3d.u(arrayList2, (Collection) obj2);
                    }
                    for (List list4 : arrayList2) {
                        ArrayList<ind> arrayList3 = new ArrayList();
                        for (Object obj3 : list4) {
                            if (obj3 instanceof ind) {
                                arrayList3.add(obj3);
                            }
                        }
                        for (ind indVar : arrayList3) {
                            gkz gkzVar = (gkz) zz3Var;
                            Context context2 = cpVar.w;
                            yfu0 yfu0Var = cpVar.u;
                            indVar.getClass();
                            if (indVar instanceof and) {
                                gkzVar.A(((and) indVar).f1145a);
                            } else if (indVar instanceof dnd) {
                                ((mtx) yfu0Var).q.setText(((dnd) indVar).f6363a.a(context2));
                            } else if (indVar instanceof gnd) {
                                ((mtx) yfu0Var).u.setText(((gnd) indVar).f11579a.a(context2));
                            } else if (indVar instanceof end) {
                                ((mtx) yfu0Var).p.setText(((end) indVar).f8089a.a(context2));
                            } else if (indVar instanceof hnd) {
                                ((mtx) yfu0Var).t.setText(((hnd) indVar).f13346a.a(context2));
                            } else if (indVar instanceof cnd) {
                                ((mtx) yfu0Var).o.setText(((cnd) indVar).f4647a.a(context2));
                            } else if (indVar instanceof fnd) {
                                ((mtx) yfu0Var).s.setText(((fnd) indVar).f9830a.a(context2));
                            } else if (indVar instanceof zmd) {
                                ((mtx) yfu0Var).b.setVisibility(((zmd) indVar).f44620a ? 0 : 8);
                            } else if (indVar instanceof ymd) {
                                hic.z(cpVar, ((ymd) indVar).f42882a, objectAnimator3, objectAnimator4);
                            } else {
                                if (!(indVar instanceof bnd)) {
                                    t9f.b();
                                    return null;
                                }
                                ucx.e0(((mtx) yfu0Var).j, ((bnd) indVar).f2877a);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            default:
                List list5 = (List) obj;
                list5.getClass();
                if (list5.isEmpty()) {
                    yf90 yf90Var = (yf90) cpVar2.u();
                    usx usxVar = (usx) cpVar2.u;
                    TextView textView2 = usxVar.n;
                    RoundCornerImageView roundCornerImageView5 = usxVar.f;
                    RoundCornerImageView roundCornerImageView6 = usxVar.i;
                    RoundCornerImageView roundCornerImageView7 = usxVar.h;
                    RoundCornerImageView roundCornerImageView8 = usxVar.e;
                    textView2.setText(yf90Var.f42530a);
                    usxVar.r.setText(yf90Var.b);
                    TextView textView3 = usxVar.q;
                    zmk0 zmk0Var3 = yf90Var.g;
                    Context context3 = cpVar2.w;
                    textView3.setText(zmk0Var3.a(context3));
                    usxVar.u.setText(yf90Var.h.a(context3));
                    usxVar.l.setText(yf90Var.i);
                    ArrayList arrayList4 = yf90Var.j;
                    ((gkz) zz3Var2).A(arrayList4);
                    zmk0 zmk0Var4 = yf90Var.k;
                    int length = zmk0Var4.f44630a.length();
                    Group group2 = usxVar.c;
                    if (length > 0) {
                        group2.setVisibility(0);
                        usxVar.k.setText(cpVar2.v(R.string.tennis_game_column));
                        usxVar.p.setText(zmk0Var4.a(context3));
                        usxVar.t.setText(yf90Var.l.a(context3));
                    } else {
                        group2.setVisibility(8);
                    }
                    usxVar.b.setVisibility(yf90Var.o ? 0 : 8);
                    usxVar.m.setText(cpVar2.v(R.string.dt_points));
                    usxVar.o.setText(yf90Var.m.a(context3));
                    usxVar.s.setText(yf90Var.n.a(context3));
                    usxVar.j.y0(arrayList4.size() - 1);
                    boolean z3 = yf90Var.p;
                    boolean z4 = yf90Var.q;
                    String str5 = yf90Var.c;
                    String str6 = yf90Var.e;
                    String str7 = yf90Var.d;
                    String str8 = yf90Var.f;
                    int dimensionPixelSize2 = usxVar.f36232a.getResources().getDimensionPixelSize(R.dimen.icon_size_20);
                    if (z3) {
                        roundCornerImageView8.setImageResource(R.drawable.ic_glyph_color_logo_home);
                        roundCornerImageView7.setImageResource(R.drawable.ic_glyph_color_logo_away);
                    } else if (z4) {
                        List list6 = u0d.f34849a;
                        u0d.n(roundCornerImageView8, str5, 0, 11);
                        u0d.n(roundCornerImageView7, str6, 0, 11);
                        u0d.n(roundCornerImageView5, str7, 0, 11);
                        u0d.n(roundCornerImageView6, str8, 0, 11);
                        roundCornerImageView8.getLayoutParams().height = dimensionPixelSize2;
                        roundCornerImageView8.getLayoutParams().width = dimensionPixelSize2;
                        roundCornerImageView7.getLayoutParams().height = dimensionPixelSize2;
                        roundCornerImageView7.getLayoutParams().width = dimensionPixelSize2;
                        roundCornerImageView5.setVisibility(0);
                        roundCornerImageView6.setVisibility(0);
                    } else {
                        List list7 = u0d.f34849a;
                        u0d.n(roundCornerImageView8, str5, 0, 11);
                        u0d.n(roundCornerImageView7, str6, 0, 11);
                        roundCornerImageView5.setVisibility(8);
                        roundCornerImageView6.setVisibility(8);
                    }
                    k7x.P(cpVar2, ((yf90) cpVar2.u()).r, objectAnimator, objectAnimator2);
                } else {
                    ArrayList<List> arrayList5 = new ArrayList();
                    for (Object obj4 : list5) {
                        obj4.getClass();
                        w3d.u(arrayList5, (Collection) obj4);
                    }
                    for (List list8 : arrayList5) {
                        ArrayList<dqa> arrayList6 = new ArrayList();
                        for (Object obj5 : list8) {
                            if (obj5 instanceof dqa) {
                                arrayList6.add(obj5);
                            }
                        }
                        for (dqa dqaVar : arrayList6) {
                            gkz gkzVar2 = (gkz) zz3Var;
                            Context context4 = cpVar.w;
                            yfu0 yfu0Var2 = cpVar.u;
                            dqaVar.getClass();
                            if (dqaVar instanceof vpa) {
                                gkzVar2.A(((vpa) dqaVar).f37795a);
                            } else if (dqaVar instanceof ypa) {
                                ((usx) yfu0Var2).q.setText(((ypa) dqaVar).f43022a.a(context4));
                            } else if (dqaVar instanceof bqa) {
                                ((usx) yfu0Var2).u.setText(((bqa) dqaVar).f3018a.a(context4));
                            } else if (dqaVar instanceof zpa) {
                                ((usx) yfu0Var2).p.setText(((zpa) dqaVar).f44750a.a(context4));
                            } else if (dqaVar instanceof cqa) {
                                ((usx) yfu0Var2).t.setText(((cqa) dqaVar).f4783a.a(context4));
                            } else if (dqaVar instanceof xpa) {
                                ((usx) yfu0Var2).o.setText(((xpa) dqaVar).f41259a.a(context4));
                            } else if (dqaVar instanceof aqa) {
                                ((usx) yfu0Var2).s.setText(((aqa) dqaVar).f1288a.a(context4));
                            } else if (dqaVar instanceof upa) {
                                ((usx) yfu0Var2).b.setVisibility(((upa) dqaVar).f36054a ? 0 : 8);
                            } else if (dqaVar instanceof tpa) {
                                k7x.P(cpVar, ((tpa) dqaVar).f34321a, objectAnimator3, objectAnimator4);
                            } else {
                                if (!(dqaVar instanceof wpa)) {
                                    t9f.b();
                                    return null;
                                }
                                ucx.e0(((usx) yfu0Var2).j, ((wpa) dqaVar).f39534a);
                            }
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
