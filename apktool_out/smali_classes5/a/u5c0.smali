.class public final synthetic La/u5c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b0c0;


# direct methods
.method public synthetic constructor <init>(La/b0c0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u5c0;->a:B

    iput-object p1, p0, La/u5c0;->b:La/b0c0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/u5c0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/u5c0;->b:La/b0c0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Landroid/view/View;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/b0c0;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p1, La/cp;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 25
    .line 26
    check-cast v0, La/o2k;

    .line 27
    .line 28
    iget-object v1, v0, La/o2k;->b:Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;

    .line 29
    .line 30
    new-instance v2, La/u5c0;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-direct {v2, p0, v3}, La/u5c0;-><init>(La/b0c0;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, v0, La/o2k;->b:Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;

    .line 40
    .line 41
    const v0, 0x7f131027

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, La/cp;->v(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0, v0}, Lorg/xplatform/promo/impl/promocodes/presentation/components/PromoBanner;->setLabel(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance p0, La/ctv;

    .line 52
    .line 53
    const/16 v0, 0xe

    .line 54
    .line 55
    invoke-direct {p0, p1, p1, v0}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
