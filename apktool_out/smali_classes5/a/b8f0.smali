.class public final La/b8f0;
.super La/i3t0;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final o:La/dmt;

.field public final p:La/jru;

.field public final q:La/i1w0;

.field public final r:La/ag3;

.field public final s:La/je;

.field public final t:La/s64;


# direct methods
.method public constructor <init>(La/vzg0;La/ctf0;La/dmt;La/jru;La/i1w0;La/ag3;La/je;La/s64;La/rqt;La/bzt;La/pru;La/mne;)V
    .locals 6

    .line 1
    move-object/from16 p1, p12

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v2, La/p2e0;

    .line 7
    .line 8
    move-object/from16 v0, p11

    .line 9
    .line 10
    invoke-direct {v2, v0, p9}, La/p2e0;-><init>(La/pru;La/rqt;)V

    .line 11
    .line 12
    .line 13
    new-instance v3, La/a8f0;

    .line 14
    .line 15
    move-object/from16 p9, p10

    .line 16
    .line 17
    invoke-direct {v3, p2, p9}, La/a8f0;-><init>(La/ctf0;La/bzt;)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p1, La/mne;->c:La/vs10;

    .line 21
    .line 22
    iget-object p1, p1, La/mne;->a:La/rwj;

    .line 23
    .line 24
    invoke-static {p2, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    move-object v0, p0

    .line 31
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 32
    .line 33
    .line 34
    iput-object p3, p0, La/b8f0;->o:La/dmt;

    .line 35
    .line 36
    iput-object p4, p0, La/b8f0;->p:La/jru;

    .line 37
    .line 38
    iput-object p5, p0, La/b8f0;->q:La/i1w0;

    .line 39
    .line 40
    iput-object p6, p0, La/b8f0;->r:La/ag3;

    .line 41
    .line 42
    iput-object p7, p0, La/b8f0;->s:La/je;

    .line 43
    .line 44
    iput-object p8, p0, La/b8f0;->t:La/s64;

    .line 45
    .line 46
    new-instance p1, La/hhb0;

    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    const/4 p3, 0x3

    .line 50
    invoke-direct {p1, p0, p2, p3}, La/hhb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, p2, p2, p1, p3}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p1, La/u7f0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, La/t7f0;

    .line 7
    .line 8
    if-eqz v0, :cond_6

    .line 9
    .line 10
    check-cast p1, La/t7f0;

    .line 11
    .line 12
    iget-object p1, p1, La/t7f0;->a:La/q7f0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const-wide/16 v1, 0xbcd

    .line 19
    .line 20
    iget-object v3, p0, La/b8f0;->s:La/je;

    .line 21
    .line 22
    const-string v4, "option"

    .line 23
    .line 24
    const-string v5, "reg_option"

    .line 25
    .line 26
    iget-object v6, p0, La/b8f0;->r:La/ag3;

    .line 27
    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    const/4 v7, 0x1

    .line 31
    if-eq v0, v7, :cond_3

    .line 32
    .line 33
    const/4 v7, 0x2

    .line 34
    if-eq v0, v7, :cond_2

    .line 35
    .line 36
    const/4 v7, 0x3

    .line 37
    if-eq v0, v7, :cond_1

    .line 38
    .line 39
    const/4 v7, 0x4

    .line 40
    if-ne v0, v7, :cond_0

    .line 41
    .line 42
    iget-object v0, v6, La/ag3;->a:La/kt2;

    .line 43
    .line 44
    const-string v6, "itsme"

    .line 45
    .line 46
    invoke-static {v4, v6, v0, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v0, v3, La/je;->a:La/s1p;

    .line 50
    .line 51
    invoke-static {v6, v0, v1, v2}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    iget-object v0, v6, La/ag3;->a:La/kt2;

    .line 60
    .line 61
    const-string v6, "social_media"

    .line 62
    .line 63
    invoke-static {v4, v6, v0, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, v3, La/je;->a:La/s1p;

    .line 67
    .line 68
    invoke-static {v6, v0, v1, v2}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    iget-object v0, v6, La/ag3;->a:La/kt2;

    .line 73
    .line 74
    const-string v6, "one_click"

    .line 75
    .line 76
    invoke-static {v4, v6, v0, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, v3, La/je;->a:La/s1p;

    .line 80
    .line 81
    invoke-static {v6, v0, v1, v2}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    iget-object v0, v6, La/ag3;->a:La/kt2;

    .line 86
    .line 87
    const-string v6, "phone"

    .line 88
    .line 89
    invoke-static {v4, v6, v0, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, v3, La/je;->a:La/s1p;

    .line 93
    .line 94
    invoke-static {v6, v0, v1, v2}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    iget-object v0, v6, La/ag3;->a:La/kt2;

    .line 99
    .line 100
    const-string v6, "full"

    .line 101
    .line 102
    invoke-static {v4, v6, v0, v5}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, v3, La/je;->a:La/s1p;

    .line 106
    .line 107
    invoke-static {v6, v0, v1, v2}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 108
    .line 109
    .line 110
    :goto_0
    iget-object v0, p0, La/b8f0;->q:La/i1w0;

    .line 111
    .line 112
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    new-instance v2, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;

    .line 117
    .line 118
    invoke-direct {v2, p1}, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;-><init>(La/q7f0;)V

    .line 119
    .line 120
    .line 121
    iget-object p0, p0, La/b8f0;->o:La/dmt;

    .line 122
    .line 123
    invoke-virtual {p0, v2}, La/dmt;->a(Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;)Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {v1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 128
    .line 129
    .line 130
    iget-object p0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 131
    .line 132
    const/4 p1, 0x0

    .line 133
    invoke-static {v0, p0, p1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    :goto_1
    move-object p1, p0

    .line 138
    check-cast p1, La/paw;

    .line 139
    .line 140
    invoke-virtual {p1}, La/paw;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_5

    .line 145
    .line 146
    invoke-virtual {p1}, La/paw;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, La/oe50;

    .line 151
    .line 152
    invoke-virtual {v0, p1}, La/i1w0;->a(La/oe50;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_5
    return-void

    .line 157
    :cond_6
    sget-object v0, La/s7f0;->a:La/s7f0;

    .line 158
    .line 159
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    sget-object p1, La/y1p;->b:La/y1p;

    .line 166
    .line 167
    const-string p1, "registration"

    .line 168
    .line 169
    iget-object v0, p0, La/b8f0;->t:La/s64;

    .line 170
    .line 171
    invoke-virtual {v0, p1}, La/s64;->c(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    sget-object p1, La/x7f0;->a:La/x7f0;

    .line 175
    .line 176
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_7
    sget-object v0, La/r7f0;->a:La/r7f0;

    .line 181
    .line 182
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_8

    .line 187
    .line 188
    invoke-virtual {p0}, La/i3t0;->E()V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 193
    .line 194
    .line 195
    return-void
.end method
