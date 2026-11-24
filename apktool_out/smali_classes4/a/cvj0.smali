.class public final synthetic La/cvj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kvj0;


# direct methods
.method public synthetic constructor <init>(La/kvj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cvj0;->a:B

    iput-object p1, p0, La/cvj0;->b:La/kvj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-byte v0, p0, La/cvj0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/cvj0;->b:La/kvj0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/kvj0;->S1:La/eke0;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v0, "OPEN_PAYMENT_DIALOG_KEY"

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string p2, "RESULT_ON_PAYMENT_OPENED_KEY"

    .line 23
    .line 24
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, La/kvj0;->M0()La/yxj0;

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    return-void

    .line 34
    :pswitch_0
    sget-object v0, La/kvj0;->S1:La/eke0;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const-string v0, "REQUEST_CHANGE_BALANCE_DIALOG_KEY"

    .line 40
    .line 41
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_2

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    const-string p2, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0}, La/kvj0;->M0()La/yxj0;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object p1, v2, La/yxj0;->A:La/mne;

    .line 65
    .line 66
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 67
    .line 68
    new-instance v0, La/gvj0;

    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x6

    .line 72
    const/4 v1, 0x1

    .line 73
    const-class v3, La/yxj0;

    .line 74
    .line 75
    const-string v4, "handleError"

    .line 76
    .line 77
    const-string v5, "handleError(Ljava/lang/Throwable;)V"

    .line 78
    .line 79
    invoke-direct/range {v0 .. v7}, La/gvj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 80
    .line 81
    .line 82
    new-instance v7, La/zye0;

    .line 83
    .line 84
    const/4 p2, 0x0

    .line 85
    const/16 v1, 0x1d

    .line 86
    .line 87
    invoke-direct {v7, v2, p2, v1}, La/zye0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 88
    .line 89
    .line 90
    const/16 v8, 0xa

    .line 91
    .line 92
    const/4 v5, 0x0

    .line 93
    move-object v3, p0

    .line 94
    move-object v6, p1

    .line 95
    move-object v4, v0

    .line 96
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_1
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
