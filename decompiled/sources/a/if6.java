package a;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit_sport.express_card.SportExpressCard;

/* JADX INFO: loaded from: classes6.dex */
public final class if6 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14672a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ cp c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public if6(gkz gkzVar, cp cpVar, gkz gkzVar2, cp cpVar2) {
        this.f14672a = (byte) 12;
        this.d = gkzVar;
        this.b = cpVar;
        this.e = gkzVar2;
        this.c = cpVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f14672a;
        byte b2 = 1;
        byte b3 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        cp cpVar = this.b;
        cp cpVar2 = this.c;
        switch (b) {
            case 0:
                List list = (List) obj;
                list.getClass();
                byte b4 = 25;
                if (list.isEmpty()) {
                    pkd.i(((pcu0) cpVar.u).b, null, new ugd(-1588724196, true, new sr1(cpVar, (uwe) obj3, b4)));
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        obj4.getClass();
                        w3d.u(arrayList, (Collection) obj4);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((km6) it.next()) == null) {
                            t9f.b();
                            return null;
                        }
                        pkd.i(((pcu0) cpVar2.u).b, null, new ugd(-1588724196, true, new sr1(cpVar2, (uwe) obj2, b4)));
                    }
                }
                return Unit.f46060a;
            case 1:
                List list2 = (List) obj;
                list2.getClass();
                if (list2.isEmpty()) {
                    gkz gkzVar = (gkz) obj3;
                    Object objU = cpVar.u();
                    Context context = cpVar.w;
                    yfu0 yfu0Var = cpVar.u;
                    xnd xndVar = (xnd) objU;
                    if (xndVar.h) {
                        ltx ltxVar = (ltx) yfu0Var;
                        ltxVar.b.setImageResource(R.drawable.ic_glyph_color_logo_home);
                        ltxVar.c.setImageResource(R.drawable.ic_glyph_color_logo_away);
                    } else {
                        List list3 = u0d.f34849a;
                        ltx ltxVar2 = (ltx) yfu0Var;
                        u0d.n(ltxVar2.b, xndVar.d, 0, 11);
                        u0d.n(ltxVar2.c, xndVar.e, 0, 11);
                    }
                    ltx ltxVar3 = (ltx) yfu0Var;
                    ltxVar3.e.setText(xndVar.b.a(context));
                    ltxVar3.g.setText(xndVar.c.a(context));
                    ltxVar3.f.setText(xndVar.f.a(context));
                    ltxVar3.h.setText(xndVar.g.a(context));
                    gkzVar.A(xndVar.i);
                } else {
                    ArrayList<List> arrayList2 = new ArrayList();
                    for (Object obj5 : list2) {
                        obj5.getClass();
                        w3d.u(arrayList2, (Collection) obj5);
                    }
                    for (List list4 : arrayList2) {
                        ArrayList<qmd> arrayList3 = new ArrayList();
                        for (Object obj6 : list4) {
                            if (obj6 instanceof qmd) {
                                arrayList3.add(obj6);
                            }
                        }
                        for (qmd qmdVar : arrayList3) {
                            gkz gkzVar2 = (gkz) obj2;
                            Context context2 = cpVar2.w;
                            yfu0 yfu0Var2 = cpVar2.u;
                            qmdVar.getClass();
                            if (qmdVar instanceof mmd) {
                                gkzVar2.A(((mmd) qmdVar).f22031a);
                            } else if (qmdVar instanceof omd) {
                                ((ltx) yfu0Var2).f.setText(((omd) qmdVar).f25497a.a(context2));
                            } else if (qmdVar instanceof pmd) {
                                ((ltx) yfu0Var2).h.setText(((pmd) qmdVar).f27226a.a(context2));
                            } else {
                                if (!(qmdVar instanceof nmd)) {
                                    t9f.b();
                                    return null;
                                }
                                ucx.e0(((ltx) yfu0Var2).d, ((nmd) qmdVar).f23765a);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 2:
                List list5 = (List) obj;
                yfu0 yfu0Var3 = cpVar2.u;
                yfu0 yfu0Var4 = cpVar.u;
                list5.getClass();
                if (!list5.isEmpty()) {
                    ArrayList<v5g> arrayList4 = new ArrayList();
                    for (Object obj7 : list5) {
                        obj7.getClass();
                        w3d.u(arrayList4, (Collection) obj7);
                    }
                    for (v5g v5gVar : arrayList4) {
                        if (v5gVar != null) {
                            if (v5gVar instanceof u5g) {
                                aac.N(cpVar2);
                            } else if (v5gVar instanceof r5g) {
                                aac.K(cpVar2);
                            } else if (v5gVar instanceof q5g) {
                                ((p5g) yfu0Var3).f.setText(((w5g) cpVar2.u()).e);
                            } else if (v5gVar instanceof t5g) {
                                aac.L(cpVar2);
                            } else if (v5gVar instanceof s5g) {
                                aac.M(((p5g) yfu0Var3).b, ((w5g) cpVar2.u()).f, (ArrayList) obj2);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                aac.N(cpVar);
                aac.K(cpVar);
                ((p5g) yfu0Var4).f.setText(((w5g) cpVar.u()).e);
                aac.L(cpVar);
                aac.M(((p5g) yfu0Var4).b, ((w5g) cpVar.u()).f, (ArrayList) obj3);
                sj3.L0(((p5g) yfu0Var4).d, 0, 0, 0, ((w5g) cpVar.u()).h, 7);
                return Unit.f46060a;
            case 3:
                List list6 = (List) obj;
                list6.getClass();
                if (!list6.isEmpty()) {
                    ArrayList<khj> arrayList5 = new ArrayList();
                    for (Object obj8 : list6) {
                        obj8.getClass();
                        w3d.u(arrayList5, (Collection) obj8);
                    }
                    for (khj khjVar : arrayList5) {
                        if (khjVar != null) {
                            if (khjVar instanceof ihj) {
                                vtb.e0(cpVar2);
                            } else if (khjVar instanceof hhj) {
                                vtb.f0(cpVar2);
                            } else if (khjVar instanceof jhj) {
                                vtb.d0(cpVar2, (x2i) obj2);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                vtb.e0(cpVar);
                vtb.f0(cpVar);
                vtb.d0(cpVar, (x2i) obj3);
                return Unit.f46060a;
            case 4:
                List list7 = (List) obj;
                yfu0 yfu0Var5 = cpVar2.u;
                yfu0 yfu0Var6 = cpVar.u;
                list7.getClass();
                if (!list7.isEmpty()) {
                    ArrayList<tpo> arrayList6 = new ArrayList();
                    for (Object obj9 : list7) {
                        obj9.getClass();
                        w3d.u(arrayList6, (Collection) obj9);
                    }
                    for (tpo tpoVar : arrayList6) {
                        if (tpoVar != null) {
                            if (tpoVar instanceof rpo) {
                                ((vtx) yfu0Var5).b.setCoefficient(((upo) cpVar2.u()).c);
                            } else if (tpoVar instanceof spo) {
                                ((vtx) yfu0Var5).b.setSportEventList(((upo) cpVar2.u()).f);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                SportExpressCard sportExpressCard = ((vtx) yfu0Var6).b;
                sportExpressCard.setStyle(((upo) cpVar.u()).i);
                String string = sportExpressCard.getContext().getString(R.string.express_final_coef);
                string.getClass();
                sportExpressCard.setMarketDescription(string);
                sportExpressCard.setOnClickListener(new jpe0(new lhf((wma0) obj3, cpVar, (byte) 23), (byte) 10));
                sportExpressCard.q = new lhf((wma0) obj2, cpVar, (byte) 24);
                ((vtx) yfu0Var6).b.setHeaderTitle(((upo) cpVar.u()).d);
                ((vtx) yfu0Var6).b.setCoefficient(((upo) cpVar.u()).c);
                ((vtx) yfu0Var6).b.setSportEventList(((upo) cpVar.u()).f);
                return Unit.f46060a;
            case 5:
                List list8 = (List) obj;
                list8.getClass();
                if (list8.isEmpty()) {
                    gkz gkzVar3 = (gkz) obj3;
                    Object objU2 = cpVar.u();
                    Context context3 = cpVar.w;
                    yfu0 yfu0Var7 = cpVar.u;
                    zsq zsqVar = (zsq) objU2;
                    if (zsqVar.i) {
                        qsx qsxVar = (qsx) yfu0Var7;
                        qsxVar.b.setImageResource(R.drawable.ic_glyph_color_logo_home);
                        qsxVar.c.setImageResource(R.drawable.ic_glyph_color_logo_away);
                    } else {
                        List list9 = u0d.f34849a;
                        qsx qsxVar2 = (qsx) yfu0Var7;
                        u0d.n(qsxVar2.b, zsqVar.c, 0, 11);
                        u0d.n(qsxVar2.c, zsqVar.d, 0, 11);
                    }
                    qsx qsxVar3 = (qsx) yfu0Var7;
                    qsxVar3.j.a(zsqVar.g);
                    qsxVar3.l.a(zsqVar.h);
                    qsxVar3.e.setText(zsqVar.f44916a);
                    qsxVar3.g.setText(zsqVar.b);
                    qsxVar3.f.setText(zsqVar.e.a(context3));
                    qsxVar3.h.setText(zsqVar.f.a(context3));
                    gkzVar3.A(zsqVar.j);
                } else {
                    ArrayList<List> arrayList7 = new ArrayList();
                    for (Object obj10 : list8) {
                        obj10.getClass();
                        w3d.u(arrayList7, (Collection) obj10);
                    }
                    for (List list10 : arrayList7) {
                        ArrayList<fpa> arrayList8 = new ArrayList();
                        for (Object obj11 : list10) {
                            if (obj11 instanceof fpa) {
                                arrayList8.add(obj11);
                            }
                        }
                        for (fpa fpaVar : arrayList8) {
                            gkz gkzVar4 = (gkz) obj2;
                            Context context4 = cpVar2.w;
                            yfu0 yfu0Var8 = cpVar2.u;
                            fpaVar.getClass();
                            if (fpaVar instanceof zoa) {
                                gkzVar4.A(((zoa) fpaVar).f44710a);
                            } else if (fpaVar instanceof bpa) {
                                ((qsx) yfu0Var8).j.a(((bpa) fpaVar).f2972a);
                            } else if (fpaVar instanceof cpa) {
                                ((qsx) yfu0Var8).f.setText(((cpa) fpaVar).f4736a.a(context4));
                            } else if (fpaVar instanceof dpa) {
                                ((qsx) yfu0Var8).l.a(((dpa) fpaVar).f6455a);
                            } else if (fpaVar instanceof epa) {
                                ((qsx) yfu0Var8).h.setText(((epa) fpaVar).f8175a.a(context4));
                            } else {
                                if (!(fpaVar instanceof apa)) {
                                    t9f.b();
                                    return null;
                                }
                                ucx.e0(((qsx) yfu0Var8).d, ((apa) fpaVar).f1242a);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 6:
                List list11 = (List) obj;
                yfu0 yfu0Var9 = cpVar.u;
                list11.getClass();
                if (!list11.isEmpty()) {
                    ArrayList<br10> arrayList9 = new ArrayList();
                    for (Object obj12 : list11) {
                        obj12.getClass();
                        w3d.u(arrayList9, (Collection) obj12);
                    }
                    for (br10 br10Var : arrayList9) {
                        er10 er10Var = (er10) cpVar2.u;
                        if (br10Var != null) {
                            if (br10Var instanceof ar10) {
                                DsCellRightSwitch dsCellRightSwitch = er10Var.c;
                                cr10 cr10Var = (cr10) cpVar2.u();
                                dsCellRightSwitch.setOnCheckedChangeListener(null);
                                dsCellRightSwitch.setChecked(cr10Var.d);
                                dsCellRightSwitch.setOnCheckedChangeListener(new okv(b2, (e000) obj2, cr10Var));
                            } else if (br10Var instanceof zq10) {
                                er10Var.f8260a.setEnabled(((cr10) cpVar2.u()).c);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                er10 er10Var2 = (er10) yfu0Var9;
                er10Var2.f8260a.setFirst(((cr10) cpVar.u()).e);
                er10Var2.f8260a.setLast(((cr10) cpVar.u()).f);
                er10Var2.b.setTitle(((cr10) cpVar.u()).b);
                ((er10) yfu0Var9).f8260a.setEnabled(((cr10) cpVar.u()).c);
                DsCellRightSwitch dsCellRightSwitch2 = er10Var2.c;
                cr10 cr10Var2 = (cr10) cpVar.u();
                dsCellRightSwitch2.setOnCheckedChangeListener(null);
                dsCellRightSwitch2.setChecked(cr10Var2.d);
                dsCellRightSwitch2.setOnCheckedChangeListener(new okv(b2, (e000) obj3, cr10Var2));
                return Unit.f46060a;
            case 7:
                List list12 = (List) obj;
                list12.getClass();
                if (list12.isEmpty()) {
                    ((bg5) obj3).A(((v4c0) cpVar.u()).f36770a);
                } else {
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj13 : list12) {
                        obj13.getClass();
                        w3d.u(arrayList10, (Collection) obj13);
                    }
                    Iterator it2 = arrayList10.iterator();
                    while (it2.hasNext()) {
                        if (((u4c0) it2.next()) != null) {
                            ((bg5) obj2).A(((v4c0) cpVar2.u()).f36770a);
                        }
                    }
                }
                return Unit.f46060a;
            case 8:
                List list13 = (List) obj;
                String str = (String) obj2;
                list13.getClass();
                if (!list13.isEmpty()) {
                    ArrayList<otc0> arrayList11 = new ArrayList();
                    for (Object obj14 : list13) {
                        obj14.getClass();
                        w3d.u(arrayList11, (Collection) obj14);
                    }
                    for (otc0 otc0Var : arrayList11) {
                        if (otc0Var != null) {
                            if (otc0Var instanceof ktc0) {
                                m2x.E(cpVar2);
                                m2x.F(cpVar2);
                            } else if (otc0Var instanceof itc0) {
                                m2x.E(cpVar2);
                            } else if (otc0Var instanceof jtc0) {
                                m2x.F(cpVar2);
                            } else if (otc0Var instanceof ltc0) {
                                m2x.G(cpVar2);
                            } else if (otc0Var instanceof mtc0) {
                                m2x.H(cpVar2, str);
                            } else if (otc0Var instanceof ntc0) {
                                m2x.H(cpVar2, str);
                                m2x.G(cpVar2);
                                m2x.F(cpVar2);
                                m2x.E(cpVar2);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                m2x.F(cpVar);
                m2x.E(cpVar);
                m2x.H(cpVar, (String) obj3);
                m2x.G(cpVar);
                return Unit.f46060a;
            case 9:
                List list14 = (List) obj;
                yfu0 yfu0Var10 = cpVar2.u;
                list14.getClass();
                if (!list14.isEmpty()) {
                    ArrayList<bth0> arrayList12 = new ArrayList();
                    for (Object obj15 : list14) {
                        obj15.getClass();
                        w3d.u(arrayList12, (Collection) obj15);
                    }
                    for (bth0 bth0Var : arrayList12) {
                        if (bth0Var != null) {
                            if (bth0Var instanceof xsh0) {
                                ((xku0) yfu0Var10).d.setOnCheckedChangeListener(null);
                                xku0 xku0Var = (xku0) yfu0Var10;
                                xku0Var.d.setChecked(((xsh0) bth0Var).f41417a);
                                wwb.D(xku0Var.d, new mth0((gwg0) obj2, cpVar2, b3));
                            } else if (bth0Var instanceof ysh0) {
                                ((xku0) yfu0Var10).c.setSubtitle(((ysh0) bth0Var).f43168a);
                                ((xku0) yfu0Var10).c.setTitleMaxLinesForce(2);
                            } else if (bth0Var instanceof ath0) {
                                ((xku0) yfu0Var10).c.setStatus(((ath0) bth0Var).f1433a);
                            } else if (bth0Var instanceof zsh0) {
                                ((xku0) yfu0Var10).d.setEnabled(((zsh0) bth0Var).f44905a);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                yfu0 yfu0Var11 = cpVar.u;
                ((xku0) yfu0Var11).b.setIconDrawable(epv0.U(((cth0) cpVar.u()).c, cpVar.f40887a.getContext()));
                xku0 xku0Var2 = (xku0) yfu0Var11;
                xku0Var2.c.setTitle(((cth0) cpVar.u()).d);
                xku0Var2.c.setSubtitle(((cth0) cpVar.u()).e);
                xku0Var2.c.setStatus(((cth0) cpVar.u()).i);
                xku0Var2.d.setOnCheckedChangeListener(null);
                xku0Var2.d.setChecked(((cth0) cpVar.u()).g);
                xku0Var2.d.setEnabled(((cth0) cpVar.u()).h);
                wwb.D(xku0Var2.d, new mth0((gwg0) obj3, cpVar, b2));
                xku0Var2.c.setTitleMaxLinesForce(2);
                xku0Var2.f41046a.setFirst(((cth0) cpVar.u()).j);
                xku0Var2.f41046a.setLast(((cth0) cpVar.u()).k);
                return Unit.f46060a;
            case 10:
                List list15 = (List) obj;
                list15.getClass();
                if (!list15.isEmpty()) {
                    ArrayList<g3j0> arrayList13 = new ArrayList();
                    for (Object obj16 : list15) {
                        obj16.getClass();
                        w3d.u(arrayList13, (Collection) obj16);
                    }
                    for (g3j0 g3j0Var : arrayList13) {
                        if (g3j0Var != null) {
                            if (g3j0Var instanceof e3j0) {
                                c9x.p(cpVar2, (j3j0) obj2);
                            } else if (g3j0Var instanceof f3j0) {
                                c9x.q(cpVar2);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                c9x.p(cpVar, (j3j0) obj3);
                c9x.q(cpVar);
                return Unit.f46060a;
            case 11:
                List list16 = (List) obj;
                list16.getClass();
                if (!list16.isEmpty()) {
                    ArrayList<n4j0> arrayList14 = new ArrayList();
                    for (Object obj17 : list16) {
                        obj17.getClass();
                        w3d.u(arrayList14, (Collection) obj17);
                    }
                    for (n4j0 n4j0Var : arrayList14) {
                        if (n4j0Var != null) {
                            if (n4j0Var instanceof k4j0) {
                                k9x.D(cpVar2, (j3j0) obj2);
                            } else if (n4j0Var instanceof i4j0) {
                                k9x.z(cpVar2);
                            } else if (n4j0Var instanceof j4j0) {
                                k9x.A(cpVar2);
                            } else if (n4j0Var instanceof l4j0) {
                                k9x.B(cpVar2);
                            } else if (n4j0Var instanceof m4j0) {
                                k9x.C(cpVar2);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                k9x.D(cpVar, (j3j0) obj3);
                k9x.z(cpVar);
                k9x.A(cpVar);
                k9x.B(cpVar);
                k9x.C(cpVar);
                return Unit.f46060a;
            default:
                List list17 = (List) obj;
                yfu0 yfu0Var12 = cpVar2.u;
                list17.getClass();
                if (!list17.isEmpty()) {
                    ArrayList<List> arrayList15 = new ArrayList();
                    for (Object obj18 : list17) {
                        obj18.getClass();
                        w3d.u(arrayList15, (Collection) obj18);
                    }
                    for (List list18 : arrayList15) {
                        ArrayList<gqa> arrayList16 = new ArrayList();
                        for (Object obj19 : list18) {
                            if (obj19 instanceof gqa) {
                                arrayList16.add(obj19);
                            }
                        }
                        for (gqa gqaVar : arrayList16) {
                            if (gqaVar != null) {
                                if (gqaVar instanceof fqa) {
                                    ((gkz) obj2).A(((fqa) gqaVar).f9964a);
                                    RecyclerView recyclerView = ((wsx) yfu0Var12).c;
                                    recyclerView.post(new jto(recyclerView, ((wsx) yfu0Var12).b, ((yrj0) cpVar2.u()).f, ((yrj0) cpVar2.u()).e.size()));
                                } else if (gqaVar instanceof eqa) {
                                    ((wsx) yfu0Var12).b.a(((eqa) gqaVar).f8228a);
                                }
                            }
                            t9f.b();
                            return null;
                        }
                    }
                }
                Object objU3 = cpVar.u();
                yfu0 yfu0Var13 = cpVar.u;
                ((gkz) obj3).A(((yrj0) objU3).e);
                wsx wsxVar = (wsx) yfu0Var13;
                if (((yrj0) cpVar.u()).d) {
                    ((RoundCornerImageView) wsxVar.d.e).setImageResource(R.drawable.ic_glyph_color_logo_home);
                    ((RoundCornerImageView) wsxVar.e.e).setImageResource(R.drawable.ic_glyph_color_logo_away);
                } else {
                    yrj0 yrj0Var = (yrj0) cpVar.u();
                    boolean z = yrj0Var.c;
                    List list19 = yrj0Var.b;
                    List list20 = yrj0Var.f43124a;
                    if (z) {
                        jk3 jk3Var = wsxVar.d;
                        ((RoundCornerImageView) jk3Var.e).setVisibility(8);
                        ((LinearLayout) jk3Var.f).setVisibility(0);
                        a8k0.Q(q3d.j((RoundCornerImageView) jk3Var.c, (RoundCornerImageView) jk3Var.d), list20);
                        jk3 jk3Var2 = wsxVar.e;
                        ((RoundCornerImageView) jk3Var2.e).setVisibility(8);
                        ((LinearLayout) jk3Var2.f).setVisibility(0);
                        a8k0.Q(q3d.j((RoundCornerImageView) jk3Var2.c, (RoundCornerImageView) jk3Var2.d), list19);
                    } else {
                        List list21 = u0d.f34849a;
                        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) wsxVar.d.e;
                        String str2 = (String) CollectionsKt.firstOrNull(list20);
                        if (str2 == null) {
                            str2 = "";
                        }
                        u0d.n(roundCornerImageView, str2, 0, 11);
                        RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) wsxVar.e.e;
                        String str3 = (String) CollectionsKt.firstOrNull(list19);
                        u0d.n(roundCornerImageView2, str3 != null ? str3 : "", 0, 11);
                    }
                    wsxVar.b.a(((yrj0) cpVar.u()).g);
                    RecyclerView recyclerView2 = wsxVar.c;
                    recyclerView2.post(new jto(recyclerView2, wsxVar.b, ((yrj0) cpVar.u()).f, ((yrj0) cpVar.u()).e.size()));
                    wsxVar.f39713a.setLayoutDirection(((yrj0) cpVar.u()).h ? 2 : 0);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ if6(cp cpVar, Object obj, cp cpVar2, Object obj2, byte b) {
        this.f14672a = b;
        this.b = cpVar;
        this.d = obj;
        this.c = cpVar2;
        this.e = obj2;
    }

    public if6(cp cpVar, wma0 wma0Var, wma0 wma0Var2, cp cpVar2) {
        this.f14672a = (byte) 4;
        this.b = cpVar;
        this.d = wma0Var;
        this.e = wma0Var2;
        this.c = cpVar2;
    }
}
