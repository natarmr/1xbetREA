.class public final La/lk1;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/lk1;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/rek0",
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
.field public static final U1:La/rek0;

.field public static final synthetic V1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:La/s0r;

.field public M1:La/fiu0;

.field public final N1:La/a8z;

.field public final O1:La/yzn0;

.field public final P1:La/r34;

.field public final Q1:La/zz2;

.field public final R1:La/r34;

.field public final S1:La/cgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/lk1;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentAggregatorPublishersBinding;"

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
    const-string v3, "bundleOpenedFromType"

    .line 16
    .line 17
    const-string v5, "getBundleOpenedFromType()Lorg/xplatform/aggregator/api/presentation/model/AggregatorPublisherGamesOpenedFromType;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "bundlePartitionId"

    .line 25
    .line 26
    const-string v6, "getBundlePartitionId()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "bundleBonusId"

    .line 34
    .line 35
    const-string v7, "getBundleBonusId()I"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "bundleAccountId"

    .line 43
    .line 44
    const-string v8, "getBundleAccountId()J"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/ez40;

    .line 50
    .line 51
    const-string v8, "bundleShowFavorites"

    .line 52
    .line 53
    const-string v9, "getBundleShowFavorites()Z"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x6

    .line 59
    new-array v1, v1, [La/iiy;

    .line 60
    .line 61
    aput-object v0, v1, v4

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    aput-object v2, v1, v0

    .line 65
    .line 66
    const/4 v0, 0x2

    .line 67
    aput-object v3, v1, v0

    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    aput-object v5, v1, v0

    .line 71
    .line 72
    const/4 v0, 0x4

    .line 73
    aput-object v6, v1, v0

    .line 74
    .line 75
    const/4 v0, 0x5

    .line 76
    aput-object v7, v1, v0

    .line 77
    .line 78
    sput-object v1, La/lk1;->V1:[La/iiy;

    .line 79
    .line 80
    new-instance v0, La/rek0;

    .line 81
    .line 82
    const/16 v1, 0x12

    .line 83
    .line 84
    invoke-direct {v0, v1}, La/rek0;-><init>(B)V

    .line 85
    .line 86
    .line 87
    sput-object v0, La/lk1;->U1:La/rek0;

    .line 88
    .line 89
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d01ec

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040b5d

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    invoke-direct {v0, v1, v1, v2}, La/e9o0;-><init>(III)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/lk1;->K1:La/e9o0;

    .line 18
    .line 19
    sget-object v0, La/kk1;->a:La/kk1;

    .line 20
    .line 21
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/lk1;->L1:La/s0r;

    .line 26
    .line 27
    const-class v0, La/wk1;

    .line 28
    .line 29
    sget-object v1, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, La/nc;

    .line 36
    .line 37
    const/16 v2, 0x16

    .line 38
    .line 39
    invoke-direct {v1, p0, v2}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/lk1;->N1:La/a8z;

    .line 47
    .line 48
    new-instance v0, La/yzn0;

    .line 49
    .line 50
    const-string v1, "BUNDLE_OPENED_FROM_TYPE"

    .line 51
    .line 52
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, La/lk1;->O1:La/yzn0;

    .line 56
    .line 57
    new-instance v0, La/r34;

    .line 58
    .line 59
    const-string v1, "PARTITION_ID"

    .line 60
    .line 61
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, La/lk1;->P1:La/r34;

    .line 65
    .line 66
    new-instance v0, La/zz2;

    .line 67
    .line 68
    const-string v1, "BONUS_ID"

    .line 69
    .line 70
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, La/lk1;->Q1:La/zz2;

    .line 74
    .line 75
    new-instance v0, La/r34;

    .line 76
    .line 77
    const-string v1, "ACCOUNT_ID"

    .line 78
    .line 79
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, La/lk1;->R1:La/r34;

    .line 83
    .line 84
    new-instance v0, La/cgx0;

    .line 85
    .line 86
    const-string v1, "SHOW_FAVORITES"

    .line 87
    .line 88
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, La/lk1;->S1:La/cgx0;

    .line 92
    .line 93
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/lk1;->V1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/lk1;->L1:La/s0r;

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
    check-cast p1, La/vxq;

    .line 16
    .line 17
    iget-object p1, p1, La/vxq;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/o00;

    .line 20
    .line 21
    const/16 v1, 0x10

    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 24
    .line 25
    .line 26
    new-instance p0, La/ugd;

    .line 27
    .line 28
    const v1, 0x8744c22

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

.method public final C0()V
    .locals 19

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
    const-class v2, La/mk1;

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
    instance-of v4, v1, La/mk1;

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
    check-cast v3, La/mk1;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    new-instance v8, La/vw3;

    .line 58
    .line 59
    const/4 v1, 0x3

    .line 60
    sget-object v2, La/lk1;->V1:[La/iiy;

    .line 61
    .line 62
    aget-object v1, v2, v1

    .line 63
    .line 64
    iget-object v4, v0, La/lk1;->Q1:La/zz2;

    .line 65
    .line 66
    invoke-virtual {v4, v0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    const/4 v4, 0x4

    .line 75
    aget-object v4, v2, v4

    .line 76
    .line 77
    iget-object v5, v0, La/lk1;->R1:La/r34;

    .line 78
    .line 79
    invoke-virtual {v5, v0, v4}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 80
    .line 81
    .line 82
    const/4 v4, 0x2

    .line 83
    aget-object v4, v2, v4

    .line 84
    .line 85
    iget-object v5, v0, La/lk1;->P1:La/r34;

    .line 86
    .line 87
    invoke-virtual {v5, v0, v4}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 92
    .line 93
    .line 94
    move-result-wide v4

    .line 95
    const/4 v6, 0x5

    .line 96
    aget-object v6, v2, v6

    .line 97
    .line 98
    iget-object v7, v0, La/lk1;->S1:La/cgx0;

    .line 99
    .line 100
    invoke-virtual {v7, v0, v6}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    const/4 v6, 0x1

    .line 104
    aget-object v2, v2, v6

    .line 105
    .line 106
    iget-object v6, v0, La/lk1;->O1:La/yzn0;

    .line 107
    .line 108
    invoke-virtual {v6, v0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, La/rj1;

    .line 113
    .line 114
    invoke-direct {v8, v1, v4, v5, v2}, La/vw3;-><init>(IJLa/rj1;)V

    .line 115
    .line 116
    .line 117
    iget-object v6, v3, La/mk1;->a:La/ehf0;

    .line 118
    .line 119
    iget-object v5, v3, La/mk1;->c:La/cad;

    .line 120
    .line 121
    iget-object v7, v3, La/mk1;->g:La/oeg0;

    .line 122
    .line 123
    iget-object v9, v3, La/mk1;->b:La/duj;

    .line 124
    .line 125
    iget-object v10, v3, La/mk1;->d:La/m1e;

    .line 126
    .line 127
    iget-object v1, v3, La/mk1;->e:La/s91;

    .line 128
    .line 129
    iget-object v2, v3, La/mk1;->f:La/gst0;

    .line 130
    .line 131
    iget-object v11, v3, La/mk1;->h:La/ctf0;

    .line 132
    .line 133
    iget-object v12, v3, La/mk1;->i:La/ieu;

    .line 134
    .line 135
    iget-object v13, v3, La/mk1;->j:La/ntu;

    .line 136
    .line 137
    iget-object v14, v3, La/mk1;->k:La/wyu;

    .line 138
    .line 139
    iget-object v15, v3, La/mk1;->l:La/bzt;

    .line 140
    .line 141
    iget-object v4, v3, La/mk1;->m:La/uyu;

    .line 142
    .line 143
    move-object/from16 v16, v1

    .line 144
    .line 145
    iget-object v1, v3, La/mk1;->n:La/r9u;

    .line 146
    .line 147
    iget-object v3, v3, La/mk1;->o:La/rl1;

    .line 148
    .line 149
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    move-object/from16 v16, v4

    .line 171
    .line 172
    new-instance v4, La/v7i;

    .line 173
    .line 174
    move-object/from16 v17, v1

    .line 175
    .line 176
    move-object/from16 v18, v3

    .line 177
    .line 178
    invoke-direct/range {v4 .. v18}, La/v7i;-><init>(La/cad;La/ehf0;La/oeg0;La/vw3;La/duj;La/m1e;La/ctf0;La/ieu;La/ntu;La/wyu;La/bzt;La/uyu;La/r9u;La/rl1;)V

    .line 179
    .line 180
    .line 181
    new-instance v1, La/fiu0;

    .line 182
    .line 183
    iget-object v2, v4, La/v7i;->o:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v2, La/t5i;

    .line 186
    .line 187
    const-class v3, La/wk1;

    .line 188
    .line 189
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 194
    .line 195
    .line 196
    iput-object v1, v0, La/lk1;->M1:La/fiu0;

    .line 197
    .line 198
    return-void

    .line 199
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 200
    .line 201
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
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
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/hxm0;->m(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/hxm0;->n(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/lk1;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
