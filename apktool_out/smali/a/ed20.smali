.class public final synthetic La/ed20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qg20;


# direct methods
.method public synthetic constructor <init>(La/qg20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ed20;->a:B

    iput-object p1, p0, La/ed20;->b:La/qg20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/ed20;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/ed20;->b:La/qg20;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Throwable;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p2, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/qg20;->U0:La/p7m0;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object p1, La/gm5;->a:La/gm5;

    .line 23
    .line 24
    invoke-virtual {p0, v2, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    move-object v2, p2

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, La/qg20;->W0:La/ol60;

    .line 37
    .line 38
    new-instance p1, La/uuj0;

    .line 39
    .line 40
    new-instance v0, La/xdk0;

    .line 41
    .line 42
    sget-object v1, La/rek0;->b:La/rek0;

    .line 43
    .line 44
    const/4 v6, 0x0

    .line 45
    const/16 v7, 0x7c

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    const/4 v4, 0x0

    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p1, v0}, La/uuj0;-><init>(La/xdk0;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_1
    check-cast p2, Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, La/qg20;->n1:La/p7m0;

    .line 71
    .line 72
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    move-object p1, p0

    .line 77
    check-cast p1, La/rn20;

    .line 78
    .line 79
    const/4 p2, 0x5

    .line 80
    invoke-static {p1, v1, v1, v1, p2}, La/rn20;->a(La/rn20;ZZZI)La/rn20;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_0

    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_2
    check-cast p2, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, La/qg20;->d0()V

    .line 102
    .line 103
    .line 104
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_3
    move-object v5, p2

    .line 108
    check-cast v5, Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v5, p1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    instance-of p2, p1, La/zhi0;

    .line 114
    .line 115
    if-eqz p2, :cond_1

    .line 116
    .line 117
    move-object v0, p1

    .line 118
    check-cast v0, La/zhi0;

    .line 119
    .line 120
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 121
    .line 122
    sget-object v3, La/i2o;->n2:La/i2o;

    .line 123
    .line 124
    if-eq v0, v3, :cond_2

    .line 125
    .line 126
    :cond_1
    iget-object v0, p0, La/qg20;->g0:La/ni9;

    .line 127
    .line 128
    iget-object v0, v0, La/ni9;->a:La/g45;

    .line 129
    .line 130
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, La/lye;

    .line 133
    .line 134
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    :cond_2
    if-eqz p2, :cond_3

    .line 138
    .line 139
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    sget-object v7, La/gf20;->a:La/gf20;

    .line 144
    .line 145
    iget-object p2, p0, La/qg20;->d:La/mne;

    .line 146
    .line 147
    iget-object v9, p2, La/mne;->a:La/rwj;

    .line 148
    .line 149
    new-instance v10, La/p4z;

    .line 150
    .line 151
    invoke-direct {v10, p0, p1, v2}, La/p4z;-><init>(La/qg20;Ljava/lang/Throwable;La/yje;)V

    .line 152
    .line 153
    .line 154
    const/16 v11, 0xa

    .line 155
    .line 156
    const/4 v8, 0x0

    .line 157
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 158
    .line 159
    .line 160
    check-cast p1, La/zhi0;

    .line 161
    .line 162
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 163
    .line 164
    invoke-virtual {p0, p1, v5, v1}, La/qg20;->O(La/kuw;Ljava/lang/String;Z)V

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_3
    invoke-static {p1}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_4

    .line 173
    .line 174
    invoke-virtual {p0}, La/qg20;->h0()V

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_4
    invoke-virtual {p0}, La/qg20;->c0()V

    .line 179
    .line 180
    .line 181
    iget-object p0, p0, La/qg20;->W0:La/ol60;

    .line 182
    .line 183
    new-instance p1, La/uuj0;

    .line 184
    .line 185
    new-instance v3, La/xdk0;

    .line 186
    .line 187
    sget-object v4, La/rek0;->b:La/rek0;

    .line 188
    .line 189
    const/4 v9, 0x0

    .line 190
    const/16 v10, 0x7c

    .line 191
    .line 192
    const/4 v6, 0x0

    .line 193
    const/4 v7, 0x0

    .line 194
    const/4 v8, 0x0

    .line 195
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 196
    .line 197
    .line 198
    invoke-direct {p1, v3}, La/uuj0;-><init>(La/xdk0;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object p0

    .line 207
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
