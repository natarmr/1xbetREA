package a;

import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.resident.presentation.views.ResidentTagView;

/* JADX INFO: loaded from: classes5.dex */
public final class sof0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ vof0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sof0(vof0 vof0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vof0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vof0 vof0Var = this.k;
        switch (b) {
            case 0:
                sof0 sof0Var = new sof0(vof0Var, yjeVar, (byte) 0);
                sof0Var.j = obj;
                return sof0Var;
            case 1:
                sof0 sof0Var2 = new sof0(vof0Var, yjeVar, (byte) 1);
                sof0Var2.j = obj;
                return sof0Var2;
            default:
                sof0 sof0Var3 = new sof0(vof0Var, yjeVar, (byte) 2);
                sof0Var3.j = obj;
                return sof0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((sof0) create((rpf0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((sof0) create((ipf0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((sof0) create((jpf0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        int i = 8;
        final vof0 vof0Var = this.k;
        final byte b2 = 0;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                rpf0 rpf0Var = (rpf0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (rpf0Var != null) {
                    if (rpf0Var instanceof qpf0) {
                        qpf0 qpf0Var = (qpf0) rpf0Var;
                        wof0 wof0Var = qpf0Var.f29116a;
                        boolean z = qpf0Var.b;
                        int i2 = qpf0Var.c;
                        iiy[] iiyVarArr = vof0.O1;
                        vof0Var.H0().d.setVisibility(0);
                        vof0Var.H0().d.setState(wqf0.b);
                        vof0Var.H0().f.setVisibility(8);
                        if (z) {
                            vof0Var.J0(i2, false);
                        } else {
                            vof0Var.K0(wof0Var.j);
                        }
                    } else {
                        final byte b3 = 1;
                        if (rpf0Var instanceof opf0) {
                            opf0 opf0Var = (opf0) rpf0Var;
                            wof0 wof0Var2 = opf0Var.f25639a;
                            boolean z2 = opf0Var.b;
                            int i3 = opf0Var.c;
                            iiy[] iiyVarArr2 = vof0.O1;
                            vof0Var.H0().d.setVisibility(0);
                            vof0Var.H0().f.setVisibility(8);
                            if (z2) {
                                vof0Var.J0(i3, true);
                                vof0Var.H0().d.setState(wqf0.d);
                            } else {
                                vof0Var.K0(wof0Var2.j);
                                vof0Var.H0().d.setState(wqf0.c);
                            }
                        } else if (rpf0Var instanceof lpf0) {
                            lpf0 lpf0Var = (lpf0) rpf0Var;
                            final ArrayList arrayList = lpf0Var.f20439a;
                            final boolean z3 = lpf0Var.b;
                            iiy[] iiyVarArr3 = vof0.O1;
                            vof0Var.H0().i.setVisibility(arrayList.isEmpty() ? 0 : 4);
                            vof0Var.H0().i.setText(vof0Var.H(R.string.resident_select_safe));
                            vof0Var.H0().f.setVisibility(8);
                            vof0Var.H0().d.setVisibility(0);
                            vof0Var.H0().d.setState(wqf0.f39589a);
                            vof0Var.H0().c.setVisibility(8);
                            vof0Var.H0().e.setVisibility(0);
                            vof0Var.H0().e.setOnSafeAppliedListener(new Function1() { // from class: a.pof0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    byte b4 = b2;
                                    mrf0 mrf0Var = (mrf0) obj3;
                                    iiy[] iiyVarArr4 = vof0.O1;
                                    switch (b4) {
                                        case 0:
                                            mrf0Var.getClass();
                                            vof0 vof0Var2 = vof0Var;
                                            qjj.W(x0x.Q(vof0Var2.x()), null, null, new qof0(vof0Var2, arrayList, z3, mrf0Var, null, (byte) 0), 3);
                                            break;
                                        default:
                                            mrf0Var.getClass();
                                            vof0 vof0Var3 = vof0Var;
                                            qjj.W(x0x.Q(vof0Var3.x()), null, null, new qof0(vof0Var3, arrayList, z3, mrf0Var, null, (byte) 1), 3);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                            vof0Var.H0().e.setSafesState(arrayList);
                        } else if (rpf0Var instanceof kpf0) {
                            iiy[] iiyVarArr4 = vof0.O1;
                            vof0Var.G0();
                        } else if (rpf0Var instanceof mpf0) {
                            mpf0 mpf0Var = (mpf0) rpf0Var;
                            final ArrayList arrayList2 = mpf0Var.f22178a;
                            final boolean z4 = mpf0Var.b;
                            iiy[] iiyVarArr5 = vof0.O1;
                            vof0Var.H0().f.setVisibility(8);
                            vof0Var.H0().d.setVisibility(0);
                            vof0Var.H0().d.setState(wqf0.f39589a);
                            vof0Var.H0().c.setVisibility(8);
                            vof0Var.H0().e.setVisibility(0);
                            vof0Var.H0().e.setOnSafeAppliedListener(new Function1() { // from class: a.pof0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    byte b4 = b3;
                                    mrf0 mrf0Var = (mrf0) obj3;
                                    iiy[] iiyVarArr6 = vof0.O1;
                                    switch (b4) {
                                        case 0:
                                            mrf0Var.getClass();
                                            vof0 vof0Var2 = vof0Var;
                                            qjj.W(x0x.Q(vof0Var2.x()), null, null, new qof0(vof0Var2, arrayList2, z4, mrf0Var, null, (byte) 0), 3);
                                            break;
                                        default:
                                            mrf0Var.getClass();
                                            vof0 vof0Var3 = vof0Var;
                                            qjj.W(x0x.Q(vof0Var3.x()), null, null, new qof0(vof0Var3, arrayList2, z4, mrf0Var, null, (byte) 1), 3);
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                            vof0Var.H0().e.setSafesState(arrayList2);
                        } else if (rpf0Var instanceof ppf0) {
                            iiy[] iiyVarArr6 = vof0.O1;
                            vof0Var.H0().i.setVisibility(0);
                            vof0Var.H0().i.setText(vof0Var.H(R.string.resident_make_bet));
                            vof0Var.H0().d.setVisibility(8);
                            vof0Var.H0().c.setVisibility(8);
                            vof0Var.H0().f.setVisibility(8);
                            vof0Var.H0().e.setVisibility(0);
                            vof0Var.H0().c.setStateAppliedListener(new b4f0((byte) 14));
                            vof0Var.H0().e.setOnSafeAppliedListener(new bue0((byte) 24));
                            vof0Var.H0().c.a();
                            vof0Var.H0().e.setSafesState(iun.f15405a);
                        }
                    }
                }
                break;
            case 1:
                ipf0 ipf0Var = (ipf0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr7 = vof0.O1;
                TextView textView = vof0Var.H0().h;
                boolean z5 = ipf0Var.b;
                String str = ipf0Var.e;
                textView.setVisibility(z5 ? 0 : 8);
                vof0Var.H0().b.setVisibility(ipf0Var.f15161a ? 0 : 4);
                vof0Var.H0().h.setText(vof0Var.I(R.string.resident_current_bet, ipf0Var.d, str));
                vof0Var.H0().b.setText(vof0Var.I(R.string.resident_take_money, ipf0Var.c, str));
                break;
            default:
                jpf0 jpf0Var = (jpf0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                iiy[] iiyVarArr8 = vof0.O1;
                ResidentTagView residentTagView = vof0Var.H0().g;
                String str2 = jpf0Var.c;
                boolean z6 = jpf0Var.b;
                residentTagView.a(str2, jpf0Var.d);
                Group group = vof0Var.H0().j;
                if (jpf0Var.f16898a && !z6) {
                    i = 0;
                }
                group.setVisibility(i);
                vof0Var.H0().d.b(z6);
                break;
        }
        return Unit.f46060a;
    }
}
