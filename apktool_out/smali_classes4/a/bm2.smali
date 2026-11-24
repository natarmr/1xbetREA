.class public final La/bm2;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/vzg0;

.field public final p:La/gg5;

.field public final q:La/pru;

.field public final r:La/s31;


# direct methods
.method public constructor <init>(La/vzg0;La/mne;La/ctf0;La/gg5;La/pru;La/s31;)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p2, La/mne;->a:La/rwj;

    .line 5
    .line 6
    invoke-static {p2, p2}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    new-instance v0, La/t32;

    .line 11
    .line 12
    const/16 v1, 0xb

    .line 13
    .line 14
    invoke-direct {v0, v1}, La/t32;-><init>(B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/uc;

    .line 18
    .line 19
    const/16 v2, 0x1a

    .line 20
    .line 21
    invoke-direct {v1, p3, v2}, La/uc;-><init>(La/ctf0;B)V

    .line 22
    .line 23
    .line 24
    const/4 p3, 0x0

    .line 25
    invoke-direct {p0, v0, p2, v1, p3}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/bm2;->o:La/vzg0;

    .line 29
    .line 30
    iput-object p4, p0, La/bm2;->p:La/gg5;

    .line 31
    .line 32
    iput-object p5, p0, La/bm2;->q:La/pru;

    .line 33
    .line 34
    iput-object p6, p0, La/bm2;->r:La/s31;

    .line 35
    .line 36
    new-instance p1, La/m91;

    .line 37
    .line 38
    const/4 p2, 0x3

    .line 39
    invoke-direct {p1, p0, p3, p2}, La/m91;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, p3, p3, p1, p2}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 43
    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, La/yl2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, La/vl2;->a:La/vl2;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    instance-of v0, p1, La/wl2;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eqz v0, :cond_5

    .line 25
    .line 26
    check-cast p1, La/wl2;

    .line 27
    .line 28
    iget-wide v2, p1, La/wl2;->a:J

    .line 29
    .line 30
    sget-object p1, La/ih2;->h:La/c0o;

    .line 31
    .line 32
    invoke-virtual {p1}, La/b3;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v4, 0x0

    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    move-object v5, v0

    .line 48
    check-cast v5, La/ih2;

    .line 49
    .line 50
    iget-byte v5, v5, La/ih2;->a:B

    .line 51
    .line 52
    int-to-long v5, v5

    .line 53
    cmp-long v5, v5, v2

    .line 54
    .line 55
    if-nez v5, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object v0, v4

    .line 59
    :goto_0
    check-cast v0, La/ih2;

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    iget-object p1, p0, La/bm2;->o:La/vzg0;

    .line 65
    .line 66
    const-string v2, "CURRENT_SPORT_TAB_KEY"

    .line 67
    .line 68
    invoke-virtual {p1, v2, v0}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 72
    .line 73
    iget-object v2, p1, La/ocj;->a:La/p7m0;

    .line 74
    .line 75
    :cond_4
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-object v3, p1

    .line 83
    check-cast v3, La/zl2;

    .line 84
    .line 85
    iget-object v5, p0, La/i3t0;->f:La/oyg0;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-static {v3, v4, v0, v1}, La/zl2;->a(La/zl2;Ljava/util/List;La/ih2;I)La/zl2;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    invoke-virtual {v2, p1, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_4

    .line 99
    .line 100
    return-void

    .line 101
    :cond_5
    instance-of p1, p1, La/xl2;

    .line 102
    .line 103
    if-eqz p1, :cond_a

    .line 104
    .line 105
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    check-cast p1, La/zl2;

    .line 110
    .line 111
    iget-object p1, p1, La/zl2;->b:La/ih2;

    .line 112
    .line 113
    sget-object v0, La/vcp;->b:La/vcp;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    const-string v0, "categoryImageHeader"

    .line 120
    .line 121
    iget-object v2, p0, La/bm2;->p:La/gg5;

    .line 122
    .line 123
    iget-object p0, p0, La/bm2;->r:La/s31;

    .line 124
    .line 125
    if-eqz p1, :cond_9

    .line 126
    .line 127
    if-eq p1, v1, :cond_8

    .line 128
    .line 129
    const/4 v1, 0x2

    .line 130
    if-eq p1, v1, :cond_7

    .line 131
    .line 132
    const/4 v1, 0x3

    .line 133
    if-eq p1, v1, :cond_6

    .line 134
    .line 135
    :goto_1
    return-void

    .line 136
    :cond_6
    sget-object p1, La/qfp;->e:La/qfp;

    .line 137
    .line 138
    invoke-virtual {p0, v0, p1}, La/s31;->J(Ljava/lang/String;La/qfp;)V

    .line 139
    .line 140
    .line 141
    sget-object p0, La/nfp;->e:La/nfp;

    .line 142
    .line 143
    invoke-virtual {v2, v0, p0}, La/gg5;->u(Ljava/lang/String;La/nfp;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_7
    sget-object p1, La/qfp;->d:La/qfp;

    .line 148
    .line 149
    invoke-virtual {p0, v0, p1}, La/s31;->J(Ljava/lang/String;La/qfp;)V

    .line 150
    .line 151
    .line 152
    sget-object p0, La/nfp;->d:La/nfp;

    .line 153
    .line 154
    invoke-virtual {v2, v0, p0}, La/gg5;->u(Ljava/lang/String;La/nfp;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_8
    sget-object p1, La/qfp;->c:La/qfp;

    .line 159
    .line 160
    invoke-virtual {p0, v0, p1}, La/s31;->J(Ljava/lang/String;La/qfp;)V

    .line 161
    .line 162
    .line 163
    sget-object p0, La/nfp;->c:La/nfp;

    .line 164
    .line 165
    invoke-virtual {v2, v0, p0}, La/gg5;->u(Ljava/lang/String;La/nfp;)V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :cond_9
    sget-object p1, La/qfp;->b:La/qfp;

    .line 170
    .line 171
    invoke-virtual {p0, v0, p1}, La/s31;->J(Ljava/lang/String;La/qfp;)V

    .line 172
    .line 173
    .line 174
    sget-object p0, La/nfp;->b:La/nfp;

    .line 175
    .line 176
    invoke-virtual {v2, v0, p0}, La/gg5;->u(Ljava/lang/String;La/nfp;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 181
    .line 182
    .line 183
    return-void
.end method
