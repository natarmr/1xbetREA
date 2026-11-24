.class public final synthetic La/cp9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/cp;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/cp9;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cp9;->b:La/cp;

    iput-object p2, p0, La/cp9;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/cp;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/cp9;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cp9;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/cp9;->b:La/cp;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/cp9;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/cp9;->c:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iget-object p0, p0, La/cp9;->b:La/cp;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/xb;

    .line 11
    .line 12
    const/16 v2, 0x14

    .line 13
    .line 14
    invoke-direct {v0, v1, p0, v2}, La/xb;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, La/cp;->u:La/yfu0;

    .line 18
    .line 19
    check-cast v1, La/scu0;

    .line 20
    .line 21
    iget-object v1, v1, La/scu0;->b:Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;

    .line 22
    .line 23
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/vte;

    .line 28
    .line 29
    iget-boolean p0, p0, La/vte;->t:Z

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v0, 0x0

    .line 35
    :goto_0
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit_sport/sport_coupon_card/common/DsSportCouponCard;->setMoveButtonClickListener(Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    invoke-virtual {p0}, La/cp;->u()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {v1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
