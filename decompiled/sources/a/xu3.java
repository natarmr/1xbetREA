package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class xu3 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41490a;
    public final /* synthetic */ p6d b;

    public /* synthetic */ xu3(p6d p6dVar, byte b) {
        this.f41490a = b;
        this.b = p6dVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0193  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:137:0x020f  */
    /* JADX WARN: Code duplicated, block: B:153:0x024c  */
    /* JADX WARN: Code duplicated, block: B:169:0x028b  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x0118  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        vu3 vu3Var;
        qhs qhsVar;
        owt owtVar;
        hl00 hl00Var;
        ol00 ol00Var;
        qr60 qr60Var;
        xr60 xr60Var;
        yu60 yu60Var;
        xx60 xx60Var;
        b8n0 b8n0Var;
        e8n0 e8n0Var;
        byte b = this.f41490a;
        byte b2 = 14;
        byte b3 = 3;
        p6d p6dVar = this.b;
        byte b4 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof vu3) {
                    vu3Var = (vu3) yjeVar;
                    int i = vu3Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        vu3Var.j = i - Integer.MIN_VALUE;
                    } else {
                        vu3Var = new vu3(this, yjeVar);
                    }
                } else {
                    vu3Var = new vu3(this, yjeVar);
                }
                Object obj = vu3Var.i;
                wne wneVar = wne.f39444a;
                int i2 = vu3Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    qo3 qo3Var = new qo3(kmqVar, b3);
                    vu3Var.j = 1;
                    if (p6dVar.c(qo3Var, vu3Var) == wneVar) {
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
            case 1:
                if (yjeVar instanceof qhs) {
                    qhsVar = (qhs) yjeVar;
                    int i3 = qhsVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qhsVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        qhsVar = new qhs(this, yjeVar);
                    }
                } else {
                    qhsVar = new qhs(this, yjeVar);
                }
                Object obj2 = qhsVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = qhsVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    uap uapVar = new uap(kmqVar, (byte) 16);
                    qhsVar.j = 1;
                    if (p6dVar.c(uapVar, qhsVar) == wneVar2) {
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
            case 2:
                if (yjeVar instanceof owt) {
                    owtVar = (owt) yjeVar;
                    int i5 = owtVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        owtVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        owtVar = new owt(this, yjeVar);
                    }
                } else {
                    owtVar = new owt(this, yjeVar);
                }
                Object obj3 = owtVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = owtVar.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    tnt tntVar = new tnt(kmqVar, b2);
                    owtVar.j = 1;
                    if (p6dVar.c(tntVar, owtVar) == wneVar3) {
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
            case 3:
                if (yjeVar instanceof hl00) {
                    hl00Var = (hl00) yjeVar;
                    int i7 = hl00Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        hl00Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        hl00Var = new hl00(this, yjeVar);
                    }
                } else {
                    hl00Var = new hl00(this, yjeVar);
                }
                Object obj4 = hl00Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = hl00Var.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    b4v b4vVar = new b4v(kmqVar, b2);
                    hl00Var.j = 1;
                    if (p6dVar.c(b4vVar, hl00Var) == wneVar4) {
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
            case 4:
                if (yjeVar instanceof ol00) {
                    ol00Var = (ol00) yjeVar;
                    int i9 = ol00Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        ol00Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        ol00Var = new ol00(this, yjeVar);
                    }
                } else {
                    ol00Var = new ol00(this, yjeVar);
                }
                Object obj5 = ol00Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = ol00Var.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    b4v b4vVar2 = new b4v(kmqVar, (byte) 15);
                    ol00Var.j = 1;
                    if (p6dVar.c(b4vVar2, ol00Var) == wneVar5) {
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
            case 5:
                if (yjeVar instanceof qr60) {
                    qr60Var = (qr60) yjeVar;
                    int i11 = qr60Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        qr60Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        qr60Var = new qr60(this, yjeVar);
                    }
                } else {
                    qr60Var = new qr60(this, yjeVar);
                }
                Object obj6 = qr60Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = qr60Var.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    ld60 ld60Var = new ld60(kmqVar, (byte) 2);
                    qr60Var.j = 1;
                    if (p6dVar.c(ld60Var, qr60Var) == wneVar6) {
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
            case 6:
                if (yjeVar instanceof xr60) {
                    xr60Var = (xr60) yjeVar;
                    int i13 = xr60Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        xr60Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        xr60Var = new xr60(this, yjeVar);
                    }
                } else {
                    xr60Var = new xr60(this, yjeVar);
                }
                Object obj7 = xr60Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = xr60Var.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    ld60 ld60Var2 = new ld60(kmqVar, b3);
                    xr60Var.j = 1;
                    if (p6dVar.c(ld60Var2, xr60Var) == wneVar7) {
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
            case 7:
                if (yjeVar instanceof yu60) {
                    yu60Var = (yu60) yjeVar;
                    int i15 = yu60Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        yu60Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        yu60Var = new yu60(this, yjeVar);
                    }
                } else {
                    yu60Var = new yu60(this, yjeVar);
                }
                Object obj8 = yu60Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = yu60Var.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    ld60 ld60Var3 = new ld60(kmqVar, (byte) 4);
                    yu60Var.j = 1;
                    if (p6dVar.c(ld60Var3, yu60Var) == wneVar8) {
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
            case 8:
                if (yjeVar instanceof xx60) {
                    xx60Var = (xx60) yjeVar;
                    int i17 = xx60Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        xx60Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        xx60Var = new xx60(this, yjeVar);
                    }
                } else {
                    xx60Var = new xx60(this, yjeVar);
                }
                Object obj9 = xx60Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = xx60Var.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    ld60 ld60Var4 = new ld60(kmqVar, (byte) 5);
                    xx60Var.j = 1;
                    if (p6dVar.c(ld60Var4, xx60Var) == wneVar9) {
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
            case 9:
                if (yjeVar instanceof b8n0) {
                    b8n0Var = (b8n0) yjeVar;
                    int i19 = b8n0Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        b8n0Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        b8n0Var = new b8n0(this, yjeVar);
                    }
                } else {
                    b8n0Var = new b8n0(this, yjeVar);
                }
                Object obj10 = b8n0Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = b8n0Var.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    d8n0 d8n0Var = new d8n0(kmqVar, (byte) 0);
                    b8n0Var.j = 1;
                    if (p6dVar.c(d8n0Var, b8n0Var) == wneVar10) {
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
                if (yjeVar instanceof e8n0) {
                    e8n0Var = (e8n0) yjeVar;
                    int i21 = e8n0Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        e8n0Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        e8n0Var = new e8n0(this, yjeVar);
                    }
                } else {
                    e8n0Var = new e8n0(this, yjeVar);
                }
                Object obj11 = e8n0Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = e8n0Var.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    d8n0 d8n0Var2 = new d8n0(kmqVar, b4);
                    e8n0Var.j = 1;
                    if (p6dVar.c(d8n0Var2, e8n0Var) == wneVar11) {
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
