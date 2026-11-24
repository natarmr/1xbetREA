.class public final La/djg;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/djg;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/kwd",
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
.field public static final n2:La/kwd;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final k2:La/zz2;

.field public final l2:La/r34;

.field public final m2:La/r34;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/djg;

    .line 4
    .line 5
    const-string v2, "selectedTimeFilterId"

    .line 6
    .line 7
    const-string v3, "getSelectedTimeFilterId()I"

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
    const-string v3, "startTime"

    .line 16
    .line 17
    const-string v5, "getStartTime()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "endTime"

    .line 25
    .line 26
    const-string v6, "getEndTime()J"

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
    sput-object v1, La/djg;->o2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/kwd;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/djg;->n2:La/kwd;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/zz2;

    .line 5
    .line 6
    const-string v1, "selected_time_filter_key"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/djg;->k2:La/zz2;

    .line 12
    .line 13
    new-instance v0, La/r34;

    .line 14
    .line 15
    const-string v1, "start_time_key"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/djg;->l2:La/r34;

    .line 21
    .line 22
    new-instance v0, La/r34;

    .line 23
    .line 24
    const-string v1, "end_time_key"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/djg;->m2:La/r34;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 8

    .line 1
    const v0, -0x7b1531b8

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/bw5;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v3, La/cjg;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    invoke-direct {v3, p0, v7}, La/cjg;-><init>(La/djg;B)V

    .line 18
    .line 19
    .line 20
    const v4, 0x27c472b9

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, La/cjg;

    .line 28
    .line 29
    invoke-direct {v4, p0, v0}, La/cjg;-><init>(La/djg;B)V

    .line 30
    .line 31
    .line 32
    const p0, -0x6cd12409

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const/16 v6, 0xa

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 46
    .line 47
    .line 48
    return-object v1
.end method

