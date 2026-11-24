package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.chips.DsChip;

/* JADX INFO: loaded from: classes4.dex */
public final class d2p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5367a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d2p(Object obj, Object obj2, byte b) {
        this.f5367a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.f5367a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return ((x6o) this.b).invoke(Integer.valueOf(iIntValue), ((List) this.c).get(iIntValue));
            case 1:
                ((h2l0) obj).getClass();
                ((Function1) this.b).invoke(new o2p((x2p) this.c));
                return Unit.f46060a;
            case 2:
                return ((mmn) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 3:
                int iIntValue2 = ((Number) obj).intValue();
                return ((x6o) this.b).invoke(Integer.valueOf(iIntValue2), ((List) this.c).get(iIntValue2));
            case 4:
                int iIntValue3 = ((Number) obj).intValue();
                return ((x6o) this.b).invoke(Integer.valueOf(iIntValue3), ((List) this.c).get(iIntValue3));
            case 5:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                if (bemVar instanceof wdm) {
                    ((Function1) this.b).invoke(new lgp((ugp) this.c));
                }
                return Unit.f46060a;
            case 6:
                int iIntValue4 = ((Number) obj).intValue();
                return ((jbp) this.b).invoke(Integer.valueOf(iIntValue4), ((a4x) this.c).get(iIntValue4));
            case 7:
                return ((e4p) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 8:
                return ((e4p) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 9:
                djr djrVar = (djr) obj;
                djrVar.getClass();
                ((Function1) this.b).invoke(new qjr(((okr) this.c).f25418a, djrVar));
                return Unit.f46060a;
            case 10:
                return ((dcr) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 11:
                int iIntValue5 = ((Number) obj).intValue();
                return ((gwr) this.b).invoke(Integer.valueOf(iIntValue5), ((List) this.c).get(iIntValue5));
            case 12:
                int iIntValue6 = ((Number) obj).intValue();
                return ((gwr) this.b).invoke(Integer.valueOf(iIntValue6), ((List) this.c).get(iIntValue6));
            case 13:
                int iIntValue7 = ((Number) obj).intValue();
                return ((t4s) this.b).invoke(Integer.valueOf(iIntValue7), ((a4x) this.c).get(iIntValue7));
            case 14:
                DsChip dsChip = (DsChip) obj;
                dsChip.getClass();
                jfo0 jfo0Var = (jfo0) this.b;
                dsChip.setText(jfo0Var.b);
                dsChip.setSelectedInternal(jfo0Var.c);
                dsChip.setOnClickListener(new k8v((Function1) this.c, jfo0Var));
                return Unit.f46060a;
            case 15:
                int iIntValue8 = ((Number) obj).intValue();
                return ((s3t) this.b).invoke(Integer.valueOf(iIntValue8), ((List) this.c).get(iIntValue8));
            case 16:
                wfk0 wfk0Var = (wfk0) obj;
                synchronized (xfk0.c) {
                    j = xfk0.e;
                    xfk0.e = 1 + j;
                }
                return new nz40(j, wfk0Var, (Function1) this.b, (Function1) this.c);
            case 17:
                int iIntValue9 = ((Number) obj).intValue();
                return ((s3t) this.b).invoke(Integer.valueOf(iIntValue9), ((List) this.c).get(iIntValue9));
            case 18:
                return ((umu) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((umu) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case 20:
                int iIntValue10 = ((Number) obj).intValue();
                return ((s3t) this.b).invoke(Integer.valueOf(iIntValue10), ((List) this.c).get(iIntValue10));
            case 21:
                int iIntValue11 = ((Number) obj).intValue();
                return ((x2w) this.b).invoke(Integer.valueOf(iIntValue11), ((List) this.c).get(iIntValue11));
            case 22:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((xew) ((l7m0) this.b).getValue()).b;
                hczVar.f(a4xVar.size(), null, new ubn(a4xVar, (byte) 6), new ugd(802480018, true, new ws1(a4xVar, (Function1) this.c, (byte) 15)));
                return Unit.f46060a;
            case 23:
                int iIntValue12 = ((Number) obj).intValue();
                return ((x2w) this.b).invoke(Integer.valueOf(iIntValue12), ((List) this.c).get(iIntValue12));
            case 24:
                return ((h7w) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((h7w) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue13 = ((Number) obj).intValue();
                return ((v1x) this.b).invoke(Integer.valueOf(iIntValue13), ((a4x) this.c).get(iIntValue13));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iIntValue14 = ((Number) obj).intValue();
                return ((v1x) this.b).invoke(Integer.valueOf(iIntValue14), ((List) this.c).get(iIntValue14));
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((Function1) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
            default:
                return ((djx) this.b).invoke(((List) this.c).get(((Number) obj).intValue()));
        }
    }
}
