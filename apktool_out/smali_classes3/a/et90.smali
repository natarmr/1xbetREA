.class public final La/et90;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/ft90;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/et90;",
        "La/nw5;",
        "La/ft90;",
        "<init>",
        "()V",
        "a/mi70",
        "captcha"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final j2:La/mi70;

.field public static final synthetic k2:[La/iiy;


# instance fields
.field public final e2:La/n0o0;

.field public final f2:La/kiu0;

.field public final g2:La/yzn0;

.field public final h2:La/phf0;

.field public final i2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/et90;

    .line 4
    .line 5
    const-string v2, "captureTask"

    .line 6
    .line 7
    const-string v3, "getCaptureTask()Lorg/xplatform/captcha/api/domain/model/CaptchaTask;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "binding"

    .line 25
    .line 26
    const-string v6, "getBinding()Lorg/xplatform/captcha/databinding/PictureCaptchaDialogFragmentBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/et90;->k2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/mi70;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/et90;->j2:La/mi70;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/bt90;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/bt90;-><init>(La/et90;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, La/et90;->e2:La/n0o0;

    .line 15
    .line 16
    new-instance v0, La/bt90;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, La/bt90;-><init>(La/et90;B)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/wz80;

    .line 23
    .line 24
    const/16 v2, 0xc

    .line 25
    .line 26
    invoke-direct {v1, p0, v2}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    sget-object v3, La/wez;->b:La/wez;

    .line 30
    .line 31
    new-instance v4, La/wz80;

    .line 32
    .line 33
    const/16 v5, 0xd

    .line 34
    .line 35
    invoke-direct {v4, v1, v5}, La/wz80;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-class v3, La/kt90;

    .line 43
    .line 44
    sget-object v4, La/sre0;->a:La/tre0;

    .line 45
    .line 46
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    new-instance v4, La/a190;

    .line 51
    .line 52
    invoke-direct {v4, v1, v2}, La/a190;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    new-instance v2, La/a190;

    .line 56
    .line 57
    invoke-direct {v2, v1, v5}, La/a190;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v3, v4, v2, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/et90;->f2:La/kiu0;

    .line 65
    .line 66
    new-instance v0, La/yzn0;

    .line 67
    .line 68
    const-string v1, "KEY_BUNDLE_CAPTCHA_TASK"

    .line 69
    .line 70
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, La/et90;->g2:La/yzn0;

    .line 74
    .line 75
    new-instance v0, La/phf0;

    .line 76
    .line 77
    const-string v1, "KEY_BUNDLE_REQUEST"

    .line 78
    .line 79
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, La/et90;->h2:La/phf0;

    .line 83
    .line 84
    sget-object v0, La/ct90;->a:La/ct90;

    .line 85
    .line 86
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, p0, La/et90;->i2:La/nae0;

    .line 91
    .line 92
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic L0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/et90;->T0()La/ft90;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final O0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/et90;->T0()La/ft90;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ft90;->d:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 6
    .line 7
    new-instance v1, La/da0;

    .line 8
    .line 9
    new-instance v2, La/yr80;

    .line 10
    .line 11
    const/4 v3, 0x5

    .line 12
    invoke-direct {v2, p0, v3}, La/yr80;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, v2}, La/da0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/et90;->T0()La/ft90;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v0, v0, La/ft90;->c:Lcom/google/android/material/button/MaterialButton;

    .line 28
    .line 29
    new-instance v1, La/at90;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v1, p0, v2}, La/at90;-><init>(La/et90;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/et90;->T0()La/ft90;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, La/ft90;->b:Lcom/google/android/material/button/MaterialButton;

    .line 43
    .line 44
    new-instance v1, La/at90;

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    invoke-direct {v1, p0, v2}, La/at90;-><init>(La/et90;B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, La/nw5;->M0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    new-instance v1, La/gw5;

    .line 60
    .line 61
    const/4 v2, 0x4

    .line 62
    invoke-direct {v1, p0, v2}, La/gw5;-><init>(Ljava/lang/Object;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->y(La/po8;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    invoke-virtual {p0}, La/nw5;->J0()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0b09

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final S0()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x7f130f6f

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final T0()La/ft90;
    .locals 2

    .line 1
    sget-object v0, La/et90;->k2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/et90;->i2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/ft90;

    .line 16
    .line 17
    return-object p0
.end method

.method public final U0()La/kt90;
    .locals 0

    .line 1
    iget-object p0, p0, La/et90;->f2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/kt90;

    .line 8
    .line 9
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super/range {p0 .. p2}, La/nw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, La/nw5;->N0()La/ow5;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, La/ow5;->c:Landroid/view/View;

    .line 14
    .line 15
    const/4 v2, 0x4

    .line 16
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, La/et90;->U0()La/kt90;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    sget-object v1, La/et90;->k2:[La/iiy;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    aget-object v1, v1, v2

    .line 27
    .line 28
    iget-object v3, v0, La/et90;->g2:La/yzn0;

    .line 29
    .line 30
    invoke-virtual {v3, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, La/i7a;

    .line 35
    .line 36
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 37
    .line 38
    .line 39
    move-result-object v11

    .line 40
    new-instance v3, La/yi90;

    .line 41
    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x6

    .line 44
    const/4 v4, 0x1

    .line 45
    const-class v6, La/kt90;

    .line 46
    .line 47
    const-string v7, "onCaptchaDecodeError"

    .line 48
    .line 49
    const-string v8, "onCaptchaDecodeError(Ljava/lang/Throwable;)V"

    .line 50
    .line 51
    invoke-direct/range {v3 .. v10}, La/yi90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 52
    .line 53
    .line 54
    new-instance v10, La/o690;

    .line 55
    .line 56
    const/4 v4, 0x5

    .line 57
    const/4 v12, 0x0

    .line 58
    invoke-direct {v10, v1, v5, v12, v4}, La/o690;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 59
    .line 60
    .line 61
    move-object v6, v11

    .line 62
    const/16 v11, 0xe

    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    move-object v7, v3

    .line 67
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, La/et90;->U0()La/kt90;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v1, v1, La/kt90;->f:La/qoj0;

    .line 75
    .line 76
    sget-object v3, La/lkz;->a:La/lkz;

    .line 77
    .line 78
    new-instance v3, La/dt90;

    .line 79
    .line 80
    invoke-direct {v3, v0, v12, v2}, La/dt90;-><init>(La/et90;La/yje;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    new-instance v5, La/w090;

    .line 96
    .line 97
    invoke-direct {v5, v1, v2, v3, v12}, La/w090;-><init>(La/qoj0;La/clz;La/dt90;La/yje;)V

    .line 98
    .line 99
    .line 100
    const/4 v1, 0x3

    .line 101
    invoke-static {v4, v12, v12, v5, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, La/et90;->U0()La/kt90;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iget-object v13, v2, La/kt90;->d:La/qoj0;

    .line 109
    .line 110
    new-instance v15, La/dt90;

    .line 111
    .line 112
    const/4 v2, 0x1

    .line 113
    invoke-direct {v15, v0, v12, v2}, La/dt90;-><init>(La/et90;La/yje;B)V

    .line 114
    .line 115
    .line 116
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    invoke-interface {v14}, La/clz;->x()La/glz;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    move-object/from16 v16, v12

    .line 129
    .line 130
    new-instance v12, La/w090;

    .line 131
    .line 132
    const/16 v17, 0x0

    .line 133
    .line 134
    invoke-direct/range {v12 .. v17}, La/w090;-><init>(La/qoj0;La/clz;La/dt90;La/yje;B)V

    .line 135
    .line 136
    .line 137
    move-object/from16 v3, v16

    .line 138
    .line 139
    invoke-static {v2, v3, v3, v12, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, La/et90;->U0()La/kt90;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    iget-object v2, v2, La/kt90;->e:La/p7m0;

    .line 147
    .line 148
    new-instance v4, La/dt90;

    .line 149
    .line 150
    const/4 v5, 0x2

    .line 151
    invoke-direct {v4, v0, v3, v5}, La/dt90;-><init>(La/et90;La/yje;B)V

    .line 152
    .line 153
    .line 154
    invoke-static {v0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-static {v5}, La/x0x;->Q(La/glz;)La/tkz;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    new-instance v6, La/w090;

    .line 167
    .line 168
    invoke-direct {v6, v2, v0, v4, v3}, La/w090;-><init>(La/p7m0;La/clz;La/dt90;La/yje;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v5, v3, v3, v6, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 172
    .line 173
    .line 174
    return-void
.end method
