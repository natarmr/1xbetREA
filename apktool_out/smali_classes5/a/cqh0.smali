.class public final La/cqh0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\t\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0008\u001a\u00020\u00078\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/cqh0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gne0",
        "La/crh0;",
        "state",
        "",
        "refreshState",
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
.field public static final N1:La/gne0;

.field public static final synthetic O1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public final L1:La/n0o0;

.field public final M1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/cqh0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/cqh0;->O1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gne0;

    .line 21
    .line 22
    const/16 v1, 0xf

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/gne0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/cqh0;->N1:La/gne0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/bqh0;->a:La/bqh0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/cqh0;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/aqh0;

    .line 16
    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    invoke-direct {v0, p0, v1}, La/aqh0;-><init>(La/cqh0;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, La/cqh0;->L1:La/n0o0;

    .line 27
    .line 28
    new-instance v0, La/aqh0;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, p0, v1}, La/aqh0;-><init>(La/cqh0;B)V

    .line 32
    .line 33
    .line 34
    new-instance v1, La/yxf0;

    .line 35
    .line 36
    const/16 v2, 0x1a

    .line 37
    .line 38
    invoke-direct {v1, v0, v2}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    new-instance v0, La/yxf0;

    .line 42
    .line 43
    const/16 v3, 0x1b

    .line 44
    .line 45
    invoke-direct {v0, p0, v3}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    sget-object v4, La/wez;->b:La/wez;

    .line 49
    .line 50
    new-instance v5, La/yxf0;

    .line 51
    .line 52
    const/16 v6, 0x1c

    .line 53
    .line 54
    invoke-direct {v5, v0, v6}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v4, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-class v4, La/irh0;

    .line 62
    .line 63
    sget-object v5, La/sre0;->a:La/tre0;

    .line 64
    .line 65
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    new-instance v5, La/fxf0;

    .line 70
    .line 71
    invoke-direct {v5, v0, v2}, La/fxf0;-><init>(La/a8z;B)V

    .line 72
    .line 73
    .line 74
    new-instance v2, La/fxf0;

    .line 75
    .line 76
    invoke-direct {v2, v0, v3}, La/fxf0;-><init>(La/a8z;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v4, v5, v2, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/cqh0;->M1:La/kiu0;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/cqh0;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/cqh0;->K1:La/s0r;

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
    new-instance v0, La/uph0;

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-direct {v0, p0, v1}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    new-instance p0, La/ugd;

    .line 26
    .line 27
    const v2, 0x32b8aa1

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, v2, v1, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/cqh0;->H0()La/irh0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/irh0;->I:La/ol60;

    .line 6
    .line 7
    new-instance v4, La/tye0;

    .line 8
    .line 9
    const/16 v0, 0x18

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
    invoke-direct/range {v1 .. v6}, La/kmg0;-><init>(La/gmq;La/clz;La/tye0;La/yje;C)V

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
    iget-object p0, p0, La/cqh0;->L1:La/n0o0;

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

.method public final H0()La/irh0;
    .locals 0

    .line 1
    iget-object p0, p0, La/cqh0;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/irh0;

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
    new-instance v1, La/aqh0;

    .line 7
    .line 8
    const/4 v2, 0x6

    .line 9
    invoke-direct {v1, v0, v2}, La/aqh0;-><init>(La/cqh0;B)V

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
    new-instance v1, La/aqh0;

    .line 18
    .line 19
    const/4 v3, 0x7

    .line 20
    invoke-direct {v1, v0, v3}, La/aqh0;-><init>(La/cqh0;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {v0, v2, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, La/aqh0;

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    invoke-direct {v1, v0, v2}, La/aqh0;-><init>(La/cqh0;B)V

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
    new-instance v1, La/aqh0;

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-direct {v1, v0, v2}, La/aqh0;-><init>(La/cqh0;B)V

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
    new-instance v1, La/aqh0;

    .line 49
    .line 50
    const/4 v2, 0x3

    .line 51
    invoke-direct {v1, v0, v2}, La/aqh0;-><init>(La/cqh0;B)V

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
    new-instance v1, La/aqh0;

    .line 60
    .line 61
    const/4 v2, 0x4

    .line 62
    invoke-direct {v1, v0, v2}, La/aqh0;-><init>(La/cqh0;B)V

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
    new-instance v1, La/aqh0;

    .line 71
    .line 72
    const/4 v3, 0x5

    .line 73
    invoke-direct {v1, v0, v3}, La/aqh0;-><init>(La/cqh0;B)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, La/cqh0;->G0()La/zsi;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    new-instance v2, La/lph0;

    .line 87
    .line 88
    invoke-virtual {v0}, La/cqh0;->H0()La/irh0;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    const/4 v8, 0x0

    .line 93
    const/4 v9, 0x1

    .line 94
    const/4 v3, 0x0

    .line 95
    const-class v5, La/irh0;

    .line 96
    .line 97
    const-string v6, "onCaptchaCancelled"

    .line 98
    .line 99
    const-string v7, "onCaptchaCancelled()V"

    .line 100
    .line 101
    invoke-direct/range {v2 .. v9}, La/lph0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 102
    .line 103
    .line 104
    new-instance v10, La/jjh0;

    .line 105
    .line 106
    invoke-virtual {v0}, La/cqh0;->H0()La/irh0;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    const/16 v16, 0x0

    .line 111
    .line 112
    const/16 v17, 0xf

    .line 113
    .line 114
    const/4 v11, 0x1

    .line 115
    const-string v14, "onCaptchaConfirmed"

    .line 116
    .line 117
    const-string v15, "onCaptchaConfirmed(Lorg/xplatform/captcha/api/domain/model/UserActionCaptcha;)V"

    .line 118
    .line 119
    move-object v13, v5

    .line 120
    invoke-direct/range {v10 .. v17}, La/jjh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    new-instance v3, La/hi;

    .line 128
    .line 129
    const-string v4, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 130
    .line 131
    invoke-direct {v3, v4, v2, v10}, La/hi;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v4, v0, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 135
    .line 136
    .line 137
    iget-object v1, v0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 138
    .line 139
    if-eqz v1, :cond_0

    .line 140
    .line 141
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    new-instance v2, La/ex60;

    .line 146
    .line 147
    const/16 v3, 0x1a

    .line 148
    .line 149
    invoke-direct {v2, v0, v3}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 150
    .line 151
    .line 152
    const-string v3, "RESET_HASH_SECRET_KEY"

    .line 153
    .line 154
    invoke-virtual {v1, v3, v0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 155
    .line 156
    .line 157
    :cond_0
    return-void
.end method
