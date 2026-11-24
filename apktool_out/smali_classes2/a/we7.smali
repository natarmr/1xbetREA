.class public final synthetic La/we7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ze7;


# direct methods
.method public synthetic constructor <init>(La/ze7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/we7;->a:B

    iput-object p1, p0, La/we7;->b:La/ze7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/we7;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/we7;->b:La/ze7;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/q0h0;

    .line 9
    .line 10
    iget-object p0, p0, La/ze7;->K1:La/aai;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string p0, "viewModelFactory"

    .line 19
    .line 20
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0

    .line 25
    :pswitch_0
    sget-object v0, La/ze7;->P1:La/cl5;

    .line 26
    .line 27
    invoke-virtual {p0}, La/ze7;->G0()La/k3t0;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object v0, La/qe7;->a:La/qe7;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
