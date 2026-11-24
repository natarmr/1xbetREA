package a;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class pgo0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26962a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ r040 c;

    public /* synthetic */ pgo0(kmq kmqVar, r040 r040Var, byte b) {
        this.f26962a = b;
        this.b = kmqVar;
        this.c = r040Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        ogo0 ogo0Var;
        sgo0 sgo0Var;
        gio0 gio0Var;
        byte b = this.f26962a;
        r040 r040Var = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof ogo0) {
                    ogo0Var = (ogo0) yjeVar;
                    int i = ogo0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ogo0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        ogo0Var = new ogo0(this, yjeVar);
                    }
                } else {
                    ogo0Var = new ogo0(this, yjeVar);
                }
                Object obj2 = ogo0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = ogo0Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue() && r040Var == r040.OTHER);
                    ogo0Var.j = 1;
                    if (kmqVar.a(boolValueOf, ogo0Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof sgo0) {
                    sgo0Var = (sgo0) yjeVar;
                    int i3 = sgo0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        sgo0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        sgo0Var = new sgo0(this, yjeVar);
                    }
                } else {
                    sgo0Var = new sgo0(this, yjeVar);
                }
                Object obj3 = sgo0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = sgo0Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    Object obj4 = ((Map) obj).get(r040Var);
                    if (obj4 != null) {
                        sgo0Var.j = 1;
                        if (kmqVar.a(obj4, sgo0Var) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof gio0) {
                    gio0Var = (gio0) yjeVar;
                    int i5 = gio0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        gio0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        gio0Var = new gio0(this, yjeVar);
                    }
                } else {
                    gio0Var = new gio0(this, yjeVar);
                }
                Object obj5 = gio0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = gio0Var.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    Object obj6 = ((Map) obj).get(r040Var);
                    if (obj6 != null) {
                        gio0Var.j = 1;
                        if (kmqVar.a(obj6, gio0Var) == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
        }
    }
}
