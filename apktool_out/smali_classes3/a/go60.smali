.class public final synthetic La/go60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lo60;


# direct methods
.method public synthetic constructor <init>(La/lo60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/go60;->a:B

    iput-object p1, p0, La/go60;->b:La/lo60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/go60;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/go60;->b:La/lo60;

    .line 5
    .line 6
    check-cast p1, Landroid/view/View;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/lo60;->U1:La/htz;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/lo60;->H0()La/sp70;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v2, La/gk70;

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    const/16 v9, 0x11

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    const-class v5, La/sp70;

    .line 31
    .line 32
    const-string v6, "handleGameError"

    .line 33
    .line 34
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 35
    .line 36
    invoke-direct/range {v2 .. v9}, La/gk70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 37
    .line 38
    .line 39
    iget-object p1, v4, La/sp70;->C:La/mne;

    .line 40
    .line 41
    iget-object v8, p1, La/mne;->a:La/rwj;

    .line 42
    .line 43
    new-instance v9, La/jkt;

    .line 44
    .line 45
    invoke-direct {v9, v4, v1}, La/jkt;-><init>(La/sp70;La/yje;)V

    .line 46
    .line 47
    .line 48
    const/16 v10, 0xa

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    move-object v5, p0

    .line 52
    move-object v6, v2

    .line 53
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_0
    sget-object v0, La/lo60;->U1:La/htz;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/lo60;->H0()La/sp70;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    iget-object p0, v4, La/sp70;->o:La/lzt;

    .line 69
    .line 70
    invoke-virtual {p0}, La/lzt;->a()Z

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-nez p0, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    new-instance v2, La/gk70;

    .line 82
    .line 83
    const/4 v8, 0x0

    .line 84
    const/16 v9, 0xd

    .line 85
    .line 86
    const/4 v3, 0x1

    .line 87
    const-class v5, La/sp70;

    .line 88
    .line 89
    const-string v6, "handleGameError"

    .line 90
    .line 91
    const-string v7, "handleGameError(Ljava/lang/Throwable;)V"

    .line 92
    .line 93
    invoke-direct/range {v2 .. v9}, La/gk70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 94
    .line 95
    .line 96
    iget-object p1, v4, La/sp70;->C:La/mne;

    .line 97
    .line 98
    iget-object v8, p1, La/mne;->a:La/rwj;

    .line 99
    .line 100
    new-instance v9, La/z210;

    .line 101
    .line 102
    const/16 p1, 0x14

    .line 103
    .line 104
    invoke-direct {v9, v4, v1, p1}, La/z210;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 105
    .line 106
    .line 107
    const/16 v10, 0xa

    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    move-object v5, p0

    .line 111
    move-object v6, v2

    .line 112
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 113
    .line 114
    .line 115
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
