.class public abstract La/p470;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/mm40;La/v8r0;Lkotlin/jvm/functions/Function1;La/fet;I)V
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
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v5, v2, La/v8r0;->a:La/f3v0;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const v0, 0x5707d800

    .line 18
    .line 19
    .line 20
    invoke-virtual {v13, v0}, La/fet;->g0(I)La/fet;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v4, 0x2

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v0, v4

    .line 33
    :goto_0
    or-int v0, p4, v0

    .line 34
    .line 35
    invoke-virtual {v13, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    const/16 v6, 0x20

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/16 v6, 0x10

    .line 45
    .line 46
    :goto_1
    or-int/2addr v0, v6

    .line 47
    invoke-virtual {v13, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    const/16 v7, 0x100

    .line 52
    .line 53
    if-eqz v6, :cond_2

    .line 54
    .line 55
    move v6, v7

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const/16 v6, 0x80

    .line 58
    .line 59
    :goto_2
    or-int/2addr v0, v6

    .line 60
    and-int/lit16 v6, v0, 0x93

    .line 61
    .line 62
    const/16 v8, 0x92

    .line 63
    .line 64
    const/4 v9, 0x0

    .line 65
    const/4 v10, 0x1

    .line 66
    if-eq v6, v8, :cond_3

    .line 67
    .line 68
    move v6, v10

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    move v6, v9

    .line 71
    :goto_3
    and-int/lit8 v8, v0, 0x1

    .line 72
    .line 73
    invoke-virtual {v13, v8, v6}, La/fet;->U(IZ)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_e

    .line 78
    .line 79
    sget-object v6, La/b3v0;->a:La/b3v0;

    .line 80
    .line 81
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_4

    .line 86
    .line 87
    const v4, -0x26335216

    .line 88
    .line 89
    .line 90
    invoke-virtual {v13, v4}, La/fet;->e0(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v13, v9}, La/fet;->r(Z)V

    .line 94
    .line 95
    .line 96
    move-object v4, v1

    .line 97
    goto :goto_4

    .line 98
    :cond_4
    const v6, -0x2632d692

    .line 99
    .line 100
    .line 101
    invoke-virtual {v13, v6}, La/fet;->e0(I)V

    .line 102
    .line 103
    .line 104
    sget-object v6, La/qmk;->a:La/zcl;

    .line 105
    .line 106
    invoke-static {v13}, La/qmk;->a(La/fet;)La/wfn;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    iget v6, v6, La/wfn;->c:F

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    invoke-static {v1, v6, v8, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v13, v9}, La/fet;->r(Z)V

    .line 118
    .line 119
    .line 120
    :goto_4
    iget-object v6, v2, La/v8r0;->b:La/bbn;

    .line 121
    .line 122
    and-int/lit16 v0, v0, 0x380

    .line 123
    .line 124
    if-ne v0, v7, :cond_5

    .line 125
    .line 126
    move v8, v10

    .line 127
    goto :goto_5

    .line 128
    :cond_5
    move v8, v9

    .line 129
    :goto_5
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    const/16 v12, 0x1a

    .line 134
    .line 135
    sget-object v14, La/ukd;->a:La/cl5;

    .line 136
    .line 137
    if-nez v8, :cond_6

    .line 138
    .line 139
    if-ne v11, v14, :cond_7

    .line 140
    .line 141
    :cond_6
    new-instance v11, La/x6s;

    .line 142
    .line 143
    invoke-direct {v11, v3, v12}, La/x6s;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v13, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    :cond_7
    check-cast v11, Lkotlin/jvm/functions/Function2;

    .line 150
    .line 151
    if-ne v0, v7, :cond_8

    .line 152
    .line 153
    move v8, v10

    .line 154
    goto :goto_6

    .line 155
    :cond_8
    move v8, v9

    .line 156
    :goto_6
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v15

    .line 160
    if-nez v8, :cond_9

    .line 161
    .line 162
    if-ne v15, v14, :cond_a

    .line 163
    .line 164
    :cond_9
    new-instance v15, La/ju60;

    .line 165
    .line 166
    const/16 v8, 0x19

    .line 167
    .line 168
    invoke-direct {v15, v3, v8}, La/ju60;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v13, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_a
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 175
    .line 176
    if-ne v0, v7, :cond_b

    .line 177
    .line 178
    move v9, v10

    .line 179
    :cond_b
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    if-nez v9, :cond_c

    .line 184
    .line 185
    if-ne v0, v14, :cond_d

    .line 186
    .line 187
    :cond_c
    new-instance v0, La/ju60;

    .line 188
    .line 189
    invoke-direct {v0, v3, v12}, La/ju60;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v13, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_d
    move-object v12, v0

    .line 196
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 197
    .line 198
    const/4 v14, 0x0

    .line 199
    const/4 v7, 0x0

    .line 200
    const/4 v8, 0x0

    .line 201
    const/4 v10, 0x0

    .line 202
    move-object v9, v11

    .line 203
    move-object v11, v15

    .line 204
    invoke-static/range {v4 .. v14}, La/n4c;->o(La/mm40;La/f3v0;La/bbn;La/ezj;La/gy40;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 205
    .line 206
    .line 207
    goto :goto_7

    .line 208
    :cond_e
    invoke-virtual/range {p3 .. p3}, La/fet;->X()V

    .line 209
    .line 210
    .line 211
    :goto_7
    invoke-virtual/range {p3 .. p3}, La/fet;->u()La/yfe0;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    if-eqz v6, :cond_f

    .line 216
    .line 217
    new-instance v0, La/dr50;

    .line 218
    .line 219
    const/16 v5, 0x11

    .line 220
    .line 221
    move/from16 v4, p4

    .line 222
    .line 223
    invoke-direct/range {v0 .. v5}, La/dr50;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 224
    .line 225
    .line 226
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 227
    .line 228
    :cond_f
    return-void
.end method
