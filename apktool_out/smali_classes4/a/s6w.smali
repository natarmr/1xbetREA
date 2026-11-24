.class public final synthetic La/s6w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;


# direct methods
.method public synthetic constructor <init>(La/cp;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s6w;->a:B

    iput-object p1, p0, La/s6w;->b:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/s6w;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/s6w;->b:La/cp;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 9
    .line 10
    check-cast p0, La/vwx;

    .line 11
    .line 12
    iget-object v0, p0, La/vwx;->a:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    check-cast v0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    if-nez v0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->findFocus()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    invoke-virtual {v0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object p1, p0, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 49
    .line 50
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->getTextView()Landroid/widget/TextView;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 61
    .line 62
    .line 63
    :cond_3
    iget-object p0, p0, La/vwx;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 66
    .line 67
    .line 68
    :goto_1
    return-void

    .line 69
    :pswitch_0
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 70
    .line 71
    check-cast p0, La/j1w;

    .line 72
    .line 73
    iget-object p0, p0, La/j1w;->b:Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;

    .line 74
    .line 75
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld;->performClick()Z

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
