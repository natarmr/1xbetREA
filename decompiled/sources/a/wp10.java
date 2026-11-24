package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wp10 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39523a;
    public final /* synthetic */ zp10 b;

    public /* synthetic */ wp10(zp10 zp10Var, byte b) {
        this.f39523a = b;
        this.b = zp10Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        Object value;
        byte b = this.f39523a;
        byte b2 = 12;
        yje yjeVar = null;
        byte b3 = 1;
        zp10 zp10Var = this.b;
        switch (b) {
            case 0:
                htz htzVar = zp10.U1;
                i1w0 i1w0VarF = a4n0.f(zp10Var);
                qki qkiVar = zp10Var.M1;
                if (qkiVar != null) {
                    return new ry3(i1w0VarF, qkiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                htz htzVar2 = zp10.U1;
                pf10 pf10Var = new pf10(1, zp10Var.H0(), vq10.class, "onActivationItemClicked", "onActivationItemClicked(Lorg/xplatform/mailing/impl/presentation/mailingmanagment/model/ActivationUiModel;)V", 0, (byte) 16);
                e000 e000Var = new e000(2, zp10Var.H0(), vq10.class, "onMailingSettingsItemClicked", "onMailingSettingsItemClicked(Lorg/xplatform/mailing/impl/presentation/mailingmanagment/model/MailingSettingsUiModel;Z)V", 0, (byte) 11);
                vp10 vp10Var = new vp10(ek5.e);
                gbn gbnVar = new gbn(new hhd((byte) 23), new l9(3, (byte) 15), new t1(pf10Var, (byte) 12), m9.q);
                dp dpVar = vp10Var.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new gm10((byte) 3), new tvx(3, (byte) 17), new km00(e000Var, (byte) 8), gvy.s));
                dpVar.b(new gbn(new hhd((byte) 22), new l9(3, (byte) 14), new b5((byte) 7), m9.p));
                return vp10Var;
            case 2:
                htz htzVar3 = zp10.U1;
                zp10Var.H0().y();
                return Unit.f46060a;
            case 3:
                htz htzVar4 = zp10.U1;
                zp10Var.H0().y();
                return Unit.f46060a;
            case 4:
                htz htzVar5 = zp10.U1;
                vq10 vq10VarH0 = zp10Var.H0();
                p7m0 p7m0Var = vq10VarH0.v;
                Object value2 = p7m0Var.getValue();
                jq10 jq10Var = value2 instanceof jq10 ? (jq10) value2 : null;
                if (jq10Var != null && (list = jq10Var.f16928a) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof cr10) {
                            arrayList.add(obj);
                        }
                    }
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, iq10.f15187a));
                    vq10VarH0.z = slb.U(new dnq(new fnq(new rf0(new fnq(new vsg0(new tq10(vq10VarH0, yjeVar, (byte) 0)), new tq10(vq10VarH0, yjeVar, b3), (byte) 4), (byte) 6), new mt00(arrayList, vq10VarH0, (yje) null), (byte) 4), new qos(vq10VarH0, yjeVar, b2), (byte) 1), d5c.S(jiu0.a(vq10VarH0), vq10VarH0.m.b));
                }
                return Unit.f46060a;
            default:
                htz htzVar6 = zp10.U1;
                vq10 vq10VarH1 = zp10Var.H0();
                c4m0 c4m0Var = vq10VarH1.z;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                vq10VarH1.x(true);
                return Unit.f46060a;
        }
    }
}
