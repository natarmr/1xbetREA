package a;

import a.jq0;
import a.m1r;
import a.ufx;
import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class gt80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ jt80 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt80(jt80 jt80Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
        this.j = jt80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jt80 jt80Var = this.j;
        switch (b) {
            case 0:
                wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
                return new gt80(jt80Var, yjeVar);
            case 1:
                return new gt80(jt80Var, yjeVar, (byte) 1);
            case 2:
                return new gt80(jt80Var, yjeVar, (byte) 2);
            default:
                return new gt80(jt80Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((gt80) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        rs80 rs80Var;
        byte b = this.i;
        jt80 jt80Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                s91 s91Var = jt80Var.W;
                wgh0 wgh0Var = wgh0.AGGREGATOR_LIVE;
                s91Var.c(new AggregatorScreenModel(null, null, 0L, vl1.f37601a, wgh0Var, 0L, 0L, null, false, Response.REQUEST_TERMINATED));
                wgh0 wgh0Var2 = wgh0.MY_AGGREGATOR;
                jt80Var.U.g(wgh0Var);
                jt80Var.X.C("aggregator_live");
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                jt80Var.A.f35083a.c("game_menu_filter_call");
                i1w0 i1w0VarC = jt80Var.p.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                final long j = ((rs80) jt80Var.D()).v;
                FragmentScreen fragmentScreen = new FragmentScreen(j) { // from class: org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorFiltersScreen

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final long f46287a;

                    {
                        this.f46287a = j;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        jq0.P1.getClass();
                        jq0 jq0Var = new jq0();
                        jq0Var.M1.j(jq0Var, jq0.Q1[1], this.f46287a);
                        return jq0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                };
                if (fragmentScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
                }
                ListIterator listIteratorO = b1j.o(i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (pawVar.hasNext()) {
                        i1w0VarC.a((oe50) pawVar.next());
                    } else {
                        p7m0 p7m0Var = jt80Var.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            rs80Var = (rs80) value;
                        } while (!p7m0Var.m(value, rs80.a(rs80Var, false, false, false, false, false, false, rs80Var.e, null, null, null, null, null, null, null, null, null, null, false, null, 134217663)));
                    }
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                pwi pwiVar = jt80Var.L;
                long j2 = jt80Var.o;
                fk60 fk60Var = (j2 != nw80.b.getId() && j2 == nw80.f24223a.getId()) ? fk60.LIVE_AGGREGATOR : fk60.AGGREGATOR_SLOTS;
                if (pwiVar.r(fk60Var)) {
                    jt80Var.G(ls80.f20565a);
                }
                jt80Var.K.i(false);
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ocj ocjVar = jt80Var.i;
                if (!jt80Var.o0.isEmpty()) {
                    List listR = jt80.R(jt80Var.o0);
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    while (true) {
                        Object value2 = p7m0Var2.getValue();
                        value2.getClass();
                        ocj ocjVar2 = ocjVar;
                        if (p7m0Var2.m(value2, rs80.a((rs80) value2, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, listR, iun.f15405a, false, null, 109039615))) {
                            jt80Var.Z();
                            jt80Var.d0();
                            ur80 ur80Var = new ur80(jt80Var.o0);
                            p7m0 p7m0Var3 = ocjVar2.f25029a;
                            while (true) {
                                Object value3 = p7m0Var3.getValue();
                                value3.getClass();
                                ur80 ur80Var2 = ur80Var;
                                if (!p7m0Var3.m(value3, rs80.a((rs80) value3, false, false, false, false, false, false, false, null, null, null, null, null, null, null, ur80Var2, null, null, false, null, 130023423))) {
                                    ur80Var = ur80Var2;
                                }
                            }
                        } else {
                            ocjVar = ocjVar2;
                        }
                    }
                }
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gt80(jt80 jt80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = jt80Var;
    }
}
