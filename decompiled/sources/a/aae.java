package a;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class aae extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ fae k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aae(fae faeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = faeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fae faeVar = this.k;
        switch (b) {
            case 0:
                aae aaeVar = new aae(faeVar, yjeVar, (byte) 0);
                aaeVar.j = obj;
                return aaeVar;
            case 1:
                aae aaeVar2 = new aae(faeVar, yjeVar, (byte) 1);
                aaeVar2.j = obj;
                return aaeVar2;
            case 2:
                aae aaeVar3 = new aae(faeVar, yjeVar, (byte) 2);
                aaeVar3.j = obj;
                return aaeVar3;
            case 3:
                aae aaeVar4 = new aae(faeVar, yjeVar, (byte) 3);
                aaeVar4.j = obj;
                return aaeVar4;
            case 4:
                aae aaeVar5 = new aae(faeVar, yjeVar, (byte) 4);
                aaeVar5.j = obj;
                return aaeVar5;
            case 5:
                aae aaeVar6 = new aae(faeVar, yjeVar, (byte) 5);
                aaeVar6.j = obj;
                return aaeVar6;
            case 6:
                aae aaeVar7 = new aae(faeVar, yjeVar, (byte) 6);
                aaeVar7.j = obj;
                return aaeVar7;
            case 7:
                aae aaeVar8 = new aae(faeVar, yjeVar, (byte) 7);
                aaeVar8.j = obj;
                return aaeVar8;
            case 8:
                aae aaeVar9 = new aae(faeVar, yjeVar, (byte) 8);
                aaeVar9.j = obj;
                return aaeVar9;
            default:
                aae aaeVar10 = new aae(faeVar, yjeVar, (byte) 9);
                aaeVar10.j = obj;
                return aaeVar10;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((aae) create((f9e) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((aae) create((gxb) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((aae) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((aae) create((kxb) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((aae) create((a640) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((aae) create((sv80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((aae) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((aae) create((v9k0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((aae) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((aae) create((qom0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object z8eVar;
        byte b = this.i;
        byte b2 = 1;
        byte b3 = 2;
        yje yjeVar = null;
        fae faeVar = this.k;
        switch (b) {
            case 0:
                f9e f9eVar = (f9e) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = faeVar.I;
                f9eVar.getClass();
                if (f9eVar instanceof c9e) {
                    z8eVar = new y8e(((c9e) f9eVar).f3957a);
                } else if (f9eVar instanceof d9e) {
                    List<File> list = ((d9e) f9eVar).f5696a;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    for (File file : list) {
                        file.getClass();
                        String absolutePath = file.getAbsolutePath();
                        absolutePath.getClass();
                        arrayList.add(new m14(absolutePath));
                    }
                    z8eVar = new z8e(arrayList);
                } else {
                    if (!f9eVar.equals(e9e.f7417a)) {
                        t9f.b();
                        return null;
                    }
                    z8eVar = a9e.f471a;
                }
                p7m0Var.getClass();
                p7m0Var.o(null, z8eVar);
                return Unit.f46060a;
            case 1:
                gxb gxbVar = (gxb) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                twn.A(gxbVar.b, faeVar.H, null);
                p7m0 p7m0Var2 = faeVar.G;
                vxy vxyVar = gxbVar.j;
                Integer num = new Integer(vxyVar.b ? 0 : Math.max(vxyVar.f38222a - gxbVar.d, 0));
                p7m0Var2.getClass();
                p7m0Var2.o(null, num);
                return Unit.f46060a;
            case 2:
                Throwable th = (Throwable) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                faeVar.y(th);
                return Unit.f46060a;
            case 3:
                kxb kxbVar = (kxb) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                List list2 = kxbVar.f19046a;
                ol60 ol60Var = faeVar.K;
                p7m0 p7m0Var3 = faeVar.J;
                n9e n9eVar = new n9e(kxbVar.b);
                p7m0Var3.getClass();
                p7m0Var3.o(null, n9eVar);
                a640 a640Var = (a640) CollectionsKt.f0(list2);
                int i = kxbVar.c;
                b2 = i == -1 ? (byte) 0 : (byte) 1;
                if (faeVar.N == w9e.f38776a) {
                    faeVar.N = b2 != 0 ? w9e.c : w9e.b;
                }
                if (b2 != 0) {
                    if (a640Var != null) {
                        faeVar.x = a640Var.b();
                    }
                    ol60Var.f(new i9e(i));
                } else if (a640Var != null && (a640Var.d() instanceof w640) && a640Var.a().getTime() > faeVar.y) {
                    faeVar.y = a640Var.a().getTime();
                    faeVar.O = null;
                    ol60Var.f(new g9e(a640Var instanceof r540));
                } else if (a640Var != null && a640Var.b() > faeVar.x) {
                    if (!(a640Var.e() instanceof srt0)) {
                        faeVar.A(false);
                    }
                    a640 a640Var2 = (a640) CollectionsKt.W(list2.size() - 2, list2);
                    int iB = a640Var2 != null ? a640Var2.b() : -1;
                    if (iB == -1 || a640Var.b() - iB <= 3) {
                        ol60Var.f(j9e.f16133a);
                    }
                    faeVar.B.f(o6e.f24730a);
                    faeVar.x = a640Var.b();
                }
                return Unit.f46060a;
            case 4:
                a640 a640Var3 = (a640) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (!(a640Var3.e() instanceof srt0)) {
                    faeVar.B.f(j6e.f15980a);
                }
                return Unit.f46060a;
            case 5:
                sv80 sv80Var = (sv80) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var4 = faeVar.F;
                t9e t9eVar = new t9e(sv80Var);
                p7m0Var4.getClass();
                p7m0Var4.o(null, t9eVar);
                faeVar.A(true);
                return Unit.f46060a;
            case 6:
                Throwable th2 = (Throwable) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                faeVar.y(th2);
                return Unit.f46060a;
            case 7:
                v9k0 v9k0Var = (v9k0) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                fae faeVar2 = this.k;
                p7m0 p7m0Var5 = faeVar2.M;
                e3c.n(faeVar2.S);
                r9e r9eVar = r9e.f30075a;
                if (v9k0Var != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Long l = v9k0Var.b;
                    long jLongValue = jCurrentTimeMillis - (l != null ? l.longValue() : 0L);
                    long j = jLongValue >= 0 ? jLongValue : 0L;
                    long j2 = v9k0Var.f37040a;
                    if (j > j2) {
                        p7m0Var5.getClass();
                        p7m0Var5.o(null, r9eVar);
                    } else {
                        faeVar2.S = sac.T(new dnq(new fnq(e3c.t(2, j2 - j), new zg0(v9k0Var, faeVar2, yjeVar, b3), (byte) 4), new x9e(faeVar2, yjeVar, b2), (byte) 0), d5c.S(jiu0.a(faeVar2), faeVar2.k.f22085a), new d7e(2, faeVar2, fae.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 10));
                    }
                } else {
                    p7m0Var5.getClass();
                    p7m0Var5.o(null, r9eVar);
                }
                return Unit.f46060a;
            case 8:
                Throwable th3 = (Throwable) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                faeVar.y(th3);
                return Unit.f46060a;
            default:
                qom0 qom0Var = (qom0) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                faeVar.E.n(qom0Var);
                return Unit.f46060a;
        }
    }
}
