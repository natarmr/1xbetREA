.class public final synthetic La/wbc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/wbc;->a:B

    iput-object p1, p0, La/wbc;->b:La/mm40;

    iput-object p2, p0, La/wbc;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wbc;->a:B

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
    const/4 p2, 0x1

    .line 14
    invoke-static {p2}, La/x8x;->L(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v0, p0, La/wbc;->b:La/mm40;

    .line 19
    .line 20
    iget-object p0, p0, La/wbc;->c:Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    invoke-static {v0, p0, p1, p2}, La/hhm0;->f(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    const/4 p2, 0x7

    .line 29
    invoke-static {p2}, La/x8x;->L(I)I

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iget-object v0, p0, La/wbc;->b:La/mm40;

    .line 34
    .line 35
    iget-object p0, p0, La/wbc;->c:Lkotlin/jvm/functions/Function1;

    .line 36
    .line 37
    invoke-static {v0, p0, p1, p2}, La/yyw;->q(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_1
    const/4 p2, 0x1

    .line 44
    invoke-static {p2}, La/x8x;->L(I)I

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    iget-object v0, p0, La/wbc;->b:La/mm40;

    .line 49
    .line 50
    iget-object p0, p0, La/wbc;->c:Lkotlin/jvm/functions/Function1;

    .line 51
    .line 52
    invoke-static {v0, p0, p1, p2}, La/vbw0;->n(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_2
    const/16 p2, 0x31

    .line 59
    .line 60
    invoke-static {p2}, La/x8x;->L(I)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    iget-object v0, p0, La/wbc;->b:La/mm40;

    .line 65
    .line 66
    iget-object p0, p0, La/wbc;->c:Lkotlin/jvm/functions/Function1;

    .line 67
    .line 68
    invoke-static {v0, p0, p1, p2}, La/xbc;->c(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
