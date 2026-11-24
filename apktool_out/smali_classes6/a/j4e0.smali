.class public final synthetic La/j4e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l4e0;


# direct methods
.method public synthetic constructor <init>(La/l4e0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j4e0;->a:B

    iput-object p1, p0, La/j4e0;->b:La/l4e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/j4e0;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v0, v0, La/j4e0;->b:La/l4e0;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/y5d;

    .line 17
    .line 18
    move-object/from16 v14, p2

    .line 19
    .line 20
    check-cast v14, La/fet;

    .line 21
    .line 22
    move-object/from16 v5, p3

    .line 23
    .line 24
    check-cast v5, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    sget-object v6, La/l4e0;->n2:La/fl70;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    and-int/lit8 v1, v5, 0x11

    .line 36
    .line 37
    const/16 v6, 0x10

    .line 38
    .line 39
    if-eq v1, v6, :cond_0

    .line 40
    .line 41
    move v1, v4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v1, v3

    .line 44
    :goto_0
    and-int/2addr v5, v4

    .line 45
    invoke-virtual {v14, v5, v1}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    const/4 v1, 0x3

    .line 52
    invoke-static {v3, v3, v14, v3, v1}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1, v14}, La/a8k0;->G(La/bch0;La/fet;)La/ak50;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    const/4 v5, 0x0

    .line 61
    invoke-static {v2, v3, v5}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    sget-object v2, La/qmk;->a:La/zcl;

    .line 66
    .line 67
    const/high16 v2, 0x41a00000    # 20.0f

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-static {v3, v2, v4}, La/s5x0;->t(FFI)La/lh80;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-virtual {v14, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    if-nez v2, :cond_1

    .line 83
    .line 84
    sget-object v2, La/ukd;->a:La/cl5;

    .line 85
    .line 86
    if-ne v3, v2, :cond_2

    .line 87
    .line 88
    :cond_1
    new-instance v3, La/v6d0;

    .line 89
    .line 90
    invoke-direct {v3, v0, v6}, La/v6d0;-><init>(Ljava/lang/Object;B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v14, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_2
    move-object v13, v3

    .line 97
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 98
    .line 99
    const/4 v15, 0x0

    .line 100
    const/16 v16, 0x1f8

    .line 101
    .line 102
    const/4 v8, 0x0

    .line 103
    const/4 v9, 0x0

    .line 104
    const/4 v10, 0x0

    .line 105
    const/4 v11, 0x0

    .line 106
    const/4 v12, 0x0

    .line 107
    move-object v6, v1

    .line 108
    invoke-static/range {v5 .. v16}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_3
    invoke-virtual {v14}, La/fet;->X()V

    .line 113
    .line 114
    .line 115
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_0
    move-object/from16 v1, p1

    .line 119
    .line 120
    check-cast v1, La/y5d;

    .line 121
    .line 122
    move-object/from16 v12, p2

    .line 123
    .line 124
    check-cast v12, La/fet;

    .line 125
    .line 126
    move-object/from16 v5, p3

    .line 127
    .line 128
    check-cast v5, Ljava/lang/Integer;

    .line 129
    .line 130
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    sget-object v6, La/l4e0;->n2:La/fl70;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    and-int/lit8 v6, v5, 0x6

    .line 140
    .line 141
    const/4 v7, 0x2

    .line 142
    if-nez v6, :cond_5

    .line 143
    .line 144
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-eqz v6, :cond_4

    .line 149
    .line 150
    const/4 v6, 0x4

    .line 151
    goto :goto_2

    .line 152
    :cond_4
    move v6, v7

    .line 153
    :goto_2
    or-int/2addr v5, v6

    .line 154
    :cond_5
    and-int/lit8 v6, v5, 0x13

    .line 155
    .line 156
    const/16 v8, 0x12

    .line 157
    .line 158
    if-eq v6, v8, :cond_6

    .line 159
    .line 160
    move v6, v4

    .line 161
    goto :goto_3

    .line 162
    :cond_6
    move v6, v3

    .line 163
    :goto_3
    and-int/2addr v4, v5

    .line 164
    invoke-virtual {v12, v4, v6}, La/fet;->U(IZ)Z

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    if-eqz v4, :cond_7

    .line 169
    .line 170
    const/high16 v4, 0x3f800000    # 1.0f

    .line 171
    .line 172
    invoke-static {v2, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    sget-object v4, La/gqw0;->n:La/xx7;

    .line 177
    .line 178
    invoke-virtual {v1, v2, v4}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    sget-object v1, La/qmk;->a:La/zcl;

    .line 183
    .line 184
    const/16 v17, 0x0

    .line 185
    .line 186
    const/16 v18, 0xd

    .line 187
    .line 188
    const/4 v14, 0x0

    .line 189
    const/high16 v15, 0x41c00000    # 24.0f

    .line 190
    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    iget-object v1, v0, La/l4e0;->m2:La/yzn0;

    .line 198
    .line 199
    sget-object v2, La/l4e0;->o2:[La/iiy;

    .line 200
    .line 201
    aget-object v2, v2, v7

    .line 202
    .line 203
    invoke-virtual {v1, v0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, La/i6i0;

    .line 208
    .line 209
    iget v0, v0, La/i6i0;->a:I

    .line 210
    .line 211
    invoke-static {v0, v3, v12}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    const/4 v13, 0x0

    .line 216
    const/16 v14, 0x1c

    .line 217
    .line 218
    const-wide/16 v7, 0x0

    .line 219
    .line 220
    const/4 v9, 0x0

    .line 221
    const-wide/16 v10, 0x0

    .line 222
    .line 223
    invoke-static/range {v5 .. v14}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 224
    .line 225
    .line 226
    goto :goto_4

    .line 227
    :cond_7
    invoke-virtual {v12}, La/fet;->X()V

    .line 228
    .line 229
    .line 230
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    return-object v0

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