.method public final P0(La/ejg;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 22

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v11, p3

    .line 4
    .line 5
    const v0, 0x19ea6756

    .line 6
    .line 7
    .line 8
    invoke-virtual {v11, v0}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, p4, 0x6

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    and-int/lit8 v0, p4, 0x8

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v11, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v11, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v0, 0x2

    .line 33
    :goto_1
    or-int v0, p4, v0

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move/from16 v0, p4

    .line 37
    .line 38
    :goto_2
    and-int/lit8 v1, p4, 0x30

    .line 39
    .line 40
    move-object/from16 v3, p2

    .line 41
    .line 42
    if-nez v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {v11, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    const/16 v1, 0x20

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    const/16 v1, 0x10

    .line 54
    .line 55
    :goto_3
    or-int/2addr v0, v1

    .line 56
    :cond_4
    and-int/lit8 v1, v0, 0x13

    .line 57
    .line 58
    const/16 v4, 0x12

    .line 59
    .line 60
    if-eq v1, v4, :cond_5

    .line 61
    .line 62
    const/4 v1, 0x1

    .line 63
    goto :goto_4

    .line 64
    :cond_5
    const/4 v1, 0x0

    .line 65
    :goto_4
    and-int/lit8 v4, v0, 0x1

    .line 66
    .line 67
    invoke-virtual {v11, v4, v1}, La/fet;->U(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_6

    .line 72
    .line 73
    sget-object v1, La/jm40;->b:La/jm40;

    .line 74
    .line 75
    const/high16 v4, 0x3f800000    # 1.0f

    .line 76
    .line 77
    invoke-static {v1, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    new-instance v12, La/rqm;

    .line 82
    .line 83
    new-instance v13, La/tui0;

    .line 84
    .line 85
    iget-object v4, v2, La/ejg;->b:Ljava/lang/String;

    .line 86
    .line 87
    const/4 v5, 0x0

    .line 88
    invoke-direct {v13, v4, v5}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 89
    .line 90
    .line 91
    new-instance v15, La/nvi0;

    .line 92
    .line 93
    iget-boolean v4, v2, La/ejg;->c:Z

    .line 94
    .line 95
    invoke-direct {v15, v4}, La/nvi0;-><init>(Z)V

    .line 96
    .line 97
    .line 98
    const/16 v20, 0x0

    .line 99
    .line 100
    const/16 v21, 0x1fa

    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const/16 v16, 0x0

    .line 104
    .line 105
    const/16 v17, 0x0

    .line 106
    .line 107
    const/16 v18, 0x0

    .line 108
    .line 109
    const/16 v19, 0x0

    .line 110
    .line 111
    invoke-direct/range {v12 .. v21}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 112
    .line 113
    .line 114
    shl-int/lit8 v4, v0, 0x9

    .line 115
    .line 116
    const v5, 0xe000

    .line 117
    .line 118
    .line 119
    and-int/2addr v4, v5

    .line 120
    or-int/lit8 v4, v4, 0x6

    .line 121
    .line 122
    shl-int/lit8 v0, v0, 0xf

    .line 123
    .line 124
    const/high16 v5, 0x380000

    .line 125
    .line 126
    and-int/2addr v0, v5

    .line 127
    or-int/2addr v0, v4

    .line 128
    const/16 v13, 0xac

    .line 129
    .line 130
    const/4 v5, 0x0

    .line 131
    const/4 v6, 0x0

    .line 132
    const/4 v8, 0x0

    .line 133
    const/4 v10, 0x0

    .line 134
    move-object/from16 v9, p2

    .line 135
    .line 136
    move-object v7, v3

    .line 137
    move-object v4, v12

    .line 138
    move v12, v0

    .line 139
    move-object v3, v1

    .line 140
    invoke-static/range {v3 .. v13}, La/obc;->q(La/mm40;La/rqm;ZLa/gy40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 141
    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_6
    invoke-virtual/range {p3 .. p3}, La/fet;->X()V

    .line 145
    .line 146
    .line 147
    :goto_5
    invoke-virtual/range {p3 .. p3}, La/fet;->u()La/yfe0;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    if-eqz v6, :cond_7

    .line 152
    .line 153
    new-instance v0, La/zuc;

    .line 154
    .line 155
    const/16 v5, 0x12

    .line 156
    .line 157
    move-object/from16 v1, p0

    .line 158
    .line 159
    move-object/from16 v3, p2

    .line 160
    .line 161
    move/from16 v4, p4

    .line 162
    .line 163
    invoke-direct/range {v0 .. v5}, La/zuc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 164
    .line 165
    .line 166
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 167
    .line 168
    :cond_7
    return-void
.end method

.method public final Q0(La/a4x;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v13, p3

    .line 8
    .line 9
    move/from16 v0, p4

    .line 10
    .line 11
    const v4, 0x4ab2079e    # 5833679.0f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v13, v4}, La/fet;->g0(I)La/fet;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v4, v0, 0x6

    .line 18
    .line 19
    const/4 v5, 0x2

    .line 20
    const/4 v6, 0x4

    .line 21
    if-nez v4, :cond_2

    .line 22
    .line 23
    and-int/lit8 v4, v0, 0x8

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    invoke-virtual {v13, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-virtual {v13, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    :goto_0
    if-eqz v4, :cond_1

    .line 37
    .line 38
    move v4, v6

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v4, v5

    .line 41
    :goto_1
    or-int/2addr v4, v0

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v4, v0

    .line 44
    :goto_2
    and-int/lit8 v7, v0, 0x30

    .line 45
    .line 46
    const/16 v8, 0x20

    .line 47
    .line 48
    if-nez v7, :cond_4

    .line 49
    .line 50
    invoke-virtual {v13, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_3

    .line 55
    .line 56
    move v7, v8

    .line 57
    goto :goto_3

    .line 58
    :cond_3
    const/16 v7, 0x10

    .line 59
    .line 60
    :goto_3
    or-int/2addr v4, v7

    .line 61
    :cond_4
    and-int/lit16 v7, v0, 0x180

    .line 62
    .line 63
    const/16 v9, 0x100

    .line 64
    .line 65
    if-nez v7, :cond_7

    .line 66
    .line 67
    and-int/lit16 v7, v0, 0x200

    .line 68
    .line 69
    if-nez v7, :cond_5

    .line 70
    .line 71
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    goto :goto_4

    .line 76
    :cond_5
    invoke-virtual {v13, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    :goto_4
    if-eqz v7, :cond_6

    .line 81
    .line 82
    move v7, v9

    .line 83
    goto :goto_5

    .line 84
    :cond_6
    const/16 v7, 0x80

    .line 85
    .line 86
    :goto_5
    or-int/2addr v4, v7

    .line 87
    :cond_7
    and-int/lit16 v7, v4, 0x93

    .line 88
    .line 89
    const/16 v10, 0x92

    .line 90
    .line 91
    const/4 v11, 0x0

    .line 92
    const/4 v12, 0x1

    .line 93
    if-eq v7, v10, :cond_8

    .line 94
    .line 95
    move v7, v12

    .line 96
    goto :goto_6

    .line 97
    :cond_8
    move v7, v11

    .line 98
    :goto_6
    and-int/lit8 v10, v4, 0x1

    .line 99
    .line 100
    invoke-virtual {v13, v10, v7}, La/fet;->U(IZ)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-eqz v7, :cond_10

    .line 105
    .line 106
    sget-object v7, La/qmk;->a:La/zcl;

    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    const/high16 v10, 0x41800000    # 16.0f

    .line 110
    .line 111
    const/high16 v14, 0x40800000    # 4.0f

    .line 112
    .line 113
    invoke-static {v14, v7, v14, v10, v5}, La/s5x0;->u(FFFFI)La/lh80;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    and-int/lit8 v7, v4, 0xe

    .line 118
    .line 119
    if-eq v7, v6, :cond_a

    .line 120
    .line 121
    and-int/lit8 v6, v4, 0x8

    .line 122
    .line 123
    if-eqz v6, :cond_9

    .line 124
    .line 125
    invoke-virtual {v13, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_9

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_9
    move v6, v11

    .line 133
    goto :goto_8

    .line 134
    :cond_a
    :goto_7
    move v6, v12

    .line 135
    :goto_8
    and-int/lit16 v7, v4, 0x380

    .line 136
    .line 137
    if-eq v7, v9, :cond_c

    .line 138
    .line 139
    and-int/lit16 v7, v4, 0x200

    .line 140
    .line 141
    if-eqz v7, :cond_b

    .line 142
    .line 143
    invoke-virtual {v13, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-eqz v7, :cond_b

    .line 148
    .line 149
    goto :goto_9

    .line 150
    :cond_b
    move v7, v11

    .line 151
    goto :goto_a

    .line 152
    :cond_c
    :goto_9
    move v7, v12

    .line 153
    :goto_a
    or-int/2addr v6, v7

    .line 154
    and-int/lit8 v4, v4, 0x70

    .line 155
    .line 156
    if-ne v4, v8, :cond_d

    .line 157
    .line 158
    move v11, v12

    .line 159
    :cond_d
    or-int v4, v6, v11

    .line 160
    .line 161
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    if-nez v4, :cond_e

    .line 166
    .line 167
    sget-object v4, La/ukd;->a:La/cl5;

    .line 168
    .line 169
    if-ne v6, v4, :cond_f

    .line 170
    .line 171
    :cond_e
    new-instance v6, La/sw8;

    .line 172
    .line 173
    const/16 v4, 0x12

    .line 174
    .line 175
    invoke-direct {v6, v2, v1, v3, v4}, La/sw8;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v13, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_f
    move-object v12, v6

    .line 182
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 183
    .line 184
    const/4 v14, 0x0

    .line 185
    const/16 v15, 0x1fb

    .line 186
    .line 187
    const/4 v4, 0x0

    .line 188
    move-object v6, v5

    .line 189
    const/4 v5, 0x0

    .line 190
    const/4 v7, 0x0

    .line 191
    const/4 v8, 0x0

    .line 192
    const/4 v9, 0x0

    .line 193
    const/4 v10, 0x0

    .line 194
    const/4 v11, 0x0

    .line 195
    invoke-static/range {v4 .. v15}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 196
    .line 197
    .line 198
    goto :goto_b

    .line 199
    :cond_10
    invoke-virtual/range {p3 .. p3}, La/fet;->X()V

    .line 200
    .line 201
    .line 202
    :goto_b
    invoke-virtual/range {p3 .. p3}, La/fet;->u()La/yfe0;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    if-eqz v6, :cond_11

    .line 207
    .line 208
    new-instance v0, La/zuc;

    .line 209
    .line 210
    const/16 v5, 0x11

    .line 211
    .line 212
    move/from16 v4, p4

    .line 213
    .line 214
    invoke-direct/range {v0 .. v5}, La/zuc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 215
    .line 216
    .line 217
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 218
    .line 219
    :cond_11
    return-void
.end method

.method public final R0(ILa/fet;)V
    .locals 18

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v4, p2

    .line 4
    .line 5
    const v1, -0x8a5259d

    .line 6
    .line 7
    .line 8
    invoke-virtual {v4, v1}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v1, v0, 0x1

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v3, v2

    .line 19
    :goto_0
    invoke-virtual {v4, v1, v3}, La/fet;->U(IZ)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/high16 v1, 0x3f800000    # 1.0f

    .line 26
    .line 27
    sget-object v11, La/jm40;->b:La/jm40;

    .line 28
    .line 29
    invoke-static {v11, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget-object v3, La/gqw0;->e:La/zx7;

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    invoke-static {v1, v3, v5}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 37
    .line 38
    .line 39
    move-result-object v12

    .line 40
    sget-object v1, La/qmk;->a:La/zcl;

    .line 41
    .line 42
    const/high16 v16, 0x41000000    # 8.0f

    .line 43
    .line 44
    const/16 v17, 0x5

    .line 45
    .line 46
    const/4 v13, 0x0

    .line 47
    const/high16 v14, 0x41e00000    # 28.0f

    .line 48
    .line 49
    const/4 v15, 0x0

    .line 50
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const v3, 0x7f1315ae

    .line 55
    .line 56
    .line 57
    invoke-static {v3, v2, v4}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const/4 v9, 0x0

    .line 62
    const/16 v10, 0x1c

    .line 63
    .line 64
    const-wide/16 v3, 0x0

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    const-wide/16 v6, 0x0

    .line 68
    .line 69
    move-object/from16 v8, p2

    .line 70
    .line 71
    invoke-static/range {v1 .. v10}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 72
    .line 73
    .line 74
    const/high16 v7, 0x41800000    # 16.0f

    .line 75
    .line 76
    const/4 v8, 0x7

    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    move-object v3, v11

    .line 81
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    const/4 v5, 0x6

    .line 86
    const/4 v6, 0x4

    .line 87
    sget-object v1, La/zfi0;->a:La/zfi0;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    move-object/from16 v4, p2

    .line 91
    .line 92
    invoke-static/range {v1 .. v6}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 97
    .line 98
    .line 99
    :goto_1
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    new-instance v2, La/n00;

    .line 106
    .line 107
    const/16 v3, 0x1c

    .line 108
    .line 109
    move-object/from16 v4, p0

    .line 110
    .line 111
    invoke-direct {v2, v4, v0, v3}, La/n00;-><init>(Ljava/lang/Object;IB)V

    .line 112
    .line 113
    .line 114
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 115
    .line 116
    :cond_2
    return-void
.end method
