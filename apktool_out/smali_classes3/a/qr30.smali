.class public final synthetic La/qr30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/sr30;


# direct methods
.method public synthetic constructor <init>(La/sr30;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qr30;->a:B

    iput-object p1, p0, La/qr30;->b:La/sr30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/qr30;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    sget-object v3, La/d16;->a:La/d16;

    .line 6
    .line 7
    iget-object p0, p0, La/qr30;->b:La/sr30;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    sget-object v0, La/sr30;->P1:[La/iiy;

    .line 19
    .line 20
    invoke-virtual {p0}, La/sr30;->H0()La/ns30;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-boolean v0, p0, La/ns30;->m:Z

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, La/ns30;->i:La/m1e;

    .line 30
    .line 31
    invoke-interface {v0}, La/m1e;->c()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p0, v3}, La/ns30;->w(La/i16;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    iget-object v0, p0, La/ns30;->f:La/mne;

    .line 46
    .line 47
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 48
    .line 49
    new-instance v5, La/as30;

    .line 50
    .line 51
    invoke-direct {v5, p0, v2}, La/as30;-><init>(La/ns30;B)V

    .line 52
    .line 53
    .line 54
    new-instance v8, La/gc1;

    .line 55
    .line 56
    const/16 v0, 0xb

    .line 57
    .line 58
    invoke-direct {v8, p0, p1, v1, v0}, La/gc1;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 59
    .line 60
    .line 61
    const/16 v9, 0xa

    .line 62
    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 65
    .line 66
    .line 67
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_0
    check-cast p1, La/ht30;

    .line 71
    .line 72
    sget-object v0, La/sr30;->P1:[La/iiy;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, La/sr30;->H0()La/ns30;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget-boolean v0, p0, La/ns30;->m:Z

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, La/ns30;->r:La/bby;

    .line 86
    .line 87
    if-eqz v0, :cond_2

    .line 88
    .line 89
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    const/4 v4, 0x1

    .line 94
    if-ne v0, v4, :cond_2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    iget-object v0, p0, La/ns30;->i:La/m1e;

    .line 98
    .line 99
    invoke-interface {v0}, La/m1e;->c()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-nez v0, :cond_3

    .line 104
    .line 105
    invoke-virtual {p0, v3}, La/ns30;->w(La/i16;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    iget-object v0, p0, La/ns30;->f:La/mne;

    .line 114
    .line 115
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 116
    .line 117
    new-instance v5, La/as30;

    .line 118
    .line 119
    const/4 v0, 0x2

    .line 120
    invoke-direct {v5, p0, v0}, La/as30;-><init>(La/ns30;B)V

    .line 121
    .line 122
    .line 123
    new-instance v6, La/bs30;

    .line 124
    .line 125
    invoke-direct {v6, p0, v2}, La/bs30;-><init>(La/ns30;B)V

    .line 126
    .line 127
    .line 128
    new-instance v8, La/mw20;

    .line 129
    .line 130
    const/16 v0, 0x14

    .line 131
    .line 132
    invoke-direct {v8, p0, p1, v1, v0}, La/mw20;-><init>(Ljava/lang/Object;Ljava/lang/Enum;La/yje;B)V

    .line 133
    .line 134
    .line 135
    const/16 v9, 0x8

    .line 136
    .line 137
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, La/ns30;->r:La/bby;

    .line 142
    .line 143
    :cond_4
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
