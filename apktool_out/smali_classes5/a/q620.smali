.class public final synthetic La/q620;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a720;


# direct methods
.method public synthetic constructor <init>(La/a720;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q620;->a:B

    iput-object p1, p0, La/q620;->b:La/a720;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/q620;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/q620;->b:La/a720;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_0
    sget-object v0, La/a720;->x2:La/xuz;

    .line 16
    .line 17
    invoke-virtual {p0}, La/a720;->Y0()La/mn20;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object v0, p0, La/mn20;->D:La/dnv;

    .line 22
    .line 23
    iget-object v0, v0, La/dnv;->a:La/hm7;

    .line 24
    .line 25
    iget-object v0, v0, La/hm7;->a:La/h03;

    .line 26
    .line 27
    iget-object v0, v0, La/h03;->b:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, La/vwb0;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    const-string v2, "HELP_COUPON_SNACKBAR_SHOWN"

    .line 33
    .line 34
    invoke-static {v0, v2, v1}, La/ua80;->x(La/vwb0;Ljava/lang/String;Z)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, La/mn20;->Q:La/ol60;

    .line 41
    .line 42
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/mn20;->E:La/vyt;

    .line 48
    .line 49
    iget-object p0, p0, La/vyt;->a:La/hm7;

    .line 50
    .line 51
    iget-object p0, p0, La/hm7;->a:La/h03;

    .line 52
    .line 53
    iget-object p0, p0, La/h03;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, La/vwb0;

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    invoke-virtual {p0, v2, v0}, La/vwb0;->e(Ljava/lang/String;Z)V

    .line 59
    .line 60
    .line 61
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_1
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_2
    iget-object p0, p0, La/a720;->h2:La/fiu0;

    .line 71
    .line 72
    if-eqz p0, :cond_1

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_1
    const-string p0, "viewModelFactory"

    .line 76
    .line 77
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :pswitch_3
    iget-object p0, p0, La/a720;->g2:La/xki;

    .line 82
    .line 83
    if-eqz p0, :cond_2

    .line 84
    .line 85
    return-object p0

    .line 86
    :cond_2
    const-string p0, "makeBetViewModelFactory"

    .line 87
    .line 88
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1

    .line 92
    :pswitch_4
    sget-object v0, La/a720;->x2:La/xuz;

    .line 93
    .line 94
    invoke-virtual {p0}, La/a720;->Y0()La/mn20;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    new-instance v3, La/r520;

    .line 103
    .line 104
    const/16 v0, 0xf

    .line 105
    .line 106
    invoke-direct {v3, v0}, La/r520;-><init>(B)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, La/mn20;->i:La/mne;

    .line 110
    .line 111
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 112
    .line 113
    new-instance v6, La/il20;

    .line 114
    .line 115
    const/4 v0, 0x3

    .line 116
    invoke-direct {v6, p0, v1, v0}, La/il20;-><init>(La/mn20;La/yje;B)V

    .line 117
    .line 118
    .line 119
    const/16 v7, 0xa

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
