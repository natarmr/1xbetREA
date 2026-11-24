.class public final La/thx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:La/ohx;

.field public final b:Z

.field public final c:La/vef0;

.field public final d:Ljava/lang/String;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;


# direct methods
.method public constructor <init>(La/ohx;ZLa/ctf0;Z)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/thx;->a:La/ohx;

    .line 8
    .line 9
    iput-boolean p4, p0, La/thx;->b:Z

    .line 10
    .line 11
    new-instance p4, La/vef0;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    new-array v1, v0, [Ljava/lang/Object;

    .line 15
    .line 16
    iget-object p3, p3, La/ctf0;->b:La/lsm0;

    .line 17
    .line 18
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const v2, 0x7f130e0a

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {p4, v1}, La/vef0;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object p4, p0, La/thx;->c:La/vef0;

    .line 33
    .line 34
    new-array p4, v0, [Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {p4, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p4

    .line 40
    const v0, 0x7f130c89

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3, v0, p4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    iput-object p3, p0, La/thx;->d:Ljava/lang/String;

    .line 48
    .line 49
    iget-object p3, p1, La/ohx;->b:Ljava/util/List;

    .line 50
    .line 51
    invoke-static {p3}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    iput-object p3, p0, La/thx;->e:La/n0o0;

    .line 56
    .line 57
    iget-object p4, p1, La/ohx;->f:La/aw20;

    .line 58
    .line 59
    invoke-static {p4}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 60
    .line 61
    .line 62
    move-result-object p4

    .line 63
    iput-object p4, p0, La/thx;->f:La/n0o0;

    .line 64
    .line 65
    iget-object p1, p1, La/ohx;->a:Ljava/util/List;

    .line 66
    .line 67
    invoke-static {p1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, La/thx;->g:La/n0o0;

    .line 72
    .line 73
    invoke-virtual {p3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, La/fee;

    .line 78
    .line 79
    new-instance p3, La/x9;

    .line 80
    .line 81
    const/16 p4, 0x19

    .line 82
    .line 83
    invoke-direct {p3, p2, p0, p4}, La/x9;-><init>(ZLjava/lang/Object;B)V

    .line 84
    .line 85
    .line 86
    new-instance p2, La/yw9;

    .line 87
    .line 88
    const/16 p4, 0x14

    .line 89
    .line 90
    invoke-direct {p2, p1, p3, p4}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, La/thx;->h:La/n0o0;

    .line 98
    .line 99
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/ohx;

    .line 6
    .line 7
    iget-object v2, v0, La/thx;->a:La/ohx;

    .line 8
    .line 9
    iget-object v2, v2, La/ohx;->e:La/mhx;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v3, v0, La/thx;->g:La/n0o0;

    .line 15
    .line 16
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, La/fee;

    .line 21
    .line 22
    iget-object v4, v1, La/ohx;->a:Ljava/util/List;

    .line 23
    .line 24
    iget-boolean v5, v1, La/ohx;->g:Z

    .line 25
    .line 26
    invoke-virtual {v3, v4}, La/fee;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v3, v0, La/thx;->e:La/n0o0;

    .line 30
    .line 31
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, La/fee;

    .line 36
    .line 37
    iget-object v6, v1, La/ohx;->b:Ljava/util/List;

    .line 38
    .line 39
    invoke-virtual {v4, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object v4, v0, La/thx;->f:La/n0o0;

    .line 43
    .line 44
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, La/fee;

    .line 49
    .line 50
    iget-object v6, v1, La/ohx;->f:La/aw20;

    .line 51
    .line 52
    invoke-virtual {v4, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-boolean v4, v1, La/ohx;->d:Z

    .line 56
    .line 57
    iget-boolean v6, v0, La/thx;->b:Z

    .line 58
    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    new-instance v0, La/qhx;

    .line 62
    .line 63
    iget-object v1, v2, La/mhx;->a:La/udl0;

    .line 64
    .line 65
    invoke-direct {v0, v1, v6, v5}, La/qhx;-><init>(La/udl0;ZZ)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :cond_0
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, La/fee;

    .line 74
    .line 75
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    check-cast v3, Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_6

    .line 86
    .line 87
    iget-object v1, v1, La/ohx;->c:La/l9s;

    .line 88
    .line 89
    const/4 v3, 0x0

    .line 90
    if-eqz v1, :cond_1

    .line 91
    .line 92
    invoke-interface {v1}, La/l9s;->e()Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    const/4 v5, 0x1

    .line 97
    if-ne v4, v5, :cond_1

    .line 98
    .line 99
    move v7, v5

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    move v7, v3

    .line 102
    :goto_0
    const-wide/16 v3, -0x1

    .line 103
    .line 104
    if-eqz v1, :cond_2

    .line 105
    .line 106
    invoke-interface {v1}, La/l9s;->a()J

    .line 107
    .line 108
    .line 109
    move-result-wide v5

    .line 110
    move-wide v8, v5

    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move-wide v8, v3

    .line 113
    :goto_1
    if-eqz v1, :cond_3

    .line 114
    .line 115
    invoke-interface {v1}, La/l9s;->b()J

    .line 116
    .line 117
    .line 118
    move-result-wide v5

    .line 119
    move-wide v14, v5

    .line 120
    goto :goto_2

    .line 121
    :cond_3
    move-wide v14, v3

    .line 122
    :goto_2
    if-eqz v1, :cond_4

    .line 123
    .line 124
    invoke-interface {v1}, La/l9s;->c()J

    .line 125
    .line 126
    .line 127
    move-result-wide v5

    .line 128
    move-wide v10, v5

    .line 129
    goto :goto_3

    .line 130
    :cond_4
    move-wide v10, v3

    .line 131
    :goto_3
    if-eqz v1, :cond_5

    .line 132
    .line 133
    invoke-interface {v1}, La/l9s;->d()J

    .line 134
    .line 135
    .line 136
    move-result-wide v3

    .line 137
    :cond_5
    move-wide v12, v3

    .line 138
    sget-object v16, La/tef0;->a:La/tef0;

    .line 139
    .line 140
    sget-object v1, La/pb10;->c:La/xuz;

    .line 141
    .line 142
    new-instance v6, Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 143
    .line 144
    invoke-direct/range {v6 .. v16}, Lorg/xplatform/related/api/presentation/RelatedParams;-><init>(ZJJJJLa/tef0;)V

    .line 145
    .line 146
    .line 147
    iget-object v1, v2, La/mhx;->a:La/udl0;

    .line 148
    .line 149
    new-instance v2, La/rhx;

    .line 150
    .line 151
    iget-object v0, v0, La/thx;->c:La/vef0;

    .line 152
    .line 153
    invoke-direct {v2, v1, v6, v0}, La/rhx;-><init>(La/udl0;Lorg/xplatform/related/api/presentation/RelatedParams;La/xef0;)V

    .line 154
    .line 155
    .line 156
    return-object v2

    .line 157
    :cond_6
    new-instance v1, La/phx;

    .line 158
    .line 159
    iget-object v2, v2, La/mhx;->a:La/udl0;

    .line 160
    .line 161
    iget-object v0, v0, La/thx;->h:La/n0o0;

    .line 162
    .line 163
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, La/fee;

    .line 168
    .line 169
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Ljava/lang/Iterable;

    .line 174
    .line 175
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-direct {v1, v2, v6, v0, v5}, La/phx;-><init>(La/udl0;ZLa/a4x;Z)V

    .line 180
    .line 181
    .line 182
    return-object v1
.end method
