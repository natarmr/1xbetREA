.class public abstract La/z6t0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;

.field public static final b:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, La/c860;->b:La/c860;

    .line 2
    .line 3
    sget-object v1, La/c860;->c:La/c860;

    .line 4
    .line 5
    sget-object v2, La/c860;->d:La/c860;

    .line 6
    .line 7
    sget-object v3, La/c860;->e:La/c860;

    .line 8
    .line 9
    sget-object v4, La/c860;->f:La/c860;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [La/c860;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, La/z6t0;->a:Ljava/util/List;

    .line 20
    .line 21
    sget-object v0, La/q760;->b:La/q760;

    .line 22
    .line 23
    sget-object v1, La/q760;->c:La/q760;

    .line 24
    .line 25
    sget-object v2, La/q760;->d:La/q760;

    .line 26
    .line 27
    sget-object v3, La/q760;->e:La/q760;

    .line 28
    .line 29
    filled-new-array {v0, v1, v2, v3}, [La/q760;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, La/z6t0;->b:Ljava/util/List;

    .line 38
    .line 39
    return-void
.end method

.method public static final a(Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;La/ctf0;)La/y6t0;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    sget-object v3, La/z6t0;->a:Ljava/util/List;

    .line 14
    .line 15
    const/16 v4, 0xa

    .line 16
    .line 17
    invoke-static {v3, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    const/4 v6, 0x1

    .line 33
    const/4 v7, 0x0

    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    check-cast v5, La/c860;

    .line 41
    .line 42
    iget-object v8, v0, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;->a:La/c860;

    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    if-ne v5, v8, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    move v6, v7

    .line 54
    :goto_1
    new-instance v8, La/e860;

    .line 55
    .line 56
    new-instance v9, La/lxl;

    .line 57
    .line 58
    new-instance v12, La/xxl;

    .line 59
    .line 60
    invoke-virtual {v5}, La/c860;->a()I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    new-array v11, v7, [Ljava/lang/Object;

    .line 65
    .line 66
    iget-object v13, v1, La/ctf0;->b:La/lsm0;

    .line 67
    .line 68
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    invoke-virtual {v13, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-direct {v12, v7}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    if-eqz v6, :cond_1

    .line 80
    .line 81
    sget-object v7, La/uxl;->b:La/uxl;

    .line 82
    .line 83
    :goto_2
    move-object v14, v7

    .line 84
    goto :goto_3

    .line 85
    :cond_1
    sget-object v7, La/uxl;->a:La/uxl;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :goto_3
    const/4 v15, 0x0

    .line 89
    const/16 v16, 0x6c

    .line 90
    .line 91
    const-wide/16 v10, 0x1

    .line 92
    .line 93
    const/4 v13, 0x0

    .line 94
    invoke-direct/range {v9 .. v16}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v8, v5, v9, v6}, La/e860;-><init>(La/c860;La/lxl;Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    new-instance v3, Ljava/util/ArrayList;

    .line 109
    .line 110
    sget-object v5, La/z6t0;->b:Ljava/util/List;

    .line 111
    .line 112
    invoke-static {v5, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 117
    .line 118
    .line 119
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-eqz v5, :cond_8

    .line 128
    .line 129
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    check-cast v5, La/q760;

    .line 134
    .line 135
    iget-object v8, v0, Lorg/xplatform/authenticator/impl/ui/dialogs/authenticator_filter/AuthenticatorFilterViewModel$ViewModelState;->b:Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v9, v8, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;->a:La/q760;

    .line 144
    .line 145
    iget-object v10, v8, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;->b:Ljava/lang/String;

    .line 146
    .line 147
    if-ne v5, v9, :cond_3

    .line 148
    .line 149
    move v11, v6

    .line 150
    goto :goto_5

    .line 151
    :cond_3
    move v11, v7

    .line 152
    :goto_5
    sget-object v12, La/q760;->e:La/q760;

    .line 153
    .line 154
    if-eq v5, v12, :cond_4

    .line 155
    .line 156
    new-instance v8, La/xxl;

    .line 157
    .line 158
    invoke-virtual {v5}, La/q760;->a()I

    .line 159
    .line 160
    .line 161
    move-result v9

    .line 162
    new-array v10, v7, [Ljava/lang/Object;

    .line 163
    .line 164
    iget-object v12, v1, La/ctf0;->b:La/lsm0;

    .line 165
    .line 166
    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    invoke-virtual {v12, v9, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    invoke-direct {v8, v9}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    move-object/from16 v16, v8

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_4
    new-instance v13, La/byl;

    .line 181
    .line 182
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v14

    .line 186
    if-lez v14, :cond_5

    .line 187
    .line 188
    if-ne v9, v12, :cond_5

    .line 189
    .line 190
    iget-wide v14, v8, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;->d:J

    .line 191
    .line 192
    const-wide/16 v16, 0x0

    .line 193
    .line 194
    cmp-long v9, v14, v16

    .line 195
    .line 196
    if-nez v9, :cond_6

    .line 197
    .line 198
    iget-wide v8, v8, Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;->c:J

    .line 199
    .line 200
    cmp-long v8, v8, v16

    .line 201
    .line 202
    if-eqz v8, :cond_5

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_5
    invoke-virtual {v12}, La/q760;->a()I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    new-array v9, v7, [Ljava/lang/Object;

    .line 210
    .line 211
    iget-object v10, v1, La/ctf0;->b:La/lsm0;

    .line 212
    .line 213
    invoke-static {v9, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    invoke-virtual {v10, v8, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    :cond_6
    :goto_6
    new-instance v14, La/m0x;

    .line 222
    .line 223
    const/4 v8, 0x0

    .line 224
    const/4 v9, 0x6

    .line 225
    const v12, 0x7f08081b

    .line 226
    .line 227
    .line 228
    invoke-direct {v14, v12, v8, v9}, La/m0x;-><init>(ILa/bzw;I)V

    .line 229
    .line 230
    .line 231
    const/16 v16, 0x0

    .line 232
    .line 233
    const/16 v17, 0x1c

    .line 234
    .line 235
    const/4 v15, 0x0

    .line 236
    move-object v12, v13

    .line 237
    move-object v13, v10

    .line 238
    invoke-direct/range {v12 .. v17}, La/byl;-><init>(Ljava/lang/String;La/m0x;Ljava/lang/Integer;Ljava/lang/Boolean;I)V

    .line 239
    .line 240
    .line 241
    move-object/from16 v16, v12

    .line 242
    .line 243
    :goto_7
    new-instance v8, La/ydj;

    .line 244
    .line 245
    new-instance v13, La/lxl;

    .line 246
    .line 247
    if-eqz v11, :cond_7

    .line 248
    .line 249
    sget-object v9, La/uxl;->b:La/uxl;

    .line 250
    .line 251
    :goto_8
    move-object/from16 v18, v9

    .line 252
    .line 253
    goto :goto_9

    .line 254
    :cond_7
    sget-object v9, La/uxl;->a:La/uxl;

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :goto_9
    const/16 v19, 0x0

    .line 258
    .line 259
    const/16 v20, 0x6c

    .line 260
    .line 261
    const-wide/16 v14, 0x1

    .line 262
    .line 263
    const/16 v17, 0x0

    .line 264
    .line 265
    invoke-direct/range {v13 .. v20}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 266
    .line 267
    .line 268
    invoke-direct {v8, v5, v13, v11}, La/ydj;-><init>(La/q760;La/lxl;Z)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    goto/16 :goto_4

    .line 275
    .line 276
    :cond_8
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    new-instance v1, La/y6t0;

    .line 281
    .line 282
    invoke-direct {v1, v2, v0}, La/y6t0;-><init>(La/a4x;La/a4x;)V

    .line 283
    .line 284
    .line 285
    return-object v1
.end method
