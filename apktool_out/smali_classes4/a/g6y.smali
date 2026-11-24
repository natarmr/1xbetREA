.class public final synthetic La/g6y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/k6y;


# direct methods
.method public synthetic constructor <init>(La/k6y;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g6y;->a:B

    iput-object p1, p0, La/g6y;->b:La/k6y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/g6y;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/g6y;->b:La/k6y;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/k6y;->Q1:La/sqt;

    .line 10
    .line 11
    invoke-virtual {p0}, La/k6y;->H0()La/t6y;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/l6y;->a:La/l6y;

    .line 16
    .line 17
    iget-object v2, p0, La/t6y;->q:La/ol60;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    new-instance v4, La/djx;

    .line 27
    .line 28
    const/16 v0, 0x8

    .line 29
    .line 30
    invoke-direct {v4, v0}, La/djx;-><init>(B)V

    .line 31
    .line 32
    .line 33
    iget-object v2, p0, La/t6y;->h:La/mne;

    .line 34
    .line 35
    iget-object v6, v2, La/mne;->b:La/dvj;

    .line 36
    .line 37
    new-instance v7, La/e3p;

    .line 38
    .line 39
    invoke-direct {v7, p0, v1, v0}, La/e3p;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 40
    .line 41
    .line 42
    const/16 v8, 0xa

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_0
    sget-object v0, La/k6y;->Q1:La/sqt;

    .line 52
    .line 53
    new-instance v0, La/ry3;

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iget-object p0, p0, La/k6y;->M1:La/fji;

    .line 60
    .line 61
    if-eqz p0, :cond_0

    .line 62
    .line 63
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :cond_0
    const-string p0, "jackpotViewModelFactory"

    .line 68
    .line 69
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :pswitch_1
    sget-object v0, La/k6y;->Q1:La/sqt;

    .line 74
    .line 75
    invoke-virtual {p0}, La/k6y;->H0()La/t6y;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, La/t6y;->w()V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
