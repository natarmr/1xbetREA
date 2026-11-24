.class public final synthetic La/e6c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h6c0;


# direct methods
.method public synthetic constructor <init>(La/h6c0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/e6c0;->a:B

    iput-object p1, p0, La/e6c0;->b:La/h6c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/e6c0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xd

    .line 5
    .line 6
    iget-object p0, p0, La/e6c0;->b:La/h6c0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/h6c0;->W1:La/nh70;

    .line 12
    .line 13
    new-instance v0, La/jt6;

    .line 14
    .line 15
    invoke-direct {v0, p0, v2}, La/jt6;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    iget-object p0, p0, La/h6c0;->L1:La/fiu0;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    const-string p0, "viewModelFactory"

    .line 25
    .line 26
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v1

    .line 30
    :pswitch_1
    sget-object v0, La/h6c0;->W1:La/nh70;

    .line 31
    .line 32
    invoke-virtual {p0}, La/h6c0;->I0()La/g7c0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p0}, La/h6c0;->H0()La/h920;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, La/h920;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 41
    .line 42
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getText()Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, p0, La/h6c0;->Q1:La/yzn0;

    .line 51
    .line 52
    sget-object v3, La/h6c0;->X1:[La/iiy;

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    aget-object v3, v3, v4

    .line 56
    .line 57
    invoke-virtual {v2, p0, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, La/ms2;

    .line 62
    .line 63
    invoke-static {p0}, La/kpb;->v0(La/ms2;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const/4 v2, 0x1

    .line 68
    invoke-virtual {v0, v1, p0, v2}, La/g7c0;->y(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_2
    sget-object v0, La/h6c0;->W1:La/nh70;

    .line 75
    .line 76
    invoke-virtual {p0}, La/h6c0;->I0()La/g7c0;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    iget-object v0, p0, La/g7c0;->h:La/mne;

    .line 85
    .line 86
    iget-object v6, v0, La/mne;->b:La/dvj;

    .line 87
    .line 88
    new-instance v4, La/wyb0;

    .line 89
    .line 90
    invoke-direct {v4, v2}, La/wyb0;-><init>(B)V

    .line 91
    .line 92
    .line 93
    new-instance v7, La/o690;

    .line 94
    .line 95
    const/16 v0, 0x11

    .line 96
    .line 97
    invoke-direct {v7, p0, v1, v0}, La/o690;-><init>(La/w46;La/yje;B)V

    .line 98
    .line 99
    .line 100
    const/16 v8, 0xa

    .line 101
    .line 102
    const/4 v5, 0x0

    .line 103
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
