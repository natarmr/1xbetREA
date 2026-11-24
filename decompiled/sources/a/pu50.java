package a;

import android.app.Activity;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pu50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27598a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pu50(Object obj, byte b) {
        this.f27598a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27598a;
        Object[] objArr = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(((ru50) obj).f31109a.size());
            case 1:
                return Integer.valueOf(((aw50) obj).e.size());
            case 2:
                o24 o24Var = (o24) obj;
                kr5 kr5Var = kr5.B;
                ysw yswVar = new ysw(objArr == true ? 1 : 0, 15);
                return new zv50(kr5Var, new ykg0(false, "", yswVar, yswVar, clg0.DEFAULT), true, new nk80(mk80.f21934a, null), (String) o24Var.c, (oo5) o24Var.d, o24Var.f24513a, false, false, iun.f15405a, 0, false, false, false, false, false);
            case 3:
                return Integer.valueOf(((xw50) obj).d.size());
            case 4:
                return ((u760) obj).c.g();
            case 5:
                return ((pru) ((rrd) obj).h).a();
            case 6:
                return ((pru) ((w5z) obj).d).a();
            case 7:
                ((s4v) ((pwi) obj).d).f31626a.i();
                return Unit.f46060a;
            case 8:
                ((wsc) ((tzi) obj).h).f39683a.j();
                return Unit.f46060a;
            case 9:
                return ((pru) ((wdu) obj).j).a();
            case 10:
                return ((pru) ((rrd) obj).g).a();
            case 11:
                return new zo9((Call.Factory) ((ds3) obj).invoke());
            case 12:
                return new hg60((jg60) obj);
            case 13:
                iiy[] iiyVarArr = bj60.O1;
                fiu0 fiu0Var = ((bj60) obj).K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 14:
                ouu ouuVar = ((pk60) obj).i;
                xa50 xa50Var = new xa50();
                ouuVar.getClass();
                i1w0 i1w0VarM = ouuVar.M(xa50Var);
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarM, copyOnWriteArrayList, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        ((qe50) ouuVar.b).a(xa50Var, false);
                        return Unit.f46060a;
                    }
                    i1w0VarM.a((oe50) pawVar.next());
                }
                break;
            case 15:
                return (ef8) obj;
            case 16:
                wn60 wn60Var = (wn60) obj;
                iiy[] iiyVarArr2 = wn60.O1;
                i1w0 i1w0VarF = a4n0.f(wn60Var);
                a7i a7iVar = wn60Var.L1;
                if (a7iVar != null) {
                    return new ry3(i1w0VarF, a7iVar);
                }
                Intrinsics.h("oneXGameFreeBonusViewModelFactory");
                throw null;
            case 17:
                eo60 eo60Var = (eo60) obj;
                atz atzVar = eo60.O1;
                i1w0 i1w0VarF2 = a4n0.f(eo60Var);
                l6i l6iVar = eo60Var.L1;
                if (l6iVar != null) {
                    return new ry3(i1w0VarF2, l6iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 18:
                pz40 pz40Var = s6t0.f31722a;
                return new ed50(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((ctf0) ((b430) obj).b).b.a(R.string.cashback, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((hv60) obj).H(new cr60((byte) 6));
                return Unit.f46060a;
            case 20:
                return ((h570) ((k570) obj)).e;
            case 21:
                umi umiVar = ((h970) obj).m2;
                if (umiVar != null) {
                    return new q0h0(umiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 22:
                Activity activity = (Activity) obj;
                agd agdVar = activity instanceof agd ? (agd) activity : null;
                if (agdVar != null) {
                    byte b2 = 20;
                    mjn.a(agdVar, new c9o0(0, 0, new rgn0(b2)), new c9o0(mjn.f21903a, mjn.b, new rgn0(b2)));
                }
                return Unit.f46060a;
            case 23:
                vmi vmiVar = ((lc70) obj).l2;
                if (vmiVar != null) {
                    return new q0h0(vmiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 24:
                xd70 xd70Var = (xd70) obj;
                if (d5c.R(jiu0.a(xd70Var))) {
                    xd70Var.l0();
                    i1w0 i1w0Var = xd70Var.q;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorP2;
                        if (pawVar2.hasNext()) {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i = vf70.Q1;
                return new ko60((vf70) obj, (byte) 1);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                evz evzVar = hg70.P1;
                return new ko60((hg70) obj, (byte) 3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                qh70 qh70Var = (qh70) obj;
                nh70 nh70Var = qh70.O1;
                i1w0 i1w0VarF3 = a4n0.f(qh70Var);
                n6i n6iVar = qh70Var.L1;
                if (n6iVar != null) {
                    return new ry3(i1w0VarF3, n6iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                aj70 aj70Var = (aj70) obj;
                xi70 xi70Var = aj70.P1;
                i1w0 i1w0VarF4 = a4n0.f(aj70Var);
                q6i q6iVar = aj70Var.M1;
                if (q6iVar != null) {
                    return new ry3(i1w0VarF4, q6iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                int i2 = al70.Q1;
                return new ko60((al70) obj, (byte) 4);
        }
    }
}
