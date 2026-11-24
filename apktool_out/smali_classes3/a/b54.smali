.class public final synthetic La/b54;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d54;


# direct methods
.method public synthetic constructor <init>(La/d54;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/b54;->a:B

    iput-object p1, p0, La/b54;->b:La/d54;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/b54;->a:B

    .line 2
    .line 3
    sget-object v1, La/w44;->a:La/w44;

    .line 4
    .line 5
    iget-object p0, p0, La/b54;->b:La/d54;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/d54;->R1:La/gfk0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/d54;->G0()La/k3t0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    sget-object v0, La/d54;->R1:La/gfk0;

    .line 23
    .line 24
    invoke-virtual {p0}, La/d54;->G0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    new-instance v0, La/q0h0;

    .line 35
    .line 36
    iget-object p0, p0, La/d54;->L1:La/x8i;

    .line 37
    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_0
    const-string p0, "viewModelFactory"

    .line 45
    .line 46
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 p0, 0x0

    .line 50
    throw p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
