package a;

import android.content.Context;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.impl.stagetable.presentation.common.NonScrollableRecyclerView;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rnp implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30799a;

    public /* synthetic */ rnp(byte b) {
        this.f30799a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 29;
        byte b2 = 6;
        byte b3 = 3;
        switch (this.f30799a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 1:
                hup hupVar = (hup) obj;
                hupVar.getClass();
                return hupVar;
            case 2:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new hxp(sjdVar);
            case 3:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new l3k0(absolutePath);
            case 4:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 5:
                t9q t9qVar = (t9q) obj;
                t9qVar.getClass();
                List<gcq> list = t9qVar.f33579a;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (gcq gcqVar : list) {
                    int i = gcqVar.f11074a;
                    String strL = kng0.l("\u202a", gcqVar.b, "\u202c");
                    int i2 = gcqVar.f11074a;
                    Integer num = t9qVar.b;
                    arrayList.add(new njx(i, strL, num != null && i2 == num.intValue(), gcqVar.d));
                }
                return new u9q(dyb.r0(arrayList));
            case 6:
                soe soeVar = (soe) obj;
                soeVar.getClass();
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", soeVar);
                return lwf.B;
            case 7:
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "setTorchIfRequired: torch control completed");
                }
                return Unit.f46060a;
            case 8:
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "setExternalFlashAeModeAsync: state3AControl.updateSignal completed");
                }
                return Unit.f46060a;
            case 9:
                yai0.e((abi0) obj, 0);
                return Unit.f46060a;
            case 10:
                ((Throwable) obj).getClass();
                return Boolean.FALSE;
            case 11:
                ((Throwable) obj).getClass();
                return Boolean.FALSE;
            case 12:
                ((Throwable) obj).getClass();
                return Boolean.FALSE;
            case 13:
                return Unit.f46060a;
            case 14:
                return Unit.f46060a;
            case 15:
                return Unit.f46060a;
            case 16:
                return Unit.f46060a;
            case 17:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new k2l(cpVar, cpVar, b2));
                return Unit.f46060a;
            case 18:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                gkz gkzVar = new gkz(ysq.d);
                gkzVar.d.b(new gbn(new jbp((byte) 25), new e9k(b3, b), new rnp((byte) 17), gzn.w));
                qsx qsxVar = (qsx) cpVar2.u;
                qsxVar.d.setAdapter(gkzVar);
                RecyclerView recyclerView = qsxVar.d;
                recyclerView.n(new bie0(recyclerView));
                cpVar2.t(new if6(cpVar2, gkzVar, cpVar2, gkzVar, (byte) 5));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 20:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 21:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                vcu0 vcu0Var = (vcu0) cpVar3.u;
                NonScrollableRecyclerView nonScrollableRecyclerView = vcu0Var.f37205a;
                Context context = cpVar3.w;
                nonScrollableRecyclerView.m(new qmk0(context.getResources().getDimensionPixelSize(R.dimen.space_6), 0, context.getResources().getDimensionPixelSize(R.dimen.space_6), 0, context.getResources().getDimensionPixelSize(R.dimen.space_18), 1, null, null, 458));
                k4f k4fVar = new k4f();
                ((dp) k4fVar.e).b(new gbn(new jbp(b), new atq(b3, b3), new rnp((byte) 22), gzn.A));
                vcu0Var.f37205a.setLayoutManager(new LinearLayoutManager(context));
                vcu0Var.f37205a.setAdapter(k4fVar);
                cpVar3.t(new f5p(k4fVar, cpVar3, (byte) 14));
                return Unit.f46060a;
            case 22:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                cpVar4.t(new kgh(cpVar4, (byte) 18));
                return Unit.f46060a;
            case 23:
                return new d5r((pz40) obj);
            case 24:
                ((dar) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Context context2 = (Context) obj;
                context2.getClass();
                DsButton dsButton = new DsButton(new tje(context2, R.style.DSButton_Large_Secondary), null, 6, 0);
                dsButton.setLoading(false);
                String string = context2.getString(R.string.load_archive);
                string.getClass();
                dsButton.l(string);
                return dsButton;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                my6 my6Var = (my6) feeVar.c();
                my6Var.getClass();
                kur kurVar = my6Var.c;
                return new r820(new oy6(new vf40(new jgs(kurVar.f18925a.f39867a), kurVar.b)), null);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fee feeVar2 = (fee) obj;
                feeVar2.getClass();
                my6 my6Var2 = (my6) feeVar2.c();
                my6Var2.getClass();
                j580 j580Var = my6Var2.b;
                r00 r00Var = new r00(j580Var.f15922a, j580Var.b);
                md5 md5Var = my6Var2.f22590a;
                return new y00(r00Var, md5Var.f21580a, md5Var.b);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ly6 ly6Var = (ly6) obj;
                ly6Var.getClass();
                return j47.C0(ly6Var);
            default:
                tjr0 tjr0Var = (tjr0) obj;
                tjr0Var.getClass();
                u00 u00Var = new u00(tjr0Var.b.b, false, "");
                boolean z = tjr0Var.f34063a;
                return new y00(u00Var, bcm0.i(z), z ? R.drawable.bet_game_info_light_theme_bg : R.drawable.bet_game_info_dark_them_bg);
        }
    }
}
