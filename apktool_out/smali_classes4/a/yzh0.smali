.class public final La/yzh0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/zzh0;


# direct methods
.method public synthetic constructor <init>(La/zzh0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yzh0;->i:B

    iput-object p1, p0, La/yzh0;->j:La/zzh0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/yzh0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/yzh0;->j:La/zzh0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/yzh0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/yzh0;-><init>(La/zzh0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/yzh0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/yzh0;-><init>(La/zzh0;La/yje;B)V

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
    iget-byte v0, p0, La/yzh0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/yzh0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yzh0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yzh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/yzh0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/yzh0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/yzh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/yzh0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/yzh0;->j:La/zzh0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object v3, p0, La/zzh0;->x:La/rrd;

    .line 15
    .line 16
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, La/tzh0;

    .line 21
    .line 22
    iget-wide v4, p1, La/tzh0;->f:J

    .line 23
    .line 24
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, La/tzh0;

    .line 29
    .line 30
    iget-boolean v6, p1, La/tzh0;->g:Z

    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v2, La/up6;

    .line 36
    .line 37
    const/4 v7, 0x0

    .line 38
    invoke-direct/range {v2 .. v7}, La/up6;-><init>(La/rrd;JZLa/yje;)V

    .line 39
    .line 40
    .line 41
    new-instance p1, La/vsg0;

    .line 42
    .line 43
    invoke-direct {p1, v2}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, La/tye0;

    .line 47
    .line 48
    const/16 v2, 0x19

    .line 49
    .line 50
    invoke-direct {v0, p0, v1, v2}, La/tye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 51
    .line 52
    .line 53
    new-instance v1, La/fnq;

    .line 54
    .line 55
    const/4 v2, 0x4

    .line 56
    invoke-direct {v1, p1, v0, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p0, p0, La/zzh0;->o:La/mne;

    .line 64
    .line 65
    iget-object p0, p0, La/mne;->a:La/rwj;

    .line 66
    .line 67
    invoke-static {p1, p0}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {v1, p0}, La/sac;->U(La/gmq;La/vne;)La/c4m0;

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 78
    .line 79
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    sget p1, La/zzh0;->C:I

    .line 83
    .line 84
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    new-instance v3, La/wzh0;

    .line 89
    .line 90
    const/4 p1, 0x3

    .line 91
    invoke-direct {v3, p0, p1}, La/wzh0;-><init>(La/zzh0;B)V

    .line 92
    .line 93
    .line 94
    new-instance v6, La/yzh0;

    .line 95
    .line 96
    const/4 p1, 0x1

    .line 97
    invoke-direct {v6, p0, v1, p1}, La/yzh0;-><init>(La/zzh0;La/yje;B)V

    .line 98
    .line 99
    .line 100
    const/16 v7, 0xe

    .line 101
    .line 102
    const/4 v4, 0x0

    .line 103
    const/4 v5, 0x0

    .line 104
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, p0, La/zzh0;->A:La/bby;

    .line 109
    .line 110
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    return-object p0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
