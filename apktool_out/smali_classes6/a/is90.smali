.class public final synthetic La/is90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

.field public final synthetic c:I

.field public final synthetic d:La/xcz;

.field public final synthetic e:F

.field public final synthetic f:La/a8x;

.field public final synthetic g:La/l7m0;

.field public final synthetic h:La/vne;

.field public final synthetic i:F

.field public final synthetic j:F

.field public final synthetic k:La/j73;

.field public final synthetic l:La/pz40;

.field public final synthetic m:La/pz40;


# direct methods
.method public synthetic constructor <init>(ILandroidx/compose/runtime/snapshots/SnapshotStateList;ILa/xcz;FLa/a8x;La/l7m0;La/vne;FFLa/j73;La/pz40;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/is90;->a:I

    iput-object p2, p0, La/is90;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput p3, p0, La/is90;->c:I

    iput-object p4, p0, La/is90;->d:La/xcz;

    iput p5, p0, La/is90;->e:F

    iput-object p6, p0, La/is90;->f:La/a8x;

    iput-object p7, p0, La/is90;->g:La/l7m0;

    iput-object p8, p0, La/is90;->h:La/vne;

    iput p9, p0, La/is90;->i:F

    iput p10, p0, La/is90;->j:F

    iput-object p11, p0, La/is90;->k:La/j73;

    iput-object p12, p0, La/is90;->l:La/pz40;

    iput-object p13, p0, La/is90;->m:La/pz40;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/g9z;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    move-object/from16 v2, p3

    .line 16
    .line 17
    check-cast v2, La/fet;

    .line 18
    .line 19
    move-object/from16 v3, p4

    .line 20
    .line 21
    check-cast v3, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    and-int/lit8 v1, v3, 0x30

    .line 31
    .line 32
    const/16 v4, 0x20

    .line 33
    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v2, v6}, La/fet;->e(I)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    move v1, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/16 v1, 0x10

    .line 45
    .line 46
    :goto_0
    or-int/2addr v3, v1

    .line 47
    :cond_1
    move v1, v3

    .line 48
    and-int/lit16 v3, v1, 0x91

    .line 49
    .line 50
    const/16 v5, 0x90

    .line 51
    .line 52
    const/4 v7, 0x0

    .line 53
    const/4 v8, 0x1

    .line 54
    if-eq v3, v5, :cond_2

    .line 55
    .line 56
    move v3, v8

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v3, v7

    .line 59
    :goto_1
    and-int/lit8 v5, v1, 0x1

    .line 60
    .line 61
    invoke-virtual {v2, v5, v3}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_9

    .line 66
    .line 67
    move v3, v7

    .line 68
    iget v7, v0, La/is90;->a:I

    .line 69
    .line 70
    rem-int v5, v6, v7

    .line 71
    .line 72
    if-ltz v5, :cond_3

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    add-int/2addr v5, v7

    .line 76
    :goto_2
    iget-object v9, v0, La/is90;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 77
    .line 78
    invoke-virtual {v9, v5}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v10

    .line 82
    check-cast v10, La/cav0;

    .line 83
    .line 84
    iget-object v15, v0, La/is90;->g:La/l7m0;

    .line 85
    .line 86
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    check-cast v11, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    iget-boolean v12, v10, La/cav0;->c:Z

    .line 97
    .line 98
    if-nez v12, :cond_4

    .line 99
    .line 100
    sget-object v11, La/yq90;->a:La/yq90;

    .line 101
    .line 102
    :goto_3
    move-object/from16 v17, v11

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_4
    if-ne v5, v11, :cond_5

    .line 106
    .line 107
    sget-object v11, La/xq90;->a:La/xq90;

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_5
    sget-object v11, La/zq90;->a:La/zq90;

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :goto_4
    invoke-virtual {v2, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    invoke-virtual {v2, v5}, La/fet;->e(I)Z

    .line 118
    .line 119
    .line 120
    move-result v12

    .line 121
    or-int/2addr v11, v12

    .line 122
    and-int/lit8 v12, v1, 0x70

    .line 123
    .line 124
    if-ne v12, v4, :cond_6

    .line 125
    .line 126
    move v3, v8

    .line 127
    :cond_6
    or-int/2addr v3, v11

    .line 128
    invoke-virtual {v2, v7}, La/fet;->e(I)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    or-int/2addr v3, v4

    .line 133
    iget v8, v0, La/is90;->c:I

    .line 134
    .line 135
    invoke-virtual {v2, v8}, La/fet;->e(I)Z

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    or-int/2addr v3, v4

    .line 140
    iget-object v12, v0, La/is90;->d:La/xcz;

    .line 141
    .line 142
    invoke-virtual {v2, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    or-int/2addr v3, v4

    .line 147
    iget v13, v0, La/is90;->e:F

    .line 148
    .line 149
    invoke-virtual {v2, v13}, La/fet;->d(F)Z

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    or-int/2addr v3, v4

    .line 154
    iget-object v14, v0, La/is90;->f:La/a8x;

    .line 155
    .line 156
    invoke-virtual {v2, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    or-int/2addr v3, v4

    .line 161
    invoke-virtual {v2, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    or-int/2addr v3, v4

    .line 166
    move-object v4, v10

    .line 167
    iget-object v10, v0, La/is90;->h:La/vne;

    .line 168
    .line 169
    invoke-virtual {v2, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v11

    .line 173
    or-int/2addr v3, v11

    .line 174
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    if-nez v3, :cond_8

    .line 179
    .line 180
    sget-object v3, La/ukd;->a:La/cl5;

    .line 181
    .line 182
    if-ne v11, v3, :cond_7

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_7
    move/from16 p1, v1

    .line 186
    .line 187
    move-object v1, v4

    .line 188
    goto :goto_6

    .line 189
    :cond_8
    :goto_5
    new-instance v3, La/js90;

    .line 190
    .line 191
    move-object v11, v4

    .line 192
    move-object v4, v9

    .line 193
    iget-object v9, v0, La/is90;->k:La/j73;

    .line 194
    .line 195
    move-object/from16 v16, v11

    .line 196
    .line 197
    iget-object v11, v0, La/is90;->l:La/pz40;

    .line 198
    .line 199
    move/from16 p1, v1

    .line 200
    .line 201
    iget-object v1, v0, La/is90;->m:La/pz40;

    .line 202
    .line 203
    move-object/from16 v18, v16

    .line 204
    .line 205
    move-object/from16 v16, v1

    .line 206
    .line 207
    move-object/from16 v1, v18

    .line 208
    .line 209
    invoke-direct/range {v3 .. v16}, La/js90;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;IIIILa/j73;La/vne;La/pz40;La/xcz;FLa/a8x;La/l7m0;La/pz40;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    move-object v11, v3

    .line 216
    :goto_6
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 217
    .line 218
    iget-object v5, v1, La/cav0;->b:Ljava/lang/String;

    .line 219
    .line 220
    sget v4, La/fs90;->a:F

    .line 221
    .line 222
    shl-int/lit8 v1, p1, 0xc

    .line 223
    .line 224
    const/high16 v3, 0x70000

    .line 225
    .line 226
    and-int/2addr v1, v3

    .line 227
    or-int/lit8 v14, v1, 0x30

    .line 228
    .line 229
    const/4 v3, 0x0

    .line 230
    iget v9, v0, La/is90;->i:F

    .line 231
    .line 232
    const/4 v10, 0x0

    .line 233
    iget v0, v0, La/is90;->j:F

    .line 234
    .line 235
    move-object v13, v2

    .line 236
    move v8, v6

    .line 237
    move-object v7, v12

    .line 238
    move-object/from16 v6, v17

    .line 239
    .line 240
    move-object v12, v11

    .line 241
    move v11, v0

    .line 242
    invoke-static/range {v3 .. v14}, La/c9x;->g(La/mm40;FLjava/lang/String;La/ar90;La/xcz;IFLa/gy40;FLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 243
    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_9
    move-object v13, v2

    .line 247
    invoke-virtual {v13}, La/fet;->X()V

    .line 248
    .line 249
    .line 250
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object v0
.end method
