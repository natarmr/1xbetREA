.class public final La/z38;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/d48;


# direct methods
.method public synthetic constructor <init>(La/d48;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z38;->i:B

    iput-object p1, p0, La/z38;->j:La/d48;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/z38;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/z38;->j:La/d48;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/z38;

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/z38;-><init>(La/d48;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/z38;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/z38;-><init>(La/d48;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/z38;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/z38;-><init>(La/d48;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/z38;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/z38;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/z38;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/z38;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/z38;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/z38;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/z38;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/kmq;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/z38;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/z38;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/z38;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/z38;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/z38;->j:La/d48;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object p0, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, v2, La/d48;->B:La/p7m0;

    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    move-object v3, p1

    .line 21
    check-cast v3, La/v38;

    .line 22
    .line 23
    new-instance v8, Landroid/text/SpannableStringBuilder;

    .line 24
    .line 25
    iget-object v0, v2, La/d48;->x:La/ctf0;

    .line 26
    .line 27
    new-array v4, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 30
    .line 31
    invoke-static {v4, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const v5, 0x7f13005f

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {v8, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 43
    .line 44
    .line 45
    const/16 v9, 0xbf

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    const/4 v5, 0x0

    .line 49
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    invoke-static/range {v3 .. v9}, La/v38;->a(La/v38;La/kbn;Ljava/lang/String;ZZLandroid/text/SpannableStringBuilder;I)La/v38;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_0

    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    sget-object p0, La/wne;->a:La/wne;

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p0, v2, La/d48;->C:La/ol60;

    .line 70
    .line 71
    new-instance p1, La/q38;

    .line 72
    .line 73
    iget-object v0, v2, La/d48;->x:La/ctf0;

    .line 74
    .line 75
    new-array v2, v1, [Ljava/lang/Object;

    .line 76
    .line 77
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 78
    .line 79
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    const v2, 0x7f1307c9

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {p1, v0}, La/q38;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 100
    .line 101
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object v3, p0, La/z38;->j:La/d48;

    .line 105
    .line 106
    iget-object p0, v3, La/d48;->H:La/c4m0;

    .line 107
    .line 108
    if-eqz p0, :cond_1

    .line 109
    .line 110
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    const/4 p1, 0x1

    .line 115
    if-ne p0, p1, :cond_1

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_1
    iget-object p0, v3, La/d48;->w:La/m1e;

    .line 119
    .line 120
    invoke-interface {p0}, La/m1e;->b()La/gmq;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance p1, La/qv3;

    .line 125
    .line 126
    const/4 v0, 0x0

    .line 127
    const/16 v1, 0xe

    .line 128
    .line 129
    invoke-direct {p1, v3, v0, v1}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 130
    .line 131
    .line 132
    new-instance v0, La/fnq;

    .line 133
    .line 134
    const/4 v1, 0x4

    .line 135
    invoke-direct {v0, p0, p1, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 136
    .line 137
    .line 138
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    iget-object p1, v3, La/d48;->d:La/mne;

    .line 143
    .line 144
    iget-object p1, p1, La/mne;->a:La/rwj;

    .line 145
    .line 146
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    new-instance v1, La/c48;

    .line 151
    .line 152
    const/4 v7, 0x4

    .line 153
    const/4 v8, 0x0

    .line 154
    const/4 v2, 0x2

    .line 155
    const-class v4, La/d48;

    .line 156
    .line 157
    const-string v5, "localHandleError"

    .line 158
    .line 159
    const-string v6, "localHandleError(Ljava/lang/Throwable;)V"

    .line 160
    .line 161
    invoke-direct/range {v1 .. v8}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 162
    .line 163
    .line 164
    invoke-static {v0, p0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    iput-object p0, v3, La/d48;->H:La/c4m0;

    .line 169
    .line 170
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
