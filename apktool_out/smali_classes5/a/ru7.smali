.class public final La/ru7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final a:La/ctf0;

.field public final b:I

.field public final c:La/n0o0;

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;

.field public final i:La/n0o0;

.field public final j:La/n0o0;

.field public final k:La/n0o0;

.field public final l:La/n0o0;


# direct methods
.method public constructor <init>(La/pu7;La/ctf0;JLjava/lang/String;La/mum0;I)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/ru7;->a:La/ctf0;

    .line 11
    .line 12
    const-wide/16 v0, 0x1

    .line 13
    .line 14
    cmp-long p2, p3, v0

    .line 15
    .line 16
    const v0, 0x7f080569

    .line 17
    .line 18
    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-wide/16 v1, 0x2

    .line 23
    .line 24
    cmp-long p2, p3, v1

    .line 25
    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    const v0, 0x7f0805ef

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-wide/16 v1, 0x3

    .line 33
    .line 34
    cmp-long p2, p3, v1

    .line 35
    .line 36
    if-nez p2, :cond_2

    .line 37
    .line 38
    const v0, 0x7f080283

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    iput v0, p0, La/ru7;->b:I

    .line 42
    .line 43
    new-instance p2, La/y02;

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    invoke-direct {p2, p7, v0}, La/y02;-><init>(IB)V

    .line 47
    .line 48
    .line 49
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iput-object p2, p0, La/ru7;->c:La/n0o0;

    .line 54
    .line 55
    new-instance p2, La/y02;

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    invoke-direct {p2, p7, v0}, La/y02;-><init>(IB)V

    .line 59
    .line 60
    .line 61
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    iput-object p2, p0, La/ru7;->d:La/n0o0;

    .line 66
    .line 67
    iget-object p2, p1, La/pu7;->a:La/qqp0;

    .line 68
    .line 69
    invoke-static {p2}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    iput-object p2, p0, La/ru7;->e:La/n0o0;

    .line 74
    .line 75
    iget-object p7, p1, La/pu7;->b:La/cu7;

    .line 76
    .line 77
    invoke-static {p7}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 78
    .line 79
    .line 80
    move-result-object p7

    .line 81
    iput-object p7, p0, La/ru7;->f:La/n0o0;

    .line 82
    .line 83
    iget-wide v1, p1, La/pu7;->c:J

    .line 84
    .line 85
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 86
    .line 87
    .line 88
    move-result-object p7

    .line 89
    invoke-static {p7}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 90
    .line 91
    .line 92
    move-result-object p7

    .line 93
    iput-object p7, p0, La/ru7;->g:La/n0o0;

    .line 94
    .line 95
    iget-object p1, p1, La/pu7;->d:La/a8h0;

    .line 96
    .line 97
    invoke-static {p1}, La/bkb;->H(Ljava/lang/Object;)La/n0o0;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object p1, p0, La/ru7;->h:La/n0o0;

    .line 102
    .line 103
    invoke-virtual {p2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    check-cast p1, La/fee;

    .line 108
    .line 109
    iget-object p1, p1, La/fee;->d:La/pz40;

    .line 110
    .line 111
    new-instance p7, La/os5;

    .line 112
    .line 113
    const/16 v1, 0x1a

    .line 114
    .line 115
    invoke-direct {p7, p0, v1}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 116
    .line 117
    .line 118
    invoke-static {p1, p7}, La/bkb;->G(La/l7m0;Lkotlin/jvm/functions/Function1;)La/n0o0;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, La/ru7;->i:La/n0o0;

    .line 123
    .line 124
    invoke-virtual {p2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    check-cast p1, La/fee;

    .line 129
    .line 130
    iget-object p1, p1, La/fee;->d:La/pz40;

    .line 131
    .line 132
    new-instance p7, La/op7;

    .line 133
    .line 134
    invoke-direct {p7, p0, p6, v0}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 135
    .line 136
    .line 137
    invoke-static {p1, p7}, La/bkb;->G(La/l7m0;Lkotlin/jvm/functions/Function1;)La/n0o0;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, La/ru7;->j:La/n0o0;

    .line 142
    .line 143
    invoke-virtual {p2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    check-cast p1, La/fee;

    .line 148
    .line 149
    iget-object p1, p1, La/fee;->d:La/pz40;

    .line 150
    .line 151
    new-instance v0, La/mz0;

    .line 152
    .line 153
    const/16 v5, 0x8

    .line 154
    .line 155
    move-object v1, p0

    .line 156
    move-wide v2, p3

    .line 157
    move-object v4, p5

    .line 158
    invoke-direct/range {v0 .. v5}, La/mz0;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 159
    .line 160
    .line 161
    invoke-static {p1, v0}, La/bkb;->G(La/l7m0;Lkotlin/jvm/functions/Function1;)La/n0o0;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    iput-object p0, v1, La/ru7;->k:La/n0o0;

    .line 166
    .line 167
    invoke-virtual {p2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    check-cast p0, La/fee;

    .line 172
    .line 173
    iget-object p0, p0, La/fee;->d:La/pz40;

    .line 174
    .line 175
    new-instance p1, La/op7;

    .line 176
    .line 177
    const/4 p2, 0x3

    .line 178
    invoke-direct {p1, v1, v4, p2}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 179
    .line 180
    .line 181
    invoke-static {p0, p1}, La/bkb;->G(La/l7m0;Lkotlin/jvm/functions/Function1;)La/n0o0;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    iput-object p0, v1, La/ru7;->l:La/n0o0;

    .line 186
    .line 187
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/pu7;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ru7;->e:La/n0o0;

    .line 7
    .line 8
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/fee;

    .line 13
    .line 14
    iget-object v1, p1, La/pu7;->a:La/qqp0;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, La/ru7;->f:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, La/fee;

    .line 26
    .line 27
    iget-object v1, p1, La/pu7;->b:La/cu7;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, La/ru7;->g:La/n0o0;

    .line 33
    .line 34
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, La/fee;

    .line 39
    .line 40
    iget-wide v1, p1, La/pu7;->c:J

    .line 41
    .line 42
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, La/ru7;->h:La/n0o0;

    .line 50
    .line 51
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, La/fee;

    .line 56
    .line 57
    iget-object p1, p1, La/pu7;->d:La/a8h0;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, La/fee;->d(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance v1, La/qu7;

    .line 63
    .line 64
    iget-object p1, p0, La/ru7;->i:La/n0o0;

    .line 65
    .line 66
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, La/fee;

    .line 71
    .line 72
    invoke-virtual {p1}, La/fee;->b()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    move-object v2, p1

    .line 77
    check-cast v2, La/imm;

    .line 78
    .line 79
    iget-object p1, p0, La/ru7;->j:La/n0o0;

    .line 80
    .line 81
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    check-cast p1, La/fee;

    .line 86
    .line 87
    invoke-virtual {p1}, La/fee;->b()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    move-object v4, p1

    .line 92
    check-cast v4, La/qwh0;

    .line 93
    .line 94
    iget-object p1, p0, La/ru7;->k:La/n0o0;

    .line 95
    .line 96
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, La/fee;

    .line 101
    .line 102
    invoke-virtual {p1}, La/fee;->b()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    move-object v5, p1

    .line 107
    check-cast v5, La/le40;

    .line 108
    .line 109
    iget-object p1, p0, La/ru7;->l:La/n0o0;

    .line 110
    .line 111
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, La/fee;

    .line 116
    .line 117
    invoke-virtual {p1}, La/fee;->b()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    move-object v6, p1

    .line 122
    check-cast v6, La/tn8;

    .line 123
    .line 124
    iget v3, p0, La/ru7;->b:I

    .line 125
    .line 126
    invoke-direct/range {v1 .. v6}, La/qu7;-><init>(La/imm;ILa/qwh0;La/le40;La/tn8;)V

    .line 127
    .line 128
    .line 129
    return-object v1
.end method
