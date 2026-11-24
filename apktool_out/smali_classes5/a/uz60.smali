.class public final synthetic La/uz60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/uz60;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/uz60;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/uz60;->a:La/uz60;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.onexuser.domain.entity.onexgame.OneXGamesPreviewResponse.GamePreview"

    .line 11
    .line 12
    const/16 v3, 0x10

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "gameType"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "gameNameTranslateId"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "gameFlag"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "gameCashBack"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "bonusEnabled"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "bonusAccEnabled"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "clientData"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "categories"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "maxWinCoeff"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "bonusFromAddAcc"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "isDemoAvailable"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "forceIFrame"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "underMaintenance"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "fullScreen"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "route"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    const-string v0, "oldRoute"

    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 96
    .line 97
    .line 98
    sput-object v1, La/uz60;->descriptor:La/ugi0;

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 18

    .line 1
    sget-object v0, La/wz60;->q:[La/a8z;

    .line 2
    .line 3
    sget-object v1, La/okx;->a:La/okx;

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
    move-result-object v1

    .line 13
    sget-object v3, La/ics;->a:La/ics;

    .line 14
    .line 15
    invoke-static {v3}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    sget-object v4, La/sm8;->a:La/sm8;

    .line 20
    .line 21
    invoke-static {v4}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-static {v4}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-static {v4}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    sget-object v8, La/ysm0;->a:La/ysm0;

    .line 34
    .line 35
    invoke-static {v8}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    const/4 v10, 0x7

    .line 40
    aget-object v0, v0, v10

    .line 41
    .line 42
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/jiy;

    .line 47
    .line 48
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget-object v11, La/tbl;->a:La/tbl;

    .line 53
    .line 54
    invoke-static {v11}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 55
    .line 56
    .line 57
    move-result-object v11

    .line 58
    invoke-static {v4}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 59
    .line 60
    .line 61
    move-result-object v12

    .line 62
    invoke-static {v4}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 63
    .line 64
    .line 65
    move-result-object v13

    .line 66
    invoke-static {v4}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 67
    .line 68
    .line 69
    move-result-object v14

    .line 70
    invoke-static {v4}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 71
    .line 72
    .line 73
    move-result-object v15

    .line 74
    invoke-static {v4}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-static {v8}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 79
    .line 80
    .line 81
    move-result-object v16

    .line 82
    invoke-static {v8}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    move/from16 p0, v10

    .line 87
    .line 88
    const/16 v10, 0x10

    .line 89
    .line 90
    new-array v10, v10, [La/jiy;

    .line 91
    .line 92
    const/16 v17, 0x0

    .line 93
    .line 94
    aput-object v2, v10, v17

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    aput-object v1, v10, v2

    .line 98
    .line 99
    const/4 v1, 0x2

    .line 100
    aput-object v3, v10, v1

    .line 101
    .line 102
    const/4 v1, 0x3

    .line 103
    aput-object v5, v10, v1

    .line 104
    .line 105
    const/4 v1, 0x4

    .line 106
    aput-object v6, v10, v1

    .line 107
    .line 108
    const/4 v1, 0x5

    .line 109
    aput-object v7, v10, v1

    .line 110
    .line 111
    const/4 v1, 0x6

    .line 112
    aput-object v9, v10, v1

    .line 113
    .line 114
    aput-object v0, v10, p0

    .line 115
    .line 116
    const/16 v0, 0x8

    .line 117
    .line 118
    aput-object v11, v10, v0

    .line 119
    .line 120
    const/16 v0, 0x9

    .line 121
    .line 122
    aput-object v12, v10, v0

    .line 123
    .line 124
    const/16 v0, 0xa

    .line 125
    .line 126
    aput-object v13, v10, v0

    .line 127
    .line 128
    const/16 v0, 0xb

    .line 129
    .line 130
    aput-object v14, v10, v0

    .line 131
    .line 132
    const/16 v0, 0xc

    .line 133
    .line 134
    aput-object v15, v10, v0

    .line 135
    .line 136
    const/16 v0, 0xd

    .line 137
    .line 138
    aput-object v4, v10, v0

    .line 139
    .line 140
    const/16 v0, 0xe

    .line 141
    .line 142
    aput-object v16, v10, v0

    .line 143
    .line 144
    const/16 v0, 0xf

    .line 145
    .line 146
    aput-object v8, v10, v0

    .line 147
    .line 148
    return-object v10
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 25

    .line 1
    sget-object v0, La/uz60;->descriptor:La/ugi0;

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
    sget-object v2, La/wz60;->q:[La/a8z;

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
    sget-object v13, La/ysm0;->a:La/ysm0;

    .line 57
    .line 58
    invoke-interface {v1, v0, v12, v13, v11}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v11

    .line 62
    check-cast v11, Ljava/lang/String;

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
    sget-object v13, La/sm8;->a:La/sm8;

    .line 114
    .line 115
    invoke-interface {v1, v0, v12, v13, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    check-cast v6, Ljava/lang/Boolean;

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
    sget-object v13, La/sm8;->a:La/sm8;

    .line 131
    .line 132
    invoke-interface {v1, v0, v12, v13, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Ljava/lang/Boolean;

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
    sget-object v12, La/tbl;->a:La/tbl;

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
    check-cast v5, Ljava/lang/Double;

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
    sget-object v13, La/ysm0;->a:La/ysm0;

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
    check-cast v15, Ljava/lang/String;

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
    sget-object v13, La/sm8;->a:La/sm8;

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
    check-cast v14, Ljava/lang/Boolean;

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
    sget-object v12, La/sm8;->a:La/sm8;

    .line 256
    .line 257
    const/4 v13, 0x4

    .line 258
    move-object/from16 v24, v2

    .line 259
    .line 260
    move-object/from16 v2, v23

    .line 261
    .line 262
    invoke-interface {v1, v0, v13, v12, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    move-object v13, v2

    .line 267
    check-cast v13, Ljava/lang/Boolean;

    .line 268
    .line 269
    or-int/lit8 v8, v8, 0x10

    .line 270
    .line 271
    move-object/from16 v12, v22

    .line 272
    .line 273
    :goto_2
    move-object/from16 v2, v24

    .line 274
    .line 275
    goto/16 :goto_0

    .line 276
    .line 277
    :pswitch_c
    move-object/from16 v24, v2

    .line 278
    .line 279
    move-object/from16 v22, v12

    .line 280
    .line 281
    move-object v2, v13

    .line 282
    const/4 v12, 0x3

    .line 283
    sget-object v13, La/sm8;->a:La/sm8;

    .line 284
    .line 285
    move-object/from16 v23, v2

    .line 286
    .line 287
    move-object/from16 v2, v22

    .line 288
    .line 289
    invoke-interface {v1, v0, v12, v13, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    move-object v12, v2

    .line 294
    check-cast v12, Ljava/lang/Boolean;

    .line 295
    .line 296
    or-int/lit8 v8, v8, 0x8

    .line 297
    .line 298
    :goto_3
    move-object/from16 v13, v23

    .line 299
    .line 300
    goto :goto_2

    .line 301
    :pswitch_d
    move-object/from16 v24, v2

    .line 302
    .line 303
    move-object v2, v12

    .line 304
    move-object/from16 v23, v13

    .line 305
    .line 306
    sget-object v12, La/ics;->a:La/ics;

    .line 307
    .line 308
    const/4 v13, 0x2

    .line 309
    move-object/from16 v22, v2

    .line 310
    .line 311
    move-object/from16 v2, v21

    .line 312
    .line 313
    invoke-interface {v1, v0, v13, v12, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    move-object/from16 v21, v2

    .line 318
    .line 319
    check-cast v21, La/hcs;

    .line 320
    .line 321
    or-int/lit8 v8, v8, 0x4

    .line 322
    .line 323
    :goto_4
    move-object/from16 v12, v22

    .line 324
    .line 325
    goto :goto_3

    .line 326
    :pswitch_e
    move-object/from16 v24, v2

    .line 327
    .line 328
    move-object/from16 v22, v12

    .line 329
    .line 330
    move-object/from16 v23, v13

    .line 331
    .line 332
    move-object/from16 v2, v21

    .line 333
    .line 334
    sget-object v12, La/okx;->a:La/okx;

    .line 335
    .line 336
    move-object/from16 v16, v2

    .line 337
    .line 338
    move-object/from16 v13, v20

    .line 339
    .line 340
    const/4 v2, 0x1

    .line 341
    invoke-interface {v1, v0, v2, v12, v13}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v12

    .line 345
    move-object/from16 v20, v12

    .line 346
    .line 347
    check-cast v20, Ljava/lang/Integer;

    .line 348
    .line 349
    or-int/lit8 v8, v8, 0x2

    .line 350
    .line 351
    move-object/from16 v21, v16

    .line 352
    .line 353
    goto :goto_4

    .line 354
    :pswitch_f
    move-object/from16 v24, v2

    .line 355
    .line 356
    move-object/from16 v22, v12

    .line 357
    .line 358
    move-object/from16 v23, v13

    .line 359
    .line 360
    move-object/from16 v13, v20

    .line 361
    .line 362
    move-object/from16 v16, v21

    .line 363
    .line 364
    const/4 v2, 0x1

    .line 365
    sget-object v12, La/okx;->a:La/okx;

    .line 366
    .line 367
    move-object/from16 v2, v19

    .line 368
    .line 369
    move-object/from16 v19, v3

    .line 370
    .line 371
    const/4 v3, 0x0

    .line 372
    invoke-interface {v1, v0, v3, v12, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    check-cast v2, Ljava/lang/Integer;

    .line 377
    .line 378
    or-int/lit8 v8, v8, 0x1

    .line 379
    .line 380
    move-object/from16 v3, v19

    .line 381
    .line 382
    move-object/from16 v12, v22

    .line 383
    .line 384
    :goto_5
    move-object/from16 v13, v23

    .line 385
    .line 386
    move-object/from16 v19, v2

    .line 387
    .line 388
    goto :goto_2

    .line 389
    :pswitch_10
    move-object/from16 v24, v2

    .line 390
    .line 391
    move-object/from16 v22, v12

    .line 392
    .line 393
    move-object/from16 v23, v13

    .line 394
    .line 395
    move-object/from16 v2, v19

    .line 396
    .line 397
    move-object/from16 v13, v20

    .line 398
    .line 399
    move-object/from16 v16, v21

    .line 400
    .line 401
    move-object/from16 v19, v3

    .line 402
    .line 403
    const/4 v3, 0x0

    .line 404
    move/from16 v18, v3

    .line 405
    .line 406
    move-object/from16 v3, v19

    .line 407
    .line 408
    goto :goto_5

    .line 409
    :cond_0
    move-object/from16 v24, v2

    .line 410
    .line 411
    move-object/from16 v22, v12

    .line 412
    .line 413
    move-object/from16 v23, v13

    .line 414
    .line 415
    move-object/from16 v2, v19

    .line 416
    .line 417
    move-object/from16 v13, v20

    .line 418
    .line 419
    move-object/from16 v16, v21

    .line 420
    .line 421
    move-object/from16 v19, v3

    .line 422
    .line 423
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 424
    .line 425
    .line 426
    move-object/from16 v20, v24

    .line 427
    .line 428
    move-object/from16 v24, v11

    .line 429
    .line 430
    move-object/from16 v11, v16

    .line 431
    .line 432
    move-object/from16 v16, v7

    .line 433
    .line 434
    new-instance v7, La/wz60;

    .line 435
    .line 436
    move-object/from16 v12, v23

    .line 437
    .line 438
    move-object/from16 v23, v10

    .line 439
    .line 440
    move-object v10, v13

    .line 441
    move-object v13, v12

    .line 442
    move-object/from16 v18, v4

    .line 443
    .line 444
    move-object/from16 v17, v5

    .line 445
    .line 446
    move-object/from16 v21, v6

    .line 447
    .line 448
    move-object/from16 v12, v22

    .line 449
    .line 450
    move-object/from16 v22, v9

    .line 451
    .line 452
    move-object v9, v2

    .line 453
    invoke-direct/range {v7 .. v24}, La/wz60;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;La/hcs;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V

    .line 454
    .line 455
    .line 456
    return-object v7

    .line 457
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
    sget-object p0, La/uz60;->descriptor:La/ugi0;

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
    check-cast v0, La/wz60;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/wz60;->p:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v2, v0, La/wz60;->o:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, v0, La/wz60;->n:Ljava/lang/Boolean;

    .line 13
    .line 14
    iget-object v4, v0, La/wz60;->m:Ljava/lang/Boolean;

    .line 15
    .line 16
    iget-object v5, v0, La/wz60;->l:Ljava/lang/Boolean;

    .line 17
    .line 18
    iget-object v6, v0, La/wz60;->k:Ljava/lang/Boolean;

    .line 19
    .line 20
    iget-object v7, v0, La/wz60;->j:Ljava/lang/Boolean;

    .line 21
    .line 22
    iget-object v8, v0, La/wz60;->i:Ljava/lang/Double;

    .line 23
    .line 24
    iget-object v9, v0, La/wz60;->h:Ljava/util/List;

    .line 25
    .line 26
    iget-object v10, v0, La/wz60;->g:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v11, v0, La/wz60;->f:Ljava/lang/Boolean;

    .line 29
    .line 30
    iget-object v12, v0, La/wz60;->e:Ljava/lang/Boolean;

    .line 31
    .line 32
    iget-object v13, v0, La/wz60;->d:Ljava/lang/Boolean;

    .line 33
    .line 34
    iget-object v14, v0, La/wz60;->c:La/hcs;

    .line 35
    .line 36
    iget-object v15, v0, La/wz60;->b:Ljava/lang/Integer;

    .line 37
    .line 38
    iget-object v0, v0, La/wz60;->a:Ljava/lang/Integer;

    .line 39
    .line 40
    move-object/from16 p0, v1

    .line 41
    .line 42
    sget-object v1, La/uz60;->descriptor:La/ugi0;

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
    sget-object v16, La/wz60;->q:[La/a8z;

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
    sget-object v3, La/okx;->a:La/okx;

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
    sget-object v0, La/okx;->a:La/okx;

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
    sget-object v0, La/ics;->a:La/ics;

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
    sget-object v0, La/sm8;->a:La/sm8;

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
    sget-object v0, La/sm8;->a:La/sm8;

    .line 134
    .line 135
    const/4 v3, 0x4

    .line 136
    invoke-interface {v2, v1, v3, v0, v12}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :cond_9
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_a

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_a
    if-eqz v11, :cond_b

    .line 147
    .line 148
    :goto_7
    sget-object v0, La/sm8;->a:La/sm8;

    .line 149
    .line 150
    const/4 v3, 0x5

    .line 151
    invoke-interface {v2, v1, v3, v0, v11}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_b
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_c

    .line 159
    .line 160
    goto :goto_8

    .line 161
    :cond_c
    if-eqz v10, :cond_d

    .line 162
    .line 163
    :goto_8
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 164
    .line 165
    const/4 v3, 0x6

    .line 166
    invoke-interface {v2, v1, v3, v0, v10}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    :cond_d
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-eqz v0, :cond_e

    .line 174
    .line 175
    goto :goto_9

    .line 176
    :cond_e
    if-eqz v9, :cond_f

    .line 177
    .line 178
    :goto_9
    const/4 v0, 0x7

    .line 179
    aget-object v3, v16, v0

    .line 180
    .line 181
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    check-cast v3, La/jiy;

    .line 186
    .line 187
    invoke-interface {v2, v1, v0, v3, v9}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_f
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_10

    .line 195
    .line 196
    goto :goto_a

    .line 197
    :cond_10
    if-eqz v8, :cond_11

    .line 198
    .line 199
    :goto_a
    sget-object v0, La/tbl;->a:La/tbl;

    .line 200
    .line 201
    const/16 v3, 0x8

    .line 202
    .line 203
    invoke-interface {v2, v1, v3, v0, v8}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_11
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-eqz v0, :cond_12

    .line 211
    .line 212
    goto :goto_b

    .line 213
    :cond_12
    if-eqz v7, :cond_13

    .line 214
    .line 215
    :goto_b
    sget-object v0, La/sm8;->a:La/sm8;

    .line 216
    .line 217
    const/16 v3, 0x9

    .line 218
    .line 219
    invoke-interface {v2, v1, v3, v0, v7}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    :cond_13
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_14

    .line 227
    .line 228
    goto :goto_c

    .line 229
    :cond_14
    if-eqz v6, :cond_15

    .line 230
    .line 231
    :goto_c
    sget-object v0, La/sm8;->a:La/sm8;

    .line 232
    .line 233
    const/16 v3, 0xa

    .line 234
    .line 235
    invoke-interface {v2, v1, v3, v0, v6}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_15
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    if-eqz v0, :cond_16

    .line 243
    .line 244
    goto :goto_d

    .line 245
    :cond_16
    if-eqz v5, :cond_17

    .line 246
    .line 247
    :goto_d
    sget-object v0, La/sm8;->a:La/sm8;

    .line 248
    .line 249
    const/16 v3, 0xb

    .line 250
    .line 251
    invoke-interface {v2, v1, v3, v0, v5}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 252
    .line 253
    .line 254
    :cond_17
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_18

    .line 259
    .line 260
    goto :goto_e

    .line 261
    :cond_18
    if-eqz v18, :cond_19

    .line 262
    .line 263
    :goto_e
    sget-object v0, La/sm8;->a:La/sm8;

    .line 264
    .line 265
    const/16 v3, 0xc

    .line 266
    .line 267
    move-object/from16 v4, v18

    .line 268
    .line 269
    invoke-interface {v2, v1, v3, v0, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    :cond_19
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_1a

    .line 277
    .line 278
    goto :goto_f

    .line 279
    :cond_1a
    if-eqz v17, :cond_1b

    .line 280
    .line 281
    :goto_f
    sget-object v0, La/sm8;->a:La/sm8;

    .line 282
    .line 283
    const/16 v3, 0xd

    .line 284
    .line 285
    move-object/from16 v4, v17

    .line 286
    .line 287
    invoke-interface {v2, v1, v3, v0, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    :cond_1b
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    if-eqz v0, :cond_1c

    .line 295
    .line 296
    goto :goto_10

    .line 297
    :cond_1c
    if-eqz p2, :cond_1d

    .line 298
    .line 299
    :goto_10
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 300
    .line 301
    const/16 v3, 0xe

    .line 302
    .line 303
    move-object/from16 v4, p2

    .line 304
    .line 305
    invoke-interface {v2, v1, v3, v0, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 306
    .line 307
    .line 308
    :cond_1d
    invoke-interface {v2, v1}, La/cld;->u(La/ugi0;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_1e

    .line 313
    .line 314
    goto :goto_11

    .line 315
    :cond_1e
    if-eqz p0, :cond_1f

    .line 316
    .line 317
    :goto_11
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 318
    .line 319
    const/16 v3, 0xf

    .line 320
    .line 321
    move-object/from16 v4, p0

    .line 322
    .line 323
    invoke-interface {v2, v1, v3, v0, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    :cond_1f
    invoke-interface {v2, v1}, La/cld;->c(La/ugi0;)V

    .line 327
    .line 328
    .line 329
    return-void
.end method
