.class public final La/pnw0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fht0;

.field public b:La/h0q0;

.field public final c:La/mpt0;

.field public final d:La/okt0;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    new-instance v0, La/fht0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/okt0;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-direct {v1, v2}, La/okt0;-><init>(B)V

    .line 11
    .line 12
    .line 13
    iput-object v1, v0, La/fht0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance v2, La/h0q0;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, v1}, La/h0q0;-><init>(La/h0q0;La/okt0;)V

    .line 19
    .line 20
    .line 21
    iput-object v2, v0, La/fht0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v2}, La/h0q0;->J()La/h0q0;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, v0, La/fht0;->b:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance v1, La/zas0;

    .line 30
    .line 31
    const/16 v3, 0x12

    .line 32
    .line 33
    invoke-direct {v1, v3}, La/zas0;-><init>(B)V

    .line 34
    .line 35
    .line 36
    iput-object v1, v0, La/fht0;->d:Ljava/lang/Object;

    .line 37
    .line 38
    new-instance v3, La/adx0;

    .line 39
    .line 40
    invoke-direct {v3, v1}, La/adx0;-><init>(La/zas0;)V

    .line 41
    .line 42
    .line 43
    const-string v4, "require"

    .line 44
    .line 45
    invoke-virtual {v2, v4, v3}, La/h0q0;->M(Ljava/lang/String;La/jlw0;)V

    .line 46
    .line 47
    .line 48
    sget-object v3, La/drw0;->b:La/drw0;

    .line 49
    .line 50
    iget-object v1, v1, La/zas0;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Ljava/util/HashMap;

    .line 53
    .line 54
    const-string v4, "internal.platform"

    .line 55
    .line 56
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    new-instance v1, La/ihw0;

    .line 60
    .line 61
    const-wide/16 v3, 0x0

    .line 62
    .line 63
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-direct {v1, v3}, La/ihw0;-><init>(Ljava/lang/Double;)V

    .line 68
    .line 69
    .line 70
    const-string v3, "runtime.counter"

    .line 71
    .line 72
    invoke-virtual {v2, v3, v1}, La/h0q0;->M(Ljava/lang/String;La/jlw0;)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, La/pnw0;->a:La/fht0;

    .line 79
    .line 80
    iget-object v1, v0, La/fht0;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, La/h0q0;

    .line 83
    .line 84
    invoke-virtual {v1}, La/h0q0;->J()La/h0q0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p0, La/pnw0;->b:La/h0q0;

    .line 89
    .line 90
    new-instance v1, La/mpt0;

    .line 91
    .line 92
    const/4 v2, 0x2

    .line 93
    invoke-direct {v1, v2}, La/mpt0;-><init>(B)V

    .line 94
    .line 95
    .line 96
    iput-object v1, p0, La/pnw0;->c:La/mpt0;

    .line 97
    .line 98
    new-instance v1, La/okt0;

    .line 99
    .line 100
    const/16 v2, 0x10

    .line 101
    .line 102
    invoke-direct {v1, v2}, La/okt0;-><init>(B)V

    .line 103
    .line 104
    .line 105
    iput-object v1, p0, La/pnw0;->d:La/okt0;

    .line 106
    .line 107
    new-instance v1, La/lbw0;

    .line 108
    .line 109
    const/4 v2, 0x1

    .line 110
    invoke-direct {v1, p0, v2}, La/lbw0;-><init>(La/pnw0;B)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, La/fht0;->d:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, La/zas0;

    .line 116
    .line 117
    iget-object v0, v0, La/zas0;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Ljava/util/HashMap;

    .line 120
    .line 121
    const-string v2, "internal.registerCallback"

    .line 122
    .line 123
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    new-instance v1, La/lbw0;

    .line 127
    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-direct {v1, p0, v2}, La/lbw0;-><init>(La/pnw0;B)V

    .line 130
    .line 131
    .line 132
    const-string p0, "internal.eventLogger"

    .line 133
    .line 134
    invoke-virtual {v0, p0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    return-void
.end method


# virtual methods
.method public final a(La/nbw0;)Z
    .locals 5

    .line 1
    iget-object v0, p0, La/pnw0;->c:La/mpt0;

    .line 2
    .line 3
    :try_start_0
    iput-object p1, v0, La/mpt0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p1}, La/nbw0;->a()La/nbw0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, La/mpt0;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p1, v0, La/mpt0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, La/pnw0;->a:La/fht0;

    .line 19
    .line 20
    iget-object p1, p1, La/fht0;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p1, La/h0q0;

    .line 23
    .line 24
    const-string v1, "runtime.counter"

    .line 25
    .line 26
    new-instance v2, La/ihw0;

    .line 27
    .line 28
    const-wide/16 v3, 0x0

    .line 29
    .line 30
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-direct {v2, v3}, La/ihw0;-><init>(Ljava/lang/Double;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v1, v2}, La/h0q0;->M(Ljava/lang/String;La/jlw0;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, La/pnw0;->d:La/okt0;

    .line 41
    .line 42
    iget-object p0, p0, La/pnw0;->b:La/h0q0;

    .line 43
    .line 44
    invoke-virtual {p0}, La/h0q0;->J()La/h0q0;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p1, p0, v0}, La/okt0;->t(La/h0q0;La/mpt0;)V

    .line 49
    .line 50
    .line 51
    iget-object p0, v0, La/mpt0;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, La/nbw0;

    .line 54
    .line 55
    iget-object p1, v0, La/mpt0;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, La/nbw0;

    .line 58
    .line 59
    invoke-virtual {p0, p1}, La/nbw0;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_1

    .line 64
    .line 65
    iget-object p0, v0, La/mpt0;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 70
    .line 71
    .line 72
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    if-nez p0, :cond_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    const/4 p0, 0x0

    .line 77
    return p0

    .line 78
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 79
    return p0

    .line 80
    :catchall_0
    move-exception p0

    .line 81
    new-instance p1, La/cqw0;

    .line 82
    .line 83
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method

