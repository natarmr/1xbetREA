.class public final synthetic La/rrj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m7h0;


# direct methods
.method public synthetic constructor <init>(La/m7h0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rrj;->a:B

    iput-object p1, p0, La/rrj;->b:La/m7h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/rrj;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rrj;->b:La/m7h0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/lf50;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p0}, La/qxw;->w(La/lf50;La/m7h0;)La/wul0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object v0, p1, La/lf50;->a:Ljava/util/List;

    .line 21
    .line 22
    iget-object v1, p1, La/lf50;->b:La/re50;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v3, 0x0

    .line 26
    if-nez v1, :cond_7

    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/ve50;

    .line 33
    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    goto/16 :goto_1

    .line 37
    .line 38
    :cond_0
    instance-of v4, v1, La/se50;

    .line 39
    .line 40
    const/4 v5, 0x6

    .line 41
    if-eqz v4, :cond_4

    .line 42
    .line 43
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    instance-of v4, v1, La/se50;

    .line 48
    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    move-object v1, v3

    .line 52
    :cond_1
    check-cast v1, La/se50;

    .line 53
    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_2
    iget-object v4, v1, La/se50;->b:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    if-eqz v6, :cond_3

    .line 65
    .line 66
    const/4 v4, 0x2

    .line 67
    invoke-static {v1, p0, v3, v4}, La/se50;->d(La/se50;La/wul0;Ljava/util/List;I)La/se50;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    goto :goto_0

    .line 72
    :cond_3
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->P(ILjava/util/List;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-static {v4, p0}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {v1, v3, p0, v2}, La/se50;->d(La/se50;La/wul0;Ljava/util/List;I)La/se50;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :goto_0
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->P(ILjava/util/List;)Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p1, p0, v3, v3, v5}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    goto :goto_1

    .line 97
    :cond_4
    instance-of v1, v1, La/ue50;

    .line 98
    .line 99
    if-eqz v1, :cond_9

    .line 100
    .line 101
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    instance-of v4, v1, La/ue50;

    .line 106
    .line 107
    if-nez v4, :cond_5

    .line 108
    .line 109
    move-object v1, v3

    .line 110
    :cond_5
    check-cast v1, La/ue50;

    .line 111
    .line 112
    if-nez v1, :cond_6

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    new-instance v1, La/ue50;

    .line 116
    .line 117
    invoke-direct {v1, p0}, La/ue50;-><init>(La/wul0;)V

    .line 118
    .line 119
    .line 120
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->P(ILjava/util/List;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p1, p0, v3, v3, v5}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    goto :goto_1

    .line 133
    :cond_7
    iget-object v0, v1, La/re50;->c:Ljava/util/List;

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    const/4 v4, 0x5

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    invoke-static {v1, p0, v3, v4}, La/re50;->d(La/re50;La/wul0;Ljava/util/List;I)La/re50;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-static {p1, v3, p0, v3, v4}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    goto :goto_1

    .line 151
    :cond_8
    iget-object v0, v1, La/re50;->c:Ljava/util/List;

    .line 152
    .line 153
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->P(ILjava/util/List;)Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    const/4 v0, 0x3

    .line 162
    invoke-static {v1, v3, p0, v0}, La/re50;->d(La/re50;La/wul0;Ljava/util/List;I)La/re50;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {p1, v3, p0, v3, v4}, La/lf50;->a(La/lf50;Ljava/util/List;La/re50;La/pe50;I)La/lf50;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    :cond_9
    :goto_1
    return-object p1

    .line 171
    :pswitch_0
    check-cast p1, La/i1w0;

    .line 172
    .line 173
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    if-eqz p0, :cond_b

    .line 177
    .line 178
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 179
    .line 180
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    instance-of v1, p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 184
    .line 185
    if-eqz v1, :cond_a

    .line 186
    .line 187
    new-instance v1, La/e1w0;

    .line 188
    .line 189
    check-cast p0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 190
    .line 191
    invoke-direct {v1, p0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 192
    .line 193
    .line 194
    new-instance p0, La/c8d;

    .line 195
    .line 196
    sget-object v2, La/y7d;->a:La/v7d;

    .line 197
    .line 198
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    goto :goto_2

    .line 205
    :cond_a
    new-instance v1, La/w0w0;

    .line 206
    .line 207
    invoke-direct {v1, p0}, La/w0w0;-><init>(La/m7h0;)V

    .line 208
    .line 209
    .line 210
    new-instance p0, La/c8d;

    .line 211
    .line 212
    sget-object v2, La/y7d;->a:La/v7d;

    .line 213
    .line 214
    invoke-direct {p0, v2, v1}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    :goto_2
    const/4 p0, 0x0

    .line 221
    invoke-static {p1, v0, p0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    :goto_3
    move-object v0, p0

    .line 226
    check-cast v0, La/paw;

    .line 227
    .line 228
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-eqz v1, :cond_b

    .line 233
    .line 234
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, La/oe50;

    .line 239
    .line 240
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object p0

    .line 247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
