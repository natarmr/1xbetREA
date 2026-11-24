.class public final synthetic La/bxe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dxe0;


# direct methods
.method public synthetic constructor <init>(La/dxe0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bxe0;->a:B

    iput-object p1, p0, La/bxe0;->b:La/dxe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/bxe0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/bxe0;->b:La/dxe0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/ghk0;

    .line 9
    .line 10
    sget-object v0, La/dxe0;->Y1:La/lme0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/dxe0;->G0()La/k3t0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    new-instance v0, La/bwe0;

    .line 17
    .line 18
    invoke-direct {v0, p1}, La/bwe0;-><init>(La/ghk0;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p1, La/iqt0;

    .line 28
    .line 29
    sget-object v0, La/dxe0;->Y1:La/lme0;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/dxe0;->G0()La/k3t0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    new-instance v0, La/kve0;

    .line 39
    .line 40
    invoke-direct {v0, p1}, La/kve0;-><init>(La/iqt0;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
