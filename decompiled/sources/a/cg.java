package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cg implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4288a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cg(int i, int i2, long j, mm40 mm40Var, String str, Function0 function0) {
        this.f4288a = (byte) 1;
        this.b = mm40Var;
        this.c = i;
        this.d = str;
        this.e = j;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4288a;
        int i = this.c;
        Object obj3 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                nia0.b(this.e, (String) obj5, (pm80) obj4, (mm40) obj3, (fet) obj, iL);
                break;
            case 1:
                Function0 function0 = (Function0) obj4;
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(385);
                int i2 = this.c;
                long j = this.e;
                jjj.b(i2, iL2, j, (fet) obj, (mm40) obj3, (String) obj5, function0);
                break;
            case 2:
                Boolean bool = Boolean.TRUE;
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                n4c.a((mm40) obj3, this.e, (o0x) obj5, (pm80) obj4, bool, bool, (fet) obj, iL3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iL4 = x8x.L(i | 1);
                qbc.a((mm40) obj3, this.e, (String) obj5, (Function1) obj4, (fet) obj, iL4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iL5 = x8x.L(1);
                vdb.c((mm40) obj3, (m0x) obj4, this.c, this.e, (String) obj5, (fet) obj, iL5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iL6 = x8x.L(1 | i);
                z5n.m((mm40) obj3, (Integer) obj5, this.e, (ope) obj4, (fet) obj, iL6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iL7 = x8x.L(i | 1);
                xcm0.d((String) obj5, this.e, (xdr) obj4, (xdr) obj3, (fet) obj, iL7);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL8 = x8x.L(i | 1);
                cvm0.f((ywv0) obj5, (lsv0) obj4, this.e, (Function0) obj3, (fet) obj, iL8);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cg(long j, String str, pm80 pm80Var, mm40 mm40Var, int i) {
        this.f4288a = (byte) 0;
        this.e = j;
        this.d = str;
        this.f = pm80Var;
        this.b = mm40Var;
        this.c = i;
    }

    public /* synthetic */ cg(mm40 mm40Var, long j, Object obj, Object obj2, int i, byte b) {
        this.f4288a = b;
        this.b = mm40Var;
        this.e = j;
        this.d = obj;
        this.f = obj2;
        this.c = i;
    }

    public /* synthetic */ cg(mm40 mm40Var, m0x m0xVar, int i, long j, String str, int i2) {
        this.f4288a = (byte) 4;
        this.b = mm40Var;
        this.f = m0xVar;
        this.c = i;
        this.e = j;
        this.d = str;
    }

    public /* synthetic */ cg(mm40 mm40Var, Integer num, long j, ope opeVar, int i) {
        this.f4288a = (byte) 5;
        this.b = mm40Var;
        this.d = num;
        this.e = j;
        this.f = opeVar;
        this.c = i;
    }

    public /* synthetic */ cg(ywv0 ywv0Var, lsv0 lsv0Var, long j, Function0 function0, int i) {
        this.f4288a = (byte) 7;
        this.d = ywv0Var;
        this.f = lsv0Var;
        this.e = j;
        this.b = function0;
        this.c = i;
    }

    public /* synthetic */ cg(String str, long j, xdr xdrVar, xdr xdrVar2, int i) {
        this.f4288a = (byte) 6;
        this.d = str;
        this.e = j;
        this.f = xdrVar;
        this.b = xdrVar2;
        this.c = i;
    }
}
