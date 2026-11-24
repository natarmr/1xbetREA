.class public final La/jp5;
.super La/q4;
.source "SourceFile"


# static fields
.field public static final h:La/ek5;


# instance fields
.field public final f:La/dp5;

.field public g:La/xdr;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ek5;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ek5;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/jp5;->h:La/ek5;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La/dp5;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/jp5;->h:La/ek5;

    .line 5
    .line 6
    invoke-direct {p0, v0}, La/q4;-><init>(La/dtb;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/jp5;->f:La/dp5;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final f(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/q4;->A(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/fp5;

    .line 6
    .line 7
    iget-object p0, p0, La/fp5;->c:La/mq5;

    .line 8
    .line 9
    iget-byte p0, p0, La/mq5;->a:B

    .line 10
    .line 11
    return p0
.end method

.method public final n(La/xhe0;I)V
    .locals 8

    .line 1
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v3, v0

    .line 6
    check-cast v3, La/fp5;

    .line 7
    .line 8
    instance-of v0, p1, La/hp5;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, La/hp5;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, v1

    .line 18
    :goto_0
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v0, v0, La/hp5;->u:Landroid/view/ViewGroup;

    .line 24
    .line 25
    move-object v2, v0

    .line 26
    check-cast v2, La/gr5;

    .line 27
    .line 28
    iget-object v4, v3, La/fp5;->b:La/n0x;

    .line 29
    .line 30
    iget-object v5, v3, La/fp5;->h:La/gp5;

    .line 31
    .line 32
    invoke-interface {v2, v4, v5}, La/gr5;->a(La/o0x;La/gp5;)V

    .line 33
    .line 34
    .line 35
    iget-object v4, v3, La/fp5;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-interface {v2, v4}, La/gr5;->setTitle(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v4, v3, La/fp5;->f:Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {v2, v4}, La/gr5;->setTag(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {v2, v1}, La/gr5;->setTagColor(La/goo0;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, v3, La/fp5;->g:La/m0x;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-interface {v2, v1}, La/gr5;->setDecoratorImage(La/o0x;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    instance-of v1, v0, La/ro5;

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    check-cast v0, La/ro5;

    .line 60
    .line 61
    iget-object v1, v3, La/fp5;->e:Ljava/lang/String;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, La/ro5;->setSubtitle(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    sget-object v7, La/ymx;->h:La/ymx;

    .line 72
    .line 73
    new-instance v1, La/ec3;

    .line 74
    .line 75
    const/4 v6, 0x1

    .line 76
    move-object v2, p0

    .line 77
    move-object v5, p1

    .line 78
    move v4, p2

    .line 79
    invoke-direct/range {v1 .. v6}, La/ec3;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v7, v1}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final o(La/xhe0;ILjava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_9

    .line 9
    .line 10
    new-instance p0, La/sx3;

    .line 11
    .line 12
    const/4 p2, 0x1

    .line 13
    invoke-direct {p0, p3, p2}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    new-instance p2, La/ij4;

    .line 17
    .line 18
    const/16 p3, 0x19

    .line 19
    .line 20
    invoke-direct {p2, p3}, La/ij4;-><init>(B)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, p2}, La/pgi0;->k(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, La/pgi0;->v(Lkotlin/sequences/Sequence;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    instance-of p2, p1, La/hp5;

    .line 32
    .line 33
    const/4 p3, 0x0

    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    check-cast p1, La/hp5;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object p1, p3

    .line 40
    :goto_0
    if-eqz p1, :cond_8

    .line 41
    .line 42
    iget-object p1, p1, La/hp5;->u:Landroid/view/ViewGroup;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    check-cast p0, Ljava/lang/Iterable;

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eqz p2, :cond_8

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    if-nez p2, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    instance-of v0, p2, La/pp5;

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    move-object v0, p1

    .line 71
    check-cast v0, La/gr5;

    .line 72
    .line 73
    check-cast p2, La/pp5;

    .line 74
    .line 75
    iget-object p2, p2, La/pp5;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {v0, p2}, La/gr5;->setTitle(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    instance-of v0, p2, La/mp5;

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    instance-of v0, p1, La/ro5;

    .line 86
    .line 87
    if-eqz v0, :cond_1

    .line 88
    .line 89
    move-object v0, p1

    .line 90
    check-cast v0, La/ro5;

    .line 91
    .line 92
    check-cast p2, La/mp5;

    .line 93
    .line 94
    iget-object p2, p2, La/mp5;->a:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0, p2}, La/ro5;->setSubtitle(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    instance-of v0, p2, La/op5;

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    move-object v0, p1

    .line 105
    check-cast v0, La/gr5;

    .line 106
    .line 107
    check-cast p2, La/op5;

    .line 108
    .line 109
    iget-object p2, p2, La/op5;->a:Ljava/lang/String;

    .line 110
    .line 111
    invoke-interface {v0, p2}, La/gr5;->setTag(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    instance-of v0, p2, La/np5;

    .line 116
    .line 117
    if-eqz v0, :cond_6

    .line 118
    .line 119
    move-object p2, p1

    .line 120
    check-cast p2, La/gr5;

    .line 121
    .line 122
    invoke-interface {p2, p3}, La/gr5;->setTagColor(La/goo0;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    instance-of v0, p2, La/kp5;

    .line 127
    .line 128
    if-eqz v0, :cond_7

    .line 129
    .line 130
    move-object v0, p1

    .line 131
    check-cast v0, La/gr5;

    .line 132
    .line 133
    check-cast p2, La/kp5;

    .line 134
    .line 135
    iget-object v1, p2, La/kp5;->a:La/o0x;

    .line 136
    .line 137
    iget-object p2, p2, La/kp5;->b:La/gp5;

    .line 138
    .line 139
    invoke-interface {v0, v1, p2}, La/gr5;->a(La/o0x;La/gp5;)V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_7
    instance-of v0, p2, La/lp5;

    .line 144
    .line 145
    if-eqz v0, :cond_1

    .line 146
    .line 147
    move-object v0, p1

    .line 148
    check-cast v0, La/gr5;

    .line 149
    .line 150
    check-cast p2, La/lp5;

    .line 151
    .line 152
    iget-object p2, p2, La/lp5;->a:La/o0x;

    .line 153
    .line 154
    invoke-interface {v0, p2}, La/gr5;->setDecoratorImage(La/o0x;)V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_8
    return-void

    .line 159
    :cond_9
    invoke-virtual {p0, p1, p2}, La/jp5;->n(La/xhe0;I)V

    .line 160
    .line 161
    .line 162
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 2

    .line 1
    sget-object v0, La/mq5;->b:La/mq5;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-ne p2, v0, :cond_0

    .line 5
    .line 6
    new-instance p0, La/rr5;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1}, La/rr5;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_0
    const/4 v1, 0x2

    .line 21
    if-ne p2, v1, :cond_1

    .line 22
    .line 23
    new-instance p0, La/wr5;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, p1}, La/wr5;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_1
    const/4 v1, 0x3

    .line 38
    if-ne p2, v1, :cond_2

    .line 39
    .line 40
    new-instance p0, La/fs5;

    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0, p1}, La/fs5;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :cond_2
    const/4 v1, 0x4

    .line 55
    iget-object p0, p0, La/jp5;->f:La/dp5;

    .line 56
    .line 57
    if-ne p2, v1, :cond_4

    .line 58
    .line 59
    sget-object p2, La/ip5;->a:[I

    .line 60
    .line 61
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    aget p0, p2, p0

    .line 66
    .line 67
    if-ne p0, v0, :cond_3

    .line 68
    .line 69
    new-instance p0, La/ns5;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-direct {p0, p1}, La/ns5;-><init>(Landroid/content/Context;)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    :cond_3
    new-instance p0, La/ks5;

    .line 84
    .line 85
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-direct {p0, p1}, La/ks5;-><init>(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    const/4 v1, 0x5

    .line 97
    if-ne p2, v1, :cond_5

    .line 98
    .line 99
    new-instance p0, La/ro5;

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, p1}, La/ro5;-><init>(Landroid/content/Context;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_5
    const/4 v1, 0x6

    .line 113
    if-ne p2, v1, :cond_6

    .line 114
    .line 115
    new-instance p0, La/tr5;

    .line 116
    .line 117
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-direct {p0, p1}, La/tr5;-><init>(Landroid/content/Context;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_6
    const/4 v1, 0x7

    .line 129
    if-ne p2, v1, :cond_7

    .line 130
    .line 131
    new-instance p0, La/yr5;

    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-direct {p0, p1}, La/yr5;-><init>(Landroid/content/Context;)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_7
    const/16 v1, 0x8

    .line 145
    .line 146
    if-ne p2, v1, :cond_8

    .line 147
    .line 148
    new-instance p0, La/hs5;

    .line 149
    .line 150
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-direct {p0, p1}, La/hs5;-><init>(Landroid/content/Context;)V

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_8
    const/16 v1, 0x9

    .line 162
    .line 163
    if-ne p2, v1, :cond_a

    .line 164
    .line 165
    sget-object p2, La/ip5;->a:[I

    .line 166
    .line 167
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 168
    .line 169
    .line 170
    move-result p0

    .line 171
    aget p0, p2, p0

    .line 172
    .line 173
    if-ne p0, v0, :cond_9

    .line 174
    .line 175
    new-instance p0, La/js5;

    .line 176
    .line 177
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-direct {p0, p1}, La/js5;-><init>(Landroid/content/Context;)V

    .line 185
    .line 186
    .line 187
    goto :goto_0

    .line 188
    :cond_9
    new-instance p0, La/is5;

    .line 189
    .line 190
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    invoke-direct {p0, p1}, La/is5;-><init>(Landroid/content/Context;)V

    .line 198
    .line 199
    .line 200
    :goto_0
    new-instance p1, La/hp5;

    .line 201
    .line 202
    invoke-direct {p1, p0}, La/hp5;-><init>(Landroid/view/ViewGroup;)V

    .line 203
    .line 204
    .line 205
    return-object p1

    .line 206
    :cond_a
    const-string p0, "Unknown view type "

    .line 207
    .line 208
    invoke-static {p2, p0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    const/4 p0, 0x0

    .line 216
    return-object p0
.end method
