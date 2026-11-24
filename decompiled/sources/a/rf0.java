package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class rf0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30362a;
    public final /* synthetic */ fnq b;

    public /* synthetic */ rf0(fnq fnqVar, byte b) {
        this.f30362a = b;
        this.b = fnqVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0196  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x0212  */
    /* JADX WARN: Code duplicated, block: B:158:0x0262  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:190:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:206:0x031c  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:89:0x0157  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        pf0 pf0Var;
        ct4 ct4Var;
        vj6 vj6Var;
        e2b e2bVar;
        hvs hvsVar;
        rq10 rq10Var;
        jt10 jt10Var;
        w260 w260Var;
        k270 k270Var;
        fbb0 fbb0Var;
        a7f0 a7f0Var;
        oco0 oco0Var;
        igv0 igv0Var;
        byte b = this.f30362a;
        byte b2 = 18;
        byte b3 = 15;
        fnq fnqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof pf0) {
                    pf0Var = (pf0) yjeVar;
                    int i = pf0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        pf0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        pf0Var = new pf0(this, yjeVar);
                    }
                } else {
                    pf0Var = new pf0(this, yjeVar);
                }
                Object obj = pf0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = pf0Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    ua uaVar = new ua(kmqVar, (byte) 9);
                    pf0Var.j = 1;
                    if (fnqVar.c(uaVar, pf0Var) == wneVar) {
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
                if (yjeVar instanceof ct4) {
                    ct4Var = (ct4) yjeVar;
                    int i3 = ct4Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ct4Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        ct4Var = new ct4(this, yjeVar);
                    }
                } else {
                    ct4Var = new ct4(this, yjeVar);
                }
                Object obj2 = ct4Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = ct4Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    qo3 qo3Var = new qo3(kmqVar, (byte) 10);
                    ct4Var.j = 1;
                    if (fnqVar.c(qo3Var, ct4Var) == wneVar2) {
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
                if (yjeVar instanceof vj6) {
                    vj6Var = (vj6) yjeVar;
                    int i5 = vj6Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        vj6Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        vj6Var = new vj6(this, yjeVar);
                    }
                } else {
                    vj6Var = new vj6(this, yjeVar);
                }
                Object obj3 = vj6Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = vj6Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    qo3 qo3Var2 = new qo3(kmqVar, b3);
                    vj6Var.j = 1;
                    if (fnqVar.c(qo3Var2, vj6Var) == wneVar3) {
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
                if (yjeVar instanceof e2b) {
                    e2bVar = (e2b) yjeVar;
                    int i7 = e2bVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        e2bVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        e2bVar = new e2b(this, yjeVar);
                    }
                } else {
                    e2bVar = new e2b(this, yjeVar);
                }
                Object obj4 = e2bVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = e2bVar.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    osa osaVar = new osa(kmqVar, (byte) 2);
                    e2bVar.j = 1;
                    if (fnqVar.c(osaVar, e2bVar) == wneVar4) {
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
                Object objC = fnqVar.c(new osa(kmqVar, b2), yjeVar);
                return objC == wne.f39444a ? objC : Unit.f46060a;
            case 5:
                if (yjeVar instanceof hvs) {
                    hvsVar = (hvs) yjeVar;
                    int i9 = hvsVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        hvsVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        hvsVar = new hvs(this, yjeVar);
                    }
                } else {
                    hvsVar = new hvs(this, yjeVar);
                }
                Object obj5 = hvsVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = hvsVar.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    uap uapVar = new uap(kmqVar, (byte) 20);
                    hvsVar.j = 1;
                    if (fnqVar.c(uapVar, hvsVar) == wneVar5) {
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
                if (yjeVar instanceof rq10) {
                    rq10Var = (rq10) yjeVar;
                    int i11 = rq10Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        rq10Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        rq10Var = new rq10(this, yjeVar);
                    }
                } else {
                    rq10Var = new rq10(this, yjeVar);
                }
                Object obj6 = rq10Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = rq10Var.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    b4v b4vVar = new b4v(kmqVar, b2);
                    rq10Var.j = 1;
                    if (fnqVar.c(b4vVar, rq10Var) == wneVar6) {
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
                if (yjeVar instanceof jt10) {
                    jt10Var = (jt10) yjeVar;
                    int i13 = jt10Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        jt10Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        jt10Var = new jt10(this, yjeVar);
                    }
                } else {
                    jt10Var = new jt10(this, yjeVar);
                }
                Object obj7 = jt10Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = jt10Var.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    b4v b4vVar2 = new b4v(kmqVar, (byte) 19);
                    jt10Var.j = 1;
                    if (fnqVar.c(b4vVar2, jt10Var) == wneVar7) {
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
                if (yjeVar instanceof w260) {
                    w260Var = (w260) yjeVar;
                    int i15 = w260Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        w260Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        w260Var = new w260(this, yjeVar);
                    }
                } else {
                    w260Var = new w260(this, yjeVar);
                }
                Object obj8 = w260Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = w260Var.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    nr30 nr30Var = new nr30(kmqVar, (byte) 16);
                    w260Var.j = 1;
                    if (fnqVar.c(nr30Var, w260Var) == wneVar8) {
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
                if (yjeVar instanceof k270) {
                    k270Var = (k270) yjeVar;
                    int i17 = k270Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        k270Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        k270Var = new k270(this, yjeVar);
                    }
                } else {
                    k270Var = new k270(this, yjeVar);
                }
                Object obj9 = k270Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = k270Var.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    ld60 ld60Var = new ld60(kmqVar, (byte) 6);
                    k270Var.j = 1;
                    if (fnqVar.c(ld60Var, k270Var) == wneVar9) {
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
                if (yjeVar instanceof fbb0) {
                    fbb0Var = (fbb0) yjeVar;
                    int i19 = fbb0Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        fbb0Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        fbb0Var = new fbb0(this, yjeVar);
                    }
                } else {
                    fbb0Var = new fbb0(this, yjeVar);
                }
                Object obj10 = fbb0Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = fbb0Var.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    hbb0 hbb0Var = new hbb0(kmqVar, (byte) 0);
                    fbb0Var.j = 1;
                    if (fnqVar.c(hbb0Var, fbb0Var) == wneVar10) {
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
            case 11:
                if (yjeVar instanceof a7f0) {
                    a7f0Var = (a7f0) yjeVar;
                    int i21 = a7f0Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        a7f0Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        a7f0Var = new a7f0(this, yjeVar);
                    }
                } else {
                    a7f0Var = new a7f0(this, yjeVar);
                }
                Object obj11 = a7f0Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = a7f0Var.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    hbb0 hbb0Var2 = new hbb0(kmqVar, b3);
                    a7f0Var.j = 1;
                    if (fnqVar.c(hbb0Var2, a7f0Var) == wneVar11) {
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
            case 12:
                if (yjeVar instanceof oco0) {
                    oco0Var = (oco0) yjeVar;
                    int i23 = oco0Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        oco0Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        oco0Var = new oco0(this, yjeVar);
                    }
                } else {
                    oco0Var = new oco0(this, yjeVar);
                }
                Object obj12 = oco0Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = oco0Var.j;
                if (i24 == 0) {
                    z1x.P(obj12);
                    d8n0 d8n0Var = new d8n0(kmqVar, (byte) 11);
                    oco0Var.j = 1;
                    if (fnqVar.c(d8n0Var, oco0Var) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (i24 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj12);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof igv0) {
                    igv0Var = (igv0) yjeVar;
                    int i25 = igv0Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        igv0Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        igv0Var = new igv0(this, yjeVar);
                    }
                } else {
                    igv0Var = new igv0(this, yjeVar);
                }
                Object obj13 = igv0Var.i;
                wne wneVar13 = wne.f39444a;
                int i26 = igv0Var.j;
                if (i26 == 0) {
                    z1x.P(obj13);
                    ofv0 ofv0Var = new ofv0(kmqVar, (byte) 1);
                    igv0Var.j = 1;
                    if (fnqVar.c(ofv0Var, igv0Var) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (i26 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj13);
                }
                return Unit.f46060a;
        }
    }
}
