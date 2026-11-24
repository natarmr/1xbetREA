.class public final synthetic La/ki70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oi70;


# direct methods
.method public synthetic constructor <init>(La/oi70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ki70;->a:B

    iput-object p1, p0, La/ki70;->b:La/oi70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ki70;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/ki70;->b:La/oi70;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/oi70;->P1:La/mi70;

    .line 10
    .line 11
    iget-object p0, p0, La/oi70;->N1:La/kiu0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/vi70;

    .line 18
    .line 19
    iget-object v0, p0, La/vi70;->g:La/spx;

    .line 20
    .line 21
    invoke-virtual {v0}, La/spx;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, La/vi70;->h:La/lzt;

    .line 28
    .line 29
    invoke-virtual {v0}, La/lzt;->a()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v0, p0, La/vi70;->c:La/mne;

    .line 41
    .line 42
    iget-object v5, v0, La/mne;->a:La/rwj;

    .line 43
    .line 44
    sget-object v3, La/ti70;->a:La/ti70;

    .line 45
    .line 46
    new-instance v6, La/ku60;

    .line 47
    .line 48
    const/16 v0, 0x17

    .line 49
    .line 50
    sget-object v4, La/gle;->a:La/gle;

    .line 51
    .line 52
    invoke-direct {v6, p0, v4, v1, v0}, La/ku60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 53
    .line 54
    .line 55
    const/16 v7, 0xa

    .line 56
    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 59
    .line 60
    .line 61
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_0
    sget-object v0, La/oi70;->P1:La/mi70;

    .line 65
    .line 66
    new-instance v0, La/ry3;

    .line 67
    .line 68
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object p0, p0, La/oi70;->L1:La/p6i;

    .line 73
    .line 74
    if-eqz p0, :cond_1

    .line 75
    .line 76
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_1
    const-string p0, "viewModelFactory"

    .line 81
    .line 82
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
