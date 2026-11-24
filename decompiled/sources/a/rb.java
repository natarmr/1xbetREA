package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30159a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ rb(List list, Function1 function1, byte b) {
        this.f30159a = b;
        this.b = list;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30159a;
        byte b2 = 5;
        byte b3 = 7;
        byte b4 = 16;
        byte b5 = 15;
        byte b6 = 13;
        byte b7 = 10;
        Function1 function1 = this.c;
        List list = this.b;
        byte b8 = 1;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                tb tbVar = tb.f33636a;
                hczVar.f(list.size(), new b8(list), new b8(list, (byte) 5), new ugd(2039820996, true, new vb(list, function1, (byte) 0)));
                break;
            case 1:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8zVar.e(list.size(), new g5(new g20((byte) 13), list, b7), null, new b8(list, (byte) 7), new ugd(-1942245546, true, new vb(list, function1, b8)));
                break;
            case 2:
                i8z i8zVar2 = (i8z) obj;
                i8zVar2.getClass();
                i8zVar2.e(list.size(), new g5(new g20((byte) 14), list, (byte) 11), null, new b8(list, (byte) 8), new ugd(-1942245546, true, new vb(list, function1, (byte) 2)));
                break;
            case 3:
                i8z i8zVar3 = (i8z) obj;
                i8zVar3.getClass();
                i8zVar3.e(list.size(), new g5(new g20((byte) 15), list, (byte) 12), null, new b8(list, (byte) 9), new ugd(-1942245546, true, new vb(list, function1, (byte) 3)));
                break;
            case 4:
                i8z i8zVar4 = (i8z) obj;
                i8zVar4.getClass();
                i8zVar4.e(list.size(), new g5(new g20((byte) 16), list, b6), null, new b8(list, (byte) 10), new ugd(-1942245546, true, new vb(list, function1, (byte) 4)));
                break;
            case 5:
                i8z i8zVar5 = (i8z) obj;
                i8zVar5.getClass();
                cp8 cp8Var = new cp8((byte) 11);
                cp8 cp8Var2 = new cp8((byte) 12);
                i8zVar5.e(list.size(), new dx8(xdx.E(list, cp8Var), (byte) 0), null, new at7(cp8Var2, list, (byte) 6), new ugd(-2091135074, true, new vb(list, function1, b6)));
                break;
            case 6:
                xdz xdzVar = (xdz) obj;
                xdzVar.getClass();
                xdzVar.e(list.size(), null, new dx8(list, (byte) 15), null, new ugd(-334987442, true, new vb(list, function1, (byte) 18)));
                break;
            case 7:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(list.size(), null, new bzh(list, (byte) 6), new ugd(2039820996, true, new vb(list, function1, (byte) 24)));
                break;
            case 8:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hczVar3.f(list.size(), null, new far(list, (byte) 20), new ugd(2039820996, true, new anw(list, list, function1, (byte) 0)));
                break;
            case 9:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hczVar4.f(list.size(), null, new a580(list, (byte) 16), new ugd(2039820996, true, new anw(list, list, function1, b8)));
                break;
            case 10:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                hczVar5.f(list.size(), null, new a580(list, (byte) 18), new ugd(2039820996, true, new anw(list, list, function1, (byte) 2)));
                break;
            case 11:
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                hczVar6.f(list.size(), new zu90((byte) 14, new kma0((byte) 29), list), new zu90(b5, new peb0((byte) 0), list), new ugd(802480018, true, new a100(list, function1, (byte) 22)));
                break;
            case 12:
                hcz hczVar7 = (hcz) obj;
                hczVar7.getClass();
                hczVar7.f(list.size(), null, new d1c0(list, (byte) 28), new ugd(802480018, true, new njh0(list, function1, b2)));
                break;
            case 13:
                i8z i8zVar6 = (i8z) obj;
                i8zVar6.getClass();
                i8zVar6.e(list.size(), new zcn0(new ofo0((byte) 7), list, b3), new a8(new t330((byte) 13), list, (byte) 25), new adn0(list, (byte) 8), new ugd(-1942245546, true, new njh0(list, function1, b5)));
                break;
            case 14:
                hcz hczVar8 = (hcz) obj;
                hczVar8.getClass();
                hczVar8.f(list.size(), new zcn0(new ofo0((byte) 10), list, b7), new adn0(list, (byte) 9), new ugd(2039820996, true, new njh0(list, function1, b4)));
                break;
            default:
                hcz hczVar9 = (hcz) obj;
                hczVar9.getClass();
                hcz.g(hczVar9, list.size(), null, null, new ugd(-236400423, true, new d2s(list, function1, (byte) 27)), 6);
                break;
        }
        return Unit.f46060a;
    }
}
