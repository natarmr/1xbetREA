package a;

import android.javax.sip.message.Response;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h36 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f12370a = new zfn(new o85((byte) 19), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:135:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:143:0x020b  */
    /* JADX WARN: Code duplicated, block: B:146:0x0211  */
    /* JADX WARN: Code duplicated, block: B:151:0x0220  */
    /* JADX WARN: Code duplicated, block: B:153:0x0225  */
    /* JADX WARN: Code duplicated, block: B:156:0x022d  */
    /* JADX WARN: Code duplicated, block: B:161:0x023c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0241  */
    /* JADX WARN: Code duplicated, block: B:166:0x0249  */
    /* JADX WARN: Code duplicated, block: B:167:0x024e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0254  */
    /* JADX WARN: Code duplicated, block: B:171:0x025a  */
    /* JADX WARN: Code duplicated, block: B:172:0x025d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0267  */
    /* JADX WARN: Code duplicated, block: B:177:0x026c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0272  */
    /* JADX WARN: Code duplicated, block: B:181:0x0278  */
    /* JADX WARN: Code duplicated, block: B:182:0x027b  */
    /* JADX WARN: Code duplicated, block: B:186:0x0285  */
    /* JADX WARN: Code duplicated, block: B:187:0x028a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0290  */
    /* JADX WARN: Code duplicated, block: B:191:0x0296  */
    /* JADX WARN: Code duplicated, block: B:195:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:196:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:198:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:200:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:202:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:205:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:211:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:214:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:216:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:218:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:221:0x02e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:223:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:226:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:230:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:232:0x0305  */
    /* JADX WARN: Code duplicated, block: B:234:0x030b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0313  */
    /* JADX WARN: Code duplicated, block: B:240:0x031d  */
    /* JADX WARN: Code duplicated, block: B:242:0x0323  */
    /* JADX WARN: Code duplicated, block: B:246:0x032d  */
    /* JADX WARN: Code duplicated, block: B:248:0x0333  */
    /* JADX WARN: Code duplicated, block: B:249:0x0336  */
    /* JADX WARN: Code duplicated, block: B:253:0x0340  */
    /* JADX WARN: Code duplicated, block: B:255:0x0346  */
    /* JADX WARN: Code duplicated, block: B:259:0x034e  */
    /* JADX WARN: Code duplicated, block: B:261:0x0354  */
    /* JADX WARN: Code duplicated, block: B:262:0x0357  */
    /* JADX WARN: Code duplicated, block: B:266:0x0367  */
    /* JADX WARN: Code duplicated, block: B:274:0x037c  */
    /* JADX WARN: Code duplicated, block: B:277:0x0385  */
    /* JADX WARN: Code duplicated, block: B:279:0x039d  */
    /* JADX WARN: Code duplicated, block: B:301:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:303:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:304:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:307:0x0400  */
    /* JADX WARN: Code duplicated, block: B:309:0x0404  */
    /* JADX WARN: Code duplicated, block: B:310:0x0407  */
    /* JADX WARN: Code duplicated, block: B:313:0x040d  */
    /* JADX WARN: Code duplicated, block: B:316:0x041f  */
    /* JADX WARN: Code duplicated, block: B:317:0x043e  */
    /* JADX WARN: Code duplicated, block: B:319:0x0442  */
    /* JADX WARN: Code duplicated, block: B:320:0x0445  */
    /* JADX WARN: Code duplicated, block: B:323:0x044a  */
    /* JADX WARN: Code duplicated, block: B:325:0x044e  */
    /* JADX WARN: Code duplicated, block: B:326:0x0451  */
    /* JADX WARN: Code duplicated, block: B:329:0x0458  */
    /* JADX WARN: Code duplicated, block: B:330:0x045f  */
    /* JADX WARN: Code duplicated, block: B:333:0x0465  */
    /* JADX WARN: Code duplicated, block: B:334:0x046c  */
    /* JADX WARN: Code duplicated, block: B:337:0x0472  */
    /* JADX WARN: Code duplicated, block: B:339:0x047d  */
    /* JADX WARN: Code duplicated, block: B:342:0x0483  */
    /* JADX WARN: Code duplicated, block: B:343:0x0488  */
    /* JADX WARN: Code duplicated, block: B:345:0x048c  */
    /* JADX WARN: Code duplicated, block: B:346:0x0491  */
    /* JADX WARN: Code duplicated, block: B:348:0x0495  */
    /* JADX WARN: Code duplicated, block: B:349:0x0498  */
    /* JADX WARN: Code duplicated, block: B:352:0x049e  */
    /* JADX WARN: Code duplicated, block: B:353:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:356:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:358:0x04af  */
    /* JADX WARN: Code duplicated, block: B:360:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:364:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:365:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:368:0x050a  */
    /* JADX WARN: Code duplicated, block: B:370:0x050e  */
    /* JADX WARN: Code duplicated, block: B:372:0x0518  */
    /* JADX WARN: Code duplicated, block: B:374:0x052c  */
    /* JADX WARN: Code duplicated, block: B:377:0x053a  */
    /* JADX WARN: Code duplicated, block: B:378:0x053c  */
    /* JADX WARN: Code duplicated, block: B:381:0x0544  */
    /* JADX WARN: Code duplicated, block: B:382:0x0546  */
    /* JADX WARN: Code duplicated, block: B:385:0x054e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:386:0x0550 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:387:0x0552  */
    /* JADX WARN: Code duplicated, block: B:390:0x055a  */
    /* JADX WARN: Code duplicated, block: B:394:0x0567  */
    /* JADX WARN: Code duplicated, block: B:397:0x059c  */
    /* JADX WARN: Code duplicated, block: B:399:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:400:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:403:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:404:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:407:0x05ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:410:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:412:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:415:0x0606  */
    /* JADX WARN: Code duplicated, block: B:416:0x0608  */
    /* JADX WARN: Code duplicated, block: B:419:0x060f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:420:0x0611  */
    /* JADX WARN: Code duplicated, block: B:423:0x0628  */
    /* JADX WARN: Code duplicated, block: B:424:0x0631  */
    /* JADX WARN: Code duplicated, block: B:427:0x063d  */
    /* JADX WARN: Code duplicated, block: B:429:0x0649  */
    /* JADX WARN: Code duplicated, block: B:432:0x0658  */
    /* JADX WARN: Code duplicated, block: B:435:0x0699  */
    /* JADX WARN: Code duplicated, block: B:436:0x069f  */
    /* JADX WARN: Code duplicated, block: B:439:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:440:0x070e  */
    /* JADX WARN: Code duplicated, block: B:443:0x076d  */
    /* JADX WARN: Code duplicated, block: B:445:0x0783  */
    /* JADX WARN: Code duplicated, block: B:446:0x0785  */
    /* JADX WARN: Code duplicated, block: B:448:0x0788 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:450:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:452:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:453:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:456:0x080e  */
    /* JADX WARN: Code duplicated, block: B:458:0x0816  */
    /* JADX WARN: Code duplicated, block: B:460:0x082d  */
    /* JADX WARN: Code duplicated, block: B:462:0x0858 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:463:0x085a  */
    /* JADX WARN: Code duplicated, block: B:465:0x0862  */
    /* JADX WARN: Code duplicated, block: B:467:0x0879  */
    /* JADX WARN: Code duplicated, block: B:469:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:471:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:473:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:476:0x0923  */
    /* JADX WARN: Code duplicated, block: B:478:0x095b  */
    /* JADX WARN: Code duplicated, block: B:481:0x0988  */
    /* JADX WARN: Code duplicated, block: B:483:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:301:0x03f5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v28 */
    public static final void a(final mm40 mm40Var, final String str, final q7q0 q7q0Var, final String str2, final String str3, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final oie oieVar, final boolean z6, final boolean z7, String str4, Integer num, boolean z8, final vuu0 vuu0Var, boolean z9, long j, y9q0 y9q0Var, yjj0 yjj0Var, final int i, int i2, kly klyVar, float f, float f2, float f3, hh80 hh80Var, hh80 hh80Var2, boolean z10, float f4, final int i3, final a7n a7nVar, Function1 function1, final Function1 function2, final ugd ugdVar, final ugd ugdVar2, ugd ugdVar3, fet fetVar, final int i4, final int i5, final int i6, final int i7, final int i8, final int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z11;
        ugd ugdVar4;
        final String str5;
        final Integer num2;
        final boolean z12;
        final boolean z13;
        final y9q0 y9q0Var2;
        final yjj0 yjj0Var2;
        final int i26;
        final kly klyVar2;
        final float f5;
        final float f6;
        final float f7;
        final hh80 hh80Var3;
        final hh80 hh80Var4;
        final boolean z14;
        final float f8;
        final Function1 function3;
        final long j2;
        fet fetVar2;
        yfe0 yfe0VarU;
        int i27;
        Object obj;
        String str6;
        boolean z15;
        y9q0 y9q0Var3;
        yjj0 yjj0Var3;
        kly klyVar3;
        float f9;
        float f10;
        float f11;
        float f12;
        hh80 hh80VarT;
        hh80 hh80VarT2;
        boolean z16;
        Function1 function4;
        hh80 hh80Var5;
        final Function1 function5;
        float f13;
        int i28;
        final kly klyVar4;
        final hh80 hh80Var6;
        boolean z17;
        String str7;
        int i29;
        final y9q0 y9q0Var4;
        final boolean z18;
        long j3;
        final int i30;
        yjj0 yjj0Var4;
        final Integer num3;
        final boolean z19;
        Object objP;
        Object objP2;
        final pz40 pz40Var;
        Object objP3;
        final pz40 pz40Var2;
        boolean z20;
        boolean z21;
        boolean z22;
        Object objP4;
        String str8;
        Object objP5;
        pz40 pz40Var3;
        Pair pair;
        final String str9;
        boolean z23;
        Object objP6;
        final boolean zBooleanValue;
        jm40 jm40Var;
        mm40 mm40VarK0;
        final cqq cqqVar;
        ?? r6;
        final int iA;
        hh80 hh80Var7;
        fet fetVar3;
        boolean zBooleanValue2;
        boolean z24;
        fet fetVar4;
        l7m0 l7m0VarA;
        fet fetVar5;
        boolean zBooleanValue3;
        long jM126getWhite200d7_KjU;
        l7m0 l7m0VarB;
        boolean z25;
        long jM123getWhite0d7_KjU;
        boolean z26;
        long jM113getRed0d7_KjU;
        Object objP7;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objP8;
        long jE;
        int i31;
        int i32;
        int iOrdinal;
        int i33;
        int i34;
        fet fetVar6 = fetVar;
        str.getClass();
        q7q0Var.getClass();
        str2.getClass();
        str3.getClass();
        fetVar6.g0(-93032645);
        int i35 = 16;
        int i36 = (fetVar6.g(mm40Var) ? 4 : 2) | i4 | (fetVar6.g(str) ? 32 : 16);
        if ((i4 & 384) == 0) {
            i36 |= fetVar6.g(q7q0Var) ? 256 : 128;
        }
        int i37 = i36 | (fetVar6.g(str2) ? 2048 : 1024) | (fetVar6.g(str3) ? 16384 : 8192) | (fetVar6.h(z) ? 131072 : 65536) | (fetVar6.h(z3) ? 8388608 : 4194304) | (fetVar6.h(z4) ? 67108864 : 33554432);
        int i38 = i5 | (fetVar6.g(oieVar) ? 4 : 2);
        if ((i5 & 48) == 0) {
            i38 |= fetVar6.h(z6) ? 32 : 16;
        }
        int i39 = i38 | (fetVar6.h(z7) ? 256 : 128);
        int i40 = i8 & 8192;
        if (i40 != 0) {
            i10 = i39 | 3072;
        } else {
            i10 = i39 | (fetVar6.g(str4) ? 2048 : 1024);
        }
        int i41 = i8 & 16384;
        if (i41 != 0) {
            i11 = i10 | 24576;
        } else {
            i11 = i10 | (fetVar6.g(num) ? 16384 : 8192);
        }
        int i42 = i11 | 196608 | (fetVar6.g(vuu0Var) ? 1048576 : 524288);
        int i43 = i8 & 131072;
        if (i43 != 0) {
            i13 = i42 | 12582912;
            i12 = 1048576;
        } else {
            i12 = 1048576;
            i13 = i42 | (fetVar6.h(z9) ? 8388608 : 4194304);
        }
        long jM121getTransparent0d7_KjU = j;
        int i44 = i13 | (((i8 & 262144) == 0 && fetVar6.f(jM121getTransparent0d7_KjU)) ? 67108864 : 33554432) | (((i8 & 524288) == 0 && fetVar6.g(y9q0Var)) ? 536870912 : 268435456);
        int i45 = i8 & i12;
        if (i45 != 0) {
            i14 = i6 | 6;
        } else if ((i6 & 6) == 0) {
            i14 = i6 | (fetVar6.g(yjj0Var) ? 4 : 2);
        } else {
            i14 = i6;
        }
        if ((i6 & 48) == 0) {
            i14 |= fetVar6.e(i) ? 32 : 16;
        }
        int i46 = i14;
        int i47 = i8 & 4194304;
        if (i47 != 0) {
            i15 = i46 | 384;
        } else {
            int i48 = i46;
            if ((i6 & 384) == 0) {
                i48 |= fetVar6.e(i2) ? 256 : 128;
            }
            i15 = i48;
        }
        int i49 = i8 & 8388608;
        if (i49 == 0) {
            i16 = i15;
            if ((i6 & 3072) == 0) {
                i16 |= fetVar6.g(klyVar) ? 2048 : 1024;
            }
            if ((i6 & 24576) != 0) {
                i16 |= ((i8 & 16777216) == 0 || !fetVar6.d(f)) ? 8192 : 16384;
            }
            if ((i6 & 196608) != 0) {
                if ((i8 & 33554432) == 0 || !fetVar6.d(f2)) {
                    i34 = 65536;
                } else {
                    i34 = 131072;
                }
                i16 |= i34;
            }
            if ((i6 & 1572864) != 0) {
                if ((i8 & 67108864) == 0 || !fetVar6.d(f3)) {
                    i33 = 524288;
                } else {
                    i33 = i12;
                }
                i16 |= i33;
            }
            i17 = i8 & 134217728;
            if (i17 != 0) {
                i16 |= 12582912;
            } else if ((i6 & 12582912) == 0) {
                if (fetVar6.g(hh80Var)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i16 |= i18;
            }
            i19 = i8 & 268435456;
            if (i19 != 0) {
                i16 |= 100663296;
            } else if ((i6 & 100663296) == 0) {
                if (fetVar6.g(hh80Var2)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i16 |= i20;
            }
            i21 = i8 & 536870912;
            if (i21 != 0) {
                i16 |= 805306368;
            } else if ((i6 & 805306368) == 0) {
                i16 |= fetVar6.h(z10) ? 536870912 : 268435456;
            }
            if ((i8 & 1073741824) != 0) {
                i22 = i7 | 6;
            } else if ((i7 & 6) == 0) {
                i22 = i7 | (fetVar6.h(false) ? 4 : 2);
            } else {
                i22 = i7;
            }
            if ((i7 & 48) != 0) {
                if ((i9 & 1) == 0 && fetVar6.d(f4)) {
                    i35 = 32;
                }
                i22 |= i35;
            }
            if ((i7 & 384) != 0) {
                i22 |= fetVar6.e(i3) ? 256 : 128;
            }
            if ((i7 & 3072) == 0) {
                if (a7nVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = a7nVar.ordinal();
                }
                i22 |= fetVar6.e(iOrdinal) ? 2048 : 1024;
            }
            i23 = i22;
            i24 = i9 & 8;
            if (i24 != 0) {
                i25 = i23;
                if ((i7 & 24576) == 0) {
                    i25 |= fetVar6.i(function1) ? 16384 : 8192;
                }
                if ((i7 & 196608) == 0) {
                    i25 |= fetVar6.i(function2) ? 131072 : 65536;
                }
                if ((i7 & 1572864) == 0) {
                    if (fetVar6.i(ugdVar)) {
                        i32 = i12;
                    } else {
                        i32 = 524288;
                    }
                    i25 |= i32;
                }
                if ((i7 & 12582912) == 0) {
                    i25 |= fetVar6.i(ugdVar2) ? 8388608 : 4194304;
                }
                if ((i7 & 100663296) == 0) {
                    if (fetVar6.i(ugdVar3)) {
                        i31 = 67108864;
                    } else {
                        i31 = 33554432;
                    }
                    i25 |= i31;
                }
                if ((i37 & 306783379) != 306783378 && (i44 & 306783379) == 306783378 && (i16 & 306783379) == 306783378 && (i25 & 38347923) == 38347922) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (fetVar6.U(i37 & 1, z11)) {
                    fetVar6.Z();
                    i27 = i4 & 1;
                    obj = ukd.f35823a;
                    if (i27 != 0 || fetVar6.B()) {
                        if (i40 != 0) {
                            str6 = null;
                        } else {
                            str6 = str4;
                        }
                        Integer num4 = i41 == 0 ? num : null;
                        if (i43 != 0) {
                            z15 = false;
                        } else {
                            z15 = z9;
                        }
                        if ((i8 & 262144) != 0) {
                            jM121getTransparent0d7_KjU = ((StaticColors) fetVar6.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                            i44 &= -234881025;
                        }
                        if ((i8 & 524288) != 0) {
                            y9q0Var3 = new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
                            i44 &= -1879048193;
                        } else {
                            y9q0Var3 = y9q0Var;
                        }
                        if (i45 != 0) {
                            yjj0Var3 = jd8.n;
                        } else {
                            yjj0Var3 = yjj0Var;
                        }
                        int i50 = i47 == 0 ? i2 : -1;
                        if (i49 != 0) {
                            klyVar3 = kly.d;
                        } else {
                            klyVar3 = klyVar;
                        }
                        f9 = 0.0f;
                        if ((i8 & 16777216) != 0) {
                            zcl zclVar = qmk.f28987a;
                            i16 &= -57345;
                            f10 = 0.0f;
                        } else {
                            f10 = f;
                        }
                        if ((i8 & 33554432) != 0) {
                            zcl zclVar2 = qmk.f28987a;
                            i16 &= -458753;
                            f11 = 0.0f;
                        } else {
                            f11 = f2;
                        }
                        if ((i8 & 67108864) != 0) {
                            zcl zclVar3 = qmk.f28987a;
                            i16 &= -3670017;
                            f12 = 0.0f;
                        } else {
                            f12 = f3;
                        }
                        Integer num5 = num4;
                        if (i17 != 0) {
                            hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                        } else {
                            hh80VarT = hh80Var;
                        }
                        if (i19 != 0) {
                            hh80VarT2 = s5x0.t(0.0f, 0.0f, 3);
                        } else {
                            hh80VarT2 = hh80Var2;
                        }
                        if (i21 != 0) {
                            z16 = false;
                        } else {
                            z16 = z10;
                        }
                        if ((i9 & 1) != 0) {
                            zcl zclVar4 = qmk.f28987a;
                            i25 &= -113;
                        } else {
                            f9 = f4;
                        }
                        hh80 hh80Var8 = hh80VarT2;
                        if (i24 != 0) {
                            objP = fetVar6.P();
                            if (objP == obj) {
                                objP = new h26((byte) 4);
                                fetVar6.o0(objP);
                            }
                            function4 = (Function1) objP;
                        } else {
                            function4 = function1;
                        }
                        hh80Var5 = hh80Var8;
                        function5 = function4;
                        f13 = f9;
                        i28 = i25;
                        klyVar4 = klyVar3;
                        hh80Var6 = hh80VarT;
                        z17 = z16;
                        str7 = str6;
                        i29 = i44;
                        y9q0Var4 = y9q0Var3;
                        z18 = true;
                        j3 = jM121getTransparent0d7_KjU;
                        i30 = i50;
                        yjj0Var4 = yjj0Var3;
                        num3 = num5;
                        z19 = z15;
                    } else {
                        fetVar6.X();
                        if ((i8 & 262144) != 0) {
                            i44 &= -234881025;
                        }
                        if ((i8 & 524288) != 0) {
                            i44 &= -1879048193;
                        }
                        if ((i8 & 16777216) != 0) {
                            i16 &= -57345;
                        }
                        if ((i8 & 33554432) != 0) {
                            i16 &= -458753;
                        }
                        if ((i8 & 67108864) != 0) {
                            i16 &= -3670017;
                        }
                        if ((i9 & 1) != 0) {
                            i25 &= -113;
                        }
                        str7 = str4;
                        z18 = z8;
                        z19 = z9;
                        y9q0Var4 = y9q0Var;
                        yjj0Var4 = yjj0Var;
                        i30 = i2;
                        klyVar4 = klyVar;
                        f10 = f;
                        f11 = f2;
                        f12 = f3;
                        hh80Var6 = hh80Var;
                        hh80Var5 = hh80Var2;
                        f13 = f4;
                        function5 = function1;
                        j3 = jM121getTransparent0d7_KjU;
                        i28 = i25;
                        i29 = i44;
                        num3 = num;
                        z17 = z10;
                    }
                    fetVar6.s();
                    Object[] objArr = new Object[0];
                    objP2 = fetVar6.P();
                    if (objP2 == obj) {
                        objP2 = new o85((byte) 20);
                        fetVar6.o0(objP2);
                    }
                    pz40Var = (pz40) e9x.Q(objArr, (Function0) objP2, fetVar6, 48);
                    objP3 = fetVar6.P();
                    if (objP3 != obj) {
                        if (z3) {
                            jE = o9q0.b;
                        } else {
                            int length = str.length();
                            jE = s7n0.e(length, length);
                        }
                        objP3 = androidx.compose.runtime.e.e(new a8q0(str, jE, 4));
                        fetVar6.o0(objP3);
                    }
                    pz40Var2 = (pz40) objP3;
                    if ((i29 & 7168) == 2048) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if ((i29 & 3670016) == 1048576) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    z22 = z20 | z21;
                    objP4 = fetVar6.P();
                    if (z22 || objP4 == obj) {
                        if (str7 == 0 || !(vuu0Var instanceof lm90)) {
                            objP4 = str7;
                        } else {
                            objP4 = "0123456789";
                        }
                        fetVar6.o0(objP4);
                    }
                    str8 = (String) objP4;
                    objP5 = fetVar6.P();
                    if (objP5 == obj) {
                        objP5 = androidx.compose.runtime.e.e(new Pair(str, ((a8q0) pz40Var2.getValue()).f440a.b));
                        fetVar6.o0(objP5);
                    }
                    pz40Var3 = (pz40) objP5;
                    pair = new Pair(str, ((a8q0) pz40Var2.getValue()).f440a.b);
                    if (pair.equals((Pair) pz40Var3.getValue())) {
                        str9 = str8;
                        fetVar6.e0(-1278430009);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(-1279185355);
                        boolean zG = fetVar6.g(pair) | fetVar6.g(str8);
                        if ((i37 & 112) == 32) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        boolean z30 = z27 | zG;
                        if ((i37 & 29360128) == 8388608) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = z30 | z28;
                        objP8 = fetVar6.P();
                        if (!z29 || objP8 == obj) {
                            objP8 = new c36(pair, str8, str, z3, pz40Var3, pz40Var2);
                            str9 = str8;
                            fetVar6.o0(objP8);
                        } else {
                            str9 = str8;
                        }
                        m0x0.D((Function0) objP8, fetVar6);
                        fetVar6.r(false);
                    }
                    if ((i37 & 896) == 256) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    objP6 = fetVar6.P();
                    if (z23 || objP6 == obj) {
                        objP6 = Boolean.valueOf(q7q0Var.equals(q7q0.f28265a));
                        fetVar6.o0(objP6);
                    }
                    zBooleanValue = ((Boolean) objP6).booleanValue();
                    jm40Var = jm40.b;
                    if (z2) {
                        mm40VarK0 = q8a.k0(jm40Var, enx.f8115a);
                    } else {
                        mm40VarK0 = jm40Var;
                    }
                    zfn zfnVar = f12370a;
                    cqqVar = (cqq) fetVar6.k(zfnVar);
                    if (cqqVar == null) {
                        fetVar6.e0(-1278098774);
                        objP7 = fetVar6.P();
                        if (objP7 == obj) {
                            objP7 = new cqq();
                            fetVar6.o0(objP7);
                        }
                        cqqVar = (cqq) objP7;
                        r6 = 0;
                    } else {
                        r6 = 0;
                        fetVar6.e0(790054039);
                    }
                    fetVar6.r(r6);
                    final k6z k6zVar = (k6z) fetVar6.k(bmd.n);
                    iA = a7nVar.a(k6zVar);
                    mm40 mm40VarE0 = o2e.e0(mm40Var, "DS_TEXT_FIELD_COLUMN");
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar6, r6);
                    int iHashCode = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM = fetVar6.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(e7z.u1);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, x5dVarA, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC0, gqw0.v);
                    if (z7) {
                        hh80Var7 = hh80Var5;
                        fetVar6.e0(1715566865);
                        fetVar6.r(false);
                    } else {
                        fetVar6.e0(1715193997);
                        int i51 = i37 >> 9;
                        hh80 hh80Var9 = hh80Var5;
                        d(null, str2, str, ((Boolean) pz40Var.getValue()).booleanValue(), z3, z4, hh80Var9, q7q0Var, iA, fetVar6, ((i37 >> 6) & 112) | ((i37 << 3) & 896) | (57344 & i51) | (i51 & 458752) | ((i16 >> 6) & 3670016) | ((i37 << 15) & 29360128));
                        hh80Var7 = hh80Var9;
                        fetVar6.r(false);
                    }
                    final yjj0 yjj0Var5 = yjj0Var4;
                    final long j4 = j3;
                    final boolean z31 = z17;
                    final float f14 = f12;
                    final mm40 mm40Var2 = mm40VarK0;
                    final float f15 = f11;
                    final float f16 = f10;
                    obc.d(zfnVar.a(cqqVar), u1c.M(1180745969, new Function2() { // from class: a.d36
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            boolean z32;
                            long jM123getWhite0d7_KjU2;
                            fet fetVar7 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (fetVar7.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                yx7 yx7Var = gqw0.k;
                                mm40 mm40VarQ = i120.Q(mm40Var2, j4, yjj0Var5);
                                zcl zclVar5 = qmk.f28987a;
                                mm40 mm40VarN = s5x0.N(mm40VarQ, 4.0f + f15, 0.0f, f14, f16, 2);
                                final boolean z33 = z3;
                                boolean zH = fetVar7.h(z33);
                                final boolean z34 = z;
                                boolean zH2 = zH | fetVar7.h(z34);
                                final Function1 function6 = function2;
                                boolean zG2 = zH2 | fetVar7.g(function6);
                                Object objP9 = fetVar7.P();
                                if (zG2 || objP9 == ukd.f35823a) {
                                    objP9 = new cj(z33, z34, function6);
                                    fetVar7.o0(objP9);
                                }
                                mm40 mm40VarO = kbc.O(mm40VarN, new nc40((Function1) objP9, (byte) 10));
                                thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar7, 48);
                                int iHashCode2 = Long.hashCode(fetVar7.T);
                                bh90 bh90VarM2 = fetVar7.m();
                                mm40 mm40VarC1 = kbc.c0(fetVar7, mm40VarO);
                                mkd.c0.getClass();
                                fetVar7.i0();
                                boolean z35 = fetVar7.S;
                                pcy pcyVar = e7z.u1;
                                if (z35) {
                                    fetVar7.l(pcyVar);
                                } else {
                                    fetVar7.r0();
                                }
                                shd shdVar = gqw0.x;
                                jpm0.o(fetVar7, thg0VarA, shdVar);
                                shd shdVar2 = gqw0.w;
                                jpm0.o(fetVar7, bh90VarM2, shdVar2);
                                Integer numValueOf = Integer.valueOf(iHashCode2);
                                shd shdVar3 = gqw0.y;
                                jpm0.o(fetVar7, numValueOf, shdVar3);
                                jpm0.n(fetVar7);
                                shd shdVar4 = gqw0.v;
                                jpm0.o(fetVar7, mm40VarC1, shdVar4);
                                ugd ugdVar5 = ugdVar;
                                final cqq cqqVar2 = cqqVar;
                                ugdVar5.F(cqqVar2, fetVar7, 0);
                                x7z x7zVar = new x7z(1.0f, true);
                                boolean z36 = z31;
                                jm40 jm40Var2 = jm40.b;
                                mm40 mm40VarE = x7zVar.e(z36 ? o7k0.e(jm40Var2, 20.0f) : o7k0.g(jm40Var2, 20.0f, 0.0f, 2));
                                tj30 tj30VarC = zq8.c(gqw0.d, false);
                                int iHashCode3 = Long.hashCode(fetVar7.T);
                                bh90 bh90VarM3 = fetVar7.m();
                                mm40 mm40VarC2 = kbc.c0(fetVar7, mm40VarE);
                                fetVar7.i0();
                                if (fetVar7.S) {
                                    fetVar7.l(pcyVar);
                                } else {
                                    fetVar7.r0();
                                }
                                jpm0.o(fetVar7, tj30VarC, shdVar);
                                jpm0.o(fetVar7, bh90VarM3, shdVar2);
                                vqd.u(iHashCode3, fetVar7, shdVar3, fetVar7);
                                jpm0.o(fetVar7, mm40VarC2, shdVar4);
                                if (zBooleanValue) {
                                    fetVar7.e0(-1480645274);
                                    jM123getWhite0d7_KjU2 = ((ThemeColors) fetVar7.k(zaq0.b)).getTextPrimary();
                                    z32 = false;
                                } else {
                                    z32 = false;
                                    fetVar7.e0(-1480643968);
                                    jM123getWhite0d7_KjU2 = ((StaticColors) fetVar7.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                                }
                                fetVar7.r(z32);
                                final long j5 = jM123getWhite0d7_KjU2;
                                k6z k6zVar2 = k6z.b;
                                k6z k6zVar3 = k6zVar;
                                boolean z37 = k6zVar3 == k6zVar2 ? true : z32;
                                y9q0 y9q0Var5 = y9q0Var4;
                                boolean z38 = z6;
                                int i52 = iA;
                                final y9q0 y9q0VarE = h36.e(y9q0Var5, j5, z37, z38, i52);
                                k6z k6zVar4 = k6zVar3;
                                String str10 = str;
                                k6z k6zVarG = pkd.g(str10, fetVar7);
                                if (a7nVar == a7n.f379a || z38) {
                                    k6zVar4 = k6zVarG;
                                }
                                l5d0 l5d0VarA = bmd.n.a(k6zVar4);
                                final int i53 = i;
                                final int i54 = i3;
                                final int i55 = i30;
                                final oie oieVar2 = oieVar;
                                final boolean z39 = z2;
                                final hh80 hh80Var10 = hh80Var6;
                                final pz40 pz40Var4 = pz40Var;
                                final boolean z40 = z18;
                                final String str11 = str9;
                                final Integer num6 = num3;
                                final kly klyVar5 = klyVar4;
                                final vuu0 vuu0Var2 = vuu0Var;
                                final Function1 function7 = function5;
                                final pz40 pz40Var5 = pz40Var2;
                                obc.d(l5d0VarA, u1c.M(-1401398373, new Function2() { // from class: a.f36
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        fet fetVar8 = (fet) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (fetVar8.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            pz40 pz40Var6 = pz40Var5;
                                            a8q0 a8q0Var = (a8q0) pz40Var6.getValue();
                                            skk0 skk0Var = new skk0(j5);
                                            int i56 = i53;
                                            uly ulyVar = new uly(i54, Boolean.valueOf(!(i56 == 7)), i56, i55, 112);
                                            oie oieVar3 = oieVar2;
                                            boolean zI = fetVar8.i(oieVar3);
                                            Object objP10 = fetVar8.P();
                                            cl5 cl5Var = ukd.f35823a;
                                            if (zI || objP10 == cl5Var) {
                                                objP10 = new os5(oieVar3, (byte) 2);
                                                fetVar8.o0(objP10);
                                            }
                                            mm40 mm40VarD = o7k0.d(pai0.a(jm40.b, false, (Function1) objP10), 1.0f);
                                            boolean z41 = z39;
                                            mm40 mm40VarI = s5x0.I(o7k0.w(mm40VarD, null, z41, 1), hh80Var10);
                                            pz40 pz40Var7 = pz40Var4;
                                            boolean zG3 = fetVar8.g(pz40Var7);
                                            boolean z42 = z40;
                                            boolean zH3 = zG3 | fetVar8.h(z42);
                                            Object objP11 = fetVar8.P();
                                            if (zH3 || objP11 == cl5Var) {
                                                objP11 = new b36(z42, pz40Var7, pz40Var6, (byte) 0);
                                                fetVar8.o0(objP11);
                                            }
                                            mm40 mm40VarE1 = o2e.e0(y860.b0(j120.b0(mm40VarI, (Function1) objP11), cqqVar2), "BASE_TEXT_FIELD_TAG");
                                            String str12 = str11;
                                            boolean zG4 = fetVar8.g(str12);
                                            Integer num7 = num6;
                                            boolean zG5 = zG4 | fetVar8.g(num7);
                                            Function1 function8 = function6;
                                            boolean zG6 = zG5 | fetVar8.g(function8);
                                            Object objP12 = fetVar8.P();
                                            if (zG6 || objP12 == cl5Var) {
                                                dc0 dc0Var = new dc0(str12, num7, function8, pz40Var6, (byte) 12);
                                                fetVar8.o0(dc0Var);
                                                objP12 = dc0Var;
                                            }
                                            z96.a(a8q0Var, (Function1) objP12, mm40VarE1, z34, z33, y9q0VarE, ulyVar, klyVar5, z41, 0, 0, vuu0Var2, function7, null, skk0Var, null, fetVar8, 0, 0, 42496);
                                        } else {
                                            fetVar8.X();
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar7), fetVar7, 56);
                                boolean zBooleanValue4 = ((Boolean) pz40Var4.getValue()).booleanValue();
                                mm40 mm40VarW = o7k0.w(jm40Var2, null, true, 1);
                                String str12 = str2;
                                boolean z41 = z4;
                                q7q0 q7q0Var2 = q7q0Var;
                                h36.b(mm40VarW, str10, str12, zBooleanValue4, z41, z33, q7q0Var2, i52, fetVar7, 6);
                                h36.c(o7k0.w(jm40Var2, null, true, 1), str10, str3, q7q0Var2, ((Boolean) pz40Var4.getValue()).booleanValue(), z33, z19, z38, i52, fetVar7, 6);
                                fetVar7.r(true);
                                ugdVar2.invoke(fetVar7, 0);
                                fetVar7.r(true);
                            } else {
                                fetVar7.X();
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, 56);
                    if (z5) {
                        fetVar.e0(1723121844);
                        zBooleanValue2 = ((Boolean) pz40Var.getValue()).booleanValue();
                        if (str.length() == 0) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        if (z4 || z24) {
                            fetVar4 = fetVar;
                            if (zBooleanValue2) {
                                fetVar4.e0(196486584);
                                zcl zclVar5 = qmk.f28987a;
                                l7m0VarA = d43.a(2.0f, null, null, fetVar4, 0, 14);
                                fetVar4.r(false);
                                fetVar5 = fetVar4;
                            } else {
                                fetVar4.e0(196489240);
                                zcl zclVar6 = qmk.f28987a;
                                l7m0VarA = d43.a(1.0f, null, null, fetVar4, 0, 14);
                                fetVar4.r(false);
                                fetVar5 = fetVar4;
                            }
                        } else {
                            fetVar.e0(196483832);
                            zcl zclVar7 = qmk.f28987a;
                            l7m0VarA = d43.a(2.0f, null, null, fetVar, 0, 14);
                            fet fetVar7 = fetVar;
                            fetVar7.r(false);
                            fetVar5 = fetVar7;
                        }
                        float f17 = ((ycl) l7m0VarA.getValue()).f42389a;
                        zBooleanValue3 = ((Boolean) pz40Var.getValue()).booleanValue();
                        if (z4) {
                            fetVar5.e0(-446232517);
                            if (zBooleanValue) {
                                fetVar5.e0(-446230107);
                                jM113getRed0d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getWarning();
                                z26 = false;
                            } else {
                                z26 = false;
                                fetVar5.e0(-446228927);
                                jM113getRed0d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m113getRed0d7_KjU();
                            }
                            fetVar5.r(z26);
                            l7m0VarB = m5k0.b(jM113getRed0d7_KjU, null, fetVar5, 0, 14);
                            fetVar5.r(z26);
                        } else if (zBooleanValue3) {
                            fetVar5.e0(-446228003);
                            if (zBooleanValue) {
                                fetVar5.e0(-446225595);
                                jM123getWhite0d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getPrimary();
                                z25 = false;
                            } else {
                                z25 = false;
                                fetVar5.e0(-446224413);
                                jM123getWhite0d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                            }
                            fetVar5.r(z25);
                            l7m0VarB = m5k0.b(jM123getWhite0d7_KjU, null, fetVar5, 0, 14);
                            fetVar5.r(z25);
                        } else {
                            fetVar5.e0(-446223517);
                            if (zBooleanValue) {
                                fetVar5.e0(-446221111);
                                jM126getWhite200d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary40();
                            } else {
                                fetVar5.e0(-446219803);
                                jM126getWhite200d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m126getWhite200d7_KjU();
                            }
                            fetVar5.r(false);
                            l7m0VarB = m5k0.b(jM126getWhite200d7_KjU, null, fetVar5, 0, 14);
                            fetVar5.r(false);
                        }
                        long j5 = ((y3d) l7m0VarB.getValue()).f41946a;
                        zcl zclVar8 = qmk.f28987a;
                        zcl zclVar9 = qmk.f28987a;
                        jcb.v(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), f17, j5, fetVar5, 0, 0);
                        fetVar5.r(false);
                        fetVar3 = fetVar5;
                    } else {
                        fet fetVar8 = fetVar;
                        fetVar8.e0(1723620913);
                        fetVar8.r(false);
                        fetVar3 = fetVar8;
                    }
                    ugdVar4 = ugdVar3;
                    twn.v((i28 >> 24) & 14, ugdVar4, fetVar3, true);
                    str5 = str7;
                    yjj0Var2 = yjj0Var5;
                    f6 = f15;
                    f5 = f16;
                    y9q0Var2 = y9q0Var4;
                    z13 = z19;
                    i26 = i30;
                    hh80Var3 = hh80Var6;
                    z12 = z18;
                    klyVar2 = klyVar4;
                    function3 = function5;
                    f8 = f13;
                    hh80Var4 = hh80Var7;
                    j2 = j4;
                    f7 = f14;
                    z14 = z31;
                    num2 = num3;
                    fetVar2 = fetVar3;
                } else {
                    ugdVar4 = ugdVar3;
                    fetVar6.X();
                    str5 = str4;
                    num2 = num;
                    z12 = z8;
                    z13 = z9;
                    y9q0Var2 = y9q0Var;
                    yjj0Var2 = yjj0Var;
                    i26 = i2;
                    klyVar2 = klyVar;
                    f5 = f;
                    f6 = f2;
                    f7 = f3;
                    hh80Var3 = hh80Var;
                    hh80Var4 = hh80Var2;
                    z14 = z10;
                    f8 = f4;
                    function3 = function1;
                    j2 = jM121getTransparent0d7_KjU;
                    fetVar2 = fetVar6;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    final ugd ugdVar5 = ugdVar4;
                    yfe0VarU.d = new Function2() { // from class: a.e36
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iL = x8x.L(i4 | 1);
                            int iL2 = x8x.L(i5);
                            int iL3 = x8x.L(i6);
                            int iL4 = x8x.L(i7);
                            h36.a(mm40Var, str, q7q0Var, str2, str3, z, z2, z3, z4, z5, oieVar, z6, z7, str5, num2, z12, vuu0Var, z13, j2, y9q0Var2, yjj0Var2, i, i26, klyVar2, f5, f6, f7, hh80Var3, hh80Var4, z14, f8, i3, a7nVar, function3, function2, ugdVar, ugdVar2, ugdVar5, (fet) obj2, iL, iL2, iL3, iL4, i8, i9);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i25 = i23 | 24576;
            if ((i7 & 196608) == 0) {
                i25 |= fetVar6.i(function2) ? 131072 : 65536;
            }
            if ((i7 & 1572864) == 0) {
                if (fetVar6.i(ugdVar)) {
                    i32 = i12;
                } else {
                    i32 = 524288;
                }
                i25 |= i32;
            }
            if ((i7 & 12582912) == 0) {
                i25 |= fetVar6.i(ugdVar2) ? 8388608 : 4194304;
            }
            if ((i7 & 100663296) == 0) {
                if (fetVar6.i(ugdVar3)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i25 |= i31;
            }
            if ((i37 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (fetVar6.U(i37 & 1, z11)) {
                fetVar6.Z();
                i27 = i4 & 1;
                obj = ukd.f35823a;
                if (i27 != 0) {
                    if (i40 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i41 == 0) {
                    }
                    if (i43 != 0) {
                        z15 = false;
                    } else {
                        z15 = z9;
                    }
                    if ((i8 & 262144) != 0) {
                        jM121getTransparent0d7_KjU = ((StaticColors) fetVar6.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                        i44 &= -234881025;
                    }
                    if ((i8 & 524288) != 0) {
                        y9q0Var3 = new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
                        i44 &= -1879048193;
                    } else {
                        y9q0Var3 = y9q0Var;
                    }
                    if (i45 != 0) {
                        yjj0Var3 = jd8.n;
                    } else {
                        yjj0Var3 = yjj0Var;
                    }
                    if (i47 == 0) {
                    }
                    if (i49 != 0) {
                        klyVar3 = kly.d;
                    } else {
                        klyVar3 = klyVar;
                    }
                    f9 = 0.0f;
                    if ((i8 & 16777216) != 0) {
                        zcl zclVar10 = qmk.f28987a;
                        i16 &= -57345;
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if ((i8 & 33554432) != 0) {
                        zcl zclVar11 = qmk.f28987a;
                        i16 &= -458753;
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if ((i8 & 67108864) != 0) {
                        zcl zclVar12 = qmk.f28987a;
                        i16 &= -3670017;
                        f12 = 0.0f;
                    } else {
                        f12 = f3;
                    }
                    Integer num6 = num4;
                    if (i17 != 0) {
                        hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT = hh80Var;
                    }
                    if (i19 != 0) {
                        hh80VarT2 = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT2 = hh80Var2;
                    }
                    if (i21 != 0) {
                        z16 = false;
                    } else {
                        z16 = z10;
                    }
                    if ((i9 & 1) != 0) {
                        zcl zclVar13 = qmk.f28987a;
                        i25 &= -113;
                    } else {
                        f9 = f4;
                    }
                    hh80 hh80Var10 = hh80VarT2;
                    if (i24 != 0) {
                        objP = fetVar6.P();
                        if (objP == obj) {
                            objP = new h26((byte) 4);
                            fetVar6.o0(objP);
                        }
                        function4 = (Function1) objP;
                    } else {
                        function4 = function1;
                    }
                    hh80Var5 = hh80Var10;
                    function5 = function4;
                    f13 = f9;
                    i28 = i25;
                    klyVar4 = klyVar3;
                    hh80Var6 = hh80VarT;
                    z17 = z16;
                    str7 = str6;
                    i29 = i44;
                    y9q0Var4 = y9q0Var3;
                    z18 = true;
                    j3 = jM121getTransparent0d7_KjU;
                    i30 = i50;
                    yjj0Var4 = yjj0Var3;
                    num3 = num6;
                    z19 = z15;
                } else {
                    if (i40 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i41 == 0) {
                    }
                    if (i43 != 0) {
                        z15 = false;
                    } else {
                        z15 = z9;
                    }
                    if ((i8 & 262144) != 0) {
                        jM121getTransparent0d7_KjU = ((StaticColors) fetVar6.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                        i44 &= -234881025;
                    }
                    if ((i8 & 524288) != 0) {
                        y9q0Var3 = new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
                        i44 &= -1879048193;
                    } else {
                        y9q0Var3 = y9q0Var;
                    }
                    if (i45 != 0) {
                        yjj0Var3 = jd8.n;
                    } else {
                        yjj0Var3 = yjj0Var;
                    }
                    if (i47 == 0) {
                    }
                    if (i49 != 0) {
                        klyVar3 = kly.d;
                    } else {
                        klyVar3 = klyVar;
                    }
                    f9 = 0.0f;
                    if ((i8 & 16777216) != 0) {
                        zcl zclVar14 = qmk.f28987a;
                        i16 &= -57345;
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if ((i8 & 33554432) != 0) {
                        zcl zclVar15 = qmk.f28987a;
                        i16 &= -458753;
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if ((i8 & 67108864) != 0) {
                        zcl zclVar16 = qmk.f28987a;
                        i16 &= -3670017;
                        f12 = 0.0f;
                    } else {
                        f12 = f3;
                    }
                    Integer num7 = num4;
                    if (i17 != 0) {
                        hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT = hh80Var;
                    }
                    if (i19 != 0) {
                        hh80VarT2 = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT2 = hh80Var2;
                    }
                    if (i21 != 0) {
                        z16 = false;
                    } else {
                        z16 = z10;
                    }
                    if ((i9 & 1) != 0) {
                        zcl zclVar17 = qmk.f28987a;
                        i25 &= -113;
                    } else {
                        f9 = f4;
                    }
                    hh80 hh80Var11 = hh80VarT2;
                    if (i24 != 0) {
                        objP = fetVar6.P();
                        if (objP == obj) {
                            objP = new h26((byte) 4);
                            fetVar6.o0(objP);
                        }
                        function4 = (Function1) objP;
                    } else {
                        function4 = function1;
                    }
                    hh80Var5 = hh80Var11;
                    function5 = function4;
                    f13 = f9;
                    i28 = i25;
                    klyVar4 = klyVar3;
                    hh80Var6 = hh80VarT;
                    z17 = z16;
                    str7 = str6;
                    i29 = i44;
                    y9q0Var4 = y9q0Var3;
                    z18 = true;
                    j3 = jM121getTransparent0d7_KjU;
                    i30 = i50;
                    yjj0Var4 = yjj0Var3;
                    num3 = num7;
                    z19 = z15;
                }
                fetVar6.s();
                Object[] objArr2 = new Object[0];
                objP2 = fetVar6.P();
                if (objP2 == obj) {
                    objP2 = new o85((byte) 20);
                    fetVar6.o0(objP2);
                }
                pz40Var = (pz40) e9x.Q(objArr2, (Function0) objP2, fetVar6, 48);
                objP3 = fetVar6.P();
                if (objP3 != obj) {
                    if (z3) {
                        jE = o9q0.b;
                    } else {
                        int length2 = str.length();
                        jE = s7n0.e(length2, length2);
                    }
                    objP3 = androidx.compose.runtime.e.e(new a8q0(str, jE, 4));
                    fetVar6.o0(objP3);
                }
                pz40Var2 = (pz40) objP3;
                if ((i29 & 7168) == 2048) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                if ((i29 & 3670016) == 1048576) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = z20 | z21;
                objP4 = fetVar6.P();
                if (z22) {
                    if (str7 == 0) {
                        objP4 = str7;
                    } else {
                        objP4 = str7;
                    }
                    fetVar6.o0(objP4);
                } else {
                    if (str7 == 0) {
                        objP4 = str7;
                    } else {
                        objP4 = str7;
                    }
                    fetVar6.o0(objP4);
                }
                str8 = (String) objP4;
                objP5 = fetVar6.P();
                if (objP5 == obj) {
                    objP5 = androidx.compose.runtime.e.e(new Pair(str, ((a8q0) pz40Var2.getValue()).f440a.b));
                    fetVar6.o0(objP5);
                }
                pz40Var3 = (pz40) objP5;
                pair = new Pair(str, ((a8q0) pz40Var2.getValue()).f440a.b);
                if (pair.equals((Pair) pz40Var3.getValue())) {
                    fetVar6.e0(-1279185355);
                    boolean zG2 = fetVar6.g(pair) | fetVar6.g(str8);
                    if ((i37 & 112) == 32) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z32 = z27 | zG2;
                    if ((i37 & 29360128) == 8388608) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z32 | z28;
                    objP8 = fetVar6.P();
                    if (z29) {
                        objP8 = new c36(pair, str8, str, z3, pz40Var3, pz40Var2);
                        str9 = str8;
                        fetVar6.o0(objP8);
                    } else {
                        objP8 = new c36(pair, str8, str, z3, pz40Var3, pz40Var2);
                        str9 = str8;
                        fetVar6.o0(objP8);
                    }
                    m0x0.D((Function0) objP8, fetVar6);
                    fetVar6.r(false);
                } else {
                    str9 = str8;
                    fetVar6.e0(-1278430009);
                    fetVar6.r(false);
                }
                if ((i37 & 896) == 256) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                objP6 = fetVar6.P();
                if (z23) {
                    objP6 = Boolean.valueOf(q7q0Var.equals(q7q0.f28265a));
                    fetVar6.o0(objP6);
                } else {
                    objP6 = Boolean.valueOf(q7q0Var.equals(q7q0.f28265a));
                    fetVar6.o0(objP6);
                }
                zBooleanValue = ((Boolean) objP6).booleanValue();
                jm40Var = jm40.b;
                if (z2) {
                    mm40VarK0 = q8a.k0(jm40Var, enx.f8115a);
                } else {
                    mm40VarK0 = jm40Var;
                }
                zfn zfnVar2 = f12370a;
                cqqVar = (cqq) fetVar6.k(zfnVar2);
                if (cqqVar == null) {
                    fetVar6.e0(-1278098774);
                    objP7 = fetVar6.P();
                    if (objP7 == obj) {
                        objP7 = new cqq();
                        fetVar6.o0(objP7);
                    }
                    cqqVar = (cqq) objP7;
                    r6 = 0;
                } else {
                    r6 = 0;
                    fetVar6.e0(790054039);
                }
                fetVar6.r(r6);
                final k6z k6zVar2 = (k6z) fetVar6.k(bmd.n);
                iA = a7nVar.a(k6zVar2);
                mm40 mm40VarE1 = o2e.e0(mm40Var, "DS_TEXT_FIELD_COLUMN");
                x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar6, r6);
                int iHashCode2 = Long.hashCode(fetVar6.T);
                bh90 bh90VarM2 = fetVar6.m();
                mm40 mm40VarC1 = kbc.c0(fetVar6, mm40VarE1);
                mkd.c0.getClass();
                fetVar6.i0();
                if (fetVar6.S) {
                    fetVar6.l(e7z.u1);
                } else {
                    fetVar6.r0();
                }
                jpm0.o(fetVar6, x5dVarA2, gqw0.x);
                jpm0.o(fetVar6, bh90VarM2, gqw0.w);
                jpm0.o(fetVar6, Integer.valueOf(iHashCode2), gqw0.y);
                jpm0.n(fetVar6);
                jpm0.o(fetVar6, mm40VarC1, gqw0.v);
                if (z7) {
                    fetVar6.e0(1715193997);
                    int i52 = i37 >> 9;
                    hh80 hh80Var12 = hh80Var5;
                    d(null, str2, str, ((Boolean) pz40Var.getValue()).booleanValue(), z3, z4, hh80Var12, q7q0Var, iA, fetVar6, ((i37 >> 6) & 112) | ((i37 << 3) & 896) | (57344 & i52) | (i52 & 458752) | ((i16 >> 6) & 3670016) | ((i37 << 15) & 29360128));
                    hh80Var7 = hh80Var12;
                    fetVar6.r(false);
                } else {
                    hh80Var7 = hh80Var5;
                    fetVar6.e0(1715566865);
                    fetVar6.r(false);
                }
                final yjj0 yjj0Var6 = yjj0Var4;
                final long j6 = j3;
                final boolean z33 = z17;
                final float f18 = f12;
                final mm40 mm40Var3 = mm40VarK0;
                final float f19 = f11;
                final float f110 = f10;
                obc.d(zfnVar2.a(cqqVar), u1c.M(1180745969, new Function2() { // from class: a.d36
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        boolean z34;
                        long jM123getWhite0d7_KjU2;
                        fet fetVar9 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (fetVar9.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            yx7 yx7Var = gqw0.k;
                            mm40 mm40VarQ = i120.Q(mm40Var3, j6, yjj0Var6);
                            zcl zclVar18 = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(mm40VarQ, 4.0f + f19, 0.0f, f18, f110, 2);
                            final boolean z35 = z3;
                            boolean zH = fetVar9.h(z35);
                            final boolean z36 = z;
                            boolean zH2 = zH | fetVar9.h(z36);
                            final Function1 function6 = function2;
                            boolean zG3 = zH2 | fetVar9.g(function6);
                            Object objP9 = fetVar9.P();
                            if (zG3 || objP9 == ukd.f35823a) {
                                objP9 = new cj(z35, z36, function6);
                                fetVar9.o0(objP9);
                            }
                            mm40 mm40VarO = kbc.O(mm40VarN, new nc40((Function1) objP9, (byte) 10));
                            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar9, 48);
                            int iHashCode3 = Long.hashCode(fetVar9.T);
                            bh90 bh90VarM3 = fetVar9.m();
                            mm40 mm40VarC2 = kbc.c0(fetVar9, mm40VarO);
                            mkd.c0.getClass();
                            fetVar9.i0();
                            boolean z37 = fetVar9.S;
                            pcy pcyVar = e7z.u1;
                            if (z37) {
                                fetVar9.l(pcyVar);
                            } else {
                                fetVar9.r0();
                            }
                            shd shdVar = gqw0.x;
                            jpm0.o(fetVar9, thg0VarA, shdVar);
                            shd shdVar2 = gqw0.w;
                            jpm0.o(fetVar9, bh90VarM3, shdVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode3);
                            shd shdVar3 = gqw0.y;
                            jpm0.o(fetVar9, numValueOf, shdVar3);
                            jpm0.n(fetVar9);
                            shd shdVar4 = gqw0.v;
                            jpm0.o(fetVar9, mm40VarC2, shdVar4);
                            ugd ugdVar6 = ugdVar;
                            final cqq cqqVar2 = cqqVar;
                            ugdVar6.F(cqqVar2, fetVar9, 0);
                            x7z x7zVar = new x7z(1.0f, true);
                            boolean z38 = z33;
                            jm40 jm40Var2 = jm40.b;
                            mm40 mm40VarE = x7zVar.e(z38 ? o7k0.e(jm40Var2, 20.0f) : o7k0.g(jm40Var2, 20.0f, 0.0f, 2));
                            tj30 tj30VarC = zq8.c(gqw0.d, false);
                            int iHashCode4 = Long.hashCode(fetVar9.T);
                            bh90 bh90VarM4 = fetVar9.m();
                            mm40 mm40VarC3 = kbc.c0(fetVar9, mm40VarE);
                            fetVar9.i0();
                            if (fetVar9.S) {
                                fetVar9.l(pcyVar);
                            } else {
                                fetVar9.r0();
                            }
                            jpm0.o(fetVar9, tj30VarC, shdVar);
                            jpm0.o(fetVar9, bh90VarM4, shdVar2);
                            vqd.u(iHashCode4, fetVar9, shdVar3, fetVar9);
                            jpm0.o(fetVar9, mm40VarC3, shdVar4);
                            if (zBooleanValue) {
                                fetVar9.e0(-1480645274);
                                jM123getWhite0d7_KjU2 = ((ThemeColors) fetVar9.k(zaq0.b)).getTextPrimary();
                                z34 = false;
                            } else {
                                z34 = false;
                                fetVar9.e0(-1480643968);
                                jM123getWhite0d7_KjU2 = ((StaticColors) fetVar9.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                            }
                            fetVar9.r(z34);
                            final long j7 = jM123getWhite0d7_KjU2;
                            k6z k6zVar3 = k6z.b;
                            k6z k6zVar4 = k6zVar2;
                            boolean z39 = k6zVar4 == k6zVar3 ? true : z34;
                            y9q0 y9q0Var5 = y9q0Var4;
                            boolean z310 = z6;
                            int i53 = iA;
                            final y9q0 y9q0VarE = h36.e(y9q0Var5, j7, z39, z310, i53);
                            k6z k6zVar5 = k6zVar4;
                            String str10 = str;
                            k6z k6zVarG = pkd.g(str10, fetVar9);
                            if (a7nVar == a7n.f379a || z310) {
                                k6zVar5 = k6zVarG;
                            }
                            l5d0 l5d0VarA = bmd.n.a(k6zVar5);
                            final int i54 = i;
                            final int i55 = i3;
                            final int i56 = i30;
                            final oie oieVar2 = oieVar;
                            final boolean z311 = z2;
                            final hh80 hh80Var13 = hh80Var6;
                            final pz40 pz40Var4 = pz40Var;
                            final boolean z40 = z18;
                            final String str11 = str9;
                            final Integer num8 = num3;
                            final kly klyVar5 = klyVar4;
                            final vuu0 vuu0Var2 = vuu0Var;
                            final Function1 function7 = function5;
                            final pz40 pz40Var5 = pz40Var2;
                            obc.d(l5d0VarA, u1c.M(-1401398373, new Function2() { // from class: a.f36
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    fet fetVar10 = (fet) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (fetVar10.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        pz40 pz40Var6 = pz40Var5;
                                        a8q0 a8q0Var = (a8q0) pz40Var6.getValue();
                                        skk0 skk0Var = new skk0(j7);
                                        int i57 = i54;
                                        uly ulyVar = new uly(i55, Boolean.valueOf(!(i57 == 7)), i57, i56, 112);
                                        oie oieVar3 = oieVar2;
                                        boolean zI = fetVar10.i(oieVar3);
                                        Object objP10 = fetVar10.P();
                                        cl5 cl5Var = ukd.f35823a;
                                        if (zI || objP10 == cl5Var) {
                                            objP10 = new os5(oieVar3, (byte) 2);
                                            fetVar10.o0(objP10);
                                        }
                                        mm40 mm40VarD = o7k0.d(pai0.a(jm40.b, false, (Function1) objP10), 1.0f);
                                        boolean z41 = z311;
                                        mm40 mm40VarI = s5x0.I(o7k0.w(mm40VarD, null, z41, 1), hh80Var13);
                                        pz40 pz40Var7 = pz40Var4;
                                        boolean zG4 = fetVar10.g(pz40Var7);
                                        boolean z42 = z40;
                                        boolean zH3 = zG4 | fetVar10.h(z42);
                                        Object objP11 = fetVar10.P();
                                        if (zH3 || objP11 == cl5Var) {
                                            objP11 = new b36(z42, pz40Var7, pz40Var6, (byte) 0);
                                            fetVar10.o0(objP11);
                                        }
                                        mm40 mm40VarE2 = o2e.e0(y860.b0(j120.b0(mm40VarI, (Function1) objP11), cqqVar2), "BASE_TEXT_FIELD_TAG");
                                        String str12 = str11;
                                        boolean zG5 = fetVar10.g(str12);
                                        Integer num9 = num8;
                                        boolean zG6 = zG5 | fetVar10.g(num9);
                                        Function1 function8 = function6;
                                        boolean zG7 = zG6 | fetVar10.g(function8);
                                        Object objP12 = fetVar10.P();
                                        if (zG7 || objP12 == cl5Var) {
                                            dc0 dc0Var = new dc0(str12, num9, function8, pz40Var6, (byte) 12);
                                            fetVar10.o0(dc0Var);
                                            objP12 = dc0Var;
                                        }
                                        z96.a(a8q0Var, (Function1) objP12, mm40VarE2, z36, z35, y9q0VarE, ulyVar, klyVar5, z41, 0, 0, vuu0Var2, function7, null, skk0Var, null, fetVar10, 0, 0, 42496);
                                    } else {
                                        fetVar10.X();
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar9), fetVar9, 56);
                            boolean zBooleanValue4 = ((Boolean) pz40Var4.getValue()).booleanValue();
                            mm40 mm40VarW = o7k0.w(jm40Var2, null, true, 1);
                            String str12 = str2;
                            boolean z41 = z4;
                            q7q0 q7q0Var2 = q7q0Var;
                            h36.b(mm40VarW, str10, str12, zBooleanValue4, z41, z35, q7q0Var2, i53, fetVar9, 6);
                            h36.c(o7k0.w(jm40Var2, null, true, 1), str10, str3, q7q0Var2, ((Boolean) pz40Var4.getValue()).booleanValue(), z35, z19, z310, i53, fetVar9, 6);
                            fetVar9.r(true);
                            ugdVar2.invoke(fetVar9, 0);
                            fetVar9.r(true);
                        } else {
                            fetVar9.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, 56);
                if (z5) {
                    fetVar.e0(1723121844);
                    zBooleanValue2 = ((Boolean) pz40Var.getValue()).booleanValue();
                    if (str.length() == 0) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (z4) {
                        fetVar4 = fetVar;
                        if (zBooleanValue2) {
                            fetVar4.e0(196486584);
                            zcl zclVar18 = qmk.f28987a;
                            l7m0VarA = d43.a(2.0f, null, null, fetVar4, 0, 14);
                            fetVar4.r(false);
                            fetVar5 = fetVar4;
                        } else {
                            fetVar4.e0(196489240);
                            zcl zclVar19 = qmk.f28987a;
                            l7m0VarA = d43.a(1.0f, null, null, fetVar4, 0, 14);
                            fetVar4.r(false);
                            fetVar5 = fetVar4;
                        }
                    } else {
                        fetVar4 = fetVar;
                        if (zBooleanValue2) {
                            fetVar4.e0(196486584);
                            zcl zclVar110 = qmk.f28987a;
                            l7m0VarA = d43.a(2.0f, null, null, fetVar4, 0, 14);
                            fetVar4.r(false);
                            fetVar5 = fetVar4;
                        } else {
                            fetVar4.e0(196489240);
                            zcl zclVar111 = qmk.f28987a;
                            l7m0VarA = d43.a(1.0f, null, null, fetVar4, 0, 14);
                            fetVar4.r(false);
                            fetVar5 = fetVar4;
                        }
                    }
                    float f111 = ((ycl) l7m0VarA.getValue()).f42389a;
                    zBooleanValue3 = ((Boolean) pz40Var.getValue()).booleanValue();
                    if (z4) {
                        fetVar5.e0(-446232517);
                        if (zBooleanValue) {
                            fetVar5.e0(-446230107);
                            jM113getRed0d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getWarning();
                            z26 = false;
                        } else {
                            z26 = false;
                            fetVar5.e0(-446228927);
                            jM113getRed0d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m113getRed0d7_KjU();
                        }
                        fetVar5.r(z26);
                        l7m0VarB = m5k0.b(jM113getRed0d7_KjU, null, fetVar5, 0, 14);
                        fetVar5.r(z26);
                    } else if (zBooleanValue3) {
                        fetVar5.e0(-446228003);
                        if (zBooleanValue) {
                            fetVar5.e0(-446225595);
                            jM123getWhite0d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getPrimary();
                            z25 = false;
                        } else {
                            z25 = false;
                            fetVar5.e0(-446224413);
                            jM123getWhite0d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                        }
                        fetVar5.r(z25);
                        l7m0VarB = m5k0.b(jM123getWhite0d7_KjU, null, fetVar5, 0, 14);
                        fetVar5.r(z25);
                    } else {
                        fetVar5.e0(-446223517);
                        if (zBooleanValue) {
                            fetVar5.e0(-446221111);
                            jM126getWhite200d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary40();
                        } else {
                            fetVar5.e0(-446219803);
                            jM126getWhite200d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m126getWhite200d7_KjU();
                        }
                        fetVar5.r(false);
                        l7m0VarB = m5k0.b(jM126getWhite200d7_KjU, null, fetVar5, 0, 14);
                        fetVar5.r(false);
                    }
                    long j7 = ((y3d) l7m0VarB.getValue()).f41946a;
                    zcl zclVar20 = qmk.f28987a;
                    zcl zclVar21 = qmk.f28987a;
                    jcb.v(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), f111, j7, fetVar5, 0, 0);
                    fetVar5.r(false);
                    fetVar3 = fetVar5;
                } else {
                    fet fetVar9 = fetVar;
                    fetVar9.e0(1723620913);
                    fetVar9.r(false);
                    fetVar3 = fetVar9;
                }
                ugdVar4 = ugdVar3;
                twn.v((i28 >> 24) & 14, ugdVar4, fetVar3, true);
                str5 = str7;
                yjj0Var2 = yjj0Var6;
                f6 = f19;
                f5 = f110;
                y9q0Var2 = y9q0Var4;
                z13 = z19;
                i26 = i30;
                hh80Var3 = hh80Var6;
                z12 = z18;
                klyVar2 = klyVar4;
                function3 = function5;
                f8 = f13;
                hh80Var4 = hh80Var7;
                j2 = j6;
                f7 = f18;
                z14 = z33;
                num2 = num3;
                fetVar2 = fetVar3;
            } else {
                ugdVar4 = ugdVar3;
                fetVar6.X();
                str5 = str4;
                num2 = num;
                z12 = z8;
                z13 = z9;
                y9q0Var2 = y9q0Var;
                yjj0Var2 = yjj0Var;
                i26 = i2;
                klyVar2 = klyVar;
                f5 = f;
                f6 = f2;
                f7 = f3;
                hh80Var3 = hh80Var;
                hh80Var4 = hh80Var2;
                z14 = z10;
                f8 = f4;
                function3 = function1;
                j2 = jM121getTransparent0d7_KjU;
                fetVar2 = fetVar6;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                final ugd ugdVar6 = ugdVar4;
                yfe0VarU.d = new Function2() { // from class: a.e36
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iL = x8x.L(i4 | 1);
                        int iL2 = x8x.L(i5);
                        int iL3 = x8x.L(i6);
                        int iL4 = x8x.L(i7);
                        h36.a(mm40Var, str, q7q0Var, str2, str3, z, z2, z3, z4, z5, oieVar, z6, z7, str5, num2, z12, vuu0Var, z13, j2, y9q0Var2, yjj0Var2, i, i26, klyVar2, f5, f6, f7, hh80Var3, hh80Var4, z14, f8, i3, a7nVar, function3, function2, ugdVar, ugdVar2, ugdVar6, (fet) obj2, iL, iL2, iL3, iL4, i8, i9);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i16 = i15 | 3072;
        if ((i6 & 24576) != 0) {
            i16 |= ((i8 & 16777216) == 0 || !fetVar6.d(f)) ? 8192 : 16384;
        }
        if ((i6 & 196608) != 0) {
            if ((i8 & 33554432) == 0) {
                i34 = 65536;
            } else {
                i34 = 65536;
            }
            i16 |= i34;
        }
        if ((i6 & 1572864) != 0) {
            if ((i8 & 67108864) == 0) {
                i33 = 524288;
            } else {
                i33 = 524288;
            }
            i16 |= i33;
        }
        i17 = i8 & 134217728;
        if (i17 != 0) {
            i16 |= 12582912;
        } else if ((i6 & 12582912) == 0) {
            if (fetVar6.g(hh80Var)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i16 |= i18;
        }
        i19 = i8 & 268435456;
        if (i19 != 0) {
            i16 |= 100663296;
        } else if ((i6 & 100663296) == 0) {
            if (fetVar6.g(hh80Var2)) {
                i20 = 67108864;
            } else {
                i20 = 33554432;
            }
            i16 |= i20;
        }
        i21 = i8 & 536870912;
        if (i21 != 0) {
            i16 |= 805306368;
        } else if ((i6 & 805306368) == 0) {
            i16 |= fetVar6.h(z10) ? 536870912 : 268435456;
        }
        if ((i8 & 1073741824) != 0) {
            i22 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i22 = i7 | (fetVar6.h(false) ? 4 : 2);
        } else {
            i22 = i7;
        }
        if ((i7 & 48) != 0) {
            if ((i9 & 1) == 0) {
                i35 = 32;
            }
            i22 |= i35;
        }
        if ((i7 & 384) != 0) {
            i22 |= fetVar6.e(i3) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            if (a7nVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = a7nVar.ordinal();
            }
            i22 |= fetVar6.e(iOrdinal) ? 2048 : 1024;
        }
        i23 = i22;
        i24 = i9 & 8;
        if (i24 != 0) {
            i25 = i23;
            if ((i7 & 24576) == 0) {
                i25 |= fetVar6.i(function1) ? 16384 : 8192;
            }
            if ((i7 & 196608) == 0) {
                i25 |= fetVar6.i(function2) ? 131072 : 65536;
            }
            if ((i7 & 1572864) == 0) {
                if (fetVar6.i(ugdVar)) {
                    i32 = i12;
                } else {
                    i32 = 524288;
                }
                i25 |= i32;
            }
            if ((i7 & 12582912) == 0) {
                i25 |= fetVar6.i(ugdVar2) ? 8388608 : 4194304;
            }
            if ((i7 & 100663296) == 0) {
                if (fetVar6.i(ugdVar3)) {
                    i31 = 67108864;
                } else {
                    i31 = 33554432;
                }
                i25 |= i31;
            }
            if ((i37 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (fetVar6.U(i37 & 1, z11)) {
                fetVar6.Z();
                i27 = i4 & 1;
                obj = ukd.f35823a;
                if (i27 != 0) {
                    if (i40 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i41 == 0) {
                    }
                    if (i43 != 0) {
                        z15 = false;
                    } else {
                        z15 = z9;
                    }
                    if ((i8 & 262144) != 0) {
                        jM121getTransparent0d7_KjU = ((StaticColors) fetVar6.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                        i44 &= -234881025;
                    }
                    if ((i8 & 524288) != 0) {
                        y9q0Var3 = new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
                        i44 &= -1879048193;
                    } else {
                        y9q0Var3 = y9q0Var;
                    }
                    if (i45 != 0) {
                        yjj0Var3 = jd8.n;
                    } else {
                        yjj0Var3 = yjj0Var;
                    }
                    if (i47 == 0) {
                    }
                    if (i49 != 0) {
                        klyVar3 = kly.d;
                    } else {
                        klyVar3 = klyVar;
                    }
                    f9 = 0.0f;
                    if ((i8 & 16777216) != 0) {
                        zcl zclVar112 = qmk.f28987a;
                        i16 &= -57345;
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if ((i8 & 33554432) != 0) {
                        zcl zclVar113 = qmk.f28987a;
                        i16 &= -458753;
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if ((i8 & 67108864) != 0) {
                        zcl zclVar114 = qmk.f28987a;
                        i16 &= -3670017;
                        f12 = 0.0f;
                    } else {
                        f12 = f3;
                    }
                    Integer num8 = num4;
                    if (i17 != 0) {
                        hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT = hh80Var;
                    }
                    if (i19 != 0) {
                        hh80VarT2 = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT2 = hh80Var2;
                    }
                    if (i21 != 0) {
                        z16 = false;
                    } else {
                        z16 = z10;
                    }
                    if ((i9 & 1) != 0) {
                        zcl zclVar115 = qmk.f28987a;
                        i25 &= -113;
                    } else {
                        f9 = f4;
                    }
                    hh80 hh80Var13 = hh80VarT2;
                    if (i24 != 0) {
                        objP = fetVar6.P();
                        if (objP == obj) {
                            objP = new h26((byte) 4);
                            fetVar6.o0(objP);
                        }
                        function4 = (Function1) objP;
                    } else {
                        function4 = function1;
                    }
                    hh80Var5 = hh80Var13;
                    function5 = function4;
                    f13 = f9;
                    i28 = i25;
                    klyVar4 = klyVar3;
                    hh80Var6 = hh80VarT;
                    z17 = z16;
                    str7 = str6;
                    i29 = i44;
                    y9q0Var4 = y9q0Var3;
                    z18 = true;
                    j3 = jM121getTransparent0d7_KjU;
                    i30 = i50;
                    yjj0Var4 = yjj0Var3;
                    num3 = num8;
                    z19 = z15;
                } else {
                    if (i40 != 0) {
                        str6 = null;
                    } else {
                        str6 = str4;
                    }
                    if (i41 == 0) {
                    }
                    if (i43 != 0) {
                        z15 = false;
                    } else {
                        z15 = z9;
                    }
                    if ((i8 & 262144) != 0) {
                        jM121getTransparent0d7_KjU = ((StaticColors) fetVar6.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                        i44 &= -234881025;
                    }
                    if ((i8 & 524288) != 0) {
                        y9q0Var3 = new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
                        i44 &= -1879048193;
                    } else {
                        y9q0Var3 = y9q0Var;
                    }
                    if (i45 != 0) {
                        yjj0Var3 = jd8.n;
                    } else {
                        yjj0Var3 = yjj0Var;
                    }
                    if (i47 == 0) {
                    }
                    if (i49 != 0) {
                        klyVar3 = kly.d;
                    } else {
                        klyVar3 = klyVar;
                    }
                    f9 = 0.0f;
                    if ((i8 & 16777216) != 0) {
                        zcl zclVar116 = qmk.f28987a;
                        i16 &= -57345;
                        f10 = 0.0f;
                    } else {
                        f10 = f;
                    }
                    if ((i8 & 33554432) != 0) {
                        zcl zclVar117 = qmk.f28987a;
                        i16 &= -458753;
                        f11 = 0.0f;
                    } else {
                        f11 = f2;
                    }
                    if ((i8 & 67108864) != 0) {
                        zcl zclVar118 = qmk.f28987a;
                        i16 &= -3670017;
                        f12 = 0.0f;
                    } else {
                        f12 = f3;
                    }
                    Integer num9 = num4;
                    if (i17 != 0) {
                        hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT = hh80Var;
                    }
                    if (i19 != 0) {
                        hh80VarT2 = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT2 = hh80Var2;
                    }
                    if (i21 != 0) {
                        z16 = false;
                    } else {
                        z16 = z10;
                    }
                    if ((i9 & 1) != 0) {
                        zcl zclVar119 = qmk.f28987a;
                        i25 &= -113;
                    } else {
                        f9 = f4;
                    }
                    hh80 hh80Var14 = hh80VarT2;
                    if (i24 != 0) {
                        objP = fetVar6.P();
                        if (objP == obj) {
                            objP = new h26((byte) 4);
                            fetVar6.o0(objP);
                        }
                        function4 = (Function1) objP;
                    } else {
                        function4 = function1;
                    }
                    hh80Var5 = hh80Var14;
                    function5 = function4;
                    f13 = f9;
                    i28 = i25;
                    klyVar4 = klyVar3;
                    hh80Var6 = hh80VarT;
                    z17 = z16;
                    str7 = str6;
                    i29 = i44;
                    y9q0Var4 = y9q0Var3;
                    z18 = true;
                    j3 = jM121getTransparent0d7_KjU;
                    i30 = i50;
                    yjj0Var4 = yjj0Var3;
                    num3 = num9;
                    z19 = z15;
                }
                fetVar6.s();
                Object[] objArr3 = new Object[0];
                objP2 = fetVar6.P();
                if (objP2 == obj) {
                    objP2 = new o85((byte) 20);
                    fetVar6.o0(objP2);
                }
                pz40Var = (pz40) e9x.Q(objArr3, (Function0) objP2, fetVar6, 48);
                objP3 = fetVar6.P();
                if (objP3 != obj) {
                    if (z3) {
                        jE = o9q0.b;
                    } else {
                        int length3 = str.length();
                        jE = s7n0.e(length3, length3);
                    }
                    objP3 = androidx.compose.runtime.e.e(new a8q0(str, jE, 4));
                    fetVar6.o0(objP3);
                }
                pz40Var2 = (pz40) objP3;
                if ((i29 & 7168) == 2048) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                if ((i29 & 3670016) == 1048576) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                z22 = z20 | z21;
                objP4 = fetVar6.P();
                if (z22) {
                    if (str7 == 0) {
                        objP4 = str7;
                    } else {
                        objP4 = str7;
                    }
                    fetVar6.o0(objP4);
                } else {
                    if (str7 == 0) {
                        objP4 = str7;
                    } else {
                        objP4 = str7;
                    }
                    fetVar6.o0(objP4);
                }
                str8 = (String) objP4;
                objP5 = fetVar6.P();
                if (objP5 == obj) {
                    objP5 = androidx.compose.runtime.e.e(new Pair(str, ((a8q0) pz40Var2.getValue()).f440a.b));
                    fetVar6.o0(objP5);
                }
                pz40Var3 = (pz40) objP5;
                pair = new Pair(str, ((a8q0) pz40Var2.getValue()).f440a.b);
                if (pair.equals((Pair) pz40Var3.getValue())) {
                    fetVar6.e0(-1279185355);
                    boolean zG3 = fetVar6.g(pair) | fetVar6.g(str8);
                    if ((i37 & 112) == 32) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean z34 = z27 | zG3;
                    if ((i37 & 29360128) == 8388608) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z34 | z28;
                    objP8 = fetVar6.P();
                    if (z29) {
                        objP8 = new c36(pair, str8, str, z3, pz40Var3, pz40Var2);
                        str9 = str8;
                        fetVar6.o0(objP8);
                    } else {
                        objP8 = new c36(pair, str8, str, z3, pz40Var3, pz40Var2);
                        str9 = str8;
                        fetVar6.o0(objP8);
                    }
                    m0x0.D((Function0) objP8, fetVar6);
                    fetVar6.r(false);
                } else {
                    str9 = str8;
                    fetVar6.e0(-1278430009);
                    fetVar6.r(false);
                }
                if ((i37 & 896) == 256) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                objP6 = fetVar6.P();
                if (z23) {
                    objP6 = Boolean.valueOf(q7q0Var.equals(q7q0.f28265a));
                    fetVar6.o0(objP6);
                } else {
                    objP6 = Boolean.valueOf(q7q0Var.equals(q7q0.f28265a));
                    fetVar6.o0(objP6);
                }
                zBooleanValue = ((Boolean) objP6).booleanValue();
                jm40Var = jm40.b;
                if (z2) {
                    mm40VarK0 = q8a.k0(jm40Var, enx.f8115a);
                } else {
                    mm40VarK0 = jm40Var;
                }
                zfn zfnVar3 = f12370a;
                cqqVar = (cqq) fetVar6.k(zfnVar3);
                if (cqqVar == null) {
                    fetVar6.e0(-1278098774);
                    objP7 = fetVar6.P();
                    if (objP7 == obj) {
                        objP7 = new cqq();
                        fetVar6.o0(objP7);
                    }
                    cqqVar = (cqq) objP7;
                    r6 = 0;
                } else {
                    r6 = 0;
                    fetVar6.e0(790054039);
                }
                fetVar6.r(r6);
                final k6z k6zVar3 = (k6z) fetVar6.k(bmd.n);
                iA = a7nVar.a(k6zVar3);
                mm40 mm40VarE2 = o2e.e0(mm40Var, "DS_TEXT_FIELD_COLUMN");
                x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar6, r6);
                int iHashCode3 = Long.hashCode(fetVar6.T);
                bh90 bh90VarM3 = fetVar6.m();
                mm40 mm40VarC2 = kbc.c0(fetVar6, mm40VarE2);
                mkd.c0.getClass();
                fetVar6.i0();
                if (fetVar6.S) {
                    fetVar6.l(e7z.u1);
                } else {
                    fetVar6.r0();
                }
                jpm0.o(fetVar6, x5dVarA3, gqw0.x);
                jpm0.o(fetVar6, bh90VarM3, gqw0.w);
                jpm0.o(fetVar6, Integer.valueOf(iHashCode3), gqw0.y);
                jpm0.n(fetVar6);
                jpm0.o(fetVar6, mm40VarC2, gqw0.v);
                if (z7) {
                    fetVar6.e0(1715193997);
                    int i53 = i37 >> 9;
                    hh80 hh80Var15 = hh80Var5;
                    d(null, str2, str, ((Boolean) pz40Var.getValue()).booleanValue(), z3, z4, hh80Var15, q7q0Var, iA, fetVar6, ((i37 >> 6) & 112) | ((i37 << 3) & 896) | (57344 & i53) | (i53 & 458752) | ((i16 >> 6) & 3670016) | ((i37 << 15) & 29360128));
                    hh80Var7 = hh80Var15;
                    fetVar6.r(false);
                } else {
                    hh80Var7 = hh80Var5;
                    fetVar6.e0(1715566865);
                    fetVar6.r(false);
                }
                final yjj0 yjj0Var7 = yjj0Var4;
                final long j8 = j3;
                final boolean z35 = z17;
                final float f112 = f12;
                final mm40 mm40Var4 = mm40VarK0;
                final float f113 = f11;
                final float f114 = f10;
                obc.d(zfnVar3.a(cqqVar), u1c.M(1180745969, new Function2() { // from class: a.d36
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        boolean z36;
                        long jM123getWhite0d7_KjU2;
                        fet fetVar10 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if (fetVar10.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            yx7 yx7Var = gqw0.k;
                            mm40 mm40VarQ = i120.Q(mm40Var4, j8, yjj0Var7);
                            zcl zclVar120 = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(mm40VarQ, 4.0f + f113, 0.0f, f112, f114, 2);
                            final boolean z37 = z3;
                            boolean zH = fetVar10.h(z37);
                            final boolean z38 = z;
                            boolean zH2 = zH | fetVar10.h(z38);
                            final Function1 function6 = function2;
                            boolean zG4 = zH2 | fetVar10.g(function6);
                            Object objP9 = fetVar10.P();
                            if (zG4 || objP9 == ukd.f35823a) {
                                objP9 = new cj(z37, z38, function6);
                                fetVar10.o0(objP9);
                            }
                            mm40 mm40VarO = kbc.O(mm40VarN, new nc40((Function1) objP9, (byte) 10));
                            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar10, 48);
                            int iHashCode4 = Long.hashCode(fetVar10.T);
                            bh90 bh90VarM4 = fetVar10.m();
                            mm40 mm40VarC3 = kbc.c0(fetVar10, mm40VarO);
                            mkd.c0.getClass();
                            fetVar10.i0();
                            boolean z39 = fetVar10.S;
                            pcy pcyVar = e7z.u1;
                            if (z39) {
                                fetVar10.l(pcyVar);
                            } else {
                                fetVar10.r0();
                            }
                            shd shdVar = gqw0.x;
                            jpm0.o(fetVar10, thg0VarA, shdVar);
                            shd shdVar2 = gqw0.w;
                            jpm0.o(fetVar10, bh90VarM4, shdVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode4);
                            shd shdVar3 = gqw0.y;
                            jpm0.o(fetVar10, numValueOf, shdVar3);
                            jpm0.n(fetVar10);
                            shd shdVar4 = gqw0.v;
                            jpm0.o(fetVar10, mm40VarC3, shdVar4);
                            ugd ugdVar7 = ugdVar;
                            final cqq cqqVar2 = cqqVar;
                            ugdVar7.F(cqqVar2, fetVar10, 0);
                            x7z x7zVar = new x7z(1.0f, true);
                            boolean z310 = z35;
                            jm40 jm40Var2 = jm40.b;
                            mm40 mm40VarE = x7zVar.e(z310 ? o7k0.e(jm40Var2, 20.0f) : o7k0.g(jm40Var2, 20.0f, 0.0f, 2));
                            tj30 tj30VarC = zq8.c(gqw0.d, false);
                            int iHashCode5 = Long.hashCode(fetVar10.T);
                            bh90 bh90VarM5 = fetVar10.m();
                            mm40 mm40VarC4 = kbc.c0(fetVar10, mm40VarE);
                            fetVar10.i0();
                            if (fetVar10.S) {
                                fetVar10.l(pcyVar);
                            } else {
                                fetVar10.r0();
                            }
                            jpm0.o(fetVar10, tj30VarC, shdVar);
                            jpm0.o(fetVar10, bh90VarM5, shdVar2);
                            vqd.u(iHashCode5, fetVar10, shdVar3, fetVar10);
                            jpm0.o(fetVar10, mm40VarC4, shdVar4);
                            if (zBooleanValue) {
                                fetVar10.e0(-1480645274);
                                jM123getWhite0d7_KjU2 = ((ThemeColors) fetVar10.k(zaq0.b)).getTextPrimary();
                                z36 = false;
                            } else {
                                z36 = false;
                                fetVar10.e0(-1480643968);
                                jM123getWhite0d7_KjU2 = ((StaticColors) fetVar10.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                            }
                            fetVar10.r(z36);
                            final long j9 = jM123getWhite0d7_KjU2;
                            k6z k6zVar4 = k6z.b;
                            k6z k6zVar5 = k6zVar3;
                            boolean z311 = k6zVar5 == k6zVar4 ? true : z36;
                            y9q0 y9q0Var5 = y9q0Var4;
                            boolean z312 = z6;
                            int i54 = iA;
                            final y9q0 y9q0VarE = h36.e(y9q0Var5, j9, z311, z312, i54);
                            k6z k6zVar6 = k6zVar5;
                            String str10 = str;
                            k6z k6zVarG = pkd.g(str10, fetVar10);
                            if (a7nVar == a7n.f379a || z312) {
                                k6zVar6 = k6zVarG;
                            }
                            l5d0 l5d0VarA = bmd.n.a(k6zVar6);
                            final int i55 = i;
                            final int i56 = i3;
                            final int i57 = i30;
                            final oie oieVar2 = oieVar;
                            final boolean z313 = z2;
                            final hh80 hh80Var16 = hh80Var6;
                            final pz40 pz40Var4 = pz40Var;
                            final boolean z40 = z18;
                            final String str11 = str9;
                            final Integer num10 = num3;
                            final kly klyVar5 = klyVar4;
                            final vuu0 vuu0Var2 = vuu0Var;
                            final Function1 function7 = function5;
                            final pz40 pz40Var5 = pz40Var2;
                            obc.d(l5d0VarA, u1c.M(-1401398373, new Function2() { // from class: a.f36
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    fet fetVar11 = (fet) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (fetVar11.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        pz40 pz40Var6 = pz40Var5;
                                        a8q0 a8q0Var = (a8q0) pz40Var6.getValue();
                                        skk0 skk0Var = new skk0(j9);
                                        int i58 = i55;
                                        uly ulyVar = new uly(i56, Boolean.valueOf(!(i58 == 7)), i58, i57, 112);
                                        oie oieVar3 = oieVar2;
                                        boolean zI = fetVar11.i(oieVar3);
                                        Object objP10 = fetVar11.P();
                                        cl5 cl5Var = ukd.f35823a;
                                        if (zI || objP10 == cl5Var) {
                                            objP10 = new os5(oieVar3, (byte) 2);
                                            fetVar11.o0(objP10);
                                        }
                                        mm40 mm40VarD = o7k0.d(pai0.a(jm40.b, false, (Function1) objP10), 1.0f);
                                        boolean z41 = z313;
                                        mm40 mm40VarI = s5x0.I(o7k0.w(mm40VarD, null, z41, 1), hh80Var16);
                                        pz40 pz40Var7 = pz40Var4;
                                        boolean zG5 = fetVar11.g(pz40Var7);
                                        boolean z42 = z40;
                                        boolean zH3 = zG5 | fetVar11.h(z42);
                                        Object objP11 = fetVar11.P();
                                        if (zH3 || objP11 == cl5Var) {
                                            objP11 = new b36(z42, pz40Var7, pz40Var6, (byte) 0);
                                            fetVar11.o0(objP11);
                                        }
                                        mm40 mm40VarE3 = o2e.e0(y860.b0(j120.b0(mm40VarI, (Function1) objP11), cqqVar2), "BASE_TEXT_FIELD_TAG");
                                        String str12 = str11;
                                        boolean zG6 = fetVar11.g(str12);
                                        Integer num11 = num10;
                                        boolean zG7 = zG6 | fetVar11.g(num11);
                                        Function1 function8 = function6;
                                        boolean zG8 = zG7 | fetVar11.g(function8);
                                        Object objP12 = fetVar11.P();
                                        if (zG8 || objP12 == cl5Var) {
                                            dc0 dc0Var = new dc0(str12, num11, function8, pz40Var6, (byte) 12);
                                            fetVar11.o0(dc0Var);
                                            objP12 = dc0Var;
                                        }
                                        z96.a(a8q0Var, (Function1) objP12, mm40VarE3, z38, z37, y9q0VarE, ulyVar, klyVar5, z41, 0, 0, vuu0Var2, function7, null, skk0Var, null, fetVar11, 0, 0, 42496);
                                    } else {
                                        fetVar11.X();
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar10), fetVar10, 56);
                            boolean zBooleanValue4 = ((Boolean) pz40Var4.getValue()).booleanValue();
                            mm40 mm40VarW = o7k0.w(jm40Var2, null, true, 1);
                            String str12 = str2;
                            boolean z41 = z4;
                            q7q0 q7q0Var2 = q7q0Var;
                            h36.b(mm40VarW, str10, str12, zBooleanValue4, z41, z37, q7q0Var2, i54, fetVar10, 6);
                            h36.c(o7k0.w(jm40Var2, null, true, 1), str10, str3, q7q0Var2, ((Boolean) pz40Var4.getValue()).booleanValue(), z37, z19, z312, i54, fetVar10, 6);
                            fetVar10.r(true);
                            ugdVar2.invoke(fetVar10, 0);
                            fetVar10.r(true);
                        } else {
                            fetVar10.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, 56);
                if (z5) {
                    fetVar.e0(1723121844);
                    zBooleanValue2 = ((Boolean) pz40Var.getValue()).booleanValue();
                    if (str.length() == 0) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    if (z4) {
                        fetVar4 = fetVar;
                        if (zBooleanValue2) {
                            fetVar4.e0(196486584);
                            zcl zclVar1110 = qmk.f28987a;
                            l7m0VarA = d43.a(2.0f, null, null, fetVar4, 0, 14);
                            fetVar4.r(false);
                            fetVar5 = fetVar4;
                        } else {
                            fetVar4.e0(196489240);
                            zcl zclVar1111 = qmk.f28987a;
                            l7m0VarA = d43.a(1.0f, null, null, fetVar4, 0, 14);
                            fetVar4.r(false);
                            fetVar5 = fetVar4;
                        }
                    } else {
                        fetVar4 = fetVar;
                        if (zBooleanValue2) {
                            fetVar4.e0(196486584);
                            zcl zclVar1112 = qmk.f28987a;
                            l7m0VarA = d43.a(2.0f, null, null, fetVar4, 0, 14);
                            fetVar4.r(false);
                            fetVar5 = fetVar4;
                        } else {
                            fetVar4.e0(196489240);
                            zcl zclVar1113 = qmk.f28987a;
                            l7m0VarA = d43.a(1.0f, null, null, fetVar4, 0, 14);
                            fetVar4.r(false);
                            fetVar5 = fetVar4;
                        }
                    }
                    float f115 = ((ycl) l7m0VarA.getValue()).f42389a;
                    zBooleanValue3 = ((Boolean) pz40Var.getValue()).booleanValue();
                    if (z4) {
                        fetVar5.e0(-446232517);
                        if (zBooleanValue) {
                            fetVar5.e0(-446230107);
                            jM113getRed0d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getWarning();
                            z26 = false;
                        } else {
                            z26 = false;
                            fetVar5.e0(-446228927);
                            jM113getRed0d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m113getRed0d7_KjU();
                        }
                        fetVar5.r(z26);
                        l7m0VarB = m5k0.b(jM113getRed0d7_KjU, null, fetVar5, 0, 14);
                        fetVar5.r(z26);
                    } else if (zBooleanValue3) {
                        fetVar5.e0(-446228003);
                        if (zBooleanValue) {
                            fetVar5.e0(-446225595);
                            jM123getWhite0d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getPrimary();
                            z25 = false;
                        } else {
                            z25 = false;
                            fetVar5.e0(-446224413);
                            jM123getWhite0d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                        }
                        fetVar5.r(z25);
                        l7m0VarB = m5k0.b(jM123getWhite0d7_KjU, null, fetVar5, 0, 14);
                        fetVar5.r(z25);
                    } else {
                        fetVar5.e0(-446223517);
                        if (zBooleanValue) {
                            fetVar5.e0(-446221111);
                            jM126getWhite200d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary40();
                        } else {
                            fetVar5.e0(-446219803);
                            jM126getWhite200d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m126getWhite200d7_KjU();
                        }
                        fetVar5.r(false);
                        l7m0VarB = m5k0.b(jM126getWhite200d7_KjU, null, fetVar5, 0, 14);
                        fetVar5.r(false);
                    }
                    long j9 = ((y3d) l7m0VarB.getValue()).f41946a;
                    zcl zclVar22 = qmk.f28987a;
                    zcl zclVar23 = qmk.f28987a;
                    jcb.v(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), f115, j9, fetVar5, 0, 0);
                    fetVar5.r(false);
                    fetVar3 = fetVar5;
                } else {
                    fet fetVar10 = fetVar;
                    fetVar10.e0(1723620913);
                    fetVar10.r(false);
                    fetVar3 = fetVar10;
                }
                ugdVar4 = ugdVar3;
                twn.v((i28 >> 24) & 14, ugdVar4, fetVar3, true);
                str5 = str7;
                yjj0Var2 = yjj0Var7;
                f6 = f113;
                f5 = f114;
                y9q0Var2 = y9q0Var4;
                z13 = z19;
                i26 = i30;
                hh80Var3 = hh80Var6;
                z12 = z18;
                klyVar2 = klyVar4;
                function3 = function5;
                f8 = f13;
                hh80Var4 = hh80Var7;
                j2 = j8;
                f7 = f112;
                z14 = z35;
                num2 = num3;
                fetVar2 = fetVar3;
            } else {
                ugdVar4 = ugdVar3;
                fetVar6.X();
                str5 = str4;
                num2 = num;
                z12 = z8;
                z13 = z9;
                y9q0Var2 = y9q0Var;
                yjj0Var2 = yjj0Var;
                i26 = i2;
                klyVar2 = klyVar;
                f5 = f;
                f6 = f2;
                f7 = f3;
                hh80Var3 = hh80Var;
                hh80Var4 = hh80Var2;
                z14 = z10;
                f8 = f4;
                function3 = function1;
                j2 = jM121getTransparent0d7_KjU;
                fetVar2 = fetVar6;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                final ugd ugdVar7 = ugdVar4;
                yfe0VarU.d = new Function2() { // from class: a.e36
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iL = x8x.L(i4 | 1);
                        int iL2 = x8x.L(i5);
                        int iL3 = x8x.L(i6);
                        int iL4 = x8x.L(i7);
                        h36.a(mm40Var, str, q7q0Var, str2, str3, z, z2, z3, z4, z5, oieVar, z6, z7, str5, num2, z12, vuu0Var, z13, j2, y9q0Var2, yjj0Var2, i, i26, klyVar2, f5, f6, f7, hh80Var3, hh80Var4, z14, f8, i3, a7nVar, function3, function2, ugdVar, ugdVar2, ugdVar7, (fet) obj2, iL, iL2, iL3, iL4, i8, i9);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i25 = i23 | 24576;
        if ((i7 & 196608) == 0) {
            i25 |= fetVar6.i(function2) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            if (fetVar6.i(ugdVar)) {
                i32 = i12;
            } else {
                i32 = 524288;
            }
            i25 |= i32;
        }
        if ((i7 & 12582912) == 0) {
            i25 |= fetVar6.i(ugdVar2) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            if (fetVar6.i(ugdVar3)) {
                i31 = 67108864;
            } else {
                i31 = 33554432;
            }
            i25 |= i31;
        }
        if ((i37 & 306783379) != 306783378) {
            z11 = true;
        } else {
            z11 = true;
        }
        if (fetVar6.U(i37 & 1, z11)) {
            fetVar6.Z();
            i27 = i4 & 1;
            obj = ukd.f35823a;
            if (i27 != 0) {
                if (i40 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i41 == 0) {
                }
                if (i43 != 0) {
                    z15 = false;
                } else {
                    z15 = z9;
                }
                if ((i8 & 262144) != 0) {
                    jM121getTransparent0d7_KjU = ((StaticColors) fetVar6.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                    i44 &= -234881025;
                }
                if ((i8 & 524288) != 0) {
                    y9q0Var3 = new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
                    i44 &= -1879048193;
                } else {
                    y9q0Var3 = y9q0Var;
                }
                if (i45 != 0) {
                    yjj0Var3 = jd8.n;
                } else {
                    yjj0Var3 = yjj0Var;
                }
                if (i47 == 0) {
                }
                if (i49 != 0) {
                    klyVar3 = kly.d;
                } else {
                    klyVar3 = klyVar;
                }
                f9 = 0.0f;
                if ((i8 & 16777216) != 0) {
                    zcl zclVar1114 = qmk.f28987a;
                    i16 &= -57345;
                    f10 = 0.0f;
                } else {
                    f10 = f;
                }
                if ((i8 & 33554432) != 0) {
                    zcl zclVar1115 = qmk.f28987a;
                    i16 &= -458753;
                    f11 = 0.0f;
                } else {
                    f11 = f2;
                }
                if ((i8 & 67108864) != 0) {
                    zcl zclVar1116 = qmk.f28987a;
                    i16 &= -3670017;
                    f12 = 0.0f;
                } else {
                    f12 = f3;
                }
                Integer num10 = num4;
                if (i17 != 0) {
                    hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                } else {
                    hh80VarT = hh80Var;
                }
                if (i19 != 0) {
                    hh80VarT2 = s5x0.t(0.0f, 0.0f, 3);
                } else {
                    hh80VarT2 = hh80Var2;
                }
                if (i21 != 0) {
                    z16 = false;
                } else {
                    z16 = z10;
                }
                if ((i9 & 1) != 0) {
                    zcl zclVar1117 = qmk.f28987a;
                    i25 &= -113;
                } else {
                    f9 = f4;
                }
                hh80 hh80Var16 = hh80VarT2;
                if (i24 != 0) {
                    objP = fetVar6.P();
                    if (objP == obj) {
                        objP = new h26((byte) 4);
                        fetVar6.o0(objP);
                    }
                    function4 = (Function1) objP;
                } else {
                    function4 = function1;
                }
                hh80Var5 = hh80Var16;
                function5 = function4;
                f13 = f9;
                i28 = i25;
                klyVar4 = klyVar3;
                hh80Var6 = hh80VarT;
                z17 = z16;
                str7 = str6;
                i29 = i44;
                y9q0Var4 = y9q0Var3;
                z18 = true;
                j3 = jM121getTransparent0d7_KjU;
                i30 = i50;
                yjj0Var4 = yjj0Var3;
                num3 = num10;
                z19 = z15;
            } else {
                if (i40 != 0) {
                    str6 = null;
                } else {
                    str6 = str4;
                }
                if (i41 == 0) {
                }
                if (i43 != 0) {
                    z15 = false;
                } else {
                    z15 = z9;
                }
                if ((i8 & 262144) != 0) {
                    jM121getTransparent0d7_KjU = ((StaticColors) fetVar6.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                    i44 &= -234881025;
                }
                if ((i8 & 524288) != 0) {
                    y9q0Var3 = new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
                    i44 &= -1879048193;
                } else {
                    y9q0Var3 = y9q0Var;
                }
                if (i45 != 0) {
                    yjj0Var3 = jd8.n;
                } else {
                    yjj0Var3 = yjj0Var;
                }
                if (i47 == 0) {
                }
                if (i49 != 0) {
                    klyVar3 = kly.d;
                } else {
                    klyVar3 = klyVar;
                }
                f9 = 0.0f;
                if ((i8 & 16777216) != 0) {
                    zcl zclVar1118 = qmk.f28987a;
                    i16 &= -57345;
                    f10 = 0.0f;
                } else {
                    f10 = f;
                }
                if ((i8 & 33554432) != 0) {
                    zcl zclVar1119 = qmk.f28987a;
                    i16 &= -458753;
                    f11 = 0.0f;
                } else {
                    f11 = f2;
                }
                if ((i8 & 67108864) != 0) {
                    zcl zclVar11110 = qmk.f28987a;
                    i16 &= -3670017;
                    f12 = 0.0f;
                } else {
                    f12 = f3;
                }
                Integer num11 = num4;
                if (i17 != 0) {
                    hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                } else {
                    hh80VarT = hh80Var;
                }
                if (i19 != 0) {
                    hh80VarT2 = s5x0.t(0.0f, 0.0f, 3);
                } else {
                    hh80VarT2 = hh80Var2;
                }
                if (i21 != 0) {
                    z16 = false;
                } else {
                    z16 = z10;
                }
                if ((i9 & 1) != 0) {
                    zcl zclVar11111 = qmk.f28987a;
                    i25 &= -113;
                } else {
                    f9 = f4;
                }
                hh80 hh80Var17 = hh80VarT2;
                if (i24 != 0) {
                    objP = fetVar6.P();
                    if (objP == obj) {
                        objP = new h26((byte) 4);
                        fetVar6.o0(objP);
                    }
                    function4 = (Function1) objP;
                } else {
                    function4 = function1;
                }
                hh80Var5 = hh80Var17;
                function5 = function4;
                f13 = f9;
                i28 = i25;
                klyVar4 = klyVar3;
                hh80Var6 = hh80VarT;
                z17 = z16;
                str7 = str6;
                i29 = i44;
                y9q0Var4 = y9q0Var3;
                z18 = true;
                j3 = jM121getTransparent0d7_KjU;
                i30 = i50;
                yjj0Var4 = yjj0Var3;
                num3 = num11;
                z19 = z15;
            }
            fetVar6.s();
            Object[] objArr4 = new Object[0];
            objP2 = fetVar6.P();
            if (objP2 == obj) {
                objP2 = new o85((byte) 20);
                fetVar6.o0(objP2);
            }
            pz40Var = (pz40) e9x.Q(objArr4, (Function0) objP2, fetVar6, 48);
            objP3 = fetVar6.P();
            if (objP3 != obj) {
                if (z3) {
                    jE = o9q0.b;
                } else {
                    int length4 = str.length();
                    jE = s7n0.e(length4, length4);
                }
                objP3 = androidx.compose.runtime.e.e(new a8q0(str, jE, 4));
                fetVar6.o0(objP3);
            }
            pz40Var2 = (pz40) objP3;
            if ((i29 & 7168) == 2048) {
                z20 = true;
            } else {
                z20 = false;
            }
            if ((i29 & 3670016) == 1048576) {
                z21 = true;
            } else {
                z21 = false;
            }
            z22 = z20 | z21;
            objP4 = fetVar6.P();
            if (z22) {
                if (str7 == 0) {
                    objP4 = str7;
                } else {
                    objP4 = str7;
                }
                fetVar6.o0(objP4);
            } else {
                if (str7 == 0) {
                    objP4 = str7;
                } else {
                    objP4 = str7;
                }
                fetVar6.o0(objP4);
            }
            str8 = (String) objP4;
            objP5 = fetVar6.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.e(new Pair(str, ((a8q0) pz40Var2.getValue()).f440a.b));
                fetVar6.o0(objP5);
            }
            pz40Var3 = (pz40) objP5;
            pair = new Pair(str, ((a8q0) pz40Var2.getValue()).f440a.b);
            if (pair.equals((Pair) pz40Var3.getValue())) {
                fetVar6.e0(-1279185355);
                boolean zG4 = fetVar6.g(pair) | fetVar6.g(str8);
                if ((i37 & 112) == 32) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean z36 = z27 | zG4;
                if ((i37 & 29360128) == 8388608) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = z36 | z28;
                objP8 = fetVar6.P();
                if (z29) {
                    objP8 = new c36(pair, str8, str, z3, pz40Var3, pz40Var2);
                    str9 = str8;
                    fetVar6.o0(objP8);
                } else {
                    objP8 = new c36(pair, str8, str, z3, pz40Var3, pz40Var2);
                    str9 = str8;
                    fetVar6.o0(objP8);
                }
                m0x0.D((Function0) objP8, fetVar6);
                fetVar6.r(false);
            } else {
                str9 = str8;
                fetVar6.e0(-1278430009);
                fetVar6.r(false);
            }
            if ((i37 & 896) == 256) {
                z23 = true;
            } else {
                z23 = false;
            }
            objP6 = fetVar6.P();
            if (z23) {
                objP6 = Boolean.valueOf(q7q0Var.equals(q7q0.f28265a));
                fetVar6.o0(objP6);
            } else {
                objP6 = Boolean.valueOf(q7q0Var.equals(q7q0.f28265a));
                fetVar6.o0(objP6);
            }
            zBooleanValue = ((Boolean) objP6).booleanValue();
            jm40Var = jm40.b;
            if (z2) {
                mm40VarK0 = q8a.k0(jm40Var, enx.f8115a);
            } else {
                mm40VarK0 = jm40Var;
            }
            zfn zfnVar4 = f12370a;
            cqqVar = (cqq) fetVar6.k(zfnVar4);
            if (cqqVar == null) {
                fetVar6.e0(-1278098774);
                objP7 = fetVar6.P();
                if (objP7 == obj) {
                    objP7 = new cqq();
                    fetVar6.o0(objP7);
                }
                cqqVar = (cqq) objP7;
                r6 = 0;
            } else {
                r6 = 0;
                fetVar6.e0(790054039);
            }
            fetVar6.r(r6);
            final k6z k6zVar4 = (k6z) fetVar6.k(bmd.n);
            iA = a7nVar.a(k6zVar4);
            mm40 mm40VarE3 = o2e.e0(mm40Var, "DS_TEXT_FIELD_COLUMN");
            x5d x5dVarA4 = w5d.a(uc9.c, gqw0.m, fetVar6, r6);
            int iHashCode4 = Long.hashCode(fetVar6.T);
            bh90 bh90VarM4 = fetVar6.m();
            mm40 mm40VarC3 = kbc.c0(fetVar6, mm40VarE3);
            mkd.c0.getClass();
            fetVar6.i0();
            if (fetVar6.S) {
                fetVar6.l(e7z.u1);
            } else {
                fetVar6.r0();
            }
            jpm0.o(fetVar6, x5dVarA4, gqw0.x);
            jpm0.o(fetVar6, bh90VarM4, gqw0.w);
            jpm0.o(fetVar6, Integer.valueOf(iHashCode4), gqw0.y);
            jpm0.n(fetVar6);
            jpm0.o(fetVar6, mm40VarC3, gqw0.v);
            if (z7) {
                fetVar6.e0(1715193997);
                int i54 = i37 >> 9;
                hh80 hh80Var18 = hh80Var5;
                d(null, str2, str, ((Boolean) pz40Var.getValue()).booleanValue(), z3, z4, hh80Var18, q7q0Var, iA, fetVar6, ((i37 >> 6) & 112) | ((i37 << 3) & 896) | (57344 & i54) | (i54 & 458752) | ((i16 >> 6) & 3670016) | ((i37 << 15) & 29360128));
                hh80Var7 = hh80Var18;
                fetVar6.r(false);
            } else {
                hh80Var7 = hh80Var5;
                fetVar6.e0(1715566865);
                fetVar6.r(false);
            }
            final yjj0 yjj0Var8 = yjj0Var4;
            final long j10 = j3;
            final boolean z37 = z17;
            final float f116 = f12;
            final mm40 mm40Var5 = mm40VarK0;
            final float f117 = f11;
            final float f118 = f10;
            obc.d(zfnVar4.a(cqqVar), u1c.M(1180745969, new Function2() { // from class: a.d36
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z38;
                    long jM123getWhite0d7_KjU2;
                    fet fetVar11 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (fetVar11.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                        yx7 yx7Var = gqw0.k;
                        mm40 mm40VarQ = i120.Q(mm40Var5, j10, yjj0Var8);
                        zcl zclVar120 = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(mm40VarQ, 4.0f + f117, 0.0f, f116, f118, 2);
                        final boolean z39 = z3;
                        boolean zH = fetVar11.h(z39);
                        final boolean z310 = z;
                        boolean zH2 = zH | fetVar11.h(z310);
                        final Function1 function6 = function2;
                        boolean zG5 = zH2 | fetVar11.g(function6);
                        Object objP9 = fetVar11.P();
                        if (zG5 || objP9 == ukd.f35823a) {
                            objP9 = new cj(z39, z310, function6);
                            fetVar11.o0(objP9);
                        }
                        mm40 mm40VarO = kbc.O(mm40VarN, new nc40((Function1) objP9, (byte) 10));
                        thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar11, 48);
                        int iHashCode5 = Long.hashCode(fetVar11.T);
                        bh90 bh90VarM5 = fetVar11.m();
                        mm40 mm40VarC4 = kbc.c0(fetVar11, mm40VarO);
                        mkd.c0.getClass();
                        fetVar11.i0();
                        boolean z311 = fetVar11.S;
                        pcy pcyVar = e7z.u1;
                        if (z311) {
                            fetVar11.l(pcyVar);
                        } else {
                            fetVar11.r0();
                        }
                        shd shdVar = gqw0.x;
                        jpm0.o(fetVar11, thg0VarA, shdVar);
                        shd shdVar2 = gqw0.w;
                        jpm0.o(fetVar11, bh90VarM5, shdVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode5);
                        shd shdVar3 = gqw0.y;
                        jpm0.o(fetVar11, numValueOf, shdVar3);
                        jpm0.n(fetVar11);
                        shd shdVar4 = gqw0.v;
                        jpm0.o(fetVar11, mm40VarC4, shdVar4);
                        ugd ugdVar8 = ugdVar;
                        final cqq cqqVar2 = cqqVar;
                        ugdVar8.F(cqqVar2, fetVar11, 0);
                        x7z x7zVar = new x7z(1.0f, true);
                        boolean z312 = z37;
                        jm40 jm40Var2 = jm40.b;
                        mm40 mm40VarE = x7zVar.e(z312 ? o7k0.e(jm40Var2, 20.0f) : o7k0.g(jm40Var2, 20.0f, 0.0f, 2));
                        tj30 tj30VarC = zq8.c(gqw0.d, false);
                        int iHashCode6 = Long.hashCode(fetVar11.T);
                        bh90 bh90VarM6 = fetVar11.m();
                        mm40 mm40VarC5 = kbc.c0(fetVar11, mm40VarE);
                        fetVar11.i0();
                        if (fetVar11.S) {
                            fetVar11.l(pcyVar);
                        } else {
                            fetVar11.r0();
                        }
                        jpm0.o(fetVar11, tj30VarC, shdVar);
                        jpm0.o(fetVar11, bh90VarM6, shdVar2);
                        vqd.u(iHashCode6, fetVar11, shdVar3, fetVar11);
                        jpm0.o(fetVar11, mm40VarC5, shdVar4);
                        if (zBooleanValue) {
                            fetVar11.e0(-1480645274);
                            jM123getWhite0d7_KjU2 = ((ThemeColors) fetVar11.k(zaq0.b)).getTextPrimary();
                            z38 = false;
                        } else {
                            z38 = false;
                            fetVar11.e0(-1480643968);
                            jM123getWhite0d7_KjU2 = ((StaticColors) fetVar11.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                        }
                        fetVar11.r(z38);
                        final long j11 = jM123getWhite0d7_KjU2;
                        k6z k6zVar5 = k6z.b;
                        k6z k6zVar6 = k6zVar4;
                        boolean z313 = k6zVar6 == k6zVar5 ? true : z38;
                        y9q0 y9q0Var5 = y9q0Var4;
                        boolean z314 = z6;
                        int i55 = iA;
                        final y9q0 y9q0VarE = h36.e(y9q0Var5, j11, z313, z314, i55);
                        k6z k6zVar7 = k6zVar6;
                        String str10 = str;
                        k6z k6zVarG = pkd.g(str10, fetVar11);
                        if (a7nVar == a7n.f379a || z314) {
                            k6zVar7 = k6zVarG;
                        }
                        l5d0 l5d0VarA = bmd.n.a(k6zVar7);
                        final int i56 = i;
                        final int i57 = i3;
                        final int i58 = i30;
                        final oie oieVar2 = oieVar;
                        final boolean z315 = z2;
                        final hh80 hh80Var19 = hh80Var6;
                        final pz40 pz40Var4 = pz40Var;
                        final boolean z40 = z18;
                        final String str11 = str9;
                        final Integer num12 = num3;
                        final kly klyVar5 = klyVar4;
                        final vuu0 vuu0Var2 = vuu0Var;
                        final Function1 function7 = function5;
                        final pz40 pz40Var5 = pz40Var2;
                        obc.d(l5d0VarA, u1c.M(-1401398373, new Function2() { // from class: a.f36
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                fet fetVar12 = (fet) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (fetVar12.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    pz40 pz40Var6 = pz40Var5;
                                    a8q0 a8q0Var = (a8q0) pz40Var6.getValue();
                                    skk0 skk0Var = new skk0(j11);
                                    int i59 = i56;
                                    uly ulyVar = new uly(i57, Boolean.valueOf(!(i59 == 7)), i59, i58, 112);
                                    oie oieVar3 = oieVar2;
                                    boolean zI = fetVar12.i(oieVar3);
                                    Object objP10 = fetVar12.P();
                                    cl5 cl5Var = ukd.f35823a;
                                    if (zI || objP10 == cl5Var) {
                                        objP10 = new os5(oieVar3, (byte) 2);
                                        fetVar12.o0(objP10);
                                    }
                                    mm40 mm40VarD = o7k0.d(pai0.a(jm40.b, false, (Function1) objP10), 1.0f);
                                    boolean z41 = z315;
                                    mm40 mm40VarI = s5x0.I(o7k0.w(mm40VarD, null, z41, 1), hh80Var19);
                                    pz40 pz40Var7 = pz40Var4;
                                    boolean zG6 = fetVar12.g(pz40Var7);
                                    boolean z42 = z40;
                                    boolean zH3 = zG6 | fetVar12.h(z42);
                                    Object objP11 = fetVar12.P();
                                    if (zH3 || objP11 == cl5Var) {
                                        objP11 = new b36(z42, pz40Var7, pz40Var6, (byte) 0);
                                        fetVar12.o0(objP11);
                                    }
                                    mm40 mm40VarE4 = o2e.e0(y860.b0(j120.b0(mm40VarI, (Function1) objP11), cqqVar2), "BASE_TEXT_FIELD_TAG");
                                    String str12 = str11;
                                    boolean zG7 = fetVar12.g(str12);
                                    Integer num13 = num12;
                                    boolean zG8 = zG7 | fetVar12.g(num13);
                                    Function1 function8 = function6;
                                    boolean zG9 = zG8 | fetVar12.g(function8);
                                    Object objP12 = fetVar12.P();
                                    if (zG9 || objP12 == cl5Var) {
                                        dc0 dc0Var = new dc0(str12, num13, function8, pz40Var6, (byte) 12);
                                        fetVar12.o0(dc0Var);
                                        objP12 = dc0Var;
                                    }
                                    z96.a(a8q0Var, (Function1) objP12, mm40VarE4, z310, z39, y9q0VarE, ulyVar, klyVar5, z41, 0, 0, vuu0Var2, function7, null, skk0Var, null, fetVar12, 0, 0, 42496);
                                } else {
                                    fetVar12.X();
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar11), fetVar11, 56);
                        boolean zBooleanValue4 = ((Boolean) pz40Var4.getValue()).booleanValue();
                        mm40 mm40VarW = o7k0.w(jm40Var2, null, true, 1);
                        String str12 = str2;
                        boolean z41 = z4;
                        q7q0 q7q0Var2 = q7q0Var;
                        h36.b(mm40VarW, str10, str12, zBooleanValue4, z41, z39, q7q0Var2, i55, fetVar11, 6);
                        h36.c(o7k0.w(jm40Var2, null, true, 1), str10, str3, q7q0Var2, ((Boolean) pz40Var4.getValue()).booleanValue(), z39, z19, z314, i55, fetVar11, 6);
                        fetVar11.r(true);
                        ugdVar2.invoke(fetVar11, 0);
                        fetVar11.r(true);
                    } else {
                        fetVar11.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 56);
            if (z5) {
                fetVar.e0(1723121844);
                zBooleanValue2 = ((Boolean) pz40Var.getValue()).booleanValue();
                if (str.length() == 0) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                if (z4) {
                    fetVar4 = fetVar;
                    if (zBooleanValue2) {
                        fetVar4.e0(196486584);
                        zcl zclVar11112 = qmk.f28987a;
                        l7m0VarA = d43.a(2.0f, null, null, fetVar4, 0, 14);
                        fetVar4.r(false);
                        fetVar5 = fetVar4;
                    } else {
                        fetVar4.e0(196489240);
                        zcl zclVar11113 = qmk.f28987a;
                        l7m0VarA = d43.a(1.0f, null, null, fetVar4, 0, 14);
                        fetVar4.r(false);
                        fetVar5 = fetVar4;
                    }
                } else {
                    fetVar4 = fetVar;
                    if (zBooleanValue2) {
                        fetVar4.e0(196486584);
                        zcl zclVar11114 = qmk.f28987a;
                        l7m0VarA = d43.a(2.0f, null, null, fetVar4, 0, 14);
                        fetVar4.r(false);
                        fetVar5 = fetVar4;
                    } else {
                        fetVar4.e0(196489240);
                        zcl zclVar11115 = qmk.f28987a;
                        l7m0VarA = d43.a(1.0f, null, null, fetVar4, 0, 14);
                        fetVar4.r(false);
                        fetVar5 = fetVar4;
                    }
                }
                float f119 = ((ycl) l7m0VarA.getValue()).f42389a;
                zBooleanValue3 = ((Boolean) pz40Var.getValue()).booleanValue();
                if (z4) {
                    fetVar5.e0(-446232517);
                    if (zBooleanValue) {
                        fetVar5.e0(-446230107);
                        jM113getRed0d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getWarning();
                        z26 = false;
                    } else {
                        z26 = false;
                        fetVar5.e0(-446228927);
                        jM113getRed0d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m113getRed0d7_KjU();
                    }
                    fetVar5.r(z26);
                    l7m0VarB = m5k0.b(jM113getRed0d7_KjU, null, fetVar5, 0, 14);
                    fetVar5.r(z26);
                } else if (zBooleanValue3) {
                    fetVar5.e0(-446228003);
                    if (zBooleanValue) {
                        fetVar5.e0(-446225595);
                        jM123getWhite0d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getPrimary();
                        z25 = false;
                    } else {
                        z25 = false;
                        fetVar5.e0(-446224413);
                        jM123getWhite0d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                    }
                    fetVar5.r(z25);
                    l7m0VarB = m5k0.b(jM123getWhite0d7_KjU, null, fetVar5, 0, 14);
                    fetVar5.r(z25);
                } else {
                    fetVar5.e0(-446223517);
                    if (zBooleanValue) {
                        fetVar5.e0(-446221111);
                        jM126getWhite200d7_KjU = ((ThemeColors) fetVar5.k(zaq0.b)).getSecondary40();
                    } else {
                        fetVar5.e0(-446219803);
                        jM126getWhite200d7_KjU = ((StaticColors) fetVar5.k(m8m0.f21378a)).m126getWhite200d7_KjU();
                    }
                    fetVar5.r(false);
                    l7m0VarB = m5k0.b(jM126getWhite200d7_KjU, null, fetVar5, 0, 14);
                    fetVar5.r(false);
                }
                long j11 = ((y3d) l7m0VarB.getValue()).f41946a;
                zcl zclVar24 = qmk.f28987a;
                zcl zclVar25 = qmk.f28987a;
                jcb.v(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), f119, j11, fetVar5, 0, 0);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                fet fetVar11 = fetVar;
                fetVar11.e0(1723620913);
                fetVar11.r(false);
                fetVar3 = fetVar11;
            }
            ugdVar4 = ugdVar3;
            twn.v((i28 >> 24) & 14, ugdVar4, fetVar3, true);
            str5 = str7;
            yjj0Var2 = yjj0Var8;
            f6 = f117;
            f5 = f118;
            y9q0Var2 = y9q0Var4;
            z13 = z19;
            i26 = i30;
            hh80Var3 = hh80Var6;
            z12 = z18;
            klyVar2 = klyVar4;
            function3 = function5;
            f8 = f13;
            hh80Var4 = hh80Var7;
            j2 = j10;
            f7 = f116;
            z14 = z37;
            num2 = num3;
            fetVar2 = fetVar3;
        } else {
            ugdVar4 = ugdVar3;
            fetVar6.X();
            str5 = str4;
            num2 = num;
            z12 = z8;
            z13 = z9;
            y9q0Var2 = y9q0Var;
            yjj0Var2 = yjj0Var;
            i26 = i2;
            klyVar2 = klyVar;
            f5 = f;
            f6 = f2;
            f7 = f3;
            hh80Var3 = hh80Var;
            hh80Var4 = hh80Var2;
            z14 = z10;
            f8 = f4;
            function3 = function1;
            j2 = jM121getTransparent0d7_KjU;
            fetVar2 = fetVar6;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final ugd ugdVar8 = ugdVar4;
            yfe0VarU.d = new Function2() { // from class: a.e36
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(i4 | 1);
                    int iL2 = x8x.L(i5);
                    int iL3 = x8x.L(i6);
                    int iL4 = x8x.L(i7);
                    h36.a(mm40Var, str, q7q0Var, str2, str3, z, z2, z3, z4, z5, oieVar, z6, z7, str5, num2, z12, vuu0Var, z13, j2, y9q0Var2, yjj0Var2, i, i26, klyVar2, f5, f6, f7, hh80Var3, hh80Var4, z14, f8, i3, a7nVar, function3, function2, ugdVar, ugdVar2, ugdVar8, (fet) obj2, iL, iL2, iL3, iL4, i8, i9);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(mm40 mm40Var, String str, String str2, boolean z, boolean z2, boolean z3, q7q0 q7q0Var, int i, fet fetVar, int i2) {
        long jM130getWhite600d7_KjU;
        long warning;
        fetVar.g0(-1998025433);
        int i3 = i2 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.h(z2) ? 16384 : 8192) | (fetVar.h(z3) ? 131072 : 65536) | (fetVar.g(q7q0Var) ? 1048576 : 524288) | (fetVar.e(i) ? 8388608 : 4194304);
        byte b = 0;
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z4 = (i3 & 3670016) == 1048576;
            Object objP = fetVar.P();
            if (z4 || objP == ukd.f35823a) {
                objP = Boolean.valueOf(Intrinsics.d(q7q0Var, q7q0.f28265a));
                fetVar.o0(objP);
            }
            if (((Boolean) objP).booleanValue()) {
                fetVar.e0(-252045968);
                jM130getWhite600d7_KjU = afn0.m(fetVar).getSecondary();
            } else {
                fetVar.e0(-252044722);
                jM130getWhite600d7_KjU = afn0.p(fetVar).m130getWhite600d7_KjU();
            }
            fetVar.r(false);
            l7m0 l7m0VarB = m5k0.b(jM130getWhite600d7_KjU, null, fetVar, 0, 14);
            if (z2) {
                fetVar.e0(-252041298);
                warning = afn0.m(fetVar).getWarning();
                fetVar.r(false);
            } else {
                fetVar.e0(-252040875);
                fetVar.r(false);
                warning = ((y3d) l7m0VarB.getValue()).f41946a;
            }
            b34.h((str.length() == 0 && !z) || (z3 && str.length() == 0), mm40Var, kzn.d(ro4.m0(0, 0, null, 7), 0.0f, 2), kzn.e(ro4.m0(0, 0, null, 7), 2), null, u1c.M(1326905343, new y26(i, str2, m5k0.b(warning, null, fetVar, 0, 14), b), fetVar), fetVar, 200112, 16);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z26(mm40Var, str, str2, z, z2, z3, q7q0Var, i, i2);
        }
    }

    public static final void c(mm40 mm40Var, String str, String str2, q7q0 q7q0Var, boolean z, boolean z2, boolean z3, boolean z4, int i, fet fetVar, int i2) {
        long jM130getWhite600d7_KjU;
        fetVar.g0(631500930);
        int i3 = i2 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(q7q0Var) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192) | (fetVar.h(z2) ? 131072 : 65536) | (fetVar.h(z3) ? 1048576 : 524288) | (fetVar.h(z4) ? 8388608 : 4194304) | (fetVar.e(i) ? 67108864 : 33554432);
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            boolean z5 = (i3 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z5 || objP == ukd.f35823a) {
                objP = Boolean.valueOf(Intrinsics.d(q7q0Var, q7q0.f28265a));
                fetVar.o0(objP);
            }
            if (((Boolean) objP).booleanValue()) {
                fetVar.e0(1282020747);
                jM130getWhite600d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
            } else {
                fetVar.e0(1282021993);
                jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
            }
            fetVar.r(false);
            l7m0 l7m0VarB = m5k0.b(jM130getWhite600d7_KjU, null, fetVar, 0, 14);
            boolean z6 = !z3 ? !(!z2 && str.length() == 0 && z) : z2 || str.length() != 0;
            b34.h(z6, mm40Var, kzn.d(ro4.m0(0, Response.OK, null, 5), 0.0f, 2), kzn.e(null, 3), null, u1c.M(779256154, new qb(str2, e(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), ((y3d) l7m0VarB.getValue()).f41946a, fetVar.k(bmd.n) == k6z.b, z4, i), l7m0VarB), fetVar), fetVar, 200112, 16);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a36(mm40Var, str, str2, q7q0Var, z, z2, z3, z4, i, i2);
        }
    }

    public static final void d(mm40 mm40Var, final String str, final String str2, final boolean z, final boolean z2, final boolean z3, final hh80 hh80Var, final q7q0 q7q0Var, final int i, fet fetVar, final int i2) {
        String str3;
        final mm40 mm40Var2;
        boolean z4;
        Object objJ;
        boolean z5;
        Object objJ2;
        float f;
        boolean z6;
        Object objJ3;
        jm40 jm40Var;
        long jM130getWhite600d7_KjU;
        l7m0 l7m0VarB;
        boolean z7;
        long jM123getWhite0d7_KjU;
        boolean z8;
        long jM113getRed0d7_KjU;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        hh80Var.getClass();
        q7q0Var.getClass();
        fetVar2.g0(-1930073227);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            str3 = str2;
            i3 |= fetVar2.g(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.g(hh80Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar2.g(q7q0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar2.e(i) ? 67108864 : 33554432;
        }
        if (fetVar2.U(i3 & 1, (38347923 & i3) != 38347922)) {
            boolean z9 = (29360128 & i3) == 8388608;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z9 || objP == cl5Var) {
                objP = Boolean.valueOf(q7q0Var.equals(q7q0.f28265a));
                fetVar2.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            boolean z10 = ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z10 || objP2 == cl5Var) {
                objP2 = Boolean.valueOf((z && !z2) || str3.length() > 0);
                fetVar2.o0(objP2);
            }
            Boolean bool = (Boolean) objP2;
            bool.getClass();
            oms0 oms0VarZ = phu0.Z(bool, null, fetVar2, 0, 2);
            p4 p4Var = oms0VarZ.f25519a;
            lxs0 lxs0Var = hp4.j;
            if (oms0VarZ.h()) {
                i3 = i3;
                z4 = false;
                objJ = vqd.j(fetVar2, 1666827533, false, p4Var);
            } else {
                fetVar2.e0(1666573488);
                boolean zG = fetVar2.g(oms0VarZ);
                objJ = fetVar2.P();
                if (zG || objJ == cl5Var) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar2.o0(objY0);
                        objJ = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                z4 = false;
                fetVar2.r(false);
            }
            boolean zBooleanValue2 = ((Boolean) objJ).booleanValue();
            fetVar2.e0(936846978);
            float f2 = zBooleanValue2 ? 1.0f : 0.0f;
            fetVar2.r(z4);
            Float fValueOf = Float.valueOf(f2);
            boolean zG2 = fetVar2.g(oms0VarZ);
            Object objP3 = fetVar2.P();
            if (zG2 || objP3 == cl5Var) {
                objP3 = jgk0.b(new gb3(oms0VarZ, (byte) 14));
                fetVar2.o0(objP3);
            }
            boolean zBooleanValue3 = ((Boolean) ((l7m0) objP3).getValue()).booleanValue();
            fetVar2.e0(936846978);
            float f3 = zBooleanValue3 ? 1.0f : 0.0f;
            fetVar2.r(false);
            Float fValueOf2 = Float.valueOf(f3);
            boolean zG3 = fetVar2.g(oms0VarZ);
            Object objP4 = fetVar2.P();
            if (zG3 || objP4 == cl5Var) {
                objP4 = jgk0.b(new gb3(oms0VarZ, (byte) 15));
                fetVar2.o0(objP4);
            }
            ((ams0) ((l7m0) objP4).getValue()).getClass();
            fetVar2.e0(-103618275);
            uts0 uts0VarM0 = ro4.m0(300, 0, null, 6);
            fetVar2.r(false);
            cms0 cms0VarE = phu0.E(oms0VarZ, fValueOf, fValueOf2, uts0VarM0, lxs0Var, fetVar2, 0);
            lxs0 lxs0Var2 = hp4.l;
            if (oms0VarZ.h()) {
                z5 = false;
                objJ2 = vqd.j(fetVar2, 1666827533, false, p4Var);
            } else {
                fetVar2.e0(1666573488);
                boolean zG4 = fetVar2.g(oms0VarZ);
                objJ2 = fetVar2.P();
                if (zG4 || objJ2 == cl5Var) {
                    rfk0 rfk0VarJ2 = vdx.J();
                    Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                    rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                    try {
                        Object objY1 = p4Var.y0();
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        fetVar2.o0(objY1);
                        objJ2 = objY1;
                    } catch (Throwable th2) {
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        throw th2;
                    }
                }
                z5 = false;
                fetVar2.r(false);
            }
            boolean zBooleanValue4 = ((Boolean) objJ2).booleanValue();
            fetVar2.e0(-495078628);
            if (zBooleanValue4) {
                zcl zclVar = qmk.f28987a;
                f = 0.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 22.0f;
            }
            ycl yclVarG = dw9.g(fetVar2, z5, f);
            boolean zG5 = fetVar2.g(oms0VarZ);
            Object objP5 = fetVar2.P();
            if (zG5 || objP5 == cl5Var) {
                objP5 = jgk0.b(new gb3(oms0VarZ, (byte) 10));
                fetVar2.o0(objP5);
            }
            boolean zBooleanValue5 = ((Boolean) ((l7m0) objP5).getValue()).booleanValue();
            fetVar2.e0(-495078628);
            ycl yclVarG2 = dw9.g(fetVar2, false, zBooleanValue5 ? 0.0f : 22.0f);
            boolean zG6 = fetVar2.g(oms0VarZ);
            Object objP6 = fetVar2.P();
            if (zG6 || objP6 == cl5Var) {
                objP6 = jgk0.b(new gb3(oms0VarZ, (byte) 11));
                fetVar2.o0(objP6);
            }
            ((ams0) ((l7m0) objP6).getValue()).getClass();
            fetVar2.e0(385278345);
            uts0 uts0VarM1 = ro4.m0(300, 0, null, 6);
            fetVar2.r(false);
            cms0 cms0VarE2 = phu0.E(oms0VarZ, yclVarG, yclVarG2, uts0VarM1, lxs0Var2, fetVar2, 0);
            if (oms0VarZ.h()) {
                z6 = false;
                objJ3 = vqd.j(fetVar2, 1666827533, false, p4Var);
            } else {
                fetVar2.e0(1666573488);
                boolean zG7 = fetVar2.g(oms0VarZ);
                objJ3 = fetVar2.P();
                if (zG7 || objJ3 == cl5Var) {
                    rfk0 rfk0VarJ3 = vdx.J();
                    Function1 function1E3 = rfk0VarJ3 != null ? rfk0VarJ3.e() : null;
                    rfk0 rfk0VarW3 = vdx.W(rfk0VarJ3);
                    try {
                        Object objY2 = p4Var.y0();
                        vdx.Y(rfk0VarJ3, rfk0VarW3, function1E3);
                        fetVar2.o0(objY2);
                        objJ3 = objY2;
                    } catch (Throwable th3) {
                        vdx.Y(rfk0VarJ3, rfk0VarW3, function1E3);
                        throw th3;
                    }
                }
                fetVar2.r(false);
                z6 = false;
            }
            boolean zBooleanValue6 = ((Boolean) objJ3).booleanValue();
            fetVar2.e0(-2005100453);
            ycl yclVarG3 = dw9.g(fetVar2, z6, zBooleanValue6 ? 0.0f : 28.0f);
            boolean zG8 = fetVar2.g(oms0VarZ);
            Object objP7 = fetVar2.P();
            if (zG8 || objP7 == cl5Var) {
                objP7 = jgk0.b(new gb3(oms0VarZ, (byte) 12));
                fetVar2.o0(objP7);
            }
            boolean zBooleanValue7 = ((Boolean) ((l7m0) objP7).getValue()).booleanValue();
            fetVar2.e0(-2005100453);
            ycl yclVarG4 = dw9.g(fetVar2, false, zBooleanValue7 ? 0.0f : 28.0f);
            boolean zG9 = fetVar2.g(oms0VarZ);
            Object objP8 = fetVar2.P();
            if (zG9 || objP8 == cl5Var) {
                objP8 = jgk0.b(new gb3(oms0VarZ, (byte) 13));
                fetVar2.o0(objP8);
            }
            ((ams0) ((l7m0) objP8).getValue()).getClass();
            fetVar2.e0(-1124743480);
            uts0 uts0VarM2 = ro4.m0(300, 0, null, 6);
            fetVar2.r(false);
            cms0 cms0VarE3 = phu0.E(oms0VarZ, yclVarG3, yclVarG4, uts0VarM2, lxs0Var2, fetVar2, 0);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarI = s5x0.I(s5x0.N(o7k0.g(jm40Var2, 18.0f, 0.0f, 2), 4.0f, 0.0f, 0.0f, 0.0f, 14), hh80Var);
            boolean zG10 = fetVar2.g(cms0VarE2) | fetVar2.g(cms0VarE3) | fetVar2.g(cms0VarE);
            Object objP9 = fetVar2.P();
            if (zG10 || objP9 == cl5Var) {
                objP9 = new on((Object) cms0VarE2, (Object) cms0VarE3, (Object) cms0VarE, (byte) 24);
                fetVar2.o0(objP9);
            }
            mm40 mm40VarT = i4w0.T(mm40VarI, (Function1) objP9);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarT);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            y9q0 y9q0VarA = y9q0.a(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), 0L, 0L, null, null, null, 0L, null, null, 0, i, 0L, null, null, 16711679);
            if (z3) {
                fetVar2.e0(554300300);
                if (zBooleanValue) {
                    fetVar2.e0(554302710);
                    jM113getRed0d7_KjU = ((ThemeColors) fetVar2.k(zaq0.b)).getWarning();
                    z8 = false;
                } else {
                    z8 = false;
                    fetVar2.e0(554303890);
                    jM113getRed0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m113getRed0d7_KjU();
                }
                fetVar2.r(z8);
                long j = jM113getRed0d7_KjU;
                jm40Var = jm40Var2;
                l7m0VarB = m5k0.b(j, null, fetVar2, 0, 14);
                fetVar2.r(z8);
            } else {
                jm40Var = jm40Var2;
                if (z) {
                    fetVar2.e0(554304814);
                    if (zBooleanValue) {
                        fetVar2.e0(554307222);
                        jM123getWhite0d7_KjU = ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary();
                        z7 = false;
                    } else {
                        z7 = false;
                        fetVar2.e0(554308404);
                        jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                    }
                    fetVar2.r(z7);
                    l7m0VarB = m5k0.b(jM123getWhite0d7_KjU, null, fetVar2, 0, 14);
                    fetVar2.r(z7);
                } else {
                    fetVar2.e0(554309298);
                    if (zBooleanValue) {
                        fetVar2.e0(554311704);
                        jM130getWhite600d7_KjU = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                    } else {
                        fetVar2.e0(554312950);
                        jM130getWhite600d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                    }
                    fetVar2.r(false);
                    l7m0VarB = m5k0.b(jM130getWhite600d7_KjU, null, fetVar2, 0, 14);
                    fetVar2.r(false);
                }
            }
            v8q0.a(str, o2e.e0(jm40Var, "TOP_LABEL_CONTAINER_TEXT"), ((y3d) l7m0VarB.getValue()).f41946a, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarA, fetVar2, ((i3 >> 3) & 14) | 48, 24960, 110584);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.g36
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h36.d(mm40Var2, str, str2, z, z2, z3, hh80Var, q7q0Var, i, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final y9q0 e(y9q0 y9q0Var, long j, boolean z, boolean z2, int i) {
        return (z && z2) ? y9q0.a(y9q0Var, j, 0L, null, null, null, 0L, null, null, 2, 1, 0L, null, null, 16678910) : y9q0.a(y9q0Var, j, 0L, null, null, null, 0L, null, null, 0, i, 0L, null, null, 16711678);
    }
}
