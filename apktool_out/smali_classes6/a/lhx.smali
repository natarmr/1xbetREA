.class public final La/lhx;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/lhx;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/ihx",
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
.field public static final Y1:La/ihx;

.field public static final synthetic Z1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/ndf0;

.field public M1:La/vq;

.field public N1:La/e720;

.field public O1:La/ii;

.field public P1:La/qta0;

.field public Q1:La/wdk0;

.field public R1:La/lgn0;

.field public S1:La/ogx;

.field public final U1:La/s0r;

.field public final V1:La/a8z;

.field public final W1:Z

.field public final X1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/lhx;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/sportgame/markets/insights/impl/databinding/FragmentInsightsMarketsBinding;"

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
    const-string v3, "screenParams"

    .line 16
    .line 17
    const-string v5, "getScreenParams()Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$InsightsSubGame;"

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
    sput-object v1, La/lhx;->Z1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/ihx;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/lhx;->Y1:La/ihx;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const v0, 0x7f0d0251

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/lhx;->K1:La/i9o0;

    .line 10
    .line 11
    sget-object v0, La/jhx;->a:La/jhx;

    .line 12
    .line 13
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, La/lhx;->U1:La/s0r;

    .line 18
    .line 19
    const-class v0, La/dix;

    .line 20
    .line 21
    sget-object v1, La/sre0;->a:La/tre0;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, La/hhx;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-direct {v1, p0, v2}, La/hhx;-><init>(La/lhx;B)V

    .line 31
    .line 32
    .line 33
    const/16 v3, 0xe

    .line 34
    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static {p0, v0, v4, v1, v3}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/lhx;->V1:La/a8z;

    .line 41
    .line 42
    iput-boolean v2, p0, La/lhx;->W1:Z

    .line 43
    .line 44
    new-instance v0, La/khf0;

    .line 45
    .line 46
    const-string v1, "INSIGHTS_MARKETS_SCREEN_PARAMS_KEY"

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, La/lhx;->X1:La/khf0;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    new-instance v0, La/z430;

    .line 2
    .line 3
    iget-object v2, p0, La/lhx;->M1:La/vq;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    if-eqz v2, :cond_5

    .line 7
    .line 8
    iget-object v3, p0, La/lhx;->O1:La/ii;

    .line 9
    .line 10
    if-eqz v3, :cond_4

    .line 11
    .line 12
    iget-object v4, p0, La/lhx;->N1:La/e720;

    .line 13
    .line 14
    if-eqz v4, :cond_3

    .line 15
    .line 16
    iget-object v5, p0, La/lhx;->R1:La/lgn0;

    .line 17
    .line 18
    if-eqz v5, :cond_2

    .line 19
    .line 20
    iget-object v6, p0, La/lhx;->Q1:La/wdk0;

    .line 21
    .line 22
    if-eqz v6, :cond_1

    .line 23
    .line 24
    iget-object v7, p0, La/lhx;->P1:La/qta0;

    .line 25
    .line 26
    if-eqz v7, :cond_0

    .line 27
    .line 28
    move-object v1, p0

    .line 29
    invoke-direct/range {v0 .. v7}, La/z430;-><init>(Landroidx/fragment/app/Fragment;La/vq;La/ii;La/e720;La/lgn0;La/wdk0;La/qta0;)V

    .line 30
    .line 31
    .line 32
    new-instance p0, La/br2;

    .line 33
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v2, La/ghx;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v2, v1, v3}, La/ghx;-><init>(La/lhx;B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0, v2}, La/z430;->b(La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, La/lhx;->G0()La/k3t0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, La/i3t0;

    .line 51
    .line 52
    invoke-virtual {p0}, La/i3t0;->C()La/gmq;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    new-instance v2, La/khx;

    .line 57
    .line 58
    invoke-direct {v2, v1, v0, p1, v3}, La/khx;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 59
    .line 60
    .line 61
    sget-object v0, La/lkz;->a:La/lkz;

    .line 62
    .line 63
    invoke-static {v1}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    new-instance v5, La/r1w;

    .line 76
    .line 77
    check-cast p0, La/i89;

    .line 78
    .line 79
    invoke-direct {v5, p0, v0, v2, p1}, La/r1w;-><init>(La/i89;La/clz;La/khx;La/yje;)V

    .line 80
    .line 81
    .line 82
    const/4 p0, 0x3

    .line 83
    invoke-static {v4, p1, p1, v5, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 84
    .line 85
    .line 86
    sget-object p0, La/lhx;->Z1:[La/iiy;

    .line 87
    .line 88
    aget-object p0, p0, v3

    .line 89
    .line 90
    iget-object v0, v1, La/lhx;->U1:La/s0r;

    .line 91
    .line 92
    invoke-virtual {v0, p0, v1}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    check-cast p0, La/u0r;

    .line 100
    .line 101
    iget-object p0, p0, La/u0r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 102
    .line 103
    new-instance v0, La/owp0;

    .line 104
    .line 105
    invoke-direct {v0, v1}, La/owp0;-><init>(La/clz;)V

    .line 106
    .line 107
    .line 108
    new-instance v2, La/tx;

    .line 109
    .line 110
    const/16 v3, 0x16

    .line 111
    .line 112
    invoke-direct {v2, v1, v3}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 113
    .line 114
    .line 115
    new-instance v1, La/ugd;

    .line 116
    .line 117
    const v3, -0x345684a

    .line 118
    .line 119
    .line 120
    const/4 v4, 0x1

    .line 121
    invoke-direct {v1, v3, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-static {p0, v0, p1, v1}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_0
    const-string p0, "polybetRulesDialogFactory"

    .line 129
    .line 130
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p1

    .line 134
    :cond_1
    const-string p0, "snackbarManager"

    .line 135
    .line 136
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_2
    const-string p0, "successBetAlertManager"

    .line 141
    .line 142
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p1

    .line 146
    :cond_3
    const-string p0, "makeBetBottomSheetProvider"

    .line 147
    .line 148
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p1

    .line 152
    :cond_4
    const-string p0, "actionDialogManager"

    .line 153
    .line 154
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p1

    .line 158
    :cond_5
    const-string p0, "addEventToCouponDelegate"

    .line 159
    .line 160
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw p1
.end method

.method public final C0()V
    .locals 46

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
    const-class v2, La/pgx;

    .line 24
    .line 25
    if-eqz v1, :cond_7

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
    instance-of v4, v1, La/pgx;

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
    check-cast v3, La/pgx;

    .line 54
    .line 55
    if-eqz v3, :cond_7

    .line 56
    .line 57
    sget-object v1, La/lhx;->Z1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/lhx;->X1:La/khf0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object/from16 v24, v1

    .line 69
    .line 70
    check-cast v24, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$InsightsSubGame;

    .line 71
    .line 72
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 73
    .line 74
    .line 75
    move-result-object v23

    .line 76
    move-object v1, v0

    .line 77
    :goto_3
    const-string v2, "Can\'t find feature provider!"

    .line 78
    .line 79
    if-eqz v1, :cond_6

    .line 80
    .line 81
    instance-of v4, v1, La/ocl0;

    .line 82
    .line 83
    if-eqz v4, :cond_5

    .line 84
    .line 85
    check-cast v1, La/ocl0;

    .line 86
    .line 87
    move-object v4, v0

    .line 88
    :goto_4
    if-eqz v4, :cond_4

    .line 89
    .line 90
    instance-of v5, v4, La/odf0;

    .line 91
    .line 92
    if-eqz v5, :cond_3

    .line 93
    .line 94
    check-cast v4, La/odf0;

    .line 95
    .line 96
    new-instance v2, La/hhx;

    .line 97
    .line 98
    const/4 v5, 0x0

    .line 99
    invoke-direct {v2, v0, v5}, La/hhx;-><init>(La/lhx;B)V

    .line 100
    .line 101
    .line 102
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-object v5, v3, La/pgx;->a:La/cad;

    .line 106
    .line 107
    invoke-interface {v1, v2}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    iget-object v1, v3, La/pgx;->M:La/qoi;

    .line 112
    .line 113
    iget-object v2, v3, La/pgx;->b:La/wdk0;

    .line 114
    .line 115
    iget-object v7, v3, La/pgx;->c:La/lgn0;

    .line 116
    .line 117
    move-object/from16 v26, v7

    .line 118
    .line 119
    iget-object v7, v3, La/pgx;->d:La/sue;

    .line 120
    .line 121
    iget-object v8, v3, La/pgx;->e:La/m1e;

    .line 122
    .line 123
    iget-object v9, v3, La/pgx;->f:La/duj;

    .line 124
    .line 125
    iget-object v10, v3, La/pgx;->g:La/ctf0;

    .line 126
    .line 127
    iget-object v11, v3, La/pgx;->h:La/gst0;

    .line 128
    .line 129
    iget-object v12, v3, La/pgx;->i:La/btt0;

    .line 130
    .line 131
    iget-object v13, v3, La/pgx;->j:La/b3c0;

    .line 132
    .line 133
    iget-object v14, v3, La/pgx;->k:La/j1q0;

    .line 134
    .line 135
    iget-object v15, v3, La/pgx;->l:La/r9u;

    .line 136
    .line 137
    move-object/from16 v19, v1

    .line 138
    .line 139
    iget-object v1, v3, La/pgx;->m:La/reu;

    .line 140
    .line 141
    move-object/from16 v33, v1

    .line 142
    .line 143
    iget-object v1, v3, La/pgx;->H:La/u8u;

    .line 144
    .line 145
    move-object/from16 v34, v1

    .line 146
    .line 147
    iget-object v1, v3, La/pgx;->I:La/edu;

    .line 148
    .line 149
    move-object/from16 v27, v8

    .line 150
    .line 151
    iget-object v8, v3, La/pgx;->n:La/rmd0;

    .line 152
    .line 153
    move-object/from16 v35, v1

    .line 154
    .line 155
    iget-object v1, v3, La/pgx;->o:La/ii;

    .line 156
    .line 157
    move-object/from16 v32, v15

    .line 158
    .line 159
    iget-object v15, v3, La/pgx;->E:La/wsf0;

    .line 160
    .line 161
    move-object/from16 v36, v1

    .line 162
    .line 163
    iget-object v1, v3, La/pgx;->p:La/edo;

    .line 164
    .line 165
    move-object/from16 v37, v1

    .line 166
    .line 167
    iget-object v1, v3, La/pgx;->q:La/zfo;

    .line 168
    .line 169
    move-object/from16 v38, v1

    .line 170
    .line 171
    iget-object v1, v3, La/pgx;->r:La/us3;

    .line 172
    .line 173
    move-object/from16 v16, v1

    .line 174
    .line 175
    iget-object v1, v3, La/pgx;->s:La/knf0;

    .line 176
    .line 177
    move-object/from16 v39, v1

    .line 178
    .line 179
    iget-object v1, v3, La/pgx;->t:La/gii0;

    .line 180
    .line 181
    move-object/from16 v28, v9

    .line 182
    .line 183
    iget-object v9, v3, La/pgx;->u:La/iip;

    .line 184
    .line 185
    move-object/from16 v29, v10

    .line 186
    .line 187
    iget-object v10, v3, La/pgx;->v:La/iw20;

    .line 188
    .line 189
    move-object/from16 v30, v11

    .line 190
    .line 191
    iget-object v11, v3, La/pgx;->w:La/fvt0;

    .line 192
    .line 193
    move-object/from16 v17, v12

    .line 194
    .line 195
    iget-object v12, v3, La/pgx;->x:La/onv;

    .line 196
    .line 197
    move-object/from16 v18, v13

    .line 198
    .line 199
    iget-object v13, v3, La/pgx;->y:La/d1p;

    .line 200
    .line 201
    move-object/from16 v20, v1

    .line 202
    .line 203
    iget-object v1, v3, La/pgx;->z:La/drm0;

    .line 204
    .line 205
    move-object/from16 v21, v1

    .line 206
    .line 207
    iget-object v1, v3, La/pgx;->A:La/v88;

    .line 208
    .line 209
    move-object/from16 v31, v14

    .line 210
    .line 211
    iget-object v14, v3, La/pgx;->B:La/onv;

    .line 212
    .line 213
    move-object/from16 v40, v1

    .line 214
    .line 215
    iget-object v1, v3, La/pgx;->C:La/kt2;

    .line 216
    .line 217
    move-object/from16 v41, v1

    .line 218
    .line 219
    iget-object v1, v3, La/pgx;->D:La/peg0;

    .line 220
    .line 221
    move-object/from16 v42, v1

    .line 222
    .line 223
    iget-object v1, v3, La/pgx;->F:La/vwb0;

    .line 224
    .line 225
    move-object/from16 v22, v1

    .line 226
    .line 227
    iget-object v1, v3, La/pgx;->G:La/ouu;

    .line 228
    .line 229
    invoke-interface {v4}, La/odf0;->b()La/pdf0;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    move-object/from16 v43, v1

    .line 234
    .line 235
    iget-object v1, v3, La/pgx;->J:La/bzu;

    .line 236
    .line 237
    move-object/from16 v25, v1

    .line 238
    .line 239
    iget-object v1, v3, La/pgx;->K:La/o2j0;

    .line 240
    .line 241
    move-object/from16 v44, v1

    .line 242
    .line 243
    iget-object v1, v3, La/pgx;->L:La/vqc;

    .line 244
    .line 245
    move-object/from16 v45, v1

    .line 246
    .line 247
    iget-object v1, v3, La/pgx;->N:La/jw20;

    .line 248
    .line 249
    iget-object v3, v3, La/pgx;->O:La/ndf0;

    .line 250
    .line 251
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    invoke-virtual/range {v32 .. v32}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    move-object/from16 v16, v4

    .line 321
    .line 322
    new-instance v4, La/eji;

    .line 323
    .line 324
    move-object/from16 v18, v1

    .line 325
    .line 326
    move-object/from16 v17, v21

    .line 327
    .line 328
    move-object/from16 v20, v25

    .line 329
    .line 330
    move-object/from16 v21, v44

    .line 331
    .line 332
    move-object/from16 v22, v45

    .line 333
    .line 334
    move-object/from16 v25, v2

    .line 335
    .line 336
    move-object/from16 v44, v3

    .line 337
    .line 338
    invoke-direct/range {v4 .. v44}, La/eji;-><init>(La/cad;La/pcl0;La/sue;La/rmd0;La/iip;La/iw20;La/fvt0;La/onv;La/d1p;La/onv;La/wsf0;La/pdf0;La/drm0;La/jw20;La/qoi;La/bzu;La/o2j0;La/vqc;La/i1w0;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$InsightsSubGame;La/wdk0;La/lgn0;La/m1e;La/duj;La/ctf0;La/gst0;La/j1q0;La/r9u;La/reu;La/u8u;La/edu;La/ii;La/edo;La/zfo;La/knf0;La/v88;La/kt2;La/peg0;La/ouu;La/ndf0;)V

    .line 339
    .line 340
    .line 341
    move-object v5, v4

    .line 342
    move-object/from16 v1, v25

    .line 343
    .line 344
    move-object/from16 v2, v26

    .line 345
    .line 346
    move-object/from16 v3, v36

    .line 347
    .line 348
    move-object/from16 v4, v44

    .line 349
    .line 350
    iput-object v4, v0, La/lhx;->L1:La/ndf0;

    .line 351
    .line 352
    invoke-interface {v7}, La/sue;->w()La/vq;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 357
    .line 358
    .line 359
    iput-object v4, v0, La/lhx;->M1:La/vq;

    .line 360
    .line 361
    iget-object v4, v14, La/onv;->a:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v4, La/ali;

    .line 364
    .line 365
    invoke-virtual {v4}, La/ali;->z()La/e720;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    iput-object v4, v0, La/lhx;->N1:La/e720;

    .line 370
    .line 371
    iput-object v3, v0, La/lhx;->O1:La/ii;

    .line 372
    .line 373
    invoke-virtual/range {v19 .. v19}, La/qoi;->a()La/qta0;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    iput-object v3, v0, La/lhx;->P1:La/qta0;

    .line 378
    .line 379
    iput-object v1, v0, La/lhx;->Q1:La/wdk0;

    .line 380
    .line 381
    iput-object v2, v0, La/lhx;->R1:La/lgn0;

    .line 382
    .line 383
    iget-object v1, v5, La/eji;->J:La/n5d0;

    .line 384
    .line 385
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    check-cast v1, La/ogx;

    .line 390
    .line 391
    iput-object v1, v0, La/lhx;->S1:La/ogx;

    .line 392
    .line 393
    return-void

    .line 394
    :cond_3
    iget-object v4, v4, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 395
    .line 396
    goto/16 :goto_4

    .line 397
    .line 398
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    return-void

    .line 402
    :cond_5
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 403
    .line 404
    goto/16 :goto_3

    .line 405
    .line 406
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    return-void

    .line 410
    :cond_7
    const-string v0, "Cannot create dependency "

    .line 411
    .line 412
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/lhx;->V1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/lhx;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/dhx;->b:La/dhx;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/lhx;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/dhx;->a:La/dhx;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/lhx;->W1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/lhx;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
