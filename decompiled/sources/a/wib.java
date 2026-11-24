package a;

import android.view.GestureDetector;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.components.timer.DsTimerWithDescription;

/* JADX INFO: loaded from: classes3.dex */
public final class wib extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wib(pmi pmiVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        ylk ylkVar = ylk.EVENTS;
        this.j = pmiVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                return new wib((ajb) obj2, yjeVar, (byte) 0);
            case 1:
                return new wib((xpb) obj2, yjeVar, (byte) 1);
            case 2:
                return new wib((eqb) obj2, yjeVar, (byte) 2);
            case 3:
                return new wib((hrb) obj2, yjeVar, (byte) 3);
            case 4:
                return new wib((yxb) obj2, yjeVar, (byte) 4);
            case 5:
                return new wib((v7c) obj2, yjeVar, (byte) 5);
            case 6:
                return new wib((ffc) obj2, yjeVar, (byte) 6);
            case 7:
                return new wib((xgc) obj2, yjeVar, (byte) 7);
            case 8:
                return new wib((kzd) obj2, yjeVar, (byte) 8);
            case 9:
                return new wib((ppv0) obj2, yjeVar, (byte) 9);
            case 10:
                return new wib((fae) obj2, yjeVar, (byte) 10);
            case 11:
                return new wib((axe) obj2, yjeVar, (byte) 11);
            case 12:
                return new wib((rye) obj2, yjeVar, (byte) 12);
            case 13:
                return new wib((lbf) obj2, yjeVar, (byte) 13);
            case 14:
                return new wib((h6g) obj2, yjeVar, (byte) 14);
            case 15:
                return new wib((j7g) obj2, yjeVar, (byte) 15);
            case 16:
                return new wib((k8g) obj2, yjeVar, (byte) 16);
            case 17:
                return new wib((hbg) obj2, yjeVar, (byte) 17);
            case 18:
                return new wib((ecg) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new wib((igg) obj2, yjeVar, (byte) 19);
            case 20:
                return new wib((c5h) obj2, yjeVar, (byte) 20);
            case 21:
                return new wib((rsh) obj2, yjeVar, (byte) 21);
            case 22:
                return new wib((iqi) obj2, yjeVar, (byte) 22);
            case 23:
                return new wib(yjeVar, (rzj) obj2);
            case 24:
                ylk ylkVar = ylk.EVENTS;
                return new wib((pmi) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new wib((hvk) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new wib((w6l) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new wib((rrm) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new wib((DsTimerWithDescription) obj2, yjeVar, (byte) 28);
            default:
                return new wib((sdn) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wib) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wib) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((wib) create((rei0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wib) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((wib) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((wib) create((w4e) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((wib) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((wib) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((wib) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((wib) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((wib) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((wib) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((wib) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((wib) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((wib) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((wib) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((wib) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((wib) create((Unit) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wib) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        ?? arrayList;
        byte b = 13;
        byte b2 = 22;
        byte b3 = 6;
        byte b4 = 7;
        byte b5 = 2;
        byte b6 = 0;
        ArrayList arrayList2 = null;
        ?? r14 = 0;
        ?? r15 = 0;
        ?? r16 = 0;
        ?? r17 = 0;
        ?? r18 = 0;
        ?? r19 = 0;
        ?? r110 = 0;
        ?? r111 = 0;
        ?? r112 = 0;
        ?? r113 = 0;
        ?? r114 = 0;
        ?? r115 = 0;
        ?? r116 = 0;
        ?? r117 = 0;
        ?? r118 = 0;
        ?? r119 = 0;
        ?? r120 = 0;
        ?? r121 = 0;
        ?? r122 = 0;
        ?? r123 = 0;
        ?? r124 = 0;
        ?? r125 = 0;
        byte b7 = 1;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ajb ajbVar = (ajb) this.j;
                ajbVar.G(new gib(ajbVar.r.f15748a.b()));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                j120.Y((xpb) this.j);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                eqb eqbVar = (eqb) this.j;
                String str = (String) eqbVar.b.a("SAVED_LOGIN_STATE_KEY");
                if (str == null) {
                    str = "";
                }
                eqbVar.A(str);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                hrb hrbVar = (hrb) this.j;
                c4m0 c4m0Var = hrbVar.D;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    hrbVar.D = sac.T(new fnq(hrbVar.p.b(), new igb(hrbVar, (yje) (r14 == true ? 1 : 0), b7), (byte) 4), d5c.S(jiu0.a(hrbVar), hrbVar.c.f22085a), new c48(2, hrbVar, hrb.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 23));
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                yxb yxbVar = (yxb) this.j;
                if (!yxbVar.B) {
                    yxbVar.C = false;
                    hxb hxbVar = new hxb(yxbVar, (byte) 4);
                    hxbVar.invoke();
                    yxbVar.s = hxbVar;
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                v7c v7cVar = (v7c) this.j;
                v3c.N(v7cVar.T);
                v7cVar.T = sac.V(jiu0.a(v7cVar), new e6c(b7), null, v7cVar.g.f22085a, new t7c(v7cVar, r15 == true ? 1 : 0, b6), 10);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (v7cVar.A() == 0) {
                    v7cVar.b.e("SAVED_FINISH_TIME", Long.valueOf((((long) v7cVar.d.N()) * 1000) + jCurrentTimeMillis));
                    v7cVar.Q();
                } else if (v7cVar.A() > jCurrentTimeMillis) {
                    v7cVar.Q();
                } else {
                    p7m0 p7m0Var = v7cVar.O;
                    o6c o6cVar = o6c.f24727a;
                    p7m0Var.getClass();
                    p7m0Var.o(null, o6cVar);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                ffc ffcVar = (ffc) this.j;
                List listA = ffcVar.o.f1450a.a();
                p7m0 p7m0Var2 = ffcVar.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    listA.getClass();
                } while (!p7m0Var2.m(value, new afc(listA)));
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                xgc xgcVar = (xgc) this.j;
                int i = xgc.t;
                c4m0 c4m0Var2 = xgcVar.s;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    xgcVar.s = sac.T(new fnq(xgcVar.q.a(), new vgc(xgcVar, r17 == true ? 1 : 0, b6), (byte) 4), d5c.S(jiu0.a(xgcVar), xgcVar.o.f22085a), new vgc(xgcVar, r16 == true ? 1 : 0, b7));
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                kzd kzdVar = (kzd) this.j;
                c4m0 c4m0Var3 = kzdVar.u;
                if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                    kzdVar.u = sac.T(new fnq(kzdVar.p.b(), new igb((Object) kzdVar, (yje) (r19 == true ? 1 : 0), (byte) 8), (byte) 4), d5c.S(jiu0.a(kzdVar), kzdVar.d.f22085a), new fob(kzdVar, r18 == true ? 1 : 0, b));
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                wv00.f().a(i4e.f14142a, "Constraints changed for " + ((ppv0) this.j));
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                fae faeVar = (fae) this.j;
                c4m0 c4m0Var4 = faeVar.Q;
                if (c4m0Var4 == null || !c4m0Var4.isActive()) {
                    yxb yxbVar2 = faeVar.v;
                    opt optVar = yxbVar2.i;
                    g45 g45Var = optVar.f25659a;
                    byte b8 = 16;
                    a1t a1tVar = new a1t(((i7e) g45Var.c).i, b8);
                    s3t s3tVar = new s3t(b3);
                    eoh0 eoh0Var = i120.f;
                    zys0.e(2, s3tVar);
                    rwk rwkVarX = i120.X(a1tVar, eoh0Var, s3tVar);
                    i7e i7eVar = (i7e) g45Var.c;
                    gcl gclVar = (gcl) g45Var.d;
                    i89 i89Var = new i89(i7eVar.k, b2);
                    p7m0 p7m0Var3 = gclVar.e;
                    j2l j2lVar = new j2l(b4);
                    zys0.e(2, j2lVar);
                    byte b9 = 5;
                    a1g a1gVarE0 = dub.e0(rwkVarX, i89Var, i120.X(p7m0Var3, eoh0Var, j2lVar), gclVar.f, new cot(b9, r117 == true ? 1 : 0, b7));
                    gmq gmqVarW = i120.W(new vsg0(new u5u((Object) new a1t(((i7e) g45Var.c).i, b8), (yje) (r116 == true ? 1 : 0), (byte) 3)));
                    c00 c00Var = new c00(i7eVar.g, g45Var, (byte) 25);
                    p7m0 p7m0Var4 = gclVar.e;
                    j2l j2lVar2 = new j2l((byte) 7);
                    zys0.e(2, j2lVar2);
                    a1g a1gVarF0 = dub.f0(gmqVarW, c00Var, i120.X(p7m0Var4, eoh0Var, j2lVar2), new fl9(optVar, r115 == true ? 1 : 0, b9));
                    byte b10 = 3;
                    faeVar.Q = slb.U(new dnq(new fnq(new fnq(new p6d(new p6d(a1gVarE0, a1gVarF0, new y8p(b10, r114 == true ? 1 : 0, b10), b7), i120.W(new i89(yxbVar2.o, (byte) 4)), new wx4((Object) yxbVar2, (yje) (r113 == true ? 1 : 0), (byte) 2), b7), new fob(yxbVar2, r112 == true ? 1 : 0, (byte) 7), (byte) 4), new aae(faeVar, r111 == true ? 1 : 0, (byte) 3), (byte) 4), new bae(faeVar, r110 == true ? 1 : 0, b7), (byte) 1), d5c.S(jiu0.a(faeVar), faeVar.k.b));
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                ((axe) this.j).I0();
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                rye ryeVar = (rye) this.j;
                kwd kwdVar = rye.S1;
                ryeVar.G0().d.u();
                ryeVar.G0().d.setIsNeedClearText(true);
                ryeVar.G0().e.u();
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                lbf lbfVar = (lbf) this.j;
                mne mneVar = lbfVar.d;
                c4m0 c4m0Var5 = lbfVar.t;
                if (c4m0Var5 == null || !c4m0Var5.isActive()) {
                    lbfVar.t = sac.T(new fnq(lbfVar.n.b(), new u88(lbfVar, r119 == true ? 1 : 0, b4), (byte) 4), d5c.S(jiu0.a(lbfVar), mneVar.f22085a), new f1e(b5, r118 == true ? 1 : 0, b4));
                }
                v3c.N(lbfVar.u);
                lbfVar.u = sac.V(jiu0.a(lbfVar), new qaf(lbfVar, b7), null, mneVar.b, new igb((Object) lbfVar, (yje) (r120 == true ? 1 : 0), (byte) 15), 10);
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                ((h6g) this.j).y();
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                j7g j7gVar = (j7g) this.j;
                Set set = (Set) j7gVar.b.a("selected_ids_key");
                if (set != null) {
                    p7m0 p7m0Var5 = j7gVar.l;
                    p7m0Var5.getClass();
                    p7m0Var5.o(null, set);
                }
                j7gVar.o = sac.V(jiu0.a(j7gVar), new g7g(j7gVar, b6), null, j7gVar.g.f22085a, new fr9(j7gVar, r121 == true ? 1 : 0, b), 10);
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                k8g k8gVar = (k8g) this.j;
                bby bbyVar = k8gVar.j;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                k8gVar.j = sac.V(jiu0.a(k8gVar), new j8g(k8gVar, b7), null, k8gVar.f.f22085a, new igb((Object) k8gVar, (yje) (r122 == true ? 1 : 0), (byte) 20), 10);
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                hbg hbgVar = (hbg) this.j;
                hbgVar.B();
                bby bbyVar2 = hbgVar.y;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                hbgVar.y = sac.V(jiu0.a(hbgVar), new aag(hbgVar, b5), null, hbgVar.e.f22085a, new fbg(hbgVar, r123 == true ? 1 : 0, b7), 10);
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                ecg ecgVar = (ecg) this.j;
                sac.V(jiu0.a(ecgVar), new ejd(ecgVar, (byte) 29), null, ecgVar.c.f22085a, new igb(ecgVar, (yje) (r124 == true ? 1 : 0), b2), 10);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                igg iggVar = (igg) this.j;
                int i2 = igg.I;
                p7m0 p7m0Var6 = iggVar.i.f25029a;
                do {
                    value2 = p7m0Var6.getValue();
                    value2.getClass();
                } while (!p7m0Var6.m(value2, egg.a((egg) value2, false, null, null, null, false, 215)));
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                c5h c5hVar = (c5h) this.j;
                if (c5hVar.g.f27342a.d().r(fk60.CYBER_SPORT)) {
                    c5hVar.r.f(z4h.f43771a);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                rsh rshVar = (rsh) this.j;
                if (rshVar.q == null) {
                    p7m0 p7m0Var7 = rshVar.k;
                    do {
                        value3 = p7m0Var7.getValue();
                    } while (!p7m0Var7.m(value3, nch.f23293a));
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                List<fos0> list = ((hsj) ((iqi) this.j).c).g().b;
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                    for (fos0 fos0Var : list) {
                        List<eos0> list2 = fos0Var.b;
                        if (list2 != null) {
                            arrayList = new ArrayList(r3d.q(list2, 10));
                            for (eos0 eos0Var : list2) {
                                String str2 = fos0Var.f9898a;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                eos0Var.getClass();
                                Integer num = eos0Var.b;
                                String str3 = num == null ? "" : num.intValue() == 3 ? "ru_RU" : "en_GB";
                                String str4 = eos0Var.f8151a;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                arrayList.add(new qj3(str3, str2, str4));
                            }
                        } else {
                            arrayList = 0;
                        }
                        if (arrayList == 0) {
                            arrayList = iun.f15405a;
                        }
                        arrayList3.add(arrayList);
                    }
                    ArrayList arrayListR = r3d.r(arrayList3);
                    arrayList2 = new ArrayList();
                    for (Object obj2 : arrayListR) {
                        qj3 qj3Var = (qj3) obj2;
                        if (qj3Var.b.length() > 0 && qj3Var.c.length() > 0) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                return arrayList2 == null ? iun.f15405a : arrayList2;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                xot0 xot0Var = ((rzj) this.j).c;
                if (xot0Var != null) {
                    xot0Var.close();
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                vlk vlkVar = (vlk) ((pmi) this.j).c;
                ylk ylkVar = ylk.EVENTS;
                return Boolean.valueOf(vlkVar.f37628a.b().contains("dictionary_update_time_app_strings"));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                hvk hvkVar = (hvk) this.j;
                synchronized (hvkVar.h) {
                    try {
                        if (!hvkVar.m || hvkVar.n) {
                            return Unit.f46060a;
                        }
                        try {
                            hvkVar.v();
                            break;
                        } catch (IOException unused) {
                            hvkVar.o = true;
                        }
                        try {
                            if ((hvkVar.j >= 2000 ? (byte) 1 : (byte) 0) != 0) {
                                hvkVar.x();
                            }
                            break;
                        } catch (IOException unused2) {
                            hvkVar.p = true;
                            hvkVar.k = new yae0(new j78());
                        }
                        return Unit.f46060a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                ((w6l) this.j).b(true, 0L);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                rrm rrmVar = (rrm) this.j;
                GestureDetector gestureDetector = new GestureDetector(rrmVar.h, new g5g(rrmVar, b5));
                sje sjeVar = rrm.B;
                rrmVar.i.setOnTouchListener(new jw5(gestureDetector, b3));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                DsTimerWithDescription dsTimerWithDescription = (DsTimerWithDescription) this.j;
                int i3 = DsTimerWithDescription.o;
                dsTimerWithDescription.k();
                dsTimerWithDescription.i -= 1000;
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                sdn sdnVar = (sdn) this.j;
                sac.T(new fnq(((n9s) sdnVar.q.f40284a).a(), new ndn(sdnVar, r125 == true ? 1 : 0, b6), (byte) 4), jiu0.a(sdnVar), odn.h);
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wib(yje yjeVar, rzj rzjVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        this.j = rzjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wib(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
    }
}
