.class public final synthetic La/lqr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/k3t0;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(La/k3t0;IIB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/lqr0;->a:B

    iput-object p1, p0, La/lqr0;->b:La/k3t0;

    iput p2, p0, La/lqr0;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/lqr0;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const/16 p2, 0x9

    .line 14
    .line 15
    invoke-static {p2}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object v0, p0, La/lqr0;->b:La/k3t0;

    .line 20
    .line 21
    iget p0, p0, La/lqr0;->c:I

    .line 22
    .line 23
    invoke-static {v0, p0, p1, p2}, La/ffb0;->I(La/k3t0;ILa/fet;I)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    const/4 p2, 0x1

    .line 30
    invoke-static {p2}, La/x8x;->L(I)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    iget-object v0, p0, La/lqr0;->b:La/k3t0;

    .line 35
    .line 36
    iget p0, p0, La/lqr0;->c:I

    .line 37
    .line 38
    invoke-static {v0, p0, p1, p2}, La/oja0;->T(La/k3t0;ILa/fet;I)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
