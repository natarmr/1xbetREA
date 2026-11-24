.class public final synthetic La/t8u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/v8u0;


# direct methods
.method public synthetic constructor <init>(La/v8u0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t8u0;->a:B

    iput-object p1, p0, La/t8u0;->b:La/v8u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/t8u0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/t8u0;->b:La/v8u0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/v8u0;->P1:La/sxs0;

    .line 9
    .line 10
    iget-object p0, p0, La/v8u0;->O1:La/a8z;

    .line 11
    .line 12
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/k3t0;

    .line 17
    .line 18
    new-instance v0, La/h8u0;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, v1}, La/h8u0;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    new-instance v0, La/q0h0;

    .line 31
    .line 32
    iget-object p0, p0, La/v8u0;->N1:La/wyi;

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :cond_0
    const-string p0, "verificationOptionsViewModelFactory"

    .line 41
    .line 42
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    throw p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
