package a;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class nz9 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qz9 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz9(qz9 qz9Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = qz9Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        qz9 qz9Var = this.k;
        switch (b) {
            case 0:
                nz9 nz9Var = new nz9(qz9Var, yjeVar, (byte) 0);
                nz9Var.j = obj;
                return nz9Var;
            case 1:
                nz9 nz9Var2 = new nz9(qz9Var, yjeVar, (byte) 1);
                nz9Var2.j = obj;
                return nz9Var2;
            case 2:
                nz9 nz9Var3 = new nz9(qz9Var, yjeVar, (byte) 2);
                nz9Var3.j = obj;
                return nz9Var3;
            case 3:
                nz9 nz9Var4 = new nz9(qz9Var, yjeVar, (byte) 3);
                nz9Var4.j = obj;
                return nz9Var4;
            case 4:
                nz9 nz9Var5 = new nz9(qz9Var, yjeVar, (byte) 4);
                nz9Var5.j = obj;
                return nz9Var5;
            case 5:
                nz9 nz9Var6 = new nz9(qz9Var, yjeVar, (byte) 5);
                nz9Var6.j = obj;
                return nz9Var6;
            default:
                nz9 nz9Var7 = new nz9(qz9Var, yjeVar, (byte) 6);
                nz9Var7.j = obj;
                return nz9Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((nz9) create((h4a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((nz9) create((sa80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((nz9) create((ike) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((nz9) create((Bitmap) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((nz9) create((wub0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((nz9) create((a1k0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((nz9) create((ilu0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        Size size;
        Object value;
        byte b = 4;
        final byte b2 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (this.i) {
            case 0:
                final qz9 qz9Var = this.k;
                a8z a8zVar = qz9Var.l2;
                a8z a8zVar2 = qz9Var.k2;
                h4a h4aVar = (h4a) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (h4aVar instanceof f4a) {
                    kl5 kl5Var = qz9.t2;
                    ((lyb0) a8zVar2.getValue()).f20855a.C();
                    ((oub0) a8zVar.getValue()).H(qz9Var.I0().e.getSurfaceProvider());
                    qz9Var.V0(true);
                    n2a n2aVar = ((f4a) h4aVar).f8904a;
                    try {
                        wju0 viewPort = qz9Var.I0().e.getViewPort();
                        wju0 wju0Var = viewPort != null ? viewPort : null;
                        if (wju0Var == null) {
                            wju0Var = (wju0) qz9Var.m2.getValue();
                        }
                        lpt0 lpt0Var = new lpt0();
                        ArrayList arrayList = lpt0Var.b;
                        lpt0Var.f20457a = wju0Var;
                        arrayList.add((oub0) a8zVar.getValue());
                        arrayList.add((jyw) qz9Var.o2.getValue());
                        arrayList.add((mzw) qz9Var.n2.getValue());
                        ArrayList arrayList2 = lpt0Var.b;
                        z1x.t("UseCase must not be empty.", !arrayList2.isEmpty());
                        ArrayList arrayList3 = lpt0Var.c;
                        Iterator it = arrayList3.iterator();
                        if (it.hasNext()) {
                            throw rw2.h(it);
                        }
                        lx9 lx9VarA = ((lyb0) a8zVar2.getValue()).a(qz9Var, n2aVar, new mpt0(lpt0Var.f20457a, arrayList2, arrayList3, objArr2 == true ? 1 : 0));
                        if (Build.VERSION.SDK_INT <= 24) {
                            qz9Var.I0().e.getPreviewStreamState().e(qz9Var.K(), new pz9(new iz9(qz9Var, (byte) 7)));
                        } else {
                            ((ewq) ((okz) lx9VarA).a()).f8539a.b().e(qz9Var, new pz9(new op7((okz) lx9VarA, qz9Var, (byte) 21)));
                        }
                        qz9Var.q2 = (okz) lx9VarA;
                    } catch (Exception unused) {
                        qz9Var.S0().w();
                    }
                } else if (Intrinsics.d(h4aVar, e4a.f7172a)) {
                    kl5 kl5Var2 = qz9.t2;
                    qz9Var.V0(true);
                } else {
                    if (!Intrinsics.d(h4aVar, g4a.f10655a)) {
                        t9f.b();
                        return null;
                    }
                    kl5 kl5Var3 = qz9.t2;
                    PointF pointF = new PointF(0.5f, 0.5f);
                    float f = pointF.x;
                    float f2 = pointF.y;
                    wd40 wd40Var = new wd40();
                    wd40Var.f38956a = f;
                    wd40Var.b = f2;
                    wd40Var.c = null;
                    srn srnVar = new srn(wd40Var);
                    srnVar.f32686a = 2000L;
                    srn srnVar2 = new srn(srnVar);
                    okz okzVar = qz9Var.q2;
                    if (okzVar != null) {
                        okzVar.c.f33257a.c.c(srnVar2);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = qz9Var.I0().j.animate().alpha(0.0f);
                    final Object[] objArr5 = objArr == true ? 1 : 0;
                    viewPropertyAnimatorAlpha.withEndAction(new Runnable() { // from class: a.jz9
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b3 = objArr5;
                            qz9 qz9Var2 = qz9Var;
                            switch (b3) {
                                case 0:
                                    kl5 kl5Var4 = qz9.t2;
                                    qz9Var2.V0(false);
                                    qz9Var2.I0().j.setAlpha(1.0f);
                                    break;
                                default:
                                    a8z a8zVar3 = qz9Var2.k2;
                                    kl5 kl5Var5 = qz9.t2;
                                    try {
                                        ((lyb0) a8zVar3.getValue()).f20855a.C();
                                        qz9Var2.S0().y((ArrayList) ((lyb0) a8zVar3.getValue()).b());
                                    } catch (Exception unused2) {
                                        qz9Var2.S0().w();
                                    }
                                    break;
                            }
                        }
                    });
                }
                return Unit.f46060a;
            case 1:
                sa80 sa80Var = (sa80) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                qz9 qz9Var2 = this.k;
                kl5 kl5Var4 = qz9.t2;
                jyw jywVar = (jyw) qz9Var2.o2.getValue();
                int i = sa80Var.d;
                int iS = ((w0x) jywVar.i).s(-1);
                if (iS == -1 || iS != i) {
                    ept0 ept0VarN = jywVar.n(jywVar.g);
                    w0x w0xVar = (w0x) ept0VarN.e();
                    int iS2 = w0xVar.s(-1);
                    if (iS2 == -1 || iS2 != i) {
                        gyw gywVar = (gyw) ept0VarN;
                        switch (gywVar.f12152a) {
                            case 0:
                                gywVar.b.y(w0x.l0, Integer.valueOf(i));
                                break;
                            case 1:
                                gywVar.b.y(w0x.l0, Integer.valueOf(i));
                                break;
                            default:
                                wy40 wy40Var = gywVar.b;
                                wy40Var.y(w0x.l0, Integer.valueOf(i));
                                wy40Var.y(w0x.m0, Integer.valueOf(i));
                                break;
                        }
                    }
                    if (iS2 != -1 && i != -1 && iS2 != i) {
                        if (Math.abs(hp4.K(i) - hp4.K(iS2)) % 180 == 90 && (size = (Size) w0xVar.e(w0x.o0, null)) != null) {
                            gyw gywVar2 = (gyw) ept0VarN;
                            Size size2 = new Size(size.getHeight(), size.getWidth());
                            switch (gywVar2.f12152a) {
                                case 0:
                                    gywVar2.b.y(w0x.o0, size2);
                                    break;
                                case 1:
                                    gywVar2.b.y(w0x.o0, size2);
                                    break;
                                default:
                                    gywVar2.b.y(w0x.o0, size2);
                                    break;
                            }
                        }
                    }
                    jywVar.g = ept0VarN.e();
                    s0a s0aVarD = jywVar.d();
                    if (s0aVarD == null) {
                        jywVar.i = jywVar.g;
                    } else {
                        jywVar.i = jywVar.q(s0aVarD.h(), jywVar.f, jywVar.k);
                    }
                } else {
                    b2 = 0;
                }
                if (b2 != 0) {
                    jywVar.J();
                }
                xcm0.h(qz9Var2.I0().k, sa80Var);
                xcm0.h(qz9Var2.I0().i, sa80Var);
                DsSegmentedGroup dsSegmentedGroup = qz9Var2.I0().n;
                int childCount = dsSegmentedGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = dsSegmentedGroup.getChildAt(i2);
                    childAt.getClass();
                    xcm0.h(childAt, sa80Var);
                }
                xcm0.h(qz9Var2.I0().c, sa80Var);
                xcm0.h(qz9Var2.I0().b, sa80Var);
                xcm0.h(qz9Var2.I0().f, sa80Var);
                return Unit.f46060a;
            case 2:
                ike ikeVar = (ike) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                qz9 qz9Var3 = this.k;
                kl5 kl5Var5 = qz9.t2;
                mzw mzwVar = (mzw) qz9Var3.n2.getValue();
                int i3 = ikeVar.c;
                mzwVar.getClass();
                l8x.U("ImageCapture", "setFlashMode: flashMode = " + i3);
                if (i3 != 0 && i3 != 1 && i3 != 2) {
                    if (i3 != 3) {
                        jf4.o(twn.m(i3, "Invalid flash mode: "));
                        return null;
                    }
                    if (mzwVar.w.f29975a == null) {
                        jf4.o("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                        return null;
                    }
                    if (mzwVar.d() != null) {
                        s0a s0aVarD2 = mzwVar.d();
                        if ((s0aVarD2 != null ? s0aVarD2.a().h() : -1) != 0) {
                            jf4.o("Not a front camera despite setting FLASH_MODE_SCREEN");
                            return null;
                        }
                    }
                }
                synchronized (mzwVar.s) {
                    mzwVar.u = i3;
                    mzwVar.L();
                    break;
                }
                this.k.I0().i.setImageResource(ikeVar.b);
                okz okzVar2 = this.k.q2;
                if (okzVar2 != null) {
                    okzVar2.c.f33257a.c.d(ikeVar.e);
                }
                this.k.I0().n.setSelectedPosition(ikeVar.d);
                this.k.I0().n.setClickable(ikeVar.l);
                this.k.I0().k.setClickable(ikeVar.j);
                this.k.I0().i.setClickable(ikeVar.i);
                this.k.I0().n.setVisibility(!ikeVar.f ? 4 : 0);
                this.k.I0().k.setVisibility(!ikeVar.h ? 4 : 0);
                this.k.I0().i.setVisibility(ikeVar.g ? (byte) 0 : (byte) 4);
                this.k.I0().d.setVisibility(ikeVar.f14921a ? 0 : 8);
                return Unit.f46060a;
            case 3:
                Bitmap bitmap = (Bitmap) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                this.k.I0().j.setImageBitmap(bitmap);
                return Unit.f46060a;
            case 4:
                wub0 wub0Var = (wub0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                rz9 rz9VarR0 = this.k.I0();
                boolean z = wub0Var.c;
                if (z) {
                    rz9VarR0.h.setImageBitmap(wub0Var.f39784a);
                }
                ConstraintLayout constraintLayout = rz9VarR0.g;
                AppCompatImageView appCompatImageView = rz9VarR0.m;
                constraintLayout.setVisibility(z ? 0 : 8);
                appCompatImageView.setVisibility(wub0Var.d ? 0 : 8);
                if (z) {
                    appCompatImageView.setImageBitmap(null);
                }
                return Unit.f46060a;
            case 5:
                qz9 qz9Var4 = this.k;
                yzn0 yzn0Var = qz9Var4.e2;
                a1k0 a1k0Var = (a1k0) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (a1k0Var != null) {
                    if (a1k0Var instanceof x0k0) {
                        x0k0 x0k0Var = (x0k0) a1k0Var;
                        Bitmap bitmap2 = x0k0Var.f40075a;
                        String str = x0k0Var.b;
                        kl5 kl5Var6 = qz9.t2;
                        try {
                            File file = new File(qz9Var4.o0().getCacheDir(), str);
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                                yzn0 yzn0Var2 = qz9Var4.d2;
                                iiy[] iiyVarArr = qz9.u2;
                                bitmap2.compress(compressFormat, ((kkd0) yzn0Var2.n(qz9Var4, iiyVarArr[0])).f18432a, fileOutputStream);
                                fileOutputStream.close();
                                Uri uriC = FileProvider.c(qz9Var4.o0(), file, qz9Var4.n0().getPackageName() + ".provider");
                                e0g0 e0g0Var = j0g0.b;
                                String string = uriC.toString();
                                string.getClass();
                                String absolutePath = file.getAbsolutePath();
                                absolutePath.getClass();
                                yzn0Var.u(qz9Var4, iiyVarArr[1], new j0g0(new l2a(string, absolutePath)));
                                qz9Var4.U0();
                                qz9Var4.z0(false, false, false);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    bkb.E(fileOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (IOException e) {
                            e0g0 e0g0Var2 = j0g0.b;
                            yzn0Var.u(qz9Var4, qz9.u2[1], new j0g0(new g0g0(e)));
                            qz9Var4.S0().C(u0k0.f34858a);
                        }
                    } else if (a1k0Var instanceof r0k0) {
                        kl5 kl5Var7 = qz9.t2;
                        qz9Var4.I0().m.setImageBitmap(qz9Var4.I0().e.getBitmap());
                        ((mzw) qz9Var4.n2.getValue()).K((ExecutorService) qz9Var4.h2.getValue(), (mz9) qz9Var4.s2.getValue());
                    } else if (a1k0Var instanceof v0k0) {
                        kl5 kl5Var8 = qz9.t2;
                        ii iiVar = qz9Var4.c2;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = qz9Var4.H(R.string.caution);
                        String strH2 = qz9Var4.H(R.string.permission_message_camera);
                        String strH3 = qz9Var4.H(R.string.open_settings);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, qz9Var4.H(R.string.exit_dialog_title), (String) null, "REQUEST_KEY_PERMISSION_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC = qz9Var4.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (a1k0Var instanceof q0k0) {
                        kl5 kl5Var9 = qz9.t2;
                        ii iiVar2 = qz9Var4.c2;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = qz9Var4.H(R.string.caution);
                        String strH5 = qz9Var4.H(R.string.camera_unavailable);
                        String strH6 = qz9Var4.H(R.string.ok_new);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, "REQUEST_KEY_CAMERA_UNAVAILABLE_DIALOG", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC2 = qz9Var4.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    } else if (a1k0Var instanceof t0k0) {
                        kl5 kl5Var10 = qz9.t2;
                        ii iiVar3 = qz9Var4.c2;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH7 = qz9Var4.H(R.string.caution);
                        String strH8 = qz9Var4.H(R.string.camera_error_capture_image);
                        String strH9 = qz9Var4.H(R.string.ok_new);
                        strH9.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC3 = qz9Var4.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    } else if (a1k0Var instanceof u0k0) {
                        kl5 kl5Var11 = qz9.t2;
                        ii iiVar4 = qz9Var4.c2;
                        if (iiVar4 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH10 = qz9Var4.H(R.string.caution);
                        String strH11 = qz9Var4.H(R.string.camera_error_saving_image);
                        String strH12 = qz9Var4.H(R.string.ok_new);
                        strH12.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC4 = qz9Var4.C();
                        eVarC4.getClass();
                        iiVar4.d(dialogFields4, eVarC4);
                    } else if (a1k0Var instanceof y0k0) {
                        kl5 kl5Var12 = qz9.t2;
                        d4a d4aVarS0 = qz9Var4.S0();
                        Bitmap bitmap3 = qz9Var4.I0().e.getBitmap();
                        Object objG = bitmap3 != null ? wb.G(bitmap3, 0.08f) : null;
                        p7m0 p7m0Var = d4aVarS0.k;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, objG));
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            default:
                final qz9 qz9Var5 = this.k;
                a8z a8zVar3 = qz9Var5.r2;
                ilu0 ilu0Var = (ilu0) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (ilu0Var != null) {
                    if (ilu0Var instanceof elu0) {
                        kl5 kl5Var13 = qz9.t2;
                        qog0 qog0Var = (qog0) qz9Var5.p2.getValue();
                        lz9 lz9Var = new lz9(qog0Var, qz9Var5, objArr4 == true ? 1 : 0);
                        qog0Var.getClass();
                        qog0Var.f29072a.add(lz9Var);
                        qog0Var.a();
                    } else if (ilu0Var instanceof flu0) {
                        kl5 kl5Var14 = qz9.t2;
                        ((ig00) qz9Var5.i2.getValue()).a(new Runnable() { // from class: a.jz9
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte b3 = b2;
                                qz9 qz9Var6 = qz9Var5;
                                switch (b3) {
                                    case 0:
                                        kl5 kl5Var15 = qz9.t2;
                                        qz9Var6.V0(false);
                                        qz9Var6.I0().j.setAlpha(1.0f);
                                        break;
                                    default:
                                        a8z a8zVar4 = qz9Var6.k2;
                                        kl5 kl5Var16 = qz9.t2;
                                        try {
                                            ((lyb0) a8zVar4.getValue()).f20855a.C();
                                            qz9Var6.S0().y((ArrayList) ((lyb0) a8zVar4.getValue()).b());
                                        } catch (Exception unused2) {
                                            qz9Var6.S0().w();
                                        }
                                        break;
                                }
                            }
                        }, jiq0.o0(qz9Var5.o0()));
                    } else if (ilu0Var instanceof glu0) {
                        kl5 kl5Var15 = qz9.t2;
                        qz9Var5.I0().j.animate().cancel();
                        if (((oz9) a8zVar3.getValue()).canDetectOrientation()) {
                            ((oz9) a8zVar3.getValue()).enable();
                        }
                        ((lyb0) qz9Var5.k2.getValue()).f20855a.C();
                        ((oub0) qz9Var5.l2.getValue()).H(qz9Var5.I0().e.getSurfaceProvider());
                        p7m0 p7m0Var2 = qz9Var5.S0().j;
                        yje yjeVar = null;
                        nz9 nz9Var = new nz9(qz9Var5, yjeVar, objArr3 == true ? 1 : 0);
                        lkz lkzVar = lkz.f20223a;
                        clz clzVarW = aac.W(qz9Var5);
                        qjj.W(x0x.Q(clzVarW.x()), null, null, new l19(p7m0Var2, clzVarW, nz9Var, (yje) null), 3);
                        p7m0 p7m0Var3 = qz9Var5.S0().l;
                        nz9 nz9Var2 = new nz9(qz9Var5, yjeVar, b);
                        clz clzVarW2 = aac.W(qz9Var5);
                        qjj.W(x0x.Q(clzVarW2.x()), null, null, new l19((gmq) p7m0Var3, clzVarW2, nz9Var2, (yje) null, (short) 0), 3);
                        qz9Var5.S0().A();
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
