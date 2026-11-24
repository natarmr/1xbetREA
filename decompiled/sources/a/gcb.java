package a;

import android.view.View;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit_sport.sport_cell.DsSportCell;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gcb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11051a;
    public final /* synthetic */ r4b0 b;

    public /* synthetic */ gcb(r4b0 r4b0Var, byte b) {
        this.f11051a = b;
        this.b = r4b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11051a;
        final r4b0 r4b0Var = this.b;
        switch (b) {
            case 0:
                final cp cpVar = (cp) obj;
                cpVar.getClass();
                o7b0 o7b0Var = (o7b0) cpVar.u;
                DsSportCell dsSportCell = o7b0Var.f24779a;
                dsSportCell.getClass();
                final byte b2 = 0;
                dyb.c0(dsSportCell, new Function1() { // from class: a.hcb
                    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
                    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
                    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
                    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[LOOP:3: B:32:0x00b1->B:34:0x00ba, LOOP_END] */
                    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
                    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
                    /* JADX WARN: Code duplicated, block: B:55:0x00f7 A[SYNTHETIC] */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v9 java.lang.Object, still in use, count: 2, list:
                          (r2v9 java.lang.Object) from 0x0075: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v9 java.lang.Object) binds: [B:24:0x0074, B:53:0x0075] A[DONT_GENERATE, DONT_INLINE]
                          (r2v9 java.lang.Object) from 0x006a: CHECK_CAST (a.lok0) (r2v9 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                        */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 272
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: a.hcb.invoke(java.lang.Object):java.lang.Object");
                    }
                });
                o7b0Var.d.setAccordionClickListener(new View.OnClickListener() { // from class: a.icb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        cp cpVar2 = cpVar;
                        r4b0 r4b0Var2 = r4b0Var;
                        switch (b3) {
                            case 0:
                                r4b0Var2.x(((fcb) cpVar2.u()).f9303a);
                                break;
                            default:
                                zgb zgbVar = (zgb) cpVar2.u();
                                i1w0 i1w0Var = r4b0Var2.c;
                                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new qw80(r4b0Var2, zgbVar, (byte) 26))), i1w0Var, copyOnWriteArrayListQ, 0);
                                while (true) {
                                    paw pawVar = (paw) listIteratorP;
                                    if (pawVar.hasNext()) {
                                        i1w0Var.a((oe50) pawVar.next());
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                cpVar.t(new ok(cpVar, cpVar, (byte) 8));
                break;
            case 1:
                final cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                z3b0 z3b0Var = (z3b0) cpVar2.u;
                final byte b3 = 1;
                z3b0Var.d.setActionIconClickListener(new View.OnClickListener() { // from class: a.icb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b4 = b3;
                        cp cpVar3 = cpVar2;
                        r4b0 r4b0Var2 = r4b0Var;
                        switch (b4) {
                            case 0:
                                r4b0Var2.x(((fcb) cpVar3.u()).f9303a);
                                break;
                            default:
                                zgb zgbVar = (zgb) cpVar3.u();
                                i1w0 i1w0Var = r4b0Var2.c;
                                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new qw80(r4b0Var2, zgbVar, (byte) 26))), i1w0Var, copyOnWriteArrayListQ, 0);
                                while (true) {
                                    paw pawVar = (paw) listIteratorP;
                                    if (pawVar.hasNext()) {
                                        i1w0Var.a((oe50) pawVar.next());
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                DsSportCell dsSportCell2 = z3b0Var.f43711a;
                dsSportCell2.getClass();
                dyb.c0(dsSportCell2, new Function1() { // from class: a.hcb
                    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
                    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
                    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
                    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[LOOP:3: B:32:0x00b1->B:34:0x00ba, LOOP_END] */
                    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
                    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
                    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
                    /* JADX WARN: Code duplicated, block: B:55:0x00f7 A[SYNTHETIC] */
                    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v9 java.lang.Object, still in use, count: 2, list:
                          (r2v9 java.lang.Object) from 0x0075: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v9 java.lang.Object) binds: [B:24:0x0074, B:53:0x0075] A[DONT_GENERATE, DONT_INLINE]
                          (r2v9 java.lang.Object) from 0x006a: CHECK_CAST (a.lok0) (r2v9 java.lang.Object)
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                        */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            Method dump skipped, instruction units count: 272
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: a.hcb.invoke(java.lang.Object):java.lang.Object");
                    }
                });
                cpVar2.t(new ok(cpVar2, cpVar2, (byte) 9));
                break;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                r4b0Var.f.f(th, new gcb(r4b0Var, (byte) 3));
                break;
            default:
                qjj.W(jiu0.a(r4b0Var), r4b0Var.n.c, null, new bh0(r4b0Var, ((Integer) obj).intValue(), null, (byte) 21), 2);
                break;
        }
        return Unit.f46060a;
    }
}
