.class public final Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;
.super Lcom/google/android/material/checkbox/b;
.source "SourceFile"

# interfaces
.implements La/hab;


# static fields
.field public static final synthetic g1:I


# instance fields
.field public f1:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p3, 0x7f04014e

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/material/checkbox/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->f1:Z

    .line 17
    .line 18
    new-instance p1, La/oac;

    .line 19
    .line 20
    invoke-direct {p1, p0, v0}, La/oac;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/google/android/material/checkbox/b;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 24
    .line 25
    .line 26
    const-string p1, "DsCellRightRadioButtonTestTag"

    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final e()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->f1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final j()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    return p0
.end method

.method public final k()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method

.method public final setDefaultClickHandleEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightRadioButton;->f1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSelected(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/google/android/material/checkbox/b;->setChecked(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method
