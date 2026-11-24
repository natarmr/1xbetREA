.class public final La/vzv;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/vzv;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/sqt",
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
.field public static final p2:La/sqt;

.field public static final synthetic q2:[La/iiy;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/a8z;

.field public final m2:La/yzn0;

.field public final n2:La/yzn0;

.field public final o2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/vzv;

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
    sput-object v1, La/vzv;->q2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/sqt;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/vzv;->p2:La/sqt;

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
    const-class v0, La/l0w;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/bdv;

    .line 13
    .line 14
    const/16 v2, 0xd

    .line 15
    .line 16
    invoke-direct {v1, p0, v2}, La/bdv;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/vzv;->l2:La/a8z;

    .line 24
    .line 25
    new-instance v0, La/yzn0;

    .line 26
    .line 27
    const-string v1, "HISTORY_TYPE_KEY"

    .line 28
    .line 29
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/vzv;->m2:La/yzn0;

    .line 33
    .line 34
    new-instance v0, La/yzn0;

    .line 35
    .line 36
    const-string v1, "HISTORY_TYPE_MODEL_KEY"

    .line 37
    .line 38
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/vzv;->n2:La/yzn0;

    .line 42
    .line 43
    new-instance v0, La/phf0;

    .line 44
    .line 45
    const-string v1, "HISTORY_STATUS_FILTER_REQUEST_KEY"

    .line 46
    .line 47
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, La/vzv;->o2:La/phf0;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 12

    .line 1
    const v0, 0x4a0307c3    # 2146800.8f

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/vzv;->P0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, La/ukd;->a:La/cl5;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    if-ne v2, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v6, p0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    new-instance v4, La/vft;

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    const/16 v11, 0x13

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    const-class v7, La/vzv;

    .line 35
    .line 36
    const-string v8, "handleSideEffects"

    .line 37
    .line 38
    const-string v9, "handleSideEffects(Lorg/xplatform/bet_history/history/presentation/dialog/history_coupon_status/model/HistoryCouponStatusDialogSideEffect;)V"

    .line 39
    .line 40
    move-object v6, p0

    .line 41
    invoke-direct/range {v4 .. v11}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v2, v4

    .line 48
    :goto_1
    check-cast v2, La/jhy;

    .line 49
    .line 50
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 51
    .line 52
    sget-object p0, La/lkz;->a:La/lkz;

    .line 53
    .line 54
    invoke-static {v2, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    or-int/2addr v1, v2

    .line 67
    const/4 v2, 0x3

    .line 68
    invoke-virtual {p1, v2}, La/fet;->e(I)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    or-int/2addr v1, v4

    .line 73
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    or-int/2addr v1, v4

    .line 78
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-nez v1, :cond_2

    .line 83
    .line 84
    if-ne v4, v3, :cond_3

    .line 85
    .line 86
    :cond_2
    new-instance v4, La/g6g;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    invoke-direct {v4, v0, v6, p0, v1}, La/g6g;-><init>(La/k3t0;La/vzv;La/pz40;La/yje;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 96
    .line 97
    invoke-static {p1, v6, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6}, La/vzv;->P0()La/k3t0;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, La/i3t0;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    sget-object v0, La/vzv;->q2:[La/iiy;

    .line 111
    .line 112
    const/4 v1, 0x1

    .line 113
    aget-object v0, v0, v1

    .line 114
    .line 115
    iget-object v3, v6, La/vzv;->n2:La/yzn0;

    .line 116
    .line 117
    invoke-virtual {v3, v6, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 122
    .line 123
    sget-object v3, La/tzv;->a:[I

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    aget v0, v3, v0

    .line 130
    .line 131
    if-ne v0, v1, :cond_4

    .line 132
    .line 133
    const v0, 0x7f1308b5

    .line 134
    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_4
    const v0, 0x7f130245

    .line 138
    .line 139
    .line 140
    :goto_2
    invoke-virtual {v6}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    iput-boolean v1, v3, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 145
    .line 146
    invoke-virtual {v6}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 151
    .line 152
    .line 153
    new-instance v4, La/bw5;

    .line 154
    .line 155
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    new-instance v1, La/cl2;

    .line 160
    .line 161
    const/4 v2, 0x5

    .line 162
    invoke-direct {v1, v0, v2}, La/cl2;-><init>(IB)V

    .line 163
    .line 164
    .line 165
    const v0, 0x7db1d374

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    new-instance v1, La/rgh;

    .line 173
    .line 174
    const/16 v2, 0x18

    .line 175
    .line 176
    invoke-direct {v1, p0, v6, v2}, La/rgh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 177
    .line 178
    .line 179
    const p0, 0x6fabd632

    .line 180
    .line 181
    .line 182
    invoke-static {p0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    const/16 v9, 0xa

    .line 187
    .line 188
    const/4 v7, 0x0

    .line 189
    move-object v6, v0

    .line 190
    invoke-direct/range {v4 .. v9}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 191
    .line 192
    .line 193
    const/4 p0, 0x0

    .line 194
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 195
    .line 196
    .line 197
    return-object v4
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/vzv;->l2:La/a8z;

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
    .locals 6

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
    const-class v0, La/k1w;

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
    instance-of v2, p1, La/k1w;

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
    check-cast v1, La/k1w;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    sget-object v0, La/vzv;->q2:[La/iiy;

    .line 60
    .line 61
    aget-object p1, v0, p1

    .line 62
    .line 63
    iget-object v2, p0, La/vzv;->m2:La/yzn0;

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
    iget-object v2, p0, La/vzv;->n2:La/yzn0;

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
    iget-object v2, v1, La/k1w;->b:La/cad;

    .line 83
    .line 84
    iget-object v3, v1, La/k1w;->a:La/ctf0;

    .line 85
    .line 86
    iget-object v4, v1, La/k1w;->d:La/j77;

    .line 87
    .line 88
    iget-object v1, v1, La/k1w;->c:La/pru;

    .line 89
    .line 90
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v5, La/ywq0;

    .line 97
    .line 98
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    iput-object v0, v5, La/ywq0;->a:Ljava/lang/Object;

    .line 102
    .line 103
    iput-object p1, v5, La/ywq0;->b:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v2, v5, La/ywq0;->c:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object v1, v5, La/ywq0;->d:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v3, v5, La/ywq0;->e:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v4, v5, La/ywq0;->f:Ljava/lang/Object;

    .line 112
    .line 113
    new-instance p1, La/ugi;

    .line 114
    .line 115
    const/16 v0, 0x1d

    .line 116
    .line 117
    invoke-direct {p1, v5, v0}, La/ugi;-><init>(Ljava/lang/Object;B)V

    .line 118
    .line 119
    .line 120
    iput-object p1, v5, La/ywq0;->g:Ljava/lang/Object;

    .line 121
    .line 122
    new-instance p1, La/fiu0;

    .line 123
    .line 124
    iget-object v0, v5, La/ywq0;->g:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, La/ugi;

    .line 127
    .line 128
    const-class v1, La/l0w;

    .line 129
    .line 130
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
    iput-object p1, p0, La/vzv;->k2:La/fiu0;

    .line 138
    .line 139
    return-void

    .line 140
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 141
    .line 142
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method
