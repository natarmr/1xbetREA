.class public final La/joh0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/joh0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/eke0",
        "impl"
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
.field public static final N1:La/eke0;

.field public static final synthetic O1:[La/iiy;


# instance fields
.field public final K1:La/n0o0;

.field public final L1:La/s0r;

.field public final M1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/joh0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/joh0;->O1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/eke0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/joh0;->N1:La/eke0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/hoh0;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/hoh0;-><init>(La/joh0;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, La/joh0;->K1:La/n0o0;

    .line 19
    .line 20
    sget-object v0, La/ioh0;->a:La/ioh0;

    .line 21
    .line 22
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, La/joh0;->L1:La/s0r;

    .line 27
    .line 28
    new-instance v0, La/hoh0;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, p0, v1}, La/hoh0;-><init>(La/joh0;B)V

    .line 32
    .line 33
    .line 34
    new-instance v1, La/yxf0;

    .line 35
    .line 36
    const/16 v2, 0x14

    .line 37
    .line 38
    invoke-direct {v1, v0, v2}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance v0, La/yxf0;

    .line 42
    .line 43
    const/16 v2, 0x15

    .line 44
    .line 45
    invoke-direct {v0, p0, v2}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    sget-object v2, La/wez;->b:La/wez;

    .line 49
    .line 50
    new-instance v3, La/yxf0;

    .line 51
    .line 52
    const/16 v4, 0x16

    .line 53
    .line 54
    invoke-direct {v3, v0, v4}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-class v2, La/iph0;

    .line 62
    .line 63
    sget-object v3, La/sre0;->a:La/tre0;

    .line 64
    .line 65
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    new-instance v3, La/fxf0;

    .line 70
    .line 71
    invoke-direct {v3, v0, v4}, La/fxf0;-><init>(La/a8z;B)V

    .line 72
    .line 73
    .line 74
    new-instance v4, La/fxf0;

    .line 75
    .line 76
    const/16 v5, 0x17

    .line 77
    .line 78
    invoke-direct {v4, v0, v5}, La/fxf0;-><init>(La/a8z;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0, v2, v3, v4, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/joh0;->M1:La/kiu0;

    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/joh0;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/joh0;->L1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/aid;

    .line 16
    .line 17
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/dke0;

    .line 20
    .line 21
    const/16 v1, 0x1d

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, La/dke0;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/ugd;

    .line 27
    .line 28
    const v1, 0x68a9abed

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/joh0;->H0()La/iph0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/iph0;->J:La/ol60;

    .line 6
    .line 7
    new-instance v4, La/tye0;

    .line 8
    .line 9
    const/16 v0, 0x17

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-direct {v4, p0, v5, v0}, La/tye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    sget-object v0, La/lkz;->a:La/lkz;

    .line 16
    .line 17
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v1, La/kmg0;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, La/kmg0;-><init>(La/gmq;La/clz;La/tye0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final G0()La/zsi;
    .locals 0

    .line 1
    iget-object p0, p0, La/joh0;->K1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/zsi;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0()La/iph0;
    .locals 0

    .line 1
    iget-object p0, p0, La/joh0;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/iph0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/hoh0;

    .line 7
    .line 8
    const/4 v2, 0x4

    .line 9
    invoke-direct {v1, v0, v2}, La/hoh0;-><init>(La/joh0;B)V

    .line 10
    .line 11
    .line 12
    const-string v2, "REQUEST_GIFT_DIALOG_KEY"

    .line 13
    .line 14
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/hoh0;

    .line 18
    .line 19
    const/4 v3, 0x5

    .line 20
    invoke-direct {v1, v0, v3}, La/hoh0;-><init>(La/joh0;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, La/hoh0;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, v0, v2}, La/hoh0;-><init>(La/joh0;B)V

    .line 30
    .line 31
    .line 32
    const-string v2, "REQUEST_ACTIVATION_PHONE_DIALOG_KEY"

    .line 33
    .line 34
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 35
    .line 36
    .line 37
    new-instance v1, La/hoh0;

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    invoke-direct {v1, v0, v2}, La/hoh0;-><init>(La/joh0;B)V

    .line 41
    .line 42
    .line 43
    const-string v2, "REQUEST_BIND_PHONE_DIALOG_KEY"

    .line 44
    .line 45
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 46
    .line 47
    .line 48
    new-instance v1, La/hoh0;

    .line 49
    .line 50
    const/4 v2, 0x2

    .line 51
    invoke-direct {v1, v0, v2}, La/hoh0;-><init>(La/joh0;B)V

    .line 52
    .line 53
    .line 54
    const-string v2, "REQUEST_ACTIVATION_EMAIL_DIALOG_KEY"

    .line 55
    .line 56
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, La/hoh0;

    .line 60
    .line 61
    const/4 v2, 0x6

    .line 62
    invoke-direct {v1, v0, v2}, La/hoh0;-><init>(La/joh0;B)V

    .line 63
    .line 64
    .line 65
    const-string v2, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY"

    .line 66
    .line 67
    invoke-static {v0, v2, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, La/hoh0;

    .line 71
    .line 72
    const/4 v3, 0x7

    .line 73
    invoke-direct {v1, v0, v3}, La/hoh0;-><init>(La/joh0;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, La/joh0;->G0()La/zsi;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v2, La/b0c0;

    .line 87
    .line 88
    invoke-virtual {v0}, La/joh0;->H0()La/iph0;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    const/4 v8, 0x0

    .line 93
    const/16 v9, 0x1a

    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    const-class v5, La/iph0;

    .line 97
    .line 98
    const-string v6, "onCaptchaCancelled"

    .line 99
    .line 100
    const-string v7, "onCaptchaCancelled()V"

    .line 101
    .line 102
    invoke-direct/range {v2 .. v9}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 103
    .line 104
    .line 105
    new-instance v10, La/jjh0;

    .line 106
    .line 107
    invoke-virtual {v0}, La/joh0;->H0()La/iph0;

    .line 108
    .line 109
    .line 110
    move-result-object v12

    .line 111
    const/16 v16, 0x0

    .line 112
    .line 113
    const/16 v17, 0x5

    .line 114
    .line 115
    const/4 v11, 0x1

    .line 116
    const-string v14, "onCaptchaConfirmed"

    .line 117
    .line 118
    const-string v15, "onCaptchaConfirmed(Lorg/xplatform/captcha/api/domain/model/UserActionCaptcha;)V"

    .line 119
    .line 120
    move-object v13, v5

    .line 121
    invoke-direct/range {v10 .. v17}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    new-instance v3, La/hi;

    .line 129
    .line 130
    const-string v4, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 131
    .line 132
    invoke-direct {v3, v4, v2, v10}, La/hi;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v4, v0, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    new-instance v2, La/ex60;

    .line 143
    .line 144
    const/16 v3, 0x17

    .line 145
    .line 146
    invoke-direct {v2, v0, v3}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 147
    .line 148
    .line 149
    const-string v3, "RESET_HASH_SECRET_KEY"

    .line 150
    .line 151
    invoke-virtual {v1, v3, v0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 152
    .line 153
    .line 154
    return-void
.end method
