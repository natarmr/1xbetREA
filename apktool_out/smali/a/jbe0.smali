.class public final La/jbe0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r34;

.field public final b:La/y78;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/r34;La/y78;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/jbe0;->a:La/r34;

    .line 5
    .line 6
    iput-object p2, p0, La/jbe0;->b:La/y78;

    .line 7
    .line 8
    new-instance p1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/jbe0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(La/jr30;)La/kr30;
    .locals 11

    .line 1
    iget-object v0, p0, La/jbe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/jbe0;->a:La/r34;

    .line 5
    .line 6
    iget-object v1, v1, La/r34;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, La/dr8;

    .line 9
    .line 10
    iget-object v1, v1, La/dr8;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, La/obe0;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-instance v3, La/kr30;

    .line 24
    .line 25
    iget-object v4, v1, La/obe0;->a:La/dyw;

    .line 26
    .line 27
    iget-object v1, v1, La/obe0;->b:Ljava/util/Map;

    .line 28
    .line 29
    invoke-direct {v3, v4, v1}, La/kr30;-><init>(La/dyw;Ljava/util/Map;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v3, v2

    .line 34
    :goto_0
    const/4 v1, 0x0

    .line 35
    if-nez v3, :cond_5

    .line 36
    .line 37
    iget-object v3, p0, La/jbe0;->b:La/y78;

    .line 38
    .line 39
    iget-object v4, v3, La/y78;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-virtual {v4, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Ljava/util/ArrayList;

    .line 48
    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    move-object v3, v2

    .line 52
    goto :goto_4

    .line 53
    :cond_1
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    move v6, v1

    .line 58
    :goto_1
    if-ge v6, v5, :cond_4

    .line 59
    .line 60
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    check-cast v7, La/rbe0;

    .line 65
    .line 66
    iget-object v8, v7, La/rbe0;->a:Ljava/lang/ref/WeakReference;

    .line 67
    .line 68
    invoke-virtual {v8}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, La/dyw;

    .line 73
    .line 74
    if-eqz v8, :cond_2

    .line 75
    .line 76
    new-instance v9, La/kr30;

    .line 77
    .line 78
    iget-object v7, v7, La/rbe0;->b:Ljava/util/Map;

    .line 79
    .line 80
    invoke-direct {v9, v8, v7}, La/kr30;-><init>(La/dyw;Ljava/util/Map;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_2
    move-object v9, v2

    .line 85
    :goto_2
    if-eqz v9, :cond_3

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    move-object v9, v2

    .line 92
    :goto_3
    invoke-virtual {v3}, La/y78;->h()V

    .line 93
    .line 94
    .line 95
    move-object v3, v9

    .line 96
    goto :goto_4

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    goto :goto_7

    .line 99
    :cond_5
    :goto_4
    if-eqz v3, :cond_9

    .line 100
    .line 101
    iget-object v4, v3, La/kr30;->a:La/dyw;

    .line 102
    .line 103
    invoke-interface {v4}, La/dyw;->l()Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-nez v4, :cond_9

    .line 108
    .line 109
    iget-object v4, p0, La/jbe0;->c:Ljava/lang/Object;

    .line 110
    .line 111
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    :try_start_1
    iget-object v5, p0, La/jbe0;->a:La/r34;

    .line 113
    .line 114
    iget-object v5, v5, La/r34;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v5, La/dr8;

    .line 117
    .line 118
    iget-object v6, v5, La/dr8;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v6, Ljava/util/LinkedHashMap;

    .line 121
    .line 122
    invoke-interface {v6, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    if-eqz v6, :cond_6

    .line 127
    .line 128
    invoke-virtual {v5}, La/dr8;->l()J

    .line 129
    .line 130
    .line 131
    move-result-wide v7

    .line 132
    invoke-virtual {v5, p1, v6}, La/dr8;->o(Ljava/lang/Object;Ljava/lang/Object;)J

    .line 133
    .line 134
    .line 135
    move-result-wide v9

    .line 136
    sub-long/2addr v7, v9

    .line 137
    iput-wide v7, v5, La/dr8;->b:J

    .line 138
    .line 139
    invoke-virtual {v5, p1, v6, v2}, La/dr8;->k(Ljava/lang/Object;Ljava/lang/Object;La/obe0;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    const/4 v2, 0x1

    .line 143
    if-eqz v6, :cond_7

    .line 144
    .line 145
    move v5, v2

    .line 146
    goto :goto_5

    .line 147
    :cond_7
    move v5, v1

    .line 148
    :goto_5
    iget-object p0, p0, La/jbe0;->b:La/y78;

    .line 149
    .line 150
    iget-object p0, p0, La/y78;->c:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 158
    if-eqz p0, :cond_8

    .line 159
    .line 160
    move v1, v2

    .line 161
    :cond_8
    :try_start_2
    monitor-exit v4

    .line 162
    goto :goto_6

    .line 163
    :catchall_1
    move-exception p0

    .line 164
    monitor-exit v4

    .line 165
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 166
    :cond_9
    :goto_6
    monitor-exit v0

    .line 167
    return-object v3

    .line 168
    :goto_7
    monitor-exit v0

    .line 169
    throw p0
.end method

.method public final b(J)V
    .locals 1

    .line 1
    iget-object v0, p0, La/jbe0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, La/jbe0;->a:La/r34;

    .line 5
    .line 6
    iget-object p0, p0, La/r34;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/dr8;

    .line 9
    .line 10
    iput-wide p1, p0, La/dr8;->a:J

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, La/dr8;->q(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit v0

    .line 19
    throw p0
.end method
