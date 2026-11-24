package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.category_card_collection.DsCategoryCardCollection;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jg2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16458a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ jg2(pz40 pz40Var, Function1 function1, byte b) {
        this.f16458a = b;
        this.b = pz40Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f16458a;
        byte b2 = 8;
        v8c0 v8c0Var = v8c0.f36975a;
        byte b3 = 29;
        byte b4 = 2;
        byte b5 = 5;
        byte b6 = 3;
        byte b7 = 0;
        byte b8 = 1;
        pz40 pz40Var = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                a4x a4xVar = (a4x) pz40Var.getValue();
                i8zVar.e(a4xVar.size(), new g5(new ma2((byte) 6), a4xVar, b3), new a8(new ahd((byte) 21), a4xVar, b4), new wl0(a4xVar, (byte) 6), new ugd(-1942245546, true, new ws1(a4xVar, function1, b8)));
                return Unit.f46060a;
            case 1:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar2 = (a4x) pz40Var.getValue();
                hczVar.f(a4xVar2.size(), new ci2(new xd2((byte) 5), a4xVar2, b7), new ci2(new xd2((byte) 6), a4xVar2, b8), new ugd(802480018, true, new ws1(a4xVar2, function1, b4)));
                return Unit.f46060a;
            case 2:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar3 = (a4x) pz40Var.getValue();
                hczVar2.f(a4xVar3.size(), new ci2(new xd2((byte) 8), a4xVar3, b4), new ci2(new xd2((byte) 9), a4xVar3, b6), new ugd(802480018, true, new ws1(a4xVar3, function1, b6)));
                return Unit.f46060a;
            case 3:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                a4x a4xVar4 = (a4x) pz40Var.getValue();
                byte b9 = 4;
                hczVar3.f(a4xVar4.size(), new ci2(new xd2((byte) 10), a4xVar4, b9), new ci2(new xd2((byte) 11), a4xVar4, b5), new ugd(802480018, true, new ws1(a4xVar4, function1, b9)));
                return Unit.f46060a;
            case 4:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                a4x a4xVar5 = (a4x) pz40Var.getValue();
                hczVar4.f(a4xVar5.size(), new ci2(new xd2((byte) 13), a4xVar5, (byte) 7), new ci2(new xd2((byte) 14), a4xVar5, b2), new ugd(802480018, true, new ws1(a4xVar5, function1, b5)));
                return Unit.f46060a;
            case 5:
                u3i u3iVar = (u3i) obj;
                u3iVar.getClass();
                if (u3iVar instanceof s3i) {
                    function1.invoke(new xdm(((Number) pz40Var.getValue()).longValue(), false, (s3i) u3iVar));
                } else if (u3iVar instanceof v3i) {
                    function1.invoke(new ydm(((Number) pz40Var.getValue()).longValue(), false, (v3i) u3iVar));
                } else if (u3iVar instanceof x3i) {
                    function1.invoke(new zdm(((Number) pz40Var.getValue()).longValue(), false, (x3i) u3iVar));
                } else if (u3iVar instanceof z3i) {
                    function1.invoke(new aem(((Number) pz40Var.getValue()).longValue(), false, (z3i) u3iVar));
                }
                return Unit.f46060a;
            case 6:
                u3i u3iVar2 = (u3i) obj;
                u3iVar2.getClass();
                if (u3iVar2 instanceof s3i) {
                    function1.invoke(new xdm(((Number) pz40Var.getValue()).longValue(), true, (s3i) u3iVar2));
                } else if (u3iVar2 instanceof v3i) {
                    function1.invoke(new ydm(((Number) pz40Var.getValue()).longValue(), true, (v3i) u3iVar2));
                } else if (u3iVar2 instanceof x3i) {
                    function1.invoke(new zdm(((Number) pz40Var.getValue()).longValue(), true, (x3i) u3iVar2));
                } else if (u3iVar2 instanceof z3i) {
                    function1.invoke(new aem(((Number) pz40Var.getValue()).longValue(), true, (z3i) u3iVar2));
                }
                return Unit.f46060a;
            case 7:
                u3i u3iVar3 = (u3i) obj;
                u3iVar3.getClass();
                if (u3iVar3 instanceof s3i) {
                    function1.invoke(new xdm(((Number) pz40Var.getValue()).longValue(), false, (s3i) u3iVar3));
                } else if (u3iVar3 instanceof v3i) {
                    function1.invoke(new ydm(((Number) pz40Var.getValue()).longValue(), false, (v3i) u3iVar3));
                } else if (u3iVar3 instanceof x3i) {
                    function1.invoke(new zdm(((Number) pz40Var.getValue()).longValue(), false, (x3i) u3iVar3));
                } else if (u3iVar3 instanceof z3i) {
                    function1.invoke(new aem(((Number) pz40Var.getValue()).longValue(), false, (z3i) u3iVar3));
                }
                return Unit.f46060a;
            case 8:
                u3i u3iVar4 = (u3i) obj;
                u3iVar4.getClass();
                if (u3iVar4 instanceof s3i) {
                    function1.invoke(new xdm(((Number) pz40Var.getValue()).longValue(), true, (s3i) u3iVar4));
                } else if (u3iVar4 instanceof v3i) {
                    function1.invoke(new ydm(((Number) pz40Var.getValue()).longValue(), true, (v3i) u3iVar4));
                } else if (u3iVar4 instanceof x3i) {
                    function1.invoke(new zdm(((Number) pz40Var.getValue()).longValue(), true, (x3i) u3iVar4));
                } else if (u3iVar4 instanceof z3i) {
                    function1.invoke(new aem(((Number) pz40Var.getValue()).longValue(), true, (z3i) u3iVar4));
                }
                return Unit.f46060a;
            case 9:
                u3i u3iVar5 = (u3i) obj;
                u3iVar5.getClass();
                if (u3iVar5 instanceof s3i) {
                    function1.invoke(new xdm(((Number) pz40Var.getValue()).longValue(), false, (s3i) u3iVar5));
                } else if (u3iVar5 instanceof v3i) {
                    function1.invoke(new ydm(((Number) pz40Var.getValue()).longValue(), false, (v3i) u3iVar5));
                } else if (u3iVar5 instanceof x3i) {
                    function1.invoke(new zdm(((Number) pz40Var.getValue()).longValue(), false, (x3i) u3iVar5));
                } else if (u3iVar5 instanceof z3i) {
                    function1.invoke(new aem(((Number) pz40Var.getValue()).longValue(), false, (z3i) u3iVar5));
                }
                return Unit.f46060a;
            case 10:
                u3i u3iVar6 = (u3i) obj;
                u3iVar6.getClass();
                if (u3iVar6 instanceof s3i) {
                    function1.invoke(new xdm(((Number) pz40Var.getValue()).longValue(), true, (s3i) u3iVar6));
                } else if (u3iVar6 instanceof v3i) {
                    function1.invoke(new ydm(((Number) pz40Var.getValue()).longValue(), true, (v3i) u3iVar6));
                } else if (u3iVar6 instanceof x3i) {
                    function1.invoke(new zdm(((Number) pz40Var.getValue()).longValue(), true, (x3i) u3iVar6));
                } else if (u3iVar6 instanceof z3i) {
                    function1.invoke(new aem(((Number) pz40Var.getValue()).longValue(), true, (z3i) u3iVar6));
                }
                return Unit.f46060a;
            case 11:
                u3i u3iVar7 = (u3i) obj;
                u3iVar7.getClass();
                if (u3iVar7 instanceof s3i) {
                    function1.invoke(new xdm(((Number) pz40Var.getValue()).longValue(), false, (s3i) u3iVar7));
                } else if (u3iVar7 instanceof v3i) {
                    function1.invoke(new ydm(((Number) pz40Var.getValue()).longValue(), false, (v3i) u3iVar7));
                } else if (u3iVar7 instanceof x3i) {
                    function1.invoke(new zdm(((Number) pz40Var.getValue()).longValue(), false, (x3i) u3iVar7));
                } else if (u3iVar7 instanceof z3i) {
                    function1.invoke(new aem(((Number) pz40Var.getValue()).longValue(), false, (z3i) u3iVar7));
                }
                return Unit.f46060a;
            case 12:
                u3i u3iVar8 = (u3i) obj;
                u3iVar8.getClass();
                if (u3iVar8 instanceof s3i) {
                    function1.invoke(new xdm(((Number) pz40Var.getValue()).longValue(), true, (s3i) u3iVar8));
                } else if (u3iVar8 instanceof v3i) {
                    function1.invoke(new ydm(((Number) pz40Var.getValue()).longValue(), true, (v3i) u3iVar8));
                } else if (u3iVar8 instanceof x3i) {
                    function1.invoke(new zdm(((Number) pz40Var.getValue()).longValue(), true, (x3i) u3iVar8));
                } else if (u3iVar8 instanceof z3i) {
                    function1.invoke(new aem(((Number) pz40Var.getValue()).longValue(), true, (z3i) u3iVar8));
                }
                return Unit.f46060a;
            case 13:
                ((kz3) obj).getClass();
                function1.invoke((String) pz40Var.getValue());
                return Unit.f46060a;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue != ((lim) pz40Var.getValue()).g) {
                    function1.invoke(new jim(iIntValue));
                }
                return Unit.f46060a;
            case 15:
                int iIntValue2 = ((Integer) obj).intValue();
                if (iIntValue2 != ((mim) pz40Var.getValue()).f) {
                    function1.invoke(new jim(iIntValue2));
                }
                return Unit.f46060a;
            case 16:
                int iIntValue3 = ((Integer) obj).intValue();
                if (iIntValue3 != ((nim) pz40Var.getValue()).g) {
                    function1.invoke(new jim(iIntValue3));
                }
                return Unit.f46060a;
            case 17:
                int iIntValue4 = ((Integer) obj).intValue();
                if (iIntValue4 != ((oim) pz40Var.getValue()).g) {
                    function1.invoke(new jim(iIntValue4));
                }
                return Unit.f46060a;
            case 18:
                ((wgl0) obj).getClass();
                function1.invoke(new w380(new uav0(((q380) pz40Var.getValue()).b, ((q380) pz40Var.getValue()).e)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((xgl0) obj).getClass();
                function1.invoke(new w380(new vav0(((q380) pz40Var.getValue()).b, ((q380) pz40Var.getValue()).e)));
                return Unit.f46060a;
            case 20:
                iqq iqqVar = (iqq) obj;
                iqqVar.getClass();
                if (iqqVar.b()) {
                    pz40Var.setValue(Boolean.TRUE);
                    function1.invoke(new i9c0(true));
                }
                return Unit.f46060a;
            case 21:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof v5q0) {
                    function1.invoke(v8c0Var);
                    pz40Var.setValue("");
                } else if (x5q0Var instanceof w5q0) {
                    pz40Var.setValue(((w5q0) x5q0Var).f38596a);
                    function1.invoke(new t8c0(StringsKt.u0((String) pz40Var.getValue()).toString()));
                }
                return Unit.f46060a;
            case 22:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (jtlVar.equals(rk.A)) {
                    function1.invoke(x8c0.f40456a);
                } else if (jtlVar.equals(rk.Z)) {
                    pz40Var.setValue("");
                    function1.invoke(v8c0Var);
                }
                return Unit.f46060a;
            case 23:
                Context context = (Context) obj;
                context.getClass();
                TableViewImpl tableViewImpl = new TableViewImpl(context, null, 0);
                v8e0 v8e0Var = new v8e0(tableViewImpl, new ksc0((byte) 29));
                tableViewImpl.setAdapter(v8e0Var);
                pz40Var.setValue(v8e0Var);
                tableViewImpl.getCellRecyclerView().o(new gz6(function1, b6));
                return tableViewImpl;
            case 24:
                Context context2 = (Context) obj;
                context2.getClass();
                DsCategoryCardCollection dsCategoryCardCollection = new DsCategoryCardCollection(context2, null, 6);
                pz40Var.setValue(dsCategoryCardCollection);
                dsCategoryCardCollection.setNestedScrollingEnabled(false);
                dsCategoryCardCollection.setHasFixedSize(true);
                dsCategoryCardCollection.setOnItemClickListener(new sbt0(function1, (byte) 19));
                return dsCategoryCardCollection;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((wgl0) obj).getClass();
                function1.invoke(new mrk0(new uav0(((wbv0) pz40Var.getValue()).b, ((wbv0) pz40Var.getValue()).e)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((xgl0) obj).getClass();
                function1.invoke(new mrk0(new vav0(((wbv0) pz40Var.getValue()).b, ((wbv0) pz40Var.getValue()).e)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((wgl0) obj).getClass();
                function1.invoke(new mrk0(new uav0(((icv0) pz40Var.getValue()).b, ((icv0) pz40Var.getValue()).c)));
                return Unit.f46060a;
            default:
                ((xgl0) obj).getClass();
                function1.invoke(new mrk0(new vav0(((icv0) pz40Var.getValue()).b, ((icv0) pz40Var.getValue()).c)));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ jg2(Function1 function1, pz40 pz40Var, byte b) {
        this.f16458a = b;
        this.c = function1;
        this.b = pz40Var;
    }
}
