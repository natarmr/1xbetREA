.class public final La/gbx;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/ibx;


# direct methods
.method public synthetic constructor <init>(La/ibx;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/gbx;->i:B

    iput-object p1, p0, La/gbx;->j:La/ibx;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/gbx;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/gbx;->j:La/ibx;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/gbx;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/gbx;-><init>(La/ibx;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/gbx;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/gbx;-><init>(La/ibx;La/yje;B)V

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
    iget-byte v0, p0, La/gbx;->i:B

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
    invoke-virtual {p0, p1, p2}, La/gbx;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/gbx;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/gbx;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kmq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/gbx;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/gbx;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/gbx;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/gbx;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/gbx;->j:La/ibx;

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
    iget-object p1, p0, La/ibx;->m:La/ol60;

    .line 14
    .line 15
    new-instance v0, La/abx;

    .line 16
    .line 17
    iget-object p0, p0, La/ibx;->h:La/j1q0;

    .line 18
    .line 19
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 20
    .line 21
    invoke-virtual {p0}, La/m1q0;->b()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-direct {v0, p0}, La/abx;-><init>(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 35
    .line 36
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, La/ibx;->k:La/c4m0;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1}, La/pby;->isActive()Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-ne p1, v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object p1, p0, La/ibx;->g:La/m1e;

    .line 52
    .line 53
    invoke-interface {p1}, La/m1e;->b()La/gmq;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v1, La/u88;

    .line 58
    .line 59
    const/16 v2, 0x15

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-direct {v1, p0, v3, v2}, La/u88;-><init>(La/diu0;La/yje;B)V

    .line 63
    .line 64
    .line 65
    new-instance v2, La/fnq;

    .line 66
    .line 67
    const/4 v4, 0x4

    .line 68
    invoke-direct {v2, p1, v1, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 69
    .line 70
    .line 71
    new-instance p1, La/qos;

    .line 72
    .line 73
    const/16 v1, 0x9

    .line 74
    .line 75
    invoke-direct {p1, p0, v3, v1}, La/qos;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 76
    .line 77
    .line 78
    new-instance v1, La/dnq;

    .line 79
    .line 80
    invoke-direct {v1, v2, p1, v0}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget-object v2, p0, La/ibx;->j:La/mne;

    .line 88
    .line 89
    iget-object v2, v2, La/mne;->a:La/rwj;

    .line 90
    .line 91
    invoke-static {p1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-instance v2, La/sax;

    .line 96
    .line 97
    const/4 v4, 0x2

    .line 98
    invoke-direct {v2, v4, v3, v0}, La/sax;-><init>(ILa/yje;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {v1, p1, v2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, La/ibx;->k:La/c4m0;

    .line 106
    .line 107
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
