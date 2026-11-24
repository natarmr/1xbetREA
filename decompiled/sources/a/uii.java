package a;

import android.content.Context;
import android.widget.ImageView;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.viewpager2.widget.ViewPager2;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.GenericDeclaration;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetViewType;
import org.xplatform.cyber.game.core.betting.presentation.sub_games_filter.SubGamesFilterBottomSheetParams;
import org.xplatform.registration.bonus.api.BonusSelectionScreenParams;
import org.xplatform.registration_default.impl.presentation.registration_bonus.models.RegistrationBonusDefaultScreenParams;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class uii implements n1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f35730a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public uii(xsu xsuVar, h03 h03Var, uuz uuzVar) {
        this.f35730a = xsuVar;
        this.b = h03Var;
        this.c = uuzVar;
        this.d = maz.b(new xgk(this, (byte) 1));
        this.e = maz.b(new xgk(this, (byte) 0));
        this.f = maz.b(new xgk(this, (byte) 2));
    }

    public static boolean E(vn30 vn30Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = vn30Var.f37698a;
        int i4 = vn30Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && vn30Var.c == i2) {
            return true;
        }
        return !z && i4 == -1 && vn30Var.e == i3;
    }

    public static vn30 g(my90 my90Var, b4x b4xVar, vn30 vn30Var, amq0 amq0Var) {
        ulo uloVar = (ulo) my90Var;
        bmq0 bmq0VarN = uloVar.n();
        int iK = uloVar.k();
        Object objL = bmq0VarN.p() ? null : bmq0VarN.l(iK);
        int iB = (uloVar.z() || bmq0VarN.p()) ? -1 : bmq0VarN.f(iK, amq0Var, false).b(vtt0.M(uloVar.l()) - amq0Var.e);
        for (int i = 0; i < b4xVar.size(); i++) {
            vn30 vn30Var2 = (vn30) b4xVar.get(i);
            if (E(vn30Var2, objL, uloVar.z(), uloVar.h(), uloVar.i(), iB)) {
                return vn30Var2;
            }
        }
        if (b4xVar.isEmpty() && vn30Var != null && E(vn30Var, objL, uloVar.z(), uloVar.h(), uloVar.i(), iB)) {
            return vn30Var;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public Object A(xgt xgtVar, zje zjeVar) {
        uht uhtVar;
        a7q a7qVar;
        long j;
        xgt xgtVar2;
        int id;
        long jA;
        Object objC;
        a7q a7qVar2;
        long j2;
        int i;
        xgt xgtVar3;
        Object objE;
        gst0 gst0Var = ((iqt) this.e).f15225a;
        if (zjeVar instanceof uht) {
            uhtVar = (uht) zjeVar;
            int i2 = uhtVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uhtVar.q = i2 - Integer.MIN_VALUE;
            } else {
                uhtVar = new uht(this, zjeVar);
            }
        } else {
            uhtVar = new uht(this, zjeVar);
        }
        uht uhtVar2 = uhtVar;
        Object objA = uhtVar2.o;
        wne wneVar = wne.f39444a;
        int i3 = uhtVar2.q;
        if (i3 != 0) {
            if (i3 == 1) {
                a7qVar = uhtVar2.j;
                xgtVar2 = uhtVar2.i;
                z1x.P(objA);
            } else {
                if (i3 != 2) {
                    if (i3 == 3) {
                        z1x.P(objA);
                        return objA;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = uhtVar2.m;
                int i4 = uhtVar2.n;
                long j3 = uhtVar2.l;
                xgtVar3 = uhtVar2.k;
                a7qVar2 = uhtVar2.j;
                z1x.P(objA);
                j = j3;
                i = i4;
            }
            int iIntValue = ((Number) objA).intValue();
            uhtVar2.i = null;
            uhtVar2.j = null;
            uhtVar2.k = null;
            uhtVar2.q = 3;
            objE = ((nr) a7qVar2.f384a).e(j, xgtVar3, i, j2, iIntValue, uhtVar2);
            if (objE == wneVar) {
                return wneVar;
            }
            return objE;
        }
        z1x.P(objA);
        a7qVar = (a7q) this.f35730a;
        if (gst0Var.a()) {
            nou nouVar = (nou) this.c;
            uhtVar2.i = xgtVar;
            uhtVar2.j = a7qVar;
            uhtVar2.q = 1;
            objA = nouVar.a(tl5.c, uhtVar2);
            if (objA != wneVar) {
                xgtVar2 = xgtVar;
            }
        } else {
            j = 0;
            xgtVar2 = xgtVar;
            id = ((xyt) this.b).f41721a.b().getId();
            jA = gst0Var.a() ? xru.a((xru) this.d) : 0L;
            x0u x0uVar = (x0u) this.f;
            uhtVar2.i = null;
            uhtVar2.j = a7qVar;
            uhtVar2.k = xgtVar2;
            uhtVar2.l = j;
            uhtVar2.n = id;
            uhtVar2.m = jA;
            uhtVar2.q = 2;
            objC = x0uVar.c(uhtVar2);
            if (objC != wneVar) {
                a7qVar2 = a7qVar;
                j2 = jA;
                i = id;
                xgtVar3 = xgtVar2;
                objA = objC;
                int iIntValue2 = ((Number) objA).intValue();
                uhtVar2.i = null;
                uhtVar2.j = null;
                uhtVar2.k = null;
                uhtVar2.q = 3;
                objE = ((nr) a7qVar2.f384a).e(j, xgtVar3, i, j2, iIntValue2, uhtVar2);
                if (objE == wneVar) {
                    return objE;
                }
            }
        }
        return wneVar;
        j = ((ql5) objA).f28916a;
        id = ((xyt) this.b).f41721a.b().getId();
        if (gst0Var.a()) {
        }
        x0u x0uVar2 = (x0u) this.f;
        uhtVar2.i = null;
        uhtVar2.j = a7qVar;
        uhtVar2.k = xgtVar2;
        uhtVar2.l = j;
        uhtVar2.n = id;
        uhtVar2.m = jA;
        uhtVar2.q = 2;
        objC = x0uVar2.c(uhtVar2);
        if (objC != wneVar) {
            a7qVar2 = a7qVar;
            j2 = jA;
            i = id;
            xgtVar3 = xgtVar2;
            objA = objC;
            int iIntValue3 = ((Number) objA).intValue();
            uhtVar2.i = null;
            uhtVar2.j = null;
            uhtVar2.k = null;
            uhtVar2.q = 3;
            objE = ((nr) a7qVar2.f384a).e(j, xgtVar3, i, j2, iIntValue3, uhtVar2);
            if (objE == wneVar) {
                return objE;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00db, code lost:
    
        if (r2 == r7) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0124, code lost:
    
        if (r2 == r7) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(java.lang.String r19, org.xplatform.bet_history.bet_info.presentation.model.BetInfoScreenModel r20, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uii.B(java.lang.String, org.xplatform.bet_history.bet_info.presentation.model.BetInfoScreenModel, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d6, code lost:
    
        if (r0.f(r13, r2) == r3) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(a.s470 r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uii.C(a.s470, a.zje):java.lang.Object");
    }

    public lbu D() {
        return new lbu(new nwd(), (vff0) this.f35730a, (j1q0) this.b);
    }

    public q990 F() {
        return (q990) ((n5d0) this.f).get();
    }

    public r990 G() {
        return (r990) ((n5d0) this.e).get();
    }

    public nvu H() {
        us00 us00Var = (us00) this.f35730a;
        return new nvu(new dbv(us00Var), new t0d(us00Var), new iw20((vwb0) this.b), (byte) 15);
    }

    public sd60 I() {
        edu eduVar = new edu((Object) H(), (Object) c(), (byte) 16);
        iqi iqiVarN = n();
        nvu nvuVarH = H();
        xr xrVarC = c();
        wdd0 wdd0Var = (wdd0) this.c;
        vpt vptVarE = wdd0Var.e();
        x1x.x(vptVarE);
        upt uptVarG = wdd0Var.g();
        x1x.x(uptVarG);
        return new sd60(eduVar, iqiVarN, nvuVarH, xrVarC, vptVarE, uptVarG, new eqx((b3c0) this.d, (byte) 3), new iqt((gst0) this.e), (byte) 4);
    }

    public lpi0 J() {
        vff0 vff0Var = (vff0) this.f35730a;
        b8u b8uVar = new b8u(new jtj(new nwd(), vff0Var, (j1q0) this.b), new bst(new art()), new rzt(), new tqt(new art()));
        u8u u8uVarO = o();
        noc nocVar = new noc(vff0Var, (byte) 3);
        wgu wguVar = (wgu) this.d;
        o470 o470Var = (o470) this.e;
        eyg0 eyg0Var = (eyg0) this.f;
        noc nocVar2 = new noc(vff0Var, (byte) 1);
        vgu vguVar = new vgu(vff0Var, (byte) 0);
        vff0Var.getClass();
        ugf0 ugf0Var = new ugf0();
        ugf0Var.f35622a = vff0Var;
        return new lpi0(b8uVar, u8uVarO, nocVar, wguVar, o470Var, eyg0Var, nocVar2, vguVar, ugf0Var);
    }

    public void K(bmq0 bmq0Var) {
        b4x b4xVar;
        zz2 zz2VarA = wcf0.a();
        if (((b4x) this.b).isEmpty()) {
            a(zz2VarA, (vn30) this.e, bmq0Var);
            if (!Objects.equals((vn30) this.f, (vn30) this.e)) {
                a(zz2VarA, (vn30) this.f, bmq0Var);
            }
            if (!Objects.equals((vn30) this.d, (vn30) this.e) && !Objects.equals((vn30) this.d, (vn30) this.f)) {
                a(zz2VarA, (vn30) this.d, bmq0Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((b4x) this.b).size();
                b4xVar = (b4x) this.b;
                if (i >= size) {
                    break;
                }
                a(zz2VarA, (vn30) b4xVar.get(i), bmq0Var);
                i++;
            }
            if (!b4xVar.contains((vn30) this.d)) {
                a(zz2VarA, (vn30) this.d, bmq0Var);
            }
        }
        this.c = zz2VarA.e(true);
    }

    public void L() {
        DsSegmentedGroup dsSegmentedGroup = (DsSegmentedGroup) this.f35730a;
        dsSegmentedGroup.k.clear();
        dsSegmentedGroup.removeAllViews();
        ViewPager2 viewPager2 = (ViewPager2) this.b;
        yge0 adapter = viewPager2.getAdapter();
        int iD = adapter != null ? adapter.d() : 0;
        int i = 0;
        while (i < iD) {
            vvh0 vvh0Var = new vvh0();
            vvh0Var.a((CharSequence) ((Function1) this.c).invoke(Integer.valueOf(i)));
            DsSegmentedGroup.a(dsSegmentedGroup, vvh0Var, i == viewPager2.getCurrentItem(), 2);
            i++;
        }
    }

    public void a(zz2 zz2Var, vn30 vn30Var, bmq0 bmq0Var) {
        if (vn30Var == null) {
            return;
        }
        if (bmq0Var.b(vn30Var.f37698a) != -1) {
            zz2Var.A(vn30Var, bmq0Var);
            return;
        }
        bmq0 bmq0Var2 = (bmq0) ((wcf0) this.c).get(vn30Var);
        if (bmq0Var2 != null) {
            zz2Var.A(vn30Var, bmq0Var2);
        }
    }

    public void b() {
        DsSegmentedGroup.f((DsSegmentedGroup) this.f35730a, (edl) this.d);
        ViewPager2 viewPager2 = (ViewPager2) this.b;
        viewPager2.c((xp6) this.e);
        yge0 adapter = viewPager2.getAdapter();
        if (adapter != null) {
            adapter.v((l5g) this.f);
        }
        L();
    }

    public xr c() {
        us00 us00Var = (us00) this.f35730a;
        return new xr(new bb6(us00Var), new m73(us00Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(List list, zje zjeVar) {
        bau bauVar;
        if (zjeVar instanceof bau) {
            bauVar = (bau) zjeVar;
            int i = bauVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bauVar.l = i - Integer.MIN_VALUE;
            } else {
                bauVar = new bau(this, zjeVar);
            }
        } else {
            bauVar = new bau(this, zjeVar);
        }
        Object objR = bauVar.j;
        wne wneVar = wne.f39444a;
        int i2 = bauVar.l;
        if (i2 == 0) {
            z1x.P(objR);
            bauVar.i = list;
            bauVar.l = 1;
            objR = ((hsj) this.d).r(new z7b[0], bauVar);
            if (objR == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = bauVar.i;
            z1x.P(objR);
        }
        ArrayList arrayList = ((a3b) objR).b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            long j = ((vh0) obj).g;
            if (j == 68090 || j == 52358) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            return list;
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            yx10 yx10Var = (yx10) obj2;
            sx10 sx10Var = yx10Var instanceof sx10 ? (sx10) yx10Var : null;
            if ((sx10Var != null ? sx10Var.f32951a : null) != iz30.z) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    public noc e() {
        return new noc((vff0) this.f35730a, (byte) 0);
    }

    public void f() {
        DsSegmentedGroup.f((DsSegmentedGroup) this.f35730a, null);
        ViewPager2 viewPager2 = (ViewPager2) this.b;
        viewPager2.g((xp6) this.e);
        yge0 adapter = viewPager2.getAdapter();
        if (adapter != null) {
            adapter.y((l5g) this.f);
        }
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        ((lya) this.e).invoke((String) this.f);
    }

    public dmt i() {
        return new dmt(r());
    }

    public rpt j() {
        return new rpt(c());
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        ImageView imageView = (ImageView) this.c;
        String str = (String) this.f35730a;
        if (str.equals((String) this.b)) {
            return;
        }
        gbe0 gbe0VarA = o5k0.a(imageView.getContext());
        k1x k1xVar = new k1x(imageView.getContext());
        k1xVar.c = str;
        t1x.h(k1xVar, imageView);
        t1x.c(k1xVar, R.drawable.ic_games_square);
        t1x.f(k1xVar, R.drawable.ic_games_square);
        Context context = imageView.getContext();
        context.getClass();
        float fCeil = (int) Math.ceil(context.getResources().getDisplayMetrics().density * 10.0f);
        lls0[] lls0VarArr = {new ahg0(fCeil, fCeil, fCeil, fCeil)};
        kuo kuoVar = q1x.f27974a;
        q1x.b(k1xVar, tx3.g0(lls0VarArr));
        k1xVar.e = new zri((lya) this.d, str, (byte) 17);
        gbe0VarA.a(k1xVar.a());
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0171  */
    /* JADX WARN: Code duplicated, block: B:42:0x018b A[LOOP:0: B:40:0x0185->B:42:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c9 A[LOOP:1: B:44:0x01bb->B:48:0x01c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:55:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public Serializable l(int i, boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, zje zjeVar) throws Throwable {
        uhj uhjVar;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        long j2;
        int i2;
        long j3;
        int i3;
        List list;
        boolean z11;
        List list2;
        Object objB;
        List list3;
        List list4;
        List list5;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        int i4;
        phj phjVar;
        int i5;
        uzc uzcVar = (uzc) this.c;
        knf0 knf0Var = (knf0) this.f;
        if (zjeVar instanceof uhj) {
            uhjVar = (uhj) zjeVar;
            int i6 = uhjVar.t;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                uhjVar.t = i6 - Integer.MIN_VALUE;
            } else {
                uhjVar = new uhj(this, zjeVar);
            }
        } else {
            uhjVar = new uhj(this, zjeVar);
        }
        Object objA = uhjVar.r;
        wne wneVar = wne.f39444a;
        int i7 = uhjVar.t;
        Throwable th = null;
        if (i7 == 0) {
            z1x.P(objA);
            int id = uzcVar.b().getId();
            int iB = knf0Var.b();
            String strC = knf0Var.c();
            jo20 jo20Var = new jo20();
            jo20Var.put("cfView", Integer.valueOf(id));
            if (i != 0) {
                jo20Var.put("country", Integer.valueOf(i));
            }
            jo20Var.put("fcountry", Integer.valueOf(iB));
            jo20Var.put("gr", 1357);
            jo20Var.put("lng", strC);
            jo20Var.put("ref", 1);
            if (z) {
                jo20Var.put("userId", Long.valueOf(j));
            }
            jo20 jo20VarJ = w6x.j(22, jo20Var, "whence");
            uhjVar.i = i;
            uhjVar.j = z;
            uhjVar.o = j;
            uhjVar.k = z2;
            uhjVar.l = z3;
            uhjVar.m = z4;
            z6 = z5;
            uhjVar.n = z6;
            uhjVar.t = 1;
            ucj ucjVar = (ucj) ((xr) this.b).b;
            objA = z2 ? ((pfj) ucjVar.invoke()).a(jo20VarJ, uhjVar) : ((pfj) ucjVar.invoke()).b(jo20VarJ, uhjVar);
            if (objA != wneVar) {
                z7 = z;
                z8 = z4;
                z9 = z2;
                z10 = z3;
                j2 = j;
                i2 = i;
            }
            return wneVar;
        }
        if (i7 == 1) {
            boolean z12 = uhjVar.n;
            z8 = uhjVar.m;
            z10 = uhjVar.l;
            z9 = uhjVar.k;
            j2 = uhjVar.o;
            z7 = uhjVar.j;
            i2 = uhjVar.i;
            z1x.P(objA);
            z6 = z12;
        } else {
            if (i7 == 2) {
                z11 = uhjVar.n;
                z8 = uhjVar.m;
                z10 = uhjVar.l;
                z9 = uhjVar.k;
                j3 = uhjVar.o;
                z7 = uhjVar.j;
                i3 = uhjVar.i;
                list = uhjVar.p;
                z1x.P(objA);
                th = null;
                list2 = (List) objA;
                zfo zfoVar = (zfo) this.e;
                uhjVar.p = list;
                uhjVar.q = list2;
                uhjVar.i = i3;
                uhjVar.j = z7;
                uhjVar.o = j3;
                uhjVar.k = z9;
                uhjVar.l = z10;
                uhjVar.m = z8;
                uhjVar.n = z11;
                uhjVar.t = 3;
                objB = zfoVar.b(uhjVar);
                if (objB != wneVar) {
                    list3 = list2;
                    objA = objB;
                    list4 = list;
                }
                return wneVar;
            }
            if (i7 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z11 = uhjVar.n;
            z8 = uhjVar.m;
            z10 = uhjVar.l;
            z9 = uhjVar.k;
            list3 = uhjVar.q;
            list4 = uhjVar.p;
            z1x.P(objA);
            th = null;
        }
        list5 = (List) objA;
        arrayList = new ArrayList(r3d.q(list4, 10));
        it = list4.iterator();
        while (it.hasNext()) {
            boolean z13 = z11;
            List list6 = list5;
            arrayList.add(wvb.e0((ohj) it.next(), z9, list3, list6, z10, z8, z13));
            z11 = z13;
            list5 = list6;
        }
        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        i4 = 0;
        for (Object obj : arrayList) {
            i5 = i4 + 1;
            if (i4 >= 0) {
                q3d.p();
                throw th;
            }
            arrayList2.add(dub.o0((chj) obj, uzcVar.a(), i4));
            i4 = i5;
        }
        phjVar = (phj) this.f35730a;
        phjVar.getClass();
        if (z9) {
            phjVar.c.d(arrayList2);
            return arrayList2;
        }
        phjVar.d.d(arrayList2);
        return arrayList2;
        List list7 = (List) ((dx5) objA).a();
        edo edoVar = (edo) this.d;
        uhjVar.p = list7;
        uhjVar.i = i2;
        uhjVar.j = z7;
        uhjVar.o = j2;
        uhjVar.k = z9;
        uhjVar.l = z10;
        uhjVar.m = z8;
        uhjVar.n = z6;
        uhjVar.t = 2;
        objA = edoVar.b(uhjVar);
        if (objA != wneVar) {
            j3 = j2;
            i3 = i2;
            list = list7;
            z11 = z6;
            list2 = (List) objA;
            zfo zfoVar2 = (zfo) this.e;
            uhjVar.p = list;
            uhjVar.q = list2;
            uhjVar.i = i3;
            uhjVar.j = z7;
            uhjVar.o = j3;
            uhjVar.k = z9;
            uhjVar.l = z10;
            uhjVar.m = z8;
            uhjVar.n = z11;
            uhjVar.t = 3;
            objB = zfoVar2.b(uhjVar);
            if (objB != wneVar) {
                list3 = list2;
                objA = objB;
                list4 = list;
                list5 = (List) objA;
                arrayList = new ArrayList(r3d.q(list4, 10));
                it = list4.iterator();
                while (it.hasNext()) {
                    boolean z14 = z11;
                    List list8 = list5;
                    arrayList.add(wvb.e0((ohj) it.next(), z9, list3, list8, z10, z8, z14));
                    z11 = z14;
                    list5 = list8;
                }
                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                i4 = 0;
                while (r2.hasNext()) {
                    i5 = i4 + 1;
                    if (i4 >= 0) {
                        q3d.p();
                        throw th;
                    }
                    arrayList2.add(dub.o0((chj) obj, uzcVar.a(), i4));
                    i4 = i5;
                }
                phjVar = (phj) this.f35730a;
                phjVar.getClass();
                if (z9) {
                    phjVar.c.d(arrayList2);
                    return arrayList2;
                }
                phjVar.d.d(arrayList2);
                return arrayList2;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:127|34|35|131|36|37|125|38|39|137|40|41|(9:44|129|45|123|46|121|(2:48|49)(1:52)|53|54)|100) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:44|129|45|123|46|121|(2:48|49)(1:52)|53|54) */
    /* JADX WARN: Code duplicated, block: B:101:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:103:0x02dc A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:71:0x01d6, B:74:0x01de, B:78:0x01f3, B:82:0x01fd, B:84:0x0201, B:89:0x0255, B:90:0x0277, B:92:0x0283, B:96:0x028d, B:98:0x0291, B:103:0x02dc, B:104:0x02ff, B:106:0x0320, B:107:0x0327, B:108:0x0328), top: B:120:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02ff A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:71:0x01d6, B:74:0x01de, B:78:0x01f3, B:82:0x01fd, B:84:0x0201, B:89:0x0255, B:90:0x0277, B:92:0x0283, B:96:0x028d, B:98:0x0291, B:103:0x02dc, B:104:0x02ff, B:106:0x0320, B:107:0x0327, B:108:0x0328), top: B:120:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x031e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x0320 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:71:0x01d6, B:74:0x01de, B:78:0x01f3, B:82:0x01fd, B:84:0x0201, B:89:0x0255, B:90:0x0277, B:92:0x0283, B:96:0x028d, B:98:0x0291, B:103:0x02dc, B:104:0x02ff, B:106:0x0320, B:107:0x0327, B:108:0x0328), top: B:120:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0328 A[Catch: Exception -> 0x01f0, TRY_LEAVE, TryCatch #0 {Exception -> 0x01f0, blocks: (B:71:0x01d6, B:74:0x01de, B:78:0x01f3, B:82:0x01fd, B:84:0x0201, B:89:0x0255, B:90:0x0277, B:92:0x0283, B:96:0x028d, B:98:0x0291, B:103:0x02dc, B:104:0x02ff, B:106:0x0320, B:107:0x0327, B:108:0x0328), top: B:120:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0175  */
    /* JADX WARN: Code duplicated, block: B:48:0x0187  */
    /* JADX WARN: Code duplicated, block: B:52:0x0191 A[Catch: Exception -> 0x018f, TRY_LEAVE, TryCatch #1 {Exception -> 0x018f, blocks: (B:49:0x0189, B:52:0x0191), top: B:121:0x0185 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x01de A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:71:0x01d6, B:74:0x01de, B:78:0x01f3, B:82:0x01fd, B:84:0x0201, B:89:0x0255, B:90:0x0277, B:92:0x0283, B:96:0x028d, B:98:0x0291, B:103:0x02dc, B:104:0x02ff, B:106:0x0320, B:107:0x0327, B:108:0x0328), top: B:120:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01f3 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:71:0x01d6, B:74:0x01de, B:78:0x01f3, B:82:0x01fd, B:84:0x0201, B:89:0x0255, B:90:0x0277, B:92:0x0283, B:96:0x028d, B:98:0x0291, B:103:0x02dc, B:104:0x02ff, B:106:0x0320, B:107:0x0327, B:108:0x0328), top: B:120:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0201 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:71:0x01d6, B:74:0x01de, B:78:0x01f3, B:82:0x01fd, B:84:0x0201, B:89:0x0255, B:90:0x0277, B:92:0x0283, B:96:0x028d, B:98:0x0291, B:103:0x02dc, B:104:0x02ff, B:106:0x0320, B:107:0x0327, B:108:0x0328), top: B:120:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x022e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0230  */
    /* JADX WARN: Code duplicated, block: B:89:0x0255 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:71:0x01d6, B:74:0x01de, B:78:0x01f3, B:82:0x01fd, B:84:0x0201, B:89:0x0255, B:90:0x0277, B:92:0x0283, B:96:0x028d, B:98:0x0291, B:103:0x02dc, B:104:0x02ff, B:106:0x0320, B:107:0x0327, B:108:0x0328), top: B:120:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0277 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:71:0x01d6, B:74:0x01de, B:78:0x01f3, B:82:0x01fd, B:84:0x0201, B:89:0x0255, B:90:0x0277, B:92:0x0283, B:96:0x028d, B:98:0x0291, B:103:0x02dc, B:104:0x02ff, B:106:0x0320, B:107:0x0327, B:108:0x0328), top: B:120:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0283 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:71:0x01d6, B:74:0x01de, B:78:0x01f3, B:82:0x01fd, B:84:0x0201, B:89:0x0255, B:90:0x0277, B:92:0x0283, B:96:0x028d, B:98:0x0291, B:103:0x02dc, B:104:0x02ff, B:106:0x0320, B:107:0x0327, B:108:0x0328), top: B:120:0x01d6 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x028a  */
    /* JADX WARN: Code duplicated, block: B:95:0x028c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0291 A[Catch: Exception -> 0x01f0, TryCatch #0 {Exception -> 0x01f0, blocks: (B:71:0x01d6, B:74:0x01de, B:78:0x01f3, B:82:0x01fd, B:84:0x0201, B:89:0x0255, B:90:0x0277, B:92:0x0283, B:96:0x028d, B:98:0x0291, B:103:0x02dc, B:104:0x02ff, B:106:0x0320, B:107:0x0327, B:108:0x0328), top: B:120:0x01d6 }] */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a5, code lost:
    
        r12 = r17;
        r20 = r18;
        r18 = r4;
        r4 = r20;
        r17 = r9;
        r9 = r8;
        r8 = r17;
        r17 = r12;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b4, code lost:
    
        r12 = r13;
        r14 = r0;
        r0 = r3;
        r3 = r16;
        r2 = r2;
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ba, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bf, code lost:
    
        r18 = r26;
        r2 = r2;
        r17 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c3, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c7, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c9, code lost:
    
        r26 = r11;
        r11 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d3, code lost:
    
        r16 = r26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:10:0x002d, B:30:0x011e], limit reached: 144 */
    /* JADX WARN: Type inference failed for: r12v12, types: [a.phj] */
    /* JADX WARN: Type inference failed for: r12v13, types: [a.phj] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v26 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r24v0, types: [a.uii] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x02bf -> B:102:0x02ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x02dc -> B:33:0x0142). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0255 -> B:33:0x0142). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(int r25, boolean r26, long r27, boolean r29, boolean r30, boolean r31, boolean r32, a.yje r33) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uii.m(int, boolean, long, boolean, boolean, boolean, boolean, a.yje):java.lang.Object");
    }

    public iqi n() {
        return new iqi((Object) new jru((Object) new dbv((us00) this.f35730a), (byte) 15), (Object) c(), (byte) 29);
    }

    public u8u o() {
        return new u8u(new nwd(), (vff0) this.f35730a, (j1q0) this.b);
    }

    public un30 p(int i) {
        lin0 fwjVar;
        HashMap map = (HashMap) this.c;
        un30 un30Var = (un30) map.get(Integer.valueOf(i));
        if (un30Var != null) {
            return un30Var;
        }
        HashMap map2 = (HashMap) this.b;
        lin0 lin0Var = (lin0) map2.get(Integer.valueOf(i));
        if (lin0Var == null) {
            final hsj hsjVar = (hsj) this.d;
            hsjVar.getClass();
            final byte b = 0;
            if (i != 0) {
                final byte b2 = 1;
                if (i != 1) {
                    final byte b3 = 2;
                    if (i != 2) {
                        final byte b4 = 3;
                        if (i == 3) {
                            fwjVar = new fwj(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(un30.class), b);
                        } else if (i == 4) {
                            lin0Var = new lin0() { // from class: a.ewj
                                @Override // a.lin0
                                public final Object get() {
                                    byte b5 = b4;
                                    hbj hbjVar = hsjVar;
                                    Object obj = this;
                                    switch (b5) {
                                        case 0:
                                            return gwj.f((Class) obj, hbjVar);
                                        case 1:
                                            return gwj.f((Class) obj, hbjVar);
                                        case 2:
                                            return gwj.f((Class) obj, hbjVar);
                                        default:
                                            return new a4c0(hbjVar, (huj) ((uii) obj).f35730a);
                                    }
                                }
                            };
                        } else {
                            jf4.o(twn.m(i, "Unrecognized contentType: "));
                            lin0Var = null;
                        }
                    } else {
                        final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(un30.class);
                        fwjVar = new lin0() { // from class: a.ewj
                            @Override // a.lin0
                            public final Object get() {
                                byte b5 = b3;
                                hbj hbjVar = hsjVar;
                                Object obj = clsAsSubclass;
                                switch (b5) {
                                    case 0:
                                        return gwj.f((Class) obj, hbjVar);
                                    case 1:
                                        return gwj.f((Class) obj, hbjVar);
                                    case 2:
                                        return gwj.f((Class) obj, hbjVar);
                                    default:
                                        return new a4c0(hbjVar, (huj) ((uii) obj).f35730a);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(un30.class);
                    fwjVar = new lin0() { // from class: a.ewj
                        @Override // a.lin0
                        public final Object get() {
                            byte b5 = b2;
                            hbj hbjVar = hsjVar;
                            Object obj = genericDeclarationAsSubclass;
                            switch (b5) {
                                case 0:
                                    return gwj.f((Class) obj, hbjVar);
                                case 1:
                                    return gwj.f((Class) obj, hbjVar);
                                case 2:
                                    return gwj.f((Class) obj, hbjVar);
                                default:
                                    return new a4c0(hbjVar, (huj) ((uii) obj).f35730a);
                            }
                        }
                    };
                }
                lin0Var = fwjVar;
            } else {
                final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(un30.class);
                lin0Var = new lin0() { // from class: a.ewj
                    @Override // a.lin0
                    public final Object get() {
                        byte b5 = b;
                        hbj hbjVar = hsjVar;
                        Object obj = genericDeclarationAsSubclass2;
                        switch (b5) {
                            case 0:
                                return gwj.f((Class) obj, hbjVar);
                            case 1:
                                return gwj.f((Class) obj, hbjVar);
                            case 2:
                                return gwj.f((Class) obj, hbjVar);
                            default:
                                return new a4c0(hbjVar, (huj) ((uii) obj).f35730a);
                        }
                    }
                };
            }
            map2.put(Integer.valueOf(i), lin0Var);
        }
        un30 un30Var2 = (un30) lin0Var.get();
        x860 x860Var = (x860) this.f;
        if (x860Var != null) {
            un30Var2.c(x860Var);
        }
        un30Var2.d((kwd) this.e);
        un30Var2.a();
        un30Var2.e();
        map.put(Integer.valueOf(i), un30Var2);
        return un30Var2;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e9 A[LOOP:0: B:32:0x00e3->B:34:0x00e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0116 A[LOOP:1: B:36:0x0108->B:40:0x0116, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable q(boolean z, zje zjeVar) {
        zhj zhjVar;
        List list;
        List list2;
        List list3;
        boolean z2;
        List list4;
        ArrayList arrayList;
        Iterator it;
        ArrayList arrayList2;
        int i;
        if (zjeVar instanceof zhj) {
            zhjVar = (zhj) zjeVar;
            int i2 = zhjVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zhjVar.n = i2 - Integer.MIN_VALUE;
            } else {
                zhjVar = new zhj(this, zjeVar);
            }
        } else {
            zhjVar = new zhj(this, zjeVar);
        }
        Object obj = zhjVar.l;
        wne wneVar = wne.f39444a;
        int i3 = zhjVar.n;
        int i4 = 0;
        if (i3 == 0) {
            z1x.P(obj);
            phj phjVar = (phj) this.f35730a;
            boolean zE = ((knf0) this.f).e();
            phjVar.getClass();
            InputStream inputStreamOpen = phjVar.f26999a.getAssets().open(zE ? "mocks/onboarding/expressDay_ru.json" : "mocks/onboarding/expressDay_en.json");
            inputStreamOpen.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
            try {
                String strK = n8n0.k(bufferedReader);
                bufferedReader.close();
                vby vbyVar = phjVar.b;
                vbyVar.getClass();
                List list5 = (List) ((dx5) vbyVar.b(dx5.Companion.serializer(new zw3(ohj.Companion.serializer(), (byte) 0)), strK)).a();
                edo edoVar = (edo) this.d;
                zhjVar.j = list5;
                zhjVar.i = z;
                zhjVar.n = 1;
                Object objB = edoVar.b(zhjVar);
                if (objB != wneVar) {
                    list = list5;
                    obj = objB;
                }
                return wneVar;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(bufferedReader, th);
                    throw th2;
                }
            }
        }
        if (i3 == 1) {
            z = zhjVar.i;
            list = zhjVar.j;
            z1x.P(obj);
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = zhjVar.i;
            List list6 = zhjVar.k;
            list3 = zhjVar.j;
            z1x.P(obj);
            list2 = list6;
        }
        z2 = z;
        list4 = (List) obj;
        arrayList = new ArrayList(r3d.q(list3, 10));
        it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(wvb.e0((ohj) it.next(), z2, list2, list4, true, true, false));
        }
        arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (Object obj2 : arrayList) {
            i = i4 + 1;
            if (i4 >= 0) {
                q3d.p();
                throw null;
            }
            arrayList2.add(dub.o0((chj) obj2, ((uzc) this.c).a(), i4));
            i4 = i;
        }
        return arrayList2;
        List list7 = (List) obj;
        zfo zfoVar = (zfo) this.e;
        zhjVar.j = list;
        zhjVar.k = list7;
        zhjVar.i = z;
        zhjVar.n = 2;
        Object objB2 = zfoVar.b(zhjVar);
        if (objB2 != wneVar) {
            list2 = list7;
            obj = objB2;
            list3 = list;
            z2 = z;
            list4 = (List) obj;
            arrayList = new ArrayList(r3d.q(list3, 10));
            it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(wvb.e0((ohj) it.next(), z2, list2, list4, true, true, false));
            }
            arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            while (r14.hasNext()) {
                i = i4 + 1;
                if (i4 >= 0) {
                    q3d.p();
                    throw null;
                }
                arrayList2.add(dub.o0((chj) obj2, ((uzc) this.c).a(), i4));
                i4 = i;
            }
            return arrayList2;
        }
        return wneVar;
    }

    public pru r() {
        j1q0 j1q0Var = (j1q0) this.b;
        return new pru(new nwd(), (vff0) this.f35730a, j1q0Var);
    }

    public xfu s() {
        return new xfu(H());
    }

    public thb t() {
        thb thbVar;
        n0o0 n0o0Var = (n0o0) this.e;
        n0o0 n0o0Var2 = (n0o0) this.d;
        meq meqVar = meq.V_5;
        meq meqVar2 = meq.V_1;
        if (meqVar.compareTo(meq.V_2) <= 0 && meqVar.compareTo(meqVar2) >= 0) {
            liv livVar = (liv) n0o0Var2.getValue();
            thbVar = livVar.f20123a.length() > 0 ? livVar : null;
            return thbVar != null ? thbVar : (tz2) n0o0Var.getValue();
        }
        liv livVar2 = (liv) n0o0Var2.getValue();
        if (livVar2.f20123a.length() <= 0) {
            livVar2 = null;
        }
        if (livVar2 != null) {
            return livVar2;
        }
        zm30 zm30Var = (zm30) ((n0o0) this.f).getValue();
        thbVar = zm30Var.f44605a.length() > 0 ? zm30Var : null;
        return thbVar != null ? thbVar : (tz2) n0o0Var.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0142 A[EDGE_INSN: B:114:0x0142->B:44:0x0142 BREAK  A[LOOP:7: B:37:0x011a->B:42:0x0135], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0120  */
    /* JADX WARN: Code duplicated, block: B:42:0x0135 A[LOOP:7: B:37:0x011a->B:42:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x0148  */
    /* JADX WARN: Code duplicated, block: B:48:0x0150  */
    /* JADX WARN: Code duplicated, block: B:50:0x0198  */
    /* JADX WARN: Code duplicated, block: B:52:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x026b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0284  */
    /* JADX WARN: Code duplicated, block: B:65:0x028c  */
    /* JADX WARN: Code duplicated, block: B:68:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:74:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x02be  */
    /* JADX WARN: Code duplicated, block: B:78:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:88:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0303  */
    /* JADX WARN: Code duplicated, block: B:91:0x0306  */
    /* JADX WARN: Code duplicated, block: B:93:0x0309  */
    /* JADX WARN: Code duplicated, block: B:94:0x030c  */
    public Serializable u(long j, List list, String str, boolean z, boolean z2, zje zjeVar) {
        duu duuVar;
        boolean z3;
        Object objD0;
        long j2;
        String str2;
        boolean z4;
        List list2;
        boolean z5;
        boolean z6;
        String str3;
        List list3;
        boolean zJ;
        ArrayList arrayList;
        Iterator it;
        wne wneVar;
        ArrayList arrayList2;
        bt7 bt7Var;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it2;
        String str4;
        long j3;
        Object next;
        ueo ueoVar;
        long j4;
        ArrayList arrayList5;
        String strA;
        List list4;
        ArrayList arrayList6;
        Iterator it3;
        int i;
        Object next2;
        int i2;
        long j5;
        Iterator it4;
        Object next3;
        xco xcoVar;
        String str5;
        int i3;
        ArrayList arrayList7;
        int i4;
        ArrayList arrayList8;
        String str6;
        String str7;
        if (zjeVar instanceof duu) {
            duuVar = (duu) zjeVar;
            int i5 = duuVar.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                duuVar.q = i5 - Integer.MIN_VALUE;
            } else {
                duuVar = new duu(this, zjeVar);
            }
        } else {
            duuVar = new duu(this, zjeVar);
        }
        Object objB = duuVar.o;
        wne wneVar2 = wne.f39444a;
        int i6 = duuVar.q;
        if (i6 == 0) {
            z1x.P(objB);
            so6 so6Var = (so6) this.f35730a;
            int id = ((uzc) this.b).b().getId();
            duuVar.j = str;
            duuVar.i = j;
            z3 = z;
            duuVar.m = z3;
            duuVar.n = z2;
            duuVar.q = 1;
            objD0 = qjj.d0(so6Var.e.b, new qo6(j, so6Var, id, list, (yje) null), duuVar);
            if (objD0 != wneVar2) {
                j2 = j;
                str2 = str;
                z4 = z2;
            }
            return wneVar2;
        }
        if (i6 == 1) {
            boolean z7 = duuVar.n;
            boolean z8 = duuVar.m;
            j2 = duuVar.i;
            str2 = duuVar.j;
            z1x.P(objB);
            objD0 = objB;
            z4 = z7;
            z3 = z8;
        } else if (i6 == 2) {
            boolean z9 = duuVar.n;
            boolean z10 = duuVar.m;
            j2 = duuVar.i;
            list2 = duuVar.k;
            str2 = duuVar.j;
            z1x.P(objB);
            z5 = z9;
            z6 = z10;
            str3 = str2;
            list3 = (List) objB;
            zJ = ((j1q0) this.f).f15748a.j();
            list2.getClass();
            list3.getClass();
            str3.getClass();
            arrayList = new ArrayList();
            it = list2.iterator();
            while (it.hasNext()) {
                bt7Var = (bt7) it.next();
                arrayList3 = new ArrayList();
                for (List<jg7> list5 : bt7Var.f3168a) {
                    arrayList4 = new ArrayList();
                    for (jg7 jg7Var : list5) {
                        it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                str4 = str3;
                                j3 = j2;
                                next = null;
                                break;
                            }
                            next = it2.next();
                            j3 = j2;
                            str4 = str3;
                            if (((ueo) next).f35538a == jg7Var.e) {
                                break;
                            }
                            j2 = j3;
                            str3 = str4;
                        }
                        ueoVar = (ueo) next;
                        if (ueoVar != null) {
                            j4 = j3;
                            list3 = list3;
                            wneVar2 = wneVar2;
                            it = it;
                            bt7Var = bt7Var;
                            arrayList3 = arrayList3;
                            jg7Var = jg7Var;
                            arrayList5 = arrayList4;
                            strA = "-";
                        } else if (jg7Var.e != 707) {
                            int i7 = ueoVar.c;
                            String str8 = ueoVar.b;
                            BigDecimal bigDecimalH = kotlin.text.b.h(String.valueOf(jg7Var.c));
                            cfo cfoVar = jg7Var.h;
                            arrayList5 = arrayList4;
                            j4 = j3;
                            strA = dii0.a(str8, cfoVar.f4272a, cfoVar.b, Integer.valueOf(i7), zJ, bigDecimalH, "", 0L, ueoVar.f35538a, nt20.j, z6, z5);
                        } else {
                            j4 = j3;
                            arrayList5 = arrayList4;
                            strA = str4;
                        }
                        String str9 = strA;
                        double d = jg7Var.f16467a;
                        long j6 = jg7Var.b;
                        double d2 = jg7Var.c;
                        boolean z11 = jg7Var.d;
                        long j7 = jg7Var.e;
                        String str10 = jg7Var.f;
                        cfo cfoVar2 = jg7Var.h;
                        str10.getClass();
                        arrayList5.add(new jg7(d, j6, d2, z11, j7, str10, str9, cfoVar2));
                        zJ = zJ;
                        arrayList4 = arrayList5;
                        arrayList3 = arrayList3;
                        z6 = z6;
                        z5 = z5;
                        wneVar2 = wneVar2;
                        list3 = list3;
                        j2 = j4;
                        bt7Var = bt7Var;
                        str3 = str4;
                        it = it;
                    }
                    arrayList3.add(arrayList4);
                    list3 = list3;
                    j2 = j2;
                    bt7Var = bt7Var;
                    str3 = str3;
                    it = it;
                }
                arrayList.add(new bt7(bt7Var.b, arrayList3));
                list3 = list3;
                zJ = zJ;
                it = it;
                j2 = j2;
                str3 = str3;
            }
            wneVar = wneVar2;
            edo edoVar = (edo) this.d;
            duuVar.j = null;
            duuVar.k = null;
            duuVar.l = arrayList;
            duuVar.i = j2;
            duuVar.m = z6;
            duuVar.n = z5;
            duuVar.q = 3;
            objB = edoVar.b(duuVar);
            if (objB == wneVar) {
                return wneVar;
            }
            arrayList2 = arrayList;
        } else {
            if (i6 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList2 = duuVar.l;
            z1x.P(objB);
        }
        list4 = (List) objB;
        arrayList2.getClass();
        list4.getClass();
        arrayList6 = new ArrayList();
        it3 = arrayList2.iterator();
        i = 0;
        while (it3.hasNext()) {
            next2 = it3.next();
            i2 = i + 1;
            if (i >= 0) {
                q3d.p();
                throw null;
            }
            bt7 bt7Var2 = (bt7) next2;
            j5 = ((jg7) CollectionsKt.U((List) CollectionsKt.U(bt7Var2.f3168a))).b;
            it4 = list4.iterator();
            do {
                if (it4.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it4.next();
            } while (((xco) next3).f40655a != j5);
            xcoVar = (xco) next3;
            if (xcoVar != null) {
                str5 = xcoVar.b;
            } else {
                str5 = null;
            }
            if (str5 == null) {
                str5 = "";
            }
            if (xcoVar != null) {
                i3 = (int) xcoVar.c;
            } else {
                i3 = 0;
            }
            List<List> list6 = bt7Var2.f3168a;
            i4 = 10;
            arrayList7 = new ArrayList(r3d.q(list6, 10));
            for (List<jg7> list7 : list6) {
                arrayList8 = new ArrayList(r3d.q(list7, i4));
                for (jg7 jg7Var2 : list7) {
                    if (xcoVar != null) {
                        str6 = xcoVar.b;
                    } else {
                        str6 = null;
                    }
                    if (str6 == null) {
                        str7 = "";
                    } else {
                        str7 = str6;
                    }
                    jg7Var2.getClass();
                    Iterator it5 = it3;
                    List list8 = list4;
                    long j8 = jg7Var2.e;
                    double d3 = jg7Var2.f16467a;
                    long j9 = jg7Var2.b;
                    double d4 = jg7Var2.c;
                    String str11 = jg7Var2.g;
                    arrayList8.add(new iq7(j8, d3, j9, d4, jg7Var2.d, jg7Var2.f, str11, str7, jg7Var2.h, 1998736));
                    list4 = list8;
                    it3 = it5;
                }
                arrayList7.add(arrayList8);
                i4 = 10;
            }
            arrayList6.add(new l07(j5, str5, i3, arrayList7));
            i = i2;
            it3 = it3;
        }
        return arrayList6;
        list2 = (List) objD0;
        zfo zfoVar = (zfo) this.c;
        duuVar.j = str2;
        duuVar.k = list2;
        duuVar.i = j2;
        duuVar.m = z3;
        duuVar.n = z4;
        duuVar.q = 2;
        Object objB2 = zfoVar.b(duuVar);
        if (objB2 != wneVar2) {
            z5 = z4;
            z6 = z3;
            objB = objB2;
            str3 = str2;
            list3 = (List) objB;
            zJ = ((j1q0) this.f).f15748a.j();
            list2.getClass();
            list3.getClass();
            str3.getClass();
            arrayList = new ArrayList();
            it = list2.iterator();
            while (it.hasNext()) {
                bt7Var = (bt7) it.next();
                arrayList3 = new ArrayList();
                while (r22.hasNext()) {
                    arrayList4 = new ArrayList();
                    while (r23.hasNext()) {
                        it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                str4 = str3;
                                j3 = j2;
                                next = null;
                                break;
                            }
                            next = it2.next();
                            j3 = j2;
                            str4 = str3;
                            if (((ueo) next).f35538a == jg7Var.e) {
                                break;
                                break;
                            }
                            j2 = j3;
                            str3 = str4;
                        }
                        ueoVar = (ueo) next;
                        if (ueoVar != null) {
                            j4 = j3;
                            list3 = list3;
                            wneVar2 = wneVar2;
                            it = it;
                            bt7Var = bt7Var;
                            arrayList3 = arrayList3;
                            jg7Var = jg7Var;
                            arrayList5 = arrayList4;
                            strA = "-";
                        } else if (jg7Var.e != 707) {
                            int i8 = ueoVar.c;
                            String str12 = ueoVar.b;
                            BigDecimal bigDecimalH2 = kotlin.text.b.h(String.valueOf(jg7Var.c));
                            cfo cfoVar3 = jg7Var.h;
                            arrayList5 = arrayList4;
                            j4 = j3;
                            strA = dii0.a(str12, cfoVar3.f4272a, cfoVar3.b, Integer.valueOf(i8), zJ, bigDecimalH2, "", 0L, ueoVar.f35538a, nt20.j, z6, z5);
                        } else {
                            j4 = j3;
                            arrayList5 = arrayList4;
                            strA = str4;
                        }
                        String str13 = strA;
                        double d5 = jg7Var.f16467a;
                        long j10 = jg7Var.b;
                        double d6 = jg7Var.c;
                        boolean z12 = jg7Var.d;
                        long j11 = jg7Var.e;
                        String str14 = jg7Var.f;
                        cfo cfoVar4 = jg7Var.h;
                        str14.getClass();
                        arrayList5.add(new jg7(d5, j10, d6, z12, j11, str14, str13, cfoVar4));
                        zJ = zJ;
                        arrayList4 = arrayList5;
                        arrayList3 = arrayList3;
                        z6 = z6;
                        z5 = z5;
                        wneVar2 = wneVar2;
                        list3 = list3;
                        j2 = j4;
                        bt7Var = bt7Var;
                        str3 = str4;
                        it = it;
                    }
                    arrayList3.add(arrayList4);
                    list3 = list3;
                    j2 = j2;
                    bt7Var = bt7Var;
                    str3 = str3;
                    it = it;
                }
                arrayList.add(new bt7(bt7Var.b, arrayList3));
                list3 = list3;
                zJ = zJ;
                it = it;
                j2 = j2;
                str3 = str3;
            }
            wneVar = wneVar2;
            edo edoVar2 = (edo) this.d;
            duuVar.j = null;
            duuVar.k = null;
            duuVar.l = arrayList;
            duuVar.i = j2;
            duuVar.m = z6;
            duuVar.n = z5;
            duuVar.q = 3;
            objB = edoVar2.b(duuVar);
            if (objB == wneVar) {
                return wneVar;
            }
            arrayList2 = arrayList;
            list4 = (List) objB;
            arrayList2.getClass();
            list4.getClass();
            arrayList6 = new ArrayList();
            it3 = arrayList2.iterator();
            i = 0;
            while (it3.hasNext()) {
                next2 = it3.next();
                i2 = i + 1;
                if (i >= 0) {
                    q3d.p();
                    throw null;
                }
                bt7 bt7Var3 = (bt7) next2;
                j5 = ((jg7) CollectionsKt.U((List) CollectionsKt.U(bt7Var3.f3168a))).b;
                it4 = list4.iterator();
                do {
                    if (it4.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it4.next();
                } while (((xco) next3).f40655a != j5);
                xcoVar = (xco) next3;
                if (xcoVar != null) {
                    str5 = xcoVar.b;
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str5 = "";
                }
                if (xcoVar != null) {
                    i3 = (int) xcoVar.c;
                } else {
                    i3 = 0;
                }
                List<List> list9 = bt7Var3.f3168a;
                i4 = 10;
                arrayList7 = new ArrayList(r3d.q(list9, 10));
                while (r5.hasNext()) {
                    arrayList8 = new ArrayList(r3d.q(list7, i4));
                    while (r3.hasNext()) {
                        if (xcoVar != null) {
                            str6 = xcoVar.b;
                        } else {
                            str6 = null;
                        }
                        if (str6 == null) {
                            str7 = "";
                        } else {
                            str7 = str6;
                        }
                        jg7Var2.getClass();
                        Iterator it6 = it3;
                        List list10 = list4;
                        long j12 = jg7Var2.e;
                        double d7 = jg7Var2.f16467a;
                        long j13 = jg7Var2.b;
                        double d8 = jg7Var2.c;
                        String str15 = jg7Var2.g;
                        arrayList8.add(new iq7(j12, d7, j13, d8, jg7Var2.d, jg7Var2.f, str15, str7, jg7Var2.h, 1998736));
                        list4 = list10;
                        it3 = it6;
                    }
                    arrayList7.add(arrayList8);
                    i4 = 10;
                }
                arrayList6.add(new l07(j5, str5, i3, arrayList7));
                i = i2;
                it3 = it3;
            }
            return arrayList6;
        }
        return wneVar2;
    }

    public yuu v() {
        xr xrVarC = c();
        us00 us00Var = (us00) this.f35730a;
        return new yuu(xrVarC, new fck0((Object) new nvu(us00Var), (Object) new ywu(us00Var), (byte) 0));
    }

    public pyu w() {
        vff0 vff0Var = (vff0) this.f35730a;
        vff0Var.getClass();
        pyu pyuVar = new pyu();
        pyuVar.f27815a = vff0Var;
        return pyuVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Serializable x(long j, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, zje zjeVar) {
        euu euuVar;
        ArrayList arrayList3;
        BetViewType betViewType;
        if (zjeVar instanceof euu) {
            euuVar = (euu) zjeVar;
            int i = euuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                euuVar.l = i - Integer.MIN_VALUE;
            } else {
                euuVar = new euu(this, zjeVar);
            }
        } else {
            euuVar = new euu(this, zjeVar);
        }
        euu euuVar2 = euuVar;
        Object objU = euuVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = euuVar2.l;
        if (i2 == 0) {
            z1x.P(objU);
            String strA = ((us3) ((peg0) this.e).b).a();
            arrayList3 = arrayList2;
            euuVar2.i = arrayList3;
            euuVar2.l = 1;
            objU = u(j, arrayList, strA, z, z2, euuVar2);
            if (objU == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList4 = euuVar2.i;
            z1x.P(objU);
            arrayList3 = arrayList4;
        }
        List<l07> list = (List) objU;
        ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
        for (l07 l07Var : list) {
            l07Var.getClass();
            ArrayList arrayList6 = l07Var.d;
            Iterator it = arrayList6.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int size = ((List) it.next()).size();
                if (size > i3) {
                    i3 = size;
                }
            }
            ArrayList arrayList7 = new ArrayList();
            for (int i4 = 0; i4 < i3; i4++) {
                int size2 = arrayList6.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    List list2 = (List) arrayList6.get(i5);
                    if (i4 < list2.size()) {
                        arrayList7.add(nia0.f0((iq7) list2.get(i4)));
                    } else {
                        arrayList7.add(nia0.f0(new iq7(0L, 0.0d, 0L, 0.0d, false, null, null, null, null, 4194303)));
                    }
                }
            }
            List listA0 = CollectionsKt.A0(arrayList7, new vt5((byte) 5));
            ro7 ro7Var = l07Var.f;
            ro7Var.getClass();
            int iOrdinal = ro7Var.ordinal();
            if (iOrdinal == 0) {
                betViewType = BetViewType.f46430a;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                betViewType = BetViewType.b;
            }
            arrayList5.add(new BetGroupZip(-1L, l07Var.f19184a, l07Var.b, l07Var.c, arrayList6.size(), listA0, cy2.A(listA0, betViewType, arrayList6.size()), false, betViewType));
        }
        ArrayList arrayList8 = new ArrayList(r3d.q(arrayList5, 10));
        int i6 = 0;
        for (Object obj : arrayList5) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                q3d.p();
                throw null;
            }
            BetGroupZip betGroupZipA = (BetGroupZip) obj;
            if (!((so6) this.f35730a).b.f || i6 >= 3) {
                BetGroupZip betGroupZip = (BetGroupZip) CollectionsKt.W(i6, arrayList3);
                if (betGroupZip != null && betGroupZip.b == betGroupZipA.b) {
                    betGroupZipA = BetGroupZip.a(betGroupZipA, null, ((BetGroupZip) arrayList3.get(i6)).h, 383);
                }
            } else {
                betGroupZipA = BetGroupZip.a(betGroupZipA, null, true, 383);
            }
            arrayList8.add(betGroupZipA);
            i6 = i7;
        }
        return arrayList8;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0147  */
    /* JADX WARN: Code duplicated, block: B:31:0x0165 A[PHI: r1 r6 r7 r8 r9 r10
  0x0165: PHI (r1v14 java.lang.Object) = (r1v13 java.lang.Object), (r1v1 java.lang.Object) binds: [B:29:0x0162, B:18:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r6v6 boolean) = (r6v4 boolean), (r6v7 boolean) binds: [B:29:0x0162, B:18:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r7v9 int) = (r7v7 int), (r7v10 int) binds: [B:29:0x0162, B:18:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v5 java.lang.String) binds: [B:29:0x0162, B:18:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v4 java.lang.String) binds: [B:29:0x0162, B:18:0x00eb] A[DONT_GENERATE, DONT_INLINE]
  0x0165: PHI (r10v3 java.lang.String) = (r10v1 java.lang.String), (r10v5 java.lang.String) binds: [B:29:0x0162, B:18:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x017d  */
    /* JADX WARN: Code duplicated, block: B:38:0x019e A[PHI: r1 r6 r7 r8 r9 r10 r11 r12
  0x019e: PHI (r1v20 java.lang.Object) = (r1v19 java.lang.Object), (r1v1 java.lang.Object) binds: [B:36:0x019b, B:16:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r6v10 boolean) = (r6v8 boolean), (r6v11 boolean) binds: [B:36:0x019b, B:16:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r7v13 int) = (r7v11 int), (r7v14 int) binds: [B:36:0x019b, B:16:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r8v9 java.lang.String) = (r8v7 java.lang.String), (r8v10 java.lang.String) binds: [B:36:0x019b, B:16:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r9v8 java.lang.String) = (r9v5 java.lang.String), (r9v10 java.lang.String) binds: [B:36:0x019b, B:16:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r10v9 java.lang.String) = (r10v6 java.lang.String), (r10v11 java.lang.String) binds: [B:36:0x019b, B:16:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r11v6 java.lang.String) = (r11v3 java.lang.String), (r11v8 java.lang.String) binds: [B:36:0x019b, B:16:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x019e: PHI (r12v4 java.lang.String) = (r12v2 java.lang.String), (r12v6 java.lang.String) binds: [B:36:0x019b, B:16:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x027f  */
    /* JADX WARN: Code duplicated, block: B:55:0x029b  */
    /* JADX WARN: Code duplicated, block: B:57:0x029e  */
    /* JADX WARN: Code duplicated, block: B:59:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:81:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01df, code lost:
    
        if (r1 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(int r20, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uii.y(int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0092  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097 A[RETURN] */
    public Object z(zje zjeVar) {
        Object obj;
        Object next;
        sx10 sx10Var;
        boolean zJ = ((lbu) this.c).j();
        sff0 sff0VarA = ((pru) this.b).a();
        if (!zJ) {
            hl1 hl1Var = sff0VarA.b;
            if (hl1Var.f13233a.b) {
                boolean z = hl1Var.z || hl1Var.A;
                sx3 sx3VarI = CollectionsKt.I(((f4u) this.f35730a).b().e);
                r9u r9uVar = (r9u) this.e;
                ygp ygpVar = ygp.E1;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                List listT = pgi0.t(pgi0.p(qbc.N(sx3VarI, sff0VarA, ((epc) this.f).a().f13512a, j1q0Var.f15748a.d(ygpVar), false, z, false, 32), new eo0((byte) 17)));
                Iterator it = listT.iterator();
                do {
                    obj = null;
                    if (it.hasNext()) {
                        next = it.next();
                        yx10 yx10Var = (yx10) next;
                        sx10Var = yx10Var instanceof sx10 ? (sx10) yx10Var : null;
                    }
                    if (obj != null) {
                        return d(listT, zjeVar);
                    }
                    return listT;
                } while ((sx10Var != null ? sx10Var.f32951a : null) != iz30.z);
                obj = next;
                if (obj != null) {
                    return d(listT, zjeVar);
                }
                return listT;
            }
        }
        return iun.f15405a;
    }

    public /* synthetic */ uii(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.f35730a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }

    public uii(DsSegmentedGroup dsSegmentedGroup, ViewPager2 viewPager2, Function1 function1) {
        viewPager2.getClass();
        this.f35730a = dsSegmentedGroup;
        this.b = viewPager2;
        this.c = function1;
        this.d = new edl(this, (byte) 21);
        this.e = new xp6(this, (byte) 6);
        this.f = new l5g(this, (byte) 2);
    }

    public uii(knf0 knf0Var, tgk tgkVar, u8u u8uVar, zx10 zx10Var, ctf0 ctf0Var, pru pruVar) {
        knf0Var.getClass();
        tgkVar.getClass();
        ctf0Var.getClass();
        this.f35730a = knf0Var;
        this.b = tgkVar;
        this.c = u8uVar;
        this.d = zx10Var;
        this.e = ctf0Var;
        this.f = pruVar;
    }

    public uii(zfo zfoVar, edo edoVar, mne mneVar, j1q0 j1q0Var, pru pruVar) {
        zfoVar.getClass();
        edoVar.getClass();
        j1q0Var.getClass();
        this.f35730a = zfoVar;
        this.b = edoVar;
        this.c = mneVar;
        this.d = j1q0Var;
        this.e = pruVar;
        this.f = maz.b(new jcs(this, (byte) 20));
    }

    public uii(f4u f4uVar, pru pruVar, lbu lbuVar, hsj hsjVar, r9u r9uVar, epc epcVar) {
        pruVar.getClass();
        lbuVar.getClass();
        r9uVar.getClass();
        this.f35730a = f4uVar;
        this.b = pruVar;
        this.c = lbuVar;
        this.d = hsjVar;
        this.e = r9uVar;
        this.f = epcVar;
    }

    public uii(lsn lsnVar, k7u k7uVar, ryu ryuVar, rqt rqtVar, hnu hnuVar, x4u x4uVar, nrt nrtVar) {
        k7uVar.getClass();
        this.f35730a = lsnVar;
        this.b = k7uVar;
        this.c = ryuVar;
        this.d = hnuVar;
        this.e = x4uVar;
        this.f = nrtVar;
    }

    public uii(jru jruVar, m0u m0uVar, cdu cduVar, k9c k9cVar, art artVar, f4u f4uVar, ikt0 ikt0Var) {
        this.f35730a = jruVar;
        this.b = m0uVar;
        this.c = cduVar;
        this.d = k9cVar;
        this.e = f4uVar;
        this.f = ikt0Var;
    }

    public uii(so6 so6Var, uzc uzcVar, zfo zfoVar, edo edoVar, peg0 peg0Var, j1q0 j1q0Var) {
        zfoVar.getClass();
        edoVar.getClass();
        j1q0Var.getClass();
        this.f35730a = so6Var;
        this.b = uzcVar;
        this.c = zfoVar;
        this.d = edoVar;
        this.e = peg0Var;
        this.f = j1q0Var;
    }

    public uii(rpt rptVar, ocl oclVar, r9u r9uVar, pru pruVar, lsn lsnVar, rbu rbuVar) {
        r9uVar.getClass();
        this.f35730a = rptVar;
        this.b = oclVar;
        this.c = r9uVar;
        this.d = pruVar;
        this.e = lsnVar;
        this.f = rbuVar;
    }

    public uii(phj phjVar, xr xrVar, uzc uzcVar, edo edoVar, zfo zfoVar, knf0 knf0Var) {
        phjVar.getClass();
        edoVar.getClass();
        zfoVar.getClass();
        knf0Var.getClass();
        this.f35730a = phjVar;
        this.b = xrVar;
        this.c = uzcVar;
        this.d = edoVar;
        this.e = zfoVar;
        this.f = knf0Var;
    }

    public uii(cad cadVar, nr00 nr00Var, BonusSelectionScreenParams bonusSelectionScreenParams, ctf0 ctf0Var, duj dujVar) {
        this.f35730a = bonusSelectionScreenParams;
        this.b = ctf0Var;
        this.c = nr00Var;
        this.d = cadVar;
        this.e = dujVar;
        this.f = new fri(this, (byte) 0);
    }

    public uii(cad cadVar, iw20 iw20Var, epi0 epi0Var, ctf0 ctf0Var, i1w0 i1w0Var) {
        this.b = cadVar;
        this.c = ctf0Var;
        this.f35730a = iw20Var;
        this.d = i1w0Var;
        this.e = epi0Var;
        this.f = new fri(this, (byte) 9);
    }

    public uii(cad cadVar, xhi xhiVar, SubGamesFilterBottomSheetParams subGamesFilterBottomSheetParams, g2v g2vVar, ctf0 ctf0Var) {
        this.f35730a = subGamesFilterBottomSheetParams;
        this.b = xhiVar;
        this.c = g2vVar;
        this.d = ctf0Var;
        this.e = cadVar;
        this.f = new rti(this, (byte) 20);
    }

    public uii(cad cadVar, nr00 nr00Var, RegistrationBonusDefaultScreenParams registrationBonusDefaultScreenParams, ctf0 ctf0Var, duj dujVar) {
        this.f35730a = registrationBonusDefaultScreenParams;
        this.b = ctf0Var;
        this.c = nr00Var;
        this.d = cadVar;
        this.e = dujVar;
        this.f = new ppi(this, (byte) 29);
    }

    public uii(cad cadVar, btt0 btt0Var, knf0 knf0Var, r9u r9uVar) {
        this.f35730a = r9uVar;
        this.b = cadVar;
        this.c = knf0Var;
        this.d = btt0Var;
        byte b = 14;
        this.e = mbl.b(new gji(this, 0, b));
        this.f = mbl.b(new gji(this, 1, b));
    }

    public uii(iw20 iw20Var, sys0 sys0Var, n3w n3wVar, Boolean bool, Boolean bool2) {
        this.f35730a = iw20Var;
        this.b = n3wVar;
        this.c = sys0Var;
        this.d = bool;
        this.e = bool2;
        this.f = new tii(this, (byte) 0);
    }

    public uii(cad cadVar, iw20 iw20Var, i1w0 i1w0Var, ctf0 ctf0Var, hfk0 hfk0Var, nqh0 nqh0Var) {
        this.b = i1w0Var;
        this.c = nqh0Var;
        this.d = ctf0Var;
        this.f35730a = iw20Var;
        this.e = cadVar;
        this.f = new fri(this, (byte) 22);
    }

    public uii(j1q0 j1q0Var, sa10 sa10Var, mne mneVar, a6u a6uVar, duj dujVar) {
        this.f35730a = a6uVar;
        this.b = sa10Var;
        this.c = mneVar;
        this.d = j1q0Var;
        this.e = dujVar;
        this.f = n0k0.a(new kzi(this, (byte) 3));
    }

    public uii(cad cadVar, esg0 esg0Var, wdk0 wdk0Var, ctf0 ctf0Var, yox yoxVar, a6u a6uVar) {
        this.f35730a = a6uVar;
        this.b = esg0Var;
        this.c = ctf0Var;
        this.d = yoxVar;
        this.e = cadVar;
        this.f = new kzi(this, (byte) 5);
    }

    public uii(wdd0 wdd0Var, us00 us00Var, vwb0 vwb0Var, gst0 gst0Var, b3c0 b3c0Var, t940 t940Var) {
        this.f35730a = us00Var;
        this.b = vwb0Var;
        this.c = wdd0Var;
        this.d = b3c0Var;
        this.e = gst0Var;
        this.f = t940Var;
    }

    public uii(v6k v6kVar, j1q0 j1q0Var, vff0 vff0Var, ony onyVar, wgu wguVar, o470 o470Var, eyg0 eyg0Var) {
        this.f35730a = vff0Var;
        this.b = j1q0Var;
        this.c = onyVar;
        this.d = wguVar;
        this.e = o470Var;
        this.f = eyg0Var;
    }

    public uii(huj hujVar, kwd kwdVar) {
        this.f35730a = hujVar;
        this.e = kwdVar;
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public uii(amq0 amq0Var) {
        this.f35730a = amq0Var;
        v3x v3xVar = b4x.b;
        this.b = rcf0.e;
        this.c = wcf0.g;
    }
}
