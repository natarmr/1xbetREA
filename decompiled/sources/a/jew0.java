package a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class jew0 implements yfw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mew0 f16397a;

    static {
        bew0 bew0Var = bew0.b;
        int i = ldw0.f19874a;
    }

    public jew0(mew0 mew0Var) {
        this.f16397a = mew0Var;
    }

    public final mew0 a(InputStream inputStream, bew0 bew0Var) throws zew0 {
        tdw0 tdw0VarH = tdw0.h(inputStream, 4096);
        int i = mew0.zzd;
        mew0 mew0VarG = this.f16397a.g();
        try {
            egw0 egw0VarA = agw0.c.a(mew0VarG.getClass());
            hu5 hu5Var = (hu5) tdw0VarH.c;
            if (hu5Var == null) {
                hu5Var = new hu5(tdw0VarH);
            }
            egw0VarA.e(mew0VarG, hu5Var, bew0Var);
            egw0VarA.h(mew0VarG);
            tdw0VarH.r(0);
            if (mew0.o(mew0VarG, true)) {
                return mew0VarG;
            }
            throw new igw0().a();
        } catch (igw0 e) {
            throw e.a();
        } catch (zew0 e2) {
            if (e2.f44274a) {
                throw new zew0(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zew0) {
                throw ((zew0) e3.getCause());
            }
            throw new zew0(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zew0) {
                throw ((zew0) e4.getCause());
            }
            throw e4;
        }
    }
}
