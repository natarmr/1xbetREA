package org.xplatform.game_broadcasting.impl.presentation.video.window_screen;

import a.a8z;
import a.c4m0;
import a.cyu;
import a.czs;
import a.e0g0;
import a.fiu0;
import a.fnq;
import a.fns;
import a.gkr;
import a.glz;
import a.gmq;
import a.ic3;
import a.j0g0;
import a.j0s;
import a.lkz;
import a.lzs;
import a.maz;
import a.miu0;
import a.mlz;
import a.n0o0;
import a.p7m0;
import a.pfl;
import a.qjj;
import a.uai;
import a.wcf0;
import a.wej;
import a.wez;
import a.wzs;
import a.x0x;
import a.yje;
import a.yop;
import a.yzs;
import a.zn00;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.impl.presentation.video.GameVideoView;
import org.xplatform.game_broadcasting.impl.presentation.video.window_screen.GameVideoWindowService;

/* JADX INFO: loaded from: classes4.dex */
public final class GameVideoWindowService extends mlz {
    public static final /* synthetic */ int k = 0;
    public final n0o0 b;
    public wzs c;
    public final a8z d;
    public final a8z e;
    public final a8z f;
    public final a8z g;
    public final a8z h;
    public final a8z i;
    public final a8z j;

    public GameVideoWindowService() {
        final byte b = 0;
        this.b = maz.b(new Function0(this) { // from class: a.xzs
            public final /* synthetic */ GameVideoWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                GameVideoWindowService gameVideoWindowService = this.b;
                switch (b2) {
                    case 0:
                        int i = GameVideoWindowService.k;
                        Application application = gameVideoWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(n69.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof n69)) {
                                ze3Var = null;
                            }
                            n69 n69Var = (n69) ze3Var;
                            if (n69Var != null) {
                                sre0.f32672a.b(GameVideoWindowService.class).J();
                                us00 us00Var = n69Var.f22986a;
                                oeg0 oeg0Var = n69Var.b;
                                nhv0 nhv0Var = n69Var.c;
                                ysr ysrVar = n69Var.d;
                                m49 m49Var = n69Var.g;
                                n49 n49Var = n69Var.h;
                                m1e m1eVar = n69Var.i;
                                mne mneVar = n69Var.j;
                                atr atrVar = n69Var.e;
                                rsr rsrVar = n69Var.f;
                                meu0 meu0Var = n69Var.k;
                                mi70 mi70Var = n69Var.l;
                                b3c0 b3c0Var = n69Var.m;
                                gst0 gst0Var = n69Var.n;
                                ik4 ik4Var = n69Var.o;
                                vd1 vd1Var = n69Var.p;
                                pru pruVar = n69Var.q;
                                r9u r9uVar = n69Var.r;
                                c49 c49Var = n69Var.s;
                                viu viuVar = n69Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                m1eVar.getClass();
                                meu0Var.getClass();
                                b3c0Var.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new uai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, meu0Var, mi70Var, b3c0Var, gst0Var, ik4Var, vd1Var, pruVar, r9uVar, c49Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(n69.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameVideoWindowService.k;
                        return new GameVideoView(gameVideoWindowService, null);
                    case 2:
                        int i3 = GameVideoWindowService.k;
                        FrameLayout frameLayout = new FrameLayout(gameVideoWindowService);
                        frameLayout.setLayoutDirection(cy7.c() ? 1 : 0);
                        return frameLayout;
                    case 3:
                        int i4 = GameVideoWindowService.k;
                        View view = new View(gameVideoWindowService);
                        view.setVisibility(8);
                        view.setBackgroundColor(gameVideoWindowService.getColor(R.color.static_black_60));
                        return view;
                    case 4:
                        int i5 = GameVideoWindowService.k;
                        FrameLayout frameLayout2 = new FrameLayout(gameVideoWindowService);
                        frameLayout2.setVisibility(8);
                        frameLayout2.setOnClickListener(new q10(gameVideoWindowService, (byte) 23));
                        ImageView imageView = new ImageView(gameVideoWindowService);
                        imageView.setImageResource(R.drawable.ic_glyph_circle_lock);
                        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), 17));
                        return frameLayout2;
                    case 5:
                        int i6 = GameVideoWindowService.k;
                        FrameLayout frameLayout3 = new FrameLayout(gameVideoWindowService);
                        frameLayout3.setVisibility(8);
                        frameLayout3.setClickable(false);
                        frameLayout3.setFocusable(false);
                        TextView textView = new TextView(gameVideoWindowService);
                        textView.setText(R.string.error_get_data);
                        textView.setTextColor(gameVideoWindowService.getColor(R.color.static_white));
                        textView.setTextAppearance(R.style.TextAppearance_Text_Regular);
                        frameLayout3.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
                        return frameLayout3;
                    case 6:
                        int i7 = GameVideoWindowService.k;
                        Object systemService = gameVideoWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i8 = GameVideoWindowService.k;
                        return new WindowManager.LayoutParams((int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        });
        final byte b2 = 1;
        Function0 function0 = new Function0(this) { // from class: a.xzs
            public final /* synthetic */ GameVideoWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                GameVideoWindowService gameVideoWindowService = this.b;
                switch (b3) {
                    case 0:
                        int i = GameVideoWindowService.k;
                        Application application = gameVideoWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(n69.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof n69)) {
                                ze3Var = null;
                            }
                            n69 n69Var = (n69) ze3Var;
                            if (n69Var != null) {
                                sre0.f32672a.b(GameVideoWindowService.class).J();
                                us00 us00Var = n69Var.f22986a;
                                oeg0 oeg0Var = n69Var.b;
                                nhv0 nhv0Var = n69Var.c;
                                ysr ysrVar = n69Var.d;
                                m49 m49Var = n69Var.g;
                                n49 n49Var = n69Var.h;
                                m1e m1eVar = n69Var.i;
                                mne mneVar = n69Var.j;
                                atr atrVar = n69Var.e;
                                rsr rsrVar = n69Var.f;
                                meu0 meu0Var = n69Var.k;
                                mi70 mi70Var = n69Var.l;
                                b3c0 b3c0Var = n69Var.m;
                                gst0 gst0Var = n69Var.n;
                                ik4 ik4Var = n69Var.o;
                                vd1 vd1Var = n69Var.p;
                                pru pruVar = n69Var.q;
                                r9u r9uVar = n69Var.r;
                                c49 c49Var = n69Var.s;
                                viu viuVar = n69Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                m1eVar.getClass();
                                meu0Var.getClass();
                                b3c0Var.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new uai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, meu0Var, mi70Var, b3c0Var, gst0Var, ik4Var, vd1Var, pruVar, r9uVar, c49Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(n69.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameVideoWindowService.k;
                        return new GameVideoView(gameVideoWindowService, null);
                    case 2:
                        int i3 = GameVideoWindowService.k;
                        FrameLayout frameLayout = new FrameLayout(gameVideoWindowService);
                        frameLayout.setLayoutDirection(cy7.c() ? 1 : 0);
                        return frameLayout;
                    case 3:
                        int i4 = GameVideoWindowService.k;
                        View view = new View(gameVideoWindowService);
                        view.setVisibility(8);
                        view.setBackgroundColor(gameVideoWindowService.getColor(R.color.static_black_60));
                        return view;
                    case 4:
                        int i5 = GameVideoWindowService.k;
                        FrameLayout frameLayout2 = new FrameLayout(gameVideoWindowService);
                        frameLayout2.setVisibility(8);
                        frameLayout2.setOnClickListener(new q10(gameVideoWindowService, (byte) 23));
                        ImageView imageView = new ImageView(gameVideoWindowService);
                        imageView.setImageResource(R.drawable.ic_glyph_circle_lock);
                        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), 17));
                        return frameLayout2;
                    case 5:
                        int i6 = GameVideoWindowService.k;
                        FrameLayout frameLayout3 = new FrameLayout(gameVideoWindowService);
                        frameLayout3.setVisibility(8);
                        frameLayout3.setClickable(false);
                        frameLayout3.setFocusable(false);
                        TextView textView = new TextView(gameVideoWindowService);
                        textView.setText(R.string.error_get_data);
                        textView.setTextColor(gameVideoWindowService.getColor(R.color.static_white));
                        textView.setTextAppearance(R.style.TextAppearance_Text_Regular);
                        frameLayout3.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
                        return frameLayout3;
                    case 6:
                        int i7 = GameVideoWindowService.k;
                        Object systemService = gameVideoWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i8 = GameVideoWindowService.k;
                        return new WindowManager.LayoutParams((int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        };
        wez wezVar = wez.b;
        this.d = maz.a(wezVar, function0);
        final byte b3 = 2;
        this.e = maz.a(wezVar, new Function0(this) { // from class: a.xzs
            public final /* synthetic */ GameVideoWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                GameVideoWindowService gameVideoWindowService = this.b;
                switch (b4) {
                    case 0:
                        int i = GameVideoWindowService.k;
                        Application application = gameVideoWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(n69.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof n69)) {
                                ze3Var = null;
                            }
                            n69 n69Var = (n69) ze3Var;
                            if (n69Var != null) {
                                sre0.f32672a.b(GameVideoWindowService.class).J();
                                us00 us00Var = n69Var.f22986a;
                                oeg0 oeg0Var = n69Var.b;
                                nhv0 nhv0Var = n69Var.c;
                                ysr ysrVar = n69Var.d;
                                m49 m49Var = n69Var.g;
                                n49 n49Var = n69Var.h;
                                m1e m1eVar = n69Var.i;
                                mne mneVar = n69Var.j;
                                atr atrVar = n69Var.e;
                                rsr rsrVar = n69Var.f;
                                meu0 meu0Var = n69Var.k;
                                mi70 mi70Var = n69Var.l;
                                b3c0 b3c0Var = n69Var.m;
                                gst0 gst0Var = n69Var.n;
                                ik4 ik4Var = n69Var.o;
                                vd1 vd1Var = n69Var.p;
                                pru pruVar = n69Var.q;
                                r9u r9uVar = n69Var.r;
                                c49 c49Var = n69Var.s;
                                viu viuVar = n69Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                m1eVar.getClass();
                                meu0Var.getClass();
                                b3c0Var.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new uai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, meu0Var, mi70Var, b3c0Var, gst0Var, ik4Var, vd1Var, pruVar, r9uVar, c49Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(n69.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameVideoWindowService.k;
                        return new GameVideoView(gameVideoWindowService, null);
                    case 2:
                        int i3 = GameVideoWindowService.k;
                        FrameLayout frameLayout = new FrameLayout(gameVideoWindowService);
                        frameLayout.setLayoutDirection(cy7.c() ? 1 : 0);
                        return frameLayout;
                    case 3:
                        int i4 = GameVideoWindowService.k;
                        View view = new View(gameVideoWindowService);
                        view.setVisibility(8);
                        view.setBackgroundColor(gameVideoWindowService.getColor(R.color.static_black_60));
                        return view;
                    case 4:
                        int i5 = GameVideoWindowService.k;
                        FrameLayout frameLayout2 = new FrameLayout(gameVideoWindowService);
                        frameLayout2.setVisibility(8);
                        frameLayout2.setOnClickListener(new q10(gameVideoWindowService, (byte) 23));
                        ImageView imageView = new ImageView(gameVideoWindowService);
                        imageView.setImageResource(R.drawable.ic_glyph_circle_lock);
                        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), 17));
                        return frameLayout2;
                    case 5:
                        int i6 = GameVideoWindowService.k;
                        FrameLayout frameLayout3 = new FrameLayout(gameVideoWindowService);
                        frameLayout3.setVisibility(8);
                        frameLayout3.setClickable(false);
                        frameLayout3.setFocusable(false);
                        TextView textView = new TextView(gameVideoWindowService);
                        textView.setText(R.string.error_get_data);
                        textView.setTextColor(gameVideoWindowService.getColor(R.color.static_white));
                        textView.setTextAppearance(R.style.TextAppearance_Text_Regular);
                        frameLayout3.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
                        return frameLayout3;
                    case 6:
                        int i7 = GameVideoWindowService.k;
                        Object systemService = gameVideoWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i8 = GameVideoWindowService.k;
                        return new WindowManager.LayoutParams((int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        });
        final byte b4 = 3;
        this.f = maz.a(wezVar, new Function0(this) { // from class: a.xzs
            public final /* synthetic */ GameVideoWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                GameVideoWindowService gameVideoWindowService = this.b;
                switch (b5) {
                    case 0:
                        int i = GameVideoWindowService.k;
                        Application application = gameVideoWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(n69.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof n69)) {
                                ze3Var = null;
                            }
                            n69 n69Var = (n69) ze3Var;
                            if (n69Var != null) {
                                sre0.f32672a.b(GameVideoWindowService.class).J();
                                us00 us00Var = n69Var.f22986a;
                                oeg0 oeg0Var = n69Var.b;
                                nhv0 nhv0Var = n69Var.c;
                                ysr ysrVar = n69Var.d;
                                m49 m49Var = n69Var.g;
                                n49 n49Var = n69Var.h;
                                m1e m1eVar = n69Var.i;
                                mne mneVar = n69Var.j;
                                atr atrVar = n69Var.e;
                                rsr rsrVar = n69Var.f;
                                meu0 meu0Var = n69Var.k;
                                mi70 mi70Var = n69Var.l;
                                b3c0 b3c0Var = n69Var.m;
                                gst0 gst0Var = n69Var.n;
                                ik4 ik4Var = n69Var.o;
                                vd1 vd1Var = n69Var.p;
                                pru pruVar = n69Var.q;
                                r9u r9uVar = n69Var.r;
                                c49 c49Var = n69Var.s;
                                viu viuVar = n69Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                m1eVar.getClass();
                                meu0Var.getClass();
                                b3c0Var.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new uai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, meu0Var, mi70Var, b3c0Var, gst0Var, ik4Var, vd1Var, pruVar, r9uVar, c49Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(n69.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameVideoWindowService.k;
                        return new GameVideoView(gameVideoWindowService, null);
                    case 2:
                        int i3 = GameVideoWindowService.k;
                        FrameLayout frameLayout = new FrameLayout(gameVideoWindowService);
                        frameLayout.setLayoutDirection(cy7.c() ? 1 : 0);
                        return frameLayout;
                    case 3:
                        int i4 = GameVideoWindowService.k;
                        View view = new View(gameVideoWindowService);
                        view.setVisibility(8);
                        view.setBackgroundColor(gameVideoWindowService.getColor(R.color.static_black_60));
                        return view;
                    case 4:
                        int i5 = GameVideoWindowService.k;
                        FrameLayout frameLayout2 = new FrameLayout(gameVideoWindowService);
                        frameLayout2.setVisibility(8);
                        frameLayout2.setOnClickListener(new q10(gameVideoWindowService, (byte) 23));
                        ImageView imageView = new ImageView(gameVideoWindowService);
                        imageView.setImageResource(R.drawable.ic_glyph_circle_lock);
                        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), 17));
                        return frameLayout2;
                    case 5:
                        int i6 = GameVideoWindowService.k;
                        FrameLayout frameLayout3 = new FrameLayout(gameVideoWindowService);
                        frameLayout3.setVisibility(8);
                        frameLayout3.setClickable(false);
                        frameLayout3.setFocusable(false);
                        TextView textView = new TextView(gameVideoWindowService);
                        textView.setText(R.string.error_get_data);
                        textView.setTextColor(gameVideoWindowService.getColor(R.color.static_white));
                        textView.setTextAppearance(R.style.TextAppearance_Text_Regular);
                        frameLayout3.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
                        return frameLayout3;
                    case 6:
                        int i7 = GameVideoWindowService.k;
                        Object systemService = gameVideoWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i8 = GameVideoWindowService.k;
                        return new WindowManager.LayoutParams((int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        });
        final byte b5 = 4;
        this.g = maz.a(wezVar, new Function0(this) { // from class: a.xzs
            public final /* synthetic */ GameVideoWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                GameVideoWindowService gameVideoWindowService = this.b;
                switch (b6) {
                    case 0:
                        int i = GameVideoWindowService.k;
                        Application application = gameVideoWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(n69.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof n69)) {
                                ze3Var = null;
                            }
                            n69 n69Var = (n69) ze3Var;
                            if (n69Var != null) {
                                sre0.f32672a.b(GameVideoWindowService.class).J();
                                us00 us00Var = n69Var.f22986a;
                                oeg0 oeg0Var = n69Var.b;
                                nhv0 nhv0Var = n69Var.c;
                                ysr ysrVar = n69Var.d;
                                m49 m49Var = n69Var.g;
                                n49 n49Var = n69Var.h;
                                m1e m1eVar = n69Var.i;
                                mne mneVar = n69Var.j;
                                atr atrVar = n69Var.e;
                                rsr rsrVar = n69Var.f;
                                meu0 meu0Var = n69Var.k;
                                mi70 mi70Var = n69Var.l;
                                b3c0 b3c0Var = n69Var.m;
                                gst0 gst0Var = n69Var.n;
                                ik4 ik4Var = n69Var.o;
                                vd1 vd1Var = n69Var.p;
                                pru pruVar = n69Var.q;
                                r9u r9uVar = n69Var.r;
                                c49 c49Var = n69Var.s;
                                viu viuVar = n69Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                m1eVar.getClass();
                                meu0Var.getClass();
                                b3c0Var.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new uai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, meu0Var, mi70Var, b3c0Var, gst0Var, ik4Var, vd1Var, pruVar, r9uVar, c49Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(n69.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameVideoWindowService.k;
                        return new GameVideoView(gameVideoWindowService, null);
                    case 2:
                        int i3 = GameVideoWindowService.k;
                        FrameLayout frameLayout = new FrameLayout(gameVideoWindowService);
                        frameLayout.setLayoutDirection(cy7.c() ? 1 : 0);
                        return frameLayout;
                    case 3:
                        int i4 = GameVideoWindowService.k;
                        View view = new View(gameVideoWindowService);
                        view.setVisibility(8);
                        view.setBackgroundColor(gameVideoWindowService.getColor(R.color.static_black_60));
                        return view;
                    case 4:
                        int i5 = GameVideoWindowService.k;
                        FrameLayout frameLayout2 = new FrameLayout(gameVideoWindowService);
                        frameLayout2.setVisibility(8);
                        frameLayout2.setOnClickListener(new q10(gameVideoWindowService, (byte) 23));
                        ImageView imageView = new ImageView(gameVideoWindowService);
                        imageView.setImageResource(R.drawable.ic_glyph_circle_lock);
                        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), 17));
                        return frameLayout2;
                    case 5:
                        int i6 = GameVideoWindowService.k;
                        FrameLayout frameLayout3 = new FrameLayout(gameVideoWindowService);
                        frameLayout3.setVisibility(8);
                        frameLayout3.setClickable(false);
                        frameLayout3.setFocusable(false);
                        TextView textView = new TextView(gameVideoWindowService);
                        textView.setText(R.string.error_get_data);
                        textView.setTextColor(gameVideoWindowService.getColor(R.color.static_white));
                        textView.setTextAppearance(R.style.TextAppearance_Text_Regular);
                        frameLayout3.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
                        return frameLayout3;
                    case 6:
                        int i7 = GameVideoWindowService.k;
                        Object systemService = gameVideoWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i8 = GameVideoWindowService.k;
                        return new WindowManager.LayoutParams((int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        });
        final byte b6 = 5;
        this.h = maz.a(wezVar, new Function0(this) { // from class: a.xzs
            public final /* synthetic */ GameVideoWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                GameVideoWindowService gameVideoWindowService = this.b;
                switch (b7) {
                    case 0:
                        int i = GameVideoWindowService.k;
                        Application application = gameVideoWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(n69.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof n69)) {
                                ze3Var = null;
                            }
                            n69 n69Var = (n69) ze3Var;
                            if (n69Var != null) {
                                sre0.f32672a.b(GameVideoWindowService.class).J();
                                us00 us00Var = n69Var.f22986a;
                                oeg0 oeg0Var = n69Var.b;
                                nhv0 nhv0Var = n69Var.c;
                                ysr ysrVar = n69Var.d;
                                m49 m49Var = n69Var.g;
                                n49 n49Var = n69Var.h;
                                m1e m1eVar = n69Var.i;
                                mne mneVar = n69Var.j;
                                atr atrVar = n69Var.e;
                                rsr rsrVar = n69Var.f;
                                meu0 meu0Var = n69Var.k;
                                mi70 mi70Var = n69Var.l;
                                b3c0 b3c0Var = n69Var.m;
                                gst0 gst0Var = n69Var.n;
                                ik4 ik4Var = n69Var.o;
                                vd1 vd1Var = n69Var.p;
                                pru pruVar = n69Var.q;
                                r9u r9uVar = n69Var.r;
                                c49 c49Var = n69Var.s;
                                viu viuVar = n69Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                m1eVar.getClass();
                                meu0Var.getClass();
                                b3c0Var.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new uai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, meu0Var, mi70Var, b3c0Var, gst0Var, ik4Var, vd1Var, pruVar, r9uVar, c49Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(n69.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameVideoWindowService.k;
                        return new GameVideoView(gameVideoWindowService, null);
                    case 2:
                        int i3 = GameVideoWindowService.k;
                        FrameLayout frameLayout = new FrameLayout(gameVideoWindowService);
                        frameLayout.setLayoutDirection(cy7.c() ? 1 : 0);
                        return frameLayout;
                    case 3:
                        int i4 = GameVideoWindowService.k;
                        View view = new View(gameVideoWindowService);
                        view.setVisibility(8);
                        view.setBackgroundColor(gameVideoWindowService.getColor(R.color.static_black_60));
                        return view;
                    case 4:
                        int i5 = GameVideoWindowService.k;
                        FrameLayout frameLayout2 = new FrameLayout(gameVideoWindowService);
                        frameLayout2.setVisibility(8);
                        frameLayout2.setOnClickListener(new q10(gameVideoWindowService, (byte) 23));
                        ImageView imageView = new ImageView(gameVideoWindowService);
                        imageView.setImageResource(R.drawable.ic_glyph_circle_lock);
                        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), 17));
                        return frameLayout2;
                    case 5:
                        int i6 = GameVideoWindowService.k;
                        FrameLayout frameLayout3 = new FrameLayout(gameVideoWindowService);
                        frameLayout3.setVisibility(8);
                        frameLayout3.setClickable(false);
                        frameLayout3.setFocusable(false);
                        TextView textView = new TextView(gameVideoWindowService);
                        textView.setText(R.string.error_get_data);
                        textView.setTextColor(gameVideoWindowService.getColor(R.color.static_white));
                        textView.setTextAppearance(R.style.TextAppearance_Text_Regular);
                        frameLayout3.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
                        return frameLayout3;
                    case 6:
                        int i7 = GameVideoWindowService.k;
                        Object systemService = gameVideoWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i8 = GameVideoWindowService.k;
                        return new WindowManager.LayoutParams((int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        });
        final byte b7 = 6;
        this.i = maz.a(wezVar, new Function0(this) { // from class: a.xzs
            public final /* synthetic */ GameVideoWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b8 = b7;
                GameVideoWindowService gameVideoWindowService = this.b;
                switch (b8) {
                    case 0:
                        int i = GameVideoWindowService.k;
                        Application application = gameVideoWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(n69.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof n69)) {
                                ze3Var = null;
                            }
                            n69 n69Var = (n69) ze3Var;
                            if (n69Var != null) {
                                sre0.f32672a.b(GameVideoWindowService.class).J();
                                us00 us00Var = n69Var.f22986a;
                                oeg0 oeg0Var = n69Var.b;
                                nhv0 nhv0Var = n69Var.c;
                                ysr ysrVar = n69Var.d;
                                m49 m49Var = n69Var.g;
                                n49 n49Var = n69Var.h;
                                m1e m1eVar = n69Var.i;
                                mne mneVar = n69Var.j;
                                atr atrVar = n69Var.e;
                                rsr rsrVar = n69Var.f;
                                meu0 meu0Var = n69Var.k;
                                mi70 mi70Var = n69Var.l;
                                b3c0 b3c0Var = n69Var.m;
                                gst0 gst0Var = n69Var.n;
                                ik4 ik4Var = n69Var.o;
                                vd1 vd1Var = n69Var.p;
                                pru pruVar = n69Var.q;
                                r9u r9uVar = n69Var.r;
                                c49 c49Var = n69Var.s;
                                viu viuVar = n69Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                m1eVar.getClass();
                                meu0Var.getClass();
                                b3c0Var.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new uai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, meu0Var, mi70Var, b3c0Var, gst0Var, ik4Var, vd1Var, pruVar, r9uVar, c49Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(n69.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameVideoWindowService.k;
                        return new GameVideoView(gameVideoWindowService, null);
                    case 2:
                        int i3 = GameVideoWindowService.k;
                        FrameLayout frameLayout = new FrameLayout(gameVideoWindowService);
                        frameLayout.setLayoutDirection(cy7.c() ? 1 : 0);
                        return frameLayout;
                    case 3:
                        int i4 = GameVideoWindowService.k;
                        View view = new View(gameVideoWindowService);
                        view.setVisibility(8);
                        view.setBackgroundColor(gameVideoWindowService.getColor(R.color.static_black_60));
                        return view;
                    case 4:
                        int i5 = GameVideoWindowService.k;
                        FrameLayout frameLayout2 = new FrameLayout(gameVideoWindowService);
                        frameLayout2.setVisibility(8);
                        frameLayout2.setOnClickListener(new q10(gameVideoWindowService, (byte) 23));
                        ImageView imageView = new ImageView(gameVideoWindowService);
                        imageView.setImageResource(R.drawable.ic_glyph_circle_lock);
                        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), 17));
                        return frameLayout2;
                    case 5:
                        int i6 = GameVideoWindowService.k;
                        FrameLayout frameLayout3 = new FrameLayout(gameVideoWindowService);
                        frameLayout3.setVisibility(8);
                        frameLayout3.setClickable(false);
                        frameLayout3.setFocusable(false);
                        TextView textView = new TextView(gameVideoWindowService);
                        textView.setText(R.string.error_get_data);
                        textView.setTextColor(gameVideoWindowService.getColor(R.color.static_white));
                        textView.setTextAppearance(R.style.TextAppearance_Text_Regular);
                        frameLayout3.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
                        return frameLayout3;
                    case 6:
                        int i7 = GameVideoWindowService.k;
                        Object systemService = gameVideoWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i8 = GameVideoWindowService.k;
                        return new WindowManager.LayoutParams((int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        });
        final byte b8 = 7;
        this.j = maz.a(wezVar, new Function0(this) { // from class: a.xzs
            public final /* synthetic */ GameVideoWindowService b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b9 = b8;
                GameVideoWindowService gameVideoWindowService = this.b;
                switch (b9) {
                    case 0:
                        int i = GameVideoWindowService.k;
                        Application application = gameVideoWindowService.getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(n69.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof n69)) {
                                ze3Var = null;
                            }
                            n69 n69Var = (n69) ze3Var;
                            if (n69Var != null) {
                                sre0.f32672a.b(GameVideoWindowService.class).J();
                                us00 us00Var = n69Var.f22986a;
                                oeg0 oeg0Var = n69Var.b;
                                nhv0 nhv0Var = n69Var.c;
                                ysr ysrVar = n69Var.d;
                                m49 m49Var = n69Var.g;
                                n49 n49Var = n69Var.h;
                                m1e m1eVar = n69Var.i;
                                mne mneVar = n69Var.j;
                                atr atrVar = n69Var.e;
                                rsr rsrVar = n69Var.f;
                                meu0 meu0Var = n69Var.k;
                                mi70 mi70Var = n69Var.l;
                                b3c0 b3c0Var = n69Var.m;
                                gst0 gst0Var = n69Var.n;
                                ik4 ik4Var = n69Var.o;
                                vd1 vd1Var = n69Var.p;
                                pru pruVar = n69Var.q;
                                r9u r9uVar = n69Var.r;
                                c49 c49Var = n69Var.s;
                                viu viuVar = n69Var.t;
                                oeg0Var.getClass();
                                nhv0Var.getClass();
                                ysrVar.getClass();
                                atrVar.getClass();
                                rsrVar.getClass();
                                m49Var.getClass();
                                n49Var.getClass();
                                m1eVar.getClass();
                                meu0Var.getClass();
                                b3c0Var.getClass();
                                gst0Var.getClass();
                                r9uVar.getClass();
                                c49Var.getClass();
                                return new uai(us00Var, oeg0Var, nhv0Var, ysrVar, atrVar, rsrVar, m49Var, n49Var, m1eVar, mneVar, meu0Var, mi70Var, b3c0Var, gst0Var, ik4Var, vd1Var, pruVar, r9uVar, c49Var, viuVar);
                            }
                        }
                        jf4.n(b1j.i(n69.class, "Cannot create dependency "));
                        return null;
                    case 1:
                        int i2 = GameVideoWindowService.k;
                        return new GameVideoView(gameVideoWindowService, null);
                    case 2:
                        int i3 = GameVideoWindowService.k;
                        FrameLayout frameLayout = new FrameLayout(gameVideoWindowService);
                        frameLayout.setLayoutDirection(cy7.c() ? 1 : 0);
                        return frameLayout;
                    case 3:
                        int i4 = GameVideoWindowService.k;
                        View view = new View(gameVideoWindowService);
                        view.setVisibility(8);
                        view.setBackgroundColor(gameVideoWindowService.getColor(R.color.static_black_60));
                        return view;
                    case 4:
                        int i5 = GameVideoWindowService.k;
                        FrameLayout frameLayout2 = new FrameLayout(gameVideoWindowService);
                        frameLayout2.setVisibility(8);
                        frameLayout2.setOnClickListener(new q10(gameVideoWindowService, (byte) 23));
                        ImageView imageView = new ImageView(gameVideoWindowService);
                        imageView.setImageResource(R.drawable.ic_glyph_circle_lock);
                        frameLayout2.addView(imageView, new FrameLayout.LayoutParams(frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), frameLayout2.getResources().getDimensionPixelSize(R.dimen.size_40), 17));
                        return frameLayout2;
                    case 5:
                        int i6 = GameVideoWindowService.k;
                        FrameLayout frameLayout3 = new FrameLayout(gameVideoWindowService);
                        frameLayout3.setVisibility(8);
                        frameLayout3.setClickable(false);
                        frameLayout3.setFocusable(false);
                        TextView textView = new TextView(gameVideoWindowService);
                        textView.setText(R.string.error_get_data);
                        textView.setTextColor(gameVideoWindowService.getColor(R.color.static_white));
                        textView.setTextAppearance(R.style.TextAppearance_Text_Regular);
                        frameLayout3.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
                        return frameLayout3;
                    case 6:
                        int i7 = GameVideoWindowService.k;
                        Object systemService = gameVideoWindowService.getSystemService("window");
                        systemService.getClass();
                        return (WindowManager) systemService;
                    default:
                        int i8 = GameVideoWindowService.k;
                        return new WindowManager.LayoutParams((int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_width), (int) gameVideoWindowService.getResources().getDimension(R.dimen.floating_video_height), Build.VERSION.SDK_INT >= 26 ? 2038 : CommonConstant.RETCODE.INTERFACE_PARAMS_ERROR, 262152, -3);
                }
            }
        });
    }

    public final GameVideoView a() {
        return (GameVideoView) this.d.getValue();
    }

    public final FrameLayout b() {
        return (FrameLayout) this.g.getValue();
    }

    public final FrameLayout c() {
        return (FrameLayout) this.e.getValue();
    }

    @Override // a.mlz, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.c = (wzs) new zn00((mlz) this, (miu0) new fiu0(wcf0.h(wzs.class, ((uai) this.b.getValue()).x))).h0(wzs.class);
    }

    @Override // a.mlz, android.app.Service
    public final void onDestroy() {
        a().f();
        wzs wzsVar = this.c;
        if (wzsVar == null) {
            Intrinsics.h("viewModel");
            throw null;
        }
        wzsVar.z();
        try {
            e0g0 e0g0Var = j0g0.b;
            ((WindowManager) this.i.getValue()).removeView(c());
        } catch (Throwable unused) {
            e0g0 e0g0Var2 = j0g0.b;
        }
        super.onDestroy();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x013e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0152  */
    /* JADX WARN: Code duplicated, block: B:49:0x016f  */
    /* JADX WARN: Code duplicated, block: B:51:0x018d  */
    /* JADX WARN: Code duplicated, block: B:53:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x0217  */
    /* JADX WARN: Code duplicated, block: B:62:0x0238  */
    /* JADX WARN: Code duplicated, block: B:64:0x023c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0240  */
    /* JADX WARN: Code duplicated, block: B:68:0x0244  */
    /* JADX WARN: Code duplicated, block: B:70:0x0248  */
    /* JADX WARN: Code duplicated, block: B:72:0x024c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0250  */
    /* JADX WARN: Code duplicated, block: B:76:0x0254  */
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        GameVideoView gameVideoViewA;
        GameVideoView gameVideoViewA2;
        wzs wzsVar;
        GameVideoView gameVideoViewA3;
        wzs wzsVar2;
        GameVideoView gameVideoViewA4;
        wzs wzsVar3;
        GameVideoView gameVideoViewA5;
        wzs wzsVar4;
        GameVideoView gameVideoViewA6;
        wzs wzsVar5;
        wzs wzsVar6;
        cyu cyuVar;
        wzs wzsVar7;
        wzs wzsVar8;
        Object value;
        yje yjeVar = null;
        String action = intent != null ? intent.getAction() : null;
        byte b = 0;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -528730005) {
                if (iHashCode == 785908365 && action.equals("ACTION_PAUSE")) {
                    wzs wzsVar9 = this.c;
                    if (wzsVar9 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    wzsVar9.y();
                    p7m0 p7m0Var = wzsVar9.u;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, czs.a((czs) value, 0L, 0L, null, 0L, null, false, false, false, false, false, false, false, null, 49151)));
                    stopSelf();
                } else {
                    if (c().getParent() != null) {
                        return super.onStartCommand(intent, i, i2);
                    }
                    gameVideoViewA = a();
                    if (c().getParent() == null) {
                        gameVideoViewA.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        c().addView(gameVideoViewA);
                        c().addView((View) this.f.getValue(), new FrameLayout.LayoutParams(-1, -1));
                        c().addView(b(), new FrameLayout.LayoutParams(-1, -1));
                        c().addView((FrameLayout) this.h.getValue(), new FrameLayout.LayoutParams(-1, -1));
                        a8z a8zVar = this.j;
                        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) a8zVar.getValue();
                        layoutParams.gravity = 17;
                        layoutParams.x = 0;
                        layoutParams.y = 0;
                        ((WindowManager) this.i.getValue()).addView(c(), (WindowManager.LayoutParams) a8zVar.getValue());
                        c().setOutlineProvider(new ic3(this, (byte) 3));
                        c().setClipToOutline(true);
                        gameVideoViewA.getBroadcastingContainerView().setOnTouchListener(new yzs(this));
                    }
                    gameVideoViewA2 = a();
                    wzsVar = this.c;
                    if (wzsVar == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    gameVideoViewA2.getClass();
                    gameVideoViewA2.getBroadcastingControlPanelView().u(wzsVar);
                    gameVideoViewA3 = a();
                    wzsVar2 = this.c;
                    if (wzsVar2 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    gameVideoViewA3.setOnMediaFileReddyListener(new wej(0, wzsVar2, wzs.class, "onMediaFileReddy", "onMediaFileReddy()V", 0, (byte) 25));
                    gameVideoViewA4 = a();
                    wzsVar3 = this.c;
                    if (wzsVar3 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    gameVideoViewA4.setOnMediaFileNeedReloadListener(new wej(0, wzsVar3, wzs.class, "onMediaFileError", "onMediaFileError()V", 0, (byte) 26));
                    gameVideoViewA5 = a();
                    wzsVar4 = this.c;
                    if (wzsVar4 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    gameVideoViewA5.setOnContainerClickListener(new wej(0, wzsVar4, wzs.class, "onVideoContainerClick", "onVideoContainerClick()V", 0, (byte) 27));
                    gameVideoViewA6 = a();
                    wzsVar5 = this.c;
                    if (wzsVar5 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    gameVideoViewA6.setSoundEnableButtonClickListener(new wej(0, wzsVar5, wzs.class, "onSoundEnableButtonClick", "onSoundEnableButtonClick()V", 0, (byte) 28));
                    wzsVar6 = this.c;
                    if (wzsVar6 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    yop yopVar = new yop(new fnq(wzsVar6.u, new lzs(wzsVar6, yjeVar, b)), (byte) 1);
                    lkz lkzVar = lkz.f20223a;
                    pfl pflVar = new pfl(2, this, GameVideoWindowService.class, "handleUiState", "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowScreenUiState;)V", 4, (byte) 16);
                    cyuVar = this.f22014a;
                    qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns(yopVar, this, pflVar, (yje) null), 3);
                    wzsVar7 = this.c;
                    if (wzsVar7 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns((gmq) wzsVar7.v, this, new j0s(this, yjeVar, (byte) 7), (yje) null), 3);
                    wzsVar8 = this.c;
                    if (wzsVar8 == null) {
                        Intrinsics.h("viewModel");
                        throw null;
                    }
                    qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns(wzsVar8.l.b(), this, new gkr(this, yjeVar, (byte) 4), (yje) null), 3);
                }
            } else if (action.equals("ACTION_STOP")) {
                wzs wzsVar10 = this.c;
                if (wzsVar10 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                wzsVar10.e.b(false);
                c4m0 c4m0Var = wzsVar10.w;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                wzsVar10.c.b();
                stopSelf();
            } else {
                if (c().getParent() != null) {
                    return super.onStartCommand(intent, i, i2);
                }
                gameVideoViewA = a();
                if (c().getParent() == null) {
                    gameVideoViewA.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    c().addView(gameVideoViewA);
                    c().addView((View) this.f.getValue(), new FrameLayout.LayoutParams(-1, -1));
                    c().addView(b(), new FrameLayout.LayoutParams(-1, -1));
                    c().addView((FrameLayout) this.h.getValue(), new FrameLayout.LayoutParams(-1, -1));
                    a8z a8zVar2 = this.j;
                    WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) a8zVar2.getValue();
                    layoutParams2.gravity = 17;
                    layoutParams2.x = 0;
                    layoutParams2.y = 0;
                    ((WindowManager) this.i.getValue()).addView(c(), (WindowManager.LayoutParams) a8zVar2.getValue());
                    c().setOutlineProvider(new ic3(this, (byte) 3));
                    c().setClipToOutline(true);
                    gameVideoViewA.getBroadcastingContainerView().setOnTouchListener(new yzs(this));
                }
                gameVideoViewA2 = a();
                wzsVar = this.c;
                if (wzsVar == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                gameVideoViewA2.getClass();
                gameVideoViewA2.getBroadcastingControlPanelView().u(wzsVar);
                gameVideoViewA3 = a();
                wzsVar2 = this.c;
                if (wzsVar2 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                gameVideoViewA3.setOnMediaFileReddyListener(new wej(0, wzsVar2, wzs.class, "onMediaFileReddy", "onMediaFileReddy()V", 0, (byte) 25));
                gameVideoViewA4 = a();
                wzsVar3 = this.c;
                if (wzsVar3 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                gameVideoViewA4.setOnMediaFileNeedReloadListener(new wej(0, wzsVar3, wzs.class, "onMediaFileError", "onMediaFileError()V", 0, (byte) 26));
                gameVideoViewA5 = a();
                wzsVar4 = this.c;
                if (wzsVar4 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                gameVideoViewA5.setOnContainerClickListener(new wej(0, wzsVar4, wzs.class, "onVideoContainerClick", "onVideoContainerClick()V", 0, (byte) 27));
                gameVideoViewA6 = a();
                wzsVar5 = this.c;
                if (wzsVar5 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                gameVideoViewA6.setSoundEnableButtonClickListener(new wej(0, wzsVar5, wzs.class, "onSoundEnableButtonClick", "onSoundEnableButtonClick()V", 0, (byte) 28));
                wzsVar6 = this.c;
                if (wzsVar6 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                yop yopVar2 = new yop(new fnq(wzsVar6.u, new lzs(wzsVar6, yjeVar, b)), (byte) 1);
                lkz lkzVar2 = lkz.f20223a;
                pfl pflVar2 = new pfl(2, this, GameVideoWindowService.class, "handleUiState", "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowScreenUiState;)V", 4, (byte) 16);
                cyuVar = this.f22014a;
                qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns(yopVar2, this, pflVar2, (yje) null), 3);
                wzsVar7 = this.c;
                if (wzsVar7 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns((gmq) wzsVar7.v, this, new j0s(this, yjeVar, (byte) 7), (yje) null), 3);
                wzsVar8 = this.c;
                if (wzsVar8 == null) {
                    Intrinsics.h("viewModel");
                    throw null;
                }
                qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns(wzsVar8.l.b(), this, new gkr(this, yjeVar, (byte) 4), (yje) null), 3);
            }
        } else {
            if (c().getParent() != null) {
                return super.onStartCommand(intent, i, i2);
            }
            gameVideoViewA = a();
            if (c().getParent() == null) {
                gameVideoViewA.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                c().addView(gameVideoViewA);
                c().addView((View) this.f.getValue(), new FrameLayout.LayoutParams(-1, -1));
                c().addView(b(), new FrameLayout.LayoutParams(-1, -1));
                c().addView((FrameLayout) this.h.getValue(), new FrameLayout.LayoutParams(-1, -1));
                a8z a8zVar3 = this.j;
                WindowManager.LayoutParams layoutParams3 = (WindowManager.LayoutParams) a8zVar3.getValue();
                layoutParams3.gravity = 17;
                layoutParams3.x = 0;
                layoutParams3.y = 0;
                ((WindowManager) this.i.getValue()).addView(c(), (WindowManager.LayoutParams) a8zVar3.getValue());
                c().setOutlineProvider(new ic3(this, (byte) 3));
                c().setClipToOutline(true);
                gameVideoViewA.getBroadcastingContainerView().setOnTouchListener(new yzs(this));
            }
            gameVideoViewA2 = a();
            wzsVar = this.c;
            if (wzsVar == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            gameVideoViewA2.getClass();
            gameVideoViewA2.getBroadcastingControlPanelView().u(wzsVar);
            gameVideoViewA3 = a();
            wzsVar2 = this.c;
            if (wzsVar2 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            gameVideoViewA3.setOnMediaFileReddyListener(new wej(0, wzsVar2, wzs.class, "onMediaFileReddy", "onMediaFileReddy()V", 0, (byte) 25));
            gameVideoViewA4 = a();
            wzsVar3 = this.c;
            if (wzsVar3 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            gameVideoViewA4.setOnMediaFileNeedReloadListener(new wej(0, wzsVar3, wzs.class, "onMediaFileError", "onMediaFileError()V", 0, (byte) 26));
            gameVideoViewA5 = a();
            wzsVar4 = this.c;
            if (wzsVar4 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            gameVideoViewA5.setOnContainerClickListener(new wej(0, wzsVar4, wzs.class, "onVideoContainerClick", "onVideoContainerClick()V", 0, (byte) 27));
            gameVideoViewA6 = a();
            wzsVar5 = this.c;
            if (wzsVar5 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            gameVideoViewA6.setSoundEnableButtonClickListener(new wej(0, wzsVar5, wzs.class, "onSoundEnableButtonClick", "onSoundEnableButtonClick()V", 0, (byte) 28));
            wzsVar6 = this.c;
            if (wzsVar6 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            yop yopVar3 = new yop(new fnq(wzsVar6.u, new lzs(wzsVar6, yjeVar, b)), (byte) 1);
            lkz lkzVar3 = lkz.f20223a;
            pfl pflVar3 = new pfl(2, this, GameVideoWindowService.class, "handleUiState", "handleUiState(Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowScreenUiState;)V", 4, (byte) 16);
            cyuVar = this.f22014a;
            qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns(yopVar3, this, pflVar3, (yje) null), 3);
            wzsVar7 = this.c;
            if (wzsVar7 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns((gmq) wzsVar7.v, this, new j0s(this, yjeVar, (byte) 7), (yje) null), 3);
            wzsVar8 = this.c;
            if (wzsVar8 == null) {
                Intrinsics.h("viewModel");
                throw null;
            }
            qjj.W(x0x.Q((glz) cyuVar.f5196a), null, null, new fns(wzsVar8.l.b(), this, new gkr(this, yjeVar, (byte) 4), (yje) null), 3);
        }
        return super.onStartCommand(intent, i, i2);
    }
}
