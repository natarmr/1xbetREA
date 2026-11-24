package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class xp90 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41258a;
    public final /* synthetic */ i89 b;

    public /* synthetic */ xp90(i89 i89Var, byte b) {
        this.f41258a = b;
        this.b = i89Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0197  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x0214  */
    /* JADX WARN: Code duplicated, block: B:153:0x0253  */
    /* JADX WARN: Code duplicated, block: B:169:0x0292  */
    /* JADX WARN: Code duplicated, block: B:185:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x011a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0159  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        vp90 vp90Var;
        q6f0 q6f0Var;
        t6f0 t6f0Var;
        r5g0 r5g0Var;
        pxi0 pxi0Var;
        gdj0 gdj0Var;
        zej0 zej0Var;
        fgj0 fgj0Var;
        ltj0 ltj0Var;
        pxj0 pxj0Var;
        pwp0 pwp0Var;
        ekr0 ekr0Var;
        byte b = this.f41258a;
        i89 i89Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof vp90) {
                    vp90Var = (vp90) yjeVar;
                    int i = vp90Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        vp90Var.j = i - Integer.MIN_VALUE;
                    } else {
                        vp90Var = new vp90(this, yjeVar);
                    }
                } else {
                    vp90Var = new vp90(this, yjeVar);
                }
                Object obj = vp90Var.i;
                wne wneVar = wne.f39444a;
                int i2 = vp90Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    ld60 ld60Var = new ld60(kmqVar, (byte) 18);
                    vp90Var.j = 1;
                    if (i89Var.c(ld60Var, vp90Var) == wneVar) {
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
                if (yjeVar instanceof q6f0) {
                    q6f0Var = (q6f0) yjeVar;
                    int i3 = q6f0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        q6f0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        q6f0Var = new q6f0(this, yjeVar);
                    }
                } else {
                    q6f0Var = new q6f0(this, yjeVar);
                }
                Object obj2 = q6f0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = q6f0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    hbb0 hbb0Var = new hbb0(kmqVar, (byte) 13);
                    q6f0Var.j = 1;
                    if (i89Var.c(hbb0Var, q6f0Var) == wneVar2) {
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
                if (yjeVar instanceof t6f0) {
                    t6f0Var = (t6f0) yjeVar;
                    int i5 = t6f0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        t6f0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        t6f0Var = new t6f0(this, yjeVar);
                    }
                } else {
                    t6f0Var = new t6f0(this, yjeVar);
                }
                Object obj3 = t6f0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = t6f0Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    hbb0 hbb0Var2 = new hbb0(kmqVar, (byte) 14);
                    t6f0Var.j = 1;
                    if (i89Var.c(hbb0Var2, t6f0Var) == wneVar3) {
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
                if (yjeVar instanceof r5g0) {
                    r5g0Var = (r5g0) yjeVar;
                    int i7 = r5g0Var.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        r5g0Var.j = i7 - Integer.MIN_VALUE;
                    } else {
                        r5g0Var = new r5g0(this, yjeVar);
                    }
                } else {
                    r5g0Var = new r5g0(this, yjeVar);
                }
                Object obj4 = r5g0Var.i;
                wne wneVar4 = wne.f39444a;
                int i8 = r5g0Var.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    hbb0 hbb0Var3 = new hbb0(kmqVar, (byte) 22);
                    r5g0Var.j = 1;
                    if (i89Var.c(hbb0Var3, r5g0Var) == wneVar4) {
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
                if (yjeVar instanceof pxi0) {
                    pxi0Var = (pxi0) yjeVar;
                    int i9 = pxi0Var.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        pxi0Var.j = i9 - Integer.MIN_VALUE;
                    } else {
                        pxi0Var = new pxi0(this, yjeVar);
                    }
                } else {
                    pxi0Var = new pxi0(this, yjeVar);
                }
                Object obj5 = pxi0Var.i;
                wne wneVar5 = wne.f39444a;
                int i10 = pxi0Var.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    hbb0 hbb0Var4 = new hbb0(kmqVar, (byte) 28);
                    pxi0Var.j = 1;
                    if (i89Var.c(hbb0Var4, pxi0Var) == wneVar5) {
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
                if (yjeVar instanceof gdj0) {
                    gdj0Var = (gdj0) yjeVar;
                    int i11 = gdj0Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        gdj0Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        gdj0Var = new gdj0(this, yjeVar);
                    }
                } else {
                    gdj0Var = new gdj0(this, yjeVar);
                }
                Object obj6 = gdj0Var.i;
                wne wneVar6 = wne.f39444a;
                int i12 = gdj0Var.j;
                if (i12 == 0) {
                    z1x.P(obj6);
                    r5j0 r5j0Var = new r5j0(kmqVar, (byte) 3);
                    gdj0Var.j = 1;
                    if (i89Var.c(r5j0Var, gdj0Var) == wneVar6) {
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
                if (yjeVar instanceof zej0) {
                    zej0Var = (zej0) yjeVar;
                    int i13 = zej0Var.j;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        zej0Var.j = i13 - Integer.MIN_VALUE;
                    } else {
                        zej0Var = new zej0(this, yjeVar);
                    }
                } else {
                    zej0Var = new zej0(this, yjeVar);
                }
                Object obj7 = zej0Var.i;
                wne wneVar7 = wne.f39444a;
                int i14 = zej0Var.j;
                if (i14 == 0) {
                    z1x.P(obj7);
                    r5j0 r5j0Var2 = new r5j0(kmqVar, (byte) 6);
                    zej0Var.j = 1;
                    if (i89Var.c(r5j0Var2, zej0Var) == wneVar7) {
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
                if (yjeVar instanceof fgj0) {
                    fgj0Var = (fgj0) yjeVar;
                    int i15 = fgj0Var.j;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        fgj0Var.j = i15 - Integer.MIN_VALUE;
                    } else {
                        fgj0Var = new fgj0(this, yjeVar);
                    }
                } else {
                    fgj0Var = new fgj0(this, yjeVar);
                }
                Object obj8 = fgj0Var.i;
                wne wneVar8 = wne.f39444a;
                int i16 = fgj0Var.j;
                if (i16 == 0) {
                    z1x.P(obj8);
                    r5j0 r5j0Var3 = new r5j0(kmqVar, (byte) 9);
                    fgj0Var.j = 1;
                    if (i89Var.c(r5j0Var3, fgj0Var) == wneVar8) {
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
                if (yjeVar instanceof ltj0) {
                    ltj0Var = (ltj0) yjeVar;
                    int i17 = ltj0Var.j;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        ltj0Var.j = i17 - Integer.MIN_VALUE;
                    } else {
                        ltj0Var = new ltj0(this, yjeVar);
                    }
                } else {
                    ltj0Var = new ltj0(this, yjeVar);
                }
                Object obj9 = ltj0Var.i;
                wne wneVar9 = wne.f39444a;
                int i18 = ltj0Var.j;
                if (i18 == 0) {
                    z1x.P(obj9);
                    r5j0 r5j0Var4 = new r5j0(kmqVar, (byte) 12);
                    ltj0Var.j = 1;
                    if (i89Var.c(r5j0Var4, ltj0Var) == wneVar9) {
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
                if (yjeVar instanceof pxj0) {
                    pxj0Var = (pxj0) yjeVar;
                    int i19 = pxj0Var.j;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        pxj0Var.j = i19 - Integer.MIN_VALUE;
                    } else {
                        pxj0Var = new pxj0(this, yjeVar);
                    }
                } else {
                    pxj0Var = new pxj0(this, yjeVar);
                }
                Object obj10 = pxj0Var.i;
                wne wneVar10 = wne.f39444a;
                int i20 = pxj0Var.j;
                if (i20 == 0) {
                    z1x.P(obj10);
                    r5j0 r5j0Var5 = new r5j0(kmqVar, (byte) 15);
                    pxj0Var.j = 1;
                    if (i89Var.c(r5j0Var5, pxj0Var) == wneVar10) {
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
                if (yjeVar instanceof pwp0) {
                    pwp0Var = (pwp0) yjeVar;
                    int i21 = pwp0Var.j;
                    if ((i21 & Integer.MIN_VALUE) != 0) {
                        pwp0Var.j = i21 - Integer.MIN_VALUE;
                    } else {
                        pwp0Var = new pwp0(this, yjeVar);
                    }
                } else {
                    pwp0Var = new pwp0(this, yjeVar);
                }
                Object obj11 = pwp0Var.i;
                wne wneVar11 = wne.f39444a;
                int i22 = pwp0Var.j;
                if (i22 == 0) {
                    z1x.P(obj11);
                    d8n0 d8n0Var = new d8n0(kmqVar, (byte) 19);
                    pwp0Var.j = 1;
                    if (i89Var.c(d8n0Var, pwp0Var) == wneVar11) {
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
            default:
                if (yjeVar instanceof ekr0) {
                    ekr0Var = (ekr0) yjeVar;
                    int i23 = ekr0Var.j;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        ekr0Var.j = i23 - Integer.MIN_VALUE;
                    } else {
                        ekr0Var = new ekr0(this, yjeVar);
                    }
                } else {
                    ekr0Var = new ekr0(this, yjeVar);
                }
                Object obj12 = ekr0Var.i;
                wne wneVar12 = wne.f39444a;
                int i24 = ekr0Var.j;
                if (i24 == 0) {
                    z1x.P(obj12);
                    d8n0 d8n0Var2 = new d8n0(kmqVar, (byte) 23);
                    ekr0Var.j = 1;
                    if (i89Var.c(d8n0Var2, ekr0Var) == wneVar12) {
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
        }
    }
}
