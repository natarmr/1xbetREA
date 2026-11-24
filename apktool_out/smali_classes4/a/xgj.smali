.class public final La/xgj;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/ouu;

.field public final c:La/znt;

.field public final d:La/gbi;

.field public final e:La/mne;

.field public final f:La/ctf0;

.field public final g:La/p7m0;

.field public final h:La/ol60;

.field public i:Z

.field public j:Z

.field public k:Ljava/util/List;


# direct methods
.method public constructor <init>(La/i1w0;La/ouu;La/znt;La/gbi;La/mne;La/ctf0;)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/xgj;->b:La/ouu;

    .line 8
    .line 9
    iput-object p3, p0, La/xgj;->c:La/znt;

    .line 10
    .line 11
    iput-object p4, p0, La/xgj;->d:La/gbi;

    .line 12
    .line 13
    iput-object p5, p0, La/xgj;->e:La/mne;

    .line 14
    .line 15
    iput-object p6, p0, La/xgj;->f:La/ctf0;

    .line 16
    .line 17
    new-instance p1, La/ugj;

    .line 18
    .line 19
    sget-object p4, La/iun;->a:La/iun;

    .line 20
    .line 21
    const-string p2, ""

    .line 22
    .line 23
    const-string p3, ""

    .line 24
    .line 25
    const-string p5, ""

    .line 26
    .line 27
    move-object p6, p4

    .line 28
    invoke-direct/range {p1 .. p6}, La/ugj;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, La/xgj;->g:La/p7m0;

    .line 36
    .line 37
    new-instance p1, La/ol60;

    .line 38
    .line 39
    const/4 p2, 0x3

    .line 40
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, La/xgj;->h:La/ol60;

    .line 44
    .line 45
    iput-object p4, p0, La/xgj;->k:Ljava/util/List;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final w(ZLa/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, La/vgj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/vgj;

    .line 7
    .line 8
    iget v1, v0, La/vgj;->k:I

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
    iput v1, v0, La/vgj;->k:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/vgj;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/vgj;-><init>(La/xgj;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v6, La/vgj;->i:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/vgj;->k:I

    .line 32
    .line 33
    iget-object v7, p0, La/xgj;->h:La/ol60;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    const/4 v8, 0x0

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v2, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_4

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v8

    .line 51
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    if-eqz p1, :cond_9

    .line 55
    .line 56
    iget-object p1, p0, La/xgj;->k:Ljava/util/List;

    .line 57
    .line 58
    move p2, v2

    .line 59
    new-instance v2, Ljava/util/ArrayList;

    .line 60
    .line 61
    const/16 v1, 0xa

    .line 62
    .line 63
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, La/qhj;

    .line 85
    .line 86
    iget-boolean v3, p0, La/xgj;->j:Z

    .line 87
    .line 88
    invoke-static {v1, v3}, La/vfc;->M(La/qhj;Z)La/jwe;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    sget-object v3, La/gwe;->s:La/gwe;

    .line 97
    .line 98
    iget-object p1, p0, La/xgj;->k:Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    const-wide/16 v4, 0x0

    .line 109
    .line 110
    if-eqz v1, :cond_5

    .line 111
    .line 112
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    move-object v9, v1

    .line 117
    check-cast v9, La/qhj;

    .line 118
    .line 119
    iget-wide v9, v9, La/qhj;->s:J

    .line 120
    .line 121
    cmp-long v9, v9, v4

    .line 122
    .line 123
    if-eqz v9, :cond_4

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    move-object v1, v8

    .line 127
    :goto_3
    check-cast v1, La/qhj;

    .line 128
    .line 129
    if-eqz v1, :cond_6

    .line 130
    .line 131
    iget-wide v4, v1, La/qhj;->s:J

    .line 132
    .line 133
    :cond_6
    iput p2, v6, La/vgj;->k:I

    .line 134
    .line 135
    iget-object v1, p0, La/xgj;->d:La/gbi;

    .line 136
    .line 137
    invoke-virtual/range {v1 .. v6}, La/gbi;->B(Ljava/util/ArrayList;La/gwe;JLa/zje;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-ne p1, v0, :cond_7

    .line 142
    .line 143
    return-object v0

    .line 144
    :cond_7
    :goto_4
    iget-boolean p1, p0, La/xgj;->i:Z

    .line 145
    .line 146
    if-eqz p1, :cond_8

    .line 147
    .line 148
    sget-object p1, La/qgj;->a:La/qgj;

    .line 149
    .line 150
    invoke-virtual {v7, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    new-instance p1, La/xa50;

    .line 154
    .line 155
    invoke-direct {p1}, La/xa50;-><init>()V

    .line 156
    .line 157
    .line 158
    const/4 p2, 0x4

    .line 159
    iget-object p0, p0, La/xgj;->b:La/ouu;

    .line 160
    .line 161
    invoke-static {p0, p1, v8, p2}, La/ouu;->o(La/ouu;La/cb50;Lkotlin/jvm/functions/Function1;I)V

    .line 162
    .line 163
    .line 164
    new-instance p1, La/xa50;

    .line 165
    .line 166
    invoke-direct {p1}, La/xa50;-><init>()V

    .line 167
    .line 168
    .line 169
    iget-object p0, p0, La/ouu;->b:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p0, La/qe50;

    .line 172
    .line 173
    const/4 p2, 0x0

    .line 174
    invoke-virtual {p0, p1, p2}, La/qe50;->a(La/cb50;Z)V

    .line 175
    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_8
    sget-object p0, La/sgj;->a:La/sgj;

    .line 179
    .line 180
    invoke-virtual {v7, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto :goto_5

    .line 184
    :cond_9
    sget-object p0, La/rgj;->a:La/rgj;

    .line 185
    .line 186
    invoke-virtual {v7, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0
.end method
