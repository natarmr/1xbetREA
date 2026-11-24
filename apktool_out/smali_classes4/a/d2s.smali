.class public final synthetic La/d2s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/d2s;->a:B

    iput-object p1, p0, La/d2s;->b:Ljava/lang/Object;

    iput-object p2, p0, La/d2s;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/d2s;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/d2s;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/xcz;

    .line 8
    .line 9
    check-cast p1, La/b53;

    .line 10
    .line 11
    check-cast p2, La/i1l0;

    .line 12
    .line 13
    move-object v5, p3

    .line 14
    check-cast v5, La/fet;

    .line 15
    .line 16
    check-cast p4, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    and-int/lit8 p1, p3, 0x30

    .line 29
    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v5, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    const/16 p1, 0x20

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/16 p1, 0x10

    .line 42
    .line 43
    :goto_0
    or-int/2addr p3, p1

    .line 44
    :cond_1
    and-int/lit16 p1, p3, 0x91

    .line 45
    .line 46
    const/16 p4, 0x90

    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    if-eq p1, p4, :cond_2

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_2
    move p1, v8

    .line 54
    :goto_1
    and-int/lit8 p4, p3, 0x1

    .line 55
    .line 56
    invoke-virtual {v5, p4, p1}, La/fet;->U(IZ)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_9

    .line 61
    .line 62
    instance-of p1, p2, La/h1l0;

    .line 63
    .line 64
    const/4 p4, 0x6

    .line 65
    sget-object v1, La/jm40;->b:La/jm40;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    const p0, 0x13270a0a

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, p0}, La/fet;->e0(I)V

    .line 74
    .line 75
    .line 76
    sget-object p0, La/gqw0;->e:La/zx7;

    .line 77
    .line 78
    const/4 p1, 0x2

    .line 79
    invoke-static {v1, p0, p1}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0, v2, v5, p4, p1}, La/kpb;->j(La/mm40;La/dkm;La/fet;II)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    instance-of p1, p2, La/g1l0;

    .line 91
    .line 92
    const/4 v3, 0x3

    .line 93
    if-eqz p1, :cond_6

    .line 94
    .line 95
    const p0, 0x51bcc72f

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, p0}, La/fet;->e0(I)V

    .line 99
    .line 100
    .line 101
    invoke-static {v1, v2, v3}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    sget-object p1, La/gqw0;->n:La/xx7;

    .line 106
    .line 107
    new-instance p3, La/wkw;

    .line 108
    .line 109
    invoke-direct {p3, p1}, La/wkw;-><init>(La/xx7;)V

    .line 110
    .line 111
    .line 112
    invoke-interface {p0, p3}, La/mm40;->e(La/mm40;)La/mm40;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast p2, La/g1l0;

    .line 117
    .line 118
    iget-object v2, p2, La/g1l0;->b:La/mdm;

    .line 119
    .line 120
    invoke-virtual {v5, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-nez p0, :cond_4

    .line 129
    .line 130
    sget-object p0, La/ukd;->a:La/cl5;

    .line 131
    .line 132
    if-ne p1, p0, :cond_5

    .line 133
    .line 134
    :cond_4
    new-instance p1, La/uck0;

    .line 135
    .line 136
    invoke-direct {p1, v0, p4}, La/uck0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v5, p1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_5
    move-object v4, p1

    .line 143
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 144
    .line 145
    const/4 v6, 0x0

    .line 146
    const/4 v7, 0x4

    .line 147
    const/4 v3, 0x0

    .line 148
    invoke-static/range {v1 .. v7}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 152
    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_6
    instance-of p1, p2, La/d1l0;

    .line 156
    .line 157
    if-eqz p1, :cond_7

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_7
    instance-of p1, p2, La/e1l0;

    .line 161
    .line 162
    if-eqz p1, :cond_8

    .line 163
    .line 164
    :goto_2
    const p1, 0x1327633a

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5, p1}, La/fet;->e0(I)V

    .line 168
    .line 169
    .line 170
    check-cast p2, La/f1l0;

    .line 171
    .line 172
    shr-int/lit8 p1, p3, 0x3

    .line 173
    .line 174
    and-int/lit8 p1, p1, 0xe

    .line 175
    .line 176
    invoke-static {p2, p0, v0, v5, p1}, La/o2e;->n(La/f1l0;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_8
    const p0, 0x132704d4

    .line 184
    .line 185
    .line 186
    invoke-static {p0, v5, v8}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    throw p0

    .line 191
    :cond_9
    invoke-virtual {v5}, La/fet;->X()V

    .line 192
    .line 193
    .line 194
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 195
    .line 196
    return-object p0
.end method

.method private final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/d2s;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/lnp0;

    .line 6
    .line 7
    iget-object v0, v0, La/d2s;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    check-cast v2, La/rk80;

    .line 14
    .line 15
    move-object/from16 v3, p2

    .line 16
    .line 17
    check-cast v3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    move-object/from16 v13, p3

    .line 24
    .line 25
    check-cast v13, La/fet;

    .line 26
    .line 27
    move-object/from16 v4, p4

    .line 28
    .line 29
    check-cast v4, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    and-int/lit8 v2, v4, 0x30

    .line 39
    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {v13, v3}, La/fet;->e(I)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    const/16 v2, 0x20

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    const/16 v2, 0x10

    .line 52
    .line 53
    :goto_0
    or-int/2addr v4, v2

    .line 54
    :cond_1
    and-int/lit16 v2, v4, 0x91

    .line 55
    .line 56
    const/16 v5, 0x90

    .line 57
    .line 58
    const/4 v6, 0x1

    .line 59
    if-eq v2, v5, :cond_2

    .line 60
    .line 61
    move v2, v6

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const/4 v2, 0x0

    .line 64
    :goto_1
    and-int/2addr v4, v6

    .line 65
    invoke-virtual {v13, v4, v2}, La/fet;->U(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_5

    .line 70
    .line 71
    iget-object v1, v1, La/lnp0;->e:La/a4x;

    .line 72
    .line 73
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, La/a4x;

    .line 78
    .line 79
    sget-object v2, La/jm40;->b:La/jm40;

    .line 80
    .line 81
    const/high16 v4, 0x3f800000    # 1.0f

    .line 82
    .line 83
    invoke-static {v2, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v5, v0

    .line 92
    check-cast v5, La/xcz;

    .line 93
    .line 94
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-nez v0, :cond_3

    .line 103
    .line 104
    sget-object v0, La/ukd;->a:La/cl5;

    .line 105
    .line 106
    if-ne v2, v0, :cond_4

    .line 107
    .line 108
    :cond_3
    new-instance v2, La/oea;

    .line 109
    .line 110
    const/16 v0, 0x1c

    .line 111
    .line 112
    invoke-direct {v2, v1, v0}, La/oea;-><init>(La/a4x;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v13, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    move-object v12, v2

    .line 119
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 120
    .line 121
    const/4 v14, 0x6

    .line 122
    const/16 v15, 0x1fc

    .line 123
    .line 124
    const/4 v6, 0x0

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    const/4 v9, 0x0

    .line 128
    const/4 v10, 0x0

    .line 129
    const/4 v11, 0x0

    .line 130
    invoke-static/range {v4 .. v15}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_5
    invoke-virtual {v13}, La/fet;->X()V

    .line 135
    .line 136
    .line 137
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object v0
.end method

.method private final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/d2s;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/air0;

    .line 4
    .line 5
    iget-object p0, p0, La/d2s;->c:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v4, p0

    .line 8
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    move-object v1, p1

    .line 11
    check-cast v1, La/mm40;

    .line 12
    .line 13
    move-object v2, p2

    .line 14
    check-cast v2, La/xcz;

    .line 15
    .line 16
    move-object v5, p3

    .line 17
    check-cast v5, La/fet;

    .line 18
    .line 19
    check-cast p4, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    and-int/lit8 p1, p0, 0x6

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    const/4 p1, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 p1, 0x2

    .line 44
    :goto_0
    or-int/2addr p1, p0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move p1, p0

    .line 47
    :goto_1
    and-int/lit8 p0, p0, 0x30

    .line 48
    .line 49
    if-nez p0, :cond_3

    .line 50
    .line 51
    invoke-virtual {v5, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    const/16 p0, 0x20

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/16 p0, 0x10

    .line 61
    .line 62
    :goto_2
    or-int/2addr p1, p0

    .line 63
    :cond_3
    and-int/lit16 p0, p1, 0x93

    .line 64
    .line 65
    const/16 p2, 0x92

    .line 66
    .line 67
    if-eq p0, p2, :cond_4

    .line 68
    .line 69
    const/4 p0, 0x1

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const/4 p0, 0x0

    .line 72
    :goto_3
    and-int/lit8 p2, p1, 0x1

    .line 73
    .line 74
    invoke-virtual {v5, p2, p0}, La/fet;->U(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    iget-object v3, v0, La/air0;->d:La/iur0;

    .line 81
    .line 82
    and-int/lit8 v6, p1, 0x7e

    .line 83
    .line 84
    invoke-static/range {v1 .. v6}, La/hew0;->w(La/mm40;La/xcz;La/iur0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 85
    .line 86
    .line 87
    goto :goto_4

    .line 88
    :cond_5
    invoke-virtual {v5}, La/fet;->X()V

    .line 89
    .line 90
    .line 91
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0
.end method

.method private final g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, La/d2s;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v3, v0

    .line 4
    check-cast v3, La/l7m0;

    .line 5
    .line 6
    iget-object p0, p0, La/d2s;->c:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v6, p0

    .line 9
    check-cast v6, La/njr0;

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    check-cast v1, La/mm40;

    .line 13
    .line 14
    move-object/from16 v2, p2

    .line 15
    .line 16
    check-cast v2, La/xcz;

    .line 17
    .line 18
    move-object/from16 p0, p3

    .line 19
    .line 20
    check-cast p0, La/fet;

    .line 21
    .line 22
    move-object/from16 v0, p4

    .line 23
    .line 24
    check-cast v0, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    and-int/lit8 v4, v0, 0x6

    .line 37
    .line 38
    if-nez v4, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    const/4 v4, 0x4

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const/4 v4, 0x2

    .line 49
    :goto_0
    or-int/2addr v4, v0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move v4, v0

    .line 52
    :goto_1
    and-int/lit8 v0, v0, 0x30

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    const/16 v0, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    const/16 v0, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v4, v0

    .line 68
    :cond_3
    move v0, v4

    .line 69
    and-int/lit16 v4, v0, 0x93

    .line 70
    .line 71
    const/16 v5, 0x92

    .line 72
    .line 73
    if-eq v4, v5, :cond_4

    .line 74
    .line 75
    const/4 v4, 0x1

    .line 76
    goto :goto_3

    .line 77
    :cond_4
    const/4 v4, 0x0

    .line 78
    :goto_3
    and-int/lit8 v5, v0, 0x1

    .line 79
    .line 80
    invoke-virtual {p0, v5, v4}, La/fet;->U(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_9

    .line 85
    .line 86
    invoke-virtual {p0, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-virtual {p0}, La/fet;->P()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    sget-object v12, La/ukd;->a:La/cl5;

    .line 95
    .line 96
    if-nez v4, :cond_5

    .line 97
    .line 98
    if-ne v5, v12, :cond_6

    .line 99
    .line 100
    :cond_5
    new-instance v4, La/fup0;

    .line 101
    .line 102
    const/4 v10, 0x0

    .line 103
    const/16 v11, 0xc

    .line 104
    .line 105
    const/4 v5, 0x2

    .line 106
    const-class v7, La/njr0;

    .line 107
    .line 108
    const-string v8, "updateOutcome"

    .line 109
    .line 110
    const-string v9, "updateOutcome(ILorg/xplatform/toto_bet/active_tirage/domain/model/OutComesModel;)V"

    .line 111
    .line 112
    invoke-direct/range {v4 .. v11}, La/fup0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-object v5, v4

    .line 119
    :cond_6
    check-cast v5, La/jhy;

    .line 120
    .line 121
    move-object v13, v5

    .line 122
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 123
    .line 124
    invoke-virtual {p0, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    invoke-virtual {p0}, La/fet;->P()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    if-nez v4, :cond_7

    .line 133
    .line 134
    if-ne v5, v12, :cond_8

    .line 135
    .line 136
    :cond_7
    new-instance v4, La/fup0;

    .line 137
    .line 138
    const/4 v10, 0x0

    .line 139
    const/16 v11, 0xd

    .line 140
    .line 141
    const/4 v5, 0x2

    .line 142
    const-class v7, La/njr0;

    .line 143
    .line 144
    const-string v8, "navigateToTotoBetAccurateOutcomesScreen"

    .line 145
    .line 146
    const-string v9, "navigateToTotoBetAccurateOutcomesScreen(IJ)V"

    .line 147
    .line 148
    invoke-direct/range {v4 .. v11}, La/fup0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    move-object v5, v4

    .line 155
    :cond_8
    check-cast v5, La/jhy;

    .line 156
    .line 157
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 158
    .line 159
    and-int/lit8 v4, v0, 0xe

    .line 160
    .line 161
    or-int/lit16 v4, v4, 0x180

    .line 162
    .line 163
    and-int/lit8 v0, v0, 0x70

    .line 164
    .line 165
    or-int v7, v4, v0

    .line 166
    .line 167
    move-object v6, p0

    .line 168
    move-object v4, v13

    .line 169
    invoke-static/range {v1 .. v7}, La/nia0;->Q(La/mm40;La/xcz;La/l7m0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 170
    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_9
    move-object v6, p0

    .line 174
    invoke-virtual {v6}, La/fet;->X()V

    .line 175
    .line 176
    .line 177
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object p0
.end method

.method private final h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/d2s;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v3, v0

    .line 4
    check-cast v3, La/l7m0;

    .line 5
    .line 6
    iget-object p0, p0, La/d2s;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/k3t0;

    .line 9
    .line 10
    check-cast p1, La/mm40;

    .line 11
    .line 12
    move-object v2, p2

    .line 13
    check-cast v2, La/xcz;

    .line 14
    .line 15
    move-object v7, p3

    .line 16
    check-cast v7, La/fet;

    .line 17
    .line 18
    check-cast p4, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    and-int/lit8 p3, p2, 0x6

    .line 31
    .line 32
    if-nez p3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v7, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    if-eqz p3, :cond_0

    .line 39
    .line 40
    const/4 p3, 0x4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p3, 0x2

    .line 43
    :goto_0
    or-int/2addr p3, p2

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move p3, p2

    .line 46
    :goto_1
    and-int/lit8 p2, p2, 0x30

    .line 47
    .line 48
    const/16 p4, 0x10

    .line 49
    .line 50
    if-nez p2, :cond_3

    .line 51
    .line 52
    invoke-virtual {v7, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    const/16 p2, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    move p2, p4

    .line 62
    :goto_2
    or-int/2addr p3, p2

    .line 63
    :cond_3
    and-int/lit16 p2, p3, 0x93

    .line 64
    .line 65
    const/16 v0, 0x92

    .line 66
    .line 67
    if-eq p2, v0, :cond_4

    .line 68
    .line 69
    const/4 p2, 0x1

    .line 70
    goto :goto_3

    .line 71
    :cond_4
    const/4 p2, 0x0

    .line 72
    :goto_3
    and-int/lit8 v0, p3, 0x1

    .line 73
    .line 74
    invoke-virtual {v7, v0, p2}, La/fet;->U(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    if-eqz p2, :cond_b

    .line 79
    .line 80
    invoke-static {p1}, La/o050;->S(La/mm40;)La/mm40;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v7, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    sget-object v0, La/ukd;->a:La/cl5;

    .line 93
    .line 94
    if-nez p1, :cond_5

    .line 95
    .line 96
    if-ne p2, v0, :cond_6

    .line 97
    .line 98
    :cond_5
    new-instance p2, La/ebh;

    .line 99
    .line 100
    invoke-direct {p2, p0, p4}, La/ebh;-><init>(La/k3t0;B)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_6
    move-object v4, p2

    .line 107
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 108
    .line 109
    invoke-virtual {v7, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    if-nez p1, :cond_7

    .line 118
    .line 119
    if-ne p2, v0, :cond_8

    .line 120
    .line 121
    :cond_7
    new-instance p2, La/ebh;

    .line 122
    .line 123
    const/16 p1, 0x11

    .line 124
    .line 125
    invoke-direct {p2, p0, p1}, La/ebh;-><init>(La/k3t0;B)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_8
    move-object v5, p2

    .line 132
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 133
    .line 134
    invoke-virtual {v7, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    if-nez p1, :cond_9

    .line 143
    .line 144
    if-ne p2, v0, :cond_a

    .line 145
    .line 146
    :cond_9
    new-instance p2, La/gcn0;

    .line 147
    .line 148
    const/16 p1, 0xf

    .line 149
    .line 150
    invoke-direct {p2, p0, p1}, La/gcn0;-><init>(Ljava/lang/Object;B)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    :cond_a
    move-object v6, p2

    .line 157
    check-cast v6, La/xdr;

    .line 158
    .line 159
    and-int/lit8 p0, p3, 0x70

    .line 160
    .line 161
    or-int/lit16 v8, p0, 0x180

    .line 162
    .line 163
    invoke-static/range {v1 .. v8}, La/x4d0;->W(La/mm40;La/xcz;La/l7m0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/xdr;La/fet;I)V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_b
    invoke-virtual {v7}, La/fet;->X()V

    .line 168
    .line 169
    .line 170
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object p0
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/d2s;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v5, 0x4

    .line 8
    const/high16 v6, 0x3f800000    # 1.0f

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    sget-object v8, La/ukd;->a:La/cl5;

    .line 12
    .line 13
    sget-object v9, La/jm40;->b:La/jm40;

    .line 14
    .line 15
    const/4 v10, 0x6

    .line 16
    const/16 v11, 0x90

    .line 17
    .line 18
    const/16 v14, 0x30

    .line 19
    .line 20
    const/4 v15, 0x0

    .line 21
    const/4 v12, 0x1

    .line 22
    iget-object v13, v0, La/d2s;->c:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v4, v0, La/d2s;->b:Ljava/lang/Object;

    .line 25
    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    check-cast v4, Ljava/util/List;

    .line 30
    .line 31
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    move-object/from16 v0, p1

    .line 34
    .line 35
    check-cast v0, La/g9z;

    .line 36
    .line 37
    move-object/from16 v1, p2

    .line 38
    .line 39
    check-cast v1, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    move-object/from16 v2, p3

    .line 46
    .line 47
    check-cast v2, La/fet;

    .line 48
    .line 49
    move-object/from16 v3, p4

    .line 50
    .line 51
    check-cast v3, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    and-int/lit8 v0, v3, 0x30

    .line 61
    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    const/16 v16, 0x20

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    const/16 v16, 0x10

    .line 74
    .line 75
    :goto_0
    or-int v3, v3, v16

    .line 76
    .line 77
    :cond_1
    and-int/lit16 v0, v3, 0x91

    .line 78
    .line 79
    if-eq v0, v11, :cond_2

    .line 80
    .line 81
    move v0, v12

    .line 82
    goto :goto_1

    .line 83
    :cond_2
    move v0, v15

    .line 84
    :goto_1
    and-int/2addr v3, v12

    .line 85
    invoke-virtual {v2, v3, v0}, La/fet;->U(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, La/p6t0;

    .line 96
    .line 97
    instance-of v1, v0, La/pnu0;

    .line 98
    .line 99
    if-eqz v1, :cond_3

    .line 100
    .line 101
    const v1, 0x1af80c79

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 105
    .line 106
    .line 107
    check-cast v0, La/pnu0;

    .line 108
    .line 109
    invoke-static {v0, v13, v2, v15}, La/uc9;->Q(La/pnu0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 113
    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    const v0, 0x440aa929

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    invoke-virtual {v2}, La/fet;->X()V

    .line 127
    .line 128
    .line 129
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :pswitch_0
    invoke-direct/range {p0 .. p4}, La/d2s;->h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    return-object v0

    .line 137
    :pswitch_1
    invoke-direct/range {p0 .. p4}, La/d2s;->g(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    return-object v0

    .line 142
    :pswitch_2
    invoke-direct/range {p0 .. p4}, La/d2s;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0

    .line 147
    :pswitch_3
    check-cast v4, La/xiu0;

    .line 148
    .line 149
    check-cast v13, La/pdz;

    .line 150
    .line 151
    move-object/from16 v0, p1

    .line 152
    .line 153
    check-cast v0, La/rk80;

    .line 154
    .line 155
    move-object/from16 v1, p2

    .line 156
    .line 157
    check-cast v1, Ljava/lang/Integer;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    move-object/from16 v3, p3

    .line 164
    .line 165
    check-cast v3, La/fet;

    .line 166
    .line 167
    move-object/from16 v6, p4

    .line 168
    .line 169
    check-cast v6, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 172
    .line 173
    .line 174
    move-result v6

    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    and-int/lit8 v0, v6, 0x30

    .line 179
    .line 180
    if-nez v0, :cond_6

    .line 181
    .line 182
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_5

    .line 187
    .line 188
    const/16 v16, 0x20

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_5
    const/16 v16, 0x10

    .line 192
    .line 193
    :goto_3
    or-int v6, v6, v16

    .line 194
    .line 195
    :cond_6
    and-int/lit16 v0, v6, 0x91

    .line 196
    .line 197
    if-eq v0, v11, :cond_7

    .line 198
    .line 199
    move v15, v12

    .line 200
    :cond_7
    and-int/lit8 v0, v6, 0x1

    .line 201
    .line 202
    invoke-virtual {v3, v0, v15}, La/fet;->U(IZ)Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-eqz v0, :cond_8

    .line 207
    .line 208
    invoke-static {v1, v4, v7, v3, v5}, La/t9x;->L(Ljava/lang/Object;La/xiu0;La/i0h0;La/fet;I)La/riu0;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    sget-object v1, La/ms00;->a:La/lqd;

    .line 213
    .line 214
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/d;->a(Ljava/lang/Object;)La/l5d0;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    new-instance v1, La/nb50;

    .line 219
    .line 220
    invoke-direct {v1, v2, v13}, La/nb50;-><init>(ILa/pdz;)V

    .line 221
    .line 222
    .line 223
    const v2, 0x2ef1bbf7

    .line 224
    .line 225
    .line 226
    invoke-static {v2, v1, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-static {v0, v1, v3, v14}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 231
    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_8
    invoke-virtual {v3}, La/fet;->X()V

    .line 235
    .line 236
    .line 237
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_4
    invoke-direct/range {p0 .. p4}, La/d2s;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    return-object v0

    .line 245
    :pswitch_5
    invoke-direct/range {p0 .. p4}, La/d2s;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    return-object v0

    .line 250
    :pswitch_6
    check-cast v4, La/hax;

    .line 251
    .line 252
    iget-object v0, v4, La/hax;->b:La/lmo;

    .line 253
    .line 254
    move-object/from16 v18, v13

    .line 255
    .line 256
    check-cast v18, Lkotlin/jvm/functions/Function1;

    .line 257
    .line 258
    move-object/from16 v1, p1

    .line 259
    .line 260
    check-cast v1, La/y5d;

    .line 261
    .line 262
    move-object/from16 v4, p2

    .line 263
    .line 264
    check-cast v4, La/mm40;

    .line 265
    .line 266
    move-object/from16 v6, p3

    .line 267
    .line 268
    check-cast v6, La/fet;

    .line 269
    .line 270
    move-object/from16 v7, p4

    .line 271
    .line 272
    check-cast v7, Ljava/lang/Integer;

    .line 273
    .line 274
    invoke-static {v7, v1, v4}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    and-int/lit8 v7, v4, 0x6

    .line 279
    .line 280
    if-nez v7, :cond_a

    .line 281
    .line 282
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    if-eqz v7, :cond_9

    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_9
    move v5, v3

    .line 290
    :goto_5
    or-int/2addr v4, v5

    .line 291
    :cond_a
    and-int/lit16 v5, v4, 0x83

    .line 292
    .line 293
    const/16 v7, 0x82

    .line 294
    .line 295
    if-eq v5, v7, :cond_b

    .line 296
    .line 297
    move v5, v12

    .line 298
    goto :goto_6

    .line 299
    :cond_b
    move v5, v15

    .line 300
    :goto_6
    and-int/2addr v4, v12

    .line 301
    invoke-virtual {v6, v4, v5}, La/fet;->U(IZ)Z

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-eqz v4, :cond_d

    .line 306
    .line 307
    if-nez v0, :cond_c

    .line 308
    .line 309
    const v0, -0x28df8110

    .line 310
    .line 311
    .line 312
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v6, v15}, La/fet;->r(Z)V

    .line 316
    .line 317
    .line 318
    goto :goto_7

    .line 319
    :cond_c
    const v4, -0x28df810f

    .line 320
    .line 321
    .line 322
    invoke-virtual {v6, v4}, La/fet;->e0(I)V

    .line 323
    .line 324
    .line 325
    invoke-static {v0, v6}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    sget-object v4, La/gqw0;->n:La/xx7;

    .line 330
    .line 331
    invoke-virtual {v1, v9, v4}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    sget-object v4, La/qmk;->a:La/zcl;

    .line 336
    .line 337
    const/high16 v4, 0x41400000    # 12.0f

    .line 338
    .line 339
    invoke-static {v1, v4, v2, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 340
    .line 341
    .line 342
    move-result-object v7

    .line 343
    const/high16 v11, 0x41400000    # 12.0f

    .line 344
    .line 345
    const/4 v12, 0x7

    .line 346
    const/4 v8, 0x0

    .line 347
    const/4 v9, 0x0

    .line 348
    const/4 v10, 0x0

    .line 349
    invoke-static/range {v7 .. v12}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 350
    .line 351
    .line 352
    move-result-object v16

    .line 353
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    move-object/from16 v17, v0

    .line 358
    .line 359
    check-cast v17, La/lmo;

    .line 360
    .line 361
    const/16 v20, 0x0

    .line 362
    .line 363
    const/16 v21, 0x0

    .line 364
    .line 365
    move-object/from16 v19, v6

    .line 366
    .line 367
    invoke-static/range {v16 .. v21}, La/vdb;->D(La/mm40;La/lmo;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 368
    .line 369
    .line 370
    move-object/from16 v0, v19

    .line 371
    .line 372
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 373
    .line 374
    .line 375
    goto :goto_7

    .line 376
    :cond_d
    move-object v0, v6

    .line 377
    invoke-virtual {v0}, La/fet;->X()V

    .line 378
    .line 379
    .line 380
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 381
    .line 382
    return-object v0

    .line 383
    :pswitch_7
    check-cast v4, La/nkg0;

    .line 384
    .line 385
    check-cast v13, La/hgk0;

    .line 386
    .line 387
    move-object/from16 v0, p1

    .line 388
    .line 389
    check-cast v0, La/b53;

    .line 390
    .line 391
    move-object/from16 v1, p2

    .line 392
    .line 393
    check-cast v1, Ljava/lang/Boolean;

    .line 394
    .line 395
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 396
    .line 397
    .line 398
    move-result v1

    .line 399
    move-object/from16 v2, p3

    .line 400
    .line 401
    check-cast v2, La/fet;

    .line 402
    .line 403
    move-object/from16 v3, p4

    .line 404
    .line 405
    check-cast v3, Ljava/lang/Integer;

    .line 406
    .line 407
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    and-int/lit8 v0, v3, 0x30

    .line 415
    .line 416
    if-nez v0, :cond_f

    .line 417
    .line 418
    invoke-virtual {v2, v1}, La/fet;->h(Z)Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    if-eqz v0, :cond_e

    .line 423
    .line 424
    const/16 v16, 0x20

    .line 425
    .line 426
    goto :goto_8

    .line 427
    :cond_e
    const/16 v16, 0x10

    .line 428
    .line 429
    :goto_8
    or-int v3, v3, v16

    .line 430
    .line 431
    :cond_f
    and-int/lit16 v0, v3, 0x91

    .line 432
    .line 433
    if-eq v0, v11, :cond_10

    .line 434
    .line 435
    move v0, v12

    .line 436
    goto :goto_9

    .line 437
    :cond_10
    move v0, v15

    .line 438
    :goto_9
    and-int/2addr v3, v12

    .line 439
    invoke-virtual {v2, v3, v0}, La/fet;->U(IZ)Z

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    if-eqz v0, :cond_12

    .line 444
    .line 445
    if-eqz v1, :cond_11

    .line 446
    .line 447
    const v0, -0x7df09f15

    .line 448
    .line 449
    .line 450
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 451
    .line 452
    .line 453
    invoke-virtual {v13}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    check-cast v0, La/mig0;

    .line 458
    .line 459
    invoke-static {v0, v4, v2, v15}, La/pkg0;->a(La/mig0;La/nkg0;La/fet;I)V

    .line 460
    .line 461
    .line 462
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 463
    .line 464
    .line 465
    goto :goto_a

    .line 466
    :cond_11
    const v0, -0x7deeedee

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v13}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    check-cast v0, La/mig0;

    .line 477
    .line 478
    invoke-static {v0, v4, v2, v15}, La/gfx;->n(La/mig0;La/nkg0;La/fet;I)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 482
    .line 483
    .line 484
    goto :goto_a

    .line 485
    :cond_12
    invoke-virtual {v2}, La/fet;->X()V

    .line 486
    .line 487
    .line 488
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 489
    .line 490
    return-object v0

    .line 491
    :pswitch_8
    check-cast v4, La/zw80;

    .line 492
    .line 493
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 494
    .line 495
    move-object/from16 v0, p1

    .line 496
    .line 497
    check-cast v0, La/g9z;

    .line 498
    .line 499
    move-object/from16 v1, p2

    .line 500
    .line 501
    check-cast v1, Ljava/lang/Integer;

    .line 502
    .line 503
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 504
    .line 505
    .line 506
    move-result v1

    .line 507
    move-object/from16 v2, p3

    .line 508
    .line 509
    check-cast v2, La/fet;

    .line 510
    .line 511
    move-object/from16 v3, p4

    .line 512
    .line 513
    check-cast v3, Ljava/lang/Integer;

    .line 514
    .line 515
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 516
    .line 517
    .line 518
    move-result v3

    .line 519
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    and-int/lit8 v0, v3, 0x30

    .line 523
    .line 524
    if-nez v0, :cond_14

    .line 525
    .line 526
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 527
    .line 528
    .line 529
    move-result v0

    .line 530
    if-eqz v0, :cond_13

    .line 531
    .line 532
    const/16 v16, 0x20

    .line 533
    .line 534
    goto :goto_b

    .line 535
    :cond_13
    const/16 v16, 0x10

    .line 536
    .line 537
    :goto_b
    or-int v3, v3, v16

    .line 538
    .line 539
    :cond_14
    and-int/lit16 v0, v3, 0x91

    .line 540
    .line 541
    if-eq v0, v11, :cond_15

    .line 542
    .line 543
    move v15, v12

    .line 544
    :cond_15
    and-int/lit8 v0, v3, 0x1

    .line 545
    .line 546
    invoke-virtual {v2, v0, v15}, La/fet;->U(IZ)Z

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-eqz v0, :cond_18

    .line 551
    .line 552
    move-object v0, v4

    .line 553
    check-cast v0, La/xw80;

    .line 554
    .line 555
    iget-object v0, v0, La/xw80;->c:La/a4x;

    .line 556
    .line 557
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    check-cast v0, La/vw80;

    .line 562
    .line 563
    invoke-virtual {v2, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    invoke-virtual {v2, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v3

    .line 571
    or-int/2addr v1, v3

    .line 572
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    if-nez v1, :cond_16

    .line 577
    .line 578
    if-ne v3, v8, :cond_17

    .line 579
    .line 580
    :cond_16
    new-instance v3, La/ww80;

    .line 581
    .line 582
    invoke-direct {v3, v13, v4}, La/ww80;-><init>(Lkotlin/jvm/functions/Function2;La/zw80;)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 586
    .line 587
    .line 588
    :cond_17
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 589
    .line 590
    invoke-static {v9, v0, v3, v2, v10}, La/k9x;->l(La/mm40;La/vw80;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 591
    .line 592
    .line 593
    goto :goto_c

    .line 594
    :cond_18
    invoke-virtual {v2}, La/fet;->X()V

    .line 595
    .line 596
    .line 597
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 598
    .line 599
    return-object v0

    .line 600
    :pswitch_9
    check-cast v4, La/hdz;

    .line 601
    .line 602
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 603
    .line 604
    move-object/from16 v0, p1

    .line 605
    .line 606
    check-cast v0, La/g9z;

    .line 607
    .line 608
    move-object/from16 v1, p2

    .line 609
    .line 610
    check-cast v1, Ljava/lang/Integer;

    .line 611
    .line 612
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 613
    .line 614
    .line 615
    move-result v1

    .line 616
    move-object/from16 v3, p3

    .line 617
    .line 618
    check-cast v3, La/fet;

    .line 619
    .line 620
    move-object/from16 v5, p4

    .line 621
    .line 622
    check-cast v5, Ljava/lang/Integer;

    .line 623
    .line 624
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 625
    .line 626
    .line 627
    move-result v5

    .line 628
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    and-int/lit8 v0, v5, 0x30

    .line 632
    .line 633
    if-nez v0, :cond_1a

    .line 634
    .line 635
    invoke-virtual {v3, v1}, La/fet;->e(I)Z

    .line 636
    .line 637
    .line 638
    move-result v0

    .line 639
    if-eqz v0, :cond_19

    .line 640
    .line 641
    const/16 v16, 0x20

    .line 642
    .line 643
    goto :goto_d

    .line 644
    :cond_19
    const/16 v16, 0x10

    .line 645
    .line 646
    :goto_d
    or-int v5, v5, v16

    .line 647
    .line 648
    :cond_1a
    and-int/lit16 v0, v5, 0x91

    .line 649
    .line 650
    if-eq v0, v11, :cond_1b

    .line 651
    .line 652
    move v0, v12

    .line 653
    goto :goto_e

    .line 654
    :cond_1b
    move v0, v15

    .line 655
    :goto_e
    and-int/2addr v5, v12

    .line 656
    invoke-virtual {v3, v5, v0}, La/fet;->U(IZ)Z

    .line 657
    .line 658
    .line 659
    move-result v0

    .line 660
    if-eqz v0, :cond_24

    .line 661
    .line 662
    invoke-virtual {v4, v1}, La/hdz;->b(I)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v0

    .line 666
    check-cast v0, La/vk5;

    .line 667
    .line 668
    instance-of v5, v0, La/aes0;

    .line 669
    .line 670
    if-eqz v5, :cond_1c

    .line 671
    .line 672
    const v1, -0x2718192e

    .line 673
    .line 674
    .line 675
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 676
    .line 677
    .line 678
    check-cast v0, La/aes0;

    .line 679
    .line 680
    iget-object v0, v0, La/aes0;->a:Ljava/lang/String;

    .line 681
    .line 682
    invoke-static {v0, v3, v15}, La/ofm0;->g(Ljava/lang/String;La/fet;I)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 686
    .line 687
    .line 688
    goto/16 :goto_10

    .line 689
    .line 690
    :cond_1c
    instance-of v5, v0, La/ogs0;

    .line 691
    .line 692
    if-eqz v5, :cond_1d

    .line 693
    .line 694
    const v2, 0x44168651

    .line 695
    .line 696
    .line 697
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 698
    .line 699
    .line 700
    add-int/lit8 v2, v1, -0x1

    .line 701
    .line 702
    :try_start_0
    invoke-virtual {v4, v2}, La/hdz;->b(I)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v2

    .line 706
    instance-of v2, v2, La/ogs0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 707
    .line 708
    xor-int/2addr v2, v12

    .line 709
    move/from16 v20, v2

    .line 710
    .line 711
    goto :goto_f

    .line 712
    :catch_0
    move/from16 v20, v12

    .line 713
    .line 714
    :goto_f
    add-int/2addr v1, v12

    .line 715
    :try_start_1
    invoke-virtual {v4, v1}, La/hdz;->b(I)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    instance-of v1, v1, La/ogs0;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 720
    .line 721
    xor-int/2addr v12, v1

    .line 722
    :catch_1
    move/from16 v21, v12

    .line 723
    .line 724
    move-object/from16 v19, v0

    .line 725
    .line 726
    check-cast v19, La/ogs0;

    .line 727
    .line 728
    const/16 v23, 0x0

    .line 729
    .line 730
    const/16 v18, 0x0

    .line 731
    .line 732
    move-object/from16 v22, v3

    .line 733
    .line 734
    invoke-static/range {v18 .. v23}, La/vds0;->a(La/mm40;La/ogs0;ZZLa/fet;I)V

    .line 735
    .line 736
    .line 737
    move-object/from16 v1, v22

    .line 738
    .line 739
    invoke-virtual {v1, v15}, La/fet;->r(Z)V

    .line 740
    .line 741
    .line 742
    goto/16 :goto_10

    .line 743
    .line 744
    :cond_1d
    move-object v1, v3

    .line 745
    sget-object v3, La/ues0;->a:La/ues0;

    .line 746
    .line 747
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    move-result v3

    .line 751
    if-eqz v3, :cond_1e

    .line 752
    .line 753
    const v0, -0x2717b6f6

    .line 754
    .line 755
    .line 756
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 757
    .line 758
    .line 759
    invoke-static {v2, v1, v15, v12}, La/egm0;->c(FLa/fet;II)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v1, v15}, La/fet;->r(Z)V

    .line 763
    .line 764
    .line 765
    goto/16 :goto_10

    .line 766
    .line 767
    :cond_1e
    sget-object v3, La/gxn;->a:La/gxn;

    .line 768
    .line 769
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 770
    .line 771
    .line 772
    move-result v3

    .line 773
    if-eqz v3, :cond_22

    .line 774
    .line 775
    const v0, 0x44232421

    .line 776
    .line 777
    .line 778
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 779
    .line 780
    .line 781
    invoke-static {v9, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 782
    .line 783
    .line 784
    move-result-object v0

    .line 785
    sget-object v3, La/qmk;->a:La/zcl;

    .line 786
    .line 787
    const/high16 v3, 0x41c00000    # 24.0f

    .line 788
    .line 789
    invoke-static {v0, v2, v3, v12}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 790
    .line 791
    .line 792
    move-result-object v19

    .line 793
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v0

    .line 797
    if-ne v0, v8, :cond_1f

    .line 798
    .line 799
    new-instance v0, La/r580;

    .line 800
    .line 801
    const/16 v2, 0x12

    .line 802
    .line 803
    invoke-direct {v0, v2}, La/r580;-><init>(B)V

    .line 804
    .line 805
    .line 806
    invoke-virtual {v1, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 807
    .line 808
    .line 809
    :cond_1f
    move-object/from16 v18, v0

    .line 810
    .line 811
    check-cast v18, Lkotlin/jvm/functions/Function1;

    .line 812
    .line 813
    invoke-virtual {v1, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    move-result v0

    .line 817
    invoke-virtual {v1, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    move-result v2

    .line 821
    or-int/2addr v0, v2

    .line 822
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    if-nez v0, :cond_20

    .line 827
    .line 828
    if-ne v2, v8, :cond_21

    .line 829
    .line 830
    :cond_20
    new-instance v2, La/dbr;

    .line 831
    .line 832
    invoke-direct {v2, v13, v4, v12}, La/dbr;-><init>(Lkotlin/jvm/functions/Function1;La/hdz;B)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 836
    .line 837
    .line 838
    :cond_21
    move-object/from16 v20, v2

    .line 839
    .line 840
    check-cast v20, Lkotlin/jvm/functions/Function1;

    .line 841
    .line 842
    const/16 v22, 0x6

    .line 843
    .line 844
    const/16 v23, 0x0

    .line 845
    .line 846
    move-object/from16 v21, v1

    .line 847
    .line 848
    invoke-static/range {v18 .. v23}, La/dwi0;->b(Lkotlin/jvm/functions/Function1;La/mm40;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v1, v15}, La/fet;->r(Z)V

    .line 852
    .line 853
    .line 854
    goto :goto_10

    .line 855
    :cond_22
    if-nez v0, :cond_23

    .line 856
    .line 857
    const v0, -0x27170b0d

    .line 858
    .line 859
    .line 860
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v1, v15}, La/fet;->r(Z)V

    .line 864
    .line 865
    .line 866
    goto :goto_10

    .line 867
    :cond_23
    const v0, -0x2717066d

    .line 868
    .line 869
    .line 870
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 871
    .line 872
    .line 873
    invoke-virtual {v1, v15}, La/fet;->r(Z)V

    .line 874
    .line 875
    .line 876
    goto :goto_10

    .line 877
    :cond_24
    move-object v1, v3

    .line 878
    invoke-virtual {v1}, La/fet;->X()V

    .line 879
    .line 880
    .line 881
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 882
    .line 883
    return-object v0

    .line 884
    :pswitch_a
    check-cast v4, La/w170;

    .line 885
    .line 886
    check-cast v13, La/fqj0;

    .line 887
    .line 888
    move-object/from16 v0, p1

    .line 889
    .line 890
    check-cast v0, La/g9z;

    .line 891
    .line 892
    move-object/from16 v1, p2

    .line 893
    .line 894
    check-cast v1, Ljava/lang/Integer;

    .line 895
    .line 896
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 897
    .line 898
    .line 899
    move-result v1

    .line 900
    move-object/from16 v2, p3

    .line 901
    .line 902
    check-cast v2, La/fet;

    .line 903
    .line 904
    move-object/from16 v3, p4

    .line 905
    .line 906
    check-cast v3, Ljava/lang/Integer;

    .line 907
    .line 908
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 909
    .line 910
    .line 911
    move-result v3

    .line 912
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    and-int/lit8 v0, v3, 0x30

    .line 916
    .line 917
    if-nez v0, :cond_26

    .line 918
    .line 919
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 920
    .line 921
    .line 922
    move-result v0

    .line 923
    if-eqz v0, :cond_25

    .line 924
    .line 925
    const/16 v16, 0x20

    .line 926
    .line 927
    goto :goto_11

    .line 928
    :cond_25
    const/16 v16, 0x10

    .line 929
    .line 930
    :goto_11
    or-int v3, v3, v16

    .line 931
    .line 932
    :cond_26
    and-int/lit16 v0, v3, 0x91

    .line 933
    .line 934
    if-eq v0, v11, :cond_27

    .line 935
    .line 936
    move v0, v12

    .line 937
    goto :goto_12

    .line 938
    :cond_27
    move v0, v15

    .line 939
    :goto_12
    and-int/2addr v3, v12

    .line 940
    invoke-virtual {v2, v3, v0}, La/fet;->U(IZ)Z

    .line 941
    .line 942
    .line 943
    move-result v0

    .line 944
    if-eqz v0, :cond_29

    .line 945
    .line 946
    iget-object v0, v4, La/w170;->a:Ljava/util/List;

    .line 947
    .line 948
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    check-cast v0, La/a270;

    .line 953
    .line 954
    if-nez v0, :cond_28

    .line 955
    .line 956
    const v0, 0x5fee01f5

    .line 957
    .line 958
    .line 959
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 960
    .line 961
    .line 962
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 963
    .line 964
    .line 965
    goto :goto_13

    .line 966
    :cond_28
    const v1, 0x5fee01f6

    .line 967
    .line 968
    .line 969
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 970
    .line 971
    .line 972
    invoke-static {v9, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 973
    .line 974
    .line 975
    move-result-object v1

    .line 976
    invoke-static {v1, v13, v0, v2, v10}, La/bsr0;->E(La/mm40;La/fqj0;La/a270;La/fet;I)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 980
    .line 981
    .line 982
    goto :goto_13

    .line 983
    :cond_29
    invoke-virtual {v2}, La/fet;->X()V

    .line 984
    .line 985
    .line 986
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 987
    .line 988
    return-object v0

    .line 989
    :pswitch_b
    check-cast v4, La/u170;

    .line 990
    .line 991
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 992
    .line 993
    move-object/from16 v0, p1

    .line 994
    .line 995
    check-cast v0, La/g9z;

    .line 996
    .line 997
    move-object/from16 v1, p2

    .line 998
    .line 999
    check-cast v1, Ljava/lang/Integer;

    .line 1000
    .line 1001
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1002
    .line 1003
    .line 1004
    move-result v1

    .line 1005
    move-object/from16 v2, p3

    .line 1006
    .line 1007
    check-cast v2, La/fet;

    .line 1008
    .line 1009
    move-object/from16 v3, p4

    .line 1010
    .line 1011
    check-cast v3, Ljava/lang/Integer;

    .line 1012
    .line 1013
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1014
    .line 1015
    .line 1016
    move-result v3

    .line 1017
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1018
    .line 1019
    .line 1020
    and-int/lit8 v0, v3, 0x30

    .line 1021
    .line 1022
    if-nez v0, :cond_2b

    .line 1023
    .line 1024
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1025
    .line 1026
    .line 1027
    move-result v0

    .line 1028
    if-eqz v0, :cond_2a

    .line 1029
    .line 1030
    const/16 v16, 0x20

    .line 1031
    .line 1032
    goto :goto_14

    .line 1033
    :cond_2a
    const/16 v16, 0x10

    .line 1034
    .line 1035
    :goto_14
    or-int v3, v3, v16

    .line 1036
    .line 1037
    :cond_2b
    and-int/lit16 v0, v3, 0x91

    .line 1038
    .line 1039
    if-eq v0, v11, :cond_2c

    .line 1040
    .line 1041
    move v0, v12

    .line 1042
    goto :goto_15

    .line 1043
    :cond_2c
    move v0, v15

    .line 1044
    :goto_15
    and-int/2addr v3, v12

    .line 1045
    invoke-virtual {v2, v3, v0}, La/fet;->U(IZ)Z

    .line 1046
    .line 1047
    .line 1048
    move-result v0

    .line 1049
    if-eqz v0, :cond_33

    .line 1050
    .line 1051
    iget-object v0, v4, La/u170;->a:Ljava/util/ArrayList;

    .line 1052
    .line 1053
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v0

    .line 1057
    check-cast v0, La/r170;

    .line 1058
    .line 1059
    if-nez v0, :cond_2d

    .line 1060
    .line 1061
    const v0, -0x131e5f84

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 1068
    .line 1069
    .line 1070
    goto/16 :goto_17

    .line 1071
    .line 1072
    :cond_2d
    const v1, -0x131e5f83

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 1076
    .line 1077
    .line 1078
    iget v1, v0, La/r170;->a:I

    .line 1079
    .line 1080
    sget-object v3, La/d270;->b:La/evz;

    .line 1081
    .line 1082
    const/4 v3, 0x3

    .line 1083
    if-ne v1, v3, :cond_30

    .line 1084
    .line 1085
    const v1, 0x7583965b

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 1089
    .line 1090
    .line 1091
    invoke-static {v9, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    invoke-static {v1, v7, v15, v3}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v1

    .line 1099
    invoke-virtual {v2, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1100
    .line 1101
    .line 1102
    move-result v3

    .line 1103
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v4

    .line 1107
    or-int/2addr v3, v4

    .line 1108
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v4

    .line 1112
    if-nez v3, :cond_2e

    .line 1113
    .line 1114
    if-ne v4, v8, :cond_2f

    .line 1115
    .line 1116
    :cond_2e
    new-instance v4, La/t170;

    .line 1117
    .line 1118
    invoke-direct {v4, v13, v0, v15}, La/t170;-><init>(Lkotlin/jvm/functions/Function1;La/r170;B)V

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1122
    .line 1123
    .line 1124
    :cond_2f
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 1125
    .line 1126
    invoke-static {v1, v0, v4, v2, v10}, La/bsr0;->C(La/mm40;La/r170;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 1130
    .line 1131
    .line 1132
    move-object v0, v2

    .line 1133
    goto :goto_16

    .line 1134
    :cond_30
    const v1, 0x758c5849

    .line 1135
    .line 1136
    .line 1137
    invoke-virtual {v2, v1}, La/fet;->e0(I)V

    .line 1138
    .line 1139
    .line 1140
    invoke-static {v9, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v1

    .line 1144
    const/4 v3, 0x3

    .line 1145
    invoke-static {v1, v7, v15, v3}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v19

    .line 1149
    iget-object v1, v0, La/r170;->b:La/gy30;

    .line 1150
    .line 1151
    invoke-virtual {v2, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1152
    .line 1153
    .line 1154
    move-result v3

    .line 1155
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1156
    .line 1157
    .line 1158
    move-result v4

    .line 1159
    or-int/2addr v3, v4

    .line 1160
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v4

    .line 1164
    if-nez v3, :cond_31

    .line 1165
    .line 1166
    if-ne v4, v8, :cond_32

    .line 1167
    .line 1168
    :cond_31
    new-instance v4, La/t170;

    .line 1169
    .line 1170
    invoke-direct {v4, v13, v0, v12}, La/t170;-><init>(Lkotlin/jvm/functions/Function1;La/r170;B)V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1174
    .line 1175
    .line 1176
    :cond_32
    move-object/from16 v21, v4

    .line 1177
    .line 1178
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 1179
    .line 1180
    const/16 v25, 0x6

    .line 1181
    .line 1182
    const/16 v26, 0x18

    .line 1183
    .line 1184
    const/16 v22, 0x0

    .line 1185
    .line 1186
    const/16 v23, 0x0

    .line 1187
    .line 1188
    move-object/from16 v20, v1

    .line 1189
    .line 1190
    move-object/from16 v24, v2

    .line 1191
    .line 1192
    invoke-static/range {v19 .. v26}, La/jiq0;->y(La/mm40;La/gy30;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1193
    .line 1194
    .line 1195
    move-object/from16 v0, v24

    .line 1196
    .line 1197
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 1198
    .line 1199
    .line 1200
    :goto_16
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 1201
    .line 1202
    .line 1203
    goto :goto_17

    .line 1204
    :cond_33
    move-object v0, v2

    .line 1205
    invoke-virtual {v0}, La/fet;->X()V

    .line 1206
    .line 1207
    .line 1208
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1209
    .line 1210
    return-object v0

    .line 1211
    :pswitch_c
    move-object v1, v4

    .line 1212
    check-cast v1, La/kw50;

    .line 1213
    .line 1214
    check-cast v13, La/kr5;

    .line 1215
    .line 1216
    move-object/from16 v4, p1

    .line 1217
    .line 1218
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 1219
    .line 1220
    move-object/from16 v2, p2

    .line 1221
    .line 1222
    check-cast v2, La/mm40;

    .line 1223
    .line 1224
    move-object/from16 v5, p3

    .line 1225
    .line 1226
    check-cast v5, La/fet;

    .line 1227
    .line 1228
    move-object/from16 v0, p4

    .line 1229
    .line 1230
    check-cast v0, Ljava/lang/Integer;

    .line 1231
    .line 1232
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1233
    .line 1234
    .line 1235
    move-result v0

    .line 1236
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1237
    .line 1238
    .line 1239
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1240
    .line 1241
    .line 1242
    iget-object v3, v13, La/kr5;->d:Ljava/lang/String;

    .line 1243
    .line 1244
    shr-int/lit8 v6, v0, 0x3

    .line 1245
    .line 1246
    and-int/lit8 v6, v6, 0xe

    .line 1247
    .line 1248
    shl-int/2addr v0, v10

    .line 1249
    and-int/lit16 v0, v0, 0x380

    .line 1250
    .line 1251
    or-int/2addr v6, v0

    .line 1252
    invoke-virtual/range {v1 .. v6}, La/kw50;->M(La/mm40;Ljava/lang/String;Landroidx/fragment/app/Fragment;La/fet;I)V

    .line 1253
    .line 1254
    .line 1255
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1256
    .line 1257
    return-object v0

    .line 1258
    :pswitch_d
    move-object v1, v4

    .line 1259
    check-cast v1, La/wu50;

    .line 1260
    .line 1261
    move-object v3, v13

    .line 1262
    check-cast v3, La/kr5;

    .line 1263
    .line 1264
    move-object/from16 v4, p1

    .line 1265
    .line 1266
    check-cast v4, Landroidx/fragment/app/Fragment;

    .line 1267
    .line 1268
    move-object/from16 v2, p2

    .line 1269
    .line 1270
    check-cast v2, La/mm40;

    .line 1271
    .line 1272
    move-object/from16 v5, p3

    .line 1273
    .line 1274
    check-cast v5, La/fet;

    .line 1275
    .line 1276
    move-object/from16 v0, p4

    .line 1277
    .line 1278
    check-cast v0, Ljava/lang/Integer;

    .line 1279
    .line 1280
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1281
    .line 1282
    .line 1283
    move-result v0

    .line 1284
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1288
    .line 1289
    .line 1290
    shr-int/lit8 v6, v0, 0x3

    .line 1291
    .line 1292
    and-int/lit8 v6, v6, 0xe

    .line 1293
    .line 1294
    shl-int/2addr v0, v10

    .line 1295
    and-int/lit16 v0, v0, 0x380

    .line 1296
    .line 1297
    or-int/2addr v6, v0

    .line 1298
    invoke-virtual/range {v1 .. v6}, La/wu50;->M(La/mm40;La/kr5;Landroidx/fragment/app/Fragment;La/fet;I)V

    .line 1299
    .line 1300
    .line 1301
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1302
    .line 1303
    return-object v0

    .line 1304
    :pswitch_e
    check-cast v4, La/ru50;

    .line 1305
    .line 1306
    check-cast v13, Landroidx/fragment/app/Fragment;

    .line 1307
    .line 1308
    move-object/from16 v0, p1

    .line 1309
    .line 1310
    check-cast v0, La/rk80;

    .line 1311
    .line 1312
    move-object/from16 v1, p2

    .line 1313
    .line 1314
    check-cast v1, Ljava/lang/Integer;

    .line 1315
    .line 1316
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1317
    .line 1318
    .line 1319
    move-result v1

    .line 1320
    move-object/from16 v2, p3

    .line 1321
    .line 1322
    check-cast v2, La/fet;

    .line 1323
    .line 1324
    move-object/from16 v3, p4

    .line 1325
    .line 1326
    check-cast v3, Ljava/lang/Integer;

    .line 1327
    .line 1328
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1329
    .line 1330
    .line 1331
    move-result v3

    .line 1332
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1333
    .line 1334
    .line 1335
    and-int/lit8 v0, v3, 0x30

    .line 1336
    .line 1337
    if-nez v0, :cond_35

    .line 1338
    .line 1339
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1340
    .line 1341
    .line 1342
    move-result v0

    .line 1343
    if-eqz v0, :cond_34

    .line 1344
    .line 1345
    const/16 v16, 0x20

    .line 1346
    .line 1347
    goto :goto_18

    .line 1348
    :cond_34
    const/16 v16, 0x10

    .line 1349
    .line 1350
    :goto_18
    or-int v3, v3, v16

    .line 1351
    .line 1352
    :cond_35
    and-int/lit16 v0, v3, 0x91

    .line 1353
    .line 1354
    if-eq v0, v11, :cond_36

    .line 1355
    .line 1356
    move v15, v12

    .line 1357
    :cond_36
    and-int/lit8 v0, v3, 0x1

    .line 1358
    .line 1359
    invoke-virtual {v2, v0, v15}, La/fet;->U(IZ)Z

    .line 1360
    .line 1361
    .line 1362
    move-result v0

    .line 1363
    if-eqz v0, :cond_37

    .line 1364
    .line 1365
    iget-object v0, v4, La/ru50;->b:Ljava/util/List;

    .line 1366
    .line 1367
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v0

    .line 1371
    check-cast v0, La/bhg0;

    .line 1372
    .line 1373
    iget-object v0, v0, La/bhg0;->a:La/ugd;

    .line 1374
    .line 1375
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v1

    .line 1379
    invoke-virtual {v0, v13, v9, v2, v1}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1380
    .line 1381
    .line 1382
    goto :goto_19

    .line 1383
    :cond_37
    invoke-virtual {v2}, La/fet;->X()V

    .line 1384
    .line 1385
    .line 1386
    :goto_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1387
    .line 1388
    return-object v0

    .line 1389
    :pswitch_f
    check-cast v4, La/gax;

    .line 1390
    .line 1391
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1392
    .line 1393
    move-object/from16 v0, p1

    .line 1394
    .line 1395
    check-cast v0, La/y5d;

    .line 1396
    .line 1397
    move-object/from16 v1, p2

    .line 1398
    .line 1399
    check-cast v1, La/mm40;

    .line 1400
    .line 1401
    move-object/from16 v2, p3

    .line 1402
    .line 1403
    check-cast v2, La/fet;

    .line 1404
    .line 1405
    move-object/from16 v3, p4

    .line 1406
    .line 1407
    check-cast v3, Ljava/lang/Integer;

    .line 1408
    .line 1409
    invoke-static {v3, v0, v1}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 1410
    .line 1411
    .line 1412
    move-result v0

    .line 1413
    and-int/lit8 v3, v0, 0x30

    .line 1414
    .line 1415
    if-nez v3, :cond_39

    .line 1416
    .line 1417
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v3

    .line 1421
    if-eqz v3, :cond_38

    .line 1422
    .line 1423
    const/16 v16, 0x20

    .line 1424
    .line 1425
    goto :goto_1a

    .line 1426
    :cond_38
    const/16 v16, 0x10

    .line 1427
    .line 1428
    :goto_1a
    or-int v0, v0, v16

    .line 1429
    .line 1430
    :cond_39
    and-int/lit16 v3, v0, 0x91

    .line 1431
    .line 1432
    if-eq v3, v11, :cond_3a

    .line 1433
    .line 1434
    move v15, v12

    .line 1435
    :cond_3a
    and-int/lit8 v3, v0, 0x1

    .line 1436
    .line 1437
    invoke-virtual {v2, v3, v15}, La/fet;->U(IZ)Z

    .line 1438
    .line 1439
    .line 1440
    move-result v3

    .line 1441
    if-eqz v3, :cond_3b

    .line 1442
    .line 1443
    iget-object v3, v4, La/gax;->a:La/sf30;

    .line 1444
    .line 1445
    const/16 v18, 0x3

    .line 1446
    .line 1447
    shr-int/lit8 v0, v0, 0x3

    .line 1448
    .line 1449
    and-int/lit8 v0, v0, 0xe

    .line 1450
    .line 1451
    invoke-static {v1, v3, v13, v2, v0}, La/j0x;->g(La/mm40;La/sf30;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1452
    .line 1453
    .line 1454
    goto :goto_1b

    .line 1455
    :cond_3b
    invoke-virtual {v2}, La/fet;->X()V

    .line 1456
    .line 1457
    .line 1458
    :goto_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1459
    .line 1460
    return-object v0

    .line 1461
    :pswitch_10
    check-cast v4, Ljava/util/Map;

    .line 1462
    .line 1463
    check-cast v13, La/qd30;

    .line 1464
    .line 1465
    move-object/from16 v0, p1

    .line 1466
    .line 1467
    check-cast v0, La/rk80;

    .line 1468
    .line 1469
    move-object/from16 v1, p2

    .line 1470
    .line 1471
    check-cast v1, Ljava/lang/Integer;

    .line 1472
    .line 1473
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1474
    .line 1475
    .line 1476
    move-result v2

    .line 1477
    move-object/from16 v3, p3

    .line 1478
    .line 1479
    check-cast v3, La/fet;

    .line 1480
    .line 1481
    move-object/from16 v5, p4

    .line 1482
    .line 1483
    check-cast v5, Ljava/lang/Integer;

    .line 1484
    .line 1485
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1486
    .line 1487
    .line 1488
    move-result v5

    .line 1489
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1490
    .line 1491
    .line 1492
    and-int/lit8 v0, v5, 0x30

    .line 1493
    .line 1494
    if-nez v0, :cond_3d

    .line 1495
    .line 1496
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 1497
    .line 1498
    .line 1499
    move-result v0

    .line 1500
    if-eqz v0, :cond_3c

    .line 1501
    .line 1502
    const/16 v16, 0x20

    .line 1503
    .line 1504
    goto :goto_1c

    .line 1505
    :cond_3c
    const/16 v16, 0x10

    .line 1506
    .line 1507
    :goto_1c
    or-int v5, v5, v16

    .line 1508
    .line 1509
    :cond_3d
    and-int/lit16 v0, v5, 0x91

    .line 1510
    .line 1511
    if-eq v0, v11, :cond_3e

    .line 1512
    .line 1513
    move v0, v12

    .line 1514
    goto :goto_1d

    .line 1515
    :cond_3e
    move v0, v15

    .line 1516
    :goto_1d
    and-int/lit8 v6, v5, 0x1

    .line 1517
    .line 1518
    invoke-virtual {v3, v6, v0}, La/fet;->U(IZ)Z

    .line 1519
    .line 1520
    .line 1521
    move-result v0

    .line 1522
    if-eqz v0, :cond_44

    .line 1523
    .line 1524
    const v0, 0x2a67bc75

    .line 1525
    .line 1526
    .line 1527
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 1528
    .line 1529
    .line 1530
    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    if-nez v0, :cond_40

    .line 1535
    .line 1536
    new-array v0, v15, [Ljava/lang/Object;

    .line 1537
    .line 1538
    sget-object v6, La/xcz;->y:La/v0h0;

    .line 1539
    .line 1540
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v7

    .line 1544
    if-ne v7, v8, :cond_3f

    .line 1545
    .line 1546
    new-instance v7, La/n230;

    .line 1547
    .line 1548
    const/16 v9, 0xd

    .line 1549
    .line 1550
    invoke-direct {v7, v9}, La/n230;-><init>(B)V

    .line 1551
    .line 1552
    .line 1553
    invoke-virtual {v3, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1554
    .line 1555
    .line 1556
    :cond_3f
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 1557
    .line 1558
    const/16 v9, 0x180

    .line 1559
    .line 1560
    invoke-static {v0, v6, v7, v3, v9}, La/e9x;->R([Ljava/lang/Object;La/u0h0;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v0

    .line 1564
    check-cast v0, La/xcz;

    .line 1565
    .line 1566
    invoke-interface {v4, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1567
    .line 1568
    .line 1569
    :cond_40
    move-object/from16 v19, v0

    .line 1570
    .line 1571
    check-cast v19, La/xcz;

    .line 1572
    .line 1573
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v3, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1577
    .line 1578
    .line 1579
    move-result v0

    .line 1580
    and-int/lit8 v1, v5, 0x70

    .line 1581
    .line 1582
    const/16 v4, 0x20

    .line 1583
    .line 1584
    if-ne v1, v4, :cond_41

    .line 1585
    .line 1586
    move v15, v12

    .line 1587
    :cond_41
    or-int/2addr v0, v15

    .line 1588
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 1589
    .line 1590
    .line 1591
    move-result-object v1

    .line 1592
    if-nez v0, :cond_42

    .line 1593
    .line 1594
    if-ne v1, v8, :cond_43

    .line 1595
    .line 1596
    :cond_42
    new-instance v1, La/z08;

    .line 1597
    .line 1598
    const/16 v0, 0xb

    .line 1599
    .line 1600
    invoke-direct {v1, v13, v2, v0}, La/z08;-><init>(Ljava/lang/Object;IB)V

    .line 1601
    .line 1602
    .line 1603
    invoke-virtual {v3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1604
    .line 1605
    .line 1606
    :cond_43
    move-object/from16 v26, v1

    .line 1607
    .line 1608
    check-cast v26, Lkotlin/jvm/functions/Function1;

    .line 1609
    .line 1610
    const/16 v28, 0x0

    .line 1611
    .line 1612
    const/16 v29, 0x1fd

    .line 1613
    .line 1614
    const/16 v18, 0x0

    .line 1615
    .line 1616
    const/16 v20, 0x0

    .line 1617
    .line 1618
    const/16 v21, 0x0

    .line 1619
    .line 1620
    const/16 v22, 0x0

    .line 1621
    .line 1622
    const/16 v23, 0x0

    .line 1623
    .line 1624
    const/16 v24, 0x0

    .line 1625
    .line 1626
    const/16 v25, 0x0

    .line 1627
    .line 1628
    move-object/from16 v27, v3

    .line 1629
    .line 1630
    invoke-static/range {v18 .. v29}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1631
    .line 1632
    .line 1633
    goto :goto_1e

    .line 1634
    :cond_44
    move-object/from16 v27, v3

    .line 1635
    .line 1636
    invoke-virtual/range {v27 .. v27}, La/fet;->X()V

    .line 1637
    .line 1638
    .line 1639
    :goto_1e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1640
    .line 1641
    return-object v0

    .line 1642
    :pswitch_11
    check-cast v4, La/ugd;

    .line 1643
    .line 1644
    check-cast v13, La/tr10;

    .line 1645
    .line 1646
    move-object/from16 v0, p1

    .line 1647
    .line 1648
    check-cast v0, La/rk80;

    .line 1649
    .line 1650
    move-object/from16 v1, p2

    .line 1651
    .line 1652
    check-cast v1, Ljava/lang/Integer;

    .line 1653
    .line 1654
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1655
    .line 1656
    .line 1657
    move-result v1

    .line 1658
    move-object/from16 v2, p3

    .line 1659
    .line 1660
    check-cast v2, La/fet;

    .line 1661
    .line 1662
    move-object/from16 v3, p4

    .line 1663
    .line 1664
    check-cast v3, Ljava/lang/Integer;

    .line 1665
    .line 1666
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1667
    .line 1668
    .line 1669
    move-result v3

    .line 1670
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1671
    .line 1672
    .line 1673
    and-int/lit8 v0, v3, 0x30

    .line 1674
    .line 1675
    if-nez v0, :cond_46

    .line 1676
    .line 1677
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1678
    .line 1679
    .line 1680
    move-result v0

    .line 1681
    if-eqz v0, :cond_45

    .line 1682
    .line 1683
    const/16 v16, 0x20

    .line 1684
    .line 1685
    goto :goto_1f

    .line 1686
    :cond_45
    const/16 v16, 0x10

    .line 1687
    .line 1688
    :goto_1f
    or-int v3, v3, v16

    .line 1689
    .line 1690
    :cond_46
    and-int/lit16 v0, v3, 0x91

    .line 1691
    .line 1692
    if-eq v0, v11, :cond_47

    .line 1693
    .line 1694
    move v0, v12

    .line 1695
    goto :goto_20

    .line 1696
    :cond_47
    move v0, v15

    .line 1697
    :goto_20
    and-int/2addr v3, v12

    .line 1698
    invoke-virtual {v2, v3, v0}, La/fet;->U(IZ)Z

    .line 1699
    .line 1700
    .line 1701
    move-result v0

    .line 1702
    if-eqz v0, :cond_4b

    .line 1703
    .line 1704
    sget-object v0, La/sr10;->d:La/c0o;

    .line 1705
    .line 1706
    invoke-virtual {v0}, La/b3;->iterator()Ljava/util/Iterator;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    :cond_48
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1711
    .line 1712
    .line 1713
    move-result v3

    .line 1714
    if-eqz v3, :cond_49

    .line 1715
    .line 1716
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v3

    .line 1720
    move-object v5, v3

    .line 1721
    check-cast v5, La/sr10;

    .line 1722
    .line 1723
    iget-boolean v5, v5, La/sr10;->a:Z

    .line 1724
    .line 1725
    if-ne v5, v1, :cond_48

    .line 1726
    .line 1727
    move-object v7, v3

    .line 1728
    :cond_49
    check-cast v7, La/sr10;

    .line 1729
    .line 1730
    if-nez v7, :cond_4a

    .line 1731
    .line 1732
    iget-object v7, v13, La/tr10;->c:La/sr10;

    .line 1733
    .line 1734
    :cond_4a
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v0

    .line 1738
    sget-object v1, La/y5d;->a:La/y5d;

    .line 1739
    .line 1740
    invoke-virtual {v4, v1, v7, v2, v0}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1741
    .line 1742
    .line 1743
    goto :goto_21

    .line 1744
    :cond_4b
    invoke-virtual {v2}, La/fet;->X()V

    .line 1745
    .line 1746
    .line 1747
    :goto_21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1748
    .line 1749
    return-object v0

    .line 1750
    :pswitch_12
    check-cast v4, La/l7m0;

    .line 1751
    .line 1752
    check-cast v13, La/xk80;

    .line 1753
    .line 1754
    move-object/from16 v0, p1

    .line 1755
    .line 1756
    check-cast v0, La/rk80;

    .line 1757
    .line 1758
    move-object/from16 v1, p2

    .line 1759
    .line 1760
    check-cast v1, Ljava/lang/Integer;

    .line 1761
    .line 1762
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1763
    .line 1764
    .line 1765
    move-result v1

    .line 1766
    move-object/from16 v2, p3

    .line 1767
    .line 1768
    check-cast v2, La/fet;

    .line 1769
    .line 1770
    move-object/from16 v3, p4

    .line 1771
    .line 1772
    check-cast v3, Ljava/lang/Integer;

    .line 1773
    .line 1774
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1775
    .line 1776
    .line 1777
    move-result v3

    .line 1778
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1779
    .line 1780
    .line 1781
    and-int/lit8 v0, v3, 0x30

    .line 1782
    .line 1783
    if-nez v0, :cond_4d

    .line 1784
    .line 1785
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 1786
    .line 1787
    .line 1788
    move-result v0

    .line 1789
    if-eqz v0, :cond_4c

    .line 1790
    .line 1791
    const/16 v16, 0x20

    .line 1792
    .line 1793
    goto :goto_22

    .line 1794
    :cond_4c
    const/16 v16, 0x10

    .line 1795
    .line 1796
    :goto_22
    or-int v3, v3, v16

    .line 1797
    .line 1798
    :cond_4d
    and-int/lit16 v0, v3, 0x91

    .line 1799
    .line 1800
    if-eq v0, v11, :cond_4e

    .line 1801
    .line 1802
    move v0, v12

    .line 1803
    goto :goto_23

    .line 1804
    :cond_4e
    move v0, v15

    .line 1805
    :goto_23
    and-int/lit8 v5, v3, 0x1

    .line 1806
    .line 1807
    invoke-virtual {v2, v5, v0}, La/fet;->U(IZ)Z

    .line 1808
    .line 1809
    .line 1810
    move-result v0

    .line 1811
    if-eqz v0, :cond_53

    .line 1812
    .line 1813
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v0

    .line 1817
    check-cast v0, La/mh10;

    .line 1818
    .line 1819
    iget-object v0, v0, La/mh10;->d:La/a4x;

    .line 1820
    .line 1821
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1822
    .line 1823
    .line 1824
    move-result-object v0

    .line 1825
    check-cast v0, La/fg10;

    .line 1826
    .line 1827
    if-nez v0, :cond_4f

    .line 1828
    .line 1829
    const v0, 0x2fb334c5

    .line 1830
    .line 1831
    .line 1832
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 1833
    .line 1834
    .line 1835
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 1836
    .line 1837
    .line 1838
    goto :goto_25

    .line 1839
    :cond_4f
    const v4, 0x2fb334c6

    .line 1840
    .line 1841
    .line 1842
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 1843
    .line 1844
    .line 1845
    invoke-static {v9, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v4

    .line 1849
    invoke-virtual {v2, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1850
    .line 1851
    .line 1852
    move-result v5

    .line 1853
    and-int/lit8 v3, v3, 0x70

    .line 1854
    .line 1855
    const/16 v9, 0x20

    .line 1856
    .line 1857
    if-ne v3, v9, :cond_50

    .line 1858
    .line 1859
    goto :goto_24

    .line 1860
    :cond_50
    move v12, v15

    .line 1861
    :goto_24
    or-int v3, v5, v12

    .line 1862
    .line 1863
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v5

    .line 1867
    if-nez v3, :cond_51

    .line 1868
    .line 1869
    if-ne v5, v8, :cond_52

    .line 1870
    .line 1871
    :cond_51
    new-instance v5, La/yg10;

    .line 1872
    .line 1873
    invoke-direct {v5, v13, v1, v15}, La/yg10;-><init>(La/xk80;IB)V

    .line 1874
    .line 1875
    .line 1876
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1877
    .line 1878
    .line 1879
    :cond_52
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 1880
    .line 1881
    invoke-static {v4, v5}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 1882
    .line 1883
    .line 1884
    move-result-object v1

    .line 1885
    iget-object v0, v0, La/fg10;->a:La/twa;

    .line 1886
    .line 1887
    invoke-static {v1, v0, v2, v15}, La/oja0;->l(La/mm40;La/twa;La/fet;I)V

    .line 1888
    .line 1889
    .line 1890
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 1891
    .line 1892
    .line 1893
    goto :goto_25

    .line 1894
    :cond_53
    invoke-virtual {v2}, La/fet;->X()V

    .line 1895
    .line 1896
    .line 1897
    :goto_25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1898
    .line 1899
    return-object v0

    .line 1900
    :pswitch_13
    const/16 v9, 0x20

    .line 1901
    .line 1902
    check-cast v4, La/l1z;

    .line 1903
    .line 1904
    iget-object v0, v4, La/l1z;->j:La/mdm;

    .line 1905
    .line 1906
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1907
    .line 1908
    move-object/from16 v1, p1

    .line 1909
    .line 1910
    check-cast v1, La/rk80;

    .line 1911
    .line 1912
    move-object/from16 v2, p2

    .line 1913
    .line 1914
    check-cast v2, Ljava/lang/Integer;

    .line 1915
    .line 1916
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1917
    .line 1918
    .line 1919
    move-result v2

    .line 1920
    move-object/from16 v3, p3

    .line 1921
    .line 1922
    check-cast v3, La/fet;

    .line 1923
    .line 1924
    move-object/from16 v5, p4

    .line 1925
    .line 1926
    check-cast v5, Ljava/lang/Integer;

    .line 1927
    .line 1928
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1929
    .line 1930
    .line 1931
    move-result v5

    .line 1932
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1933
    .line 1934
    .line 1935
    and-int/lit8 v1, v5, 0x30

    .line 1936
    .line 1937
    if-nez v1, :cond_55

    .line 1938
    .line 1939
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 1940
    .line 1941
    .line 1942
    move-result v1

    .line 1943
    if-eqz v1, :cond_54

    .line 1944
    .line 1945
    move/from16 v16, v9

    .line 1946
    .line 1947
    goto :goto_26

    .line 1948
    :cond_54
    const/16 v16, 0x10

    .line 1949
    .line 1950
    :goto_26
    or-int v5, v5, v16

    .line 1951
    .line 1952
    :cond_55
    and-int/lit16 v1, v5, 0x91

    .line 1953
    .line 1954
    if-eq v1, v11, :cond_56

    .line 1955
    .line 1956
    move v1, v12

    .line 1957
    goto :goto_27

    .line 1958
    :cond_56
    move v1, v15

    .line 1959
    :goto_27
    and-int/2addr v5, v12

    .line 1960
    invoke-virtual {v3, v5, v1}, La/fet;->U(IZ)Z

    .line 1961
    .line 1962
    .line 1963
    move-result v1

    .line 1964
    if-eqz v1, :cond_58

    .line 1965
    .line 1966
    if-nez v2, :cond_57

    .line 1967
    .line 1968
    const v1, -0x4ff4b9b3

    .line 1969
    .line 1970
    .line 1971
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 1972
    .line 1973
    .line 1974
    iget-object v1, v4, La/l1z;->g:La/a4x;

    .line 1975
    .line 1976
    invoke-static {v0, v1, v13, v3, v15}, La/ntr;->D(La/mdm;La/a4x;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1977
    .line 1978
    .line 1979
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 1980
    .line 1981
    .line 1982
    goto :goto_28

    .line 1983
    :cond_57
    const v1, -0x4ff09b94

    .line 1984
    .line 1985
    .line 1986
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 1987
    .line 1988
    .line 1989
    iget-object v1, v4, La/l1z;->h:La/a4x;

    .line 1990
    .line 1991
    invoke-static {v0, v1, v13, v3, v15}, La/ntr;->D(La/mdm;La/a4x;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1992
    .line 1993
    .line 1994
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 1995
    .line 1996
    .line 1997
    goto :goto_28

    .line 1998
    :cond_58
    invoke-virtual {v3}, La/fet;->X()V

    .line 1999
    .line 2000
    .line 2001
    :goto_28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2002
    .line 2003
    return-object v0

    .line 2004
    :pswitch_14
    check-cast v4, La/f1z;

    .line 2005
    .line 2006
    check-cast v13, La/cgk0;

    .line 2007
    .line 2008
    move-object/from16 v0, p1

    .line 2009
    .line 2010
    check-cast v0, La/g9z;

    .line 2011
    .line 2012
    move-object/from16 v1, p2

    .line 2013
    .line 2014
    check-cast v1, Ljava/lang/Integer;

    .line 2015
    .line 2016
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2017
    .line 2018
    .line 2019
    move-object/from16 v1, p3

    .line 2020
    .line 2021
    check-cast v1, La/fet;

    .line 2022
    .line 2023
    move-object/from16 v2, p4

    .line 2024
    .line 2025
    check-cast v2, Ljava/lang/Integer;

    .line 2026
    .line 2027
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2028
    .line 2029
    .line 2030
    move-result v2

    .line 2031
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2032
    .line 2033
    .line 2034
    and-int/lit16 v0, v2, 0x81

    .line 2035
    .line 2036
    const/16 v3, 0x80

    .line 2037
    .line 2038
    if-eq v0, v3, :cond_59

    .line 2039
    .line 2040
    move v0, v12

    .line 2041
    goto :goto_29

    .line 2042
    :cond_59
    move v0, v15

    .line 2043
    :goto_29
    and-int/2addr v2, v12

    .line 2044
    invoke-virtual {v1, v2, v0}, La/fet;->U(IZ)Z

    .line 2045
    .line 2046
    .line 2047
    move-result v0

    .line 2048
    if-eqz v0, :cond_5b

    .line 2049
    .line 2050
    iget-object v0, v4, La/f1z;->a:Ljava/lang/String;

    .line 2051
    .line 2052
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v2

    .line 2056
    if-ne v2, v8, :cond_5a

    .line 2057
    .line 2058
    new-instance v2, La/nw6;

    .line 2059
    .line 2060
    const/16 v3, 0x1a

    .line 2061
    .line 2062
    invoke-direct {v2, v13, v3}, La/nw6;-><init>(La/cgk0;B)V

    .line 2063
    .line 2064
    .line 2065
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2066
    .line 2067
    .line 2068
    :cond_5a
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 2069
    .line 2070
    invoke-static {v9, v2}, La/ro4;->d0(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 2071
    .line 2072
    .line 2073
    move-result-object v3

    .line 2074
    sget-object v2, La/qmk;->a:La/zcl;

    .line 2075
    .line 2076
    const/high16 v7, 0x40000000    # 2.0f

    .line 2077
    .line 2078
    const/4 v8, 0x7

    .line 2079
    const/4 v4, 0x0

    .line 2080
    const/4 v5, 0x0

    .line 2081
    const/4 v6, 0x0

    .line 2082
    invoke-static/range {v3 .. v8}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v2

    .line 2086
    invoke-static {v15, v1, v2, v0}, La/j0x;->d(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 2087
    .line 2088
    .line 2089
    goto :goto_2a

    .line 2090
    :cond_5b
    invoke-virtual {v1}, La/fet;->X()V

    .line 2091
    .line 2092
    .line 2093
    :goto_2a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2094
    .line 2095
    return-object v0

    .line 2096
    :pswitch_15
    const/16 v9, 0x20

    .line 2097
    .line 2098
    check-cast v4, La/fax;

    .line 2099
    .line 2100
    iget-object v0, v4, La/fax;->d:La/lmo;

    .line 2101
    .line 2102
    move-object/from16 v19, v13

    .line 2103
    .line 2104
    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 2105
    .line 2106
    move-object/from16 v1, p1

    .line 2107
    .line 2108
    check-cast v1, La/y5d;

    .line 2109
    .line 2110
    move-object/from16 v2, p2

    .line 2111
    .line 2112
    check-cast v2, La/mm40;

    .line 2113
    .line 2114
    move-object/from16 v4, p3

    .line 2115
    .line 2116
    check-cast v4, La/fet;

    .line 2117
    .line 2118
    move-object/from16 v8, p4

    .line 2119
    .line 2120
    check-cast v8, Ljava/lang/Integer;

    .line 2121
    .line 2122
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 2123
    .line 2124
    .line 2125
    move-result v8

    .line 2126
    sget-object v10, La/gqw0;->n:La/xx7;

    .line 2127
    .line 2128
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2129
    .line 2130
    .line 2131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2132
    .line 2133
    .line 2134
    and-int/lit8 v11, v8, 0x6

    .line 2135
    .line 2136
    if-nez v11, :cond_5d

    .line 2137
    .line 2138
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2139
    .line 2140
    .line 2141
    move-result v11

    .line 2142
    if-eqz v11, :cond_5c

    .line 2143
    .line 2144
    move v3, v5

    .line 2145
    :cond_5c
    or-int/2addr v3, v8

    .line 2146
    goto :goto_2b

    .line 2147
    :cond_5d
    move v3, v8

    .line 2148
    :goto_2b
    and-int/lit8 v5, v8, 0x30

    .line 2149
    .line 2150
    if-nez v5, :cond_5f

    .line 2151
    .line 2152
    invoke-virtual {v4, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2153
    .line 2154
    .line 2155
    move-result v5

    .line 2156
    if-eqz v5, :cond_5e

    .line 2157
    .line 2158
    move/from16 v16, v9

    .line 2159
    .line 2160
    goto :goto_2c

    .line 2161
    :cond_5e
    const/16 v16, 0x10

    .line 2162
    .line 2163
    :goto_2c
    or-int v3, v3, v16

    .line 2164
    .line 2165
    :cond_5f
    and-int/lit16 v5, v3, 0x93

    .line 2166
    .line 2167
    const/16 v8, 0x92

    .line 2168
    .line 2169
    if-eq v5, v8, :cond_60

    .line 2170
    .line 2171
    move v5, v12

    .line 2172
    goto :goto_2d

    .line 2173
    :cond_60
    move v5, v15

    .line 2174
    :goto_2d
    and-int/2addr v3, v12

    .line 2175
    invoke-virtual {v4, v3, v5}, La/fet;->U(IZ)Z

    .line 2176
    .line 2177
    .line 2178
    move-result v3

    .line 2179
    if-eqz v3, :cond_64

    .line 2180
    .line 2181
    if-nez v0, :cond_61

    .line 2182
    .line 2183
    const v0, -0x7ee652e4

    .line 2184
    .line 2185
    .line 2186
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 2187
    .line 2188
    .line 2189
    invoke-virtual {v4, v15}, La/fet;->r(Z)V

    .line 2190
    .line 2191
    .line 2192
    move-object v0, v4

    .line 2193
    goto/16 :goto_2f

    .line 2194
    .line 2195
    :cond_61
    const v3, -0x7ee652e3

    .line 2196
    .line 2197
    .line 2198
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 2199
    .line 2200
    .line 2201
    invoke-static {v0, v4}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 2202
    .line 2203
    .line 2204
    move-result-object v0

    .line 2205
    invoke-virtual {v1, v2, v10}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 2206
    .line 2207
    .line 2208
    move-result-object v20

    .line 2209
    sget-object v3, La/qmk;->a:La/zcl;

    .line 2210
    .line 2211
    const/16 v24, 0x0

    .line 2212
    .line 2213
    const/16 v25, 0xd

    .line 2214
    .line 2215
    const/16 v21, 0x0

    .line 2216
    .line 2217
    const/high16 v22, 0x41000000    # 8.0f

    .line 2218
    .line 2219
    const/16 v23, 0x0

    .line 2220
    .line 2221
    invoke-static/range {v20 .. v25}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v3

    .line 2225
    sget-object v5, La/gqw0;->a:La/zx7;

    .line 2226
    .line 2227
    invoke-static {v5, v15}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v5

    .line 2231
    iget-wide v7, v4, La/fet;->T:J

    .line 2232
    .line 2233
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 2234
    .line 2235
    .line 2236
    move-result v7

    .line 2237
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v8

    .line 2241
    invoke-static {v4, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 2242
    .line 2243
    .line 2244
    move-result-object v3

    .line 2245
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 2246
    .line 2247
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2248
    .line 2249
    .line 2250
    invoke-virtual {v4}, La/fet;->i0()V

    .line 2251
    .line 2252
    .line 2253
    iget-boolean v9, v4, La/fet;->S:Z

    .line 2254
    .line 2255
    if-eqz v9, :cond_62

    .line 2256
    .line 2257
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 2258
    .line 2259
    invoke-virtual {v4, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 2260
    .line 2261
    .line 2262
    goto :goto_2e

    .line 2263
    :cond_62
    invoke-virtual {v4}, La/fet;->r0()V

    .line 2264
    .line 2265
    .line 2266
    :goto_2e
    sget-object v9, La/gqw0;->x:La/shd;

    .line 2267
    .line 2268
    invoke-static {v4, v5, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2269
    .line 2270
    .line 2271
    sget-object v5, La/gqw0;->w:La/shd;

    .line 2272
    .line 2273
    invoke-static {v4, v8, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2274
    .line 2275
    .line 2276
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2277
    .line 2278
    .line 2279
    move-result-object v5

    .line 2280
    sget-object v7, La/gqw0;->y:La/shd;

    .line 2281
    .line 2282
    invoke-static {v4, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2283
    .line 2284
    .line 2285
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 2286
    .line 2287
    .line 2288
    sget-object v5, La/gqw0;->v:La/shd;

    .line 2289
    .line 2290
    invoke-static {v4, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2291
    .line 2292
    .line 2293
    sget-object v3, La/jm40;->b:La/jm40;

    .line 2294
    .line 2295
    invoke-static {v3, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v21

    .line 2299
    const/16 v24, 0x36

    .line 2300
    .line 2301
    const/16 v25, 0x4

    .line 2302
    .line 2303
    sget-object v20, La/zfi0;->a:La/zfi0;

    .line 2304
    .line 2305
    const/16 v22, 0x0

    .line 2306
    .line 2307
    move-object/from16 v23, v4

    .line 2308
    .line 2309
    invoke-static/range {v20 .. v25}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 2310
    .line 2311
    .line 2312
    move-object/from16 v20, v23

    .line 2313
    .line 2314
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2315
    .line 2316
    .line 2317
    move-result-object v0

    .line 2318
    move-object/from16 v18, v0

    .line 2319
    .line 2320
    check-cast v18, La/lmo;

    .line 2321
    .line 2322
    const/16 v21, 0x6

    .line 2323
    .line 2324
    move-object/from16 v17, v3

    .line 2325
    .line 2326
    invoke-static/range {v17 .. v22}, La/vdb;->D(La/mm40;La/lmo;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 2327
    .line 2328
    .line 2329
    move-object/from16 v0, v20

    .line 2330
    .line 2331
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 2332
    .line 2333
    .line 2334
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 2335
    .line 2336
    .line 2337
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2338
    .line 2339
    :goto_2f
    if-nez v7, :cond_63

    .line 2340
    .line 2341
    const v3, -0x7edcfacd

    .line 2342
    .line 2343
    .line 2344
    invoke-virtual {v0, v3}, La/fet;->e0(I)V

    .line 2345
    .line 2346
    .line 2347
    invoke-virtual {v1, v2, v10}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 2348
    .line 2349
    .line 2350
    move-result-object v4

    .line 2351
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2352
    .line 2353
    const/4 v8, 0x0

    .line 2354
    const/16 v9, 0xd

    .line 2355
    .line 2356
    const/4 v5, 0x0

    .line 2357
    const/high16 v6, 0x41000000    # 8.0f

    .line 2358
    .line 2359
    const/4 v7, 0x0

    .line 2360
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 2361
    .line 2362
    .line 2363
    move-result-object v1

    .line 2364
    invoke-static {v15, v0, v1}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 2365
    .line 2366
    .line 2367
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 2368
    .line 2369
    .line 2370
    goto :goto_30

    .line 2371
    :cond_63
    const v1, 0x56bec1f9

    .line 2372
    .line 2373
    .line 2374
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 2375
    .line 2376
    .line 2377
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 2378
    .line 2379
    .line 2380
    goto :goto_30

    .line 2381
    :cond_64
    move-object v0, v4

    .line 2382
    invoke-virtual {v0}, La/fet;->X()V

    .line 2383
    .line 2384
    .line 2385
    :goto_30
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2386
    .line 2387
    return-object v0

    .line 2388
    :pswitch_16
    check-cast v4, La/e1z;

    .line 2389
    .line 2390
    check-cast v13, La/cgk0;

    .line 2391
    .line 2392
    move-object/from16 v0, p1

    .line 2393
    .line 2394
    check-cast v0, La/g9z;

    .line 2395
    .line 2396
    move-object/from16 v1, p2

    .line 2397
    .line 2398
    check-cast v1, Ljava/lang/Integer;

    .line 2399
    .line 2400
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2401
    .line 2402
    .line 2403
    move-object/from16 v1, p3

    .line 2404
    .line 2405
    check-cast v1, La/fet;

    .line 2406
    .line 2407
    move-object/from16 v2, p4

    .line 2408
    .line 2409
    check-cast v2, Ljava/lang/Integer;

    .line 2410
    .line 2411
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2412
    .line 2413
    .line 2414
    move-result v2

    .line 2415
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2416
    .line 2417
    .line 2418
    and-int/lit16 v0, v2, 0x81

    .line 2419
    .line 2420
    const/16 v3, 0x80

    .line 2421
    .line 2422
    if-eq v0, v3, :cond_65

    .line 2423
    .line 2424
    move v15, v12

    .line 2425
    :cond_65
    and-int/lit8 v0, v2, 0x1

    .line 2426
    .line 2427
    invoke-virtual {v1, v0, v15}, La/fet;->U(IZ)Z

    .line 2428
    .line 2429
    .line 2430
    move-result v0

    .line 2431
    if-eqz v0, :cond_67

    .line 2432
    .line 2433
    iget-object v0, v4, La/e1z;->a:Ljava/lang/String;

    .line 2434
    .line 2435
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v2

    .line 2439
    if-ne v2, v8, :cond_66

    .line 2440
    .line 2441
    new-instance v2, La/nw6;

    .line 2442
    .line 2443
    const/16 v3, 0x19

    .line 2444
    .line 2445
    invoke-direct {v2, v13, v3}, La/nw6;-><init>(La/cgk0;B)V

    .line 2446
    .line 2447
    .line 2448
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2449
    .line 2450
    .line 2451
    :cond_66
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 2452
    .line 2453
    invoke-static {v9, v2}, La/ro4;->d0(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v2

    .line 2457
    invoke-static {v10, v1, v2, v0}, La/pzw;->h(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 2458
    .line 2459
    .line 2460
    goto :goto_31

    .line 2461
    :cond_67
    invoke-virtual {v1}, La/fet;->X()V

    .line 2462
    .line 2463
    .line 2464
    :goto_31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2465
    .line 2466
    return-object v0

    .line 2467
    :pswitch_17
    const/16 v9, 0x20

    .line 2468
    .line 2469
    check-cast v4, La/pz40;

    .line 2470
    .line 2471
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 2472
    .line 2473
    move-object/from16 v0, p1

    .line 2474
    .line 2475
    check-cast v0, La/y5d;

    .line 2476
    .line 2477
    move-object/from16 v1, p2

    .line 2478
    .line 2479
    check-cast v1, La/mm40;

    .line 2480
    .line 2481
    move-object/from16 v2, p3

    .line 2482
    .line 2483
    check-cast v2, La/fet;

    .line 2484
    .line 2485
    move-object/from16 v3, p4

    .line 2486
    .line 2487
    check-cast v3, Ljava/lang/Integer;

    .line 2488
    .line 2489
    invoke-static {v3, v0, v1}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 2490
    .line 2491
    .line 2492
    move-result v0

    .line 2493
    and-int/lit8 v3, v0, 0x30

    .line 2494
    .line 2495
    if-nez v3, :cond_69

    .line 2496
    .line 2497
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2498
    .line 2499
    .line 2500
    move-result v3

    .line 2501
    if-eqz v3, :cond_68

    .line 2502
    .line 2503
    move/from16 v16, v9

    .line 2504
    .line 2505
    goto :goto_32

    .line 2506
    :cond_68
    const/16 v16, 0x10

    .line 2507
    .line 2508
    :goto_32
    or-int v0, v0, v16

    .line 2509
    .line 2510
    :cond_69
    and-int/lit16 v3, v0, 0x91

    .line 2511
    .line 2512
    if-eq v3, v11, :cond_6a

    .line 2513
    .line 2514
    move v15, v12

    .line 2515
    :cond_6a
    and-int/2addr v0, v12

    .line 2516
    invoke-virtual {v2, v0, v15}, La/fet;->U(IZ)Z

    .line 2517
    .line 2518
    .line 2519
    move-result v0

    .line 2520
    if-eqz v0, :cond_6b

    .line 2521
    .line 2522
    sget-object v0, La/gzy;->a:La/zfn;

    .line 2523
    .line 2524
    sget-object v3, La/bmd;->n:La/zfn;

    .line 2525
    .line 2526
    invoke-virtual {v2, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2527
    .line 2528
    .line 2529
    move-result-object v3

    .line 2530
    invoke-virtual {v0, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 2531
    .line 2532
    .line 2533
    move-result-object v0

    .line 2534
    new-instance v3, La/ugv;

    .line 2535
    .line 2536
    invoke-direct {v3, v1, v4, v13, v12}, La/ugv;-><init>(La/mm40;La/pz40;Lkotlin/jvm/functions/Function1;B)V

    .line 2537
    .line 2538
    .line 2539
    const v1, -0x5777aa6e

    .line 2540
    .line 2541
    .line 2542
    invoke-static {v1, v3, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 2543
    .line 2544
    .line 2545
    move-result-object v1

    .line 2546
    const/16 v3, 0x38

    .line 2547
    .line 2548
    invoke-static {v0, v1, v2, v3}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 2549
    .line 2550
    .line 2551
    goto :goto_33

    .line 2552
    :cond_6b
    invoke-virtual {v2}, La/fet;->X()V

    .line 2553
    .line 2554
    .line 2555
    :goto_33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2556
    .line 2557
    return-object v0

    .line 2558
    :pswitch_18
    const/16 v9, 0x20

    .line 2559
    .line 2560
    check-cast v4, La/nuv;

    .line 2561
    .line 2562
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 2563
    .line 2564
    move-object/from16 v0, p1

    .line 2565
    .line 2566
    check-cast v0, La/rk80;

    .line 2567
    .line 2568
    move-object/from16 v1, p2

    .line 2569
    .line 2570
    check-cast v1, Ljava/lang/Integer;

    .line 2571
    .line 2572
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 2573
    .line 2574
    .line 2575
    move-result v1

    .line 2576
    move-object/from16 v2, p3

    .line 2577
    .line 2578
    check-cast v2, La/fet;

    .line 2579
    .line 2580
    move-object/from16 v3, p4

    .line 2581
    .line 2582
    check-cast v3, Ljava/lang/Integer;

    .line 2583
    .line 2584
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2585
    .line 2586
    .line 2587
    move-result v3

    .line 2588
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2589
    .line 2590
    .line 2591
    and-int/lit8 v0, v3, 0x30

    .line 2592
    .line 2593
    if-nez v0, :cond_6d

    .line 2594
    .line 2595
    invoke-virtual {v2, v1}, La/fet;->e(I)Z

    .line 2596
    .line 2597
    .line 2598
    move-result v0

    .line 2599
    if-eqz v0, :cond_6c

    .line 2600
    .line 2601
    move/from16 v16, v9

    .line 2602
    .line 2603
    goto :goto_34

    .line 2604
    :cond_6c
    const/16 v16, 0x10

    .line 2605
    .line 2606
    :goto_34
    or-int v3, v3, v16

    .line 2607
    .line 2608
    :cond_6d
    and-int/lit16 v0, v3, 0x91

    .line 2609
    .line 2610
    if-eq v0, v11, :cond_6e

    .line 2611
    .line 2612
    move v0, v12

    .line 2613
    goto :goto_35

    .line 2614
    :cond_6e
    move v0, v15

    .line 2615
    :goto_35
    and-int/2addr v3, v12

    .line 2616
    invoke-virtual {v2, v3, v0}, La/fet;->U(IZ)Z

    .line 2617
    .line 2618
    .line 2619
    move-result v0

    .line 2620
    if-eqz v0, :cond_71

    .line 2621
    .line 2622
    if-eqz v1, :cond_70

    .line 2623
    .line 2624
    if-eq v1, v12, :cond_6f

    .line 2625
    .line 2626
    const v0, 0x4704e960    # 34025.375f

    .line 2627
    .line 2628
    .line 2629
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 2630
    .line 2631
    .line 2632
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 2633
    .line 2634
    .line 2635
    goto :goto_36

    .line 2636
    :cond_6f
    const v0, 0x470144b6

    .line 2637
    .line 2638
    .line 2639
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 2640
    .line 2641
    .line 2642
    iget-object v0, v4, La/nuv;->b:La/a4x;

    .line 2643
    .line 2644
    invoke-interface {v0, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2645
    .line 2646
    .line 2647
    move-result-object v0

    .line 2648
    check-cast v0, La/ztv;

    .line 2649
    .line 2650
    iget-object v1, v4, La/nuv;->c:La/mdm;

    .line 2651
    .line 2652
    invoke-static {v0, v1, v13, v2, v15}, La/hew0;->r(La/ztv;La/mdm;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2653
    .line 2654
    .line 2655
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 2656
    .line 2657
    .line 2658
    goto :goto_36

    .line 2659
    :cond_70
    const v0, 0x46fd60d6

    .line 2660
    .line 2661
    .line 2662
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 2663
    .line 2664
    .line 2665
    iget-object v0, v4, La/nuv;->b:La/a4x;

    .line 2666
    .line 2667
    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2668
    .line 2669
    .line 2670
    move-result-object v0

    .line 2671
    check-cast v0, La/ztv;

    .line 2672
    .line 2673
    iget-object v1, v4, La/nuv;->c:La/mdm;

    .line 2674
    .line 2675
    invoke-static {v0, v1, v13, v2, v15}, La/hew0;->r(La/ztv;La/mdm;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2676
    .line 2677
    .line 2678
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 2679
    .line 2680
    .line 2681
    goto :goto_36

    .line 2682
    :cond_71
    invoke-virtual {v2}, La/fet;->X()V

    .line 2683
    .line 2684
    .line 2685
    :goto_36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2686
    .line 2687
    return-object v0

    .line 2688
    :pswitch_19
    check-cast v4, La/b8t;

    .line 2689
    .line 2690
    check-cast v13, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;

    .line 2691
    .line 2692
    move-object/from16 v0, p1

    .line 2693
    .line 2694
    check-cast v0, Ljava/lang/Integer;

    .line 2695
    .line 2696
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 2697
    .line 2698
    .line 2699
    move-object/from16 v0, p2

    .line 2700
    .line 2701
    check-cast v0, Ljava/lang/Double;

    .line 2702
    .line 2703
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 2704
    .line 2705
    .line 2706
    move-result-wide v8

    .line 2707
    move-object/from16 v0, p3

    .line 2708
    .line 2709
    check-cast v0, Ljava/lang/String;

    .line 2710
    .line 2711
    move-object/from16 v6, p4

    .line 2712
    .line 2713
    check-cast v6, La/i7t;

    .line 2714
    .line 2715
    sget-object v1, La/b8t;->Q1:[La/iiy;

    .line 2716
    .line 2717
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2718
    .line 2719
    .line 2720
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2721
    .line 2722
    .line 2723
    invoke-virtual {v4}, La/b8t;->I0()La/a9t;

    .line 2724
    .line 2725
    .line 2726
    move-result-object v0

    .line 2727
    invoke-virtual {v0}, La/a9t;->y()V

    .line 2728
    .line 2729
    .line 2730
    iget-object v0, v0, La/a9t;->h:La/hyg0;

    .line 2731
    .line 2732
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2733
    .line 2734
    .line 2735
    new-instance v0, La/x7t;

    .line 2736
    .line 2737
    invoke-direct {v0, v4, v15}, La/x7t;-><init>(La/b8t;B)V

    .line 2738
    .line 2739
    .line 2740
    invoke-virtual {v13, v0}, Lorg/xplatform/games_mania/presentation/views/GamesManiaMapView;->setSelectedCellsListener$games_mania(Lkotlin/jvm/functions/Function1;)V

    .line 2741
    .line 2742
    .line 2743
    invoke-virtual {v4}, La/b8t;->I0()La/a9t;

    .line 2744
    .line 2745
    .line 2746
    move-result-object v18

    .line 2747
    invoke-static/range {v18 .. v18}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2748
    .line 2749
    .line 2750
    move-result-object v0

    .line 2751
    new-instance v16, La/h2s;

    .line 2752
    .line 2753
    const/16 v22, 0x0

    .line 2754
    .line 2755
    const/16 v23, 0x1a

    .line 2756
    .line 2757
    const/16 v17, 0x1

    .line 2758
    .line 2759
    const-class v19, La/a9t;

    .line 2760
    .line 2761
    const-string v20, "handleGameError"

    .line 2762
    .line 2763
    const-string v21, "handleGameError(Ljava/lang/Throwable;)V"

    .line 2764
    .line 2765
    invoke-direct/range {v16 .. v23}, La/h2s;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2766
    .line 2767
    .line 2768
    move-object/from16 v7, v18

    .line 2769
    .line 2770
    iget-object v1, v7, La/a9t;->k:La/mne;

    .line 2771
    .line 2772
    iget-object v3, v1, La/mne;->a:La/rwj;

    .line 2773
    .line 2774
    new-instance v4, La/z8t;

    .line 2775
    .line 2776
    const/4 v10, 0x0

    .line 2777
    const/4 v11, 0x0

    .line 2778
    move-object v5, v4

    .line 2779
    invoke-direct/range {v5 .. v11}, La/z8t;-><init>(Ljava/lang/Object;Ljava/lang/Object;DLa/yje;B)V

    .line 2780
    .line 2781
    .line 2782
    const/16 v5, 0xa

    .line 2783
    .line 2784
    const/4 v2, 0x0

    .line 2785
    move-object/from16 v1, v16

    .line 2786
    .line 2787
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2788
    .line 2789
    .line 2790
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2791
    .line 2792
    return-object v0

    .line 2793
    :pswitch_1a
    const/16 v9, 0x20

    .line 2794
    .line 2795
    check-cast v4, La/j2s;

    .line 2796
    .line 2797
    check-cast v13, La/mm40;

    .line 2798
    .line 2799
    move-object/from16 v0, p1

    .line 2800
    .line 2801
    check-cast v0, La/mm40;

    .line 2802
    .line 2803
    move-object/from16 v1, p2

    .line 2804
    .line 2805
    check-cast v1, Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 2806
    .line 2807
    move-object/from16 v6, p3

    .line 2808
    .line 2809
    check-cast v6, La/fet;

    .line 2810
    .line 2811
    move-object/from16 v8, p4

    .line 2812
    .line 2813
    check-cast v8, Ljava/lang/Integer;

    .line 2814
    .line 2815
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 2816
    .line 2817
    .line 2818
    move-result v8

    .line 2819
    sget-object v10, La/j2s;->b2:La/xak;

    .line 2820
    .line 2821
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2822
    .line 2823
    .line 2824
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2825
    .line 2826
    .line 2827
    and-int/lit8 v10, v8, 0x6

    .line 2828
    .line 2829
    if-nez v10, :cond_73

    .line 2830
    .line 2831
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2832
    .line 2833
    .line 2834
    move-result v10

    .line 2835
    if-eqz v10, :cond_72

    .line 2836
    .line 2837
    goto :goto_37

    .line 2838
    :cond_72
    move v5, v3

    .line 2839
    :goto_37
    or-int/2addr v5, v8

    .line 2840
    goto :goto_38

    .line 2841
    :cond_73
    move v5, v8

    .line 2842
    :goto_38
    and-int/2addr v8, v14

    .line 2843
    if-nez v8, :cond_75

    .line 2844
    .line 2845
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2846
    .line 2847
    .line 2848
    move-result v8

    .line 2849
    if-eqz v8, :cond_74

    .line 2850
    .line 2851
    move/from16 v16, v9

    .line 2852
    .line 2853
    goto :goto_39

    .line 2854
    :cond_74
    const/16 v16, 0x10

    .line 2855
    .line 2856
    :goto_39
    or-int v5, v5, v16

    .line 2857
    .line 2858
    :cond_75
    and-int/lit16 v8, v5, 0x93

    .line 2859
    .line 2860
    const/16 v9, 0x92

    .line 2861
    .line 2862
    if-eq v8, v9, :cond_76

    .line 2863
    .line 2864
    move v15, v12

    .line 2865
    :cond_76
    and-int/2addr v5, v12

    .line 2866
    invoke-virtual {v6, v5, v15}, La/fet;->U(IZ)Z

    .line 2867
    .line 2868
    .line 2869
    move-result v5

    .line 2870
    if-eqz v5, :cond_78

    .line 2871
    .line 2872
    sget-object v5, La/qmk;->a:La/zcl;

    .line 2873
    .line 2874
    invoke-static {v6}, La/qmk;->a(La/fet;)La/wfn;

    .line 2875
    .line 2876
    .line 2877
    move-result-object v5

    .line 2878
    iget v5, v5, La/wfn;->d:F

    .line 2879
    .line 2880
    move-object v8, v1

    .line 2881
    iget-object v1, v4, La/j2s;->M1:La/ndf0;

    .line 2882
    .line 2883
    if-eqz v1, :cond_77

    .line 2884
    .line 2885
    sget-object v7, La/zaq0;->b:La/zfn;

    .line 2886
    .line 2887
    invoke-virtual {v6, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2888
    .line 2889
    .line 2890
    move-result-object v7

    .line 2891
    check-cast v7, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2892
    .line 2893
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 2894
    .line 2895
    .line 2896
    move-result-wide v9

    .line 2897
    sget-object v7, La/jd8;->n:La/ljc;

    .line 2898
    .line 2899
    invoke-static {v0, v9, v10, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 2900
    .line 2901
    .line 2902
    move-result-object v0

    .line 2903
    invoke-static {v13, v5, v2, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 2904
    .line 2905
    .line 2906
    move-result-object v3

    .line 2907
    move-object v2, v0

    .line 2908
    move-object v5, v8

    .line 2909
    invoke-virtual/range {v1 .. v6}, La/ndf0;->a(La/mm40;La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/related/api/presentation/RelatedParams;La/fet;)V

    .line 2910
    .line 2911
    .line 2912
    goto :goto_3a

    .line 2913
    :cond_77
    const-string v0, "relatedGamesFactory"

    .line 2914
    .line 2915
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2916
    .line 2917
    .line 2918
    throw v7

    .line 2919
    :cond_78
    invoke-virtual {v6}, La/fet;->X()V

    .line 2920
    .line 2921
    .line 2922
    :goto_3a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2923
    .line 2924
    return-object v0

    .line 2925
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
