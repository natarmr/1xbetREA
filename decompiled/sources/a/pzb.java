package a;

import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.impl.presentation.video.window_screen.GameVideoWindowService;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pzb {
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static boolean A(int i, Rect rect, Rect rect2, Rect rect3) {
        int iZ;
        int i2;
        int i3;
        boolean zB = B(i, rect, rect2);
        if (!B(i, rect, rect3) && zB) {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            jf4.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        if (rect.bottom <= rect3.top) {
                            if (i != 17 && i != 66) {
                                iZ = Z(i, rect, rect2);
                                if (i != 17) {
                                    i2 = rect.left;
                                    i3 = rect3.left;
                                } else if (i != 33) {
                                    i2 = rect.top;
                                    i3 = rect3.top;
                                } else if (i != 66) {
                                    i2 = rect3.right;
                                    i3 = rect.right;
                                } else {
                                    if (i == 130) {
                                        jf4.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                        return false;
                                    }
                                    i2 = rect3.bottom;
                                    i3 = rect.bottom;
                                }
                                if (iZ < Math.max(1, i2 - i3)) {
                                }
                            }
                        }
                    } else if (rect.right <= rect3.left) {
                        if (i != 17) {
                            iZ = Z(i, rect, rect2);
                            if (i != 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    jf4.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iZ < Math.max(1, i2 - i3)) {
                            }
                        }
                    }
                } else if (rect.top >= rect3.bottom) {
                    if (i != 17) {
                        iZ = Z(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                jf4.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iZ < Math.max(1, i2 - i3)) {
                        }
                    }
                }
            } else if (rect.left >= rect3.right) {
                if (i != 17) {
                    iZ = Z(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            jf4.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iZ < Math.max(1, i2 - i3)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    public static boolean B(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        jf4.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static final m1g C(Function1 function1) {
        n1g n1gVar = new n1g();
        n1gVar.f22749a = "";
        n1gVar.b = -1L;
        n1gVar.c = -1L;
        n1gVar.d = j1g.UNKNOWN;
        n1gVar.e = new ls2();
        n1gVar.f = l1g.UNKNOWN;
        n1gVar.g = k1g.UNKNOWN;
        function1.invoke(n1gVar);
        return new m1g(n1gVar.f22749a, n1gVar.e, n1gVar.f, n1gVar.g, n1gVar.d, n1gVar.b, n1gVar.c);
    }

    public static final jo20 D(lnf0 lnf0Var, long j) {
        jo20 jo20Var = new jo20();
        qbt.h(jo20Var);
        qbt.j(lnf0Var.f20342a, jo20Var);
        qbt.k(jo20Var, j);
        qbt.l(jo20Var);
        return jo20Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0273  */
    /* JADX WARN: Code duplicated, block: B:109:0x0282  */
    /* JADX WARN: Code duplicated, block: B:111:0x0286  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:114:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:115:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:118:0x02be  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:122:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:125:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x0225  */
    /* JADX WARN: Code duplicated, block: B:87:0x022a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0236  */
    /* JADX WARN: Code duplicated, block: B:91:0x0242  */
    /* JADX WARN: Code duplicated, block: B:94:0x024a  */
    /* JADX WARN: Code duplicated, block: B:95:0x024f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0253  */
    /* JADX WARN: Code duplicated, block: B:98:0x0258  */
    public static final nas E(f5h f5hVar, sip sipVar, long j, long j2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Long l;
        Long l2;
        ArrayList arrayList3;
        long j3;
        long jLongValue;
        String str;
        Integer numValueOf;
        Long l3;
        String str2;
        long jLongValue2;
        long jLongValue3;
        ufs ufsVar;
        boolean zBooleanValue;
        Integer numValueOf2;
        String str3;
        Boolean bool;
        Integer num;
        Long l4;
        Long l5;
        ArrayList arrayList4;
        ArrayList arrayList5;
        List list = f5hVar.C;
        Long l6 = f5hVar.f8961a;
        zpg zpgVar = f5hVar.G;
        Long l7 = f5hVar.s;
        Boolean bool2 = f5hVar.v;
        Boolean bool3 = f5hVar.u;
        gog gogVar = f5hVar.F;
        gdh gdhVar = f5hVar.x;
        h2g h2gVar = f5hVar.B;
        h2g h2gVar2 = f5hVar.A;
        Long l8 = f5hVar.b;
        Long l9 = f5hVar.c;
        gxs gxsVar = f5hVar.H;
        e2g e2gVar = f5hVar.z;
        k2g k2gVar = f5hVar.y;
        long jLongValue4 = 0;
        if (list != null) {
            ArrayList arrayList6 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cas casVar = (cas) it.next();
                Long l10 = casVar.f4027a;
                long jLongValue5 = l10 != null ? l10.longValue() : 0L;
                List list2 = casVar.c;
                Iterator it2 = it;
                if (list2 != null) {
                    int i = 10;
                    arrayList5 = new ArrayList(r3d.q(list2, 10));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        List list3 = (List) it3.next();
                        Iterator it4 = it3;
                        Long l11 = l8;
                        ArrayList arrayList7 = new ArrayList(r3d.q(list3, i));
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            gas gasVar = (gas) it5.next();
                            Long l12 = casVar.f4027a;
                            Iterator it6 = it5;
                            arrayList7.add(u1c.U(gasVar, l12 != null ? l12.longValue() : 0L, f5hVar.L, f5hVar.f8961a, f5hVar.t, k2gVar != null ? k2gVar.f17569a : null));
                            it5 = it6;
                        }
                        arrayList5.add(arrayList7);
                        it3 = it4;
                        l8 = l11;
                        i = 10;
                    }
                } else {
                    arrayList5 = null;
                }
                Long l13 = l8;
                arrayList6.add(new u9s(arrayList5, Long.valueOf(jLongValue5), casVar.d));
                it = it2;
                h2gVar = h2gVar;
                h2gVar2 = h2gVar2;
                l8 = l13;
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        h2g h2gVar3 = h2gVar;
        h2g h2gVar4 = h2gVar2;
        Long l14 = l8;
        List list4 = f5hVar.J;
        if (list4 != null) {
            ArrayList arrayList8 = new ArrayList(r3d.q(list4, 10));
            for (Iterator it7 = list4.iterator(); it7.hasNext(); it7 = it7) {
                zxm0 zxm0Var = (zxm0) it7.next();
                zxm0Var.getClass();
                List list5 = zxm0Var.d;
                Long l15 = zxm0Var.f45167a;
                if (list5 != null) {
                    ArrayList arrayList9 = new ArrayList(r3d.q(list5, 10));
                    Iterator it8 = list5.iterator();
                    while (it8.hasNext()) {
                        cas casVar2 = (cas) it8.next();
                        Long l16 = casVar2.f4027a;
                        long jLongValue6 = l16 != null ? l16.longValue() : 0L;
                        List list6 = casVar2.c;
                        Iterator it9 = it8;
                        if (list6 != null) {
                            int i2 = 10;
                            arrayList4 = new ArrayList(r3d.q(list6, 10));
                            Iterator it10 = list6.iterator();
                            while (it10.hasNext()) {
                                List list7 = (List) it10.next();
                                Iterator it11 = it10;
                                ArrayList arrayList10 = arrayList8;
                                ArrayList arrayList11 = new ArrayList(r3d.q(list7, i2));
                                Iterator it12 = list7.iterator();
                                while (it12.hasNext()) {
                                    gas gasVar2 = (gas) it12.next();
                                    Long l17 = casVar2.f4027a;
                                    Iterator it13 = it12;
                                    arrayList11.add(u1c.U(gasVar2, l17 != null ? l17.longValue() : 0L, f5hVar.L, zxm0Var.f45167a, f5hVar.t, k2gVar != null ? k2gVar.f17569a : null));
                                    it12 = it13;
                                }
                                arrayList4.add(arrayList11);
                                it10 = it11;
                                arrayList8 = arrayList10;
                                i2 = 10;
                            }
                        } else {
                            arrayList4 = null;
                        }
                        ArrayList arrayList12 = arrayList8;
                        arrayList9.add(new u9s(arrayList4, Long.valueOf(jLongValue6), casVar2.d));
                        l9 = l9;
                        it8 = it9;
                        l15 = l15;
                        arrayList8 = arrayList12;
                    }
                    arrayList3 = arrayList9;
                } else {
                    arrayList3 = null;
                }
                ArrayList arrayList13 = arrayList8;
                Long l18 = l15;
                Long l19 = l9;
                long jLongValue7 = l18 != null ? l18.longValue() : 0L;
                if (l19 != null) {
                    jLongValue = l19.longValue();
                } else {
                    if (l18 != null) {
                        jLongValue = l18.longValue();
                    } else {
                        j3 = 0;
                    }
                    Long l20 = f5hVar.e;
                    String str4 = f5hVar.l;
                    String str5 = f5hVar.o;
                    String str6 = f5hVar.j;
                    if (gxsVar != null) {
                        str = gxsVar.b;
                    } else {
                        str = null;
                    }
                    Integer num2 = f5hVar.w;
                    String str7 = f5hVar.n;
                    if (l14 != null) {
                        numValueOf = Integer.valueOf((int) l14.longValue());
                    } else {
                        numValueOf = null;
                    }
                    Boolean bool4 = f5hVar.t;
                    String str8 = zxm0Var.b;
                    if (e2gVar != null) {
                        l3 = e2gVar.f7083a;
                    } else {
                        l3 = null;
                    }
                    if (e2gVar != null) {
                        str2 = e2gVar.b;
                    } else {
                        str2 = null;
                    }
                    oas oasVarB0 = d5c.b0(h2gVar4);
                    oas oasVarB1 = d5c.b0(h2gVar3);
                    Long l21 = f5hVar.h;
                    long jT = T(l21);
                    if (k2gVar != null || (l5 = k2gVar.f17569a) == null) {
                        jLongValue2 = j2;
                    } else {
                        jLongValue2 = l5.longValue();
                    }
                    if (gdhVar != null || (l4 = gdhVar.f11103a) == null) {
                        jLongValue3 = j;
                    } else {
                        jLongValue3 = l4.longValue();
                    }
                    if (gogVar != null) {
                        ufsVar = new ufs(gogVar.b, null, gogVar.f11630a, null, null, null, null);
                    } else {
                        ufsVar = null;
                    }
                    if (bool3 != 0) {
                        zBooleanValue = bool3.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    Boolean bool5 = Boolean.TRUE;
                    boolean zD = Intrinsics.d(bool2, bool5);
                    boolean z = zBooleanValue;
                    Boolean bool6 = f5hVar.r;
                    if (l7 != null) {
                        numValueOf2 = Integer.valueOf((int) l7.longValue());
                    } else {
                        numValueOf2 = null;
                    }
                    if (zpgVar != null) {
                        str3 = zpgVar.f44758a;
                    } else {
                        str3 = null;
                    }
                    if (gxsVar != null) {
                        bool = gxsVar.f12093a;
                    } else {
                        bool = null;
                    }
                    qud qudVar = boh.b;
                    if (e2gVar != null) {
                        num = e2gVar.e;
                    } else {
                        num = null;
                    }
                    qudVar.getClass();
                    arrayList13.add(new nas(jLongValue7, j3, l20, str4, str5, str6, str, bool, num2, str7, numValueOf, bool4, str8, null, null, arrayList3, l3, sipVar, str2, null, l21, Long.valueOf(jT), Long.valueOf(jLongValue2), jLongValue3, oasVarB0, oasVarB1, zD, null, ufsVar, Boolean.valueOf(z), null, null, bool6, numValueOf2, str3, null, qud.d(num, bool5), f5hVar.i));
                    arrayList8 = arrayList13;
                    l9 = l19;
                }
                j3 = jLongValue;
                Long l22 = f5hVar.e;
                String str9 = f5hVar.l;
                String str10 = f5hVar.o;
                String str11 = f5hVar.j;
                if (gxsVar != null) {
                    str = gxsVar.b;
                } else {
                    str = null;
                }
                Integer num3 = f5hVar.w;
                String str12 = f5hVar.n;
                if (l14 != null) {
                    numValueOf = Integer.valueOf((int) l14.longValue());
                } else {
                    numValueOf = null;
                }
                Boolean bool7 = f5hVar.t;
                String str13 = zxm0Var.b;
                if (e2gVar != null) {
                    l3 = e2gVar.f7083a;
                } else {
                    l3 = null;
                }
                if (e2gVar != null) {
                    str2 = e2gVar.b;
                } else {
                    str2 = null;
                }
                oas oasVarB2 = d5c.b0(h2gVar4);
                oas oasVarB3 = d5c.b0(h2gVar3);
                Long l23 = f5hVar.h;
                long jT2 = T(l23);
                if (k2gVar != null) {
                    jLongValue2 = j2;
                } else {
                    jLongValue2 = j2;
                }
                if (gdhVar != null) {
                    jLongValue3 = j;
                } else {
                    jLongValue3 = j;
                }
                if (gogVar != null) {
                    ufsVar = new ufs(gogVar.b, null, gogVar.f11630a, null, null, null, null);
                } else {
                    ufsVar = null;
                }
                if (bool3 != 0) {
                    zBooleanValue = bool3.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Boolean bool8 = Boolean.TRUE;
                boolean zD2 = Intrinsics.d(bool2, bool8);
                boolean z2 = zBooleanValue;
                Boolean bool9 = f5hVar.r;
                if (l7 != null) {
                    numValueOf2 = Integer.valueOf((int) l7.longValue());
                } else {
                    numValueOf2 = null;
                }
                if (zpgVar != null) {
                    str3 = zpgVar.f44758a;
                } else {
                    str3 = null;
                }
                if (gxsVar != null) {
                    bool = gxsVar.f12093a;
                } else {
                    bool = null;
                }
                qud qudVar2 = boh.b;
                if (e2gVar != null) {
                    num = e2gVar.e;
                } else {
                    num = null;
                }
                qudVar2.getClass();
                arrayList13.add(new nas(jLongValue7, j3, l22, str9, str10, str11, str, bool, num3, str12, numValueOf, bool7, str13, null, null, arrayList3, l3, sipVar, str2, null, l23, Long.valueOf(jT2), Long.valueOf(jLongValue2), jLongValue3, oasVarB2, oasVarB3, zD2, null, ufsVar, Boolean.valueOf(z2), null, null, bool9, numValueOf2, str3, null, qud.d(num, bool8), f5hVar.i));
                arrayList8 = arrayList13;
                l9 = l19;
            }
            arrayList2 = arrayList8;
        } else {
            arrayList2 = null;
        }
        Long l24 = l9;
        jch jchVar = f5hVar.I;
        tas tasVarY = jchVar != null ? qbc.Y(jchVar) : null;
        long jLongValue8 = l6 != null ? l6.longValue() : 0L;
        if (l24 != null) {
            jLongValue4 = l24.longValue();
        } else if (l6 != null) {
            jLongValue4 = l6.longValue();
        }
        long j4 = jLongValue4;
        Long l25 = f5hVar.d;
        String str14 = f5hVar.l;
        String str15 = f5hVar.o;
        String str16 = f5hVar.j;
        String str17 = gxsVar != null ? gxsVar.b : null;
        Integer num4 = f5hVar.w;
        String str18 = f5hVar.n;
        Integer numValueOf3 = l14 != null ? Integer.valueOf((int) l14.longValue()) : null;
        Boolean bool10 = f5hVar.t;
        String str19 = f5hVar.g;
        Long l26 = e2gVar != null ? e2gVar.f7083a : null;
        String str20 = e2gVar != null ? e2gVar.b : null;
        oas oasVarB4 = d5c.b0(h2gVar4);
        oas oasVarB5 = d5c.b0(h2gVar3);
        Long l27 = f5hVar.h;
        long jT3 = T(l27);
        long jLongValue9 = (k2gVar == null || (l2 = k2gVar.f17569a) == null) ? j2 : l2.longValue();
        long jLongValue10 = (gdhVar == null || (l = gdhVar.f11103a) == null) ? j : l.longValue();
        ufs ufsVar2 = gogVar != null ? new ufs(gogVar.b, null, gogVar.f11630a, null, null, null, null) : null;
        boolean zBooleanValue2 = bool3 != 0 ? bool3.booleanValue() : false;
        Boolean bool11 = f5hVar.r;
        Boolean bool12 = Boolean.TRUE;
        boolean zD3 = Intrinsics.d(bool2, bool12);
        Integer numValueOf4 = l7 != null ? Integer.valueOf((int) l7.longValue()) : null;
        String str21 = zpgVar != null ? zpgVar.f44758a : null;
        Boolean bool13 = gxsVar != null ? gxsVar.f12093a : null;
        qud qudVar3 = boh.b;
        Integer num5 = e2gVar != null ? e2gVar.e : null;
        qudVar3.getClass();
        return new nas(jLongValue8, j4, l25, str14, str15, str16, str17, bool13, num4, str18, numValueOf3, bool10, str19, null, arrayList2, arrayList, l26, sipVar, str20, tasVarY, l27, Long.valueOf(jT3), Long.valueOf(jLongValue9), jLongValue10, oasVarB4, oasVarB5, zD3, null, ufsVar2, Boolean.valueOf(zBooleanValue2), null, null, bool11, numValueOf4, str21, null, qud.d(num5, bool12), f5hVar.i);
    }

    public static final void F(bnk0 bnk0Var) {
        pzw.E(bnk0Var, Separators.COMMA, 0, R.color.static_white_60, 0, 0, 54);
    }

    public static final void G(bnk0 bnk0Var) {
        if (bnk0Var.f2888a.isEmpty()) {
            return;
        }
        pzw.E(bnk0Var, Separators.COMMA, 0, R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white_60, 0, 0, 54);
    }

    public static final String H(anq0 anq0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        long j = anq0Var.d;
        long j2 = j / 86400;
        if (j < 0) {
            return ctf0Var.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
        }
        if (j2 <= 0) {
            return ctf0Var.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
        }
        return ctf0Var.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j2)}, 1));
    }

    public static final String I(anq0 anq0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        boolean z = anq0Var.f1167a;
        String str = anq0Var.c;
        if (z) {
            return str.length() > 0 ? str : "";
        }
        return anq0Var.b ? ctf0Var.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
    }

    public static final ank0 J(ctf0 ctf0Var, d3h0 d3h0Var, boolean z) {
        ctf0Var.getClass();
        if (z && d3h0Var != null) {
            return N(d3h0Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strK = ctf0Var.k(R.string.vs, new Object[0]);
        int i = (62 & 4) != 0 ? -1 : 0;
        int i2 = (62 & 8) != 0 ? -1 : 0;
        int i3 = (62 & 16) != 0 ? -1 : 0;
        int i4 = (62 & 32) != 0 ? -1 : 0;
        strK.getClass();
        return axq.d(arrayList2, new zmk0(strK, i, -1.0f, i2, i3, i4), arrayList, arrayList2, arrayList);
    }

    public static final String K(lho lhoVar, znq0 znq0Var, boolean z) {
        if (h9s.f12692a[lhoVar.ordinal()] == 1) {
            return "";
        }
        rdj rdjVar = rdj.f30294a;
        return rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 48);
    }

    public static final ank0 L(final ctf0 ctf0Var, final d3h0 d3h0Var, final anq0 anq0Var, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Function1 function1 = new Function1() { // from class: a.rto
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                ArrayList arrayList2 = bnk0Var.f2888a;
                boolean z5 = z2;
                ctf0 ctf0Var2 = ctf0Var;
                anq0 anq0Var2 = anq0Var;
                if (!z5) {
                    rdj rdjVar = rdj.f30294a;
                    long j = anq0Var2.f;
                    pzw.E(bnk0Var, rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(z), false, 56), 0, R.color.static_white_60, 0, 0, 54);
                    if (!arrayList2.isEmpty()) {
                        pzw.E(bnk0Var, ". ", 0, R.color.static_white_60, 0, 0, 54);
                    }
                    pzw.E(bnk0Var, pzb.H(anq0Var2, ctf0Var2), 0, R.color.static_white_60, 0, 0, 54);
                    if (!arrayList2.isEmpty()) {
                        pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white_60, 0, 0, 54);
                    }
                    pzw.E(bnk0Var, pzb.U(anq0Var2), 0, R.color.static_white_60, 0, 0, 54);
                } else if (z3) {
                    pzw.E(bnk0Var, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)), 0, R.color.static_white_60, 0, 0, 54);
                } else {
                    String str2 = str;
                    if (str2.length() > 0) {
                        pzb.G(bnk0Var);
                        pzw.E(bnk0Var, str2, 0, R.color.static_white_60, 0, 0, 54);
                    }
                    d3h0 d3h0Var2 = d3h0Var;
                    if (d3h0Var2 != null) {
                        boolean z6 = d3h0Var2 instanceof pz10;
                        boolean z7 = z4;
                        if (z6) {
                            pzb.Y(bnk0Var, (pz10) d3h0Var2, z7);
                        } else if (d3h0Var2 instanceof izm0) {
                            izm0 izm0Var = (izm0) d3h0Var2;
                            if (izm0Var.d().size() > 1) {
                                pzb.G(bnk0Var);
                                pzw.E(bnk0Var, Separators.LPAREN, 0, R.color.static_white_60, 0, 0, 54);
                                pzb.h0(bnk0Var, izm0Var, z7);
                                pzw.E(bnk0Var, Separators.RPAREN, 0, R.color.static_white_60, 0, 0, 54);
                            }
                        }
                    }
                    if (anq0Var2.e != 0) {
                        if (!arrayList2.isEmpty()) {
                            pzw.E(bnk0Var, ". ", 0, R.color.static_white_60, 0, 0, 54);
                        }
                        pzw.E(bnk0Var, pzb.I(anq0Var2, ctf0Var2), 0, R.color.static_white_60, 0, 0, 54);
                        pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white_60, 0, 0, 54);
                        pzw.E(bnk0Var, pzb.V(anq0Var2), 0, R.color.static_white_60, 0, 0, 54);
                    }
                }
                return Unit.f46060a;
            }
        };
        bnk0 bnk0Var = new bnk0();
        function1.invoke(bnk0Var);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final ank0 M(final ctf0 ctf0Var, final d3h0 d3h0Var, final String str, final String str2, final String str3, final String str4, final boolean z, final boolean z2) {
        ctf0Var.getClass();
        str2.getClass();
        str3.getClass();
        d3h0Var.getClass();
        str4.getClass();
        ArrayList arrayList = new ArrayList();
        Function1 function1 = new Function1() { // from class: a.oto
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                if (z) {
                    pzw.E(bnk0Var, ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)), 0, R.color.static_white_60, 0, 0, 54);
                } else {
                    String str5 = str;
                    if (str5.length() > 0) {
                        pzw.E(bnk0Var, str5, 0, 0, 0, 0, 62);
                    }
                    String str6 = str2;
                    int length = str6.length();
                    String str7 = str4;
                    if (length > 0 && !kotlin.text.c.l(StringsKt.u0(str7).toString(), StringsKt.u0(str6).toString())) {
                        if (!bnk0Var.f2888a.isEmpty()) {
                            pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white_60, 0, 0, 54);
                        }
                        pzw.E(bnk0Var, str6, 0, 0, 0, 0, 62);
                    }
                    if (str7.length() > 0) {
                        pzb.G(bnk0Var);
                        pzw.E(bnk0Var, str7, 0, 0, 0, 0, 62);
                    }
                    d3h0 d3h0Var2 = d3h0Var;
                    boolean z3 = d3h0Var2 instanceof pz10;
                    boolean z4 = z2;
                    if (z3) {
                        pzb.Y(bnk0Var, (pz10) d3h0Var2, z4);
                    } else if (d3h0Var2 instanceof izm0) {
                        izm0 izm0Var = (izm0) d3h0Var2;
                        if (izm0Var.d().size() > 1) {
                            pzb.G(bnk0Var);
                            pzw.E(bnk0Var, Separators.LPAREN, 0, R.color.static_white_60, 0, 0, 54);
                            pzb.h0(bnk0Var, izm0Var, z4);
                            pzw.E(bnk0Var, Separators.RPAREN, 0, R.color.static_white_60, 0, 0, 54);
                        }
                    }
                    String str8 = str3;
                    if (str8.length() > 0) {
                        pzb.G(bnk0Var);
                        pzw.E(bnk0Var, str8, 0, 0, 0, 0, 62);
                    }
                }
                return Unit.f46060a;
            }
        };
        bnk0 bnk0Var = new bnk0();
        function1.invoke(bnk0Var);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final ank0 N(d3h0 d3h0Var) {
        d3h0Var.getClass();
        ArrayList arrayList = new ArrayList();
        bnk0 bnk0Var = new bnk0();
        pzw.E(bnk0Var, d3h0Var.a(), 0, d3h0Var.j() ? R.color.static_green : R.color.static_white, 0, 0, 54);
        pzw.E(bnk0Var, " : ", 0, R.color.static_white, 0, 0, 54);
        pzw.E(bnk0Var, d3h0Var.b(), 0, d3h0Var.i() ? R.color.static_green : R.color.static_white, 0, 0, 54);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final zmk0 O(pz10 pz10Var) {
        pz10Var.getClass();
        String strA = pz10Var.a();
        strA.getClass();
        return new zmk0(strA, -1, -1.0f, pz10Var.j() ? R.color.static_green : R.color.static_white, -1, -1);
    }

    public static final zmk0 P(te90 te90Var) {
        return new zmk0(te90Var.b, -1, -1.0f, te90Var.c ? R.color.static_green : R.color.static_white, -1, -1);
    }

    public static final pip0 Q(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (Intrinsics.d(str, str2)) {
            return pip0.DEFAULT;
        }
        Double dI = kotlin.text.b.i(str);
        Double dI2 = kotlin.text.b.i(str2);
        if (dI != null && dI2 != null && dI.doubleValue() > dI2.doubleValue()) {
            return pip0.CHANGED;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return pip0.DEFAULT;
            }
        }
        if (dI2 != null) {
            return pip0.CHANGED;
        }
        return pip0.DEFAULT;
    }

    public static final zmk0 R(pz10 pz10Var) {
        pz10Var.getClass();
        String strB = pz10Var.b();
        strB.getClass();
        return new zmk0(strB, -1, -1.0f, pz10Var.i() ? R.color.static_green : R.color.static_white, -1, -1);
    }

    public static final zmk0 S(te90 te90Var) {
        return new zmk0(te90Var.d, -1, -1.0f, te90Var.e ? R.color.static_green : R.color.static_white, -1, -1);
    }

    public static final long T(Long l) {
        if (l != null) {
            long jLongValue = l.longValue() - (System.currentTimeMillis() / 1000);
            if (jLongValue > 0) {
                return jLongValue;
            }
        }
        return 0L;
    }

    public static final String U(anq0 anq0Var) {
        long j = anq0Var.d;
        if (j <= 0) {
            return "";
        }
        long jB = new znq0(j).b();
        long j2 = jB / 60;
        return String.format(Locale.ENGLISH, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf((j2 / 60) % 24), Long.valueOf(j2 % 60), Long.valueOf(jB % 60)}, 3));
    }

    public static final String V(anq0 anq0Var) {
        znq0 znq0Var;
        boolean z = anq0Var.b;
        long j = anq0Var.d;
        long j2 = anq0Var.e;
        if (z) {
            long j3 = j2 - j;
            if (j3 < 0) {
                j3 = 0;
            }
            znq0Var = new znq0(j3);
        } else {
            znq0Var = new znq0(j2 + j);
        }
        long jB = znq0Var.b();
        return String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jB / 60), Long.valueOf(jB % 60)}, 2));
    }

    public static boolean W(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                jf4.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static final boolean X(le90 le90Var) {
        le90Var.getClass();
        String str = le90Var.f19891a;
        String str2 = le90Var.b;
        if (str.length() <= 0 || str2.length() <= 0 || str.equals("-1") || str2.equals("-1") || le90Var.g.length() <= 0) {
            return false;
        }
        return (str.equals("0") && str2.equals("0")) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x01d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    public static final void Y(bnk0 bnk0Var, pz10 pz10Var, boolean z) {
        int i = 0;
        boolean z2 = cy7.c() && z;
        if (pz10Var instanceof mz10) {
            mz10 mz10Var = (mz10) pz10Var;
            if (!mz10Var.f.isEmpty() || mz10Var.h.length() > 0 || mz10Var.j.length() > 0) {
                G(bnk0Var);
                pzw.E(bnk0Var, Separators.LPAREN, 0, R.color.static_white_60, 0, 0, 54);
                pzw.E(bnk0Var, "\u2066", 0, 0, 0, 0, 62);
                if (z2) {
                    g0(bnk0Var, mz10Var, z);
                    f0(bnk0Var, mz10Var, z);
                } else {
                    f0(bnk0Var, mz10Var, z);
                    g0(bnk0Var, mz10Var, z);
                }
                pzw.E(bnk0Var, "\u2069", 0, 0, 0, 0, 62);
                pzw.E(bnk0Var, Separators.RPAREN, 0, R.color.static_white_60, 0, 0, 54);
                return;
            }
            return;
        }
        if (pz10Var instanceof oz10) {
            oz10 oz10Var = (oz10) pz10Var;
            if (!oz10Var.f.isEmpty()) {
                G(bnk0Var);
                pzw.E(bnk0Var, Separators.LPAREN, 0, R.color.static_white_60, 0, 0, 54);
                pzw.E(bnk0Var, "\u2066", 0, 0, 0, 0, 62);
                if (z2) {
                    n0(bnk0Var, oz10Var, z);
                    m0(bnk0Var, oz10Var, z);
                } else {
                    m0(bnk0Var, oz10Var, z);
                    n0(bnk0Var, oz10Var, z);
                }
                pzw.E(bnk0Var, "\u2069", 0, 0, 0, 0, 62);
                pzw.E(bnk0Var, Separators.RPAREN, 0, R.color.static_white_60, 0, 0, 54);
                return;
            }
        }
        if (pz10Var instanceof lz10) {
            lz10 lz10Var = (lz10) pz10Var;
            ?? T0 = lz10Var.f;
            if (!T0.isEmpty()) {
                G(bnk0Var);
                bnk0 bnk0Var2 = bnk0Var;
                pzw.E(bnk0Var2, Separators.LPAREN, 0, R.color.static_white_60, 0, 0, 54);
                pzw.E(bnk0Var2, "\u2066", 0, 0, 0, 0, 62);
                boolean z3 = cy7.c() && z;
                if (z3) {
                    T0 = CollectionsKt.t0(T0);
                }
                int i2 = z3 ? 0 : q3d.i(T0);
                for (Object obj : T0) {
                    int i3 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    te90 te90Var = (te90) obj;
                    if (i != i2) {
                        d0(bnk0Var2, te90Var, z);
                    } else {
                        int i4 = lz10Var.i;
                        if (i4 == 1) {
                            b0(bnk0Var2, te90Var, z);
                        } else if (i4 == 2) {
                            c0(bnk0Var2, te90Var, z);
                        } else {
                            d0(bnk0Var2, te90Var, z);
                        }
                    }
                    if (i != T0.size() - 1) {
                        F(bnk0Var2);
                        pzw.E(bnk0Var2, Separators.SP, 0, R.color.static_white_60, 0, 0, 54);
                    }
                    bnk0Var2 = bnk0Var;
                    i = i3;
                }
                pzw.E(bnk0Var, "\u2069", 0, 0, 0, 0, 62);
                pzw.E(bnk0Var, Separators.RPAREN, 0, R.color.static_white_60, 0, 0, 54);
                return;
            }
        }
        if (pz10Var instanceof kz10) {
            kz10 kz10Var = (kz10) pz10Var;
            ?? T1 = kz10Var.f;
            if (T1.size() > 1) {
                G(bnk0Var);
                bnk0 bnk0Var3 = bnk0Var;
                pzw.E(bnk0Var3, Separators.LPAREN, 0, R.color.static_white_60, 0, 0, 54);
                pzw.E(bnk0Var3, "\u2066", 0, 0, 0, 0, 62);
                boolean z4 = cy7.c() && z;
                if (z4) {
                    T1 = CollectionsKt.t0(T1);
                }
                int i5 = z4 ? 0 : q3d.i(T1);
                for (Object obj2 : T1) {
                    int i6 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    te90 te90Var2 = (te90) obj2;
                    if (i == i5) {
                        int i7 = gql0.f11739a;
                        int i8 = kz10Var.g;
                        if (i8 <= 0) {
                            d0(bnk0Var3, te90Var2, z);
                        } else if (i8 == 1) {
                            b0(bnk0Var3, te90Var2, z);
                        } else {
                            c0(bnk0Var3, te90Var2, z);
                        }
                    } else {
                        d0(bnk0Var3, te90Var2, z);
                    }
                    if (i != T1.size() - 1) {
                        F(bnk0Var3);
                        pzw.E(bnk0Var3, Separators.SP, 0, R.color.static_white_60, 0, 0, 54);
                    }
                    bnk0Var3 = bnk0Var;
                    i = i6;
                }
                pzw.E(bnk0Var, "\u2069", 0, 0, 0, 0, 62);
                pzw.E(bnk0Var, Separators.RPAREN, 0, R.color.static_white_60, 0, 0, 54);
            }
        }
    }

    public static int Z(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                jf4.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static final void a(mm40 mm40Var, final szb szbVar, Function1 function1, fet fetVar, int i) {
        szbVar.getClass();
        function1.getClass();
        fetVar.g0(-244663448);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(szbVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new izb(function1, szbVar, (byte) 0);
                fetVar.o0(objP2);
            }
            b(y860.W(mm40Var, gy40Var, null, false, null, (Function0) objP2, 28), u1c.M(2005598277, new ab4((Object) szbVar, (Object) function1, (byte) 21), fetVar), u1c.M(-1282446330, new xdr() { // from class: a.lzb
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b;
                    szb szbVar2 = szbVar;
                    switch (b3) {
                        case 0:
                            yhg0 yhg0Var = (yhg0) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            yhg0Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                mm40 mm40VarA = yhg0Var.a(1.0f, jm40.b, true);
                                zcl zclVar = qmk.f28987a;
                                v8q0.a(szbVar2.b, o2e.e0(s5x0.N(mm40VarA, 0.0f, 10.0f, 16.0f, 10.0f, 1), "CHECKBOX_TITLE"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 0, 131068);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (!fetVar3.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                fetVar3.X();
                            } else if (szbVar2.c.c) {
                                fetVar3.e0(-442200286);
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarE0 = o2e.e0(o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 16.0f), "CHECKBOX_WARNING");
                                Object objP3 = fetVar3.P();
                                if (objP3 == ukd.f35823a) {
                                    objP3 = new m1b((byte) 29);
                                    fetVar3.o0(objP3);
                                }
                                j0x.b(a8k0.F(R.drawable.ic_glyph_circle_warning, 0, fetVar3), null, pai0.a(mm40VarE0, false, (Function1) objP3), null, gqw0.f1, 0.0f, new m78(((ThemeColors) fetVar3.k(zaq0.b)).getWarning(), 5), fetVar3, 24632, 40);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(-441578085);
                                fetVar3.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-275523641, new xdr() { // from class: a.lzb
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b2;
                    szb szbVar2 = szbVar;
                    switch (b3) {
                        case 0:
                            yhg0 yhg0Var = (yhg0) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            yhg0Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                mm40 mm40VarA = yhg0Var.a(1.0f, jm40.b, true);
                                zcl zclVar = qmk.f28987a;
                                v8q0.a(szbVar2.b, o2e.e0(s5x0.N(mm40VarA, 0.0f, 10.0f, 16.0f, 10.0f, 1), "CHECKBOX_TITLE"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 0, 131068);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (!fetVar3.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                fetVar3.X();
                            } else if (szbVar2.c.c) {
                                fetVar3.e0(-442200286);
                                zcl zclVar2 = qmk.f28987a;
                                mm40 mm40VarE0 = o2e.e0(o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 16.0f), "CHECKBOX_WARNING");
                                Object objP3 = fetVar3.P();
                                if (objP3 == ukd.f35823a) {
                                    objP3 = new m1b((byte) 29);
                                    fetVar3.o0(objP3);
                                }
                                j0x.b(a8k0.F(R.drawable.ic_glyph_circle_warning, 0, fetVar3), null, pai0.a(mm40VarE0, false, (Function1) objP3), null, gqw0.f1, 0.0f, new m78(((ThemeColors) fetVar3.k(zaq0.b)).getWarning(), 5), fetVar3, 24632, 40);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(-441578085);
                                fetVar3.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 3504);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var, szbVar, function1, i, (byte) 5);
        }
    }

    public static int a0(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        jf4.o("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final void b(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        fetVar.g0(946553779);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.g(mm40VarD, 48.0f, 0.0f, 2), null, false, 3);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, 54);
            ugdVar2.F(zhg0Var, fetVar, 54);
            ugdVar3.F(zhg0Var, fetVar, 54);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nzb(mm40Var, ugdVar, ugdVar2, ugdVar3, i, (byte) 1);
        }
    }

    public static final void b0(bnk0 bnk0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            pzw.E(bnk0Var, te90Var.d, 0, te90Var.e ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, "-", 0, R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, te90Var.b, 0, te90Var.c ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, Separators.STAR, 0, R.color.static_white_60, 0, 0, 54);
            return;
        }
        pzw.E(bnk0Var, Separators.STAR, 0, R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, te90Var.b, 0, te90Var.c ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, "-", 0, R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, te90Var.d, 0, te90Var.e ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x0089  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final void c(ugd ugdVar, w2d w2dVar, mm40 mm40Var, ugd ugdVar2, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        byte b;
        boolean z;
        boolean z2;
        mm40 mm40Var3;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objP;
        int i4;
        fetVar.g0(725524754);
        if ((i & 6) == 0) {
            i3 = (fetVar.i(ugdVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar.g(w2dVar) : fetVar.i(w2dVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                mm40Var2 = mm40Var;
                i3 |= fetVar.g(mm40Var2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (fetVar.i(ugdVar2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            b = 0;
            z = true;
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i3 & 1, z2)) {
                if (i5 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if ((i3 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((i3 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z6 = z4 | z3;
                if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !fetVar.i(w2dVar))) {
                    z = false;
                }
                z5 = z6 | z;
                objP = fetVar.P();
                if (z5 || objP == ukd.f35823a) {
                    objP = new j2d(ugdVar2, ugdVar, w2dVar, b);
                    fetVar.o0(objP);
                }
                x4n0.a(mm40Var4, (Function2) objP, fetVar, (i3 >> 6) & 14, 0);
                mm40Var3 = mm40Var4;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new g13(ugdVar, w2dVar, mm40Var3, ugdVar2, i, i2);
            }
        }
        i3 |= 384;
        mm40Var2 = mm40Var;
        if ((i & 3072) == 0) {
            if (fetVar.i(ugdVar2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        b = 0;
        z = true;
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i3 & 1, z2)) {
            if (i5 != 0) {
                mm40Var4 = jm40.b;
            } else {
                mm40Var4 = mm40Var2;
            }
            if ((i3 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z4 | z3;
            if ((i3 & 112) != 32) {
                z = false;
            }
            z5 = z7 | z;
            objP = fetVar.P();
            if (z5) {
                objP = new j2d(ugdVar2, ugdVar, w2dVar, b);
                fetVar.o0(objP);
            } else {
                objP = new j2d(ugdVar2, ugdVar, w2dVar, b);
                fetVar.o0(objP);
            }
            x4n0.a(mm40Var4, (Function2) objP, fetVar, (i3 >> 6) & 14, 0);
            mm40Var3 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g13(ugdVar, w2dVar, mm40Var3, ugdVar2, i, i2);
        }
    }

    public static final void c0(bnk0 bnk0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            pzw.E(bnk0Var, te90Var.d, 0, te90Var.e ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, Separators.STAR, 0, R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, "-", 0, R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, te90Var.b, 0, te90Var.c ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
            return;
        }
        pzw.E(bnk0Var, te90Var.b, 0, te90Var.c ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, "-", 0, R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, Separators.STAR, 0, R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, te90Var.d, 0, te90Var.e ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(mm40 mm40Var, final gan ganVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        final Function1 function3;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1382892926);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(ganVar) : fetVar2.i(ganVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarN = o7k0.n(jr8Var.b(jm40Var, zx7Var), 64.0f);
            zcl zclVar2 = qmk.g;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            qan qanVar = ganVar.d;
            ean eanVar = ganVar.h;
            mm40 mm40VarE2 = mm40VarE.e(i120.Q(jm40Var, qanVar.f28404a, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            int i3 = i2;
            final byte b = 1;
            nsm0.k(ganVar.f10976a, ganVar.b, function1, u1c.M(-753431271, new ft0(mm40VarE2, (byte) 4), fetVar2), u1c.M(772634480, new d0n((Object) ganVar, (Object) mm40VarE2, (byte) 20), fetVar2), fetVar2, (i2 & 896) | 27648);
            mm40 mm40VarN2 = s5x0.N(jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.d), 74.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA2 = w5d.a(new qw3(6.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            x(o7k0.d(jm40Var, 1.0f), ganVar.e, ganVar.f, fetVar2, 6);
            String str = ganVar.g;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            qxw.o(fetVar2, o7k0.e(jm40Var, 10.0f));
            boolean z3 = eanVar instanceof can;
            cl5 cl5Var = ukd.f35823a;
            if (z3) {
                fetVar2.e0(-644699349);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                wul wulVar = ((can) eanVar).f4020a.b;
                boolean z4 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar2.i(ganVar))) | ((i3 & 7168) == 2048);
                Object objP = fetVar2.P();
                if (z4 || objP == cl5Var) {
                    function3 = function2;
                    z = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    objP = new Function0() { // from class: a.aan
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b2 = objArr;
                            gan ganVar2 = ganVar;
                            Function1 function4 = function3;
                            switch (b2) {
                                case 0:
                                    function4.invoke(1);
                                    break;
                                case 1:
                                    function4.invoke(Integer.valueOf(((dan) ganVar2.h).f5757a.f2267a));
                                    break;
                                default:
                                    function4.invoke(1);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP);
                } else {
                    function3 = function2;
                    z = false;
                }
                qzb.n(mm40VarD2, wulVar, (Function0) objP, fetVar2, 6, 0);
                fetVar2.r(z);
            } else {
                function3 = function2;
                if (!(eanVar instanceof dan)) {
                    throw b1j.f(256295562, fetVar2, false);
                }
                fetVar2.e0(-644218942);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarD3);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar);
                jpm0.o(fetVar2, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar4);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                dan danVar = (dan) eanVar;
                wul wulVar2 = danVar.f5757a.b;
                int i4 = i3 & 7168;
                int i5 = i3 & 112;
                boolean z5 = (i4 == 2048) | (i5 == 32 || ((i3 & 64) != 0 && fetVar2.i(ganVar)));
                Object objP2 = fetVar2.P();
                if (z5 || objP2 == cl5Var) {
                    objP2 = new Function0() { // from class: a.aan
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b2 = b;
                            gan ganVar2 = ganVar;
                            Function1 function4 = function3;
                            switch (b2) {
                                case 0:
                                    function4.invoke(1);
                                    break;
                                case 1:
                                    function4.invoke(Integer.valueOf(((dan) ganVar2.h).f5757a.f2267a));
                                    break;
                                default:
                                    function4.invoke(1);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP2);
                }
                qzb.n(x7zVar, wulVar2, (Function0) objP2, fetVar2, 0, 0);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                wul wulVar3 = danVar.b.b;
                boolean z6 = (i4 == 2048) | (i5 == 32 || ((i3 & 64) != 0 && fetVar2.i(ganVar)));
                Object objP3 = fetVar2.P();
                if (z6 || objP3 == cl5Var) {
                    final byte b2 = 2;
                    objP3 = new Function0() { // from class: a.aan
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b3 = b2;
                            gan ganVar2 = ganVar;
                            Function1 function4 = function3;
                            switch (b3) {
                                case 0:
                                    function4.invoke(1);
                                    break;
                                case 1:
                                    function4.invoke(Integer.valueOf(((dan) ganVar2.h).f5757a.f2267a));
                                    break;
                                default:
                                    function4.invoke(1);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP3);
                }
                qzb.n(x7zVar2, wulVar3, (Function0) objP3, fetVar2, 0, 0);
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            function3 = function2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i(mm40Var, (Object) ganVar, function1, (wdr) function3, i, (byte) 27);
        }
    }

    public static final void d0(bnk0 bnk0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            pzw.E(bnk0Var, te90Var.d, 0, te90Var.e ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, "-", 0, R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, te90Var.b, 0, te90Var.c ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
        } else {
            pzw.E(bnk0Var, te90Var.b, 0, te90Var.c ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, "-", 0, R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, te90Var.d, 0, te90Var.e ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
        }
    }

    public static final ld90 e(int i) {
        return new ld90(i);
    }

    public static final String e0(String str) {
        List listT0;
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{" & "}, false, 0, 6, null);
        if (listSplit$default.size() != 2) {
            listSplit$default = null;
        }
        return (listSplit$default == null || (listT0 = CollectionsKt.t0(listSplit$default)) == null) ? str : CollectionsKt.b0(listT0, " & ", null, null, null, 62);
    }

    public static final void f(joh johVar, Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(-1437702548);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(johVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 8.0f, 1);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new vef(function1, johVar, (byte) 11);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarL, null, null, false, null, (Function0) objP, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 4.0f, 0.0f, 10);
            String str = johVar.b;
            fnk0 fnk0Var = johVar.d;
            ewp ewpVar = johVar.c;
            atm0.c(0, fetVar, mm40VarN, str);
            e9x.s(ewpVar.f8538a, fetVar, 0);
            dyb.w(dw9.h(1.0f, s5x0.N(jm40Var, 8.0f, 0.0f, 4.0f, 0.0f, 10), true), ewpVar, fetVar, 0);
            if (fnk0Var == null) {
                fetVar.e0(561729038);
                fetVar.r(false);
            } else {
                fetVar.e0(561729039);
                s0x.w(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), fnk0Var, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(johVar, function1, i);
        }
    }

    public static final void f0(bnk0 bnk0Var, mz10 mz10Var, boolean z) {
        int i = 0;
        boolean z2 = cy7.c() && z;
        List listT0 = mz10Var.f;
        if (z2) {
            listT0 = CollectionsKt.t0(listT0);
        }
        List list = listT0;
        int i2 = z2 ? 0 : q3d.i(list);
        for (Object obj : list) {
            int i3 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            te90 te90Var = (te90) obj;
            if (i != i2) {
                d0(bnk0Var, te90Var, z);
            } else {
                int i4 = mz10Var.g;
                if (i4 == 1) {
                    b0(bnk0Var, te90Var, z);
                } else if (i4 == 2) {
                    c0(bnk0Var, te90Var, z);
                } else {
                    d0(bnk0Var, te90Var, z);
                }
            }
            if (i != list.size() - 1) {
                F(bnk0Var);
                pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white_60, 0, 0, 54);
            }
            i = i3;
        }
    }

    public static final void g(mm40 mm40Var, String str, String str2, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(917049681);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            lul lulVar = lul.e;
            oe9 oe9Var = oe9.c;
            wul wulVar = new wul(lulVar, oe9Var, new ue9(str), true, false, false);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            qzb.n(o2e.e0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "LOG_IN_BUTTON"), wulVar, function0, fetVar2, (i3 >> 3) & 896, 0);
            wul wulVar2 = new wul(iul.e, oe9Var, new ue9(str2), true, false, false);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            qzb.n(o2e.e0(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), "REGISTRATION_BUTTON"), wulVar2, function1, fetVar2, (i3 >> 6) & 896, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, str, str2, function0, function1, i);
        }
    }

    public static final void g0(bnk0 bnk0Var, mz10 mz10Var, boolean z) {
        String str = mz10Var.j;
        String str2 = mz10Var.h;
        boolean z2 = mz10Var.i;
        boolean z3 = mz10Var.k;
        if ((str2.length() <= 0 && str.length() <= 0) || mz10Var.f.isEmpty()) {
            return;
        }
        if (cy7.c() && z) {
            pzw.E(bnk0Var, str, 0, z3 ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, "-", 0, R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, str2, 0, z2 ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, Separators.COLON, 0, R.color.static_white_60, 0, 0, 54);
            return;
        }
        pzw.E(bnk0Var, Separators.COLON, 0, R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, str2, 0, z2 ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, "-", 0, R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, str, 0, z3 ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
    }

    public static final void h(mm40 mm40Var, l7m0 l7m0Var, mqk mqkVar, boolean z, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i) {
        boolean z2;
        float f;
        cev0 cev0Var = mqkVar.b;
        lqk lqkVar = mqkVar.f22228a;
        l7m0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1275902153);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(mqkVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function1) ? 131072 : 65536) | (fetVar.i(function2) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
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
            w(null, lqkVar, fetVar, 0);
            float f2 = 28.0f;
            if (cev0Var instanceof bev0) {
                zcl zclVar = qmk.f28987a;
                f = 28.0f;
                z2 = true;
            } else {
                if (!(cev0Var instanceof aev0)) {
                    t9f.b();
                    return;
                }
                aev0 aev0Var = (aev0) cev0Var;
                int iOrdinal = aev0Var.f748a.ordinal();
                if (iOrdinal != 0) {
                    z2 = true;
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    zcl zclVar2 = qmk.f28987a;
                } else {
                    z2 = true;
                    a4x a4xVar = aev0Var.c;
                    if (a4xVar.size() != 1) {
                        a4xVar = null;
                    }
                    if (a4xVar != null) {
                        zcl zclVar3 = qmk.f28987a;
                        f = 16.0f;
                    } else {
                        zcl zclVar4 = qmk.f28987a;
                        f2 = 6.0f;
                    }
                }
                f = f2;
            }
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, lqkVar instanceof kqk ? 16.0f : 0.0f, 0.0f, f, 5);
            int i3 = i2 & 112;
            boolean z3 = (i3 == 32 ? z2 : false) | ((458752 & i2) == 131072 ? z2 : false);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new ys4(l7m0Var, function1, (byte) 5);
                fetVar.o0(objP);
            }
            Function1 function3 = (Function1) objP;
            boolean z4 = (i3 == 32 ? z2 : false) | ((3670016 & i2) == 1048576);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new ys4(l7m0Var, function2, (byte) 6);
                fetVar.o0(objP2);
            }
            u4n0.j(mm40VarN, cev0Var, z, function0, function3, (Function1) objP2, fetVar, (i2 >> 3) & 8064);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var, (Object) l7m0Var, (Object) mqkVar, z, (Object) function0, (Object) function1, (Object) function2, i, (byte) 2);
        }
    }

    public static final void h0(bnk0 bnk0Var, izm0 izm0Var, boolean z) {
        izm0Var.getClass();
        pzw.E(bnk0Var, "\u2066", 0, 0, 0, 0, 62);
        List listT0 = (cy7.c() && z) ? CollectionsKt.t0(izm0Var.d()) : izm0Var.d();
        int i = 0;
        for (Object obj : listT0) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            d0(bnk0Var, (te90) obj, z);
            if (i != listT0.size() - 1) {
                pzw.E(bnk0Var, Separators.COMMA, 0, R.color.static_white_60, 0, 0, 54);
                pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white_60, 0, 0, 54);
            }
            i = i2;
        }
        pzw.E(bnk0Var, "\u2069", 0, 0, 0, 0, 62);
    }

    public static final void i(mm40 mm40Var, gpl gplVar, float f, float f2, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-327746585);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(gplVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.X();
        } else if (gplVar instanceof epl) {
            fetVar.e0(-1431843463);
            j(mm40Var, (epl) gplVar, f, f2, function1, fetVar, i2 & 65534);
            fetVar.r(false);
        } else {
            if (!(gplVar instanceof fpl)) {
                throw b1j.f(-1431845972, fetVar, false);
            }
            fetVar.e0(-1431831284);
            int i3 = i2 & 14;
            int i4 = i2 >> 3;
            k(mm40Var, f, f2, fetVar, (i4 & 896) | i3 | (i4 & 112));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n04(mm40Var, (tpl) gplVar, f, f2, function1, i, (byte) 1);
        }
    }

    public static final ank0 i0(lz10 lz10Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        qto qtoVar = new qto(z, lz10Var, (byte) 0);
        bnk0 bnk0Var = new bnk0();
        qtoVar.invoke(bnk0Var);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final void j(mm40 mm40Var, epl eplVar, float f, float f2, Function1 function1, fet fetVar, int i) {
        Object obj;
        fetVar.g0(2066721896);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(eplVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarK = s5x0.K(mm40Var, f, f2);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            hjm hjmVar = new hjm(eplVar.b, null, null, null, null, null, false, null, null, false, null, null, 8190);
            int i3 = i2;
            kjm kjmVar = kjm.f18392a;
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = new knl((byte) 2);
                fetVar.o0(objP);
            }
            Object obj3 = obj2;
            nkb.h(mm40VarL, hjmVar, kjmVar, (Function0) objP, null, null, fetVar, 3456, 48);
            x5d x5dVarA2 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(-621234904);
            for (bpl bplVar : eplVar.f8193a) {
                String str = eplVar.c;
                boolean zG = fetVar.g(bplVar) | ((i3 & 57344) == 16384);
                Object objP2 = fetVar.P();
                if (zG) {
                    obj = obj3;
                } else {
                    obj = obj3;
                    if (objP2 == obj) {
                    }
                    ozb.r(str, bplVar, (Function0) objP2, fetVar, 6);
                    obj3 = obj;
                }
                objP2 = new qe1(function1, bplVar, (byte) 1);
                fetVar.o0(objP2);
                ozb.r(str, bplVar, (Function0) objP2, fetVar, 6);
                obj3 = obj;
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n04(mm40Var, (tpl) eplVar, f, f2, function1, i, (byte) 2);
        }
    }

    public static final ank0 j0(hzm0 hzm0Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        pto ptoVar = new pto(z, hzm0Var, (byte) 1);
        bnk0 bnk0Var = new bnk0();
        ptoVar.invoke(bnk0Var);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final void k(mm40 mm40Var, float f, float f2, fet fetVar, int i) {
        int i2;
        fetVar.g0(353944035);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarK = s5x0.K(o7k0.d(mm40Var, 1.0f), f, f2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            qxw.o(fetVar, o7k0.e(jm40Var, 10.0f));
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 128.0f), 20.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 10.0f));
            mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var, 1.0f), 60.0f);
            zcl zclVar3 = qmk.i;
            qxw.o(fetVar, rw2.d(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE2), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
            qxw.o(fetVar, rw2.d(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(o7k0.d(jm40Var, 1.0f), 60.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
            h97.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(o7k0.d(jm40Var, 1.0f), 60.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wol(mm40Var, f, f2, i, (byte) 0);
        }
    }

    public static final ank0 k0(lz10 lz10Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        qto qtoVar = new qto(z, lz10Var, (byte) 1);
        bnk0 bnk0Var = new bnk0();
        qtoVar.invoke(bnk0Var);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final void l(String str, String str2, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        Function0 function2;
        function0.getClass();
        function1.getClass();
        fetVar.g0(-204261858);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function2 = function1;
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        } else {
            function2 = function1;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarD, 8.0f, 8.0f, 8.0f, 8.0f);
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
            if (str == null || str.length() == 0) {
                fetVar.e0(-226938022);
                fetVar.r(false);
            } else {
                fetVar.e0(-227431976);
                qzb.n(o7k0.d(jm40Var, 1.0f), new wul(nul.e, oe9.f25112a, new ue9(str), true, false, false), function0, fetVar, (i2 & 896) | 6, 0);
                fetVar.r(false);
            }
            if (str2 == null || str2.length() == 0) {
                fetVar.e0(-226252550);
                fetVar.r(false);
            } else {
                fetVar.e0(-226869512);
                qzb.n(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, (str == null || str.length() == 0) ? 0.0f : 8.0f, 0.0f, 0.0f, 13), new wul(lul.e, oe9.f25112a, new ue9(str2), true, false, false), function2, fetVar, (i2 >> 3) & 896, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 7, i, (Object) str, (Object) str2, (Object) function0, (Object) function1);
        }
    }

    public static final ank0 l0(hzm0 hzm0Var, boolean z) {
        ArrayList arrayList = new ArrayList();
        pto ptoVar = new pto(z, hzm0Var, (byte) 0);
        bnk0 bnk0Var = new bnk0();
        ptoVar.invoke(bnk0Var);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final void m(uzb uzbVar, fet fetVar, int i) {
        vqm vqmVar;
        vqm vqmVar2;
        fetVar.g0(1600016773);
        int i2 = (fetVar.i(uzbVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            boolean z = uzbVar instanceof h8m;
            if (z) {
                vqmVar = vqm.b;
            } else {
                if (!(uzbVar instanceof g8m)) {
                    t9f.b();
                    return;
                }
                vqmVar = vqm.f37862a;
            }
            zq8.a(0, fetVar, xbc.c0(mm40VarE, vbc.d0(vqmVar, fetVar, 0, 0)));
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 6.0f, 5), 48.0f), 12.0f));
            if (z) {
                vqmVar2 = vqm.b;
            } else {
                if (!(uzbVar instanceof g8m)) {
                    t9f.b();
                    return;
                }
                vqmVar2 = vqm.f37862a;
            }
            dw9.x(mm40VarE2, vbc.d0(vqmVar2, fetVar, 0, 0), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(uzbVar, i, (byte) 9);
        }
    }

    public static final void m0(bnk0 bnk0Var, oz10 oz10Var, boolean z) {
        int i = 0;
        boolean z2 = cy7.c() && z;
        List listT0 = oz10Var.f;
        if (z2) {
            listT0 = CollectionsKt.t0(listT0);
        }
        List list = listT0;
        int i2 = z2 ? 0 : q3d.i(list);
        for (Object obj : list) {
            int i3 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            te90 te90Var = (te90) obj;
            if (i != i2) {
                d0(bnk0Var, te90Var, z);
            } else {
                int i4 = oz10Var.o;
                if (i4 == 1) {
                    b0(bnk0Var, te90Var, z);
                } else if (i4 == 2) {
                    c0(bnk0Var, te90Var, z);
                } else {
                    d0(bnk0Var, te90Var, z);
                }
            }
            if (i != list.size() - 1) {
                F(bnk0Var);
                pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white_60, 0, 0, 54);
            }
            i = i3;
        }
    }

    public static final void n(mm40 mm40Var, String str, y3d y3dVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        y3d y3dVar2;
        int i4;
        y3d y3dVar3;
        mm40 mm40Var3;
        long textPrimary;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(1281754018);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar2.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i6 = i3 | (fetVar2.g(str) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            y3dVar2 = y3dVar;
        } else {
            y3dVar2 = y3dVar;
            i4 = i6 | (fetVar2.g(y3dVar2) ? 256 : 128);
        }
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            mm40 mm40Var4 = i5 != 0 ? jm40.b : mm40Var2;
            y3d y3dVar4 = i7 != 0 ? null : y3dVar2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.e(o7k0.s(mm40Var4, 28.0f), 24.0f), vgg0.a(6.0f));
            zfn zfnVar = zaq0.b;
            mm40 mm40VarS = i120.S(i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator(), vgg0.a(6.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            if (y3dVar4 == null) {
                fetVar2.e0(1065886375);
                textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
                fetVar2.r(false);
            } else {
                fetVar2.e0(1065885414);
                fetVar2.r(false);
                textPrimary = y3dVar4.f41946a;
            }
            long j = textPrimary;
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i4 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var3 = mm40Var4;
            y3dVar3 = y3dVar4;
        } else {
            fetVar2.X();
            y3dVar3 = y3dVar2;
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tkm(mm40Var3, str, y3dVar3, i, i2, (byte) 1);
        }
    }

    public static final void n0(bnk0 bnk0Var, oz10 oz10Var, boolean z) {
        String str = oz10Var.i;
        String str2 = oz10Var.g;
        boolean z2 = oz10Var.h;
        boolean z3 = oz10Var.j;
        if (str2.length() <= 0 && str.length() <= 0) {
            return;
        }
        if (cy7.c() && z) {
            pzw.E(bnk0Var, str, 0, z3 ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, "-", 0, R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, str2, 0, z2 ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
            pzw.E(bnk0Var, Separators.COLON, 0, R.color.static_white_60, 0, 0, 54);
            return;
        }
        pzw.E(bnk0Var, Separators.COLON, 0, R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, str2, 0, z2 ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, "-", 0, R.color.static_white_60, 0, 0, 54);
        pzw.E(bnk0Var, str, 0, z3 ? R.color.static_green : R.color.static_white_60, 0, 0, 54);
    }

    public static final void o(mm40 mm40Var, fwm fwmVar, fet fetVar, int i) {
        if (fwmVar instanceof awm) {
            fetVar.e0(-339336845);
            ozb.u(mm40Var, (awm) fwmVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (fwmVar instanceof bwm) {
            fetVar.e0(-339144552);
            qzb.q(mm40Var, (bwm) fwmVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (fwmVar instanceof cwm) {
            fetVar.e0(-338957064);
            uzb.v(mm40Var, (cwm) fwmVar, fetVar, i & 126);
            fetVar.r(false);
        } else if (fwmVar instanceof dwm) {
            fetVar.e0(-338769576);
            vzb.i(mm40Var, (dwm) fwmVar, fetVar, i & 126);
            fetVar.r(false);
        } else {
            if (!(fwmVar instanceof ewm)) {
                throw b1j.f(958883443, fetVar, false);
            }
            fetVar.e0(-338582088);
            wzb.s(mm40Var, (ewm) fwmVar, fetVar, i & 126);
            fetVar.r(false);
        }
    }

    public static void o0(Context context) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) GameVideoWindowService.class);
        intent.setAction("ACTION_STOP");
        j47.B0(context, intent);
    }

    public static final void p(mm40 mm40Var, m0n m0nVar, fet fetVar) {
        k6z k6zVar;
        byte b = 0;
        if (m0nVar.a()) {
            fetVar.e0(-272718714);
            k6zVar = (k6z) fetVar.k(bmd.n);
            fetVar.r(false);
        } else {
            fetVar.e0(-272717790);
            fetVar.r(false);
            k6zVar = k6z.f17794a;
        }
        obc.d(bmd.n.a(k6zVar), u1c.M(1713330591, new d0n(m0nVar, mm40Var, b), fetVar), fetVar, 56);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v18, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.ArrayList] */
    public static final ned p0(red redVar) {
        Object obj;
        ArrayList arrayList;
        ?? arrayList2;
        gip0 gip0Var;
        gip0 gip0Var2;
        ?? arrayList3;
        ?? arrayList4;
        List list;
        List list2;
        Object next;
        Object next2;
        ce30 ce30Var = redVar.f30329a;
        List list3 = redVar.c;
        Integer num = redVar.b;
        if (ce30Var == null) {
            jf4.k(null);
            return null;
        }
        List<med> list4 = ce30Var.f4193a;
        if (list4 != null) {
            ArrayList arrayList5 = new ArrayList(r3d.q(list4, 10));
            for (med medVar : list4) {
                medVar.getClass();
                String str = medVar.h;
                String str2 = medVar.g;
                if (list3 != null) {
                    Iterator it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!Intrinsics.d(((gip0) next2).f11360a, str2));
                    gip0Var = (gip0) next2;
                } else {
                    gip0Var = null;
                }
                if (list3 != null) {
                    Iterator it2 = list3.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.d(((gip0) next).f11360a, str));
                    gip0Var2 = (gip0) next;
                } else {
                    gip0Var2 = null;
                }
                String str3 = medVar.c;
                String str4 = str3 == null ? "" : str3;
                Long l = medVar.b;
                long jLongValue = l != null ? l.longValue() : 0L;
                pek pekVar = lho.b;
                Integer num2 = medVar.f;
                int iIntValue = num2 != null ? num2.intValue() : 0;
                pekVar.getClass();
                lho lhoVarG = pek.g(iIntValue);
                Integer num3 = medVar.f21639a;
                int iIntValue2 = num3 != null ? num3.intValue() : 0;
                Object obj2 = medVar.d;
                if (obj2 == null && (obj2 = medVar.i) == null) {
                    obj2 = "0";
                }
                String string = obj2.toString();
                Object obj3 = medVar.e;
                String string2 = ((obj3 == null && (obj3 = medVar.j) == null) ? "0" : obj3).toString();
                String str5 = str2 == null ? "" : str2;
                String str6 = str == null ? "" : str;
                Integer num4 = medVar.k;
                int iIntValue3 = num4 != null ? num4.intValue() : 0;
                long jIntValue = num != null ? num.intValue() : 0L;
                List listZ = tx3.z(new gip0[]{gip0Var, gip0Var2});
                Integer num5 = num;
                ArrayList arrayList6 = new ArrayList(r3d.q(listZ, 10));
                Iterator it3 = ((ArrayList) listZ).iterator();
                while (it3.hasNext()) {
                    arrayList6.add(dnm0.q((gip0) it3.next()));
                }
                cys0 cys0VarV = wvb.V(jIntValue, arrayList6);
                if (gip0Var == null || (list2 = gip0Var.e) == null) {
                    arrayList3 = 0;
                } else {
                    arrayList3 = new ArrayList(r3d.q(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(a4n0.m((o4n0) it4.next()));
                    }
                }
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                ?? r27 = arrayList3;
                if (gip0Var2 == null || (list = gip0Var2.e) == null) {
                    arrayList4 = 0;
                } else {
                    arrayList4 = new ArrayList(r3d.q(list, 10));
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList4.add(a4n0.m((o4n0) it5.next()));
                    }
                }
                if (arrayList4 == 0) {
                    arrayList4 = iun.f15405a;
                }
                arrayList5.add(new udt(str4, jLongValue, lhoVarG, iIntValue2, string, string2, str5, str6, iIntValue3, cys0VarV, r27, arrayList4));
                num = num5;
            }
            obj = null;
            arrayList = arrayList5;
        } else {
            obj = null;
            arrayList = null;
        }
        Integer num6 = num;
        List list5 = arrayList;
        if (arrayList == null) {
            list5 = iun.f15405a;
        }
        String str7 = ce30Var.b;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = ce30Var.c;
        lb30 lb30Var = new lb30(list5, str7, str8 != null ? str8 : "");
        int iIntValue4 = num6 != null ? num6.intValue() : 0;
        if (list3 != null) {
            arrayList2 = new ArrayList(r3d.q(list3, 10));
            Iterator it6 = list3.iterator();
            while (it6.hasNext()) {
                arrayList2.add(dnm0.q((gip0) it6.next()));
            }
        } else {
            arrayList2 = obj;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        return new ned(lb30Var, iIntValue4, arrayList2);
    }

    public static final void q(mm40 mm40Var, ian ianVar, Function2 function2, fet fetVar, int i) {
        fetVar.g0(-1928189317);
        int i2 = i | (fetVar.g(ianVar) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            if (ianVar instanceof gan) {
                fetVar.e0(-1859017687);
                gan ganVar = (gan) ianVar;
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new wil(pz40Var, (byte) 19);
                    fetVar.o0(objP2);
                }
                Function1 function1 = (Function1) objP2;
                boolean z = (i2 & 896) == 256;
                Object objP3 = fetVar.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new z9n(function2, pz40Var, (byte) 0);
                    fetVar.o0(objP3);
                }
                d(mm40Var, ganVar, function1, (Function1) objP3, fetVar, (i2 & 112) | 390);
                fetVar.r(false);
            } else {
                if (!ianVar.equals(han.f12731a)) {
                    throw b1j.f(-1859019842, fetVar, false);
                }
                fetVar.e0(-1859007572);
                v(6, fetVar, mm40Var);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var, ianVar, function2, i, (byte) 24);
        }
    }

    public static final ArrayList q0(c5l c5lVar, boolean z) {
        ArrayList<z4l> arrayListQ0 = CollectionsKt.q0(c5lVar.b.b, c5lVar.c.b);
        ArrayList arrayList = new ArrayList(r3d.q(arrayListQ0, 10));
        for (z4l z4lVar : arrayListQ0) {
            int i = z4lVar.f43775a;
            int i2 = z4lVar.f;
            int i3 = z4lVar.e;
            StringBuilder sb = new StringBuilder(ujn.h);
            String strE = ua80.e(i, "/sfiles/dota2/32/", ".png");
            if (strE.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                sb.setLength(0);
                sb.append(strE);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(strE, '/'));
            }
            String string = sb.toString();
            boolean z2 = z4lVar.r == i6l.b;
            arrayList.add(new o5l(i, i3 > 99 ? 99 : i3 < 0 ? 1 : i3, i2 <= 99 ? i2 < 0 ? 1 : i2 : 99, string, z2, (z || z4lVar.g != 0 || (i3 == 0 && i2 == 0)) ? false : true));
        }
        return arrayList;
    }

    public static final void r(x0o0 x0o0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-416068399);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(x0o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = w4o.f38549a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(x0o0Var, context, (byte) 3);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, null, (Function1) objP2, fetVar2, 6, 2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(x0o0Var, i, (byte) 25);
        }
    }

    public static final uqr r0(mca mcaVar, String str, String str2, String str3, String str4, jg30 jg30Var) {
        krr krrVar;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        z(str2, sb);
        z(str4, sb);
        if (mcaVar instanceof pca) {
            pca pcaVar = (pca) mcaVar;
            krrVar = new krr(pcaVar.e, pcaVar.f, pcaVar.i, pcaVar.j, pcaVar.k, "");
        } else if (mcaVar instanceof tca) {
            tca tcaVar = (tca) mcaVar;
            krrVar = new krr(tcaVar.f, tcaVar.h, tcaVar.d, tcaVar.e, tcaVar.j, tcaVar.g);
        } else if (mcaVar instanceof xca) {
            xca xcaVar = (xca) mcaVar;
            krrVar = new krr(xcaVar.n, xcaVar.o, xcaVar.j, xcaVar.k, xcaVar.r, xcaVar.m);
        } else if (mcaVar instanceof gda) {
            gda gdaVar = (gda) mcaVar;
            krrVar = new krr(gdaVar.g, gdaVar.h, gdaVar.e, gdaVar.f, gdaVar.i, "");
        } else if (mcaVar instanceof hda) {
            hda hdaVar = (hda) mcaVar;
            krrVar = new krr(hdaVar.h, hdaVar.i, hdaVar.e, hdaVar.f, hdaVar.l, "");
        } else {
            if (!(mcaVar instanceof ida)) {
                t9f.b();
                return null;
            }
            ida idaVar = (ida) mcaVar;
            krrVar = new krr(idaVar.c, idaVar.d, idaVar.f14574a, idaVar.b, idaVar.f, "");
        }
        String string = sb.toString();
        String str5 = krrVar.b;
        str5.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        String str6 = krrVar.f18781a;
        if (str6.length() > 0) {
            pz40 pz40Var = s6t0.f31722a;
            vzb.F(dpi0Var, str6, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045));
        }
        if (!StringsKt.W(str5)) {
            pz40 pz40Var2 = s6t0.f31722a;
            vzb.F(dpi0Var, str5, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045));
        }
        String str7 = krrVar.c;
        if (str7.length() > 0) {
            pz40 pz40Var3 = s6t0.f31722a;
            vzb.F(dpi0Var, str7, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045));
        }
        String str8 = krrVar.d;
        if (str8.length() > 0) {
            pz40 pz40Var4 = s6t0.f31722a;
            vzb.F(dpi0Var, str8, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045));
        }
        String str9 = krrVar.e;
        if (str9.length() > 0) {
            pz40 pz40Var5 = s6t0.f31722a;
            vzb.F(dpi0Var, str9, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045));
        }
        String str10 = krrVar.f;
        if (str10.length() > 0) {
            pz40 pz40Var6 = s6t0.f31722a;
            vzb.F(dpi0Var, str10, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109));
        }
        j83 j83VarH = ((h83) dpi0Var.f6468a).h();
        StringBuilder sb2 = new StringBuilder(ujn.h);
        String str11 = str3 == null ? "" : str3;
        if (str11.length() == 0) {
            sb2.setLength(0);
        } else if (StringsKt.O(str11, ujn.h, false) || kotlin.text.c.x(str11, "https://", false)) {
            sb2.setLength(0);
            sb2.append(str11);
        } else {
            if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                sb2.append('/');
            }
            sb2.append(StringsKt.y0(str11, '/'));
        }
        return new uqr(string, j83VarH, sb2.toString(), jg30Var);
    }

    public static final void s(mm40 mm40Var, qdz qdzVar, wbo wboVar, Function0 function0, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        qdzVar.getClass();
        wboVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(830185869);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.g(wboVar) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 << 3;
            xcz xczVarB = qdzVar.b(wboVar.f38889a, new x6o((byte) 5), fetVar2, i3 & 896);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 136.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            qzb.o(o2e.e0(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), "DS_CYBER_ICON_COLLECTION"), wboVar.b, new g8m(), xczVarB, function1, fetVar2, 458752 & i3);
            e3c.b(null, wboVar.c, function0, fetVar, (i2 >> 3) & 896, 1);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, (Object) qdzVar, (Object) wboVar, (Object) function0, (Object) function1, i, (byte) 19);
        }
    }

    public static final void t(mm40 mm40Var, String str, rab rabVar, String str2, String str3, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        zx7 zx7Var = gqw0.f;
        zx7 zx7Var2 = gqw0.d;
        str.getClass();
        str2.getClass();
        fetVar2.g0(-226393967);
        int i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        int i3 = i2 | (fetVar2.g(str2) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i3 |= fetVar2.g(str3) ? 16384 : 8192;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (i4 & 9363) != 9362)) {
            Context context = (Context) fetVar2.k(dy2.b);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = j1t0.f15753a;
                context.getClass();
                objP.getClass();
                if (str2.length() != 0) {
                    try {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(new File(context.getCacheDir(), str2));
                        typefaceCreateFromFile.getClass();
                        objP = lv00.E(typefaceCreateFromFile);
                    } catch (Exception unused) {
                    }
                }
                fetVar2.o0(objP);
            }
            nrq nrqVar = (nrq) objP;
            zx7 zx7Var3 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var3, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = ffb0.Q(mm40VarA, 2.0f, 2.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM62getBlack0d7_KjU = staticColors.m62getBlack0d7_KjU();
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar2, i120.S(mm40VarQ, 4.0f, jM62getBlack0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            mm40 mm40VarQ2 = i120.Q(i120.S(jr8Var.a(jm40Var), 2.0f, staticColors.m62getBlack0d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), kkg.F, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC2 = zq8.c(zx7Var3, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            rab rabVar2 = rab.f30127a;
            zx7 zx7Var4 = rabVar == rabVar2 ? zx7Var2 : zx7Var;
            zx7 zx7Var5 = rabVar == rabVar2 ? zx7Var : zx7Var2;
            k7x.a(str3, null, o2e.e0(o7k0.n(s5x0.L(jr8Var.b(jm40Var, zx7Var4), 4.0f, 0.0f, 2), 24.0f), rabVar == rabVar2 ? "TIC_TAC_TOE_HEADER_ICON_CROSS" : "TIC_TAC_TOE_HEADER_ICON_NOUGHT"), gqw0.A, null, fetVar2, ((i4 >> 12) & 14) | 1572912, 1976);
            v8q0.a(str, o2e.e0(s5x0.L(jr8Var.b(jm40Var, zx7Var5), 8.0f, 0.0f, 2), rabVar == rabVar2 ? "TIC_TAC_TOE_HEADER_SCORE_CROSS" : "TIC_TAC_TOE_HEADER_SCORE_NOUGHT"), staticColors.m123getWhite0d7_KjU(), null, idm0.t(20), null, null, nrqVar, 0L, null, 0L, 0, false, 0, 0, null, null, fetVar, ((i4 >> 3) & 14) | 12607488, 0, 261992);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new geb(mm40Var, str, rabVar, str2, str3, i, (byte) 3);
        }
    }

    public static final void u(pa00 pa00Var, float f, float f2, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        int i3 = pa00Var.e;
        fetVar2.g0(-282147168);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(pa00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ufw(pa00Var, (byte) 1);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(i3, (Function0) objP, fetVar2, 0, 2);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zG = (i4 == 4) | fetVar2.g(kwjVarB);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new xfw(kwjVarB, pa00Var, null, b);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, numValueOf, (Function2) objP2);
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, f, 0.0f, f2, 5);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            a4x a4xVar = pa00Var.d;
            zcl zclVar = qmk.f28987a;
            ebc.r(null, new fyl(a4xVar, null, null, s5x0.t(8.0f, 0.0f, 2), null, 22), null, function2, null, fetVar2, 57344 & i2, 45);
            q5x.e(kwjVarB, null, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(1744839639, new vfw(pa00Var, function1, b), fetVar2), fetVar, 100663296, 24576, 16126);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wfw(pa00Var, f, f2, function1, function2, i, (byte) 1);
        }
    }

    public static final void v(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1426127153);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 122.0f);
            zcl zclVar2 = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 26);
        }
    }

    public static final void w(mm40 mm40Var, lqk lqkVar, fet fetVar, int i) {
        lqk lqkVar2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1644208751);
        int i2 = i | 6 | (fetVar2.g(lqkVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = lqkVar instanceof iqk;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar2.e0(-1478874764);
                zcl zclVar = qmk.f28987a;
                v8q0.a(((iqk) lqkVar).f15213a, o7k0.e(s5x0.J(jm40Var, 16.0f), 40.0f), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.y, null, j1t0.f15753a, 0L, null, 0, 0, qmk.K, 16646109), fetVar, 0, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(false);
                lqkVar2 = lqkVar;
                mm40Var2 = jm40Var;
            } else {
                lqkVar2 = lqkVar;
                if (lqkVar2.equals(jqk.f16957a)) {
                    fetVar2.e0(-1478439679);
                    zcl zclVar2 = qmk.f28987a;
                    mm40Var2 = jm40Var;
                    mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 16.0f, 10.0f, 0.0f, 26.0f, 4), 128.0f), 20.0f);
                    zcl zclVar3 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    h97.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE), vbc.d0(vqm.b, fetVar2, 6, 0), fetVar2, false);
                } else {
                    mm40Var2 = jm40Var;
                    if (!lqkVar2.equals(kqk.f18727a)) {
                        throw b1j.f(-463350314, fetVar2, false);
                    }
                    fetVar2.e0(-1477944175);
                    fetVar2.r(false);
                }
            }
        } else {
            lqkVar2 = lqkVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(mm40Var2, lqkVar2, i, (byte) 10);
        }
    }

    public static final void x(mm40 mm40Var, fan fanVar, fan fanVar2, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1602613461);
        int i2 = i | (fetVar.g(fanVar) ? 32 : 16) | (fetVar.g(fanVar2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.q;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            j6n.h(fanVar.f9217a, fanVar.b, o7k0.y(jm40Var, null, 3), 0, 0, fetVar, 384, 24);
            if (fanVar2 == null) {
                fetVar.e0(1620557803);
                fetVar.r(false);
            } else {
                fetVar.e0(1620557804);
                j6n.h(fanVar2.f9217a, fanVar2.b, o7k0.y(jm40Var, null, 3), 0, 0, fetVar, 384, 24);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var2, fanVar, fanVar2, i, (byte) 23);
        }
    }

    public static void y(StringBuilder sb, String str, Map map) {
        String strValueOf;
        if (map.isEmpty()) {
            sb.append(str.concat(": (None)\n"));
            return;
        }
        sb.append(str.concat(Separators.RETURN));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof CameraCharacteristics.Key) {
                strValueOf = ((CameraCharacteristics.Key) key).getName();
                strValueOf.getClass();
            } else if (key instanceof CaptureRequest.Key) {
                strValueOf = ((CaptureRequest.Key) key).getName();
                strValueOf.getClass();
            } else if (key instanceof CaptureResult.Key) {
                strValueOf = ((CaptureResult.Key) key).getName();
                strValueOf.getClass();
            } else {
                strValueOf = String.valueOf(key);
            }
            Object value = entry.getValue();
            arrayList.add(new Pair(strValueOf, value instanceof Object[] ? tx3.N((Object[]) value, null, "[", "]", new x2i((byte) 17), 25) : String.valueOf(value)));
        }
        for (Pair pair : CollectionsKt.A0(arrayList, new vt5((byte) 24))) {
            sb.append("  " + StringsKt.a0(50, (String) pair.f46059a) + ' ' + ((String) pair.b) + '\n');
        }
    }

    public static final void z(String str, StringBuilder sb) {
        if (sb.length() <= 0 || str == null || str.length() == 0) {
            return;
        }
        sb.append(". ".concat(str));
    }
}
