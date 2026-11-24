package org.xplatform.consultantchat.presentation.workers;

import a.af3;
import a.b1j;
import a.g45;
import a.iu;
import a.jcl;
import a.jf4;
import a.o5d0;
import a.wcl;
import a.ze3;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lorg/xplatform/consultantchat/presentation/workers/DownloadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a/obc", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DownloadWorker extends CoroutineWorker {
    public final jcl g;
    public final iu h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        Context context2 = this.f25193a;
        context2.getClass();
        ComponentCallbacks2 componentCallbacks2 = (Application) context2;
        af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wcl.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wcl wclVar = (wcl) (ze3Var instanceof wcl ? ze3Var : null);
            if (wclVar != null) {
                g45 g45Var = wclVar.f38929a;
                this.g = new jcl(g45Var);
                this.h = new iu(g45Var);
                return;
            }
        }
        jf4.n(b1j.i(wcl.class, "Cannot create dependency "));
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:67|147|68|69|138|70|71|153|72|145|73|74|(2:76|159)) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:149|65|(13:67|147|68|69|138|70|71|153|72|145|73|74|(2:76|159))(3:93|94|95)) */
    /* JADX WARN: Code duplicated, block: B:100:0x0224 A[Catch: all -> 0x006d, TryCatch #11 {all -> 0x006d, blocks: (B:14:0x004d, B:98:0x0220, B:100:0x0224, B:103:0x0236, B:107:0x023e, B:109:0x0242), top: B:155:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0234 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0286  */
    /* JADX WARN: Code duplicated, block: B:119:0x0296  */
    /* JADX WARN: Code duplicated, block: B:121:0x029a A[Catch: all -> 0x02a5, TRY_ENTER, TryCatch #4 {all -> 0x02a5, blocks: (B:78:0x01e5, B:121:0x029a, B:122:0x02a1, B:123:0x02a2), top: B:144:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x02a2 A[Catch: all -> 0x02a5, TRY_LEAVE, TryCatch #4 {all -> 0x02a5, blocks: (B:78:0x01e5, B:121:0x029a, B:122:0x02a1, B:123:0x02a2), top: B:144:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x020c  */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0239, code lost:
    
        if (r7 < r1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x023b, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023d, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x023e, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0240, code lost:
    
        if (r8 != 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0242, code lost:
    
        r5.i = null;
        r5.j = null;
        r5.k = null;
        r5.l = r0;
        r5.m = r4;
        r5.n = r3;
        r5.o = r6;
        r5.p = r13;
        r5.q = r11;
        r5.r = r14;
        r5.s = r1;
        r9 = r18;
        r5.t = r9;
        r5.u = r7;
        r5.v = r8;
        r18 = r1;
        r5.y = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x026a, code lost:
    
        r1 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x026c, code lost:
    
        if (a.qcc.P(r9, r6) == r1) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x026f, code lost:
    
        r2 = r0;
        r0 = r8;
        r1 = r1;
        r3 = r3;
        r4 = r4;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027a, code lost:
    
        r9 = r18;
        r18 = r1;
        r2 = r0;
        r1 = r3;
        r0 = r8;
        r3 = r20;
        r13 = r21;
        r4 = r4;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f8, code lost:
    
        r2 = r20;
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fc, code lost:
    
        r3 = r3;
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01fe, code lost:
    
        r8 = r0;
        r3 = r3;
        r4 = r4;
        r5 = r5;
        r20 = r20;
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0200, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0201, code lost:
    
        r18 = r1;
        r3 = r3;
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0203, code lost:
    
        r3 = r3;
        r21 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0207, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0208, code lost:
    
        r3 = r1;
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0219, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x021a, code lost:
    
        r21 = r2;
        r2 = r3;
        r3 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:136:0x0146, B:45:0x014c], limit reached: 160 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r0v26, types: [a.g45] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v42, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [org.xplatform.consultantchat.presentation.workers.DownloadWorker] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r1v31, types: [a.i050, a.k050] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v23 */
    /* JADX WARN: Type inference failed for: r21v24 */
    /* JADX WARN: Type inference failed for: r21v25 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [a.w1x] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.vcl, a.yje] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r3v0, types: [a.wne, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3, types: [org.xplatform.consultantchat.presentation.workers.DownloadWorker] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.rcl] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.rcl] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.vcl] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.vcl, a.zje] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.vcl, a.yje] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.vcl] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:113:0x026f -> B:114:0x0271). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x027a -> B:115:0x0276). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0288 -> B:115:0x0276). Please report as a decompilation issue!!! */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a.yje r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xplatform.consultantchat.presentation.workers.DownloadWorker.c(a.yje):java.lang.Object");
    }
}
