package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xb4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40582a;
    public final /* synthetic */ String b;
    public final /* synthetic */ kc4 c;

    public /* synthetic */ xb4(String str, kc4 kc4Var, byte b) {
        this.f40582a = b;
        this.b = str;
        this.c = kc4Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x0171  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        List list;
        List list2;
        List list3;
        byte b = this.f40582a;
        kc4 kc4Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                oyg0 oyg0Var = (oyg0) obj;
                mb4 mb4Var = (mb4) obj2;
                oyg0Var.getClass();
                mb4Var.getClass();
                String string = str.toString();
                q7x.F(oyg0Var, string, "KEY_LOGIN");
                gd4 gd4VarA = gd4.a(string);
                if (((mb4) kc4Var.D()).e.f11089a.length() == 0) {
                    list = ((mb4) kc4Var.D()).j;
                } else {
                    List list4 = ((mb4) kc4Var.D()).j;
                    gh4 gh4Var = gh4.f11281a;
                    if (list4.contains(gh4Var)) {
                        List list5 = ((mb4) kc4Var.D()).j;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list5) {
                            if (!Intrinsics.d((lh4) obj3, gh4Var)) {
                                arrayList.add(obj3);
                            }
                        }
                        list = arrayList;
                    } else {
                        list = ((mb4) kc4Var.D()).j;
                    }
                }
                return mb4.a(mb4Var, false, false, false, gd4VarA, null, null, 0, false, list, null, false, 15855);
            case 1:
                oyg0 oyg0Var2 = (oyg0) obj;
                mb4 mb4Var2 = (mb4) obj2;
                oyg0Var2.getClass();
                mb4Var2.getClass();
                id4 id4Var = mb4Var2.g;
                q7x.F(oyg0Var2, str, "KEY_PHONE");
                id4 id4VarA = id4.a(id4Var.d, str, id4Var.b, id4Var.c, id4Var.e);
                if (((mb4) kc4Var.D()).g.f14564a.length() == 0) {
                    list2 = ((mb4) kc4Var.D()).j;
                } else {
                    List list6 = ((mb4) kc4Var.D()).j;
                    ih4 ih4Var = ih4.f14763a;
                    boolean zContains = list6.contains(ih4Var);
                    kh4 kh4Var = kh4.f18271a;
                    if (zContains || ((mb4) kc4Var.D()).j.contains(kh4Var)) {
                        List list7 = ((mb4) kc4Var.D()).j;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : list7) {
                            lh4 lh4Var = (lh4) obj4;
                            if (!Intrinsics.d(lh4Var, ih4Var) && !Intrinsics.d(lh4Var, kh4Var)) {
                                arrayList2.add(obj4);
                            }
                        }
                        list2 = arrayList2;
                    } else {
                        list2 = ((mb4) kc4Var.D()).j;
                    }
                }
                return mb4.a(mb4Var2, false, false, false, null, null, id4VarA, 0, false, list2, null, false, 15807);
            default:
                oyg0 oyg0Var3 = (oyg0) obj;
                mb4 mb4Var3 = (mb4) obj2;
                oyg0Var3.getClass();
                mb4Var3.getClass();
                boolean z = false;
                if (mb4Var3.n && str.length() != 0) {
                    z = true;
                }
                boolean z2 = z;
                q7x.F(oyg0Var3, Boolean.valueOf(z2), "KEY_PASSWORD_RECOVER");
                String string2 = str.toString();
                q7x.F(oyg0Var3, string2, "KEY_PASSWORD");
                hd4 hd4VarA = hd4.a(string2);
                if (((mb4) kc4Var.D()).f.f12852a.length() == 0) {
                    list3 = ((mb4) kc4Var.D()).j;
                } else {
                    List list8 = ((mb4) kc4Var.D()).j;
                    hh4 hh4Var = hh4.f13044a;
                    if (list8.contains(hh4Var)) {
                        List list9 = ((mb4) kc4Var.D()).j;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list9) {
                            if (!Intrinsics.d((lh4) obj5, hh4Var)) {
                                arrayList3.add(obj5);
                            }
                        }
                        list3 = arrayList3;
                    } else {
                        list3 = ((mb4) kc4Var.D()).j;
                    }
                }
                return mb4.a(mb4Var3, false, false, false, null, hd4VarA, null, 0, false, list3, null, z2, 7647);
        }
    }
}
