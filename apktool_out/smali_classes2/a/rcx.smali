.class public final La/rcx;
.super La/p4;
.source "SourceFile"


# static fields
.field public static final f:Ljava/util/Set;


# instance fields
.field public final c:La/dgu;

.field public d:I

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, La/cy2;->T:La/ar20;

    .line 2
    .line 3
    sget-object v1, La/cy2;->U:La/ar20;

    .line 4
    .line 5
    sget-object v2, La/pfr;->a:La/ar20;

    .line 6
    .line 7
    sget-object v3, La/pfr;->c:La/ar20;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [La/ar20;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/rcx;->f:Ljava/util/Set;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(La/peg0;La/dgu;)V
    .locals 1

    .line 1
    const/16 v0, 0xd

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, La/p4;-><init>(Ljava/lang/Object;B)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, La/rcx;->c:La/dgu;

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, La/rcx;->d:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final n1(La/dgu;Ljava/util/ArrayList;III)V
    .locals 3

    .line 1
    new-instance v0, La/wvq0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p3}, La/wvq0;-><init>(La/dgu;I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    :goto_0
    add-int p3, p1, p4

    .line 8
    .line 9
    invoke-virtual {v0, p3}, La/wvq0;->f(I)La/lvq0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v1, v1, La/lvq0;->a:La/ar20;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p3}, La/wvq0;->f(I)La/lvq0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget v1, v1, La/lvq0;->b:I

    .line 22
    .line 23
    if-eq v1, p5, :cond_0

    .line 24
    .line 25
    move p1, p3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    :goto_1
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, p1}, La/wvq0;->f(I)La/lvq0;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    iget-object p3, p3, La/lvq0;->a:La/ar20;

    .line 34
    .line 35
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p5, p0, La/p4;->b:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p5, La/peg0;

    .line 41
    .line 42
    invoke-virtual {v0, p1}, La/wvq0;->f(I)La/lvq0;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget v1, v1, La/lvq0;->b:I

    .line 47
    .line 48
    add-int/lit8 v2, p1, 0x1

    .line 49
    .line 50
    invoke-virtual {v0, v2}, La/wvq0;->f(I)La/lvq0;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    iget v2, v2, La/lvq0;->b:I

    .line 55
    .line 56
    invoke-virtual {p5, p3, v1, v2}, La/peg0;->h(La/ar20;II)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 61
    .line 62
    .line 63
    sub-int/2addr p1, p4

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    return-void
.end method

