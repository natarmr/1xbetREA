.class public final synthetic La/f6d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h6d0;


# direct methods
.method public synthetic constructor <init>(La/h6d0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f6d0;->a:B

    iput-object p1, p0, La/f6d0;->b:La/h6d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/f6d0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/f6d0;->b:La/h6d0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/h6d0;->Q1:La/nh70;

    .line 10
    .line 11
    invoke-virtual {p0}, La/h6d0;->J0()La/r6d0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, v0, La/r6d0;->k:La/p7m0;

    .line 16
    .line 17
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    move-object v3, p0

    .line 22
    check-cast v3, La/o6d0;

    .line 23
    .line 24
    const/16 v4, 0x9

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x1

    .line 28
    invoke-static {v3, v1, v5, v6, v4}, La/o6d0;->a(La/o6d0;La/j6d0;ZZI)La/o6d0;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v2, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    iget-object p0, v0, La/r6d0;->g:La/mne;

    .line 43
    .line 44
    iget-object v10, p0, La/mne;->b:La/dvj;

    .line 45
    .line 46
    new-instance v8, La/n6d0;

    .line 47
    .line 48
    invoke-direct {v8, v0, v5}, La/n6d0;-><init>(La/r6d0;B)V

    .line 49
    .line 50
    .line 51
    new-instance v11, La/q6d0;

    .line 52
    .line 53
    invoke-direct {v11, v0, v1, v6}, La/q6d0;-><init>(La/r6d0;La/yje;B)V

    .line 54
    .line 55
    .line 56
    const/16 v12, 0xa

    .line 57
    .line 58
    const/4 v9, 0x0

    .line 59
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_0
    sget-object v0, La/h6d0;->Q1:La/nh70;

    .line 66
    .line 67
    invoke-virtual {p0}, La/h6d0;->J0()La/r6d0;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, La/r6d0;->w()V

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_1
    sget-object v0, La/h6d0;->Q1:La/nh70;

    .line 78
    .line 79
    invoke-virtual {p0}, La/h6d0;->G0()V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_2
    sget-object v0, La/h6d0;->Q1:La/nh70;

    .line 86
    .line 87
    invoke-virtual {p0}, La/h6d0;->J0()La/r6d0;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, La/r6d0;->y()V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_3
    sget-object v0, La/h6d0;->Q1:La/nh70;

    .line 98
    .line 99
    iget-object p0, p0, La/h6d0;->M1:La/fiu0;

    .line 100
    .line 101
    if-eqz p0, :cond_1

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_1
    const-string p0, "viewModelFactory"

    .line 105
    .line 106
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v1

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
