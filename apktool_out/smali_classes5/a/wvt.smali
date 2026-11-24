.class public final La/wvt;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic i:B

.field public synthetic j:J

.field public synthetic k:Ljava/lang/Object;

.field public synthetic l:Ljava/lang/Object;


# direct methods
.method public constructor <init>(JLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/wvt;->i:B

    .line 3
    .line 4
    iput-wide p1, p0, La/wvt;->j:J

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 11
    iput-byte p3, p0, La/wvt;->i:B

    iput-object p1, p0, La/wvt;->l:Ljava/lang/Object;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/wvt;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Number;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    check-cast p2, La/fs20;

    .line 13
    .line 14
    check-cast p3, La/yje;

    .line 15
    .line 16
    new-instance p1, La/wvt;

    .line 17
    .line 18
    iget-object p0, p0, La/wvt;->l:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/zos;

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    invoke-direct {p1, p0, p3, v2}, La/wvt;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    iput-wide v0, p1, La/wvt;->j:J

    .line 27
    .line 28
    iput-object p2, p1, La/wvt;->k:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    invoke-virtual {p1, p0}, La/wvt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, La/mi1;

    .line 38
    .line 39
    check-cast p2, Ljava/util/List;

    .line 40
    .line 41
    check-cast p3, La/yje;

    .line 42
    .line 43
    new-instance v0, La/wvt;

    .line 44
    .line 45
    iget-wide v1, p0, La/wvt;->j:J

    .line 46
    .line 47
    invoke-direct {v0, v1, v2, p3}, La/wvt;-><init>(JLa/yje;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/wvt;->k:Ljava/lang/Object;

    .line 51
    .line 52
    iput-object p2, v0, La/wvt;->l:Ljava/lang/Object;

    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    invoke-virtual {v0, p0}, La/wvt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_1
    check-cast p1, Ljava/util/Map;

    .line 62
    .line 63
    check-cast p2, Ljava/lang/Number;

    .line 64
    .line 65
    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    .line 66
    .line 67
    .line 68
    move-result-wide v0

    .line 69
    check-cast p3, La/yje;

    .line 70
    .line 71
    new-instance p2, La/wvt;

    .line 72
    .line 73
    iget-object p0, p0, La/wvt;->l:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p0, La/jtj;

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    invoke-direct {p2, p0, p3, v2}, La/wvt;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 79
    .line 80
    .line 81
    check-cast p1, Ljava/util/Map;

    .line 82
    .line 83
    iput-object p1, p2, La/wvt;->k:Ljava/lang/Object;

    .line 84
    .line 85
    iput-wide v0, p2, La/wvt;->j:J

    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p2, p0}, La/wvt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/wvt;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-wide v2, p0, La/wvt;->j:J

    .line 8
    .line 9
    iget-object v0, p0, La/wvt;->k:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/fs20;

    .line 12
    .line 13
    sget-object v4, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    instance-of p1, v0, La/ds20;

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    cmp-long p1, v2, v4

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p0, p0, La/wvt;->l:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, La/zos;

    .line 31
    .line 32
    iget-wide p0, p0, La/zos;->a:J

    .line 33
    .line 34
    cmp-long p0, v2, p0

    .line 35
    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    new-instance v1, Ljava/lang/Long;

    .line 39
    .line 40
    invoke-direct {v1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-object v1

    .line 44
    :pswitch_0
    iget-object v0, p0, La/wvt;->k:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/mi1;

    .line 47
    .line 48
    iget-object v2, p0, La/wvt;->l:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Ljava/util/List;

    .line 51
    .line 52
    sget-object v3, La/wne;->a:La/wne;

    .line 53
    .line 54
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-wide p0, p0, La/wvt;->j:J

    .line 58
    .line 59
    iget-object v0, v0, La/mi1;->b:Ljava/util/List;

    .line 60
    .line 61
    new-instance v3, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    if-eqz v4, :cond_4

    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, La/x2q;

    .line 81
    .line 82
    iget-object v5, v4, La/x2q;->a:Ljava/lang/String;

    .line 83
    .line 84
    const-string v6, "products"

    .line 85
    .line 86
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_3

    .line 91
    .line 92
    new-instance v5, La/x2q;

    .line 93
    .line 94
    iget-object v6, v4, La/x2q;->a:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v7, v4, La/x2q;->b:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v4, v4, La/x2q;->c:La/w3q;

    .line 99
    .line 100
    invoke-direct {v5, v6, v7, v4, v2}, La/x2q;-><init>(Ljava/lang/String;Ljava/lang/String;La/w3q;Ljava/util/List;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_2

    .line 108
    .line 109
    move-object v4, v5

    .line 110
    goto :goto_1

    .line 111
    :cond_2
    move-object v4, v1

    .line 112
    goto :goto_1

    .line 113
    :cond_3
    iget-object v5, v4, La/x2q;->d:Ljava/util/List;

    .line 114
    .line 115
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-nez v5, :cond_2

    .line 120
    .line 121
    :goto_1
    if-eqz v4, :cond_1

    .line 122
    .line 123
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_4
    new-instance v0, La/mi1;

    .line 128
    .line 129
    invoke-direct {v0, p0, p1, v3}, La/mi1;-><init>(JLjava/util/List;)V

    .line 130
    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_1
    iget-object v0, p0, La/wvt;->l:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, La/jtj;

    .line 136
    .line 137
    iget-object v2, p0, La/wvt;->k:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v2, Ljava/util/Map;

    .line 140
    .line 141
    check-cast v2, Ljava/util/Map;

    .line 142
    .line 143
    iget-wide v3, p0, La/wvt;->j:J

    .line 144
    .line 145
    sget-object p0, La/wne;->a:La/wne;

    .line 146
    .line 147
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    new-instance p0, Ljava/lang/Long;

    .line 151
    .line 152
    invoke-direct {p0, v3, v4}, Ljava/lang/Long;-><init>(J)V

    .line 153
    .line 154
    .line 155
    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, Ljava/util/Set;

    .line 160
    .line 161
    if-eqz p0, :cond_5

    .line 162
    .line 163
    check-cast p0, Ljava/lang/Iterable;

    .line 164
    .line 165
    invoke-static {p0}, Lkotlin/collections/b;->E(Ljava/lang/Iterable;)Ljava/util/SortedSet;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    goto :goto_2

    .line 170
    :cond_5
    move-object p0, v1

    .line 171
    :goto_2
    if-nez p0, :cond_6

    .line 172
    .line 173
    sget-object p0, La/xun;->a:La/xun;

    .line 174
    .line 175
    :cond_6
    iget-object p1, v0, La/jtj;->c:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast p1, La/lef0;

    .line 178
    .line 179
    iget-object p1, p1, La/lef0;->a:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p1, La/t5g0;

    .line 182
    .line 183
    iget-object p1, p1, La/t5g0;->a:La/p7m0;

    .line 184
    .line 185
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    check-cast p1, La/v5g0;

    .line 190
    .line 191
    if-eqz p1, :cond_7

    .line 192
    .line 193
    iget-object p1, p1, La/v5g0;->b:Ljava/util/Date;

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_7
    move-object p1, v1

    .line 197
    :goto_3
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_8

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_8
    move-object p1, v1

    .line 205
    :goto_4
    if-nez p1, :cond_a

    .line 206
    .line 207
    move-object p1, p0

    .line 208
    check-cast p1, Ljava/util/Collection;

    .line 209
    .line 210
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    if-nez p1, :cond_9

    .line 215
    .line 216
    move-object p1, p0

    .line 217
    goto :goto_5

    .line 218
    :cond_9
    move-object p1, v1

    .line 219
    :goto_5
    if-eqz p1, :cond_b

    .line 220
    .line 221
    invoke-static {p1}, La/m2x;->z(Ljava/util/Set;)Ljava/util/Date;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    if-eqz p1, :cond_b

    .line 226
    .line 227
    iget-object v0, v0, La/jtj;->c:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, La/lef0;

    .line 230
    .line 231
    invoke-virtual {v0, p1}, La/lef0;->m(Ljava/util/Date;)V

    .line 232
    .line 233
    .line 234
    :cond_a
    move-object v1, p1

    .line 235
    :cond_b
    new-instance p1, Lkotlin/Pair;

    .line 236
    .line 237
    invoke-direct {p1, p0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    return-object p1

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
