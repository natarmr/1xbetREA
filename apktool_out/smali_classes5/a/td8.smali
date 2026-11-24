.class public final synthetic La/td8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/td8;->a:B

    iput-object p1, p0, La/td8;->b:Ljava/util/ArrayList;

    iput-object p2, p0, La/td8;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/td8;->a:B

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const v3, 0x799532c4

    .line 7
    .line 8
    .line 9
    const v4, 0x2fd4df92

    .line 10
    .line 11
    .line 12
    iget-object v5, p0, La/td8;->c:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    iget-object p0, p0, La/td8;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v6, 0x1

    .line 17
    const/4 v7, 0x0

    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast p1, La/hcz;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v0, La/acm0;

    .line 27
    .line 28
    invoke-direct {v0, v7}, La/acm0;-><init>(B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    new-instance v2, La/o3l0;

    .line 36
    .line 37
    const/16 v4, 0x1b

    .line 38
    .line 39
    invoke-direct {v2, v0, p0, v4}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    new-instance v0, La/t9l0;

    .line 43
    .line 44
    const/4 v4, 0x5

    .line 45
    invoke-direct {v0, p0, v4}, La/t9l0;-><init>(Ljava/util/ArrayList;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/h8w;

    .line 49
    .line 50
    const/16 v7, 0x1a

    .line 51
    .line 52
    invoke-direct {v4, p0, p0, v5, v7}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 53
    .line 54
    .line 55
    new-instance p0, La/ugd;

    .line 56
    .line 57
    invoke-direct {p0, v3, v6, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v1, v2, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_0
    check-cast p1, La/hcz;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    new-instance v3, La/j13;

    .line 76
    .line 77
    invoke-direct {v3, p0, v1, v7}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 78
    .line 79
    .line 80
    new-instance v1, La/sh0;

    .line 81
    .line 82
    const/16 v7, 0x8

    .line 83
    .line 84
    invoke-direct {v1, p0, v5, v7}, La/sh0;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;B)V

    .line 85
    .line 86
    .line 87
    new-instance p0, La/ugd;

    .line 88
    .line 89
    invoke-direct {p0, v4, v6, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0, v2, v3, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_1
    check-cast p1, La/hcz;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v0, La/bue0;

    .line 104
    .line 105
    invoke-direct {v0, v7}, La/bue0;-><init>(B)V

    .line 106
    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    new-instance v2, La/zu90;

    .line 113
    .line 114
    const/16 v3, 0x1c

    .line 115
    .line 116
    invoke-direct {v2, v3, v0, p0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    new-instance v0, La/j13;

    .line 120
    .line 121
    const/16 v3, 0x18

    .line 122
    .line 123
    invoke-direct {v0, p0, v3, v7}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 124
    .line 125
    .line 126
    new-instance v3, La/sh0;

    .line 127
    .line 128
    const/4 v7, 0x7

    .line 129
    invoke-direct {v3, p0, v5, v7}, La/sh0;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;B)V

    .line 130
    .line 131
    .line 132
    new-instance p0, La/ugd;

    .line 133
    .line 134
    invoke-direct {p0, v4, v6, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v1, v2, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 138
    .line 139
    .line 140
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object p0

    .line 143
    :pswitch_2
    check-cast p1, La/hcz;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    new-instance v1, La/j13;

    .line 153
    .line 154
    const/16 v3, 0x15

    .line 155
    .line 156
    invoke-direct {v1, p0, v3, v7}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 157
    .line 158
    .line 159
    new-instance v3, La/sh0;

    .line 160
    .line 161
    const/4 v7, 0x6

    .line 162
    invoke-direct {v3, p0, v5, v7}, La/sh0;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;B)V

    .line 163
    .line 164
    .line 165
    new-instance p0, La/ugd;

    .line 166
    .line 167
    invoke-direct {p0, v4, v6, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v0, v2, v1, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 171
    .line 172
    .line 173
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_3
    move-object v0, p1

    .line 177
    check-cast v0, La/xdz;

    .line 178
    .line 179
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    new-instance v3, La/j13;

    .line 187
    .line 188
    const/16 p1, 0xc

    .line 189
    .line 190
    invoke-direct {v3, p0, p1, v7}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 191
    .line 192
    .line 193
    new-instance p1, La/sh0;

    .line 194
    .line 195
    const/4 v2, 0x3

    .line 196
    invoke-direct {p1, p0, v5, v2}, La/sh0;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;B)V

    .line 197
    .line 198
    .line 199
    new-instance v5, La/ugd;

    .line 200
    .line 201
    const p0, -0x13f780b2

    .line 202
    .line 203
    .line 204
    invoke-direct {v5, p0, v6, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    const/4 v2, 0x0

    .line 208
    const/4 v4, 0x0

    .line 209
    invoke-virtual/range {v0 .. v5}, La/xdz;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ebz;La/ugd;)V

    .line 210
    .line 211
    .line 212
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object p0

    .line 215
    :pswitch_4
    check-cast p1, La/hcz;

    .line 216
    .line 217
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    new-instance v0, La/i87;

    .line 221
    .line 222
    invoke-direct {v0, v1}, La/i87;-><init>(B)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    new-instance v2, La/at7;

    .line 230
    .line 231
    const/4 v4, 0x2

    .line 232
    invoke-direct {v2, v0, p0, v4}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 233
    .line 234
    .line 235
    new-instance v0, La/j13;

    .line 236
    .line 237
    invoke-direct {v0, p0, v4, v7}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 238
    .line 239
    .line 240
    new-instance v4, La/sh0;

    .line 241
    .line 242
    invoke-direct {v4, p0, v5, v6}, La/sh0;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;B)V

    .line 243
    .line 244
    .line 245
    new-instance p0, La/ugd;

    .line 246
    .line 247
    invoke-direct {p0, v3, v6, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1, v1, v2, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 251
    .line 252
    .line 253
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object p0

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
