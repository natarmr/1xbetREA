.class public abstract La/stl;
.super La/yo8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V::",
        "La/yfu0;",
        ">",
        "La/yo8;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\'\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "La/stl;",
        "La/yfu0;",
        "V",
        "La/yo8;",
        "<init>",
        "()V",
        "uikit"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic f2:[La/iiy;


# instance fields
.field public final Y1:La/nae0;

.field public final Z1:La/n0o0;

.field public final a2:Z

.field public final b2:I

.field public c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public d2:Z

.field public e2:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/stl;

    .line 4
    .line 5
    const-string v2, "baseBinding"

    .line 6
    .line 7
    const-string v3, "getBaseBinding()Lorg/xplatform/uikit/databinding/DesignSystemBottomSheetParentViewBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/stl;->f2:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/yo8;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/qtl;->a:La/qtl;

    .line 5
    .line 6
    new-instance v1, La/pmi;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, La/pmi;-><init>(La/stl;Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, La/stl;->Y1:La/nae0;

    .line 12
    .line 13
    new-instance v0, La/ntl;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1}, La/ntl;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/stl;->Z1:La/n0o0;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, La/stl;->a2:Z

    .line 27
    .line 28
    const v0, 0x7f040ae5

    .line 29
    .line 30
    .line 31
    iput v0, p0, La/stl;->b2:I

    .line 32
    .line 33
    return-void
.end method

.method public static L0(La/stl;Landroid/view/View;Ljava/lang/Boolean;I)V
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 7
    .line 8
    .line 9
    move-result-object p3

    .line 10
    new-instance v0, La/ptl;

    .line 11
    .line 12
    invoke-direct {v0, p1, p0, p2}, La/ptl;-><init>(Landroid/view/View;La/stl;Ljava/lang/Boolean;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static N0(Landroid/view/View;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0a0388

    .line 6
    .line 7
    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of v0, p0, Landroid/view/View;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Landroid/view/View;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object p0, v1

    .line 24
    :goto_0
    if-eqz p0, :cond_2

    .line 25
    .line 26
    invoke-static {p0}, La/stl;->N0(Landroid/view/View;)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_2
    return-object v1
.end method


# virtual methods
.method public C0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/hw5;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, La/hw5;-><init>(La/stl;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final I0(La/kp8;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/stl;->M0(La/lp8;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, La/stl;->K0(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final J0(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/vfk;->c:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, La/vfk;->c:Landroid/widget/FrameLayout;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p0, p0, La/vfk;->c:Landroid/widget/FrameLayout;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final K0(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/vfk;->f:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, La/vfk;->f:Landroid/widget/FrameLayout;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p0, p0, La/vfk;->f:Landroid/widget/FrameLayout;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final M0(La/lp8;)Landroid/view/View;
    .locals 3

    .line 1
    instance-of v0, p1, La/jp8;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p0, v2, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    .line 15
    .line 16
    check-cast p1, La/jp8;

    .line 17
    .line 18
    iget-object p0, p1, La/jp8;->a:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setFirstButtonText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p1, La/jp8;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setSecondButtonText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    const p0, 0x7f140197

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setFirstButtonStyle(I)V

    .line 32
    .line 33
    .line 34
    const p0, 0x7f14018d

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setSecondButtonStyle(I)V

    .line 38
    .line 39
    .line 40
    const p0, 0x7f0706a9

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setButtonsHeight(I)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p1, La/jp8;->c:La/c2i0;

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setFirstButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p1, La/jp8;->d:La/c2i0;

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;->setSecondButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_0
    instance-of v0, p1, La/kp8;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    new-instance v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTitle;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-direct {v0, p0, v2, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTitle;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 72
    .line 73
    .line 74
    check-cast p1, La/kp8;

    .line 75
    .line 76
    iget-object p0, p1, La/kp8;->a:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    iget p0, p1, La/kp8;->b:I

    .line 82
    .line 83
    if-eqz p0, :cond_1

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTitle;->setTitleStyle(I)V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-object v0

    .line 89
    :cond_2
    instance-of v0, p1, La/ip8;

    .line 90
    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    new-instance v0, La/nnm;

    .line 94
    .line 95
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-direct {v0, p0}, La/nnm;-><init>(Landroid/content/Context;)V

    .line 100
    .line 101
    .line 102
    check-cast p1, La/ip8;

    .line 103
    .line 104
    iget-object p0, p1, La/ip8;->a:La/q00;

    .line 105
    .line 106
    invoke-virtual {v0, p0}, La/nnm;->setModel(La/q00;)V

    .line 107
    .line 108
    .line 109
    return-object v0

    .line 110
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 111
    .line 112
    .line 113
    return-object v2
.end method

.method public final O0()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/vfk;->b:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    new-instance v0, La/pls0;

    .line 8
    .line 9
    invoke-static {p0}, La/pym0;->i(Landroid/view/ViewGroup;)La/ihu0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, p0}, La/pls0;-><init>(Ljava/util/Iterator;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_0
    check-cast p0, Landroid/view/View;

    .line 33
    .line 34
    return-object p0
.end method

.method public final P0()La/vfk;
    .locals 2

    .line 1
    sget-object v0, La/stl;->f2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/stl;->Y1:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/vfk;

    .line 16
    .line 17
    return-object p0
.end method

.method public abstract Q0()La/yfu0;
.end method

.method public R0()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/stl;->N0(Landroid/view/View;)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v3

    .line 22
    :goto_0
    instance-of v4, v2, Landroid/view/View;

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    move-object v3, v2

    .line 27
    check-cast v3, Landroid/view/View;

    .line 28
    .line 29
    :cond_1
    iput-object v3, p0, La/stl;->e2:Landroid/view/View;

    .line 30
    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    new-instance v2, La/jw5;

    .line 34
    .line 35
    const/4 v4, 0x4

    .line 36
    invoke-direct {v2, p0, v4}, La/jw5;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, v2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    new-instance v2, La/lhf0;

    .line 43
    .line 44
    const/16 v3, 0x10

    .line 45
    .line 46
    invoke-direct {v2, v0, p0, v1, v3}, La/lhf0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    sget-object p0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 50
    .line 51
    invoke-static {v1, v2}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    new-instance p0, La/kw5;

    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    invoke-direct {p0, v1}, La/kw5;-><init>(B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public S0()V
    .locals 0

    .line 1
    return-void
.end method

.method public T0()V
    .locals 0

    .line 1
    return-void
.end method

.method public U0()V
    .locals 0

    .line 1
    return-void
.end method

.method public W(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/stl;->T0()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string p1, "Current screen: "

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "onCreate"

    .line 22
    .line 23
    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p1, p1, La/vfk;->a:Landroid/widget/FrameLayout;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, La/jmu0;->h(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/vfk;->e:Landroid/widget/FrameLayout;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p1, p1, La/vfk;->e:Landroid/widget/FrameLayout;

    .line 30
    .line 31
    invoke-virtual {p0}, La/stl;->Q0()La/yfu0;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p2}, La/yfu0;->getRoot()Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/stl;->P0()La/vfk;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    iget-object p0, p0, La/vfk;->a:Landroid/widget/FrameLayout;

    .line 47
    .line 48
    return-object p0
.end method

.method public Z()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 3
    .line 4
    iget-object v1, p0, La/stl;->e2:Landroid/view/View;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-object v0, p0, La/stl;->e2:Landroid/view/View;

    .line 12
    .line 13
    invoke-super {p0}, La/sik;->Z()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public e0()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const v1, 0x7f05000f

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const v2, 0x7f0706bd

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    float-to-int v1, v1

    .line 37
    iput v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I

    .line 38
    .line 39
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {p0}, La/sik;->D0()Landroid/app/Dialog;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-eqz p0, :cond_1

    .line 60
    .line 61
    invoke-static {p0, v0}, La/hfm0;->u(Landroid/view/Window;Landroid/view/Window;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void
.end method

.method public i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    const v0, 0x7f0a043a

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Landroid/widget/FrameLayout;

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->E(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 25
    .line 26
    :cond_1
    :goto_0
    const/4 p2, 0x1

    .line 27
    invoke-virtual {p1, p2}, Landroid/view/View;->setClipToOutline(Z)V

    .line 28
    .line 29
    .line 30
    new-instance v0, La/otl;

    .line 31
    .line 32
    invoke-direct {v0, p0, p2}, La/otl;-><init>(La/stl;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/stl;->R0()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/stl;->S0()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, La/stl;->U0()V

    .line 45
    .line 46
    .line 47
    return-void
.end method
