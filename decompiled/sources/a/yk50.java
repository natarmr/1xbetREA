package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.preference.PreferenceManager;
import android.view.View;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class yk50 implements zf60 {
    public static final Object c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42772a;
    public Object b;

    public yk50(gii0 gii0Var, byte b) {
        this.f42772a = b;
        gii0Var.getClass();
        switch (b) {
            case 7:
                this.b = new zm(gii0Var, (byte) 9);
                break;
            case 9:
                this.b = new zm(gii0Var, (byte) 12);
                break;
            case 13:
                this.b = new zm(gii0Var, (byte) 18);
                break;
            case 18:
                this.b = new sza(gii0Var, (byte) 0);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.b = new sza(gii0Var, (byte) 4);
                break;
            default:
                this.b = new zm(gii0Var, (byte) 8);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(ArrayList arrayList, String str, String str2, zje zjeVar) {
        o2c o2cVar;
        String str3;
        if (zjeVar instanceof o2c) {
            o2cVar = (o2c) zjeVar;
            int i = o2cVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                o2cVar.k = i - Integer.MIN_VALUE;
            } else {
                o2cVar = new o2c(this, zjeVar);
            }
        } else {
            o2cVar = new o2c(this, zjeVar);
        }
        Object objA = o2cVar.i;
        wne wneVar = wne.f39444a;
        int i2 = o2cVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            ok50 ok50Var = (ok50) this.b;
            vwp0 vwp0Var = new vwp0(str, str2);
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rqp rqpVar = (rqp) it.next();
                pek pekVar = vqp.f37865a;
                vqp vqpVar = rqpVar.f30942a;
                pekVar.getClass();
                switch (vqpVar.ordinal()) {
                    case 0:
                        str3 = "UserId";
                        break;
                    case 1:
                        str3 = "Surname";
                        break;
                    case 2:
                        str3 = "Name";
                        break;
                    case 3:
                        str3 = "CountryId";
                        break;
                    case 4:
                        str3 = "RegionId";
                        break;
                    case 5:
                        str3 = "CityId";
                        break;
                    case 6:
                        str3 = "Birthday";
                        break;
                    case 7:
                        str3 = "Email";
                        break;
                    case 8:
                        str3 = "Phone";
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                String str4 = rqpVar.b;
                arrayList2.add(new w2c(str3, str4, str4.length() == 0));
            }
            a3c a3cVar = new a3c(new t2c(new z2c(arrayList2)), vwp0Var);
            o2cVar.k = 1;
            objA = ((n2c) ((sza) ok50Var.f25390a).invoke()).a(a3cVar, o2cVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return new swp0(((jd) ((q16) objA).a()).i, false);
    }

    public ob10 b(Context context, String str, InputStream inputStream, String str2, String str3) {
        ob10 ob10VarH;
        gzp gzpVar;
        ok50 ok50Var = (ok50) this.b;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            xv00.a();
            gzp gzpVar2 = gzp.ZIP;
            ob10VarH = str3 != null ? ka10.h(context, new ZipInputStream(new FileInputStream(ok50Var.o(str, inputStream, gzpVar2))), str) : ka10.h(context, new ZipInputStream(inputStream), null);
            gzpVar = gzpVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            xv00.a();
            gzpVar = gzp.GZIP;
            if (str3 != null) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(ok50Var.o(str, inputStream, gzpVar)));
                HashMap map = ka10.f17941a;
                ob10VarH = ka10.e(w9x.L(gZIPInputStream), str);
            } else {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                HashMap map2 = ka10.f17941a;
                ob10VarH = ka10.e(w9x.L(gZIPInputStream2), null);
            }
        } else {
            xv00.a();
            gzpVar = gzp.JSON;
            if (str3 != null) {
                FileInputStream fileInputStream = new FileInputStream(ok50Var.o(str, inputStream, gzpVar).getAbsolutePath());
                HashMap map3 = ka10.f17941a;
                ob10VarH = ka10.e(w9x.L(fileInputStream), str);
            } else {
                HashMap map4 = ka10.f17941a;
                ob10VarH = ka10.e(w9x.L(inputStream), null);
            }
        }
        if (str3 != null && ob10VarH.f24955a != null) {
            File file = new File(ok50Var.m(), ok50.f(str, gzpVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            xv00.a();
            if (!zRenameTo) {
                xv00.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + Separators.DOT);
            }
        }
        return ob10VarH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(int i, zje zjeVar, String str, String str2) {
        tza tzaVar;
        if (zjeVar instanceof tza) {
            tzaVar = (tza) zjeVar;
            int i2 = tzaVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tzaVar.k = i2 - Integer.MIN_VALUE;
            } else {
                tzaVar = new tza(this, zjeVar);
            }
        } else {
            tzaVar = new tza(this, zjeVar);
        }
        Object objC = tzaVar.i;
        wne wneVar = wne.f39444a;
        int i3 = tzaVar.k;
        if (i3 == 0) {
            z1x.P(objC);
            n0b n0bVar = (n0b) ((sza) this.b).invoke();
            tzaVar.k = 1;
            objC = n0bVar.c(str, str2, i, tzaVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return ((dx5) objC).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(int i, zje zjeVar, String str) {
        uza uzaVar;
        if (zjeVar instanceof uza) {
            uzaVar = (uza) zjeVar;
            int i2 = uzaVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uzaVar.k = i2 - Integer.MIN_VALUE;
            } else {
                uzaVar = new uza(this, zjeVar);
            }
        } else {
            uzaVar = new uza(this, zjeVar);
        }
        Object objD = uzaVar.i;
        wne wneVar = wne.f39444a;
        int i3 = uzaVar.k;
        if (i3 == 0) {
            z1x.P(objD);
            n0b n0bVar = (n0b) ((sza) this.b).invoke();
            uzaVar.k = 1;
            objD = n0bVar.d(str, i, uzaVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        return ((dx5) objD).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(boolean z, zje zjeVar) {
        cf1 cf1Var;
        if (zjeVar instanceof cf1) {
            cf1Var = (cf1) zjeVar;
            int i = cf1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cf1Var.k = i - Integer.MIN_VALUE;
            } else {
                cf1Var = new cf1(this, zjeVar);
            }
        } else {
            cf1Var = new cf1(this, zjeVar);
        }
        Object objD0 = cf1Var.i;
        wne wneVar = wne.f39444a;
        int i2 = cf1Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            c5k c5kVar = (c5k) this.b;
            cf1Var.k = 1;
            z220 z220Var = (z220) c5kVar.b;
            objD0 = qjj.d0(((mne) z220Var.b).b, new no0((byte) 2, yjeVar, z220Var, ((j1q0) c5kVar.f3775a).f15748a.a(), z), cf1Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        uhc0 uhc0Var = (uhc0) objD0;
        if (uhc0Var.f35671a.k || uhc0Var.b.k || uhc0Var.c.g) {
            return uhc0Var;
        }
        return null;
    }

    public void f(wdn wdnVar) {
        hen henVarA;
        gen genVar = ((ien) this.b).f14642a;
        genVar.getClass();
        qoj0 qoj0Var = genVar.b;
        hen henVarK0 = ebc.k0(qoj0Var);
        int iOrdinal = wdnVar.ordinal();
        if (iOrdinal == 0) {
            henVarA = hen.a(henVarK0, iun.f15405a, null, 2);
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return;
            }
            henVarA = hen.a(henVarK0, null, iun.f15405a, 1);
        }
        qoj0Var.g(henVarA);
    }

    public boolean g() {
        switch (this.f42772a) {
            case 21:
                return ((fnd0) ((o470) this.b).f24619a).f9831a.b().getBoolean("is_enabled", false);
            default:
                f8u f8uVar = (f8u) this.b;
                return (f8uVar.a(bop0.FIRST).isEmpty() || f8uVar.a(bop0.SECOND).isEmpty()) ? false : true;
        }
    }

    public void h(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((g46) this.b).a(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(int i, zje zjeVar, String str, String str2) {
        vza vzaVar;
        if (zjeVar instanceof vza) {
            vzaVar = (vza) zjeVar;
            int i2 = vzaVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vzaVar.k = i2 - Integer.MIN_VALUE;
            } else {
                vzaVar = new vza(this, zjeVar);
            }
        } else {
            vzaVar = new vza(this, zjeVar);
        }
        Object objB = vzaVar.i;
        wne wneVar = wne.f39444a;
        int i3 = vzaVar.k;
        if (i3 == 0) {
            z1x.P(objB);
            n0b n0bVar = (n0b) ((sza) this.b).invoke();
            vzaVar.k = 1;
            objB = n0bVar.b(str, str2, i, vzaVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((dx5) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object j(String str, ArrayList arrayList, int i, String str2, zje zjeVar) {
        wza wzaVar;
        if (zjeVar instanceof wza) {
            wzaVar = (wza) zjeVar;
            int i2 = wzaVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wzaVar.k = i2 - Integer.MIN_VALUE;
            } else {
                wzaVar = new wza(this, zjeVar);
            }
        } else {
            wzaVar = new wza(this, zjeVar);
        }
        wza wzaVar2 = wzaVar;
        Object objA = wzaVar2.i;
        wne wneVar = wne.f39444a;
        int i3 = wzaVar2.k;
        if (i3 == 0) {
            z1x.P(objA);
            n0b n0bVar = (n0b) ((sza) this.b).invoke();
            boi0 boi0Var = new boi0(arrayList);
            wzaVar2.k = 1;
            objA = n0bVar.a(str, str2, i, boi0Var, wzaVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        wo8 wo8Var = (wo8) this.b;
        vo8 vo8Var = wo8Var.n;
        if (vo8Var != null) {
            wo8Var.g.a0.remove(vo8Var);
        }
        vo8 vo8Var2 = new vo8(wo8Var.j, xiv0Var);
        wo8Var.n = vo8Var2;
        vo8Var2.e(wo8Var.getWindow());
        wo8Var.g.y(wo8Var.n);
        return xiv0Var;
    }

    public yk50(qq3 qq3Var) {
        this.f42772a = (byte) 25;
        qq3Var.getClass();
        this.b = qq3Var;
    }

    public yk50(rch rchVar) {
        this.f42772a = (byte) 27;
        rchVar.getClass();
        this.b = rchVar;
    }

    public /* synthetic */ yk50(Object obj, byte b) {
        this.f42772a = b;
        this.b = obj;
    }

    public yk50(j51 j51Var) {
        this.f42772a = (byte) 24;
        j51Var.getClass();
        this.b = j51Var;
    }

    public yk50(knf0 knf0Var) {
        this.f42772a = (byte) 6;
        knf0Var.getClass();
        this.b = knf0Var;
    }

    public yk50(hk5 hk5Var) {
        this.f42772a = (byte) 10;
        hk5Var.getClass();
        this.b = hk5Var;
    }

    public yk50(byte b) {
        this.f42772a = b;
        switch (b) {
            case 16:
                break;
            default:
                this.b = new AtomicReference(null);
                break;
        }
    }

    public yk50(ok50 ok50Var, kud kudVar) {
        this.f42772a = (byte) 0;
        this.b = ok50Var;
    }

    public yk50(ywq0 ywq0Var) {
        this.f42772a = (byte) 1;
        Context context = (Context) ywq0Var.f43384a;
        String str = (String) ywq0Var.b;
        String str2 = (String) ywq0Var.c;
        if (str != null) {
            Context applicationContext = context.getApplicationContext();
            if (str2 == null) {
                PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
            } else {
                applicationContext.getSharedPreferences(str2, 0).edit();
            }
            this.b = (yox) ywq0Var.g;
            return;
        }
        jf4.o("keysetName cannot be null");
        throw null;
    }
}
