.class public final La/aig0;
.super La/w5;
.source "SourceFile"


# instance fields
.field public final u:La/zkk;

.field public final v:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(La/zkk;La/ksc0;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/zkk;->f:Landroid/view/ViewGroup;

    .line 5
    .line 6
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/aig0;->u:La/zkk;

    .line 15
    .line 16
    iput-object p2, p0, La/aig0;->v:Lkotlin/jvm/functions/Function2;

    .line 17
    .line 18
    iget-object p0, p1, La/zkk;->e:Landroid/view/View;

    .line 19
    .line 20
    check-cast p0, Landroid/widget/TextView;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->setFadingEdgeLength(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final t()V
    .locals 6

    .line 1
    iget-object v0, p0, La/aig0;->u:La/zkk;

    .line 2
    .line 3
    iget-object v1, v0, La/zkk;->e:Landroid/view/View;

    .line 4
    .line 5
    check-cast v1, Landroid/widget/TextView;

    .line 6
    .line 7
    const-string v2, ""

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, v0, La/zkk;->d:Landroid/widget/TextView;

    .line 13
    .line 14
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 18
    .line 19
    iget-object p0, p0, La/xhe0;->a:Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const v4, 0x7f040b0b

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-static {v2, v4, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {p0, v4, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-virtual {v3, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    invoke-virtual {v3, p0, p0, p0, p0}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v0, La/zkk;->i:Landroid/view/View;

    .line 58
    .line 59
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 60
    .line 61
    invoke-virtual {v1, p0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v0, La/zkk;->b:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Landroid/widget/ImageView;

    .line 67
    .line 68
    invoke-virtual {v2, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 69
    .line 70
    .line 71
    iget-object v2, v0, La/zkk;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Landroid/widget/ImageView;

    .line 74
    .line 75
    invoke-virtual {v2, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 76
    .line 77
    .line 78
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 79
    .line 80
    invoke-static {v1}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 81
    .line 82
    .line 83
    iget-object p0, v0, La/zkk;->h:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 86
    .line 87
    invoke-static {p0}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 88
    .line 89
    .line 90
    return-void
.end method
