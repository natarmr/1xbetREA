package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class yh3 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42617a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ ij3 c;

    public /* synthetic */ yh3(kmq kmqVar, ij3 ij3Var, byte b) {
        this.f42617a = b;
        this.b = kmqVar;
        this.c = ij3Var;
    }

    /* JADX WARN: Code duplicated, block: B:210:0x0480 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x0482  */
    /* JADX WARN: Code duplicated, block: B:212:0x0485  */
    /* JADX WARN: Code duplicated, block: B:215:0x0489  */
    /* JADX WARN: Code duplicated, block: B:218:0x0490  */
    /* JADX WARN: Code duplicated, block: B:220:0x0498  */
    /* JADX WARN: Code duplicated, block: B:221:0x049e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:222:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:223:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:235:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:264:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:? A[LOOP:0: B:65:0x013c->B:266:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:53:0x010a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:67:0x0142  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:75:0x015f  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0183  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        xh3 xh3Var;
        Object tc3Var;
        ei3 ei3Var;
        boolean z;
        boolean z2;
        hbk0 bbk0Var;
        int i;
        uyw rywVar;
        ah3 ah3Var;
        wg3 wg3Var;
        dx00 dx00Var;
        dx00 bx00Var;
        ix80 ix80Var;
        ix80 gx80Var;
        ig3 ig3Var;
        String str;
        String str2;
        uyw tywVar;
        int i2;
        int i3;
        uyw rywVar2;
        String strA;
        int i4;
        int i5;
        uyw rywVar3;
        int i6;
        int i7;
        uyw rywVar4;
        int i8;
        String strA2;
        int iA;
        int i9;
        String[] strArrG;
        ArrayList arrayListB;
        boolean z3;
        int iA2;
        int i10;
        uyw rywVar5;
        Iterator it;
        byte b = this.f42617a;
        kmq kmqVar = this.b;
        ij3 ij3Var = this.c;
        switch (b) {
            case 0:
                if (yjeVar instanceof xh3) {
                    xh3Var = (xh3) yjeVar;
                    int i11 = xh3Var.j;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        xh3Var.j = i11 - Integer.MIN_VALUE;
                    } else {
                        xh3Var = new xh3(this, yjeVar);
                    }
                } else {
                    xh3Var = new xh3(this, yjeVar);
                }
                Object obj2 = xh3Var.i;
                wne wneVar = wne.f39444a;
                int i12 = xh3Var.j;
                if (i12 == 0) {
                    z1x.P(obj2);
                    jh3 jh3Var = (jh3) obj;
                    ij3Var.W.e();
                    jh3Var.getClass();
                    if (jh3Var.l) {
                        StringBuilder sb = new StringBuilder(ujn.h);
                        int i13 = 0;
                        if (StringsKt.O("static/img/android/loadscreen/1357/block/block.webp", ujn.h, false)) {
                            sb.setLength(i13);
                            sb.append("static/img/android/loadscreen/1357/block/block.webp");
                        } else if (kotlin.text.c.x("static/img/android/loadscreen/1357/block/block.webp", "https://", false)) {
                            i13 = 0;
                            sb.setLength(i13);
                            sb.append("static/img/android/loadscreen/1357/block/block.webp");
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0("static/img/android/loadscreen/1357/block/block.webp", '/'));
                        }
                        tc3Var = new tc3(sb.toString());
                    } else {
                        tc3Var = sc3.f31968a;
                    }
                    xh3Var.j = 1;
                    if (kmqVar.a(tc3Var, xh3Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i12 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof ei3) {
                    ei3Var = (ei3) yjeVar;
                    int i14 = ei3Var.j;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        ei3Var.j = i14 - Integer.MIN_VALUE;
                    } else {
                        ei3Var = new ei3(this, yjeVar);
                    }
                } else {
                    ei3Var = new ei3(this, yjeVar);
                }
                Object obj3 = ei3Var.i;
                wne wneVar2 = wne.f39444a;
                int i15 = ei3Var.j;
                if (i15 != 0) {
                    if (i15 == 1) {
                        z1x.P(obj3);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj3);
                jh3 jh3Var2 = (jh3) obj;
                bb6 bb6Var = ij3Var.L;
                ctf0 ctf0Var = ij3Var.f;
                boolean z4 = ij3Var.y().j1;
                boolean zH = ij3Var.N.f15748a.h(ij3Var.g0);
                jh3Var2.getClass();
                iy3 iy3Var = jh3Var2.b;
                bb6Var.getClass();
                ctf0Var.getClass();
                oc5 oc5Var = jh3Var2.f;
                hh3 hh3Var = jh3Var2.c;
                eh3 eh3Var = hh3Var.b;
                int iOrdinal = eh3Var.ordinal();
                if (iOrdinal == 0) {
                    z = zH;
                    z2 = z4;
                    int iA3 = bb6Var.a(ctf0Var.b.a(hew0.J(jh3Var2), Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
                    if (iA3 != 0) {
                        rywVar = new syw(iA3);
                        i = R.attr.uikitSplashBackground;
                    } else {
                        i = R.attr.uikitSplashBackground;
                        rywVar = new ryw(ctf0.b(R.attr.uikitSplashBackground, ctf0Var));
                    }
                    bbk0Var = new bbk0(iy3Var, new y0x(rywVar, ctf0.b(i, ctf0Var)));
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            z = zH;
                            z2 = z4;
                            boolean z5 = iy3Var instanceof ey3;
                            if (z5) {
                                strA = ctf0Var.b.a(R.string.background_lottie_1_17, Arrays.copyOf(new Object[0], 0));
                            } else if (iy3Var instanceof gy3) {
                                strA = ctf0Var.b.a(R.string.background_lottie_1_2, Arrays.copyOf(new Object[0], 0));
                            } else if (iy3Var instanceof hy3) {
                                strA = ctf0Var.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                            } else if (iy3Var instanceof fy3) {
                                strA = ctf0Var.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                            } else {
                                t9f.b();
                            }
                            int iA4 = bb6Var.a(strA, dkq.RAW);
                            if (z5) {
                                i4 = R.string.background_lottie_image_1_17;
                            } else if (iy3Var instanceof gy3) {
                                i4 = R.string.background_lottie_image_1_2;
                            } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                i4 = R.string.background_lottie_image_1_12;
                            } else {
                                t9f.b();
                            }
                            if (iA4 != 0) {
                                int iA5 = bb6Var.a(ctf0Var.b.a(i4, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
                                bbk0Var = new cbk0(iy3Var, iA4, iA5 != 0 ? new syw(iA5) : new ryw(ctf0.b(R.attr.uikitSplashBackground, ctf0Var)));
                            } else {
                                int iA6 = bb6Var.a(ctf0Var.b.a(i4, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
                                if (iA6 != 0) {
                                    rywVar3 = new syw(iA6);
                                    i5 = R.attr.uikitSplashBackground;
                                } else {
                                    i5 = R.attr.uikitSplashBackground;
                                    rywVar3 = new ryw(ctf0.b(R.attr.uikitSplashBackground, ctf0Var));
                                }
                                bbk0Var = new bbk0(iy3Var, new y0x(rywVar3, ctf0.b(i5, ctf0Var)));
                            }
                        } else if (iOrdinal == 3) {
                            z = zH;
                            z2 = z4;
                            ph3 ph3Var = jh3Var2.e;
                            if (ph3Var != null) {
                                bbk0Var = new gbk0(iy3Var, ph3Var.f26977a, ph3Var.b);
                            } else {
                                if (iy3Var instanceof ey3) {
                                    i6 = R.string.background_image_1_17;
                                } else if (iy3Var instanceof gy3) {
                                    i6 = R.string.background_image_1_2;
                                } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                    i6 = R.string.background_image_1_12;
                                } else {
                                    t9f.b();
                                }
                                int iA7 = bb6Var.a(ctf0Var.b.a(i6, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
                                if (iA7 != 0) {
                                    rywVar4 = new syw(iA7);
                                    i7 = R.attr.uikitSplashBackground;
                                } else {
                                    i7 = R.attr.uikitSplashBackground;
                                    rywVar4 = new ryw(ctf0.b(R.attr.uikitSplashBackground, ctf0Var));
                                }
                                bbk0Var = new bbk0(iy3Var, new y0x(rywVar4, ctf0.b(i7, ctf0Var)));
                            }
                        } else if (iOrdinal == 4) {
                            boolean z6 = iy3Var instanceof ey3;
                            if (z6) {
                                z = zH;
                                strA2 = ctf0Var.b.a(R.string.background_1_17_smart_image_background, Arrays.copyOf(new Object[0], 0));
                            } else {
                                z = zH;
                                if (iy3Var instanceof gy3) {
                                    strA2 = ctf0Var.b.a(R.string.background_1_2_smart_image_background, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    if (iy3Var instanceof hy3) {
                                        lsm0 lsm0Var = ctf0Var.b;
                                        Object[] objArrCopyOf = Arrays.copyOf(new Object[0], 0);
                                        i8 = R.string.background_1_12_smart_image_background;
                                        strA2 = lsm0Var.a(R.string.background_1_12_smart_image_background, objArrCopyOf);
                                    } else {
                                        i8 = R.string.background_1_12_smart_image_background;
                                        if (iy3Var instanceof fy3) {
                                            strA2 = ctf0Var.b.a(R.string.background_1_12_smart_image_background, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            t9f.b();
                                        }
                                    }
                                    iA = bb6Var.a(strA2, dkq.DRAWABLE);
                                    if (z6) {
                                        i9 = R.string.background_1_17_smart_image_background;
                                    } else if (iy3Var instanceof gy3) {
                                        i9 = R.string.background_1_2_smart_image_background;
                                    } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                        i9 = i8;
                                    } else {
                                        t9f.b();
                                    }
                                    if (z6) {
                                        strArrG = ctf0Var.g(R.array.smart_images_1_17);
                                    } else if (iy3Var instanceof gy3) {
                                        strArrG = ctf0Var.g(R.array.smart_images_1_2);
                                    } else if ((iy3Var instanceof hy3) && !(iy3Var instanceof fy3)) {
                                        t9f.b();
                                    } else {
                                        strArrG = ctf0Var.g(R.array.smart_images_1_12);
                                    }
                                    arrayListB = bb6Var.b((String[]) Arrays.copyOf(strArrG, strArrG.length));
                                    if (arrayListB.size() != 8) {
                                        z3 = false;
                                    } else {
                                        if (!arrayListB.isEmpty()) {
                                            it = arrayListB.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    if (((Number) it.next()).intValue() != 0) {
                                                        z3 = false;
                                                    }
                                                }
                                            }
                                        }
                                        z3 = true;
                                    }
                                    if (iA == 0 && z3) {
                                        bbk0Var = new ebk0(iy3Var, iA, arrayListB);
                                        z2 = z4;
                                    } else {
                                        z2 = z4;
                                        iA2 = bb6Var.a(ctf0Var.b.a(i9, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
                                        if (iA2 != 0) {
                                            rywVar5 = new syw(iA2);
                                            i10 = R.attr.uikitSplashBackground;
                                        } else {
                                            i10 = R.attr.uikitSplashBackground;
                                            rywVar5 = new ryw(ctf0.b(R.attr.uikitSplashBackground, ctf0Var));
                                        }
                                        bbk0Var = new dbk0(iy3Var, new y0x(rywVar5, ctf0.b(i10, ctf0Var)));
                                    }
                                }
                            }
                            i8 = R.string.background_1_12_smart_image_background;
                            iA = bb6Var.a(strA2, dkq.DRAWABLE);
                            if (z6) {
                                i9 = R.string.background_1_17_smart_image_background;
                            } else if (iy3Var instanceof gy3) {
                                i9 = R.string.background_1_2_smart_image_background;
                            } else {
                                if (iy3Var instanceof hy3) {
                                    t9f.b();
                                }
                                i9 = i8;
                            }
                            if (z6) {
                                strArrG = ctf0Var.g(R.array.smart_images_1_17);
                            } else if (iy3Var instanceof gy3) {
                                strArrG = ctf0Var.g(R.array.smart_images_1_2);
                            } else if (iy3Var instanceof hy3) {
                                strArrG = ctf0Var.g(R.array.smart_images_1_12);
                            } else {
                                t9f.b();
                            }
                            arrayListB = bb6Var.b((String[]) Arrays.copyOf(strArrG, strArrG.length));
                            if (arrayListB.size() != 8) {
                                z3 = false;
                            } else {
                                if (!arrayListB.isEmpty()) {
                                    it = arrayListB.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((Number) it.next()).intValue() != 0) {
                                                z3 = false;
                                            }
                                        }
                                    }
                                }
                                z3 = true;
                            }
                            if (iA == 0) {
                                z2 = z4;
                                iA2 = bb6Var.a(ctf0Var.b.a(i9, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
                                if (iA2 != 0) {
                                    rywVar5 = new syw(iA2);
                                    i10 = R.attr.uikitSplashBackground;
                                } else {
                                    i10 = R.attr.uikitSplashBackground;
                                    rywVar5 = new ryw(ctf0.b(R.attr.uikitSplashBackground, ctf0Var));
                                }
                                bbk0Var = new dbk0(iy3Var, new y0x(rywVar5, ctf0.b(i10, ctf0Var)));
                            } else {
                                z2 = z4;
                                iA2 = bb6Var.a(ctf0Var.b.a(i9, Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
                                if (iA2 != 0) {
                                    rywVar5 = new syw(iA2);
                                    i10 = R.attr.uikitSplashBackground;
                                } else {
                                    i10 = R.attr.uikitSplashBackground;
                                    rywVar5 = new ryw(ctf0.b(R.attr.uikitSplashBackground, ctf0Var));
                                }
                                bbk0Var = new dbk0(iy3Var, new y0x(rywVar5, ctf0.b(i10, ctf0Var)));
                            }
                        } else {
                            t9f.b();
                        }
                        return null;
                    }
                    z = zH;
                    z2 = z4;
                    if (oc5Var == null) {
                        int iA8 = bb6Var.a(ctf0Var.b.a(hew0.J(jh3Var2), Arrays.copyOf(new Object[0], 0)), dkq.DRAWABLE);
                        if (iA8 != 0) {
                            rywVar2 = new syw(iA8);
                            i3 = R.attr.uikitSplashBackground;
                        } else {
                            i3 = R.attr.uikitSplashBackground;
                            rywVar2 = new ryw(ctf0.b(R.attr.uikitSplashBackground, ctf0Var));
                        }
                        bbk0Var = new bbk0(iy3Var, new y0x(rywVar2, ctf0.b(i3, ctf0Var)));
                    } else {
                        String strB0 = o050.b0(oc5Var, iy3Var);
                        if (strB0.length() == 0) {
                            tywVar = new ryw(ctf0.b(R.attr.uikitSplashBackground, ctf0Var));
                            i2 = R.attr.uikitSplashBackground;
                        } else {
                            tywVar = new tyw(strB0, 0, true);
                            i2 = R.attr.uikitSplashBackground;
                        }
                        bbk0Var = new bbk0(iy3Var, new y0x(tywVar, ctf0.b(i2, ctf0Var)));
                    }
                }
                boolean z7 = bbk0Var instanceof fbk0;
                boolean z8 = eh3Var == eh3.REMOTE_IMAGE;
                if (z7) {
                    ig3Var = new ig3(jh3Var2.f16508a, null, null, null, null);
                } else {
                    String strF = ctf0Var.f(R.string.content_partner_image, new Object[0]);
                    dkq dkqVar = dkq.DRAWABLE;
                    int iA9 = bb6Var.a(strF, dkqVar);
                    int iA10 = bb6Var.a(ctf0Var.f(R.string.content_app_logo_image, new Object[0]), dkqVar);
                    String str3 = jh3Var2.f16508a;
                    pek0 pek0Var = ah3.f854a;
                    gh3 gh3Var = hh3Var.f13042a;
                    pek0Var.getClass();
                    int iOrdinal2 = gh3Var.ordinal();
                    if (iOrdinal2 == 0) {
                        ah3Var = ah3.b;
                    } else if (iOrdinal2 == 1) {
                        ah3Var = ah3.c;
                    } else if (iOrdinal2 == 2) {
                        ah3Var = ah3.d;
                    } else if (iOrdinal2 == 3) {
                        ah3Var = ah3.e;
                    } else {
                        if (iOrdinal2 != 4) {
                            t9f.b();
                            return null;
                        }
                        ah3Var = ah3.f;
                    }
                    ah3 ah3Var2 = ah3Var;
                    jdk0 jdk0Var = wg3.f39093a;
                    fh3 fh3Var = hh3Var.c;
                    jdk0Var.getClass();
                    int iOrdinal3 = fh3Var.ordinal();
                    if (iOrdinal3 == 1) {
                        wg3Var = wg3.c;
                    } else if (iOrdinal3 != 2) {
                        wg3Var = iOrdinal3 != 3 ? wg3.b : wg3.e;
                    } else {
                        wg3Var = wg3.d;
                    }
                    wg3 wg3Var2 = wg3Var;
                    if (z8) {
                        String str4 = oc5Var != null ? oc5Var.d : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        bx00Var = str4.length() > 0 ? new cx00(str4, iA10) : new ax00(iA10);
                    } else {
                        if (z2) {
                            bx00Var = new bx00(iA10);
                        } else {
                            dx00Var = null;
                        }
                        if (z8) {
                            if (oc5Var != null) {
                                str = oc5Var.e;
                            } else {
                                str = null;
                            }
                            str2 = str != null ? str : "";
                            if (str2.length() > 0) {
                                gx80Var = new hx80(str2, iA9);
                            } else {
                                gx80Var = new fx80(iA9);
                            }
                        } else {
                            if (z) {
                                gx80Var = new gx80(iA9);
                            } else {
                                ix80Var = null;
                            }
                            ig3Var = new ig3(str3, ah3Var2, wg3Var2, ix80Var, dx00Var);
                        }
                        ix80Var = gx80Var;
                        ig3Var = new ig3(str3, ah3Var2, wg3Var2, ix80Var, dx00Var);
                    }
                    dx00Var = bx00Var;
                    if (z8) {
                        if (oc5Var != null) {
                            str = oc5Var.e;
                        } else {
                            str = null;
                        }
                        if (str != null) {
                        }
                        if (str2.length() > 0) {
                            gx80Var = new hx80(str2, iA9);
                        } else {
                            gx80Var = new fx80(iA9);
                        }
                    } else {
                        if (z) {
                            gx80Var = new gx80(iA9);
                        } else {
                            ix80Var = null;
                        }
                        ig3Var = new ig3(str3, ah3Var2, wg3Var2, ix80Var, dx00Var);
                    }
                    ix80Var = gx80Var;
                    ig3Var = new ig3(str3, ah3Var2, wg3Var2, ix80Var, dx00Var);
                }
                nh3 nh3Var = new nh3(bbk0Var, ig3Var);
                ei3Var.j = 1;
                if (kmqVar.a(nh3Var, ei3Var) == wneVar2) {
                    return wneVar2;
                }
                return Unit.f46060a;
        }
    }
}
