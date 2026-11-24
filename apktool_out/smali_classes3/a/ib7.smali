.class public final synthetic La/ib7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/ib7;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/ib7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/ib7;->a:La/ib7;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.bet_history.core.data.model.BetInfoHistoryWithSummaryByGlobalChampWithBetTypesRequest"

    .line 11
    .line 12
    const/16 v3, 0xc

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "Language"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "CfView"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "BonusUserId"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "Count"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "BetStatuses"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "LastBetId"

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-virtual {v1, v0, v3}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    const-string v0, "CalculateSaleInfo"

    .line 50
    .line 51
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, "OnlyBetsForSale"

    .line 55
    .line 56
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v0, "PartnerId"

    .line 60
    .line 61
    invoke-virtual {v1, v0, v3}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    const-string v0, "CalculateSummaryInfo"

    .line 65
    .line 66
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 67
    .line 68
    .line 69
    const-string v0, "GlobalChampId"

    .line 70
    .line 71
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 72
    .line 73
    .line 74
    const-string v0, "BetTypes"

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    sput-object v1, La/ib7;->descriptor:La/ugi0;

    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 6

    .line 1
    sget-object p0, La/kb7;->m:[La/a8z;

    .line 2
    .line 3
    const/16 v0, 0xc

    .line 4
    .line 5
    new-array v0, v0, [La/jiy;

    .line 6
    .line 7
    sget-object v1, La/ysm0;->a:La/ysm0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    sget-object v2, La/okx;->a:La/okx;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    aput-object v2, v0, v3

    .line 16
    .line 17
    sget-object v3, La/s710;->a:La/s710;

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    aput-object v3, v0, v4

    .line 21
    .line 22
    const/4 v4, 0x3

    .line 23
    aput-object v2, v0, v4

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    aget-object v5, p0, v4

    .line 27
    .line 28
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    aput-object v5, v0, v4

    .line 33
    .line 34
    const/4 v4, 0x5

    .line 35
    invoke-static {v3}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    aput-object v3, v0, v4

    .line 40
    .line 41
    sget-object v3, La/sm8;->a:La/sm8;

    .line 42
    .line 43
    const/4 v4, 0x6

    .line 44
    aput-object v3, v0, v4

    .line 45
    .line 46
    const/4 v4, 0x7

    .line 47
    aput-object v3, v0, v4

    .line 48
    .line 49
    const/16 v4, 0x8

    .line 50
    .line 51
    aput-object v2, v0, v4

    .line 52
    .line 53
    const/16 v2, 0x9

    .line 54
    .line 55
    aput-object v3, v0, v2

    .line 56
    .line 57
    const/16 v2, 0xa

    .line 58
    .line 59
    aput-object v1, v0, v2

    .line 60
    .line 61
    const/16 v1, 0xb

    .line 62
    .line 63
    aget-object p0, p0, v1

    .line 64
    .line 65
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    aput-object p0, v0, v1

    .line 70
    .line 71
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 23

    .line 1
    sget-object v0, La/ib7;->descriptor:La/ugi0;

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-interface {v1, v0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, La/kb7;->m:[La/a8z;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v5, 0x0

    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    move-object v8, v5

    .line 16
    move-object v10, v8

    .line 17
    move-object v15, v10

    .line 18
    move-object/from16 v21, v15

    .line 19
    .line 20
    move-wide v12, v6

    .line 21
    const/4 v9, 0x0

    .line 22
    const/4 v11, 0x0

    .line 23
    const/4 v14, 0x0

    .line 24
    const/16 v17, 0x0

    .line 25
    .line 26
    const/16 v18, 0x0

    .line 27
    .line 28
    const/16 v19, 0x0

    .line 29
    .line 30
    const/16 v20, 0x0

    .line 31
    .line 32
    move v6, v3

    .line 33
    move-object/from16 v7, v21

    .line 34
    .line 35
    :goto_0
    if-eqz v6, :cond_0

    .line 36
    .line 37
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 38
    .line 39
    .line 40
    move-result v16

    .line 41
    packed-switch v16, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v16 .. v16}, La/itt0;->c(I)V

    .line 45
    .line 46
    .line 47
    return-object v5

    .line 48
    :pswitch_0
    const/16 v5, 0xb

    .line 49
    .line 50
    aget-object v16, v2, v5

    .line 51
    .line 52
    invoke-interface/range {v16 .. v16}, La/a8z;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v16

    .line 56
    move-object/from16 v4, v16

    .line 57
    .line 58
    check-cast v4, La/jiy;

    .line 59
    .line 60
    invoke-interface {v1, v0, v5, v4, v8}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    move-object v8, v4

    .line 65
    check-cast v8, Ljava/util/List;

    .line 66
    .line 67
    or-int/lit16 v9, v9, 0x800

    .line 68
    .line 69
    :goto_1
    const/4 v5, 0x0

    .line 70
    goto :goto_0

    .line 71
    :pswitch_1
    const/16 v4, 0xa

    .line 72
    .line 73
    invoke-interface {v1, v0, v4}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v21

    .line 77
    or-int/lit16 v9, v9, 0x400

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :pswitch_2
    const/16 v4, 0x9

    .line 81
    .line 82
    invoke-interface {v1, v0, v4}, La/bld;->B(La/ugi0;I)Z

    .line 83
    .line 84
    .line 85
    move-result v20

    .line 86
    or-int/lit16 v9, v9, 0x200

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :pswitch_3
    const/16 v4, 0x8

    .line 90
    .line 91
    invoke-interface {v1, v0, v4}, La/bld;->j(La/ugi0;I)I

    .line 92
    .line 93
    .line 94
    move-result v19

    .line 95
    or-int/lit16 v9, v9, 0x100

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :pswitch_4
    const/4 v4, 0x7

    .line 99
    invoke-interface {v1, v0, v4}, La/bld;->B(La/ugi0;I)Z

    .line 100
    .line 101
    .line 102
    move-result v18

    .line 103
    or-int/lit16 v9, v9, 0x80

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :pswitch_5
    const/4 v4, 0x6

    .line 107
    invoke-interface {v1, v0, v4}, La/bld;->B(La/ugi0;I)Z

    .line 108
    .line 109
    .line 110
    move-result v17

    .line 111
    or-int/lit8 v9, v9, 0x40

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_6
    const/4 v4, 0x5

    .line 115
    sget-object v5, La/s710;->a:La/s710;

    .line 116
    .line 117
    invoke-interface {v1, v0, v4, v5, v7}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    move-object v7, v4

    .line 122
    check-cast v7, Ljava/lang/Long;

    .line 123
    .line 124
    or-int/lit8 v9, v9, 0x20

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :pswitch_7
    const/4 v4, 0x4

    .line 128
    aget-object v5, v2, v4

    .line 129
    .line 130
    invoke-interface {v5}, La/a8z;->getValue()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    check-cast v5, La/jiy;

    .line 135
    .line 136
    invoke-interface {v1, v0, v4, v5, v15}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    move-object v15, v4

    .line 141
    check-cast v15, Ljava/util/List;

    .line 142
    .line 143
    or-int/lit8 v9, v9, 0x10

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :pswitch_8
    const/4 v4, 0x3

    .line 147
    invoke-interface {v1, v0, v4}, La/bld;->j(La/ugi0;I)I

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    or-int/lit8 v9, v9, 0x8

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :pswitch_9
    const/4 v4, 0x2

    .line 155
    invoke-interface {v1, v0, v4}, La/bld;->r(La/ugi0;I)J

    .line 156
    .line 157
    .line 158
    move-result-wide v12

    .line 159
    or-int/lit8 v9, v9, 0x4

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :pswitch_a
    invoke-interface {v1, v0, v3}, La/bld;->j(La/ugi0;I)I

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    or-int/lit8 v9, v9, 0x2

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :pswitch_b
    const/4 v4, 0x0

    .line 170
    invoke-interface {v1, v0, v4}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    or-int/lit8 v9, v9, 0x1

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :pswitch_c
    const/4 v4, 0x0

    .line 178
    move v6, v4

    .line 179
    goto/16 :goto_0

    .line 180
    .line 181
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 182
    .line 183
    .line 184
    move-object/from16 v22, v8

    .line 185
    .line 186
    new-instance v8, La/kb7;

    .line 187
    .line 188
    move-object/from16 v16, v7

    .line 189
    .line 190
    invoke-direct/range {v8 .. v22}, La/kb7;-><init>(ILjava/lang/String;IJILjava/util/List;Ljava/lang/Long;ZZIZLjava/lang/String;Ljava/util/List;)V

    .line 191
    .line 192
    .line 193
    return-object v8

    .line 194
    nop

    .line 195
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/ib7;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p2, La/kb7;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/ib7;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/kb7;->m:[La/a8z;

    .line 13
    .line 14
    iget-object v1, p2, La/kb7;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget v2, p2, La/kb7;->i:I

    .line 17
    .line 18
    iget-object v3, p2, La/kb7;->f:Ljava/lang/Long;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    invoke-interface {p1, p0, v4, v1}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    iget v4, p2, La/kb7;->b:I

    .line 26
    .line 27
    invoke-interface {p1, v1, v4, p0}, La/cld;->i(IILa/ugi0;)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    iget-wide v4, p2, La/kb7;->c:J

    .line 32
    .line 33
    invoke-interface {p1, p0, v1, v4, v5}, La/cld;->n(La/ugi0;IJ)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    iget v4, p2, La/kb7;->d:I

    .line 38
    .line 39
    invoke-interface {p1, v1, v4, p0}, La/cld;->i(IILa/ugi0;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x4

    .line 43
    aget-object v4, v0, v1

    .line 44
    .line 45
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, La/jiy;

    .line 50
    .line 51
    iget-object v5, p2, La/kb7;->e:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {p1, p0, v1, v4, v5}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    if-eqz v3, :cond_1

    .line 64
    .line 65
    :goto_0
    sget-object v1, La/s710;->a:La/s710;

    .line 66
    .line 67
    const/4 v4, 0x5

    .line 68
    invoke-interface {p1, p0, v4, v1, v3}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    const/4 v1, 0x6

    .line 72
    iget-boolean v3, p2, La/kb7;->g:Z

    .line 73
    .line 74
    invoke-interface {p1, p0, v1, v3}, La/cld;->x(La/ugi0;IZ)V

    .line 75
    .line 76
    .line 77
    const/4 v1, 0x7

    .line 78
    iget-boolean v3, p2, La/kb7;->h:Z

    .line 79
    .line 80
    invoke-interface {p1, p0, v1, v3}, La/cld;->x(La/ugi0;IZ)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, p0}, La/cld;->u(La/ugi0;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    if-eqz v2, :cond_3

    .line 91
    .line 92
    :goto_1
    const/16 v1, 0x8

    .line 93
    .line 94
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    const/16 v1, 0x9

    .line 98
    .line 99
    iget-boolean v2, p2, La/kb7;->j:Z

    .line 100
    .line 101
    invoke-interface {p1, p0, v1, v2}, La/cld;->x(La/ugi0;IZ)V

    .line 102
    .line 103
    .line 104
    const/16 v1, 0xa

    .line 105
    .line 106
    iget-object v2, p2, La/kb7;->k:Ljava/lang/String;

    .line 107
    .line 108
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    const/16 v1, 0xb

    .line 112
    .line 113
    aget-object v0, v0, v1

    .line 114
    .line 115
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, La/jiy;

    .line 120
    .line 121
    iget-object p2, p2, La/kb7;->l:Ljava/util/List;

    .line 122
    .line 123
    invoke-interface {p1, p0, v1, v0, p2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 127
    .line 128
    .line 129
    return-void
.end method
