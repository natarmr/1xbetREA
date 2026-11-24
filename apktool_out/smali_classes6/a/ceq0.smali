.class public final synthetic La/ceq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/geq0;


# direct methods
.method public synthetic constructor <init>(La/geq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ceq0;->a:B

    iput-object p1, p0, La/ceq0;->b:La/geq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/ceq0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/ceq0;->b:La/geq0;

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
    sget-object v0, La/geq0;->O1:[La/iiy;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/geq0;->M1:La/kiu0;

    .line 18
    .line 19
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, La/oeq0;

    .line 24
    .line 25
    iget-object p1, p0, La/oeq0;->l:La/lzt;

    .line 26
    .line 27
    invoke-virtual {p1}, La/lzt;->a()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p1, La/heq0;

    .line 35
    .line 36
    invoke-direct {p1, v2}, La/heq0;-><init>(Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, La/oeq0;->x(La/heq0;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object p1, p0, La/oeq0;->e:La/mne;

    .line 47
    .line 48
    iget-object v6, p1, La/mne;->a:La/rwj;

    .line 49
    .line 50
    sget-object v4, La/jeq0;->a:La/jeq0;

    .line 51
    .line 52
    new-instance v7, La/keq0;

    .line 53
    .line 54
    invoke-direct {v7, p0, v1, v2}, La/keq0;-><init>(La/oeq0;La/yje;B)V

    .line 55
    .line 56
    .line 57
    const/16 v8, 0xa

    .line 58
    .line 59
    const/4 v5, 0x0

    .line 60
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 61
    .line 62
    .line 63
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_0
    sget-object v0, La/geq0;->O1:[La/iiy;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, La/geq0;->M1:La/kiu0;

    .line 72
    .line 73
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    move-object v5, p0

    .line 78
    check-cast v5, La/oeq0;

    .line 79
    .line 80
    iget-object p0, v5, La/oeq0;->l:La/lzt;

    .line 81
    .line 82
    invoke-virtual {p0}, La/lzt;->a()Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    if-nez p0, :cond_1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    new-instance p0, La/heq0;

    .line 90
    .line 91
    invoke-direct {p0, v2}, La/heq0;-><init>(Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5, p0}, La/oeq0;->x(La/heq0;)V

    .line 95
    .line 96
    .line 97
    iget-object p0, v5, La/oeq0;->f:La/fpi0;

    .line 98
    .line 99
    const/4 p1, 0x1

    .line 100
    invoke-virtual {p0, p1}, La/fpi0;->a(Z)V

    .line 101
    .line 102
    .line 103
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    new-instance v3, La/w6q0;

    .line 108
    .line 109
    const/4 v9, 0x0

    .line 110
    const/4 v10, 0x3

    .line 111
    const/4 v4, 0x1

    .line 112
    const-class v6, La/oeq0;

    .line 113
    .line 114
    const-string v7, "handleGameError"

    .line 115
    .line 116
    const-string v8, "handleGameError(Ljava/lang/Throwable;)V"

    .line 117
    .line 118
    invoke-direct/range {v3 .. v10}, La/w6q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 119
    .line 120
    .line 121
    iget-object v0, v5, La/oeq0;->e:La/mne;

    .line 122
    .line 123
    iget-object v9, v0, La/mne;->b:La/dvj;

    .line 124
    .line 125
    new-instance v10, La/keq0;

    .line 126
    .line 127
    invoke-direct {v10, v5, v1, p1}, La/keq0;-><init>(La/oeq0;La/yje;B)V

    .line 128
    .line 129
    .line 130
    const/16 v11, 0xa

    .line 131
    .line 132
    const/4 v8, 0x0

    .line 133
    move-object v6, p0

    .line 134
    move-object v7, v3

    .line 135
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 136
    .line 137
    .line 138
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
