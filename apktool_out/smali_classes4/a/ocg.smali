.class public final synthetic La/ocg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/aig;


# direct methods
.method public synthetic constructor <init>(La/aig;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ocg;->a:B

    iput-object p1, p0, La/ocg;->b:La/aig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ocg;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ocg;->b:La/aig;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v0, La/lhg;

    .line 14
    .line 15
    invoke-direct {v0, p1}, La/lhg;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/aig;->M(La/shg;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    packed-switch p1, :pswitch_data_1

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_1
    sget-object p1, La/phg;->a:La/phg;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, La/aig;->M(La/shg;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :pswitch_2
    sget-object p1, La/ohg;->a:La/ohg;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/aig;->M(La/shg;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_3
    sget-object p1, La/mhg;->a:La/mhg;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, La/aig;->M(La/shg;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_4
    check-cast p1, La/lwk;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    sget-object p1, La/ghg;->a:La/ghg;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, La/aig;->M(La/shg;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, La/ty2;

    .line 65
    .line 66
    const/16 v0, 0x9

    .line 67
    .line 68
    invoke-direct {p1, p0, v0}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    return-object p1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_0
    .end packed-switch

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    :pswitch_data_1
    .packed-switch 0x3e9
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
