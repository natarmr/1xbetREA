package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ryc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31308a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ ryc0(pz40 pz40Var, byte b) {
        this.f31308a = b;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31308a;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                iqq iqqVar = (iqq) obj;
                iqqVar.getClass();
                pz40Var.setValue(Boolean.valueOf(iqqVar.b()));
                return Unit.f46060a;
            case 1:
                iqq iqqVar2 = (iqq) obj;
                iqqVar2.getClass();
                pz40Var.setValue(Boolean.valueOf(iqqVar2.b()));
                return Unit.f46060a;
            case 2:
                Context context = (Context) obj;
                context.getClass();
                TableViewImpl tableViewImpl = new TableViewImpl(context, null, 0);
                q5e0 q5e0Var = new q5e0(tableViewImpl, true, R.dimen.text_12);
                q5e0Var.l = tableViewImpl;
                tableViewImpl.setAdapter(q5e0Var);
                pz40Var.setValue(q5e0Var);
                return tableViewImpl;
            case 3:
                pz40Var.setValue((String) obj);
                return Unit.f46060a;
            case 4:
                pz40Var.setValue((String) obj);
                return Unit.f46060a;
            case 5:
                pz40Var.setValue((String) obj);
                return Unit.f46060a;
            case 6:
                pz40Var.setValue((String) obj);
                return Unit.f46060a;
            case 7:
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                long j = a9q0Var.f491a.b.f42262a.b;
                daq0 daq0Var = new daq0(j);
                long j2 = ((daq0) pz40Var.getValue()).f5764a;
                idm0.n(j, j2);
                daq0 daq0Var2 = Float.compare(daq0.c(j), daq0.c(j2)) < 0 ? daq0Var : null;
                pz40Var.setValue(new daq0(daq0Var2 != null ? daq0Var2.f5764a : ((daq0) pz40Var.getValue()).f5764a));
                return Unit.f46060a;
            case 8:
                pz40Var.setValue((qkx) obj);
                return Unit.f46060a;
            case 9:
                zsf zsfVar = ljg0.f20150a;
                pz40Var.setValue((o0x) obj);
                return Unit.f46060a;
            case 10:
                zsf zsfVar2 = ljg0.f20150a;
                pz40Var.setValue((o0x) obj);
                return Unit.f46060a;
            case 11:
                zsf zsfVar3 = ljg0.f20150a;
                pz40Var.setValue((o0x) obj);
                return Unit.f46060a;
            case 12:
                Float f = (Float) obj;
                f.getClass();
                return Float.valueOf(((Number) ((Function1) pz40Var.getValue()).invoke(f)).floatValue());
            case 13:
                y0b y0bVar = (y0b) obj;
                y0bVar.getClass();
                ((Function1) pz40Var.getValue()).invoke(new i0i0(y0bVar.f41797a));
                return Unit.f46060a;
            case 14:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((xrj0) pz40Var.getValue()).f41374a;
                hczVar.f(a4xVar.size(), null, new ubn(a4xVar, (byte) 29), new ugd(802480018, true, new zd1(a4xVar, (byte) 8)));
                return Unit.f46060a;
            case 15:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                ArrayList arrayList = ((zrj0) pz40Var.getValue()).f44857a;
                hczVar2.f(arrayList.size(), null, new j13(arrayList, (byte) 28, false), new ugd(802480018, true, new wyl0(arrayList, (byte) 2)));
                return Unit.f46060a;
            case 16:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                zai0 zai0Var = cbi0.m;
                Boolean bool = (Boolean) pz40Var.getValue();
                bool.getClass();
                abi0Var.b(zai0Var, bool);
                return Unit.f46060a;
            case 17:
                a9q0 a9q0Var2 = (a9q0) obj;
                a9q0Var2.getClass();
                pz40Var.setValue(Boolean.valueOf(a9q0Var2.f()));
                return Unit.f46060a;
            case 18:
                pz40Var.setValue((String) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                pz40Var.setValue((String) obj);
                return Unit.f46060a;
            case 20:
                pz40Var.setValue((String) obj);
                return Unit.f46060a;
            case 21:
                pz40Var.setValue((String) obj);
                return Unit.f46060a;
            case 22:
                lz3 lz3Var = (lz3) obj;
                lz3Var.getClass();
                pz40Var.setValue(lz3Var);
                return Unit.f46060a;
            case 23:
                lz3 lz3Var2 = (lz3) obj;
                lz3Var2.getClass();
                pz40Var.setValue(lz3Var2);
                return Unit.f46060a;
            case 24:
                lz3 lz3Var3 = (lz3) obj;
                lz3Var3.getClass();
                pz40Var.setValue(lz3Var3);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lz3 lz3Var4 = (lz3) obj;
                lz3Var4.getClass();
                pz40Var.setValue(lz3Var4);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lz3 lz3Var5 = (lz3) obj;
                lz3Var5.getClass();
                pz40Var.setValue(lz3Var5);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                pz40Var.setValue(bool2);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            default:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
        }
    }
}
