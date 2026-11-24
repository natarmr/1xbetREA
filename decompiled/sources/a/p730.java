package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p730 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26487a;
    public final /* synthetic */ s730 b;

    public /* synthetic */ p730(s730 s730Var, byte b) {
        this.f26487a = b;
        this.b = s730Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:37:0x0111  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122  */
    /* JADX WARN: Code duplicated, block: B:42:0x0127  */
    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Code duplicated, block: B:45:0x0135  */
    /* JADX WARN: Code duplicated, block: B:47:0x0151  */
    /* JADX WARN: Code duplicated, block: B:52:0x0169  */
    /* JADX WARN: Code duplicated, block: B:53:0x016d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x0173  */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    /* JADX WARN: Code duplicated, block: B:62:0x0189  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:78:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e5  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        ctf0 ctf0Var;
        hx20 hx20Var;
        Object value;
        fx20 fx20Var;
        List<dx20> list;
        lx20 lx20Var;
        kx20 kx20Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        int iB;
        int iB2;
        byte b = this.f26487a;
        s730 s730Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                long jLongValue = ((Long) obj2).longValue();
                atz atzVar = s730.Q1;
                dy20 dy20Var = (dy20) s730Var.M1.getValue();
                p7m0 p7m0Var = dy20Var.t;
                Object value2 = p7m0Var.getValue();
                fx20 fx20Var2 = value2 instanceof fx20 ? (fx20) value2 : null;
                if (fx20Var2 != null) {
                    List list2 = fx20Var2.f10289a;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list2) {
                        if (((dx20) obj3).d) {
                            arrayList3.add(obj3);
                        }
                    }
                    if (arrayList3.size() != 1 || !zBooleanValue) {
                        z = !zBooleanValue;
                        ctf0Var = dy20Var.i;
                        hx20Var = (hx20) p7m0Var.getValue();
                        if (hx20Var instanceof fx20) {
                            List<dx20> list3 = ((fx20) hx20Var).f10289a;
                            arrayList = new ArrayList(r3d.q(list3, 10));
                            for (dx20 dx20Var : list3) {
                                if (dx20Var.b == jLongValue) {
                                    if (zBooleanValue) {
                                        iB = ctf0.b(R.attr.uikitSecondary, ctf0Var);
                                    } else {
                                        iB = ctf0Var.a(R.color.static_white);
                                    }
                                    if (zBooleanValue) {
                                        iB2 = ctf0.b(R.attr.uikitTextPrimary, ctf0Var);
                                    } else {
                                        iB2 = ctf0Var.a(R.color.static_white);
                                    }
                                    arrayList2 = arrayList;
                                    dx20Var = new dx20(iB, iB2, dx20Var.g, dx20Var.b, dx20Var.f6826a, dx20Var.c, z);
                                } else {
                                    arrayList2 = arrayList;
                                }
                                arrayList2.add(dx20Var);
                                arrayList = arrayList2;
                            }
                            p7m0Var.o(null, new fx20(arrayList));
                        }
                        value = p7m0Var.getValue();
                        if (value instanceof fx20) {
                            fx20Var = (fx20) value;
                        } else {
                            fx20Var = null;
                        }
                        if (fx20Var != null) {
                            list = fx20Var.f10289a;
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        List list4 = dy20Var.u;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : list4) {
                            kx20Var = (kx20) obj4;
                            if (list != null || !list.isEmpty()) {
                                for (dx20 dx20Var2 : list) {
                                    if (dx20Var2.b != kx20Var.f19032a && dx20Var2.d) {
                                        arrayList4.add(obj4);
                                    }
                                    break;
                                }
                            }
                        }
                        List list5 = dy20Var.v;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj5 : list5) {
                            lx20Var = (lx20) obj5;
                            if (list != null || !list.isEmpty()) {
                                for (dx20 dx20Var3 : list) {
                                    if (dx20Var3.b != lx20Var.f20794a && dx20Var3.d) {
                                        arrayList5.add(obj5);
                                    }
                                    break;
                                }
                            }
                        }
                        dy20Var.j.getClass();
                        qx20 qx20Var = new qx20(sqt.e(arrayList4), arrayList5, dy20Var.c.f17841a.b().getId(), dy20Var.b.b);
                        p7m0 p7m0Var2 = dy20Var.s;
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, qx20Var);
                    }
                } else {
                    z = !zBooleanValue;
                    ctf0Var = dy20Var.i;
                    hx20Var = (hx20) p7m0Var.getValue();
                    if (hx20Var instanceof fx20) {
                        List<dx20> list6 = ((fx20) hx20Var).f10289a;
                        arrayList = new ArrayList(r3d.q(list6, 10));
                        while (r6.hasNext()) {
                            if (dx20Var.b == jLongValue) {
                                if (zBooleanValue) {
                                    iB = ctf0Var.a(R.color.static_white);
                                } else {
                                    iB = ctf0.b(R.attr.uikitSecondary, ctf0Var);
                                }
                                if (zBooleanValue) {
                                    iB2 = ctf0Var.a(R.color.static_white);
                                } else {
                                    iB2 = ctf0.b(R.attr.uikitTextPrimary, ctf0Var);
                                }
                                arrayList2 = arrayList;
                                dx20Var = new dx20(iB, iB2, dx20Var.g, dx20Var.b, dx20Var.f6826a, dx20Var.c, z);
                            } else {
                                arrayList2 = arrayList;
                            }
                            arrayList2.add(dx20Var);
                            arrayList = arrayList2;
                        }
                        p7m0Var.o(null, new fx20(arrayList));
                    }
                    value = p7m0Var.getValue();
                    if (value instanceof fx20) {
                        fx20Var = (fx20) value;
                    } else {
                        fx20Var = null;
                    }
                    if (fx20Var != null) {
                        list = fx20Var.f10289a;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        list = iun.f15405a;
                    }
                    List list7 = dy20Var.u;
                    ArrayList arrayList6 = new ArrayList();
                    while (r1.hasNext()) {
                        kx20Var = (kx20) obj4;
                        if (list != null) {
                        }
                        while (r6.hasNext()) {
                            if (dx20Var2.b != kx20Var.f19032a) {
                            }
                        }
                    }
                    List list8 = dy20Var.v;
                    ArrayList arrayList7 = new ArrayList();
                    while (r1.hasNext()) {
                        lx20Var = (lx20) obj5;
                        if (list != null) {
                        }
                        while (r7.hasNext()) {
                            if (dx20Var3.b != lx20Var.f20794a) {
                            }
                        }
                    }
                    dy20Var.j.getClass();
                    qx20 qx20Var2 = new qx20(sqt.e(arrayList6), arrayList7, dy20Var.c.f17841a.b().getId(), dy20Var.b.b);
                    p7m0 p7m0Var3 = dy20Var.s;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, qx20Var2);
                }
                break;
            default:
                float fFloatValue = ((Float) obj).floatValue();
                float fFloatValue2 = ((Float) obj2).floatValue();
                atz atzVar2 = s730.Q1;
                float measuredHeight = s730Var.G0().f.getMeasuredHeight() / 2.0f;
                int measuredWidth = s730Var.G0().f.getMeasuredWidth() / 2;
                float measuredHeight2 = s730Var.G0().b.getMeasuredHeight() - measuredHeight;
                float measuredWidth2 = fFloatValue - (s730Var.G0().f.getMeasuredWidth() * 1.5f);
                if (measuredWidth2 < 0.0f) {
                    s730Var.G0().f.setX(fFloatValue + measuredWidth);
                } else {
                    s730Var.G0().f.setX(measuredWidth2);
                }
                if (fFloatValue2 > measuredHeight2) {
                    s730Var.G0().f.setY(measuredHeight2 - measuredHeight);
                } else if (fFloatValue2 < measuredHeight) {
                    s730Var.G0().f.setY(0.0f);
                } else {
                    s730Var.G0().f.setY(fFloatValue2 - measuredHeight);
                }
                break;
        }
        return Unit.f46060a;
    }
}
