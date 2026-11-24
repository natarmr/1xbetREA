.class public final synthetic La/o5n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/uikit/components/tabs/DsTabs;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/uikit/components/tabs/DsTabs;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o5n;->a:B

    iput-object p1, p0, La/o5n;->b:Lorg/xplatform/uikit/components/tabs/DsTabs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/o5n;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/o5n;->b:Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lorg/xplatform/uikit/components/tabs/DsTabs;->g1:I

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/tabs/DsTabs;->i()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    sget v0, Lorg/xplatform/uikit/components/tabs/DsTabs;->g1:I

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
