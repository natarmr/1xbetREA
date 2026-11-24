.class public final La/t1j;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/u1j;


# direct methods
.method public synthetic constructor <init>(La/u1j;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/t1j;->i:B

    iput-object p1, p0, La/t1j;->j:La/u1j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/t1j;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/t1j;->j:La/u1j;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/t1j;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/t1j;-><init>(La/u1j;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/t1j;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/t1j;-><init>(La/u1j;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/t1j;->i:B

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
    invoke-virtual {p0, p1, p2}, La/t1j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/t1j;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/t1j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/t1j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/t1j;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/t1j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 5

    .line 1
    iget-byte v0, p0, La/t1j;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/t1j;->j:La/u1j;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, La/b2j;

    .line 18
    .line 19
    iget-object p1, p1, La/b2j;->a:La/n85;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, La/u1j;->u:La/b4j;

    .line 24
    .line 25
    iget-object v0, v0, La/b4j;->a:La/kt2;

    .line 26
    .line 27
    const-string v1, "dchallenge_popup_participate"

    .line 28
    .line 29
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, La/u1j;->v:La/je;

    .line 33
    .line 34
    iget-object v0, v0, La/je;->a:La/s1p;

    .line 35
    .line 36
    const-wide/16 v1, 0x2ab1

    .line 37
    .line 38
    sget-object v3, La/xun;->a:La/xun;

    .line 39
    .line 40
    invoke-virtual {v0, v3, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, La/u1j;->s:La/crt;

    .line 44
    .line 45
    iget-wide v1, p1, La/n85;->e:J

    .line 46
    .line 47
    sget-object p1, La/wuo0;->c:La/wuo0;

    .line 48
    .line 49
    invoke-virtual {p1}, La/wuo0;->getId()I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {v0, p1, v1, v2}, La/crt;->b(IJ)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, La/u1j;->x:La/c4m0;

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    const/4 v0, 0x1

    .line 65
    if-ne p1, v0, :cond_0

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object p1, p0, La/u1j;->t:La/rpt;

    .line 69
    .line 70
    invoke-virtual {p1}, La/rpt;->f()La/p7m0;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance v0, La/r1j;

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    const/4 v2, 0x2

    .line 78
    invoke-direct {v0, p0, v1, v2}, La/r1j;-><init>(La/u1j;La/yje;B)V

    .line 79
    .line 80
    .line 81
    new-instance v3, La/fnq;

    .line 82
    .line 83
    const/4 v4, 0x4

    .line 84
    invoke-direct {v3, p1, v0, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iget-object v0, p0, La/u1j;->r:La/mne;

    .line 92
    .line 93
    iget-object v0, v0, La/mne;->c:La/vs10;

    .line 94
    .line 95
    invoke-static {p1, v0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    new-instance v0, La/f1e;

    .line 100
    .line 101
    const/16 v4, 0xc

    .line 102
    .line 103
    invoke-direct {v0, v2, v1, v4}, La/f1e;-><init>(ILa/yje;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {v3, p1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iput-object p1, p0, La/u1j;->x:La/c4m0;

    .line 111
    .line 112
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 116
    .line 117
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance p1, La/z1j;

    .line 121
    .line 122
    iget-object v0, p0, La/u1j;->o:La/ctf0;

    .line 123
    .line 124
    const/4 v1, 0x0

    .line 125
    new-array v2, v1, [Ljava/lang/Object;

    .line 126
    .line 127
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 128
    .line 129
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const v2, 0x7f130665

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-direct {p1, v0}, La/z1j;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object p0

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
