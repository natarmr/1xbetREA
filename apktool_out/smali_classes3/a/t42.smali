.class public final La/t42;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/t42;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/jdk0",
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
.field public static final p2:La/jdk0;

.field public static final synthetic q2:[La/iiy;


# instance fields
.field public final k2:La/yzn0;

.field public final l2:La/yzn0;

.field public final m2:La/phf0;

.field public n2:La/fiu0;

.field public final o2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/t42;

    .line 4
    .line 5
    const-string v2, "historyTypeScreen"

    .line 6
    .line 7
    const-string v3, "getHistoryTypeScreen()Lorg/xplatform/bet_history/domain/model/HistoryTypeScreen;"

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
    const-string v3, "historyTypeModel"

    .line 16
    .line 17
    const-string v5, "getHistoryTypeModel()Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "requestKey"

    .line 25
    .line 26
    const-string v6, "getRequestKey()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/t42;->q2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/jdk0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/t42;->p2:La/jdk0;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/yzn0;

    .line 5
    .line 6
    const-string v1, "HISTORY_TYPE_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/t42;->k2:La/yzn0;

    .line 12
    .line 13
    new-instance v0, La/yzn0;

    .line 14
    .line 15
    const-string v1, "HISTORY_TYPE_MODEL_KEY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/t42;->l2:La/yzn0;

    .line 21
    .line 22
    new-instance v0, La/phf0;

    .line 23
    .line 24
    const-string v1, "REQUEST_KEY"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/t42;->m2:La/phf0;

    .line 30
    .line 31
    const-class v0, La/h52;

    .line 32
    .line 33
    sget-object v1, La/sre0;->a:La/tre0;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, La/r42;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-direct {v1, p0, v2}, La/r42;-><init>(La/t42;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, La/t42;->o2:La/a8z;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 14

    .line 1
    const v0, 0x2e69b586

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 13
    .line 14
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v2, 0x3

    .line 19
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, La/t42;->Q0()La/k3t0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    sget-object v5, La/ukd;->a:La/cl5;

    .line 35
    .line 36
    if-nez v3, :cond_1

    .line 37
    .line 38
    if-ne v4, v5, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move-object v8, p0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    new-instance v6, La/ln1;

    .line 44
    .line 45
    const/4 v12, 0x0

    .line 46
    const/16 v13, 0xa

    .line 47
    .line 48
    const/4 v7, 0x1

    .line 49
    const-class v9, La/t42;

    .line 50
    .line 51
    const-string v10, "handleSideEffects"

    .line 52
    .line 53
    const-string v11, "handleSideEffects(Lorg/xplatform/bet_history/history/presentation/dialog/all_filters_bottom_sheet/model/AllFiltersSideEffect;)V"

    .line 54
    .line 55
    move-object v8, p0

    .line 56
    invoke-direct/range {v6 .. v13}, La/ln1;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v4, v6

    .line 63
    :goto_1
    check-cast v4, La/jhy;

    .line 64
    .line 65
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 66
    .line 67
    sget-object p0, La/lkz;->a:La/lkz;

    .line 68
    .line 69
    invoke-static {v4, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-virtual {p1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    or-int/2addr v3, v4

    .line 82
    invoke-virtual {p1, v2}, La/fet;->e(I)Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    or-int/2addr v2, v3

    .line 87
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    or-int/2addr v2, v3

    .line 92
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    if-nez v2, :cond_2

    .line 97
    .line 98
    if-ne v3, v5, :cond_3

    .line 99
    .line 100
    :cond_2
    new-instance v3, La/ee0;

    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    invoke-direct {v3, v0, v8, p0, v2}, La/ee0;-><init>(La/k3t0;La/t42;La/pz40;La/yje;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 110
    .line 111
    invoke-static {p1, v8, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v8}, La/t42;->Q0()La/k3t0;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, La/i3t0;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, La/d52;

    .line 129
    .line 130
    iget-object v0, v0, La/d52;->e:La/wul;

    .line 131
    .line 132
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    new-instance v2, La/bw5;

    .line 137
    .line 138
    new-instance v1, La/q42;

    .line 139
    .line 140
    const/4 v9, 0x0

    .line 141
    invoke-direct {v1, p0, v9}, La/q42;-><init>(La/pz40;B)V

    .line 142
    .line 143
    .line 144
    const v4, 0x3bbb0c75

    .line 145
    .line 146
    .line 147
    invoke-static {v4, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    new-instance v1, La/ri1;

    .line 152
    .line 153
    const/16 v5, 0x1c

    .line 154
    .line 155
    invoke-direct {v1, p0, v8, v5}, La/ri1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 156
    .line 157
    .line 158
    const v5, -0x76f3b9c3

    .line 159
    .line 160
    .line 161
    invoke-static {v5, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 162
    .line 163
    .line 164
    move-result-object v5

    .line 165
    new-instance v1, La/qb;

    .line 166
    .line 167
    const/16 v6, 0x10

    .line 168
    .line 169
    invoke-direct {v1, p0, v0, v8, v6}, La/qb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 170
    .line 171
    .line 172
    const p0, -0x12946789    # -4.557081E27f

    .line 173
    .line 174
    .line 175
    invoke-static {p0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    const/4 v7, 0x2

    .line 180
    invoke-direct/range {v2 .. v7}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1, v9}, La/fet;->r(Z)V

    .line 184
    .line 185
    .line 186
    return-object v2
.end method

.method public final P0(La/inh0;Lkotlin/jvm/functions/Function2;La/fet;I)V
    .locals 31

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v9, p3

    .line 6
    .line 7
    const v0, -0x5c248abf

    .line 8
    .line 9
    .line 10
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x2

    .line 18
    const/4 v4, 0x4

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move v0, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v1

    .line 24
    :goto_0
    or-int v0, p4, v0

    .line 25
    .line 26
    invoke-virtual {v9, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    const/16 v6, 0x20

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    move v5, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v5, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v0, v5

    .line 39
    and-int/lit8 v5, v0, 0x13

    .line 40
    .line 41
    const/16 v7, 0x12

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    const/4 v10, 0x1

    .line 45
    if-eq v5, v7, :cond_2

    .line 46
    .line 47
    move v5, v10

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v5, v8

    .line 50
    :goto_2
    and-int/lit8 v7, v0, 0x1

    .line 51
    .line 52
    invoke-virtual {v9, v7, v5}, La/fet;->U(IZ)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_8

    .line 57
    .line 58
    sget-object v5, La/uc9;->c:La/mw3;

    .line 59
    .line 60
    sget-object v7, La/gqw0;->m:La/xx7;

    .line 61
    .line 62
    invoke-static {v5, v7, v9, v8}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    iget-wide v11, v9, La/fet;->T:J

    .line 67
    .line 68
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 73
    .line 74
    .line 75
    move-result-object v11

    .line 76
    sget-object v12, La/jm40;->b:La/jm40;

    .line 77
    .line 78
    invoke-static {v9, v12}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    sget-object v14, La/mkd;->c0:La/gqw0;

    .line 83
    .line 84
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v9}, La/fet;->i0()V

    .line 88
    .line 89
    .line 90
    iget-boolean v14, v9, La/fet;->S:Z

    .line 91
    .line 92
    if-eqz v14, :cond_3

    .line 93
    .line 94
    sget-object v14, La/e7z;->u1:La/pcy;

    .line 95
    .line 96
    invoke-virtual {v9, v14}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_3
    invoke-virtual {v9}, La/fet;->r0()V

    .line 101
    .line 102
    .line 103
    :goto_3
    sget-object v14, La/gqw0;->x:La/shd;

    .line 104
    .line 105
    invoke-static {v9, v5, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 106
    .line 107
    .line 108
    sget-object v5, La/gqw0;->w:La/shd;

    .line 109
    .line 110
    invoke-static {v9, v11, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    sget-object v7, La/gqw0;->y:La/shd;

    .line 118
    .line 119
    invoke-static {v9, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 120
    .line 121
    .line 122
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 123
    .line 124
    .line 125
    sget-object v5, La/gqw0;->v:La/shd;

    .line 126
    .line 127
    invoke-static {v9, v13, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 128
    .line 129
    .line 130
    sget-object v5, La/qmk;->a:La/zcl;

    .line 131
    .line 132
    const/high16 v5, 0x42100000    # 36.0f

    .line 133
    .line 134
    invoke-static {v12, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    const/high16 v7, 0x3f800000    # 1.0f

    .line 139
    .line 140
    invoke-static {v5, v7}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    sget-object v7, La/gqw0;->d:La/zx7;

    .line 145
    .line 146
    invoke-static {v5, v7, v1}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    move v1, v4

    .line 151
    iget-object v4, v2, La/inh0;->a:Ljava/lang/String;

    .line 152
    .line 153
    sget-object v17, La/j1t0;->b:La/qrq;

    .line 154
    .line 155
    sget-wide v14, La/qmk;->r:J

    .line 156
    .line 157
    sget-wide v23, La/qmk;->F:J

    .line 158
    .line 159
    new-instance v11, La/y9q0;

    .line 160
    .line 161
    const/16 v22, 0x0

    .line 162
    .line 163
    const v25, 0xfdffdd

    .line 164
    .line 165
    .line 166
    const-wide/16 v12, 0x0

    .line 167
    .line 168
    const/16 v16, 0x0

    .line 169
    .line 170
    const-wide/16 v18, 0x0

    .line 171
    .line 172
    const/16 v20, 0x0

    .line 173
    .line 174
    const/16 v21, 0x0

    .line 175
    .line 176
    invoke-direct/range {v11 .. v25}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 177
    .line 178
    .line 179
    invoke-static {v11, v9}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 180
    .line 181
    .line 182
    move-result-object v24

    .line 183
    const/16 v27, 0x6180

    .line 184
    .line 185
    const v28, 0x1affc

    .line 186
    .line 187
    .line 188
    move v11, v6

    .line 189
    const-wide/16 v6, 0x0

    .line 190
    .line 191
    move v12, v8

    .line 192
    const/4 v8, 0x0

    .line 193
    move v13, v10

    .line 194
    const-wide/16 v9, 0x0

    .line 195
    .line 196
    move v14, v11

    .line 197
    const/4 v11, 0x0

    .line 198
    move v15, v12

    .line 199
    const/4 v12, 0x0

    .line 200
    move/from16 v16, v13

    .line 201
    .line 202
    const/4 v13, 0x0

    .line 203
    move/from16 v17, v14

    .line 204
    .line 205
    move/from16 v18, v15

    .line 206
    .line 207
    const-wide/16 v14, 0x0

    .line 208
    .line 209
    move/from16 v19, v16

    .line 210
    .line 211
    const/16 v16, 0x0

    .line 212
    .line 213
    move/from16 v20, v17

    .line 214
    .line 215
    move/from16 v21, v18

    .line 216
    .line 217
    const-wide/16 v17, 0x0

    .line 218
    .line 219
    move/from16 v22, v19

    .line 220
    .line 221
    const/16 v19, 0x2

    .line 222
    .line 223
    move/from16 v23, v20

    .line 224
    .line 225
    const/16 v20, 0x0

    .line 226
    .line 227
    move/from16 v25, v21

    .line 228
    .line 229
    const/16 v21, 0x1

    .line 230
    .line 231
    move/from16 v26, v22

    .line 232
    .line 233
    const/16 v22, 0x0

    .line 234
    .line 235
    move/from16 v29, v23

    .line 236
    .line 237
    const/16 v23, 0x0

    .line 238
    .line 239
    move/from16 v30, v26

    .line 240
    .line 241
    const/16 v26, 0x0

    .line 242
    .line 243
    move-object/from16 v25, p3

    .line 244
    .line 245
    move/from16 v1, v29

    .line 246
    .line 247
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 248
    .line 249
    .line 250
    move-object/from16 v9, v25

    .line 251
    .line 252
    iget-object v5, v2, La/inh0;->b:La/fyl;

    .line 253
    .line 254
    sget-object v6, La/vxl;->b:La/vxl;

    .line 255
    .line 256
    and-int/lit8 v4, v0, 0x70

    .line 257
    .line 258
    if-ne v4, v1, :cond_4

    .line 259
    .line 260
    const/4 v8, 0x1

    .line 261
    goto :goto_4

    .line 262
    :cond_4
    const/4 v8, 0x0

    .line 263
    :goto_4
    and-int/lit8 v0, v0, 0xe

    .line 264
    .line 265
    const/4 v1, 0x4

    .line 266
    if-ne v0, v1, :cond_5

    .line 267
    .line 268
    const/16 v29, 0x1

    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_5
    const/16 v29, 0x0

    .line 272
    .line 273
    :goto_5
    or-int v0, v8, v29

    .line 274
    .line 275
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    if-nez v0, :cond_6

    .line 280
    .line 281
    sget-object v0, La/ukd;->a:La/cl5;

    .line 282
    .line 283
    if-ne v1, v0, :cond_7

    .line 284
    .line 285
    :cond_6
    new-instance v1, La/df1;

    .line 286
    .line 287
    const/16 v0, 0xa

    .line 288
    .line 289
    invoke-direct {v1, v3, v2, v0}, La/df1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    :cond_7
    move-object v7, v1

    .line 296
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 297
    .line 298
    const/16 v10, 0x180

    .line 299
    .line 300
    const/16 v11, 0x29

    .line 301
    .line 302
    const/4 v4, 0x0

    .line 303
    const/4 v8, 0x0

    .line 304
    invoke-static/range {v4 .. v11}, La/ebc;->r(La/mm40;La/hyl;La/vxl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 305
    .line 306
    .line 307
    const/4 v13, 0x1

    .line 308
    invoke-virtual {v9, v13}, La/fet;->r(Z)V

    .line 309
    .line 310
    .line 311
    goto :goto_6

    .line 312
    :cond_8
    invoke-virtual {v9}, La/fet;->X()V

    .line 313
    .line 314
    .line 315
    :goto_6
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    if-eqz v6, :cond_9

    .line 320
    .line 321
    new-instance v0, La/znk;

    .line 322
    .line 323
    const/16 v5, 0x1c

    .line 324
    .line 325
    move-object/from16 v1, p0

    .line 326
    .line 327
    move/from16 v4, p4

    .line 328
    .line 329
    invoke-direct/range {v0 .. v5}, La/znk;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 330
    .line 331
    .line 332
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 333
    .line 334
    :cond_9
    return-void
.end method

.method public final Q0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/t42;->o2:La/a8z;

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

.method public final V(Landroid/content/Context;)V
    .locals 9

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/u42;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/u42;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/u42;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    sget-object v0, La/t42;->q2:[La/iiy;

    .line 60
    .line 61
    aget-object p1, v0, p1

    .line 62
    .line 63
    iget-object v2, p0, La/t42;->k2:La/yzn0;

    .line 64
    .line 65
    invoke-virtual {v2, p0, p1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, La/f8w;

    .line 70
    .line 71
    const/4 v2, 0x1

    .line 72
    aget-object v0, v0, v2

    .line 73
    .line 74
    iget-object v2, p0, La/t42;->l2:La/yzn0;

    .line 75
    .line 76
    invoke-virtual {v2, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 81
    .line 82
    iget-object v2, v1, La/u42;->b:La/cad;

    .line 83
    .line 84
    iget-object v3, v1, La/u42;->a:La/ctf0;

    .line 85
    .line 86
    iget-object v4, v1, La/u42;->d:La/r9u;

    .line 87
    .line 88
    iget-object v5, v1, La/u42;->c:La/pru;

    .line 89
    .line 90
    iget-object v6, v1, La/u42;->e:La/j77;

    .line 91
    .line 92
    iget-object v7, v1, La/u42;->f:La/t37;

    .line 93
    .line 94
    iget-object v1, v1, La/u42;->g:La/xdj;

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    new-instance v8, La/ru;

    .line 112
    .line 113
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object v0, v8, La/ru;->a:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object p1, v8, La/ru;->b:Ljava/lang/Object;

    .line 119
    .line 120
    iput-object v7, v8, La/ru;->c:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v6, v8, La/ru;->d:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v5, v8, La/ru;->f:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v3, v8, La/ru;->e:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object v1, v8, La/ru;->g:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v4, v8, La/ru;->h:Ljava/lang/Object;

    .line 131
    .line 132
    iput-object v2, v8, La/ru;->i:Ljava/lang/Object;

    .line 133
    .line 134
    new-instance p1, La/t5i;

    .line 135
    .line 136
    const/16 v0, 0x19

    .line 137
    .line 138
    invoke-direct {p1, v8, v0}, La/t5i;-><init>(Ljava/lang/Object;B)V

    .line 139
    .line 140
    .line 141
    iput-object p1, v8, La/ru;->j:Ljava/lang/Object;

    .line 142
    .line 143
    new-instance p1, La/fiu0;

    .line 144
    .line 145
    iget-object v0, v8, La/ru;->j:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, La/t5i;

    .line 148
    .line 149
    const-class v1, La/h52;

    .line 150
    .line 151
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 156
    .line 157
    .line 158
    iput-object p1, p0, La/t42;->n2:La/fiu0;

    .line 159
    .line 160
    return-void

    .line 161
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 162
    .line 163
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/iw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance p2, La/gne;

    .line 12
    .line 13
    const/16 v0, 0x9

    .line 14
    .line 15
    invoke-direct {p2, p0, v0}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    const-string v0, "DATE_PICKER_REQUEST_KEY"

    .line 19
    .line 20
    invoke-virtual {p1, v0, p0, p2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 21
    .line 22
    .line 23
    new-instance p1, La/p42;

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    invoke-direct {p1, p0, p2}, La/p42;-><init>(La/t42;B)V

    .line 27
    .line 28
    .line 29
    const-string p2, "HISTORY_DAY_PICKER_KEY"

    .line 30
    .line 31
    invoke-static {p0, p2, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, La/p42;

    .line 35
    .line 36
    const/4 p2, 0x1

    .line 37
    invoke-direct {p1, p0, p2}, La/p42;-><init>(La/t42;B)V

    .line 38
    .line 39
    .line 40
    const-string p2, "RESULT_KEY_CALENDAR_RANGE_REQUEST"

    .line 41
    .line 42
    invoke-static {p0, p2, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
