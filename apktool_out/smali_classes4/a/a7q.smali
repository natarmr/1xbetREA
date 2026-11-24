.class public final La/a7q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cfr;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/b6s;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, La/a7q;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p2, La/wgn;

    .line 11
    .line 12
    const/16 v0, 0xc

    .line 13
    .line 14
    invoke-direct {p2, p1, v0}, La/wgn;-><init>(La/gii0;B)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/a7q;->a:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance p2, La/wgn;

    .line 24
    .line 25
    const/16 v0, 0x16

    .line 26
    .line 27
    invoke-direct {p2, p1, v0}, La/wgn;-><init>(La/gii0;B)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, La/a7q;->a:Ljava/lang/Object;

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/kkc;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, La/a7q;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/nfm0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, La/a7q;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/oh9;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, La/a7q;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/or9;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, La/a7q;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/oue0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, La/a7q;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/tv3;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, La/a7q;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 45
    iput-object p1, p0, La/a7q;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(JJ)La/vsg0;
    .locals 8

    .line 1
    new-instance v0, La/wg0;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v7, 0x5

    .line 5
    move-object v1, p0

    .line 6
    move-wide v2, p1

    .line 7
    move-wide v4, p3

    .line 8
    invoke-direct/range {v0 .. v7}, La/wg0;-><init>(Ljava/lang/Object;JJLa/yje;B)V

    .line 9
    .line 10
    .line 11
    new-instance p0, La/vsg0;

    .line 12
    .line 13
    invoke-direct {p0, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public b(La/wep;)La/p7m0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/a7q;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/rrc;

    .line 7
    .line 8
    iget-object p0, p0, La/rrc;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/t6p;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, La/t6p;->b:La/p7m0;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0

    .line 29
    :cond_1
    iget-object p0, p0, La/t6p;->a:La/p7m0;

    .line 30
    .line 31
    return-object p0
.end method

.method public c(La/zje;)Ljava/io/Serializable;
    .locals 7

    .line 1
    instance-of v0, p1, La/zvt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/zvt;

    .line 7
    .line 8
    iget v1, v0, La/zvt;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/zvt;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/zvt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/zvt;-><init>(La/a7q;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/zvt;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/zvt;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/a7q;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/or9;

    .line 53
    .line 54
    iput v3, v0, La/zvt;->k:I

    .line 55
    .line 56
    invoke-virtual {p0, v0}, La/or9;->a(La/zje;)Ljava/io/Serializable;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Iterable;

    .line 64
    .line 65
    new-instance p0, La/vvt;

    .line 66
    .line 67
    const/4 v0, 0x2

    .line 68
    invoke-direct {p0, v0}, La/vvt;-><init>(B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    move-object v1, v0

    .line 95
    check-cast v1, La/it9;

    .line 96
    .line 97
    iget-wide v1, v1, La/it9;->b:J

    .line 98
    .line 99
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    new-instance v4, Ljava/util/GregorianCalendar;

    .line 107
    .line 108
    invoke-direct {v4}, Ljava/util/GregorianCalendar;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/util/Calendar;->clear()V

    .line 112
    .line 113
    .line 114
    const-wide/16 v5, 0x3e8

    .line 115
    .line 116
    mul-long/2addr v1, v5

    .line 117
    invoke-virtual {v4, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 128
    .line 129
    .line 130
    const/16 v1, 0xb

    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    invoke-virtual {v3, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 134
    .line 135
    .line 136
    const/16 v1, 0xc

    .line 137
    .line 138
    invoke-virtual {v3, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 139
    .line 140
    .line 141
    const/16 v1, 0xd

    .line 142
    .line 143
    invoke-virtual {v3, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 144
    .line 145
    .line 146
    const/16 v1, 0xe

    .line 147
    .line 148
    invoke-virtual {v3, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 152
    .line 153
    .line 154
    move-result-wide v1

    .line 155
    new-instance v3, Ljava/lang/Long;

    .line 156
    .line 157
    invoke-direct {v3, v1, v2}, Ljava/lang/Long;-><init>(J)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    if-nez v1, :cond_4

    .line 165
    .line 166
    new-instance v1, Ljava/util/ArrayList;

    .line 167
    .line 168
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 169
    .line 170
    .line 171
    invoke-interface {p1, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    :cond_4
    check-cast v1, Ljava/util/List;

    .line 175
    .line 176
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_5
    new-instance p0, Ljava/util/ArrayList;

    .line 181
    .line 182
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    if-eqz v0, :cond_6

    .line 202
    .line 203
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, Ljava/util/Map$Entry;

    .line 208
    .line 209
    new-instance v1, La/xq9;

    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    check-cast v2, Ljava/lang/Number;

    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 218
    .line 219
    .line 220
    move-result-wide v2

    .line 221
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    check-cast v0, Ljava/util/List;

    .line 226
    .line 227
    invoke-direct {v1, v2, v3, v0}, La/xq9;-><init>(JLjava/util/List;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_6
    return-object p0
.end method

.method public d(ILa/zje;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/d6u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/d6u;

    .line 7
    .line 8
    iget v1, v0, La/d6u;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/d6u;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/d6u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/d6u;-><init>(La/a7q;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/d6u;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/d6u;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-boolean p4, v0, La/d6u;->i:Z

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p3}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_4

    .line 57
    .line 58
    iget-object p0, p0, La/a7q;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, La/ali;

    .line 61
    .line 62
    iput-boolean p4, v0, La/d6u;->i:Z

    .line 63
    .line 64
    iput v3, v0, La/d6u;->l:I

    .line 65
    .line 66
    invoke-virtual {p0, p1, v0}, La/ali;->g(ILa/zje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    if-ne p2, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    move-object p3, p2

    .line 74
    check-cast p3, Ljava/lang/String;

    .line 75
    .line 76
    :cond_4
    const-string p0, ""

    .line 77
    .line 78
    const/4 p1, 0x0

    .line 79
    const-string p2, "https://"

    .line 80
    .line 81
    invoke-static {p3, p2, p0, p1}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-eqz p4, :cond_5

    .line 86
    .line 87
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    :cond_5
    return-object p0
.end method

.method public e(La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object p0, p0, La/a7q;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/kkc;

    .line 4
    .line 5
    iget-object v0, p0, La/kkc;->b:La/ikc;

    .line 6
    .line 7
    iget-object v0, v0, La/ikc;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, La/kkc;->d:La/mne;

    .line 16
    .line 17
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 18
    .line 19
    new-instance v1, La/igb;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x7

    .line 23
    invoke-direct {v1, p0, v2, v3}, La/igb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1, p1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object p1, La/wne;->a:La/wne;

    .line 31
    .line 32
    if-ne p0, p1, :cond_0

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_0
    check-cast p0, Ljava/util/List;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_1
    return-object v0
.end method

.method public f(Ljava/lang/String;La/nbq;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/z6q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/z6q;

    .line 7
    .line 8
    iget v1, v0, La/z6q;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/z6q;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/z6q;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/z6q;-><init>(La/a7q;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/z6q;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/z6q;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/a7q;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/wgn;

    .line 53
    .line 54
    invoke-virtual {p0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/y5q;

    .line 59
    .line 60
    iput v3, v0, La/z6q;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, p2, v0}, La/y5q;->a(Ljava/lang/String;La/nbq;La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    if-ne p3, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p3, La/q16;

    .line 70
    .line 71
    invoke-virtual {p3}, La/q16;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public g(Ljava/lang/Runnable;Ljava/lang/String;)V
    .locals 10

    .line 1
    sget-object p2, La/ytn;->a:La/ytn;

    .line 2
    .line 3
    sget-object v1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 4
    .line 5
    sget-object v2, La/jbs0;->a:La/sd90;

    .line 6
    .line 7
    iget-object v0, v2, La/sd90;->b:La/mmn;

    .line 8
    .line 9
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object v3, v2, La/sd90;->c:La/yyb0;

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    iget-object v6, v3, La/yyb0;->e:La/ncq0;

    .line 29
    .line 30
    iget-object v7, v3, La/yyb0;->f:La/ncq0;

    .line 31
    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    iget-wide v8, v6, La/ncq0;->d:J

    .line 35
    .line 36
    cmp-long v8, v8, v4

    .line 37
    .line 38
    if-nez v8, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    if-eqz v7, :cond_2

    .line 42
    .line 43
    iget-wide v8, v7, La/ncq0;->d:J

    .line 44
    .line 45
    cmp-long v6, v8, v4

    .line 46
    .line 47
    if-nez v6, :cond_2

    .line 48
    .line 49
    move-object v6, v7

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {}, Landroid/system/Os;->gettid()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    int-to-long v6, v6

    .line 56
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual/range {v3 .. v8}, La/yyb0;->c(JJLjava/lang/String;)La/ncq0;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    iget-object v0, v3, La/yyb0;->e:La/ncq0;

    .line 65
    .line 66
    iput-object v0, v3, La/yyb0;->f:La/ncq0;

    .line 67
    .line 68
    iput-object v6, v3, La/yyb0;->e:La/ncq0;

    .line 69
    .line 70
    :goto_0
    iget-object v0, v6, La/z7k0;->c:La/nek;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    iget-object v0, v6, La/z7k0;->c:La/nek;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, La/a7q;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Landroidx/fragment/app/Fragment;

    .line 83
    .line 84
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->f:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 90
    .line 91
    .line 92
    iget p0, p0, Landroidx/fragment/app/Fragment;->z:I

    .line 93
    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 100
    const-wide/16 v3, 0x1

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    instance-of p1, p2, Ljava/lang/AutoCloseable;

    .line 107
    .line 108
    if-eqz p1, :cond_4

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    instance-of p1, p2, Ljava/util/concurrent/ExecutorService;

    .line 112
    .line 113
    if-eqz p1, :cond_9

    .line 114
    .line 115
    check-cast p2, Ljava/util/concurrent/ExecutorService;

    .line 116
    .line 117
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p2, p1, :cond_5

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-nez p1, :cond_8

    .line 129
    .line 130
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 131
    .line 132
    .line 133
    :cond_6
    :goto_2
    if-nez p1, :cond_7

    .line 134
    .line 135
    :try_start_1
    invoke-interface {p2, v3, v4, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 136
    .line 137
    .line 138
    move-result p1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 139
    goto :goto_2

    .line 140
    :catch_0
    if-nez v5, :cond_6

    .line 141
    .line 142
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move v5, p0

    .line 146
    goto :goto_2

    .line 147
    :cond_7
    if-eqz v5, :cond_8

    .line 148
    .line 149
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 154
    .line 155
    .line 156
    :cond_8
    :goto_3
    return-void

    .line 157
    :cond_9
    invoke-static {}, La/e9d0;->o()V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :catchall_0
    move-exception v0

    .line 162
    move-object p1, v0

    .line 163
    :try_start_2
    invoke-static {v2, p1}, La/ghm0;->r(La/jbs0;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    const/4 p1, 0x0

    .line 167
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 168
    :catchall_1
    move-exception v0

    .line 169
    move-object p1, v0

    .line 170
    instance-of v0, p2, Ljava/lang/AutoCloseable;

    .line 171
    .line 172
    if-nez v0, :cond_d

    .line 173
    .line 174
    instance-of v0, p2, Ljava/util/concurrent/ExecutorService;

    .line 175
    .line 176
    if-eqz v0, :cond_c

    .line 177
    .line 178
    check-cast p2, Ljava/util/concurrent/ExecutorService;

    .line 179
    .line 180
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    if-eq p2, v0, :cond_d

    .line 185
    .line 186
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-nez v0, :cond_d

    .line 191
    .line 192
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 193
    .line 194
    .line 195
    :cond_a
    :goto_4
    if-nez v0, :cond_b

    .line 196
    .line 197
    :try_start_3
    invoke-interface {p2, v3, v4, v1}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 198
    .line 199
    .line 200
    move-result v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_1

    .line 201
    goto :goto_4

    .line 202
    :catch_1
    if-nez v5, :cond_a

    .line 203
    .line 204
    invoke-interface {p2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move v5, p0

    .line 208
    goto :goto_4

    .line 209
    :cond_b
    if-eqz v5, :cond_d

    .line 210
    .line 211
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_c
    invoke-static {}, La/e9d0;->o()V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_d
    :goto_5
    throw p1
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/a7q;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/tu9;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/tu9;->d(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/a7q;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/tu9;

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0, p1}, La/tu9;->b(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    invoke-virtual {p0, p1}, La/tu9;->d(Ljava/lang/Throwable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
