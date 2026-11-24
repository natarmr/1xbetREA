.class public final La/qp4;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/qp4;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/hfk0",
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
.field public static final R1:La/hfk0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/a8z;

.field public final L1:La/kiu0;

.field public final M1:La/s0r;

.field public final N1:La/phf0;

.field public final O1:La/yzn0;

.field public final P1:La/yzn0;

.field public final Q1:La/ywq;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/qp4;

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
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "operationGuidBundle"

    .line 16
    .line 17
    const-string v5, "getOperationGuidBundle()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "operationConfirmationBundle"

    .line 25
    .line 26
    const-string v6, "getOperationConfirmationBundle()Lorg/xplatform/authenticator/api/domain/models/OperationConfirmation;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "navigation"

    .line 34
    .line 35
    const-string v7, "getNavigation()Lorg/xplatform/authenticator/api/navigation/AuthenticatorNavigationEnum;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/qp4;->S1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/hfk0;

    .line 57
    .line 58
    const/16 v1, 0x1b

    .line 59
    .line 60
    invoke-direct {v0, v1}, La/hfk0;-><init>(B)V

    .line 61
    .line 62
    .line 63
    sput-object v0, La/qp4;->R1:La/hfk0;

    .line 64
    .line 65
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
    new-instance v0, La/mp4;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/mp4;-><init>(La/qp4;B)V

    .line 11
    .line 12
    .line 13
    sget-object v2, La/wez;->b:La/wez;

    .line 14
    .line 15
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/qp4;->K1:La/a8z;

    .line 20
    .line 21
    new-instance v0, La/mp4;

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    invoke-direct {v0, p0, v3}, La/mp4;-><init>(La/qp4;B)V

    .line 25
    .line 26
    .line 27
    new-instance v4, La/pp4;

    .line 28
    .line 29
    invoke-direct {v4, v0, v1}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    new-instance v0, La/pp4;

    .line 33
    .line 34
    invoke-direct {v0, p0, v3}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    new-instance v1, La/pp4;

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    invoke-direct {v1, v0, v5}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-class v1, La/ku4;

    .line 48
    .line 49
    sget-object v2, La/sre0;->a:La/tre0;

    .line 50
    .line 51
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    new-instance v2, La/t51;

    .line 56
    .line 57
    const/16 v5, 0x16

    .line 58
    .line 59
    invoke-direct {v2, v0, v5}, La/t51;-><init>(La/a8z;B)V

    .line 60
    .line 61
    .line 62
    new-instance v5, La/t51;

    .line 63
    .line 64
    const/16 v6, 0x17

    .line 65
    .line 66
    invoke-direct {v5, v0, v6}, La/t51;-><init>(La/a8z;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0, v1, v2, v5, v4}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/qp4;->L1:La/kiu0;

    .line 74
    .line 75
    sget-object v0, La/op4;->a:La/op4;

    .line 76
    .line 77
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, La/qp4;->M1:La/s0r;

    .line 82
    .line 83
    new-instance v0, La/phf0;

    .line 84
    .line 85
    const-string v1, "OPERATION_GUID_EXTRA"

    .line 86
    .line 87
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, La/qp4;->N1:La/phf0;

    .line 91
    .line 92
    new-instance v0, La/yzn0;

    .line 93
    .line 94
    const-string v1, "OPERATION_CONFIRMATION_EXTRA"

    .line 95
    .line 96
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, La/qp4;->O1:La/yzn0;

    .line 100
    .line 101
    new-instance v0, La/yzn0;

    .line 102
    .line 103
    const-string v1, "NAVIGATION_EXTRA"

    .line 104
    .line 105
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, La/qp4;->P1:La/yzn0;

    .line 109
    .line 110
    new-instance v0, La/xn;

    .line 111
    .line 112
    const/4 v1, 0x7

    .line 113
    invoke-direct {v0, v1}, La/xn;-><init>(B)V

    .line 114
    .line 115
    .line 116
    new-instance v1, La/rg3;

    .line 117
    .line 118
    invoke-direct {v1, v3}, La/rg3;-><init>(B)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0, v1, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iput-object v0, p0, La/qp4;->Q1:La/ywq;

    .line 126
    .line 127
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/qp4;->S1:[La/iiy;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    iget-object v3, v0, La/qp4;->M1:La/s0r;

    .line 9
    .line 10
    invoke-virtual {v3, v1, v0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast v1, La/aid;

    .line 18
    .line 19
    iget-object v1, v1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 20
    .line 21
    new-instance v3, La/fa2;

    .line 22
    .line 23
    const/16 v4, 0xd

    .line 24
    .line 25
    invoke-direct {v3, v0, v4}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance v4, La/ugd;

    .line 29
    .line 30
    const v5, 0x24d5e057

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x1

    .line 34
    invoke-direct {v4, v5, v6, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    new-instance v3, La/shd;

    .line 38
    .line 39
    const/16 v5, 0xf

    .line 40
    .line 41
    invoke-direct {v3, v5}, La/shd;-><init>(B)V

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v3, v4}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 45
    .line 46
    .line 47
    new-instance v7, La/f8;

    .line 48
    .line 49
    invoke-virtual {v0}, La/qp4;->H0()La/ku4;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    const/4 v13, 0x0

    .line 54
    const/16 v14, 0xf

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    const-class v18, La/ku4;

    .line 58
    .line 59
    const-string v11, "disableAuthenticator"

    .line 60
    .line 61
    const-string v12, "disableAuthenticator()V"

    .line 62
    .line 63
    move-object/from16 v10, v18

    .line 64
    .line 65
    invoke-direct/range {v7 .. v14}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 66
    .line 67
    .line 68
    const-string v1, "REQUEST_SHOW_DISABLE_AUTH_CONF_DIALOG_KEY"

    .line 69
    .line 70
    invoke-static {v0, v1, v7}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 71
    .line 72
    .line 73
    new-instance v15, La/f8;

    .line 74
    .line 75
    invoke-virtual {v0}, La/qp4;->H0()La/ku4;

    .line 76
    .line 77
    .line 78
    move-result-object v17

    .line 79
    const/16 v21, 0x0

    .line 80
    .line 81
    const/16 v22, 0x10

    .line 82
    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const-string v19, "disableAuthenticatorCancelled"

    .line 86
    .line 87
    const-string v20, "disableAuthenticatorCancelled()V"

    .line 88
    .line 89
    invoke-direct/range {v15 .. v22}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v1, v15}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    new-instance v3, La/np4;

    .line 100
    .line 101
    invoke-direct {v3, v0, v2}, La/np4;-><init>(La/qp4;B)V

    .line 102
    .line 103
    .line 104
    const-string v4, "APPLY_FILTERS_REQUEST_KEY"

    .line 105
    .line 106
    invoke-virtual {v1, v4, v0, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, La/qp4;->H0()La/ku4;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-static {v3}, La/sj3;->L(Landroid/content/Context;)Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    invoke-virtual {v1, v2}, La/ku4;->A(Z)V

    .line 122
    .line 123
    .line 124
    if-nez v3, :cond_0

    .line 125
    .line 126
    iget-object v2, v1, La/ku4;->n:La/myb;

    .line 127
    .line 128
    iget-object v2, v2, La/myb;->a:La/ts4;

    .line 129
    .line 130
    iget-object v2, v2, La/ts4;->e:La/vo4;

    .line 131
    .line 132
    iget-boolean v2, v2, La/vo4;->b:Z

    .line 133
    .line 134
    if-nez v2, :cond_0

    .line 135
    .line 136
    iget-object v2, v1, La/ku4;->v:La/ol60;

    .line 137
    .line 138
    sget-object v3, La/rt4;->a:La/rt4;

    .line 139
    .line 140
    invoke-virtual {v2, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object v1, v1, La/ku4;->m:La/myb;

    .line 144
    .line 145
    iget-object v1, v1, La/myb;->a:La/ts4;

    .line 146
    .line 147
    iget-object v1, v1, La/ts4;->e:La/vo4;

    .line 148
    .line 149
    iput-boolean v6, v1, La/vo4;->b:Z

    .line 150
    .line 151
    :cond_0
    new-instance v1, La/mp4;

    .line 152
    .line 153
    const/4 v2, 0x2

    .line 154
    invoke-direct {v1, v0, v2}, La/mp4;-><init>(La/qp4;B)V

    .line 155
    .line 156
    .line 157
    const-string v2, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 158
    .line 159
    invoke-static {v0, v2, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 160
    .line 161
    .line 162
    new-instance v1, La/mp4;

    .line 163
    .line 164
    const/4 v3, 0x3

    .line 165
    invoke-direct {v1, v0, v3}, La/mp4;-><init>(La/qp4;B)V

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v2, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    new-instance v2, La/np4;

    .line 176
    .line 177
    invoke-direct {v2, v0, v6}, La/np4;-><init>(La/qp4;B)V

    .line 178
    .line 179
    .line 180
    const-string v3, "KEY_OPTIONS_TYPE"

    .line 181
    .line 182
    invoke-virtual {v1, v3, v0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 183
    .line 184
    .line 185
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/qp4;->H0()La/ku4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ku4;->v:La/ol60;

    .line 6
    .line 7
    new-instance v1, La/cm3;

    .line 8
    .line 9
    const/16 v2, 0xc

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v1, p0, v3, v2}, La/cm3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    sget-object v2, La/lkz;->a:La/lkz;

    .line 16
    .line 17
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v4, La/ac4;

    .line 30
    .line 31
    invoke-direct {v4, v0, p0, v1, v3}, La/ac4;-><init>(La/gmq;La/clz;La/cm3;La/yje;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x3

    .line 35
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final G0()La/f9i;
    .locals 0

    .line 1
    iget-object p0, p0, La/qp4;->K1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/f9i;

    .line 8
    .line 9
    return-object p0
.end method

.method public final H0()La/ku4;
    .locals 0

    .line 1
    iget-object p0, p0, La/qp4;->L1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ku4;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Y()V
    .locals 1

    .line 1
    iget-object v0, p0, La/qp4;->Q1:La/ywq;

    .line 2
    .line 3
    invoke-virtual {v0}, La/ywq;->b()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 8
    .line 9
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/qp4;->H0()La/ku4;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/ku4;->F:La/c4m0;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, v0}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/qp4;->H0()La/ku4;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, La/ku4;->A(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
