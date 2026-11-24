package a;

import android.javax.sip.message.Request;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.impl.navigation.PhoneScreenFactoryImpl$getConfirmPhoneNumberBySmsScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hka implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13197a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;

    public /* synthetic */ hka(int i, ArrayList arrayList, boolean z) {
        this.f13197a = (byte) 4;
        this.c = arrayList;
        this.b = z;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f13197a;
        boolean z = this.b;
        int i = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                if (z) {
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i2 = size - 1;
                            pu90 pu90Var = (pu90) arrayList.get(size);
                            Object objN = pu90Var.n();
                            p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                            Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                            if (Intrinsics.d(objG0, Request.INFO)) {
                                ou90Var.g(pu90Var, i - pu90Var.f27604a, 0, 0.0f);
                            } else if (Intrinsics.d(objG0, "SCORE")) {
                                ou90Var.g(pu90Var, 0, 0, 0.0f);
                            }
                            if (i2 >= 0) {
                                size = i2;
                            }
                        }
                    }
                } else {
                    int size2 = arrayList.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i3 = size2 - 1;
                            pu90 pu90Var2 = (pu90) arrayList.get(size2);
                            Object objN2 = pu90Var2.n();
                            p6z p6zVar2 = objN2 instanceof p6z ? (p6z) objN2 : null;
                            Object objG1 = p6zVar2 != null ? p6zVar2.g0() : null;
                            if (Intrinsics.d(objG1, Request.INFO)) {
                                ou90Var.g(pu90Var2, 0, 0, 0.0f);
                            } else if (Intrinsics.d(objG1, "SCORE")) {
                                ou90Var.g(pu90Var2, i - pu90Var2.f27604a, 0, 0.0f);
                            }
                            if (i3 >= 0) {
                                size2 = i3;
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                if (z) {
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i4 = size3 - 1;
                            pu90 pu90Var3 = (pu90) arrayList2.get(size3);
                            Object objN3 = pu90Var3.n();
                            p6z p6zVar3 = objN3 instanceof p6z ? (p6z) objN3 : null;
                            Object objG2 = p6zVar3 != null ? p6zVar3.g0() : null;
                            if (Intrinsics.d(objG2, Request.INFO)) {
                                ou90Var2.g(pu90Var3, i - pu90Var3.f27604a, 0, 0.0f);
                            } else if (Intrinsics.d(objG2, "SCORE")) {
                                ou90Var2.g(pu90Var3, 0, 0, 0.0f);
                            }
                            if (i4 >= 0) {
                                size3 = i4;
                            }
                        }
                    }
                } else {
                    int size4 = arrayList2.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i5 = size4 - 1;
                            pu90 pu90Var4 = (pu90) arrayList2.get(size4);
                            Object objN4 = pu90Var4.n();
                            p6z p6zVar4 = objN4 instanceof p6z ? (p6z) objN4 : null;
                            Object objG3 = p6zVar4 != null ? p6zVar4.g0() : null;
                            if (Intrinsics.d(objG3, Request.INFO)) {
                                ou90Var2.g(pu90Var4, 0, 0, 0.0f);
                            } else if (Intrinsics.d(objG3, "SCORE")) {
                                ou90Var2.g(pu90Var4, i - pu90Var4.f27604a, 0, 0.0f);
                            }
                            if (i5 >= 0) {
                                size4 = i5;
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj2;
                ou90 ou90Var3 = (ou90) obj;
                ou90Var3.getClass();
                if (z) {
                    int size5 = arrayList3.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i6 = size5 - 1;
                            pu90 pu90Var5 = (pu90) arrayList3.get(size5);
                            Object objN5 = pu90Var5.n();
                            p6z p6zVar5 = objN5 instanceof p6z ? (p6z) objN5 : null;
                            Object objG4 = p6zVar5 != null ? p6zVar5.g0() : null;
                            if (Intrinsics.d(objG4, Request.INFO)) {
                                ou90Var3.g(pu90Var5, i - pu90Var5.f27604a, 0, 0.0f);
                            } else if (Intrinsics.d(objG4, "SCORE")) {
                                ou90Var3.g(pu90Var5, 0, 0, 0.0f);
                            }
                            if (i6 >= 0) {
                                size5 = i6;
                            }
                        }
                    }
                } else {
                    int size6 = arrayList3.size() - 1;
                    if (size6 >= 0) {
                        while (true) {
                            int i7 = size6 - 1;
                            pu90 pu90Var6 = (pu90) arrayList3.get(size6);
                            Object objN6 = pu90Var6.n();
                            p6z p6zVar6 = objN6 instanceof p6z ? (p6z) objN6 : null;
                            Object objG5 = p6zVar6 != null ? p6zVar6.g0() : null;
                            if (Intrinsics.d(objG5, Request.INFO)) {
                                ou90Var3.g(pu90Var6, 0, 0, 0.0f);
                            } else if (Intrinsics.d(objG5, "SCORE")) {
                                ou90Var3.g(pu90Var6, i - pu90Var6.f27604a, 0, 0.0f);
                            }
                            if (i7 >= 0) {
                                size6 = i7;
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 3:
                ArrayList arrayList4 = (ArrayList) obj2;
                ou90 ou90Var4 = (ou90) obj;
                ou90Var4.getClass();
                if (z) {
                    int size7 = arrayList4.size() - 1;
                    if (size7 >= 0) {
                        while (true) {
                            int i8 = size7 - 1;
                            pu90 pu90Var7 = (pu90) arrayList4.get(size7);
                            Object objN7 = pu90Var7.n();
                            p6z p6zVar7 = objN7 instanceof p6z ? (p6z) objN7 : null;
                            Object objG6 = p6zVar7 != null ? p6zVar7.g0() : null;
                            if (Intrinsics.d(objG6, "SPORT_GAME_BOARD_INFO")) {
                                ou90Var4.g(pu90Var7, i - pu90Var7.f27604a, 0, 0.0f);
                            } else if (Intrinsics.d(objG6, "SPORT_GAME_BOARD_SCORE")) {
                                ou90Var4.g(pu90Var7, 0, 0, 0.0f);
                            }
                            if (i8 >= 0) {
                                size7 = i8;
                            }
                        }
                    }
                } else {
                    int size8 = arrayList4.size() - 1;
                    if (size8 >= 0) {
                        while (true) {
                            int i9 = size8 - 1;
                            pu90 pu90Var8 = (pu90) arrayList4.get(size8);
                            Object objN8 = pu90Var8.n();
                            p6z p6zVar8 = objN8 instanceof p6z ? (p6z) objN8 : null;
                            Object objG7 = p6zVar8 != null ? p6zVar8.g0() : null;
                            if (Intrinsics.d(objG7, "SPORT_GAME_BOARD_INFO")) {
                                ou90Var4.g(pu90Var8, 0, 0, 0.0f);
                            } else if (Intrinsics.d(objG7, "SPORT_GAME_BOARD_SCORE")) {
                                ou90Var4.g(pu90Var8, i - pu90Var8.f27604a, 0, 0.0f);
                            }
                            if (i9 >= 0) {
                                size8 = i9;
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 4:
                ArrayList arrayList5 = (ArrayList) obj2;
                ou90 ou90Var5 = (ou90) obj;
                ou90Var5.getClass();
                int i10 = 0;
                int i11 = 0;
                for (Object obj3 : arrayList5) {
                    int i12 = i10 + 1;
                    if (i10 < 0) {
                        q3d.p();
                        throw null;
                    }
                    pu90 pu90Var9 = (pu90) obj3;
                    if (z) {
                        ou90Var5.m(pu90Var9, i11, 0, 0.0f);
                    } else {
                        ou90Var5.g(pu90Var9, i11, 0, 0.0f);
                    }
                    i11 += pu90Var9.f27604a + (i10 != arrayList5.size() + (-1) ? i : 0);
                    i10 = i12;
                }
                return Unit.f46060a;
            default:
                v7c v7cVar = (v7c) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                qgd qgdVar = v7cVar.A;
                String phoneNumber = v7cVar.d.getPhoneNumber();
                qgdVar.getClass();
                phoneNumber.getClass();
                k0w0Var.k(new PhoneScreenFactoryImpl$getConfirmPhoneNumberBySmsScreen$1(z ? new q5c(phoneNumber, i) : new p5c(phoneNumber, i, false)));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ hka(v7c v7cVar, int i, boolean z) {
        this.f13197a = (byte) 5;
        this.c = v7cVar;
        this.d = i;
        this.b = z;
    }

    public /* synthetic */ hka(boolean z, ArrayList arrayList, int i, byte b) {
        this.f13197a = b;
        this.b = z;
        this.c = arrayList;
        this.d = i;
    }
}
