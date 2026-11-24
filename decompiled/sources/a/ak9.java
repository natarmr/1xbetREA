package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ak9 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1011a;
    public final /* synthetic */ vsg0 b;

    public /* synthetic */ ak9(vsg0 vsg0Var, byte b) {
        this.f1011a = b;
        this.b = vsg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0196  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x0214  */
    /* JADX WARN: Code duplicated, block: B:153:0x0251  */
    /* JADX WARN: Code duplicated, block: B:169:0x0290  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0158  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) throws Throwable {
        t1d t1dVar;
        jiu jiuVar;
        b0v b0vVar;
        r3v r3vVar;
        x210 x210Var;
        ga40 ga40Var;
        uk40 uk40Var;
        yc60 yc60Var;
        ad60 ad60Var;
        fxd0 fxd0Var;
        qzt0 qzt0Var;
        byte b = this.f1011a;
        byte b2 = 27;
        vsg0 vsg0Var = this.b;
        switch (b) {
            case 0:
                Object objC = vsg0Var.c(new qo3(kmqVar, (byte) 25), yjeVar);
                return objC == wne.f39444a ? objC : Unit.f46060a;
            case 1:
                if (yjeVar instanceof t1d) {
                    t1dVar = (t1d) yjeVar;
                    int i = t1dVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        t1dVar.j = i - Integer.MIN_VALUE;
                    } else {
                        t1dVar = new t1d(this, yjeVar);
                    }
                } else {
                    t1dVar = new t1d(this, yjeVar);
                }
                Object obj = t1dVar.i;
                wne wneVar = wne.f39444a;
                int i2 = t1dVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    osa osaVar = new osa(kmqVar, (byte) 12);
                    t1dVar.j = 1;
                    if (vsg0Var.c(osaVar, t1dVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                if (yjeVar instanceof jiu) {
                    jiuVar = (jiu) yjeVar;
                    int i3 = jiuVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        jiuVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        jiuVar = new jiu(this, yjeVar);
                    }
                } else {
                    jiuVar = new jiu(this, yjeVar);
                }
                Object obj2 = jiuVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = jiuVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    y6u y6uVar = new y6u(kmqVar, (byte) 8);
                    jiuVar.j = 1;
                    if (vsg0Var.c(y6uVar, jiuVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 3:
                if (yjeVar instanceof b0v) {
                    b0vVar = (b0v) yjeVar;
                    int i5 = b0vVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        b0vVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        b0vVar = new b0v(this, yjeVar);
                    }
                } else {
                    b0vVar = new b0v(this, yjeVar);
                }
                Object obj3 = b0vVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = b0vVar.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    y6u y6uVar2 = new y6u(kmqVar, b2);
                    b0vVar.j = 1;
                    if (vsg0Var.c(y6uVar2, b0vVar) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 4:
                if (yjeVar instanceof r3v) {
                    r3vVar = (r3v) yjeVar;
                    int i7 = r3vVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        r3vVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        r3vVar = new r3v(this, yjeVar);
                    }
                } else {
                    r3vVar = new r3v(this, yjeVar);
                }
                Object obj4 = r3vVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = r3vVar.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    y6u y6uVar3 = new y6u(kmqVar, (byte) 29);
                    r3vVar.j = 1;
                    if (vsg0Var.c(y6uVar3, r3vVar) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            case 5:
                if (yjeVar instanceof x210) {
                    x210Var = (x210) yjeVar;
                    int i9 = x210Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        x210Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        x210Var = new x210(this, yjeVar);
                    }
                } else {
                    x210Var = new x210(this, yjeVar);
                }
                Object obj5 = x210Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = x210Var.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    b4v b4vVar = new b4v(kmqVar, (byte) 17);
                    x210Var.j = 1;
                    if (vsg0Var.c(b4vVar, x210Var) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
            case 6:
                if (yjeVar instanceof ga40) {
                    ga40Var = (ga40) yjeVar;
                    int i11 = ga40Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        ga40Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        ga40Var = new ga40(this, yjeVar);
                    }
                } else {
                    ga40Var = new ga40(this, yjeVar);
                }
                Object obj6 = ga40Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = ga40Var.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    nr30 nr30Var = new nr30(kmqVar, (byte) 3);
                    ga40Var.j = 1;
                    if (vsg0Var.c(nr30Var, ga40Var) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            case 7:
                if (yjeVar instanceof uk40) {
                    uk40Var = (uk40) yjeVar;
                    int i13 = uk40Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        uk40Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        uk40Var = new uk40(this, yjeVar);
                    }
                } else {
                    uk40Var = new uk40(this, yjeVar);
                }
                Object obj7 = uk40Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = uk40Var.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    nr30 nr30Var2 = new nr30(kmqVar, (byte) 6);
                    uk40Var.j = 1;
                    if (vsg0Var.c(nr30Var2, uk40Var) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (i14 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
            case 8:
                if (yjeVar instanceof yc60) {
                    yc60Var = (yc60) yjeVar;
                    int i15 = yc60Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        yc60Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        yc60Var = new yc60(this, yjeVar);
                    }
                } else {
                    yc60Var = new yc60(this, yjeVar);
                }
                Object obj8 = yc60Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = yc60Var.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    nr30 nr30Var3 = new nr30(kmqVar, b2);
                    yc60Var.j = 1;
                    if (vsg0Var.c(nr30Var3, yc60Var) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (i16 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj8);
                }
                return Unit.f46060a;
            case 9:
                if (yjeVar instanceof ad60) {
                    ad60Var = (ad60) yjeVar;
                    int i17 = ad60Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        ad60Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        ad60Var = new ad60(this, yjeVar);
                    }
                } else {
                    ad60Var = new ad60(this, yjeVar);
                }
                Object obj9 = ad60Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = ad60Var.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    nr30 nr30Var4 = new nr30(kmqVar, (byte) 28);
                    ad60Var.j = 1;
                    if (vsg0Var.c(nr30Var4, ad60Var) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (i18 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj9);
                }
                return Unit.f46060a;
            case 10:
                if (yjeVar instanceof fxd0) {
                    fxd0Var = (fxd0) yjeVar;
                    int i19 = fxd0Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        fxd0Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        fxd0Var = new fxd0(this, yjeVar);
                    }
                } else {
                    fxd0Var = new fxd0(this, yjeVar);
                }
                Object obj10 = fxd0Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = fxd0Var.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    hbb0 hbb0Var = new hbb0(kmqVar, (byte) 9);
                    fxd0Var.j = 1;
                    if (vsg0Var.c(hbb0Var, fxd0Var) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (i20 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj10);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof qzt0) {
                    qzt0Var = (qzt0) yjeVar;
                    int i21 = qzt0Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        qzt0Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        qzt0Var = new qzt0(this, yjeVar);
                    }
                } else {
                    qzt0Var = new qzt0(this, yjeVar);
                }
                Object obj11 = qzt0Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = qzt0Var.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    d8n0 d8n0Var = new d8n0(kmqVar, (byte) 26);
                    qzt0Var.j = 1;
                    if (vsg0Var.c(d8n0Var, qzt0Var) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (i22 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj11);
                }
                return Unit.f46060a;
        }
    }
}
