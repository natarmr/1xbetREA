.class public final Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/mzq;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p3, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const p2, 0x7f0d05df

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    check-cast p1, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoVerticalTextView;

    .line 31
    .line 32
    new-instance p2, La/mzq;

    .line 33
    .line 34
    const/4 p3, 0x6

    .line 35
    invoke-direct {p2, p1, p3}, La/mzq;-><init>(Landroid/view/View;B)V

    .line 36
    .line 37
    .line 38
    iput-object p2, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;->a:La/mzq;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const-string p0, "rootView"

    .line 42
    .line 43
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
.end method


# virtual methods
.method public final a(IILjava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;->a:La/mzq;

    .line 5
    .line 6
    iget-object v1, v0, La/mzq;->b:Landroid/view/View;

    .line 7
    .line 8
    check-cast v1, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoVerticalTextView;

    .line 9
    .line 10
    invoke-virtual {v1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iget-object p3, v0, La/mzq;->b:Landroid/view/View;

    .line 14
    .line 15
    check-cast p3, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoVerticalTextView;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/content/Context;->getColor(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
