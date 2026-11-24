.class public final La/tdi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/uci;


# direct methods
.method public constructor <init>(La/uci;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/tdi;->a:La/uci;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 8

    .line 1
    new-instance p1, La/j3g;

    .line 2
    .line 3
    iget-object p0, p0, La/tdi;->a:La/uci;

    .line 4
    .line 5
    iget-object p0, p0, La/uci;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/udi;

    .line 8
    .line 9
    iget-object v0, p0, La/udi;->a:La/xhi;

    .line 10
    .line 11
    invoke-virtual {v0}, La/xhi;->e()La/b8u;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/j910;

    .line 16
    .line 17
    iget-object v2, p0, La/udi;->a:La/xhi;

    .line 18
    .line 19
    invoke-virtual {v2}, La/xhi;->e()La/b8u;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    new-instance v4, La/pv00;

    .line 24
    .line 25
    iget-object v5, v2, La/xhi;->T:La/n5d0;

    .line 26
    .line 27
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, La/q530;

    .line 32
    .line 33
    invoke-static {v5}, La/x1x;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v4, v5}, La/pv00;-><init>(La/q530;)V

    .line 37
    .line 38
    .line 39
    const/16 v5, 0x8

    .line 40
    .line 41
    invoke-direct {v1, v3, v4, v5}, La/j910;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 42
    .line 43
    .line 44
    iget-object v2, v2, La/xhi;->S:La/n5d0;

    .line 45
    .line 46
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, La/ros;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, La/udi;->b:La/cad;

    .line 56
    .line 57
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, La/psc;

    .line 60
    .line 61
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v4, p0, La/mne;->c:La/vs10;

    .line 69
    .line 70
    iget-object p0, p0, La/mne;->a:La/rwj;

    .line 71
    .line 72
    invoke-static {v4, p0}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    new-instance v5, La/dpf;

    .line 77
    .line 78
    const/16 v6, 0x13

    .line 79
    .line 80
    invoke-direct {v5, v6}, La/dpf;-><init>(B)V

    .line 81
    .line 82
    .line 83
    new-instance v6, La/vlf;

    .line 84
    .line 85
    const/16 v7, 0xb

    .line 86
    .line 87
    invoke-direct {v6, v7}, La/vlf;-><init>(B)V

    .line 88
    .line 89
    .line 90
    const/4 v7, 0x0

    .line 91
    invoke-direct {p1, v5, v4, v6, v7}, La/i3t0;-><init>(Lkotlin/jvm/functions/Function0;La/g090;Lkotlin/jvm/functions/Function1;La/yzn0;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, La/b8u;->d()La/p7m0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    new-instance v4, La/fob;

    .line 99
    .line 100
    const/16 v5, 0x19

    .line 101
    .line 102
    invoke-direct {v4, p1, v7, v5}, La/fob;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 103
    .line 104
    .line 105
    new-instance v5, La/fnq;

    .line 106
    .line 107
    const/4 v6, 0x4

    .line 108
    invoke-direct {v5, v0, v4, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 109
    .line 110
    .line 111
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0, p0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v4, La/foe;->h:La/foe;

    .line 120
    .line 121
    invoke-static {v5, v0, v4}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iput-object v0, p1, La/j3g;->o:La/c4m0;

    .line 126
    .line 127
    invoke-virtual {v3}, La/b8u;->d()La/p7m0;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    new-instance v3, La/m430;

    .line 132
    .line 133
    const/4 v5, 0x5

    .line 134
    invoke-direct {v3, v0, v1, v5}, La/m430;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 135
    .line 136
    .line 137
    new-instance v0, La/za60;

    .line 138
    .line 139
    const/4 v5, 0x3

    .line 140
    invoke-direct {v0, v7, v1, v5}, La/za60;-><init>(La/yje;Ljava/lang/Object;B)V

    .line 141
    .line 142
    .line 143
    invoke-static {v3, v0}, La/aoq;->c(La/gmq;La/xdr;)La/utb;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-static {v0}, La/i120;->W(La/gmq;)La/gmq;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    new-instance v1, La/i3g;

    .line 152
    .line 153
    const/4 v3, 0x0

    .line 154
    invoke-direct {v1, p1, v7, v3}, La/i3g;-><init>(La/j3g;La/yje;B)V

    .line 155
    .line 156
    .line 157
    new-instance v3, La/fnq;

    .line 158
    .line 159
    invoke-direct {v3, v0, v1, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 160
    .line 161
    .line 162
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v0, p0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v3, v0, v4}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iput-object v0, p1, La/j3g;->p:La/c4m0;

    .line 175
    .line 176
    iget-object v0, v2, La/ros;->b:La/zks;

    .line 177
    .line 178
    iget-object v0, v0, La/zks;->c:La/p7m0;

    .line 179
    .line 180
    new-instance v1, La/h2c;

    .line 181
    .line 182
    const/16 v2, 0x12

    .line 183
    .line 184
    invoke-direct {v1, v0, v2}, La/h2c;-><init>(La/p7m0;B)V

    .line 185
    .line 186
    .line 187
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    new-instance v1, La/i3g;

    .line 192
    .line 193
    const/4 v2, 0x1

    .line 194
    invoke-direct {v1, p1, v7, v2}, La/i3g;-><init>(La/j3g;La/yje;B)V

    .line 195
    .line 196
    .line 197
    new-instance v2, La/fnq;

    .line 198
    .line 199
    invoke-direct {v2, v0, v1, v6}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 200
    .line 201
    .line 202
    invoke-static {p1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-static {v0, p0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-static {v2, p0, v4}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    iput-object p0, p1, La/j3g;->q:La/c4m0;

    .line 215
    .line 216
    return-object p1
.end method
