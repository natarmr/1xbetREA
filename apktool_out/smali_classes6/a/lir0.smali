.class public final synthetic La/lir0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pir0;


# direct methods
.method public synthetic constructor <init>(La/pir0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lir0;->a:B

    iput-object p1, p0, La/lir0;->b:La/pir0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/lir0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/lir0;->b:La/pir0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/String;

    .line 10
    .line 11
    check-cast p2, Landroid/os/Bundle;

    .line 12
    .line 13
    sget-object v0, La/pir0;->W1:La/j6m0;

    .line 14
    .line 15
    const-string v0, "TotoBetTypeBottomSheetKey"

    .line 16
    .line 17
    invoke-static {p2, p1, v0}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-virtual {p0}, La/pir0;->G0()La/njr0;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    iget-object p1, v4, La/njr0;->i:La/ctu;

    .line 35
    .line 36
    iget-object p1, p1, La/ctu;->a:La/rkr0;

    .line 37
    .line 38
    invoke-interface {p1}, La/rkr0;->r()La/lmr0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget p1, p1, La/lmr0;->a:I

    .line 43
    .line 44
    if-ne p1, p0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object p1, v4, La/njr0;->H:La/p7m0;

    .line 48
    .line 49
    const-wide/16 v2, 0x0

    .line 50
    .line 51
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v1, p2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iget-object p2, v4, La/njr0;->b:La/mne;

    .line 66
    .line 67
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 68
    .line 69
    new-instance v2, La/mjr0;

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x2

    .line 73
    const/4 v3, 0x1

    .line 74
    const-class v5, La/njr0;

    .line 75
    .line 76
    const-string v6, "handleDataLoadError"

    .line 77
    .line 78
    const-string v7, "handleDataLoadError(Ljava/lang/Throwable;)V"

    .line 79
    .line 80
    invoke-direct/range {v2 .. v9}, La/mjr0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 81
    .line 82
    .line 83
    new-instance v9, Le;

    .line 84
    .line 85
    const/16 v0, 0xb

    .line 86
    .line 87
    invoke-direct {v9, v4, p0, v1, v0}, Le;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 88
    .line 89
    .line 90
    const/16 v10, 0xa

    .line 91
    .line 92
    const/4 v7, 0x0

    .line 93
    move-object v5, p1

    .line 94
    move-object v8, p2

    .line 95
    move-object v6, v2

    .line 96
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 97
    .line 98
    .line 99
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 100
    .line 101
    :goto_1
    return-object p0

    .line 102
    :pswitch_0
    check-cast p1, La/fet;

    .line 103
    .line 104
    check-cast p2, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    sget-object v0, La/pir0;->W1:La/j6m0;

    .line 111
    .line 112
    and-int/lit8 v0, p2, 0x3

    .line 113
    .line 114
    const/4 v2, 0x2

    .line 115
    const/4 v3, 0x1

    .line 116
    if-eq v0, v2, :cond_2

    .line 117
    .line 118
    move v0, v3

    .line 119
    goto :goto_2

    .line 120
    :cond_2
    const/4 v0, 0x0

    .line 121
    :goto_2
    and-int/2addr p2, v3

    .line 122
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    if-eqz p2, :cond_3

    .line 127
    .line 128
    invoke-virtual {p0}, La/pir0;->G0()La/njr0;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    const/16 p2, 0x8

    .line 133
    .line 134
    invoke-static {p0, v1, p1, p2}, La/nia0;->V(La/njr0;La/mm40;La/fet;I)V

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 139
    .line 140
    .line 141
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
