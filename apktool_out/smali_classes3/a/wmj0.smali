.class public final synthetic La/wmj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cnj0;


# direct methods
.method public synthetic constructor <init>(La/cnj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wmj0;->a:B

    iput-object p1, p0, La/wmj0;->b:La/cnj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/wmj0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wmj0;->b:La/cnj0;

    .line 4
    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/cnj0;->R1:La/gne0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/cnj0;->H0()La/hoj0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, La/hoj0;->w()V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    sget-object v0, La/cnj0;->R1:La/gne0;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, La/cnj0;->H0()La/hoj0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object p1, p0, La/hoj0;->f:La/mne;

    .line 39
    .line 40
    iget-object v3, p1, La/mne;->b:La/dvj;

    .line 41
    .line 42
    new-instance v1, La/uki0;

    .line 43
    .line 44
    iget-object v6, p0, La/hoj0;->k:La/duj;

    .line 45
    .line 46
    const/4 v10, 0x0

    .line 47
    const/16 v11, 0x1d

    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    const-class v7, La/duj;

    .line 51
    .line 52
    const-string v8, "handleError"

    .line 53
    .line 54
    const-string v9, "handleError(Ljava/lang/Throwable;)V"

    .line 55
    .line 56
    move-object v4, v1

    .line 57
    invoke-direct/range {v4 .. v11}, La/uki0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 58
    .line 59
    .line 60
    new-instance v4, La/goj0;

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    const/4 v2, 0x2

    .line 64
    invoke-direct {v4, p0, p1, v2}, La/goj0;-><init>(La/hoj0;La/yje;B)V

    .line 65
    .line 66
    .line 67
    const/16 v5, 0xa

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
