.class public final La/drt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/f8u;


# direct methods
.method public constructor <init>(La/f8u;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/drt;->a:La/f8u;

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(La/gl5;La/f8u;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p2, p0, La/drt;->a:La/f8u;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 2

    .line 1
    sget-object v0, La/bop0;->c:La/bop0;

    .line 2
    .line 3
    iget-object p0, p0, La/drt;->a:La/f8u;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, La/f8u;->a(La/bop0;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, La/bop0;->d:La/bop0;

    .line 10
    .line 11
    invoke-virtual {p0, v1}, La/f8u;->a(La/bop0;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public b(La/d9a0;)Ljava/util/ArrayList;
    .locals 13

    .line 1
    sget-object v0, La/bop0;->c:La/bop0;

    .line 2
    .line 3
    iget-object p0, p0, La/drt;->a:La/f8u;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, La/f8u;->a(La/bop0;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, La/bop0;->d:La/bop0;

    .line 10
    .line 11
    invoke-virtual {p0, v1}, La/f8u;->a(La/bop0;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {}, La/bop0;->values()[La/bop0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    array-length v3, v1

    .line 25
    const/4 v4, 0x0

    .line 26
    move v5, v4

    .line 27
    :goto_0
    const/16 v6, 0xa

    .line 28
    .line 29
    if-ge v5, v3, :cond_6

    .line 30
    .line 31
    aget-object v7, v1, v5

    .line 32
    .line 33
    invoke-static {p1, v0, p0, v7, v4}, La/gl5;->l(La/d9a0;Ljava/util/ArrayList;Ljava/util/ArrayList;La/bop0;Z)La/jyb;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    instance-of v9, v8, La/gyb;

    .line 38
    .line 39
    if-nez v9, :cond_0

    .line 40
    .line 41
    instance-of v9, v8, La/fyb;

    .line 42
    .line 43
    if-eqz v9, :cond_4

    .line 44
    .line 45
    :cond_0
    sget-object v9, La/bop0;->e:La/bop0;

    .line 46
    .line 47
    if-eq v7, v9, :cond_4

    .line 48
    .line 49
    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    new-instance v9, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    :cond_1
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v10

    .line 66
    if-eqz v10, :cond_2

    .line 67
    .line 68
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v10

    .line 72
    move-object v11, v10

    .line 73
    check-cast v11, La/d9a0;

    .line 74
    .line 75
    iget v11, v11, La/d9a0;->a:I

    .line 76
    .line 77
    iget v12, p1, La/d9a0;->a:I

    .line 78
    .line 79
    if-ne v11, v12, :cond_1

    .line 80
    .line 81
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    new-instance v8, Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-static {v9, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-eqz v9, :cond_3

    .line 103
    .line 104
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    check-cast v9, La/d9a0;

    .line 109
    .line 110
    iget v9, v9, La/d9a0;->f:I

    .line 111
    .line 112
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    iget-byte v6, v7, La/bop0;->a:B

    .line 121
    .line 122
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v6

    .line 130
    if-nez v6, :cond_5

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    instance-of v6, v8, La/iyb;

    .line 134
    .line 135
    if-nez v6, :cond_5

    .line 136
    .line 137
    :goto_3
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_6
    new-instance p0, Ljava/util/ArrayList;

    .line 144
    .line 145
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_7

    .line 161
    .line 162
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, La/bop0;

    .line 167
    .line 168
    iget-byte v0, v0, La/bop0;->a:B

    .line 169
    .line 170
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_7
    return-object p0
.end method
