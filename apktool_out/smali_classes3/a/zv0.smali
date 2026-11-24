.class public final synthetic La/zv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/zv0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/zv0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/zv0;->a:La/zv0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.aggregator.impl.core.data.models.AggregatorGameResponse"

    .line 11
    .line 12
    const/16 v3, 0x10

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "id"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "providerId"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "product"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "name"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "ribbons"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "images"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "liveGamesSettings"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "categoryIds"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "isDemoAvailable"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "needTransfer"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "bonusWageringBan"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "brand"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "partId"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "isTest"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "nameForUrl"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    const-string v0, "lastPlayedAt"

    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    sput-object v1, La/zv0;->descriptor:La/ugi0;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 19

    .line 1
    sget-object v0, La/bw0;->q:[La/a8z;

    .line 2
    .line 3
    sget-object v1, La/s710;->a:La/s710;

    .line 4
    .line 5
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    sget-object v4, La/px0;->a:La/px0;

    .line 14
    .line 15
    invoke-static {v4}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    sget-object v5, La/ysm0;->a:La/ysm0;

    .line 20
    .line 21
    invoke-static {v5}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    const/4 v7, 0x4

    .line 26
    aget-object v8, v0, v7

    .line 27
    .line 28
    invoke-interface {v8}, La/a8z;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    check-cast v8, La/jiy;

    .line 33
    .line 34
    invoke-static {v8}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    sget-object v9, La/jx0;->a:La/jx0;

    .line 39
    .line 40
    invoke-static {v9}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    sget-object v10, La/mx0;->a:La/mx0;

    .line 45
    .line 46
    invoke-static {v10}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 47
    .line 48
    .line 49
    move-result-object v10

    .line 50
    const/4 v11, 0x7

    .line 51
    aget-object v0, v0, v11

    .line 52
    .line 53
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, La/jiy;

    .line 58
    .line 59
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sget-object v12, La/sm8;->a:La/sm8;

    .line 64
    .line 65
    invoke-static {v12}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 66
    .line 67
    .line 68
    move-result-object v13

    .line 69
    invoke-static {v12}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 70
    .line 71
    .line 72
    move-result-object v14

    .line 73
    invoke-static {v12}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 74
    .line 75
    .line 76
    move-result-object v15

    .line 77
    sget-object v16, La/cx0;->a:La/cx0;

    .line 78
    .line 79
    invoke-static/range {v16 .. v16}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 80
    .line 81
    .line 82
    move-result-object v16

    .line 83
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 84
    .line 85
    .line 86
    move-result-object v17

    .line 87
    invoke-static {v12}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 88
    .line 89
    .line 90
    move-result-object v12

    .line 91
    invoke-static {v5}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    move/from16 p0, v7

    .line 100
    .line 101
    const/16 v7, 0x10

    .line 102
    .line 103
    new-array v7, v7, [La/jiy;

    .line 104
    .line 105
    const/16 v18, 0x0

    .line 106
    .line 107
    aput-object v2, v7, v18

    .line 108
    .line 109
    const/4 v2, 0x1

    .line 110
    aput-object v3, v7, v2

    .line 111
    .line 112
    const/4 v2, 0x2

    .line 113
    aput-object v4, v7, v2

    .line 114
    .line 115
    const/4 v2, 0x3

    .line 116
    aput-object v6, v7, v2

    .line 117
    .line 118
    aput-object v8, v7, p0

    .line 119
    .line 120
    const/4 v2, 0x5

    .line 121
    aput-object v9, v7, v2

    .line 122
    .line 123
    const/4 v2, 0x6

    .line 124
    aput-object v10, v7, v2

    .line 125
    .line 126
    aput-object v0, v7, v11

    .line 127
    .line 128
    const/16 v0, 0x8

    .line 129
    .line 130
    aput-object v13, v7, v0

    .line 131
    .line 132
    const/16 v0, 0x9

    .line 133
    .line 134
    aput-object v14, v7, v0

    .line 135
    .line 136
    const/16 v0, 0xa

    .line 137
    .line 138
    aput-object v15, v7, v0

    .line 139
    .line 140
    const/16 v0, 0xb

    .line 141
    .line 142
    aput-object v16, v7, v0

    .line 143
    .line 144
    const/16 v0, 0xc

    .line 145
    .line 146
    aput-object v17, v7, v0

    .line 147
    .line 148
    const/16 v0, 0xd

    .line 149
    .line 150
    aput-object v12, v7, v0

    .line 151
    .line 152
    const/16 v0, 0xe

    .line 153
    .line 154
    aput-object v5, v7, v0

    .line 155
    .line 156
    const/16 v0, 0xf

    .line 157
    .line 158
    aput-object v1, v7, v0

    .line 159
    .line 160
    return-object v7
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 25

    .line 1
    sget-object v0, La/zv0;->descriptor:La/ugi0;

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
    sget-object v2, La/bw0;->q:[La/a8z;

    .line 10
    .line 11
    move-object/from16 v17, v2

    .line 12
    .line 13
    const/16 p0, 0x0

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x0

    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    const/16 v18, 0x1

    .line 30
    .line 31
    const/16 v19, 0x0

    .line 32
    .line 33
    const/16 v20, 0x0

    .line 34
    .line 35
    const/16 v21, 0x0

    .line 36
    .line 37
    :goto_0
    if-eqz v18, :cond_0

    .line 38
    .line 39
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 40
    .line 41
    .line 42
    move-result v22

    .line 43
    packed-switch v22, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    invoke-static/range {v22 .. v22}, La/itt0;->c(I)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_0
    move-object/from16 v22, v12

    .line 51
    .line 52
    const/16 v12, 0xf

    .line 53
    .line 54
    move-object/from16 v23, v13

    .line 55
    .line 56
    sget-object v13, La/s710;->a:La/s710;

    .line 57
    .line 58
    invoke-interface {v1, v0, v12, v13, v11}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    check-cast v11, Ljava/lang/Long;

    .line 63
    .line 64
    const v12, 0x8000

    .line 65
    .line 66
    .line 67
    or-int/2addr v8, v12

    .line 68
    :goto_1
    move-object/from16 v12, v22

    .line 69
    .line 70
    move-object/from16 v13, v23

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :pswitch_1
    move-object/from16 v22, v12

    .line 74
    .line 75
    move-object/from16 v23, v13

    .line 76
    .line 77
    const/16 v12, 0xe

    .line 78
    .line 79
    sget-object v13, La/ysm0;->a:La/ysm0;

    .line 80
    .line 81
    invoke-interface {v1, v0, v12, v13, v10}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    check-cast v10, Ljava/lang/String;

    .line 86
    .line 87
    or-int/lit16 v8, v8, 0x4000

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :pswitch_2
    move-object/from16 v22, v12

    .line 91
    .line 92
    move-object/from16 v23, v13

    .line 93
    .line 94
    const/16 v12, 0xd

    .line 95
    .line 96
    sget-object v13, La/sm8;->a:La/sm8;

    .line 97
    .line 98
    invoke-interface {v1, v0, v12, v13, v9}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    check-cast v9, Ljava/lang/Boolean;

    .line 103
    .line 104
    or-int/lit16 v8, v8, 0x2000

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :pswitch_3
    move-object/from16 v22, v12

    .line 108
    .line 109
    move-object/from16 v23, v13

    .line 110
    .line 111
    const/16 v12, 0xc

    .line 112
    .line 113
    sget-object v13, La/s710;->a:La/s710;

    .line 114
    .line 115
    invoke-interface {v1, v0, v12, v13, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    check-cast v6, Ljava/lang/Long;

    .line 120
    .line 121
    or-int/lit16 v8, v8, 0x1000

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :pswitch_4
    move-object/from16 v22, v12

    .line 125
    .line 126
    move-object/from16 v23, v13

    .line 127
    .line 128
    const/16 v12, 0xb

    .line 129
    .line 130
    sget-object v13, La/cx0;->a:La/cx0;

    .line 131
    .line 132
    invoke-interface {v1, v0, v12, v13, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, La/ex0;

    .line 137
    .line 138
    or-int/lit16 v8, v8, 0x800

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :pswitch_5
    move-object/from16 v22, v12

    .line 142
    .line 143
    move-object/from16 v23, v13

    .line 144
    .line 145
    const/16 v12, 0xa

    .line 146
    .line 147
    sget-object v13, La/sm8;->a:La/sm8;

    .line 148
    .line 149
    invoke-interface {v1, v0, v12, v13, v3}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    check-cast v3, Ljava/lang/Boolean;

    .line 154
    .line 155
    or-int/lit16 v8, v8, 0x400

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :pswitch_6
    move-object/from16 v22, v12

    .line 159
    .line 160
    move-object/from16 v23, v13

    .line 161
    .line 162
    const/16 v12, 0x9

    .line 163
    .line 164
    sget-object v13, La/sm8;->a:La/sm8;

    .line 165
    .line 166
    invoke-interface {v1, v0, v12, v13, v4}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    check-cast v4, Ljava/lang/Boolean;

    .line 171
    .line 172
    or-int/lit16 v8, v8, 0x200

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :pswitch_7
    move-object/from16 v22, v12

    .line 176
    .line 177
    move-object/from16 v23, v13

    .line 178
    .line 179
    sget-object v12, La/sm8;->a:La/sm8;

    .line 180
    .line 181
    const/16 v13, 0x8

    .line 182
    .line 183
    invoke-interface {v1, v0, v13, v12, v5}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    check-cast v5, Ljava/lang/Boolean;

    .line 188
    .line 189
    or-int/lit16 v8, v8, 0x100

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :pswitch_8
    move-object/from16 v22, v12

    .line 193
    .line 194
    move-object/from16 v23, v13

    .line 195
    .line 196
    const/4 v12, 0x7

    .line 197
    aget-object v13, v17, v12

    .line 198
    .line 199
    invoke-interface {v13}, La/a8z;->getValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    check-cast v13, La/jiy;

    .line 204
    .line 205
    invoke-interface {v1, v0, v12, v13, v7}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    check-cast v7, Ljava/util/List;

    .line 210
    .line 211
    or-int/lit16 v8, v8, 0x80

    .line 212
    .line 213
    goto/16 :goto_1

    .line 214
    .line 215
    :pswitch_9
    move-object/from16 v22, v12

    .line 216
    .line 217
    move-object/from16 v23, v13

    .line 218
    .line 219
    const/4 v12, 0x6

    .line 220
    sget-object v13, La/mx0;->a:La/mx0;

    .line 221
    .line 222
    invoke-interface {v1, v0, v12, v13, v15}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    move-object v15, v12

    .line 227
    check-cast v15, La/ox0;

    .line 228
    .line 229
    or-int/lit8 v8, v8, 0x40

    .line 230
    .line 231
    goto/16 :goto_1

    .line 232
    .line 233
    :pswitch_a
    move-object/from16 v22, v12

    .line 234
    .line 235
    move-object/from16 v23, v13

    .line 236
    .line 237
    const/4 v12, 0x5

    .line 238
    sget-object v13, La/jx0;->a:La/jx0;

    .line 239
    .line 240
    invoke-interface {v1, v0, v12, v13, v14}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v12

    .line 244
    move-object v14, v12

    .line 245
    check-cast v14, La/lx0;

    .line 246
    .line 247
    or-int/lit8 v8, v8, 0x20

    .line 248
    .line 249
    goto/16 :goto_1

    .line 250
    .line 251
    :pswitch_b
    move-object/from16 v22, v12

    .line 252
    .line 253
    move-object/from16 v23, v13

    .line 254
    .line 255
    const/4 v12, 0x4

    .line 256
    aget-object v13, v17, v12

    .line 257
    .line 258
    invoke-interface {v13}, La/a8z;->getValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v13

    .line 262
    check-cast v13, La/jiy;

    .line 263
    .line 264
    move-object/from16 v24, v2

    .line 265
    .line 266
    move-object/from16 v2, v23

    .line 267
    .line 268
    invoke-interface {v1, v0, v12, v13, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    move-object v13, v2

    .line 273
    check-cast v13, Ljava/util/List;

    .line 274
    .line 275
    or-int/lit8 v8, v8, 0x10

    .line 276
    .line 277
    move-object/from16 v12, v22

    .line 278
    .line 279
    :goto_2
    move-object/from16 v2, v24

    .line 280
    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :pswitch_c
    move-object/from16 v24, v2

    .line 284
    .line 285
    move-object/from16 v22, v12

    .line 286
    .line 287
    move-object v2, v13

    .line 288
    const/4 v12, 0x3

    .line 289
    sget-object v13, La/ysm0;->a:La/ysm0;

    .line 290
    .line 291
    move-object/from16 v23, v2

    .line 292
    .line 293
    move-object/from16 v2, v22

    .line 294
    .line 295
    invoke-interface {v1, v0, v12, v13, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    move-object v12, v2

    .line 300
    check-cast v12, Ljava/lang/String;

    .line 301
    .line 302
    or-int/lit8 v8, v8, 0x8

    .line 303
    .line 304
    :goto_3
    move-object/from16 v13, v23

    .line 305
    .line 306
    goto :goto_2

    .line 307
    :pswitch_d
    move-object/from16 v24, v2

    .line 308
    .line 309
    move-object v2, v12

    .line 310
    move-object/from16 v23, v13

    .line 311
    .line 312
    sget-object v12, La/px0;->a:La/px0;

    .line 313
    .line 314
    const/4 v13, 0x2

    .line 315
    move-object/from16 v22, v2

    .line 316
    .line 317
    move-object/from16 v2, v21

    .line 318
    .line 319
    invoke-interface {v1, v0, v13, v12, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    move-object/from16 v21, v2

    .line 324
    .line 325
    check-cast v21, La/rx0;

    .line 326
    .line 327
    or-int/lit8 v8, v8, 0x4

    .line 328
    .line 329
    :goto_4
    move-object/from16 v12, v22

    .line 330
    .line 331
    goto :goto_3

    .line 332
    :pswitch_e
    move-object/from16 v24, v2

    .line 333
    .line 334
    move-object/from16 v22, v12

    .line 335
    .line 336
    move-object/from16 v23, v13

    .line 337
    .line 338
    move-object/from16 v2, v21

    .line 339
    .line 340
    sget-object v12, La/s710;->a:La/s710;

    .line 341
    .line 342
    move-object/from16 v16, v2

    .line 343
    .line 344
    move-object/from16 v13, v20

    .line 345
    .line 346
    const/4 v2, 0x1

    .line 347
    invoke-interface {v1, v0, v2, v12, v13}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v12

    .line 351
    move-object/from16 v20, v12

    .line 352
    .line 353
    check-cast v20, Ljava/lang/Long;

    .line 354
    .line 355
    or-int/lit8 v8, v8, 0x2

    .line 356
    .line 357
    move-object/from16 v21, v16

    .line 358
    .line 359
    goto :goto_4

    .line 360
    :pswitch_f
    move-object/from16 v24, v2

    .line 361
    .line 362
    move-object/from16 v22, v12

    .line 363
    .line 364
    move-object/from16 v23, v13

    .line 365
    .line 366
    move-object/from16 v13, v20

    .line 367
    .line 368
    move-object/from16 v16, v21

    .line 369
    .line 370
    const/4 v2, 0x1

    .line 371
    sget-object v12, La/s710;->a:La/s710;

    .line 372
    .line 373
    move-object/from16 v2, v19

    .line 374
    .line 375
    move-object/from16 v19, v3

    .line 376
    .line 377
    const/4 v3, 0x0

    .line 378
    invoke-interface {v1, v0, v3, v12, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    check-cast v2, Ljava/lang/Long;

    .line 383
    .line 384
    or-int/lit8 v8, v8, 0x1

    .line 385
    .line 386
    move-object/from16 v3, v19

    .line 387
    .line 388
    move-object/from16 v12, v22

    .line 389
    .line 390
    :goto_5
    move-object/from16 v13, v23

    .line 391
    .line 392
    move-object/from16 v19, v2

    .line 393
    .line 394
    goto :goto_2

    .line 395
    :pswitch_10
    move-object/from16 v24, v2

    .line 396
    .line 397
    move-object/from16 v22, v12

    .line 398
    .line 399
    move-object/from16 v23, v13

    .line 400
    .line 401
    move-object/from16 v2, v19

    .line 402
    .line 403
    move-object/from16 v13, v20

    .line 404
    .line 405
    move-object/from16 v16, v21

    .line 406
    .line 407
    move-object/from16 v19, v3

    .line 408
    .line 409
    const/4 v3, 0x0

    .line 410
    move/from16 v18, v3

    .line 411
    .line 412
    move-object/from16 v3, v19

    .line 413
    .line 414
    goto :goto_5

    .line 415
    :cond_0
    move-object/from16 v24, v2

    .line 416
    .line 417
    move-object/from16 v22, v12

    .line 418
    .line 419
    move-object/from16 v23, v13

    .line 420
    .line 421
    move-object/from16 v2, v19

    .line 422
    .line 423
    move-object/from16 v13, v20

    .line 424
    .line 425
    move-object/from16 v16, v21

    .line 426
    .line 427
    move-object/from16 v19, v3

    .line 428
    .line 429
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 430
    .line 431
    .line 432
    move-object/from16 v20, v24

    .line 433
    .line 434
    move-object/from16 v24, v11

    .line 435
    .line 436
    move-object/from16 v11, v16

    .line 437
    .line 438
    move-object/from16 v16, v7

    .line 439
    .line 440
    new-instance v7, La/bw0;

    .line 441
    .line 442
    move-object/from16 v12, v23

    .line 443
    .line 444
    move-object/from16 v23, v10

    .line 445
    .line 446
    move-object v10, v13

    .line 447
    move-object v13, v12

    .line 448
    move-object/from16 v18, v4

    .line 449
    .line 450
    move-object/from16 v17, v5

    .line 451
    .line 452
    move-object/from16 v21, v6

    .line 453
    .line 454
    move-object/from16 v12, v22

    .line 455
    .line 456
    move-object/from16 v22, v9

    .line 457
    .line 458
    move-object v9, v2

    .line 459
    invoke-direct/range {v7 .. v24}, La/bw0;-><init>(ILjava/lang/Long;Ljava/lang/Long;La/rx0;Ljava/lang/String;Ljava/util/List;La/lx0;La/ox0;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;La/ex0;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V

    .line 460
    .line 461
    .line 462
    return-object v7

    .line 463
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_10
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
    sget-object p0, La/zv0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 19

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    check-cast v0, La/bw0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/bw0;->p:Ljava/lang/Long;

    .line 9
    .line 10
    iget-object v2, v0, La/bw0;->o:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, v0, La/bw0;->n:Ljava/lang/Boolean;

    .line 13
    .line 14
    iget-object v4, v0, La/bw0;->m:Ljava/lang/Long;

    .line 15
    .line 16
    iget-object v5, v0, La/bw0;->l:La/ex0;

    .line 17
    .line 18
    iget-object v6, v0, La/bw0;->k:Ljava/lang/Boolean;

    .line 19
    .line 20
    iget-object v7, v0, La/bw0;->j:Ljava/lang/Boolean;

    .line 21
    .line 22
    iget-object v8, v0, La/bw0;->i:Ljava/lang/Boolean;

    .line 23
    .line 24
    iget-object v9, v0, La/bw0;->h:Ljava/util/List;

    .line 25
    .line 26
    iget-object v10, v0, La/bw0;->g:La/ox0;

    .line 27
    .line 28
    iget-object v11, v0, La/bw0;->f:La/lx0;

    .line 29
    .line 30
    iget-object v12, v0, La/bw0;->e:Ljava/util/List;

    .line 31
    .line 32
    iget-object v13, v0, La/bw0;->d:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v14, v0, La/bw0;->c:La/rx0;

    .line 35
    .line 36
    iget-object v15, v0, La/bw0;->b:Ljava/lang/Long;

    .line 37
    .line 38
    iget-object v0, v0, La/bw0;->a:Ljava/lang/Long;

    .line 39
    .line 40
    move-object/from16 p0, v1

    .line 41
    .line 42
    sget-object v1, La/zv0;->descriptor:La/ugi0;

    .line 43
    .line 44
    move-object/from16 p2, v2

    .line 45
    .line 46
    move-object/from16 v2, p1

    .line 47
    .line 48
    invoke-interface {v2, v1}, La/bwn;->a(La/ugi0;)La/cld;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sget-object v16, La/bw0;->q:[La/a8z;

    .line 53
    .line 54
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 55
    .line 56
    .line 57
    move-result v17

    .line 58
    if-eqz v17, :cond_0

    .line 59
    .line 60
    :goto_0
    move-object/from16 v17, v3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_0
    if-eqz v0, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :goto_1
    sget-object v3, La/s710;->a:La/s710;

    .line 67
    .line 68
    move-object/from16 v18, v4

    .line 69
    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-interface {v2, v1, v4, v3, v0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_1
    move-object/from16 v17, v3

    .line 76
    .line 77
    move-object/from16 v18, v4

    .line 78
    .line 79
    :goto_2
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_2
    if-eqz v15, :cond_3

    .line 87
    .line 88
    :goto_3
    sget-object v0, La/s710;->a:La/s710;

    .line 89
    .line 90
    const/4 v3, 0x1

    .line 91
    invoke-interface {v2, v1, v3, v0, v15}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_4
    if-eqz v14, :cond_5

    .line 102
    .line 103
    :goto_4
    sget-object v0, La/px0;->a:La/px0;

    .line 104
    .line 105
    const/4 v3, 0x2

    .line 106
    invoke-interface {v2, v1, v3, v0, v14}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_6
    if-eqz v13, :cond_7

    .line 117
    .line 118
    :goto_5
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 119
    .line 120
    const/4 v3, 0x3

    .line 121
    invoke-interface {v2, v1, v3, v0, v13}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_7
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    if-eqz v0, :cond_8

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_8
    if-eqz v12, :cond_9

    .line 132
    .line 133
    :goto_6
    const/4 v0, 0x4

    .line 134
    aget-object v3, v16, v0

    .line 135
    .line 136
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    check-cast v3, La/jiy;

    .line 141
    .line 142
    invoke-interface {v2, v1, v0, v3, v12}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_9
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_a

    .line 150
    .line 151
    goto :goto_7

    .line 152
    :cond_a
    if-eqz v11, :cond_b

    .line 153
    .line 154
    :goto_7
    sget-object v0, La/jx0;->a:La/jx0;

    .line 155
    .line 156
    const/4 v3, 0x5

    .line 157
    invoke-interface {v2, v1, v3, v0, v11}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_b
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    if-eqz v0, :cond_c

    .line 165
    .line 166
    goto :goto_8

    .line 167
    :cond_c
    if-eqz v10, :cond_d

    .line 168
    .line 169
    :goto_8
    sget-object v0, La/mx0;->a:La/mx0;

    .line 170
    .line 171
    const/4 v3, 0x6

    .line 172
    invoke-interface {v2, v1, v3, v0, v10}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    :cond_d
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    if-eqz v0, :cond_e

    .line 180
    .line 181
    goto :goto_9

    .line 182
    :cond_e
    if-eqz v9, :cond_f

    .line 183
    .line 184
    :goto_9
    const/4 v0, 0x7

    .line 185
    aget-object v3, v16, v0

    .line 186
    .line 187
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    check-cast v3, La/jiy;

    .line 192
    .line 193
    invoke-interface {v2, v1, v0, v3, v9}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_f
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_10

    .line 201
    .line 202
    goto :goto_a

    .line 203
    :cond_10
    if-eqz v8, :cond_11

    .line 204
    .line 205
    :goto_a
    sget-object v0, La/sm8;->a:La/sm8;

    .line 206
    .line 207
    const/16 v3, 0x8

    .line 208
    .line 209
    invoke-interface {v2, v1, v3, v0, v8}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_11
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_12

    .line 217
    .line 218
    goto :goto_b

    .line 219
    :cond_12
    if-eqz v7, :cond_13

    .line 220
    .line 221
    :goto_b
    sget-object v0, La/sm8;->a:La/sm8;

    .line 222
    .line 223
    const/16 v3, 0x9

    .line 224
    .line 225
    invoke-interface {v2, v1, v3, v0, v7}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_13
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_14

    .line 233
    .line 234
    goto :goto_c

    .line 235
    :cond_14
    if-eqz v6, :cond_15

    .line 236
    .line 237
    :goto_c
    sget-object v0, La/sm8;->a:La/sm8;

    .line 238
    .line 239
    const/16 v3, 0xa

    .line 240
    .line 241
    invoke-interface {v2, v1, v3, v0, v6}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_15
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_16

    .line 249
    .line 250
    goto :goto_d

    .line 251
    :cond_16
    if-eqz v5, :cond_17

    .line 252
    .line 253
    :goto_d
    sget-object v0, La/cx0;->a:La/cx0;

    .line 254
    .line 255
    const/16 v3, 0xb

    .line 256
    .line 257
    invoke-interface {v2, v1, v3, v0, v5}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_17
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_18

    .line 265
    .line 266
    goto :goto_e

    .line 267
    :cond_18
    if-eqz v18, :cond_19

    .line 268
    .line 269
    :goto_e
    sget-object v0, La/s710;->a:La/s710;

    .line 270
    .line 271
    const/16 v3, 0xc

    .line 272
    .line 273
    move-object/from16 v4, v18

    .line 274
    .line 275
    invoke-interface {v2, v1, v3, v0, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    :cond_19
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_1a

    .line 283
    .line 284
    goto :goto_f

    .line 285
    :cond_1a
    if-eqz v17, :cond_1b

    .line 286
    .line 287
    :goto_f
    sget-object v0, La/sm8;->a:La/sm8;

    .line 288
    .line 289
    const/16 v3, 0xd

    .line 290
    .line 291
    move-object/from16 v4, v17

    .line 292
    .line 293
    invoke-interface {v2, v1, v3, v0, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_1b
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_1c

    .line 301
    .line 302
    goto :goto_10

    .line 303
    :cond_1c
    if-eqz p2, :cond_1d

    .line 304
    .line 305
    :goto_10
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 306
    .line 307
    const/16 v3, 0xe

    .line 308
    .line 309
    move-object/from16 v4, p2

    .line 310
    .line 311
    invoke-interface {v2, v1, v3, v0, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    :cond_1d
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_1e

    .line 319
    .line 320
    goto :goto_11

    .line 321
    :cond_1e
    if-eqz p0, :cond_1f

    .line 322
    .line 323
    :goto_11
    sget-object v0, La/s710;->a:La/s710;

    .line 324
    .line 325
    const/16 v3, 0xf

    .line 326
    .line 327
    move-object/from16 v4, p0

    .line 328
    .line 329
    invoke-interface {v2, v1, v3, v0, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    :cond_1f
    invoke-interface {v2, v1}, La/cld;->c(La/ugi0;)V

    .line 333
    .line 334
    .line 335
    return-void
.end method
