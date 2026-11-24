package a;

import android.text.Editable;
import android.view.MotionEvent;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.feed.navigation.SportFilterScreenFactoryImpl$getSportFilterScreen$1;
import org.xplatform.feed.navigation.SportFilterScreenParams;
import org.xplatform.popular.impl.navigation.PopularScreenFactoryImpl$getScreen$1;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yr80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43109a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yr80(Object obj, byte b) {
        this.f43109a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        Object value;
        Object value2;
        Object value3;
        k5 k5Var;
        byte b = this.f43109a;
        byte b2 = 22;
        byte b3 = 5;
        byte b4 = 11;
        byte b5 = 10;
        byte b6 = 1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                fl70 fl70Var = as80.Y1;
                ((eg60) obj).getClass();
                ((as80) obj2).H0().x(zq80.f44796a);
                return Unit.f46060a;
            case 1:
                my80 my80Var = (my80) obj;
                jh70 jh70Var = uy80.W1;
                my80Var.getClass();
                ((uy80) obj2).G0().x(my80Var);
                return Unit.f46060a;
            case 2:
                t190 t190Var = (t190) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                t190Var.l.b(th, new ds60(t190Var, b2));
                return Unit.f46060a;
            case 3:
                String str = (String) obj;
                mi70 mi70Var = w590.W1;
                str.getClass();
                s690 s690VarI0 = ((w590) obj2).I0();
                if (str.length() != 0) {
                    s690VarI0.r.a(s690VarI0.q.f(R.string.deeplink_scheme, new Object[0]).concat(str));
                }
                return Unit.f46060a;
            case 4:
                es90 es90Var = (es90) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                cyu cyuVar = es90Var.j;
                g090 g090Var = es90Var.i;
                cyuVar.y(kotlin.text.c.r(((cr90) ((p7m0) g090Var.b).getValue()).c, "+", "", false));
                p7m0 p7m0Var = (p7m0) g090Var.b;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, cr90.a((cr90) value, null, null, null, false, th2, null, 447)));
                return Unit.f46060a;
            case 5:
                Editable editable = (Editable) obj;
                mi70 mi70Var2 = et90.j2;
                editable.getClass();
                kt90 kt90VarU0 = ((et90) obj2).U0();
                String string = editable.toString();
                string.getClass();
                p7m0 p7m0Var2 = kt90VarU0.e;
                do {
                    value2 = p7m0Var2.getValue();
                    ((lt90) value2).getClass();
                } while (!p7m0Var2.m(value2, new lt90("", string)));
                return Unit.f46060a;
            case 6:
                d6a0 d6a0Var = (d6a0) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                p7m0 p7m0Var3 = d6a0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    d6a0Var.f.getClass();
                } while (!p7m0Var3.m(value3, v5a0.a((v5a0) value3, null, false, true, false, null, 49)));
                d6a0Var.u.b(th3, new so90(b2));
                return Unit.f46060a;
            case 7:
                u7a0 u7a0Var = (u7a0) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.g(hczVar, u7a0Var.b.size(), null, null, new ugd(31822871, true, new csw((Object) u7a0Var, (byte) 8)), 6);
                return Unit.f46060a;
            case 8:
                z7a0 z7a0Var = (z7a0) obj2;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                z7a0Var.r.b(th4, new cz90(z7a0Var, b4));
                return Unit.f46060a;
            case 9:
                vea0 vea0Var = (vea0) obj2;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.g(hczVar2, vea0Var.d.size(), null, null, new ugd(1371814946, true, new csw((Object) vea0Var, (byte) 9)), 6);
                return Unit.f46060a;
            case 10:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new ka70(cpVar, (x6f) obj2, (byte) 27));
                return Unit.f46060a;
            case 11:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                paa0 paa0Var = ((hfa0) obj2).e ? paa0.f26647a : paa0.b;
                zai0 zai0Var = cbi0.g;
                iiy iiyVar = cbi0.f4063a[5];
                zai0Var.getClass();
                abi0Var.b(zai0Var, paa0Var);
                return Unit.f46060a;
            case 12:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                ((vjd) cpVar2.u).b.setViewCompositionStrategy(pek0.g);
                cpVar2.t(new ka70(cpVar2, (rpg) obj2, (byte) 28));
                return Unit.f46060a;
            case 13:
                nla0 nla0Var = (nla0) obj2;
                TableViewImpl tableViewImpl = (TableViewImpl) obj;
                tableViewImpl.getClass();
                k5 adapter = tableViewImpl.getAdapter();
                k5Var = adapter instanceof mla0 ? (mla0) adapter : null;
                if (k5Var != null) {
                    List listL0 = CollectionsKt.L0(nla0Var.b);
                    ArrayList arrayList = new ArrayList(r3d.q(listL0, 10));
                    Iterator it = listL0.iterator();
                    while (it.hasNext()) {
                        arrayList.add(CollectionsKt.L0((a4x) it.next()));
                    }
                    k5Var.q(arrayList, CollectionsKt.L0(nla0Var.c), CollectionsKt.L0(nla0Var.f23717a), nla0Var.d);
                }
                tableViewImpl.b(false, true);
                tableViewImpl.getColumnHeaderRecyclerView().y0(0);
                tableViewImpl.getRowHeaderRecyclerView().y0(0);
                tableViewImpl.getCellRecyclerView().y0(0);
                return Unit.f46060a;
            case 14:
                rma0 rma0Var = (rma0) obj2;
                TableViewImpl tableViewImpl2 = (TableViewImpl) obj;
                tableViewImpl2.getClass();
                k5 adapter2 = tableViewImpl2.getAdapter();
                k5Var = adapter2 instanceof qma0 ? (qma0) adapter2 : null;
                if (k5Var != null) {
                    List listL1 = CollectionsKt.L0(rma0Var.b);
                    ArrayList arrayList2 = new ArrayList(r3d.q(listL1, 10));
                    Iterator it2 = listL1.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(CollectionsKt.L0((a4x) it2.next()));
                    }
                    k5Var.q(arrayList2, CollectionsKt.L0(rma0Var.c), CollectionsKt.L0(rma0Var.f30735a), rma0Var.d);
                }
                tableViewImpl2.b(false, true);
                tableViewImpl2.getColumnHeaderRecyclerView().y0(0);
                tableViewImpl2.getRowHeaderRecyclerView().y0(0);
                tableViewImpl2.getCellRecyclerView().y0(0);
                return Unit.f46060a;
            case 15:
                ugi0 ugi0Var = (ugi0) obj2;
                int iIntValue = ((Integer) obj).intValue();
                return ugi0Var.e(iIntValue) + ": " + ugi0Var.g(iIntValue).h();
            case 16:
                ((jpa0) obj2).f().invoke((MotionEvent) obj);
                return Unit.f46060a;
            case 17:
                ota0 ota0Var = (ota0) obj2;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ota0Var.q.b(th5, new lma0(ota0Var, (byte) 4));
                return Unit.f46060a;
            case 18:
                yta0 yta0Var = new yta0(((Integer) obj).intValue());
                List list = rua0.G;
                ((rua0) obj2).G(yta0Var);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                uua0 uua0Var = (uua0) obj2;
                cmc cmcVar = (cmc) obj;
                cmcVar.getClass();
                mrv.o0(jsm0.f17060a);
                ewb0 ewb0Var = ysm0.b;
                iun iunVar = iun.f15405a;
                cmcVar.a(Payload.TYPE, ewb0Var, iunVar);
                cmcVar.a("value", x2x.H("kotlinx.serialization.Polymorphic<" + uua0Var.f36290a.J() + '>', ygi0.b, new ugi0[0]), iunVar);
                List list2 = uua0Var.b;
                list2.getClass();
                cmcVar.b = list2;
                return Unit.f46060a;
            case 20:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((uwa0) obj2).p.b(th6, new yr0(th6, (byte) 18));
                return Unit.f46060a;
            case 21:
                tah0 tah0Var = (tah0) obj;
                rl70 rl70Var = d2b0.S1;
                tah0Var.getClass();
                ((d2b0) obj2).R1 = tah0Var;
                return Unit.f46060a;
            case 22:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                ((i2k) cpVar3.u).b.setButtonClickListener(new bs50((wma0) obj2, cpVar3, b3));
                cpVar3.t(new ui80(cpVar3, b5));
                return Unit.f46060a;
            case 23:
                uid uidVar = (uid) obj;
                mi70 mi70Var3 = z5b0.R1;
                uidVar.getClass();
                ((k3t0) ((z5b0) obj2).O1.getValue()).x(new q5b0(uidVar));
                return Unit.f46060a;
            case 24:
                j6b0 j6b0Var = (j6b0) obj2;
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                v3c.N(j6b0Var.C);
                j6b0Var.N(new edt(th7));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                l7b0 l7b0Var = (l7b0) obj2;
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                th8.printStackTrace();
                p7m0 p7m0Var4 = l7b0Var.s;
                f7b0 f7b0Var = new f7b0(th8, g2v.d(l7b0Var.d, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new c7b0(l7b0Var, b6), 94));
                p7m0Var4.getClass();
                p7m0Var4.o(null, f7b0Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                m1r m1rVar = (m1r) obj;
                m1rVar.getClass();
                return ((PopularScreenFactoryImpl$getScreen$1) obj2).a(m1rVar);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.g(hczVar3, 2, null, null, new ugd(186937624, true, new csw((npo) obj2, b4)), 6);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                Object obj3 = ((iij) obj2).h;
                k0w0Var.h(new SportFilterScreenFactoryImpl$getSportFilterScreen$1(new SportFilterScreenParams(new mr2())));
                return Unit.f46060a;
            default:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hcz.e(hczVar4, null, null, ohq0.d, 3);
                hcz.e(hczVar4, null, null, new ugd(1597357203, true, new p0z(obj2, (byte) 24)), 3);
                return Unit.f46060a;
        }
    }
}
