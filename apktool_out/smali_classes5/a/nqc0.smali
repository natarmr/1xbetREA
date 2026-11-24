.class public final synthetic La/nqc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pqc0;


# direct methods
.method public synthetic constructor <init>(La/pqc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/nqc0;->a:B

    iput-object p1, p0, La/nqc0;->b:La/pqc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nqc0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/nqc0;->b:La/pqc0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/pqc0;->Q1:La/mi70;

    .line 9
    .line 10
    iget-object p0, p0, La/pqc0;->N1:La/a8z;

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
    sget-object v0, La/kqc0;->a:La/kqc0;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    new-instance v0, La/q0h0;

    .line 27
    .line 28
    iget-object p0, p0, La/pqc0;->K1:La/fqi;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 33
    .line 34
    .line 35
    return-object v0

    .line 36
    :cond_0
    const-string p0, "viewModelFactory"

    .line 37
    .line 38
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x0

    .line 42
    throw p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
