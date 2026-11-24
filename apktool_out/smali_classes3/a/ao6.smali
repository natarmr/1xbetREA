.class public final synthetic La/ao6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fo6;


# direct methods
.method public synthetic constructor <init>(La/fo6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ao6;->a:B

    iput-object p1, p0, La/ao6;->b:La/fo6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ao6;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/ao6;->b:La/fo6;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Lorg/xplatform/betting/core/zip/model/zip/BetZip;

    .line 10
    .line 11
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p1}, La/x8f;->f0(Lorg/xplatform/betting/core/zip/model/zip/BetZip;)La/jg7;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v0, p0, La/po6;->D:La/mne;

    .line 29
    .line 30
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 31
    .line 32
    new-instance v3, La/os5;

    .line 33
    .line 34
    const/16 v0, 0x9

    .line 35
    .line 36
    invoke-direct {v3, p0, v0}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance v4, La/ho6;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    invoke-direct {v4, p0, p1, v0}, La/ho6;-><init>(La/po6;La/jg7;B)V

    .line 43
    .line 44
    .line 45
    new-instance v6, La/xw5;

    .line 46
    .line 47
    const/16 v0, 0xb

    .line 48
    .line 49
    invoke-direct {v6, p0, p1, v1, v0}, La/xw5;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 50
    .line 51
    .line 52
    const/16 v7, 0x8

    .line 53
    .line 54
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_0
    check-cast p1, Landroid/view/View;

    .line 61
    .line 62
    sget-object v0, La/fo6;->W1:La/kj5;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, La/fo6;->H0()La/po6;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    iget-object p0, v4, La/po6;->u:La/lbu;

    .line 72
    .line 73
    invoke-virtual {p0}, La/lbu;->j()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_0

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    new-instance v2, La/yj5;

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    const/16 v9, 0x10

    .line 88
    .line 89
    const/4 v3, 0x1

    .line 90
    const-class v5, La/po6;

    .line 91
    .line 92
    const-string v6, "emitShowSnackBarWithDefaultErrorMessage"

    .line 93
    .line 94
    const-string v7, "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V"

    .line 95
    .line 96
    invoke-direct/range {v2 .. v9}, La/yj5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 97
    .line 98
    .line 99
    new-instance v9, La/lo6;

    .line 100
    .line 101
    const/4 p1, 0x2

    .line 102
    invoke-direct {v9, v4, v1, p1}, La/lo6;-><init>(La/po6;La/yje;B)V

    .line 103
    .line 104
    .line 105
    const/16 v10, 0xe

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    const/4 v8, 0x0

    .line 109
    move-object v5, p0

    .line 110
    move-object v6, v2

    .line 111
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 112
    .line 113
    .line 114
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
