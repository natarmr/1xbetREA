.class public final synthetic La/utv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/buv0;


# direct methods
.method public synthetic constructor <init>(La/buv0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/utv0;->a:B

    iput-object p1, p0, La/utv0;->b:La/buv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/utv0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/utv0;->b:La/buv0;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, La/buv0;->b:La/glt0;

    .line 13
    .line 14
    iget-object v1, v1, La/glt0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, La/t33;

    .line 17
    .line 18
    invoke-virtual {v1}, La/t33;->e()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, La/buv0;->i:La/pz40;

    .line 25
    .line 26
    check-cast v0, La/hgk0;

    .line 27
    .line 28
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    move v2, v3

    .line 41
    :cond_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :pswitch_0
    iget-object v0, v0, La/buv0;->a:La/mkt0;

    .line 47
    .line 48
    invoke-virtual {v0}, La/mkt0;->b()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :pswitch_1
    iget-object v1, v0, La/buv0;->j:La/t33;

    .line 58
    .line 59
    invoke-virtual {v1}, La/t33;->d()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-object v4, v0, La/buv0;->k:La/cuv0;

    .line 70
    .line 71
    iget-object v5, v4, La/cuv0;->a:Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    const/4 v6, 0x0

    .line 78
    if-nez v5, :cond_1

    .line 79
    .line 80
    new-instance v0, La/osv0;

    .line 81
    .line 82
    invoke-direct {v0, v6, v6, v6, v6}, La/osv0;-><init>(FFFF)V

    .line 83
    .line 84
    .line 85
    goto/16 :goto_4

    .line 86
    .line 87
    :cond_1
    const/16 v7, 0xdc

    .line 88
    .line 89
    if-gt v5, v3, :cond_2

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    const/16 v8, 0x3c

    .line 93
    .line 94
    invoke-static {v5, v3, v8, v7}, La/twn;->b(IIII)I

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    :goto_0
    int-to-float v5, v7

    .line 99
    const/high16 v7, 0x42700000    # 60.0f

    .line 100
    .line 101
    div-float/2addr v7, v5

    .line 102
    const/high16 v8, 0x435c0000    # 220.0f

    .line 103
    .line 104
    div-float/2addr v8, v5

    .line 105
    iget-object v5, v4, La/cuv0;->a:Ljava/util/List;

    .line 106
    .line 107
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    move v9, v6

    .line 112
    move v10, v9

    .line 113
    move v11, v10

    .line 114
    move v12, v11

    .line 115
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    if-eqz v13, :cond_b

    .line 120
    .line 121
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v13

    .line 125
    add-int/lit8 v14, v2, 0x1

    .line 126
    .line 127
    if-ltz v2, :cond_a

    .line 128
    .line 129
    check-cast v13, La/tsv0;

    .line 130
    .line 131
    const/16 p0, 0x0

    .line 132
    .line 133
    sget-object v15, La/tsv0;->d:La/tsv0;

    .line 134
    .line 135
    if-ne v13, v15, :cond_3

    .line 136
    .line 137
    iget-object v15, v4, La/cuv0;->b:Ljava/lang/Integer;

    .line 138
    .line 139
    if-eqz v15, :cond_3

    .line 140
    .line 141
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 142
    .line 143
    .line 144
    move-result v2

    .line 145
    :cond_3
    iget-object v15, v0, La/buv0;->c:La/duv0;

    .line 146
    .line 147
    invoke-virtual {v15}, La/duv0;->a()La/w6k;

    .line 148
    .line 149
    .line 150
    move-result-object v15

    .line 151
    sget v3, La/buv0;->n:F

    .line 152
    .line 153
    invoke-interface {v15, v3}, La/w6k;->w0(F)F

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    int-to-float v2, v2

    .line 158
    mul-float/2addr v2, v7

    .line 159
    add-float v15, v2, v8

    .line 160
    .line 161
    move/from16 v16, v6

    .line 162
    .line 163
    const/high16 v6, 0x3f800000    # 1.0f

    .line 164
    .line 165
    cmpl-float v17, v15, v6

    .line 166
    .line 167
    if-lez v17, :cond_4

    .line 168
    .line 169
    move v15, v6

    .line 170
    :cond_4
    sub-float/2addr v15, v2

    .line 171
    cmpg-float v17, v15, v16

    .line 172
    .line 173
    if-gtz v17, :cond_5

    .line 174
    .line 175
    move v2, v6

    .line 176
    move/from16 v15, v16

    .line 177
    .line 178
    move/from16 v16, v2

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_5
    sub-float v2, v1, v2

    .line 182
    .line 183
    div-float/2addr v2, v15

    .line 184
    move/from16 v15, v16

    .line 185
    .line 186
    invoke-static {v2, v15, v6}, La/l1e0;->c(FFF)F

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    move/from16 v16, v6

    .line 191
    .line 192
    sget-object v6, La/buv0;->m:La/zsf;

    .line 193
    .line 194
    invoke-virtual {v6, v2}, La/zsf;->a(F)F

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    :goto_2
    sub-float v6, v16, v2

    .line 199
    .line 200
    mul-float/2addr v6, v3

    .line 201
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    if-eqz v2, :cond_9

    .line 206
    .line 207
    const/4 v3, 0x1

    .line 208
    if-eq v2, v3, :cond_8

    .line 209
    .line 210
    const/4 v13, 0x2

    .line 211
    if-eq v2, v13, :cond_7

    .line 212
    .line 213
    const/4 v12, 0x3

    .line 214
    if-ne v2, v12, :cond_6

    .line 215
    .line 216
    move v12, v6

    .line 217
    goto :goto_3

    .line 218
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 219
    .line 220
    .line 221
    move-object/from16 v0, p0

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_7
    move v11, v6

    .line 225
    goto :goto_3

    .line 226
    :cond_8
    move v10, v6

    .line 227
    goto :goto_3

    .line 228
    :cond_9
    const/4 v3, 0x1

    .line 229
    move v9, v6

    .line 230
    :goto_3
    move v2, v14

    .line 231
    move v6, v15

    .line 232
    goto :goto_1

    .line 233
    :cond_a
    const/16 p0, 0x0

    .line 234
    .line 235
    invoke-static {}, La/q3d;->p()V

    .line 236
    .line 237
    .line 238
    throw p0

    .line 239
    :cond_b
    new-instance v0, La/osv0;

    .line 240
    .line 241
    invoke-direct {v0, v9, v10, v11, v12}, La/osv0;-><init>(FFFF)V

    .line 242
    .line 243
    .line 244
    :goto_4
    return-object v0

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
