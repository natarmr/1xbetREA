.class public final synthetic La/dv90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(IIB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/dv90;->a:B

    iput p1, p0, La/dv90;->b:I

    iput p2, p0, La/dv90;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/dv90;->a:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/high16 v2, 0x3f800000    # 1.0f

    .line 5
    .line 6
    sget-object v3, La/jm40;->b:La/jm40;

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    iget v7, p0, La/dv90;->c:I

    .line 12
    .line 13
    iget p0, p0, La/dv90;->b:I

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p1, La/oyg0;

    .line 19
    .line 20
    check-cast p2, La/ztr0;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object p1, p2, La/ztr0;->b:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, La/vd80;

    .line 35
    .line 36
    iget-object v1, v0, La/vd80;->d:Ljava/util/List;

    .line 37
    .line 38
    new-instance v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, La/ntr0;

    .line 53
    .line 54
    iget-boolean v3, v1, La/ntr0;->b:Z

    .line 55
    .line 56
    xor-int/2addr v3, v6

    .line 57
    invoke-static {v1, v3}, La/ntr0;->a(La/ntr0;Z)La/ntr0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {p1, v7, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    iget-boolean v1, v1, La/ntr0;->b:Z

    .line 65
    .line 66
    iget v3, v0, La/vd80;->c:I

    .line 67
    .line 68
    if-eqz v1, :cond_0

    .line 69
    .line 70
    add-int/2addr v3, v6

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    sub-int/2addr v3, v6

    .line 73
    :goto_0
    iget-object v4, v0, La/vd80;->d:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-ne v3, v4, :cond_1

    .line 80
    .line 81
    sget-object v4, La/be80;->a:La/be80;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_1
    if-nez v3, :cond_2

    .line 85
    .line 86
    sget-object v4, La/be80;->b:La/be80;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    sget-object v4, La/be80;->c:La/be80;

    .line 90
    .line 91
    :goto_1
    invoke-static {v0, v4, v3, p1}, La/vd80;->a(La/vd80;La/be80;ILjava/util/ArrayList;)La/vd80;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {v2, p0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget p0, p2, La/ztr0;->d:I

    .line 99
    .line 100
    if-eqz v1, :cond_3

    .line 101
    .line 102
    add-int/2addr p0, v6

    .line 103
    goto :goto_2

    .line 104
    :cond_3
    sub-int/2addr p0, v6

    .line 105
    :goto_2
    iget-object p1, p2, La/ztr0;->a:La/he80;

    .line 106
    .line 107
    iget p2, p2, La/ztr0;->c:I

    .line 108
    .line 109
    new-instance v0, La/ztr0;

    .line 110
    .line 111
    invoke-direct {v0, p1, v2, p2, p0}, La/ztr0;-><init>(La/he80;Ljava/util/List;II)V

    .line 112
    .line 113
    .line 114
    return-object v0

    .line 115
    :pswitch_0
    check-cast p1, La/fet;

    .line 116
    .line 117
    check-cast p2, Ljava/lang/Integer;

    .line 118
    .line 119
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 120
    .line 121
    .line 122
    move-result p2

    .line 123
    and-int/lit8 v0, p2, 0x3

    .line 124
    .line 125
    if-eq v0, v4, :cond_4

    .line 126
    .line 127
    move v5, v6

    .line 128
    :cond_4
    and-int/2addr p2, v6

    .line 129
    invoke-virtual {p1, p2, v5}, La/fet;->U(IZ)Z

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-eqz p2, :cond_5

    .line 134
    .line 135
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    sub-int/2addr p0, v7

    .line 140
    add-int/2addr p0, v6

    .line 141
    invoke-static {p0, v1, p1, p2}, La/zdx;->o(IILa/fet;La/mm40;)V

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 146
    .line 147
    .line 148
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_1
    check-cast p1, La/fet;

    .line 152
    .line 153
    check-cast p2, Ljava/lang/Integer;

    .line 154
    .line 155
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    and-int/lit8 v0, p2, 0x3

    .line 160
    .line 161
    if-eq v0, v4, :cond_6

    .line 162
    .line 163
    move v5, v6

    .line 164
    :cond_6
    and-int/2addr p2, v6

    .line 165
    invoke-virtual {p1, p2, v5}, La/fet;->U(IZ)Z

    .line 166
    .line 167
    .line 168
    move-result p2

    .line 169
    if-eqz p2, :cond_7

    .line 170
    .line 171
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    sub-int/2addr p0, v7

    .line 176
    add-int/2addr p0, v6

    .line 177
    invoke-static {p0, v1, p1, p2}, La/ydx;->s(IILa/fet;La/mm40;)V

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_7
    invoke-virtual {p1}, La/fet;->X()V

    .line 182
    .line 183
    .line 184
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object p0

    .line 187
    :pswitch_2
    check-cast p1, La/fet;

    .line 188
    .line 189
    check-cast p2, Ljava/lang/Integer;

    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    and-int/lit8 v0, p2, 0x3

    .line 196
    .line 197
    if-eq v0, v4, :cond_8

    .line 198
    .line 199
    move v5, v6

    .line 200
    :cond_8
    and-int/2addr p2, v6

    .line 201
    invoke-virtual {p1, p2, v5}, La/fet;->U(IZ)Z

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    if-eqz p2, :cond_9

    .line 206
    .line 207
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    sub-int/2addr p0, v7

    .line 212
    add-int/2addr p0, v6

    .line 213
    invoke-static {p0, v1, p1, p2}, La/xdx;->q(IILa/fet;La/mm40;)V

    .line 214
    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_9
    invoke-virtual {p1}, La/fet;->X()V

    .line 218
    .line 219
    .line 220
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object p0

    .line 223
    :pswitch_3
    check-cast p1, La/fet;

    .line 224
    .line 225
    check-cast p2, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 228
    .line 229
    .line 230
    move-result p2

    .line 231
    and-int/lit8 v0, p2, 0x3

    .line 232
    .line 233
    if-eq v0, v4, :cond_a

    .line 234
    .line 235
    move v5, v6

    .line 236
    :cond_a
    and-int/2addr p2, v6

    .line 237
    invoke-virtual {p1, p2, v5}, La/fet;->U(IZ)Z

    .line 238
    .line 239
    .line 240
    move-result p2

    .line 241
    if-eqz p2, :cond_b

    .line 242
    .line 243
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 244
    .line 245
    .line 246
    move-result-object p2

    .line 247
    sub-int/2addr p0, v7

    .line 248
    add-int/2addr p0, v6

    .line 249
    invoke-static {p0, v1, p1, p2}, La/wdx;->C(IILa/fet;La/mm40;)V

    .line 250
    .line 251
    .line 252
    goto :goto_6

    .line 253
    :cond_b
    invoke-virtual {p1}, La/fet;->X()V

    .line 254
    .line 255
    .line 256
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 257
    .line 258
    return-object p0

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
