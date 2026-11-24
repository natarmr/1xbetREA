package a;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vzp implements avc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f38308a;
    public final mhi0 b;
    public final mlx c;
    public final xi9 d;
    public final AtomicBoolean e;
    public final k050 f;

    public vzp(File file, mhi0 mhi0Var, mlx mlxVar, xi9 xi9Var) {
        mhi0Var.getClass();
        mlxVar.getClass();
        this.f38308a = file;
        this.b = mhi0Var;
        this.c = mlxVar;
        this.d = xi9Var;
        this.e = new AtomicBoolean(false);
        this.f = new k050();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0071 A[Catch: all -> 0x0072, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:33:0x0071, B:42:0x0082, B:41:0x007f, B:38:0x007a), top: B:49:0x0022, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.vzp] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.y0g] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [boolean] */
    public final Object a(y0g y0gVar, zje zjeVar) throws Throwable {
        tzp tzpVar;
        ?? G;
        Throwable th;
        nzp nzpVar;
        ?? r7;
        if (zjeVar instanceof tzp) {
            tzpVar = (tzp) zjeVar;
            int i = tzpVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tzpVar.m = i - Integer.MIN_VALUE;
            } else {
                tzpVar = new tzp(this, zjeVar);
            }
        } else {
            tzpVar = new tzp(this, zjeVar);
        }
        Object obj = tzpVar.k;
        wne wneVar = wne.f39444a;
        int i2 = tzpVar.m;
        k050 k050Var = this.f;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = tzpVar.i;
                nzpVar = tzpVar.j;
                try {
                    z1x.P(obj);
                    r7 = this;
                    try {
                        nzpVar.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r7 != 0) {
                        k050Var.c(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        nzpVar.close();
                    } catch (Throwable th4) {
                        tjo.a(th, th4);
                    }
                    throw th;
                }
            }
            z1x.P(obj);
            if (this.e.get()) {
                jf4.n("StorageConnection has already been disposed.");
                return null;
            }
            G = k050Var.g();
            try {
                nzp nzpVar2 = new nzp(this.f38308a, this.b);
                try {
                    Boolean boolValueOf = Boolean.valueOf((boolean) G);
                    tzpVar.j = nzpVar2;
                    tzpVar.i = G;
                    tzpVar.m = 1;
                    Object objF = y0gVar.F(nzpVar2, boolValueOf, tzpVar);
                    if (objF == wneVar) {
                        return wneVar;
                    }
                    obj = objF;
                    r7 = G == true ? 1 : 0;
                    nzpVar = nzpVar2;
                    nzpVar.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r7 != 0) {
                        k050Var.c(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    this = G == true ? 1 : 0;
                    nzpVar = nzpVar2;
                    nzpVar.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (G != 0) {
                    k050Var.c(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            G = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c3 A[Catch: all -> 0x00fa, IOException -> 0x00fd, TRY_ENTER, TryCatch #8 {IOException -> 0x00fd, all -> 0x00fa, blocks: (B:42:0x00c3, B:44:0x00c9, B:46:0x00cf, B:50:0x00db, B:51:0x00f9, B:47:0x00d4, B:58:0x0107, B:65:0x0115, B:64:0x0112, B:61:0x010d), top: B:89:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c9 A[Catch: all -> 0x00fa, IOException -> 0x00fd, TryCatch #8 {IOException -> 0x00fd, all -> 0x00fa, blocks: (B:42:0x00c3, B:44:0x00c9, B:46:0x00cf, B:50:0x00db, B:51:0x00f9, B:47:0x00d4, B:58:0x0107, B:65:0x0115, B:64:0x0112, B:61:0x010d), top: B:89:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[Catch: all -> 0x00fa, IOException -> 0x00fd, TryCatch #8 {IOException -> 0x00fd, all -> 0x00fa, blocks: (B:42:0x00c3, B:44:0x00c9, B:46:0x00cf, B:50:0x00db, B:51:0x00f9, B:47:0x00d4, B:58:0x0107, B:65:0x0115, B:64:0x0112, B:61:0x010d), top: B:89:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4 A[Catch: all -> 0x00fa, IOException -> 0x00fd, TryCatch #8 {IOException -> 0x00fd, all -> 0x00fa, blocks: (B:42:0x00c3, B:44:0x00c9, B:46:0x00cf, B:50:0x00db, B:51:0x00f9, B:47:0x00d4, B:58:0x0107, B:65:0x0115, B:64:0x0112, B:61:0x010d), top: B:89:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00da  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db A[Catch: all -> 0x00fa, IOException -> 0x00fd, TryCatch #8 {IOException -> 0x00fd, all -> 0x00fa, blocks: (B:42:0x00c3, B:44:0x00c9, B:46:0x00cf, B:50:0x00db, B:51:0x00f9, B:47:0x00d4, B:58:0x0107, B:65:0x0115, B:64:0x0112, B:61:0x010d), top: B:89:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0107 A[Catch: all -> 0x00fa, IOException -> 0x00fd, TRY_ENTER, TRY_LEAVE, TryCatch #8 {IOException -> 0x00fd, all -> 0x00fa, blocks: (B:42:0x00c3, B:44:0x00c9, B:46:0x00cf, B:50:0x00db, B:51:0x00f9, B:47:0x00d4, B:58:0x0107, B:65:0x0115, B:64:0x0112, B:61:0x010d), top: B:89:0x0025, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x011f A[Catch: all -> 0x0116, TryCatch #3 {all -> 0x0116, blocks: (B:69:0x0119, B:71:0x011f, B:72:0x0122, B:32:0x0085, B:33:0x009f), top: B:83:0x0085 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00db, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [a.mcj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11, types: [a.k050, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v10, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.uzp, a.yje, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.File, java.lang.Object] */
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
    public final Object b(mcj mcjVar, zje zjeVar) throws Throwable {
        ?? uzpVar;
        ?? r11;
        ?? file;
        ?? r10;
        g0q g0qVar;
        Throwable th;
        g0q g0qVar2;
        ?? r1;
        ?? r12;
        boolean zRenameTo;
        if (zjeVar instanceof uzp) {
            uzp uzpVar2 = (uzp) zjeVar;
            int i = uzpVar2.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                uzpVar2.n = i - Integer.MIN_VALUE;
                uzpVar = uzpVar2;
            } else {
                uzpVar = new uzp(this, zjeVar);
            }
        } else {
            uzpVar = new uzp(this, zjeVar);
        }
        Object obj = uzpVar.l;
        wne wneVar = wne.f39444a;
        int i2 = uzpVar.n;
        File file2 = this.f38308a;
        try {
            try {
                try {
                    try {
                        if (i2 == 0) {
                            z1x.P(obj);
                            if (this.e.get()) {
                                jf4.n("StorageConnection has already been disposed.");
                                return null;
                            }
                            File parentFile = file2.getCanonicalFile().getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                                if (!parentFile.isDirectory()) {
                                    itt0.j(file2, "Unable to create parent directories of ");
                                    return null;
                                }
                            }
                            uzpVar.i = mcjVar;
                            ?? r13 = this.f;
                            uzpVar.j = r13;
                            uzpVar.n = 1;
                            Object objD = r13.d(uzpVar);
                            r10 = mcjVar;
                            r11 = r13;
                            if (objD != wneVar) {
                            }
                            return wneVar;
                        }
                        if (i2 != 1) {
                            if (i2 != 2) {
                                jf4.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g0qVar2 = uzpVar.k;
                            mcjVar = (File) uzpVar.j;
                            uzpVar = (i050) uzpVar.i;
                            try {
                                z1x.P(obj);
                                r1 = uzpVar;
                                r12 = mcjVar;
                                try {
                                    g0qVar2.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (r12.exists()) {
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = ga3.n(r12, file2);
                                    } else {
                                        zRenameTo = r12.renameTo(file2);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + r12 + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                r1.c(null);
                                return Unit.f46060a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    g0qVar2.close();
                                } catch (Throwable th4) {
                                    tjo.a(th, th4);
                                }
                                throw th;
                            }
                        }
                        i050 i050Var = (i050) uzpVar.j;
                        Function2 function2 = (Function2) uzpVar.i;
                        z1x.P(obj);
                        r11 = i050Var;
                        r10 = function2;
                        uzpVar.i = r11;
                        uzpVar.j = file;
                        uzpVar.k = g0qVar;
                        uzpVar.n = 2;
                        if (r10.invoke(g0qVar, uzpVar) != wneVar) {
                            r1 = r11;
                            r12 = file;
                            g0qVar2 = g0qVar;
                            g0qVar2.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (r12.exists()) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    zRenameTo = ga3.n(r12, file2);
                                } else {
                                    zRenameTo = r12.renameTo(file2);
                                }
                                if (zRenameTo) {
                                    throw new IOException("Unable to rename " + r12 + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                            }
                            r1.c(null);
                            return Unit.f46060a;
                        }
                        return wneVar;
                    } catch (Throwable th5) {
                        uzpVar = r11;
                        mcjVar = file;
                        th = th5;
                        g0qVar2 = g0qVar;
                        g0qVar2.close();
                        throw th;
                    }
                    mhi0 mhi0Var = this.b;
                    mhi0Var.getClass();
                    g0qVar = new g0q(file, mhi0Var);
                } catch (IOException e) {
                    e = e;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(file2.getAbsolutePath() + ".tmp");
            } catch (Throwable th6) {
                th = th6;
                r11.c(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            file = mcjVar;
            r11 = uzpVar;
            if (file.exists()) {
                file.delete();
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            r11 = uzpVar;
            r11.c(null);
            throw th;
        }
    }

    @Override // a.avc
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
