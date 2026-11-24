package a;

import android.graphics.drawable.Drawable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nop0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23879a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nop0(nop0 nop0Var, g0p0 g0p0Var) {
        this.f23879a = (byte) 13;
        this.b = nop0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f23879a;
        byte b2 = 9;
        byte b3 = 22;
        byte b4 = 29;
        byte b5 = 17;
        boolean z = false;
        z = false;
        byte b6 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                pop0 pop0Var = (pop0) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                ArrayList arrayList = pop0Var.c;
                hczVar.f(arrayList.size(), null, new t9l0(arrayList, (byte) 9), new ugd(2039820996, true, new xe4(arrayList, pop0Var, (byte) 20)));
                return Unit.f46060a;
            case 1:
                zop0 zop0Var = (zop0) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = zop0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    zop0Var.f.getClass();
                } while (!p7m0Var.m(value, oop0.a((oop0) value, null, null, null, false, true, false, null, 103)));
                return Unit.f46060a;
            case 2:
                ((Integer) obj).getClass();
                s2m0 s2m0Var = jpp0.O1;
                ((jpp0) obj2).G0().x(ph2.f26975a);
                return Unit.f46060a;
            case 3:
                yj5 yj5Var = (yj5) obj2;
                cp cpVar = (cp) obj;
                cpVar.getClass();
                ngp0 ngp0Var = new ngp0(yj5Var);
                ngp0 ngp0Var2 = new ngp0(yj5Var);
                fs6 fs6Var = (fs6) cpVar.u;
                fs6Var.b.setAdapter(ngp0Var);
                fs6Var.c.setAdapter(ngp0Var2);
                cpVar.t(new nej0(ngp0Var, cpVar, ngp0Var2, b5));
                return Unit.f46060a;
            case 4:
                rtp0 rtp0Var = (rtp0) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = rtp0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    rtp0Var.f.getClass();
                } while (!p7m0Var2.m(value2, gsp0.a((gsp0) value2, null, null, null, null, false, true, false, false, 143)));
                return Unit.f46060a;
            case 5:
                gup0 gup0Var = (gup0) obj2;
                a8z a8zVar = gup0Var.l2;
                sup0 sup0Var = (sup0) obj;
                m6m0 m6m0Var = gup0.n2;
                sup0Var.getClass();
                if (sup0Var instanceof rup0) {
                    kxq kxqVarB = gup0Var.B();
                    if (kxqVarB != null) {
                        wdk0 wdk0Var = (wdk0) ((swi) a8zVar.getValue()).f32923a.f22981a;
                        x1x.y(wdk0Var);
                        String strH = gup0Var.H(R.string.social_telegram);
                        strH.getClass();
                        n6x.i0(kxqVarB, wdk0Var, strH, "org.telegram.messenger", ((rup0) sup0Var).f31137a);
                    }
                    gup0Var.y0();
                } else if (sup0Var.equals(pup0.f27628a)) {
                    gup0Var.y0();
                } else {
                    if (!(sup0Var instanceof qup0)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0Var2 = (wdk0) ((swi) a8zVar.getValue()).f32923a.f22981a;
                    x1x.y(wdk0Var2);
                    String str = ((qup0) sup0Var).f29356a;
                    String strH2 = gup0Var.H(R.string.coupon_save_copyed);
                    strH2.getClass();
                    j120.M(gup0Var, wdk0Var2, "", str, strH2, null, Integer.valueOf(R.drawable.data_copy_icon), null, 80);
                }
                gup0Var.P0().x(hup0.f13693a);
                return Unit.f46060a;
            case 6:
                qvp0 qvp0Var = (qvp0) obj2;
                a8z a8zVar2 = qvp0Var.k2;
                yvp0 yvp0Var = (yvp0) obj;
                int i = qvp0.m2;
                yvp0Var.getClass();
                if (yvp0Var.equals(wvp0.f39849a)) {
                    ii iiVar = (ii) ((uwi) a8zVar2.getValue()).f36393a.d;
                    x1x.y(iiVar);
                    w5z w5zVar = ((uwi) a8zVar2.getValue()).f36393a;
                    String strH3 = qvp0Var.H(R.string.exit_dialog_title);
                    String strH4 = qvp0Var.H(R.string.exit_dialog_title);
                    strH4.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) null, (CharSequence) strH4, qvp0Var.H(R.string.cancel), qvp0Var.H(R.string.exit_button_without_save), "REQUEST_SHOW_LOGOUT_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1474);
                    tx00.l2.getClass();
                    iiVar.c(evz.g(dialogFields, false, true, true), qvp0Var.n0().r());
                } else {
                    if (!(yvp0Var instanceof xvp0)) {
                        t9f.b();
                        return null;
                    }
                    kxq kxqVarB2 = qvp0Var.B();
                    if (kxqVarB2 != null) {
                        wdk0 wdk0Var3 = (wdk0) ((uwi) a8zVar2.getValue()).f36393a.f38604a;
                        x1x.y(wdk0Var3);
                        String strH5 = qvp0Var.H(R.string.social_telegram);
                        strH5.getClass();
                        n6x.i0(kxqVarB2, wdk0Var3, strH5, "org.telegram.messenger", ((xvp0) yvp0Var).f41573a);
                    }
                    qvp0Var.y0();
                }
                ((k3t0) qvp0Var.l2.getValue()).x(rvp0.f31183a);
                return Unit.f46060a;
            case 7:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hzp0 hzp0Var = (hzp0) ((lzp0) obj2);
                List list = hzp0Var.f13918a;
                List list2 = hzp0Var.b;
                if (!list.isEmpty()) {
                    hcz.e(hczVar2, null, null, fre0.d, 3);
                    List list3 = hzp0Var.f13918a;
                    hczVar2.f(list3.size(), null, new adn0(list3, (byte) 22), new ugd(802480018, true, new xy1(list3, b4)));
                }
                if (!list2.isEmpty()) {
                    hcz.e(hczVar2, null, null, fre0.e, 3);
                    hczVar2.f(list2.size(), null, new adn0(list2, (byte) 23), new ugd(802480018, true, new bzp0(list2, z ? (byte) 1 : (byte) 0)));
                }
                return Unit.f46060a;
            case 8:
                nzp0 nzp0Var = (nzp0) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                nzp0Var.r.b(th, new l7p0(nzp0Var, (byte) 13));
                return Unit.f46060a;
            case 9:
                r0q0 r0q0Var = (r0q0) obj2;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.e(hczVar3, null, null, new ugd(-2010708114, true, new gcn0(r0q0Var, b2)), 3);
                hcz.e(hczVar3, null, null, unh0.e, 3);
                a4x a4xVar = r0q0Var.f29643a.b;
                hczVar3.f(a4xVar.size(), null, new adn0(a4xVar, (byte) 24), new ugd(2039820996, true, new bzp0(a4xVar, b6)));
                return Unit.f46060a;
            case 10:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                ((x1q0) obj2).c.a(th2);
                return Unit.f46060a;
            case 11:
                Drawable drawable = (Drawable) obj2;
                fhl fhlVar = (fhl) obj;
                x5a x5aVarI = fhlVar.A0().i();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (fhlVar.d() >> 32)), (int) Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
                drawable.draw(vw2.b(x5aVarI));
                return Unit.f46060a;
            case 12:
                ((Function1) obj).invoke((s4q0) obj2);
                return Unit.f46060a;
            case 13:
                nop0 nop0Var = (nop0) obj2;
                hps0 hps0Var = (hps0) obj;
                if (hps0Var instanceof eu) {
                    nop0Var.invoke(((eu) hps0Var).o);
                    return Boolean.TRUE;
                }
                jf4.n("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                return null;
            case 14:
                d7q0 d7q0Var = (d7q0) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                agk0 agk0Var = d7q0Var.f5606a;
                float fL = agk0Var.l() + fFloatValue;
                agk0 agk0Var2 = d7q0Var.b;
                if (fL > agk0Var2.l()) {
                    fFloatValue = agk0Var2.l() - agk0Var.l();
                } else if (fL < 0.0f) {
                    fFloatValue = -agk0Var.l();
                }
                agk0Var.m(agk0Var.l() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 15:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                ((ifx) cpVar2.u).b.a(new da0(new b8q0((hz) obj2, cpVar2, z ? (byte) 1 : (byte) 0)));
                cpVar2.t(new pgj0(cpVar2, cpVar2, b5));
                return Unit.f46060a;
            case 16:
                f9q0 f9q0Var = (f9q0) obj2;
                i83 i83Var = (i83) obj;
                f83 f83Var = (f83) i83Var.f14321a;
                if (f83Var instanceof jb00) {
                    jb00 jb00Var = (jb00) f83Var;
                    if (jb00Var.b == null) {
                        return i83.a(i83Var, new jb00(jb00Var.f16214a, f9q0Var, jb00Var.c), 0, 14);
                    }
                }
                if (!(f83Var instanceof ib00)) {
                    return i83Var;
                }
                ib00 ib00Var = (ib00) f83Var;
                return ib00Var.b == null ? i83.a(i83Var, new ib00(ib00Var.f14462a, f9q0Var, ib00Var.c), 0, 14) : i83Var;
            case 17:
                z6e z6eVar = (z6e) obj2;
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                d3k d3kVar = (d3k) cpVar3.u;
                Drawable background = d3kVar.d.getBackground();
                if (background != null) {
                    sj3.B0(background, cpVar3.w, R.attr.uikitPrimary);
                }
                d3kVar.b.setOnClickListener(new pzp(cpVar3, z6eVar, (byte) 6));
                cpVar3.t(new kzi0(cpVar3, (byte) 18));
                return Unit.f46060a;
            case 18:
                ygq0 ygq0Var = (ygq0) obj;
                ygq0Var.getClass();
                ((zgq0) obj2).h.invoke(ygq0Var);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((fiq0) obj2).q.b(th3, new shq0(b6));
                return Unit.f46060a;
            case 20:
                wmq0 wmq0Var = (wmq0) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                wmq0Var.e.b(th4, new l7p0(wmq0Var, (byte) 26));
                return Unit.f46060a;
            case 21:
                tpq0 tpq0Var = (tpq0) obj2;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                tpq0Var.d.b(th5, new l7p0(tpq0Var, (byte) 27));
                return Unit.f46060a;
            case 22:
                yqq0 yqq0Var = (yqq0) obj2;
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                yqq0Var.g.b(th6, new l7p0(yqq0Var, (byte) 28));
                return Unit.f46060a;
            case 23:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                ((nie0) obj2).f23583a = j6zVar;
                return Unit.f46060a;
            case 24:
                z2r0 z2r0Var = (z2r0) obj2;
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                if ((th7 instanceof zhi0) && ((zhi0) th7).c == i2o.IncorrectDataError) {
                    z2r0Var.h.f16260a.h(false, false);
                    z = true;
                }
                return Boolean.valueOf(z);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                uid uidVar = (uid) obj;
                j6m0 j6m0Var = b5r0.t2;
                uidVar.getClass();
                ((b5r0) obj2).Q0().x(new n4r0(uidVar));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                uid uidVar2 = (uid) obj;
                s2m0 s2m0Var2 = r6r0.S1;
                uidVar2.getClass();
                ((r6r0) obj2).G0().x(new y5r0(uidVar2));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gar0 gar0Var = (gar0) obj2;
                hcz hczVar4 = (hcz) obj;
                String str2 = y9r0.m2;
                hczVar4.getClass();
                a4x a4xVar2 = gar0Var.f10983a;
                hczVar4.f(a4xVar2.size(), new zcn0(new shq0(b5), a4xVar2, (byte) 19), new e0m0(a4xVar2, (byte) 4), new ugd(2039820996, true, new xe4(a4xVar2, gar0Var, (byte) 21)));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ecr0 ecr0Var = (ecr0) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var3 = ecr0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    ecr0Var.f.getClass();
                } while (!p7m0Var3.m(value3, tbr0.a((tbr0) value3, null, null, null, false, true, false, null, 103)));
                return Unit.f46060a;
            default:
                jcr0 jcr0Var = (jcr0) obj2;
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                a4x a4xVar3 = jcr0Var.b;
                hczVar5.f(a4xVar3.size(), null, new adn0(a4xVar3, (byte) 29), new ugd(2039820996, true, new xe4(a4xVar3, jcr0Var, b3)));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ nop0(Object obj, byte b) {
        this.f23879a = b;
        this.b = obj;
    }
}
