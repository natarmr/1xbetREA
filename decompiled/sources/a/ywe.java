package a;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes.dex */
public final class ywe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ axe k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ywe(axe axeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = axeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        axe axeVar = this.k;
        switch (b) {
            case 0:
                ywe yweVar = new ywe(axeVar, yjeVar, (byte) 0);
                yweVar.j = obj;
                return yweVar;
            case 1:
                ywe yweVar2 = new ywe(axeVar, yjeVar, (byte) 1);
                yweVar2.j = obj;
                return yweVar2;
            case 2:
                ywe yweVar3 = new ywe(axeVar, yjeVar, (byte) 2);
                yweVar3.j = obj;
                return yweVar3;
            case 3:
                ywe yweVar4 = new ywe(axeVar, yjeVar, (byte) 3);
                yweVar4.j = obj;
                return yweVar4;
            case 4:
                ywe yweVar5 = new ywe(axeVar, yjeVar, (byte) 4);
                yweVar5.j = obj;
                return yweVar5;
            case 5:
                ywe yweVar6 = new ywe(axeVar, yjeVar, (byte) 5);
                yweVar6.j = obj;
                return yweVar6;
            default:
                ywe yweVar7 = new ywe(axeVar, yjeVar, (byte) 6);
                yweVar7.j = obj;
                return yweVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ywe) create((n9h0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ywe) create((pwq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ywe) create((hn5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ywe) create((ije) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ywe) create((et7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ywe) create((r720) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ywe) create((c4f) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Fragment i820Var;
        byte b = this.i;
        final byte b2 = 2;
        byte b3 = 8;
        axe axeVar = this.k;
        final byte b4 = 1;
        final byte b5 = 0;
        switch (b) {
            case 0:
                n9h0 n9h0Var = (n9h0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                kud kudVar = axe.e2;
                FrameLayout frameLayout = axeVar.L0().j;
                boolean z = n9h0Var.f23139a;
                boolean z2 = n9h0Var.d;
                boolean z3 = n9h0Var.g;
                frameLayout.setVisibility(z ? 0 : 8);
                axeVar.L0().c.setVisibility(!z3 ? 0 : 8);
                axeVar.L0().q.setVisibility(n9h0Var.c ? 0 : 8);
                axeVar.L0().m.setVisibility(z2 ? 0 : 8);
                if (z2) {
                    axeVar.L0().n.setVisibility(z3 ? 0 : 8);
                    axeVar.L0().p.setSubtitle(n9h0Var.e);
                    DsCellLeftIcon dsCellLeftIcon = axeVar.L0().o;
                    TypedValue typedValue = j5d.f15927a;
                    dsCellLeftIcon.setBackgroundTintList(ColorStateList.valueOf(j5d.a(axeVar.o0(), R.attr.uikitCommerce, false)));
                    axeVar.L0().k.setVisibility(n9h0Var.h ? 0 : 8);
                    axeVar.L0().r.setVisibility(n9h0Var.i ? 0 : 8);
                    axeVar.L0().g.setVisibility(n9h0Var.j ? 0 : 8);
                    axeVar.L0().e.setVisibility(n9h0Var.k ? (byte) 0 : (byte) 8);
                }
                if (z3) {
                    axeVar.L0().d.setOnTouchListener(new jw5(axeVar, b4));
                }
                return Unit.f46060a;
            case 1:
                pwq0 pwq0Var = (pwq0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                kud kudVar2 = axe.e2;
                if (axeVar.L0().l.getTitle().length() == 0) {
                    boolean z4 = pwq0Var.m;
                    boolean z5 = pwq0Var.f27723a;
                    boolean z6 = pwq0Var.b;
                    boolean z7 = pwq0Var.c;
                    ArrayList<hc50> arrayList = new ArrayList<>();
                    if (z6) {
                        arrayList.add(new hc50("MAKE_BET_SETTINGS", ybg0.f42342a, R.drawable.ic_glyph_settings_inactive, new twe(axeVar, (byte) 11), 2032));
                    }
                    if (z7) {
                        arrayList.add(new hc50("REMOVE_BUTTON", ybg0.f42342a, R.drawable.ic_glyph_trash, new twe(axeVar, (byte) 12), 2032));
                    }
                    arrayList.add(new hc50("MORE_BUTTON", ybg0.f42342a, R.drawable.ic_glyph_more_vertically, new twe(axeVar, (byte) 13), 2032));
                    DsNavigationBar dsNavigationBar = axeVar.L0().l;
                    dsNavigationBar.setNavigationBarButtons(arrayList);
                    dsNavigationBar.setNavigationBarButtonsColorStateList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, axeVar.o0())));
                    axeVar.H0(z4, z5);
                }
                boolean z8 = pwq0Var.m;
                List list = pwq0Var.f;
                boolean z9 = pwq0Var.g;
                boolean z10 = pwq0Var.i;
                axeVar.H0(z8, pwq0Var.f27723a);
                axeVar.L0().l.setTitleIconVisible(pwq0Var.j && !z8);
                axeVar.L0().l.setTitle(z8 ? "" : pwq0Var.e);
                if (!z9 || z8) {
                    wf40 wf40Var = axeVar.L0().l.d;
                    wf40Var.setClickable(false);
                    int iOrdinal = wf40Var.b.ordinal();
                    if (iOrdinal == 0) {
                        wf40Var.h.setClickable(false);
                    } else if (iOrdinal == 1) {
                        wf40Var.i.b.setClickable(false);
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        wf40Var.j.b.setClickable(false);
                    }
                } else {
                    wf40 wf40Var2 = axeVar.L0().l.d;
                    wf40Var2.setClickable(true);
                    int iOrdinal2 = wf40Var2.b.ordinal();
                    if (iOrdinal2 == 0) {
                        wf40Var2.h.setClickable(true);
                    } else if (iOrdinal2 == 1) {
                        wf40Var2.i.b.setClickable(true);
                    } else {
                        if (iOrdinal2 != 2) {
                            t9f.b();
                            return null;
                        }
                        wf40Var2.j.b.setClickable(true);
                    }
                    axeVar.L0().l.setOnTitlesClickListener(new yw9(axeVar, list, (byte) 23));
                }
                axeVar.L0().l.setClickable(z9);
                axeVar.L0().l.d();
                if (z10) {
                    Iterator it = axeVar.L0().l.c.d.e.iterator();
                    while (it.hasNext()) {
                        ((e1i) it.next()).setVisibility(0);
                    }
                }
                if (!pwq0Var.h || list.isEmpty()) {
                    axeVar.L0().l.c("MORE_BUTTON");
                } else {
                    axeVar.L0().l.g("MORE_BUTTON");
                }
                if (pwq0Var.b && z10 && pwq0Var.d) {
                    axeVar.L0().l.g("MAKE_BET_SETTINGS");
                } else {
                    axeVar.L0().l.c("MAKE_BET_SETTINGS");
                }
                ComposeView composeView = axeVar.c2;
                if (composeView != null) {
                    pkd.i(composeView, null, new ugd(-1062665649, true, new eod(pwq0Var, axeVar, (byte) 9)));
                }
                if ((pwq0Var.l != null || z8) && z10) {
                    axeVar.L0().l.b.setVisibility(0);
                } else {
                    axeVar.L0().l.b.setVisibility(8);
                }
                return Unit.f46060a;
            case 2:
                hn5 hn5Var = (hn5) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                kud kudVar3 = axe.e2;
                axeVar.L0().b.setVisibility(hn5Var.e ? (byte) 0 : (byte) 8);
                if (hn5Var.e) {
                    axeVar.L0().b.setStyle(hn5Var.d);
                    axeVar.L0().b.setAccountTitle(hn5Var.f13334a);
                    axeVar.L0().b.x(hn5Var.b, hn5Var.c);
                }
                return Unit.f46060a;
            case 3:
                a8z a8zVar = axeVar.b2;
                ije ijeVar = (ije) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (ijeVar != null) {
                    if (ijeVar instanceof xie) {
                        mdm mdmVar = ((xie) ijeVar).f40940a;
                        kud kudVar4 = axe.e2;
                        axeVar.L0().h.setVisibility(0);
                        b1j.t(axeVar.L0().h, new ugd(-484988759, true, new eod(mdmVar, axeVar, b3)));
                    } else if (ijeVar instanceof eje) {
                        kud kudVar5 = axe.e2;
                        axeVar.L0().h.setVisibility(8);
                        eje ejeVar = (eje) ijeVar;
                        if (ejeVar.c) {
                            qse qseVar = axeVar.a2;
                            if (qseVar != null) {
                                axeVar.L0().q.s0(qseVar);
                            }
                            axeVar.a2 = null;
                            qse qseVar2 = new qse(ejeVar.d, false, axeVar.o0());
                            axeVar.a2 = qseVar2;
                            axeVar.L0().q.m(qseVar2);
                            RecyclerView recyclerView = axeVar.L0().q;
                            recyclerView.post(new a4e(axeVar, recyclerView, (byte) 2));
                        }
                        tre treVar = (tre) a8zVar.getValue();
                        List list2 = ejeVar.f7904a;
                        if (list2.isEmpty()) {
                            ((tre) a8zVar.getValue()).g();
                        }
                        treVar.A(list2);
                        boolean z11 = ejeVar.b;
                        vyx vyxVar = axeVar.X1;
                        if (!z11) {
                            if (vyxVar != null) {
                                vyxVar.i(null);
                            }
                            axeVar.X1 = null;
                        } else if (vyxVar == null) {
                            vyx vyxVar2 = new vyx(new nwe((tre) a8zVar.getValue()));
                            axeVar.X1 = vyxVar2;
                            vyxVar2.i(axeVar.L0().q);
                        }
                    }
                }
                return Unit.f46060a;
            case 4:
                et7 et7Var = (et7) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                kud kudVar6 = axe.e2;
                axeVar.L0().e.setVisibility(0);
                pkd.i(axeVar.L0().e, null, new ugd(750327400, true, new eod(et7Var, axeVar, (byte) 10)));
                return Unit.f46060a;
            case 5:
                r720 r720Var = (r720) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (r720Var.a()) {
                    i820.U1.getClass();
                    i820Var = new i820();
                } else {
                    b920.U1.getClass();
                    i820Var = new b920();
                }
                if (r720Var instanceof q720) {
                    kud kudVar7 = axe.e2;
                    axeVar.L0().d.setVisibility(0);
                    b4 = axeVar.C().J("MakeBetFragment") == null ? (byte) 0 : (byte) 1;
                    if (b4 == 0) {
                        androidx.fragment.app.e eVarC = axeVar.C();
                        eVarC.getClass();
                        zb5 zb5Var = new zb5(eVarC);
                        zb5Var.o(axeVar.L0().i.getId(), i820Var, "MakeBetFragment");
                        zb5Var.f();
                    }
                    if (b4 == 0) {
                        axeVar.I0();
                    }
                } else if (r720Var instanceof p720) {
                    kud kudVar8 = axe.e2;
                    axeVar.L0().d.setVisibility(8);
                    Fragment fragmentJ = axeVar.C().J("MakeBetFragment");
                    if (fragmentJ != null) {
                        androidx.fragment.app.e eVarC2 = axeVar.C();
                        eVarC2.getClass();
                        zb5 zb5Var2 = new zb5(eVarC2);
                        zb5Var2.n(fragmentJ);
                        zb5Var2.f();
                    }
                }
                return Unit.f46060a;
            default:
                c4f c4fVar = (c4f) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (c4fVar != null) {
                    boolean z12 = c4fVar instanceof n3f;
                    final axe axeVar2 = this.k;
                    if (z12) {
                        n3f n3fVar = (n3f) c4fVar;
                        final long j = n3fVar.f22846a;
                        int i = n3fVar.b;
                        int i2 = n3fVar.c;
                        kud kudVar9 = axe.e2;
                        ii iiVarJ0 = axeVar2.J0();
                        String strH = axeVar2.H(i);
                        String strH2 = axeVar2.H(i2);
                        String strH3 = axeVar2.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, axeVar2.H(R.string.cancel), (String) null, "COUPON_DELETE_EVENT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC3 = axeVar2.C();
                        eVarC3.getClass();
                        iiVarJ0.d(dialogFields, eVarC3);
                        axeVar2.C().g("COUPON_DELETE_EVENT_REQUEST_KEY");
                        ccq0.V(axeVar2, "COUPON_DELETE_EVENT_REQUEST_KEY", new Function0() { // from class: a.wwe
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b6 = b4;
                                axe axeVar3 = axeVar2;
                                switch (b6) {
                                    case 0:
                                        kud kudVar10 = axe.e2;
                                        r7f r7fVarM0 = axeVar3.M0();
                                        bvc bvcVarA = jiu0.a(r7fVarM0);
                                        dvj dvjVar = r7fVarM0.Y0.b;
                                        sac.V(bvcVarA, p6f.f26451a, null, dvjVar, new i5f(r7fVarM0, j, null, (byte) 1), 10);
                                        break;
                                    case 1:
                                        kud kudVar11 = axe.e2;
                                        r7f r7fVarM1 = axeVar3.M0();
                                        bvc bvcVarA2 = jiu0.a(r7fVarM1);
                                        dvj dvjVar2 = r7fVarM1.Y0.b;
                                        sac.V(bvcVarA2, q6f.f28196a, null, dvjVar2, new i5f(r7fVarM1, j, null, (byte) 2), 10);
                                        break;
                                    default:
                                        kud kudVar12 = axe.e2;
                                        r7f r7fVarM2 = axeVar3.M0();
                                        bvc bvcVarA3 = jiu0.a(r7fVarM2);
                                        dvj dvjVar3 = r7fVarM2.Y0.b;
                                        sac.V(bvcVarA3, p6f.f26451a, null, dvjVar3, new i5f(r7fVarM2, j, null, (byte) 1), 10);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        ccq0.T(axeVar2, "COUPON_DELETE_EVENT_REQUEST_KEY", new Function0() { // from class: a.wwe
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b6 = b2;
                                axe axeVar3 = axeVar2;
                                switch (b6) {
                                    case 0:
                                        kud kudVar10 = axe.e2;
                                        r7f r7fVarM0 = axeVar3.M0();
                                        bvc bvcVarA = jiu0.a(r7fVarM0);
                                        dvj dvjVar = r7fVarM0.Y0.b;
                                        sac.V(bvcVarA, p6f.f26451a, null, dvjVar, new i5f(r7fVarM0, j, null, (byte) 1), 10);
                                        break;
                                    case 1:
                                        kud kudVar11 = axe.e2;
                                        r7f r7fVarM1 = axeVar3.M0();
                                        bvc bvcVarA2 = jiu0.a(r7fVarM1);
                                        dvj dvjVar2 = r7fVarM1.Y0.b;
                                        sac.V(bvcVarA2, q6f.f28196a, null, dvjVar2, new i5f(r7fVarM1, j, null, (byte) 2), 10);
                                        break;
                                    default:
                                        kud kudVar12 = axe.e2;
                                        r7f r7fVarM2 = axeVar3.M0();
                                        bvc bvcVarA3 = jiu0.a(r7fVarM2);
                                        dvj dvjVar3 = r7fVarM2.Y0.b;
                                        sac.V(bvcVarA3, p6f.f26451a, null, dvjVar3, new i5f(r7fVarM2, j, null, (byte) 1), 10);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (c4fVar instanceof o3f) {
                        o3f o3fVar = (o3f) c4fVar;
                        final long j2 = o3fVar.f24581a;
                        final int i3 = o3fVar.b;
                        final boolean z13 = o3fVar.c;
                        int i4 = o3fVar.d;
                        int i5 = o3fVar.e;
                        kud kudVar10 = axe.e2;
                        ii iiVarJ1 = axeVar2.J0();
                        String strH4 = axeVar2.H(i4);
                        String strH5 = axeVar2.H(i5);
                        String strH6 = axeVar2.H(R.string.ok_new);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, axeVar2.H(R.string.cancel), (String) null, "COUPON_DELETE_EVENT_FROM_BLOCK_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC4 = axeVar2.C();
                        eVarC4.getClass();
                        iiVarJ1.d(dialogFields2, eVarC4);
                        final byte b6 = 0;
                        ccq0.V(axeVar2, "COUPON_DELETE_EVENT_FROM_BLOCK_REQUEST_KEY", new Function0() { // from class: a.vwe
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b7 = b6;
                                axe axeVar3 = axeVar2;
                                switch (b7) {
                                    case 0:
                                        kud kudVar11 = axe.e2;
                                        r7f r7fVarM0 = axeVar3.M0();
                                        bvc bvcVarA = jiu0.a(r7fVarM0);
                                        dvj dvjVar = r7fVarM0.Y0.b;
                                        sac.V(bvcVarA, r6f.f29930a, null, dvjVar, new k5f(r7fVarM0, j2, i3, z13, null, (byte) 1), 10);
                                        break;
                                    default:
                                        kud kudVar12 = axe.e2;
                                        r7f r7fVarM1 = axeVar3.M0();
                                        if (z13) {
                                            bvc bvcVarA2 = jiu0.a(r7fVarM1);
                                            dvj dvjVar2 = r7fVarM1.Y0.b;
                                            sac.V(bvcVarA2, j5f.f15930a, null, dvjVar2, new k5f(r7fVarM1, j2, i3, false, null, (byte) 0), 10);
                                        }
                                        r7fVarM1.q0(q4f.d.a(), true);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        ccq0.T(axeVar2, "COUPON_DELETE_EVENT_FROM_BLOCK_REQUEST_KEY", new Function0() { // from class: a.wwe
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b7 = b5;
                                axe axeVar3 = axeVar2;
                                switch (b7) {
                                    case 0:
                                        kud kudVar11 = axe.e2;
                                        r7f r7fVarM0 = axeVar3.M0();
                                        bvc bvcVarA = jiu0.a(r7fVarM0);
                                        dvj dvjVar = r7fVarM0.Y0.b;
                                        sac.V(bvcVarA, p6f.f26451a, null, dvjVar, new i5f(r7fVarM0, j2, null, (byte) 1), 10);
                                        break;
                                    case 1:
                                        kud kudVar12 = axe.e2;
                                        r7f r7fVarM1 = axeVar3.M0();
                                        bvc bvcVarA2 = jiu0.a(r7fVarM1);
                                        dvj dvjVar2 = r7fVarM1.Y0.b;
                                        sac.V(bvcVarA2, q6f.f28196a, null, dvjVar2, new i5f(r7fVarM1, j2, null, (byte) 2), 10);
                                        break;
                                    default:
                                        kud kudVar13 = axe.e2;
                                        r7f r7fVarM2 = axeVar3.M0();
                                        bvc bvcVarA3 = jiu0.a(r7fVarM2);
                                        dvj dvjVar3 = r7fVarM2.Y0.b;
                                        sac.V(bvcVarA3, p6f.f26451a, null, dvjVar3, new i5f(r7fVarM2, j2, null, (byte) 1), 10);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (c4fVar instanceof u3f) {
                        u3f u3fVar = (u3f) c4fVar;
                        final long j3 = u3fVar.f34993a;
                        final int i6 = u3fVar.b;
                        final boolean z14 = u3fVar.c;
                        kud kudVar11 = axe.e2;
                        ii iiVarJ2 = axeVar2.J0();
                        String strH7 = axeVar2.H(R.string.attention);
                        String strH8 = axeVar2.H(R.string.coupon_multibet_event_deleting_error);
                        String strH9 = axeVar2.H(R.string.yes);
                        strH9.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, axeVar2.H(R.string.no), (String) null, "COUPON_DELETE_MULTI_BET_EVENT_FROM_BLOCK_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC5 = axeVar2.C();
                        eVarC5.getClass();
                        iiVarJ2.d(dialogFields3, eVarC5);
                        final byte b7 = 1;
                        ccq0.V(axeVar2, "COUPON_DELETE_MULTI_BET_EVENT_FROM_BLOCK_REQUEST_KEY", new Function0() { // from class: a.vwe
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b8 = b7;
                                axe axeVar3 = axeVar2;
                                switch (b8) {
                                    case 0:
                                        kud kudVar12 = axe.e2;
                                        r7f r7fVarM0 = axeVar3.M0();
                                        bvc bvcVarA = jiu0.a(r7fVarM0);
                                        dvj dvjVar = r7fVarM0.Y0.b;
                                        sac.V(bvcVarA, r6f.f29930a, null, dvjVar, new k5f(r7fVarM0, j3, i6, z14, null, (byte) 1), 10);
                                        break;
                                    default:
                                        kud kudVar13 = axe.e2;
                                        r7f r7fVarM1 = axeVar3.M0();
                                        if (z14) {
                                            bvc bvcVarA2 = jiu0.a(r7fVarM1);
                                            dvj dvjVar2 = r7fVarM1.Y0.b;
                                            sac.V(bvcVarA2, j5f.f15930a, null, dvjVar2, new k5f(r7fVarM1, j3, i6, false, null, (byte) 0), 10);
                                        }
                                        r7fVarM1.q0(q4f.d.a(), true);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (c4fVar instanceof k3f) {
                        yw9 yw9Var = new yw9(axeVar2, c4fVar, (byte) 26);
                        kud kudVar12 = axe.e2;
                        if (axeVar2.C().c.p().size() <= 1) {
                            yw9Var.invoke();
                        }
                    } else if (c4fVar instanceof l3f) {
                        String str = ((l3f) c4fVar).f19355a;
                        kud kudVar13 = axe.e2;
                        ii iiVarJ3 = axeVar2.J0();
                        String strH10 = axeVar2.H(R.string.save);
                        String strI = axeVar2.I(R.string.coupon_saved_description_v2, str);
                        String strH11 = axeVar2.H(R.string.copy);
                        strH11.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strI, (CharSequence) strH11, axeVar2.H(R.string.cancel), (String) null, "COUPON_SAVE_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC6 = axeVar2.C();
                        eVarC6.getClass();
                        iiVarJ3.d(dialogFields4, eVarC6);
                        ccq0.V(axeVar2, "COUPON_SAVE_REQUEST_KEY", new yw9(axeVar2, str, (byte) 24));
                    } else if (c4fVar instanceof s3f) {
                        kud kudVar14 = axe.e2;
                        axeVar2.P0();
                    } else if (c4fVar instanceof y3f) {
                        kud kudVar15 = axe.e2;
                        ii iiVarJ4 = axeVar2.J0();
                        String strH12 = axeVar2.H(R.string.coupon_has_items);
                        String strH13 = axeVar2.H(R.string.replase_all_events_wen_loaded);
                        String strH14 = axeVar2.H(R.string.ok_new);
                        strH14.getClass();
                        DialogFields dialogFields5 = new DialogFields((CharSequence) strH12, (CharSequence) strH13, (CharSequence) strH14, axeVar2.H(R.string.cancel), (String) null, "COUPON_REPLACE_AFTER_LOAD_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC7 = axeVar2.C();
                        eVarC7.getClass();
                        iiVarJ4.d(dialogFields5, eVarC7);
                    } else if (c4fVar instanceof i3f) {
                        ArrayList arrayList2 = ((i3f) c4fVar).f14093a;
                        kud kudVar16 = axe.e2;
                        kwd kwdVar = n4f.k2;
                        String strH15 = axeVar2.H(R.string.coupon_make_bet_type);
                        strH15.getClass();
                        androidx.fragment.app.e eVarC8 = axeVar2.C();
                        eVarC8.getClass();
                        kwdVar.getClass();
                        kwd.g(strH15, arrayList2, "CHANGE_SYSTEM_REQUEST_KEY", eVarC8);
                    } else if (c4fVar instanceof b4f) {
                        kud kudVar17 = axe.e2;
                        if (axeVar2.S1 == null) {
                            Intrinsics.h("tipsDialogFeature");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC9 = axeVar2.C();
                        eVarC9.getClass();
                        uuz uuzVar = fk60.b;
                        noq0.m2.getClass();
                        if (eVarC9.J("TipsDialogTag") == null) {
                            noq0 noq0Var = new noq0();
                            iiy[] iiyVarArr = noq0.n2;
                            noq0Var.h2.I(noq0Var, iiyVarArr[3], 5);
                            noq0Var.i2.x(noq0Var, iiyVarArr[4], "");
                            sj3.E0(noq0Var, eVarC9, "TipsDialogTag");
                        }
                    } else if (c4fVar instanceof h3f) {
                        String str2 = ((h3f) c4fVar).f12381a;
                        kud kudVar18 = axe.e2;
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", str2);
                        intent.setType("text/plain");
                        axeVar2.w0(Intent.createChooser(intent, null));
                    } else if (c4fVar instanceof m3f) {
                        kud kudVar19 = axe.e2;
                        axeVar2.O0();
                    } else if (c4fVar instanceof a4f) {
                        wdk0 wdk0Var = axeVar2.U1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        a4f a4fVar = (a4f) c4fVar;
                        wdk0.k(wdk0Var, new xdk0(a4fVar.c, a4fVar.f220a, a4fVar.b, null, null, null, 120), axeVar2, null, axeVar2.L0().f27859a, true, null, 996);
                    } else if (c4fVar instanceof r3f) {
                        r3f r3fVar = (r3f) c4fVar;
                        int i7 = r3fVar.f29784a;
                        String str3 = r3fVar.b;
                        kud kudVar20 = axe.e2;
                        ii iiVarJ5 = axeVar2.J0();
                        String strH16 = axeVar2.H(R.string.express_boost_title);
                        String strI2 = axeVar2.I(R.string.express_boost_description, String.valueOf(i7), str3);
                        String strH17 = axeVar2.H(R.string.ok_new);
                        strH17.getClass();
                        DialogFields dialogFields6 = new DialogFields((CharSequence) strH16, (CharSequence) strI2, (CharSequence) strH17, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC10 = axeVar2.C();
                        eVarC10.getClass();
                        iiVarJ5.d(dialogFields6, eVarC10);
                    } else if (c4fVar instanceof t3f) {
                        int i8 = ((t3f) c4fVar).f33263a;
                        kud kudVar21 = axe.e2;
                        if (axeVar2.C().J("BET_AMOUNT_BOTTOM_SHEET_TAG") == null && i8 != -1) {
                            wd6.o2.getClass();
                            wd6 wd6Var = new wd6();
                            iiy[] iiyVarArr2 = wd6.p2;
                            wd6Var.h2.I(wd6Var, iiyVarArr2[1], i8);
                            wd6Var.i2.x(wd6Var, iiyVarArr2[2], "COUPON_BET_AMOUNT_REQUEST_KEY");
                            wd6Var.H0(axeVar2.C(), "BET_AMOUNT_BOTTOM_SHEET_TAG");
                            p7m0 p7m0Var = axeVar2.M0().c2;
                            Boolean bool = Boolean.FALSE;
                            p7m0Var.getClass();
                            p7m0Var.o(null, bool);
                        }
                    } else if (c4fVar instanceof j3f) {
                        kud kudVar22 = axe.e2;
                        ynb ynbVar = axeVar2.R1;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.i;
                        androidx.fragment.app.e eVarC11 = axeVar2.C();
                        eVarC11.getClass();
                        ynb.b(ynbVar, bm5Var, null, eVarC11, false, "CHANGE_BALANCE_REQUEST_KEY", 494);
                    } else if (c4fVar instanceof g3f) {
                        kud kudVar23 = axe.e2;
                        kcx.G(axeVar2.L0().q, 0);
                        yge0 adapter = axeVar2.L0().q.getAdapter();
                        if (adapter != null && adapter.d() == 0) {
                            NestedScrollView nestedScrollView = axeVar2.L0().m;
                            nestedScrollView.u(0 - nestedScrollView.getScrollX(), 0 - nestedScrollView.getScrollY(), false);
                        }
                    } else if (c4fVar instanceof x3f) {
                        kud kudVar24 = axe.e2;
                        ii iiVarJ6 = axeVar2.J0();
                        String strH18 = axeVar2.H(R.string.coupon_has_items);
                        String strH19 = axeVar2.H(R.string.replase_all_events_wen_generated);
                        String strH20 = axeVar2.H(R.string.ok_new);
                        strH20.getClass();
                        DialogFields dialogFields7 = new DialogFields((CharSequence) strH18, (CharSequence) strH19, (CharSequence) strH20, axeVar2.H(R.string.cancel), (String) null, "COUPON_REPLACE_AFTER_GENERATE_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC12 = axeVar2.C();
                        eVarC12.getClass();
                        iiVarJ6.d(dialogFields7, eVarC12);
                    } else if (c4fVar instanceof z3f) {
                        kud kudVar25 = axe.e2;
                        ii iiVarJ7 = axeVar2.J0();
                        String strH21 = axeVar2.H(R.string.coupon_has_items);
                        String strH22 = axeVar2.H(R.string.replase_all_events_wen_loaded);
                        String strH23 = axeVar2.H(R.string.ok_new);
                        strH23.getClass();
                        DialogFields dialogFields8 = new DialogFields((CharSequence) strH21, (CharSequence) strH22, (CharSequence) strH23, axeVar2.H(R.string.cancel), (String) null, "COUPON_REPLACE_WITH_DEEP_LINK_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC13 = axeVar2.C();
                        eVarC13.getClass();
                        iiVarJ7.d(dialogFields8, eVarC13);
                    } else if (c4fVar instanceof v3f) {
                        kud kudVar26 = axe.e2;
                        ii iiVarJ8 = axeVar2.J0();
                        String strH24 = axeVar2.H(R.string.attention);
                        String strH25 = axeVar2.H(R.string.coupon_condition_bet_move_event_error);
                        String strH26 = axeVar2.H(R.string.yes);
                        strH26.getClass();
                        DialogFields dialogFields9 = new DialogFields((CharSequence) strH24, (CharSequence) strH25, (CharSequence) strH26, axeVar2.H(R.string.no), (String) null, "COUPON_NOT_ENOUGH_BLOCKS_FOR_CONDITION_BET_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC14 = axeVar2.C();
                        eVarC14.getClass();
                        iiVarJ8.d(dialogFields9, eVarC14);
                    } else if (c4fVar instanceof p3f) {
                        String str4 = ((p3f) c4fVar).f26297a;
                        kud kudVar27 = axe.e2;
                        ii iiVarJ9 = axeVar2.J0();
                        String strH27 = axeVar2.H(R.string.attention);
                        String strH28 = axeVar2.H(R.string.ok_new);
                        strH28.getClass();
                        DialogFields dialogFields10 = new DialogFields((CharSequence) strH27, (CharSequence) str4, (CharSequence) strH28, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC15 = axeVar2.C();
                        eVarC15.getClass();
                        iiVarJ9.d(dialogFields10, eVarC15);
                    } else if (c4fVar instanceof d3f) {
                        kud kudVar28 = axe.e2;
                        axeVar2.M1.x(axeVar2, axe.f2[1], "");
                    } else if (c4fVar instanceof e3f) {
                        kud kudVar29 = axe.e2;
                        List<Fragment> listP = axeVar2.C().c.p();
                        listP.getClass();
                        for (Fragment fragment : listP) {
                            if (fragment instanceof sik) {
                                ((sik) fragment).y0();
                            }
                        }
                    } else if (c4fVar instanceof w3f) {
                        kud kudVar30 = axe.e2;
                        ii iiVarJ10 = axeVar2.J0();
                        String strH29 = axeVar2.H(R.string.optibet_market_info_title);
                        String strH30 = axeVar2.H(R.string.optibet_market_desc);
                        String strH31 = axeVar2.H(R.string.ok);
                        strH31.getClass();
                        DialogFields dialogFields11 = new DialogFields((CharSequence) strH29, (CharSequence) strH30, (CharSequence) strH31, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC16 = axeVar2.C();
                        eVarC16.getClass();
                        iiVarJ10.d(dialogFields11, eVarC16);
                    } else if (c4fVar instanceof q3f) {
                        kud kudVar31 = axe.e2;
                        ii iiVarJ11 = axeVar2.J0();
                        String strH32 = axeVar2.H(R.string.each_way_dialog_title);
                        String strH33 = axeVar2.H(R.string.each_way_description);
                        String strH34 = axeVar2.H(R.string.ok_upper);
                        strH34.getClass();
                        DialogFields dialogFields12 = new DialogFields((CharSequence) strH32, (CharSequence) strH33, (CharSequence) strH34, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC17 = axeVar2.C();
                        eVarC17.getClass();
                        iiVarJ11.d(dialogFields12, eVarC17);
                    }
                }
                return Unit.f46060a;
        }
    }
}
