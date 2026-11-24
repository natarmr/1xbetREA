.class public final La/s3t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:La/p7m0;

.field public final c:La/p7m0;

.field public final d:La/p7m0;

.field public final e:Ljava/util/List;

.field public final f:La/ol60;


# direct methods
.method public constructor <init>()V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/s3t0;->a:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    new-instance v0, La/o4g;

    .line 12
    .line 13
    sget-object v1, La/iun;->a:La/iun;

    .line 14
    .line 15
    invoke-direct {v0, v1, v1}, La/o4g;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/s3t0;->b:La/p7m0;

    .line 23
    .line 24
    invoke-static {}, La/s3t0;->b()La/c5g;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, La/s3t0;->c:La/p7m0;

    .line 33
    .line 34
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, La/s3t0;->d:La/p7m0;

    .line 39
    .line 40
    new-instance v1, La/k4g;

    .line 41
    .line 42
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const/16 v2, -0xc

    .line 47
    .line 48
    const/4 v3, 0x2

    .line 49
    invoke-virtual {v0, v3, v2}, Ljava/util/Calendar;->add(II)V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/16 v4, 0xc

    .line 57
    .line 58
    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->add(II)V

    .line 59
    .line 60
    .line 61
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 62
    .line 63
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-nez v5, :cond_1

    .line 71
    .line 72
    const/4 v5, 0x1

    .line 73
    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    add-int/2addr v7, v5

    .line 82
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    invoke-virtual {v4, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    if-nez v8, :cond_0

    .line 91
    .line 92
    new-instance v8, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-interface {v4, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    :cond_0
    check-cast v8, Ljava/util/List;

    .line 101
    .line 102
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-interface {v8, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v3, v5}, Ljava/util/Calendar;->add(II)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-interface {v4}, Ljava/util/Map;->size()I

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eqz v3, :cond_2

    .line 135
    .line 136
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    check-cast v3, Ljava/util/Map$Entry;

    .line 141
    .line 142
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    check-cast v4, Ljava/lang/Number;

    .line 147
    .line 148
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    check-cast v3, Ljava/util/List;

    .line 157
    .line 158
    new-instance v5, La/d5g;

    .line 159
    .line 160
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-direct {v5, v4, v3}, La/d5g;-><init>(ILjava/util/List;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_2
    new-instance v2, La/tgo0;

    .line 172
    .line 173
    const/16 v3, 0x18

    .line 174
    .line 175
    invoke-direct {v2, v3}, La/tgo0;-><init>(B)V

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    const-wide/16 v2, 0xbd

    .line 183
    .line 184
    const-wide/16 v4, 0x0

    .line 185
    .line 186
    invoke-direct/range {v1 .. v6}, La/k4g;-><init>(JJLjava/util/List;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iput-object v0, p0, La/s3t0;->e:Ljava/util/List;

    .line 194
    .line 195
    new-instance v0, La/ol60;

    .line 196
    .line 197
    const/4 v1, 0x3

    .line 198
    invoke-direct {v0, v1}, La/ol60;-><init>(I)V

    .line 199
    .line 200
    .line 201
    iput-object v0, p0, La/s3t0;->f:La/ol60;

    .line 202
    .line 203
    return-void
.end method

.method public static b()La/c5g;
    .locals 10

    .line 1
    const-string v0, "UTC"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljava/util/Date;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 21
    .line 22
    .line 23
    new-instance v3, La/c5g;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    const/4 v1, 0x5

    .line 36
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    sget-object v8, La/yag;->a:La/yag;

    .line 45
    .line 46
    const/4 v9, 0x0

    .line 47
    invoke-direct/range {v3 .. v9}, La/c5g;-><init>(IIIILa/yag;Z)V

    .line 48
    .line 49
    .line 50
    return-object v3
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/r3t0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/r3t0;

    .line 7
    .line 8
    iget v1, v0, La/r3t0;->k:I

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
    iput v1, v0, La/r3t0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/r3t0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/r3t0;-><init>(La/s3t0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/r3t0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/r3t0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, La/s3t0;->a:Ljava/util/LinkedHashMap;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->clear()V

    .line 60
    .line 61
    .line 62
    sget-object p1, La/iun;->a:La/iun;

    .line 63
    .line 64
    iput v5, v0, La/r3t0;->k:I

    .line 65
    .line 66
    iget-object v2, p0, La/s3t0;->d:La/p7m0;

    .line 67
    .line 68
    invoke-virtual {v2, p1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    if-ne p1, v1, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    :goto_1
    invoke-static {}, La/s3t0;->b()La/c5g;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput v4, v0, La/r3t0;->k:I

    .line 81
    .line 82
    iget-object v0, p0, La/s3t0;->c:La/p7m0;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    if-ne p1, v1, :cond_5

    .line 93
    .line 94
    :goto_2
    return-object v1

    .line 95
    :cond_5
    :goto_3
    iget-object p0, p0, La/s3t0;->f:La/ol60;

    .line 96
    .line 97
    iget-object p1, p0, La/ol60;->d:Ljava/util/concurrent/LinkedBlockingDeque;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/util/concurrent/LinkedBlockingDeque;->clear()V

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, La/ol60;->e:La/n0o0;

    .line 103
    .line 104
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/util/concurrent/LinkedBlockingDeque;->clear()V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0
.end method
