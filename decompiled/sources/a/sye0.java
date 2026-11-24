package a;

import kotlin.Unit;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes5.dex */
public final class sye0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sye0(diu0 diu0Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = diu0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = 3;
        switch (this.i) {
            case 0:
                return new sye0((eze0) this.j, (yje) obj3, (byte) 0).invokeSuspend(Unit.f46060a);
            case 1:
                return new sye0((x5f0) this.j, (yje) obj3, (byte) 1).invokeSuspend(Unit.f46060a);
            case 2:
                return new sye0((ocf0) this.j, (yje) obj3, (byte) 2).invokeSuspend(Unit.f46060a);
            case 3:
                return new sye0((iph0) this.j, (yje) obj3, b).invokeSuspend(Unit.f46060a);
            case 4:
                return new sye0((irh0) this.j, (yje) obj3, (byte) 4).invokeSuspend(Unit.f46060a);
            case 5:
                return new sye0((zuh0) this.j, (yje) obj3, (byte) 5).invokeSuspend(Unit.f46060a);
            case 6:
                return new sye0((ldi0) this.j, (yje) obj3, (byte) 6).invokeSuspend(Unit.f46060a);
            case 7:
                return new sye0((uri0) this.j, (yje) obj3, (byte) 7).invokeSuspend(Unit.f46060a);
            case 8:
                return new sye0((fdk0) this.j, (yje) obj3, (byte) 8).invokeSuspend(Unit.f46060a);
            case 9:
                return new sye0((tpk0) this.j, (yje) obj3, (byte) 9).invokeSuspend(Unit.f46060a);
            case 10:
                return new sye0((tam0) this.j, (yje) obj3, (byte) 10).invokeSuspend(Unit.f46060a);
            case 11:
                return new sye0((mkn0) this.j, (yje) obj3, (byte) 11).invokeSuspend(Unit.f46060a);
            case 12:
                return new sye0((arn0) this.j, (yje) obj3, (byte) 12).invokeSuspend(Unit.f46060a);
            case 13:
                return new sye0((zyn0) this.j, (yje) obj3, (byte) 13).invokeSuspend(Unit.f46060a);
            case 14:
                return new sye0((urp0) this.j, (yje) obj3, (byte) 14).invokeSuspend(Unit.f46060a);
            case 15:
                sye0 sye0Var = new sye0(b, (yje) obj3);
                sye0Var.j = obj;
                return sye0Var.invokeSuspend(Unit.f46060a);
            default:
                return new sye0((dyu0) this.j, (yje) obj3, (byte) 16).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        cdk0 cdk0Var;
        Object value5;
        Object value6;
        txu0 txu0Var;
        fwu0 fwu0Var;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                eze0 eze0Var = (eze0) this.j;
                int i = eze0.y0;
                p7m0 p7m0Var = eze0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, aye0.a((aye0) value, false, false, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 2147483646)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                x5f0 x5f0Var = (x5f0) this.j;
                int i2 = x5f0.z0;
                p7m0 p7m0Var2 = x5f0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, u4f0.a((u4f0) value2, false, false, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, 1073741822)));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ocf0 ocf0Var = (ocf0) this.j;
                int i3 = ocf0.z0;
                p7m0 p7m0Var3 = ocf0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, mbf0.a((mbf0) value3, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 1073741822)));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((iph0) this.j).E);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((irh0) this.j).E);
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((zuh0) this.j).J);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((ldi0) this.j).D);
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                uri0 uri0Var = (uri0) this.j;
                v3c.N(uri0Var.B);
                v3c.N(uri0Var.A);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                fdk0 fdk0Var = (fdk0) this.j;
                int i4 = fdk0.y;
                p7m0 p7m0Var4 = fdk0Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    cdk0Var = (cdk0) value4;
                } while (!p7m0Var4.m(value4, cdk0.a(cdk0Var, null, null, null, false, cdk0Var.c.length() > 0, null, false, 26623)));
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                tpk0 tpk0Var = (tpk0) this.j;
                IntRange intRange = tpk0.Z;
                p7m0 p7m0Var5 = tpk0Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                } while (!p7m0Var5.m(value5, jpk0.a((jpk0) value5, null, null, null, 0L, null, false, 2015)));
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                tam0 tam0Var = (tam0) this.j;
                tam0Var.b.e("statistic_items_key", tam0.w(tam0Var.n));
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                mkn0 mkn0Var = (mkn0) this.j;
                v3c.N(mkn0Var.A);
                v3c.N(mkn0Var.B);
                v3c.N(mkn0Var.D);
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                arn0 arn0Var = (arn0) this.j;
                v3c.N(arn0Var.x);
                v3c.N(arn0Var.w);
                v3c.N(arn0Var.y);
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                zyn0 zyn0Var = (zyn0) this.j;
                int i5 = zyn0.u0;
                v3c.N(zyn0Var.p0);
                v3c.N(zyn0Var.r0);
                v3c.N(zyn0Var.q0);
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                v3c.N(((urp0) this.j).v);
                return Unit.f46060a;
            case 15:
                Object obj2 = this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                return obj2;
            default:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                dyu0 dyu0Var = (dyu0) this.j;
                int i6 = dyu0.O;
                p7m0 p7m0Var6 = dyu0Var.i.f25029a;
                do {
                    value6 = p7m0Var6.getValue();
                    value6.getClass();
                    txu0Var = (txu0) value6;
                    fwu0Var = txu0Var.e;
                } while (!p7m0Var6.m(value6, txu0.a(txu0Var, null, false, null, new fwu0(fwu0Var.f10278a, fwu0Var.b, true), null, false, false, 0.0d, 431)));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sye0(int i, yje yjeVar) {
        super(i, yjeVar);
        this.i = (byte) 15;
    }
}
