.class public final synthetic La/p6l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/uikit_sport/express_card/SportExpressCard;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/uikit_sport/express_card/SportExpressCard;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p6l0;->a:B

    iput-object p1, p0, La/p6l0;->b:Lorg/xplatform/uikit_sport/express_card/SportExpressCard;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/p6l0;->a:B

    iget-object p0, p0, La/p6l0;->b:Lorg/xplatform/uikit_sport/express_card/SportExpressCard;

    check-cast p1, La/fet;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, p1, p2}, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;->b(Lorg/xplatform/uikit_sport/express_card/SportExpressCard;La/fet;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    :pswitch_0
    invoke-static {p0, p1, p2}, Lorg/xplatform/uikit_sport/express_card/SportExpressCard;->a(Lorg/xplatform/uikit_sport/express_card/SportExpressCard;La/fet;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
