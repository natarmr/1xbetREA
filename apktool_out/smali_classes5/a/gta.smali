.class public final La/gta;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cgk0;

.field public final synthetic c:La/cgk0;

.field public final synthetic d:La/xcz;

.field public final synthetic e:La/cgk0;


# direct methods
.method public synthetic constructor <init>(La/cgk0;La/cgk0;La/xcz;La/cgk0;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/gta;->a:B

    iput-object p1, p0, La/gta;->b:La/cgk0;

    iput-object p2, p0, La/gta;->c:La/cgk0;

    iput-object p3, p0, La/gta;->d:La/xcz;

    iput-object p4, p0, La/gta;->e:La/cgk0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte p2, p0, La/gta;->a:B

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    iget-object v1, p0, La/gta;->d:La/xcz;

    .line 5
    .line 6
    iget-object v2, p0, La/gta;->b:La/cgk0;

    .line 7
    .line 8
    iget-object v3, p0, La/gta;->e:La/cgk0;

    .line 9
    .line 10
    iget-object p0, p0, La/gta;->c:La/cgk0;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    packed-switch p2, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p1, Ljava/lang/Integer;

    .line 18
    .line 19
    if-eqz p1, :cond_6

    .line 20
    .line 21
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    sub-int/2addr p2, v6

    .line 30
    if-lez p2, :cond_2

    .line 31
    .line 32
    invoke-virtual {v1}, La/xcz;->j()La/mcz;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iget-object p2, p2, La/mcz;->l:Ljava/util/List;

    .line 37
    .line 38
    invoke-static {v4, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    check-cast p2, La/ncz;

    .line 43
    .line 44
    if-eqz p2, :cond_0

    .line 45
    .line 46
    iget p2, p2, La/ncz;->a:I

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move p2, v0

    .line 50
    :goto_0
    invoke-virtual {p0, p2}, La/cgk0;->m(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, La/xcz;->j()La/mcz;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 58
    .line 59
    invoke-static {v5, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/ncz;

    .line 64
    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    iget v0, p0, La/ncz;->a:I

    .line 68
    .line 69
    :cond_1
    invoke-virtual {v3, v0}, La/cgk0;->m(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    sub-int/2addr p2, v6

    .line 82
    if-gez p2, :cond_5

    .line 83
    .line 84
    invoke-virtual {v1}, La/xcz;->j()La/mcz;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iget-object p2, p2, La/mcz;->l:Ljava/util/List;

    .line 89
    .line 90
    invoke-static {v5, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    check-cast p2, La/ncz;

    .line 95
    .line 96
    if-eqz p2, :cond_3

    .line 97
    .line 98
    iget p2, p2, La/ncz;->a:I

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    move p2, v0

    .line 102
    :goto_1
    invoke-virtual {p0, p2}, La/cgk0;->m(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, La/xcz;->j()La/mcz;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 110
    .line 111
    invoke-static {v4, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, La/ncz;

    .line 116
    .line 117
    if-eqz p0, :cond_4

    .line 118
    .line 119
    iget v0, p0, La/ncz;->a:I

    .line 120
    .line 121
    :cond_4
    invoke-virtual {v3, v0}, La/cgk0;->m(I)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_5
    invoke-virtual {p0, v0}, La/cgk0;->m(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v0}, La/cgk0;->m(I)V

    .line 129
    .line 130
    .line 131
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    invoke-virtual {v2, p0}, La/cgk0;->m(I)V

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    :goto_3
    return-object p0

    .line 144
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 145
    .line 146
    if-eqz p1, :cond_d

    .line 147
    .line 148
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    sub-int/2addr p2, v6

    .line 157
    if-lez p2, :cond_9

    .line 158
    .line 159
    invoke-virtual {v1}, La/xcz;->j()La/mcz;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    iget-object p2, p2, La/mcz;->l:Ljava/util/List;

    .line 164
    .line 165
    invoke-static {v4, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    check-cast p2, La/ncz;

    .line 170
    .line 171
    if-eqz p2, :cond_7

    .line 172
    .line 173
    iget p2, p2, La/ncz;->a:I

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_7
    move p2, v0

    .line 177
    :goto_4
    invoke-virtual {p0, p2}, La/cgk0;->m(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1}, La/xcz;->j()La/mcz;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 185
    .line 186
    invoke-static {v5, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    check-cast p0, La/ncz;

    .line 191
    .line 192
    if-eqz p0, :cond_8

    .line 193
    .line 194
    iget v0, p0, La/ncz;->a:I

    .line 195
    .line 196
    :cond_8
    invoke-virtual {v3, v0}, La/cgk0;->m(I)V

    .line 197
    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_9
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    sub-int/2addr p2, v6

    .line 209
    if-gez p2, :cond_c

    .line 210
    .line 211
    invoke-virtual {v1}, La/xcz;->j()La/mcz;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    iget-object p2, p2, La/mcz;->l:Ljava/util/List;

    .line 216
    .line 217
    invoke-static {v5, p2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    check-cast p2, La/ncz;

    .line 222
    .line 223
    if-eqz p2, :cond_a

    .line 224
    .line 225
    iget p2, p2, La/ncz;->a:I

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_a
    move p2, v0

    .line 229
    :goto_5
    invoke-virtual {p0, p2}, La/cgk0;->m(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1}, La/xcz;->j()La/mcz;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 237
    .line 238
    invoke-static {v4, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    check-cast p0, La/ncz;

    .line 243
    .line 244
    if-eqz p0, :cond_b

    .line 245
    .line 246
    iget v0, p0, La/ncz;->a:I

    .line 247
    .line 248
    :cond_b
    invoke-virtual {v3, v0}, La/cgk0;->m(I)V

    .line 249
    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_c
    invoke-virtual {p0, v0}, La/cgk0;->m(I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3, v0}, La/cgk0;->m(I)V

    .line 256
    .line 257
    .line 258
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 259
    .line 260
    .line 261
    move-result p0

    .line 262
    invoke-virtual {v2, p0}, La/cgk0;->m(I)V

    .line 263
    .line 264
    .line 265
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    goto :goto_7

    .line 268
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 269
    .line 270
    :goto_7
    return-object p0

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
