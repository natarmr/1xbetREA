.class public final La/f4v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gfi0;


# instance fields
.field public final a:La/g45;


# direct methods
.method public synthetic constructor <init>(La/g45;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/f4v;->a:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(La/rei0;La/zje;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, La/efi0;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/efi0;

    .line 13
    .line 14
    iget v4, v3, La/efi0;->o:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/efi0;->o:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/efi0;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, La/efi0;-><init>(La/f4v;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/efi0;->m:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/efi0;->o:I

    .line 36
    .line 37
    const/4 v6, 0x4

    .line 38
    const/4 v7, 0x3

    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    const/4 v10, 0x0

    .line 42
    iget-object v11, v0, La/f4v;->a:La/g45;

    .line 43
    .line 44
    if-eqz v5, :cond_5

    .line 45
    .line 46
    if-eq v5, v9, :cond_4

    .line 47
    .line 48
    if-eq v5, v8, :cond_3

    .line 49
    .line 50
    if-eq v5, v7, :cond_2

    .line 51
    .line 52
    if-ne v5, v6, :cond_1

    .line 53
    .line 54
    iget-object v0, v3, La/efi0;->l:La/gxb;

    .line 55
    .line 56
    iget-object v1, v3, La/efi0;->k:La/a640;

    .line 57
    .line 58
    iget-object v3, v3, La/efi0;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v12, v0

    .line 64
    goto/16 :goto_5

    .line 65
    .line 66
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-object v10

    .line 72
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    iget-object v1, v3, La/efi0;->j:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v5, v3, La/efi0;->i:La/rei0;

    .line 79
    .line 80
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    iget-object v1, v3, La/efi0;->j:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v5, v3, La/efi0;->i:La/rei0;

    .line 87
    .line 88
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object v2, v1

    .line 92
    move-object v1, v5

    .line 93
    goto :goto_1

    .line 94
    :cond_5
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, La/rei0;->b()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v11, v2, v1}, La/g45;->d(Ljava/lang/String;La/rei0;)V

    .line 102
    .line 103
    .line 104
    iput-object v1, v3, La/efi0;->i:La/rei0;

    .line 105
    .line 106
    iput-object v2, v3, La/efi0;->j:Ljava/lang/String;

    .line 107
    .line 108
    iput v9, v3, La/efi0;->o:I

    .line 109
    .line 110
    invoke-static {v11}, La/gfi0;->b(La/g45;)Lkotlin/Unit;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    if-ne v5, v4, :cond_6

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    :goto_1
    iput-object v1, v3, La/efi0;->i:La/rei0;

    .line 118
    .line 119
    iput-object v2, v3, La/efi0;->j:Ljava/lang/String;

    .line 120
    .line 121
    iput v8, v3, La/efi0;->o:I

    .line 122
    .line 123
    invoke-virtual {v11, v1, v3}, La/g45;->f0(La/rei0;La/zje;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    if-ne v5, v4, :cond_7

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_7
    move-object/from16 v21, v5

    .line 131
    .line 132
    move-object v5, v1

    .line 133
    move-object v1, v2

    .line 134
    move-object/from16 v2, v21

    .line 135
    .line 136
    :goto_2
    check-cast v2, La/qtf0;

    .line 137
    .line 138
    instance-of v8, v2, La/ntf0;

    .line 139
    .line 140
    if-eqz v8, :cond_9

    .line 141
    .line 142
    iput-object v10, v3, La/efi0;->i:La/rei0;

    .line 143
    .line 144
    iput-object v10, v3, La/efi0;->j:Ljava/lang/String;

    .line 145
    .line 146
    iput v7, v3, La/efi0;->o:I

    .line 147
    .line 148
    invoke-static {v0, v1, v5, v11, v3}, La/gfi0;->a(La/gfi0;Ljava/lang/String;La/rei0;La/g45;La/zje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-ne v0, v4, :cond_8

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_8
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0

    .line 158
    :cond_9
    instance-of v0, v2, La/ptf0;

    .line 159
    .line 160
    if-eqz v0, :cond_b

    .line 161
    .line 162
    check-cast v2, La/ptf0;

    .line 163
    .line 164
    iget-object v0, v2, La/ptf0;->a:La/a640;

    .line 165
    .line 166
    iget-object v2, v11, La/g45;->c:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v2, La/i7e;

    .line 169
    .line 170
    iget-object v2, v2, La/i7e;->i:La/p7m0;

    .line 171
    .line 172
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    check-cast v2, La/gxb;

    .line 177
    .line 178
    iput-object v10, v3, La/efi0;->i:La/rei0;

    .line 179
    .line 180
    iput-object v1, v3, La/efi0;->j:Ljava/lang/String;

    .line 181
    .line 182
    iput-object v0, v3, La/efi0;->k:La/a640;

    .line 183
    .line 184
    iput-object v2, v3, La/efi0;->l:La/gxb;

    .line 185
    .line 186
    iput v6, v3, La/efi0;->o:I

    .line 187
    .line 188
    invoke-virtual {v11, v0}, La/g45;->c(La/a640;)Lkotlin/Unit;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    if-ne v3, v4, :cond_a

    .line 193
    .line 194
    :goto_4
    return-object v4

    .line 195
    :cond_a
    move-object v3, v1

    .line 196
    move-object v12, v2

    .line 197
    move-object v1, v0

    .line 198
    :goto_5
    iget v0, v12, La/gxb;->d:I

    .line 199
    .line 200
    invoke-virtual {v1}, La/a640;->b()I

    .line 201
    .line 202
    .line 203
    move-result v2

    .line 204
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 205
    .line 206
    .line 207
    move-result v14

    .line 208
    new-instance v0, La/vxy;

    .line 209
    .line 210
    invoke-virtual {v1}, La/a640;->b()I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-direct {v0, v1, v9}, La/vxy;-><init>(IZ)V

    .line 215
    .line 216
    .line 217
    const/16 v20, 0x1f7

    .line 218
    .line 219
    const/4 v13, 0x0

    .line 220
    const/4 v15, 0x0

    .line 221
    const/16 v16, 0x0

    .line 222
    .line 223
    const/16 v17, 0x0

    .line 224
    .line 225
    const/16 v18, 0x0

    .line 226
    .line 227
    move-object/from16 v19, v0

    .line 228
    .line 229
    invoke-static/range {v12 .. v20}, La/gxb;->a(La/gxb;ZIILa/v9k0;ZLjava/util/List;La/vxy;I)La/gxb;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v11, v0}, La/g45;->j0(La/gxb;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v11, v3}, La/g45;->b0(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_b
    sget-object v0, La/otf0;->a:La/otf0;

    .line 241
    .line 242
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_c

    .line 247
    .line 248
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object v0

    .line 251
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 252
    .line 253
    .line 254
    return-object v10
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object p0, p0, La/f4v;->a:La/g45;

    .line 2
    .line 3
    iget-object v0, p0, La/g45;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/gcl;

    .line 6
    .line 7
    invoke-virtual {v0}, La/gcl;->a()V

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, La/gcl;->b:La/vwb0;

    .line 11
    .line 12
    const-string v1, "KEY_UPLOADED_MEDIA_IDS"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/vwb0;->i(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La/g45;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/i7e;

    .line 20
    .line 21
    invoke-virtual {v0}, La/i7e;->b()V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, La/i7e;->b:La/q7d0;

    .line 25
    .line 26
    const-string v1, "PREF_KEY_SEND_MESSAGES"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/q7d0;->h(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, La/g45;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, La/vae;

    .line 34
    .line 35
    invoke-virtual {p0}, La/vae;->a()V

    .line 36
    .line 37
    .line 38
    return-void
.end method
