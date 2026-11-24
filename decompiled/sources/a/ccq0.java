package a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.fragment.app.Fragment;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.presentation.dialog.bet_summary.BetsSummaryInfoUiModel;
import org.xplatform.cyber.section.impl.championships.universal.domain.model.calendar_tournament.CalendarTournamentMatchStatusModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ccq0 {
    public static final ugd b;
    public static final ugd d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f4125a = {new int[]{121, 120, 127, 126, 133, 132, 139, 138, 145, 144, 151, 150, 157, 156, 163, 162, 169, 168, 175, 174, Response.CALL_IS_BEING_FORWARDED, 180, 187, 186, 193, 192, 199, 198, -2, -2}, new int[]{123, 122, 129, 128, 135, 134, 141, 140, 147, 146, 153, 152, 159, 158, 165, 164, 171, 170, 177, 176, Response.SESSION_PROGRESS, Response.QUEUED, 189, 188, 195, 194, 201, Response.OK, 816, -3}, new int[]{125, 124, 131, 130, 137, 136, 143, 142, 149, 148, 155, 154, 161, 160, 167, 166, 173, 172, 179, 178, ModuleDescriptor.MODULE_VERSION, 184, 191, 190, 197, 196, 203, Response.ACCEPTED, 818, 817}, new int[]{283, 282, 277, 276, 271, SubsamplingScaleImageView.ORIENTATION_270, 265, 264, 259, 258, 253, 252, 247, 246, 241, 240, 235, 234, 229, 228, 223, 222, 217, 216, 211, 210, 205, 204, 819, -3}, new int[]{285, 284, 279, 278, 273, 272, 267, 266, 261, 260, 255, 254, 249, 248, 243, 242, 237, 236, 231, 230, 225, 224, 219, 218, 213, 212, 207, 206, 821, 820}, new int[]{287, 286, 281, 280, 275, 274, 269, 268, 263, 262, 257, 256, 251, 250, 245, 244, 239, 238, 233, 232, 227, 226, 221, 220, 215, 214, 209, 208, 822, -3}, new int[]{289, 288, 295, 294, 301, 300, WarningHeader.SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD, WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD, 313, 312, 319, 318, 325, 324, WarningHeader.UNICAST_NOT_AVAILABLE, WarningHeader.MULTICAST_NOT_AVAILABLE, 337, 336, 343, 342, 349, 348, 355, 354, 361, 360, 367, 366, 824, 823}, new int[]{291, 290, 297, 296, WarningHeader.INCOMPATIBLE_BANDWIDTH_UNITS, 302, 309, 308, 315, 314, 321, 320, 327, 326, 333, 332, 339, 338, 345, 344, 351, 350, 357, 356, 363, 362, 369, 368, 825, -3}, new int[]{293, 292, 299, 298, 305, WarningHeader.MEDIA_TYPE_NOT_AVAILABLE, 311, 310, 317, 316, 323, 322, 329, 328, 335, 334, 341, 340, 347, 346, 353, 352, 359, 358, 365, 364, 371, WarningHeader.INSUFFICIENT_BANDWIDTH, 827, 826}, new int[]{409, Response.REQUEST_TIMEOUT, Response.FORBIDDEN, Response.PAYMENT_REQUIRED, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, 384, 379, 378, 373, 372, 828, -3}, new int[]{411, Response.GONE, Response.METHOD_NOT_ALLOWED, Response.NOT_FOUND, WarningHeader.MISCELLANEOUS_WARNING, 398, 393, 392, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, 111, 110, 387, 386, 381, Response.ALTERNATIVE_SERVICE, 375, 374, 830, 829}, new int[]{Response.REQUEST_ENTITY_TOO_LARGE, Response.CONDITIONAL_REQUEST_FAILED, Response.PROXY_AUTHENTICATION_REQUIRED, Response.NOT_ACCEPTABLE, Response.UNAUTHORIZED, Response.BAD_REQUEST, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, 112, 389, 388, 383, 382, 377, 376, 831, -3}, new int[]{Response.UNSUPPORTED_MEDIA_TYPE, Response.REQUEST_URI_TOO_LONG, Response.EXTENSION_REQUIRED, Response.BAD_EXTENSION, 427, 426, 103, 102, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, 433, 432, 439, 438, 445, 444, 833, 832}, new int[]{417, Response.UNSUPPORTED_URI_SCHEME, Response.INTERVAL_TOO_BRIEF, 422, 429, 428, 105, 104, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, 435, 434, 441, 440, 447, 446, 834, -3}, new int[]{419, 418, 425, 424, 431, 430, 107, 106, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, 437, 436, 443, 442, 449, 448, 836, 835}, new int[]{Response.CALL_OR_TRANSACTION_DOES_NOT_EXIST, Response.TEMPORARILY_UNAVAILABLE, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, 462, 457, 456, 451, 450, 837, -3}, new int[]{Response.TOO_MANY_HOPS, Response.LOOP_DETECTED, 477, 476, 471, 470, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, 458, 453, 452, 839, 838}, new int[]{Response.AMBIGUOUS, Response.ADDRESS_INCOMPLETE, 479, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, 460, 455, 454, 840, -3}, new int[]{Response.REQUEST_TERMINATED, Response.BUSY_HERE, Response.UNDECIPHERABLE, 492, 499, 498, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, Response.VERSION_NOT_SUPPORTED, Response.SERVER_TIMEOUT, 511, 510, 517, 516, 842, 841}, new int[]{Response.BAD_EVENT, Response.NOT_ACCEPTABLE_HERE, 495, 494, Response.NOT_IMPLEMENTED, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, 507, 506, Response.MESSAGE_TOO_LARGE, 512, 519, 518, 843, -3}, new int[]{Response.REQUEST_PENDING, 490, 497, 496, Response.SERVICE_UNAVAILABLE, Response.BAD_GATEWAY, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, 508, 515, 514, 521, 520, 845, 844}, new int[]{559, 558, 553, 552, 547, 546, 541, 540, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, 535, 534, 529, 528, 523, 522, 846, -3}, new int[]{561, 560, 555, 554, 549, 548, 543, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, 117, 116, 537, 536, 531, 530, 525, 524, 848, 847}, new int[]{563, 562, 557, 556, 551, 550, 545, 544, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, 538, 533, 532, 527, 526, 849, -3}, new int[]{565, 564, 571, 570, 577, 576, 583, 582, 589, 588, 595, 594, 601, Response.BUSY_EVERYWHERE, 607, Response.SESSION_NOT_ACCEPTABLE, 613, 612, 619, 618, 625, 624, 631, 630, 637, 636, 643, 642, 851, 850}, new int[]{567, 566, 573, 572, 579, 578, 585, 584, 591, 590, 597, 596, Response.DECLINE, 602, 609, 608, 615, 614, 621, 620, 627, 626, 633, 632, 639, 638, 645, 644, 852, -3}, new int[]{569, 568, 575, 574, 581, 580, 587, 586, 593, 592, 599, 598, 605, Response.DOES_NOT_EXIST_ANYWHERE, 611, 610, 617, 616, 623, 622, 629, 628, 635, 634, 641, 640, 647, 646, 854, 853}, new int[]{727, 726, 721, 720, 715, 714, 709, 708, 703, 702, 697, 696, 691, 690, 685, 684, 679, 678, 673, 672, 667, 666, 661, 660, 655, 654, 649, 648, 855, -3}, new int[]{729, 728, 723, 722, 717, 716, 711, 710, 705, 704, 699, 698, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, 663, 662, 657, 656, 651, 650, 857, 856}, new int[]{731, 730, 725, 724, 719, 718, 713, 712, 707, 706, 701, 700, 695, 694, 689, 688, 683, 682, 677, 676, 671, 670, 665, 664, 659, 658, 653, 652, 858, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, 750, 757, 756, 763, 762, 769, 768, 775, 774, 781, 780, 787, 786, 793, 792, 799, 798, 805, 804, 811, 810, 860, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, 752, 759, 758, 765, 764, 771, 770, 777, 776, 783, 782, 789, 788, 795, 794, 801, 800, 807, 806, 813, 812, 861, -3}, new int[]{737, 736, 743, 742, 749, 748, 755, 754, 761, 760, 767, 766, 773, 772, 779, 778, 785, 784, 791, 790, 797, 796, 803, 802, 809, 808, 815, 814, 863, 862}};
    public static final ugd c = new ugd(-84863105, false, new bhd(4));
    public static final ugd e = new ugd(-187831400, false, new ihd(20));
    public static final ugd f = new ugd(-158943620, false, new ihd(21));
    public static final ugd g = new ugd(-207901533, false, new qhd(16));
    public static final wyb0 h = new wyb0(0);
    public static final vgd i = new vgd(8);
    public static final /* synthetic */ int[] j = {1, 2, 3, 4, 5, 6, 7};

    static {
        byte b2 = 5;
        b = new ugd(-1798676062, false, new qbd(b2));
        d = new ugd(-161885744, false, new fhd(b2));
    }

    public static final void A(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(692070932);
        byte b2 = 4;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (((r400) l7m0Var.getValue()).h) {
            fetVar.e0(1642340094);
            d(((r400) l7m0Var.getValue()).j, ((r400) l7m0Var.getValue()).i, function1, fetVar, (i3 << 3) & 896);
            fetVar.r(false);
        } else {
            fetVar.e0(1642267151);
            m(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i2, b2);
        }
    }

    public static final void B(int i2, fet fetVar) {
        fetVar.g0(841298415);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new c51((byte) 23);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = i120.Q(y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kpb.j(null, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xg1(i2);
        }
    }

    public static final void C(int i2, fet fetVar) {
        fetVar.g0(1771855506);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new jtz((byte) 20);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarW, StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kpb.j(jm40.b, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kyz(i2, (byte) 2);
        }
    }

    public static final void D(mm40 mm40Var, dbs0 dbs0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-397147105);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(dbs0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            v0h0 v0h0Var = xcz.y;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new c51((byte) 24);
                fetVar2.o0(objP);
            }
            xcz xczVar = (xcz) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar2, 384);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarQ = i120.Q(mm40Var.e(n0qVar), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
            if (dbs0Var != null) {
                if (dbs0Var instanceof bbs0) {
                    fetVar2.e0(1024416786);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    int i4 = i3;
                    mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7);
                    mdm mdmVar = ((bbs0) dbs0Var).f2323a;
                    boolean z4 = (i4 & 896) == 256;
                    Object objP2 = fetVar2.P();
                    if (z4 || objP2 == cl5Var) {
                        objP2 = new si1(function1, (byte) 22);
                        fetVar2.o0(objP2);
                    }
                    z2 = true;
                    jcb.l(mm40VarN, mdmVar, false, (Function0) objP2, fetVar2, 0, 4);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    int i5 = i3;
                    z = false;
                    z2 = true;
                    if (dbs0Var instanceof abs0) {
                        fetVar2.e0(1024995711);
                        int i6 = i5 << 3;
                        k(xczVar, (abs0) dbs0Var, function1, fetVar2, 6 | (i6 & 896) | (i6 & 7168));
                        fetVar2.r(false);
                    } else if (dbs0Var instanceof cbs0) {
                        fetVar2.e0(1025220616);
                        K((cbs0) dbs0Var, fetVar2, (i5 & 112) | 6);
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(z2);
            } else {
                z = false;
            }
            throw b1j.f(1418517560, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) dbs0Var, (Object) function1, i2, (byte) 20);
        }
    }

    public static final void E(final m400 m400Var, final Function1 function1, fet fetVar, int i2) {
        boolean z;
        yjj0 yjj0VarA;
        ljc ljcVar = jd8.n;
        fetVar.g0(910136150);
        int i3 = (fetVar.g(m400Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        final byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            oy oyVar = m400Var.f;
            wui0 wui0Var = m400Var.d;
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (oyVar == null) {
                fetVar.e0(-262338973);
                mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                rqm rqmVar = new rqm(new rui0(m400Var.c, null, m400Var.b, null, 58), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, m400Var.e, (e900) null, 318);
                boolean z2 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new Function0() { // from class: a.k400
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b3 = b2;
                            m400 m400Var2 = m400Var;
                            Function1 function2 = function1;
                            switch (b3) {
                                case 0:
                                    function2.invoke(new t300(m400Var2.f21143a));
                                    break;
                                default:
                                    function2.invoke(new t300(m400Var2.f21143a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP);
                }
                obc.q(mm40VarL, rqmVar, true, null, (Function0) objP, null, null, null, fetVar, 384, 232);
                fetVar.r(false);
            } else {
                fetVar.e0(-261717919);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                mm40 mm40VarL2 = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                rqm rqmVar2 = new rqm((vui0) new rui0(m400Var.c, null, m400Var.b, null, 58), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 446);
                boolean z3 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                Object objP2 = fetVar.P();
                if (z3 || objP2 == cl5Var) {
                    final byte b3 = 1;
                    objP2 = new Function0() { // from class: a.k400
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            m400 m400Var2 = m400Var;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(new t300(m400Var2.f21143a));
                                    break;
                                default:
                                    function2.invoke(new t300(m400Var2.f21143a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP2);
                }
                obc.q(mm40VarL2, rqmVar2, false, null, (Function0) objP2, null, null, null, fetVar, 384, 232);
                mm40 mm40VarL3 = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                zfn zfnVar = zaq0.b;
                long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
                int iOrdinal = oyVar.b.ordinal();
                if (iOrdinal != 0) {
                    z = true;
                    if (iOrdinal == 1) {
                        zcl zclVar = qmk.f28987a;
                        yjj0VarA = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                    } else if (iOrdinal == 2) {
                        yjj0VarA = ljcVar;
                    } else if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        yjj0VarA = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                    }
                } else {
                    z = true;
                    zcl zclVar3 = qmk.f28987a;
                    yjj0VarA = vgg0.a(16.0f);
                }
                mm40 mm40VarQ = i120.Q(mm40VarL3, backgroundContent, yjj0VarA);
                zcl zclVar4 = qmk.f28987a;
                w(0, fetVar, s5x0.N(mm40VarQ, 16.0f, 0.0f, 16.0f, 12.0f, 2), oyVar.f26036a);
                if (oyVar.b != wui0.d) {
                    fetVar.e0(-1627145954);
                    jcb.v(s5x0.N(i120.Q(s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator(), fetVar, 0, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1626726958);
                    fetVar.r(false);
                }
                fetVar.r(z);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(m400Var, function1, i2, (byte) 19);
        }
    }

    public static final void F(mm40 mm40Var, ak60 ak60Var, float f2, Function0 function0, Function0 function1, fet fetVar, int i2) {
        int i3;
        Object obj;
        boolean z;
        fetVar.g0(-794940222);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(ak60Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z2 = (i4 & 896) == 256;
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (z2 || objP == obj2) {
                objP = new f54(f2, (byte) 23);
                fetVar.o0(objP);
            }
            mm40 mm40VarL = s5x0.L(i4w0.T(mm40Var, (Function1) objP), xfn.a(fetVar).e, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o050.S(s5x0.N(mm40VarL, 0.0f, 0.0f, 0.0f, 16.0f, 7)), 1.0f);
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = ak60Var.d;
            jm40 jm40Var = jm40.b;
            if (str != null) {
                fetVar.e0(-1414549072);
                boolean zG = fetVar.g(str);
                Object objP2 = fetVar.P();
                if (zG || objP2 == obj2) {
                    objP2 = new wul(oul.e, oe9.f25112a, new ue9(str), true, false, true);
                    fetVar.o0(objP2);
                }
                wul wulVar = (wul) objP2;
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                boolean z3 = (i4 & 7168) == 2048;
                Object objP3 = fetVar.P();
                if (z3 || objP3 == obj2) {
                    objP3 = new a2z(function0, (byte) 21);
                    fetVar.o0(objP3);
                }
                obj = obj2;
                qzb.n(mm40VarD2, wulVar, (Function0) objP3, fetVar, 6, 0);
                z = false;
                fetVar.r(false);
            } else {
                obj = obj2;
                z = false;
                fetVar.e0(-1413939798);
                fetVar.r(false);
            }
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            boolean z4 = z;
            wul wulVar2 = ak60Var.e;
            boolean z5 = (57344 & i4) == 16384 ? true : z4;
            Object objP4 = fetVar.P();
            if (z5 || objP4 == obj) {
                objP4 = new a2z(function1, (byte) 22);
                fetVar.o0(objP4);
            }
            qzb.n(mm40VarD3, wulVar2, (Function0) objP4, fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pt1(mm40Var, ak60Var, f2, function0, function1, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:155:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:157:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:160:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:224:0x066c  */
    /* JADX WARN: Code duplicated, block: B:230:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:233:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:234:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:240:0x0737  */
    /* JADX WARN: Code duplicated, block: B:243:0x0758  */
    /* JADX WARN: Code duplicated, block: B:245:0x076d  */
    /* JADX WARN: Code duplicated, block: B:249:0x078f  */
    /* JADX WARN: Code duplicated, block: B:252:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:253:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:257:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:262:0x082f  */
    /* JADX WARN: Code duplicated, block: B:263:0x0833  */
    /* JADX WARN: Code duplicated, block: B:266:0x0850  */
    /* JADX WARN: Code duplicated, block: B:267:0x0852  */
    /* JADX WARN: Code duplicated, block: B:270:0x088d  */
    /* JADX WARN: Code duplicated, block: B:271:0x0890  */
    /* JADX WARN: Code duplicated, block: B:288:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x04db A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r30v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    public static final void G(mm40 mm40Var, ak60 ak60Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        ?? r6;
        float fB;
        float f2;
        Object obj;
        Object obj2;
        ?? arrayList;
        Configuration configuration;
        ?? r1;
        Configuration configuration2;
        jge0 jge0Var;
        Object next;
        ?? arrayList2;
        ArrayList arrayList3;
        Iterator it;
        float f3;
        float f4;
        int i3;
        Object next2;
        int i4;
        lge0 lge0Var;
        vto0 vto0Var;
        Object obj3;
        jge0 jge0Var2;
        Object obj4;
        k6z k6zVar;
        float f5;
        float f6;
        k6z k6zVar2;
        boolean zG;
        Object obj5;
        boolean z;
        pcy pcyVar;
        boolean zI;
        Object obj6;
        y9q0 y9q0VarJ;
        g9q0 g9q0VarN;
        boolean zI2;
        Object obj7;
        boolean z2;
        boolean z3;
        boolean zG2;
        Object objP;
        y9q0 y9q0Var;
        boolean z4;
        int i5;
        boolean z5;
        ak60 ak60Var2;
        int i6;
        float f7;
        ?? r7 = fetVar;
        ak60Var.getClass();
        a4x a4xVar = ak60Var.c;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        r7.g0(-1858295287);
        int i7 = i2 | 6 | (r7.g(ak60Var) ? 32 : 16) | (r7.i(function0) ? 256 : 128) | (r7.i(function1) ? 2048 : 1024) | (r7.i(function2) ? 16384 : 8192);
        if (r7.U(i7 & 1, (i7 & 9363) != 9362)) {
            Object objP2 = r7.P();
            cl5 cl5Var = ukd.f35823a;
            Object obj8 = objP2;
            if (objP2 == cl5Var) {
                pz40 pz40VarE = androidx.compose.runtime.e.e(Boolean.FALSE);
                r7.o0(pz40VarE);
                obj8 = pz40VarE;
            }
            pz40 pz40Var = (pz40) obj8;
            Unit unit = Unit.f46060a;
            Object objP3 = r7.P();
            yje yjeVar = null;
            Object obj9 = objP3;
            if (objP3 == cl5Var) {
                nbd nbdVar = new nbd(pz40Var, yjeVar, (byte) 4);
                r7.o0(nbdVar);
                obj9 = nbdVar;
            }
            m0x0.t(r7, unit, (Function2) obj9);
            float f8 = ((Boolean) pz40Var.getValue()).booleanValue() ? 1.0f : 0.0f;
            zsf zsfVar = hhn.f13072a;
            l7m0 l7m0VarB = d43.b(f8, ro4.m0(Response.OK, 0, zsfVar, 2), "AlphaAnimation", null, r7, 3072, 20);
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                r7.e0(1654174453);
                r7.r(false);
                fB = 0.0f;
            } else {
                r7.e0(884645233);
                zcl zclVar = qmk.f28987a;
                fB = pkd.b(100.0f, r7);
                r7.r(false);
            }
            l7m0 l7m0VarB2 = d43.b(fB, ro4.m0(Response.OK, 0, zsfVar, 2), "ButtonsTranslationYAnimation", null, r7, 3072, 20);
            float f9 = xfn.a(r7).c;
            Configuration configuration3 = (Configuration) r7.k(dy2.f6873a);
            boolean z6 = configuration3.screenWidthDp <= 360;
            WeakHashMap weakHashMap = djv0.w;
            float fD = i120.O(zcm0.i(r7).f, r7).d();
            float fA = i120.O(zcm0.i(r7).e, r7).a();
            Object objP4 = r7.P();
            Object obj10 = objP4;
            if (objP4 == cl5Var) {
                pz40 pz40VarE2 = androidx.compose.runtime.e.e(iun.f15405a);
                r7.o0(pz40VarE2);
                obj10 = pz40VarE2;
            }
            pz40 pz40Var2 = (pz40) obj10;
            b2h0 b2h0Var = ak60Var.h;
            String str = ak60Var.f1007a;
            boolean zG3 = r7.g(a4xVar);
            Object objP5 = r7.P();
            if (zG3 || objP5 == cl5Var) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = a4xVar.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    Object next3 = it3.next();
                    float f10 = fD;
                    if (((fgd) next3).h) {
                        arrayList4.add(next3);
                    }
                    it2 = it3;
                    fD = f10;
                }
                f2 = fD;
                r7.o0(arrayList4);
                obj = arrayList4;
            } else {
                f2 = fD;
                obj = objP5;
            }
            List list = (List) obj;
            Object objP6 = r7.P();
            Object obj11 = objP6;
            if (objP6 == cl5Var) {
                pz40 pz40VarE3 = androidx.compose.runtime.e.e(iun.f15405a);
                r7.o0(pz40VarE3);
                obj11 = pz40VarE3;
            }
            pz40 pz40Var3 = (pz40) obj11;
            boolean zI3 = r7.i(list);
            Object objP7 = r7.P();
            byte b2 = 5;
            if (zI3 || objP7 == cl5Var) {
                yd60 yd60Var = new yd60(list, pz40Var3, (yje) null, b2);
                r7.o0(yd60Var);
                obj2 = yd60Var;
            } else {
                obj2 = objP7;
            }
            m0x0.t(r7, list, (Function2) obj2);
            List list2 = (List) pz40Var3.getValue();
            boolean zG4 = r7.g(list2);
            Object objP8 = r7.P();
            Object obj12 = objP8;
            if (zG4 || objP8 == cl5Var) {
                ArrayList arrayList5 = new ArrayList(r3d.q(list2, 10));
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(((vto0) it4.next()).f38018a);
                }
                r7.o0(arrayList5);
                obj12 = arrayList5;
            }
            List<jge0> list3 = (List) obj12;
            int size = list2.size();
            z1h0 z1h0Var = z1h0.f43620a;
            if (b2h0Var.equals(z1h0Var)) {
                arrayList = iun.f15405a;
            } else {
                Iterable<lge0> iterable = (Iterable) pz40Var2.getValue();
                arrayList = new ArrayList(r3d.q(iterable, 10));
                for (lge0 lge0Var2 : iterable) {
                    arrayList.add(k9x.r(((ne60) lge0Var2.b.d()).f23370a, ((h7k0) lge0Var2.c.d()).f12579a));
                    f9 = f9;
                }
            }
            float f11 = f9;
            boolean zG5 = r7.g(list2);
            Object objP9 = r7.P();
            if (zG5 || objP9 == cl5Var) {
                zcl zclVar2 = qmk.f28987a;
                int iMax = Math.max(arrayList.size(), list3.size());
                if (iMax == 0) {
                    arrayList2 = iun.f15405a;
                } else {
                    if (arrayList.isEmpty()) {
                        arrayList2 = new ArrayList(r3d.q(list3, 10));
                        for (jge0 jge0Var3 : list3) {
                            arrayList2.add(new qge0(jge0Var3, jge0Var3));
                        }
                    } else {
                        List list4 = list3;
                        jge0 jge0VarR = k9x.r(((jge0) CollectionsKt.d0(arrayList)).e(), 0L);
                        Iterator it5 = arrayList.iterator();
                        if (!it5.hasNext()) {
                            itt0.a();
                            return;
                        }
                        float fMin = ((jge0) it5.next()).f16474a;
                        while (it5.hasNext()) {
                            fMin = Math.min(fMin, ((jge0) it5.next()).f16474a);
                        }
                        Iterator it6 = arrayList.iterator();
                        if (!it6.hasNext()) {
                            itt0.a();
                            return;
                        }
                        float fMin2 = ((jge0) it6.next()).b;
                        while (it6.hasNext()) {
                            fMin2 = Math.min(fMin2, ((jge0) it6.next()).b);
                        }
                        Iterator it7 = arrayList.iterator();
                        if (!it7.hasNext()) {
                            itt0.a();
                            return;
                        }
                        float fMax = ((jge0) it7.next()).c;
                        while (it7.hasNext()) {
                            fMax = Math.max(fMax, ((jge0) it7.next()).c);
                            it7 = it7;
                        }
                        Iterator it8 = arrayList.iterator();
                        if (!it8.hasNext()) {
                            itt0.a();
                            return;
                        }
                        float fMax2 = ((jge0) it8.next()).d;
                        while (it8.hasNext()) {
                            fMax2 = Math.max(fMax2, ((jge0) it8.next()).d);
                            jge0VarR = jge0VarR;
                        }
                        jge0 jge0Var4 = jge0VarR;
                        jge0 jge0VarR2 = k9x.r((((long) Float.floatToRawIntBits(rw2.z(fMax2, fMin2, 2.0f, fMin2))) & 4294967295L) | (((long) Float.floatToRawIntBits(rw2.z(fMax, fMin, 2.0f, fMin))) << 32), 0L);
                        ArrayList arrayList6 = new ArrayList(iMax);
                        int i8 = 0;
                        while (i8 < iMax) {
                            jge0 jge0Var5 = (jge0) CollectionsKt.W(i8, arrayList);
                            if (jge0Var5 == null) {
                                jge0Var5 = jge0Var4;
                            }
                            List list5 = list4;
                            jge0 jge0Var6 = (jge0) CollectionsKt.W(i8, list5);
                            if (jge0Var6 == null) {
                                Iterator it9 = list5.iterator();
                                if (it9.hasNext()) {
                                    next = it9.next();
                                    if (it9.hasNext()) {
                                        jge0 jge0Var7 = (jge0) next;
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jge0Var7.e() >> 32)) - Float.intBitsToFloat((int) (jge0Var5.e() >> 32));
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jge0Var7.e() & 4294967295L)) - Float.intBitsToFloat((int) (jge0Var5.e() & 4294967295L));
                                        float f12 = (fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat);
                                        while (true) {
                                            Object next4 = it9.next();
                                            jge0 jge0Var8 = (jge0) next4;
                                            configuration2 = configuration3;
                                            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jge0Var8.e() >> 32)) - Float.intBitsToFloat((int) (jge0Var5.e() >> 32));
                                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jge0Var8.e() & 4294967295L)) - Float.intBitsToFloat((int) (jge0Var5.e() & 4294967295L));
                                            float f13 = (fIntBitsToFloat4 * fIntBitsToFloat4) + (fIntBitsToFloat3 * fIntBitsToFloat3);
                                            if (Float.compare(f12, f13) > 0) {
                                                f12 = f13;
                                                next = next4;
                                            }
                                            if (!it9.hasNext()) {
                                                break;
                                            } else {
                                                configuration3 = configuration2;
                                            }
                                        }
                                    } else {
                                        configuration2 = configuration3;
                                    }
                                } else {
                                    configuration2 = configuration3;
                                    next = null;
                                }
                                jge0Var6 = (jge0) next;
                                if (jge0Var6 == null) {
                                    jge0Var = jge0VarR2;
                                }
                                arrayList6.add(new qge0(jge0Var5, jge0Var));
                                i8++;
                                iMax = iMax;
                                list4 = list5;
                                configuration3 = configuration2;
                            } else {
                                iMax = iMax;
                                list5 = list5;
                                configuration2 = configuration3;
                            }
                            jge0Var = jge0Var6;
                            arrayList6.add(new qge0(jge0Var5, jge0Var));
                            i8++;
                            iMax = iMax;
                            list4 = list5;
                            configuration3 = configuration2;
                        }
                        configuration = configuration3;
                        r1 = arrayList6;
                    }
                    arrayList3 = new ArrayList(r3d.q(r1, 10));
                    it = r1.iterator();
                    f3 = 0.0f;
                    f4 = 0.0f;
                    i3 = 0;
                    while (it.hasNext()) {
                        next2 = it.next();
                        i4 = i3 + 1;
                        if (i3 >= 0) {
                            q3d.p();
                            throw null;
                        }
                        qge0 qge0Var = (qge0) next2;
                        Iterator it10 = it;
                        lge0Var = (lge0) CollectionsKt.W(i3, (List) pz40Var2.getValue());
                        if (lge0Var != null) {
                            f3 = ((ycl) lge0Var.d.d()).f42389a;
                        }
                        vto0Var = (vto0) CollectionsKt.W(i3, list2);
                        if (vto0Var != null) {
                            f4 = vto0Var.b;
                        }
                        arrayList3.add(new lge0(qge0Var.f28680a, qge0Var.b, f3, f4));
                        i3 = i4;
                        it = it10;
                    }
                    r7.o0(arrayList3);
                    obj3 = arrayList3;
                }
                configuration = configuration3;
                r1 = arrayList2;
                arrayList3 = new ArrayList(r3d.q(r1, 10));
                it = r1.iterator();
                f3 = 0.0f;
                f4 = 0.0f;
                i3 = 0;
                while (it.hasNext()) {
                    next2 = it.next();
                    i4 = i3 + 1;
                    if (i3 >= 0) {
                        q3d.p();
                        throw null;
                    }
                    qge0 qge0Var2 = (qge0) next2;
                    Iterator it11 = it;
                    lge0Var = (lge0) CollectionsKt.W(i3, (List) pz40Var2.getValue());
                    if (lge0Var != null) {
                        f3 = ((ycl) lge0Var.d.d()).f42389a;
                    }
                    vto0Var = (vto0) CollectionsKt.W(i3, list2);
                    if (vto0Var != null) {
                        f4 = vto0Var.b;
                    }
                    arrayList3.add(new lge0(qge0Var2.f28680a, qge0Var2.b, f3, f4));
                    i3 = i4;
                    it = it11;
                }
                r7.o0(arrayList3);
                obj3 = arrayList3;
            } else {
                configuration = configuration3;
                obj3 = objP9;
            }
            List<lge0> list6 = (List) obj3;
            Object objP10 = r7.P();
            if (objP10 == cl5Var) {
                r7.o0(str);
                objP10 = str;
            }
            String str2 = (String) objP10;
            Object objP11 = r7.P();
            Object obj13 = objP11;
            if (objP11 == cl5Var) {
                pz40 pz40VarE4 = androidx.compose.runtime.e.e(Boolean.TRUE);
                r7.o0(pz40VarE4);
                obj13 = pz40VarE4;
            }
            pz40 pz40Var4 = (pz40) obj13;
            boolean zG6 = r7.g(str);
            Object objP12 = r7.P();
            Object obj14 = objP12;
            if (zG6 || objP12 == cl5Var) {
                t33 t33VarC = xf0.c((((Boolean) pz40Var4.getValue()).booleanValue() && str.equals(str2)) ? 1.0f : 0.0f);
                r7.o0(t33VarC);
                obj14 = t33VarC;
            }
            t33 t33Var = (t33) obj14;
            boolean zG7 = r7.g(str);
            Object objP13 = r7.P();
            Object obj15 = objP13;
            if (zG7 || objP13 == cl5Var) {
                t33 t33VarC2 = xf0.c(b2h0Var.equals(z1h0Var) ? 1.0f : 0.0f);
                r7.o0(t33VarC2);
                obj15 = t33VarC2;
            }
            t33 t33Var2 = (t33) obj15;
            boolean zI4 = r7.i(list6);
            Object objP14 = r7.P();
            if (zI4 || objP14 == cl5Var) {
                jge0Var2 = null;
                j940 j940Var = new j940(pz40Var2, list6, false ? 1 : 0, (byte) 25);
                r7.o0(j940Var);
                obj4 = j940Var;
            } else {
                jge0Var2 = null;
                obj4 = objP14;
            }
            m0x0.v(list2, str, (Function2) obj4, r7);
            boolean zI5 = r7.i(arrayList) | r7.i(t33Var2) | r7.i(t33Var);
            Object objP15 = r7.P();
            if (zI5 || objP15 == cl5Var) {
                objP15 = new zvu(arrayList, t33Var2, t33Var, pz40Var4, null);
                r7.o0(objP15);
            }
            m0x0.t(r7, str, (Function2) objP15);
            ArrayList arrayList7 = new ArrayList(r3d.q(list6, 10));
            for (lge0 lge0Var3 : list6) {
                arrayList7.add(k9x.r(((ne60) lge0Var3.b.d()).f23370a, ((h7k0) lge0Var3.c.d()).f12579a));
            }
            jge0 jge0Var9 = size > 0 ? (jge0) CollectionsKt.U(arrayList7) : jge0Var2;
            pz40 pz40VarF = androidx.compose.runtime.e.f(arrayList7, r7);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(function0, r7);
            k6z k6zVar3 = (k6z) r7.k(bmd.n);
            float fW0 = ((w6k) r7.k(bmd.h)).w0(configuration.screenWidthDp);
            boolean zG8 = r7.g(jge0Var9) | r7.e(k6zVar3.ordinal()) | r7.d(fW0);
            Object objP16 = r7.P();
            if (zG8 || objP16 == cl5Var) {
                if (jge0Var9 != null) {
                    jge0Var2 = k6zVar3 == k6z.b ? new jge0(fW0 - jge0Var9.c, jge0Var9.b, fW0 - jge0Var9.f16474a, jge0Var9.d) : jge0Var9;
                }
                r7.o0(jge0Var2);
                objP16 = jge0Var2;
            }
            jge0 jge0Var10 = (jge0) objP16;
            if (jge0Var10 != null) {
                k6zVar = k6zVar3;
                boolean z7 = Float.intBitsToFloat((int) (jge0Var10.e() >> 32)) > fW0 / 2.0f;
                zcl zclVar3 = qmk.f28987a;
                f5 = f2 + 16.0f;
                f6 = (ak60Var.d != null ? 68.0f : 0.0f) + 56.0f + 16.0f + fA;
                n0q n0qVar = o7k0.c;
                mm40 mm40VarU = i4w0.U(n0qVar, 0.0f, 0.0f, ((Number) l7m0VarB.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983035);
                k6zVar2 = k6zVar;
                Unit unit2 = Unit.f46060a;
                zG = r7.g(pz40VarF) | r7.g(pz40VarF2);
                Object objP17 = r7.P();
                if (!zG || objP17 == cl5Var) {
                    wme wmeVar = new wme(pz40VarF, pz40VarF2, (byte) 1);
                    r7.o0(wmeVar);
                    obj5 = wmeVar;
                } else {
                    obj5 = objP17;
                }
                mm40 mm40VarA = fnn0.a(mm40VarU, unit2, (PointerInputEventHandler) obj5);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(r7.T);
                bh90 bh90VarM = r7.m();
                mm40 mm40VarC0 = kbc.c0(r7, mm40VarA);
                mkd.c0.getClass();
                r7.i0();
                z = r7.S;
                pcyVar = e7z.u1;
                if (z) {
                    r7.l(pcyVar);
                } else {
                    r7.r0();
                }
                shd shdVar = gqw0.x;
                jpm0.o(r7, tj30VarC, shdVar);
                shd shdVar2 = gqw0.w;
                jpm0.o(r7, bh90VarM, shdVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                shd shdVar3 = gqw0.y;
                jpm0.o(r7, numValueOf, shdVar3);
                jpm0.n(r7);
                shd shdVar4 = gqw0.v;
                jpm0.o(r7, mm40VarC0, shdVar4);
                zI = r7.i(arrayList7) | r7.i(list6) | r7.i(t33Var2);
                Object objP18 = r7.P();
                if (!zI || objP18 == cl5Var) {
                    jl40 jl40Var = new jl40((Object) arrayList7, (Object) t33Var2, (Object) list6, (byte) 11);
                    r7.o0(jl40Var);
                    obj6 = jl40Var;
                } else {
                    obj6 = objP18;
                }
                zq8.a(0, r7, rq8.M(n0qVar, (Function1) obj6));
                r7.e0(796461619);
                r7.r(false);
                if (z6) {
                    r7.e0(856978425);
                    afn0.v(r7).getClass();
                    y9q0VarJ = g1t0.m();
                } else {
                    r7.e0(856979645);
                    afn0.v(r7).getClass();
                    y9q0VarJ = g1t0.j();
                }
                r7.r(false);
                g9q0VarN = pym0.n(r7);
                zI2 = r7.i(t33Var);
                Object objP19 = r7.P();
                obj7 = objP19;
                if (zI2 || objP19 == cl5Var) {
                    m53 m53Var = new m53(t33Var, (byte) 22);
                    r7.o0(m53Var);
                    obj7 = m53Var;
                }
                mm40 mm40VarT = i4w0.T(n0qVar, (Function1) obj7);
                boolean zD = r7.d(f11) | r7.d(f5) | r7.d(f6) | r7.g(jge0Var10);
                z2 = z7;
                boolean zH = zD | r7.h(z2);
                if ((i7 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zG2 = z3 | zH | r7.g(g9q0VarN) | r7.g(y9q0VarJ) | r7.e(k6zVar2.ordinal());
                objP = r7.P();
                if (!zG2 || objP == cl5Var) {
                    y9q0Var = y9q0VarJ;
                    z4 = z2;
                    i5 = 0;
                    z5 = true;
                    zj60 zj60Var = new zj60(f11, f5, f6, jge0Var10, z4, ak60Var, g9q0VarN, y9q0Var, k6zVar2);
                    ak60Var2 = ak60Var;
                    r7.o0(zj60Var);
                    objP = zj60Var;
                } else {
                    ak60Var2 = ak60Var;
                    y9q0Var = y9q0VarJ;
                    z4 = z2;
                    i5 = 0;
                    z5 = true;
                }
                tj30 tj30Var = (tj30) objP;
                int iHashCode2 = Long.hashCode(r7.T);
                bh90 bh90VarM2 = r7.m();
                mm40 mm40VarC1 = kbc.c0(r7, mm40VarT);
                r7.i0();
                if (r7.S) {
                    r7.l(pcyVar);
                } else {
                    r7.r0();
                }
                jpm0.o(r7, tj30Var, shdVar);
                jpm0.o(r7, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, r7, shdVar3, r7);
                jpm0.o(r7, mm40VarC1, shdVar4);
                String str3 = ak60Var2.b;
                long jM123getWhite0d7_KjU = afn0.p(r7).m123getWhite0d7_KjU();
                if (z4) {
                    i6 = 6;
                } else {
                    i6 = 5;
                }
                f2q0 f2q0Var = new f2q0(i6);
                jm40 jm40Var = jm40.b;
                int i9 = i5;
                boolean z8 = z5;
                v8q0.a(str3, jm40Var, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, f2q0Var, 0L, 2, false, 6, 0, null, y9q0Var, fetVar, 48, 24960, 109560);
                if (z6) {
                    f7 = 48.0f;
                } else {
                    f7 = 66.0f;
                }
                j0x.b(a8k0.F(R.drawable.ic_onboarding_arow, i9, fetVar), null, o7k0.e(jm40Var, f7), null, gqw0.Y, 0.0f, new m78(afn0.p(fetVar).m123getWhite0d7_KjU(), 5), fetVar, 24632, 40);
                fetVar.r(z8);
                F(jr8.f16991a.b(jm40Var, gqw0.h), ak60Var, ((Number) l7m0VarB2.getValue()).floatValue(), function1, function2, fetVar, 64624 & i7);
                fet fetVar2 = fetVar;
                fetVar2.r(z8);
                mm40Var2 = jm40Var;
                r6 = fetVar2;
            } else {
                k6zVar = k6zVar3;
            }
            zcl zclVar4 = qmk.f28987a;
            f5 = f2 + 16.0f;
            f6 = (ak60Var.d != null ? 68.0f : 0.0f) + 56.0f + 16.0f + fA;
            n0q n0qVar2 = o7k0.c;
            mm40 mm40VarU2 = i4w0.U(n0qVar2, 0.0f, 0.0f, ((Number) l7m0VarB.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983035);
            k6zVar2 = k6zVar;
            Unit unit3 = Unit.f46060a;
            zG = r7.g(pz40VarF) | r7.g(pz40VarF2);
            Object objP110 = r7.P();
            if (zG) {
                wme wmeVar2 = new wme(pz40VarF, pz40VarF2, (byte) 1);
                r7.o0(wmeVar2);
                obj5 = wmeVar2;
            } else {
                wme wmeVar3 = new wme(pz40VarF, pz40VarF2, (byte) 1);
                r7.o0(wmeVar3);
                obj5 = wmeVar3;
            }
            mm40 mm40VarA2 = fnn0.a(mm40VarU2, unit3, (PointerInputEventHandler) obj5);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(r7.T);
            bh90 bh90VarM3 = r7.m();
            mm40 mm40VarC2 = kbc.c0(r7, mm40VarA2);
            mkd.c0.getClass();
            r7.i0();
            z = r7.S;
            pcyVar = e7z.u1;
            if (z) {
                r7.l(pcyVar);
            } else {
                r7.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(r7, tj30VarC2, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(r7, bh90VarM3, shdVar6);
            Integer numValueOf2 = Integer.valueOf(iHashCode3);
            shd shdVar7 = gqw0.y;
            jpm0.o(r7, numValueOf2, shdVar7);
            jpm0.n(r7);
            shd shdVar8 = gqw0.v;
            jpm0.o(r7, mm40VarC2, shdVar8);
            zI = r7.i(arrayList7) | r7.i(list6) | r7.i(t33Var2);
            Object objP111 = r7.P();
            if (zI) {
                jl40 jl40Var2 = new jl40((Object) arrayList7, (Object) t33Var2, (Object) list6, (byte) 11);
                r7.o0(jl40Var2);
                obj6 = jl40Var2;
            } else {
                jl40 jl40Var3 = new jl40((Object) arrayList7, (Object) t33Var2, (Object) list6, (byte) 11);
                r7.o0(jl40Var3);
                obj6 = jl40Var3;
            }
            zq8.a(0, r7, rq8.M(n0qVar2, (Function1) obj6));
            r7.e0(796461619);
            r7.r(false);
            if (z6) {
                r7.e0(856978425);
                afn0.v(r7).getClass();
                y9q0VarJ = g1t0.m();
            } else {
                r7.e0(856979645);
                afn0.v(r7).getClass();
                y9q0VarJ = g1t0.j();
            }
            r7.r(false);
            g9q0VarN = pym0.n(r7);
            zI2 = r7.i(t33Var);
            Object objP112 = r7.P();
            obj7 = objP112;
            if (zI2) {
                m53 m53Var2 = new m53(t33Var, (byte) 22);
                r7.o0(m53Var2);
                obj7 = m53Var2;
            } else {
                m53 m53Var3 = new m53(t33Var, (byte) 22);
                r7.o0(m53Var3);
                obj7 = m53Var3;
            }
            mm40 mm40VarT2 = i4w0.T(n0qVar2, (Function1) obj7);
            boolean zD2 = r7.d(f11) | r7.d(f5) | r7.d(f6) | r7.g(jge0Var10);
            z2 = z7;
            boolean zH2 = zD2 | r7.h(z2);
            if ((i7 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            zG2 = z3 | zH2 | r7.g(g9q0VarN) | r7.g(y9q0VarJ) | r7.e(k6zVar2.ordinal());
            objP = r7.P();
            if (zG2) {
                y9q0Var = y9q0VarJ;
                z4 = z2;
                i5 = 0;
                z5 = true;
                zj60 zj60Var2 = new zj60(f11, f5, f6, jge0Var10, z4, ak60Var, g9q0VarN, y9q0Var, k6zVar2);
                ak60Var2 = ak60Var;
                r7.o0(zj60Var2);
                objP = zj60Var2;
            } else {
                y9q0Var = y9q0VarJ;
                z4 = z2;
                i5 = 0;
                z5 = true;
                zj60 zj60Var3 = new zj60(f11, f5, f6, jge0Var10, z4, ak60Var, g9q0VarN, y9q0Var, k6zVar2);
                ak60Var2 = ak60Var;
                r7.o0(zj60Var3);
                objP = zj60Var3;
            }
            tj30 tj30Var2 = (tj30) objP;
            int iHashCode4 = Long.hashCode(r7.T);
            bh90 bh90VarM4 = r7.m();
            mm40 mm40VarC3 = kbc.c0(r7, mm40VarT2);
            r7.i0();
            if (r7.S) {
                r7.l(pcyVar);
            } else {
                r7.r0();
            }
            jpm0.o(r7, tj30Var2, shdVar5);
            jpm0.o(r7, bh90VarM4, shdVar6);
            vqd.u(iHashCode4, r7, shdVar7, r7);
            jpm0.o(r7, mm40VarC3, shdVar8);
            String str4 = ak60Var2.b;
            long jM123getWhite0d7_KjU2 = afn0.p(r7).m123getWhite0d7_KjU();
            if (z4) {
                i6 = 6;
            } else {
                i6 = 5;
            }
            f2q0 f2q0Var2 = new f2q0(i6);
            jm40 jm40Var2 = jm40.b;
            int i10 = i5;
            boolean z9 = z5;
            v8q0.a(str4, jm40Var2, jM123getWhite0d7_KjU2, null, 0L, null, null, null, 0L, f2q0Var2, 0L, 2, false, 6, 0, null, y9q0Var, fetVar, 48, 24960, 109560);
            if (z6) {
                f7 = 48.0f;
            } else {
                f7 = 66.0f;
            }
            j0x.b(a8k0.F(R.drawable.ic_onboarding_arow, i10, fetVar), null, o7k0.e(jm40Var2, f7), null, gqw0.Y, 0.0f, new m78(afn0.p(fetVar).m123getWhite0d7_KjU(), 5), fetVar, 24632, 40);
            fetVar.r(z9);
            F(jr8.f16991a.b(jm40Var2, gqw0.h), ak60Var, ((Number) l7m0VarB2.getValue()).floatValue(), function1, function2, fetVar, 64624 & i7);
            fet fetVar3 = fetVar;
            fetVar3.r(z9);
            mm40Var2 = jm40Var2;
            r6 = fetVar3;
        } else {
            r7.X();
            mm40Var2 = mm40Var;
            r6 = r7;
        }
        yfe0 yfe0VarU = r6.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) mm40Var2, (Object) ak60Var, (Object) function0, (Object) function1, (Object) function2, i2, (byte) 13);
        }
    }

    public static final void H(String str, String str2, String str3, fet fetVar, int i2) {
        fetVar.g0(413753999);
        byte b2 = 2;
        int i3 = (fetVar.g(str) ? 4 : 2) | i2 | (fetVar.g(str2) ? 32 : 16) | (fetVar.g(str3) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ugd(2112122411, true, new g0(str, (byte) 13));
                fetVar.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            boolean z2 = (i3 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ugd(-305575990, true, new hw6(str2, str3, b2));
                fetVar.o0(objP2);
            }
            xdx.n(null, function2, (Function2) objP2, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tv7(str, str2, str3, i2, (byte) 0);
        }
    }

    public static final void I(Function0 function0, Function0 function1, Function1 function2, crh0 crh0Var, boolean z, fet fetVar, int i2) {
        function0.getClass();
        function1.getClass();
        function2.getClass();
        crh0Var.getClass();
        fetVar.g0(-894080256);
        int i3 = i2 | (fetVar.i(function0) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128) | (fetVar.g(crh0Var) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            wom womVarF = mom.f(fetVar);
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "PullToRefreshBox");
            zx7 zx7Var = gqw0.e;
            boolean z2 = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new l3c0(function0, (byte) 9);
                fetVar.o0(objP);
            }
            mom.c(mm40VarE0, z, womVarF, zx7Var, false, null, (Function0) objP, null, u1c.M(1634471125, new sqc0((byte) 10, (Object) crh0Var, (Object) function1, function2), fetVar), fetVar, ((i3 >> 9) & 112) | 100666374, 176);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new brc0(function0, function1, function2, crh0Var, z, i2);
        }
    }

    public static final void J(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-576927583);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40VarD, 108.0f), vgg0.a(20.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i2, (byte) 24);
        }
    }

    public static final void K(cbs0 cbs0Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1262211412);
        int i4 = i2 & 6;
        y5d y5dVar = y5d.f42040a;
        if (i4 == 0) {
            i3 = (fetVar.g(y5dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(cbs0Var) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarB = y5dVar.b(jm40.b, true);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 30.0f, 7);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new m51(cbs0Var, (byte) 10);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarB, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(cbs0Var, i2, b2);
        }
    }

    public static final void L(mm40 mm40Var, a4x a4xVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        mm40 mm40Var2;
        mm40 mm40VarV;
        qw3 qw3Var;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(2095385380);
        int i3 = i2 | 6 | (fetVar.g(a4xVar) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function2 = function1;
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        } else {
            function2 = function1;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = pkd.d(fetVar) ? 2 : 1;
            d9z d9zVarA = f9z.a(fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(d9zVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new md0(d9zVarA, (byte) 15);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            e2d e2dVar = (e2d) fetVar.k(nip.f23600a);
            jm40 jm40Var = jm40.b;
            if (e2dVar != null) {
                fetVar.e0(571824224);
                boolean zG2 = fetVar.g(l7m0VarY);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new f7f0(l7m0VarY, (byte) 25);
                    fetVar.o0(objP2);
                }
                mm40VarV = cjx.V(jm40Var, e2d.b(e2dVar, (Function0) objP2), null);
                fetVar.r(false);
            } else {
                fetVar.e0(571982758);
                fetVar.r(false);
                mm40VarV = jm40Var;
            }
            mm40 mm40VarE = mm40VarV.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(mm40VarE, qmk.a(fetVar).c, 0.0f, 2), "LAZY_VERTICAL_GRID_GAMES");
            ngv ngvVar = new ngv(i4);
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
            qw3 qw3Var3 = new qw3(8.0f, true, new gne(gqw0.n, (byte) 12));
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 32.0f, 5), fetVar);
            boolean z3 = ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 57344) == 16384);
            Object objP3 = fetVar.P();
            if (z3 || objP3 == obj) {
                Function1 function3 = function2;
                qw3Var = qw3Var3;
                objP3 = new fbn0((byte) 0, a4xVar, function3, z, z2);
                fetVar.o0(objP3);
            } else {
                qw3Var = qw3Var3;
            }
            g8x.i(ngvVar, mm40VarE0, d9zVarA, ch80VarG, qw3Var2, qw3Var, null, false, null, (Function1) objP3, fetVar, 0, 912);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gbn0(mm40Var2, a4xVar, z, z2, function1, i2, (byte) 0);
        }
    }

    public static final void M(mm40 mm40Var, p400 p400Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        pvi0 jvi0Var;
        fetVar.g0(1137789190);
        int i3 = i2 | 6 | (fetVar.g(p400Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f2, 0.0f, 2);
            String str = p400Var.b;
            String str2 = p400Var.c;
            tui0 tui0Var = new tui0(str, null);
            if (p400Var.e) {
                fetVar.e0(-3671152);
                zfn zfnVar = zaq0.b;
                jvi0Var = new kvi0(str2, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()));
                fetVar.r(false);
            } else {
                fetVar.e0(-3450029);
                jvi0Var = new jvi0(str2, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()));
                fetVar.r(false);
            }
            rqm rqmVar = new rqm(tui0Var, (pui0) null, jvi0Var, (d4d) null, (tvi0) null, p400Var.d, p400Var.e, (e900) null, 314);
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new mbz(function1, p400Var, (byte) 8);
                fetVar.o0(objP);
            }
            obc.q(mm40VarL, rqmVar, true, null, (Function0) objP, null, null, null, fetVar, 384, 232);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, p400Var, function1, i2, (byte) 5);
        }
    }

    public static final void N(mm40 mm40Var, ya0 ya0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-515148462);
        int i3 = i2 | (fetVar2.g(ya0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            if (ya0Var != null) {
                boolean z = ya0Var instanceof wa0;
                cl5 cl5Var = ukd.f35823a;
                if (z) {
                    fetVar2.e0(-869451107);
                    wa0 wa0Var = (wa0) ya0Var;
                    ijl ijlVar = wa0Var.b;
                    jjl jjlVar = wa0Var.f38804a;
                    int i4 = i3 & 896;
                    boolean z2 = i4 == 256;
                    Object objP = fetVar2.P();
                    if (z2 || objP == cl5Var) {
                        objP = new si1(function1, (byte) 23);
                        fetVar2.o0(objP);
                    }
                    Function0 function0 = (Function0) objP;
                    boolean z3 = i4 == 256;
                    Object objP2 = fetVar2.P();
                    if (z3 || objP2 == cl5Var) {
                        objP2 = new si1(function1, (byte) 24);
                        fetVar2.o0(objP2);
                    }
                    Function0 function2 = (Function0) objP2;
                    boolean z4 = i4 == 256;
                    Object objP3 = fetVar2.P();
                    if (z4 || objP3 == cl5Var) {
                        objP3 = new si1(function1, (byte) 25);
                        fetVar2.o0(objP3);
                    }
                    feb.k(ijlVar, jjlVar, null, function0, function2, (Function0) objP3, fetVar2, 0, 4);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else if (ya0Var instanceof xa0) {
                    fetVar2.e0(-868807764);
                    mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarQ, 12.0f, 8.0f);
                    xa0 xa0Var = (xa0) ya0Var;
                    boolean z5 = true;
                    String str = xa0Var.f40529a;
                    String str2 = xa0Var.b;
                    int i5 = i3 & 896;
                    boolean z6 = i5 == 256;
                    Object objP4 = fetVar2.P();
                    if (z6 || objP4 == cl5Var) {
                        objP4 = new si1(function1, (byte) 26);
                        fetVar2.o0(objP4);
                    }
                    Function0 function3 = (Function0) objP4;
                    if (i5 != 256) {
                        z5 = false;
                    }
                    Object objP5 = fetVar2.P();
                    if (z5 || objP5 == cl5Var) {
                        objP5 = new si1(function1, (byte) 20);
                        fetVar2.o0(objP5);
                    }
                    pzb.g(mm40VarK, str, str2, function3, (Function0) objP5, fetVar2, 0);
                    fetVar2.r(false);
                }
            }
            throw b1j.f(-1136427028, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yf0(mm40Var, ya0Var, function1, i2, (byte) 1);
        }
    }

    public static final void O(mm40 mm40Var, c4s0 c4s0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        cl5 cl5Var;
        kwj kwjVar;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-370711318);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b3 = 16;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(c4s0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            vne vneVar = (vne) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var2) {
                objP2 = new yqr0(b3);
                fetVar2.o0(objP2);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP2, fetVar2, 384, 3);
            Integer numValueOf = Integer.valueOf(kwjVarB.k());
            int i4 = i3 & 896;
            boolean zG = (i4 == 256) | fetVar2.g(kwjVarB);
            Object objP3 = fetVar2.P();
            yje yjeVar = null;
            if (zG || objP3 == cl5Var2) {
                objP3 = new fc30(function1, kwjVarB, yjeVar, b2);
                fetVar2.o0(objP3);
            }
            m0x0.t(fetVar2, numValueOf, (Function2) objP3);
            ci ciVar = c4s0Var.g;
            b4s0 b4s0Var = c4s0Var.d;
            boolean z2 = c4s0Var.f;
            boolean zG2 = fetVar2.g(ciVar);
            Object objP4 = fetVar2.P();
            if (zG2 || objP4 == cl5Var2) {
                objP4 = Boolean.valueOf(ciVar != null);
                fetVar2.o0(objP4);
            }
            boolean zBooleanValue = ((Boolean) objP4).booleanValue();
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int i5 = i3;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf2, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            if (z2) {
                fetVar2.e0(-216931151);
                mm40 mm40VarQ = i120.Q(phu0.H(jm40Var, null, 1), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 12.0f);
                a4x a4xVar = b4s0Var.f1974a;
                dxh0 dxh0Var = b4s0Var.b;
                boolean z4 = (i5 & 112) == 32;
                Object objP5 = fetVar2.P();
                if (z4 || objP5 == cl5Var2) {
                    objP5 = new qir0(c4s0Var, (byte) 8);
                    fetVar2.o0(objP5);
                }
                Function0 function0 = (Function0) objP5;
                kwjVar = kwjVarB;
                boolean zI = fetVar2.i(vneVar) | fetVar2.g(kwjVar);
                Object objP6 = fetVar2.P();
                if (zI || objP6 == cl5Var2) {
                    objP6 = new b8q0((Object) vneVar, (Object) kwjVar, (byte) 24);
                    fetVar2.o0(objP6);
                }
                cl5Var = cl5Var2;
                z = false;
                ibc.n(mm40VarK, a4xVar, gxh0.f12078a, dxh0Var, false, function0, (Function1) objP6, fetVar2, 0, 16);
                fetVar2.r(false);
            } else {
                cl5Var = cl5Var2;
                kwjVar = kwjVarB;
                z = false;
                fetVar2.e0(-216190220);
                fetVar2.r(false);
            }
            if (z2) {
                fetVar2.e0(-216128654);
                q5x.e(kwjVar, null, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1436838917, new ywl0(c4s0Var, zBooleanValue, function1, (byte) 2), fetVar2), fetVar, 0, 24576, 16382);
                fetVar2 = fetVar;
                fetVar2.r(z);
                function2 = function1;
            } else {
                fetVar2.e0(-215284338);
                unh0.g0((i5 << 3) & 7168, fetVar2, c4s0Var.b, null, function1, r24);
                function2 = function1;
                fetVar2.r(z);
            }
            fetVar2.r(true);
            if (r22 == 0) {
                fetVar2.e0(1406068531);
                fetVar2.r(z);
            } else {
                fetVar2.e0(1406068532);
                mm40 mm40VarN = s5x0.N(jr8.f16991a.b(jm40Var, gqw0.h), 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, z), 7);
                mtl mtlVar = ciVar.f4387a;
                zcl zclVar2 = qmk.f28987a;
                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                boolean z5 = ((i5 & 112) == 32 ? true : z) | (i4 == 256 ? true : z);
                Object objP7 = fetVar2.P();
                if (z5 || objP7 == cl5Var) {
                    objP7 = new b8q0((Object) function2, (Object) c4s0Var, (byte) 25);
                    fetVar2.o0(objP7);
                }
                bkb.f(mm40VarN, mtlVar, null, false, lh80VarU, (Function1) objP7, fetVar, 3072, 4);
                fetVar2 = fetVar;
                fetVar2.r(z);
            }
            fetVar2.r(true);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, c4s0Var, function2, i2, (byte) 11);
        }
    }

    public static final void P(mm40 mm40Var, e4s0 e4s0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-559787215);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(e4s0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (e4s0Var != null) {
                boolean z = e4s0Var instanceof c4s0;
                mm40Var2 = jm40.b;
                if (z) {
                    fetVar.e0(737327687);
                    O(mm40Var2, (c4s0) e4s0Var, function1, fetVar, i3 & 1022);
                    fetVar.r(false);
                } else if (e4s0Var instanceof d4s0) {
                    fetVar.e0(737538673);
                    Q((d4s0) e4s0Var, function1, fetVar, (i3 >> 3) & 126);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-1084595730, fetVar, false);
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var2, e4s0Var, function1, i2, (byte) 10);
        }
    }

    public static final void Q(d4s0 d4s0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(530725455);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(d4s0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarH = phu0.H(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7), null, 1);
            mdm mdmVar = d4s0Var.b;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sbr0(function1, (byte) 23);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarH, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0(d4s0Var, function1, i2, b2);
        }
    }

    public static final void R(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        l7m0Var.getClass();
        fetVar.g0(-2139347137);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(yyw.X(mm40Var.e(o7k0.c), null, fetVar, 1), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarH = phu0.H(jm40.b, null, 1);
            imm immVarA = ((e4s0) l7m0Var.getValue()).a();
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sbr0(function1, (byte) 22);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarH, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
            function2 = function1;
            P(null, (e4s0) l7m0Var.getValue(), function2, fetVar, i4);
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var, l7m0Var, function2, i2, (byte) 13);
        }
    }

    public static final gbn S(Function1 function1) {
        return new gbn(new o33((byte) 20), new l9(3, (byte) 26), new wc2(function1, (byte) 13), zx3.f);
    }

    public static final void T(Fragment fragment, String str, Function0 function0) {
        fragment.getClass();
        androidx.fragment.app.e eVarC = fragment.C();
        eVarC.getClass();
        X(eVarC, str, "SECOND", fragment, function0);
    }

    public static final void U(yc3 yc3Var, Function0 function0) {
        X(yc3Var.r(), "REQUEST_ATTENTION_DIALOG_KEY", "FIRST", yc3Var, function0);
    }

    public static final void V(Fragment fragment, String str, Function0 function0) {
        fragment.getClass();
        function0.getClass();
        androidx.fragment.app.e eVarC = fragment.C();
        eVarC.getClass();
        X(eVarC, str, "FIRST", fragment, function0);
    }

    public static void W(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static final void X(androidx.fragment.app.e eVar, String str, String str2, clz clzVar, Function0 function0) {
        eVar.getClass();
        function0.getClass();
        String strConcat = str.concat(str2);
        eVar.u0(strConcat, clzVar, new hi(strConcat, str2, function0, (byte) 0));
    }

    public static final void Y(u0i u0iVar, String str, androidx.fragment.app.e eVar) {
        eVar.getClass();
        Fragment fragmentJ = eVar.J(str);
        if ((fragmentJ instanceof u0i ? (u0i) fragmentJ : null) == null) {
            zb5 zb5Var = new zb5(eVar);
            zb5Var.k(0, u0iVar, str, 1);
            zb5Var.g(true, true);
        }
    }

    public static final st0 Z(mlr mlrVar, ctf0 ctf0Var, boolean z, boolean z2, boolean z3, pt0 pt0Var, Integer num) {
        String strA;
        nur murVar;
        pt0 pt0Var2;
        pt0 pt0Var3;
        pt0 pt0Var4;
        sso0 uqo0Var;
        mlrVar.getClass();
        boolean z4 = mlrVar.k;
        ctf0Var.getClass();
        pt0Var.getClass();
        int i2 = z2 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
        boolean z5 = mlrVar.j;
        int i3 = 0;
        if (z4) {
            strA = ctf0Var.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = z5 ? ctf0Var.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
        }
        long j2 = mlrVar.f22006a;
        String str = mlrVar.f;
        String str2 = mlrVar.e;
        if (z) {
            i3 = z3 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked;
        }
        mtr mtrVar = new mtr(i3, z3);
        n0x n0xVar = new n0x(mlrVar.g);
        m0x m0xVar = new m0x(i2, null, 6);
        if (strA.length() == 0) {
            murVar = lur.f20686a;
        } else {
            pt0 pt0Var5 = pt0.f27539a;
            if ((pt0Var == pt0Var5 && z4) || ((pt0Var == (pt0Var2 = pt0.c) && z4) || (pt0Var == (pt0Var3 = pt0.d) && z4))) {
                d4d d4dVar = d4d.PRIMARY;
                uqo0Var = new lro0();
            } else if ((pt0Var == pt0Var5 && z5) || ((pt0Var == pt0Var2 && z5) || (pt0Var == pt0Var3 && z5))) {
                d4d d4dVar2 = d4d.PRIMARY;
                uqo0Var = new eqo0();
            } else {
                pt0 pt0Var6 = pt0.b;
                if ((pt0Var == pt0Var6 && z4) || (pt0Var == (pt0Var4 = pt0.e) && z4)) {
                    uqo0Var = kro0.f18776a;
                } else {
                    uqo0Var = ((pt0Var == pt0Var6 && z5) || (pt0Var == pt0Var4 && z5)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                }
            }
            murVar = new mur(strA, uqo0Var);
        }
        return new st0(j2, str, str2, mtrVar, n0xVar, m0xVar, num, murVar);
    }

    public static final void a(kz1 kz1Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        boolean z;
        kz1Var.getClass();
        dbs0 dbs0Var = kz1Var.d;
        function1.getClass();
        fetVar.g0(442712420);
        int i3 = i2 | (fetVar.g(kz1Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar), fetVar, 24576);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = cjx.V(o050.W(o2e.e0(jm40Var, "TOURNAMENTS_SCREEN")), cloVarB.e, null);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarV);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            ahy.b(o2e.e0(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), "AGGREGATOR_CATEGORY_NAVBAR"), cloVarB, dbs0Var instanceof bbs0, u1c.M(-308138545, new vy1(kz1Var, function1, (byte) 0), fetVar), u1c.M(789179344, new vy1(kz1Var, function1, (byte) 1), fetVar), fetVar, 27648, 0);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (kz1Var.b) {
                fetVar.e0(-813351256);
                z = false;
                B(0, fetVar);
            } else {
                z = false;
                fetVar.e0(555922530);
            }
            fetVar.r(z);
            function2 = function1;
            D(o2e.e0(jm40Var, "MIDDLE_CONTENT"), dbs0Var, function2, fetVar, ((i3 << 3) & 896) | 6);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vy1(kz1Var, function2, i2);
        }
    }

    public static final x5l0 a0(d0t d0tVar, ctf0 ctf0Var, y78 y78Var, boolean z, boolean z2, String str, int i2, boolean z3, boolean z4, v5l0 v5l0Var, String str2, v12 v12Var, boolean z5) {
        d0tVar.getClass();
        ctf0Var.getClass();
        y78Var.getClass();
        v5l0Var.getClass();
        str2.getClass();
        return new x5l0(sre0.f32672a.b(x5l0.class).J() + BundleUtil.UNDERLINE_TAG + d0tVar.f5282a, wwb.V(d0tVar, ctf0Var, y78Var, z, z2, str, false, kotlin.collections.a.c(Integer.valueOf(i2)), z3, z4, false, v5l0Var, d0tVar.K.isEmpty() ? i5l0.f14197a : l5l0.f19463a, str2, z5), v12Var, z5);
    }

    public static final void b(oyq0 oyq0Var, imm immVar, imm immVar2, Function0 function0, fet fetVar, int i2) {
        oyq0Var.getClass();
        immVar.getClass();
        immVar2.getClass();
        function0.getClass();
        fetVar.g0(139769557);
        int i3 = i2 | (fetVar.g(oyq0Var) ? 4 : 2) | (fetVar.g(immVar) ? 32 : 16) | (fetVar.g(immVar2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = ((((i3 & 14) ^ 6) > 4 && fetVar.g(oyq0Var)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && fetVar.g(immVar)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && fetVar.g(immVar2)) || (i3 & 384) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = jgk0.b(new kk0(oyq0Var, immVar2, immVar, (byte) 7));
                fetVar.o0(objP);
            }
            hlm.c(jm40.b, (imm) ((l7m0) objP).getValue(), null, function0, null, null, null, null, null, null, null, null, fetVar, (i3 & 7168) | 6, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 23, i2, oyq0Var, immVar, immVar2, function0);
        }
    }

    public static final zv6 b0(bx6 bx6Var, ctf0 ctf0Var, knb0 knb0Var, boolean z) {
        String strS;
        gx6 gx6Var;
        ctf0Var.getClass();
        tw6 tw6Var = bx6Var.b;
        a8q0 a8q0Var = bx6Var.f3362a;
        String strA = ctf0Var.b.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0));
        boolean z2 = tw6Var.o;
        boolean z3 = tw6Var.m;
        double d2 = tw6Var.d;
        double d3 = tw6Var.f34633a;
        nx6 nx6Var = new nx6(a8q0Var, strA, z2, true, tw6Var.p);
        String str = tw6Var.f;
        double dB = tw6Var.b();
        if ((d2 <= d3 && d3 <= dB) || d3 == -1.0d || (d3 > dB && z3)) {
            strS = l8x.R(tw6Var.g, tw6Var.d, str, tw6Var.e);
        } else if (d3 < d2) {
            strS = l8x.T(ctf0Var, d2, str);
        } else {
            strS = (d3 <= tw6Var.b() || z3) ? "" : l8x.S(ctf0Var, tw6Var.e, str);
        }
        boolean z4 = false;
        pln0 pln0Var = new pln0(strS, false, z3);
        String str2 = knb0Var.b;
        String str3 = knb0Var.c;
        if (z) {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        wnb0 wnb0Var = new wnb0(str2, str3, knb0Var.f18577a);
        boolean z5 = tw6Var.l;
        boolean z6 = d3 > d2 && !z;
        if (d3 < tw6Var.b() && !z) {
            z4 = true;
        }
        kke kkeVar = new kke(z5, z5, z6, z4);
        if (tw6Var.n || z) {
            gx6Var = gx6.c;
        } else {
            double dB2 = tw6Var.b();
            gx6Var = ((d2 > d3 || d3 > dB2) && d3 != -1.0d && (d3 <= dB2 || !z3)) ? gx6.b : gx6.f12062a;
        }
        return new zv6(nx6Var, pln0Var, wnb0Var, kkeVar, gx6Var, str, tw6Var.j);
    }

    public static final void c(mm40 mm40Var, final BetsSummaryInfoUiModel betsSummaryInfoUiModel, fet fetVar, int i2) {
        fetVar.g0(322779427);
        int i3 = (fetVar.i(betsSummaryInfoUiModel) ? 32 : 16) | i2;
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarA0 = wha0.a0(cjx.V(s5x0.M(mm40Var, 16.0f, 8.0f, 16.0f, 24.0f), x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = betsSummaryInfoUiModel.g;
            String str2 = betsSummaryInfoUiModel.f;
            boolean zG = fetVar.g(str);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ugd(933399633, true, new Function2() { // from class: a.sv7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b2;
                        jm40 jm40Var = jm40.b;
                        BetsSummaryInfoUiModel betsSummaryInfoUiModel2 = betsSummaryInfoUiModel;
                        switch (b4) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    mm40 mm40VarK0 = mrv.k0(jm40Var, "TITLE_TEXT");
                                    String str3 = betsSummaryInfoUiModel2.g;
                                    qrq qrqVar = j1t0.c;
                                    long j2 = qmk.s;
                                    aad.e(str3, mm40VarK0, ibm0.n(new y9q0(0L, j2, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), null, 2, false, 2, 0, null, new n05(qmk.q, j2, qmk.n), fetVar2, 1597488, 424);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    mm40 mm40VarK1 = mrv.k0(jm40Var, "DESCRIPTION_TEXT");
                                    String str4 = betsSummaryInfoUiModel2.b;
                                    qrq qrqVar2 = j1t0.b;
                                    long j3 = qmk.s;
                                    aad.e(str4, mm40VarK1, ibm0.t(new y9q0(0L, j3, null, qrqVar2, 0L, null, 0, 0, qmk.G, 16646109), fetVar3), null, 2, false, 2, 0, null, new n05(qmk.q, j3, qmk.n), fetVar3, 1597488, 424);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                fetVar.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            boolean zG2 = fetVar.g(betsSummaryInfoUiModel.b);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new ugd(-1870998958, true, new Function2() { // from class: a.sv7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b4 = b3;
                        jm40 jm40Var = jm40.b;
                        BetsSummaryInfoUiModel betsSummaryInfoUiModel2 = betsSummaryInfoUiModel;
                        switch (b4) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    mm40 mm40VarK0 = mrv.k0(jm40Var, "TITLE_TEXT");
                                    String str3 = betsSummaryInfoUiModel2.g;
                                    qrq qrqVar = j1t0.c;
                                    long j2 = qmk.s;
                                    aad.e(str3, mm40VarK0, ibm0.n(new y9q0(0L, j2, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), null, 2, false, 2, 0, null, new n05(qmk.q, j2, qmk.n), fetVar2, 1597488, 424);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    mm40 mm40VarK1 = mrv.k0(jm40Var, "DESCRIPTION_TEXT");
                                    String str4 = betsSummaryInfoUiModel2.b;
                                    qrq qrqVar2 = j1t0.b;
                                    long j3 = qmk.s;
                                    aad.e(str4, mm40VarK1, ibm0.t(new y9q0(0L, j3, null, qrqVar2, 0L, null, 0, 0, qmk.G, 16646109), fetVar3), null, 2, false, 2, 0, null, new n05(qmk.q, j3, qmk.n), fetVar3, 1597488, 424);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                fetVar.o0(objP2);
            }
            xdx.n(null, function2, (Function2) objP2, fetVar, 0);
            H(betsSummaryInfoUiModel.h, betsSummaryInfoUiModel.c, str2, fetVar, 0);
            H(betsSummaryInfoUiModel.i, betsSummaryInfoUiModel.d, str2, fetVar, 0);
            H(betsSummaryInfoUiModel.j, betsSummaryInfoUiModel.e, str2, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, betsSummaryInfoUiModel, i2, (byte) 8);
        }
    }

    public static final xm9 c0(an9 an9Var) {
        CalendarTournamentMatchStatusModel calendarTournamentMatchStatusModel;
        an9Var.getClass();
        String str = an9Var.f1139a;
        if (str == null) {
            str = "";
        }
        Long l = an9Var.b;
        long jLongValue = l != null ? l.longValue() : -1L;
        Long l2 = an9Var.c;
        long jLongValue2 = l2 != null ? l2.longValue() : -1L;
        bn9 bn9VarD0 = d0(an9Var.d);
        bn9 bn9VarD1 = d0(an9Var.e);
        String str2 = an9Var.f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = an9Var.g;
        if (str3 == null) {
            str3 = "";
        }
        Integer num = an9Var.h;
        if (num != null && num.intValue() == 0) {
            calendarTournamentMatchStatusModel = CalendarTournamentMatchStatusModel.f46576a;
        } else {
            calendarTournamentMatchStatusModel = (num != null && num.intValue() == 1) ? CalendarTournamentMatchStatusModel.b : CalendarTournamentMatchStatusModel.c;
        }
        String str4 = an9Var.i;
        String str5 = str4 != null ? str4 : "";
        Long l3 = an9Var.j;
        return new xm9(str, jLongValue, jLongValue2, bn9VarD0, bn9VarD1, str2, str3, calendarTournamentMatchStatusModel, str5, l3 != null ? l3.longValue() : -1L);
    }

    public static final void d(imm immVar, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        imm immVar2;
        int i3;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(978372454);
        if ((i2 & 6) == 0) {
            immVar2 = immVar;
            i3 = (fetVar2.g(immVar2) ? 4 : 2) | i2;
        } else {
            immVar2 = immVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function2) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarW = o050.W(jm40.b);
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new yqz(function2, (byte) 27);
                fetVar2.o0(objP);
            }
            int i5 = i3;
            hlm.c(mm40VarW, immVar2, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, ((i3 << 3) & 112) | 805306368, 54, 500);
            fetVar2 = fetVar;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            boolean z3 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                function2 = function1;
                objP2 = new yqz(function2, (byte) 28);
                fetVar2.o0(objP2);
            } else {
                function2 = function1;
            }
            jcb.l(null, mdmVar, false, (Function0) objP2, fetVar2, i5 & 112, 5);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf7(immVar, mdmVar, function2, i2, (byte) 3);
        }
    }

    public static final bn9 d0(en9 en9Var) {
        Boolean bool;
        Integer num;
        Long l;
        long jLongValue = (en9Var == null || (l = en9Var.f8082a) == null) ? -1L : l.longValue();
        String str = en9Var != null ? en9Var.b : null;
        if (str == null) {
            str = "";
        }
        return new bn9((en9Var == null || (num = en9Var.d) == null) ? -1 : num.intValue(), jLongValue, str, lmc.E(en9Var != null ? en9Var.c : null), (en9Var == null || (bool = en9Var.e) == null) ? false : bool.booleanValue());
    }

    public static final void e(mm40 mm40Var, bo8 bo8Var, fet fetVar) {
        bo8Var.getClass();
        obc.d(bmd.n.a(k6z.f17794a), u1c.M(1616686566, new t87(mm40Var, bo8Var, (byte) 19), fetVar), fetVar, 56);
    }

    public static int[] e0() {
        return (int[]) j.clone();
    }

    public static final void f(mm40 mm40Var, String str, String str2, xx7 xx7Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-356830014);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            int i4 = i3 >> 3;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zfn zfnVar = m8m0.f21378a;
            long jM131getWhite800d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, null, jM131getWhite800d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar2, i4 & 14, 24960, 110586);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str2, null, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.i(), fetVar2, (i3 >> 6) & 14, 24960, 110586);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r0i(mm40Var, str, str2, xx7Var, i2, (byte) 0);
        }
    }

    public static final void g(ifa ifaVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        fet fetVar2;
        function1.getClass();
        fetVar.g0(293460543);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(ifaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            lea leaVar = ifaVar.e;
            hfa hfaVar = ifaVar.b;
            x4d0.q(null, leaVar, fetVar, 0);
            function2 = function1;
            fetVar2 = fetVar;
            cem0.g(o7k0.d(jm40.b, 1.0f), ifaVar.f14676a, function2, fetVar2, ((i3 << 3) & 896) | 6, 0);
            if (hfaVar instanceof gfa) {
                fetVar2.e0(-676763061);
                fre0.j(0, fetVar2, ifaVar.d, null, String.valueOf(hfaVar.f12963a));
                fetVar2.r(false);
            } else {
                if (!(hfaVar instanceof ffa)) {
                    throw b1j.f(1640734764, fetVar2, false);
                }
                fetVar2.e0(1640743217);
                ro4.m(null, ifaVar.c, fetVar2, 0);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            function2 = function1;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) ifaVar, (Object) function2, i2, (byte) 29);
        }
    }

    public static final void h(r0b r0bVar, fet fetVar, int i2) {
        fetVar.g0(967688052);
        int i3 = (fetVar.g(r0bVar) ? 32 : 16) | i2;
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (r0bVar instanceof q0b) {
            fetVar.e0(-2059680718);
            j(6, fetVar);
            fetVar.r(false);
        } else {
            if (!(r0bVar instanceof p0b)) {
                throw b1j.f(-2059682376, fetVar, false);
            }
            fetVar.e0(-2059678290);
            i((p0b) r0bVar, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bna(r0bVar, i2, (byte) 11);
        }
    }

    public static final void i(p0b p0bVar, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(-42198154);
        int i3 = (fetVar.g(p0bVar) ? 32 : 16) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean zG = fetVar.g(p0bVar.f26140a);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                hjm hjmVar = new hjm(p0bVar.f26140a, new mjm(127), null, null, null, null, false, null, null, false, null, null, 8188);
                fetVar.o0(hjmVar);
                objP = hjmVar;
            }
            hjm hjmVar2 = (hjm) objP;
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarI = dw9.i(zclVar, zclVar, zclVar, zclVar, jm40Var);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40VarI, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 12.0f, 4.0f, 12.0f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            nkb.h(o7k0.d(jm40Var, 1.0f), hjmVar2, kjm.f18392a, null, null, null, fetVar, 390, 56);
            fetVar2 = fetVar;
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            fetVar2.e0(1173772737);
            Iterator it = CollectionsKt.D0(p0bVar.b, 3).iterator();
            while (it.hasNext()) {
                unh0.n(new x7z(1.0f, true), (o0b) it.next(), fetVar2, 0);
            }
            ohs0.x(fetVar2, false, true, true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bna(p0bVar, i2, (byte) 12);
        }
    }

    public static final void j(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-481111669);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarI = dw9.i(zclVar, zclVar, zclVar, zclVar, jm40Var);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40VarI, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 12.0f, 4.0f, 12.0f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar2 = fetVar;
            nkb.h(o7k0.d(jm40Var, 1.0f), new ijm(), kjm.f18392a, null, null, null, fetVar2, 390, 56);
            dw9.x(h97.e(zclVar, zclVar, zclVar, zclVar, o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 110.0f), 1.0f)), vbc.d0(null, fetVar2, 0, 1), fetVar2, 0, true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pua(i2, (byte) 5);
        }
    }

    public static final void k(xcz xczVar, abs0 abs0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        xcz xczVar2;
        fetVar.g0(-1185685494);
        int i4 = i2 & 6;
        y5d y5dVar = y5d.f42040a;
        if (i4 == 0) {
            i3 = (fetVar.g(y5dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            xczVar2 = xczVar;
            i3 |= fetVar.g(xczVar2) ? 32 : 16;
        } else {
            xczVar2 = xczVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(abs0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarE0 = o2e.e0(y5dVar.b(jm40.b, true), "TOURNAMENTS_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 30.0f, 7), fetVar);
            boolean z = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new df1(abs0Var, function1, (byte) 8);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, xczVar2, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, i3 & 112, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) xczVar, (Object) abs0Var, (Object) function1, i2, (byte) 19);
        }
    }

    public static final void l(mm40 mm40Var, trm trmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        pcy pcyVar;
        jm40 jm40Var;
        trm trmVar2 = trmVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(915960031);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(trmVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        byte b3 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) fetVar2.k(dy2.b);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.e(mm40VarD, 108.0f), vgg0.a(20.0f));
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new gnm(function1, trmVar2, b2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40VarJ, null, null, false, null, (Function0) objP, fetVar, 0, 15);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            m0x m0xVar = trmVar2.f;
            String str = trmVar2.d;
            fetVar.e0(-1212642899);
            k1x k1xVar = new k1x(context);
            k1xVar.c = Integer.valueOf(m0xVar.f20977a);
            mz3 mz3VarX = l7x.X(k1xVar.a(), null, null, fetVar, 0, 30);
            fetVar.r(false);
            k1x k1xVar2 = new k1x(context);
            k1xVar2.c = trmVar2.e.a();
            lls0[] lls0VarArr = {new zo5(b3)};
            kuo kuoVar = q1x.f27974a;
            q1x.b(k1xVar2, tx3.g0(lls0VarArr));
            o1x o1xVarA = k1xVar2.a();
            n0q n0qVar = o7k0.c;
            k7x.b(o1xVarA, null, lgb.J(n0qVar, vgg0.a(20.0f)), mz3VarX, mz3VarX, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            fet fetVar3 = fetVar;
            mm40 mm40VarM = s5x0.M(n0qVar, 12.0f, 12.0f, 12.0f, 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarM);
            fetVar3.i0();
            if (fetVar3.S) {
                pcyVar = pcyVar2;
                fetVar3.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar3, 0);
            int iHashCode3 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM3 = fetVar3.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC2 = kbc.c0(fetVar3, jm40Var2);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, shdVar);
            jpm0.o(fetVar3, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC2, shdVar4);
            if (str.length() > 0) {
                n(0, fetVar3, rz4.f(fetVar3, -1127399417, 1.0f, false), str);
                fetVar3.r(false);
            } else {
                fetVar3.e0(-1127218749);
                fetVar3.r(false);
            }
            if (trmVar.c.length() > 0) {
                fetVar3.e0(-1127143853);
                jm40Var = jm40Var2;
                j6n.h(trmVar.c, kro0.f18776a, null, 0, 0, fetVar, 48, 28);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar3.e0(-1126987613);
                fetVar3.r(false);
            }
            fetVar3.r(true);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM4 = fetVar3.m();
            mm40 mm40VarC3 = kbc.c0(fetVar3, n0qVar);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC2, shdVar);
            jpm0.o(fetVar3, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC3, shdVar4);
            trmVar2 = trmVar;
            fet fetVar4 = fetVar3;
            v8q0.a(trmVar2.b, o2e.e0(jr8.f16991a.b(jm40Var, gqw0.g), "DS_SPORT_BANNER_CHAMPIONSHIP_TEXT"), ((StaticColors) fetVar3.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.w, null, j1t0.f15753a, 0L, null, 0, 0, qmk.I, 16646109), fetVar4, 0, 24960, 110584);
            fetVar2 = fetVar4;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) trmVar2, (Object) function1, i2, (byte) 19);
        }
    }

    public static final void m(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1232415148);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            m8x.y(o7k0.c, u1c.M(-1563851152, new s000(l7m0Var, function1, (byte) 5), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, null, u1c.M(-490120389, new xs4(l7m0Var, function1, (byte) 7), fetVar), fetVar, 805306422, 444);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var, function1, i2, (byte) 6);
        }
    }

    public static final void n(int i2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fet fetVar2 = fetVar;
        fetVar2.g0(528213216);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zfn zfnVar = m8m0.f21378a;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40Var, jM123getWhite0d7_KjU, vgg0.b(8.0f, 6.0f, 6.0f, 8.0f)), 2.0f, 2.0f, 4.0f, 2.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.n(jm40Var, 12.0f), ((StaticColors) fetVar2.k(zfnVar)).m113getRed0d7_KjU(), vgg0.f37379a);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_popular, 0, fetVar2), null, o7k0.n(jm40Var, 10.0f), ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(true);
            str2 = str;
            v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i3 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i2, (byte) 2);
        }
    }

    public static final void o(final mm40 mm40Var, vpl vplVar, final float f2, final int i2, fet fetVar, final int i3) {
        int i4;
        int i5;
        vpl vplVar2;
        pcy pcyVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2061512836);
        if ((i3 & 6) == 0) {
            i4 = (fetVar2.g(mm40Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? fetVar2.g(vplVar) : fetVar2.i(vplVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar2.d(f2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 = i2;
            i4 |= fetVar2.e(i5) ? 2048 : 1024;
        } else {
            i5 = i2;
        }
        if (fetVar2.U(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z = (i4 & 7168) == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                upl.f36071a.getClass();
                objP = androidx.compose.runtime.e.e(bek.o(i5));
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(o7k0.s(o7k0.e(mm40Var, 320.0f), f2), vgg0.a(16.0f)), xsm0.u((upl) pz40Var.getValue(), fetVar2), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.b, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 176.0f), 1.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarV = yyw.V(n0qVar, fetVar2.k(bmd.n) == k6z.b);
            n0x n0xVar = vplVar.f;
            wpl wplVar = vplVar.i;
            k7x.b(n0xVar.a(), null, mm40VarV, a8k0.F(R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar2), a8k0.F(R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar2), null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            mm40 mm40VarB = jr8.f16991a.b(o7k0.d(o7k0.e(jm40Var, 96.0f), 1.0f), gqw0.h);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new m7h((byte) 29);
                fetVar.o0(objP2);
            }
            zq8.a(0, fetVar, i120.P(i4w0.T(mm40VarB, (Function1) objP2), xsm0.v((upl) pz40Var.getValue(), fetVar), null, 6));
            fetVar.r(true);
            mm40 mm40VarJ = s5x0.J(n0qVar, 8.0f);
            nw3 nw3Var = uc9.g;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(nw3Var, xx7Var, fetVar, 54);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarJ);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            byte b2 = 14;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b2)), gqw0.j, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            pcy pcyVar3 = pcyVar;
            jwb.p(null, new qw3(4.0f, true, new jf4(b2)), new qw3(4.0f, true, new jf4(b2)), null, 0, 0, u1c.M(223592129, new n0i(vplVar, (byte) 2), fetVar), fetVar, 1572864, 57);
            fetVar.r(true);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), xx7Var, fetVar, 0);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            vplVar2 = vplVar;
            String str = vplVar2.b;
            zfn zfnVar = m8m0.f21378a;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str, mm40VarN, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(g1t0.q(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110584);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            String str2 = vplVar2.c;
            long jM123getWhite0d7_KjU2 = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarN2, jM123getWhite0d7_KjU2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 110584);
            long jM126getWhite200d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m126getWhite200d7_KjU();
            fetVar.e0(-2057692159);
            boolean zF = fetVar.f(jM126getWhite200d7_KjU);
            Object objP3 = fetVar.P();
            if (zF || objP3 == cl5Var) {
                objP3 = new nme((byte) 6, jM126getWhite200d7_KjU);
                fetVar.o0(objP3);
            }
            mm40 mm40VarJ2 = s5x0.J(rq8.K(jm40Var, (Function1) objP3), 8.0f);
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarJ2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM6, shdVar2);
            vqd.u(iHashCode6, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            f(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), wplVar.f39550a, wplVar.b, xx7Var, fetVar, 3072);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            f(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), wplVar.c, wplVar.d, gqw0.o, fetVar2, 3072);
            fetVar2.r(true);
            fetVar2.r(false);
            fetVar2.r(true);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            vplVar2 = vplVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final vpl vplVar3 = vplVar2;
            yfe0VarU.d = new Function2() { // from class: a.q0i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ccq0.o(mm40Var, vplVar3, f2, i2, (fet) obj, x8x.L(i3 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void p(mm40 mm40Var, bql bqlVar, Function0 function0, Function2 function2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1308688033);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bqlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (!fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.X();
        } else if (bqlVar instanceof zpl) {
            fetVar.e0(776229825);
            q(mm40Var, (zpl) bqlVar, function0, function2, fetVar, i3 & 8190);
            fetVar.r(false);
        } else {
            if (!bqlVar.equals(aql.f1301a)) {
                throw b1j.f(776227360, fetVar, false);
            }
            fetVar.e0(776238979);
            r(i3 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j0i(mm40Var, bqlVar, function0, function2, i2, (byte) 3);
        }
    }

    public static final void q(mm40 mm40Var, zpl zplVar, Function0 function0, Function2 function2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1098218704);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(zplVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function2) ? 2048 : 1024;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarL = s5x0.L(jm40.b, xfn.a(fetVar).e, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            nkb.h(ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, true), new hjm(zplVar.f44764a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar, 384, 56);
            wul wulVar = new wul(mul.e, oe9.d, new ue9(zplVar.b), true, false, false);
            boolean z2 = (i4 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new pk9(function0, (byte) 25);
                fetVar.o0(objP);
            }
            qzb.n(null, wulVar, (Function0) objP, fetVar, 0, 1);
            fetVar.r(true);
            xia0.e(zplVar.c, function2, fetVar, (i4 >> 6) & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m0i(mm40Var, zplVar, function0, function2, i2, (byte) 3);
        }
    }

    public static final void r(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(-1067908511);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(10.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40Var2 = mm40Var;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(mm40Var2, xfn.a(fetVar).d, 0.0f, 0.0f, 0.0f, 14), 128.0f), 20.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            mm40 mm40VarE2 = o7k0.e(s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).c, 0.0f, 2), 320.0f);
            zcl zclVar3 = qmk.i;
            h97.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE2), fqj0VarD0, fetVar, true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var2, i2, (byte) 23);
        }
    }

    public static final void s(mm40 mm40Var, vrm vrmVar, Function1 function1, fet fetVar, int i2) {
        function1.getClass();
        fetVar.g0(111175096);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(vrmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (!fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.X();
        } else if (vrmVar instanceof trm) {
            fetVar.e0(-534907813);
            l(mm40Var, (trm) vrmVar, function1, fetVar, i3 & 1022);
            fetVar.r(false);
        } else {
            if (!vrmVar.equals(urm.f36170a)) {
                throw b1j.f(-534909836, fetVar, false);
            }
            fetVar.e0(-534902092);
            J(i3 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var, vrmVar, function1, i2, (byte) 14);
        }
    }

    public static final void t(int i2, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(1877033509);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            hkb.k(i3 & 112, 0, fetVar, s5x0.N(jm40Var, f2, 8.0f, f3, 0.0f, 8), str);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str, i2, (byte) 25);
        }
    }

    public static final void u(final mm40 mm40Var, final float f2, final a4x a4xVar, final boolean z, final Function1 function1, fet fetVar, final int i2) {
        int i3;
        mm40 mm40VarV;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(872867612);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.d(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = pkd.d(fetVar) ? 2 : 1;
            d9z d9zVarA = f9z.a(fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(d9zVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new md0(d9zVarA, (byte) 9);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            e2d e2dVar = (e2d) fetVar.k(nip.f23600a);
            if (e2dVar != null) {
                fetVar.e0(1867641032);
                boolean zG2 = fetVar.g(l7m0VarY);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new zwp(l7m0VarY, (byte) 13);
                    fetVar.o0(objP2);
                }
                mm40VarV = cjx.V(mm40Var, e2d.b(e2dVar, (Function0) objP2), null);
                fetVar.r(false);
            } else {
                fetVar.e0(1867799566);
                fetVar.r(false);
                mm40VarV = mm40Var;
            }
            mm40 mm40VarE = mm40VarV.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(mm40VarE, qmk.a(fetVar).d, 0.0f, 2), "LAZY_VERTICAL_GRID_GAMES");
            ngv ngvVar = new ngv(i4);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            qw3 qw3Var2 = new qw3(8.0f, true, new gne(gqw0.n, (byte) 12));
            lh80 lh80VarU = s5x0.u(0.0f, f2, 0.0f, 24.0f, 5);
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((i3 & 57344) == 16384);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new uy0(a4xVar, z, function1, (byte) 3);
                fetVar.o0(objP3);
            }
            g8x.i(ngvVar, mm40VarE0, d9zVarA, lh80VarU, qw3Var, qw3Var2, null, false, null, (Function1) objP3, fetVar, 0, 912);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.gur
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ccq0.u(mm40Var, f2, a4xVar, z, function1, (fet) obj2, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void v(String str, String str2, fet fetVar, int i2) {
        String str3;
        fet fetVar2;
        String str4 = str2;
        fetVar.g0(-1424918755);
        int i3 = i2 | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str4) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean zW = StringsKt.W(str4);
            jm40 jm40Var = jm40.b;
            if (zW) {
                fetVar.e0(1703033931);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                str3 = str;
                fetVar2 = fetVar;
                nkb.h(s5x0.L(s5x0.N(mm40VarD, 12.0f, 4.0f, 12.0f, 0.0f, 8), xfn.a(fetVar).e, 0.0f, 2), new hjm(str, new ojm(127), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8184), kjm.b, null, null, null, fetVar2, 384, 56);
                fetVar2.r(false);
            } else {
                fetVar.e0(1702234751);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(s5x0.M(mm40VarD2, 12.0f, 4.0f, 12.0f, 12.0f), xfn.a(fetVar).e, 0.0f, 2);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                zfn zfnVar = zaq0.b;
                nkb.h(jm40Var, new hjm(str, null, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), null, null, null, false, null, null, false, null, null, 8186), kjm.b, null, null, null, fetVar, 390, 56);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, (i3 >> 3) & 14, 0, 131066);
                str4 = str2;
                fetVar.r(true);
                fetVar.r(false);
                str3 = str;
                fetVar2 = fetVar;
            }
        } else {
            str3 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 15, i2, str3, str4);
        }
    }

    public static final void w(int i2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1495533575);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, background, new ugg0(zclVar, zclVar, zclVar, zclVar));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, s5x0.M(jm40Var, 12.0f, 12.0f, 8.0f, 12.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, 10.0f, 16.0f, 10.0f);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarM, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.h(), fetVar, (i3 >> 3) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i2, (byte) 26);
        }
    }

    public static final void x(Function0 function0, xcz xczVar, Function1 function1, List list, fet fetVar, int i2) {
        fetVar.g0(-1837954742);
        int i3 = i2 | (fetVar.i(function0) ? 4 : 2) | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.g(list) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarE0 = o2e.e0(s5x0.L(o7k0.c, xfn.a(fetVar).d, 0.0f, 2), "SecurityGiftLazyColumn");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = knm0.f(s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7), fetVar);
            mw3 mw3Var = uc9.c;
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new zlb0(list, function0, function1, (byte) 24);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, xczVar, ch80VarF, mw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 & 112) | 24576, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0((byte) 13, i2, (Object) function0, (Object) xczVar, (Object) function1, (Object) list);
        }
    }

    public static final void y(iqh0 iqh0Var, Function0 function0, Function1 function1, boolean z, boolean z2, fet fetVar, int i2) {
        mm40 mm40VarN;
        yjj0 yjj0VarC;
        fetVar.g0(-1205749149);
        int i3 = i2 | (fetVar.g(iqh0Var) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.h(z2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            if (z) {
                zcl zclVar = qmk.f28987a;
                mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            } else {
                mm40VarN = jm40Var;
            }
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            if (z) {
                zcl zclVar2 = qmk.f28987a;
                yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
            } else if (z2) {
                zcl zclVar3 = qmk.f28987a;
                yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
            } else {
                yjj0VarC = jd8.n;
            }
            mm40 mm40VarQ = i120.Q(mm40VarN, backgroundContent, yjj0VarC);
            if (iqh0Var != null) {
                if (iqh0Var instanceof dqh0) {
                    fetVar.e0(-1660875618);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarQ2 = i120.Q(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), vgg0.a(16.0f));
                    dqh0 dqh0Var = (dqh0) iqh0Var;
                    l8x.K(dqh0Var, function0, o2e.e0(mm40VarQ2, dqh0Var.f6516a), fetVar, i3 & 126);
                    fetVar.r(false);
                } else if (iqh0Var instanceof eqh0) {
                    fetVar.e0(916268357);
                    k9x.u((eqh0) iqh0Var, mm40VarQ, fetVar, i3 & 14);
                    fetVar.r(false);
                } else if (iqh0Var instanceof fqh0) {
                    fetVar.e0(-1660286370);
                    int i4 = i3 >> 6;
                    r8x.w((fqh0) iqh0Var, z, z2, function1, mm40VarQ, fetVar, (i3 & 14) | (i4 & 112) | (i4 & 896) | ((i3 << 3) & 7168));
                    fetVar.r(false);
                } else if (iqh0Var instanceof gqh0) {
                    fetVar.e0(-1660010842);
                    c9x.l(mm40VarQ, z, z2, function1, (gqh0) iqh0Var, fetVar, ((i3 >> 6) & 1008) | ((i3 << 3) & 7168) | ((i3 << 12) & 57344));
                    fetVar.r(false);
                }
            }
            throw b1j.f(916253547, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qg5(iqh0Var, function0, function1, z, z2, i2);
        }
    }

    public static final void z(mm40 mm40Var, i4 i4Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(653640464);
        int i3 = i2 | 6 | (fetVar.g(i4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ktz(i4Var, function1, (byte) 10);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltz(mm40Var2, i4Var, function1, i2, (byte) 10);
        }
    }
}
