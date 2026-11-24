.class public final synthetic La/la2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/Window;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;Landroid/content/Context;ZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/la2;->a:B

    iput-object p1, p0, La/la2;->b:Landroid/view/Window;

    iput-object p2, p0, La/la2;->c:Landroid/content/Context;

    iput-boolean p3, p0, La/la2;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/la2;->a:B

    .line 2
    .line 3
    const v1, 0x7f040ae3

    .line 4
    .line 5
    .line 6
    iget-boolean v2, p0, La/la2;->d:Z

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    check-cast p1, La/ilz;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, La/la2;->b:Landroid/view/Window;

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 22
    .line 23
    iget-object v5, p0, La/la2;->c:Landroid/content/Context;

    .line 24
    .line 25
    invoke-static {v5, v1, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    xor-int/lit8 v8, v2, 0x1

    .line 30
    .line 31
    const v6, 0x7f0606d8

    .line 32
    .line 33
    .line 34
    move v9, v8

    .line 35
    invoke-static/range {v4 .. v9}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 36
    .line 37
    .line 38
    :cond_0
    new-instance p0, La/pa2;

    .line 39
    .line 40
    const/16 p1, 0xe

    .line 41
    .line 42
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v4, p0, La/la2;->b:Landroid/view/Window;

    .line 50
    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 54
    .line 55
    const p1, 0x7f040ae1

    .line 56
    .line 57
    .line 58
    iget-object v5, p0, La/la2;->c:Landroid/content/Context;

    .line 59
    .line 60
    invoke-static {v5, p1, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    xor-int/lit8 v8, v2, 0x1

    .line 65
    .line 66
    const v6, 0x7f0606d8

    .line 67
    .line 68
    .line 69
    move v9, v8

    .line 70
    invoke-static/range {v4 .. v9}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 71
    .line 72
    .line 73
    :cond_1
    new-instance p0, La/pa2;

    .line 74
    .line 75
    const/16 p1, 0xc

    .line 76
    .line 77
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 78
    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    iget-object v4, p0, La/la2;->b:Landroid/view/Window;

    .line 85
    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 89
    .line 90
    iget-object v5, p0, La/la2;->c:Landroid/content/Context;

    .line 91
    .line 92
    invoke-static {v5, v1, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    xor-int/lit8 v8, v2, 0x1

    .line 97
    .line 98
    const v6, 0x7f0606d8

    .line 99
    .line 100
    .line 101
    move v9, v8

    .line 102
    invoke-static/range {v4 .. v9}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 103
    .line 104
    .line 105
    :cond_2
    new-instance p0, La/pa2;

    .line 106
    .line 107
    const/16 p1, 0xb

    .line 108
    .line 109
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 110
    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-object v4, p0, La/la2;->b:Landroid/view/Window;

    .line 117
    .line 118
    if-eqz v4, :cond_3

    .line 119
    .line 120
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 121
    .line 122
    iget-object v5, p0, La/la2;->c:Landroid/content/Context;

    .line 123
    .line 124
    invoke-static {v5, v1, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    xor-int/lit8 v8, v2, 0x1

    .line 129
    .line 130
    const v6, 0x7f0606d8

    .line 131
    .line 132
    .line 133
    move v9, v8

    .line 134
    invoke-static/range {v4 .. v9}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 135
    .line 136
    .line 137
    :cond_3
    new-instance p0, La/pa2;

    .line 138
    .line 139
    const/16 p1, 0xa

    .line 140
    .line 141
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 142
    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v4, p0, La/la2;->b:Landroid/view/Window;

    .line 149
    .line 150
    if-eqz v4, :cond_4

    .line 151
    .line 152
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 153
    .line 154
    iget-object v5, p0, La/la2;->c:Landroid/content/Context;

    .line 155
    .line 156
    invoke-static {v5, v1, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    xor-int/lit8 v8, v2, 0x1

    .line 161
    .line 162
    const v6, 0x7f0606d8

    .line 163
    .line 164
    .line 165
    move v9, v8

    .line 166
    invoke-static/range {v4 .. v9}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 167
    .line 168
    .line 169
    :cond_4
    new-instance p0, La/pa2;

    .line 170
    .line 171
    const/16 p1, 0x8

    .line 172
    .line 173
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 174
    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    iget-object v4, p0, La/la2;->b:Landroid/view/Window;

    .line 181
    .line 182
    if-eqz v4, :cond_5

    .line 183
    .line 184
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 185
    .line 186
    iget-object v5, p0, La/la2;->c:Landroid/content/Context;

    .line 187
    .line 188
    invoke-static {v5, v1, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    xor-int/lit8 v8, v2, 0x1

    .line 193
    .line 194
    const v6, 0x7f0606d8

    .line 195
    .line 196
    .line 197
    move v9, v8

    .line 198
    invoke-static/range {v4 .. v9}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 199
    .line 200
    .line 201
    :cond_5
    new-instance p0, La/pa2;

    .line 202
    .line 203
    const/4 p1, 0x2

    .line 204
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 205
    .line 206
    .line 207
    return-object p0

    .line 208
    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    iget-object v4, p0, La/la2;->b:Landroid/view/Window;

    .line 212
    .line 213
    if-eqz v4, :cond_6

    .line 214
    .line 215
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 216
    .line 217
    iget-object v5, p0, La/la2;->c:Landroid/content/Context;

    .line 218
    .line 219
    invoke-static {v5, v1, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    xor-int/lit8 v8, v2, 0x1

    .line 224
    .line 225
    const v6, 0x7f0606d8

    .line 226
    .line 227
    .line 228
    move v9, v8

    .line 229
    invoke-static/range {v4 .. v9}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 230
    .line 231
    .line 232
    :cond_6
    new-instance p0, La/pa2;

    .line 233
    .line 234
    invoke-direct {p0, v3}, La/pa2;-><init>(B)V

    .line 235
    .line 236
    .line 237
    return-object p0

    .line 238
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    iget-object v4, p0, La/la2;->b:Landroid/view/Window;

    .line 242
    .line 243
    if-eqz v4, :cond_7

    .line 244
    .line 245
    sget-object p1, La/j5d;->a:Landroid/util/TypedValue;

    .line 246
    .line 247
    iget-object v5, p0, La/la2;->c:Landroid/content/Context;

    .line 248
    .line 249
    invoke-static {v5, v1, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 250
    .line 251
    .line 252
    move-result v7

    .line 253
    xor-int/lit8 v8, v2, 0x1

    .line 254
    .line 255
    const v6, 0x7f0606d8

    .line 256
    .line 257
    .line 258
    move v9, v8

    .line 259
    invoke-static/range {v4 .. v9}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 260
    .line 261
    .line 262
    :cond_7
    new-instance p0, La/pa2;

    .line 263
    .line 264
    const/4 p1, 0x0

    .line 265
    invoke-direct {p0, p1}, La/pa2;-><init>(B)V

    .line 266
    .line 267
    .line 268
    return-object p0

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
