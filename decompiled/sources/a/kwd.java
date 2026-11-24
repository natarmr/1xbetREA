package a;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.calendar.model.DateRangeCalendarBottomSheetParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
public final class kwd implements jfn0 {
    public static void g(String str, List list, String str2, androidx.fragment.app.e eVar) {
        str.getClass();
        list.getClass();
        eVar.getClass();
        String str3 = n4f.m2;
        if (eVar.J(str3) != null) {
            return;
        }
        n4f n4fVar = new n4f();
        iiy[] iiyVarArr = n4f.l2;
        n4fVar.j2.x(n4fVar, iiyVarArr[3], str);
        n4fVar.h2.D(n4fVar, iiyVarArr[1], list);
        n4fVar.i2.x(n4fVar, iiyVarArr[2], str2);
        n4fVar.H0(eVar, str3);
    }

    public static void h(DateRangeCalendarBottomSheetParams dateRangeCalendarBottomSheetParams, androidx.fragment.app.e eVar) {
        eVar.getClass();
        String str = dej.n2;
        if (eVar.J(str) != null) {
            return;
        }
        dej dejVar = new dej();
        dejVar.k2.J(dejVar, dej.m2[0], dateRangeCalendarBottomSheetParams);
        dejVar.H0(eVar, str);
    }

    @Override // a.jfn0
    public int a(androidx.media3.common.b bVar) {
        String str = bVar.p;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        jf4.o(kng0.k("Unsupported MIME type: ", str));
        return 0;
    }

