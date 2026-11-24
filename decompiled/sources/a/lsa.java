package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class lsa implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20568a;
    public final /* synthetic */ utb b;

    public /* synthetic */ lsa(utb utbVar, byte b) {
        this.f20568a = b;
        this.b = utbVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0196  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x0214  */
    /* JADX WARN: Code duplicated, block: B:153:0x0251  */
    /* JADX WARN: Code duplicated, block: B:169:0x028f  */
    /* JADX WARN: Code duplicated, block: B:185:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:201:0x030a  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0159  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        jsa jsaVar;
        msa msaVar;
        rsa rsaVar;
        vvf vvfVar;
        hyu hyuVar;
        w0v w0vVar;
        sb60 sb60Var;
        tc60 tc60Var;
        vc60 vc60Var;
        h4g0 h4g0Var;
        upl0 upl0Var;
        odn0 odn0Var;
        sen0 sen0Var;
        byte b = this.f20568a;
        byte b2 = 25;
        utb utbVar = this.b;
        byte b3 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof jsa) {
                    jsaVar = (jsa) yjeVar;
                    int i = jsaVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jsaVar.j = i - Integer.MIN_VALUE;
                    } else {
                        jsaVar = new jsa(this, yjeVar);
                    }
                } else {
                    jsaVar = new jsa(this, yjeVar);
                }
                Object obj = jsaVar.i;
                wne wneVar = wne.f39444a;
                int i2 = jsaVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    qo3 qo3Var = new qo3(kmqVar, (byte) 29);
                    jsaVar.j = 1;
                    if (utbVar.c(qo3Var, jsaVar) == wneVar) {
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
                if (yjeVar instanceof msa) {
                    msaVar = (msa) yjeVar;
                    int i3 = msaVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        msaVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        msaVar = new msa(this, yjeVar);
                    }
                } else {
                    msaVar = new msa(this, yjeVar);
                }
                Object obj2 = msaVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = msaVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    osa osaVar = new osa(kmqVar, (byte) 0);
                    msaVar.j = 1;
                    if (utbVar.c(osaVar, msaVar) == wneVar2) {
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
                if (yjeVar instanceof rsa) {
                    rsaVar = (rsa) yjeVar;
                    int i5 = rsaVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rsaVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        rsaVar = new rsa(this, yjeVar);
                    }
                } else {
                    rsaVar = new rsa(this, yjeVar);
                }
                Object obj3 = rsaVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = rsaVar.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    osa osaVar2 = new osa(kmqVar, b3);
                    rsaVar.j = 1;
                    if (utbVar.c(osaVar2, rsaVar) == wneVar3) {
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
                if (yjeVar instanceof vvf) {
                    vvfVar = (vvf) yjeVar;
                    int i7 = vvfVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        vvfVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        vvfVar = new vvf(this, yjeVar);
                    }
                } else {
                    vvfVar = new vvf(this, yjeVar);
                }
                Object obj4 = vvfVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = vvfVar.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    k0f k0fVar = new k0f(kmqVar, (byte) 7);
                    vvfVar.j = 1;
                    if (utbVar.c(k0fVar, vvfVar) == wneVar4) {
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
                if (yjeVar instanceof hyu) {
                    hyuVar = (hyu) yjeVar;
                    int i9 = hyuVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        hyuVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        hyuVar = new hyu(this, yjeVar);
                    }
                } else {
                    hyuVar = new hyu(this, yjeVar);
                }
                Object obj5 = hyuVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = hyuVar.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    y6u y6uVar = new y6u(kmqVar, b2);
                    hyuVar.j = 1;
                    if (utbVar.c(y6uVar, hyuVar) == wneVar5) {
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
                if (yjeVar instanceof w0v) {
                    w0vVar = (w0v) yjeVar;
                    int i11 = w0vVar.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        w0vVar.j = i11 - Integer.MIN_VALUE;
                    } else {
                        w0vVar = new w0v(this, yjeVar);
                    }
                } else {
                    w0vVar = new w0v(this, yjeVar);
                }
                Object obj6 = w0vVar.i;
                wne wneVar6 = wne.f39444a;
                int i12 = w0vVar.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    y6u y6uVar2 = new y6u(kmqVar, (byte) 28);
                    w0vVar.j = 1;
                    if (utbVar.c(y6uVar2, w0vVar) == wneVar6) {
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
                if (yjeVar instanceof sb60) {
                    sb60Var = (sb60) yjeVar;
                    int i13 = sb60Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        sb60Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        sb60Var = new sb60(this, yjeVar);
                    }
                } else {
                    sb60Var = new sb60(this, yjeVar);
                }
                Object obj7 = sb60Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = sb60Var.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    nr30 nr30Var = new nr30(kmqVar, (byte) 20);
                    sb60Var.j = 1;
                    if (utbVar.c(nr30Var, sb60Var) == wneVar7) {
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
                if (yjeVar instanceof tc60) {
                    tc60Var = (tc60) yjeVar;
                    int i15 = tc60Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        tc60Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        tc60Var = new tc60(this, yjeVar);
                    }
                } else {
                    tc60Var = new tc60(this, yjeVar);
                }
                Object obj8 = tc60Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = tc60Var.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    nr30 nr30Var2 = new nr30(kmqVar, b2);
                    tc60Var.j = 1;
                    if (utbVar.c(nr30Var2, tc60Var) == wneVar8) {
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
                if (yjeVar instanceof vc60) {
                    vc60Var = (vc60) yjeVar;
                    int i17 = vc60Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        vc60Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        vc60Var = new vc60(this, yjeVar);
                    }
                } else {
                    vc60Var = new vc60(this, yjeVar);
                }
                Object obj9 = vc60Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = vc60Var.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    nr30 nr30Var3 = new nr30(kmqVar, (byte) 26);
                    vc60Var.j = 1;
                    if (utbVar.c(nr30Var3, vc60Var) == wneVar9) {
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
                if (yjeVar instanceof h4g0) {
                    h4g0Var = (h4g0) yjeVar;
                    int i19 = h4g0Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        h4g0Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        h4g0Var = new h4g0(this, yjeVar);
                    }
                } else {
                    h4g0Var = new h4g0(this, yjeVar);
                }
                Object obj10 = h4g0Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = h4g0Var.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    hbb0 hbb0Var = new hbb0(kmqVar, (byte) 21);
                    h4g0Var.j = 1;
                    if (utbVar.c(hbb0Var, h4g0Var) == wneVar10) {
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
            case 10:
                if (yjeVar instanceof upl0) {
                    upl0Var = (upl0) yjeVar;
                    int i21 = upl0Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        upl0Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        upl0Var = new upl0(this, yjeVar);
                    }
                } else {
                    upl0Var = new upl0(this, yjeVar);
                }
                Object obj11 = upl0Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = upl0Var.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    r5j0 r5j0Var = new r5j0(kmqVar, (byte) 27);
                    upl0Var.j = 1;
                    if (utbVar.c(r5j0Var, upl0Var) == wneVar11) {
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
            case 11:
                if (yjeVar instanceof odn0) {
                    odn0Var = (odn0) yjeVar;
                    int i23 = odn0Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        odn0Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        odn0Var = new odn0(this, yjeVar);
                    }
                } else {
                    odn0Var = new odn0(this, yjeVar);
                }
                Object obj12 = odn0Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = odn0Var.j;
                if (i24 == 0) {
                    z1x.P(obj12);
                    d8n0 d8n0Var = new d8n0(kmqVar, (byte) 4);
                    odn0Var.j = 1;
                    if (utbVar.c(d8n0Var, odn0Var) == wneVar12) {
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
                if (yjeVar instanceof sen0) {
                    sen0Var = (sen0) yjeVar;
                    int i25 = sen0Var.j;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        sen0Var.j = i25 - Integer.MIN_VALUE;
                    } else {
                        sen0Var = new sen0(this, yjeVar);
                    }
                } else {
                    sen0Var = new sen0(this, yjeVar);
                }
                Object obj13 = sen0Var.i;
                wne wneVar13 = wne.f39444a;
                int i26 = sen0Var.j;
                if (i26 == 0) {
                    z1x.P(obj13);
                    d8n0 d8n0Var2 = new d8n0(kmqVar, (byte) 5);
                    sen0Var.j = 1;
                    if (utbVar.c(d8n0Var2, sen0Var) == wneVar13) {
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
