.class public final synthetic La/xsl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xsl;->a:B

    iput-object p1, p0, La/xsl;->b:Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;

    iput-object p2, p0, La/xsl;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/xsl;->a:B

    iget-object v1, p0, La/xsl;->c:Lkotlin/jvm/functions/Function0;

    iget-object p0, p0, La/xsl;->b:Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;

    packed-switch v0, :pswitch_data_0

    invoke-static {p0, v1}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->I0(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;Lkotlin/jvm/functions/Function0;)V

    return-void

    :pswitch_0
    invoke-static {p0, v1}, Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;->H0(Lorg/xplatform/uikit/components/banner_collection/DsBannerCollection;Lkotlin/jvm/functions/Function0;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
