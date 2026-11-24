.class public final synthetic La/swy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/fql0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/fql0;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/swy;->a:B

    iput-object p1, p0, La/swy;->b:La/mm40;

    iput-object p2, p0, La/swy;->c:La/fql0;

    iput-object p3, p0, La/swy;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/swy;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/swy;->d:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iget-object v3, p0, La/swy;->c:La/fql0;

    .line 7
    .line 8
    iget-object p0, p0, La/swy;->b:La/mm40;

    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-static {v1}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    invoke-static {p0, v3, v2, p1, p2}, La/jd8;->T(La/mm40;La/fql0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    invoke-static {v1}, La/x8x;->L(I)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-static {p0, v3, v2, p1, p2}, La/rq8;->B(La/mm40;La/fql0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_1
    invoke-static {v1}, La/x8x;->L(I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    invoke-static {p0, v3, v2, p1, p2}, La/j47;->n0(La/mm40;La/fql0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_2
    invoke-static {v1}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    invoke-static {p0, v3, v2, p1, p2}, La/saj;->R(La/mm40;La/fql0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