    @Override // a.jfn0
    public lfn0 b(androidx.media3.common.b bVar) {
        String str = bVar.p;
        List list = bVar.s;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new qgd(list);
                case "application/pgs":
                    return new z220((byte) 8);
                case "application/x-mp4-vtt":
                    return new jw20((byte) 5);
                case "text/vtt":
                    return new fuj0((byte) 19);
                case "application/x-quicktime-tx3g":
                    tmk tmkVar = new tmk();
                    tmkVar.g = new fq80();
                    if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
                        byte[] bArr = (byte[]) list.get(0);
                        tmkVar.b = bArr[24];
                        tmkVar.c = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
                        tmkVar.d = "Serif".equals(new String(bArr, 43, bArr.length - 43, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
                        int i = bArr[25] * 20;
                        tmkVar.f = i;
                        boolean z = (bArr[0] & 32) != 0;
                        tmkVar.f34197a = z;
                        if (z) {
                            tmkVar.e = vtt0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                        } else {
                            tmkVar.e = 0.85f;
                        }
                    } else {
                        tmkVar.b = 0;
                        tmkVar.c = -1;
                        tmkVar.d = "sans-serif";
                        tmkVar.f34197a = false;
                        tmkVar.e = 0.85f;
                        tmkVar.f = -1;
                    }
                    return tmkVar;
                case "text/x-ssa":
                    return new pul0(list);
                case "application/vobsub":
                    return new cvu0(list);
                case "application/x-subrip":
                    return new u5n0();
                case "application/ttml+xml":
                    return new css0();
            }
        }
        jf4.o(kng0.k("Unsupported MIME type: ", str));
        return null;
    }

    @Override // a.jfn0
    public boolean c(androidx.media3.common.b bVar) {
        String str = bVar.p;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public void d(s7g s7gVar, hbg hbgVar, boolean z, fet fetVar, int i) {
        hbg hbgVar2;
        ga50 ea50Var;
        gmm dmmVar;
        Object oyeVar;
        fet fetVar2;
        long secondary;
        tag tagVar = hbgVar.c;
        fetVar.g0(1516791134);
        byte b = 2;
        int i2 = i | (fetVar.i(s7gVar) ? 4 : 2) | (fetVar.i(hbgVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.g(this) ? 2048 : 1024);
        boolean z2 = true;
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = ((i2 << 6) & 896) | 48;
            pz40 pz40VarO = gkb.O(new h2c(tagVar.i, b), "", s7gVar, fetVar, i3, 12);
            pz40 pz40VarO2 = gkb.O(tagVar.h, Boolean.FALSE, s7gVar, fetVar, i3, 12);
            pz40 pz40VarQ = gkb.Q(hbgVar.u, s7gVar, fetVar, (i2 << 3) & 112, 6);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zfn zfnVar = zaq0.b;
            ilm ilmVar = new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary());
            String str = (String) pz40VarO.getValue();
            long secondary2 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            if (pz40VarQ.getValue() instanceof u9g) {
                fetVar.e0(-625167684);
                ea50Var = new ea50(((ThemeColors) fetVar.k(zfnVar)).getSecondary());
                fetVar.r(false);
            } else {
                fetVar.e0(-625059556);
                fetVar.r(false);
                ea50Var = fa50.f9191a;
            }
            plm plmVar = new plm(str, secondary2, ea50Var);
            x9g x9gVar = (x9g) pz40VarQ.getValue();
            boolean zBooleanValue = ((Boolean) pz40VarO2.getValue()).booleanValue();
            if (!(x9gVar instanceof u9g) || z) {
                fetVar.e0(-198402579);
                fetVar.r(false);
                dmmVar = fmm.f9790a;
            } else {
                fetVar.e0(-199220328);
                int i4 = zBooleanValue ? R.drawable.ic_filter_active : R.drawable.ic_filter_inactive;
                if (zBooleanValue) {
                    fetVar.e0(-198640814);
                    secondary = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
                    fetVar.r(false);
                } else {
                    fetVar.e0(-198554448);
                    secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
                    fetVar.r(false);
                }
                dmmVar = new dmm(new ta50(new wkm(1, i4, true, ra50.f30118a, secondary)));
                fetVar.r(false);
            }
            imm immVar = new imm(ilmVar, plmVar, dmmVar, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
            int i5 = i2 & 112;
            boolean z3 = i5 == 32 || fetVar.i(hbgVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                hbgVar2 = hbgVar;
                fetVar2 = fetVar;
                oyeVar = new oye(0, hbgVar2, hbg.class, "onBackClicked", "onBackClicked()V", 0, (byte) 19);
                fetVar2.o0(oyeVar);
            } else {
                fetVar2 = fetVar;
                oyeVar = objP;
                hbgVar2 = hbgVar;
            }
            jhy jhyVar = (jhy) oyeVar;
            boolean z4 = i5 == 32 || fetVar2.i(hbgVar2);
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                oye oyeVar2 = new oye(0, hbgVar2, hbg.class, "onTitleClicked", "onTitleClicked()V", 0, (byte) 20);
                fetVar2.o0(oyeVar2);
                objP2 = oyeVar2;
            }
            Function0 function0 = (Function0) jhyVar;
            Function0 function1 = (Function0) ((jhy) objP2);
            if (i5 != 32 && !fetVar2.i(hbgVar2)) {
                z2 = false;
            }
            Object objP3 = fetVar2.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new aag(hbgVar2, b2);
                fetVar2.o0(objP3);
            }
            hlm.c(mm40VarD, immVar, null, function0, function1, (Function1) objP3, null, null, null, null, null, null, fetVar2, 6, 0, 4036);
        } else {
            hbgVar2 = hbgVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z9g(this, s7gVar, hbgVar2, z, i);
        }
    }

    public void e(final s7g s7gVar, final hbg hbgVar, fet fetVar, final int i) {
        fet fetVar2;
        yfe0 yfe0VarU;
        Function2 function2;
        fetVar.g0(-1530935510);
        int i2 = i | (fetVar.i(s7gVar) ? 4 : 2) | (fetVar.i(hbgVar) ? 32 : 16);
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = (i2 << 3) & 112;
            pz40 pz40VarQ = gkb.Q(hbgVar.s, s7gVar, fetVar, i3, 6);
            pz40 pz40VarQ2 = gkb.Q(hbgVar.u, s7gVar, fetVar, i3, 6);
            if (((wl9) pz40VarQ.getValue()).f39342a.size() < 2) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function2 = new Function2(this, s7gVar, hbgVar, i, b) { // from class: a.bag

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f2255a;
                    public final /* synthetic */ kwd b;
                    public final /* synthetic */ s7g c;
                    public final /* synthetic */ hbg d;

                    {
                        this.f2255a = b;
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = this.f2255a;
                        hbg hbgVar2 = this.d;
                        s7g s7gVar2 = this.c;
                        kwd kwdVar = this.b;
                        fet fetVar3 = (fet) obj;
                        ((Integer) obj2).getClass();
                        switch (b2) {
                            case 0:
                                kwdVar.e(s7gVar2, hbgVar2, fetVar3, x8x.L(65));
                                break;
                            default:
                                kwdVar.e(s7gVar2, hbgVar2, fetVar3, x8x.L(65));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else if (Intrinsics.d(pz40VarQ2.getValue(), u9g.f35282a)) {
                fetVar.e0(158396399);
                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
                List list = ((wl9) pz40VarQ.getValue()).f39342a;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new yvh0(((vl9) it.next()).f37610a, bwh0.f3325a));
                }
                i4 i4VarR0 = dyb.r0(arrayList);
                dxh0 dxh0Var = ((wl9) pz40VarQ.getValue()).b;
                a6g a6gVar = new a6g(pz40VarQ.getValue(), wl9.class, "currentPageIndex", "getCurrentPageIndex()I", 0, (byte) 1);
                if ((i2 & 112) != 32 && !fetVar.i(hbgVar)) {
                    z = false;
                }
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new x6f(1, hbgVar, hbg.class, "onSegmentSelected", "onSegmentSelected(I)V", 0, (byte) 10);
                    fetVar.o0(objP);
                }
                fetVar2 = fetVar;
                ibc.n(mm40VarJ, i4VarR0, gxh0.f12078a, dxh0Var, false, a6gVar, (Function1) ((jhy) objP), fetVar2, 384, 16);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(159030008);
                fetVar2.r(false);
            }
            yfe0VarU.d = function2;
        }
        fetVar2 = fetVar;
        fetVar2.X();
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            function2 = new Function2(this, s7gVar, hbgVar, i, b2) { // from class: a.bag

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f2255a;
                public final /* synthetic */ kwd b;
                public final /* synthetic */ s7g c;
                public final /* synthetic */ hbg d;

                {
                    this.f2255a = b2;
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.f2255a;
                    hbg hbgVar2 = this.d;
                    s7g s7gVar2 = this.c;
                    kwd kwdVar = this.b;
                    fet fetVar3 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            kwdVar.e(s7gVar2, hbgVar2, fetVar3, x8x.L(65));
                            break;
                        default:
                            kwdVar.e(s7gVar2, hbgVar2, fetVar3, x8x.L(65));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0060->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007d -> B:25:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0080 -> B:25:0x0060). Please report as a decompilation issue!!! */
    public Object f(List list, acj acjVar, zje zjeVar) throws Throwable {
        xaj xajVar;
        List list2;
        Iterator it;
        mie0 mie0Var;
        Throwable th;
        Function1 function1;
        if (zjeVar instanceof xaj) {
            xajVar = (xaj) zjeVar;
            int i = xajVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xajVar.m = i - Integer.MIN_VALUE;
            } else {
                xajVar = new xaj(this, zjeVar);
            }
        } else {
            xajVar = new xaj(this, zjeVar);
        }
        Object obj = xajVar.k;
        Object obj2 = wne.f39444a;
        int i2 = xajVar.m;
        yje yjeVar = null;
        byte b = 2;
        if (i2 == 0) {
            ArrayList arrayListT = twn.t(obj);
            uu3 uu3Var = new uu3(list, arrayListT, yjeVar, b);
            xajVar.i = arrayListT;
            xajVar.m = 1;
            if (acjVar.a(uu3Var, xajVar) != obj2) {
                list2 = arrayListT;
            }
            return obj2;
        }
        if (i2 == 1) {
            list2 = (List) xajVar.i;
            z1x.P(obj);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = xajVar.j;
            mie0Var = (mie0) xajVar.i;
            try {
                z1x.P(obj);
            } catch (Throwable th2) {
                Object obj3 = mie0Var.f21842a;
                if (obj3 == null) {
                    mie0Var.f21842a = th2;
                } else {
                    tjo.a((Throwable) obj3, th2);
                }
            }
        }
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            xajVar.i = mie0Var;
            xajVar.j = it;
            xajVar.m = 2;
            if (function1.invoke(xajVar) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) mie0Var.f21842a;
        if (th == null) {
            return Unit.f46060a;
        }
        throw th;
        mie0 mie0Var2 = new mie0();
        it = list2.iterator();
        mie0Var = mie0Var2;
        while (it.hasNext()) {
            function1 = (Function1) it.next();
            xajVar.i = mie0Var;
            xajVar.j = it;
            xajVar.m = 2;
            if (function1.invoke(xajVar) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) mie0Var.f21842a;
        if (th == null) {
            return Unit.f46060a;
        }
        throw th;
    }
}
