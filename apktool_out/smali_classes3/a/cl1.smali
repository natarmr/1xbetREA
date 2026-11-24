.class public final La/cl1;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/cl1;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/gfk0",
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
.field public static final o2:La/gfk0;

.field public static final synthetic p2:[La/iiy;


# instance fields
.field public final k2:La/r34;

.field public final l2:La/phf0;

.field public m2:La/fiu0;

.field public final n2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/cl1;

    .line 4
    .line 5
    const-string v2, "tournamentId"

    .line 6
    .line 7
    const-string v3, "getTournamentId()J"

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
    const-string v3, "tournamentName"

    .line 16
    .line 17
    const-string v5, "getTournamentName()Ljava/lang/String;"

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
    sput-object v1, La/cl1;->p2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/gfk0;

    .line 33
    .line 34
    const/16 v1, 0x12

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/cl1;->o2:La/gfk0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/r34;

    .line 5
    .line 6
    const-string v1, "TOURNAMENT_ID_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/cl1;->k2:La/r34;

    .line 12
    .line 13
    new-instance v0, La/phf0;

    .line 14
    .line 15
    const-string v1, "TOURNAMENT_NAME_KEY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/cl1;->l2:La/phf0;

    .line 21
    .line 22
    const-class v0, La/gl1;

    .line 23
    .line 24
    sget-object v1, La/sre0;->a:La/tre0;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, La/yk1;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, p0, v2}, La/yk1;-><init>(La/cl1;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/cl1;->n2:La/a8z;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 9

    .line 1
    const v0, 0x5715b1f2

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/cl1;->n2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/k3t0;

    .line 14
    .line 15
    check-cast v0, La/i3t0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    new-instance v2, La/bw5;

    .line 27
    .line 28
    new-instance v4, La/v7i0;

    .line 29
    .line 30
    const/4 v5, 0x7

    .line 31
    invoke-direct {v4, v0, v5}, La/v7i0;-><init>(La/l7m0;B)V

    .line 32
    .line 33
    .line 34
    const v5, -0x33ac619f    # -5.5474564E7f

    .line 35
    .line 36
    .line 37
    invoke-static {v5, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    new-instance v5, La/zk1;

    .line 42
    .line 43
    invoke-direct {v5, p0, v1}, La/zk1;-><init>(La/cl1;B)V

    .line 44
    .line 45
    .line 46
    const v1, -0x42f4b3d7

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v5, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    new-instance v1, La/bl1;

    .line 54
    .line 55
    const/4 v8, 0x0

    .line 56
    invoke-direct {v1, p0, v0, v8}, La/bl1;-><init>(La/cl1;La/l7m0;B)V

    .line 57
    .line 58
    .line 59
    const p0, -0x2a5c509d

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    const/4 v7, 0x2

    .line 67
    invoke-direct/range {v2 .. v7}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v8}, La/fet;->r(Z)V

    .line 71
    .line 72
    .line 73
    return-object v2
.end method

.method public final P0(ILa/fet;)V
    .locals 15

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v8, p2

    .line 4
    .line 5
    const v1, 0x2608ac60

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v1}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, v0, 0x1

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move v4, v3

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v4, v2

    .line 20
    :goto_0
    invoke-virtual {v8, v1, v4}, La/fet;->U(IZ)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_4

    .line 25
    .line 26
    sget-object v1, La/bmd;->n:La/zfn;

    .line 27
    .line 28
    invoke-virtual {v8, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/k6z;

    .line 33
    .line 34
    sget-object v4, La/k6z;->b:La/k6z;

    .line 35
    .line 36
    if-ne v1, v4, :cond_1

    .line 37
    .line 38
    move v1, v3

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v1, v2

    .line 41
    :goto_1
    sget-object v4, La/qmk;->a:La/zcl;

    .line 42
    .line 43
    const/4 v13, 0x0

    .line 44
    const/16 v14, 0x8

    .line 45
    .line 46
    sget-object v9, La/jm40;->b:La/jm40;

    .line 47
    .line 48
    const/high16 v10, 0x41000000    # 8.0f

    .line 49
    .line 50
    const/high16 v11, 0x41600000    # 14.0f

    .line 51
    .line 52
    const/high16 v12, 0x41000000    # 8.0f

    .line 53
    .line 54
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v8, v1}, La/fet;->h(Z)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-nez v5, :cond_2

    .line 67
    .line 68
    sget-object v5, La/ukd;->a:La/cl5;

    .line 69
    .line 70
    if-ne v6, v5, :cond_3

    .line 71
    .line 72
    :cond_2
    new-instance v6, La/z;

    .line 73
    .line 74
    invoke-direct {v6, v3, v1}, La/z;-><init>(BZ)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v8, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 81
    .line 82
    invoke-static {v4, v6}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    const v1, 0x7f0807da

    .line 87
    .line 88
    .line 89
    invoke-static {v1, v2, v8}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 94
    .line 95
    invoke-virtual {v8, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 100
    .line 101
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 102
    .line 103
    .line 104
    move-result-wide v4

    .line 105
    new-instance v7, La/m78;

    .line 106
    .line 107
    const/4 v2, 0x5

    .line 108
    invoke-direct {v7, v4, v5, v2}, La/m78;-><init>(JI)V

    .line 109
    .line 110
    .line 111
    const/16 v9, 0x38

    .line 112
    .line 113
    const/16 v10, 0x38

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    const/4 v4, 0x0

    .line 117
    const/4 v5, 0x0

    .line 118
    const/4 v6, 0x0

    .line 119
    invoke-static/range {v1 .. v10}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 124
    .line 125
    .line 126
    :goto_2
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    if-eqz v1, :cond_5

    .line 131
    .line 132
    new-instance v2, La/o00;

    .line 133
    .line 134
    const/16 v3, 0x11

    .line 135
    .line 136
    invoke-direct {v2, p0, v0, v3}, La/o00;-><init>(Ljava/lang/Object;IB)V

    .line 137
    .line 138
    .line 139
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 140
    .line 141
    :cond_5
    return-void
.end method

.method public final Q0(IILa/fet;I)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v10, p3

    .line 8
    .line 9
    const v3, -0x530452d1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v10, v3}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v10, v1}, La/fet;->e(I)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const/4 v3, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v3, 0x2

    .line 24
    :goto_0
    or-int v3, p4, v3

    .line 25
    .line 26
    invoke-virtual {v10, v2}, La/fet;->e(I)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    const/16 v4, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v4, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v3, v4

    .line 38
    invoke-virtual {v10, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    const/16 v4, 0x100

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v4, 0x80

    .line 48
    .line 49
    :goto_2
    or-int/2addr v3, v4

    .line 50
    and-int/lit16 v4, v3, 0x93

    .line 51
    .line 52
    const/16 v5, 0x92

    .line 53
    .line 54
    const/4 v13, 0x1

    .line 55
    if-eq v4, v5, :cond_3

    .line 56
    .line 57
    move v4, v13

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    const/4 v4, 0x0

    .line 60
    :goto_3
    and-int/lit8 v5, v3, 0x1

    .line 61
    .line 62
    invoke-virtual {v10, v5, v4}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_5

    .line 67
    .line 68
    sget-object v4, La/qmk;->a:La/zcl;

    .line 69
    .line 70
    const/high16 v4, 0x42b00000    # 88.0f

    .line 71
    .line 72
    sget-object v14, La/jm40;->b:La/jm40;

    .line 73
    .line 74
    invoke-static {v14, v4}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    const-string v5, "SLOT_ITEM_COLUMN"

    .line 79
    .line 80
    invoke-static {v4, v5}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    sget-object v5, La/uc9;->e:La/nw3;

    .line 85
    .line 86
    sget-object v6, La/gqw0;->m:La/xx7;

    .line 87
    .line 88
    const/4 v7, 0x6

    .line 89
    invoke-static {v5, v6, v10, v7}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    iget-wide v6, v10, La/fet;->T:J

    .line 94
    .line 95
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-static {v10, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v10}, La/fet;->i0()V

    .line 113
    .line 114
    .line 115
    iget-boolean v8, v10, La/fet;->S:Z

    .line 116
    .line 117
    if-eqz v8, :cond_4

    .line 118
    .line 119
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 120
    .line 121
    invoke-virtual {v10, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_4
    invoke-virtual {v10}, La/fet;->r0()V

    .line 126
    .line 127
    .line 128
    :goto_4
    sget-object v8, La/gqw0;->x:La/shd;

    .line 129
    .line 130
    invoke-static {v10, v5, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    sget-object v5, La/gqw0;->w:La/shd;

    .line 134
    .line 135
    invoke-static {v10, v7, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    sget-object v6, La/gqw0;->y:La/shd;

    .line 143
    .line 144
    invoke-static {v10, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v10}, La/jpm0;->n(La/fet;)V

    .line 148
    .line 149
    .line 150
    sget-object v5, La/gqw0;->v:La/shd;

    .line 151
    .line 152
    invoke-static {v10, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    const/high16 v4, 0x42280000    # 42.0f

    .line 156
    .line 157
    invoke-static {v14, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    sget-object v5, La/gqw0;->n:La/xx7;

    .line 162
    .line 163
    new-instance v6, La/wkw;

    .line 164
    .line 165
    invoke-direct {v6, v5}, La/wkw;-><init>(La/xx7;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v4, v6}, La/mm40;->e(La/mm40;)La/mm40;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    const-string v5, "SLOT_ITEM_ICON"

    .line 173
    .line 174
    invoke-static {v4, v5}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    and-int/lit8 v3, v3, 0xe

    .line 179
    .line 180
    invoke-static {v1, v3, v10}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    sget-object v15, La/zaq0;->b:La/zfn;

    .line 185
    .line 186
    invoke-virtual {v10, v15}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 191
    .line 192
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 193
    .line 194
    .line 195
    move-result-wide v6

    .line 196
    new-instance v9, La/m78;

    .line 197
    .line 198
    const/4 v4, 0x5

    .line 199
    invoke-direct {v9, v6, v7, v4}, La/m78;-><init>(JI)V

    .line 200
    .line 201
    .line 202
    const/16 v11, 0x38

    .line 203
    .line 204
    const/16 v12, 0x38

    .line 205
    .line 206
    const/4 v4, 0x0

    .line 207
    const/4 v6, 0x0

    .line 208
    const/4 v7, 0x0

    .line 209
    const/4 v8, 0x0

    .line 210
    invoke-static/range {v3 .. v12}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 211
    .line 212
    .line 213
    move-object v3, v10

    .line 214
    const/4 v9, 0x0

    .line 215
    const/16 v10, 0xd

    .line 216
    .line 217
    const/4 v6, 0x0

    .line 218
    const/high16 v7, 0x41200000    # 10.0f

    .line 219
    .line 220
    move-object v5, v14

    .line 221
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    sget-object v22, La/j1t0;->b:La/qrq;

    .line 233
    .line 234
    sget-wide v19, La/qmk;->r:J

    .line 235
    .line 236
    sget-wide v28, La/qmk;->F:J

    .line 237
    .line 238
    new-instance v16, La/y9q0;

    .line 239
    .line 240
    const/16 v27, 0x0

    .line 241
    .line 242
    const v30, 0xfdffdd

    .line 243
    .line 244
    .line 245
    const-wide/16 v17, 0x0

    .line 246
    .line 247
    const/16 v21, 0x0

    .line 248
    .line 249
    const-wide/16 v23, 0x0

    .line 250
    .line 251
    const/16 v25, 0x0

    .line 252
    .line 253
    const/16 v26, 0x0

    .line 254
    .line 255
    invoke-direct/range {v16 .. v30}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, v15}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 263
    .line 264
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 265
    .line 266
    .line 267
    move-result-wide v6

    .line 268
    new-instance v15, La/f2q0;

    .line 269
    .line 270
    const/4 v8, 0x3

    .line 271
    invoke-direct {v15, v8}, La/f2q0;-><init>(I)V

    .line 272
    .line 273
    .line 274
    const/16 v26, 0x6180

    .line 275
    .line 276
    const v27, 0x1abf8

    .line 277
    .line 278
    .line 279
    move-object v3, v5

    .line 280
    move-wide v5, v6

    .line 281
    const/4 v7, 0x0

    .line 282
    const-wide/16 v8, 0x0

    .line 283
    .line 284
    const/4 v10, 0x0

    .line 285
    const/4 v11, 0x0

    .line 286
    const/4 v12, 0x0

    .line 287
    move/from16 v17, v13

    .line 288
    .line 289
    const-wide/16 v13, 0x0

    .line 290
    .line 291
    move-object/from16 v23, v16

    .line 292
    .line 293
    move/from16 v18, v17

    .line 294
    .line 295
    const-wide/16 v16, 0x0

    .line 296
    .line 297
    move/from16 v19, v18

    .line 298
    .line 299
    const/16 v18, 0x2

    .line 300
    .line 301
    move/from16 v20, v19

    .line 302
    .line 303
    const/16 v19, 0x0

    .line 304
    .line 305
    move/from16 v21, v20

    .line 306
    .line 307
    const/16 v20, 0x3

    .line 308
    .line 309
    move/from16 v22, v21

    .line 310
    .line 311
    const/16 v21, 0x0

    .line 312
    .line 313
    move/from16 v24, v22

    .line 314
    .line 315
    const/16 v22, 0x0

    .line 316
    .line 317
    const/16 v25, 0x0

    .line 318
    .line 319
    move/from16 v0, v24

    .line 320
    .line 321
    move-object/from16 v24, p3

    .line 322
    .line 323
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 324
    .line 325
    .line 326
    move-object/from16 v10, v24

    .line 327
    .line 328
    invoke-virtual {v10, v0}, La/fet;->r(Z)V

    .line 329
    .line 330
    .line 331
    goto :goto_5

    .line 332
    :cond_5
    invoke-virtual {v10}, La/fet;->X()V

    .line 333
    .line 334
    .line 335
    :goto_5
    invoke-virtual {v10}, La/fet;->u()La/yfe0;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-eqz v0, :cond_6

    .line 340
    .line 341
    new-instance v3, La/al1;

    .line 342
    .line 343
    move-object/from16 v4, p0

    .line 344
    .line 345
    move/from16 v5, p4

    .line 346
    .line 347
    invoke-direct {v3, v4, v1, v2, v5}, La/al1;-><init>(La/cl1;III)V

    .line 348
    .line 349
    .line 350
    iput-object v3, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 351
    .line 352
    :cond_6
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 14

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
    const-class v0, La/xk1;

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
    instance-of v2, p1, La/xk1;

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
    check-cast v1, La/xk1;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    sget-object v0, La/cl1;->p2:[La/iiy;

    .line 60
    .line 61
    aget-object p1, v0, p1

    .line 62
    .line 63
    iget-object v2, p0, La/cl1;->k2:La/r34;

    .line 64
    .line 65
    invoke-virtual {v2, p0, p1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    const/4 p1, 0x1

    .line 70
    aget-object p1, v0, p1

    .line 71
    .line 72
    iget-object v0, p0, La/cl1;->l2:La/phf0;

    .line 73
    .line 74
    invoke-virtual {v0, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object p1, v1, La/xk1;->a:La/ctf0;

    .line 82
    .line 83
    iget-object v4, v1, La/xk1;->b:La/cad;

    .line 84
    .line 85
    iget-object v8, v1, La/xk1;->c:La/gst0;

    .line 86
    .line 87
    iget-object v9, v1, La/xk1;->d:La/btt0;

    .line 88
    .line 89
    iget-object v10, v1, La/xk1;->e:La/gii0;

    .line 90
    .line 91
    iget-object v11, v1, La/xk1;->f:La/knf0;

    .line 92
    .line 93
    iget-object v12, v1, La/xk1;->g:La/x0u;

    .line 94
    .line 95
    iget-object v13, v1, La/xk1;->h:La/r9s0;

    .line 96
    .line 97
    iget-object v5, v1, La/xk1;->i:La/wsf0;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v3, La/daf;

    .line 118
    .line 119
    invoke-direct/range {v3 .. v13}, La/daf;-><init>(La/cad;La/wsf0;Ljava/lang/Long;Ljava/lang/String;La/gst0;La/btt0;La/gii0;La/knf0;La/x0u;La/r9s0;)V

    .line 120
    .line 121
    .line 122
    new-instance p1, La/fiu0;

    .line 123
    .line 124
    iget-object v0, v3, La/daf;->m:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, La/f7i;

    .line 127
    .line 128
    const-class v1, La/gl1;

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
    iput-object p1, p0, La/cl1;->m2:La/fiu0;

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

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/iw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
