package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class jfr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ofr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jfr0(ofr0 ofr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ofr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ofr0 ofr0Var = this.k;
        switch (b) {
            case 0:
                jfr0 jfr0Var = new jfr0(ofr0Var, yjeVar, (byte) 0);
                jfr0Var.j = obj;
                return jfr0Var;
            case 1:
                jfr0 jfr0Var2 = new jfr0(ofr0Var, yjeVar, (byte) 1);
                jfr0Var2.j = obj;
                return jfr0Var2;
            case 2:
                jfr0 jfr0Var3 = new jfr0(ofr0Var, yjeVar, (byte) 2);
                jfr0Var3.j = obj;
                return jfr0Var3;
            case 3:
                jfr0 jfr0Var4 = new jfr0(ofr0Var, yjeVar, (byte) 3);
                jfr0Var4.j = obj;
                return jfr0Var4;
            default:
                jfr0 jfr0Var5 = new jfr0(ofr0Var, yjeVar, (byte) 4);
                jfr0Var5.j = obj;
                return jfr0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jfr0) create((dip) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((jfr0) create((dip) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((jfr0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((jfr0) create((dip) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jfr0) create((dip) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        o0r0 o0r0Var;
        o0r0 o0r0Var2;
        p0r0 p0r0Var;
        p0r0 p0r0Var2;
        w0r0 w0r0Var;
        w0r0 w0r0Var2;
        x0r0 x0r0Var;
        x0r0 x0r0Var2;
        byte b = this.i;
        c1r0 c1r0Var = c1r0.f3588a;
        b1r0 b1r0Var = b1r0.f1823a;
        ofr0 ofr0Var = this.k;
        f1r0 f1r0Var = f1r0.f8780a;
        g1r0 g1r0Var = g1r0.f10530a;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                dip dipVar = (dip) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (dipVar != null) {
                    if (dipVar instanceof zhp) {
                        o0r0Var2 = new o0r0(b1r0Var, iun.f15405a);
                    } else {
                        if (dipVar instanceof aip) {
                            List list = ((aip) dipVar).b;
                            if (list == null) {
                                list = iun.f15405a;
                            }
                            o0r0Var = new o0r0(c1r0Var, list);
                        } else if (dipVar instanceof cip) {
                            o0r0Var2 = new o0r0(g1r0Var, iun.f15405a);
                        } else if (dipVar instanceof bip) {
                            o0r0Var = new o0r0(f1r0Var, ((bip) dipVar).f2667a);
                        }
                        o0r0Var2 = o0r0Var;
                    }
                    int i = ofr0.U0;
                    ofr0Var.V(o0r0Var2);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 1:
                dip dipVar2 = (dip) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (dipVar2 != null) {
                    if (dipVar2 instanceof zhp) {
                        p0r0Var2 = new p0r0(b1r0Var, iun.f15405a);
                    } else {
                        if (dipVar2 instanceof aip) {
                            List list2 = ((aip) dipVar2).b;
                            if (list2 == null) {
                                list2 = iun.f15405a;
                            }
                            p0r0Var = new p0r0(c1r0Var, list2);
                        } else if (dipVar2 instanceof cip) {
                            p0r0Var2 = new p0r0(g1r0Var, iun.f15405a);
                        } else if (dipVar2 instanceof bip) {
                            p0r0Var = new p0r0(f1r0Var, ((bip) dipVar2).f2667a);
                        }
                        p0r0Var2 = p0r0Var;
                    }
                    int i2 = ofr0.U0;
                    ofr0Var.V(p0r0Var2);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 2:
                List list3 = (List) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                v0r0 v0r0Var = !list3.isEmpty() ? new v0r0(f1r0Var, list3) : new v0r0(g1r0Var, iun.f15405a);
                int i3 = ofr0.U0;
                ofr0Var.V(v0r0Var);
                return Unit.f46060a;
            case 3:
                dip dipVar3 = (dip) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (dipVar3 != null) {
                    if (dipVar3 instanceof zhp) {
                        w0r0Var2 = new w0r0(b1r0Var, iun.f15405a);
                    } else {
                        if (dipVar3 instanceof aip) {
                            List list4 = ((aip) dipVar3).b;
                            if (list4 == null) {
                                list4 = iun.f15405a;
                            }
                            w0r0Var = new w0r0(c1r0Var, list4);
                        } else if (dipVar3 instanceof cip) {
                            w0r0Var2 = new w0r0(g1r0Var, iun.f15405a);
                        } else if (dipVar3 instanceof bip) {
                            w0r0Var = new w0r0(f1r0Var, ((bip) dipVar3).f2667a);
                        }
                        w0r0Var2 = w0r0Var;
                    }
                    int i4 = ofr0.U0;
                    ofr0Var.V(w0r0Var2);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                dip dipVar4 = (dip) obj2;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (dipVar4 != null) {
                    if (dipVar4 instanceof zhp) {
                        x0r0Var2 = new x0r0(b1r0Var, iun.f15405a);
                    } else {
                        if (dipVar4 instanceof aip) {
                            List list5 = ((aip) dipVar4).b;
                            if (list5 == null) {
                                list5 = iun.f15405a;
                            }
                            x0r0Var = new x0r0(c1r0Var, list5);
                        } else if (dipVar4 instanceof cip) {
                            x0r0Var2 = new x0r0(g1r0Var, iun.f15405a);
                        } else if (dipVar4 instanceof bip) {
                            x0r0Var = new x0r0(f1r0Var, ((bip) dipVar4).f2667a);
                        }
                        x0r0Var2 = x0r0Var;
                    }
                    int i5 = ofr0.U0;
                    ofr0Var.V(x0r0Var2);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
