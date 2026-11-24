package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.chips.DsChipGroup;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class or0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25713a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ or0(a4x a4xVar, Function1 function1, byte b) {
        this.f25713a = b;
        this.b = a4xVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f25713a;
        byte b2 = 13;
        byte b3 = 12;
        byte b4 = 4;
        byte b5 = 29;
        byte b6 = 21;
        byte b7 = 3;
        byte b8 = 22;
        byte b9 = 9;
        Function1 function1 = this.c;
        a4x<j0h> a4xVar = this.b;
        byte b10 = 1;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                eo0 eo0Var = new eo0(b4);
                eo0 eo0Var2 = new eo0((byte) 5);
                hczVar.f(a4xVar.size(), new b8(xdx.E(a4xVar, eo0Var), (byte) 13), new g5(eo0Var2, a4xVar, (byte) 16), new ugd(-1311333631, true, new vb(a4xVar, function1, (byte) 5)));
                break;
            case 1:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(a4xVar.size(), new g5(new xg1(b9), a4xVar, b6), new b8(a4xVar, (byte) 17), new ugd(2039820996, true, new vb(a4xVar, function1, (byte) 7)));
                break;
            case 2:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hczVar3.f(a4xVar.size(), new g5(new dj1(b8), a4xVar, (byte) 23), new b8(a4xVar, (byte) 21), new ugd(802480018, true, new vb(a4xVar, function1, b9)));
                break;
            case 3:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hczVar4.f(a4xVar.size(), new ci2(new o33(b10), a4xVar, (byte) 14), new b8(a4xVar, (byte) 22), new ugd(2039820996, true, new vb(a4xVar, function1, (byte) 10)));
                break;
            case 4:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                cp8 cp8Var = new cp8((byte) 7);
                cp8 cp8Var2 = new cp8((byte) 8);
                hczVar5.f(a4xVar.size(), new b8(xdx.E(a4xVar, cp8Var), (byte) 29), new at7(cp8Var2, a4xVar, (byte) 5), new ugd(-1311333631, true, new vb(a4xVar, function1, b3)));
                break;
            case 5:
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                m1b m1bVar = new m1b((byte) 26);
                m1b m1bVar2 = new m1b((byte) 27);
                byte b11 = 15;
                hczVar6.f(a4xVar.size(), new dx8(xdx.E(a4xVar, m1bVar), (byte) 6), new at7(m1bVar2, a4xVar, b11), new ugd(-1311333631, true, new vb(a4xVar, function1, b11)));
                break;
            case 6:
                hcz hczVar7 = (hcz) obj;
                hczVar7.getClass();
                hczVar7.f(a4xVar.size(), null, new dx8(a4xVar, (byte) 12), new ugd(802480018, true, new vb(a4xVar, function1, (byte) 17)));
                break;
            case 7:
                hcz hczVar8 = (hcz) obj;
                hczVar8.getClass();
                hczVar8.f(a4xVar.size(), new at7(new sfc((byte) 4), a4xVar, (byte) 19), new dx8(a4xVar, (byte) 14), new ugd(2039820996, true, new gic((List) a4xVar, function1, a4xVar, (byte) 0)));
                break;
            case 8:
                hcz hczVar9 = (hcz) obj;
                hczVar9.getClass();
                hczVar9.f(a4xVar.size(), new at7(new bqd((byte) 3), a4xVar, (byte) 25), new dx8(a4xVar, (byte) 16), new ugd(2039820996, true, new vb(a4xVar, function1, (byte) 19)));
                break;
            case 9:
                xdz xdzVar = (xdz) obj;
                xdzVar.getClass();
                xdzVar.e(a4xVar.size(), null, new dx8(a4xVar, (byte) 17), null, new ugd(-334987442, true, new vb(a4xVar, function1, (byte) 20)));
                break;
            case 10:
                wah0 wah0Var = (wah0) obj;
                wah0Var.getClass();
                DsChipGroup dsChipGroup = wah0Var.b;
                dsChipGroup.removeAllViews();
                for (j0h j0hVar : a4xVar) {
                    Context context = wah0Var.f38826a.getContext();
                    context.getClass();
                    DsChip dsChip = new DsChip(context, null);
                    dsChip.setText(j0hVar.c);
                    dsChip.setSelected(j0hVar.b);
                    dsChip.setOnSelectListener(new eod(function1, j0hVar, (byte) 25));
                    dsChipGroup.addView(dsChip);
                }
                break;
            case 11:
                hcz hczVar10 = (hcz) obj;
                hczVar10.getClass();
                hczVar10.f(a4xVar.size(), null, new bzh(a4xVar, (byte) 0), new ugd(802480018, true, new vb(a4xVar, function1, (byte) 23)));
                break;
            case 12:
                hcz hczVar11 = (hcz) obj;
                hczVar11.getClass();
                hczVar11.f(a4xVar.size(), null, new bzh(a4xVar, (byte) 29), new ugd(802480018, true, new yul(a4xVar, function1, b10)));
                break;
            case 13:
                hcz hczVar12 = (hcz) obj;
                hczVar12.getClass();
                hczVar12.f(a4xVar.size(), new ctl(new f4m(b2), a4xVar, (byte) 15), new v2m(a4xVar, (byte) 6), new ugd(2039820996, true, new yul(a4xVar, function1, (byte) 2)));
                break;
            case 14:
                hcz hczVar13 = (hcz) obj;
                hczVar13.getClass();
                mmn mmnVar = new mmn((byte) 22);
                mmn mmnVar2 = new mmn((byte) 23);
                hczVar13.f(a4xVar.size(), new v2m(xdx.E(a4xVar, mmnVar), (byte) 21), new ctl(mmnVar2, a4xVar, (byte) 29), new ugd(-1311333631, true, new yul(a4xVar, function1, b7)));
                break;
            case 15:
                hcz hczVar14 = (hcz) obj;
                hczVar14.getClass();
                hczVar14.f(a4xVar.size(), new d2p(new x6o((byte) 18), a4xVar, (byte) 0), new v2m(a4xVar, (byte) 23), new ugd(2039820996, true, new yul(a4xVar, function1, b4)));
                break;
            case 16:
                hcz hczVar15 = (hcz) obj;
                hczVar15.getClass();
                hczVar15.f(a4xVar.size(), new d2p(new e4p((byte) 28), a4xVar, (byte) 7), new v2m(a4xVar, (byte) 26), new ugd(802480018, true, new yul(a4xVar, function1, (byte) 8)));
                break;
            case 17:
                hcz hczVar16 = (hcz) obj;
                hczVar16.getClass();
                hczVar16.f(a4xVar.size(), new d2p(new e4p((byte) 27), a4xVar, (byte) 8), new v2m(a4xVar, (byte) 27), new ugd(802480018, true, new yul(a4xVar, function1, b9)));
                break;
            case 18:
                hcz hczVar17 = (hcz) obj;
                hczVar17.getClass();
                hczVar17.f(a4xVar.size(), new ygy(new hvy((byte) 8), a4xVar, (byte) 6), new far(a4xVar, (byte) 29), new ugd(2039820996, true, new yul(a4xVar, function1, (byte) 15)));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hcz hczVar18 = (hcz) obj;
                hczVar18.getClass();
                hczVar18.f(a4xVar.size(), new bgz(xdx.E(a4xVar, new p610((byte) 18)), (byte) 24), new bgz(a4xVar, (byte) 25), new ugd(-1311333631, true, new a100(a4xVar, function1, b7)));
                break;
            case 20:
                hcz hczVar19 = (hcz) obj;
                hczVar19.getClass();
                hczVar19.f(a4xVar.size(), new ygy(new o240((byte) 7), a4xVar, b6), new ap30(a4xVar, (byte) 12), new ugd(2039820996, true, new gic((List) a4xVar, a4xVar, function1, (byte) 2)));
                break;
            case 21:
                hcz hczVar20 = (hcz) obj;
                hczVar20.getClass();
                hcz.g(hczVar20, a4xVar.size(), null, null, new ugd(1531394488, true, new gew(a4xVar, function1, b10)), 6);
                break;
            case 22:
                hcz hczVar21 = (hcz) obj;
                hczVar21.getClass();
                hczVar21.f(a4xVar.size(), new m160(new rj50((byte) 16), a4xVar, (byte) 2), new ap30(a4xVar, (byte) 26), new ugd(2039820996, true, new a100(a4xVar, function1, (byte) 14)));
                break;
            case 23:
                hcz hczVar22 = (hcz) obj;
                hczVar22.getClass();
                hczVar22.f(a4xVar.size(), new m160(new zc70((byte) 13), a4xVar, (byte) 16), new a580(a4xVar, (byte) 3), new ugd(2039820996, true, new a100(a4xVar, function1, (byte) 15)));
                break;
            case 24:
                hcz hczVar23 = (hcz) obj;
                hczVar23.getClass();
                hczVar23.f(a4xVar.size(), null, new d1c0(a4xVar, (byte) 6), new ugd(802480018, true, new a100(a4xVar, function1, (byte) 26)));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                hcz hczVar24 = (hcz) obj;
                hczVar24.getClass();
                hczVar24.f(a4xVar.size(), null, new d1c0(a4xVar, (byte) 9), new ugd(802480018, true, new a100(a4xVar, function1, (byte) 27)));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                hcz hczVar25 = (hcz) obj;
                hczVar25.getClass();
                hczVar25.f(a4xVar.size(), new pwe0(new w0h0(b6), a4xVar, b3), new pwe0(new w0h0(b8), a4xVar, b2), new ugd(802480018, true, new a100(a4xVar, function1, b5)));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hcz hczVar26 = (hcz) obj;
                hczVar26.getClass();
                hczVar26.f(a4xVar.size(), null, new d1c0(a4xVar, (byte) 20), new ugd(802480018, true, new njh0(a4xVar, function1, b10)));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                hcz hczVar27 = (hcz) obj;
                hczVar27.getClass();
                eoh0 eoh0Var = new eoh0((byte) 9);
                eoh0 eoh0Var2 = new eoh0((byte) 10);
                hczVar27.f(a4xVar.size(), new d1c0(xdx.E(a4xVar, eoh0Var), (byte) 24), new pwe0(eoh0Var2, a4xVar, b8), new ugd(-1311333631, true, new njh0(a4xVar, function1, b7)));
                break;
            default:
                hcz hczVar28 = (hcz) obj;
                hczVar28.getClass();
                cwi0 cwi0Var = cwi0.f5082a;
                hczVar28.f(a4xVar.size(), new d1c0(a4xVar), new vc80(a4xVar, a4xVar, (byte) 1), new ugd(2039820996, true, new njh0(a4xVar, function1, b4)));
                break;
        }
        return Unit.f46060a;
    }
}
