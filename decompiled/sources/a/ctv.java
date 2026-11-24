package a;

import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItem;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItemClickable;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes5.dex */
public final class ctv implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4962a;
    public final /* synthetic */ cp b;
    public final /* synthetic */ cp c;

    public /* synthetic */ ctv(cp cpVar, cp cpVar2, byte b) {
        this.f4962a = b;
        this.b = cpVar;
        this.c = cpVar2;
    }

    private final Object a(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<g5c0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (g5c0 g5c0Var : arrayList) {
                if (g5c0Var != null) {
                    if ((g5c0Var instanceof z4c0) || (g5c0Var instanceof d5c0)) {
                        x8x.x(cpVar);
                    } else if (g5c0Var instanceof a5c0) {
                        ((r2k) yfu0Var).c.setVisibility(((h5c0) cpVar.u()).c ? 0 : 8);
                    } else if (g5c0Var instanceof c5c0) {
                        ((r2k) yfu0Var).b.setVisibility(((h5c0) cpVar.u()).d ? 0 : 8);
                    } else if (g5c0Var instanceof b5c0) {
                        ((r2k) yfu0Var).b.setLoading(((h5c0) cpVar.u()).e);
                    } else if (g5c0Var instanceof f5c0) {
                        x8x.y(cpVar);
                    } else if (g5c0Var instanceof e5c0) {
                        ((r2k) yfu0Var).e.setItems(((h5c0) cpVar.u()).g);
                    }
                }
                t9f.b();
                return null;
            }
        }
        x8x.x(cpVar2);
        ((r2k) yfu0Var2).c.setVisibility(((h5c0) cpVar2.u()).c ? 0 : 8);
        ((r2k) yfu0Var2).b.setVisibility(((h5c0) cpVar2.u()).d ? 0 : 8);
        ((r2k) yfu0Var2).b.setLoading(((h5c0) cpVar2.u()).e);
        x8x.y(cpVar2);
        ((r2k) yfu0Var2).e.setItems(((h5c0) cpVar2.u()).g);
        return Unit.f46060a;
    }

    private final Object b(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            WebGamesGameCollection webGamesGameCollection = ((v2k) cpVar.u).b;
            ArrayList arrayList = ((n7c0) cpVar.u()).f23035a;
            int i = WebGamesGameCollection.o2;
            yge0 adapter = webGamesGameCollection.getAdapter();
            adapter.getClass();
            ((o4s) adapter).H(arrayList, null);
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList2, (Collection) obj2);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((m7c0) it.next()) != null) {
                    cp cpVar2 = this.c;
                    WebGamesGameCollection webGamesGameCollection2 = ((v2k) cpVar2.u).b;
                    ArrayList arrayList3 = ((n7c0) cpVar2.u()).f23035a;
                    int i2 = WebGamesGameCollection.o2;
                    yge0 adapter2 = webGamesGameCollection2.getAdapter();
                    adapter2.getClass();
                    ((o4s) adapter2).H(arrayList3, null);
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<ffg0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (ffg0 ffg0Var : arrayList) {
                if (ffg0Var != null) {
                    if (ffg0Var instanceof cfg0) {
                        ((o7o0) yfu0Var).b.setText(((gfg0) cpVar.u()).b);
                    } else if (ffg0Var instanceof dfg0) {
                        ((o7o0) yfu0Var).c.setText(((gfg0) cpVar.u()).c);
                    } else if (ffg0Var instanceof efg0) {
                        jmu0.j(((o7o0) yfu0Var).c, jiq0.n0(((gfg0) cpVar.u()).d, cpVar.w));
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((o7o0) yfu0Var2).b.setText(((gfg0) cpVar2.u()).b);
        ((o7o0) yfu0Var2).c.setText(((gfg0) cpVar2.u()).c);
        jmu0.j(((o7o0) yfu0Var2).c, jiq0.n0(((gfg0) cpVar2.u()).d, cpVar2.w));
        return Unit.f46060a;
    }

    private final Object g(Object obj) {
        List list = (List) obj;
        cp cpVar = this.c;
        Context context = cpVar.w;
        yfu0 yfu0Var = cpVar.u;
        cp cpVar2 = this.b;
        Context context2 = cpVar2.w;
        yfu0 yfu0Var2 = cpVar2.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<brf> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (brf brfVar : arrayList) {
                if (brfVar != null) {
                    if (brfVar instanceof xqf) {
                        ((bth) yfu0Var).d.setText(((crf) cpVar.u()).b);
                    } else if (brfVar instanceof yqf) {
                        FrameLayout frameLayout = ((bth) yfu0Var).c;
                        frameLayout.setAlpha(1.0f);
                    } else if (brfVar instanceof wqf) {
                        bdx.W(cpVar);
                    } else if (brfVar instanceof zqf) {
                        bdx.X(cpVar);
                    } else if (brfVar instanceof vqf) {
                        List list2 = u0d.f34849a;
                        u0d.i(((bth) yfu0Var).b, ((crf) cpVar.u()).e);
                    } else if (brfVar instanceof tqf) {
                        bdx.T(cpVar);
                    } else if (brfVar instanceof arf) {
                        ((bth) yfu0Var).e.setBackgroundTintList(jiq0.n0(((crf) cpVar.u()).g, context));
                    } else if (brfVar instanceof uqf) {
                        ((bth) yfu0Var).d.setTextColor(jiq0.n0(((crf) cpVar.u()).h, context));
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((bth) yfu0Var2).d.setText(((crf) cpVar2.u()).b);
        bdx.W(cpVar2);
        ((bth) yfu0Var2).d.setTextColor(jiq0.n0(((crf) cpVar2.u()).h, context2));
        FrameLayout frameLayout2 = ((bth) yfu0Var2).c;
        frameLayout2.setAlpha(1.0f);
        List list3 = u0d.f34849a;
        u0d.i(((bth) yfu0Var2).b, ((crf) cpVar2.u()).e);
        bdx.X(cpVar2);
        bdx.T(cpVar2);
        ((bth) yfu0Var2).e.setBackgroundTintList(jiq0.n0(((crf) cpVar2.u()).g, context2));
        return Unit.f46060a;
    }

    private final Object h(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (list.isEmpty()) {
            cp cpVar = this.b;
            yfu0 yfu0Var = cpVar.u;
            ((exx) yfu0Var).c.setTitle(((jui0) cpVar.u()).f17155a);
            exx exxVar = (exx) yfu0Var;
            exxVar.b.setChecked(((jui0) cpVar.u()).b);
            exxVar.d.setVisibility(!((jui0) cpVar.u()).d ? 0 : 8);
            exxVar.e.setFirst(((jui0) cpVar.u()).e);
            exxVar.e.setLast(((jui0) cpVar.u()).d);
            exxVar.e.setEnabled(((jui0) cpVar.u()).c);
        } else {
            ArrayList<List> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (List list2 : arrayList) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof fwi0) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((exx) this.c.u).b.setChecked(((fwi0) it.next()).f10262a);
                }
            }
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj) {
        List list = (List) obj;
        cp cpVar = this.b;
        yfu0 yfu0Var = cpVar.u;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<szi0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (szi0 szi0Var : arrayList) {
                if (szi0Var != null) {
                    boolean z = szi0Var instanceof qzi0;
                    cp cpVar2 = this.c;
                    if (z) {
                        g8x.v(cpVar2);
                    } else if (szi0Var instanceof rzi0) {
                        kxx kxxVar = (kxx) cpVar2.u;
                        kxxVar.c.setSubtitleVisible(true);
                        kxxVar.c.setSubtitle(((tzi0) cpVar2.u()).f34806a);
                    }
                }
                t9f.b();
                return null;
            }
        }
        ((kxx) yfu0Var).b.setImageResource(R.drawable.ic_glyph_device);
        ((kxx) yfu0Var).c.setTitle(cpVar.w.getString(R.string.app_version_title));
        kxx kxxVar2 = (kxx) yfu0Var;
        kxxVar2.c.setSubtitleVisible(true);
        kxxVar2.c.setSubtitle(((tzi0) cpVar.u()).f34806a);
        g8x.v(cpVar);
        return Unit.f46060a;
    }

    private final Object l(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<c2j0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (c2j0 c2j0Var : arrayList) {
                if (c2j0Var != null) {
                    boolean z = c2j0Var instanceof b2j0;
                    cp cpVar = this.c;
                    if (z) {
                        ((g2j0) cpVar.u).b.setText(((d2j0) cpVar.u()).b);
                    } else if (c2j0Var instanceof a2j0) {
                        r8x.D(cpVar);
                    }
                }
                t9f.b();
                return null;
            }
        }
        cp cpVar2 = this.b;
        r8x.D(cpVar2);
        ((g2j0) cpVar2.u).b.setText(((d2j0) cpVar2.u()).b);
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<p3j0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (p3j0 p3j0Var : arrayList) {
                if (p3j0Var != null) {
                    boolean z = p3j0Var instanceof o3j0;
                    cp cpVar = this.c;
                    if (z) {
                        d9x.H(cpVar);
                    } else if (p3j0Var instanceof n3j0) {
                        d9x.G(cpVar);
                    } else if (p3j0Var instanceof m3j0) {
                        d9x.F(cpVar);
                    }
                }
                t9f.b();
                return null;
            }
        }
        cp cpVar2 = this.b;
        d9x.H(cpVar2);
        d9x.G(cpVar2);
        d9x.F(cpVar2);
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<w3j0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (w3j0 w3j0Var : arrayList) {
                if (w3j0Var != null) {
                    boolean z = w3j0Var instanceof v3j0;
                    cp cpVar = this.c;
                    if (z) {
                        e9x.H(cpVar);
                    } else if (w3j0Var instanceof u3j0) {
                        e9x.G(cpVar);
                    }
                }
                t9f.b();
                return null;
            }
        }
        cp cpVar2 = this.b;
        e9x.H(cpVar2);
        e9x.G(cpVar2);
        return Unit.f46060a;
    }

    private final Object p(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<a6j0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (a6j0 a6j0Var : arrayList) {
                if (a6j0Var != null) {
                    boolean z = a6j0Var instanceof y5j0;
                    cp cpVar = this.c;
                    if (z) {
                        ((c6j0) cpVar.u).b.setText(((b6j0) cpVar.u()).b);
                    } else if (a6j0Var instanceof z5j0) {
                        t9x.B(cpVar);
                    }
                }
                t9f.b();
                return null;
            }
        }
        cp cpVar2 = this.b;
        t9x.B(cpVar2);
        ((c6j0) cpVar2.u).b.setText(((b6j0) cpVar2.u()).b);
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        List list = (List) obj;
        list.getClass();
        if (!list.isEmpty()) {
            ArrayList<l9j0> arrayList = new ArrayList();
            for (Object obj2 : list) {
                obj2.getClass();
                w3d.u(arrayList, (Collection) obj2);
            }
            for (l9j0 l9j0Var : arrayList) {
                if (l9j0Var != null) {
                    boolean z = l9j0Var instanceof j9j0;
                    cp cpVar = this.c;
                    if (z) {
                        bdx.U(cpVar);
                    } else if (l9j0Var instanceof k9j0) {
                        bdx.V(cpVar);
                    }
                }
                t9f.b();
                return null;
            }
        }
        cp cpVar2 = this.b;
        bdx.U(cpVar2);
        kxx kxxVar = (kxx) cpVar2.u;
        kxxVar.b.setImageResource(((z9j0) cpVar2.u()).b());
        kxxVar.c.setTitle(((z9j0) cpVar2.u()).getTitle());
        bdx.V(cpVar2);
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4962a;
        cp cpVar = this.b;
        cp cpVar2 = this.c;
        switch (b) {
            case 0:
                List list = (List) obj;
                yfu0 yfu0Var = cpVar2.u;
                yfu0 yfu0Var2 = cpVar.u;
                list.getClass();
                if (!list.isEmpty()) {
                    ArrayList<ksv> arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        obj2.getClass();
                        w3d.u(arrayList, (Collection) obj2);
                    }
                    for (ksv ksvVar : arrayList) {
                        if (ksvVar != null) {
                            if (ksvVar instanceof isv) {
                                ((kth) yfu0Var).b.setText(((osv) cpVar2.u()).b);
                            } else if (ksvVar instanceof jsv) {
                                ((kth) yfu0Var).b.setTextColor(sj3.P(((osv) cpVar2.u()).c, cpVar2.w));
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((kth) yfu0Var2).b.setText(((osv) cpVar.u()).b);
                ((kth) yfu0Var2).b.setTextColor(sj3.P(((osv) cpVar.u()).c, cpVar.w));
                return Unit.f46060a;
            case 1:
                List list2 = (List) obj;
                yfu0 yfu0Var3 = cpVar2.u;
                yfu0 yfu0Var4 = cpVar.u;
                list2.getClass();
                if (!list2.isEmpty()) {
                    ArrayList<vmh0> arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        obj3.getClass();
                        w3d.u(arrayList2, (Collection) obj3);
                    }
                    for (vmh0 vmh0Var : arrayList2) {
                        if (vmh0Var != null) {
                            if (vmh0Var instanceof rmh0) {
                                DsHeader dsHeader = ((yth) yfu0Var3).b;
                                dsHeader.setButtonLabel("");
                            } else if (vmh0Var instanceof smh0) {
                                DsHeader dsHeader2 = ((yth) yfu0Var3).b;
                                w0i w0iVar = dsHeader2.d;
                                if (w0iVar != null) {
                                    w0iVar.b(false);
                                }
                            } else if (vmh0Var instanceof tmh0) {
                                ((yth) yfu0Var3).b.setLabel(((wmh0) cpVar2.u()).b);
                            } else if (vmh0Var instanceof umh0) {
                                DsHeader dsHeader3 = ((yth) yfu0Var3).b;
                                Resources resources = cpVar2.w.getResources();
                                sj3.L0(dsHeader3, 0, resources.getDimensionPixelSize(R.dimen.space_8), 0, 0, 13);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                DsHeader dsHeader4 = ((yth) yfu0Var4).b;
                String str = ((wmh0) cpVar.u()).b;
                dsHeader4.setModel(new nrv(str, false, null, "", null, null, null, 244));
                DsHeader dsHeader5 = ((yth) yfu0Var4).b;
                Resources resources2 = cpVar.w.getResources();
                sj3.L0(dsHeader5, 0, resources2.getDimensionPixelSize(R.dimen.space_8), 0, 0, 13);
                return Unit.f46060a;
            case 2:
                List list3 = (List) obj;
                yfu0 yfu0Var5 = cpVar2.u;
                yfu0 yfu0Var6 = cpVar.u;
                list3.getClass();
                if (!list3.isEmpty()) {
                    ArrayList<bax> arrayList3 = new ArrayList();
                    for (Object obj4 : list3) {
                        obj4.getClass();
                        w3d.u(arrayList3, (Collection) obj4);
                    }
                    for (bax baxVar : arrayList3) {
                        if (baxVar != null) {
                            if (baxVar instanceof aax) {
                                ((svx) yfu0Var5).b.setTitle(((cax) cpVar2.u()).b);
                            } else if (baxVar instanceof z9x) {
                                ((svx) yfu0Var5).b.setIconResource(((cax) cpVar2.u()).c);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((svx) yfu0Var6).b.setTitle(((cax) cpVar.u()).b);
                ((svx) yfu0Var6).b.setIconResource(((cax) cpVar.u()).c);
                return Unit.f46060a;
            case 3:
                List list4 = (List) obj;
                yfu0 yfu0Var7 = cpVar2.u;
                yfu0 yfu0Var8 = cpVar.u;
                list4.getClass();
                if (!list4.isEmpty()) {
                    ArrayList<bax> arrayList4 = new ArrayList();
                    for (Object obj5 : list4) {
                        obj5.getClass();
                        w3d.u(arrayList4, (Collection) obj5);
                    }
                    for (bax baxVar2 : arrayList4) {
                        if (baxVar2 != null) {
                            if (baxVar2 instanceof aax) {
                                ((rvx) yfu0Var7).c.setTitle(((cax) cpVar2.u()).b);
                            } else if (baxVar2 instanceof z9x) {
                                ((rvx) yfu0Var7).b.setIconResource(((cax) cpVar2.u()).c);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((rvx) yfu0Var8).c.setTitle(((cax) cpVar.u()).b);
                ((rvx) yfu0Var8).b.setIconResource(((cax) cpVar.u()).c);
                return Unit.f46060a;
            case 4:
                List list5 = (List) obj;
                list5.getClass();
                if (!list5.isEmpty()) {
                    ArrayList<foz> arrayList5 = new ArrayList();
                    for (Object obj6 : list5) {
                        obj6.getClass();
                        w3d.u(arrayList5, (Collection) obj6);
                    }
                    for (foz fozVar : arrayList5) {
                        if (fozVar != null) {
                            if (fozVar instanceof eoz) {
                                ((wvx) cpVar2.u).e.setText(((goz) cpVar2.u()).b);
                            } else if (fozVar instanceof aoz) {
                                x2x.A(cpVar2);
                            } else if (fozVar instanceof coz) {
                                x2x.C(cpVar2);
                            } else if (fozVar instanceof boz) {
                                x2x.B(cpVar2);
                            } else if (fozVar instanceof doz) {
                                x2x.D(cpVar2);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((wvx) cpVar.u).e.setText(((goz) cpVar.u()).b);
                x2x.A(cpVar);
                x2x.C(cpVar);
                x2x.B(cpVar);
                x2x.D(cpVar);
                return Unit.f46060a;
            case 5:
                List list6 = (List) obj;
                yfu0 yfu0Var9 = cpVar2.u;
                yfu0 yfu0Var10 = cpVar.u;
                list6.getClass();
                if (!list6.isEmpty()) {
                    ArrayList<fsz> arrayList6 = new ArrayList();
                    for (Object obj7 : list6) {
                        obj7.getClass();
                        w3d.u(arrayList6, (Collection) obj7);
                    }
                    for (fsz fszVar : arrayList6) {
                        if (fszVar != null) {
                            if (fszVar instanceof esz) {
                                ((cxx) yfu0Var9).c.setText(((gsz) cpVar2.u()).f11855a.a(cpVar2.w));
                            } else if (fszVar instanceof dsz) {
                                ((cxx) yfu0Var9).b.setChecked(((gsz) cpVar2.u()).b);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((cxx) yfu0Var10).c.setText(((gsz) cpVar.u()).f11855a.a(cpVar.w));
                ((cxx) yfu0Var10).b.setChecked(((gsz) cpVar.u()).b);
                return Unit.f46060a;
            case 6:
                List list7 = (List) obj;
                yfu0 yfu0Var11 = cpVar.u;
                yfu0 yfu0Var12 = cpVar2.u;
                list7.getClass();
                if (!list7.isEmpty()) {
                    ArrayList<cx20> arrayList7 = new ArrayList();
                    for (Object obj8 : list7) {
                        obj8.getClass();
                        w3d.u(arrayList7, (Collection) obj8);
                    }
                    for (cx20 cx20Var : arrayList7) {
                        if (cx20Var != null) {
                            if (cx20Var instanceof bx20) {
                                ydx.w(cpVar2);
                                ydx.z(cpVar2);
                            } else if (cx20Var instanceof yw20) {
                                ((ex20) yfu0Var12).b.setText(((dx20) cpVar2.u()).c);
                            } else if (cx20Var instanceof zw20) {
                                ((ex20) yfu0Var12).c.setText(((dx20) cpVar2.u()).f6826a);
                            } else if (cx20Var instanceof ax20) {
                                ydx.z(cpVar2);
                            } else if (cx20Var instanceof xw20) {
                                ydx.w(cpVar2);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((ex20) yfu0Var11).b.setText(((dx20) cpVar.u()).c);
                ((ex20) yfu0Var11).c.setText(((dx20) cpVar.u()).f6826a);
                ydx.w(cpVar);
                ydx.z(cpVar);
                return Unit.f46060a;
            case 7:
                List list8 = (List) obj;
                list8.getClass();
                if (list8.isEmpty()) {
                    je90 je90Var = (je90) cpVar.u();
                    owx owxVar = (owx) cpVar.u;
                    owxVar.b.setText(je90Var.f16363a);
                    TextView textView = owxVar.c;
                    zmk0 zmk0Var = je90Var.b;
                    Context context = cpVar.w;
                    textView.setText(zmk0Var.a(context));
                    owxVar.d.setText(je90Var.c.a(context));
                } else {
                    ArrayList<ie90> arrayList8 = new ArrayList();
                    for (Object obj9 : list8) {
                        obj9.getClass();
                        w3d.u(arrayList8, (Collection) obj9);
                    }
                    for (ie90 ie90Var : arrayList8) {
                        Context context2 = cpVar2.w;
                        yfu0 yfu0Var13 = cpVar2.u;
                        ie90Var.getClass();
                        if (ie90Var instanceof ge90) {
                            ((owx) yfu0Var13).c.setText(((ge90) ie90Var).f11142a.a(context2));
                        } else if (ie90Var instanceof he90) {
                            ((owx) yfu0Var13).d.setText(((he90) ie90Var).f12912a.a(context2));
                        } else {
                            if (!(ie90Var instanceof fe90)) {
                                t9f.b();
                                return null;
                            }
                            ((owx) yfu0Var13).b.setText(((fe90) ie90Var).f9396a);
                        }
                    }
                }
                return Unit.f46060a;
            case 8:
                List list9 = (List) obj;
                yfu0 yfu0Var14 = cpVar2.u;
                yfu0 yfu0Var15 = cpVar.u;
                list9.getClass();
                if (!list9.isEmpty()) {
                    ArrayList<ul90> arrayList9 = new ArrayList();
                    for (Object obj10 : list9) {
                        obj10.getClass();
                        w3d.u(arrayList9, (Collection) obj10);
                    }
                    for (ul90 ul90Var : arrayList9) {
                        if (ul90Var != null) {
                            if (ul90Var instanceof pl90) {
                                b8k0.s(cpVar2);
                            } else if (ul90Var instanceof rl90) {
                                b8k0.u(cpVar2);
                            } else if (ul90Var instanceof sl90) {
                                ((cfx) yfu0Var14).b.setCodeText(((xl90) cpVar2.u()).h);
                            } else if (ul90Var instanceof ol90) {
                                ((cfx) yfu0Var14).b.setCodeStartIcon(((xl90) cpVar2.u()).f);
                            } else if (ul90Var instanceof tl90) {
                                ((cfx) yfu0Var14).b.setPhonePlaceholder(((xl90) cpVar2.u()).g);
                            } else if (ul90Var instanceof ql90) {
                                b8k0.t(cpVar2);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                b8k0.s(cpVar);
                b8k0.u(cpVar);
                b8k0.t(cpVar);
                ((cfx) yfu0Var15).b.setCodeText(((xl90) cpVar.u()).h);
                ((cfx) yfu0Var15).b.setCodeStartIcon(((xl90) cpVar.u()).f);
                ((cfx) yfu0Var15).b.setPhonePlaceholder(((xl90) cpVar.u()).g);
                return Unit.f46060a;
            case 9:
                List list10 = (List) obj;
                list10.getClass();
                if (list10.isEmpty()) {
                    ProfileEditUiModelItemClickable profileEditUiModelItemClickable = (ProfileEditUiModelItemClickable) cpVar.u();
                    w2c0 w2c0Var = profileEditUiModelItemClickable.f46791a;
                    DsTextField dsTextField = ((wwx) cpVar.u).b;
                    String str2 = profileEditUiModelItemClickable.c;
                    z7q0.a(dsTextField, w2c0Var);
                    w2c0Var.getClass();
                    int iOrdinal = w2c0Var.ordinal();
                    if (iOrdinal == 6 || iOrdinal == 15) {
                        dsTextField.setCustomSelectionActionModeCallback(new y7q0());
                    }
                    if (!Intrinsics.d(dsTextField.getText(), str2)) {
                        dsTextField.setText(f1t0.L(str2));
                    }
                    dsTextField.setLabelText(cpVar.v(b8k0.R(w2c0Var)));
                    dsTextField.setPlaceholderText(cpVar.v(b8k0.R(w2c0Var)));
                    dsTextField.setVisibility(profileEditUiModelItemClickable.d ? 0 : 8);
                    dsTextField.setEnabled(profileEditUiModelItemClickable.e);
                    dsTextField.setErrorText(profileEditUiModelItemClickable.f);
                } else {
                    ArrayList<ProfileEditUiModelItemClickable.Payload> arrayList10 = new ArrayList();
                    for (Object obj11 : list10) {
                        obj11.getClass();
                        w3d.u(arrayList10, (Collection) obj11);
                    }
                    for (ProfileEditUiModelItemClickable.Payload payload : arrayList10) {
                        if (!(payload instanceof ProfileEditUiModelItemClickable.Payload.Error)) {
                            t9f.b();
                            return null;
                        }
                        ((wwx) cpVar2.u).b.setErrorText(((ProfileEditUiModelItemClickable.Payload.Error) payload).f46792a);
                    }
                }
                return Unit.f46060a;
            case 10:
                List list11 = (List) obj;
                list11.getClass();
                if (!list11.isEmpty()) {
                    ArrayList<ProfileEditUiModelItem.Payload> arrayList11 = new ArrayList();
                    for (Object obj12 : list11) {
                        obj12.getClass();
                        w3d.u(arrayList11, (Collection) obj12);
                    }
                    for (ProfileEditUiModelItem.Payload payload2 : arrayList11) {
                        yfu0 yfu0Var16 = cpVar2.u;
                        if (payload2 != null) {
                            if (payload2 instanceof ProfileEditUiModelItem.Payload.Text) {
                                CharSequence text = ((vwx) yfu0Var16).b.getText();
                                String str3 = ((ProfileEditUiModelItem.Payload.Text) payload2).f46790a;
                                if (!Intrinsics.d(text, str3)) {
                                    ((vwx) yfu0Var16).b.setText(str3);
                                }
                            } else if (payload2 instanceof ProfileEditUiModelItem.Payload.Error) {
                                DsTextField dsTextField2 = ((vwx) yfu0Var16).b;
                                String str4 = ((ProfileEditUiModelItem.Payload.Error) payload2).f46789a;
                                dsTextField2.setErrorText(str4);
                                ((vwx) yfu0Var16).b.f(str4.length() > 0);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ProfileEditUiModelItem profileEditUiModelItem = (ProfileEditUiModelItem) cpVar.u();
                w2c0 w2c0Var2 = profileEditUiModelItem.f46788a;
                DsTextField dsTextField3 = ((vwx) cpVar.u).b;
                z7q0.a(dsTextField3, w2c0Var2);
                CharSequence text2 = dsTextField3.getText();
                String str5 = profileEditUiModelItem.b;
                if (!Intrinsics.d(text2, str5)) {
                    dsTextField3.setText(str5);
                }
                dsTextField3.setLabelText(cpVar.v(b8k0.R(w2c0Var2)));
                dsTextField3.setVisibility(profileEditUiModelItem.c ? 0 : 8);
                dsTextField3.setEnabled(profileEditUiModelItem.d);
                return Unit.f46060a;
            case 11:
                List list12 = (List) obj;
                list12.getClass();
                if (list12.isEmpty()) {
                    ((j2k) cpVar.u).b.setItems(((l4c0) cpVar.u()).f19398a);
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj13 : list12) {
                        obj13.getClass();
                        w3d.u(arrayList12, (Collection) obj13);
                    }
                    Iterator it = arrayList12.iterator();
                    while (it.hasNext()) {
                        if (((k4c0) it.next()) == null) {
                            t9f.b();
                            return null;
                        }
                        ((j2k) cpVar2.u).b.setItems(((l4c0) cpVar2.u()).f19398a);
                    }
                }
                return Unit.f46060a;
            case 12:
                List list13 = (List) obj;
                list13.getClass();
                if (!list13.isEmpty()) {
                    ArrayList<m5c0> arrayList13 = new ArrayList();
                    for (Object obj14 : list13) {
                        obj14.getClass();
                        w3d.u(arrayList13, (Collection) obj14);
                    }
                    for (m5c0 m5c0Var : arrayList13) {
                        if (m5c0Var != null) {
                            if (m5c0Var instanceof k5c0) {
                                ((q2k) cpVar2.u).b.setVisibility(((n5c0) cpVar2.u()).f22938a ? 0 : 8);
                            } else if (m5c0Var instanceof l5c0) {
                                h8x.q(cpVar2);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((q2k) cpVar.u).b.setVisibility(((n5c0) cpVar.u()).f22938a ? 0 : 8);
                h8x.q(cpVar);
                return Unit.f46060a;
            case 13:
                List list14 = (List) obj;
                yfu0 yfu0Var17 = cpVar2.u;
                yfu0 yfu0Var18 = cpVar.u;
                list14.getClass();
                if (!list14.isEmpty()) {
                    ArrayList<g5c0> arrayList14 = new ArrayList();
                    for (Object obj15 : list14) {
                        obj15.getClass();
                        w3d.u(arrayList14, (Collection) obj15);
                    }
                    for (g5c0 g5c0Var : arrayList14) {
                        if (g5c0Var != null) {
                            if ((g5c0Var instanceof z4c0) || (g5c0Var instanceof d5c0)) {
                                l8x.o0(cpVar2);
                            } else if (g5c0Var instanceof a5c0) {
                                ((p2k) yfu0Var17).c.setVisibility(((h5c0) cpVar2.u()).c ? 0 : 8);
                            } else if (g5c0Var instanceof c5c0) {
                                ((p2k) yfu0Var17).b.setVisibility(((h5c0) cpVar2.u()).d ? 0 : 8);
                            } else if (g5c0Var instanceof b5c0) {
                                ((p2k) yfu0Var17).b.setLoading(((h5c0) cpVar2.u()).e);
                            } else if (g5c0Var instanceof f5c0) {
                                l8x.p0(cpVar2);
                            } else if (g5c0Var instanceof e5c0) {
                                ((p2k) yfu0Var17).e.setItems(((h5c0) cpVar2.u()).g);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                l8x.o0(cpVar);
                ((p2k) yfu0Var18).c.setVisibility(((h5c0) cpVar.u()).c ? 0 : 8);
                ((p2k) yfu0Var18).b.setVisibility(((h5c0) cpVar.u()).d ? 0 : 8);
                ((p2k) yfu0Var18).b.setLoading(((h5c0) cpVar.u()).e);
                l8x.p0(cpVar);
                ((p2k) yfu0Var18).e.setItems(((h5c0) cpVar.u()).g);
                return Unit.f46060a;
            case 14:
                List list15 = (List) obj;
                yfu0 yfu0Var19 = cpVar2.u;
                yfu0 yfu0Var20 = cpVar.u;
                list15.getClass();
                if (!list15.isEmpty()) {
                    ArrayList<s5c0> arrayList15 = new ArrayList();
                    for (Object obj16 : list15) {
                        obj16.getClass();
                        w3d.u(arrayList15, (Collection) obj16);
                    }
                    for (s5c0 s5c0Var : arrayList15) {
                        if (s5c0Var != null) {
                            if ((s5c0Var instanceof p5c0) || (s5c0Var instanceof q5c0)) {
                                ((o2k) yfu0Var19).b.a(String.valueOf(((t5c0) cpVar2.u()).b), ((t5c0) cpVar2.u()).c);
                            } else if (s5c0Var instanceof r5c0) {
                                ((o2k) yfu0Var19).b.setValueVisibility(((t5c0) cpVar2.u()).f33363a);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((o2k) yfu0Var20).b.a(String.valueOf(((t5c0) cpVar.u()).b), ((t5c0) cpVar.u()).c);
                ((o2k) yfu0Var20).b.setValueVisibility(((t5c0) cpVar.u()).f33363a);
                return Unit.f46060a;
            case 15:
                List list16 = (List) obj;
                list16.getClass();
                if (list16.isEmpty()) {
                    q8x.H(cpVar);
                    ((n2k) cpVar.u).c.setSubtitleVisible(((t5c0) cpVar.u()).f33363a);
                } else {
                    ArrayList<s5c0> arrayList16 = new ArrayList();
                    for (Object obj17 : list16) {
                        obj17.getClass();
                        w3d.u(arrayList16, (Collection) obj17);
                    }
                    for (s5c0 s5c0Var2 : arrayList16) {
                        if (s5c0Var2 != null) {
                            if ((s5c0Var2 instanceof p5c0) || (s5c0Var2 instanceof q5c0)) {
                                q8x.H(cpVar2);
                            } else if (s5c0Var2 instanceof r5c0) {
                                ((n2k) cpVar2.u).c.setSubtitleVisible(((t5c0) cpVar2.u()).f33363a);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 16:
                List list17 = (List) obj;
                list17.getClass();
                if (!list17.isEmpty()) {
                    ArrayList<m5c0> arrayList17 = new ArrayList();
                    for (Object obj18 : list17) {
                        obj18.getClass();
                        w3d.u(arrayList17, (Collection) obj18);
                    }
                    for (m5c0 m5c0Var2 : arrayList17) {
                        if (m5c0Var2 != null) {
                            if (m5c0Var2 instanceof k5c0) {
                                ((s2k) cpVar2.u).b.setVisibility(((n5c0) cpVar2.u()).f22938a ? 0 : 8);
                            } else if (m5c0Var2 instanceof l5c0) {
                                r8x.E(cpVar2);
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((s2k) cpVar.u).b.setVisibility(((n5c0) cpVar.u()).f22938a ? 0 : 8);
                r8x.E(cpVar);
                return Unit.f46060a;
            case 17:
                return a(obj);
            case 18:
                List list18 = (List) obj;
                list18.getClass();
                if (list18.isEmpty()) {
                    WebGamesGameCollection webGamesGameCollection = ((t2k) cpVar.u).b;
                    ArrayList arrayList18 = ((n7c0) cpVar.u()).f23035a;
                    int i = WebGamesGameCollection.o2;
                    yge0 adapter = webGamesGameCollection.getAdapter();
                    adapter.getClass();
                    ((o4s) adapter).H(arrayList18, null);
                } else {
                    ArrayList arrayList19 = new ArrayList();
                    for (Object obj19 : list18) {
                        obj19.getClass();
                        w3d.u(arrayList19, (Collection) obj19);
                    }
                    Iterator it2 = arrayList19.iterator();
                    while (it2.hasNext()) {
                        if (((m7c0) it2.next()) == null) {
                            t9f.b();
                            return null;
                        }
                        WebGamesGameCollection webGamesGameCollection2 = ((t2k) cpVar2.u).b;
                        ArrayList arrayList20 = ((n7c0) cpVar2.u()).f23035a;
                        int i2 = WebGamesGameCollection.o2;
                        yge0 adapter2 = webGamesGameCollection2.getAdapter();
                        adapter2.getClass();
                        ((o4s) adapter2).H(arrayList20, null);
                    }
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return b(obj);
            case 20:
                return c(obj);
            case 21:
                return g(obj);
            case 22:
                return h(obj);
            case 23:
                return i(obj);
            case 24:
                return l(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return m(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return o(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return p(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return r(obj);
            default:
                List list19 = (List) obj;
                yfu0 yfu0Var21 = cpVar2.u;
                yfu0 yfu0Var22 = cpVar.u;
                list19.getClass();
                if (!list19.isEmpty()) {
                    ArrayList<eej0> arrayList21 = new ArrayList();
                    for (Object obj20 : list19) {
                        obj20.getClass();
                        w3d.u(arrayList21, (Collection) obj20);
                    }
                    for (eej0 eej0Var : arrayList21) {
                        if (eej0Var != null) {
                            if (eej0Var instanceof cej0) {
                                ((nxx) yfu0Var21).e.setEnabled(((gej0) cpVar2.u()).a0());
                            } else if (eej0Var instanceof dej0) {
                                ((nxx) yfu0Var21).d.setChecked(((gej0) cpVar2.u()).j0());
                            }
                        }
                        t9f.b();
                        return null;
                    }
                }
                ((nxx) yfu0Var22).e.setEnabled(((gej0) cpVar.u()).a0());
                nxx nxxVar = (nxx) yfu0Var22;
                nxxVar.b.setImageResource(((gej0) cpVar.u()).b());
                ((nxx) yfu0Var22).d.setChecked(((gej0) cpVar.u()).j0());
                nxxVar.c.setSubtitleVisible(false);
                nxxVar.c.setTitle(((gej0) cpVar.u()).getTitle());
                return Unit.f46060a;
        }
    }
}
