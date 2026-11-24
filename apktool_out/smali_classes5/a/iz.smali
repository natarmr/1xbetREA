.class public final synthetic La/iz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mz;


# direct methods
.method public synthetic constructor <init>(La/mz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/iz;->a:B

    iput-object p1, p0, La/iz;->b:La/mz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/iz;->a:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/iz;->b:La/mz;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/vqp;

    .line 12
    .line 13
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/mz;->H0()La/g00;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-object v0, p0, La/g00;->p:La/mne;

    .line 23
    .line 24
    iget-object v4, p0, La/g00;->z:La/ol60;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eq p1, v2, :cond_3

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    if-eq p1, v2, :cond_2

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x5

    .line 37
    if-eq p1, v6, :cond_1

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object p0, p0, La/g00;->g:La/pru;

    .line 43
    .line 44
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    iget-object p0, p0, La/sff0;->N:La/co4;

    .line 49
    .line 50
    iget p0, p0, La/co4;->n:I

    .line 51
    .line 52
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    neg-int p0, p0

    .line 57
    invoke-virtual {p1, v5, p0}, Ljava/util/Calendar;->add(II)V

    .line 58
    .line 59
    .line 60
    const/4 p0, -0x1

    .line 61
    invoke-virtual {p1, v6, p0}, Ljava/util/Calendar;->add(II)V

    .line 62
    .line 63
    .line 64
    new-instance p0, La/tz;

    .line 65
    .line 66
    invoke-direct {p0, p1}, La/tz;-><init>(Ljava/util/Calendar;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, p0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object v8, v0, La/mne;->a:La/rwj;

    .line 78
    .line 79
    new-instance v6, La/nz;

    .line 80
    .line 81
    invoke-direct {v6, p0, v2}, La/nz;-><init>(La/g00;B)V

    .line 82
    .line 83
    .line 84
    new-instance v9, La/d00;

    .line 85
    .line 86
    invoke-direct {v9, p0, v3, v5}, La/d00;-><init>(La/g00;La/yje;B)V

    .line 87
    .line 88
    .line 89
    const/16 v10, 0xa

    .line 90
    .line 91
    const/4 v7, 0x0

    .line 92
    move-object v5, p1

    .line 93
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-object v0, v0, La/mne;->a:La/rwj;

    .line 102
    .line 103
    new-instance v1, La/nz;

    .line 104
    .line 105
    const/4 v2, 0x2

    .line 106
    invoke-direct {v1, p0, v2}, La/nz;-><init>(La/g00;B)V

    .line 107
    .line 108
    .line 109
    new-instance v4, La/d00;

    .line 110
    .line 111
    invoke-direct {v4, p0, v3, v2}, La/d00;-><init>(La/g00;La/yje;B)V

    .line 112
    .line 113
    .line 114
    const/16 v5, 0xa

    .line 115
    .line 116
    const/4 v2, 0x0

    .line 117
    move-object v3, v0

    .line 118
    move-object v0, p1

    .line 119
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_3
    new-instance p1, La/rz;

    .line 124
    .line 125
    invoke-virtual {p0}, La/g00;->w()I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    invoke-direct {p1, p0}, La/rz;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v4, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_0
    check-cast p1, La/qkt;

    .line 139
    .line 140
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, La/mz;->H0()La/g00;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    iget-object v0, p0, La/g00;->p:La/mne;

    .line 154
    .line 155
    iget-object v7, v0, La/mne;->a:La/rwj;

    .line 156
    .line 157
    new-instance v5, La/nz;

    .line 158
    .line 159
    invoke-direct {v5, p0, v2}, La/nz;-><init>(La/g00;B)V

    .line 160
    .line 161
    .line 162
    new-instance v8, La/qa;

    .line 163
    .line 164
    invoke-direct {v8, p0, p1, v3, v1}, La/qa;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 165
    .line 166
    .line 167
    const/16 v9, 0xa

    .line 168
    .line 169
    const/4 v6, 0x0

    .line 170
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 171
    .line 172
    .line 173
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_1
    check-cast p1, La/rue0;

    .line 177
    .line 178
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, La/mz;->H0()La/g00;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    sget-object v0, La/vqp;->g:La/vqp;

    .line 188
    .line 189
    invoke-virtual {p0, p1, v0}, La/g00;->z(La/rue0;La/vqp;)V

    .line 190
    .line 191
    .line 192
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object p0

    .line 195
    :pswitch_2
    check-cast p1, La/rue0;

    .line 196
    .line 197
    sget-object v0, La/mz;->V1:La/jdk0;

    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, La/mz;->H0()La/g00;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    sget-object v0, La/vqp;->f:La/vqp;

    .line 207
    .line 208
    invoke-virtual {p0, p1, v0}, La/g00;->z(La/rue0;La/vqp;)V

    .line 209
    .line 210
    .line 211
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object p0

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
