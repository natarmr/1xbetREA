.class public final synthetic La/jgj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ngj;


# direct methods
.method public synthetic constructor <init>(La/ngj;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jgj;->a:B

    iput-object p1, p0, La/jgj;->b:La/ngj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/jgj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/jgj;->b:La/ngj;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/ngj;->n2:La/usd;

    .line 10
    .line 11
    invoke-virtual {p0}, La/ngj;->W0()La/xgj;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v2, p0, La/xgj;->e:La/mne;

    .line 20
    .line 21
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 22
    .line 23
    new-instance v3, La/igb;

    .line 24
    .line 25
    const/16 v4, 0x1d

    .line 26
    .line 27
    invoke-direct {v3, p0, v1, v4}, La/igb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x2

    .line 31
    invoke-static {v0, v2, v1, v3, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    sget-object v0, La/ngj;->n2:La/usd;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_1
    iget-object p0, p0, La/ngj;->j2:La/fiu0;

    .line 45
    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_0
    const-string p0, "viewModelFactory"

    .line 50
    .line 51
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :pswitch_2
    sget-object v0, La/ngj;->n2:La/usd;

    .line 56
    .line 57
    invoke-virtual {p0}, La/ngj;->W0()La/xgj;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object v0, p0, La/xgj;->h:La/ol60;

    .line 62
    .line 63
    sget-object v2, La/qgj;->a:La/qgj;

    .line 64
    .line 65
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, La/xgj;->b:La/ouu;

    .line 69
    .line 70
    new-instance v0, La/xa50;

    .line 71
    .line 72
    invoke-direct {v0}, La/xa50;-><init>()V

    .line 73
    .line 74
    .line 75
    const/4 v2, 0x4

    .line 76
    invoke-static {p0, v0, v1, v2}, La/ouu;->o(La/ouu;La/cb50;Lkotlin/jvm/functions/Function1;I)V

    .line 77
    .line 78
    .line 79
    new-instance v0, La/xa50;

    .line 80
    .line 81
    invoke-direct {v0}, La/xa50;-><init>()V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, La/ouu;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, La/qe50;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    invoke-virtual {p0, v0, v1}, La/qe50;->a(La/cb50;Z)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
