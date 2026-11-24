package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class iu6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ String k;
    public final /* synthetic */ List l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iu6(String str, List list, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = str;
        this.l = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        List list = this.l;
        String str = this.k;
        switch (b) {
            case 0:
                iu6 iu6Var = new iu6(str, list, yjeVar, (byte) 0);
                iu6Var.j = obj;
                return iu6Var;
            case 1:
                iu6 iu6Var2 = new iu6(str, list, yjeVar, (byte) 1);
                iu6Var2.j = obj;
                return iu6Var2;
            default:
                iu6 iu6Var3 = new iu6(str, list, yjeVar, (byte) 2);
                iu6Var3.j = obj;
                return iu6Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        qpg0 qpg0Var = (qpg0) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((iu6) create(qpg0Var, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        byte b = this.i;
        List list = this.l;
        String str = this.k;
        qpg0 qpg0Var = (qpg0) this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ0 = qpg0Var.Z0(str);
                try {
                    Iterator it = list.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        xpg0VarZ0.o(i, ((Number) it.next()).longValue());
                        i++;
                    }
                    xpg0VarZ0.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ0.close();
                }
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ1 = qpg0Var.Z0(str);
                try {
                    Iterator it2 = list.iterator();
                    int i2 = 1;
                    while (it2.hasNext()) {
                        xpg0VarZ1.o(i2, ((Number) it2.next()).longValue());
                        i2++;
                    }
                    xpg0VarZ1.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ1.close();
                }
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ2 = qpg0Var.Z0(str);
                try {
                    Iterator it3 = list.iterator();
                    int i3 = 1;
                    while (it3.hasNext()) {
                        xpg0VarZ2.o(i3, ((Number) it3.next()).longValue());
                        i3++;
                    }
                    int iP = x0x.P(xpg0VarZ2, ParameterNames.ID);
                    int iP2 = x0x.P(xpg0VarZ2, "name");
                    int iP3 = x0x.P(xpg0VarZ2, "team");
                    int iP4 = x0x.P(xpg0VarZ2, "short_name");
                    int iP5 = x0x.P(xpg0VarZ2, "cyber");
                    int iP6 = x0x.P(xpg0VarZ2, "background");
                    int iP7 = x0x.P(xpg0VarZ2, "image_small");
                    int iP8 = x0x.P(xpg0VarZ2, "image_popular");
                    int iP9 = x0x.P(xpg0VarZ2, "background_tablet");
                    int iP10 = x0x.P(xpg0VarZ2, "background_champ_default");
                    int iP11 = x0x.P(xpg0VarZ2, "background_champ_tablet_default");
                    int iP12 = x0x.P(xpg0VarZ2, "background_champ_header_default");
                    int iP13 = x0x.P(xpg0VarZ2, "background_champ_header_tablet_default");
                    int iP14 = x0x.P(xpg0VarZ2, "game_background");
                    int iP15 = x0x.P(xpg0VarZ2, "sub_sports");
                    int iP16 = x0x.P(xpg0VarZ2, "image_champ_small");
                    int iP17 = x0x.P(xpg0VarZ2, "feed_image_vertical");
                    int iP18 = x0x.P(xpg0VarZ2, "feed_image_horizontal");
                    int iP19 = x0x.P(xpg0VarZ2, "feed_image_square");
                    int iP20 = x0x.P(xpg0VarZ2, "discipline_icon_3d");
                    int iP21 = x0x.P(xpg0VarZ2, "esports_event_focus_discipline_header");
                    int iP22 = x0x.P(xpg0VarZ2, "esports_header_focus_discipline_header");
                    int iP23 = x0x.P(xpg0VarZ2, "default_opponent_header");
                    int iP24 = x0x.P(xpg0VarZ2, "default_opponent_header_tablet");
                    ArrayList arrayList = new ArrayList();
                    while (xpg0VarZ2.W0()) {
                        long j = xpg0VarZ2.getLong(iP);
                        String strJ0 = xpg0VarZ2.J0(iP2);
                        String strJ1 = xpg0VarZ2.J0(iP3);
                        String strJ2 = xpg0VarZ2.J0(iP4);
                        int i4 = iP2;
                        int i5 = iP3;
                        boolean z = ((int) xpg0VarZ2.getLong(iP5)) != 0;
                        String strJ3 = xpg0VarZ2.J0(iP6);
                        String strJ4 = xpg0VarZ2.J0(iP7);
                        String strJ5 = xpg0VarZ2.J0(iP8);
                        String strJ6 = xpg0VarZ2.J0(iP9);
                        String strJ7 = xpg0VarZ2.J0(iP10);
                        String strJ8 = xpg0VarZ2.J0(iP11);
                        String strJ9 = xpg0VarZ2.J0(iP12);
                        String strJ10 = xpg0VarZ2.J0(iP13);
                        String strJ11 = xpg0VarZ2.J0(iP14);
                        int i6 = iP15;
                        String strJ12 = xpg0VarZ2.J0(i6);
                        int i7 = iP16;
                        String strJ13 = xpg0VarZ2.J0(i7);
                        int i8 = iP;
                        int i9 = iP17;
                        String strJ14 = xpg0VarZ2.J0(i9);
                        iP17 = i9;
                        int i10 = iP18;
                        String strJ15 = xpg0VarZ2.J0(i10);
                        iP18 = i10;
                        int i11 = iP19;
                        String strJ16 = xpg0VarZ2.J0(i11);
                        iP19 = i11;
                        int i12 = iP20;
                        String strJ17 = xpg0VarZ2.J0(i12);
                        iP20 = i12;
                        int i13 = iP21;
                        String strJ18 = xpg0VarZ2.J0(i13);
                        iP21 = i13;
                        int i14 = iP22;
                        String strJ19 = xpg0VarZ2.J0(i14);
                        iP22 = i14;
                        int i15 = iP23;
                        String strJ20 = xpg0VarZ2.J0(i15);
                        iP23 = i15;
                        int i16 = iP24;
                        iP24 = i16;
                        arrayList.add(new h5l0(j, strJ0, strJ1, strJ2, z, strJ3, strJ4, strJ5, strJ6, strJ7, strJ8, strJ9, strJ10, strJ11, strJ12, strJ13, strJ14, strJ15, strJ16, strJ17, strJ18, strJ19, strJ20, xpg0VarZ2.J0(i16)));
                        iP = i8;
                        iP15 = i6;
                        iP16 = i7;
                        iP2 = i4;
                        iP3 = i5;
                        break;
                    }
                    return arrayList;
                } finally {
                    xpg0VarZ2.close();
                }
        }
    }
}
