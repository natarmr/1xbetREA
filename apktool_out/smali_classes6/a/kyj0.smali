.class public final synthetic La/kyj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oyj0;


# direct methods
.method public synthetic constructor <init>(La/oyj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kyj0;->a:B

    iput-object p1, p0, La/kyj0;->b:La/oyj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/kyj0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/kyj0;->b:La/oyj0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/oyj0;->U1:La/gle0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/oyj0;->G0()La/u4r;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object p0, p0, La/u4r;->e:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMakeBetButtonEnabled(Z)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    sget-object v0, La/oyj0;->U1:La/gle0;

    .line 25
    .line 26
    invoke-virtual {p0}, La/oyj0;->H0()La/wyj0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object v0, p0, La/wyj0;->z:La/ih5;

    .line 31
    .line 32
    sget-object v1, La/k7k;->n1:La/k7k;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, La/ih5;->f(La/k7k;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, La/wyj0;->A:La/l7k;

    .line 38
    .line 39
    sget-object v1, La/y1p;->b:La/y1p;

    .line 40
    .line 41
    iget-object v1, p0, La/wyj0;->B:La/cmt;

    .line 42
    .line 43
    invoke-virtual {v1}, La/cmt;->g()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v3, "no_money_toto"

    .line 48
    .line 49
    invoke-virtual {v0, v3, v1}, La/l7k;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    new-instance v5, La/pyj0;

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-direct {v5, p0, v0}, La/pyj0;-><init>(La/wyj0;B)V

    .line 60
    .line 61
    .line 62
    new-instance v8, La/myj0;

    .line 63
    .line 64
    invoke-direct {v8, p0, v2}, La/myj0;-><init>(La/wyj0;La/yje;)V

    .line 65
    .line 66
    .line 67
    const/16 v9, 0xe

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x0

    .line 71
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_1
    iget-object p0, p0, La/oyj0;->M1:La/fiu0;

    .line 78
    .line 79
    if-eqz p0, :cond_0

    .line 80
    .line 81
    return-object p0

    .line 82
    :cond_0
    const-string p0, "viewModelFactory"

    .line 83
    .line 84
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v2

    .line 88
    :pswitch_2
    sget-object v0, La/oyj0;->U1:La/gle0;

    .line 89
    .line 90
    invoke-virtual {p0}, La/oyj0;->H0()La/wyj0;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    new-instance v4, La/pyj0;

    .line 99
    .line 100
    invoke-direct {v4, p0, v1}, La/pyj0;-><init>(La/wyj0;B)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, La/wyj0;->k:La/mne;

    .line 104
    .line 105
    iget-object v6, v0, La/mne;->b:La/dvj;

    .line 106
    .line 107
    new-instance v7, La/z8t;

    .line 108
    .line 109
    const/4 v0, 0x7

    .line 110
    invoke-direct {v7, p0, v2, v0}, La/z8t;-><init>(La/w46;La/yje;B)V

    .line 111
    .line 112
    .line 113
    const/16 v8, 0xa

    .line 114
    .line 115
    const/4 v5, 0x0

    .line 116
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
