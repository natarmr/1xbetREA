.class public final synthetic La/nxg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/nxg0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/nxg0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/nxg0;->a:La/nxg0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.betting.core.make_bet.data.model.SaveBetsRequest"

    .line 11
    .line 12
    const/16 v3, 0xf

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "BetId"

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "UserId"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "AppGuid"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "Lng"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "Events"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "partner"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "Source"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "expressNum"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "Vid"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "CfView"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "CheckCf"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "AntiExpressCoef"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "WithLobby"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "EventsIndexes"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "MinBetSystems"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    sput-object v1, La/nxg0;->descriptor:La/ugi0;

    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

    .line 1
    sget-object p0, La/pxg0;->p:[La/a8z;

    .line 2
    .line 3
    const/16 v0, 0xf

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
    sget-object v2, La/s710;->a:La/s710;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    aput-object v2, v0, v3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    aput-object v1, v0, v3

    .line 19
    .line 20
    const/4 v3, 0x3

    .line 21
    aput-object v1, v0, v3

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    aget-object v3, p0, v1

    .line 25
    .line 26
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    aput-object v3, v0, v1

    .line 31
    .line 32
    sget-object v1, La/okx;->a:La/okx;

    .line 33
    .line 34
    const/4 v3, 0x5

    .line 35
    aput-object v1, v0, v3

    .line 36
    .line 37
    const/4 v3, 0x6

    .line 38
    aput-object v1, v0, v3

    .line 39
    .line 40
    const/4 v3, 0x7

    .line 41
    aput-object v2, v0, v3

    .line 42
    .line 43
    const/16 v2, 0x8

    .line 44
    .line 45
    aput-object v1, v0, v2

    .line 46
    .line 47
    const/16 v2, 0x9

    .line 48
    .line 49
    aput-object v1, v0, v2

    .line 50
    .line 51
    const/16 v2, 0xa

    .line 52
    .line 53
    aput-object v1, v0, v2

    .line 54
    .line 55
    const/16 v1, 0xb

    .line 56
    .line 57
    sget-object v2, La/tbl;->a:La/tbl;

    .line 58
    .line 59
    aput-object v2, v0, v1

    .line 60
    .line 61
    const/16 v1, 0xc

    .line 62
    .line 63
    sget-object v2, La/sm8;->a:La/sm8;

    .line 64
    .line 65
    aput-object v2, v0, v1

    .line 66
    .line 67
    const/16 v1, 0xd

    .line 68
    .line 69
    aget-object v2, p0, v1

    .line 70
    .line 71
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    aput-object v2, v0, v1

    .line 76
    .line 77
    const/16 v1, 0xe

    .line 78
    .line 79
    aget-object p0, p0, v1

    .line 80
    .line 81
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    aput-object p0, v0, v1

    .line 86
    .line 87
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 30

    .line 1
    sget-object v0, La/nxg0;->descriptor:La/ugi0;

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
    sget-object v2, La/pxg0;->p:[La/a8z;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const-wide/16 v6, 0x0

    .line 15
    .line 16
    const-wide/16 v8, 0x0

    .line 17
    .line 18
    move v11, v4

    .line 19
    move/from16 v18, v11

    .line 20
    .line 21
    move/from16 v19, v18

    .line 22
    .line 23
    move/from16 v22, v19

    .line 24
    .line 25
    move/from16 v23, v22

    .line 26
    .line 27
    move/from16 v24, v23

    .line 28
    .line 29
    move/from16 v27, v24

    .line 30
    .line 31
    move-object v12, v5

    .line 32
    move-object v15, v12

    .line 33
    move-object/from16 v16, v15

    .line 34
    .line 35
    move-wide v13, v6

    .line 36
    move-wide/from16 v20, v13

    .line 37
    .line 38
    move-wide/from16 v25, v8

    .line 39
    .line 40
    move v6, v3

    .line 41
    move-object/from16 v7, v16

    .line 42
    .line 43
    move-object v8, v7

    .line 44
    move-object v9, v8

    .line 45
    :goto_0
    if-eqz v6, :cond_0

    .line 46
    .line 47
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 48
    .line 49
    .line 50
    move-result v10

    .line 51
    packed-switch v10, :pswitch_data_0

    .line 52
    .line 53
    .line 54
    invoke-static {v10}, La/itt0;->c(I)V

    .line 55
    .line 56
    .line 57
    return-object v5

    .line 58
    :pswitch_0
    const/16 v10, 0xe

    .line 59
    .line 60
    aget-object v17, v2, v10

    .line 61
    .line 62
    invoke-interface/range {v17 .. v17}, La/a8z;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v17

    .line 66
    move-object/from16 v5, v17

    .line 67
    .line 68
    check-cast v5, La/jiy;

    .line 69
    .line 70
    invoke-interface {v1, v0, v10, v5, v9}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    move-object v9, v5

    .line 75
    check-cast v9, Ljava/util/List;

    .line 76
    .line 77
    or-int/lit16 v11, v11, 0x4000

    .line 78
    .line 79
    :goto_1
    const/4 v5, 0x0

    .line 80
    goto :goto_0

    .line 81
    :pswitch_1
    const/16 v5, 0xd

    .line 82
    .line 83
    aget-object v10, v2, v5

    .line 84
    .line 85
    invoke-interface {v10}, La/a8z;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v10

    .line 89
    check-cast v10, La/jiy;

    .line 90
    .line 91
    invoke-interface {v1, v0, v5, v10, v8}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    move-object v8, v5

    .line 96
    check-cast v8, Ljava/util/List;

    .line 97
    .line 98
    or-int/lit16 v11, v11, 0x2000

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :pswitch_2
    const/16 v5, 0xc

    .line 102
    .line 103
    invoke-interface {v1, v0, v5}, La/bld;->B(La/ugi0;I)Z

    .line 104
    .line 105
    .line 106
    move-result v27

    .line 107
    or-int/lit16 v11, v11, 0x1000

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_3
    const/16 v5, 0xb

    .line 111
    .line 112
    invoke-interface {v1, v0, v5}, La/bld;->t(La/ugi0;I)D

    .line 113
    .line 114
    .line 115
    move-result-wide v25

    .line 116
    or-int/lit16 v11, v11, 0x800

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_4
    const/16 v5, 0xa

    .line 120
    .line 121
    invoke-interface {v1, v0, v5}, La/bld;->j(La/ugi0;I)I

    .line 122
    .line 123
    .line 124
    move-result v24

    .line 125
    or-int/lit16 v11, v11, 0x400

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :pswitch_5
    const/16 v5, 0x9

    .line 129
    .line 130
    invoke-interface {v1, v0, v5}, La/bld;->j(La/ugi0;I)I

    .line 131
    .line 132
    .line 133
    move-result v23

    .line 134
    or-int/lit16 v11, v11, 0x200

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :pswitch_6
    const/16 v5, 0x8

    .line 138
    .line 139
    invoke-interface {v1, v0, v5}, La/bld;->j(La/ugi0;I)I

    .line 140
    .line 141
    .line 142
    move-result v22

    .line 143
    or-int/lit16 v11, v11, 0x100

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :pswitch_7
    const/4 v5, 0x7

    .line 147
    invoke-interface {v1, v0, v5}, La/bld;->r(La/ugi0;I)J

    .line 148
    .line 149
    .line 150
    move-result-wide v20

    .line 151
    or-int/lit16 v11, v11, 0x80

    .line 152
    .line 153
    goto :goto_1

    .line 154
    :pswitch_8
    const/4 v5, 0x6

    .line 155
    invoke-interface {v1, v0, v5}, La/bld;->j(La/ugi0;I)I

    .line 156
    .line 157
    .line 158
    move-result v19

    .line 159
    or-int/lit8 v11, v11, 0x40

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :pswitch_9
    const/4 v5, 0x5

    .line 163
    invoke-interface {v1, v0, v5}, La/bld;->j(La/ugi0;I)I

    .line 164
    .line 165
    .line 166
    move-result v18

    .line 167
    or-int/lit8 v11, v11, 0x20

    .line 168
    .line 169
    goto :goto_1

    .line 170
    :pswitch_a
    const/4 v5, 0x4

    .line 171
    aget-object v10, v2, v5

    .line 172
    .line 173
    invoke-interface {v10}, La/a8z;->getValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    check-cast v10, La/jiy;

    .line 178
    .line 179
    invoke-interface {v1, v0, v5, v10, v7}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    move-object v7, v5

    .line 184
    check-cast v7, Ljava/util/List;

    .line 185
    .line 186
    or-int/lit8 v11, v11, 0x10

    .line 187
    .line 188
    goto :goto_1

    .line 189
    :pswitch_b
    const/4 v5, 0x3

    .line 190
    invoke-interface {v1, v0, v5}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v16

    .line 194
    or-int/lit8 v11, v11, 0x8

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :pswitch_c
    const/4 v5, 0x2

    .line 198
    invoke-interface {v1, v0, v5}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v15

    .line 202
    or-int/lit8 v11, v11, 0x4

    .line 203
    .line 204
    goto :goto_1

    .line 205
    :pswitch_d
    invoke-interface {v1, v0, v3}, La/bld;->r(La/ugi0;I)J

    .line 206
    .line 207
    .line 208
    move-result-wide v13

    .line 209
    or-int/lit8 v11, v11, 0x2

    .line 210
    .line 211
    goto/16 :goto_1

    .line 212
    .line 213
    :pswitch_e
    invoke-interface {v1, v0, v4}, La/bld;->x(La/ugi0;I)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    or-int/lit8 v11, v11, 0x1

    .line 218
    .line 219
    goto/16 :goto_1

    .line 220
    .line 221
    :pswitch_f
    move v6, v4

    .line 222
    goto/16 :goto_0

    .line 223
    .line 224
    :cond_0
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 225
    .line 226
    .line 227
    new-instance v10, La/pxg0;

    .line 228
    .line 229
    move-object/from16 v17, v7

    .line 230
    .line 231
    move-object/from16 v28, v8

    .line 232
    .line 233
    move-object/from16 v29, v9

    .line 234
    .line 235
    invoke-direct/range {v10 .. v29}, La/pxg0;-><init>(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;IIJIIIDZLjava/util/List;Ljava/util/List;)V

    .line 236
    .line 237
    .line 238
    return-object v10

    .line 239
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
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
    sget-object p0, La/nxg0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/pxg0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object p0, La/nxg0;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, p0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, La/pxg0;->p:[La/a8z;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iget-object v2, p2, La/pxg0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iget-wide v2, p2, La/pxg0;->b:J

    .line 22
    .line 23
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->n(La/ugi0;IJ)V

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    iget-object v2, p2, La/pxg0;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    iget-object v2, p2, La/pxg0;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {p1, p0, v1, v2}, La/cld;->z(La/ugi0;ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x4

    .line 39
    aget-object v2, v0, v1

    .line 40
    .line 41
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, La/jiy;

    .line 46
    .line 47
    iget-object v3, p2, La/pxg0;->e:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x5

    .line 53
    iget v2, p2, La/pxg0;->f:I

    .line 54
    .line 55
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x6

    .line 59
    iget v2, p2, La/pxg0;->g:I

    .line 60
    .line 61
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x7

    .line 65
    iget-wide v2, p2, La/pxg0;->h:J

    .line 66
    .line 67
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->n(La/ugi0;IJ)V

    .line 68
    .line 69
    .line 70
    const/16 v1, 0x8

    .line 71
    .line 72
    iget v2, p2, La/pxg0;->i:I

    .line 73
    .line 74
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 75
    .line 76
    .line 77
    const/16 v1, 0x9

    .line 78
    .line 79
    iget v2, p2, La/pxg0;->j:I

    .line 80
    .line 81
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 82
    .line 83
    .line 84
    const/16 v1, 0xa

    .line 85
    .line 86
    iget v2, p2, La/pxg0;->k:I

    .line 87
    .line 88
    invoke-interface {p1, v1, v2, p0}, La/cld;->i(IILa/ugi0;)V

    .line 89
    .line 90
    .line 91
    const/16 v1, 0xb

    .line 92
    .line 93
    iget-wide v2, p2, La/pxg0;->l:D

    .line 94
    .line 95
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->j(La/ugi0;ID)V

    .line 96
    .line 97
    .line 98
    const/16 v1, 0xc

    .line 99
    .line 100
    iget-boolean v2, p2, La/pxg0;->m:Z

    .line 101
    .line 102
    invoke-interface {p1, p0, v1, v2}, La/cld;->x(La/ugi0;IZ)V

    .line 103
    .line 104
    .line 105
    const/16 v1, 0xd

    .line 106
    .line 107
    aget-object v2, v0, v1

    .line 108
    .line 109
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, La/jiy;

    .line 114
    .line 115
    iget-object v3, p2, La/pxg0;->n:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {p1, p0, v1, v2, v3}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    const/16 v1, 0xe

    .line 121
    .line 122
    aget-object v0, v0, v1

    .line 123
    .line 124
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, La/jiy;

    .line 129
    .line 130
    iget-object p2, p2, La/pxg0;->o:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {p1, p0, v1, v0, p2}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p1, p0}, La/cld;->c(La/ugi0;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method
