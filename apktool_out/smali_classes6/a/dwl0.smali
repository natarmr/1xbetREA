.class public final synthetic La/dwl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/dwl0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/dwl0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/dwl0;->a:La/dwl0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.ufc.impl.championship.data.stadium.model.StadiumInfoResponse"

    .line 11
    .line 12
    const/16 v3, 0xf

    .line 13
    .line 14
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 15
    .line 16
    .line 17
    const-string v0, "address"

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v0, "name"

    .line 24
    .line 25
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 26
    .line 27
    .line 28
    const-string v0, "capacity"

    .line 29
    .line 30
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    const-string v0, "covering"

    .line 34
    .line 35
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 36
    .line 37
    .line 38
    const-string v0, "city"

    .line 39
    .line 40
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    const-string v0, "architect"

    .line 44
    .line 45
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    const-string v0, "oldName"

    .line 49
    .line 50
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    const-string v0, "category"

    .line 54
    .line 55
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 56
    .line 57
    .line 58
    const-string v0, "history"

    .line 59
    .line 60
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    const-string v0, "opened"

    .line 64
    .line 65
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 66
    .line 67
    .line 68
    const-string v0, "zipCode"

    .line 69
    .line 70
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    const-string v0, "phone"

    .line 74
    .line 75
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 76
    .line 77
    .line 78
    const-string v0, "website"

    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    const-string v0, "images"

    .line 84
    .line 85
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 86
    .line 87
    .line 88
    const-string v0, "countryId"

    .line 89
    .line 90
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    sput-object v1, La/dwl0;->descriptor:La/ugi0;

    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 17

    .line 1
    sget-object v0, La/mwl0;->p:[La/a8z;

    .line 2
    .line 3
    sget-object v1, La/ysm0;->a:La/ysm0;

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
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 42
    .line 43
    .line 44
    move-result-object v11

    .line 45
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 50
    .line 51
    .line 52
    move-result-object v13

    .line 53
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const/16 v14, 0xd

    .line 58
    .line 59
    aget-object v0, v0, v14

    .line 60
    .line 61
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, La/jiy;

    .line 66
    .line 67
    invoke-static {v0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sget-object v15, La/okx;->a:La/okx;

    .line 72
    .line 73
    invoke-static {v15}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 74
    .line 75
    .line 76
    move-result-object v15

    .line 77
    move/from16 p0, v14

    .line 78
    .line 79
    const/16 v14, 0xf

    .line 80
    .line 81
    new-array v14, v14, [La/jiy;

    .line 82
    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    aput-object v2, v14, v16

    .line 86
    .line 87
    const/4 v2, 0x1

    .line 88
    aput-object v3, v14, v2

    .line 89
    .line 90
    const/4 v2, 0x2

    .line 91
    aput-object v4, v14, v2

    .line 92
    .line 93
    const/4 v2, 0x3

    .line 94
    aput-object v5, v14, v2

    .line 95
    .line 96
    const/4 v2, 0x4

    .line 97
    aput-object v6, v14, v2

    .line 98
    .line 99
    const/4 v2, 0x5

    .line 100
    aput-object v7, v14, v2

    .line 101
    .line 102
    const/4 v2, 0x6

    .line 103
    aput-object v8, v14, v2

    .line 104
    .line 105
    const/4 v2, 0x7

    .line 106
    aput-object v9, v14, v2

    .line 107
    .line 108
    const/16 v2, 0x8

    .line 109
    .line 110
    aput-object v10, v14, v2

    .line 111
    .line 112
    const/16 v2, 0x9

    .line 113
    .line 114
    aput-object v11, v14, v2

    .line 115
    .line 116
    const/16 v2, 0xa

    .line 117
    .line 118
    aput-object v12, v14, v2

    .line 119
    .line 120
    const/16 v2, 0xb

    .line 121
    .line 122
    aput-object v13, v14, v2

    .line 123
    .line 124
    const/16 v2, 0xc

    .line 125
    .line 126
    aput-object v1, v14, v2

    .line 127
    .line 128
    aput-object v0, v14, p0

    .line 129
    .line 130
    const/16 v0, 0xe

    .line 131
    .line 132
    aput-object v15, v14, v0

    .line 133
    .line 134
    return-object v14
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 24

    .line 1
    sget-object v0, La/dwl0;->descriptor:La/ugi0;

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
    sget-object v2, La/mwl0;->p:[La/a8z;

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
    :goto_0
    if-eqz v18, :cond_0

    .line 36
    .line 37
    invoke-interface {v1, v0}, La/bld;->f(La/ugi0;)I

    .line 38
    .line 39
    .line 40
    move-result v21

    .line 41
    packed-switch v21, :pswitch_data_0

    .line 42
    .line 43
    .line 44
    invoke-static/range {v21 .. v21}, La/itt0;->c(I)V

    .line 45
    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    move-object/from16 v21, v11

    .line 49
    .line 50
    const/16 v11, 0xe

    .line 51
    .line 52
    move-object/from16 v22, v12

    .line 53
    .line 54
    sget-object v12, La/okx;->a:La/okx;

    .line 55
    .line 56
    invoke-interface {v1, v0, v11, v12, v10}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    check-cast v10, Ljava/lang/Integer;

    .line 61
    .line 62
    or-int/lit16 v8, v8, 0x4000

    .line 63
    .line 64
    :goto_1
    move-object/from16 v11, v21

    .line 65
    .line 66
    move-object/from16 v12, v22

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :pswitch_1
    move-object/from16 v21, v11

    .line 70
    .line 71
    move-object/from16 v22, v12

    .line 72
    .line 73
    const/16 v11, 0xd

    .line 74
    .line 75
    aget-object v12, v17, v11

    .line 76
    .line 77
    invoke-interface {v12}, La/a8z;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    check-cast v12, La/jiy;

    .line 82
    .line 83
    invoke-interface {v1, v0, v11, v12, v9}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    check-cast v9, Ljava/util/List;

    .line 88
    .line 89
    or-int/lit16 v8, v8, 0x2000

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :pswitch_2
    move-object/from16 v21, v11

    .line 93
    .line 94
    move-object/from16 v22, v12

    .line 95
    .line 96
    const/16 v11, 0xc

    .line 97
    .line 98
    sget-object v12, La/ysm0;->a:La/ysm0;

    .line 99
    .line 100
    invoke-interface {v1, v0, v11, v12, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    check-cast v6, Ljava/lang/String;

    .line 105
    .line 106
    or-int/lit16 v8, v8, 0x1000

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_3
    move-object/from16 v21, v11

    .line 110
    .line 111
    move-object/from16 v22, v12

    .line 112
    .line 113
    const/16 v11, 0xb

    .line 114
    .line 115
    sget-object v12, La/ysm0;->a:La/ysm0;

    .line 116
    .line 117
    invoke-interface {v1, v0, v11, v12, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Ljava/lang/String;

    .line 122
    .line 123
    or-int/lit16 v8, v8, 0x800

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :pswitch_4
    move-object/from16 v21, v11

    .line 127
    .line 128
    move-object/from16 v22, v12

    .line 129
    .line 130
    const/16 v11, 0xa

    .line 131
    .line 132
    sget-object v12, La/ysm0;->a:La/ysm0;

    .line 133
    .line 134
    invoke-interface {v1, v0, v11, v12, v3}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    check-cast v3, Ljava/lang/String;

    .line 139
    .line 140
    or-int/lit16 v8, v8, 0x400

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :pswitch_5
    move-object/from16 v21, v11

    .line 144
    .line 145
    move-object/from16 v22, v12

    .line 146
    .line 147
    const/16 v11, 0x9

    .line 148
    .line 149
    sget-object v12, La/ysm0;->a:La/ysm0;

    .line 150
    .line 151
    invoke-interface {v1, v0, v11, v12, v4}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    check-cast v4, Ljava/lang/String;

    .line 156
    .line 157
    or-int/lit16 v8, v8, 0x200

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :pswitch_6
    move-object/from16 v21, v11

    .line 161
    .line 162
    move-object/from16 v22, v12

    .line 163
    .line 164
    sget-object v11, La/ysm0;->a:La/ysm0;

    .line 165
    .line 166
    const/16 v12, 0x8

    .line 167
    .line 168
    invoke-interface {v1, v0, v12, v11, v5}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    check-cast v5, Ljava/lang/String;

    .line 173
    .line 174
    or-int/lit16 v8, v8, 0x100

    .line 175
    .line 176
    goto :goto_1

    .line 177
    :pswitch_7
    move-object/from16 v21, v11

    .line 178
    .line 179
    move-object/from16 v22, v12

    .line 180
    .line 181
    const/4 v11, 0x7

    .line 182
    sget-object v12, La/ysm0;->a:La/ysm0;

    .line 183
    .line 184
    invoke-interface {v1, v0, v11, v12, v7}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v7

    .line 188
    check-cast v7, Ljava/lang/String;

    .line 189
    .line 190
    or-int/lit16 v8, v8, 0x80

    .line 191
    .line 192
    goto/16 :goto_1

    .line 193
    .line 194
    :pswitch_8
    move-object/from16 v21, v11

    .line 195
    .line 196
    move-object/from16 v22, v12

    .line 197
    .line 198
    const/4 v11, 0x6

    .line 199
    sget-object v12, La/ysm0;->a:La/ysm0;

    .line 200
    .line 201
    invoke-interface {v1, v0, v11, v12, v15}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v11

    .line 205
    move-object v15, v11

    .line 206
    check-cast v15, Ljava/lang/String;

    .line 207
    .line 208
    or-int/lit8 v8, v8, 0x40

    .line 209
    .line 210
    goto/16 :goto_1

    .line 211
    .line 212
    :pswitch_9
    move-object/from16 v21, v11

    .line 213
    .line 214
    move-object/from16 v22, v12

    .line 215
    .line 216
    const/4 v11, 0x5

    .line 217
    sget-object v12, La/ysm0;->a:La/ysm0;

    .line 218
    .line 219
    invoke-interface {v1, v0, v11, v12, v14}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v11

    .line 223
    move-object v14, v11

    .line 224
    check-cast v14, Ljava/lang/String;

    .line 225
    .line 226
    or-int/lit8 v8, v8, 0x20

    .line 227
    .line 228
    goto/16 :goto_1

    .line 229
    .line 230
    :pswitch_a
    move-object/from16 v21, v11

    .line 231
    .line 232
    move-object/from16 v22, v12

    .line 233
    .line 234
    sget-object v11, La/ysm0;->a:La/ysm0;

    .line 235
    .line 236
    const/4 v12, 0x4

    .line 237
    invoke-interface {v1, v0, v12, v11, v13}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v11

    .line 241
    move-object v13, v11

    .line 242
    check-cast v13, Ljava/lang/String;

    .line 243
    .line 244
    or-int/lit8 v8, v8, 0x10

    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :pswitch_b
    move-object/from16 v21, v11

    .line 249
    .line 250
    move-object/from16 v22, v12

    .line 251
    .line 252
    const/4 v11, 0x3

    .line 253
    sget-object v12, La/ysm0;->a:La/ysm0;

    .line 254
    .line 255
    move-object/from16 v23, v2

    .line 256
    .line 257
    move-object/from16 v2, v22

    .line 258
    .line 259
    invoke-interface {v1, v0, v11, v12, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    move-object v12, v2

    .line 264
    check-cast v12, Ljava/lang/String;

    .line 265
    .line 266
    or-int/lit8 v8, v8, 0x8

    .line 267
    .line 268
    move-object/from16 v11, v21

    .line 269
    .line 270
    :goto_2
    move-object/from16 v2, v23

    .line 271
    .line 272
    goto/16 :goto_0

    .line 273
    .line 274
    :pswitch_c
    move-object/from16 v23, v2

    .line 275
    .line 276
    move-object/from16 v21, v11

    .line 277
    .line 278
    move-object v2, v12

    .line 279
    sget-object v11, La/ysm0;->a:La/ysm0;

    .line 280
    .line 281
    const/4 v12, 0x2

    .line 282
    move-object/from16 v22, v2

    .line 283
    .line 284
    move-object/from16 v2, v21

    .line 285
    .line 286
    invoke-interface {v1, v0, v12, v11, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    move-object v11, v2

    .line 291
    check-cast v11, Ljava/lang/String;

    .line 292
    .line 293
    or-int/lit8 v8, v8, 0x4

    .line 294
    .line 295
    :goto_3
    move-object/from16 v12, v22

    .line 296
    .line 297
    goto :goto_2

    .line 298
    :pswitch_d
    move-object/from16 v23, v2

    .line 299
    .line 300
    move-object v2, v11

    .line 301
    move-object/from16 v22, v12

    .line 302
    .line 303
    sget-object v11, La/ysm0;->a:La/ysm0;

    .line 304
    .line 305
    move-object/from16 v21, v2

    .line 306
    .line 307
    move-object/from16 v12, v20

    .line 308
    .line 309
    const/4 v2, 0x1

    .line 310
    invoke-interface {v1, v0, v2, v11, v12}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v11

    .line 314
    move-object/from16 v20, v11

    .line 315
    .line 316
    check-cast v20, Ljava/lang/String;

    .line 317
    .line 318
    or-int/lit8 v8, v8, 0x2

    .line 319
    .line 320
    move-object/from16 v11, v21

    .line 321
    .line 322
    goto :goto_3

    .line 323
    :pswitch_e
    move-object/from16 v23, v2

    .line 324
    .line 325
    move-object/from16 v21, v11

    .line 326
    .line 327
    move-object/from16 v22, v12

    .line 328
    .line 329
    move-object/from16 v12, v20

    .line 330
    .line 331
    const/4 v2, 0x1

    .line 332
    sget-object v11, La/ysm0;->a:La/ysm0;

    .line 333
    .line 334
    move-object/from16 v2, v19

    .line 335
    .line 336
    move-object/from16 v19, v3

    .line 337
    .line 338
    const/4 v3, 0x0

    .line 339
    invoke-interface {v1, v0, v3, v11, v2}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    check-cast v2, Ljava/lang/String;

    .line 344
    .line 345
    or-int/lit8 v8, v8, 0x1

    .line 346
    .line 347
    move-object/from16 v3, v19

    .line 348
    .line 349
    move-object/from16 v11, v21

    .line 350
    .line 351
    :goto_4
    move-object/from16 v12, v22

    .line 352
    .line 353
    move-object/from16 v19, v2

    .line 354
    .line 355
    goto :goto_2

    .line 356
    :pswitch_f
    move-object/from16 v23, v2

    .line 357
    .line 358
    move-object/from16 v21, v11

    .line 359
    .line 360
    move-object/from16 v22, v12

    .line 361
    .line 362
    move-object/from16 v2, v19

    .line 363
    .line 364
    move-object/from16 v12, v20

    .line 365
    .line 366
    move-object/from16 v19, v3

    .line 367
    .line 368
    const/4 v3, 0x0

    .line 369
    move/from16 v18, v3

    .line 370
    .line 371
    move-object/from16 v3, v19

    .line 372
    .line 373
    goto :goto_4

    .line 374
    :cond_0
    move-object/from16 v23, v2

    .line 375
    .line 376
    move-object/from16 v21, v11

    .line 377
    .line 378
    move-object/from16 v22, v12

    .line 379
    .line 380
    move-object/from16 v2, v19

    .line 381
    .line 382
    move-object/from16 v12, v20

    .line 383
    .line 384
    move-object/from16 v19, v3

    .line 385
    .line 386
    invoke-interface {v1, v0}, La/bld;->c(La/ugi0;)V

    .line 387
    .line 388
    .line 389
    move-object/from16 v16, v7

    .line 390
    .line 391
    new-instance v7, La/mwl0;

    .line 392
    .line 393
    move-object/from16 v18, v4

    .line 394
    .line 395
    move-object/from16 v17, v5

    .line 396
    .line 397
    move-object/from16 v20, v23

    .line 398
    .line 399
    move-object/from16 v21, v6

    .line 400
    .line 401
    move-object/from16 v23, v10

    .line 402
    .line 403
    move-object v10, v12

    .line 404
    move-object/from16 v12, v22

    .line 405
    .line 406
    move-object/from16 v22, v9

    .line 407
    .line 408
    move-object v9, v2

    .line 409
    invoke-direct/range {v7 .. v23}, La/mwl0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V

    .line 410
    .line 411
    .line 412
    return-object v7

    .line 413
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
    sget-object p0, La/dwl0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 18

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    check-cast v0, La/mwl0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/mwl0;->o:Ljava/lang/Integer;

    .line 9
    .line 10
    iget-object v2, v0, La/mwl0;->n:Ljava/util/List;

    .line 11
    .line 12
    iget-object v3, v0, La/mwl0;->m:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v4, v0, La/mwl0;->l:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v5, v0, La/mwl0;->k:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v6, v0, La/mwl0;->j:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v7, v0, La/mwl0;->i:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v8, v0, La/mwl0;->h:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v9, v0, La/mwl0;->g:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v10, v0, La/mwl0;->f:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v11, v0, La/mwl0;->e:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v12, v0, La/mwl0;->d:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v13, v0, La/mwl0;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v14, v0, La/mwl0;->b:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v0, v0, La/mwl0;->a:Ljava/lang/String;

    .line 37
    .line 38
    sget-object v15, La/dwl0;->descriptor:La/ugi0;

    .line 39
    .line 40
    move-object/from16 p0, v1

    .line 41
    .line 42
    move-object/from16 v1, p1

    .line 43
    .line 44
    invoke-interface {v1, v15}, La/bwn;->a(La/ugi0;)La/cld;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    sget-object v16, La/mwl0;->p:[La/a8z;

    .line 49
    .line 50
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 51
    .line 52
    .line 53
    move-result v17

    .line 54
    if-eqz v17, :cond_0

    .line 55
    .line 56
    :goto_0
    move-object/from16 v17, v2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    if-eqz v0, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :goto_1
    sget-object v2, La/ysm0;->a:La/ysm0;

    .line 63
    .line 64
    move-object/from16 p2, v3

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-interface {v1, v15, v3, v2, v0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_1
    move-object/from16 v17, v2

    .line 72
    .line 73
    move-object/from16 p2, v3

    .line 74
    .line 75
    :goto_2
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_2
    if-eqz v14, :cond_3

    .line 83
    .line 84
    :goto_3
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 85
    .line 86
    const/4 v2, 0x1

    .line 87
    invoke-interface {v1, v15, v2, v0, v14}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    :cond_3
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_4

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_4
    if-eqz v13, :cond_5

    .line 98
    .line 99
    :goto_4
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 100
    .line 101
    const/4 v2, 0x2

    .line 102
    invoke-interface {v1, v15, v2, v0, v13}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_6
    if-eqz v12, :cond_7

    .line 113
    .line 114
    :goto_5
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 115
    .line 116
    const/4 v2, 0x3

    .line 117
    invoke-interface {v1, v15, v2, v0, v12}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_7
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_8

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_8
    if-eqz v11, :cond_9

    .line 128
    .line 129
    :goto_6
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 130
    .line 131
    const/4 v2, 0x4

    .line 132
    invoke-interface {v1, v15, v2, v0, v11}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_9
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_a

    .line 140
    .line 141
    goto :goto_7

    .line 142
    :cond_a
    if-eqz v10, :cond_b

    .line 143
    .line 144
    :goto_7
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 145
    .line 146
    const/4 v2, 0x5

    .line 147
    invoke-interface {v1, v15, v2, v0, v10}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_b
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    if-eqz v0, :cond_c

    .line 155
    .line 156
    goto :goto_8

    .line 157
    :cond_c
    if-eqz v9, :cond_d

    .line 158
    .line 159
    :goto_8
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 160
    .line 161
    const/4 v2, 0x6

    .line 162
    invoke-interface {v1, v15, v2, v0, v9}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_d
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_e

    .line 170
    .line 171
    goto :goto_9

    .line 172
    :cond_e
    if-eqz v8, :cond_f

    .line 173
    .line 174
    :goto_9
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 175
    .line 176
    const/4 v2, 0x7

    .line 177
    invoke-interface {v1, v15, v2, v0, v8}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 178
    .line 179
    .line 180
    :cond_f
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    if-eqz v0, :cond_10

    .line 185
    .line 186
    goto :goto_a

    .line 187
    :cond_10
    if-eqz v7, :cond_11

    .line 188
    .line 189
    :goto_a
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 190
    .line 191
    const/16 v2, 0x8

    .line 192
    .line 193
    invoke-interface {v1, v15, v2, v0, v7}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_11
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eqz v0, :cond_12

    .line 201
    .line 202
    goto :goto_b

    .line 203
    :cond_12
    if-eqz v6, :cond_13

    .line 204
    .line 205
    :goto_b
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 206
    .line 207
    const/16 v2, 0x9

    .line 208
    .line 209
    invoke-interface {v1, v15, v2, v0, v6}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_13
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-eqz v0, :cond_14

    .line 217
    .line 218
    goto :goto_c

    .line 219
    :cond_14
    if-eqz v5, :cond_15

    .line 220
    .line 221
    :goto_c
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 222
    .line 223
    const/16 v2, 0xa

    .line 224
    .line 225
    invoke-interface {v1, v15, v2, v0, v5}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    :cond_15
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-eqz v0, :cond_16

    .line 233
    .line 234
    goto :goto_d

    .line 235
    :cond_16
    if-eqz v4, :cond_17

    .line 236
    .line 237
    :goto_d
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 238
    .line 239
    const/16 v2, 0xb

    .line 240
    .line 241
    invoke-interface {v1, v15, v2, v0, v4}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    :cond_17
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_18

    .line 249
    .line 250
    goto :goto_e

    .line 251
    :cond_18
    if-eqz p2, :cond_19

    .line 252
    .line 253
    :goto_e
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 254
    .line 255
    const/16 v2, 0xc

    .line 256
    .line 257
    move-object/from16 v3, p2

    .line 258
    .line 259
    invoke-interface {v1, v15, v2, v0, v3}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_19
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_1a

    .line 267
    .line 268
    goto :goto_f

    .line 269
    :cond_1a
    if-eqz v17, :cond_1b

    .line 270
    .line 271
    :goto_f
    const/16 v0, 0xd

    .line 272
    .line 273
    aget-object v2, v16, v0

    .line 274
    .line 275
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    check-cast v2, La/jiy;

    .line 280
    .line 281
    move-object/from16 v3, v17

    .line 282
    .line 283
    invoke-interface {v1, v15, v0, v2, v3}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_1b
    invoke-interface {v1, v15}, La/cld;->u(La/ugi0;)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-eqz v0, :cond_1c

    .line 291
    .line 292
    goto :goto_10

    .line 293
    :cond_1c
    if-eqz p0, :cond_1d

    .line 294
    .line 295
    :goto_10
    sget-object v0, La/okx;->a:La/okx;

    .line 296
    .line 297
    const/16 v2, 0xe

    .line 298
    .line 299
    move-object/from16 v3, p0

    .line 300
    .line 301
    invoke-interface {v1, v15, v2, v0, v3}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    :cond_1d
    invoke-interface {v1, v15}, La/cld;->c(La/ugi0;)V

    .line 305
    .line 306
    .line 307
    return-void
.end method
