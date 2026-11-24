package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uy0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36465a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ uy0(a4x a4xVar, Function1 function1, boolean z) {
        this.f36465a = (byte) 5;
        this.b = a4xVar;
        this.d = function1;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36465a;
        byte b2 = 6;
        byte b3 = 7;
        byte b4 = 11;
        byte b5 = 9;
        byte b6 = 22;
        byte b7 = 10;
        byte b8 = 5;
        Function1 function1 = this.d;
        boolean z = this.c;
        a4x a4xVar = this.b;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(a4xVar.size(), null, new b8(a4xVar, (byte) 14), new ugd(802480018, true, new cz0(a4xVar, z, function1, (byte) 0)));
                break;
            case 1:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8zVar.e(a4xVar.size(), new vtf(new m7h((byte) 4), a4xVar, (byte) 4), null, new vtf(new m7h(b8), a4xVar, (byte) 5), new ugd(-1117249557, true, new cz0(a4xVar, z, function1, (byte) 3)));
                break;
            case 2:
                i8z i8zVar2 = (i8z) obj;
                i8zVar2.getClass();
                i8zVar2.e(a4xVar.size(), new ctl(new mmn((byte) 5), a4xVar, (byte) 23), null, new ctl(new mmn((byte) 6), a4xVar, (byte) 24), new ugd(-1117249557, true, new cz0(a4xVar, z, function1, b8)));
                break;
            case 3:
                i8z i8zVar3 = (i8z) obj;
                i8zVar3.getClass();
                i8zVar3.e(a4xVar.size(), new d2p(new dcr(b3), a4xVar, b7), null, new far(a4xVar, (byte) 2), new ugd(-1117249557, true, new cz0(a4xVar, z, function1, b2)));
                break;
            case 4:
                xdz xdzVar = (xdz) obj;
                xdzVar.getClass();
                xdzVar.e(a4xVar.size(), new ygy(new w800((byte) 10), a4xVar, (byte) 11), new bgz(a4xVar, (byte) 22), null, new ugd(-334987442, true, new cz0(a4xVar, z, function1, b3)));
                break;
            case 5:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                jfa0 jfa0Var = new jfa0(b4);
                a4x a4xVar2 = this.b;
                hczVar2.f(a4xVar2.size(), new zu90(b5, jfa0Var, a4xVar2), new a580(a4xVar2, (byte) 26), new ugd(2039820996, true, new vfe((List) a4xVar2, (Object) a4xVar2, this.d, this.c, (byte) 6)));
                break;
            default:
                i8z i8zVar4 = (i8z) obj;
                i8zVar4.getClass();
                i8zVar4.e(a4xVar.size(), new o3l0(new gcl0((byte) 13), a4xVar, (byte) 16), new a8(new t330((byte) 10), a4xVar, b6), new y9k0(a4xVar, (byte) 19), new ugd(-1942245546, true, new cz0(a4xVar, z, function1, b5)));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ uy0(a4x a4xVar, boolean z, Function1 function1, byte b) {
        this.f36465a = b;
        this.b = a4xVar;
        this.c = z;
        this.d = function1;
    }
}
