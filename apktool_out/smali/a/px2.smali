.class public final synthetic La/px2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/px2;->a:B

    iput-object p1, p0, La/px2;->b:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/px2;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/px2;->b:Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/pah0;

    .line 9
    .line 10
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->o1:Landroidx/collection/MutableIntList;

    .line 11
    .line 12
    iget-object v0, p1, La/pah0;->b:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getSnapshotObserver()La/eg80;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->n1:La/px2;

    .line 28
    .line 29
    new-instance v2, La/mc;

    .line 30
    .line 31
    const/16 v3, 0x17

    .line 32
    .line 33
    invoke-direct {v2, p1, p0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    iget-object p0, v0, La/eg80;->a:La/pgk0;

    .line 37
    .line 38
    invoke-virtual {p0, p1, v1, v2}, La/pgk0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_0
    check-cast p1, Landroid/view/accessibility/AccessibilityEvent;

    .line 45
    .line 46
    iget-object p0, p0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, p0, p1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
