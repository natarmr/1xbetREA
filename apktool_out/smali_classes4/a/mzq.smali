.class public final La/mzq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yfu0;


# instance fields
.field public final synthetic a:B

.field public final b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mzq;->a:B

    iput-object p1, p0, La/mzq;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getRoot()Landroid/view/View;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mzq;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/mzq;->b:Landroid/view/View;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoVerticalTextView;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_1
    check-cast p0, Lorg/xplatform/uikit/components/footer/DsFooter;

    .line 15
    .line 16
    :pswitch_2
    return-object p0

    .line 17
    :pswitch_3
    check-cast p0, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_4
    check-cast p0, Landroid/view/ViewStub;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_5
    check-cast p0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_6
    check-cast p0, Landroidx/fragment/app/FragmentContainerView;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
