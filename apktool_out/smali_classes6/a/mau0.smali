.class public final La/mau0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/mau0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/bzs0",
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
.field public static final Q1:La/bzs0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/azi;

.field public M1:La/wdk0;

.field public N1:La/ii;

.field public final O1:La/cgx0;

.field public final P1:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/mau0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/verification/status/impl/databinding/VerificationStatusFragmentBinding;"

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
    const-string v3, "fromBlockScreen"

    .line 16
    .line 17
    const-string v5, "getFromBlockScreen()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/mau0;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/bzs0;

    .line 33
    .line 34
    const/4 v1, 0x7

    .line 35
    invoke-direct {v0, v1}, La/bzs0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    sput-object v0, La/mau0;->Q1:La/bzs0;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0621

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/lau0;->a:La/lau0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/mau0;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/cgx0;

    .line 16
    .line 17
    const-string v1, "FROM_BLOCK_SCREEN_KEY"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/mau0;->O1:La/cgx0;

    .line 24
    .line 25
    new-instance v0, La/kau0;

    .line 26
    .line 27
    invoke-direct {v0, p0, v2}, La/kau0;-><init>(La/mau0;B)V

    .line 28
    .line 29
    .line 30
    new-instance v1, La/cvs0;

    .line 31
    .line 32
    const/16 v2, 0xf

    .line 33
    .line 34
    invoke-direct {v1, p0, v2}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    sget-object v2, La/wez;->b:La/wez;

    .line 38
    .line 39
    new-instance v3, La/cvs0;

    .line 40
    .line 41
    const/16 v4, 0x10

    .line 42
    .line 43
    invoke-direct {v3, v1, v4}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-class v2, La/abu0;

    .line 51
    .line 52
    sget-object v3, La/sre0;->a:La/tre0;

    .line 53
    .line 54
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    new-instance v3, La/w6u0;

    .line 59
    .line 60
    const/4 v4, 0x6

    .line 61
    invoke-direct {v3, v1, v4}, La/w6u0;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    new-instance v4, La/w6u0;

    .line 65
    .line 66
    const/4 v5, 0x7

    .line 67
    invoke-direct {v4, v1, v5}, La/w6u0;-><init>(La/a8z;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, La/mau0;->P1:La/kiu0;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/mau0;->G0()La/hau0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/hau0;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 6
    .line 7
    const v0, 0x7f131767

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/mau0;->G0()La/hau0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/hau0;->e:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 22
    .line 23
    new-instance v0, La/jpe0;

    .line 24
    .line 25
    const/16 v1, 0x11

    .line 26
    .line 27
    invoke-direct {v0, p0, v1}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, La/avs0;

    .line 34
    .line 35
    invoke-virtual {p0}, La/mau0;->H0()La/abu0;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v9, 0x4

    .line 41
    const/4 v3, 0x0

    .line 42
    const-class v5, La/abu0;

    .line 43
    .line 44
    const-string v6, "onExit"

    .line 45
    .line 46
    const-string v7, "onExit()V"

    .line 47
    .line 48
    invoke-direct/range {v2 .. v9}, La/avs0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, p0, v2}, La/qcc;->W(Landroidx/fragment/app/Fragment;La/clz;Lkotlin/jvm/functions/Function0;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, La/mau0;->G0()La/hau0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p1, p1, La/hau0;->b:Lcom/google/android/material/button/MaterialButton;

    .line 59
    .line 60
    new-instance v0, La/npt0;

    .line 61
    .line 62
    const/16 v1, 0x8

    .line 63
    .line 64
    invoke-direct {v0, p0, v1}, La/npt0;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final C0()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/nau0;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/nau0;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/nau0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v1, v3, La/nau0;->a:La/ctf0;

    .line 58
    .line 59
    iget-object v11, v3, La/nau0;->b:La/r9u;

    .line 60
    .line 61
    iget-object v12, v3, La/nau0;->c:La/rou;

    .line 62
    .line 63
    iget-object v10, v3, La/nau0;->d:La/bzt;

    .line 64
    .line 65
    iget-object v6, v3, La/nau0;->e:La/v88;

    .line 66
    .line 67
    iget-object v8, v3, La/nau0;->f:La/mne;

    .line 68
    .line 69
    iget-object v7, v3, La/nau0;->g:La/m1e;

    .line 70
    .line 71
    iget-object v15, v3, La/nau0;->h:La/sa10;

    .line 72
    .line 73
    iget-object v2, v3, La/nau0;->i:La/iw20;

    .line 74
    .line 75
    iget-object v4, v3, La/nau0;->j:La/zas0;

    .line 76
    .line 77
    iget-object v5, v3, La/nau0;->k:La/wdk0;

    .line 78
    .line 79
    move-object/from16 v19, v5

    .line 80
    .line 81
    iget-object v5, v3, La/nau0;->l:La/ii;

    .line 82
    .line 83
    iget-object v9, v3, La/nau0;->m:La/zx10;

    .line 84
    .line 85
    move-object/from16 v16, v9

    .line 86
    .line 87
    iget-object v9, v3, La/nau0;->n:La/v6k;

    .line 88
    .line 89
    iget-object v14, v3, La/nau0;->o:La/pv00;

    .line 90
    .line 91
    iget-object v13, v3, La/nau0;->p:La/jau0;

    .line 92
    .line 93
    iget-object v3, v3, La/nau0;->q:La/atz;

    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-object/from16 v20, v4

    .line 114
    .line 115
    new-instance v4, La/v7i;

    .line 116
    .line 117
    move-object/from16 v18, v1

    .line 118
    .line 119
    move-object/from16 v17, v2

    .line 120
    .line 121
    move-object/from16 v21, v13

    .line 122
    .line 123
    move-object v13, v3

    .line 124
    invoke-direct/range {v4 .. v21}, La/v7i;-><init>(La/ii;La/v88;La/m1e;La/mne;La/v6k;La/bzt;La/r9u;La/rou;La/atz;La/pv00;La/sa10;La/zx10;La/iw20;La/ctf0;La/wdk0;La/zas0;La/jau0;)V

    .line 125
    .line 126
    .line 127
    move-object/from16 v1, v19

    .line 128
    .line 129
    iget-object v2, v4, La/v7i;->o:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v2, La/n5d0;

    .line 132
    .line 133
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, La/azi;

    .line 138
    .line 139
    iput-object v2, v0, La/mau0;->L1:La/azi;

    .line 140
    .line 141
    iput-object v1, v0, La/mau0;->M1:La/wdk0;

    .line 142
    .line 143
    iput-object v5, v0, La/mau0;->N1:La/ii;

    .line 144
    .line 145
    return-void

    .line 146
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 147
    .line 148
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public final D0()V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, La/mau0;->H0()La/abu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/abu0;->z:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/k5r0;

    .line 8
    .line 9
    const/4 v7, 0x4

    .line 10
    const/16 v8, 0xe

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const-class v4, La/mau0;

    .line 14
    .line 15
    const-string v5, "handleViewState"

    .line 16
    .line 17
    const-string v6, "handleViewState(Lorg/xplatform/verification/status/impl/presentation/old/VerificationStatusOldViewModel$ViewState;)V"

    .line 18
    .line 19
    move-object/from16 v3, p0

    .line 20
    .line 21
    invoke-direct/range {v1 .. v8}, La/k5r0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/lkz;->a:La/lkz;

    .line 25
    .line 26
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    new-instance v5, La/tsr0;

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    invoke-direct {v5, v0, v2, v1, v6}, La/tsr0;-><init>(La/gmq;La/clz;La/k5r0;La/yje;)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    invoke-static {v3, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 46
    .line 47
    .line 48
    invoke-virtual/range {p0 .. p0}, La/mau0;->H0()La/abu0;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    iget-object v7, v1, La/abu0;->A:La/ol60;

    .line 53
    .line 54
    new-instance v9, La/k5r0;

    .line 55
    .line 56
    const/4 v15, 0x4

    .line 57
    const/16 v16, 0xf

    .line 58
    .line 59
    const/4 v10, 0x2

    .line 60
    const-string v13, "handleSingleEvent"

    .line 61
    .line 62
    const-string v14, "handleSingleEvent(Lorg/xplatform/verification/status/impl/presentation/old/VerificationStatusOldViewModel$SingleEvent;)V"

    .line 63
    .line 64
    move-object/from16 v11, p0

    .line 65
    .line 66
    move-object v12, v4

    .line 67
    invoke-direct/range {v9 .. v16}, La/k5r0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 68
    .line 69
    .line 70
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    move-object v10, v6

    .line 83
    new-instance v6, La/tsr0;

    .line 84
    .line 85
    const/4 v11, 0x0

    .line 86
    invoke-direct/range {v6 .. v11}, La/tsr0;-><init>(La/gmq;La/clz;La/k5r0;La/yje;B)V

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v10, v10, v6, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final G0()La/hau0;
    .locals 2

    .line 1
    sget-object v0, La/mau0;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/mau0;->K1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/hau0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/abu0;
    .locals 0

    .line 1
    iget-object p0, p0, La/mau0;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/abu0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/mau0;->H0()La/abu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, v0, La/abu0;->B:Z

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 10
    .line 11
    return-void
.end method

.method public final e0()V
    .locals 6

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/mau0;->H0()La/abu0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/abu0;->x:La/c4m0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, La/abu0;->x:La/c4m0;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, La/abu0;->g:La/m1e;

    .line 28
    .line 29
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v3, La/yau0;

    .line 34
    .line 35
    invoke-direct {v3, p0, v2, v1}, La/yau0;-><init>(La/abu0;La/yje;B)V

    .line 36
    .line 37
    .line 38
    new-instance v4, La/fnq;

    .line 39
    .line 40
    const/4 v5, 0x4

    .line 41
    invoke-direct {v4, v0, v3, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 42
    .line 43
    .line 44
    new-instance v0, La/zau0;

    .line 45
    .line 46
    invoke-direct {v0, p0, v2, v1}, La/zau0;-><init>(La/abu0;La/yje;B)V

    .line 47
    .line 48
    .line 49
    new-instance v2, La/dnq;

    .line 50
    .line 51
    invoke-direct {v2, v4, v0, v1}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-static {v2, v0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, La/abu0;->x:La/c4m0;

    .line 63
    .line 64
    return-void
.end method