.method public final b(La/nyw0;)V
    .locals 8

    .line 1
    :try_start_0
    iget-object v0, p0, La/pnw0;->a:La/fht0;

    .line 2
    .line 3
    iget-object v1, v0, La/fht0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/h0q0;

    .line 6
    .line 7
    invoke-virtual {v1}, La/h0q0;->J()La/h0q0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, p0, La/pnw0;->b:La/h0q0;

    .line 12
    .line 13
    invoke-virtual {p1}, La/nyw0;->r()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, La/pnw0;->b:La/h0q0;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    new-array v3, v3, [La/qyw0;

    .line 21
    .line 22
    invoke-interface {v1, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, [La/qyw0;

    .line 27
    .line 28
    invoke-virtual {v0, v2, v1}, La/fht0;->q(La/h0q0;[La/qyw0;)La/jlw0;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    instance-of v1, v1, La/kgw0;

    .line 33
    .line 34
    if-nez v1, :cond_6

    .line 35
    .line 36
    invoke-virtual {p1}, La/nyw0;->s()La/gyw0;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, La/gyw0;->r()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_5

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, La/hyw0;

    .line 59
    .line 60
    invoke-virtual {v1}, La/hyw0;->s()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1}, La/hyw0;->r()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_0

    .line 77
    .line 78
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    check-cast v3, La/qyw0;

    .line 83
    .line 84
    iget-object v4, p0, La/pnw0;->b:La/h0q0;

    .line 85
    .line 86
    filled-new-array {v3}, [La/qyw0;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v0, v4, v3}, La/fht0;->q(La/h0q0;[La/qyw0;)La/jlw0;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    instance-of v4, v3, La/akw0;

    .line 95
    .line 96
    if-eqz v4, :cond_4

    .line 97
    .line 98
    const-string v4, "Rule function is undefined: "

    .line 99
    .line 100
    iget-object v5, p0, La/pnw0;->b:La/h0q0;

    .line 101
    .line 102
    const-string v6, "Invalid function name: "

    .line 103
    .line 104
    invoke-virtual {v5, v1}, La/h0q0;->L(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-nez v7, :cond_1

    .line 109
    .line 110
    const/4 v5, 0x0

    .line 111
    goto :goto_1

    .line 112
    :cond_1
    invoke-virtual {v5, v1}, La/h0q0;->O(Ljava/lang/String;)La/jlw0;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    instance-of v7, v5, La/giw0;

    .line 117
    .line 118
    if-eqz v7, :cond_3

    .line 119
    .line 120
    check-cast v5, La/giw0;

    .line 121
    .line 122
    :goto_1
    if-eqz v5, :cond_2

    .line 123
    .line 124
    iget-object v4, p0, La/pnw0;->b:La/h0q0;

    .line 125
    .line 126
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    invoke-virtual {v5, v4, v3}, La/giw0;->a(La/h0q0;Ljava/util/List;)La/jlw0;

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 135
    .line 136
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v4, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p0

    .line 148
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {v6, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p0

    .line 162
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 163
    .line 164
    const-string p1, "Invalid rule definition"

    .line 165
    .line 166
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p0

    .line 170
    :cond_5
    return-void

    .line 171
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 172
    .line 173
    const-string p1, "Program loading failed"

    .line 174
    .line 175
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 179
    :catchall_0
    move-exception p0

    .line 180
    new-instance p1, La/cqw0;

    .line 181
    .line 182
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 183
    .line 184
    .line 185
    throw p1
.end method
