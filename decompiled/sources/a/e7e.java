package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.consultantchat.presentation.dialogs.file.model.FileBottomDialogResult;
import org.xplatform.consultantchat.presentation.dialogs.rate.model.RatingModel;
import org.xplatform.consultantchat.presentation.dialogs.senderror.model.MessageErrorState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"La/e7e;", "La/yx5;", "<init>", "()V", "a/y6e", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e7e extends yx5 {
    public final hnm0 K1;
    public final i9o0 L1;
    public ii M1;
    public wdk0 N1;
    public final s0r O1;
    public ddi P1;
    public ndk0 Q1;
    public final a8z R1;
    public final Handler S1;
    public final kiu0 U1;
    public final a8z V1;
    public final a8z W1;
    public final a8z X1;
    public final a8z Y1;
    public Runnable Z1;
    public boolean a2;
    public Runnable b2;
    public b7e c2;
    public static final /* synthetic */ iiy[] e2 = {new j0d0(e7e.class, "binding", "getBinding()Lorg/xplatform/consultantchat/impl/databinding/FragmentConsultantChatBinding;", 0)};
    public static final kwd d2 = new kwd();

    public e7e() {
        super(R.layout.fragment_consultant_chat);
        this.K1 = hnm0.f13359a;
        this.L1 = i9o0.f14396a;
        this.O1 = ltt0.o(this, a7e.f364a);
        final byte b = 1;
        Function0 function0 = new Function0(this) { // from class: a.s6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                e7e e7eVar = this.b;
                switch (b2) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_24));
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        return RingtoneManager.getRingtone(e7eVar.o0(), RingtoneManager.getDefaultUri(2));
                    case 2:
                        ddi ddiVar = e7eVar.P1;
                        if (ddiVar != null) {
                            return new t0h0(ddiVar, a4n0.f(e7eVar));
                        }
                        Intrinsics.h("consultantChatViewModelFactory");
                        throw null;
                    case 3:
                        kwd kwdVar3 = e7e.d2;
                        e7e e7eVar2 = this.b;
                        Class<fae> cls = fae.class;
                        return new d6e(new kx2(3, e7eVar2.J0(), cls, "onVisibleMessage", "onVisibleMessage(IIZ)V", 0, (byte) 3), new enc(1, e7eVar2, e7e.class, "onFileClickListener", "onFileClickListener(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/FileInfoUiModel;)V", 0, (byte) 29), new mhc(2, e7eVar2.J0(), cls, "onReplyMessageClick", "onReplyMessageClick(II)V", 0, (byte) 9), new z6e(1, e7eVar2, e7e.class, "onImageClicked", "onImageClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 0), new z6e(1, e7eVar2.J0(), fae.class, "onRowClick", "onRowClick(Lorg/xplatform/consultantchat/domain/models/RowModel;)V", 0, (byte) 1), new z6e(1, e7eVar2.J0(), fae.class, "onButtonClick", "onButtonClick(Lorg/xplatform/consultantchat/domain/models/ButtonModel;)V", 0, (byte) 2), new z6e(1, e7eVar2, e7e.class, "onDownloadImage", "onDownloadImage(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 3), new z6e(1, e7eVar2.J0(), fae.class, "onErrorClicked", "onErrorClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/model/ErrorMessageClickEvent;)V", 0, (byte) 4));
                    case 4:
                        kwd kwdVar4 = e7e.d2;
                        z6e z6eVar = new z6e(1, e7eVar.J0(), fae.class, "onCancelAttachImage", "onCancelAttachImage(Ljava/lang/String;)V", 0, (byte) 5);
                        n14 n14Var = new n14();
                        n14Var.d.b(new gbn(new o33((byte) 9), new l9(3, (byte) 23), new b33((Object) z6eVar, (byte) 12), zx3.c));
                        return n14Var;
                    default:
                        kwd kwdVar5 = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_8));
                }
            }
        };
        wez wezVar = wez.b;
        this.R1 = maz.a(wezVar, function0);
        this.S1 = new Handler(Looper.getMainLooper());
        final byte b2 = 2;
        Function0 function1 = new Function0(this) { // from class: a.s6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                e7e e7eVar = this.b;
                switch (b3) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_24));
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        return RingtoneManager.getRingtone(e7eVar.o0(), RingtoneManager.getDefaultUri(2));
                    case 2:
                        ddi ddiVar = e7eVar.P1;
                        if (ddiVar != null) {
                            return new t0h0(ddiVar, a4n0.f(e7eVar));
                        }
                        Intrinsics.h("consultantChatViewModelFactory");
                        throw null;
                    case 3:
                        kwd kwdVar3 = e7e.d2;
                        e7e e7eVar2 = this.b;
                        Class<fae> cls = fae.class;
                        return new d6e(new kx2(3, e7eVar2.J0(), cls, "onVisibleMessage", "onVisibleMessage(IIZ)V", 0, (byte) 3), new enc(1, e7eVar2, e7e.class, "onFileClickListener", "onFileClickListener(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/FileInfoUiModel;)V", 0, (byte) 29), new mhc(2, e7eVar2.J0(), cls, "onReplyMessageClick", "onReplyMessageClick(II)V", 0, (byte) 9), new z6e(1, e7eVar2, e7e.class, "onImageClicked", "onImageClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 0), new z6e(1, e7eVar2.J0(), fae.class, "onRowClick", "onRowClick(Lorg/xplatform/consultantchat/domain/models/RowModel;)V", 0, (byte) 1), new z6e(1, e7eVar2.J0(), fae.class, "onButtonClick", "onButtonClick(Lorg/xplatform/consultantchat/domain/models/ButtonModel;)V", 0, (byte) 2), new z6e(1, e7eVar2, e7e.class, "onDownloadImage", "onDownloadImage(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 3), new z6e(1, e7eVar2.J0(), fae.class, "onErrorClicked", "onErrorClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/model/ErrorMessageClickEvent;)V", 0, (byte) 4));
                    case 4:
                        kwd kwdVar4 = e7e.d2;
                        z6e z6eVar = new z6e(1, e7eVar.J0(), fae.class, "onCancelAttachImage", "onCancelAttachImage(Ljava/lang/String;)V", 0, (byte) 5);
                        n14 n14Var = new n14();
                        n14Var.d.b(new gbn(new o33((byte) 9), new l9(3, (byte) 23), new b33((Object) z6eVar, (byte) 12), zx3.c));
                        return n14Var;
                    default:
                        kwd kwdVar5 = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_8));
                }
            }
        };
        a8z a8zVarA = maz.a(wezVar, new svc(new svc(this, (byte) 20), (byte) 21));
        this.U1 = agc.G(this, sre0.f32672a.b(fae.class), new wpb(a8zVarA, (byte) 26), new wpb(a8zVarA, (byte) 27), function1);
        final byte b3 = 3;
        this.V1 = maz.a(wezVar, new Function0(this) { // from class: a.s6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                e7e e7eVar = this.b;
                switch (b4) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_24));
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        return RingtoneManager.getRingtone(e7eVar.o0(), RingtoneManager.getDefaultUri(2));
                    case 2:
                        ddi ddiVar = e7eVar.P1;
                        if (ddiVar != null) {
                            return new t0h0(ddiVar, a4n0.f(e7eVar));
                        }
                        Intrinsics.h("consultantChatViewModelFactory");
                        throw null;
                    case 3:
                        kwd kwdVar3 = e7e.d2;
                        e7e e7eVar2 = this.b;
                        Class<fae> cls = fae.class;
                        return new d6e(new kx2(3, e7eVar2.J0(), cls, "onVisibleMessage", "onVisibleMessage(IIZ)V", 0, (byte) 3), new enc(1, e7eVar2, e7e.class, "onFileClickListener", "onFileClickListener(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/FileInfoUiModel;)V", 0, (byte) 29), new mhc(2, e7eVar2.J0(), cls, "onReplyMessageClick", "onReplyMessageClick(II)V", 0, (byte) 9), new z6e(1, e7eVar2, e7e.class, "onImageClicked", "onImageClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 0), new z6e(1, e7eVar2.J0(), fae.class, "onRowClick", "onRowClick(Lorg/xplatform/consultantchat/domain/models/RowModel;)V", 0, (byte) 1), new z6e(1, e7eVar2.J0(), fae.class, "onButtonClick", "onButtonClick(Lorg/xplatform/consultantchat/domain/models/ButtonModel;)V", 0, (byte) 2), new z6e(1, e7eVar2, e7e.class, "onDownloadImage", "onDownloadImage(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 3), new z6e(1, e7eVar2.J0(), fae.class, "onErrorClicked", "onErrorClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/model/ErrorMessageClickEvent;)V", 0, (byte) 4));
                    case 4:
                        kwd kwdVar4 = e7e.d2;
                        z6e z6eVar = new z6e(1, e7eVar.J0(), fae.class, "onCancelAttachImage", "onCancelAttachImage(Ljava/lang/String;)V", 0, (byte) 5);
                        n14 n14Var = new n14();
                        n14Var.d.b(new gbn(new o33((byte) 9), new l9(3, (byte) 23), new b33((Object) z6eVar, (byte) 12), zx3.c));
                        return n14Var;
                    default:
                        kwd kwdVar5 = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_8));
                }
            }
        });
        final byte b4 = 4;
        this.W1 = maz.a(wezVar, new Function0(this) { // from class: a.s6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                e7e e7eVar = this.b;
                switch (b5) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_24));
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        return RingtoneManager.getRingtone(e7eVar.o0(), RingtoneManager.getDefaultUri(2));
                    case 2:
                        ddi ddiVar = e7eVar.P1;
                        if (ddiVar != null) {
                            return new t0h0(ddiVar, a4n0.f(e7eVar));
                        }
                        Intrinsics.h("consultantChatViewModelFactory");
                        throw null;
                    case 3:
                        kwd kwdVar3 = e7e.d2;
                        e7e e7eVar2 = this.b;
                        Class<fae> cls = fae.class;
                        return new d6e(new kx2(3, e7eVar2.J0(), cls, "onVisibleMessage", "onVisibleMessage(IIZ)V", 0, (byte) 3), new enc(1, e7eVar2, e7e.class, "onFileClickListener", "onFileClickListener(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/FileInfoUiModel;)V", 0, (byte) 29), new mhc(2, e7eVar2.J0(), cls, "onReplyMessageClick", "onReplyMessageClick(II)V", 0, (byte) 9), new z6e(1, e7eVar2, e7e.class, "onImageClicked", "onImageClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 0), new z6e(1, e7eVar2.J0(), fae.class, "onRowClick", "onRowClick(Lorg/xplatform/consultantchat/domain/models/RowModel;)V", 0, (byte) 1), new z6e(1, e7eVar2.J0(), fae.class, "onButtonClick", "onButtonClick(Lorg/xplatform/consultantchat/domain/models/ButtonModel;)V", 0, (byte) 2), new z6e(1, e7eVar2, e7e.class, "onDownloadImage", "onDownloadImage(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 3), new z6e(1, e7eVar2.J0(), fae.class, "onErrorClicked", "onErrorClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/model/ErrorMessageClickEvent;)V", 0, (byte) 4));
                    case 4:
                        kwd kwdVar4 = e7e.d2;
                        z6e z6eVar = new z6e(1, e7eVar.J0(), fae.class, "onCancelAttachImage", "onCancelAttachImage(Ljava/lang/String;)V", 0, (byte) 5);
                        n14 n14Var = new n14();
                        n14Var.d.b(new gbn(new o33((byte) 9), new l9(3, (byte) 23), new b33((Object) z6eVar, (byte) 12), zx3.c));
                        return n14Var;
                    default:
                        kwd kwdVar5 = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_8));
                }
            }
        });
        final byte b5 = 5;
        this.X1 = maz.a(wezVar, new Function0(this) { // from class: a.s6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                e7e e7eVar = this.b;
                switch (b6) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_24));
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        return RingtoneManager.getRingtone(e7eVar.o0(), RingtoneManager.getDefaultUri(2));
                    case 2:
                        ddi ddiVar = e7eVar.P1;
                        if (ddiVar != null) {
                            return new t0h0(ddiVar, a4n0.f(e7eVar));
                        }
                        Intrinsics.h("consultantChatViewModelFactory");
                        throw null;
                    case 3:
                        kwd kwdVar3 = e7e.d2;
                        e7e e7eVar2 = this.b;
                        Class<fae> cls = fae.class;
                        return new d6e(new kx2(3, e7eVar2.J0(), cls, "onVisibleMessage", "onVisibleMessage(IIZ)V", 0, (byte) 3), new enc(1, e7eVar2, e7e.class, "onFileClickListener", "onFileClickListener(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/FileInfoUiModel;)V", 0, (byte) 29), new mhc(2, e7eVar2.J0(), cls, "onReplyMessageClick", "onReplyMessageClick(II)V", 0, (byte) 9), new z6e(1, e7eVar2, e7e.class, "onImageClicked", "onImageClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 0), new z6e(1, e7eVar2.J0(), fae.class, "onRowClick", "onRowClick(Lorg/xplatform/consultantchat/domain/models/RowModel;)V", 0, (byte) 1), new z6e(1, e7eVar2.J0(), fae.class, "onButtonClick", "onButtonClick(Lorg/xplatform/consultantchat/domain/models/ButtonModel;)V", 0, (byte) 2), new z6e(1, e7eVar2, e7e.class, "onDownloadImage", "onDownloadImage(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 3), new z6e(1, e7eVar2.J0(), fae.class, "onErrorClicked", "onErrorClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/model/ErrorMessageClickEvent;)V", 0, (byte) 4));
                    case 4:
                        kwd kwdVar4 = e7e.d2;
                        z6e z6eVar = new z6e(1, e7eVar.J0(), fae.class, "onCancelAttachImage", "onCancelAttachImage(Ljava/lang/String;)V", 0, (byte) 5);
                        n14 n14Var = new n14();
                        n14Var.d.b(new gbn(new o33((byte) 9), new l9(3, (byte) 23), new b33((Object) z6eVar, (byte) 12), zx3.c));
                        return n14Var;
                    default:
                        kwd kwdVar5 = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_8));
                }
            }
        });
        final byte b6 = 0;
        this.Y1 = maz.a(wezVar, new Function0(this) { // from class: a.s6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                e7e e7eVar = this.b;
                switch (b7) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_24));
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        return RingtoneManager.getRingtone(e7eVar.o0(), RingtoneManager.getDefaultUri(2));
                    case 2:
                        ddi ddiVar = e7eVar.P1;
                        if (ddiVar != null) {
                            return new t0h0(ddiVar, a4n0.f(e7eVar));
                        }
                        Intrinsics.h("consultantChatViewModelFactory");
                        throw null;
                    case 3:
                        kwd kwdVar3 = e7e.d2;
                        e7e e7eVar2 = this.b;
                        Class<fae> cls = fae.class;
                        return new d6e(new kx2(3, e7eVar2.J0(), cls, "onVisibleMessage", "onVisibleMessage(IIZ)V", 0, (byte) 3), new enc(1, e7eVar2, e7e.class, "onFileClickListener", "onFileClickListener(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/FileInfoUiModel;)V", 0, (byte) 29), new mhc(2, e7eVar2.J0(), cls, "onReplyMessageClick", "onReplyMessageClick(II)V", 0, (byte) 9), new z6e(1, e7eVar2, e7e.class, "onImageClicked", "onImageClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 0), new z6e(1, e7eVar2.J0(), fae.class, "onRowClick", "onRowClick(Lorg/xplatform/consultantchat/domain/models/RowModel;)V", 0, (byte) 1), new z6e(1, e7eVar2.J0(), fae.class, "onButtonClick", "onButtonClick(Lorg/xplatform/consultantchat/domain/models/ButtonModel;)V", 0, (byte) 2), new z6e(1, e7eVar2, e7e.class, "onDownloadImage", "onDownloadImage(Lorg/xplatform/consultantchat/presentation/consultantchat/adapters/models/ImageInfoUiModel;)V", 0, (byte) 3), new z6e(1, e7eVar2.J0(), fae.class, "onErrorClicked", "onErrorClicked(Lorg/xplatform/consultantchat/presentation/consultantchat/model/ErrorMessageClickEvent;)V", 0, (byte) 4));
                    case 4:
                        kwd kwdVar4 = e7e.d2;
                        z6e z6eVar = new z6e(1, e7eVar.J0(), fae.class, "onCancelAttachImage", "onCancelAttachImage(Ljava/lang/String;)V", 0, (byte) 5);
                        n14 n14Var = new n14();
                        n14Var.d.b(new gbn(new o33((byte) 9), new l9(3, (byte) 23), new b33((Object) z6eVar, (byte) 12), zx3.c));
                        return n14Var;
                    default:
                        kwd kwdVar5 = e7e.d2;
                        return Integer.valueOf(e7eVar.G().getDimensionPixelSize(R.dimen.space_8));
                }
            }
        });
        this.Z1 = new d12(b2);
        this.b2 = new d12(b2);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        kzq kzqVarH0 = H0();
        ImageView imageView = kzqVarH0.c;
        TextInputEditText textInputEditText = kzqVarH0.f;
        MaterialButton materialButton = kzqVarH0.d;
        TextView textView = kzqVarH0.z;
        RecyclerView recyclerView = kzqVarH0.o;
        recyclerView.setLayoutManager(new y6e(this));
        final byte b = 1;
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(G0());
        RecyclerView recyclerView2 = kzqVarH0.n;
        final byte b2 = 0;
        recyclerView2.setLayoutManager(new LinearLayoutManager(o0(), 0, false));
        recyclerView2.setAdapter((n14) this.W1.getValue());
        hxm0.x(kzqVarH0.m, ((Number) this.Y1.getValue()).intValue());
        recyclerView2.m(new qmk0(((Number) this.X1.getValue()).intValue(), 0, 0, 0, 0, 0, null, null, 478));
        d6e d6eVarG0 = G0();
        if (d6eVarG0 == null) {
            d6eVarG0 = null;
        }
        if (d6eVarG0 != null) {
            recyclerView.m(new upm0(d6eVarG0));
        }
        kzqVarH0.x.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: a.t6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8e w8eVar;
                byte b3 = b2;
                yje yjeVar = null;
                byte b4 = 1;
                e7e e7eVar = this.b;
                switch (b3) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        i1w0 i1w0Var = e7eVar.J0().b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        fae faeVarJ0 = e7eVar.J0();
                        yxb yxbVar = faeVarJ0.v;
                        Integer num = faeVarJ0.O;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            if (!faeVarJ0.B(iIntValue)) {
                                x9c x9cVar = new x9c(faeVarJ0, iIntValue, (byte) 2);
                                yxbVar.C = false;
                                bh1 bh1Var = new bh1(yxbVar, iIntValue, x9cVar, (byte) 1);
                                bh1Var.invoke();
                                yxbVar.s = bh1Var;
                            }
                        } else {
                            if (!yxbVar.B) {
                                yxbVar.C = false;
                                hxb hxbVar = new hxb(yxbVar, b4);
                                hxbVar.invoke();
                                yxbVar.s = hxbVar;
                            }
                            if (yxbVar.B && (w8eVar = yxbVar.t) != null) {
                                w8eVar.invoke();
                            }
                        }
                        faeVarJ0.O = null;
                        break;
                    case 2:
                        kwd kwdVar3 = e7e.d2;
                        e7eVar.J0().A.f(e9e.f7417a);
                        break;
                    case 3:
                        kwd kwdVar4 = e7e.d2;
                        fae faeVarJ1 = e7eVar.J0();
                        ol60 ol60Var = faeVarJ1.B;
                        f9e f9eVar = (f9e) faeVarJ1.A.getValue();
                        if ((f9eVar instanceof d9e) && ((d9e) f9eVar).f5696a.size() >= 10) {
                            ol60Var.f(new n6e());
                        } else {
                            ol60Var.f(g6e.f10759a);
                        }
                        break;
                    default:
                        kwd kwdVar5 = e7e.d2;
                        fae faeVarJ2 = e7eVar.J0();
                        sac.V(jiu0.a(faeVarJ2), new z6e(1, faeVarJ2, fae.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, null, new z9e(faeVarJ2, yjeVar, b4), 14);
                        break;
                }
            }
        });
        byte b3 = 9;
        dyb.O(materialButton, new ejd(this, b3));
        textInputEditText.addTextChangedListener(new jt6(this, b));
        textInputEditText.setText("");
        b7e b7eVar = new b7e(this, imageView, textView, recyclerView);
        recyclerView.o(b7eVar);
        this.c2 = b7eVar;
        kzqVarH0.j.setOnClickListener(new wg(this, kzqVarH0, b3));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: a.t6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8e w8eVar;
                byte b4 = b;
                yje yjeVar = null;
                byte b5 = 1;
                e7e e7eVar = this.b;
                switch (b4) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        i1w0 i1w0Var = e7eVar.J0().b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        fae faeVarJ0 = e7eVar.J0();
                        yxb yxbVar = faeVarJ0.v;
                        Integer num = faeVarJ0.O;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            if (!faeVarJ0.B(iIntValue)) {
                                x9c x9cVar = new x9c(faeVarJ0, iIntValue, (byte) 2);
                                yxbVar.C = false;
                                bh1 bh1Var = new bh1(yxbVar, iIntValue, x9cVar, (byte) 1);
                                bh1Var.invoke();
                                yxbVar.s = bh1Var;
                            }
                        } else {
                            if (!yxbVar.B) {
                                yxbVar.C = false;
                                hxb hxbVar = new hxb(yxbVar, b5);
                                hxbVar.invoke();
                                yxbVar.s = hxbVar;
                            }
                            if (yxbVar.B && (w8eVar = yxbVar.t) != null) {
                                w8eVar.invoke();
                            }
                        }
                        faeVarJ0.O = null;
                        break;
                    case 2:
                        kwd kwdVar3 = e7e.d2;
                        e7eVar.J0().A.f(e9e.f7417a);
                        break;
                    case 3:
                        kwd kwdVar4 = e7e.d2;
                        fae faeVarJ1 = e7eVar.J0();
                        ol60 ol60Var = faeVarJ1.B;
                        f9e f9eVar = (f9e) faeVarJ1.A.getValue();
                        if ((f9eVar instanceof d9e) && ((d9e) f9eVar).f5696a.size() >= 10) {
                            ol60Var.f(new n6e());
                        } else {
                            ol60Var.f(g6e.f10759a);
                        }
                        break;
                    default:
                        kwd kwdVar5 = e7e.d2;
                        fae faeVarJ2 = e7eVar.J0();
                        sac.V(jiu0.a(faeVarJ2), new z6e(1, faeVarJ2, fae.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, null, new z9e(faeVarJ2, yjeVar, b5), 14);
                        break;
                }
            }
        });
        final byte b4 = 2;
        ((ImageView) kzqVarH0.l.c).setOnClickListener(new View.OnClickListener(this) { // from class: a.t6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8e w8eVar;
                byte b5 = b4;
                yje yjeVar = null;
                byte b6 = 1;
                e7e e7eVar = this.b;
                switch (b5) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        i1w0 i1w0Var = e7eVar.J0().b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        fae faeVarJ0 = e7eVar.J0();
                        yxb yxbVar = faeVarJ0.v;
                        Integer num = faeVarJ0.O;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            if (!faeVarJ0.B(iIntValue)) {
                                x9c x9cVar = new x9c(faeVarJ0, iIntValue, (byte) 2);
                                yxbVar.C = false;
                                bh1 bh1Var = new bh1(yxbVar, iIntValue, x9cVar, (byte) 1);
                                bh1Var.invoke();
                                yxbVar.s = bh1Var;
                            }
                        } else {
                            if (!yxbVar.B) {
                                yxbVar.C = false;
                                hxb hxbVar = new hxb(yxbVar, b6);
                                hxbVar.invoke();
                                yxbVar.s = hxbVar;
                            }
                            if (yxbVar.B && (w8eVar = yxbVar.t) != null) {
                                w8eVar.invoke();
                            }
                        }
                        faeVarJ0.O = null;
                        break;
                    case 2:
                        kwd kwdVar3 = e7e.d2;
                        e7eVar.J0().A.f(e9e.f7417a);
                        break;
                    case 3:
                        kwd kwdVar4 = e7e.d2;
                        fae faeVarJ1 = e7eVar.J0();
                        ol60 ol60Var = faeVarJ1.B;
                        f9e f9eVar = (f9e) faeVarJ1.A.getValue();
                        if ((f9eVar instanceof d9e) && ((d9e) f9eVar).f5696a.size() >= 10) {
                            ol60Var.f(new n6e());
                        } else {
                            ol60Var.f(g6e.f10759a);
                        }
                        break;
                    default:
                        kwd kwdVar5 = e7e.d2;
                        fae faeVarJ2 = e7eVar.J0();
                        sac.V(jiu0.a(faeVarJ2), new z6e(1, faeVarJ2, fae.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, null, new z9e(faeVarJ2, yjeVar, b6), 14);
                        break;
                }
            }
        });
        final byte b5 = 3;
        kzqVarH0.i.setOnClickListener(new View.OnClickListener(this) { // from class: a.t6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8e w8eVar;
                byte b6 = b5;
                yje yjeVar = null;
                byte b7 = 1;
                e7e e7eVar = this.b;
                switch (b6) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        i1w0 i1w0Var = e7eVar.J0().b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        fae faeVarJ0 = e7eVar.J0();
                        yxb yxbVar = faeVarJ0.v;
                        Integer num = faeVarJ0.O;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            if (!faeVarJ0.B(iIntValue)) {
                                x9c x9cVar = new x9c(faeVarJ0, iIntValue, (byte) 2);
                                yxbVar.C = false;
                                bh1 bh1Var = new bh1(yxbVar, iIntValue, x9cVar, (byte) 1);
                                bh1Var.invoke();
                                yxbVar.s = bh1Var;
                            }
                        } else {
                            if (!yxbVar.B) {
                                yxbVar.C = false;
                                hxb hxbVar = new hxb(yxbVar, b7);
                                hxbVar.invoke();
                                yxbVar.s = hxbVar;
                            }
                            if (yxbVar.B && (w8eVar = yxbVar.t) != null) {
                                w8eVar.invoke();
                            }
                        }
                        faeVarJ0.O = null;
                        break;
                    case 2:
                        kwd kwdVar3 = e7e.d2;
                        e7eVar.J0().A.f(e9e.f7417a);
                        break;
                    case 3:
                        kwd kwdVar4 = e7e.d2;
                        fae faeVarJ1 = e7eVar.J0();
                        ol60 ol60Var = faeVarJ1.B;
                        f9e f9eVar = (f9e) faeVarJ1.A.getValue();
                        if ((f9eVar instanceof d9e) && ((d9e) f9eVar).f5696a.size() >= 10) {
                            ol60Var.f(new n6e());
                        } else {
                            ol60Var.f(g6e.f10759a);
                        }
                        break;
                    default:
                        kwd kwdVar5 = e7e.d2;
                        fae faeVarJ2 = e7eVar.J0();
                        sac.V(jiu0.a(faeVarJ2), new z6e(1, faeVarJ2, fae.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, null, new z9e(faeVarJ2, yjeVar, b7), 14);
                        break;
                }
            }
        });
        final byte b6 = 4;
        kzqVarH0.y.setOnClickListener(new View.OnClickListener(this) { // from class: a.t6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w8e w8eVar;
                byte b7 = b6;
                yje yjeVar = null;
                byte b8 = 1;
                e7e e7eVar = this.b;
                switch (b7) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        i1w0 i1w0Var = e7eVar.J0().b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        fae faeVarJ0 = e7eVar.J0();
                        yxb yxbVar = faeVarJ0.v;
                        Integer num = faeVarJ0.O;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            if (!faeVarJ0.B(iIntValue)) {
                                x9c x9cVar = new x9c(faeVarJ0, iIntValue, (byte) 2);
                                yxbVar.C = false;
                                bh1 bh1Var = new bh1(yxbVar, iIntValue, x9cVar, (byte) 1);
                                bh1Var.invoke();
                                yxbVar.s = bh1Var;
                            }
                        } else {
                            if (!yxbVar.B) {
                                yxbVar.C = false;
                                hxb hxbVar = new hxb(yxbVar, b8);
                                hxbVar.invoke();
                                yxbVar.s = hxbVar;
                            }
                            if (yxbVar.B && (w8eVar = yxbVar.t) != null) {
                                w8eVar.invoke();
                            }
                        }
                        faeVarJ0.O = null;
                        break;
                    case 2:
                        kwd kwdVar3 = e7e.d2;
                        e7eVar.J0().A.f(e9e.f7417a);
                        break;
                    case 3:
                        kwd kwdVar4 = e7e.d2;
                        fae faeVarJ1 = e7eVar.J0();
                        ol60 ol60Var = faeVarJ1.B;
                        f9e f9eVar = (f9e) faeVarJ1.A.getValue();
                        if ((f9eVar instanceof d9e) && ((d9e) f9eVar).f5696a.size() >= 10) {
                            ol60Var.f(new n6e());
                        } else {
                            ol60Var.f(g6e.f10759a);
                        }
                        break;
                    default:
                        kwd kwdVar5 = e7e.d2;
                        fae faeVarJ2 = e7eVar.J0();
                        sac.V(jiu0.a(faeVarJ2), new z6e(1, faeVarJ2, fae.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, null, new z9e(faeVarJ2, yjeVar, b8), 14);
                        break;
                }
            }
        });
        knm0.h(materialButton, false);
        MenuItem menuItemFindItem = H0().x.getMenu().findItem(R.id.mute);
        TypedValue typedValue = j5d.f15927a;
        ColorStateList colorStateListD = j5d.d(o0(), R.attr.uikitSecondary, R.attr.uikitSecondary);
        if (menuItemFindItem instanceof ojn0) {
            ((ojn0) menuItemFindItem).setIconTintList(colorStateListD);
        } else if (Build.VERSION.SDK_INT >= 26) {
            ga3.z(menuItemFindItem, colorStateListD);
        }
        uvw.R(kzqVarH0.t, this, null);
        C().u0("SEND_RATING_REQUEST_KEY", K(), new k4r(this) { // from class: a.w6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:112:0x0180 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:113:0x0184 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:115:0x0166 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:58:0x0142  */
            /* JADX WARN: Code duplicated, block: B:60:0x0146  */
            /* JADX WARN: Code duplicated, block: B:63:0x016f  */
            /* JADX WARN: Code duplicated, block: B:68:0x018a  */
            /* JADX WARN: Code duplicated, block: B:70:0x019c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:71:0x019e  */
            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Collection collection;
                HashSet hashSet;
                ArrayList arrayList;
                ListIterator listIterator;
                paw pawVar;
                Object next;
                byte b7 = b2;
                e7e e7eVar = this.b;
                switch (b7) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        str.getClass();
                        RatingModel.Value value = (RatingModel.Value) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("SEND_RATING_REQUEST_RESULT") : (Parcelable) bundle2.getParcelable("SEND_RATING_REQUEST_RESULT", RatingModel.Value.class));
                        if (value != null) {
                            fae faeVarJ0 = e7eVar.J0();
                            int i = value.b;
                            boolean z = value.f46451a;
                            Object value2 = faeVarJ0.L.getValue();
                            skp skpVar = value2 instanceof tkp ? ((tkp) value2).f34107a : null;
                            if (skpVar != null) {
                                rkp rkpVar = skpVar.b;
                                if (rkpVar instanceof pkp) {
                                    pkp pkpVar = (pkp) rkpVar;
                                    if (pkpVar.f27146a == i && pkpVar.b == z) {
                                    }
                                }
                                sac.V(jiu0.a(faeVarJ0), new z6e(1, faeVarJ0, fae.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, faeVarJ0.k.b, new eae(faeVarJ0, skpVar, i, z, (yje) null), 10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        str.getClass();
                        FileBottomDialogResult fileBottomDialogResult = (FileBottomDialogResult) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("FILE_DIALOG_RESULT_RESULT_KEY") : (Parcelable) bundle2.getParcelable("FILE_DIALOG_RESULT_RESULT_KEY", FileBottomDialogResult.class));
                        if (fileBottomDialogResult != null) {
                            fae faeVarJ1 = e7eVar.J0();
                            ol60 ol60Var = faeVarJ1.B;
                            zj2 zj2Var = faeVarJ1.A;
                            Object c9eVar = (f9e) zj2Var.getValue();
                            d9e d9eVar = c9eVar instanceof d9e ? (d9e) c9eVar : null;
                            if (d9eVar == null || (collection = d9eVar.f5696a) == null) {
                                collection = iun.f15405a;
                            }
                            boolean z2 = fileBottomDialogResult instanceof FileBottomDialogResult.FileResult;
                            if (z2) {
                                File file = ((FileBottomDialogResult.FileResult) fileBottomDialogResult).f46448a;
                                file.getClass();
                                if (kotlin.text.c.x(sj3.c0(file), "image", false)) {
                                    lc00 lc00VarB = kotlin.collections.a.b();
                                    lc00VarB.addAll(collection);
                                    lc00VarB.add(file);
                                    lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                                    HashSet hashSet2 = new HashSet();
                                    ArrayList arrayList2 = new ArrayList();
                                    ListIterator listIterator2 = lc00VarA.listIterator(0);
                                    while (true) {
                                        paw pawVar2 = (paw) listIterator2;
                                        if (pawVar2.hasNext()) {
                                            Object next2 = pawVar2.next();
                                            if (hashSet2.add(((File) next2).getAbsolutePath())) {
                                                arrayList2.add(next2);
                                            }
                                        } else {
                                            if (arrayList2.size() > 10) {
                                                ol60Var.f(new n6e());
                                            }
                                            c9eVar = new d9e(CollectionsKt.D0(arrayList2, 10));
                                        }
                                    }
                                } else if (fileBottomDialogResult instanceof FileBottomDialogResult.ImageResult) {
                                    lc00 lc00VarB2 = kotlin.collections.a.b();
                                    lc00VarB2.addAll(collection);
                                    lc00VarB2.addAll(((FileBottomDialogResult.ImageResult) fileBottomDialogResult).f46449a);
                                    lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB2);
                                    hashSet = new HashSet();
                                    arrayList = new ArrayList();
                                    listIterator = lc00VarA2.listIterator(0);
                                    while (true) {
                                        pawVar = (paw) listIterator;
                                        if (pawVar.hasNext()) {
                                            next = pawVar.next();
                                            if (hashSet.add(((File) next).getAbsolutePath())) {
                                                arrayList.add(next);
                                            }
                                        } else {
                                            if (arrayList.size() > 10) {
                                                ol60Var.f(new n6e());
                                            }
                                            c9eVar = new d9e(CollectionsKt.D0(arrayList, 10));
                                        }
                                    }
                                } else if (z2) {
                                    c9eVar = new c9e(((FileBottomDialogResult.FileResult) fileBottomDialogResult).f46448a);
                                }
                            } else if (fileBottomDialogResult instanceof FileBottomDialogResult.ImageResult) {
                                lc00 lc00VarB3 = kotlin.collections.a.b();
                                lc00VarB3.addAll(collection);
                                lc00VarB3.addAll(((FileBottomDialogResult.ImageResult) fileBottomDialogResult).f46449a);
                                lc00 lc00VarA3 = kotlin.collections.a.a(lc00VarB3);
                                hashSet = new HashSet();
                                arrayList = new ArrayList();
                                listIterator = lc00VarA3.listIterator(0);
                                while (true) {
                                    pawVar = (paw) listIterator;
                                    if (pawVar.hasNext()) {
                                        next = pawVar.next();
                                        if (hashSet.add(((File) next).getAbsolutePath())) {
                                            arrayList.add(next);
                                        }
                                    } else {
                                        if (arrayList.size() > 10) {
                                            ol60Var.f(new n6e());
                                        }
                                        c9eVar = new d9e(CollectionsKt.D0(arrayList, 10));
                                    }
                                }
                            } else if (z2) {
                                c9eVar = new c9e(((FileBottomDialogResult.FileResult) fileBottomDialogResult).f46448a);
                            }
                            zj2Var.f(c9eVar);
                        }
                        break;
                    default:
                        kwd kwdVar3 = e7e.d2;
                        str.getClass();
                        Object obj = bundle2.get("ERROR_DIALOG_RESULT_VALUE");
                        List<MessageErrorState> list = obj instanceof List ? (List) obj : null;
                        if (list != null) {
                            for (MessageErrorState messageErrorState : list) {
                                if (messageErrorState != null) {
                                    if (messageErrorState instanceof MessageErrorState.RemoveMessage) {
                                        fae faeVarJ2 = e7eVar.J0();
                                        String str2 = ((MessageErrorState.RemoveMessage) messageErrorState).f46452a;
                                        str2.getClass();
                                        qv qvVar = faeVarJ2.n;
                                        qvVar.getClass();
                                        ((i7e) qvVar.f29365a.c).d(str2);
                                    } else if (messageErrorState instanceof MessageErrorState.RetryUploading) {
                                        e7eVar.J0().z(((MessageErrorState.RetryUploading) messageErrorState).f46455a);
                                    } else if (messageErrorState instanceof MessageErrorState.RetryDownloading) {
                                        fae faeVarJ3 = e7eVar.J0();
                                        MessageErrorState.RetryDownloading retryDownloading = (MessageErrorState.RetryDownloading) messageErrorState;
                                        String str3 = retryDownloading.f46454a;
                                        String str4 = retryDownloading.b;
                                        long j = retryDownloading.c;
                                        boolean z3 = retryDownloading.d;
                                        str3.getClass();
                                        str4.getClass();
                                        faeVarJ3.x(z3 ? new pcl(str3, str4, j) : new qcl(str3, str4, j, w1x.MD));
                                    } else if (messageErrorState instanceof MessageErrorState.Resend) {
                                        e7eVar.J0().z(((MessageErrorState.Resend) messageErrorState).f46453a);
                                    }
                                }
                                t9f.b();
                            }
                        }
                        break;
                }
            }
        });
        C().u0("FILE_DIALOG_RESULT_REQUEST_KEY", K(), new k4r(this) { // from class: a.w6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:112:0x0180 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:113:0x0184 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:115:0x0166 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:58:0x0142  */
            /* JADX WARN: Code duplicated, block: B:60:0x0146  */
            /* JADX WARN: Code duplicated, block: B:63:0x016f  */
            /* JADX WARN: Code duplicated, block: B:68:0x018a  */
            /* JADX WARN: Code duplicated, block: B:70:0x019c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:71:0x019e  */
            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Collection collection;
                HashSet hashSet;
                ArrayList arrayList;
                ListIterator listIterator;
                paw pawVar;
                Object next;
                byte b7 = b;
                e7e e7eVar = this.b;
                switch (b7) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        str.getClass();
                        RatingModel.Value value = (RatingModel.Value) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("SEND_RATING_REQUEST_RESULT") : (Parcelable) bundle2.getParcelable("SEND_RATING_REQUEST_RESULT", RatingModel.Value.class));
                        if (value != null) {
                            fae faeVarJ0 = e7eVar.J0();
                            int i = value.b;
                            boolean z = value.f46451a;
                            Object value2 = faeVarJ0.L.getValue();
                            skp skpVar = value2 instanceof tkp ? ((tkp) value2).f34107a : null;
                            if (skpVar != null) {
                                rkp rkpVar = skpVar.b;
                                if (rkpVar instanceof pkp) {
                                    pkp pkpVar = (pkp) rkpVar;
                                    if (pkpVar.f27146a == i && pkpVar.b == z) {
                                    }
                                }
                                sac.V(jiu0.a(faeVarJ0), new z6e(1, faeVarJ0, fae.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, faeVarJ0.k.b, new eae(faeVarJ0, skpVar, i, z, (yje) null), 10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        str.getClass();
                        FileBottomDialogResult fileBottomDialogResult = (FileBottomDialogResult) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("FILE_DIALOG_RESULT_RESULT_KEY") : (Parcelable) bundle2.getParcelable("FILE_DIALOG_RESULT_RESULT_KEY", FileBottomDialogResult.class));
                        if (fileBottomDialogResult != null) {
                            fae faeVarJ1 = e7eVar.J0();
                            ol60 ol60Var = faeVarJ1.B;
                            zj2 zj2Var = faeVarJ1.A;
                            Object c9eVar = (f9e) zj2Var.getValue();
                            d9e d9eVar = c9eVar instanceof d9e ? (d9e) c9eVar : null;
                            if (d9eVar == null || (collection = d9eVar.f5696a) == null) {
                                collection = iun.f15405a;
                            }
                            boolean z2 = fileBottomDialogResult instanceof FileBottomDialogResult.FileResult;
                            if (z2) {
                                File file = ((FileBottomDialogResult.FileResult) fileBottomDialogResult).f46448a;
                                file.getClass();
                                if (kotlin.text.c.x(sj3.c0(file), "image", false)) {
                                    lc00 lc00VarB = kotlin.collections.a.b();
                                    lc00VarB.addAll(collection);
                                    lc00VarB.add(file);
                                    lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                                    HashSet hashSet2 = new HashSet();
                                    ArrayList arrayList2 = new ArrayList();
                                    ListIterator listIterator2 = lc00VarA.listIterator(0);
                                    while (true) {
                                        paw pawVar2 = (paw) listIterator2;
                                        if (pawVar2.hasNext()) {
                                            Object next2 = pawVar2.next();
                                            if (hashSet2.add(((File) next2).getAbsolutePath())) {
                                                arrayList2.add(next2);
                                            }
                                        } else {
                                            if (arrayList2.size() > 10) {
                                                ol60Var.f(new n6e());
                                            }
                                            c9eVar = new d9e(CollectionsKt.D0(arrayList2, 10));
                                        }
                                    }
                                } else if (fileBottomDialogResult instanceof FileBottomDialogResult.ImageResult) {
                                    lc00 lc00VarB3 = kotlin.collections.a.b();
                                    lc00VarB3.addAll(collection);
                                    lc00VarB3.addAll(((FileBottomDialogResult.ImageResult) fileBottomDialogResult).f46449a);
                                    lc00 lc00VarA3 = kotlin.collections.a.a(lc00VarB3);
                                    hashSet = new HashSet();
                                    arrayList = new ArrayList();
                                    listIterator = lc00VarA3.listIterator(0);
                                    while (true) {
                                        pawVar = (paw) listIterator;
                                        if (pawVar.hasNext()) {
                                            next = pawVar.next();
                                            if (hashSet.add(((File) next).getAbsolutePath())) {
                                                arrayList.add(next);
                                            }
                                        } else {
                                            if (arrayList.size() > 10) {
                                                ol60Var.f(new n6e());
                                            }
                                            c9eVar = new d9e(CollectionsKt.D0(arrayList, 10));
                                        }
                                    }
                                } else if (z2) {
                                    c9eVar = new c9e(((FileBottomDialogResult.FileResult) fileBottomDialogResult).f46448a);
                                }
                            } else if (fileBottomDialogResult instanceof FileBottomDialogResult.ImageResult) {
                                lc00 lc00VarB4 = kotlin.collections.a.b();
                                lc00VarB4.addAll(collection);
                                lc00VarB4.addAll(((FileBottomDialogResult.ImageResult) fileBottomDialogResult).f46449a);
                                lc00 lc00VarA4 = kotlin.collections.a.a(lc00VarB4);
                                hashSet = new HashSet();
                                arrayList = new ArrayList();
                                listIterator = lc00VarA4.listIterator(0);
                                while (true) {
                                    pawVar = (paw) listIterator;
                                    if (pawVar.hasNext()) {
                                        next = pawVar.next();
                                        if (hashSet.add(((File) next).getAbsolutePath())) {
                                            arrayList.add(next);
                                        }
                                    } else {
                                        if (arrayList.size() > 10) {
                                            ol60Var.f(new n6e());
                                        }
                                        c9eVar = new d9e(CollectionsKt.D0(arrayList, 10));
                                    }
                                }
                            } else if (z2) {
                                c9eVar = new c9e(((FileBottomDialogResult.FileResult) fileBottomDialogResult).f46448a);
                            }
                            zj2Var.f(c9eVar);
                        }
                        break;
                    default:
                        kwd kwdVar3 = e7e.d2;
                        str.getClass();
                        Object obj = bundle2.get("ERROR_DIALOG_RESULT_VALUE");
                        List<MessageErrorState> list = obj instanceof List ? (List) obj : null;
                        if (list != null) {
                            for (MessageErrorState messageErrorState : list) {
                                if (messageErrorState != null) {
                                    if (messageErrorState instanceof MessageErrorState.RemoveMessage) {
                                        fae faeVarJ2 = e7eVar.J0();
                                        String str2 = ((MessageErrorState.RemoveMessage) messageErrorState).f46452a;
                                        str2.getClass();
                                        qv qvVar = faeVarJ2.n;
                                        qvVar.getClass();
                                        ((i7e) qvVar.f29365a.c).d(str2);
                                    } else if (messageErrorState instanceof MessageErrorState.RetryUploading) {
                                        e7eVar.J0().z(((MessageErrorState.RetryUploading) messageErrorState).f46455a);
                                    } else if (messageErrorState instanceof MessageErrorState.RetryDownloading) {
                                        fae faeVarJ3 = e7eVar.J0();
                                        MessageErrorState.RetryDownloading retryDownloading = (MessageErrorState.RetryDownloading) messageErrorState;
                                        String str3 = retryDownloading.f46454a;
                                        String str4 = retryDownloading.b;
                                        long j = retryDownloading.c;
                                        boolean z3 = retryDownloading.d;
                                        str3.getClass();
                                        str4.getClass();
                                        faeVarJ3.x(z3 ? new pcl(str3, str4, j) : new qcl(str3, str4, j, w1x.MD));
                                    } else if (messageErrorState instanceof MessageErrorState.Resend) {
                                        e7eVar.J0().z(((MessageErrorState.Resend) messageErrorState).f46453a);
                                    }
                                }
                                t9f.b();
                            }
                        }
                        break;
                }
            }
        });
        C().u0("ERROR_DIALOG_RESULT_KEY", K(), new k4r(this) { // from class: a.w6e
            public final /* synthetic */ e7e b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:112:0x0180 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:113:0x0184 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:115:0x0166 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:58:0x0142  */
            /* JADX WARN: Code duplicated, block: B:60:0x0146  */
            /* JADX WARN: Code duplicated, block: B:63:0x016f  */
            /* JADX WARN: Code duplicated, block: B:68:0x018a  */
            /* JADX WARN: Code duplicated, block: B:70:0x019c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:71:0x019e  */
            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                Collection collection;
                HashSet hashSet;
                ArrayList arrayList;
                ListIterator listIterator;
                paw pawVar;
                Object next;
                byte b7 = b4;
                e7e e7eVar = this.b;
                switch (b7) {
                    case 0:
                        kwd kwdVar = e7e.d2;
                        str.getClass();
                        RatingModel.Value value = (RatingModel.Value) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("SEND_RATING_REQUEST_RESULT") : (Parcelable) bundle2.getParcelable("SEND_RATING_REQUEST_RESULT", RatingModel.Value.class));
                        if (value != null) {
                            fae faeVarJ0 = e7eVar.J0();
                            int i = value.b;
                            boolean z = value.f46451a;
                            Object value2 = faeVarJ0.L.getValue();
                            skp skpVar = value2 instanceof tkp ? ((tkp) value2).f34107a : null;
                            if (skpVar != null) {
                                rkp rkpVar = skpVar.b;
                                if (rkpVar instanceof pkp) {
                                    pkp pkpVar = (pkp) rkpVar;
                                    if (pkpVar.f27146a == i && pkpVar.b == z) {
                                    }
                                }
                                sac.V(jiu0.a(faeVarJ0), new z6e(1, faeVarJ0, fae.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, faeVarJ0.k.b, new eae(faeVarJ0, skpVar, i, z, (yje) null), 10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        kwd kwdVar2 = e7e.d2;
                        str.getClass();
                        FileBottomDialogResult fileBottomDialogResult = (FileBottomDialogResult) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("FILE_DIALOG_RESULT_RESULT_KEY") : (Parcelable) bundle2.getParcelable("FILE_DIALOG_RESULT_RESULT_KEY", FileBottomDialogResult.class));
                        if (fileBottomDialogResult != null) {
                            fae faeVarJ1 = e7eVar.J0();
                            ol60 ol60Var = faeVarJ1.B;
                            zj2 zj2Var = faeVarJ1.A;
                            Object c9eVar = (f9e) zj2Var.getValue();
                            d9e d9eVar = c9eVar instanceof d9e ? (d9e) c9eVar : null;
                            if (d9eVar == null || (collection = d9eVar.f5696a) == null) {
                                collection = iun.f15405a;
                            }
                            boolean z2 = fileBottomDialogResult instanceof FileBottomDialogResult.FileResult;
                            if (z2) {
                                File file = ((FileBottomDialogResult.FileResult) fileBottomDialogResult).f46448a;
                                file.getClass();
                                if (kotlin.text.c.x(sj3.c0(file), "image", false)) {
                                    lc00 lc00VarB = kotlin.collections.a.b();
                                    lc00VarB.addAll(collection);
                                    lc00VarB.add(file);
                                    lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                                    HashSet hashSet2 = new HashSet();
                                    ArrayList arrayList2 = new ArrayList();
                                    ListIterator listIterator2 = lc00VarA.listIterator(0);
                                    while (true) {
                                        paw pawVar2 = (paw) listIterator2;
                                        if (pawVar2.hasNext()) {
                                            Object next2 = pawVar2.next();
                                            if (hashSet2.add(((File) next2).getAbsolutePath())) {
                                                arrayList2.add(next2);
                                            }
                                        } else {
                                            if (arrayList2.size() > 10) {
                                                ol60Var.f(new n6e());
                                            }
                                            c9eVar = new d9e(CollectionsKt.D0(arrayList2, 10));
                                        }
                                    }
                                } else if (fileBottomDialogResult instanceof FileBottomDialogResult.ImageResult) {
                                    lc00 lc00VarB4 = kotlin.collections.a.b();
                                    lc00VarB4.addAll(collection);
                                    lc00VarB4.addAll(((FileBottomDialogResult.ImageResult) fileBottomDialogResult).f46449a);
                                    lc00 lc00VarA4 = kotlin.collections.a.a(lc00VarB4);
                                    hashSet = new HashSet();
                                    arrayList = new ArrayList();
                                    listIterator = lc00VarA4.listIterator(0);
                                    while (true) {
                                        pawVar = (paw) listIterator;
                                        if (pawVar.hasNext()) {
                                            next = pawVar.next();
                                            if (hashSet.add(((File) next).getAbsolutePath())) {
                                                arrayList.add(next);
                                            }
                                        } else {
                                            if (arrayList.size() > 10) {
                                                ol60Var.f(new n6e());
                                            }
                                            c9eVar = new d9e(CollectionsKt.D0(arrayList, 10));
                                        }
                                    }
                                } else if (z2) {
                                    c9eVar = new c9e(((FileBottomDialogResult.FileResult) fileBottomDialogResult).f46448a);
                                }
                            } else if (fileBottomDialogResult instanceof FileBottomDialogResult.ImageResult) {
                                lc00 lc00VarB5 = kotlin.collections.a.b();
                                lc00VarB5.addAll(collection);
                                lc00VarB5.addAll(((FileBottomDialogResult.ImageResult) fileBottomDialogResult).f46449a);
                                lc00 lc00VarA5 = kotlin.collections.a.a(lc00VarB5);
                                hashSet = new HashSet();
                                arrayList = new ArrayList();
                                listIterator = lc00VarA5.listIterator(0);
                                while (true) {
                                    pawVar = (paw) listIterator;
                                    if (pawVar.hasNext()) {
                                        next = pawVar.next();
                                        if (hashSet.add(((File) next).getAbsolutePath())) {
                                            arrayList.add(next);
                                        }
                                    } else {
                                        if (arrayList.size() > 10) {
                                            ol60Var.f(new n6e());
                                        }
                                        c9eVar = new d9e(CollectionsKt.D0(arrayList, 10));
                                    }
                                }
                            } else if (z2) {
                                c9eVar = new c9e(((FileBottomDialogResult.FileResult) fileBottomDialogResult).f46448a);
                            }
                            zj2Var.f(c9eVar);
                        }
                        break;
                    default:
                        kwd kwdVar3 = e7e.d2;
                        str.getClass();
                        Object obj = bundle2.get("ERROR_DIALOG_RESULT_VALUE");
                        List<MessageErrorState> list = obj instanceof List ? (List) obj : null;
                        if (list != null) {
                            for (MessageErrorState messageErrorState : list) {
                                if (messageErrorState != null) {
                                    if (messageErrorState instanceof MessageErrorState.RemoveMessage) {
                                        fae faeVarJ2 = e7eVar.J0();
                                        String str2 = ((MessageErrorState.RemoveMessage) messageErrorState).f46452a;
                                        str2.getClass();
                                        qv qvVar = faeVarJ2.n;
                                        qvVar.getClass();
                                        ((i7e) qvVar.f29365a.c).d(str2);
                                    } else if (messageErrorState instanceof MessageErrorState.RetryUploading) {
                                        e7eVar.J0().z(((MessageErrorState.RetryUploading) messageErrorState).f46455a);
                                    } else if (messageErrorState instanceof MessageErrorState.RetryDownloading) {
                                        fae faeVarJ3 = e7eVar.J0();
                                        MessageErrorState.RetryDownloading retryDownloading = (MessageErrorState.RetryDownloading) messageErrorState;
                                        String str3 = retryDownloading.f46454a;
                                        String str4 = retryDownloading.b;
                                        long j = retryDownloading.c;
                                        boolean z3 = retryDownloading.d;
                                        str3.getClass();
                                        str4.getClass();
                                        faeVarJ3.x(z3 ? new pcl(str3, str4, j) : new qcl(str3, str4, j, w1x.MD));
                                    } else if (messageErrorState instanceof MessageErrorState.Resend) {
                                        e7eVar.J0().z(((MessageErrorState.Resend) messageErrorState).f46453a);
                                    }
                                }
                                t9f.b();
                            }
                        }
                        break;
                }
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(f7e.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            f7e f7eVar = (f7e) (ze3Var instanceof f7e ? ze3Var : null);
            if (f7eVar != null) {
                f6i f6iVarA = f7eVar.a(a4n0.f(this));
                this.M1 = (ii) f6iVarA.e;
                this.N1 = (wdk0) f6iVarA.f;
                this.P1 = (ddi) ((n5d0) f6iVarA.d).get();
                return;
            }
        }
        jf4.n(b1j.i(f7e.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = J0().J;
        Class<e7e> cls = e7e.class;
        d7e d7eVar = new d7e(2, this, cls, "onConsultantMessagesUiState", "onConsultantMessagesUiState(Lorg/xplatform/consultantchat/presentation/consultantchat/ConsultantChatViewModel$ConsultantMessagesUiState;)V", 4, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        yje yjeVar = null;
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cxd((gmq) p7m0Var, clzVarW, d7eVar, (yje) null, (byte) 0), 3);
        fae faeVarJ0 = J0();
        dnq dnqVar = new dnq(new fnq(faeVarJ0.K, new wib(faeVarJ0, yjeVar, (byte) 10)), new x9e(faeVarJ0, yjeVar, (byte) 0), (byte) 0);
        int i = 4;
        int i2 = 2;
        d7e d7eVar2 = new d7e(i2, this, cls, "onConsultantChatScrollAction", "onConsultantChatScrollAction(Lorg/xplatform/consultantchat/presentation/consultantchat/ConsultantChatViewModel$ConsultantChatScrollAction;)V", i, (byte) 2);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cxd(dnqVar, clzVarW2, d7eVar2, (yje) null), 3);
        p7m0 p7m0Var2 = J0().F;
        d7e d7eVar3 = new d7e(i2, this, cls, "onParticipantAction", "onParticipantAction(Lorg/xplatform/consultantchat/presentation/consultantchat/ConsultantChatViewModel$ParticipantActionsState;)V", i, (byte) 3);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new cxd((gmq) p7m0Var2, clzVarW3, d7eVar3, (yje) null, (char) 0), 3);
        p7m0 p7m0Var3 = J0().H;
        d7e d7eVar4 = new d7e(2, this, cls, "onChangeAllowInvokeOperatorState", "onChangeAllowInvokeOperatorState(Z)V", i, (byte) 4);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new cxd(p7m0Var3, clzVarW4, d7eVar4, (yje) null, 0), 3);
        p7m0 p7m0Var4 = J0().G;
        d7e d7eVar5 = new d7e(2, this, cls, "onChangeUnreadMessagesCount", "onChangeUnreadMessagesCount(I)V", i, (byte) 5);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new cxd((gmq) p7m0Var4, clzVarW5, d7eVar5, (yje) null, (short) 0), 3);
        ol60 ol60Var = J0().B;
        d7e d7eVar6 = new d7e(2, this, cls, "handleEvent", "handleEvent(Lorg/xplatform/consultantchat/presentation/consultantchat/model/ConsultantChatEvent;)V", i, (byte) 6);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new cxd((gmq) ol60Var, clzVarW6, d7eVar6, (yje) null, (byte) 0, false), 3);
        p7m0 p7m0Var5 = J0().I;
        d7e d7eVar7 = new d7e(2, this, cls, "handleAttachedFileState", "handleAttachedFileState(Lorg/xplatform/consultantchat/presentation/consultantchat/ConsultantChatViewModel$AttachedDocumentsUIState;)V", i, (byte) 7);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new cxd((gmq) p7m0Var5, clzVarW7, d7eVar7, (yje) null, (byte) 0, (byte) 0), 3);
        p7m0 p7m0Var6 = J0().D;
        d7e d7eVar8 = new d7e(2, this, cls, "handleEnableSendButtonState", "handleEnableSendButtonState(Lorg/xplatform/consultantchat/presentation/consultantchat/model/ChatBlockUiModel;)V", i, (byte) 8);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new cxd((gmq) p7m0Var6, clzVarW8, d7eVar8, (yje) null, (byte) 0, (char) 0), 3);
        p7m0 p7m0Var7 = ((i7e) J0().r.f29365a.c).h;
        d7e d7eVar9 = new d7e(2, this, cls, "handleMuteState", "handleMuteState(Z)V", i, (byte) 9);
        clz clzVarW9 = aac.W(this);
        qjj.W(x0x.Q(clzVarW9.x()), null, null, new cxd(p7m0Var7, clzVarW9, d7eVar9, (yje) null, (byte) 0, 0), 3);
        p7m0 p7m0Var8 = J0().M;
        int i3 = 2;
        c48 c48Var = new c48(i3, this, cls, "handleCountDown", "handleCountDown(Lorg/xplatform/consultantchat/presentation/consultantchat/ConsultantChatViewModel$CountDownState;)V", i, (byte) 29);
        clz clzVarW10 = aac.W(this);
        qjj.W(x0x.Q(clzVarW10.x()), null, null, new cxd(p7m0Var8, clzVarW10, c48Var, (yje) null), 3);
        qoj0 qoj0Var = ((i7e) J0().t.f25659a.c).l;
        lkz lkzVar2 = lkz.f20223a;
        d7e d7eVar10 = new d7e(i3, this, cls, "handleCheckFileResult", "handleCheckFileResult(Lorg/xplatform/consultantchat/domain/models/CheckFileResultModel;)V", i, (byte) 0);
        clz clzVarW11 = aac.W(this);
        qjj.W(x0x.Q(clzVarW11.x()), null, null, new cxd(qoj0Var, clzVarW11, d7eVar10, (yje) null), 3);
    }

    public final d6e G0() {
        return (d6e) this.V1.getValue();
    }

    public final kzq H0() {
        Object objN = this.O1.n(e2[0], this);
        objN.getClass();
        return (kzq) objN;
    }

    public final int I0() {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            androidx.recyclerview.widget.b layoutManager = H0().o.getLayoutManager();
            layoutManager.getClass();
            g0g0Var = Integer.valueOf(((LinearLayoutManager) layoutManager).h1());
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = 0;
        }
        return ((Number) g0g0Var).intValue();
    }

    public final fae J0() {
        return (fae) this.U1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        ndk0 ndk0Var = this.Q1;
        if (ndk0Var != null) {
            ndk0Var.dismiss();
        }
        b7e b7eVar = this.c2;
        if (b7eVar != null) {
            H0().o.u0(b7eVar);
        }
        Runnable runnable = this.b2;
        Handler handler = this.S1;
        handler.removeCallbacks(runnable);
        handler.removeCallbacks(this.Z1);
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        IBinder windowToken;
        View currentFocus = n0().getCurrentFocus();
        if (currentFocus != null && (windowToken = currentFocus.getWindowToken()) != null) {
            Context contextD = D();
            Object systemService = contextD != null ? contextD.getSystemService("input_method") : null;
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        hxm0.m(H0().f19163a);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        hxm0.n(H0().f19163a);
        super.e0();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        gmq dnqVar;
        super.g0();
        fae faeVarJ0 = J0();
        c4m0 c4m0Var = faeVarJ0.T;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            gz70 gz70Var = faeVarJ0.e;
            gz70Var.getClass();
            hy70 hy70Var = gz70.F;
            yje yjeVar = null;
            if (hy70Var instanceof fy70) {
                p7m0 p7m0VarA = q7m0.a(oom0.b);
                gz70.F = new gy70(p7m0VarA);
                dnqVar = new dnq(new fnq(p7m0VarA, new z210(gz70Var, yjeVar, (byte) 21)), new gbv(gz70Var, yjeVar, (byte) 13), (byte) 0);
            } else {
                if (!(hy70Var instanceof gy70)) {
                    t9f.b();
                    return;
                }
                dnqVar = ((gy70) hy70Var).f12114a;
            }
            faeVarJ0.T = slb.U(new dnq(new fnq(dnqVar, new aae(faeVarJ0, yjeVar, (byte) 9), (byte) 4), new bae(faeVarJ0, yjeVar, (byte) 3), (byte) 1), d5c.S(jiu0.a(faeVarJ0), faeVarJ0.k.b));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        c4m0 c4m0Var = J0().T;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.L1;
    }
}
