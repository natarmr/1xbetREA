.class public final synthetic La/bnm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnScrollChangeListener;


# virtual methods
.method public final onScrollChange(Landroid/view/View;IIII)V
    .locals 0

    .line 1
    sget p0, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->f:I

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    invoke-virtual {p1, p0}, Landroid/view/View;->setScrollY(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