.method public final s0(La/fqs0;Ljava/util/List;Z)La/eqs0;
    .locals 11

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, La/fqs0;->c:La/sgi0;

    .line 5
    .line 6
    iget-object v0, p1, La/sgi0;->b:La/ar20;

    .line 7
    .line 8
    iget-object p1, p1, La/sgi0;->a:Lkotlin/ranges/IntRange;

    .line 9
    .line 10
    iget v4, p1, Lkotlin/ranges/a;->a:I

    .line 11
    .line 12
    iget p1, p1, Lkotlin/ranges/a;->b:I

    .line 13
    .line 14
    new-instance v7, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iget-object v6, p0, La/rcx;->c:La/dgu;

    .line 24
    .line 25
    if-eqz p3, :cond_0

    .line 26
    .line 27
    const/4 v5, -0x1

    .line 28
    move-object v2, v6

    .line 29
    const/4 v6, -0x1

    .line 30
    move-object v1, p0

    .line 31
    move-object v3, v7

    .line 32
    invoke-virtual/range {v1 .. v6}, La/rcx;->n1(La/dgu;Ljava/util/ArrayList;III)V

    .line 33
    .line 34
    .line 35
    move-object v5, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object v5, p0

    .line 38
    move-object v2, v6

    .line 39
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    const/4 v1, 0x1

    .line 44
    move v3, v1

    .line 45
    :goto_1
    if-ge v3, p0, :cond_1

    .line 46
    .line 47
    add-int/lit8 v6, v3, -0x1

    .line 48
    .line 49
    invoke-interface {p2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    check-cast v6, La/eqs0;

    .line 54
    .line 55
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    check-cast v8, La/eqs0;

    .line 60
    .line 61
    iget-object v9, v6, La/eqs0;->a:La/j;

    .line 62
    .line 63
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    iget v6, v6, La/eqs0;->c:I

    .line 67
    .line 68
    sub-int/2addr v6, v1

    .line 69
    new-instance v9, La/wvq0;

    .line 70
    .line 71
    iget v8, v8, La/eqs0;->b:I

    .line 72
    .line 73
    invoke-direct {v9, v2, v8}, La/wvq0;-><init>(La/dgu;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v9}, La/wvq0;->d()I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    const/4 v9, 0x1

    .line 81
    move v8, v6

    .line 82
    move-object v6, v2

    .line 83
    invoke-virtual/range {v5 .. v10}, La/rcx;->n1(La/dgu;Ljava/util/ArrayList;III)V

    .line 84
    .line 85
    .line 86
    add-int/lit8 v3, v3, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-nez p0, :cond_2

    .line 94
    .line 95
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/eqs0;

    .line 100
    .line 101
    iget-object p0, p0, La/eqs0;->a:La/j;

    .line 102
    .line 103
    invoke-virtual {v7, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :cond_2
    if-eqz p3, :cond_3

    .line 107
    .line 108
    add-int/lit8 v8, p1, -0x1

    .line 109
    .line 110
    new-instance p0, La/wvq0;

    .line 111
    .line 112
    invoke-direct {p0, v2, p1}, La/wvq0;-><init>(La/dgu;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, La/wvq0;->d()I

    .line 116
    .line 117
    .line 118
    move-result v10

    .line 119
    const/4 v9, 0x1

    .line 120
    move-object v6, v2

    .line 121
    invoke-virtual/range {v5 .. v10}, La/rcx;->n1(La/dgu;Ljava/util/ArrayList;III)V

    .line 122
    .line 123
    .line 124
    :cond_3
    iget-object p0, v5, La/p4;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast p0, La/peg0;

    .line 127
    .line 128
    invoke-virtual {p0, v0, v7}, La/peg0;->g(La/ar20;Ljava/util/ArrayList;)La/zkd;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    new-instance p2, La/eqs0;

    .line 133
    .line 134
    invoke-direct {p2, p0, v4, p1}, La/eqs0;-><init>(La/j;II)V

    .line 135
    .line 136
    .line 137
    return-object p2
.end method

.method public final v0(La/fqs0;Ljava/util/List;)V
    .locals 11

    .line 1
    sget-object v0, La/cy2;->x:La/ar20;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v1, p1, La/fqs0;->a:I

    .line 7
    .line 8
    iget v2, p0, La/rcx;->d:I

    .line 9
    .line 10
    const/4 v3, -0x1

    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    iput v1, p0, La/rcx;->d:I

    .line 14
    .line 15
    :cond_0
    :goto_0
    iget v2, p0, La/rcx;->d:I

    .line 16
    .line 17
    if-ge v2, v1, :cond_6

    .line 18
    .line 19
    iget-object v4, p0, La/p4;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, La/peg0;

    .line 22
    .line 23
    new-instance v5, La/wvq0;

    .line 24
    .line 25
    iget-object v6, p0, La/rcx;->c:La/dgu;

    .line 26
    .line 27
    invoke-direct {v5, v6, v2}, La/wvq0;-><init>(La/dgu;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v5}, La/wvq0;->e()La/ar20;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    if-eqz v7, :cond_5

    .line 35
    .line 36
    invoke-virtual {v5}, La/wvq0;->e()La/ar20;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget v8, p0, La/rcx;->e:I

    .line 44
    .line 45
    if-lez v8, :cond_1

    .line 46
    .line 47
    sget-object v8, La/rcx;->f:Ljava/util/Set;

    .line 48
    .line 49
    invoke-interface {v8, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-eqz v8, :cond_1

    .line 54
    .line 55
    move-object v7, v0

    .line 56
    :cond_1
    iget v8, p0, La/rcx;->e:I

    .line 57
    .line 58
    if-lez v8, :cond_2

    .line 59
    .line 60
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_2

    .line 65
    .line 66
    if-eqz p2, :cond_2

    .line 67
    .line 68
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, La/eqs0;

    .line 73
    .line 74
    if-eqz v8, :cond_2

    .line 75
    .line 76
    iget v9, v8, La/eqs0;->b:I

    .line 77
    .line 78
    iget-object v10, v8, La/eqs0;->a:La/j;

    .line 79
    .line 80
    iget-object v10, v10, La/j;->a:La/ar20;

    .line 81
    .line 82
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-eqz v10, :cond_2

    .line 87
    .line 88
    iget v8, v8, La/eqs0;->c:I

    .line 89
    .line 90
    if-ne v8, v2, :cond_2

    .line 91
    .line 92
    new-instance v10, La/wvq0;

    .line 93
    .line 94
    add-int/lit8 v8, v8, -0x1

    .line 95
    .line 96
    invoke-direct {v10, v6, v8}, La/wvq0;-><init>(La/dgu;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v10}, La/wvq0;->c()I

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    invoke-virtual {v5}, La/wvq0;->d()I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    if-ne v8, v10, :cond_2

    .line 108
    .line 109
    new-instance v7, La/wvq0;

    .line 110
    .line 111
    invoke-direct {v7, v6, v9}, La/wvq0;-><init>(La/dgu;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v7}, La/wvq0;->d()I

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    invoke-virtual {v5}, La/wvq0;->c()I

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-virtual {v4, v0, v6, v5}, La/peg0;->h(La/ar20;II)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->v0(Ljava/util/List;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    check-cast v4, La/j;

    .line 131
    .line 132
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 133
    .line 134
    .line 135
    move-result v5

    .line 136
    add-int/lit8 v5, v5, -0x1

    .line 137
    .line 138
    new-instance v6, La/eqs0;

    .line 139
    .line 140
    add-int/lit8 v2, v2, 0x1

    .line 141
    .line 142
    invoke-direct {v6, v4, v9, v2}, La/eqs0;-><init>(La/j;II)V

    .line 143
    .line 144
    .line 145
    invoke-interface {p2, v5, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_2
    invoke-virtual {v5}, La/wvq0;->d()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    invoke-virtual {v5}, La/wvq0;->c()I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    invoke-virtual {v4, v7, v2, v6}, La/peg0;->h(La/ar20;II)Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    if-eqz v4, :cond_4

    .line 170
    .line 171
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    check-cast v4, La/j;

    .line 176
    .line 177
    if-eqz p2, :cond_3

    .line 178
    .line 179
    new-instance v6, La/eqs0;

    .line 180
    .line 181
    iget v7, v5, La/wvq0;->a:I

    .line 182
    .line 183
    add-int/lit8 v8, v7, 0x1

    .line 184
    .line 185
    invoke-direct {v6, v4, v7, v8}, La/eqs0;-><init>(La/j;II)V

    .line 186
    .line 187
    .line 188
    invoke-interface {p2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_4
    :goto_2
    iget v2, p0, La/rcx;->d:I

    .line 193
    .line 194
    add-int/lit8 v2, v2, 0x1

    .line 195
    .line 196
    iput v2, p0, La/rcx;->d:I

    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_5
    new-instance p0, La/byw;

    .line 201
    .line 202
    const-string p1, ""

    .line 203
    .line 204
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw p0

    .line 208
    :cond_6
    iget-object p2, p1, La/fqs0;->c:La/sgi0;

    .line 209
    .line 210
    iget-object p2, p2, La/sgi0;->b:La/ar20;

    .line 211
    .line 212
    sget-object v0, La/wb;->A:La/ar20;

    .line 213
    .line 214
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    if-eqz p2, :cond_8

    .line 219
    .line 220
    invoke-virtual {p1}, La/fqs0;->c()Z

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    if-eqz p2, :cond_7

    .line 225
    .line 226
    iget p1, p0, La/rcx;->e:I

    .line 227
    .line 228
    add-int/lit8 p1, p1, 0x1

    .line 229
    .line 230
    iput p1, p0, La/rcx;->e:I

    .line 231
    .line 232
    return-void

    .line 233
    :cond_7
    invoke-virtual {p1}, La/fqs0;->b()Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    if-nez p1, :cond_8

    .line 238
    .line 239
    iget p1, p0, La/rcx;->e:I

    .line 240
    .line 241
    add-int/2addr p1, v3

    .line 242
    iput p1, p0, La/rcx;->e:I

    .line 243
    .line 244
    :cond_8
    return-void
.end method
