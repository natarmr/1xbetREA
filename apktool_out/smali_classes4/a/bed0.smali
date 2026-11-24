.class public final La/bed0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/bed0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/fl70",
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
.field public static final U1:La/fl70;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/kqi;

.field public M1:La/ii;

.field public N1:La/wdk0;

.field public final O1:La/kiu0;

.field public final P1:La/s0r;

.field public final Q1:La/ywq;

.field public final R1:La/ywq;

.field public final S1:La/ywq;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/bed0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/features/notification_settings/impl/databinding/FragmentNotificationSettingsBinding;"

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
    sput-object v1, La/bed0;->V1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/fl70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/bed0;->U1:La/fl70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d026c

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/bed0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/xdd0;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {v0, p0, v1}, La/xdd0;-><init>(La/bed0;B)V

    .line 15
    .line 16
    .line 17
    new-instance v2, La/f1d0;

    .line 18
    .line 19
    const/4 v3, 0x5

    .line 20
    invoke-direct {v2, p0, v3}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    sget-object v3, La/wez;->b:La/wez;

    .line 24
    .line 25
    new-instance v4, La/f1d0;

    .line 26
    .line 27
    const/4 v5, 0x6

    .line 28
    invoke-direct {v4, v2, v5}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    const-class v3, La/ned0;

    .line 36
    .line 37
    sget-object v4, La/sre0;->a:La/tre0;

    .line 38
    .line 39
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v4, La/ync0;

    .line 44
    .line 45
    const/16 v5, 0x8

    .line 46
    .line 47
    invoke-direct {v4, v2, v5}, La/ync0;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    new-instance v5, La/ync0;

    .line 51
    .line 52
    const/16 v6, 0x9

    .line 53
    .line 54
    invoke-direct {v5, v2, v6}, La/ync0;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, La/bed0;->O1:La/kiu0;

    .line 62
    .line 63
    sget-object v0, La/aed0;->a:La/aed0;

    .line 64
    .line 65
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/bed0;->P1:La/s0r;

    .line 70
    .line 71
    new-instance v0, La/xn;

    .line 72
    .line 73
    const/4 v2, 0x4

    .line 74
    invoke-direct {v0, v2}, La/xn;-><init>(B)V

    .line 75
    .line 76
    .line 77
    new-instance v2, La/zdd0;

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    invoke-direct {v2, p0, v3}, La/zdd0;-><init>(La/bed0;B)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v2, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, La/bed0;->Q1:La/ywq;

    .line 88
    .line 89
    new-instance v0, La/xn;

    .line 90
    .line 91
    const/4 v2, 0x7

    .line 92
    invoke-direct {v0, v2}, La/xn;-><init>(B)V

    .line 93
    .line 94
    .line 95
    new-instance v3, La/zdd0;

    .line 96
    .line 97
    const/4 v4, 0x1

    .line 98
    invoke-direct {v3, p0, v4}, La/zdd0;-><init>(La/bed0;B)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v3, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iput-object v0, p0, La/bed0;->R1:La/ywq;

    .line 106
    .line 107
    new-instance v0, La/xn;

    .line 108
    .line 109
    invoke-direct {v0, v2}, La/xn;-><init>(B)V

    .line 110
    .line 111
    .line 112
    new-instance v2, La/zdd0;

    .line 113
    .line 114
    invoke-direct {v2, p0, v1}, La/zdd0;-><init>(La/bed0;B)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0, v2, v0}, Landroidx/fragment/app/Fragment;->m0(La/wn;La/bsr0;)La/ywq;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iput-object v0, p0, La/bed0;->S1:La/ywq;

    .line 122
    .line 123
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/bed0;->G0()La/f2r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/f2r;->e:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/xdd0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/xdd0;-><init>(La/bed0;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, La/xdd0;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-direct {p1, p0, v0}, La/xdd0;-><init>(La/bed0;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, La/xdd0;

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    invoke-direct {p1, p0, v0}, La/xdd0;-><init>(La/bed0;B)V

    .line 29
    .line 30
    .line 31
    const-string v0, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 32
    .line 33
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, La/xdd0;

    .line 37
    .line 38
    const/4 v1, 0x4

    .line 39
    invoke-direct {p1, p0, v1}, La/xdd0;-><init>(La/bed0;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 43
    .line 44
    .line 45
    new-instance p1, La/xdd0;

    .line 46
    .line 47
    const/4 v0, 0x5

    .line 48
    invoke-direct {p1, p0, v0}, La/xdd0;-><init>(La/bed0;B)V

    .line 49
    .line 50
    .line 51
    const-string v0, "REQUEST_SETTINGS_PUSH_FAVORITE_DIALOG_KEY"

    .line 52
    .line 53
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 54
    .line 55
    .line 56
    new-instance p1, La/xdd0;

    .line 57
    .line 58
    const/4 v1, 0x6

    .line 59
    invoke-direct {p1, p0, v1}, La/xdd0;-><init>(La/bed0;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final C0()V
    .locals 21

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
    const-class v2, La/ced0;

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
    instance-of v4, v1, La/ced0;

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
    check-cast v3, La/ced0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v5, v3, La/ced0;->a:La/cad;

    .line 58
    .line 59
    iget-object v9, v3, La/ced0;->b:La/duj;

    .line 60
    .line 61
    iget-object v6, v3, La/ced0;->c:La/yox;

    .line 62
    .line 63
    iget-object v7, v3, La/ced0;->d:La/iw20;

    .line 64
    .line 65
    iget-object v11, v3, La/ced0;->e:La/gst0;

    .line 66
    .line 67
    iget-object v1, v3, La/ced0;->f:La/v6j0;

    .line 68
    .line 69
    iget-object v2, v3, La/ced0;->g:La/btt0;

    .line 70
    .line 71
    iget-object v10, v3, La/ced0;->h:La/ii;

    .line 72
    .line 73
    iget-object v12, v3, La/ced0;->i:La/b3c0;

    .line 74
    .line 75
    iget-object v13, v3, La/ced0;->j:La/kt2;

    .line 76
    .line 77
    iget-object v8, v3, La/ced0;->k:La/wdd0;

    .line 78
    .line 79
    iget-object v14, v3, La/ced0;->l:La/hru;

    .line 80
    .line 81
    iget-object v15, v3, La/ced0;->m:La/us3;

    .line 82
    .line 83
    iget-object v4, v3, La/ced0;->n:La/q7d0;

    .line 84
    .line 85
    move-object/from16 v16, v1

    .line 86
    .line 87
    iget-object v1, v3, La/ced0;->o:La/vwb0;

    .line 88
    .line 89
    move-object/from16 v17, v1

    .line 90
    .line 91
    iget-object v1, v3, La/ced0;->p:La/wdk0;

    .line 92
    .line 93
    move-object/from16 v18, v1

    .line 94
    .line 95
    iget-object v1, v3, La/ced0;->q:La/ix0;

    .line 96
    .line 97
    iget-object v3, v3, La/ced0;->r:La/us00;

    .line 98
    .line 99
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-object/from16 v16, v4

    .line 133
    .line 134
    new-instance v4, La/v7i;

    .line 135
    .line 136
    move-object/from16 v19, v1

    .line 137
    .line 138
    move-object/from16 v20, v3

    .line 139
    .line 140
    invoke-direct/range {v4 .. v20}, La/v7i;-><init>(La/cad;La/yox;La/iw20;La/wdd0;La/duj;La/ii;La/gst0;La/b3c0;La/kt2;La/hru;La/us3;La/q7d0;La/vwb0;La/wdk0;La/ix0;La/us00;)V

    .line 141
    .line 142
    .line 143
    move-object/from16 v1, v18

    .line 144
    .line 145
    iget-object v2, v4, La/v7i;->o:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v2, La/n5d0;

    .line 148
    .line 149
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    check-cast v2, La/kqi;

    .line 154
    .line 155
    iput-object v2, v0, La/bed0;->L1:La/kqi;

    .line 156
    .line 157
    iput-object v10, v0, La/bed0;->M1:La/ii;

    .line 158
    .line 159
    iput-object v1, v0, La/bed0;->N1:La/wdk0;

    .line 160
    .line 161
    return-void

    .line 162
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 163
    .line 164
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/bed0;->H0()La/ned0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ned0;->z:La/ol60;

    .line 6
    .line 7
    new-instance v1, La/jjc0;

    .line 8
    .line 9
    const/4 v7, 0x4

    .line 10
    const/4 v8, 0x7

    .line 11
    const/4 v2, 0x2

    .line 12
    const-class v4, La/bed0;

    .line 13
    .line 14
    const-string v5, "handleUiEvents"

    .line 15
    .line 16
    const-string v6, "handleUiEvents(Lorg/xplatform/features/notification_settings/impl/presentation/PushNotificationSettingsViewModel$UiEvent;)V"

    .line 17
    .line 18
    move-object v3, p0

    .line 19
    invoke-direct/range {v1 .. v8}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 20
    .line 21
    .line 22
    sget-object p0, La/lkz;->a:La/lkz;

    .line 23
    .line 24
    iget-object p0, v3, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 25
    .line 26
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance v2, La/fxc0;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v2, v0, v3, v1, v4}, La/fxc0;-><init>(La/gmq;La/bed0;La/jjc0;La/yje;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-static {p0, v4, v4, v2, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final G0()La/f2r;
    .locals 2

    .line 1
    sget-object v0, La/bed0;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/bed0;->P1:La/s0r;

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
    check-cast p0, La/f2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/ned0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bed0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ned0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Y()V
    .locals 1

    .line 1
    iget-object v0, p0, La/bed0;->Q1:La/ywq;

    .line 2
    .line 3
    invoke-virtual {v0}, La/ywq;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/bed0;->R1:La/ywq;

    .line 7
    .line 8
    invoke-virtual {v0}, La/ywq;->b()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 13
    .line 14
    return-void
.end method

.method public final e0()V
    .locals 6

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/bed0;->H0()La/ned0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, La/ned0;->i:La/mne;

    .line 13
    .line 14
    iget-object v3, v1, La/mne;->b:La/dvj;

    .line 15
    .line 16
    new-instance v1, La/ded0;

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-direct {v1, p0, v2}, La/ded0;-><init>(La/ned0;B)V

    .line 20
    .line 21
    .line 22
    new-instance v4, La/led0;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-direct {v4, p0, v2, v5}, La/led0;-><init>(La/ned0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    const/16 v5, 0xa

    .line 30
    .line 31
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bed0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
