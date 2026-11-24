.class public abstract La/ahb;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z


# direct methods
.method public static final A(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v0, ", "

    .line 12
    .line 13
    invoke-static {p0, v0, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :goto_0
    const-string p1, "1"

    .line 18
    .line 19
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/lang/String;

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    const-string p1, ""

    .line 28
    .line 29
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-lez p2, :cond_2

    .line 34
    .line 35
    const-string p2, ". "

    .line 36
    .line 37
    invoke-static {p0, p2, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    :cond_2
    return-object p0
.end method

.method public static B(Landroid/content/Context;La/vf5;)Lorg/xplatform/uikit/components/badges/DsBadge;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lorg/xplatform/uikit/components/badges/DsBadge;

    .line 8
    .line 9
    new-instance v1, La/tje;

    .line 10
    .line 11
    sget-object v2, Lorg/xplatform/uikit/components/badges/DsBadge;->e:[Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    aget-object p1, v2, p1

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-direct {v1, p0, p1}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    const/4 p1, 0x6

    .line 28
    invoke-direct {v0, v1, p0, p1}, Lorg/xplatform/uikit/components/badges/DsBadge;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public static final C(La/jvn;DLa/p3u0;)Ljava/lang/String;
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmpg-double v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    const-string p0, "-"

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 15
    .line 16
    if-eqz p0, :cond_8

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    const/4 v1, 0x2

    .line 20
    if-eq p0, v0, :cond_7

    .line 21
    .line 22
    if-eq p0, v1, :cond_6

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    .line 26
    .line 27
    if-eq p0, v0, :cond_5

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    if-eq p0, v0, :cond_3

    .line 31
    .line 32
    const/4 v0, 0x5

    .line 33
    if-ne p0, v0, :cond_2

    .line 34
    .line 35
    sub-double/2addr p1, v2

    .line 36
    cmpl-double p0, p1, v2

    .line 37
    .line 38
    if-lez p0, :cond_1

    .line 39
    .line 40
    div-double p1, v4, p1

    .line 41
    .line 42
    :cond_1
    sget-object p0, La/pn40;->a:La/pn40;

    .line 43
    .line 44
    invoke-static {p1, p2, p3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0

    .line 54
    :cond_3
    sub-double/2addr p1, v2

    .line 55
    cmpg-double p0, p1, v2

    .line 56
    .line 57
    if-gez p0, :cond_4

    .line 58
    .line 59
    div-double p1, v4, p1

    .line 60
    .line 61
    :cond_4
    sget-object p0, La/pn40;->a:La/pn40;

    .line 62
    .line 63
    invoke-static {p1, p2, p3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0

    .line 68
    :cond_5
    add-double/2addr p1, v4

    .line 69
    sget-object p0, La/pn40;->a:La/pn40;

    .line 70
    .line 71
    invoke-static {p1, p2, p3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0

    .line 76
    :cond_6
    sget-object p0, La/pn40;->a:La/pn40;

    .line 77
    .line 78
    invoke-static {p1, p2, p3}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_7
    const-wide/16 v2, 0x3e8

    .line 84
    .line 85
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {p1, p2}, Ljava/math/BigDecimal;->valueOf(D)Ljava/math/BigDecimal;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, p0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/math/BigInteger;->abs()Ljava/math/BigInteger;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2, p0}, Ljava/math/BigInteger;->gcd(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    sget-object p3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p0, p2}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    filled-new-array {p1, p0}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    const-string p1, "%s/%s"

    .line 165
    .line 166
    invoke-static {p3, p1, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    return-object p0

    .line 171
    :cond_8
    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 172
    .line 173
    cmpl-double p0, p1, v4

    .line 174
    .line 175
    if-ltz p0, :cond_9

    .line 176
    .line 177
    sub-double/2addr p1, v2

    .line 178
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 179
    .line 180
    mul-double/2addr p1, v2

    .line 181
    goto :goto_0

    .line 182
    :cond_9
    const-wide/high16 v4, -0x3fa7000000000000L    # -100.0

    .line 183
    .line 184
    sub-double/2addr p1, v2

    .line 185
    div-double p1, v4, p1

    .line 186
    .line 187
    :goto_0
    cmpl-double p0, p1, v0

    .line 188
    .line 189
    if-lez p0, :cond_a

    .line 190
    .line 191
    const-string p0, "+"

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_a
    const-string p0, ""

    .line 195
    .line 196
    :goto_1
    double-to-int p1, p1

    .line 197
    invoke-static {p1, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    return-object p0
.end method

.method public static final D(La/l2g0;)La/a2m;
    .locals 10

    .line 1
    invoke-static {p0}, La/ahb;->I(La/l2g0;)La/t480;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, La/xkb;->P()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_2

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, La/yxg;

    .line 34
    .line 35
    iget-wide v3, v3, La/yxg;->b:J

    .line 36
    .line 37
    iget-wide v5, p0, La/l2g0;->c:J

    .line 38
    .line 39
    cmp-long v3, v3, v5

    .line 40
    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    :cond_2
    :goto_0
    sget-object v4, La/c2m;->a:La/c2m;

    .line 45
    .line 46
    if-nez v0, :cond_3

    .line 47
    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    new-instance p0, La/z1m;

    .line 51
    .line 52
    invoke-direct {p0, v4}, La/z1m;-><init>(La/d2m;)V

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_3
    new-instance v3, La/y1m;

    .line 57
    .line 58
    new-instance v5, La/x1m;

    .line 59
    .line 60
    invoke-direct {v5}, La/x1m;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, La/ahb;->H(La/l2g0;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-static {p0}, La/ahb;->M(La/l2g0;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x0

    .line 73
    invoke-direct/range {v3 .. v9}, La/y1m;-><init>(La/d2m;La/x1m;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 74
    .line 75
    .line 76
    return-object v3
.end method

.method public static final E(La/l2g0;La/ctf0;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    iget-wide v1, p0, La/l2g0;->s:J

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    sget-object p0, La/rdj;->a:La/rdj;

    .line 16
    .line 17
    invoke-virtual {p1}, La/ctf0;->h()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    sget-object p1, La/efj;->c:La/efj;

    .line 22
    .line 23
    new-instance v2, La/ynq0;

    .line 24
    .line 25
    invoke-direct {v2, v0, v1}, La/ynq0;-><init>(J)V

    .line 26
    .line 27
    .line 28
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/4 v0, 0x1

    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    invoke-static {v2, p1, p0, v0, v1}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static final F(La/d0t;La/dmr;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object p0, p0, La/d0t;->p:La/rqs;

    .line 2
    .line 3
    iget-object p0, p0, La/rqs;->n:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v2, v0

    .line 21
    check-cast v2, La/cmr;

    .line 22
    .line 23
    iget-object v2, v2, La/cmr;->a:La/dmr;

    .line 24
    .line 25
    if-ne v2, p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v0, v1

    .line 29
    :goto_0
    check-cast v0, La/cmr;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v1, v0, La/cmr;->b:Ljava/lang/String;

    .line 34
    .line 35
    :cond_2
    if-nez v1, :cond_3

    .line 36
    .line 37
    const-string p0, ""

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_3
    return-object v1
.end method

.method public static final G(La/z0w;La/ctf0;ZZZLjava/lang/String;)La/i4;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, La/rdj;->a:La/rdj;

    .line 8
    .line 9
    iget-object v0, p1, La/ctf0;->b:La/lsm0;

    .line 10
    .line 11
    invoke-virtual {p1}, La/ctf0;->h()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    iget-wide v1, p0, La/z0w;->f:J

    .line 16
    .line 17
    sget-object v3, La/efj;->c:La/efj;

    .line 18
    .line 19
    new-instance v4, La/znq0;

    .line 20
    .line 21
    invoke-direct {v4, v1, v2}, La/znq0;-><init>(J)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/16 v1, 0x38

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-static {v4, v3, p1, v2, v1}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-lez v3, :cond_0

    .line 44
    .line 45
    new-instance v3, La/too0;

    .line 46
    .line 47
    iget-wide v4, p0, La/z0w;->i:J

    .line 48
    .line 49
    const-string v6, "date"

    .line 50
    .line 51
    invoke-static {v4, v5, v6}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-direct {v3, v4, p1}, La/too0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    :cond_0
    iget-boolean p0, p0, La/z0w;->l:Z

    .line 62
    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    new-instance p0, La/ooo0;

    .line 66
    .line 67
    new-array p1, v2, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const v3, 0x7f130b40

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v3, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const-string v3, "TagLive"

    .line 81
    .line 82
    sget-object v4, La/kro0;->a:La/kro0;

    .line 83
    .line 84
    invoke-direct {p0, p1, v3, v4}, La/ooo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_1
    if-eqz p3, :cond_2

    .line 91
    .line 92
    new-instance p0, La/poo0;

    .line 93
    .line 94
    new-array p1, v2, [Ljava/lang/Object;

    .line 95
    .line 96
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const p3, 0x7f130ed6

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p3, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const-string p3, "OptionBet"

    .line 108
    .line 109
    sget-object v3, La/dqo0;->a:La/dqo0;

    .line 110
    .line 111
    invoke-direct {p0, p1, p3, v3}, La/poo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_2
    if-eqz p4, :cond_3

    .line 118
    .line 119
    new-instance p0, La/moo0;

    .line 120
    .line 121
    new-array p1, v2, [Ljava/lang/Object;

    .line 122
    .line 123
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const p3, 0x7f130757

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, p3, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    const-string p3, "EachWay"

    .line 135
    .line 136
    sget-object p4, La/opo0;->a:La/opo0;

    .line 137
    .line 138
    invoke-direct {p0, p1, p3, p4}, La/moo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_3
    invoke-virtual {p5}, Ljava/lang/String;->length()I

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-lez p0, :cond_4

    .line 149
    .line 150
    const-string p0, "TopChampTag"

    .line 151
    .line 152
    invoke-virtual {p0, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    new-instance p1, La/roo0;

    .line 157
    .line 158
    sget-object p3, La/bro0;->a:La/bro0;

    .line 159
    .line 160
    invoke-direct {p1, p5, p0, p3}, La/roo0;-><init>(Ljava/lang/String;Ljava/lang/String;La/sso0;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    :cond_4
    if-eqz p2, :cond_5

    .line 167
    .line 168
    new-instance p0, La/ioo0;

    .line 169
    .line 170
    new-array p1, v2, [Ljava/lang/Object;

    .line 171
    .line 172
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    const p2, 0x7f1301ad

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, p2, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-direct {p0, p1}, La/ioo0;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, p0}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    :cond_5
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-static {p0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0
.end method

.method public static final H(La/l2g0;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, La/xkb;->P()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, La/yxg;

    .line 33
    .line 34
    iget-wide v2, v2, La/yxg;->b:J

    .line 35
    .line 36
    iget-wide v4, p0, La/l2g0;->c:J

    .line 37
    .line 38
    cmp-long v2, v2, v4

    .line 39
    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    invoke-static {p0}, La/ahb;->I(La/l2g0;)La/t480;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    iget-object v1, p0, La/t480;->a:Ljava/lang/String;

    .line 49
    .line 50
    :cond_2
    const-string p0, ""

    .line 51
    .line 52
    invoke-static {v1, p0}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_3
    :goto_0
    invoke-static {p0}, La/ahb;->I(La/l2g0;)La/t480;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    iget-object v1, p0, La/t480;->a:Ljava/lang/String;

    .line 64
    .line 65
    :cond_4
    const-string p0, "0"

    .line 66
    .line 67
    invoke-static {v1, p0}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public static final I(La/l2g0;)La/t480;
    .locals 9

    .line 1
    iget-wide v0, p0, La/l2g0;->c:J

    .line 2
    .line 3
    iget-object p0, p0, La/l2g0;->p:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {}, La/xkb;->P()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/16 v4, 0xa

    .line 12
    .line 13
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    check-cast v4, La/yxg;

    .line 35
    .line 36
    iget-wide v4, v4, La/yxg;->b:J

    .line 37
    .line 38
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-wide/16 v4, 0x42

    .line 47
    .line 48
    cmp-long v2, v0, v4

    .line 49
    .line 50
    const-string v4, "-"

    .line 51
    .line 52
    const-string v5, ":"

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    if-eqz v2, :cond_6

    .line 56
    .line 57
    const-wide/16 v7, 0x63

    .line 58
    .line 59
    cmp-long v2, v0, v7

    .line 60
    .line 61
    if-nez v2, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    const-string v1, "(\\d+\\s*[:-]\\s*\\d+)"

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    new-instance v0, Lkotlin/text/Regex;

    .line 77
    .line 78
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p0}, Lkotlin/text/Regex;->b(Ljava/lang/CharSequence;)La/bh30;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-eqz p0, :cond_2

    .line 86
    .line 87
    invoke-virtual {p0}, La/bh30;->getValue()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-nez p0, :cond_3

    .line 92
    .line 93
    :cond_2
    move-object p0, v5

    .line 94
    :cond_3
    invoke-static {p0, v4, v5, v6}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    goto :goto_2

    .line 99
    :cond_4
    new-instance v0, Lkotlin/text/Regex;

    .line 100
    .line 101
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p0}, Lkotlin/text/Regex;->b(Ljava/lang/CharSequence;)La/bh30;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-eqz p0, :cond_5

    .line 109
    .line 110
    invoke-virtual {p0}, La/bh30;->getValue()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-nez p0, :cond_7

    .line 115
    .line 116
    :cond_5
    move-object p0, v5

    .line 117
    goto :goto_2

    .line 118
    :cond_6
    :goto_1
    invoke-static {p0, v4, v5, v6}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    :cond_7
    :goto_2
    filled-new-array {v5}, [Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const/4 v1, 0x6

    .line 127
    invoke-static {p0, v0, v6, v1}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {v6, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, Ljava/lang/String;

    .line 136
    .line 137
    const/4 v1, 0x0

    .line 138
    if-eqz v0, :cond_8

    .line 139
    .line 140
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-eqz v0, :cond_8

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-nez v2, :cond_9

    .line 155
    .line 156
    :cond_8
    move-object v0, v1

    .line 157
    :cond_9
    const/4 v2, 0x1

    .line 158
    invoke-static {v2, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    check-cast p0, Ljava/lang/String;

    .line 163
    .line 164
    if-eqz p0, :cond_a

    .line 165
    .line 166
    invoke-static {p0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    if-eqz p0, :cond_a

    .line 175
    .line 176
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-nez v2, :cond_b

    .line 181
    .line 182
    :cond_a
    move-object p0, v1

    .line 183
    :cond_b
    if-eqz v0, :cond_c

    .line 184
    .line 185
    if-eqz p0, :cond_c

    .line 186
    .line 187
    new-instance v1, La/t480;

    .line 188
    .line 189
    invoke-direct {v1, v0, p0}, La/t480;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :cond_c
    return-object v1
.end method

.method public static final J(Ljava/util/List;Z)Lkotlin/Pair;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const v1, 0x7f080a6d

    .line 6
    .line 7
    .line 8
    const v2, 0x7f080e00

    .line 9
    .line 10
    .line 11
    const-string v3, "%s/playerlogo/%s"

    .line 12
    .line 13
    const-string v4, "%s/%s"

    .line 14
    .line 15
    const-string v5, "playerlogo/"

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    const/4 v7, 0x2

    .line 19
    const-string v8, ""

    .line 20
    .line 21
    if-nez p1, :cond_5

    .line 22
    .line 23
    new-instance v9, La/c280;

    .line 24
    .line 25
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v10

    .line 29
    check-cast v10, Ljava/lang/String;

    .line 30
    .line 31
    if-nez v10, :cond_0

    .line 32
    .line 33
    move-object v10, v8

    .line 34
    :cond_0
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v10, v11, v0}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v11

    .line 40
    if-eqz v11, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v11

    .line 47
    if-nez v11, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    sget-object v11, La/u0d;->a:Ljava/util/List;

    .line 51
    .line 52
    invoke-static {v10}, La/u0d;->c(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    if-eqz v11, :cond_3

    .line 57
    .line 58
    :goto_0
    move-object v10, v8

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {v10, v5, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-eqz v11, :cond_4

    .line 65
    .line 66
    move-object v11, v4

    .line 67
    goto :goto_1

    .line 68
    :cond_4
    move-object v11, v3

    .line 69
    :goto_1
    sget-object v12, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 70
    .line 71
    sget-object v13, La/ujn;->h:Ljava/lang/String;

    .line 72
    .line 73
    filled-new-array {v13, v10}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    invoke-static {v12, v11, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    :goto_2
    invoke-direct {v9, v10, v2}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    new-instance v9, La/b280;

    .line 90
    .line 91
    invoke-direct {v9, v1}, La/b280;-><init>(I)V

    .line 92
    .line 93
    .line 94
    :goto_3
    if-nez p1, :cond_b

    .line 95
    .line 96
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-ge v6, p1, :cond_6

    .line 101
    .line 102
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    goto :goto_4

    .line 107
    :cond_6
    move-object p0, v8

    .line 108
    :goto_4
    check-cast p0, Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object p1, La/ujn;->h:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {p0, p1, v0}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_7

    .line 120
    .line 121
    move-object v8, p0

    .line 122
    goto :goto_5

    .line 123
    :cond_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-nez p1, :cond_8

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_8
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 131
    .line 132
    invoke-static {p0}, La/u0d;->c(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_9

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_9
    invoke-static {p0, v5, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_a

    .line 144
    .line 145
    move-object v3, v4

    .line 146
    :cond_a
    sget-object p1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 147
    .line 148
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 149
    .line 150
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-static {p1, v3, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    :goto_5
    new-instance p0, La/c280;

    .line 163
    .line 164
    invoke-direct {p0, v8, v2}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_b
    new-instance p0, La/b280;

    .line 169
    .line 170
    invoke-direct {p0, v1}, La/b280;-><init>(I)V

    .line 171
    .line 172
    .line 173
    :goto_6
    new-instance p1, Lkotlin/Pair;

    .line 174
    .line 175
    invoke-direct {p1, v9, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-object p1
.end method

.method public static final K(Ljava/util/List;Z)Lkotlin/Pair;
    .locals 14

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const v1, 0x7f080651

    .line 6
    .line 7
    .line 8
    const v2, 0x7f080e00

    .line 9
    .line 10
    .line 11
    const-string v3, "%s/playerlogo/%s"

    .line 12
    .line 13
    const-string v4, "%s/%s"

    .line 14
    .line 15
    const-string v5, "playerlogo/"

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    const/4 v7, 0x2

    .line 19
    const-string v8, ""

    .line 20
    .line 21
    if-nez p1, :cond_5

    .line 22
    .line 23
    new-instance v9, La/c280;

    .line 24
    .line 25
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v10

    .line 29
    check-cast v10, Ljava/lang/String;

    .line 30
    .line 31
    if-nez v10, :cond_0

    .line 32
    .line 33
    move-object v10, v8

    .line 34
    :cond_0
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v10, v11, v0}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 37
    .line 38
    .line 39
    move-result v11

    .line 40
    if-eqz v11, :cond_1

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_1
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v11

    .line 47
    if-nez v11, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    sget-object v11, La/u0d;->a:Ljava/util/List;

    .line 51
    .line 52
    invoke-static {v10}, La/u0d;->c(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    if-eqz v11, :cond_3

    .line 57
    .line 58
    :goto_0
    move-object v10, v8

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {v10, v5, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    if-eqz v11, :cond_4

    .line 65
    .line 66
    move-object v11, v4

    .line 67
    goto :goto_1

    .line 68
    :cond_4
    move-object v11, v3

    .line 69
    :goto_1
    sget-object v12, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 70
    .line 71
    sget-object v13, La/ujn;->h:Ljava/lang/String;

    .line 72
    .line 73
    filled-new-array {v13, v10}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-static {v10, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    invoke-static {v12, v11, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v10

    .line 85
    :goto_2
    invoke-direct {v9, v10, v2}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_5
    new-instance v9, La/b280;

    .line 90
    .line 91
    invoke-direct {v9, v1}, La/b280;-><init>(I)V

    .line 92
    .line 93
    .line 94
    :goto_3
    if-nez p1, :cond_b

    .line 95
    .line 96
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-ge v6, p1, :cond_6

    .line 101
    .line 102
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    goto :goto_4

    .line 107
    :cond_6
    move-object p0, v8

    .line 108
    :goto_4
    check-cast p0, Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    sget-object p1, La/ujn;->h:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {p0, p1, v0}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_7

    .line 120
    .line 121
    move-object v8, p0

    .line 122
    goto :goto_5

    .line 123
    :cond_7
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-nez p1, :cond_8

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_8
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 131
    .line 132
    invoke-static {p0}, La/u0d;->c(Ljava/lang/String;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-eqz p1, :cond_9

    .line 137
    .line 138
    goto :goto_5

    .line 139
    :cond_9
    invoke-static {p0, v5, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_a

    .line 144
    .line 145
    move-object v3, v4

    .line 146
    :cond_a
    sget-object p1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 147
    .line 148
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 149
    .line 150
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-static {p1, v3, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v8

    .line 162
    :goto_5
    new-instance p0, La/c280;

    .line 163
    .line 164
    invoke-direct {p0, v8, v2}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_b
    new-instance p0, La/b280;

    .line 169
    .line 170
    invoke-direct {p0, v1}, La/b280;-><init>(I)V

    .line 171
    .line 172
    .line 173
    :goto_6
    new-instance p1, Lkotlin/Pair;

    .line 174
    .line 175
    invoke-direct {p1, v9, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    return-object p1
.end method

.method public static final L(La/l2g0;)La/mpm;
    .locals 9

    .line 1
    invoke-static {p0}, La/ahb;->I(La/l2g0;)La/t480;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, La/xkb;->P()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    :cond_0
    move v1, v2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, La/yxg;

    .line 35
    .line 36
    iget-wide v3, v3, La/yxg;->b:J

    .line 37
    .line 38
    iget-wide v5, p0, La/l2g0;->c:J

    .line 39
    .line 40
    cmp-long v3, v3, v5

    .line 41
    .line 42
    if-nez v3, :cond_2

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    :goto_0
    const/4 v3, 0x3

    .line 46
    const-wide/16 v4, 0x0

    .line 47
    .line 48
    sget-object v6, La/opm;->a:La/opm;

    .line 49
    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    new-instance p0, La/lpm;

    .line 55
    .line 56
    new-instance v0, La/hpm;

    .line 57
    .line 58
    invoke-direct {v0, v4, v5, v3}, La/hpm;-><init>(JI)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v6, v0}, La/lpm;-><init>(La/rpm;La/ipm;)V

    .line 62
    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_3
    new-instance v0, La/kpm;

    .line 66
    .line 67
    new-instance v1, La/hpm;

    .line 68
    .line 69
    invoke-direct {v1, v4, v5, v3}, La/hpm;-><init>(JI)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0}, La/ahb;->H(La/l2g0;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    invoke-static {p0}, La/ahb;->M(La/l2g0;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance v8, La/hpm;

    .line 81
    .line 82
    invoke-direct {v8, v4, v5, v3}, La/hpm;-><init>(JI)V

    .line 83
    .line 84
    .line 85
    invoke-static {v7, p0, v2, v2, v8}, La/d5c;->O(Ljava/lang/String;Ljava/lang/String;ZZLa/ipm;)La/j83;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-direct {v0, v6, v1, p0}, La/kpm;-><init>(La/rpm;La/ipm;La/j83;)V

    .line 90
    .line 91
    .line 92
    return-object v0
.end method

.method public static final M(La/l2g0;)Ljava/lang/String;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, La/xkb;->P()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, La/yxg;

    .line 33
    .line 34
    iget-wide v2, v2, La/yxg;->b:J

    .line 35
    .line 36
    iget-wide v4, p0, La/l2g0;->c:J

    .line 37
    .line 38
    cmp-long v2, v2, v4

    .line 39
    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    invoke-static {p0}, La/ahb;->I(La/l2g0;)La/t480;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    iget-object v1, p0, La/t480;->b:Ljava/lang/String;

    .line 49
    .line 50
    :cond_2
    const-string p0, ""

    .line 51
    .line 52
    invoke-static {v1, p0}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_3
    :goto_0
    invoke-static {p0}, La/ahb;->I(La/l2g0;)La/t480;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    iget-object v1, p0, La/t480;->b:Ljava/lang/String;

    .line 64
    .line 65
    :cond_4
    const-string p0, "0"

    .line 66
    .line 67
    invoke-static {v1, p0}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public static N(Landroid/content/Context;J)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/text/DecimalFormat;

    .line 2
    .line 3
    const-string v1, "0.0"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    long-to-float p1, p1

    .line 9
    const/high16 p2, 0x44800000    # 1024.0f

    .line 10
    .line 11
    cmpl-float v1, p1, p2

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    if-lez v1, :cond_0

    .line 15
    .line 16
    const/high16 p2, 0x49800000    # 1048576.0f

    .line 17
    .line 18
    div-float/2addr p1, p2

    .line 19
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const p2, 0x7f1304f0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_0
    div-float/2addr p1, p2

    .line 51
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const p2, 0x7f1304ef

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    return-object p0
.end method

.method public static final O(Ljava/util/List;Z)La/d280;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_5

    .line 5
    .line 6
    new-instance p1, La/c280;

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    const-string v0, ""

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    move-object p0, v0

    .line 19
    :cond_0
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {p0, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    move-object v0, p0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {p0}, La/u0d;->c(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const-string v0, "playerlogo/"

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    const-string v0, "%s/%s"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    const-string v0, "%s/playerlogo/%s"

    .line 59
    .line 60
    :goto_0
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 61
    .line 62
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 63
    .line 64
    filled-new-array {v2, p0}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const/4 v2, 0x2

    .line 69
    invoke-static {p0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {v1, v0, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_1
    const p0, 0x7f080e00

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, v0, p0}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_5
    new-instance p0, La/b280;

    .line 85
    .line 86
    const p1, 0x7f080a6d

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, p1}, La/b280;-><init>(I)V

    .line 90
    .line 91
    .line 92
    return-object p0
.end method

.method public static final P(Ljava/util/List;Z)La/d280;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_5

    .line 5
    .line 6
    new-instance p1, La/c280;

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Ljava/lang/String;

    .line 13
    .line 14
    const-string v0, ""

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    move-object p0, v0

    .line 19
    :cond_0
    sget-object v1, La/ujn;->h:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {p0, v1, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    move-object v0, p0

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    sget-object v1, La/u0d;->a:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {p0}, La/u0d;->c(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const-string v0, "playerlogo/"

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    invoke-static {p0, v0, v1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    const-string v0, "%s/%s"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    const-string v0, "%s/playerlogo/%s"

    .line 59
    .line 60
    :goto_0
    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 61
    .line 62
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 63
    .line 64
    filled-new-array {v2, p0}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const/4 v2, 0x2

    .line 69
    invoke-static {p0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {v1, v0, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_1
    const p0, 0x7f080e00

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, v0, p0}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    return-object p1

    .line 84
    :cond_5
    new-instance p0, La/b280;

    .line 85
    .line 86
    const p1, 0x7f080651

    .line 87
    .line 88
    .line 89
    invoke-direct {p0, p1}, La/b280;-><init>(I)V

    .line 90
    .line 91
    .line 92
    return-object p0
.end method

.method public static final Q(La/l2g0;Ljava/util/List;La/wcb;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-wide v0, p0, La/l2g0;->c:J

    .line 8
    .line 9
    iget-wide v2, p0, La/l2g0;->d:J

    .line 10
    .line 11
    iget v4, p0, La/l2g0;->w:I

    .line 12
    .line 13
    move-object v5, p1

    .line 14
    move-object v6, p2

    .line 15
    invoke-static/range {v0 .. v6}, La/g1x;->w(JJILjava/util/List;La/wcb;)La/gel0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, La/gel0;->a:La/del0;

    .line 20
    .line 21
    instance-of p1, p0, La/zdl0;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    check-cast p0, La/zdl0;

    .line 26
    .line 27
    iget-object p0, p0, La/zdl0;->a:Ljava/lang/String;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_0
    instance-of p1, p0, La/bel0;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    check-cast p0, La/bel0;

    .line 35
    .line 36
    iget-object p0, p0, La/bel0;->a:Ljava/lang/String;

    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public static final R(La/gmq;Lkotlin/jvm/functions/Function1;)La/a1g;
    .locals 15

    .line 1
    new-instance v4, La/kie0;

    .line 2
    .line 3
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, La/wmq;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v5, 0x7

    .line 10
    move-object v1, p0

    .line 11
    move-object/from16 v3, p1

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, La/wmq;-><init>(La/gmq;La/yje;Lkotlin/jvm/functions/Function1;La/kie0;B)V

    .line 14
    .line 15
    .line 16
    new-instance v6, La/vsg0;

    .line 17
    .line 18
    invoke-direct {v6, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 19
    .line 20
    .line 21
    const/4 v12, 0x0

    .line 22
    const/16 v14, 0x18

    .line 23
    .line 24
    const-string v7, "HandlePopularFeedResult"

    .line 25
    .line 26
    const/4 v8, 0x3

    .line 27
    const-wide/16 v9, 0x3

    .line 28
    .line 29
    const/4 v11, 0x0

    .line 30
    move-object/from16 v13, p1

    .line 31
    .line 32
    invoke-static/range {v6 .. v14}, La/bkb;->i0(La/gmq;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static final S(La/fet;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    invoke-static {v0, p1}, La/zys0;->e(ILjava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p1, p0, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final T(La/a4x;La/fet;I)La/l7m0;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p2, 0xe

    .line 5
    .line 6
    xor-int/lit8 v0, v0, 0x6

    .line 7
    .line 8
    const/4 v1, 0x4

    .line 9
    if-le v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    :cond_0
    and-int/lit8 p2, p2, 0x6

    .line 18
    .line 19
    if-ne p2, v1, :cond_2

    .line 20
    .line 21
    :cond_1
    const/4 p2, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const/4 p2, 0x0

    .line 24
    :goto_0
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-nez p2, :cond_3

    .line 29
    .line 30
    sget-object p2, La/ukd;->a:La/cl5;

    .line 31
    .line 32
    if-ne v0, p2, :cond_4

    .line 33
    .line 34
    :cond_3
    new-instance p2, La/ife;

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-direct {p2, p0, v0}, La/ife;-><init>(La/a4x;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {p2}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p1, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_4
    check-cast v0, La/l7m0;

    .line 48
    .line 49
    return-object v0
.end method

.method public static final U(Ljava/util/List;)La/a4x;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-static {p0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/scp;

    .line 30
    .line 31
    new-instance v2, La/iem;

    .line 32
    .line 33
    iget-object v3, v1, La/scp;->a:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, v1, La/scp;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {v2, v3, v1}, La/iem;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public static final V(La/j83;)La/huc;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/huc;

    .line 4
    .line 5
    iget-object v2, v0, La/j83;->c:Ljava/util/ArrayList;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    sget-object v3, La/iun;->a:La/iun;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v3, v2

    .line 13
    :goto_0
    iget-object v0, v0, La/j83;->b:Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    :goto_1
    move-object/from16 v16, v1

    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_1
    new-instance v3, Landroid/text/SpannableString;

    .line 26
    .line 27
    invoke-direct {v3, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, La/bwl;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    iput-object v4, v0, La/bwl;->a:Ljava/lang/Object;

    .line 40
    .line 41
    if-nez v2, :cond_2

    .line 42
    .line 43
    sget-object v2, La/iun;->a:La/iun;

    .line 44
    .line 45
    :cond_2
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/4 v6, 0x0

    .line 50
    :goto_2
    if-ge v6, v4, :cond_15

    .line 51
    .line 52
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, La/i83;

    .line 57
    .line 58
    iget-object v8, v7, La/i83;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v8, La/smk0;

    .line 61
    .line 62
    iget v9, v7, La/i83;->b:I

    .line 63
    .line 64
    iget v7, v7, La/i83;->c:I

    .line 65
    .line 66
    iget-object v10, v0, La/bwl;->a:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v10, Landroid/os/Parcel;

    .line 69
    .line 70
    invoke-virtual {v10}, Landroid/os/Parcel;->recycle()V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    iput-object v10, v0, La/bwl;->a:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object v10, v8, La/smk0;->a:La/e8q0;

    .line 80
    .line 81
    iget-wide v11, v8, La/smk0;->l:J

    .line 82
    .line 83
    iget-wide v13, v8, La/smk0;->h:J

    .line 84
    .line 85
    move v15, v6

    .line 86
    iget-wide v5, v8, La/smk0;->b:J

    .line 87
    .line 88
    move-object/from16 v16, v1

    .line 89
    .line 90
    move-object/from16 v17, v2

    .line 91
    .line 92
    invoke-interface {v10}, La/e8q0;->h()J

    .line 93
    .line 94
    .line 95
    move-result-wide v1

    .line 96
    move-object v10, v3

    .line 97
    move/from16 v18, v4

    .line 98
    .line 99
    sget-wide v3, La/y3d;->g:J

    .line 100
    .line 101
    invoke-static {v1, v2, v3, v4}, La/h2t0;->a(JJ)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    const/4 v2, 0x1

    .line 106
    if-nez v1, :cond_3

    .line 107
    .line 108
    invoke-virtual {v0, v2}, La/bwl;->a(B)V

    .line 109
    .line 110
    .line 111
    iget-object v1, v8, La/smk0;->a:La/e8q0;

    .line 112
    .line 113
    move-wide/from16 v19, v3

    .line 114
    .line 115
    invoke-interface {v1}, La/e8q0;->h()J

    .line 116
    .line 117
    .line 118
    move-result-wide v2

    .line 119
    iget-object v1, v0, La/bwl;->a:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, Landroid/os/Parcel;

    .line 122
    .line 123
    invoke-virtual {v1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_3
    move-wide/from16 v19, v3

    .line 128
    .line 129
    :goto_3
    sget-wide v1, La/daq0;->c:J

    .line 130
    .line 131
    invoke-static {v5, v6, v1, v2}, La/daq0;->a(JJ)Z

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    const/4 v4, 0x2

    .line 136
    if-nez v3, :cond_4

    .line 137
    .line 138
    invoke-virtual {v0, v4}, La/bwl;->a(B)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v5, v6}, La/bwl;->c(J)V

    .line 142
    .line 143
    .line 144
    :cond_4
    iget-object v3, v8, La/smk0;->c:La/psq;

    .line 145
    .line 146
    const/4 v5, 0x3

    .line 147
    if-eqz v3, :cond_5

    .line 148
    .line 149
    invoke-virtual {v0, v5}, La/bwl;->a(B)V

    .line 150
    .line 151
    .line 152
    iget v3, v3, La/psq;->a:I

    .line 153
    .line 154
    iget-object v6, v0, La/bwl;->a:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v6, Landroid/os/Parcel;

    .line 157
    .line 158
    invoke-virtual {v6, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 159
    .line 160
    .line 161
    :cond_5
    iget-object v3, v8, La/smk0;->d:La/lsq;

    .line 162
    .line 163
    if-eqz v3, :cond_8

    .line 164
    .line 165
    iget v3, v3, La/lsq;->a:I

    .line 166
    .line 167
    const/4 v6, 0x4

    .line 168
    invoke-virtual {v0, v6}, La/bwl;->a(B)V

    .line 169
    .line 170
    .line 171
    if-nez v3, :cond_7

    .line 172
    .line 173
    :cond_6
    const/4 v3, 0x0

    .line 174
    goto :goto_4

    .line 175
    :cond_7
    const/4 v6, 0x1

    .line 176
    if-ne v3, v6, :cond_6

    .line 177
    .line 178
    const/4 v3, 0x1

    .line 179
    :goto_4
    invoke-virtual {v0, v3}, La/bwl;->a(B)V

    .line 180
    .line 181
    .line 182
    :cond_8
    iget-object v3, v8, La/smk0;->e:La/msq;

    .line 183
    .line 184
    if-eqz v3, :cond_d

    .line 185
    .line 186
    iget v3, v3, La/msq;->a:I

    .line 187
    .line 188
    const/4 v6, 0x5

    .line 189
    invoke-virtual {v0, v6}, La/bwl;->a(B)V

    .line 190
    .line 191
    .line 192
    if-nez v3, :cond_a

    .line 193
    .line 194
    :cond_9
    const/4 v4, 0x0

    .line 195
    goto :goto_5

    .line 196
    :cond_a
    const v6, 0xffff

    .line 197
    .line 198
    .line 199
    if-ne v3, v6, :cond_b

    .line 200
    .line 201
    const/4 v4, 0x1

    .line 202
    goto :goto_5

    .line 203
    :cond_b
    const/4 v6, 0x1

    .line 204
    if-ne v3, v6, :cond_c

    .line 205
    .line 206
    goto :goto_5

    .line 207
    :cond_c
    if-ne v3, v4, :cond_9

    .line 208
    .line 209
    move v4, v5

    .line 210
    :goto_5
    invoke-virtual {v0, v4}, La/bwl;->a(B)V

    .line 211
    .line 212
    .line 213
    :cond_d
    iget-object v3, v8, La/smk0;->g:Ljava/lang/String;

    .line 214
    .line 215
    if-eqz v3, :cond_e

    .line 216
    .line 217
    const/4 v4, 0x6

    .line 218
    invoke-virtual {v0, v4}, La/bwl;->a(B)V

    .line 219
    .line 220
    .line 221
    iget-object v4, v0, La/bwl;->a:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v4, Landroid/os/Parcel;

    .line 224
    .line 225
    invoke-virtual {v4, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    :cond_e
    invoke-static {v13, v14, v1, v2}, La/daq0;->a(JJ)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    if-nez v1, :cond_f

    .line 233
    .line 234
    const/4 v1, 0x7

    .line 235
    invoke-virtual {v0, v1}, La/bwl;->a(B)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0, v13, v14}, La/bwl;->c(J)V

    .line 239
    .line 240
    .line 241
    :cond_f
    iget-object v1, v8, La/smk0;->i:La/j56;

    .line 242
    .line 243
    if-eqz v1, :cond_10

    .line 244
    .line 245
    iget v1, v1, La/j56;->a:F

    .line 246
    .line 247
    const/16 v2, 0x8

    .line 248
    .line 249
    invoke-virtual {v0, v2}, La/bwl;->a(B)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v1}, La/bwl;->b(F)V

    .line 253
    .line 254
    .line 255
    :cond_10
    iget-object v1, v8, La/smk0;->j:La/f8q0;

    .line 256
    .line 257
    if-eqz v1, :cond_11

    .line 258
    .line 259
    const/16 v2, 0x9

    .line 260
    .line 261
    invoke-virtual {v0, v2}, La/bwl;->a(B)V

    .line 262
    .line 263
    .line 264
    iget v2, v1, La/f8q0;->a:F

    .line 265
    .line 266
    invoke-virtual {v0, v2}, La/bwl;->b(F)V

    .line 267
    .line 268
    .line 269
    iget v1, v1, La/f8q0;->b:F

    .line 270
    .line 271
    invoke-virtual {v0, v1}, La/bwl;->b(F)V

    .line 272
    .line 273
    .line 274
    :cond_11
    move-wide/from16 v1, v19

    .line 275
    .line 276
    invoke-static {v11, v12, v1, v2}, La/h2t0;->a(JJ)Z

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    if-nez v1, :cond_12

    .line 281
    .line 282
    const/16 v1, 0xa

    .line 283
    .line 284
    invoke-virtual {v0, v1}, La/bwl;->a(B)V

    .line 285
    .line 286
    .line 287
    iget-object v1, v0, La/bwl;->a:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v1, Landroid/os/Parcel;

    .line 290
    .line 291
    invoke-virtual {v1, v11, v12}, Landroid/os/Parcel;->writeLong(J)V

    .line 292
    .line 293
    .line 294
    :cond_12
    iget-object v1, v8, La/smk0;->m:La/k5q0;

    .line 295
    .line 296
    if-eqz v1, :cond_13

    .line 297
    .line 298
    const/16 v2, 0xb

    .line 299
    .line 300
    invoke-virtual {v0, v2}, La/bwl;->a(B)V

    .line 301
    .line 302
    .line 303
    iget v1, v1, La/k5q0;->a:I

    .line 304
    .line 305
    iget-object v2, v0, La/bwl;->a:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v2, Landroid/os/Parcel;

    .line 308
    .line 309
    invoke-virtual {v2, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 310
    .line 311
    .line 312
    :cond_13
    iget-object v1, v8, La/smk0;->n:La/ljj0;

    .line 313
    .line 314
    if-eqz v1, :cond_14

    .line 315
    .line 316
    const/16 v2, 0xc

    .line 317
    .line 318
    invoke-virtual {v0, v2}, La/bwl;->a(B)V

    .line 319
    .line 320
    .line 321
    iget-wide v2, v1, La/ljj0;->a:J

    .line 322
    .line 323
    iget-object v4, v0, La/bwl;->a:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v4, Landroid/os/Parcel;

    .line 326
    .line 327
    invoke-virtual {v4, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 328
    .line 329
    .line 330
    iget-wide v2, v1, La/ljj0;->b:J

    .line 331
    .line 332
    const/16 v4, 0x20

    .line 333
    .line 334
    shr-long v4, v2, v4

    .line 335
    .line 336
    long-to-int v4, v4

    .line 337
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    invoke-virtual {v0, v4}, La/bwl;->b(F)V

    .line 342
    .line 343
    .line 344
    const-wide v4, 0xffffffffL

    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    and-long/2addr v2, v4

    .line 350
    long-to-int v2, v2

    .line 351
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 352
    .line 353
    .line 354
    move-result v2

    .line 355
    invoke-virtual {v0, v2}, La/bwl;->b(F)V

    .line 356
    .line 357
    .line 358
    iget v1, v1, La/ljj0;->c:F

    .line 359
    .line 360
    invoke-virtual {v0, v1}, La/bwl;->b(F)V

    .line 361
    .line 362
    .line 363
    :cond_14
    new-instance v1, Landroid/text/Annotation;

    .line 364
    .line 365
    iget-object v2, v0, La/bwl;->a:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v2, Landroid/os/Parcel;

    .line 368
    .line 369
    invoke-virtual {v2}, Landroid/os/Parcel;->marshall()[B

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    const/4 v3, 0x0

    .line 374
    invoke-static {v2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    const-string v4, "androidx.compose.text.SpanStyle"

    .line 379
    .line 380
    invoke-direct {v1, v4, v2}, Landroid/text/Annotation;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    const/16 v2, 0x21

    .line 384
    .line 385
    invoke-virtual {v10, v1, v9, v7, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 386
    .line 387
    .line 388
    add-int/lit8 v6, v15, 0x1

    .line 389
    .line 390
    move-object v3, v10

    .line 391
    move-object/from16 v1, v16

    .line 392
    .line 393
    move-object/from16 v2, v17

    .line 394
    .line 395
    move/from16 v4, v18

    .line 396
    .line 397
    goto/16 :goto_2

    .line 398
    .line 399
    :cond_15
    move-object v10, v3

    .line 400
    move-object v0, v10

    .line 401
    goto/16 :goto_1

    .line 402
    .line 403
    :goto_6
    const-string v1, "plain text"

    .line 404
    .line 405
    invoke-static {v1, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    move-object/from16 v1, v16

    .line 410
    .line 411
    invoke-direct {v1, v0}, La/huc;-><init>(Landroid/content/ClipData;)V

    .line 412
    .line 413
    .line 414
    return-object v1
.end method

.method public static final W(La/wrf;)La/trf;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_7

    .line 7
    .line 8
    iget-object v4, v0, La/wrf;->a:Ljava/util/List;

    .line 9
    .line 10
    if-eqz v4, :cond_7

    .line 11
    .line 12
    new-instance v5, Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    if-eqz v6, :cond_8

    .line 26
    .line 27
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    move-object v7, v6

    .line 32
    check-cast v7, La/mqf;

    .line 33
    .line 34
    iget-object v8, v7, La/mqf;->g:Ljava/lang/Integer;

    .line 35
    .line 36
    if-nez v8, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-nez v8, :cond_6

    .line 44
    .line 45
    iget-object v8, v7, La/mqf;->b:Ljava/lang/Float;

    .line 46
    .line 47
    if-eqz v8, :cond_6

    .line 48
    .line 49
    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    float-to-int v8, v8

    .line 54
    if-nez v8, :cond_6

    .line 55
    .line 56
    iget-object v8, v7, La/mqf;->c:Ljava/lang/Integer;

    .line 57
    .line 58
    if-nez v8, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    if-nez v8, :cond_6

    .line 66
    .line 67
    iget-object v8, v7, La/mqf;->d:Ljava/lang/Integer;

    .line 68
    .line 69
    if-nez v8, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v8

    .line 76
    if-nez v8, :cond_6

    .line 77
    .line 78
    iget-object v8, v7, La/mqf;->e:Ljava/lang/Integer;

    .line 79
    .line 80
    if-nez v8, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-nez v8, :cond_6

    .line 88
    .line 89
    iget-object v8, v7, La/mqf;->f:Ljava/lang/Float;

    .line 90
    .line 91
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->b(FLjava/lang/Float;)Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_6

    .line 96
    .line 97
    iget-object v7, v7, La/mqf;->a:Ljava/lang/String;

    .line 98
    .line 99
    if-nez v7, :cond_5

    .line 100
    .line 101
    move-object v7, v1

    .line 102
    :cond_5
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-lez v7, :cond_0

    .line 107
    .line 108
    :cond_6
    :goto_1
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_7
    const/4 v5, 0x0

    .line 113
    :cond_8
    if-eqz v5, :cond_20

    .line 114
    .line 115
    new-instance v6, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/16 v7, 0xa

    .line 118
    .line 119
    invoke-static {v5, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    if-eqz v7, :cond_1f

    .line 135
    .line 136
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    check-cast v7, La/mqf;

    .line 141
    .line 142
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    new-instance v8, La/pqf;

    .line 146
    .line 147
    iget-object v9, v7, La/mqf;->a:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v10, v7, La/mqf;->l:Ljava/lang/Boolean;

    .line 150
    .line 151
    iget-object v11, v7, La/mqf;->n:Ljava/util/Map;

    .line 152
    .line 153
    if-nez v9, :cond_9

    .line 154
    .line 155
    move-object v9, v1

    .line 156
    :cond_9
    iget-object v12, v7, La/mqf;->b:Ljava/lang/Float;

    .line 157
    .line 158
    if-eqz v12, :cond_a

    .line 159
    .line 160
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 161
    .line 162
    .line 163
    move-result v12

    .line 164
    float-to-int v12, v12

    .line 165
    goto :goto_3

    .line 166
    :cond_a
    const/4 v12, 0x0

    .line 167
    :goto_3
    iget-object v13, v7, La/mqf;->c:Ljava/lang/Integer;

    .line 168
    .line 169
    if-eqz v13, :cond_b

    .line 170
    .line 171
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    goto :goto_4

    .line 176
    :cond_b
    const/4 v13, 0x0

    .line 177
    :goto_4
    iget-object v14, v7, La/mqf;->d:Ljava/lang/Integer;

    .line 178
    .line 179
    if-eqz v14, :cond_c

    .line 180
    .line 181
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v14

    .line 185
    goto :goto_5

    .line 186
    :cond_c
    const/4 v14, 0x0

    .line 187
    :goto_5
    iget-object v15, v7, La/mqf;->e:Ljava/lang/Integer;

    .line 188
    .line 189
    if-eqz v15, :cond_d

    .line 190
    .line 191
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result v15

    .line 195
    goto :goto_6

    .line 196
    :cond_d
    const/4 v15, 0x0

    .line 197
    :goto_6
    iget-object v2, v7, La/mqf;->f:Ljava/lang/Float;

    .line 198
    .line 199
    if-eqz v2, :cond_e

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    goto :goto_7

    .line 206
    :cond_e
    const/4 v2, 0x0

    .line 207
    :goto_7
    iget-object v3, v7, La/mqf;->g:Ljava/lang/Integer;

    .line 208
    .line 209
    if-eqz v3, :cond_f

    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    goto :goto_8

    .line 216
    :cond_f
    const/4 v3, 0x0

    .line 217
    :goto_8
    if-eqz v11, :cond_12

    .line 218
    .line 219
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 220
    .line 221
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 222
    .line 223
    .line 224
    invoke-interface {v11}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 225
    .line 226
    .line 227
    move-result-object v16

    .line 228
    invoke-interface/range {v16 .. v16}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object v16

    .line 232
    :cond_10
    :goto_9
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v17

    .line 236
    if-eqz v17, :cond_11

    .line 237
    .line 238
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v17

    .line 242
    check-cast v17, Ljava/util/Map$Entry;

    .line 243
    .line 244
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v18

    .line 248
    check-cast v18, Ljava/lang/Number;

    .line 249
    .line 250
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Number;->intValue()I

    .line 251
    .line 252
    .line 253
    move-result v18

    .line 254
    if-lez v18, :cond_10

    .line 255
    .line 256
    move-object/from16 v22, v1

    .line 257
    .line 258
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    move/from16 v18, v2

    .line 263
    .line 264
    invoke-interface/range {v17 .. v17}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    invoke-interface {v4, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move/from16 v2, v18

    .line 272
    .line 273
    move-object/from16 v1, v22

    .line 274
    .line 275
    goto :goto_9

    .line 276
    :cond_11
    :goto_a
    move-object/from16 v22, v1

    .line 277
    .line 278
    move/from16 v18, v2

    .line 279
    .line 280
    goto :goto_b

    .line 281
    :cond_12
    const/4 v4, 0x0

    .line 282
    goto :goto_a

    .line 283
    :goto_b
    new-instance v16, La/nqf;

    .line 284
    .line 285
    iget-object v1, v7, La/mqf;->h:Ljava/lang/Boolean;

    .line 286
    .line 287
    if-eqz v1, :cond_13

    .line 288
    .line 289
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    move/from16 v24, v1

    .line 294
    .line 295
    goto :goto_c

    .line 296
    :cond_13
    const/16 v24, 0x0

    .line 297
    .line 298
    :goto_c
    iget-object v1, v7, La/mqf;->i:Ljava/lang/Boolean;

    .line 299
    .line 300
    if-eqz v1, :cond_14

    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    move/from16 v25, v1

    .line 307
    .line 308
    goto :goto_d

    .line 309
    :cond_14
    const/16 v25, 0x0

    .line 310
    .line 311
    :goto_d
    iget-object v1, v7, La/mqf;->j:Ljava/lang/Boolean;

    .line 312
    .line 313
    if-eqz v1, :cond_15

    .line 314
    .line 315
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 316
    .line 317
    .line 318
    move-result v1

    .line 319
    move/from16 v26, v1

    .line 320
    .line 321
    goto :goto_e

    .line 322
    :cond_15
    const/16 v26, 0x0

    .line 323
    .line 324
    :goto_e
    iget-object v1, v7, La/mqf;->k:Ljava/lang/String;

    .line 325
    .line 326
    if-nez v1, :cond_16

    .line 327
    .line 328
    move-object/from16 v27, v22

    .line 329
    .line 330
    goto :goto_f

    .line 331
    :cond_16
    move-object/from16 v27, v1

    .line 332
    .line 333
    :goto_f
    if-eqz v10, :cond_17

    .line 334
    .line 335
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 336
    .line 337
    .line 338
    move-result v1

    .line 339
    move/from16 v28, v1

    .line 340
    .line 341
    goto :goto_10

    .line 342
    :cond_17
    const/16 v28, 0x0

    .line 343
    .line 344
    :goto_10
    if-eqz v4, :cond_19

    .line 345
    .line 346
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    const/4 v2, 0x1

    .line 351
    if-ne v1, v2, :cond_19

    .line 352
    .line 353
    :goto_11
    sget-object v11, La/lun;->a:La/lun;

    .line 354
    .line 355
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    :cond_18
    move-object/from16 v29, v11

    .line 359
    .line 360
    move-object/from16 v23, v16

    .line 361
    .line 362
    goto :goto_12

    .line 363
    :cond_19
    if-nez v11, :cond_18

    .line 364
    .line 365
    goto :goto_11

    .line 366
    :goto_12
    invoke-direct/range {v23 .. v29}, La/nqf;-><init>(ZZZLjava/lang/String;ZLjava/util/Map;)V

    .line 367
    .line 368
    .line 369
    move-object/from16 v16, v23

    .line 370
    .line 371
    iget-object v1, v7, La/mqf;->m:Ljava/lang/Boolean;

    .line 372
    .line 373
    if-eqz v1, :cond_1a

    .line 374
    .line 375
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    move/from16 v17, v1

    .line 380
    .line 381
    goto :goto_13

    .line 382
    :cond_1a
    const/16 v17, 0x0

    .line 383
    .line 384
    :goto_13
    if-eqz v10, :cond_1b

    .line 385
    .line 386
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    goto :goto_14

    .line 391
    :cond_1b
    const/4 v1, 0x0

    .line 392
    :goto_14
    iget-object v2, v7, La/mqf;->o:Ljava/lang/Integer;

    .line 393
    .line 394
    const/4 v4, -0x1

    .line 395
    if-eqz v2, :cond_1c

    .line 396
    .line 397
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 398
    .line 399
    .line 400
    move-result v2

    .line 401
    move/from16 v19, v2

    .line 402
    .line 403
    goto :goto_15

    .line 404
    :cond_1c
    move/from16 v19, v4

    .line 405
    .line 406
    :goto_15
    iget-object v2, v7, La/mqf;->p:Ljava/lang/Integer;

    .line 407
    .line 408
    if-eqz v2, :cond_1d

    .line 409
    .line 410
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 411
    .line 412
    .line 413
    move-result v2

    .line 414
    move/from16 v20, v2

    .line 415
    .line 416
    goto :goto_16

    .line 417
    :cond_1d
    move/from16 v20, v4

    .line 418
    .line 419
    :goto_16
    iget-object v2, v7, La/mqf;->q:Ljava/lang/Integer;

    .line 420
    .line 421
    if-eqz v2, :cond_1e

    .line 422
    .line 423
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 424
    .line 425
    .line 426
    move-result v4

    .line 427
    :cond_1e
    move/from16 v21, v4

    .line 428
    .line 429
    move v10, v12

    .line 430
    move v11, v13

    .line 431
    move v12, v14

    .line 432
    move v13, v15

    .line 433
    move/from16 v14, v18

    .line 434
    .line 435
    move/from16 v18, v1

    .line 436
    .line 437
    move v15, v3

    .line 438
    invoke-direct/range {v8 .. v21}, La/pqf;-><init>(Ljava/lang/String;IIIIFILa/nqf;ZZIII)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-object/from16 v1, v22

    .line 445
    .line 446
    const/4 v2, 0x0

    .line 447
    goto/16 :goto_2

    .line 448
    .line 449
    :cond_1f
    :goto_17
    move-object v1, v6

    .line 450
    goto :goto_18

    .line 451
    :cond_20
    sget-object v6, La/iun;->a:La/iun;

    .line 452
    .line 453
    goto :goto_17

    .line 454
    :goto_18
    new-instance v2, La/trf;

    .line 455
    .line 456
    if-eqz v0, :cond_21

    .line 457
    .line 458
    iget-object v3, v0, La/wrf;->b:Ljava/lang/Integer;

    .line 459
    .line 460
    if-eqz v3, :cond_21

    .line 461
    .line 462
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    goto :goto_19

    .line 467
    :cond_21
    const/4 v4, 0x0

    .line 468
    :goto_19
    if-eqz v0, :cond_22

    .line 469
    .line 470
    iget-object v3, v0, La/wrf;->c:La/gsf;

    .line 471
    .line 472
    goto :goto_1a

    .line 473
    :cond_22
    const/4 v3, 0x0

    .line 474
    :goto_1a
    invoke-static {v3}, La/hic;->E(La/gsf;)La/wpf;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    if-eqz v0, :cond_23

    .line 479
    .line 480
    iget-object v5, v0, La/wrf;->d:Ljava/util/Map;

    .line 481
    .line 482
    if-nez v5, :cond_24

    .line 483
    .line 484
    :cond_23
    sget-object v5, La/lun;->a:La/lun;

    .line 485
    .line 486
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    :cond_24
    if-eqz v0, :cond_26

    .line 490
    .line 491
    iget-object v0, v0, La/wrf;->e:Ljava/util/Map;

    .line 492
    .line 493
    if-nez v0, :cond_25

    .line 494
    .line 495
    goto :goto_1c

    .line 496
    :cond_25
    :goto_1b
    move-object/from16 v30, v5

    .line 497
    .line 498
    move-object v5, v0

    .line 499
    move-object v0, v2

    .line 500
    move v2, v4

    .line 501
    move-object/from16 v4, v30

    .line 502
    .line 503
    goto :goto_1d

    .line 504
    :cond_26
    :goto_1c
    sget-object v0, La/lun;->a:La/lun;

    .line 505
    .line 506
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    goto :goto_1b

    .line 510
    :goto_1d
    invoke-direct/range {v0 .. v5}, La/trf;-><init>(Ljava/util/List;ILa/wpf;Ljava/util/Map;Ljava/util/Map;)V

    .line 511
    .line 512
    .line 513
    return-object v0
.end method

.method public static final X(Ljava/util/List;)La/smg;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, La/u5l;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v1, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/u5l;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v2, v0, La/u5l;->a:Ljava/lang/String;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v2, v1

    .line 24
    :goto_0
    const-string v3, ""

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    move-object v5, v3

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v5, v2

    .line 31
    :goto_1
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v2, v0, La/u5l;->c:Ljava/lang/String;

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move-object v2, v1

    .line 37
    :goto_2
    invoke-static {v2}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const/16 v2, 0xa

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    iget-object v0, v0, La/u5l;->d:Ljava/util/List;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    new-instance v4, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_4

    .line 67
    .line 68
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    check-cast v7, La/zmg;

    .line 73
    .line 74
    invoke-static {v7}, La/ahb;->Y(La/zmg;)La/wmg;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_3

    .line 82
    :cond_3
    move-object v4, v1

    .line 83
    :cond_4
    if-nez v4, :cond_5

    .line 84
    .line 85
    sget-object v4, La/iun;->a:La/iun;

    .line 86
    .line 87
    :cond_5
    move-object v7, v4

    .line 88
    if-eqz p0, :cond_6

    .line 89
    .line 90
    iget-object v0, p0, La/u5l;->a:Ljava/lang/String;

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_6
    move-object v0, v1

    .line 94
    :goto_4
    if-nez v0, :cond_7

    .line 95
    .line 96
    move-object v8, v3

    .line 97
    goto :goto_5

    .line 98
    :cond_7
    move-object v8, v0

    .line 99
    :goto_5
    if-eqz p0, :cond_8

    .line 100
    .line 101
    iget-object v0, p0, La/u5l;->c:Ljava/lang/String;

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_8
    move-object v0, v1

    .line 105
    :goto_6
    invoke-static {v0}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v9

    .line 109
    if-eqz p0, :cond_9

    .line 110
    .line 111
    iget-object p0, p0, La/u5l;->d:Ljava/util/List;

    .line 112
    .line 113
    if-eqz p0, :cond_9

    .line 114
    .line 115
    new-instance v1, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-static {p0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_9

    .line 133
    .line 134
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    check-cast v0, La/zmg;

    .line 139
    .line 140
    invoke-static {v0}, La/ahb;->Y(La/zmg;)La/wmg;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_7

    .line 148
    :cond_9
    if-nez v1, :cond_a

    .line 149
    .line 150
    sget-object v1, La/iun;->a:La/iun;

    .line 151
    .line 152
    :cond_a
    move-object v10, v1

    .line 153
    new-instance v4, La/smg;

    .line 154
    .line 155
    invoke-direct/range {v4 .. v10}, La/smg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 156
    .line 157
    .line 158
    return-object v4
.end method

.method public static final Y(La/zmg;)La/wmg;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/wmg;

    .line 4
    .line 5
    iget-object v2, v0, La/zmg;->a:Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v2, 0x0

    .line 15
    :goto_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v4, v0, La/zmg;->b:Ljava/lang/String;

    .line 20
    .line 21
    const-string v5, ""

    .line 22
    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    move-object v4, v5

    .line 26
    :cond_1
    iget-object v6, v0, La/zmg;->f:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v6}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    move-object v7, v1

    .line 33
    move-object v1, v2

    .line 34
    move-object v2, v4

    .line 35
    iget-object v4, v0, La/zmg;->g:Ljava/lang/Integer;

    .line 36
    .line 37
    move-object v8, v5

    .line 38
    iget-object v5, v0, La/zmg;->h:Ljava/lang/Float;

    .line 39
    .line 40
    move-object v9, v6

    .line 41
    iget-object v6, v0, La/zmg;->i:Ljava/lang/Integer;

    .line 42
    .line 43
    move-object v10, v7

    .line 44
    iget-object v7, v0, La/zmg;->j:Ljava/lang/Integer;

    .line 45
    .line 46
    move-object v11, v8

    .line 47
    iget-object v8, v0, La/zmg;->k:Ljava/lang/Float;

    .line 48
    .line 49
    iget-object v12, v0, La/zmg;->l:Ljava/lang/Boolean;

    .line 50
    .line 51
    if-eqz v12, :cond_2

    .line 52
    .line 53
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v12

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    const/4 v12, 0x0

    .line 59
    :goto_1
    iget-object v13, v0, La/zmg;->m:Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz v13, :cond_3

    .line 62
    .line 63
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v13

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    const/4 v13, 0x0

    .line 69
    :goto_2
    iget-object v14, v0, La/zmg;->n:Ljava/util/List;

    .line 70
    .line 71
    if-eqz v14, :cond_8

    .line 72
    .line 73
    new-instance v15, Ljava/util/ArrayList;

    .line 74
    .line 75
    const/16 v3, 0xa

    .line 76
    .line 77
    invoke-static {v14, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v14

    .line 92
    if-eqz v14, :cond_7

    .line 93
    .line 94
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v14

    .line 98
    check-cast v14, La/vmg;

    .line 99
    .line 100
    new-instance v16, La/jmg;

    .line 101
    .line 102
    move-object/from16 v22, v1

    .line 103
    .line 104
    iget-object v1, v14, La/vmg;->a:Ljava/lang/String;

    .line 105
    .line 106
    if-nez v1, :cond_4

    .line 107
    .line 108
    move-object/from16 v20, v11

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    move-object/from16 v20, v1

    .line 112
    .line 113
    :goto_4
    iget-object v1, v14, La/vmg;->c:Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v1}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v21

    .line 119
    iget-object v1, v14, La/vmg;->d:Ljava/lang/Double;

    .line 120
    .line 121
    if-eqz v1, :cond_5

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 124
    .line 125
    .line 126
    move-result-wide v17

    .line 127
    goto :goto_5

    .line 128
    :cond_5
    const-wide/16 v17, 0x0

    .line 129
    .line 130
    :goto_5
    iget-object v1, v14, La/vmg;->e:Ljava/lang/Integer;

    .line 131
    .line 132
    if-eqz v1, :cond_6

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    move/from16 v19, v1

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_6
    const/16 v19, 0x0

    .line 142
    .line 143
    :goto_6
    invoke-direct/range {v16 .. v21}, La/jmg;-><init>(DILjava/lang/String;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    move-object/from16 v1, v16

    .line 147
    .line 148
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-object/from16 v1, v22

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    move-object/from16 v22, v1

    .line 155
    .line 156
    goto :goto_7

    .line 157
    :cond_8
    move-object/from16 v22, v1

    .line 158
    .line 159
    const/4 v15, 0x0

    .line 160
    :goto_7
    if-nez v15, :cond_9

    .line 161
    .line 162
    sget-object v15, La/iun;->a:La/iun;

    .line 163
    .line 164
    :cond_9
    iget-object v0, v0, La/zmg;->p:Ljava/lang/String;

    .line 165
    .line 166
    if-nez v0, :cond_a

    .line 167
    .line 168
    move-object v0, v11

    .line 169
    :cond_a
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-lez v1, :cond_f

    .line 174
    .line 175
    new-instance v1, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    sget-object v3, La/ujn;->h:Ljava/lang/String;

    .line 178
    .line 179
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const-string v3, "playerlogo/"

    .line 183
    .line 184
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    if-nez v3, :cond_b

    .line 193
    .line 194
    const/4 v3, 0x0

    .line 195
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 196
    .line 197
    .line 198
    goto :goto_9

    .line 199
    :cond_b
    const/4 v3, 0x0

    .line 200
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v0, v11, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    if-nez v11, :cond_e

    .line 207
    .line 208
    const-string v11, "https://"

    .line 209
    .line 210
    invoke-static {v0, v11, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 211
    .line 212
    .line 213
    move-result v11

    .line 214
    if-eqz v11, :cond_c

    .line 215
    .line 216
    const/4 v14, 0x0

    .line 217
    goto :goto_8

    .line 218
    :cond_c
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    const/16 v11, 0x2f

    .line 223
    .line 224
    if-lez v3, :cond_d

    .line 225
    .line 226
    const-string v3, "/"

    .line 227
    .line 228
    invoke-static {v1, v3}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-nez v3, :cond_d

    .line 233
    .line 234
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    :cond_d
    const/4 v3, 0x1

    .line 238
    new-array v3, v3, [C

    .line 239
    .line 240
    const/4 v14, 0x0

    .line 241
    aput-char v11, v3, v14

    .line 242
    .line 243
    invoke-static {v0, v3}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    goto :goto_9

    .line 251
    :cond_e
    move v14, v3

    .line 252
    :goto_8
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    :goto_9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    move-object v3, v9

    .line 263
    move v9, v12

    .line 264
    move-object v12, v0

    .line 265
    move-object v11, v15

    .line 266
    move-object/from16 v1, v22

    .line 267
    .line 268
    move-object v0, v10

    .line 269
    move v10, v13

    .line 270
    goto :goto_a

    .line 271
    :cond_f
    move-object v3, v9

    .line 272
    move v9, v12

    .line 273
    move-object v12, v11

    .line 274
    move-object v0, v10

    .line 275
    move v10, v13

    .line 276
    move-object/from16 v1, v22

    .line 277
    .line 278
    move-object v11, v15

    .line 279
    :goto_a
    invoke-direct/range {v0 .. v12}, La/wmg;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;ZILjava/util/List;Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    return-object v0
.end method

.method public static final Z(Ljava/util/List;)La/qrh;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, La/hyt0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v1, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/hyt0;

    .line 16
    .line 17
    new-instance v1, La/qrh;

    .line 18
    .line 19
    const-string v2, ""

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {v0}, La/ahb;->a0(La/hyt0;)La/vrh;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, La/vrh;

    .line 29
    .line 30
    sget-object v3, La/iun;->a:La/iun;

    .line 31
    .line 32
    invoke-direct {v0, v3, v3, v2, v2}, La/vrh;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    if-eqz p0, :cond_1

    .line 36
    .line 37
    invoke-static {p0}, La/ahb;->a0(La/hyt0;)La/vrh;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p0, La/vrh;

    .line 43
    .line 44
    sget-object v3, La/iun;->a:La/iun;

    .line 45
    .line 46
    invoke-direct {p0, v3, v3, v2, v2}, La/vrh;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    invoke-direct {v1, v0, p0}, La/qrh;-><init>(La/vrh;La/vrh;)V

    .line 50
    .line 51
    .line 52
    return-object v1
.end method

.method public static final a(La/mm40;La/o0x;La/f6m;La/o0x;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    move-object/from16 v0, p7

    .line 16
    .line 17
    move/from16 v8, p8

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const v9, 0x3d2514fc

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v9}, La/fet;->g0(I)La/fet;

    .line 32
    .line 33
    .line 34
    and-int/lit8 v9, v8, 0x6

    .line 35
    .line 36
    if-nez v9, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-eqz v9, :cond_0

    .line 43
    .line 44
    const/4 v9, 0x4

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v9, 0x2

    .line 47
    :goto_0
    or-int/2addr v9, v8

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move v9, v8

    .line 50
    :goto_1
    and-int/lit8 v10, v8, 0x30

    .line 51
    .line 52
    if-nez v10, :cond_3

    .line 53
    .line 54
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_2

    .line 59
    .line 60
    const/16 v10, 0x20

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/16 v10, 0x10

    .line 64
    .line 65
    :goto_2
    or-int/2addr v9, v10

    .line 66
    :cond_3
    and-int/lit16 v10, v8, 0x180

    .line 67
    .line 68
    if-nez v10, :cond_5

    .line 69
    .line 70
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    if-eqz v10, :cond_4

    .line 75
    .line 76
    const/16 v10, 0x100

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    const/16 v10, 0x80

    .line 80
    .line 81
    :goto_3
    or-int/2addr v9, v10

    .line 82
    :cond_5
    and-int/lit16 v10, v8, 0xc00

    .line 83
    .line 84
    if-nez v10, :cond_7

    .line 85
    .line 86
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_6

    .line 91
    .line 92
    const/16 v10, 0x800

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_6
    const/16 v10, 0x400

    .line 96
    .line 97
    :goto_4
    or-int/2addr v9, v10

    .line 98
    :cond_7
    and-int/lit16 v10, v8, 0x6000

    .line 99
    .line 100
    if-nez v10, :cond_9

    .line 101
    .line 102
    invoke-virtual {v0, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v10

    .line 106
    if-eqz v10, :cond_8

    .line 107
    .line 108
    const/16 v10, 0x4000

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_8
    const/16 v10, 0x2000

    .line 112
    .line 113
    :goto_5
    or-int/2addr v9, v10

    .line 114
    :cond_9
    const/high16 v10, 0x30000

    .line 115
    .line 116
    and-int/2addr v10, v8

    .line 117
    if-nez v10, :cond_b

    .line 118
    .line 119
    invoke-virtual {v0, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-eqz v10, :cond_a

    .line 124
    .line 125
    const/high16 v10, 0x20000

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_a
    const/high16 v10, 0x10000

    .line 129
    .line 130
    :goto_6
    or-int/2addr v9, v10

    .line 131
    :cond_b
    const/high16 v10, 0x180000

    .line 132
    .line 133
    and-int/2addr v10, v8

    .line 134
    if-nez v10, :cond_d

    .line 135
    .line 136
    invoke-virtual {v0, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    if-eqz v10, :cond_c

    .line 141
    .line 142
    const/high16 v10, 0x100000

    .line 143
    .line 144
    goto :goto_7

    .line 145
    :cond_c
    const/high16 v10, 0x80000

    .line 146
    .line 147
    :goto_7
    or-int/2addr v9, v10

    .line 148
    :cond_d
    const v10, 0x92493

    .line 149
    .line 150
    .line 151
    and-int/2addr v10, v9

    .line 152
    const v11, 0x92492

    .line 153
    .line 154
    .line 155
    const/4 v13, 0x1

    .line 156
    if-eq v10, v11, :cond_e

    .line 157
    .line 158
    move v10, v13

    .line 159
    goto :goto_8

    .line 160
    :cond_e
    const/4 v10, 0x0

    .line 161
    :goto_8
    and-int/lit8 v11, v9, 0x1

    .line 162
    .line 163
    invoke-virtual {v0, v11, v10}, La/fet;->U(IZ)Z

    .line 164
    .line 165
    .line 166
    move-result v10

    .line 167
    if-eqz v10, :cond_16

    .line 168
    .line 169
    const-string v10, "ChampInfoTestTag"

    .line 170
    .line 171
    invoke-static {v1, v10}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    sget-object v11, La/qmk;->a:La/zcl;

    .line 176
    .line 177
    new-instance v11, La/qw3;

    .line 178
    .line 179
    new-instance v14, La/jf4;

    .line 180
    .line 181
    const/16 v15, 0xe

    .line 182
    .line 183
    invoke-direct {v14, v15}, La/jf4;-><init>(B)V

    .line 184
    .line 185
    .line 186
    const/high16 v12, 0x40800000    # 4.0f

    .line 187
    .line 188
    invoke-direct {v11, v12, v13, v14}, La/qw3;-><init>(FZLa/rw3;)V

    .line 189
    .line 190
    .line 191
    sget-object v14, La/gqw0;->j:La/yx7;

    .line 192
    .line 193
    const/16 v12, 0x30

    .line 194
    .line 195
    invoke-static {v11, v14, v0, v12}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 196
    .line 197
    .line 198
    move-result-object v11

    .line 199
    iget-wide v12, v0, La/fet;->T:J

    .line 200
    .line 201
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 206
    .line 207
    .line 208
    move-result-object v13

    .line 209
    invoke-static {v0, v10}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 210
    .line 211
    .line 212
    move-result-object v10

    .line 213
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 214
    .line 215
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, La/fet;->i0()V

    .line 219
    .line 220
    .line 221
    iget-boolean v15, v0, La/fet;->S:Z

    .line 222
    .line 223
    sget-object v1, La/e7z;->u1:La/pcy;

    .line 224
    .line 225
    if-eqz v15, :cond_f

    .line 226
    .line 227
    invoke-virtual {v0, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 228
    .line 229
    .line 230
    goto :goto_9

    .line 231
    :cond_f
    invoke-virtual {v0}, La/fet;->r0()V

    .line 232
    .line 233
    .line 234
    :goto_9
    sget-object v15, La/gqw0;->x:La/shd;

    .line 235
    .line 236
    invoke-static {v0, v11, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 237
    .line 238
    .line 239
    sget-object v11, La/gqw0;->w:La/shd;

    .line 240
    .line 241
    invoke-static {v0, v13, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 245
    .line 246
    .line 247
    move-result-object v12

    .line 248
    sget-object v13, La/gqw0;->y:La/shd;

    .line 249
    .line 250
    invoke-static {v0, v12, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 251
    .line 252
    .line 253
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 254
    .line 255
    .line 256
    sget-object v12, La/gqw0;->v:La/shd;

    .line 257
    .line 258
    invoke-static {v0, v10, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 259
    .line 260
    .line 261
    const/high16 v10, 0x3f800000    # 1.0f

    .line 262
    .line 263
    move/from16 v17, v9

    .line 264
    .line 265
    float-to-double v8, v10

    .line 266
    const-wide/16 v18, 0x0

    .line 267
    .line 268
    cmpl-double v8, v8, v18

    .line 269
    .line 270
    const-string v9, "invalid weight; must be greater than zero"

    .line 271
    .line 272
    if-lez v8, :cond_10

    .line 273
    .line 274
    goto :goto_a

    .line 275
    :cond_10
    invoke-static {v9}, La/vcx;->a(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    :goto_a
    new-instance v8, La/x7z;

    .line 279
    .line 280
    const v20, 0x7f7fffff    # Float.MAX_VALUE

    .line 281
    .line 282
    .line 283
    cmpl-float v21, v10, v20

    .line 284
    .line 285
    if-lez v21, :cond_11

    .line 286
    .line 287
    move/from16 v10, v20

    .line 288
    .line 289
    :cond_11
    move-object/from16 v22, v9

    .line 290
    .line 291
    const/4 v9, 0x1

    .line 292
    invoke-direct {v8, v10, v9}, La/x7z;-><init>(FZ)V

    .line 293
    .line 294
    .line 295
    new-instance v10, La/qw3;

    .line 296
    .line 297
    new-instance v4, La/jf4;

    .line 298
    .line 299
    const/16 v7, 0xe

    .line 300
    .line 301
    invoke-direct {v4, v7}, La/jf4;-><init>(B)V

    .line 302
    .line 303
    .line 304
    const/high16 v7, 0x40800000    # 4.0f

    .line 305
    .line 306
    invoke-direct {v10, v7, v9, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 307
    .line 308
    .line 309
    const/16 v4, 0x30

    .line 310
    .line 311
    invoke-static {v10, v14, v0, v4}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    iget-wide v9, v0, La/fet;->T:J

    .line 316
    .line 317
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 318
    .line 319
    .line 320
    move-result v7

    .line 321
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    invoke-static {v0, v8}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 326
    .line 327
    .line 328
    move-result-object v8

    .line 329
    invoke-virtual {v0}, La/fet;->i0()V

    .line 330
    .line 331
    .line 332
    iget-boolean v10, v0, La/fet;->S:Z

    .line 333
    .line 334
    if-eqz v10, :cond_12

    .line 335
    .line 336
    invoke-virtual {v0, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 337
    .line 338
    .line 339
    goto :goto_b

    .line 340
    :cond_12
    invoke-virtual {v0}, La/fet;->r0()V

    .line 341
    .line 342
    .line 343
    :goto_b
    invoke-static {v0, v4, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v0, v9, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 347
    .line 348
    .line 349
    invoke-static {v7, v0, v13, v0}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 350
    .line 351
    .line 352
    invoke-static {v0, v8, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 353
    .line 354
    .line 355
    shr-int/lit8 v1, v17, 0x3

    .line 356
    .line 357
    and-int/lit8 v4, v1, 0xe

    .line 358
    .line 359
    shr-int/lit8 v7, v17, 0x9

    .line 360
    .line 361
    and-int/lit8 v8, v7, 0x70

    .line 362
    .line 363
    or-int/2addr v4, v8

    .line 364
    invoke-static {v2, v5, v0, v4}, La/ahb;->o(La/o0x;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 365
    .line 366
    .line 367
    const/high16 v4, 0x3f800000    # 1.0f

    .line 368
    .line 369
    float-to-double v8, v4

    .line 370
    cmpl-double v8, v8, v18

    .line 371
    .line 372
    if-lez v8, :cond_13

    .line 373
    .line 374
    goto :goto_c

    .line 375
    :cond_13
    invoke-static/range {v22 .. v22}, La/vcx;->a(Ljava/lang/String;)V

    .line 376
    .line 377
    .line 378
    :goto_c
    new-instance v8, La/x7z;

    .line 379
    .line 380
    cmpl-float v9, v4, v20

    .line 381
    .line 382
    if-lez v9, :cond_14

    .line 383
    .line 384
    move/from16 v10, v20

    .line 385
    .line 386
    :goto_d
    const/4 v4, 0x0

    .line 387
    goto :goto_e

    .line 388
    :cond_14
    move v10, v4

    .line 389
    goto :goto_d

    .line 390
    :goto_e
    invoke-direct {v8, v10, v4}, La/x7z;-><init>(FZ)V

    .line 391
    .line 392
    .line 393
    and-int/lit8 v1, v1, 0x70

    .line 394
    .line 395
    and-int/lit16 v7, v7, 0x380

    .line 396
    .line 397
    or-int/2addr v1, v7

    .line 398
    invoke-static {v8, v3, v6, v0, v1}, La/ahb;->u(La/mm40;La/f6m;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 399
    .line 400
    .line 401
    const/4 v9, 0x1

    .line 402
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 403
    .line 404
    .line 405
    if-nez p3, :cond_15

    .line 406
    .line 407
    const v1, 0x622d2855

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v0, v4}, La/fet;->r(Z)V

    .line 414
    .line 415
    .line 416
    move-object/from16 v7, p3

    .line 417
    .line 418
    move-object/from16 v8, p6

    .line 419
    .line 420
    :goto_f
    const/4 v9, 0x1

    .line 421
    goto :goto_10

    .line 422
    :cond_15
    const v1, 0x622d2856

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 426
    .line 427
    .line 428
    shr-int/lit8 v1, v17, 0xf

    .line 429
    .line 430
    and-int/lit8 v1, v1, 0x70

    .line 431
    .line 432
    move-object/from16 v7, p3

    .line 433
    .line 434
    move-object/from16 v8, p6

    .line 435
    .line 436
    invoke-static {v7, v8, v0, v1}, La/ahb;->p(La/o0x;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v4}, La/fet;->r(Z)V

    .line 440
    .line 441
    .line 442
    goto :goto_f

    .line 443
    :goto_10
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 444
    .line 445
    .line 446
    goto :goto_11

    .line 447
    :cond_16
    move-object v8, v7

    .line 448
    move-object v7, v4

    .line 449
    invoke-virtual {v0}, La/fet;->X()V

    .line 450
    .line 451
    .line 452
    :goto_11
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 453
    .line 454
    .line 455
    move-result-object v9

    .line 456
    if-eqz v9, :cond_17

    .line 457
    .line 458
    new-instance v0, La/t49;

    .line 459
    .line 460
    move-object/from16 v1, p0

    .line 461
    .line 462
    move-object v4, v7

    .line 463
    move-object v7, v8

    .line 464
    move/from16 v8, p8

    .line 465
    .line 466
    invoke-direct/range {v0 .. v8}, La/t49;-><init>(La/mm40;La/o0x;La/f6m;La/o0x;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 467
    .line 468
    .line 469
    iput-object v0, v9, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 470
    .line 471
    :cond_17
    return-void
.end method

.method public static final a0(La/hyt0;)La/vrh;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/hyt0;->c:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    move-object v1, v2

    .line 10
    :cond_0
    iget-object v3, v0, La/hyt0;->e:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v3}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-object v4, v0, La/hyt0;->f:Ljava/util/List;

    .line 17
    .line 18
    const/16 v6, 0xa

    .line 19
    .line 20
    if-eqz v4, :cond_7

    .line 21
    .line 22
    new-instance v7, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-static {v4, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 25
    .line 26
    .line 27
    move-result v8

    .line 28
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-eqz v8, :cond_8

    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    check-cast v8, La/urh;

    .line 46
    .line 47
    new-instance v9, La/rrh;

    .line 48
    .line 49
    iget-object v10, v8, La/urh;->a:Ljava/lang/Long;

    .line 50
    .line 51
    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v10

    .line 55
    iget-object v11, v8, La/urh;->b:Ljava/lang/String;

    .line 56
    .line 57
    if-nez v11, :cond_1

    .line 58
    .line 59
    move-object v11, v2

    .line 60
    :cond_1
    iget-object v12, v8, La/urh;->f:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v12}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v12

    .line 66
    iget-object v13, v8, La/urh;->h:Ljava/lang/Float;

    .line 67
    .line 68
    if-eqz v13, :cond_2

    .line 69
    .line 70
    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result v13

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 v13, 0x0

    .line 76
    :goto_1
    iget-object v15, v8, La/urh;->i:Ljava/lang/Float;

    .line 77
    .line 78
    if-eqz v15, :cond_3

    .line 79
    .line 80
    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    .line 81
    .line 82
    .line 83
    move-result v15

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const/4 v15, 0x0

    .line 86
    :goto_2
    iget-object v5, v8, La/urh;->j:Ljava/lang/Float;

    .line 87
    .line 88
    if-eqz v5, :cond_4

    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    goto :goto_3

    .line 95
    :cond_4
    const/4 v5, 0x0

    .line 96
    :goto_3
    iget-object v14, v8, La/urh;->k:Ljava/lang/Float;

    .line 97
    .line 98
    if-eqz v14, :cond_5

    .line 99
    .line 100
    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result v14

    .line 104
    goto :goto_4

    .line 105
    :cond_5
    const/4 v14, 0x0

    .line 106
    :goto_4
    iget-object v6, v8, La/urh;->l:Ljava/lang/Float;

    .line 107
    .line 108
    if-eqz v6, :cond_6

    .line 109
    .line 110
    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    move/from16 v17, v6

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_6
    const/16 v17, 0x0

    .line 118
    .line 119
    :goto_5
    iget-object v6, v8, La/urh;->m:Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {v6}, La/lmc;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v18

    .line 125
    move/from16 v16, v14

    .line 126
    .line 127
    move v14, v15

    .line 128
    move v15, v5

    .line 129
    invoke-direct/range {v9 .. v18}, La/rrh;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFFFFLjava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    const/16 v6, 0xa

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_7
    const/4 v7, 0x0

    .line 139
    :cond_8
    if-nez v7, :cond_9

    .line 140
    .line 141
    sget-object v7, La/iun;->a:La/iun;

    .line 142
    .line 143
    :cond_9
    iget-object v0, v0, La/hyt0;->g:Ljava/util/List;

    .line 144
    .line 145
    if-eqz v0, :cond_11

    .line 146
    .line 147
    new-instance v4, Ljava/util/ArrayList;

    .line 148
    .line 149
    const/16 v5, 0xa

    .line 150
    .line 151
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-eqz v5, :cond_e

    .line 167
    .line 168
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    check-cast v5, La/prh;

    .line 173
    .line 174
    new-instance v6, La/wxt0;

    .line 175
    .line 176
    iget-object v8, v5, La/prh;->a:Ljava/lang/String;

    .line 177
    .line 178
    if-nez v8, :cond_a

    .line 179
    .line 180
    move-object v8, v2

    .line 181
    :cond_a
    iget-object v9, v5, La/prh;->b:Ljava/lang/String;

    .line 182
    .line 183
    if-nez v9, :cond_b

    .line 184
    .line 185
    move-object v9, v2

    .line 186
    :cond_b
    iget-object v10, v5, La/prh;->c:Ljava/lang/Integer;

    .line 187
    .line 188
    const/4 v11, 0x0

    .line 189
    if-eqz v10, :cond_c

    .line 190
    .line 191
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    goto :goto_7

    .line 196
    :cond_c
    move v10, v11

    .line 197
    :goto_7
    iget-object v5, v5, La/prh;->d:Ljava/lang/Integer;

    .line 198
    .line 199
    if-eqz v5, :cond_d

    .line 200
    .line 201
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    :cond_d
    invoke-direct {v6, v10, v8, v11, v9}, La/wxt0;-><init>(ILjava/lang/String;ILjava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_e
    new-instance v5, Ljava/util/ArrayList;

    .line 213
    .line 214
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    :cond_f
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_12

    .line 226
    .line 227
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    move-object v4, v2

    .line 232
    check-cast v4, La/wxt0;

    .line 233
    .line 234
    iget v6, v4, La/wxt0;->c:I

    .line 235
    .line 236
    if-nez v6, :cond_10

    .line 237
    .line 238
    iget v4, v4, La/wxt0;->d:I

    .line 239
    .line 240
    if-eqz v4, :cond_f

    .line 241
    .line 242
    :cond_10
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    goto :goto_8

    .line 246
    :cond_11
    const/4 v5, 0x0

    .line 247
    :cond_12
    if-nez v5, :cond_13

    .line 248
    .line 249
    sget-object v5, La/iun;->a:La/iun;

    .line 250
    .line 251
    :cond_13
    new-instance v0, La/vrh;

    .line 252
    .line 253
    invoke-direct {v0, v7, v5, v1, v3}, La/vrh;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    return-object v0
.end method

.method public static final b(La/mm40;Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;La/fet;I)V
    .locals 28

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
    const v3, 0x7feef02e

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v3}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x2

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v3, v4

    .line 23
    :goto_0
    or-int v3, p3, v3

    .line 24
    .line 25
    invoke-virtual {v2, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_1

    .line 30
    .line 31
    const/16 v5, 0x20

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/16 v5, 0x10

    .line 35
    .line 36
    :goto_1
    or-int/2addr v3, v5

    .line 37
    and-int/lit8 v5, v3, 0x13

    .line 38
    .line 39
    const/16 v6, 0x12

    .line 40
    .line 41
    const/4 v7, 0x1

    .line 42
    if-eq v5, v6, :cond_2

    .line 43
    .line 44
    move v5, v7

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/4 v5, 0x0

    .line 47
    :goto_2
    and-int/2addr v3, v7

    .line 48
    invoke-virtual {v2, v3, v5}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_4

    .line 53
    .line 54
    const/high16 v3, 0x3f800000    # 1.0f

    .line 55
    .line 56
    invoke-static {v0, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    sget-object v6, La/qmk;->a:La/zcl;

    .line 61
    .line 62
    const/high16 v6, 0x42100000    # 36.0f

    .line 63
    .line 64
    invoke-static {v5, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 69
    .line 70
    invoke-virtual {v2, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    check-cast v8, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 75
    .line 76
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSeparator60-0d7_KjU()J

    .line 77
    .line 78
    .line 79
    move-result-wide v8

    .line 80
    sget-object v10, La/qmk;->e:La/zcl;

    .line 81
    .line 82
    sget-object v11, La/vgg0;->a:La/ugg0;

    .line 83
    .line 84
    new-instance v11, La/ugg0;

    .line 85
    .line 86
    invoke-direct {v11, v10, v10, v10, v10}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v5, v3, v8, v9, v11}, La/i120;->S(La/mm40;FJLa/yjj0;)La/mm40;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    const/high16 v5, 0x41400000    # 12.0f

    .line 94
    .line 95
    const/4 v8, 0x0

    .line 96
    invoke-static {v3, v5, v8, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    sget-object v4, La/gqw0;->k:La/yx7;

    .line 101
    .line 102
    sget-object v5, La/uc9;->g:La/nw3;

    .line 103
    .line 104
    const/16 v8, 0x36

    .line 105
    .line 106
    invoke-static {v5, v4, v2, v8}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    iget-wide v8, v2, La/fet;->T:J

    .line 111
    .line 112
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-static {v2, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 125
    .line 126
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2}, La/fet;->i0()V

    .line 130
    .line 131
    .line 132
    iget-boolean v9, v2, La/fet;->S:Z

    .line 133
    .line 134
    if-eqz v9, :cond_3

    .line 135
    .line 136
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 137
    .line 138
    invoke-virtual {v2, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 139
    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_3
    invoke-virtual {v2}, La/fet;->r0()V

    .line 143
    .line 144
    .line 145
    :goto_3
    sget-object v9, La/gqw0;->x:La/shd;

    .line 146
    .line 147
    invoke-static {v2, v4, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 148
    .line 149
    .line 150
    sget-object v4, La/gqw0;->w:La/shd;

    .line 151
    .line 152
    invoke-static {v2, v8, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    sget-object v5, La/gqw0;->y:La/shd;

    .line 160
    .line 161
    invoke-static {v2, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 165
    .line 166
    .line 167
    sget-object v4, La/gqw0;->v:La/shd;

    .line 168
    .line 169
    invoke-static {v2, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 170
    .line 171
    .line 172
    iget-object v3, v1, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->a:Ljava/lang/String;

    .line 173
    .line 174
    invoke-virtual {v2, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 179
    .line 180
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 181
    .line 182
    .line 183
    move-result-wide v4

    .line 184
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 185
    .line 186
    .line 187
    move-result-object v22

    .line 188
    const/16 v25, 0x0

    .line 189
    .line 190
    const v26, 0x1fffa

    .line 191
    .line 192
    .line 193
    move-object v2, v3

    .line 194
    const/4 v3, 0x0

    .line 195
    move-object v8, v6

    .line 196
    const/4 v6, 0x0

    .line 197
    move v10, v7

    .line 198
    move-object v9, v8

    .line 199
    const-wide/16 v7, 0x0

    .line 200
    .line 201
    move-object v11, v9

    .line 202
    const/4 v9, 0x0

    .line 203
    move v12, v10

    .line 204
    const/4 v10, 0x0

    .line 205
    move-object v13, v11

    .line 206
    const/4 v11, 0x0

    .line 207
    move v15, v12

    .line 208
    move-object v14, v13

    .line 209
    const-wide/16 v12, 0x0

    .line 210
    .line 211
    move-object/from16 v16, v14

    .line 212
    .line 213
    const/4 v14, 0x0

    .line 214
    move/from16 v18, v15

    .line 215
    .line 216
    move-object/from16 v17, v16

    .line 217
    .line 218
    const-wide/16 v15, 0x0

    .line 219
    .line 220
    move-object/from16 v19, v17

    .line 221
    .line 222
    const/16 v17, 0x0

    .line 223
    .line 224
    move/from16 v20, v18

    .line 225
    .line 226
    const/16 v18, 0x0

    .line 227
    .line 228
    move-object/from16 v21, v19

    .line 229
    .line 230
    const/16 v19, 0x0

    .line 231
    .line 232
    move/from16 v23, v20

    .line 233
    .line 234
    const/16 v20, 0x0

    .line 235
    .line 236
    move-object/from16 v24, v21

    .line 237
    .line 238
    const/16 v21, 0x0

    .line 239
    .line 240
    move-object/from16 v27, v24

    .line 241
    .line 242
    const/16 v24, 0x0

    .line 243
    .line 244
    move-object/from16 v23, p2

    .line 245
    .line 246
    move-object/from16 v0, v27

    .line 247
    .line 248
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 249
    .line 250
    .line 251
    move-object/from16 v2, v23

    .line 252
    .line 253
    iget-object v3, v1, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->b:Ljava/lang/String;

    .line 254
    .line 255
    invoke-virtual {v2, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 260
    .line 261
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 262
    .line 263
    .line 264
    move-result-wide v4

    .line 265
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 266
    .line 267
    .line 268
    move-result-object v22

    .line 269
    move-object v2, v3

    .line 270
    const/4 v3, 0x0

    .line 271
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 272
    .line 273
    .line 274
    move-object/from16 v2, v23

    .line 275
    .line 276
    const/4 v12, 0x1

    .line 277
    invoke-virtual {v2, v12}, La/fet;->r(Z)V

    .line 278
    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_4
    move v12, v7

    .line 282
    invoke-virtual {v2}, La/fet;->X()V

    .line 283
    .line 284
    .line 285
    :goto_4
    invoke-virtual {v2}, La/fet;->u()La/yfe0;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    if-eqz v0, :cond_5

    .line 290
    .line 291
    new-instance v2, La/chh;

    .line 292
    .line 293
    move-object/from16 v3, p0

    .line 294
    .line 295
    move/from16 v4, p3

    .line 296
    .line 297
    invoke-direct {v2, v3, v1, v4, v12}, La/chh;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 298
    .line 299
    .line 300
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 301
    .line 302
    :cond_5
    return-void
.end method

.method public static final b0(La/vxt0;La/m9s;)La/la30;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object p0, La/mc6;->b:La/yk5;

    .line 8
    .line 9
    iget-object p1, p1, La/m9s;->h:La/qqs;

    .line 10
    .line 11
    iget v0, p1, La/qqs;->n:I

    .line 12
    .line 13
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, La/yk5;->d(Ljava/lang/Integer;)La/mc6;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-byte v1, p0, La/mc6;->a:B

    .line 25
    .line 26
    new-instance v0, La/la30;

    .line 27
    .line 28
    iget p0, p1, La/qqs;->d:I

    .line 29
    .line 30
    invoke-static {v1, p0}, La/qem0;->l(II)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-static {v1, p0}, La/qem0;->l(II)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    const-string v4, ""

    .line 41
    .line 42
    invoke-direct/range {v0 .. v6}, La/la30;-><init>(IJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public static final c(La/mm40;La/m3w;La/fet;I)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, 0x3eae3744

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x2

    .line 19
    :goto_0
    or-int/2addr v0, p3

    .line 20
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    const/16 v1, 0x20

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/16 v1, 0x10

    .line 30
    .line 31
    :goto_1
    or-int/2addr v0, v1

    .line 32
    and-int/lit8 v1, v0, 0x13

    .line 33
    .line 34
    const/16 v2, 0x12

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x1

    .line 38
    if-eq v1, v2, :cond_2

    .line 39
    .line 40
    move v1, v4

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v1, v3

    .line 43
    :goto_2
    and-int/2addr v0, v4

    .line 44
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_7

    .line 49
    .line 50
    const/high16 v0, 0x3f800000    # 1.0f

    .line 51
    .line 52
    invoke-static {p0, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v1, p1, La/m3w;->a:Ljava/lang/String;

    .line 57
    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, "COMPACT_TITLE_REMEMBER_ID"

    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    sget-object v5, La/ukd;->a:La/cl5;

    .line 84
    .line 85
    if-nez v1, :cond_3

    .line 86
    .line 87
    if-ne v2, v5, :cond_4

    .line 88
    .line 89
    :cond_3
    new-instance v1, La/ebd;

    .line 90
    .line 91
    invoke-direct {v1, p1, v3}, La/ebd;-><init>(La/m3w;B)V

    .line 92
    .line 93
    .line 94
    new-instance v2, La/ugd;

    .line 95
    .line 96
    const v6, -0x1dc60c2c

    .line 97
    .line 98
    .line 99
    invoke-direct {v2, v6, v4, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 106
    .line 107
    iget-object v1, p1, La/m3w;->b:Ljava/lang/String;

    .line 108
    .line 109
    new-instance v6, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v1, "COMPACT_DESCRIPTION_REMEMBER_ID"

    .line 118
    .line 119
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-virtual {p2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    if-nez v1, :cond_5

    .line 135
    .line 136
    if-ne v6, v5, :cond_6

    .line 137
    .line 138
    :cond_5
    new-instance v1, La/ebd;

    .line 139
    .line 140
    invoke-direct {v1, p1, v4}, La/ebd;-><init>(La/m3w;B)V

    .line 141
    .line 142
    .line 143
    new-instance v6, La/ugd;

    .line 144
    .line 145
    const v5, -0x13437deb

    .line 146
    .line 147
    .line 148
    invoke-direct {v6, v5, v4, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p2, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_6
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 155
    .line 156
    invoke-static {v0, v2, v6, p2, v3}, La/hmw0;->j(La/mm40;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 157
    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 161
    .line 162
    .line 163
    :goto_3
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    if-eqz p2, :cond_8

    .line 168
    .line 169
    new-instance v0, La/fbd;

    .line 170
    .line 171
    invoke-direct {v0, p0, p1, p3, v3}, La/fbd;-><init>(La/mm40;La/m3w;IB)V

    .line 172
    .line 173
    .line 174
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 175
    .line 176
    :cond_8
    return-void
.end method

.method public static final d(La/mm40;La/p4f;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 40

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v9, p3

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const v0, 0x77b4a8c7

    .line 13
    .line 14
    .line 15
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x2

    .line 27
    :goto_0
    or-int v0, p4, v0

    .line 28
    .line 29
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    const/16 v4, 0x20

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v4, 0x10

    .line 39
    .line 40
    :goto_1
    or-int/2addr v0, v4

    .line 41
    invoke-virtual {v9, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    const/16 v5, 0x100

    .line 46
    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    move v4, v5

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v4, 0x80

    .line 52
    .line 53
    :goto_2
    or-int/2addr v0, v4

    .line 54
    and-int/lit16 v4, v0, 0x93

    .line 55
    .line 56
    const/16 v6, 0x92

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    const/4 v8, 0x1

    .line 60
    if-eq v4, v6, :cond_3

    .line 61
    .line 62
    move v4, v8

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    move v4, v7

    .line 65
    :goto_3
    and-int/lit8 v6, v0, 0x1

    .line 66
    .line 67
    invoke-virtual {v9, v6, v4}, La/fet;->U(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-eqz v4, :cond_9

    .line 72
    .line 73
    sget-object v4, La/qmk;->a:La/zcl;

    .line 74
    .line 75
    const/high16 v4, 0x42180000    # 38.0f

    .line 76
    .line 77
    invoke-static {v1, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    sget-object v6, La/uc9;->c:La/mw3;

    .line 82
    .line 83
    sget-object v10, La/gqw0;->m:La/xx7;

    .line 84
    .line 85
    invoke-static {v6, v10, v9, v7}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    iget-wide v10, v9, La/fet;->T:J

    .line 90
    .line 91
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-static {v9, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 104
    .line 105
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v9}, La/fet;->i0()V

    .line 109
    .line 110
    .line 111
    iget-boolean v12, v9, La/fet;->S:Z

    .line 112
    .line 113
    sget-object v13, La/e7z;->u1:La/pcy;

    .line 114
    .line 115
    if-eqz v12, :cond_4

    .line 116
    .line 117
    invoke-virtual {v9, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_4
    invoke-virtual {v9}, La/fet;->r0()V

    .line 122
    .line 123
    .line 124
    :goto_4
    sget-object v12, La/gqw0;->x:La/shd;

    .line 125
    .line 126
    invoke-static {v9, v6, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 127
    .line 128
    .line 129
    sget-object v6, La/gqw0;->w:La/shd;

    .line 130
    .line 131
    invoke-static {v9, v11, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    sget-object v11, La/gqw0;->y:La/shd;

    .line 139
    .line 140
    invoke-static {v9, v10, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 144
    .line 145
    .line 146
    sget-object v10, La/gqw0;->v:La/shd;

    .line 147
    .line 148
    invoke-static {v9, v4, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    const v4, 0x7f130273

    .line 152
    .line 153
    .line 154
    invoke-static {v4, v7, v9}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 159
    .line 160
    .line 161
    move-result-object v14

    .line 162
    invoke-static {v14, v9}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 163
    .line 164
    .line 165
    move-result-object v24

    .line 166
    const/16 v27, 0x6180

    .line 167
    .line 168
    const v28, 0x1affe

    .line 169
    .line 170
    .line 171
    move v14, v5

    .line 172
    const/4 v5, 0x0

    .line 173
    move-object v15, v6

    .line 174
    move/from16 v16, v7

    .line 175
    .line 176
    const-wide/16 v6, 0x0

    .line 177
    .line 178
    move/from16 v17, v8

    .line 179
    .line 180
    const/4 v8, 0x0

    .line 181
    move-object/from16 v18, v10

    .line 182
    .line 183
    const-wide/16 v9, 0x0

    .line 184
    .line 185
    move-object/from16 v19, v11

    .line 186
    .line 187
    const/4 v11, 0x0

    .line 188
    move-object/from16 v20, v12

    .line 189
    .line 190
    const/4 v12, 0x0

    .line 191
    move-object/from16 v21, v13

    .line 192
    .line 193
    const/4 v13, 0x0

    .line 194
    move/from16 v23, v14

    .line 195
    .line 196
    move-object/from16 v22, v15

    .line 197
    .line 198
    const-wide/16 v14, 0x0

    .line 199
    .line 200
    move/from16 v25, v16

    .line 201
    .line 202
    const/16 v16, 0x0

    .line 203
    .line 204
    move/from16 v29, v17

    .line 205
    .line 206
    move-object/from16 v26, v18

    .line 207
    .line 208
    const-wide/16 v17, 0x0

    .line 209
    .line 210
    move-object/from16 v30, v19

    .line 211
    .line 212
    const/16 v19, 0x2

    .line 213
    .line 214
    move-object/from16 v31, v20

    .line 215
    .line 216
    const/16 v20, 0x0

    .line 217
    .line 218
    move-object/from16 v32, v21

    .line 219
    .line 220
    const/16 v21, 0x1

    .line 221
    .line 222
    move-object/from16 v33, v22

    .line 223
    .line 224
    const/16 v22, 0x0

    .line 225
    .line 226
    move/from16 v34, v23

    .line 227
    .line 228
    const/16 v23, 0x0

    .line 229
    .line 230
    move-object/from16 v35, v26

    .line 231
    .line 232
    const/16 v26, 0x0

    .line 233
    .line 234
    move-object/from16 v25, p3

    .line 235
    .line 236
    move-object/from16 v37, v30

    .line 237
    .line 238
    move-object/from16 v39, v32

    .line 239
    .line 240
    move-object/from16 v36, v33

    .line 241
    .line 242
    move/from16 v1, v34

    .line 243
    .line 244
    move-object/from16 v38, v35

    .line 245
    .line 246
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 247
    .line 248
    .line 249
    move-object/from16 v9, v25

    .line 250
    .line 251
    iget-boolean v7, v2, La/p4f;->b:Z

    .line 252
    .line 253
    sget-object v5, La/ymx;->e:La/ymx;

    .line 254
    .line 255
    and-int/lit16 v0, v0, 0x380

    .line 256
    .line 257
    if-ne v0, v1, :cond_5

    .line 258
    .line 259
    const/4 v0, 0x1

    .line 260
    goto :goto_5

    .line 261
    :cond_5
    const/4 v0, 0x0

    .line 262
    :goto_5
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    if-nez v0, :cond_6

    .line 267
    .line 268
    sget-object v0, La/ukd;->a:La/cl5;

    .line 269
    .line 270
    if-ne v1, v0, :cond_7

    .line 271
    .line 272
    :cond_6
    new-instance v1, La/pk9;

    .line 273
    .line 274
    const/16 v0, 0xd

    .line 275
    .line 276
    invoke-direct {v1, v3, v0}, La/pk9;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 283
    .line 284
    const/16 v11, 0x61b6

    .line 285
    .line 286
    const/4 v12, 0x0

    .line 287
    sget-object v13, La/jm40;->b:La/jm40;

    .line 288
    .line 289
    const/4 v6, 0x0

    .line 290
    const/4 v8, 0x0

    .line 291
    move-object v10, v9

    .line 292
    move-object v4, v13

    .line 293
    move-object v9, v1

    .line 294
    invoke-static/range {v4 .. v12}, La/phu0;->F(La/mm40;La/ymx;La/d6x;ZLa/gy40;Lkotlin/jvm/functions/Function0;La/fet;II)La/mm40;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    move-object v1, v4

    .line 299
    move-object v9, v10

    .line 300
    sget-object v4, La/gqw0;->k:La/yx7;

    .line 301
    .line 302
    sget-object v5, La/uc9;->a:La/lw3;

    .line 303
    .line 304
    const/16 v6, 0x30

    .line 305
    .line 306
    invoke-static {v5, v4, v9, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 307
    .line 308
    .line 309
    move-result-object v4

    .line 310
    iget-wide v5, v9, La/fet;->T:J

    .line 311
    .line 312
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    invoke-static {v9, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v9}, La/fet;->i0()V

    .line 325
    .line 326
    .line 327
    iget-boolean v7, v9, La/fet;->S:Z

    .line 328
    .line 329
    if-eqz v7, :cond_8

    .line 330
    .line 331
    move-object/from16 v7, v39

    .line 332
    .line 333
    invoke-virtual {v9, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 334
    .line 335
    .line 336
    :goto_6
    move-object/from16 v7, v31

    .line 337
    .line 338
    goto :goto_7

    .line 339
    :cond_8
    invoke-virtual {v9}, La/fet;->r0()V

    .line 340
    .line 341
    .line 342
    goto :goto_6

    .line 343
    :goto_7
    invoke-static {v9, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 344
    .line 345
    .line 346
    move-object/from16 v15, v36

    .line 347
    .line 348
    invoke-static {v9, v6, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 349
    .line 350
    .line 351
    move-object/from16 v4, v37

    .line 352
    .line 353
    invoke-static {v5, v9, v4, v9}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 354
    .line 355
    .line 356
    const/high16 v4, 0x3f800000    # 1.0f

    .line 357
    .line 358
    move-object/from16 v5, v38

    .line 359
    .line 360
    const/4 v6, 0x0

    .line 361
    invoke-static {v9, v0, v5, v4, v6}, La/ohs0;->i(La/fet;La/mm40;La/shd;FZ)La/x7z;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    iget-object v4, v2, La/p4f;->a:Ljava/lang/String;

    .line 366
    .line 367
    invoke-static {}, La/g1t0;->u()La/y9q0;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-static {v0, v9}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 372
    .line 373
    .line 374
    move-result-object v24

    .line 375
    const/16 v27, 0x6180

    .line 376
    .line 377
    const v28, 0x1affc

    .line 378
    .line 379
    .line 380
    const-wide/16 v6, 0x0

    .line 381
    .line 382
    const/4 v8, 0x0

    .line 383
    const-wide/16 v9, 0x0

    .line 384
    .line 385
    const/4 v11, 0x0

    .line 386
    const/4 v12, 0x0

    .line 387
    const/4 v13, 0x0

    .line 388
    const-wide/16 v14, 0x0

    .line 389
    .line 390
    const/16 v16, 0x0

    .line 391
    .line 392
    const-wide/16 v17, 0x0

    .line 393
    .line 394
    const/16 v19, 0x2

    .line 395
    .line 396
    const/16 v20, 0x0

    .line 397
    .line 398
    const/16 v21, 0x1

    .line 399
    .line 400
    const/16 v22, 0x0

    .line 401
    .line 402
    const/16 v23, 0x0

    .line 403
    .line 404
    const/16 v26, 0x0

    .line 405
    .line 406
    move-object/from16 v25, p3

    .line 407
    .line 408
    invoke-static/range {v4 .. v28}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 409
    .line 410
    .line 411
    move-object/from16 v9, v25

    .line 412
    .line 413
    const/16 v17, 0x0

    .line 414
    .line 415
    const/16 v18, 0xe

    .line 416
    .line 417
    const/high16 v14, 0x40800000    # 4.0f

    .line 418
    .line 419
    const/4 v15, 0x0

    .line 420
    const/16 v16, 0x0

    .line 421
    .line 422
    move-object v13, v1

    .line 423
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    const/high16 v1, 0x41600000    # 14.0f

    .line 428
    .line 429
    invoke-static {v0, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    const v0, 0x7f080815

    .line 434
    .line 435
    .line 436
    const/4 v1, 0x0

    .line 437
    invoke-static {v0, v1, v9}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 442
    .line 443
    invoke-virtual {v9, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 448
    .line 449
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 450
    .line 451
    .line 452
    move-result-wide v7

    .line 453
    const/16 v10, 0x38

    .line 454
    .line 455
    const/4 v11, 0x0

    .line 456
    const/4 v5, 0x0

    .line 457
    invoke-static/range {v4 .. v11}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 458
    .line 459
    .line 460
    const/4 v0, 0x1

    .line 461
    invoke-virtual {v9, v0}, La/fet;->r(Z)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v9, v0}, La/fet;->r(Z)V

    .line 465
    .line 466
    .line 467
    goto :goto_8

    .line 468
    :cond_9
    invoke-virtual {v9}, La/fet;->X()V

    .line 469
    .line 470
    .line 471
    :goto_8
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 472
    .line 473
    .line 474
    move-result-object v6

    .line 475
    if-eqz v6, :cond_a

    .line 476
    .line 477
    new-instance v0, La/ywa;

    .line 478
    .line 479
    const/16 v5, 0x17

    .line 480
    .line 481
    move-object/from16 v1, p0

    .line 482
    .line 483
    move/from16 v4, p4

    .line 484
    .line 485
    invoke-direct/range {v0 .. v5}, La/ywa;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 486
    .line 487
    .line 488
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 489
    .line 490
    :cond_a
    return-void
.end method

.method public static final e(Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;La/fet;I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v3, 0xb3283d8

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v3}, La/fet;->g0(I)La/fet;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x2

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    const/4 v3, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v3, v4

    .line 26
    :goto_0
    or-int/2addr v3, v2

    .line 27
    and-int/lit8 v5, v3, 0x3

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    const/4 v7, 0x0

    .line 31
    if-eq v5, v4, :cond_1

    .line 32
    .line 33
    move v4, v6

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v4, v7

    .line 36
    :goto_1
    and-int/lit8 v5, v3, 0x1

    .line 37
    .line 38
    invoke-virtual {v1, v5, v4}, La/fet;->U(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_6

    .line 43
    .line 44
    const/high16 v4, 0x3f800000    # 1.0f

    .line 45
    .line 46
    sget-object v8, La/jm40;->b:La/jm40;

    .line 47
    .line 48
    invoke-static {v8, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 53
    .line 54
    invoke-virtual {v1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 59
    .line 60
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 61
    .line 62
    .line 63
    move-result-wide v9

    .line 64
    sget-object v5, La/jd8;->n:La/ljc;

    .line 65
    .line 66
    invoke-static {v4, v9, v10, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    sget-object v4, La/qmk;->a:La/zcl;

    .line 71
    .line 72
    const/4 v15, 0x0

    .line 73
    const/16 v16, 0x8

    .line 74
    .line 75
    const/high16 v12, 0x41800000    # 16.0f

    .line 76
    .line 77
    const/high16 v13, 0x41800000    # 16.0f

    .line 78
    .line 79
    const/high16 v14, 0x41800000    # 16.0f

    .line 80
    .line 81
    invoke-static/range {v11 .. v16}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    sget-object v5, La/uc9;->c:La/mw3;

    .line 86
    .line 87
    sget-object v9, La/gqw0;->m:La/xx7;

    .line 88
    .line 89
    invoke-static {v5, v9, v1, v7}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    iget-wide v9, v1, La/fet;->T:J

    .line 94
    .line 95
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-static {v1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 108
    .line 109
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, La/fet;->i0()V

    .line 113
    .line 114
    .line 115
    iget-boolean v11, v1, La/fet;->S:Z

    .line 116
    .line 117
    if-eqz v11, :cond_2

    .line 118
    .line 119
    sget-object v11, La/e7z;->u1:La/pcy;

    .line 120
    .line 121
    invoke-virtual {v1, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_2
    invoke-virtual {v1}, La/fet;->r0()V

    .line 126
    .line 127
    .line 128
    :goto_2
    sget-object v11, La/gqw0;->x:La/shd;

    .line 129
    .line 130
    invoke-static {v1, v5, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    sget-object v5, La/gqw0;->w:La/shd;

    .line 134
    .line 135
    invoke-static {v1, v10, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    sget-object v9, La/gqw0;->y:La/shd;

    .line 143
    .line 144
    invoke-static {v1, v5, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 148
    .line 149
    .line 150
    sget-object v5, La/gqw0;->v:La/shd;

    .line 151
    .line 152
    invoke-static {v1, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    sget-object v4, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->Companion:La/ekh;

    .line 156
    .line 157
    and-int/lit8 v3, v3, 0xe

    .line 158
    .line 159
    const/16 v4, 0x8

    .line 160
    .line 161
    or-int/2addr v3, v4

    .line 162
    invoke-static {v0, v1, v3}, La/gkb;->F(Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;La/fet;I)V

    .line 163
    .line 164
    .line 165
    iget-object v3, v0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->i:Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    .line 166
    .line 167
    iget-object v4, v0, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;->h:Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;

    .line 168
    .line 169
    iget-object v5, v4, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->b:Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    const/16 v14, 0x40

    .line 176
    .line 177
    if-lez v5, :cond_3

    .line 178
    .line 179
    const v5, 0xf7d2254

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 183
    .line 184
    .line 185
    const/4 v12, 0x0

    .line 186
    const/16 v13, 0xd

    .line 187
    .line 188
    const/4 v9, 0x0

    .line 189
    const/high16 v10, 0x41000000    # 8.0f

    .line 190
    .line 191
    const/4 v11, 0x0

    .line 192
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-static {v5, v4, v1, v14}, La/ahb;->b(La/mm40;Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;La/fet;I)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1, v7}, La/fet;->r(Z)V

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_3
    const v5, 0xf7fa1b4

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v7}, La/fet;->r(Z)V

    .line 210
    .line 211
    .line 212
    :goto_3
    iget-object v5, v3, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->b:Ljava/lang/String;

    .line 213
    .line 214
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 215
    .line 216
    .line 217
    move-result v5

    .line 218
    if-lez v5, :cond_5

    .line 219
    .line 220
    const v5, 0xf80e44c

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v5}, La/fet;->e0(I)V

    .line 224
    .line 225
    .line 226
    iget-object v4, v4, Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;->b:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    if-lez v4, :cond_4

    .line 233
    .line 234
    const/high16 v4, 0x40800000    # 4.0f

    .line 235
    .line 236
    :goto_4
    move v10, v4

    .line 237
    goto :goto_5

    .line 238
    :cond_4
    const/high16 v4, 0x41000000    # 8.0f

    .line 239
    .line 240
    goto :goto_4

    .line 241
    :goto_5
    const/4 v12, 0x0

    .line 242
    const/16 v13, 0xd

    .line 243
    .line 244
    const/4 v9, 0x0

    .line 245
    const/4 v11, 0x0

    .line 246
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-static {v4, v3, v1, v14}, La/ahb;->b(La/mm40;Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchLabelPresetParams;La/fet;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v1, v7}, La/fet;->r(Z)V

    .line 254
    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_5
    const v3, 0xf8471f4

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v1, v7}, La/fet;->r(Z)V

    .line 264
    .line 265
    .line 266
    :goto_6
    invoke-virtual {v1, v6}, La/fet;->r(Z)V

    .line 267
    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_6
    invoke-virtual {v1}, La/fet;->X()V

    .line 271
    .line 272
    .line 273
    :goto_7
    invoke-virtual {v1}, La/fet;->u()La/yfe0;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    if-eqz v1, :cond_7

    .line 278
    .line 279
    new-instance v3, La/vjh;

    .line 280
    .line 281
    invoke-direct {v3, v0, v2, v7}, La/vjh;-><init>(Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;IB)V

    .line 282
    .line 283
    .line 284
    iput-object v3, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 285
    .line 286
    :cond_7
    return-void
.end method

.method public static final f(La/v2l;La/fet;I)V
    .locals 11

    .line 1
    const v0, 0x57544e84

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x6

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x4

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    or-int/2addr v0, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, p2

    .line 25
    :goto_1
    and-int/lit8 v3, v0, 0x3

    .line 26
    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v4, 0x1

    .line 29
    if-eq v3, v1, :cond_2

    .line 30
    .line 31
    move v3, v4

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move v3, v8

    .line 34
    :goto_2
    and-int/lit8 v6, v0, 0x1

    .line 35
    .line 36
    invoke-virtual {p1, v6, v3}, La/fet;->U(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_9

    .line 41
    .line 42
    sget-object v3, La/qmk;->a:La/zcl;

    .line 43
    .line 44
    const/high16 v3, 0x42b00000    # 88.0f

    .line 45
    .line 46
    sget-object v6, La/jm40;->b:La/jm40;

    .line 47
    .line 48
    invoke-static {v6, v3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const/high16 v6, 0x3f800000    # 1.0f

    .line 53
    .line 54
    invoke-static {v3, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sget-object v6, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 59
    .line 60
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 61
    .line 62
    .line 63
    move-result-wide v6

    .line 64
    const/high16 v9, 0x41800000    # 16.0f

    .line 65
    .line 66
    invoke-static {v9}, La/vgg0;->a(F)La/ugg0;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    invoke-static {v3, v6, v7, v9}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    const-string v6, "DOTA_BAN_PICK"

    .line 75
    .line 76
    invoke-static {v3, v6}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    sget-object v7, La/ukd;->a:La/cl5;

    .line 85
    .line 86
    if-ne v6, v7, :cond_3

    .line 87
    .line 88
    new-instance v6, La/n2l;

    .line 89
    .line 90
    invoke-direct {v6, v8}, La/n2l;-><init>(B)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 97
    .line 98
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    if-ne v9, v7, :cond_4

    .line 103
    .line 104
    new-instance v9, La/n2l;

    .line 105
    .line 106
    invoke-direct {v9, v4}, La/n2l;-><init>(B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_4
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 113
    .line 114
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    if-ne v10, v7, :cond_5

    .line 119
    .line 120
    new-instance v10, La/n2l;

    .line 121
    .line 122
    invoke-direct {v10, v1}, La/n2l;-><init>(B)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 129
    .line 130
    and-int/lit8 v0, v0, 0xe

    .line 131
    .line 132
    if-ne v0, v2, :cond_6

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_6
    move v4, v8

    .line 136
    :goto_3
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-nez v4, :cond_7

    .line 141
    .line 142
    if-ne v0, v7, :cond_8

    .line 143
    .line 144
    :cond_7
    new-instance v0, La/e3j;

    .line 145
    .line 146
    const/16 v1, 0x1a

    .line 147
    .line 148
    invoke-direct {v0, p0, v1}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_8
    move-object v4, v0

    .line 155
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 156
    .line 157
    move-object v0, v6

    .line 158
    const/16 v6, 0xd86

    .line 159
    .line 160
    const/4 v7, 0x0

    .line 161
    move-object v5, p1

    .line 162
    move-object v1, v3

    .line 163
    move-object v2, v9

    .line 164
    move-object v3, v10

    .line 165
    invoke-static/range {v0 .. v7}, La/dwi0;->c(Lkotlin/jvm/functions/Function1;La/mm40;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 166
    .line 167
    .line 168
    goto :goto_4

    .line 169
    :cond_9
    invoke-virtual {p1}, La/fet;->X()V

    .line 170
    .line 171
    .line 172
    :goto_4
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-eqz v0, :cond_a

    .line 177
    .line 178
    new-instance v1, La/o2l;

    .line 179
    .line 180
    invoke-direct {v1, p0, p2, v8}, La/o2l;-><init>(Ljava/lang/Object;IB)V

    .line 181
    .line 182
    .line 183
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 184
    .line 185
    :cond_a
    return-void
.end method

.method public static final g(La/mm40;La/zh0;La/di0;La/lh80;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 14

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v4, p3

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    move-object/from16 v0, p5

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const v1, -0x26cbf131

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/fet;->g0(I)La/fet;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x2

    .line 26
    const/4 v6, 0x4

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    move v1, v6

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v1, v2

    .line 32
    :goto_0
    or-int v1, p6, v1

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 35
    .line 36
    .line 37
    move-result v7

    .line 38
    invoke-virtual {v0, v7}, La/fet;->e(I)Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    if-eqz v7, :cond_1

    .line 43
    .line 44
    const/16 v7, 0x20

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/16 v7, 0x10

    .line 48
    .line 49
    :goto_1
    or-int/2addr v1, v7

    .line 50
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v7

    .line 54
    if-eqz v7, :cond_2

    .line 55
    .line 56
    const/16 v7, 0x100

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const/16 v7, 0x80

    .line 60
    .line 61
    :goto_2
    or-int/2addr v1, v7

    .line 62
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_3

    .line 67
    .line 68
    const/16 v7, 0x800

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    const/16 v7, 0x400

    .line 72
    .line 73
    :goto_3
    or-int/2addr v1, v7

    .line 74
    invoke-virtual {v0, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_4

    .line 79
    .line 80
    const/16 v7, 0x4000

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_4
    const/16 v7, 0x2000

    .line 84
    .line 85
    :goto_4
    or-int/2addr v1, v7

    .line 86
    and-int/lit16 v7, v1, 0x2493

    .line 87
    .line 88
    const/16 v8, 0x2492

    .line 89
    .line 90
    const/4 v9, 0x0

    .line 91
    const/4 v10, 0x1

    .line 92
    if-eq v7, v8, :cond_5

    .line 93
    .line 94
    move v7, v10

    .line 95
    goto :goto_5

    .line 96
    :cond_5
    move v7, v9

    .line 97
    :goto_5
    and-int/lit8 v8, v1, 0x1

    .line 98
    .line 99
    invoke-virtual {v0, v8, v7}, La/fet;->U(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    if-eqz v7, :cond_c

    .line 104
    .line 105
    invoke-static {p0, v4}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    sget-object v8, La/gqw0;->a:La/zx7;

    .line 110
    .line 111
    invoke-static {v8, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    iget-wide v11, v0, La/fet;->T:J

    .line 116
    .line 117
    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    .line 118
    .line 119
    .line 120
    move-result v11

    .line 121
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    invoke-static {v0, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    sget-object v13, La/mkd;->c0:La/gqw0;

    .line 130
    .line 131
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, La/fet;->i0()V

    .line 135
    .line 136
    .line 137
    iget-boolean v13, v0, La/fet;->S:Z

    .line 138
    .line 139
    if-eqz v13, :cond_6

    .line 140
    .line 141
    sget-object v13, La/e7z;->u1:La/pcy;

    .line 142
    .line 143
    invoke-virtual {v0, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 144
    .line 145
    .line 146
    goto :goto_6

    .line 147
    :cond_6
    invoke-virtual {v0}, La/fet;->r0()V

    .line 148
    .line 149
    .line 150
    :goto_6
    sget-object v13, La/gqw0;->x:La/shd;

    .line 151
    .line 152
    invoke-static {v0, v8, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    sget-object v8, La/gqw0;->w:La/shd;

    .line 156
    .line 157
    invoke-static {v0, v12, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    sget-object v11, La/gqw0;->y:La/shd;

    .line 165
    .line 166
    invoke-static {v0, v8, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 170
    .line 171
    .line 172
    sget-object v8, La/gqw0;->v:La/shd;

    .line 173
    .line 174
    invoke-static {v0, v7, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 178
    .line 179
    .line 180
    move-result v7

    .line 181
    if-eqz v7, :cond_b

    .line 182
    .line 183
    if-eq v7, v10, :cond_a

    .line 184
    .line 185
    if-eq v7, v2, :cond_9

    .line 186
    .line 187
    const/4 v2, 0x3

    .line 188
    if-eq v7, v2, :cond_8

    .line 189
    .line 190
    if-ne v7, v6, :cond_7

    .line 191
    .line 192
    const v2, 0x2be829b1

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 196
    .line 197
    .line 198
    shr-int/lit8 v2, v1, 0x6

    .line 199
    .line 200
    and-int/lit8 v2, v2, 0xe

    .line 201
    .line 202
    shr-int/lit8 v1, v1, 0x9

    .line 203
    .line 204
    and-int/lit8 v1, v1, 0x70

    .line 205
    .line 206
    or-int/2addr v1, v2

    .line 207
    invoke-static {v3, v5, v0, v1}, La/knx;->b(La/di0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 211
    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_7
    const p0, -0x175c0789

    .line 215
    .line 216
    .line 217
    invoke-static {p0, v0, v9}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    throw p0

    .line 222
    :cond_8
    const v2, 0x2be50b71

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 226
    .line 227
    .line 228
    shr-int/lit8 v2, v1, 0x6

    .line 229
    .line 230
    and-int/lit8 v2, v2, 0xe

    .line 231
    .line 232
    shr-int/lit8 v1, v1, 0x9

    .line 233
    .line 234
    and-int/lit8 v1, v1, 0x70

    .line 235
    .line 236
    or-int/2addr v1, v2

    .line 237
    invoke-static {v3, v5, v0, v1}, La/ntr;->b(La/di0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 241
    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_9
    const v2, 0x2be1d2cb

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 248
    .line 249
    .line 250
    shr-int/lit8 v2, v1, 0x6

    .line 251
    .line 252
    and-int/lit8 v2, v2, 0xe

    .line 253
    .line 254
    shr-int/lit8 v1, v1, 0x9

    .line 255
    .line 256
    and-int/lit8 v1, v1, 0x70

    .line 257
    .line 258
    or-int/2addr v1, v2

    .line 259
    invoke-static {v3, v5, v0, v1}, La/eeq;->a(La/di0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 263
    .line 264
    .line 265
    goto :goto_7

    .line 266
    :cond_a
    const v2, 0x2bde9892

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 270
    .line 271
    .line 272
    shr-int/lit8 v2, v1, 0x6

    .line 273
    .line 274
    and-int/lit8 v2, v2, 0xe

    .line 275
    .line 276
    shr-int/lit8 v1, v1, 0x9

    .line 277
    .line 278
    and-int/lit8 v1, v1, 0x70

    .line 279
    .line 280
    or-int/2addr v1, v2

    .line 281
    invoke-static {v3, v5, v0, v1}, La/qjj;->a(La/di0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 285
    .line 286
    .line 287
    goto :goto_7

    .line 288
    :cond_b
    const v2, 0x2bdb8d36    # 1.560008E-12f

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 292
    .line 293
    .line 294
    shr-int/lit8 v2, v1, 0x6

    .line 295
    .line 296
    and-int/lit8 v2, v2, 0xe

    .line 297
    .line 298
    shr-int/lit8 v1, v1, 0x9

    .line 299
    .line 300
    and-int/lit8 v1, v1, 0x70

    .line 301
    .line 302
    or-int/2addr v1, v2

    .line 303
    invoke-static {v3, v5, v0, v1}, La/x8f;->b(La/di0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 307
    .line 308
    .line 309
    :goto_7
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 310
    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_c
    invoke-virtual {v0}, La/fet;->X()V

    .line 314
    .line 315
    .line 316
    :goto_8
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 317
    .line 318
    .line 319
    move-result-object v8

    .line 320
    if-eqz v8, :cond_d

    .line 321
    .line 322
    new-instance v0, La/cqk;

    .line 323
    .line 324
    const/4 v7, 0x5

    .line 325
    move-object v1, p0

    .line 326
    move-object v2, p1

    .line 327
    move/from16 v6, p6

    .line 328
    .line 329
    invoke-direct/range {v0 .. v7}, La/cqk;-><init>(La/mm40;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 330
    .line 331
    .line 332
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 333
    .line 334
    :cond_d
    return-void
.end method

.method public static final h(La/vhm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 24

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v15, p6

    .line 6
    .line 7
    const v0, 0x5e05c4fa

    .line 8
    .line 9
    .line 10
    invoke-virtual {v15, v0}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    sget-object v3, La/jm40;->b:La/jm40;

    .line 14
    .line 15
    invoke-virtual {v15, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int v0, p7, v0

    .line 25
    .line 26
    invoke-virtual {v15, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    const/16 v4, 0x20

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v4, 0x10

    .line 36
    .line 37
    :goto_1
    or-int/2addr v0, v4

    .line 38
    invoke-virtual {v15, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    const/16 v4, 0x100

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v4, 0x80

    .line 48
    .line 49
    :goto_2
    or-int/2addr v0, v4

    .line 50
    move-object/from16 v8, p2

    .line 51
    .line 52
    invoke-virtual {v15, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    const/16 v4, 0x800

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const/16 v4, 0x400

    .line 62
    .line 63
    :goto_3
    or-int/2addr v0, v4

    .line 64
    move-object/from16 v4, p3

    .line 65
    .line 66
    invoke-virtual {v15, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    const/16 v5, 0x4000

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_4
    const/16 v5, 0x2000

    .line 76
    .line 77
    :goto_4
    or-int/2addr v0, v5

    .line 78
    move-object/from16 v9, p4

    .line 79
    .line 80
    invoke-virtual {v15, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_5

    .line 85
    .line 86
    const/high16 v5, 0x20000

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_5
    const/high16 v5, 0x10000

    .line 90
    .line 91
    :goto_5
    or-int/2addr v0, v5

    .line 92
    move-object/from16 v11, p5

    .line 93
    .line 94
    invoke-virtual {v15, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_6

    .line 99
    .line 100
    const/high16 v5, 0x100000

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_6
    const/high16 v5, 0x80000

    .line 104
    .line 105
    :goto_6
    or-int/2addr v0, v5

    .line 106
    const v5, 0x92493

    .line 107
    .line 108
    .line 109
    and-int/2addr v5, v0

    .line 110
    const v6, 0x92492

    .line 111
    .line 112
    .line 113
    const/4 v7, 0x0

    .line 114
    if-eq v5, v6, :cond_7

    .line 115
    .line 116
    const/4 v5, 0x1

    .line 117
    goto :goto_7

    .line 118
    :cond_7
    move v5, v7

    .line 119
    :goto_7
    and-int/lit8 v6, v0, 0x1

    .line 120
    .line 121
    invoke-virtual {v15, v6, v5}, La/fet;->U(IZ)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_9

    .line 126
    .line 127
    new-instance v16, La/imm;

    .line 128
    .line 129
    iget-object v5, v1, La/vhm;->c:La/llm;

    .line 130
    .line 131
    iget-object v6, v1, La/vhm;->e:La/tlm;

    .line 132
    .line 133
    iget-object v10, v1, La/vhm;->d:La/dmm;

    .line 134
    .line 135
    sget-object v12, La/zaq0;->b:La/zfn;

    .line 136
    .line 137
    invoke-virtual {v15, v12}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v12

    .line 141
    check-cast v12, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 142
    .line 143
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 144
    .line 145
    .line 146
    move-result-wide v20

    .line 147
    const/16 v22, 0x0

    .line 148
    .line 149
    const/16 v23, 0x0

    .line 150
    .line 151
    move-object/from16 v17, v5

    .line 152
    .line 153
    move-object/from16 v18, v6

    .line 154
    .line 155
    move-object/from16 v19, v10

    .line 156
    .line 157
    invoke-direct/range {v16 .. v23}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 158
    .line 159
    .line 160
    iget-object v5, v1, La/vhm;->f:La/sd;

    .line 161
    .line 162
    if-nez v5, :cond_8

    .line 163
    .line 164
    const v5, -0x7e8ddbdf

    .line 165
    .line 166
    .line 167
    invoke-virtual {v15, v5}, La/fet;->e0(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 171
    .line 172
    .line 173
    const/4 v5, 0x0

    .line 174
    :goto_8
    move-object v12, v5

    .line 175
    goto :goto_9

    .line 176
    :cond_8
    const v6, -0x7e8ddbde

    .line 177
    .line 178
    .line 179
    invoke-virtual {v15, v6}, La/fet;->e0(I)V

    .line 180
    .line 181
    .line 182
    new-instance v6, La/d8m;

    .line 183
    .line 184
    const/4 v10, 0x5

    .line 185
    invoke-direct {v6, v1, v5, v2, v10}, La/d8m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 186
    .line 187
    .line 188
    const v5, 0x607338b4

    .line 189
    .line 190
    .line 191
    invoke-static {v5, v6, v15}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-virtual {v15, v7}, La/fet;->r(Z)V

    .line 196
    .line 197
    .line 198
    goto :goto_8

    .line 199
    :goto_9
    and-int/lit8 v5, v0, 0xe

    .line 200
    .line 201
    or-int/lit16 v5, v5, 0x6000

    .line 202
    .line 203
    shr-int/lit8 v6, v0, 0x3

    .line 204
    .line 205
    and-int/lit16 v6, v6, 0x1c00

    .line 206
    .line 207
    or-int/2addr v5, v6

    .line 208
    shl-int/lit8 v6, v0, 0x6

    .line 209
    .line 210
    const/high16 v7, 0x70000

    .line 211
    .line 212
    and-int/2addr v7, v6

    .line 213
    or-int/2addr v5, v7

    .line 214
    const/high16 v7, 0x380000

    .line 215
    .line 216
    shl-int/lit8 v0, v0, 0x3

    .line 217
    .line 218
    and-int/2addr v0, v7

    .line 219
    or-int/2addr v0, v5

    .line 220
    const/high16 v5, 0xe000000

    .line 221
    .line 222
    and-int/2addr v5, v6

    .line 223
    or-int/2addr v0, v5

    .line 224
    const/16 v17, 0x36

    .line 225
    .line 226
    const/16 v18, 0x84

    .line 227
    .line 228
    const/4 v5, 0x0

    .line 229
    const/4 v7, 0x0

    .line 230
    const/4 v10, 0x0

    .line 231
    const/4 v13, 0x0

    .line 232
    const/4 v14, 0x0

    .line 233
    move-object v6, v4

    .line 234
    move-object/from16 v4, v16

    .line 235
    .line 236
    move/from16 v16, v0

    .line 237
    .line 238
    invoke-static/range {v3 .. v18}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 239
    .line 240
    .line 241
    goto :goto_a

    .line 242
    :cond_9
    invoke-virtual/range {p6 .. p6}, La/fet;->X()V

    .line 243
    .line 244
    .line 245
    :goto_a
    invoke-virtual/range {p6 .. p6}, La/fet;->u()La/yfe0;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    if-eqz v9, :cond_a

    .line 250
    .line 251
    new-instance v0, La/acb0;

    .line 252
    .line 253
    const/16 v8, 0x10

    .line 254
    .line 255
    move-object/from16 v3, p2

    .line 256
    .line 257
    move-object/from16 v4, p3

    .line 258
    .line 259
    move-object/from16 v5, p4

    .line 260
    .line 261
    move-object/from16 v6, p5

    .line 262
    .line 263
    move/from16 v7, p7

    .line 264
    .line 265
    invoke-direct/range {v0 .. v8}, La/acb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 266
    .line 267
    .line 268
    iput-object v0, v9, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 269
    .line 270
    :cond_a
    return-void
.end method

.method public static final i(La/mm40;La/q56;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v8, p5

    .line 8
    .line 9
    move/from16 v11, p6

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const v0, -0x6a14ebd9

    .line 18
    .line 19
    .line 20
    invoke-virtual {v8, v0}, La/fet;->g0(I)La/fet;

    .line 21
    .line 22
    .line 23
    and-int/lit8 v0, v11, 0x6

    .line 24
    .line 25
    move-object/from16 v12, p0

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v8, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v0, 0x2

    .line 38
    :goto_0
    or-int/2addr v0, v11

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v0, v11

    .line 41
    :goto_1
    and-int/lit8 v4, v11, 0x30

    .line 42
    .line 43
    const/16 v5, 0x20

    .line 44
    .line 45
    if-nez v4, :cond_3

    .line 46
    .line 47
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    move v4, v5

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v4, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v0, v4

    .line 58
    :cond_3
    and-int/lit16 v4, v11, 0x180

    .line 59
    .line 60
    if-nez v4, :cond_5

    .line 61
    .line 62
    invoke-virtual {v8, v2}, La/fet;->h(Z)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_4

    .line 67
    .line 68
    const/16 v4, 0x100

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const/16 v4, 0x80

    .line 72
    .line 73
    :goto_3
    or-int/2addr v0, v4

    .line 74
    :cond_5
    and-int/lit16 v4, v11, 0xc00

    .line 75
    .line 76
    const/16 v6, 0x800

    .line 77
    .line 78
    if-nez v4, :cond_7

    .line 79
    .line 80
    invoke-virtual {v8, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_6

    .line 85
    .line 86
    move v4, v6

    .line 87
    goto :goto_4

    .line 88
    :cond_6
    const/16 v4, 0x400

    .line 89
    .line 90
    :goto_4
    or-int/2addr v0, v4

    .line 91
    :cond_7
    and-int/lit16 v4, v11, 0x6000

    .line 92
    .line 93
    if-nez v4, :cond_9

    .line 94
    .line 95
    move-object/from16 v4, p4

    .line 96
    .line 97
    invoke-virtual {v8, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-eqz v7, :cond_8

    .line 102
    .line 103
    const/16 v7, 0x4000

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_8
    const/16 v7, 0x2000

    .line 107
    .line 108
    :goto_5
    or-int/2addr v0, v7

    .line 109
    goto :goto_6

    .line 110
    :cond_9
    move-object/from16 v4, p4

    .line 111
    .line 112
    :goto_6
    and-int/lit16 v7, v0, 0x2493

    .line 113
    .line 114
    const/16 v9, 0x2492

    .line 115
    .line 116
    const/4 v10, 0x0

    .line 117
    const/4 v13, 0x1

    .line 118
    if-eq v7, v9, :cond_a

    .line 119
    .line 120
    move v7, v13

    .line 121
    goto :goto_7

    .line 122
    :cond_a
    move v7, v10

    .line 123
    :goto_7
    and-int/lit8 v9, v0, 0x1

    .line 124
    .line 125
    invoke-virtual {v8, v9, v7}, La/fet;->U(IZ)Z

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    if-eqz v7, :cond_11

    .line 130
    .line 131
    instance-of v7, v1, La/l56;

    .line 132
    .line 133
    if-eqz v7, :cond_b

    .line 134
    .line 135
    sget-object v7, La/qmk;->a:La/zcl;

    .line 136
    .line 137
    const/high16 v7, 0x41800000    # 16.0f

    .line 138
    .line 139
    goto :goto_8

    .line 140
    :cond_b
    sget-object v7, La/qmk;->a:La/zcl;

    .line 141
    .line 142
    const/high16 v7, 0x41a00000    # 20.0f

    .line 143
    .line 144
    :goto_8
    and-int/lit16 v9, v0, 0x1c00

    .line 145
    .line 146
    if-ne v9, v6, :cond_c

    .line 147
    .line 148
    move v6, v13

    .line 149
    goto :goto_9

    .line 150
    :cond_c
    move v6, v10

    .line 151
    :goto_9
    and-int/lit8 v0, v0, 0x70

    .line 152
    .line 153
    if-ne v0, v5, :cond_d

    .line 154
    .line 155
    goto :goto_a

    .line 156
    :cond_d
    move v13, v10

    .line 157
    :goto_a
    or-int v0, v6, v13

    .line 158
    .line 159
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    if-nez v0, :cond_e

    .line 164
    .line 165
    sget-object v0, La/ukd;->a:La/cl5;

    .line 166
    .line 167
    if-ne v5, v0, :cond_f

    .line 168
    .line 169
    :cond_e
    new-instance v5, La/gnm;

    .line 170
    .line 171
    const/4 v0, 0x7

    .line 172
    invoke-direct {v5, v3, v1, v0}, La/gnm;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v8, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_f
    move-object/from16 v17, v5

    .line 179
    .line 180
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 181
    .line 182
    const/16 v18, 0x1c

    .line 183
    .line 184
    const/4 v13, 0x0

    .line 185
    const/4 v14, 0x0

    .line 186
    const/4 v15, 0x0

    .line 187
    const/16 v16, 0x0

    .line 188
    .line 189
    invoke-static/range {v12 .. v18}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v5, "SPORT_BASIC_EVENT_CARD_LINE"

    .line 194
    .line 195
    invoke-static {v0, v5}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    instance-of v0, v1, La/n56;

    .line 200
    .line 201
    if-eqz v0, :cond_10

    .line 202
    .line 203
    const v0, 0x2769e008

    .line 204
    .line 205
    .line 206
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 207
    .line 208
    .line 209
    new-instance v0, La/i3l;

    .line 210
    .line 211
    const/16 v5, 0x13

    .line 212
    .line 213
    invoke-direct {v0, v1, v5}, La/i3l;-><init>(Ljava/lang/Object;B)V

    .line 214
    .line 215
    .line 216
    const v5, 0x327e5880

    .line 217
    .line 218
    .line 219
    invoke-static {v5, v0, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-virtual {v8, v10}, La/fet;->r(Z)V

    .line 224
    .line 225
    .line 226
    :goto_b
    move-object v9, v0

    .line 227
    goto :goto_c

    .line 228
    :cond_10
    const v0, 0x276baa5f

    .line 229
    .line 230
    .line 231
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v8, v10}, La/fet;->r(Z)V

    .line 235
    .line 236
    .line 237
    const/4 v0, 0x0

    .line 238
    goto :goto_b

    .line 239
    :goto_c
    new-instance v0, La/p5m;

    .line 240
    .line 241
    const/16 v5, 0x18

    .line 242
    .line 243
    invoke-direct {v0, v1, v3, v5}, La/p5m;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    const v5, -0x542b4c1a

    .line 247
    .line 248
    .line 249
    invoke-static {v5, v0, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    new-instance v0, La/jv1;

    .line 254
    .line 255
    const/16 v5, 0xa

    .line 256
    .line 257
    invoke-direct {v0, v1, v2, v5}, La/jv1;-><init>(Ljava/lang/Object;ZB)V

    .line 258
    .line 259
    .line 260
    const v5, -0x8b49719

    .line 261
    .line 262
    .line 263
    invoke-static {v5, v0, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 264
    .line 265
    .line 266
    move-result-object v12

    .line 267
    new-instance v0, La/i4a0;

    .line 268
    .line 269
    const/16 v5, 0x13

    .line 270
    .line 271
    invoke-direct/range {v0 .. v5}, La/i4a0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;B)V

    .line 272
    .line 273
    .line 274
    const v1, 0x42c21de8

    .line 275
    .line 276
    .line 277
    invoke-static {v1, v0, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    move-object v4, v9

    .line 282
    const v9, 0x1b6000

    .line 283
    .line 284
    .line 285
    move-object v5, v10

    .line 286
    const/4 v10, 0x4

    .line 287
    const-wide/16 v2, 0x0

    .line 288
    .line 289
    move v1, v7

    .line 290
    move-object v7, v0

    .line 291
    move-object v0, v6

    .line 292
    move-object v6, v12

    .line 293
    invoke-static/range {v0 .. v10}, La/a8k0;->n(La/mm40;FJLkotlin/jvm/functions/Function2;La/ugd;La/ugd;La/ugd;La/fet;II)V

    .line 294
    .line 295
    .line 296
    goto :goto_d

    .line 297
    :cond_11
    invoke-virtual/range {p5 .. p5}, La/fet;->X()V

    .line 298
    .line 299
    .line 300
    :goto_d
    invoke-virtual/range {p5 .. p5}, La/fet;->u()La/yfe0;

    .line 301
    .line 302
    .line 303
    move-result-object v8

    .line 304
    if-eqz v8, :cond_12

    .line 305
    .line 306
    new-instance v0, La/mg;

    .line 307
    .line 308
    const/4 v7, 0x7

    .line 309
    move-object/from16 v1, p0

    .line 310
    .line 311
    move-object/from16 v2, p1

    .line 312
    .line 313
    move/from16 v3, p2

    .line 314
    .line 315
    move-object/from16 v4, p3

    .line 316
    .line 317
    move-object/from16 v5, p4

    .line 318
    .line 319
    move v6, v11

    .line 320
    invoke-direct/range {v0 .. v7}, La/mg;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;La/wdr;IB)V

    .line 321
    .line 322
    .line 323
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 324
    .line 325
    :cond_12
    return-void
.end method

.method public static final j(La/mm40;La/jym;La/fet;I)V
    .locals 32

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
    iget-object v3, v1, La/jym;->g:Ljava/lang/String;

    .line 8
    .line 9
    const v4, -0x65b7746f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2, v4}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v4, p3, 0x6

    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    move v4, v5

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v4, 0x2

    .line 29
    :goto_0
    or-int v4, p3, v4

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move/from16 v4, p3

    .line 33
    .line 34
    :goto_1
    and-int/lit8 v6, p3, 0x30

    .line 35
    .line 36
    if-nez v6, :cond_3

    .line 37
    .line 38
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    const/16 v6, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v6, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v4, v6

    .line 50
    :cond_3
    and-int/lit8 v6, v4, 0x13

    .line 51
    .line 52
    const/16 v7, 0x12

    .line 53
    .line 54
    const/4 v8, 0x0

    .line 55
    const/4 v9, 0x1

    .line 56
    if-eq v6, v7, :cond_4

    .line 57
    .line 58
    move v6, v9

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move v6, v8

    .line 61
    :goto_3
    and-int/2addr v4, v9

    .line 62
    invoke-virtual {v2, v4, v6}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_8

    .line 67
    .line 68
    iget-boolean v4, v1, La/jym;->h:Z

    .line 69
    .line 70
    if-eqz v4, :cond_5

    .line 71
    .line 72
    const v4, 0x2a540478

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 76
    .line 77
    .line 78
    sget-object v4, La/bmd;->n:La/zfn;

    .line 79
    .line 80
    invoke-virtual {v2, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, La/k6z;

    .line 85
    .line 86
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 87
    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_5
    const v4, 0x2a540814

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v8}, La/fet;->r(Z)V

    .line 97
    .line 98
    .line 99
    sget-object v4, La/k6z;->a:La/k6z;

    .line 100
    .line 101
    :goto_4
    const/high16 v6, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-static {v0, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 104
    .line 105
    .line 106
    move-result-object v6

    .line 107
    sget-object v7, La/qmk;->a:La/zcl;

    .line 108
    .line 109
    const/high16 v7, 0x41000000    # 8.0f

    .line 110
    .line 111
    invoke-static {v6, v7}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    new-instance v10, La/qw3;

    .line 116
    .line 117
    new-instance v11, La/jf4;

    .line 118
    .line 119
    const/16 v12, 0xe

    .line 120
    .line 121
    invoke-direct {v11, v12}, La/jf4;-><init>(B)V

    .line 122
    .line 123
    .line 124
    invoke-direct {v10, v7, v9, v11}, La/qw3;-><init>(FZLa/rw3;)V

    .line 125
    .line 126
    .line 127
    sget-object v7, La/gqw0;->n:La/xx7;

    .line 128
    .line 129
    const/16 v11, 0x30

    .line 130
    .line 131
    invoke-static {v10, v7, v2, v11}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    iget-wide v10, v2, La/fet;->T:J

    .line 136
    .line 137
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 142
    .line 143
    .line 144
    move-result-object v11

    .line 145
    invoke-static {v2, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 150
    .line 151
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, La/fet;->i0()V

    .line 155
    .line 156
    .line 157
    iget-boolean v12, v2, La/fet;->S:Z

    .line 158
    .line 159
    if-eqz v12, :cond_6

    .line 160
    .line 161
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 162
    .line 163
    invoke-virtual {v2, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 164
    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_6
    invoke-virtual {v2}, La/fet;->r0()V

    .line 168
    .line 169
    .line 170
    :goto_5
    sget-object v12, La/gqw0;->x:La/shd;

    .line 171
    .line 172
    invoke-static {v2, v7, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 173
    .line 174
    .line 175
    sget-object v7, La/gqw0;->w:La/shd;

    .line 176
    .line 177
    invoke-static {v2, v11, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 178
    .line 179
    .line 180
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    sget-object v10, La/gqw0;->y:La/shd;

    .line 185
    .line 186
    invoke-static {v2, v7, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 187
    .line 188
    .line 189
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 190
    .line 191
    .line 192
    sget-object v7, La/gqw0;->v:La/shd;

    .line 193
    .line 194
    invoke-static {v2, v6, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-lez v6, :cond_7

    .line 202
    .line 203
    const v6, -0x4534c6b7

    .line 204
    .line 205
    .line 206
    invoke-virtual {v2, v6}, La/fet;->e0(I)V

    .line 207
    .line 208
    .line 209
    sget-object v6, La/zaq0;->b:La/zfn;

    .line 210
    .line 211
    invoke-virtual {v2, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 216
    .line 217
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 218
    .line 219
    .line 220
    move-result-wide v6

    .line 221
    sget-object v10, La/j1t0;->e:La/zfn;

    .line 222
    .line 223
    invoke-virtual {v2, v10}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    check-cast v10, La/g1t0;

    .line 228
    .line 229
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 233
    .line 234
    .line 235
    move-result-object v22

    .line 236
    const/16 v25, 0x6180

    .line 237
    .line 238
    const v26, 0x1affa

    .line 239
    .line 240
    .line 241
    move-object v2, v3

    .line 242
    const/4 v3, 0x0

    .line 243
    move v10, v5

    .line 244
    move-wide/from16 v30, v6

    .line 245
    .line 246
    move-object v7, v4

    .line 247
    move-wide/from16 v4, v30

    .line 248
    .line 249
    const/4 v6, 0x0

    .line 250
    move-object v11, v7

    .line 251
    move v12, v8

    .line 252
    const-wide/16 v7, 0x0

    .line 253
    .line 254
    move v13, v9

    .line 255
    const/4 v9, 0x0

    .line 256
    move v14, v10

    .line 257
    const/4 v10, 0x0

    .line 258
    move-object v15, v11

    .line 259
    const/4 v11, 0x0

    .line 260
    move/from16 v16, v12

    .line 261
    .line 262
    move/from16 v17, v13

    .line 263
    .line 264
    const-wide/16 v12, 0x0

    .line 265
    .line 266
    move/from16 v18, v14

    .line 267
    .line 268
    const/4 v14, 0x0

    .line 269
    move-object/from16 v19, v15

    .line 270
    .line 271
    move/from16 v20, v16

    .line 272
    .line 273
    const-wide/16 v15, 0x0

    .line 274
    .line 275
    move/from16 v21, v17

    .line 276
    .line 277
    const/16 v17, 0x2

    .line 278
    .line 279
    move/from16 v23, v18

    .line 280
    .line 281
    const/16 v18, 0x0

    .line 282
    .line 283
    move-object/from16 v24, v19

    .line 284
    .line 285
    const/16 v19, 0x1

    .line 286
    .line 287
    move/from16 v27, v20

    .line 288
    .line 289
    const/16 v20, 0x0

    .line 290
    .line 291
    move/from16 v28, v21

    .line 292
    .line 293
    const/16 v21, 0x0

    .line 294
    .line 295
    move-object/from16 v29, v24

    .line 296
    .line 297
    const/16 v24, 0x0

    .line 298
    .line 299
    move-object/from16 v23, p2

    .line 300
    .line 301
    move/from16 v1, v27

    .line 302
    .line 303
    move-object/from16 v0, v29

    .line 304
    .line 305
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 306
    .line 307
    .line 308
    move-object/from16 v2, v23

    .line 309
    .line 310
    invoke-virtual {v2, v1}, La/fet;->r(Z)V

    .line 311
    .line 312
    .line 313
    goto :goto_6

    .line 314
    :cond_7
    move-object v0, v4

    .line 315
    move v1, v8

    .line 316
    const v3, -0x4530e679

    .line 317
    .line 318
    .line 319
    invoke-virtual {v2, v3}, La/fet;->e0(I)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v2, v1}, La/fet;->r(Z)V

    .line 323
    .line 324
    .line 325
    :goto_6
    sget-object v3, La/bmd;->n:La/zfn;

    .line 326
    .line 327
    invoke-virtual {v3, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    new-instance v3, La/mxm;

    .line 332
    .line 333
    move-object/from16 v4, p1

    .line 334
    .line 335
    const/4 v14, 0x4

    .line 336
    invoke-direct {v3, v4, v14}, La/mxm;-><init>(Ljava/lang/Object;B)V

    .line 337
    .line 338
    .line 339
    const v5, -0x3f89e865

    .line 340
    .line 341
    .line 342
    invoke-static {v5, v3, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    const/16 v5, 0x38

    .line 347
    .line 348
    invoke-static {v0, v3, v2, v5}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 349
    .line 350
    .line 351
    iget-object v0, v4, La/jym;->e:La/a4x;

    .line 352
    .line 353
    const/4 v3, 0x0

    .line 354
    invoke-static {v1, v2, v0, v3}, La/ahb;->s(ILa/fet;La/a4x;La/mm40;)V

    .line 355
    .line 356
    .line 357
    const/4 v13, 0x1

    .line 358
    invoke-virtual {v2, v13}, La/fet;->r(Z)V

    .line 359
    .line 360
    .line 361
    goto :goto_7

    .line 362
    :cond_8
    move-object v4, v1

    .line 363
    invoke-virtual {v2}, La/fet;->X()V

    .line 364
    .line 365
    .line 366
    :goto_7
    invoke-virtual {v2}, La/fet;->u()La/yfe0;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    if-eqz v0, :cond_9

    .line 371
    .line 372
    new-instance v1, La/xvm;

    .line 373
    .line 374
    const/16 v2, 0x14

    .line 375
    .line 376
    move-object/from16 v3, p0

    .line 377
    .line 378
    move/from16 v5, p3

    .line 379
    .line 380
    invoke-direct {v1, v2, v5, v3, v4}, La/xvm;-><init>(BILa/mm40;Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 384
    .line 385
    :cond_9
    return-void
.end method

.method public static final k(ILa/fet;La/mm40;)V
    .locals 5

    .line 1
    sget-object v0, La/aql0;->a:La/aql0;

    .line 2
    .line 3
    const v1, -0x6819bd15

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v1}, La/fet;->g0(I)La/fet;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x2

    .line 18
    :goto_0
    or-int/2addr v1, p0

    .line 19
    invoke-virtual {p1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    const/16 v0, 0x20

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v0, 0x10

    .line 29
    .line 30
    :goto_1
    or-int/2addr v0, v1

    .line 31
    and-int/lit8 v1, v0, 0x13

    .line 32
    .line 33
    const/16 v2, 0x12

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x1

    .line 37
    if-eq v1, v2, :cond_2

    .line 38
    .line 39
    move v1, v4

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move v1, v3

    .line 42
    :goto_2
    and-int/2addr v0, v4

    .line 43
    invoke-virtual {p1, v0, v1}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    const/high16 v0, 0x3f800000    # 1.0f

    .line 50
    .line 51
    invoke-static {p2, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget v1, La/aql0;->b:F

    .line 56
    .line 57
    invoke-static {v0, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sget v1, La/aql0;->c:F

    .line 62
    .line 63
    invoke-static {v1}, La/vgg0;->a(F)La/ugg0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v0, v1}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-static {v1, p1, v3, v4}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v0, v1}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v3, p1, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 85
    .line 86
    .line 87
    :goto_3
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    new-instance v0, La/xml;

    .line 94
    .line 95
    const/16 v1, 0x16

    .line 96
    .line 97
    invoke-direct {v0, p2, p0, v1}, La/xml;-><init>(La/mm40;IB)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 101
    .line 102
    :cond_4
    return-void
.end method

.method public static final l(La/fvu0;La/fet;I)V
    .locals 13

    .line 1
    const v0, 0x65ba99e7

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p2, 0x6

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x4

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move v0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v1

    .line 22
    :goto_0
    or-int/2addr v0, p2

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move v0, p2

    .line 25
    :goto_1
    and-int/lit8 v3, v0, 0x3

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x1

    .line 29
    if-eq v3, v1, :cond_2

    .line 30
    .line 31
    move v1, v5

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move v1, v4

    .line 34
    :goto_2
    and-int/lit8 v3, v0, 0x1

    .line 35
    .line 36
    invoke-virtual {p1, v3, v1}, La/fet;->U(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_8

    .line 41
    .line 42
    sget-object v1, La/dy2;->b:La/zfn;

    .line 43
    .line 44
    invoke-virtual {p1, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sget-object v6, La/ukd;->a:La/cl5;

    .line 55
    .line 56
    if-ne v3, v6, :cond_3

    .line 57
    .line 58
    const v3, 0x7f010057

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    check-cast v3, Landroid/view/animation/Animation;

    .line 69
    .line 70
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-ne v1, v6, :cond_4

    .line 75
    .line 76
    sget-object v1, La/c7o;->a:La/c7o;

    .line 77
    .line 78
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :cond_4
    check-cast v1, La/jhy;

    .line 82
    .line 83
    move-object v7, v1

    .line 84
    check-cast v7, La/xdr;

    .line 85
    .line 86
    and-int/lit8 v0, v0, 0xe

    .line 87
    .line 88
    if-ne v0, v2, :cond_5

    .line 89
    .line 90
    move v4, v5

    .line 91
    :cond_5
    invoke-virtual {p1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    or-int/2addr v0, v4

    .line 96
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    if-nez v0, :cond_6

    .line 101
    .line 102
    if-ne v1, v6, :cond_7

    .line 103
    .line 104
    :cond_6
    new-instance v1, La/qzn;

    .line 105
    .line 106
    const/16 v0, 0x12

    .line 107
    .line 108
    invoke-direct {v1, p0, v3, v0}, La/qzn;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_7
    move-object v9, v1

    .line 115
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 116
    .line 117
    const/4 v11, 0x6

    .line 118
    const/4 v12, 0x2

    .line 119
    const/4 v8, 0x0

    .line 120
    move-object v10, p1

    .line 121
    invoke-static/range {v7 .. v12}, La/y860;->f(La/xdr;La/mm40;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_8
    move-object v10, p1

    .line 126
    invoke-virtual {v10}, La/fet;->X()V

    .line 127
    .line 128
    .line 129
    :goto_3
    invoke-virtual {v10}, La/fet;->u()La/yfe0;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-eqz p1, :cond_9

    .line 134
    .line 135
    new-instance v0, La/o6o;

    .line 136
    .line 137
    invoke-direct {v0, p0, p2, v2}, La/o6o;-><init>(Ljava/lang/Object;IB)V

    .line 138
    .line 139
    .line 140
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 141
    .line 142
    :cond_9
    return-void
.end method

.method public static final m(ILa/fet;La/mm40;La/c280;Ljava/lang/String;)V
    .locals 31

    .line 1
    move/from16 v4, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    const v1, 0x7bb59e79

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v1, v4, 0x6

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    invoke-virtual/range {p1 .. p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x2

    .line 26
    :goto_0
    or-int/2addr v1, v4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v1, v4

    .line 29
    :goto_1
    and-int/lit8 v2, v4, 0x30

    .line 30
    .line 31
    if-nez v2, :cond_3

    .line 32
    .line 33
    move-object/from16 v2, p4

    .line 34
    .line 35
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    const/16 v5, 0x20

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v5, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v1, v5

    .line 47
    goto :goto_3

    .line 48
    :cond_3
    move-object/from16 v2, p4

    .line 49
    .line 50
    :goto_3
    and-int/lit16 v5, v4, 0x180

    .line 51
    .line 52
    const/16 v6, 0x100

    .line 53
    .line 54
    if-nez v5, :cond_5

    .line 55
    .line 56
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    move v5, v6

    .line 63
    goto :goto_4

    .line 64
    :cond_4
    const/16 v5, 0x80

    .line 65
    .line 66
    :goto_4
    or-int/2addr v1, v5

    .line 67
    :cond_5
    and-int/lit16 v5, v1, 0x93

    .line 68
    .line 69
    const/16 v7, 0x92

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x1

    .line 73
    if-eq v5, v7, :cond_6

    .line 74
    .line 75
    move v5, v9

    .line 76
    goto :goto_5

    .line 77
    :cond_6
    move v5, v8

    .line 78
    :goto_5
    and-int/lit8 v7, v1, 0x1

    .line 79
    .line 80
    invoke-virtual {v0, v7, v5}, La/fet;->U(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_d

    .line 85
    .line 86
    sget-object v5, La/qmk;->a:La/zcl;

    .line 87
    .line 88
    sget-object v5, La/gqw0;->o:La/xx7;

    .line 89
    .line 90
    new-instance v7, La/qw3;

    .line 91
    .line 92
    new-instance v10, La/gne;

    .line 93
    .line 94
    const/16 v11, 0xc

    .line 95
    .line 96
    invoke-direct {v10, v5, v11}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 97
    .line 98
    .line 99
    const/high16 v5, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-direct {v7, v5, v9, v10}, La/qw3;-><init>(FZLa/rw3;)V

    .line 102
    .line 103
    .line 104
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 105
    .line 106
    const/16 v10, 0x30

    .line 107
    .line 108
    invoke-static {v7, v5, v0, v10}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    iget-wide v10, v0, La/fet;->T:J

    .line 113
    .line 114
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-static/range {p1 .. p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 127
    .line 128
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, La/fet;->i0()V

    .line 132
    .line 133
    .line 134
    iget-boolean v12, v0, La/fet;->S:Z

    .line 135
    .line 136
    if-eqz v12, :cond_7

    .line 137
    .line 138
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 139
    .line 140
    invoke-virtual {v0, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    invoke-virtual {v0}, La/fet;->r0()V

    .line 145
    .line 146
    .line 147
    :goto_6
    sget-object v12, La/gqw0;->x:La/shd;

    .line 148
    .line 149
    invoke-static {v0, v5, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    sget-object v5, La/gqw0;->w:La/shd;

    .line 153
    .line 154
    invoke-static {v0, v10, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    sget-object v7, La/gqw0;->y:La/shd;

    .line 162
    .line 163
    invoke-static {v0, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 164
    .line 165
    .line 166
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 167
    .line 168
    .line 169
    sget-object v5, La/gqw0;->v:La/shd;

    .line 170
    .line 171
    invoke-static {v0, v11, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 172
    .line 173
    .line 174
    and-int/lit16 v5, v1, 0x380

    .line 175
    .line 176
    if-ne v5, v6, :cond_8

    .line 177
    .line 178
    move v8, v9

    .line 179
    :cond_8
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    sget-object v6, La/ukd;->a:La/cl5;

    .line 184
    .line 185
    if-nez v8, :cond_9

    .line 186
    .line 187
    if-ne v5, v6, :cond_a

    .line 188
    .line 189
    :cond_9
    new-instance v5, La/u6n;

    .line 190
    .line 191
    sget-object v7, La/d4d;->t:La/d4d;

    .line 192
    .line 193
    sget-object v8, La/w6n;->h:La/w6n;

    .line 194
    .line 195
    invoke-direct {v5, v7, v8, v3}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_a
    check-cast v5, La/u6n;

    .line 202
    .line 203
    sget-object v7, La/zaq0;->b:La/zfn;

    .line 204
    .line 205
    invoke-virtual {v0, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    check-cast v7, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 210
    .line 211
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 212
    .line 213
    .line 214
    move-result-wide v7

    .line 215
    sget-object v10, La/j1t0;->e:La/zfn;

    .line 216
    .line 217
    invoke-virtual {v0, v10}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v11

    .line 221
    check-cast v11, La/g1t0;

    .line 222
    .line 223
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 227
    .line 228
    .line 229
    move-result-object v11

    .line 230
    iget-object v11, v11, La/y9q0;->a:La/smk0;

    .line 231
    .line 232
    iget-object v14, v11, La/smk0;->f:La/nrq;

    .line 233
    .line 234
    sget-wide v16, La/qmk;->q:J

    .line 235
    .line 236
    invoke-virtual {v0, v10}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    check-cast v10, La/g1t0;

    .line 241
    .line 242
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    iget-object v10, v10, La/y9q0;->a:La/smk0;

    .line 250
    .line 251
    iget-wide v10, v10, La/smk0;->b:J

    .line 252
    .line 253
    const-wide/high16 v12, 0x3fd0000000000000L    # 0.25

    .line 254
    .line 255
    invoke-static {v12, v13}, La/idm0;->s(D)J

    .line 256
    .line 257
    .line 258
    move-result-wide v20

    .line 259
    new-instance v15, La/n05;

    .line 260
    .line 261
    move-wide/from16 v18, v10

    .line 262
    .line 263
    invoke-direct/range {v15 .. v21}, La/n05;-><init>(JJJ)V

    .line 264
    .line 265
    .line 266
    move-object v10, v6

    .line 267
    new-instance v6, La/x7z;

    .line 268
    .line 269
    const/high16 v11, 0x3f800000    # 1.0f

    .line 270
    .line 271
    invoke-direct {v6, v11, v9}, La/x7z;-><init>(FZ)V

    .line 272
    .line 273
    .line 274
    new-instance v11, La/f2q0;

    .line 275
    .line 276
    const/4 v12, 0x6

    .line 277
    invoke-direct {v11, v12}, La/f2q0;-><init>(I)V

    .line 278
    .line 279
    .line 280
    shr-int/lit8 v1, v1, 0x3

    .line 281
    .line 282
    and-int/lit8 v27, v1, 0xe

    .line 283
    .line 284
    const/16 v28, 0x6180

    .line 285
    .line 286
    const v29, 0x3ab70

    .line 287
    .line 288
    .line 289
    move-object v1, v10

    .line 290
    move-object/from16 v17, v11

    .line 291
    .line 292
    const-wide/16 v10, 0x0

    .line 293
    .line 294
    const/4 v12, 0x0

    .line 295
    const/4 v13, 0x0

    .line 296
    move/from16 v18, v9

    .line 297
    .line 298
    move-object v9, v15

    .line 299
    const-wide/16 v15, 0x0

    .line 300
    .line 301
    move/from16 v20, v18

    .line 302
    .line 303
    const-wide/16 v18, 0x0

    .line 304
    .line 305
    move/from16 v21, v20

    .line 306
    .line 307
    const/16 v20, 0x2

    .line 308
    .line 309
    move/from16 v22, v21

    .line 310
    .line 311
    const/16 v21, 0x0

    .line 312
    .line 313
    move/from16 v23, v22

    .line 314
    .line 315
    const/16 v22, 0x3

    .line 316
    .line 317
    move/from16 v24, v23

    .line 318
    .line 319
    const/16 v23, 0x0

    .line 320
    .line 321
    move/from16 v25, v24

    .line 322
    .line 323
    const/16 v24, 0x0

    .line 324
    .line 325
    move/from16 v26, v25

    .line 326
    .line 327
    const/16 v25, 0x0

    .line 328
    .line 329
    move/from16 v30, v26

    .line 330
    .line 331
    move-object/from16 v26, v0

    .line 332
    .line 333
    move-object v0, v5

    .line 334
    move-object v5, v2

    .line 335
    move/from16 v2, v30

    .line 336
    .line 337
    invoke-static/range {v5 .. v29}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 338
    .line 339
    .line 340
    move-object/from16 v5, v26

    .line 341
    .line 342
    invoke-virtual {v5, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v6

    .line 346
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    if-nez v6, :cond_b

    .line 351
    .line 352
    if-ne v7, v1, :cond_c

    .line 353
    .line 354
    :cond_b
    new-instance v7, La/d1n;

    .line 355
    .line 356
    invoke-direct {v7, v0, v2}, La/d1n;-><init>(La/u6n;B)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v5, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :cond_c
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 363
    .line 364
    const/4 v0, 0x0

    .line 365
    invoke-static {v2, v5, v0, v7}, La/kkb;->p(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v5, v2}, La/fet;->r(Z)V

    .line 369
    .line 370
    .line 371
    goto :goto_7

    .line 372
    :cond_d
    move-object v5, v0

    .line 373
    invoke-virtual {v5}, La/fet;->X()V

    .line 374
    .line 375
    .line 376
    :goto_7
    invoke-virtual {v5}, La/fet;->u()La/yfe0;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    if-eqz v6, :cond_e

    .line 381
    .line 382
    new-instance v0, La/iym;

    .line 383
    .line 384
    const/4 v5, 0x1

    .line 385
    move-object/from16 v1, p2

    .line 386
    .line 387
    move-object/from16 v2, p4

    .line 388
    .line 389
    invoke-direct/range {v0 .. v5}, La/iym;-><init>(La/mm40;Ljava/lang/String;La/c280;IB)V

    .line 390
    .line 391
    .line 392
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 393
    .line 394
    :cond_e
    return-void
.end method

.method public static final n(La/mm40;La/ugd;La/fet;I)V
    .locals 6

    .line 1
    const v0, -0x4df34964

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    or-int/lit8 v0, p3, 0x6

    .line 8
    .line 9
    const/high16 v1, 0x40800000    # 4.0f

    .line 10
    .line 11
    invoke-virtual {p2, v1}, La/fet;->d(F)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/16 v2, 0x20

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    move v1, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 v1, 0x10

    .line 22
    .line 23
    :goto_0
    or-int/2addr v0, v1

    .line 24
    and-int/lit16 v1, v0, 0x93

    .line 25
    .line 26
    const/16 v3, 0x92

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x1

    .line 30
    if-eq v1, v3, :cond_1

    .line 31
    .line 32
    move v1, v5

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v1, v4

    .line 35
    :goto_1
    and-int/lit8 v3, v0, 0x1

    .line 36
    .line 37
    invoke-virtual {p2, v3, v1}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_5

    .line 42
    .line 43
    and-int/lit8 p0, v0, 0x70

    .line 44
    .line 45
    if-ne p0, v2, :cond_2

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    move v5, v4

    .line 49
    :goto_2
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const/4 v0, 0x6

    .line 54
    if-nez v5, :cond_3

    .line 55
    .line 56
    sget-object v1, La/ukd;->a:La/cl5;

    .line 57
    .line 58
    if-ne p0, v1, :cond_4

    .line 59
    .line 60
    :cond_3
    new-instance p0, La/w;

    .line 61
    .line 62
    invoke-direct {p0, p1, v0}, La/w;-><init>(La/ugd;B)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2, p0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :cond_4
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 69
    .line 70
    sget-object v1, La/jm40;->b:La/jm40;

    .line 71
    .line 72
    invoke-static {v1, p0, p2, v0, v4}, La/x4n0;->a(La/mm40;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 73
    .line 74
    .line 75
    move-object p0, v1

    .line 76
    goto :goto_3

    .line 77
    :cond_5
    invoke-virtual {p2}, La/fet;->X()V

    .line 78
    .line 79
    .line 80
    :goto_3
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-eqz p2, :cond_6

    .line 85
    .line 86
    new-instance v0, La/fb8;

    .line 87
    .line 88
    const/4 v1, 0x5

    .line 89
    invoke-direct {v0, p0, p1, p3, v1}, La/fb8;-><init>(La/mm40;La/ugd;IB)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 93
    .line 94
    :cond_6
    return-void
.end method

.method public static final o(La/o0x;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 12

    .line 1
    const v0, 0x23a09d9e

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 24
    .line 25
    const/16 v2, 0x20

    .line 26
    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    invoke-virtual {p2, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    move v1, v2

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v0, v1

    .line 40
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 41
    .line 42
    const/16 v3, 0x12

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x1

    .line 46
    if-eq v1, v3, :cond_4

    .line 47
    .line 48
    move v1, v5

    .line 49
    goto :goto_3

    .line 50
    :cond_4
    move v1, v4

    .line 51
    :goto_3
    and-int/lit8 v3, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {p2, v3, v1}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_8

    .line 58
    .line 59
    sget-object v1, La/jm40;->b:La/jm40;

    .line 60
    .line 61
    const-string v3, "ChampInfoButtonTestTag"

    .line 62
    .line 63
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    new-instance v7, La/o2m;

    .line 68
    .line 69
    sget-object v1, La/m8m0;->a:La/zfn;

    .line 70
    .line 71
    invoke-virtual {p2, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 76
    .line 77
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 78
    .line 79
    .line 80
    move-result-wide v8

    .line 81
    const v1, 0x7f0808bb

    .line 82
    .line 83
    .line 84
    invoke-direct {v7, p0, v1, v8, v9}, La/o2m;-><init>(La/o0x;IJ)V

    .line 85
    .line 86
    .line 87
    and-int/lit8 v0, v0, 0x70

    .line 88
    .line 89
    if-ne v0, v2, :cond_5

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_5
    move v5, v4

    .line 93
    :goto_4
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-nez v5, :cond_6

    .line 98
    .line 99
    sget-object v1, La/ukd;->a:La/cl5;

    .line 100
    .line 101
    if-ne v0, v1, :cond_7

    .line 102
    .line 103
    :cond_6
    new-instance v0, La/cjl;

    .line 104
    .line 105
    const/16 v1, 0xb

    .line 106
    .line 107
    invoke-direct {v0, p1, v1}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_7
    move-object v8, v0

    .line 114
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 115
    .line 116
    const/4 v10, 0x6

    .line 117
    const/4 v11, 0x0

    .line 118
    move-object v9, p2

    .line 119
    invoke-static/range {v6 .. v11}, La/vdb;->w(La/mm40;La/t2m;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 120
    .line 121
    .line 122
    goto :goto_5

    .line 123
    :cond_8
    move-object v9, p2

    .line 124
    invoke-virtual {v9}, La/fet;->X()V

    .line 125
    .line 126
    .line 127
    :goto_5
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    if-eqz p2, :cond_9

    .line 132
    .line 133
    new-instance v0, La/c5m;

    .line 134
    .line 135
    invoke-direct {v0, p0, p1, p3, v4}, La/c5m;-><init>(La/o0x;Lkotlin/jvm/functions/Function0;IB)V

    .line 136
    .line 137
    .line 138
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 139
    .line 140
    :cond_9
    return-void
.end method

.method public static final p(La/o0x;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 12

    .line 1
    const v0, -0x105c7f64

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p3, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p3

    .line 23
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 24
    .line 25
    const/16 v2, 0x20

    .line 26
    .line 27
    if-nez v1, :cond_3

    .line 28
    .line 29
    invoke-virtual {p2, p1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    move v1, v2

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr v0, v1

    .line 40
    :cond_3
    and-int/lit8 v1, v0, 0x13

    .line 41
    .line 42
    const/16 v3, 0x12

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    const/4 v5, 0x1

    .line 46
    if-eq v1, v3, :cond_4

    .line 47
    .line 48
    move v1, v5

    .line 49
    goto :goto_3

    .line 50
    :cond_4
    move v1, v4

    .line 51
    :goto_3
    and-int/lit8 v3, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {p2, v3, v1}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_8

    .line 58
    .line 59
    sget-object v1, La/jm40;->b:La/jm40;

    .line 60
    .line 61
    const-string v3, "GameRulesBadgeTestTag"

    .line 62
    .line 63
    invoke-static {v1, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    new-instance v7, La/o2m;

    .line 68
    .line 69
    sget-object v1, La/m8m0;->a:La/zfn;

    .line 70
    .line 71
    invoke-virtual {p2, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 76
    .line 77
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 78
    .line 79
    .line 80
    move-result-wide v8

    .line 81
    const v1, 0x7f080965

    .line 82
    .line 83
    .line 84
    invoke-direct {v7, p0, v1, v8, v9}, La/o2m;-><init>(La/o0x;IJ)V

    .line 85
    .line 86
    .line 87
    and-int/lit8 v0, v0, 0x70

    .line 88
    .line 89
    if-ne v0, v2, :cond_5

    .line 90
    .line 91
    move v4, v5

    .line 92
    :cond_5
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-nez v4, :cond_6

    .line 97
    .line 98
    sget-object v1, La/ukd;->a:La/cl5;

    .line 99
    .line 100
    if-ne v0, v1, :cond_7

    .line 101
    .line 102
    :cond_6
    new-instance v0, La/cjl;

    .line 103
    .line 104
    const/16 v1, 0xc

    .line 105
    .line 106
    invoke-direct {v0, p1, v1}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_7
    move-object v8, v0

    .line 113
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 114
    .line 115
    const/4 v10, 0x6

    .line 116
    const/4 v11, 0x0

    .line 117
    move-object v9, p2

    .line 118
    invoke-static/range {v6 .. v11}, La/vdb;->w(La/mm40;La/t2m;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_8
    move-object v9, p2

    .line 123
    invoke-virtual {v9}, La/fet;->X()V

    .line 124
    .line 125
    .line 126
    :goto_4
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    if-eqz p2, :cond_9

    .line 131
    .line 132
    new-instance v0, La/c5m;

    .line 133
    .line 134
    invoke-direct {v0, p0, p1, p3, v5}, La/c5m;-><init>(La/o0x;Lkotlin/jvm/functions/Function0;IB)V

    .line 135
    .line 136
    .line 137
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 138
    .line 139
    :cond_9
    return-void
.end method

.method public static final q(La/mm40;La/pk5;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    move-object/from16 v8, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v9, p5

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const v3, -0x5be2a6a2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v9, v3}, La/fet;->g0(I)La/fet;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    const/4 v3, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v3, 0x2

    .line 40
    :goto_0
    or-int v3, p6, v3

    .line 41
    .line 42
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-eqz v4, :cond_1

    .line 47
    .line 48
    const/16 v4, 0x20

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/16 v4, 0x10

    .line 52
    .line 53
    :goto_1
    or-int/2addr v3, v4

    .line 54
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    const/16 v4, 0x100

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_2
    const/16 v4, 0x80

    .line 64
    .line 65
    :goto_2
    or-int/2addr v3, v4

    .line 66
    invoke-virtual {v9, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    const/16 v6, 0x4000

    .line 71
    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    move v4, v6

    .line 75
    goto :goto_3

    .line 76
    :cond_3
    const/16 v4, 0x2000

    .line 77
    .line 78
    :goto_3
    or-int/2addr v3, v4

    .line 79
    and-int/lit16 v4, v3, 0x2493

    .line 80
    .line 81
    const/16 v7, 0x2492

    .line 82
    .line 83
    const/4 v10, 0x0

    .line 84
    if-eq v4, v7, :cond_4

    .line 85
    .line 86
    const/4 v4, 0x1

    .line 87
    goto :goto_4

    .line 88
    :cond_4
    move v4, v10

    .line 89
    :goto_4
    and-int/lit8 v7, v3, 0x1

    .line 90
    .line 91
    invoke-virtual {v9, v7, v4}, La/fet;->U(IZ)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_17

    .line 96
    .line 97
    new-instance v4, La/kie0;

    .line 98
    .line 99
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    instance-of v7, v2, La/mk5;

    .line 103
    .line 104
    sget-object v12, La/jm40;->b:La/jm40;

    .line 105
    .line 106
    if-eqz v7, :cond_14

    .line 107
    .line 108
    const v7, 0x336b3c41    # 5.4770002E-8f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v9, v7}, La/fet;->e0(I)V

    .line 112
    .line 113
    .line 114
    move-object v7, v2

    .line 115
    check-cast v7, La/mk5;

    .line 116
    .line 117
    iget-object v7, v7, La/mk5;->f:La/gmq;

    .line 118
    .line 119
    invoke-static {v7, v9}, La/kdz;->a(La/gmq;La/fet;)La/hdz;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    invoke-virtual {v7}, La/hdz;->d()La/txx;

    .line 124
    .line 125
    .line 126
    move-result-object v13

    .line 127
    iget-object v13, v13, La/txx;->d:Ljava/util/ArrayList;

    .line 128
    .line 129
    new-instance v14, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v13

    .line 138
    :cond_5
    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 139
    .line 140
    .line 141
    move-result v15

    .line 142
    if-eqz v15, :cond_6

    .line 143
    .line 144
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v15

    .line 148
    instance-of v11, v15, La/ogs0;

    .line 149
    .line 150
    if-eqz v11, :cond_5

    .line 151
    .line 152
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_6
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    sget-object v13, La/zaq0;->b:La/zfn;

    .line 161
    .line 162
    invoke-virtual {v9, v13}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v13

    .line 166
    check-cast v13, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 167
    .line 168
    invoke-virtual {v13}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 169
    .line 170
    .line 171
    move-result-wide v13

    .line 172
    sget-object v15, La/qmk;->a:La/zcl;

    .line 173
    .line 174
    const/high16 v15, 0x41800000    # 16.0f

    .line 175
    .line 176
    invoke-static {v15}, La/vgg0;->a(F)La/ugg0;

    .line 177
    .line 178
    .line 179
    move-result-object v15

    .line 180
    invoke-static {v1, v13, v14, v15}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    sget-object v14, La/uc9;->c:La/mw3;

    .line 185
    .line 186
    sget-object v15, La/gqw0;->m:La/xx7;

    .line 187
    .line 188
    invoke-static {v14, v15, v9, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 189
    .line 190
    .line 191
    move-result-object v14

    .line 192
    move/from16 v17, v11

    .line 193
    .line 194
    iget-wide v10, v9, La/fet;->T:J

    .line 195
    .line 196
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 197
    .line 198
    .line 199
    move-result v10

    .line 200
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    invoke-static {v9, v13}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 205
    .line 206
    .line 207
    move-result-object v13

    .line 208
    sget-object v18, La/mkd;->c0:La/gqw0;

    .line 209
    .line 210
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v9}, La/fet;->i0()V

    .line 214
    .line 215
    .line 216
    iget-boolean v15, v9, La/fet;->S:Z

    .line 217
    .line 218
    if-eqz v15, :cond_7

    .line 219
    .line 220
    sget-object v15, La/e7z;->u1:La/pcy;

    .line 221
    .line 222
    invoke-virtual {v9, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 223
    .line 224
    .line 225
    goto :goto_6

    .line 226
    :cond_7
    invoke-virtual {v9}, La/fet;->r0()V

    .line 227
    .line 228
    .line 229
    :goto_6
    sget-object v15, La/gqw0;->x:La/shd;

    .line 230
    .line 231
    invoke-static {v9, v14, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 232
    .line 233
    .line 234
    sget-object v14, La/gqw0;->w:La/shd;

    .line 235
    .line 236
    invoke-static {v9, v11, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 237
    .line 238
    .line 239
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    sget-object v11, La/gqw0;->y:La/shd;

    .line 244
    .line 245
    invoke-static {v9, v10, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 249
    .line 250
    .line 251
    sget-object v10, La/gqw0;->v:La/shd;

    .line 252
    .line 253
    invoke-static {v9, v13, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v7}, La/hdz;->c()I

    .line 257
    .line 258
    .line 259
    move-result v10

    .line 260
    const/4 v11, 0x0

    .line 261
    if-eqz v10, :cond_b

    .line 262
    .line 263
    const v10, 0x45d057ee

    .line 264
    .line 265
    .line 266
    invoke-virtual {v9, v10}, La/fet;->e0(I)V

    .line 267
    .line 268
    .line 269
    xor-int/lit8 v10, v17, 0x1

    .line 270
    .line 271
    const v13, 0xe000

    .line 272
    .line 273
    .line 274
    and-int/2addr v3, v13

    .line 275
    if-ne v3, v6, :cond_8

    .line 276
    .line 277
    const/4 v3, 0x1

    .line 278
    goto :goto_7

    .line 279
    :cond_8
    const/4 v3, 0x0

    .line 280
    :goto_7
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    if-nez v3, :cond_9

    .line 285
    .line 286
    sget-object v3, La/ukd;->a:La/cl5;

    .line 287
    .line 288
    if-ne v6, v3, :cond_a

    .line 289
    .line 290
    :cond_9
    new-instance v6, La/i8v;

    .line 291
    .line 292
    const/16 v3, 0x8

    .line 293
    .line 294
    invoke-direct {v6, v5, v3}, La/i8v;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v9, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 301
    .line 302
    const/4 v15, 0x0

    .line 303
    invoke-static {v15, v9, v11, v6, v10}, La/sj3;->w(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;Z)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v9, v15}, La/fet;->r(Z)V

    .line 307
    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_b
    const/4 v15, 0x0

    .line 311
    const v3, 0x45d3afd2

    .line 312
    .line 313
    .line 314
    invoke-virtual {v9, v3}, La/fet;->e0(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v9, v15}, La/fet;->r(Z)V

    .line 318
    .line 319
    .line 320
    :goto_8
    const/4 v3, 0x0

    .line 321
    const/high16 v6, 0x44800000    # 1024.0f

    .line 322
    .line 323
    const/4 v10, 0x1

    .line 324
    invoke-static {v12, v3, v6, v10}, La/o7k0;->g(La/mm40;FFI)La/mm40;

    .line 325
    .line 326
    .line 327
    move-result-object v12

    .line 328
    new-instance v2, La/cw6;

    .line 329
    .line 330
    move-object v3, v7

    .line 331
    move/from16 v6, v17

    .line 332
    .line 333
    move-object v7, v5

    .line 334
    move-object/from16 v5, p1

    .line 335
    .line 336
    invoke-direct/range {v2 .. v7}, La/cw6;-><init>(La/hdz;La/kie0;La/pk5;ZLkotlin/jvm/functions/Function1;)V

    .line 337
    .line 338
    .line 339
    move-object/from16 v17, v2

    .line 340
    .line 341
    move-object v2, v5

    .line 342
    const/high16 v19, 0xc00000

    .line 343
    .line 344
    const/16 v20, 0x17e

    .line 345
    .line 346
    move/from16 v16, v10

    .line 347
    .line 348
    const/4 v10, 0x0

    .line 349
    move-object v5, v11

    .line 350
    const/4 v11, 0x0

    .line 351
    move-object v9, v12

    .line 352
    const/4 v12, 0x0

    .line 353
    const/4 v13, 0x0

    .line 354
    const/4 v14, 0x0

    .line 355
    move/from16 v18, v15

    .line 356
    .line 357
    const/4 v15, 0x0

    .line 358
    move/from16 v6, v16

    .line 359
    .line 360
    const/16 v16, 0x0

    .line 361
    .line 362
    move v7, v6

    .line 363
    move/from16 v6, v18

    .line 364
    .line 365
    move-object/from16 v18, p5

    .line 366
    .line 367
    invoke-static/range {v9 .. v20}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 368
    .line 369
    .line 370
    move-object/from16 v9, v18

    .line 371
    .line 372
    invoke-virtual {v9, v7}, La/fet;->r(Z)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3}, La/hdz;->e()La/h7d;

    .line 376
    .line 377
    .line 378
    move-result-object v10

    .line 379
    iget-object v10, v10, La/h7d;->a:La/mva;

    .line 380
    .line 381
    if-eqz v10, :cond_13

    .line 382
    .line 383
    instance-of v11, v10, La/zo00;

    .line 384
    .line 385
    if-eqz v11, :cond_c

    .line 386
    .line 387
    const v4, 0x122edd4a

    .line 388
    .line 389
    .line 390
    invoke-virtual {v9, v4}, La/fet;->e0(I)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v9, v6}, La/fet;->r(Z)V

    .line 394
    .line 395
    .line 396
    check-cast v10, La/zo00;

    .line 397
    .line 398
    iget-object v4, v10, La/zo00;->b:Ljava/lang/Throwable;

    .line 399
    .line 400
    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    goto :goto_a

    .line 404
    :cond_c
    instance-of v11, v10, La/bp00;

    .line 405
    .line 406
    if-eqz v11, :cond_d

    .line 407
    .line 408
    const v5, 0x33ae2d90

    .line 409
    .line 410
    .line 411
    invoke-virtual {v9, v5}, La/fet;->e0(I)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v9, v6}, La/fet;->r(Z)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v3}, La/hdz;->c()I

    .line 418
    .line 419
    .line 420
    move-result v5

    .line 421
    if-eqz v5, :cond_f

    .line 422
    .line 423
    iput v6, v4, La/kie0;->a:I

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_d
    instance-of v4, v10, La/ap00;

    .line 427
    .line 428
    if-eqz v4, :cond_13

    .line 429
    .line 430
    const v4, 0x33b10ac9

    .line 431
    .line 432
    .line 433
    invoke-virtual {v9, v4}, La/fet;->e0(I)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v3}, La/hdz;->c()I

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    if-nez v4, :cond_e

    .line 441
    .line 442
    const v4, 0x33b1e9d7    # 8.28474E-8f

    .line 443
    .line 444
    .line 445
    invoke-virtual {v9, v4}, La/fet;->e0(I)V

    .line 446
    .line 447
    .line 448
    invoke-static {v6, v7, v9, v5}, La/ffb0;->m(IILa/fet;La/mm40;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v9, v6}, La/fet;->r(Z)V

    .line 452
    .line 453
    .line 454
    goto :goto_9

    .line 455
    :cond_e
    const v4, 0x33b30ae4

    .line 456
    .line 457
    .line 458
    invoke-virtual {v9, v4}, La/fet;->e0(I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v9, v6}, La/fet;->r(Z)V

    .line 462
    .line 463
    .line 464
    :goto_9
    invoke-virtual {v9, v6}, La/fet;->r(Z)V

    .line 465
    .line 466
    .line 467
    :cond_f
    :goto_a
    invoke-virtual {v3}, La/hdz;->e()La/h7d;

    .line 468
    .line 469
    .line 470
    move-result-object v4

    .line 471
    iget-object v4, v4, La/h7d;->c:La/mva;

    .line 472
    .line 473
    if-nez v4, :cond_10

    .line 474
    .line 475
    goto :goto_b

    .line 476
    :cond_10
    instance-of v5, v4, La/zo00;

    .line 477
    .line 478
    if-eqz v5, :cond_11

    .line 479
    .line 480
    check-cast v4, La/zo00;

    .line 481
    .line 482
    iget-object v3, v4, La/zo00;->b:Ljava/lang/Throwable;

    .line 483
    .line 484
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    goto :goto_b

    .line 488
    :cond_11
    instance-of v5, v4, La/bp00;

    .line 489
    .line 490
    if-eqz v5, :cond_12

    .line 491
    .line 492
    invoke-virtual {v3}, La/hdz;->c()I

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    if-eqz v3, :cond_12

    .line 497
    .line 498
    iget-boolean v3, v4, La/mva;->a:Z

    .line 499
    .line 500
    if-eqz v3, :cond_12

    .line 501
    .line 502
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 503
    .line 504
    invoke-interface {v8, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    :cond_12
    :goto_b
    invoke-virtual {v9, v6}, La/fet;->r(Z)V

    .line 508
    .line 509
    .line 510
    goto :goto_c

    .line 511
    :cond_13
    const v0, 0x122ed35b

    .line 512
    .line 513
    .line 514
    invoke-static {v0, v9, v6}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    throw v0

    .line 519
    :cond_14
    move v6, v10

    .line 520
    instance-of v3, v2, La/nk5;

    .line 521
    .line 522
    if-eqz v3, :cond_15

    .line 523
    .line 524
    const v3, 0x33bb76b9

    .line 525
    .line 526
    .line 527
    invoke-virtual {v9, v3}, La/fet;->e0(I)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v9, v6}, La/fet;->r(Z)V

    .line 531
    .line 532
    .line 533
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 534
    .line 535
    invoke-interface {v8, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    goto :goto_c

    .line 539
    :cond_15
    sget-object v3, La/ok5;->a:La/ok5;

    .line 540
    .line 541
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    move-result v3

    .line 545
    if-eqz v3, :cond_16

    .line 546
    .line 547
    const v3, 0x33bcfca5

    .line 548
    .line 549
    .line 550
    invoke-virtual {v9, v3}, La/fet;->e0(I)V

    .line 551
    .line 552
    .line 553
    sget-object v3, La/qmk;->a:La/zcl;

    .line 554
    .line 555
    const/16 v16, 0x0

    .line 556
    .line 557
    const/16 v17, 0xd

    .line 558
    .line 559
    const/4 v13, 0x0

    .line 560
    const/high16 v14, 0x41400000    # 12.0f

    .line 561
    .line 562
    const/4 v15, 0x0

    .line 563
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 564
    .line 565
    .line 566
    move-result-object v3

    .line 567
    invoke-static {v6, v6, v9, v3}, La/ffb0;->m(IILa/fet;La/mm40;)V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v9, v6}, La/fet;->r(Z)V

    .line 571
    .line 572
    .line 573
    goto :goto_c

    .line 574
    :cond_16
    const v0, 0x122cb61b

    .line 575
    .line 576
    .line 577
    invoke-static {v0, v9, v6}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    throw v0

    .line 582
    :cond_17
    invoke-virtual {v9}, La/fet;->X()V

    .line 583
    .line 584
    .line 585
    :goto_c
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 586
    .line 587
    .line 588
    move-result-object v9

    .line 589
    if-eqz v9, :cond_18

    .line 590
    .line 591
    new-instance v0, La/cqk;

    .line 592
    .line 593
    const/16 v7, 0x1d

    .line 594
    .line 595
    move-object/from16 v3, p2

    .line 596
    .line 597
    move-object/from16 v5, p4

    .line 598
    .line 599
    move/from16 v6, p6

    .line 600
    .line 601
    move-object v4, v8

    .line 602
    invoke-direct/range {v0 .. v7}, La/cqk;-><init>(La/mm40;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IB)V

    .line 603
    .line 604
    .line 605
    iput-object v0, v9, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 606
    .line 607
    :cond_18
    return-void
.end method

.method public static final r(La/mm40;Ljava/lang/String;Ljava/lang/String;La/c280;La/c280;La/kpm;ZLa/fet;I)V
    .locals 18

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v5, p4

    .line 8
    .line 9
    move-object/from16 v6, p5

    .line 10
    .line 11
    move/from16 v7, p6

    .line 12
    .line 13
    move-object/from16 v0, p7

    .line 14
    .line 15
    const v1, -0x56a8d521

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, La/fet;->g0(I)La/fet;

    .line 19
    .line 20
    .line 21
    or-int/lit8 v1, p8, 0x6

    .line 22
    .line 23
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    const/16 v8, 0x20

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v8, 0x10

    .line 33
    .line 34
    :goto_0
    or-int/2addr v1, v8

    .line 35
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v8

    .line 39
    if-eqz v8, :cond_1

    .line 40
    .line 41
    const/16 v8, 0x100

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/16 v8, 0x80

    .line 45
    .line 46
    :goto_1
    or-int/2addr v1, v8

    .line 47
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-eqz v8, :cond_2

    .line 52
    .line 53
    const/16 v8, 0x800

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v8, 0x400

    .line 57
    .line 58
    :goto_2
    or-int/2addr v1, v8

    .line 59
    invoke-virtual {v0, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_3

    .line 64
    .line 65
    const/16 v8, 0x4000

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    const/16 v8, 0x2000

    .line 69
    .line 70
    :goto_3
    or-int/2addr v1, v8

    .line 71
    invoke-virtual {v0, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    if-eqz v8, :cond_4

    .line 76
    .line 77
    const/high16 v8, 0x20000

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_4
    const/high16 v8, 0x10000

    .line 81
    .line 82
    :goto_4
    or-int/2addr v1, v8

    .line 83
    invoke-virtual {v0, v7}, La/fet;->h(Z)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-eqz v8, :cond_5

    .line 88
    .line 89
    const/high16 v8, 0x100000

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_5
    const/high16 v8, 0x80000

    .line 93
    .line 94
    :goto_5
    or-int/2addr v1, v8

    .line 95
    const v8, 0x92493

    .line 96
    .line 97
    .line 98
    and-int/2addr v8, v1

    .line 99
    const v9, 0x92492

    .line 100
    .line 101
    .line 102
    const/4 v10, 0x1

    .line 103
    if-eq v8, v9, :cond_6

    .line 104
    .line 105
    move v8, v10

    .line 106
    goto :goto_6

    .line 107
    :cond_6
    const/4 v8, 0x0

    .line 108
    :goto_6
    and-int/lit8 v9, v1, 0x1

    .line 109
    .line 110
    invoke-virtual {v0, v9, v8}, La/fet;->U(IZ)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-eqz v8, :cond_c

    .line 115
    .line 116
    sget-object v8, La/jm40;->b:La/jm40;

    .line 117
    .line 118
    const/high16 v9, 0x3f800000    # 1.0f

    .line 119
    .line 120
    invoke-static {v8, v9}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 121
    .line 122
    .line 123
    move-result-object v11

    .line 124
    sget-object v12, La/qmk;->a:La/zcl;

    .line 125
    .line 126
    const/high16 v12, 0x42580000    # 54.0f

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const/4 v14, 0x2

    .line 130
    invoke-static {v11, v12, v13, v14}, La/o7k0;->g(La/mm40;FFI)La/mm40;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    new-instance v12, La/qw3;

    .line 135
    .line 136
    new-instance v13, La/jf4;

    .line 137
    .line 138
    const/16 v14, 0xe

    .line 139
    .line 140
    invoke-direct {v13, v14}, La/jf4;-><init>(B)V

    .line 141
    .line 142
    .line 143
    const/high16 v14, 0x41000000    # 8.0f

    .line 144
    .line 145
    invoke-direct {v12, v14, v10, v13}, La/qw3;-><init>(FZLa/rw3;)V

    .line 146
    .line 147
    .line 148
    sget-object v13, La/gqw0;->k:La/yx7;

    .line 149
    .line 150
    const/16 v14, 0x30

    .line 151
    .line 152
    invoke-static {v12, v13, v0, v14}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 153
    .line 154
    .line 155
    move-result-object v12

    .line 156
    iget-wide v13, v0, La/fet;->T:J

    .line 157
    .line 158
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    invoke-static {v0, v11}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 167
    .line 168
    .line 169
    move-result-object v11

    .line 170
    sget-object v15, La/mkd;->c0:La/gqw0;

    .line 171
    .line 172
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0}, La/fet;->i0()V

    .line 176
    .line 177
    .line 178
    iget-boolean v15, v0, La/fet;->S:Z

    .line 179
    .line 180
    if-eqz v15, :cond_7

    .line 181
    .line 182
    sget-object v15, La/e7z;->u1:La/pcy;

    .line 183
    .line 184
    invoke-virtual {v0, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 185
    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_7
    invoke-virtual {v0}, La/fet;->r0()V

    .line 189
    .line 190
    .line 191
    :goto_7
    sget-object v15, La/gqw0;->x:La/shd;

    .line 192
    .line 193
    invoke-static {v0, v12, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 194
    .line 195
    .line 196
    sget-object v12, La/gqw0;->w:La/shd;

    .line 197
    .line 198
    invoke-static {v0, v14, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v12

    .line 205
    sget-object v13, La/gqw0;->y:La/shd;

    .line 206
    .line 207
    invoke-static {v0, v12, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 208
    .line 209
    .line 210
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 211
    .line 212
    .line 213
    sget-object v12, La/gqw0;->v:La/shd;

    .line 214
    .line 215
    invoke-static {v0, v11, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 216
    .line 217
    .line 218
    float-to-double v11, v9

    .line 219
    const-wide/16 v13, 0x0

    .line 220
    .line 221
    cmpl-double v11, v11, v13

    .line 222
    .line 223
    const-string v12, "invalid weight; must be greater than zero"

    .line 224
    .line 225
    if-lez v11, :cond_8

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_8
    invoke-static {v12}, La/vcx;->a(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    :goto_8
    new-instance v11, La/x7z;

    .line 232
    .line 233
    const v15, 0x7f7fffff    # Float.MAX_VALUE

    .line 234
    .line 235
    .line 236
    cmpl-float v16, v9, v15

    .line 237
    .line 238
    if-lez v16, :cond_9

    .line 239
    .line 240
    move-wide/from16 v16, v13

    .line 241
    .line 242
    move v13, v15

    .line 243
    goto :goto_9

    .line 244
    :cond_9
    move-wide/from16 v16, v13

    .line 245
    .line 246
    move v13, v9

    .line 247
    :goto_9
    invoke-direct {v11, v13, v10}, La/x7z;-><init>(FZ)V

    .line 248
    .line 249
    .line 250
    and-int/lit8 v13, v1, 0x70

    .line 251
    .line 252
    shr-int/lit8 v14, v1, 0x3

    .line 253
    .line 254
    move/from16 p0, v15

    .line 255
    .line 256
    and-int/lit16 v15, v14, 0x380

    .line 257
    .line 258
    or-int/2addr v13, v15

    .line 259
    invoke-static {v13, v0, v11, v4, v2}, La/ahb;->m(ILa/fet;La/mm40;La/c280;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    const/4 v11, 0x0

    .line 263
    invoke-static {v11, v6, v7, v0, v10}, La/n4c;->l(La/mm40;La/mpm;ZLa/fet;I)V

    .line 264
    .line 265
    .line 266
    float-to-double v10, v9

    .line 267
    cmpl-double v10, v10, v16

    .line 268
    .line 269
    if-lez v10, :cond_a

    .line 270
    .line 271
    goto :goto_a

    .line 272
    :cond_a
    invoke-static {v12}, La/vcx;->a(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    :goto_a
    new-instance v10, La/x7z;

    .line 276
    .line 277
    cmpl-float v11, v9, p0

    .line 278
    .line 279
    if-lez v11, :cond_b

    .line 280
    .line 281
    move/from16 v9, p0

    .line 282
    .line 283
    :cond_b
    const/4 v13, 0x1

    .line 284
    invoke-direct {v10, v9, v13}, La/x7z;-><init>(FZ)V

    .line 285
    .line 286
    .line 287
    and-int/lit8 v9, v14, 0x70

    .line 288
    .line 289
    shr-int/lit8 v1, v1, 0x6

    .line 290
    .line 291
    and-int/lit16 v1, v1, 0x380

    .line 292
    .line 293
    or-int/2addr v1, v9

    .line 294
    invoke-static {v1, v0, v10, v5, v3}, La/ahb;->t(ILa/fet;La/mm40;La/c280;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 298
    .line 299
    .line 300
    move-object v1, v8

    .line 301
    goto :goto_b

    .line 302
    :cond_c
    invoke-virtual {v0}, La/fet;->X()V

    .line 303
    .line 304
    .line 305
    move-object/from16 v1, p0

    .line 306
    .line 307
    :goto_b
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 308
    .line 309
    .line 310
    move-result-object v10

    .line 311
    if-eqz v10, :cond_d

    .line 312
    .line 313
    new-instance v0, La/ecc;

    .line 314
    .line 315
    const/4 v9, 0x7

    .line 316
    move/from16 v8, p8

    .line 317
    .line 318
    invoke-direct/range {v0 .. v9}, La/ecc;-><init>(La/mm40;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;La/kpm;ZIB)V

    .line 319
    .line 320
    .line 321
    iput-object v0, v10, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 322
    .line 323
    :cond_d
    return-void
.end method

.method public static final s(ILa/fet;La/a4x;La/mm40;)V
    .locals 8

    .line 1
    const v0, 0x659b5a8b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    or-int/lit8 v0, p0, 0x6

    .line 8
    .line 9
    invoke-virtual {p1, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x20

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/16 v1, 0x10

    .line 19
    .line 20
    :goto_0
    or-int/2addr v0, v1

    .line 21
    and-int/lit8 v1, v0, 0x13

    .line 22
    .line 23
    const/16 v2, 0x12

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    const/4 v4, 0x1

    .line 27
    if-eq v1, v2, :cond_1

    .line 28
    .line 29
    move v1, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v1, v3

    .line 32
    :goto_1
    and-int/lit8 v2, v0, 0x1

    .line 33
    .line 34
    invoke-virtual {p1, v2, v1}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_5

    .line 39
    .line 40
    shr-int/lit8 p3, v0, 0x3

    .line 41
    .line 42
    const/16 v0, 0xe

    .line 43
    .line 44
    and-int/2addr p3, v0

    .line 45
    invoke-static {p2, p1, p3}, La/ahb;->T(La/a4x;La/fet;I)La/l7m0;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    sget-object v1, La/qmk;->a:La/zcl;

    .line 50
    .line 51
    new-instance v1, La/qw3;

    .line 52
    .line 53
    new-instance v2, La/jf4;

    .line 54
    .line 55
    invoke-direct {v2, v0}, La/jf4;-><init>(B)V

    .line 56
    .line 57
    .line 58
    const/high16 v0, 0x40800000    # 4.0f

    .line 59
    .line 60
    invoke-direct {v1, v0, v4, v2}, La/qw3;-><init>(FZLa/rw3;)V

    .line 61
    .line 62
    .line 63
    sget-object v0, La/gqw0;->j:La/yx7;

    .line 64
    .line 65
    invoke-static {v1, v0, p1, v3}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-wide v1, p1, La/fet;->T:J

    .line 70
    .line 71
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    sget-object v5, La/jm40;->b:La/jm40;

    .line 80
    .line 81
    invoke-static {p1, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 86
    .line 87
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, La/fet;->i0()V

    .line 91
    .line 92
    .line 93
    iget-boolean v7, p1, La/fet;->S:Z

    .line 94
    .line 95
    if-eqz v7, :cond_2

    .line 96
    .line 97
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 98
    .line 99
    invoke-virtual {p1, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    invoke-virtual {p1}, La/fet;->r0()V

    .line 104
    .line 105
    .line 106
    :goto_2
    sget-object v7, La/gqw0;->x:La/shd;

    .line 107
    .line 108
    invoke-static {p1, v0, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    sget-object v0, La/gqw0;->w:La/shd;

    .line 112
    .line 113
    invoke-static {p1, v2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget-object v1, La/gqw0;->y:La/shd;

    .line 121
    .line 122
    invoke-static {p1, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 126
    .line 127
    .line 128
    sget-object v0, La/gqw0;->v:La/shd;

    .line 129
    .line 130
    invoke-static {p1, v6, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    const v0, 0x63002d19

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 137
    .line 138
    .line 139
    invoke-interface {p3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p3

    .line 143
    check-cast p3, Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object p3

    .line 149
    move v0, v3

    .line 150
    :goto_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_4

    .line 155
    .line 156
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    add-int/lit8 v2, v0, 0x1

    .line 161
    .line 162
    if-ltz v0, :cond_3

    .line 163
    .line 164
    check-cast v1, La/egm;

    .line 165
    .line 166
    const v6, -0x1bc48d3c

    .line 167
    .line 168
    .line 169
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {p1, v6, v0}, La/fet;->b0(ILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v1, p1}, La/feb;->n(La/egm;La/fet;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 180
    .line 181
    .line 182
    move v0, v2

    .line 183
    goto :goto_3

    .line 184
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 185
    .line 186
    .line 187
    const/4 p0, 0x0

    .line 188
    throw p0

    .line 189
    :cond_4
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v4}, La/fet;->r(Z)V

    .line 193
    .line 194
    .line 195
    move-object p3, v5

    .line 196
    goto :goto_4

    .line 197
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 198
    .line 199
    .line 200
    :goto_4
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    if-eqz p1, :cond_6

    .line 205
    .line 206
    new-instance v0, La/zw1;

    .line 207
    .line 208
    const/4 v1, 0x7

    .line 209
    invoke-direct {v0, p3, p2, p0, v1}, La/zw1;-><init>(La/mm40;La/a4x;IB)V

    .line 210
    .line 211
    .line 212
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 213
    .line 214
    :cond_6
    return-void
.end method

.method public static final t(ILa/fet;La/mm40;La/c280;Ljava/lang/String;)V
    .locals 30

    .line 1
    move/from16 v4, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    const v1, -0x192461a7

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v1, v4, 0x6

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    invoke-virtual/range {p1 .. p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x2

    .line 26
    :goto_0
    or-int/2addr v1, v4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v1, v4

    .line 29
    :goto_1
    and-int/lit8 v2, v4, 0x30

    .line 30
    .line 31
    if-nez v2, :cond_3

    .line 32
    .line 33
    move-object/from16 v2, p4

    .line 34
    .line 35
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-eqz v5, :cond_2

    .line 40
    .line 41
    const/16 v5, 0x20

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v5, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v1, v5

    .line 47
    goto :goto_3

    .line 48
    :cond_3
    move-object/from16 v2, p4

    .line 49
    .line 50
    :goto_3
    and-int/lit16 v5, v4, 0x180

    .line 51
    .line 52
    const/16 v6, 0x100

    .line 53
    .line 54
    if-nez v5, :cond_5

    .line 55
    .line 56
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    move v5, v6

    .line 63
    goto :goto_4

    .line 64
    :cond_4
    const/16 v5, 0x80

    .line 65
    .line 66
    :goto_4
    or-int/2addr v1, v5

    .line 67
    :cond_5
    and-int/lit16 v5, v1, 0x93

    .line 68
    .line 69
    const/16 v7, 0x92

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x1

    .line 73
    if-eq v5, v7, :cond_6

    .line 74
    .line 75
    move v5, v9

    .line 76
    goto :goto_5

    .line 77
    :cond_6
    move v5, v8

    .line 78
    :goto_5
    and-int/lit8 v7, v1, 0x1

    .line 79
    .line 80
    invoke-virtual {v0, v7, v5}, La/fet;->U(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_d

    .line 85
    .line 86
    sget-object v5, La/qmk;->a:La/zcl;

    .line 87
    .line 88
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 89
    .line 90
    new-instance v7, La/qw3;

    .line 91
    .line 92
    new-instance v10, La/gne;

    .line 93
    .line 94
    const/16 v11, 0xc

    .line 95
    .line 96
    invoke-direct {v10, v5, v11}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 97
    .line 98
    .line 99
    const/high16 v5, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-direct {v7, v5, v9, v10}, La/qw3;-><init>(FZLa/rw3;)V

    .line 102
    .line 103
    .line 104
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 105
    .line 106
    const/16 v10, 0x30

    .line 107
    .line 108
    invoke-static {v7, v5, v0, v10}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    iget-wide v10, v0, La/fet;->T:J

    .line 113
    .line 114
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    invoke-static/range {p1 .. p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 123
    .line 124
    .line 125
    move-result-object v11

    .line 126
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 127
    .line 128
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, La/fet;->i0()V

    .line 132
    .line 133
    .line 134
    iget-boolean v12, v0, La/fet;->S:Z

    .line 135
    .line 136
    if-eqz v12, :cond_7

    .line 137
    .line 138
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 139
    .line 140
    invoke-virtual {v0, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    invoke-virtual {v0}, La/fet;->r0()V

    .line 145
    .line 146
    .line 147
    :goto_6
    sget-object v12, La/gqw0;->x:La/shd;

    .line 148
    .line 149
    invoke-static {v0, v5, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    sget-object v5, La/gqw0;->w:La/shd;

    .line 153
    .line 154
    invoke-static {v0, v10, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    sget-object v7, La/gqw0;->y:La/shd;

    .line 162
    .line 163
    invoke-static {v0, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 164
    .line 165
    .line 166
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 167
    .line 168
    .line 169
    sget-object v5, La/gqw0;->v:La/shd;

    .line 170
    .line 171
    invoke-static {v0, v11, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 172
    .line 173
    .line 174
    and-int/lit16 v5, v1, 0x380

    .line 175
    .line 176
    if-ne v5, v6, :cond_8

    .line 177
    .line 178
    move v8, v9

    .line 179
    :cond_8
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    sget-object v6, La/ukd;->a:La/cl5;

    .line 184
    .line 185
    if-nez v8, :cond_9

    .line 186
    .line 187
    if-ne v5, v6, :cond_a

    .line 188
    .line 189
    :cond_9
    new-instance v5, La/u6n;

    .line 190
    .line 191
    sget-object v7, La/d4d;->t:La/d4d;

    .line 192
    .line 193
    sget-object v8, La/w6n;->h:La/w6n;

    .line 194
    .line 195
    invoke-direct {v5, v7, v8, v3}, La/u6n;-><init>(La/d4d;La/w6n;La/d280;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_a
    check-cast v5, La/u6n;

    .line 202
    .line 203
    invoke-virtual {v0, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v8

    .line 211
    if-nez v7, :cond_b

    .line 212
    .line 213
    if-ne v8, v6, :cond_c

    .line 214
    .line 215
    :cond_b
    new-instance v8, La/d1n;

    .line 216
    .line 217
    invoke-direct {v8, v5, v9}, La/d1n;-><init>(La/u6n;B)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_c
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 224
    .line 225
    const/4 v5, 0x0

    .line 226
    invoke-static {v9, v0, v5, v8}, La/kkb;->p(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 227
    .line 228
    .line 229
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 230
    .line 231
    invoke-virtual {v0, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 236
    .line 237
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 238
    .line 239
    .line 240
    move-result-wide v7

    .line 241
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 242
    .line 243
    invoke-virtual {v0, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    check-cast v6, La/g1t0;

    .line 248
    .line 249
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 253
    .line 254
    .line 255
    move-result-object v6

    .line 256
    iget-object v6, v6, La/y9q0;->a:La/smk0;

    .line 257
    .line 258
    iget-object v14, v6, La/smk0;->f:La/nrq;

    .line 259
    .line 260
    sget-wide v16, La/qmk;->q:J

    .line 261
    .line 262
    invoke-virtual {v0, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    check-cast v5, La/g1t0;

    .line 267
    .line 268
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 272
    .line 273
    .line 274
    move-result-object v5

    .line 275
    iget-object v5, v5, La/y9q0;->a:La/smk0;

    .line 276
    .line 277
    iget-wide v5, v5, La/smk0;->b:J

    .line 278
    .line 279
    const-wide/high16 v10, 0x3fd0000000000000L    # 0.25

    .line 280
    .line 281
    invoke-static {v10, v11}, La/idm0;->s(D)J

    .line 282
    .line 283
    .line 284
    move-result-wide v20

    .line 285
    new-instance v15, La/n05;

    .line 286
    .line 287
    move-wide/from16 v18, v5

    .line 288
    .line 289
    invoke-direct/range {v15 .. v21}, La/n05;-><init>(JJJ)V

    .line 290
    .line 291
    .line 292
    new-instance v5, La/f2q0;

    .line 293
    .line 294
    const/4 v6, 0x5

    .line 295
    invoke-direct {v5, v6}, La/f2q0;-><init>(I)V

    .line 296
    .line 297
    .line 298
    shr-int/lit8 v1, v1, 0x3

    .line 299
    .line 300
    and-int/lit8 v27, v1, 0xe

    .line 301
    .line 302
    const/16 v28, 0x6180

    .line 303
    .line 304
    const v29, 0x3ab72

    .line 305
    .line 306
    .line 307
    const/4 v6, 0x0

    .line 308
    const-wide/16 v10, 0x0

    .line 309
    .line 310
    const/4 v12, 0x0

    .line 311
    const/4 v13, 0x0

    .line 312
    move v1, v9

    .line 313
    move-object v9, v15

    .line 314
    const-wide/16 v15, 0x0

    .line 315
    .line 316
    const-wide/16 v18, 0x0

    .line 317
    .line 318
    const/16 v20, 0x2

    .line 319
    .line 320
    const/16 v21, 0x0

    .line 321
    .line 322
    const/16 v22, 0x3

    .line 323
    .line 324
    const/16 v23, 0x0

    .line 325
    .line 326
    const/16 v24, 0x0

    .line 327
    .line 328
    const/16 v25, 0x0

    .line 329
    .line 330
    move-object/from16 v26, v0

    .line 331
    .line 332
    move-object/from16 v17, v5

    .line 333
    .line 334
    move-object v5, v2

    .line 335
    invoke-static/range {v5 .. v29}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 339
    .line 340
    .line 341
    goto :goto_7

    .line 342
    :cond_d
    invoke-virtual {v0}, La/fet;->X()V

    .line 343
    .line 344
    .line 345
    :goto_7
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    if-eqz v6, :cond_e

    .line 350
    .line 351
    new-instance v0, La/iym;

    .line 352
    .line 353
    const/4 v5, 0x0

    .line 354
    move-object/from16 v1, p2

    .line 355
    .line 356
    move-object/from16 v2, p4

    .line 357
    .line 358
    invoke-direct/range {v0 .. v5}, La/iym;-><init>(La/mm40;Ljava/lang/String;La/c280;IB)V

    .line 359
    .line 360
    .line 361
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 362
    .line 363
    :cond_e
    return-void
.end method

.method public static final u(La/mm40;La/f6m;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v7, p3

    .line 8
    .line 9
    move/from16 v0, p4

    .line 10
    .line 11
    const v4, -0x50f05cf5

    .line 12
    .line 13
    .line 14
    invoke-virtual {v7, v4}, La/fet;->g0(I)La/fet;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v4, v0, 0x6

    .line 18
    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    invoke-virtual {v7, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v4, 0x2

    .line 30
    :goto_0
    or-int/2addr v4, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v4, v0

    .line 33
    :goto_1
    and-int/lit8 v5, v0, 0x30

    .line 34
    .line 35
    if-nez v5, :cond_3

    .line 36
    .line 37
    invoke-virtual {v7, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    const/16 v5, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v5, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v4, v5

    .line 49
    :cond_3
    and-int/lit16 v5, v0, 0x180

    .line 50
    .line 51
    const/16 v6, 0x100

    .line 52
    .line 53
    if-nez v5, :cond_5

    .line 54
    .line 55
    invoke-virtual {v7, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_4

    .line 60
    .line 61
    move v5, v6

    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const/16 v5, 0x80

    .line 64
    .line 65
    :goto_3
    or-int/2addr v4, v5

    .line 66
    :cond_5
    and-int/lit16 v5, v4, 0x93

    .line 67
    .line 68
    const/16 v8, 0x92

    .line 69
    .line 70
    const/4 v9, 0x0

    .line 71
    const/4 v10, 0x1

    .line 72
    if-eq v5, v8, :cond_6

    .line 73
    .line 74
    move v5, v10

    .line 75
    goto :goto_4

    .line 76
    :cond_6
    move v5, v9

    .line 77
    :goto_4
    and-int/lit8 v8, v4, 0x1

    .line 78
    .line 79
    invoke-virtual {v7, v8, v5}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_a

    .line 84
    .line 85
    const-string v5, "TournamentsIconTestTag"

    .line 86
    .line 87
    invoke-static {v1, v5}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    new-instance v11, La/p2m;

    .line 92
    .line 93
    iget-object v15, v2, La/f6m;->a:La/m0x;

    .line 94
    .line 95
    sget-object v8, La/m8m0;->a:La/zfn;

    .line 96
    .line 97
    invoke-virtual {v7, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    check-cast v8, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 102
    .line 103
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 104
    .line 105
    .line 106
    move-result-wide v13

    .line 107
    iget-object v8, v2, La/f6m;->b:Ljava/lang/String;

    .line 108
    .line 109
    const v12, 0x7f080a2c

    .line 110
    .line 111
    .line 112
    move-object/from16 v16, v8

    .line 113
    .line 114
    invoke-direct/range {v11 .. v16}, La/p2m;-><init>(IJLa/m0x;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    and-int/lit16 v4, v4, 0x380

    .line 118
    .line 119
    if-ne v4, v6, :cond_7

    .line 120
    .line 121
    move v9, v10

    .line 122
    :cond_7
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    if-nez v9, :cond_8

    .line 127
    .line 128
    sget-object v6, La/ukd;->a:La/cl5;

    .line 129
    .line 130
    if-ne v4, v6, :cond_9

    .line 131
    .line 132
    :cond_8
    new-instance v4, La/cjl;

    .line 133
    .line 134
    const/16 v6, 0xd

    .line 135
    .line 136
    invoke-direct {v4, v3, v6}, La/cjl;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v7, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_9
    move-object v6, v4

    .line 143
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 144
    .line 145
    const/4 v8, 0x0

    .line 146
    const/4 v9, 0x0

    .line 147
    move-object v4, v5

    .line 148
    move-object v5, v11

    .line 149
    invoke-static/range {v4 .. v9}, La/vdb;->w(La/mm40;La/t2m;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_a
    invoke-virtual/range {p3 .. p3}, La/fet;->X()V

    .line 154
    .line 155
    .line 156
    :goto_5
    invoke-virtual/range {p3 .. p3}, La/fet;->u()La/yfe0;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    if-eqz v6, :cond_b

    .line 161
    .line 162
    new-instance v0, La/ikl;

    .line 163
    .line 164
    const/16 v5, 0x9

    .line 165
    .line 166
    move/from16 v4, p4

    .line 167
    .line 168
    invoke-direct/range {v0 .. v5}, La/ikl;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 169
    .line 170
    .line 171
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 172
    .line 173
    :cond_b
    return-void
.end method

.method public static final v(Ljava/util/List;)Lkotlin/Pair;
    .locals 3

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x5

    .line 6
    if-gt v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v0, La/iun;->a:La/iun;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x4

    .line 12
    invoke-static {p0, v0, v0}, Lkotlin/collections/CollectionsKt;->Q0(Ljava/lang/Iterable;II)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ljava/util/List;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    sget-object v0, La/iun;->a:La/iun;

    .line 26
    .line 27
    :cond_1
    const/4 v1, 0x1

    .line 28
    invoke-static {v1, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Ljava/util/List;

    .line 33
    .line 34
    if-nez p0, :cond_2

    .line 35
    .line 36
    sget-object p0, La/iun;->a:La/iun;

    .line 37
    .line 38
    :cond_2
    move-object v2, v0

    .line 39
    move-object v0, p0

    .line 40
    move-object p0, v2

    .line 41
    :goto_0
    new-instance v1, Lkotlin/Pair;

    .line 42
    .line 43
    invoke-direct {v1, p0, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-object v1
.end method

.method public static final w(La/cp;)V
    .locals 9

    .line 1
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, La/cp;->u:La/yfu0;

    .line 4
    .line 5
    check-cast v0, La/z3b0;

    .line 6
    .line 7
    iget-object v0, v0, La/z3b0;->b:Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;

    .line 8
    .line 9
    invoke-virtual {v0}, Lorg/xplatform/uikit_sport/sport_cell/left/SportCellLeftView;->d()Landroidx/appcompat/widget/AppCompatImageView;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/zgb;

    .line 18
    .line 19
    iget-object v2, p0, La/zgb;->e:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v7, 0x0

    .line 22
    const/16 v8, 0x1fc

    .line 23
    .line 24
    const v3, 0x7f08096e

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static final x(ZZZLa/n85;La/n85;La/z6w;)La/d3j;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    sget-object p0, La/b3j;->a:La/b3j;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    if-nez p2, :cond_1

    .line 9
    .line 10
    sget-object p0, La/c3j;->a:La/c3j;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    sget-object p2, La/a3j;->a:La/a3j;

    .line 14
    .line 15
    if-nez p0, :cond_2

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    return-object p2

    .line 20
    :cond_2
    if-eqz p4, :cond_3

    .line 21
    .line 22
    new-instance p0, La/y2j;

    .line 23
    .line 24
    invoke-direct {p0, p4}, La/y2j;-><init>(La/n85;)V

    .line 25
    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_3
    if-eqz p3, :cond_4

    .line 29
    .line 30
    new-instance p0, La/x2j;

    .line 31
    .line 32
    invoke-direct {p0, p3}, La/x2j;-><init>(La/n85;)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_4
    if-eqz p5, :cond_5

    .line 37
    .line 38
    new-instance p0, La/z2j;

    .line 39
    .line 40
    invoke-direct {p0, p5}, La/z2j;-><init>(La/z6w;)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_5
    return-object p2
.end method

.method public static final y(La/ljg;La/mog;Ljava/util/ArrayList;JZ)La/boo0;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-static {p2, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x0

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, La/mog;

    .line 31
    .line 32
    new-instance v3, La/lxl;

    .line 33
    .line 34
    iget-byte v4, v1, La/mog;->a:B

    .line 35
    .line 36
    int-to-long v4, v4

    .line 37
    new-instance v6, La/xxl;

    .line 38
    .line 39
    instance-of v7, v1, La/kog;

    .line 40
    .line 41
    if-eqz v7, :cond_0

    .line 42
    .line 43
    iget-object v2, p0, La/ljg;->b:La/f2h;

    .line 44
    .line 45
    iget-object v2, v2, La/f2h;->c:Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    instance-of v7, v1, La/log;

    .line 49
    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    iget-object v2, p0, La/ljg;->c:La/f2h;

    .line 53
    .line 54
    iget-object v2, v2, La/f2h;->c:Ljava/lang/String;

    .line 55
    .line 56
    :goto_1
    invoke-direct {v6, v2}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-byte v1, v1, La/mog;->a:B

    .line 60
    .line 61
    int-to-long v1, v1

    .line 62
    iget-byte v7, p1, La/mog;->a:B

    .line 63
    .line 64
    int-to-long v7, v7

    .line 65
    cmp-long v1, v1, v7

    .line 66
    .line 67
    if-nez v1, :cond_1

    .line 68
    .line 69
    sget-object v1, La/uxl;->b:La/uxl;

    .line 70
    .line 71
    :goto_2
    move-object v8, v1

    .line 72
    goto :goto_3

    .line 73
    :cond_1
    sget-object v1, La/uxl;->a:La/uxl;

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :goto_3
    const/4 v9, 0x0

    .line 77
    const/16 v10, 0x6c

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    invoke-direct/range {v3 .. v10}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 88
    .line 89
    .line 90
    return-object v2

    .line 91
    :cond_3
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    new-instance p0, La/boo0;

    .line 96
    .line 97
    new-instance v4, La/fyl;

    .line 98
    .line 99
    invoke-static/range {p5 .. p5}, La/xfn;->b(Z)La/wfn;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    iget p1, p1, La/wfn;->e:F

    .line 104
    .line 105
    const/4 p2, 0x0

    .line 106
    const/4 v0, 0x2

    .line 107
    invoke-static {p1, p2, v0}, La/s5x0;->t(FFI)La/lh80;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    new-instance v9, La/jyl;

    .line 112
    .line 113
    new-instance p1, La/y3d;

    .line 114
    .line 115
    invoke-direct {p1, p3, p4}, La/y3d;-><init>(J)V

    .line 116
    .line 117
    .line 118
    const/16 p2, 0x7e

    .line 119
    .line 120
    invoke-direct {v9, p1, v2, v2, p2}, La/jyl;-><init>(La/y3d;La/y3d;La/y3d;I)V

    .line 121
    .line 122
    .line 123
    const/4 v10, 0x6

    .line 124
    const/4 v6, 0x0

    .line 125
    const/4 v7, 0x0

    .line 126
    invoke-direct/range {v4 .. v10}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 127
    .line 128
    .line 129
    sget-object p1, La/pno0;->a:La/pno0;

    .line 130
    .line 131
    const-string p2, "FUTURE_GAMES_TABS"

    .line 132
    .line 133
    invoke-direct {p0, p2, v4, p1}, La/boo0;-><init>(Ljava/lang/String;La/fyl;La/pno0;)V

    .line 134
    .line 135
    .line 136
    return-object p0
.end method

.method public static final z(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/ctf0;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    if-lez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p3, v1

    .line 22
    :goto_0
    if-eqz p3, :cond_1

    .line 23
    .line 24
    const-string v0, "("

    .line 25
    .line 26
    const-string v1, ")"

    .line 27
    .line 28
    invoke-static {v0, p3, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :cond_1
    if-nez v1, :cond_2

    .line 33
    .line 34
    const-string v1, ""

    .line 35
    .line 36
    :cond_2
    invoke-static {}, La/cy7;->c()Z

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    const-string v0, " "

    .line 41
    .line 42
    if-eqz p3, :cond_3

    .line 43
    .line 44
    invoke-static {v1, v0, p2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    goto :goto_1

    .line 49
    :cond_3
    invoke-static {p2, v0, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    :goto_1
    invoke-static {}, La/xkb;->P()Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    const/4 v0, 0x1

    .line 58
    const/4 v1, 0x0

    .line 59
    if-eqz p3, :cond_4

    .line 60
    .line 61
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    :cond_5
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_6

    .line 77
    .line 78
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, La/yxg;

    .line 83
    .line 84
    iget-wide v2, v2, La/yxg;->b:J

    .line 85
    .line 86
    cmp-long v2, v2, p0

    .line 87
    .line 88
    if-nez v2, :cond_5

    .line 89
    .line 90
    move v1, v0

    .line 91
    :cond_6
    :goto_2
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_7

    .line 96
    .line 97
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-lez p0, :cond_7

    .line 102
    .line 103
    return-object p4

    .line 104
    :cond_7
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-lez p0, :cond_9

    .line 109
    .line 110
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-lez p0, :cond_9

    .line 115
    .line 116
    invoke-static {}, La/cy7;->c()Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    const-string p1, ", "

    .line 121
    .line 122
    if-eqz p0, :cond_8

    .line 123
    .line 124
    invoke-static {p4, p1, p2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0

    .line 129
    :cond_8
    invoke-static {p4, p1, p2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0

    .line 134
    :cond_9
    if-eqz v1, :cond_a

    .line 135
    .line 136
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    iget-object p1, p5, La/ctf0;->b:La/lsm0;

    .line 141
    .line 142
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    const p2, 0x7f130939

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, p2, p0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0

    .line 154
    :cond_a
    return-object p2
.end method
