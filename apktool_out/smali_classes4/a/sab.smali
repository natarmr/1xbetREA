.class public final La/sab;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final q:La/a8z;

.field public r:I

.field public s:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {p0, p1, v0, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    .line 8
    .line 9
    sget-object p1, La/wez;->b:La/wez;

    .line 10
    .line 11
    new-instance v0, La/h5;

    .line 12
    .line 13
    const/16 v1, 0xe

    .line 14
    .line 15
    invoke-direct {v0, p0, p0, v1}, La/h5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, La/sab;->q:La/a8z;

    .line 23
    .line 24
    return-void
.end method

.method private final getBinding()La/wfu0;
    .locals 0

    .line 1
    iget-object p0, p0, La/sab;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/wfu0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static u(ILa/sab;)V
    .locals 0

    .line 1
    invoke-direct {p1}, La/sab;->getBinding()La/wfu0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/wfu0;->b:Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 8
    .line 9
    .line 10
    const/high16 p0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroid/view/View;->setAlpha(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getColumn()I
    .locals 0

    .line 1
    iget p0, p0, La/sab;->s:I

    .line 2
    .line 3
    return p0
.end method

.method public final getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    invoke-direct {p0}, La/sab;->getBinding()La/wfu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/wfu0;->b:Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final getRow()I
    .locals 0

    .line 1
    iget p0, p0, La/sab;->r:I

    .line 2
    .line 3
    return p0
.end method

.method public final setColumn(I)V
    .locals 0

    .line 1
    iput p1, p0, La/sab;->s:I

    .line 2
    .line 3
    return-void
.end method

.method public final setMargin(I)V
    .locals 2

    .line 1
    new-instance v0, La/a3e;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-direct {v0, v1, v1}, La/a3e;-><init>(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, La/sab;->getBinding()La/wfu0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, La/wfu0;->b:Landroid/widget/ImageView;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final setRow(I)V
    .locals 0

    .line 1
    iput p1, p0, La/sab;->r:I

    .line 2
    .line 3
    return-void
.end method
