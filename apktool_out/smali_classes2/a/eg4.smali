.class public final synthetic La/eg4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ig4;


# direct methods
.method public synthetic constructor <init>(La/ig4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eg4;->a:B

    iput-object p1, p0, La/eg4;->b:La/ig4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/eg4;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/eg4;->b:La/ig4;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ig4;->O1:La/rek0;

    .line 9
    .line 10
    iget-object p0, p0, La/ig4;->M1:La/a8z;

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
    sget-object v0, La/ag4;->a:La/ag4;

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
    sget-object v0, La/ig4;->O1:La/rek0;

    .line 27
    .line 28
    iget-object p0, p0, La/ig4;->M1:La/a8z;

    .line 29
    .line 30
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/k3t0;

    .line 35
    .line 36
    sget-object v0, La/bg4;->a:La/bg4;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    sget-object v0, La/ig4;->O1:La/rek0;

    .line 45
    .line 46
    iget-object p0, p0, La/ig4;->L1:La/fiu0;

    .line 47
    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_0
    const-string p0, "viewModelFactory"

    .line 52
    .line 53
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    throw p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
