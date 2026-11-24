.class public final synthetic La/yy60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ez60;


# direct methods
.method public synthetic constructor <init>(La/ez60;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yy60;->a:B

    iput-object p1, p0, La/yy60;->b:La/ez60;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/yy60;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/yy60;->b:La/ez60;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, La/t0h0;

    .line 10
    .line 11
    iget-object v2, p0, La/ez60;->L1:La/nmi;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, v2, p0}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    const-string p0, "oneXGamesViewModelFactory"

    .line 24
    .line 25
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v1

    .line 29
    :pswitch_0
    iget-object p0, p0, La/ez60;->M1:La/fiu0;

    .line 30
    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_1
    const-string p0, "sharedViewModelFactory"

    .line 35
    .line 36
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :pswitch_1
    sget-object v0, La/ez60;->S1:[La/iiy;

    .line 41
    .line 42
    invoke-virtual {p0}, La/ez60;->H0()La/g670;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    iget-object v0, p0, La/g670;->m:La/mne;

    .line 51
    .line 52
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 53
    .line 54
    new-instance v3, La/m570;

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    invoke-direct {v3, p0, v0}, La/m570;-><init>(La/g670;B)V

    .line 58
    .line 59
    .line 60
    new-instance v6, La/w570;

    .line 61
    .line 62
    invoke-direct {v6, p0, v1, v0}, La/w570;-><init>(La/g670;La/yje;B)V

    .line 63
    .line 64
    .line 65
    const/16 v7, 0xa

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
