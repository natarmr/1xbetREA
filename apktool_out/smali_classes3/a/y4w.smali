.class public final La/y4w;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/z4w;

.field public final synthetic k:La/n3w;


# direct methods
.method public synthetic constructor <init>(La/z4w;La/n3w;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/y4w;->i:B

    iput-object p1, p0, La/y4w;->j:La/z4w;

    iput-object p2, p0, La/y4w;->k:La/n3w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/y4w;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/y4w;

    .line 7
    .line 8
    iget-object v0, p0, La/y4w;->k:La/n3w;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    iget-object p0, p0, La/y4w;->j:La/z4w;

    .line 12
    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/y4w;-><init>(La/z4w;La/n3w;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/y4w;

    .line 18
    .line 19
    iget-object v0, p0, La/y4w;->k:La/n3w;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iget-object p0, p0, La/y4w;->j:La/z4w;

    .line 23
    .line 24
    invoke-direct {p1, p0, v0, p2, v1}, La/y4w;-><init>(La/z4w;La/n3w;La/yje;B)V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/y4w;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/y4w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/y4w;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/y4w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/y4w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/y4w;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/y4w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/y4w;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/y4w;->k:La/n3w;

    .line 5
    .line 6
    iget-object p0, p0, La/y4w;->j:La/z4w;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, La/z4w;->h:La/o470;

    .line 17
    .line 18
    invoke-static {v2}, La/piz;->X(La/n3w;)La/uob0;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1, v0}, La/o470;->g(La/uob0;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, La/z4w;->m:La/i1w0;

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance v3, Lorg/xplatform/bethistory/powerbet/presentation/PowerbetOldScreen;

    .line 33
    .line 34
    iget-object v2, v2, La/n3w;->a:Ljava/lang/String;

    .line 35
    .line 36
    iget-wide v4, p0, La/z4w;->x:J

    .line 37
    .line 38
    invoke-direct {v3, v2, v4, v5}, Lorg/xplatform/bethistory/powerbet/presentation/PowerbetOldScreen;-><init>(Ljava/lang/String;J)V

    .line 39
    .line 40
    .line 41
    instance-of p0, v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 42
    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    new-instance p0, La/e1w0;

    .line 46
    .line 47
    check-cast v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 48
    .line 49
    invoke-direct {p0, v3}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 50
    .line 51
    .line 52
    new-instance v2, La/c8d;

    .line 53
    .line 54
    sget-object v3, La/y7d;->a:La/v7d;

    .line 55
    .line 56
    invoke-direct {v2, v3, p0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    new-instance p0, La/w0w0;

    .line 64
    .line 65
    invoke-direct {p0, v3}, La/w0w0;-><init>(La/m7h0;)V

    .line 66
    .line 67
    .line 68
    new-instance v2, La/c8d;

    .line 69
    .line 70
    sget-object v3, La/y7d;->a:La/v7d;

    .line 71
    .line 72
    invoke-direct {v2, v3, p0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :goto_0
    invoke-static {p1, v0, v1}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :goto_1
    move-object v0, p0

    .line 83
    check-cast v0, La/paw;

    .line 84
    .line 85
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, La/oe50;

    .line 96
    .line 97
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 105
    .line 106
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, La/z4w;->u:La/ol60;

    .line 110
    .line 111
    new-instance v0, La/i4w;

    .line 112
    .line 113
    invoke-direct {v0, v2}, La/i4w;-><init>(La/n3w;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, La/z4w;->k:La/ctf0;

    .line 120
    .line 121
    new-array v0, v1, [Ljava/lang/Object;

    .line 122
    .line 123
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 124
    .line 125
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const v3, 0x7f130e4a

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    iget-object v0, v2, La/n3w;->a:Ljava/lang/String;

    .line 137
    .line 138
    const-string v2, " "

    .line 139
    .line 140
    invoke-static {p1, v2, v0}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iget-object v0, p0, La/z4w;->u:La/ol60;

    .line 145
    .line 146
    iget-object v2, p0, La/z4w;->w:La/sys0;

    .line 147
    .line 148
    sget-object v3, La/sys0;->c:La/sys0;

    .line 149
    .line 150
    if-eq v2, v3, :cond_2

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_2
    const/4 p1, 0x0

    .line 154
    :goto_2
    if-nez p1, :cond_3

    .line 155
    .line 156
    const-string p1, ""

    .line 157
    .line 158
    :cond_3
    new-instance v2, La/q4w;

    .line 159
    .line 160
    invoke-direct {v2, p1}, La/q4w;-><init>(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v1}, La/z4w;->C(Z)V

    .line 167
    .line 168
    .line 169
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object p0

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
