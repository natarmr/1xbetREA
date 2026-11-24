.class public final synthetic La/hob0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kob0;


# direct methods
.method public synthetic constructor <init>(La/kob0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hob0;->a:B

    iput-object p1, p0, La/hob0;->b:La/kob0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/hob0;->a:B

    .line 2
    .line 3
    sget-object v1, La/znb0;->a:La/znb0;

    .line 4
    .line 5
    iget-object p0, p0, La/hob0;->b:La/kob0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/q0h0;

    .line 11
    .line 12
    iget-object p0, p0, La/kob0;->L1:La/jpi;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_0
    const-string p0, "viewModelFactory"

    .line 21
    .line 22
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0

    .line 27
    :pswitch_0
    sget-object v0, La/kob0;->R1:La/rl70;

    .line 28
    .line 29
    invoke-virtual {p0}, La/kob0;->G0()La/k3t0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_1
    sget-object v0, La/kob0;->R1:La/rl70;

    .line 40
    .line 41
    invoke-virtual {p0}, La/kob0;->G0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
