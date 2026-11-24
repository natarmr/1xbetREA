package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qvk0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29390a = 0;
    public final /* synthetic */ pru b;
    public final /* synthetic */ bzt c;
    public final /* synthetic */ lbu d;
    public final /* synthetic */ svu e;
    public final /* synthetic */ r9u f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ qvk0(lbu lbuVar, pru pruVar, svu svuVar, wiu wiuVar, bzt bztVar, y78 y78Var, SpecialEventTabScreenParams specialEventTabScreenParams, vzg0 vzg0Var, kuu kuuVar, r9u r9uVar) {
        this.d = lbuVar;
        this.b = pruVar;
        this.e = svuVar;
        this.g = wiuVar;
        this.c = bztVar;
        this.h = y78Var;
        this.i = specialEventTabScreenParams;
        this.j = vzg0Var;
        this.k = kuuVar;
        this.f = r9uVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x018b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0190  */
    /* JADX WARN: Code duplicated, block: B:24:0x0193  */
    /* JADX WARN: Code duplicated, block: B:26:0x0196  */
    /* JADX WARN: Code duplicated, block: B:28:0x0199  */
    /* JADX WARN: Code duplicated, block: B:30:0x019e  */
    /* JADX WARN: Code duplicated, block: B:31:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:33:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:34:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:46:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e5  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        suk0 suk0Var;
        lq5 jq5Var;
        int iOrdinal;
        h2r0 h2r0Var;
        uql0 uql0Var;
        String str;
        int iHashCode;
        f3v0 f3v0Var;
        byte b = this.f29390a;
        Object obj = this.k;
        r9u r9uVar = this.f;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        svu svuVar = this.e;
        Object obj5 = this.g;
        lbu lbuVar = this.d;
        bzt bztVar = this.c;
        pru pruVar = this.b;
        switch (b) {
            case 0:
                y78 y78Var = (y78) obj4;
                SpecialEventTabScreenParams specialEventTabScreenParams = (SpecialEventTabScreenParams) obj3;
                vzg0 vzg0Var = (vzg0) obj2;
                kuu kuuVar = (kuu) obj;
                boolean zJ = lbuVar.j();
                sff0 sff0VarA = pruVar.a();
                boolean zL = svuVar.l();
                Locale localeA = ((wiu) obj5).a();
                int i = bztVar.f3488a.a().r;
                int i2 = specialEventTabScreenParams.f46974a;
                List list = specialEventTabScreenParams.e;
                boolean z = specialEventTabScreenParams.d;
                Set set = (Set) vzg0Var.a("MAIN_EXPANDED_IDS_KEY");
                if (set == null) {
                    set = xun.f41520a;
                }
                Set set2 = set;
                Set set3 = (Set) vzg0Var.a("TEAM_EXPANDED_IDS_KEY");
                if (set3 == null) {
                    set3 = xun.f41520a;
                }
                lok0 lok0VarA = kuuVar.a(specialEventTabScreenParams.f46974a);
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                list.getClass();
                set2.getClass();
                set3.getClass();
                iun iunVar = iun.f15405a;
                xl9 xl9Var = new xl9(null, iunVar);
                a9l0 a9l0Var = new a9l0(-321L, iunVar);
                atk0 atk0Var = atk0.f1436a;
                sdt sdtVar = new sdt(atk0Var, iunVar, iunVar, iunVar, false, set2);
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    switch (((Number) it.next()).intValue()) {
                        case 1:
                            suk0Var = nuk0.f24153a;
                            break;
                        case 2:
                            suk0Var = ouk0.f25882a;
                            break;
                        case 3:
                            suk0Var = juk0.f17158a;
                            break;
                        case 4:
                            suk0Var = huk0.f13685a;
                            break;
                        case 5:
                            suk0Var = cuk0.f4989a;
                            break;
                        case 6:
                            suk0Var = ztk0.f44965a;
                            break;
                        case 7:
                            suk0Var = muk0.f22417a;
                            break;
                        case 8:
                            suk0Var = iuk0.f15401a;
                            break;
                        case 9:
                            suk0Var = euk0.f8423a;
                            break;
                        case 10:
                            suk0Var = kuk0.f18915a;
                            break;
                        case 11:
                            suk0Var = wtk0.f39745a;
                            break;
                        case 12:
                            suk0Var = utk0.f36259a;
                            break;
                        case 13:
                            suk0Var = vtk0.f38011a;
                            break;
                        case 14:
                            suk0Var = xtk0.f41468a;
                            break;
                        case 15:
                            suk0Var = buk0.f3235a;
                            break;
                        case 16:
                            suk0Var = ytk0.f43222a;
                            break;
                        case 17:
                            suk0Var = auk0.f1483a;
                            break;
                        case 18:
                            suk0Var = duk0.f6699a;
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            suk0Var = guk0.f11933a;
                            break;
                        case 20:
                            suk0Var = fuk0.f10168a;
                            break;
                        default:
                            suk0Var = ruk0.f31133a;
                            break;
                    }
                    arrayList.add(suk0Var);
                }
                iun iunVar2 = iun.f15405a;
                fvk0 fvk0Var = new fvk0(atk0Var, iunVar2, iunVar2, iunVar2);
                bvk0 bvk0Var = new bvk0(atk0Var, iunVar2, iunVar2);
                return new dvk0(false, xl9Var, a9l0Var, sdtVar, arrayList, null, null, null, new evk0(atk0Var, iunVar2), new lpp0(new wpp0(atk0Var, iunVar2), new vpp0(atk0Var, iunVar2), new opp0(atk0Var, iunVar2, set3)), new pvk0(atk0Var, iunVar2, iunVar2), new rtk0(atk0Var, iunVar2), fvk0Var, bvk0Var, new otk0(atk0Var, iunVar2), new jwk0(atk0Var, iunVar2, 0), new gqk0(atk0Var, null), new gtk0(atk0Var, iunVar2), new ltk0(atk0Var, iunVar2), new etk0(atk0Var, iunVar2), new qtk0(atk0Var, null), new ntk0(atk0Var, iunVar2), new dtk0(atk0Var, iunVar2), new avk0(atk0Var, iunVar2), new ctk0(atk0Var, iunVar2, 0), new stk0(atk0Var, iunVar2), null, mtk0.f22375a, new ttk0(i2, z, lok0VarA.f20396a, lok0VarA.f, lok0VarA.g, list, lok0VarA.n, lok0VarA.p, lok0VarA.i, zJ, sff0VarA.J1, sff0VarA.J, y78Var, xdx.P(lok0VarA.e, sff0VarA), zL, sff0VarA.O0, lok0VarA.u, lok0VarA.e, localeA, i), zD);
            default:
                sff0 sff0VarA2 = pruVar.a();
                int i3 = bztVar.f3488a.a().r;
                boolean zJ2 = lbuVar.j();
                boolean zBooleanValue = ((Boolean) ((tgk) ((rrc) obj5).b).i.getValue()).booleanValue();
                boolean zL2 = svuVar.l();
                boolean z2 = !h97.A((wyu) obj4, uaq0.f35345a);
                List listA = ((luu) obj3).f20692a.a();
                ((qho) obj2).a();
                ygp ygpVar2 = ygp.t;
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                boolean zD2 = j1q0Var2.f15748a.d(ygpVar2);
                boolean zA = ((iqt) obj).f15225a.a();
                listA.getClass();
                iun iunVar3 = iun.f15405a;
                c2r0 c2r0Var = c2r0.f3639a;
                i1r0 i1r0Var = i1r0.f14014a;
                ler0 ler0Var = new ler0(c2r0Var, i1r0Var, iunVar3);
                zyq0 zyq0Var = new zyq0(p1r0.f26218a, i1r0Var, iunVar3);
                u8r0 u8r0Var = new u8r0(y1r0.f41872a, i1r0Var, iunVar3);
                c4r0 c4r0Var = new c4r0(d2r0.f5371a, i1r0Var, iunVar3);
                qer0 qer0Var = new qer0(b2r0.f1868a, i1r0Var, iunVar3);
                per0 per0Var = new per0(a2r0.f138a, i1r0Var, iunVar3);
                her0 her0Var = new her0(z1r0.f43635a, i1r0Var, iunVar3, xun.f41520a);
                hyq0 hyq0Var = new hyq0(n1r0.f22766a, i1r0Var, iunVar3, iunVar3);
                s8r0 s8r0Var = new s8r0(w1r0.f38415a, i1r0Var, iunVar3);
                t8r0 t8r0Var = new t8r0(x1r0.f40134a, i1r0Var, iunVar3);
                zxq0 zxq0Var = new zxq0(l1r0.f19271a, i1r0Var, null);
                xxq0 xxq0Var = new xxq0(k1r0.f17542a, i1r0Var, iunVar3);
                iyq0 iyq0Var = new iyq0(o1r0.f24496a, i1r0Var, iunVar3);
                eyq0 eyq0Var = new eyq0(m1r0.f21023a, i1r0Var, null);
                pfr0 pfr0Var = new pfr0(e2r0.f7100a, i1r0Var, iunVar3, iunVar3);
                n2r0 n2r0Var = new n2r0(t1r0.f33181a, i1r0Var, iunVar3);
                b3r0 b3r0Var = new b3r0(v1r0.f36646a, i1r0Var, iunVar3);
                a3r0 a3r0Var = new a3r0(u1r0.f34913a, i1r0Var, iunVar3);
                j2r0 j2r0Var = new j2r0(r1r0.f29696a, i1r0Var, iunVar3);
                h2r0 h2r0Var2 = new h2r0(q1r0.f27968a, i1r0Var, iunVar3);
                o8r0 o8r0Var = new o8r0(n8r0.f23103a, i3);
                rib0 rib0Var = sff0VarA2.L;
                mum0 mum0Var = sff0VarA2.g;
                int i4 = rib0Var.c;
                boolean z3 = sff0VarA2.J;
                boolean z4 = rib0Var.e;
                q1w0 q1w0Var = sff0VarA2.d;
                boolean z5 = q1w0Var.b;
                boolean z6 = q1w0Var.c;
                ech echVar = sff0VarA2.c;
                boolean z7 = echVar.b;
                String str2 = q1w0Var.f27973a.b;
                boolean z8 = echVar.f;
                hl1 hl1Var = sff0VarA2.b;
                f61 f61Var = hl1Var.f13233a;
                boolean z9 = f61Var.c;
                switch (hl1Var.e) {
                    case SQUARE_S:
                        jq5Var = new jq5();
                        lq5 lq5Var = jq5Var;
                        iOrdinal = mum0Var.f22419a.ordinal();
                        if (iOrdinal != 0) {
                            h2r0Var = h2r0Var2;
                            if (iOrdinal == 1) {
                                uql0Var = uql0.f36125a;
                            } else if (iOrdinal == 2) {
                                uql0Var = uql0.d;
                            } else if (iOrdinal == 3) {
                                uql0Var = uql0.e;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                uql0Var = uql0.b;
                            }
                        } else {
                            h2r0Var = h2r0Var2;
                            uql0Var = uql0.c;
                        }
                        uql0 uql0Var2 = uql0Var;
                        boolean z10 = f61Var.k;
                        str = mum0Var.m.f25258a;
                        iHashCode = str.hashCode();
                        f3v0Var = d3v0.f5423a;
                        switch (iHashCode) {
                            case -1208588305:
                                str.equals("smallSquares");
                                break;
                            case 89087545:
                                if (str.equals("mediumRectangles")) {
                                    f3v0Var = b3v0.f1928a;
                                }
                                break;
                            case 1539472028:
                                if (str.equals("smallCircles")) {
                                    f3v0Var = c3v0.f3697a;
                                }
                                break;
                            case 1837905085:
                                if (str.equals("smallSquaresNoHeader")) {
                                    f3v0Var = e3v0.f7155a;
                                }
                                break;
                        }
                        f3v0 f3v0Var2 = f3v0Var;
                        ot0 ot0Var = hl1Var.l;
                        List list2 = sff0VarA2.o1;
                        boolean z11 = hl1Var.C;
                        boolean z12 = hl1Var.b;
                        return new ser0(iunVar3, ler0Var, zyq0Var, u8r0Var, c4r0Var, qer0Var, per0Var, her0Var, hyq0Var, zxq0Var, s8r0Var, t8r0Var, xxq0Var, iyq0Var, eyq0Var, pfr0Var, n2r0Var, b3r0Var, a3r0Var, j2r0Var, h2r0Var, o8r0Var, new xdr0(false, false, false, false, false, i4, zBooleanValue, z2, zJ2, z3, zL2, z4, z5, z10, z6, z11, z12, z7, false, lq5Var, uql0Var2, null, str2, "", f3v0Var2, str2, ot0Var, listA, iunVar3, z8, z9, null, list2, z12, z11, sff0VarA2.O0, mum0Var.y, sff0VarA2.J1, zD2), zA);
                    case SQUARE_S_NO_TITLE:
                        jq5Var = kq5.f18703a;
                        lq5 lq5Var2 = jq5Var;
                        iOrdinal = mum0Var.f22419a.ordinal();
                        if (iOrdinal != 0) {
                            h2r0Var = h2r0Var2;
                            if (iOrdinal == 1) {
                                uql0Var = uql0.f36125a;
                            } else if (iOrdinal == 2) {
                                uql0Var = uql0.d;
                            } else if (iOrdinal == 3) {
                                uql0Var = uql0.e;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                uql0Var = uql0.b;
                            }
                        } else {
                            h2r0Var = h2r0Var2;
                            uql0Var = uql0.c;
                        }
                        uql0 uql0Var3 = uql0Var;
                        boolean z13 = f61Var.k;
                        str = mum0Var.m.f25258a;
                        iHashCode = str.hashCode();
                        f3v0Var = d3v0.f5423a;
                        switch (iHashCode) {
                            case -1208588305:
                                str.equals("smallSquares");
                                break;
                            case 89087545:
                                if (str.equals("mediumRectangles")) {
                                    f3v0Var = b3v0.f1928a;
                                }
                                break;
                            case 1539472028:
                                if (str.equals("smallCircles")) {
                                    f3v0Var = c3v0.f3697a;
                                }
                                break;
                            case 1837905085:
                                if (str.equals("smallSquaresNoHeader")) {
                                    f3v0Var = e3v0.f7155a;
                                }
                                break;
                        }
                        f3v0 f3v0Var3 = f3v0Var;
                        ot0 ot0Var2 = hl1Var.l;
                        List list3 = sff0VarA2.o1;
                        boolean z14 = hl1Var.C;
                        boolean z15 = hl1Var.b;
                        return new ser0(iunVar3, ler0Var, zyq0Var, u8r0Var, c4r0Var, qer0Var, per0Var, her0Var, hyq0Var, zxq0Var, s8r0Var, t8r0Var, xxq0Var, iyq0Var, eyq0Var, pfr0Var, n2r0Var, b3r0Var, a3r0Var, j2r0Var, h2r0Var, o8r0Var, new xdr0(false, false, false, false, false, i4, zBooleanValue, z2, zJ2, z3, zL2, z4, z5, z13, z6, z14, z15, z7, false, lq5Var2, uql0Var3, null, str2, "", f3v0Var3, str2, ot0Var2, listA, iunVar3, z8, z9, null, list3, z15, z14, sff0VarA2.O0, mum0Var.y, sff0VarA2.J1, zD2), zA);
                    case SQUARE_L:
                        jq5Var = hq5.f13470a;
                        lq5 lq5Var3 = jq5Var;
                        iOrdinal = mum0Var.f22419a.ordinal();
                        if (iOrdinal != 0) {
                            h2r0Var = h2r0Var2;
                            if (iOrdinal == 1) {
                                uql0Var = uql0.f36125a;
                            } else if (iOrdinal == 2) {
                                uql0Var = uql0.d;
                            } else if (iOrdinal == 3) {
                                uql0Var = uql0.e;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                uql0Var = uql0.b;
                            }
                        } else {
                            h2r0Var = h2r0Var2;
                            uql0Var = uql0.c;
                        }
                        uql0 uql0Var4 = uql0Var;
                        boolean z16 = f61Var.k;
                        str = mum0Var.m.f25258a;
                        iHashCode = str.hashCode();
                        f3v0Var = d3v0.f5423a;
                        switch (iHashCode) {
                            case -1208588305:
                                str.equals("smallSquares");
                                break;
                            case 89087545:
                                if (str.equals("mediumRectangles")) {
                                    f3v0Var = b3v0.f1928a;
                                }
                                break;
                            case 1539472028:
                                if (str.equals("smallCircles")) {
                                    f3v0Var = c3v0.f3697a;
                                }
                                break;
                            case 1837905085:
                                if (str.equals("smallSquaresNoHeader")) {
                                    f3v0Var = e3v0.f7155a;
                                }
                                break;
                        }
                        f3v0 f3v0Var4 = f3v0Var;
                        ot0 ot0Var3 = hl1Var.l;
                        List list4 = sff0VarA2.o1;
                        boolean z17 = hl1Var.C;
                        boolean z18 = hl1Var.b;
                        return new ser0(iunVar3, ler0Var, zyq0Var, u8r0Var, c4r0Var, qer0Var, per0Var, her0Var, hyq0Var, zxq0Var, s8r0Var, t8r0Var, xxq0Var, iyq0Var, eyq0Var, pfr0Var, n2r0Var, b3r0Var, a3r0Var, j2r0Var, h2r0Var, o8r0Var, new xdr0(false, false, false, false, false, i4, zBooleanValue, z2, zJ2, z3, zL2, z4, z5, z16, z6, z17, z18, z7, false, lq5Var3, uql0Var4, null, str2, "", f3v0Var4, str2, ot0Var3, listA, iunVar3, z8, z9, null, list4, z18, z17, sff0VarA2.O0, mum0Var.y, sff0VarA2.J1, zD2), zA);
                    case SQUARE_L_NO_TITLE:
                        jq5Var = iq5.f15191a;
                        lq5 lq5Var4 = jq5Var;
                        iOrdinal = mum0Var.f22419a.ordinal();
                        if (iOrdinal != 0) {
                            h2r0Var = h2r0Var2;
                            if (iOrdinal == 1) {
                                uql0Var = uql0.f36125a;
                            } else if (iOrdinal == 2) {
                                uql0Var = uql0.d;
                            } else if (iOrdinal == 3) {
                                uql0Var = uql0.e;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                uql0Var = uql0.b;
                            }
                        } else {
                            h2r0Var = h2r0Var2;
                            uql0Var = uql0.c;
                        }
                        uql0 uql0Var5 = uql0Var;
                        boolean z19 = f61Var.k;
                        str = mum0Var.m.f25258a;
                        iHashCode = str.hashCode();
                        f3v0Var = d3v0.f5423a;
                        switch (iHashCode) {
                            case -1208588305:
                                str.equals("smallSquares");
                                break;
                            case 89087545:
                                if (str.equals("mediumRectangles")) {
                                    f3v0Var = b3v0.f1928a;
                                }
                                break;
                            case 1539472028:
                                if (str.equals("smallCircles")) {
                                    f3v0Var = c3v0.f3697a;
                                }
                                break;
                            case 1837905085:
                                if (str.equals("smallSquaresNoHeader")) {
                                    f3v0Var = e3v0.f7155a;
                                }
                                break;
                        }
                        f3v0 f3v0Var5 = f3v0Var;
                        ot0 ot0Var4 = hl1Var.l;
                        List list5 = sff0VarA2.o1;
                        boolean z110 = hl1Var.C;
                        boolean z111 = hl1Var.b;
                        return new ser0(iunVar3, ler0Var, zyq0Var, u8r0Var, c4r0Var, qer0Var, per0Var, her0Var, hyq0Var, zxq0Var, s8r0Var, t8r0Var, xxq0Var, iyq0Var, eyq0Var, pfr0Var, n2r0Var, b3r0Var, a3r0Var, j2r0Var, h2r0Var, o8r0Var, new xdr0(false, false, false, false, false, i4, zBooleanValue, z2, zJ2, z3, zL2, z4, z5, z19, z6, z110, z111, z7, false, lq5Var4, uql0Var5, null, str2, "", f3v0Var5, str2, ot0Var4, listA, iunVar3, z8, z9, null, list5, z111, z110, sff0VarA2.O0, mum0Var.y, sff0VarA2.J1, zD2), zA);
                    case RECTANGLE_VERTICAL:
                        jq5Var = fq5.f9956a;
                        lq5 lq5Var5 = jq5Var;
                        iOrdinal = mum0Var.f22419a.ordinal();
                        if (iOrdinal != 0) {
                            h2r0Var = h2r0Var2;
                            if (iOrdinal == 1) {
                                uql0Var = uql0.f36125a;
                            } else if (iOrdinal == 2) {
                                uql0Var = uql0.d;
                            } else if (iOrdinal == 3) {
                                uql0Var = uql0.e;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                uql0Var = uql0.b;
                            }
                        } else {
                            h2r0Var = h2r0Var2;
                            uql0Var = uql0.c;
                        }
                        uql0 uql0Var6 = uql0Var;
                        boolean z112 = f61Var.k;
                        str = mum0Var.m.f25258a;
                        iHashCode = str.hashCode();
                        f3v0Var = d3v0.f5423a;
                        switch (iHashCode) {
                            case -1208588305:
                                str.equals("smallSquares");
                                break;
                            case 89087545:
                                if (str.equals("mediumRectangles")) {
                                    f3v0Var = b3v0.f1928a;
                                }
                                break;
                            case 1539472028:
                                if (str.equals("smallCircles")) {
                                    f3v0Var = c3v0.f3697a;
                                }
                                break;
                            case 1837905085:
                                if (str.equals("smallSquaresNoHeader")) {
                                    f3v0Var = e3v0.f7155a;
                                }
                                break;
                        }
                        f3v0 f3v0Var6 = f3v0Var;
                        ot0 ot0Var5 = hl1Var.l;
                        List list6 = sff0VarA2.o1;
                        boolean z113 = hl1Var.C;
                        boolean z114 = hl1Var.b;
                        return new ser0(iunVar3, ler0Var, zyq0Var, u8r0Var, c4r0Var, qer0Var, per0Var, her0Var, hyq0Var, zxq0Var, s8r0Var, t8r0Var, xxq0Var, iyq0Var, eyq0Var, pfr0Var, n2r0Var, b3r0Var, a3r0Var, j2r0Var, h2r0Var, o8r0Var, new xdr0(false, false, false, false, false, i4, zBooleanValue, z2, zJ2, z3, zL2, z4, z5, z112, z6, z113, z114, z7, false, lq5Var5, uql0Var6, null, str2, "", f3v0Var6, str2, ot0Var5, listA, iunVar3, z8, z9, null, list6, z114, z113, sff0VarA2.O0, mum0Var.y, sff0VarA2.J1, zD2), zA);
                    case RECTANGLE_VERTICAL_NO_TITLE:
                        jq5Var = gq5.f11714a;
                        lq5 lq5Var6 = jq5Var;
                        iOrdinal = mum0Var.f22419a.ordinal();
                        if (iOrdinal != 0) {
                            h2r0Var = h2r0Var2;
                            if (iOrdinal == 1) {
                                uql0Var = uql0.f36125a;
                            } else if (iOrdinal == 2) {
                                uql0Var = uql0.d;
                            } else if (iOrdinal == 3) {
                                uql0Var = uql0.e;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                uql0Var = uql0.b;
                            }
                        } else {
                            h2r0Var = h2r0Var2;
                            uql0Var = uql0.c;
                        }
                        uql0 uql0Var7 = uql0Var;
                        boolean z115 = f61Var.k;
                        str = mum0Var.m.f25258a;
                        iHashCode = str.hashCode();
                        f3v0Var = d3v0.f5423a;
                        switch (iHashCode) {
                            case -1208588305:
                                str.equals("smallSquares");
                                break;
                            case 89087545:
                                if (str.equals("mediumRectangles")) {
                                    f3v0Var = b3v0.f1928a;
                                }
                                break;
                            case 1539472028:
                                if (str.equals("smallCircles")) {
                                    f3v0Var = c3v0.f3697a;
                                }
                                break;
                            case 1837905085:
                                if (str.equals("smallSquaresNoHeader")) {
                                    f3v0Var = e3v0.f7155a;
                                }
                                break;
                        }
                        f3v0 f3v0Var7 = f3v0Var;
                        ot0 ot0Var6 = hl1Var.l;
                        List list7 = sff0VarA2.o1;
                        boolean z116 = hl1Var.C;
                        boolean z117 = hl1Var.b;
                        return new ser0(iunVar3, ler0Var, zyq0Var, u8r0Var, c4r0Var, qer0Var, per0Var, her0Var, hyq0Var, zxq0Var, s8r0Var, t8r0Var, xxq0Var, iyq0Var, eyq0Var, pfr0Var, n2r0Var, b3r0Var, a3r0Var, j2r0Var, h2r0Var, o8r0Var, new xdr0(false, false, false, false, false, i4, zBooleanValue, z2, zJ2, z3, zL2, z4, z5, z115, z6, z116, z117, z7, false, lq5Var6, uql0Var7, null, str2, "", f3v0Var7, str2, ot0Var6, listA, iunVar3, z8, z9, null, list7, z117, z116, sff0VarA2.O0, mum0Var.y, sff0VarA2.J1, zD2), zA);
                    case RECTANGLE_HORIZONTAL:
                        jq5Var = dq5.f6497a;
                        lq5 lq5Var7 = jq5Var;
                        iOrdinal = mum0Var.f22419a.ordinal();
                        if (iOrdinal != 0) {
                            h2r0Var = h2r0Var2;
                            if (iOrdinal == 1) {
                                uql0Var = uql0.f36125a;
                            } else if (iOrdinal == 2) {
                                uql0Var = uql0.d;
                            } else if (iOrdinal == 3) {
                                uql0Var = uql0.e;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                uql0Var = uql0.b;
                            }
                        } else {
                            h2r0Var = h2r0Var2;
                            uql0Var = uql0.c;
                        }
                        uql0 uql0Var8 = uql0Var;
                        boolean z118 = f61Var.k;
                        str = mum0Var.m.f25258a;
                        iHashCode = str.hashCode();
                        f3v0Var = d3v0.f5423a;
                        switch (iHashCode) {
                            case -1208588305:
                                str.equals("smallSquares");
                                break;
                            case 89087545:
                                if (str.equals("mediumRectangles")) {
                                    f3v0Var = b3v0.f1928a;
                                }
                                break;
                            case 1539472028:
                                if (str.equals("smallCircles")) {
                                    f3v0Var = c3v0.f3697a;
                                }
                                break;
                            case 1837905085:
                                if (str.equals("smallSquaresNoHeader")) {
                                    f3v0Var = e3v0.f7155a;
                                }
                                break;
                        }
                        f3v0 f3v0Var8 = f3v0Var;
                        ot0 ot0Var7 = hl1Var.l;
                        List list8 = sff0VarA2.o1;
                        boolean z119 = hl1Var.C;
                        boolean z1110 = hl1Var.b;
                        return new ser0(iunVar3, ler0Var, zyq0Var, u8r0Var, c4r0Var, qer0Var, per0Var, her0Var, hyq0Var, zxq0Var, s8r0Var, t8r0Var, xxq0Var, iyq0Var, eyq0Var, pfr0Var, n2r0Var, b3r0Var, a3r0Var, j2r0Var, h2r0Var, o8r0Var, new xdr0(false, false, false, false, false, i4, zBooleanValue, z2, zJ2, z3, zL2, z4, z5, z118, z6, z119, z1110, z7, false, lq5Var7, uql0Var8, null, str2, "", f3v0Var8, str2, ot0Var7, listA, iunVar3, z8, z9, null, list8, z1110, z119, sff0VarA2.O0, mum0Var.y, sff0VarA2.J1, zD2), zA);
                    case RECTANGLE_HORIZONTAL_NO_TITLE:
                        jq5Var = eq5.f8219a;
                        lq5 lq5Var8 = jq5Var;
                        iOrdinal = mum0Var.f22419a.ordinal();
                        if (iOrdinal != 0) {
                            h2r0Var = h2r0Var2;
                            if (iOrdinal == 1) {
                                uql0Var = uql0.f36125a;
                            } else if (iOrdinal == 2) {
                                uql0Var = uql0.d;
                            } else if (iOrdinal == 3) {
                                uql0Var = uql0.e;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                uql0Var = uql0.b;
                            }
                        } else {
                            h2r0Var = h2r0Var2;
                            uql0Var = uql0.c;
                        }
                        uql0 uql0Var9 = uql0Var;
                        boolean z1111 = f61Var.k;
                        str = mum0Var.m.f25258a;
                        iHashCode = str.hashCode();
                        f3v0Var = d3v0.f5423a;
                        switch (iHashCode) {
                            case -1208588305:
                                str.equals("smallSquares");
                                break;
                            case 89087545:
                                if (str.equals("mediumRectangles")) {
                                    f3v0Var = b3v0.f1928a;
                                }
                                break;
                            case 1539472028:
                                if (str.equals("smallCircles")) {
                                    f3v0Var = c3v0.f3697a;
                                }
                                break;
                            case 1837905085:
                                if (str.equals("smallSquaresNoHeader")) {
                                    f3v0Var = e3v0.f7155a;
                                }
                                break;
                        }
                        f3v0 f3v0Var9 = f3v0Var;
                        ot0 ot0Var8 = hl1Var.l;
                        List list9 = sff0VarA2.o1;
                        boolean z1112 = hl1Var.C;
                        boolean z1113 = hl1Var.b;
                        return new ser0(iunVar3, ler0Var, zyq0Var, u8r0Var, c4r0Var, qer0Var, per0Var, her0Var, hyq0Var, zxq0Var, s8r0Var, t8r0Var, xxq0Var, iyq0Var, eyq0Var, pfr0Var, n2r0Var, b3r0Var, a3r0Var, j2r0Var, h2r0Var, o8r0Var, new xdr0(false, false, false, false, false, i4, zBooleanValue, z2, zJ2, z3, zL2, z4, z5, z1111, z6, z1112, z1113, z7, false, lq5Var8, uql0Var9, null, str2, "", f3v0Var9, str2, ot0Var8, listA, iunVar3, z8, z9, null, list9, z1113, z1112, sff0VarA2.O0, mum0Var.y, sff0VarA2.J1, zD2), zA);
                    case CARD_HORIZONTAL:
                        jq5Var = cq5.f4775a;
                        lq5 lq5Var9 = jq5Var;
                        iOrdinal = mum0Var.f22419a.ordinal();
                        if (iOrdinal != 0) {
                            h2r0Var = h2r0Var2;
                            if (iOrdinal == 1) {
                                uql0Var = uql0.f36125a;
                            } else if (iOrdinal == 2) {
                                uql0Var = uql0.d;
                            } else if (iOrdinal == 3) {
                                uql0Var = uql0.e;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                uql0Var = uql0.b;
                            }
                        } else {
                            h2r0Var = h2r0Var2;
                            uql0Var = uql0.c;
                        }
                        uql0 uql0Var10 = uql0Var;
                        boolean z1114 = f61Var.k;
                        str = mum0Var.m.f25258a;
                        iHashCode = str.hashCode();
                        f3v0Var = d3v0.f5423a;
                        switch (iHashCode) {
                            case -1208588305:
                                str.equals("smallSquares");
                                break;
                            case 89087545:
                                if (str.equals("mediumRectangles")) {
                                    f3v0Var = b3v0.f1928a;
                                }
                                break;
                            case 1539472028:
                                if (str.equals("smallCircles")) {
                                    f3v0Var = c3v0.f3697a;
                                }
                                break;
                            case 1837905085:
                                if (str.equals("smallSquaresNoHeader")) {
                                    f3v0Var = e3v0.f7155a;
                                }
                                break;
                        }
                        f3v0 f3v0Var10 = f3v0Var;
                        ot0 ot0Var9 = hl1Var.l;
                        List list10 = sff0VarA2.o1;
                        boolean z1115 = hl1Var.C;
                        boolean z1116 = hl1Var.b;
                        return new ser0(iunVar3, ler0Var, zyq0Var, u8r0Var, c4r0Var, qer0Var, per0Var, her0Var, hyq0Var, zxq0Var, s8r0Var, t8r0Var, xxq0Var, iyq0Var, eyq0Var, pfr0Var, n2r0Var, b3r0Var, a3r0Var, j2r0Var, h2r0Var, o8r0Var, new xdr0(false, false, false, false, false, i4, zBooleanValue, z2, zJ2, z3, zL2, z4, z5, z1114, z6, z1115, z1116, z7, false, lq5Var9, uql0Var10, null, str2, "", f3v0Var10, str2, ot0Var9, listA, iunVar3, z8, z9, null, list10, z1116, z1115, sff0VarA2.O0, mum0Var.y, sff0VarA2.J1, zD2), zA);
                    default:
                        t9f.b();
                        return null;
                }
        }
    }

    public /* synthetic */ qvk0(pru pruVar, bzt bztVar, lbu lbuVar, rrc rrcVar, svu svuVar, wyu wyuVar, luu luuVar, qho qhoVar, r9u r9uVar, iqt iqtVar) {
        this.b = pruVar;
        this.c = bztVar;
        this.d = lbuVar;
        this.g = rrcVar;
        this.e = svuVar;
        this.h = wyuVar;
        this.i = luuVar;
        this.j = qhoVar;
        this.f = r9uVar;
        this.k = iqtVar;
    }
}
