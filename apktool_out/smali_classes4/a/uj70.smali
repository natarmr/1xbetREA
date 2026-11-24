.class public final synthetic La/uj70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yj70;


# direct methods
.method public synthetic constructor <init>(La/yj70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uj70;->a:B

    iput-object p1, p0, La/uj70;->b:La/yj70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/uj70;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/uj70;->b:La/yj70;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    check-cast p1, Landroid/view/View;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/yj70;->O1:[La/iiy;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/yj70;->H0()La/jk70;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p1, p0, La/jk70;->u:La/lzt;

    .line 22
    .line 23
    invoke-virtual {p1}, La/lzt;->a()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, La/zj70;

    .line 31
    .line 32
    invoke-direct {p1, v2}, La/zj70;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/jk70;->y(La/bk70;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, La/jk70;->h:La/dqx;

    .line 39
    .line 40
    invoke-virtual {p1}, La/dqx;->a()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    iget-object p1, p0, La/jk70;->m:La/ppb;

    .line 47
    .line 48
    invoke-virtual {p1}, La/ppb;->a()V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iget-object p1, p0, La/jk70;->e:La/mne;

    .line 56
    .line 57
    iget-object v6, p1, La/mne;->a:La/rwj;

    .line 58
    .line 59
    sget-object v4, La/dk70;->a:La/dk70;

    .line 60
    .line 61
    new-instance v7, La/ek70;

    .line 62
    .line 63
    invoke-direct {v7, p0, v1, v2}, La/ek70;-><init>(La/jk70;La/yje;B)V

    .line 64
    .line 65
    .line 66
    const/16 v8, 0xa

    .line 67
    .line 68
    const/4 v5, 0x0

    .line 69
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 70
    .line 71
    .line 72
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_0
    sget-object v0, La/yj70;->O1:[La/iiy;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, La/yj70;->H0()La/jk70;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    iget-object p0, v5, La/jk70;->u:La/lzt;

    .line 85
    .line 86
    invoke-virtual {p0}, La/lzt;->a()Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-nez p0, :cond_2

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_2
    new-instance p0, La/zj70;

    .line 94
    .line 95
    invoke-direct {p0, v2}, La/zj70;-><init>(Z)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, p0}, La/jk70;->y(La/bk70;)V

    .line 99
    .line 100
    .line 101
    iget-object p0, v5, La/jk70;->f:La/fpi0;

    .line 102
    .line 103
    const/4 p1, 0x1

    .line 104
    invoke-virtual {p0, p1}, La/fpi0;->a(Z)V

    .line 105
    .line 106
    .line 107
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance v3, La/gk70;

    .line 112
    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v10, 0x1

    .line 115
    const/4 v4, 0x1

    .line 116
    const-class v6, La/jk70;

    .line 117
    .line 118
    const-string v7, "handleGameError"

    .line 119
    .line 120
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 121
    .line 122
    invoke-direct/range {v3 .. v10}, La/gk70;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 123
    .line 124
    .line 125
    iget-object v0, v5, La/jk70;->e:La/mne;

    .line 126
    .line 127
    iget-object v9, v0, La/mne;->b:La/dvj;

    .line 128
    .line 129
    new-instance v10, La/ek70;

    .line 130
    .line 131
    invoke-direct {v10, v5, v1, p1}, La/ek70;-><init>(La/jk70;La/yje;B)V

    .line 132
    .line 133
    .line 134
    const/16 v11, 0xa

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    move-object v6, p0

    .line 138
    move-object v7, v3

    .line 139
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 140
    .line 141
    .line 142
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
