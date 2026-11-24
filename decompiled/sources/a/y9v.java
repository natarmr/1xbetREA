package a;

import android.content.Context;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y9v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42267a;
    public final /* synthetic */ pz40 b;

    public /* synthetic */ y9v(pz40 pz40Var, byte b) {
        this.f42267a = b;
        this.b = pz40Var;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0199  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42267a;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                a4x a4xVar = (a4x) obj;
                a4xVar.getClass();
                pz40Var.setValue(dyb.r0(a4xVar));
                return Unit.f46060a;
            case 1:
                Context context = (Context) obj;
                context.getClass();
                TableViewImpl tableViewImpl = new TableViewImpl(context, null, 0);
                adv advVar = new adv(tableViewImpl, true, R.dimen.text_12);
                advVar.l = tableViewImpl;
                tableViewImpl.setAdapter(advVar);
                pz40Var.setValue(advVar);
                return tableViewImpl;
            case 2:
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                pz40Var.setValue(new daq0(a9q0Var.m(0) ? qmk.o : qmk.p));
                return Unit.f46060a;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                pz40Var.setValue(bool);
                return Unit.f46060a;
            case 4:
                qkx qkxVar = (qkx) obj;
                long j = qkxVar.f28908a;
                pz40Var.setValue(qkxVar);
                return Unit.f46060a;
            case 5:
                iqq iqqVar = (iqq) obj;
                iqqVar.getClass();
                pz40Var.setValue(Boolean.valueOf(iqqVar.b()));
                return Unit.f46060a;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                pz40Var.setValue(bool2);
                return Unit.f46060a;
            case 7:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                pz40Var.setValue(bool3);
                return Unit.f46060a;
            case 8:
                o0x o0xVar = (o0x) obj;
                o0xVar.getClass();
                n0x n0xVar = o0xVar instanceof n0x ? (n0x) o0xVar : null;
                pz40Var.setValue(n0xVar != null ? n0xVar.f22722a : null);
                return Unit.f46060a;
            case 9:
                lz3 lz3Var = (lz3) obj;
                lz3Var.getClass();
                pz40Var.setValue(lz3Var);
                return Unit.f46060a;
            case 10:
                ((lwk) obj).getClass();
                return new ty2(pz40Var, (byte) 13);
            case 11:
                lz3 lz3Var2 = (lz3) obj;
                lz3Var2.getClass();
                pz40Var.setValue(lz3Var2);
                return Unit.f46060a;
            case 12:
                ne60 ne60Var = (ne60) obj;
                ne60 ne60Var2 = (ne60) pz40Var.getValue();
                if (ne60Var2 != null) {
                    long j2 = ne60Var2.f23370a;
                    if (Math.abs(Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (ne60Var.f23370a >> 32))) > 0.5f || Math.abs(Float.intBitsToFloat((int) (j2 & 4294967295L)) - Float.intBitsToFloat((int) (ne60Var.f23370a & 4294967295L))) > 0.5f) {
                        pz40Var.setValue(ne60Var);
                    }
                } else {
                    pz40Var.setValue(ne60Var);
                }
                return Unit.f46060a;
            case 13:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j6zVar.Y(0L) & 4294967295L));
                if (Math.abs(((Number) pz40Var.getValue()).floatValue() - fIntBitsToFloat) > 0.5f) {
                    pz40Var.setValue(Float.valueOf(fIntBitsToFloat));
                }
                return Unit.f46060a;
            case 14:
                j6z j6zVar2 = (j6z) obj;
                j6zVar2.getClass();
                pz40Var.setValue(Integer.valueOf((int) (j6zVar2.g() & 4294967295L)));
                return Unit.f46060a;
            case 15:
                pz40Var.setValue(Integer.valueOf((int) (((qkx) obj).f28908a >> 32)));
                return Unit.f46060a;
            case 16:
                pz40Var.setValue(Float.valueOf(((Number) ((t33) obj).d()).floatValue()));
                return Unit.f46060a;
            case 17:
                pz40Var.setValue(Float.valueOf(((Number) ((t33) obj).d()).floatValue()));
                return Unit.f46060a;
            case 18:
                l4b l4bVar = (l4b) obj;
                l4bVar.getClass();
                pz40Var.setValue(l4bVar);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((kz3) obj).getClass();
                pz40Var.setValue(Boolean.TRUE);
                return Unit.f46060a;
            case 20:
                ((iz3) obj).getClass();
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case 21:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (jtlVar.equals(rk.v)) {
                    ((Function1) pz40Var.getValue()).invoke(b060.f1753a);
                } else if (jtlVar.equals(rk.u)) {
                    ((Function1) pz40Var.getValue()).invoke(yz50.f43501a);
                }
                return Unit.f46060a;
            case 22:
                o0x o0xVar2 = (o0x) obj;
                o0xVar2.getClass();
                n0x n0xVar2 = o0xVar2 instanceof n0x ? (n0x) o0xVar2 : null;
                pz40Var.setValue(n0xVar2 != null ? n0xVar2.f22722a : null);
                return Unit.f46060a;
            case 23:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.g(abi0Var, ((a4x) pz40Var.getValue()).size());
                return Unit.f46060a;
            case 24:
                pz40Var.setValue(Boolean.FALSE);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                pz40Var.setValue((j6z) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Context context2 = (Context) obj;
                context2.getClass();
                return new pba0(context2, pz40Var);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                View view = (View) obj;
                view.getClass();
                pz40Var.setValue(view);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lz3 lz3Var3 = (lz3) obj;
                lz3Var3.getClass();
                pz40Var.setValue(Boolean.valueOf(lz3Var3 instanceof kz3));
                return Unit.f46060a;
            default:
                iqq iqqVar2 = (iqq) obj;
                iqqVar2.getClass();
                pz40Var.setValue(Boolean.valueOf(iqqVar2.b()));
                return Unit.f46060a;
        }
    }
}
