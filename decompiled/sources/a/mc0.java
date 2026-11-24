package a;

import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.time_filter.LeaderboardTimeFilterYearsModel;
import org.xplatform.secret.impl.KeysImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class mc0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc0(int i, zeo0 zeo0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        this.j = i;
        this.l = zeo0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        int i = this.j;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new mc0(this.k, obj2, this.j, yjeVar, (byte) 0);
            case 1:
                return new mc0(this.k, obj2, this.j, yjeVar, (byte) 1);
            case 2:
                return new mc0((kr5) obj2, (mh1) this.k, i, yjeVar);
            case 3:
                return new mc0(this.k, this.j, obj2, yjeVar, (byte) 3);
            case 4:
                return new mc0(this.k, this.j, obj2, yjeVar, (byte) 4);
            case 5:
                return new mc0(this.k, this.j, obj2, yjeVar, (byte) 5);
            case 6:
                return new mc0(this.k, obj2, this.j, yjeVar, (byte) 6);
            case 7:
                return new mc0(this.k, this.j, obj2, yjeVar, (byte) 7);
            case 8:
                return new mc0(this.k, this.j, obj2, yjeVar, (byte) 8);
            case 9:
                mc0 mc0Var = new mc0(i, (zeo0) obj2, yjeVar);
                mc0Var.k = obj;
                return mc0Var;
            case 10:
                return new mc0(this.k, this.j, obj2, yjeVar, (byte) 10);
            case 11:
                mc0 mc0Var2 = new mc0((kie0) obj2, i, yjeVar);
                mc0Var2.k = obj;
                return mc0Var2;
            default:
                return new mc0(this.k, obj2, this.j, yjeVar, (byte) 12);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((mc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((mc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((mc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((mc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((mc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((mc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((mc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((mc0) create((sar0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((mc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((mc0) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mc0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        byte b2 = 0;
        int i = this.j;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                nc0 nc0Var = (nc0) this.k;
                ((jlx) nc0Var.i).a(((uzc0) nc0Var.g).a((kr5) obj3, i, true));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                n21 n21Var = (n21) this.k;
                s91 s91Var = n21Var.w;
                long id = ((nw80) obj3).getId();
                long j = ((q11) n21Var.D()).f27928a;
                rj1 rj1Var = rj1.f30569a;
                s91Var.c(new AggregatorScreenModel(null, null, 0L, new ul1(this.j, id, j), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                kr5 kr5Var = (kr5) obj3;
                oo5 oo5Var = kr5Var.n;
                oo5 oo5Var2 = oo5.ACTION_ONE_X_GAME;
                mh1 mh1Var = (mh1) this.k;
                if (oo5Var == oo5Var2) {
                    i1w0 i1w0VarC = mh1Var.Y.c();
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new bh1(mh1Var, kr5Var, i, b2))), i1w0VarC, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0VarC.a((oe50) pawVar.next());
                        }
                    }
                } else {
                    String str = mh1.E0;
                    mh1Var.T.a(mh1Var.R.a(kr5Var, i, true));
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                xk80 xk80Var = (xk80) this.k;
                if (xk80Var.k() != i) {
                    qjj.W((vne) obj3, null, null, new u48(xk80Var, i, objArr == true ? 1 : 0, b2), 3);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                rah0 rah0Var = (rah0) this.k;
                int iL = (int) ((i - 1) * ((rah0Var.b.l() * 100.0f) / 360.0f));
                if (iL < 0) {
                    iL = 0;
                }
                int iL2 = rah0Var.f.l();
                if (iL > iL2) {
                    iL = iL2;
                }
                qjj.W((vne) obj3, null, null, new pt8(rah0Var, iL, objArr2 == true ? 1 : 0, b2), 3);
                return Unit.f46060a;
            case 5:
                pz40 pz40Var = (pz40) obj3;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                kwj kwjVar = (kwj) this.k;
                int iK = kwjVar.k();
                float fL = kwjVar.l();
                int iN = kwjVar.n() - 1;
                if (fL > 0.4f && iK < iN) {
                    iK++;
                } else if (fL < -0.4f && iK > 0) {
                    iK--;
                }
                w2w0 w2w0VarD0 = bsr0.d0(i + iK);
                if (!w2w0VarD0.equals((w2w0) pz40Var.getValue())) {
                    pz40Var.setValue(w2w0VarD0);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                a4x a4xVar = (a4x) this.k;
                ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                int i2 = 0;
                for (Object obj4 : a4xVar) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    LeaderboardTimeFilterYearsModel leaderboardTimeFilterYearsModel = (LeaderboardTimeFilterYearsModel) obj4;
                    arrayList.add(new rhz(leaderboardTimeFilterYearsModel.f46582a, new rqm((vui0) new tui0(leaderboardTimeFilterYearsModel.b, null), (pui0) null, (pvi0) new nvi0(leaderboardTimeFilterYearsModel.f46582a == i), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506), i2 == a4xVar.size() - 1));
                    i2 = i3;
                }
                ((pz40) obj3).setValue(new ohz(dyb.o0(arrayList)));
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                Iterator it = CollectionsKt.S0(((du80) ((gu80) this.k)).f6689a).iterator();
                while (true) {
                    iil iilVar = (iil) it;
                    if (iilVar.b.hasNext()) {
                        Object next = iilVar.next();
                        if (((lr5) ((IndexedValue) next).b).f20512a == i) {
                            obj2 = next;
                        }
                    }
                }
                IndexedValue indexedValue = (IndexedValue) obj2;
                if (indexedValue != null) {
                    rv80 rv80Var = (rv80) obj3;
                    rv80Var.y.y((lr5) indexedValue.b, indexedValue.f46061a, rv80Var.J.k(new lu0(((yu80) rv80Var.D()).l.c, null, "aggregator_partition_screen", kotlin.collections.a.c(new g3z(i, "carousel")))), jiu0.a(rv80Var), new hv80(rv80Var, (byte) 4));
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = ((ncl0) this.k).R;
                xal0 xal0Var = new xal0(i, (List) obj3);
                p7m0Var.getClass();
                p7m0Var.o(null, xal0Var);
                return Unit.f46060a;
            case 9:
                sar0 sar0Var = (sar0) this.k;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                o3m0 o3m0Var = new o3m0((tcr0) CollectionsKt.W(i, sar0Var.f31898a), sar0Var, (byte) 19);
                int i4 = zeo0.u;
                ((zeo0) obj3).H(o3m0Var);
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                ((LinkedHashMap) this.k).put(new Integer(i), (Drawable) obj3);
                return Unit.f46060a;
            case 11:
                qah0 qah0Var = (qah0) this.k;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                ((kie0) obj3).f18333a = si30.b(qah0Var.a(i));
                return Unit.f46060a;
            default:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                System.loadLibrary("keys");
                KeysImpl keysImpl = (KeysImpl) this.k;
                keysImpl.createConfigForLib((String) obj3, i, false);
                odd oddVar = keysImpl.f46921a;
                Unit unit = Unit.f46060a;
                oddVar.N(unit);
                return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc0(kr5 kr5Var, mh1 mh1Var, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.l = kr5Var;
        this.k = mh1Var;
        this.j = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc0(kie0 kie0Var, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        this.l = kie0Var;
        this.j = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc0(Object obj, int i, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.j = i;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc0(Object obj, Object obj2, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.j = i;
    }
}
