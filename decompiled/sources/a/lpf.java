package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lpf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f20438a = q3d.j("0%", "0", "-");

    /* JADX WARN: Code duplicated, block: B:100:0x0144  */
    /* JADX WARN: Code duplicated, block: B:102:0x0147  */
    /* JADX WARN: Code duplicated, block: B:103:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x015a  */
    /* JADX WARN: Code duplicated, block: B:110:0x015d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108  */
    /* JADX WARN: Code duplicated, block: B:88:0x0121  */
    public static final List a(gpf gpfVar) {
        Collection collection;
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int iIntValue;
        Integer num;
        int iIntValue2;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Boolean bool;
        boolean zBooleanValue3;
        Boolean bool2;
        boolean zBooleanValue4;
        long jLongValue;
        long jLongValue2;
        String str7;
        String str8;
        String str9;
        vjf vjfVar;
        vjf vjfVar2;
        vjf vjfVar3;
        Long l;
        vjf vjfVar4;
        Long l2;
        Integer num2;
        esf esfVar;
        esf esfVar2;
        ArrayList arrayList = new ArrayList();
        List list2 = gpfVar.b;
        List list3 = gpfVar.f11680a;
        if (list2 == null || (esfVar2 = (esf) CollectionsKt.firstOrNull(list2)) == null || (collection = esfVar2.f8324a) == null) {
            collection = iun.f15405a;
        }
        if (list2 == null || (esfVar = (esf) CollectionsKt.f0(list2)) == null || (list = esfVar.f8324a) == null) {
            list = iun.f15405a;
        }
        if (CollectionsKt.q0(collection, list).isEmpty()) {
            return iun.f15405a;
        }
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            String str10 = null;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            opf opfVar = (opf) obj;
            if (list.size() > i) {
                opf opfVar2 = (opf) list.get(i);
                String str11 = opfVar.b;
                Boolean bool3 = opfVar.d;
                Boolean bool4 = opfVar.e;
                Integer num3 = opfVar.c;
                List list4 = f20438a;
                if (CollectionsKt.L(list4, str11) && CollectionsKt.L(list4, opfVar2.b) && num3 != null && num3.intValue() == 0 && (num2 = opfVar2.c) != null && num2.intValue() == 0) {
                    Boolean bool5 = Boolean.FALSE;
                    if (!Intrinsics.d(bool4, bool5) || !Intrinsics.d(opfVar2.e, bool5) || !Intrinsics.d(bool3, bool5) || !Intrinsics.d(opfVar2.d, bool5)) {
                        str = opfVar.f25638a;
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        str3 = opfVar.b;
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        str5 = opfVar2.b;
                        if (str5 == null) {
                            str6 = "";
                        } else {
                            str6 = str5;
                        }
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        num = opfVar2.c;
                        if (num != null) {
                            iIntValue2 = num.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        if (bool4 != null) {
                            zBooleanValue = bool4.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        if (bool3 != null) {
                            zBooleanValue2 = bool3.booleanValue();
                        } else {
                            zBooleanValue2 = false;
                        }
                        bool = opfVar2.e;
                        if (bool != null) {
                            zBooleanValue3 = bool.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                        bool2 = opfVar2.d;
                        if (bool2 != null) {
                            zBooleanValue4 = bool2.booleanValue();
                        } else {
                            zBooleanValue4 = false;
                        }
                        jLongValue = -1;
                        if (list3 != null) {
                            jLongValue2 = -1;
                        } else {
                            jLongValue2 = -1;
                        }
                        if (list3 != null) {
                            jLongValue = l.longValue();
                        }
                        long j = jLongValue;
                        if (list3 != null) {
                            str7 = null;
                        } else {
                            str7 = null;
                        }
                        if (str7 == null) {
                            str8 = "";
                        } else {
                            str8 = str7;
                        }
                        if (list3 != null) {
                            str10 = vjfVar.b;
                        }
                        if (str10 == null) {
                            str9 = "";
                        } else {
                            str9 = str10;
                        }
                        arrayList.add(new jpf(str2, str4, str6, iIntValue, iIntValue2, zBooleanValue2, zBooleanValue4, zBooleanValue, zBooleanValue3, jLongValue2, j, str8, str9));
                    }
                } else {
                    str = opfVar.f25638a;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    str3 = opfVar.b;
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    str5 = opfVar2.b;
                    if (str5 == null) {
                        str6 = "";
                    } else {
                        str6 = str5;
                    }
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    num = opfVar2.c;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 0;
                    }
                    if (bool4 != null) {
                        zBooleanValue = bool4.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (bool3 != null) {
                        zBooleanValue2 = bool3.booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                    bool = opfVar2.e;
                    if (bool != null) {
                        zBooleanValue3 = bool.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                    bool2 = opfVar2.d;
                    if (bool2 != null) {
                        zBooleanValue4 = bool2.booleanValue();
                    } else {
                        zBooleanValue4 = false;
                    }
                    jLongValue = -1;
                    if (list3 != null || (vjfVar4 = (vjf) CollectionsKt.firstOrNull(list3)) == null || (l2 = vjfVar4.c) == null) {
                        jLongValue2 = -1;
                    } else {
                        jLongValue2 = l2.longValue();
                    }
                    if (list3 != null && (vjfVar3 = (vjf) CollectionsKt.f0(list3)) != null && (l = vjfVar3.c) != null) {
                        jLongValue = l.longValue();
                    }
                    long j2 = jLongValue;
                    if (list3 != null || (vjfVar2 = (vjf) CollectionsKt.firstOrNull(list3)) == null) {
                        str7 = null;
                    } else {
                        str7 = vjfVar2.b;
                    }
                    if (str7 == null) {
                        str8 = "";
                    } else {
                        str8 = str7;
                    }
                    if (list3 != null && (vjfVar = (vjf) CollectionsKt.f0(list3)) != null) {
                        str10 = vjfVar.b;
                    }
                    if (str10 == null) {
                        str9 = "";
                    } else {
                        str9 = str10;
                    }
                    arrayList.add(new jpf(str2, str4, str6, iIntValue, iIntValue2, zBooleanValue2, zBooleanValue4, zBooleanValue, zBooleanValue3, jLongValue2, j2, str8, str9));
                }
            }
            i = i2;
        }
        return arrayList;
    }
}
