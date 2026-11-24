.class public final La/qj1;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/qj1;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/qek0",
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
.field public static final X1:La/qek0;

.field public static final synthetic Y1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ii;

.field public M1:La/q5j;

.field public N1:La/wdk0;

.field public final O1:La/kiu0;

.field public final P1:La/s0r;

.field public final Q1:La/r34;

.field public final R1:La/r34;

.field public final S1:La/phf0;

.field public final U1:La/zz2;

.field public final V1:La/yzn0;

.field public final W1:La/cgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/qj1;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentPublisherGamesBinding;"

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
    const-string v3, "partitionId"

    .line 16
    .line 17
    const-string v5, "getPartitionId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "productId"

    .line 25
    .line 26
    const-string v6, "getProductId()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "title"

    .line 34
    .line 35
    const-string v7, "getTitle()Ljava/lang/String;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "subCategoryId"

    .line 43
    .line 44
    const-string v8, "getSubCategoryId()I"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/ez40;

    .line 50
    .line 51
    const-string v8, "openedFromType"

    .line 52
    .line 53
    const-string v9, "getOpenedFromType()Lorg/xplatform/aggregator/api/presentation/model/AggregatorPublisherGamesOpenedFromType;"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, La/ez40;

    .line 59
    .line 60
    const-string v9, "showNavBar"

    .line 61
    .line 62
    const-string v10, "getShowNavBar()Z"

    .line 63
    .line 64
    invoke-direct {v8, v1, v9, v10, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    const/4 v1, 0x7

    .line 68
    new-array v1, v1, [La/iiy;

    .line 69
    .line 70
    aput-object v0, v1, v4

    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    aput-object v2, v1, v0

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    aput-object v3, v1, v0

    .line 77
    .line 78
    const/4 v0, 0x3

    .line 79
    aput-object v5, v1, v0

    .line 80
    .line 81
    const/4 v0, 0x4

    .line 82
    aput-object v6, v1, v0

    .line 83
    .line 84
    const/4 v0, 0x5

    .line 85
    aput-object v7, v1, v0

    .line 86
    .line 87
    const/4 v0, 0x6

    .line 88
    aput-object v8, v1, v0

    .line 89
    .line 90
    sput-object v1, La/qj1;->Y1:[La/iiy;

    .line 91
    .line 92
    new-instance v0, La/qek0;

    .line 93
    .line 94
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 95
    .line 96
    .line 97
    sput-object v0, La/qj1;->X1:La/qek0;

    .line 98
    .line 99
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02a4

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/nc;

    .line 8
    .line 9
    const/16 v1, 0x15

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v1, La/f80;

    .line 15
    .line 16
    const/16 v2, 0x8

    .line 17
    .line 18
    invoke-direct {v1, p0, v2}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    sget-object v2, La/wez;->b:La/wez;

    .line 22
    .line 23
    new-instance v3, La/f80;

    .line 24
    .line 25
    const/16 v4, 0x9

    .line 26
    .line 27
    invoke-direct {v3, v1, v4}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-class v2, La/bk1;

    .line 35
    .line 36
    sget-object v3, La/sre0;->a:La/tre0;

    .line 37
    .line 38
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    new-instance v3, La/t51;

    .line 43
    .line 44
    const/4 v4, 0x2

    .line 45
    invoke-direct {v3, v1, v4}, La/t51;-><init>(La/a8z;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/t51;

    .line 49
    .line 50
    const/4 v5, 0x3

    .line 51
    invoke-direct {v4, v1, v5}, La/t51;-><init>(La/a8z;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/qj1;->O1:La/kiu0;

    .line 59
    .line 60
    sget-object v0, La/pj1;->a:La/pj1;

    .line 61
    .line 62
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/qj1;->P1:La/s0r;

    .line 67
    .line 68
    new-instance v0, La/r34;

    .line 69
    .line 70
    const-string v1, "BUNDLE_PARTITION"

    .line 71
    .line 72
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, La/qj1;->Q1:La/r34;

    .line 76
    .line 77
    new-instance v0, La/r34;

    .line 78
    .line 79
    const-string v1, "BUNDLE_PRODUCT"

    .line 80
    .line 81
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, La/qj1;->R1:La/r34;

    .line 85
    .line 86
    new-instance v0, La/phf0;

    .line 87
    .line 88
    const-string v1, "BUNDLE_TITLE"

    .line 89
    .line 90
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, La/qj1;->S1:La/phf0;

    .line 94
    .line 95
    new-instance v0, La/zz2;

    .line 96
    .line 97
    const-string v1, "BUNDLE_SUB_CATEGORY"

    .line 98
    .line 99
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, La/qj1;->U1:La/zz2;

    .line 103
    .line 104
    new-instance v0, La/yzn0;

    .line 105
    .line 106
    const-string v1, "BUNDLE_OPENED_FROM_TYPE"

    .line 107
    .line 108
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, La/qj1;->V1:La/yzn0;

    .line 112
    .line 113
    new-instance v0, La/cgx0;

    .line 114
    .line 115
    const-string v1, "BUNDLE_SHOW_NAV_BAR"

    .line 116
    .line 117
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iput-object v0, p0, La/qj1;->W1:La/cgx0;

    .line 121
    .line 122
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/qj1;->Y1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/qj1;->P1:La/s0r;

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
    check-cast p1, La/j3r;

    .line 16
    .line 17
    iget-object p1, p1, La/j3r;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/owp0;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/tx;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    invoke-direct {v1, p0, v2}, La/tx;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    new-instance p0, La/ugd;

    .line 31
    .line 32
    const v2, 0x6b212066

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final C0()V
    .locals 32

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
    const-class v2, La/oj1;

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
    instance-of v4, v1, La/oj1;

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
    check-cast v3, La/oj1;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    sget-object v2, La/qj1;->Y1:[La/iiy;

    .line 59
    .line 60
    aget-object v1, v2, v1

    .line 61
    .line 62
    iget-object v4, v0, La/qj1;->Q1:La/r34;

    .line 63
    .line 64
    invoke-virtual {v4, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v17

    .line 68
    iget-object v1, v0, La/qj1;->R1:La/r34;

    .line 69
    .line 70
    const/4 v4, 0x2

    .line 71
    aget-object v5, v2, v4

    .line 72
    .line 73
    invoke-virtual {v1, v0, v5}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v18

    .line 77
    const/4 v1, 0x5

    .line 78
    aget-object v1, v2, v1

    .line 79
    .line 80
    iget-object v5, v0, La/qj1;->V1:La/yzn0;

    .line 81
    .line 82
    invoke-virtual {v5, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    move-object/from16 v19, v1

    .line 87
    .line 88
    check-cast v19, La/rj1;

    .line 89
    .line 90
    const/4 v1, 0x4

    .line 91
    aget-object v1, v2, v1

    .line 92
    .line 93
    iget-object v2, v0, La/qj1;->U1:La/zz2;

    .line 94
    .line 95
    invoke-virtual {v2, v0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v20

    .line 99
    iget-object v15, v3, La/oj1;->b:La/u58;

    .line 100
    .line 101
    iget-object v7, v3, La/oj1;->a:La/ehf0;

    .line 102
    .line 103
    iget-object v6, v3, La/oj1;->i:La/cad;

    .line 104
    .line 105
    iget-object v14, v3, La/oj1;->j:La/oeg0;

    .line 106
    .line 107
    iget-object v1, v3, La/oj1;->c:La/gii0;

    .line 108
    .line 109
    iget-object v2, v3, La/oj1;->d:La/r9u;

    .line 110
    .line 111
    iget-object v13, v3, La/oj1;->l:La/ii;

    .line 112
    .line 113
    iget-object v5, v3, La/oj1;->e:La/m1e;

    .line 114
    .line 115
    iget-object v8, v3, La/oj1;->g:La/wsf0;

    .line 116
    .line 117
    iget-object v9, v3, La/oj1;->f:La/s91;

    .line 118
    .line 119
    iget-object v10, v3, La/oj1;->h:La/duj;

    .line 120
    .line 121
    iget-object v11, v3, La/oj1;->k:La/ctf0;

    .line 122
    .line 123
    iget-object v12, v3, La/oj1;->m:La/ntu;

    .line 124
    .line 125
    iget-object v4, v3, La/oj1;->n:La/pru;

    .line 126
    .line 127
    move-object/from16 v16, v1

    .line 128
    .line 129
    iget-object v1, v3, La/oj1;->o:La/cyu;

    .line 130
    .line 131
    move-object/from16 v25, v1

    .line 132
    .line 133
    iget-object v1, v3, La/oj1;->p:La/gst0;

    .line 134
    .line 135
    move-object/from16 v26, v1

    .line 136
    .line 137
    iget-object v1, v3, La/oj1;->q:La/wdk0;

    .line 138
    .line 139
    move-object/from16 v27, v1

    .line 140
    .line 141
    iget-object v1, v3, La/oj1;->r:La/ix0;

    .line 142
    .line 143
    move-object/from16 v21, v9

    .line 144
    .line 145
    iget-object v9, v3, La/oj1;->s:La/lrc;

    .line 146
    .line 147
    move-object/from16 v22, v21

    .line 148
    .line 149
    move-object/from16 v21, v10

    .line 150
    .line 151
    iget-object v10, v3, La/oj1;->t:La/nr00;

    .line 152
    .line 153
    move-object/from16 v23, v22

    .line 154
    .line 155
    move-object/from16 v22, v11

    .line 156
    .line 157
    iget-object v11, v3, La/oj1;->u:La/poq0;

    .line 158
    .line 159
    move-object/from16 v28, v1

    .line 160
    .line 161
    iget-object v1, v3, La/oj1;->v:La/b4j;

    .line 162
    .line 163
    move-object/from16 v29, v1

    .line 164
    .line 165
    iget-object v1, v3, La/oj1;->w:La/je;

    .line 166
    .line 167
    move-object/from16 v24, v23

    .line 168
    .line 169
    move-object/from16 v23, v12

    .line 170
    .line 171
    iget-object v12, v3, La/oj1;->x:La/peg0;

    .line 172
    .line 173
    move-object/from16 v30, v1

    .line 174
    .line 175
    iget-object v1, v3, La/oj1;->y:La/ytt;

    .line 176
    .line 177
    iget-object v3, v3, La/oj1;->z:La/ba50;

    .line 178
    .line 179
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-object/from16 v16, v5

    .line 210
    .line 211
    new-instance v5, La/t7i;

    .line 212
    .line 213
    move-object/from16 v31, v1

    .line 214
    .line 215
    move-object/from16 v24, v4

    .line 216
    .line 217
    invoke-direct/range {v5 .. v31}, La/t7i;-><init>(La/cad;La/ehf0;La/wsf0;La/lrc;La/nr00;La/poq0;La/peg0;La/ii;La/oeg0;La/u58;La/m1e;Ljava/lang/Long;Ljava/lang/Long;La/rj1;Ljava/lang/Integer;La/duj;La/ctf0;La/ntu;La/pru;La/cyu;La/gst0;La/wdk0;La/ix0;La/b4j;La/je;La/ytt;)V

    .line 218
    .line 219
    .line 220
    move-object/from16 v1, v27

    .line 221
    .line 222
    new-instance v2, La/fiu0;

    .line 223
    .line 224
    new-instance v3, La/iyk;

    .line 225
    .line 226
    const/4 v4, 0x2

    .line 227
    invoke-direct {v3, v4}, La/iyk;-><init>(I)V

    .line 228
    .line 229
    .line 230
    iget-object v4, v5, La/t7i;->x:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v4, La/r5i;

    .line 233
    .line 234
    const-class v6, La/bk1;

    .line 235
    .line 236
    invoke-virtual {v3, v6, v4}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    iget-object v4, v5, La/t7i;->y:La/n5d0;

    .line 240
    .line 241
    check-cast v4, La/r5i;

    .line 242
    .line 243
    const-class v5, La/yb0;

    .line 244
    .line 245
    invoke-virtual {v3, v5, v4}, La/iyk;->b(Ljava/lang/Class;Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v3}, La/iyk;->a()Ljava/util/Map;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 253
    .line 254
    .line 255
    iput-object v2, v0, La/qj1;->K1:La/fiu0;

    .line 256
    .line 257
    iput-object v13, v0, La/qj1;->L1:La/ii;

    .line 258
    .line 259
    new-instance v2, La/q5j;

    .line 260
    .line 261
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 262
    .line 263
    .line 264
    iput-object v2, v0, La/qj1;->M1:La/q5j;

    .line 265
    .line 266
    iput-object v1, v0, La/qj1;->N1:La/wdk0;

    .line 267
    .line 268
    return-void

    .line 269
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 270
    .line 271
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    sget-object v0, La/qj1;->Y1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/qj1;->V1:La/yzn0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/rj1;

    .line 13
    .line 14
    sget-object v1, La/rj1;->a:La/rj1;

    .line 15
    .line 16
    if-eq v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, La/qj1;->O1:La/kiu0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/bk1;

    .line 25
    .line 26
    sget-object v1, La/s7d0;->a:La/s7d0;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/bk1;->N(La/a8d0;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 33
    .line 34
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/qj1;->Y1:[La/iiy;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    iget-object v1, p0, La/qj1;->V1:La/yzn0;

    .line 10
    .line 11
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/rj1;

    .line 16
    .line 17
    sget-object v1, La/rj1;->a:La/rj1;

    .line 18
    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, La/qj1;->O1:La/kiu0;

    .line 22
    .line 23
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/bk1;

    .line 28
    .line 29
    sget-object v0, La/t7d0;->a:La/t7d0;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, La/bk1;->N(La/a8d0;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public final x0()Z
    .locals 2

    .line 1
    sget-object v0, La/qj1;->Y1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/qj1;->W1:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 3

    .line 1
    new-instance v0, La/e9o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/qj1;->x0()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const v1, 0x7f040b5d

    .line 8
    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const p0, 0x7f040ae3

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p0, v1

    .line 17
    :goto_0
    const/16 v2, 0xc

    .line 18
    .line 19
    invoke-direct {v0, v1, p0, v2}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
