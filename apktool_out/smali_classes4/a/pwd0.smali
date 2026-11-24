.class public final synthetic La/pwd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rwd0;


# direct methods
.method public synthetic constructor <init>(La/rwd0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pwd0;->a:B

    iput-object p1, p0, La/pwd0;->b:La/rwd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pwd0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/pwd0;->b:La/rwd0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/rwd0;->U1:La/rl70;

    .line 9
    .line 10
    iget-object p0, p0, La/rwd0;->O1:La/kiu0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/hxd0;

    .line 17
    .line 18
    iget-object p0, p0, La/hxd0;->d:La/hzg;

    .line 19
    .line 20
    check-cast p0, La/uzg;

    .line 21
    .line 22
    invoke-virtual {p0}, La/uzg;->a()V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    new-instance v0, La/q0h0;

    .line 29
    .line 30
    iget-object p0, p0, La/rwd0;->K1:La/zqi;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    .line 34
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 35
    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_0
    const-string p0, "viewModelFactory"

    .line 39
    .line 40
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    throw p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
