.class public abstract La/wwj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/lh80;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x41e00000    # 28.0f

    .line 4
    .line 5
    const/4 v1, 0x5

    .line 6
    const/4 v2, 0x0

    .line 7
    const/high16 v3, 0x41000000    # 8.0f

    .line 8
    .line 9
    invoke-static {v2, v3, v2, v0, v1}, La/s5x0;->u(FFFFI)La/lh80;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, La/wwj;->a:La/lh80;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(La/pz40;La/l7m0;La/xcz;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 19

    .line 1
    move-object/from16 v8, p6

    .line 2
    .line 3
    move/from16 v11, p7

    .line 4
    .line 5
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const v0, -0x50f4d62

    .line 21
    .line 22
    .line 23
    invoke-virtual {v8, v0}, La/fet;->g0(I)La/fet;

    .line 24
    .line 25
    .line 26
    and-int/lit8 v0, v11, 0x6

    .line 27
    .line 28
    move-object/from16 v1, p0

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const/4 v0, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v0, 0x2

    .line 41
    :goto_0
    or-int/2addr v0, v11

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v0, v11

    .line 44
    :goto_1
    and-int/lit8 v2, v11, 0x30

    .line 45
    .line 46
    move-object/from16 v12, p1

    .line 47
    .line 48
    if-nez v2, :cond_3

    .line 49
    .line 50
    invoke-virtual {v8, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    const/16 v2, 0x20

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/16 v2, 0x10

    .line 60
    .line 61
    :goto_2
    or-int/2addr v0, v2

    .line 62
    :cond_3
    and-int/lit16 v2, v11, 0x180

    .line 63
    .line 64
    move-object/from16 v3, p2

    .line 65
    .line 66
    if-nez v2, :cond_5

    .line 67
    .line 68
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_4

    .line 73
    .line 74
    const/16 v2, 0x100

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    const/16 v2, 0x80

    .line 78
    .line 79
    :goto_3
    or-int/2addr v0, v2

    .line 80
    :cond_5
    and-int/lit16 v2, v11, 0xc00

    .line 81
    .line 82
    move-object/from16 v14, p3

    .line 83
    .line 84
    if-nez v2, :cond_7

    .line 85
    .line 86
    invoke-virtual {v8, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_6

    .line 91
    .line 92
    const/16 v2, 0x800

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_6
    const/16 v2, 0x400

    .line 96
    .line 97
    :goto_4
    or-int/2addr v0, v2

    .line 98
    :cond_7
    and-int/lit16 v2, v11, 0x6000

    .line 99
    .line 100
    move-object/from16 v5, p4

    .line 101
    .line 102
    if-nez v2, :cond_9

    .line 103
    .line 104
    invoke-virtual {v8, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_8

    .line 109
    .line 110
    const/16 v2, 0x4000

    .line 111
    .line 112
    goto :goto_5

    .line 113
    :cond_8
    const/16 v2, 0x2000

    .line 114
    .line 115
    :goto_5
    or-int/2addr v0, v2

    .line 116
    :cond_9
    const/high16 v2, 0x30000

    .line 117
    .line 118
    and-int/2addr v2, v11

    .line 119
    move-object/from16 v15, p5

    .line 120
    .line 121
    if-nez v2, :cond_b

    .line 122
    .line 123
    invoke-virtual {v8, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_a

    .line 128
    .line 129
    const/high16 v2, 0x20000

    .line 130
    .line 131
    goto :goto_6

    .line 132
    :cond_a
    const/high16 v2, 0x10000

    .line 133
    .line 134
    :goto_6
    or-int/2addr v0, v2

    .line 135
    :cond_b
    const v2, 0x12493

    .line 136
    .line 137
    .line 138
    and-int/2addr v2, v0

    .line 139
    const v4, 0x12492

    .line 140
    .line 141
    .line 142
    if-eq v2, v4, :cond_c

    .line 143
    .line 144
    const/4 v2, 0x1

    .line 145
    goto :goto_7

    .line 146
    :cond_c
    const/4 v2, 0x0

    .line 147
    :goto_7
    and-int/lit8 v4, v0, 0x1

    .line 148
    .line 149
    invoke-virtual {v8, v4, v2}, La/fet;->U(IZ)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-eqz v2, :cond_d

    .line 154
    .line 155
    invoke-static {v8}, La/xfn;->a(La/fet;)La/wfn;

    .line 156
    .line 157
    .line 158
    move-result-object v17

    .line 159
    sget-object v2, La/o7k0;->c:La/n0q;

    .line 160
    .line 161
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    check-cast v4, Ljava/lang/Boolean;

    .line 166
    .line 167
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    invoke-static {v2, v4}, La/vtb;->U(La/mm40;Z)La/mm40;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    const-string v4, "DEFAULT_LAZY_COLUMN"

    .line 176
    .line 177
    invoke-static {v2, v4}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    sget-object v4, La/wwj;->a:La/lh80;

    .line 182
    .line 183
    invoke-static {v4, v8}, La/knm0;->g(La/hh80;La/fet;)La/ch80;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    new-instance v13, La/x2g;

    .line 188
    .line 189
    const/16 v18, 0x10

    .line 190
    .line 191
    move-object/from16 v16, v5

    .line 192
    .line 193
    invoke-direct/range {v13 .. v18}, La/x2g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 194
    .line 195
    .line 196
    const v5, -0x7b784360

    .line 197
    .line 198
    .line 199
    invoke-static {v5, v13, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 200
    .line 201
    .line 202
    move-result-object v7

    .line 203
    shr-int/lit8 v5, v0, 0x3

    .line 204
    .line 205
    and-int/lit8 v5, v5, 0x70

    .line 206
    .line 207
    const/high16 v6, 0x6000000

    .line 208
    .line 209
    or-int/2addr v5, v6

    .line 210
    shl-int/lit8 v0, v0, 0x6

    .line 211
    .line 212
    and-int/lit16 v0, v0, 0x380

    .line 213
    .line 214
    or-int v9, v5, v0

    .line 215
    .line 216
    const/16 v10, 0xd8

    .line 217
    .line 218
    const/4 v3, 0x0

    .line 219
    const/4 v5, 0x0

    .line 220
    const/4 v6, 0x0

    .line 221
    move-object v0, v2

    .line 222
    move-object v2, v1

    .line 223
    move-object/from16 v1, p2

    .line 224
    .line 225
    invoke-static/range {v0 .. v10}, La/b8k0;->d(La/mm40;La/xcz;La/l7m0;La/sw3;La/hh80;ZLkotlin/jvm/functions/Function1;La/ugd;La/fet;II)V

    .line 226
    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_d
    invoke-virtual/range {p6 .. p6}, La/fet;->X()V

    .line 230
    .line 231
    .line 232
    :goto_8
    invoke-virtual/range {p6 .. p6}, La/fet;->u()La/yfe0;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    if-eqz v9, :cond_e

    .line 237
    .line 238
    new-instance v0, La/uwj;

    .line 239
    .line 240
    const/4 v8, 0x0

    .line 241
    move-object/from16 v1, p0

    .line 242
    .line 243
    move-object/from16 v3, p2

    .line 244
    .line 245
    move-object/from16 v4, p3

    .line 246
    .line 247
    move-object/from16 v5, p4

    .line 248
    .line 249
    move-object/from16 v6, p5

    .line 250
    .line 251
    move v7, v11

    .line 252
    move-object v2, v12

    .line 253
    invoke-direct/range {v0 .. v8}, La/uwj;-><init>(La/pz40;La/l7m0;La/xcz;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IB)V

    .line 254
    .line 255
    .line 256
    iput-object v0, v9, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 257
    .line 258
    :cond_e
    return-void
.end method
