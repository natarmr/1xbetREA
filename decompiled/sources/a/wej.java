package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.check_box.DsCheckbox;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLine;
import org.xplatform.uikit_sport.eventcard.info.EventCardInfoLive;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wej extends rer implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39022a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wej(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f39022a = b;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x03b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x03b2 A[LOOP:12: B:133:0x0382->B:143:0x03b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x02f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x02f8 A[LOOP:8: B:85:0x02c1->B:95:0x02f8, LOOP_END] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        tzi tziVar;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        ixs ixsVar;
        boolean z;
        Object value5;
        Object value6;
        Object value7;
        czs czsVar;
        boolean z2;
        Object value8;
        byte b = 2;
        yje yjeVar = null;
        byte b2 = 1;
        switch (this.f39022a) {
            case 0:
                ((xej) this.receiver).x0();
                return Unit.f46060a;
            case 1:
                return ((v4q0) this.receiver).G();
            case 2:
                ((p9k) this.receiver).w();
                return Unit.f46060a;
            case 3:
                ((p9k) this.receiver).w();
                return Unit.f46060a;
            case 4:
                ((iak) this.receiver).w();
                return Unit.f46060a;
            case 5:
                ((iak) this.receiver).w();
                return Unit.f46060a;
            case 6:
                xtk xtkVar = (xtk) this.receiver;
                xtkVar.getClass();
                xtkVar.y(da10.DEFAULT_ERROR);
                return Unit.f46060a;
            case 7:
                xtk xtkVar2 = (xtk) this.receiver;
                xtkVar2.getClass();
                xtkVar2.y(da10.TIMER_ERROR);
                if (xtkVar2.r) {
                    xtkVar2.w();
                }
                return Unit.f46060a;
            case 8:
                return ((ptk) this.receiver).p0();
            case 9:
                ((DsCheckbox) this.receiver).invalidate();
                return Unit.f46060a;
            case 10:
                DsMenuCell dsMenuCell = (DsMenuCell) this.receiver;
                int i = DsMenuCell.g1;
                dsMenuCell.w();
                return Unit.f46060a;
            case 11:
                EventCardInfoLine eventCardInfoLine = (EventCardInfoLine) this.receiver;
                int i2 = EventCardInfoLine.r;
                eventCardInfoLine.u();
                return Unit.f46060a;
            case 12:
                EventCardInfoLive eventCardInfoLive = (EventCardInfoLive) this.receiver;
                int i3 = EventCardInfoLive.b;
                eventCardInfoLive.a();
                return Unit.f46060a;
            case 13:
                org.xplatform.favorites.impl.presentation.category.e eVar = (org.xplatform.favorites.impl.presentation.category.e) this.receiver;
                sek sekVar = org.xplatform.favorites.impl.presentation.category.e.V1;
                if (eVar.O1 == null) {
                    Intrinsics.h("gameCardCommonAdapterDelegates");
                    throw null;
                }
                org.xplatform.favorites.impl.presentation.category.f fVarH0 = eVar.H0();
                y3p y3pVar = new y3p();
                byte b3 = 26;
                int i4 = 3;
                gbn gbnVar = new gbn(new x6o((byte) 20), new e9k(i4, (byte) 22), new yhn(new mmn((byte) 28), b3), gzn.p);
                dp dpVar = y3pVar.d;
                dpVar.b(gbnVar);
                byte b4 = 21;
                dpVar.b(new gbn(new x6o((byte) 19), new e9k(i4, b4), new mmn((byte) 29), gzn.o));
                dpVar.b(new gbn(new x6o(b4), new e9k(i4, (byte) 23), new e4p(b2), gzn.q));
                dpVar.b(new gbn(new x6o(b3), new e9k(i4, (byte) 24), new e4p((byte) 4), gzn.r));
                pek.f(dpVar, fVarH0);
                return y3pVar;
            case 14:
                rop ropVar = (rop) this.receiver;
                nek nekVar = rop.a2;
                ropVar.K0();
                return Unit.f46060a;
            case 15:
                r8q r8qVar = (r8q) this.receiver;
                ocq ocqVar = r8q.Y;
                r8qVar.F();
                return Unit.f46060a;
            case 16:
                tpq tpqVar = (tpq) this.receiver;
                iz40 iz40Var = tpqVar.c;
                iz40 iz40Var2 = tpqVar.d;
                ypq ypqVar = tpqVar.f34346a;
                nqq nqqVarH = ypqVar.h();
                if (nqqVarH == null) {
                    Object[] objArr = iz40Var2.b;
                    long[] jArr = iz40Var2.f15620a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j & 255) < 128) {
                                        ((lpq) objArr[(i5 << 3) + i7]).L(iqq.c);
                                    }
                                    j >>= 8;
                                }
                                if (i6 == 8) {
                                    if (i5 != length) {
                                        i5++;
                                    }
                                }
                            } else if (i5 != length) {
                                i5++;
                            }
                        }
                    }
                } else if (nqqVarH.n) {
                    if (iz40Var.c(nqqVarH)) {
                        nqqVarH.f1();
                    }
                    iqq iqqVarE1 = nqqVarH.e1();
                    if (!nqqVarH.f20279a.n) {
                        xcx.b("visitAncestors called on an unattached node");
                    }
                    lm40 lm40Var = nqqVarH.f20279a;
                    e7z e7zVarZ = vcc.Z(nqqVarH);
                    int i8 = 0;
                    while (e7zVarZ != null) {
                        if ((((lm40) e7zVarZ.h1.g).d & 5120) != 0) {
                            while (lm40Var != null) {
                                int i9 = lm40Var.c;
                                if ((i9 & 5120) != 0) {
                                    if ((i9 & 1024) != 0) {
                                        i8++;
                                    }
                                    if ((lm40Var instanceof lpq) && iz40Var2.c(lm40Var)) {
                                        if (i8 <= 1) {
                                            ((lpq) lm40Var).L(iqqVarE1);
                                        } else {
                                            ((lpq) lm40Var).L(iqq.b);
                                        }
                                        iz40Var2.l(lm40Var);
                                    }
                                }
                                lm40Var = lm40Var.e;
                            }
                        }
                        e7zVarZ = e7zVarZ.v();
                        lm40Var = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
                    }
                    Object[] objArr2 = iz40Var2.b;
                    long[] jArr2 = iz40Var2.f15620a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j2 = jArr2[i10];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j2 & 255) < 128) {
                                        ((lpq) objArr2[(i10 << 3) + i12]).L(iqq.c);
                                    }
                                    j2 >>= 8;
                                }
                                if (i11 == 8) {
                                    if (i10 != length2) {
                                        i10++;
                                    }
                                }
                            } else if (i10 != length2) {
                                i10++;
                            }
                        }
                    }
                }
                if (ypqVar.h() == null || ypqVar.c.e1() == iqq.c) {
                    ypqVar.e();
                }
                iz40Var.b();
                iz40Var2.b();
                tpqVar.e = false;
                return Unit.f46060a;
            case 17:
                return Boolean.valueOf(nqq.i1(((uqq) this.receiver).v));
            case 18:
                ((dk5) this.receiver).O();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Boolean.valueOf(((iqt) this.receiver).f15225a.a());
            case 20:
                return Boolean.valueOf(((iqt) this.receiver).f15225a.a());
            case 21:
                yys yysVar = (yys) this.receiver;
                p7m0 p7m0Var = yysVar.B;
                ljf0 ljf0Var = yysVar.l;
                if (!((ixs) p7m0Var.getValue()).k) {
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, ixs.a((ixs) value, 0L, null, true, true, false, false, null, false, false, null, false, null, false, false, 524191)));
                    ixs ixsVar2 = (ixs) p7m0Var.getValue();
                    if (ixsVar2.o) {
                        ixs ixsVar3 = (ixs) yysVar.B.getValue();
                        if (ixsVar3.o && !ixsVar3.q) {
                            ((neu0) ljf0Var.f20148a).f23405a.a();
                        }
                    } else {
                        hl90 hl90Var = ixsVar2.j;
                        if (hl90Var != null && hl90Var != hl90.f13247a) {
                            do {
                                value2 = p7m0Var.getValue();
                            } while (!p7m0Var.m(value2, ixs.a((ixs) value2, 0L, null, false, false, false, false, null, false, false, null, true, null, false, false, 507903)));
                            if (!((ixs) p7m0Var.getValue()).q) {
                                ((neu0) ljf0Var.f20148a).f23405a.a();
                            }
                        }
                    }
                    yysVar.D();
                }
                return Unit.f46060a;
            case 22:
                yys yysVar2 = (yys) this.receiver;
                p7m0 p7m0Var2 = yysVar2.B;
                do {
                    value3 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value3, ixs.a((ixs) value3, 0L, null, false, false, false, false, null, false, false, new ss3(), false, null, false, false, 520095)));
                yysVar2.B();
                yysVar2.A();
                return Unit.f46060a;
            case 23:
                yys yysVar3 = (yys) this.receiver;
                bby bbyVar = yysVar3.H;
                if (bbyVar == null || !bbyVar.isActive()) {
                    yysVar3.H = sac.V(jiu0.a(yysVar3), wys.f39988a, null, yysVar3.p.c, new sys(yysVar3, yjeVar, b), 10);
                }
                return Unit.f46060a;
            case 24:
                yys yysVar4 = (yys) this.receiver;
                p7m0 p7m0Var3 = yysVar4.B;
                do {
                    value4 = p7m0Var3.getValue();
                    ixsVar = (ixs) value4;
                    z = !ixsVar.i;
                    yysVar4.e.b.d.f22888a.d("GAME_BROADCAST_SOUND_ENABLE", z);
                } while (!p7m0Var3.m(value4, ixs.a(ixsVar, 0L, null, false, false, false, z, null, false, false, null, false, null, false, false, 524031)));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wzs wzsVar = (wzs) this.receiver;
                p7m0 p7m0Var4 = wzsVar.u;
                do {
                    value5 = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value5, czs.a((czs) value5, 0L, 0L, null, 0L, null, true, true, false, false, false, false, false, null, 57247)));
                if (((czs) p7m0Var4.getValue()).k) {
                    ((neu0) wzsVar.i.f20148a).f23405a.a();
                }
                czs czsVar2 = (czs) wzsVar.u.getValue();
                wzsVar.q.A(czsVar2.f5238a, czsVar2.b, czsVar2.d, v39.VIDEO, czsVar2.c, czsVar2.o);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wzs wzsVar2 = (wzs) this.receiver;
                p7m0 p7m0Var5 = wzsVar2.u;
                do {
                    value6 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value6, czs.a((czs) value6, 0L, 0L, null, 0L, null, false, false, false, false, false, false, true, null, 57247)));
                wzsVar2.z();
                wzsVar2.y();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((wzs) this.receiver).w();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wzs wzsVar3 = (wzs) this.receiver;
                p7m0 p7m0Var6 = wzsVar3.u;
                do {
                    value7 = p7m0Var6.getValue();
                    czsVar = (czs) value7;
                    z2 = !czsVar.i;
                    wzsVar3.g.b.d.f22888a.d("GAME_BROADCAST_SOUND_ENABLE", z2);
                } while (!p7m0Var6.m(value7, czs.a(czsVar, 0L, 0L, null, 0L, null, false, false, false, z2, false, false, false, null, 65279)));
                return Unit.f46060a;
            default:
                e1t e1tVar = (e1t) this.receiver;
                p7m0 p7m0Var7 = e1tVar.n;
                do {
                    value8 = p7m0Var7.getValue();
                } while (!p7m0Var7.m(value8, s0t.a((s0t) value8, true, true, false, false, null, false, false, 32607)));
                e1tVar.z();
                return Unit.f46060a;
        }
    }
}
