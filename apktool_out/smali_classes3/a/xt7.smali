.class public final synthetic La/xt7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/au7;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/au7;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xt7;->a:B

    iput-object p1, p0, La/xt7;->b:La/l7m0;

    iput-object p2, p0, La/xt7;->c:La/au7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xt7;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x12

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v7, v0, La/xt7;->c:La/au7;

    .line 13
    .line 14
    iget-object v0, v0, La/xt7;->b:La/l7m0;

    .line 15
    .line 16
    const/4 v8, 0x4

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, La/mm40;

    .line 23
    .line 24
    move-object/from16 v9, p2

    .line 25
    .line 26
    check-cast v9, La/fet;

    .line 27
    .line 28
    move-object/from16 v10, p3

    .line 29
    .line 30
    check-cast v10, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    sget-object v11, La/au7;->U1:La/yk5;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    and-int/lit8 v11, v10, 0x6

    .line 42
    .line 43
    if-nez v11, :cond_1

    .line 44
    .line 45
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    if-eqz v11, :cond_0

    .line 50
    .line 51
    move v5, v8

    .line 52
    :cond_0
    or-int/2addr v10, v5

    .line 53
    :cond_1
    and-int/lit8 v5, v10, 0x13

    .line 54
    .line 55
    if-eq v5, v4, :cond_2

    .line 56
    .line 57
    move v3, v6

    .line 58
    :cond_2
    and-int/lit8 v4, v10, 0x1

    .line 59
    .line 60
    invoke-virtual {v9, v4, v3}, La/fet;->U(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_5

    .line 65
    .line 66
    invoke-virtual {v9, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    if-nez v3, :cond_3

    .line 75
    .line 76
    if-ne v4, v2, :cond_4

    .line 77
    .line 78
    :cond_3
    new-instance v4, La/yt7;

    .line 79
    .line 80
    const/4 v2, 0x3

    .line 81
    invoke-direct {v4, v7, v2}, La/yt7;-><init>(La/au7;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 88
    .line 89
    and-int/lit8 v2, v10, 0xe

    .line 90
    .line 91
    invoke-static {v2, v9, v1, v0, v4}, La/ffb0;->f(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_5
    invoke-virtual {v9}, La/fet;->X()V

    .line 96
    .line 97
    .line 98
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_0
    move-object/from16 v1, p1

    .line 102
    .line 103
    check-cast v1, La/mm40;

    .line 104
    .line 105
    move-object/from16 v13, p2

    .line 106
    .line 107
    check-cast v13, La/fet;

    .line 108
    .line 109
    move-object/from16 v9, p3

    .line 110
    .line 111
    check-cast v9, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    sget-object v10, La/au7;->U1:La/yk5;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    and-int/lit8 v10, v9, 0x6

    .line 123
    .line 124
    if-nez v10, :cond_7

    .line 125
    .line 126
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    if-eqz v10, :cond_6

    .line 131
    .line 132
    move v5, v8

    .line 133
    :cond_6
    or-int/2addr v9, v5

    .line 134
    :cond_7
    and-int/lit8 v5, v9, 0x13

    .line 135
    .line 136
    if-eq v5, v4, :cond_8

    .line 137
    .line 138
    move v3, v6

    .line 139
    :cond_8
    and-int/lit8 v4, v9, 0x1

    .line 140
    .line 141
    invoke-virtual {v13, v4, v3}, La/fet;->U(IZ)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-eqz v3, :cond_f

    .line 146
    .line 147
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, La/imm;

    .line 152
    .line 153
    invoke-virtual {v13, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    if-nez v3, :cond_9

    .line 162
    .line 163
    if-ne v4, v2, :cond_a

    .line 164
    .line 165
    :cond_9
    new-instance v4, La/wt7;

    .line 166
    .line 167
    invoke-direct {v4, v7, v8}, La/wt7;-><init>(La/au7;B)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 174
    .line 175
    invoke-virtual {v13, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    if-nez v3, :cond_b

    .line 184
    .line 185
    if-ne v5, v2, :cond_c

    .line 186
    .line 187
    :cond_b
    new-instance v5, La/wt7;

    .line 188
    .line 189
    const/4 v3, 0x5

    .line 190
    invoke-direct {v5, v7, v3}, La/wt7;-><init>(La/au7;B)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v13, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_c
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 197
    .line 198
    invoke-virtual {v13, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v3

    .line 202
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    if-nez v3, :cond_d

    .line 207
    .line 208
    if-ne v6, v2, :cond_e

    .line 209
    .line 210
    :cond_d
    new-instance v6, La/yt7;

    .line 211
    .line 212
    invoke-direct {v6, v7, v8}, La/yt7;-><init>(La/au7;B)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v13, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_e
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 219
    .line 220
    and-int/lit8 v14, v9, 0xe

    .line 221
    .line 222
    const/4 v15, 0x0

    .line 223
    const/16 v16, 0xfc4

    .line 224
    .line 225
    const/4 v3, 0x0

    .line 226
    const/4 v7, 0x0

    .line 227
    const/4 v8, 0x0

    .line 228
    const/4 v9, 0x0

    .line 229
    const/4 v10, 0x0

    .line 230
    const/4 v11, 0x0

    .line 231
    const/4 v12, 0x0

    .line 232
    move-object v2, v0

    .line 233
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 234
    .line 235
    .line 236
    goto :goto_1

    .line 237
    :cond_f
    invoke-virtual {v13}, La/fet;->X()V

    .line 238
    .line 239
    .line 240
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
