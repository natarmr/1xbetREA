.class public final La/c8e0;
.super La/w5;
.source "SourceFile"


# instance fields
.field public final u:La/iab;


# direct methods
.method public constructor <init>(La/iab;)V
    .locals 1

    .line 1
    iget-object v0, p1, La/iab;->d:Landroid/view/ViewGroup;

    .line 2
    .line 3
    check-cast v0, Landroid/widget/LinearLayout;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, La/c8e0;->u:La/iab;

    .line 12
    .line 13
    return-void
.end method

.method public static w(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-lez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 12
    .line 13
    const-string v0, "sfiles"

    .line 14
    .line 15
    const-string v1, "logo_teams"

    .line 16
    .line 17
    invoke-static {v0, v1, p1}, La/rz4;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/bzu;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/bzu;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object p1, La/g2x;->a:La/g2x;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    const/4 v6, 0x0

    .line 36
    const/16 v7, 0x1ee

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v5, 0x0

    .line 41
    move-object v0, p0

    .line 42
    invoke-static/range {v0 .. v7}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    move-object v0, p0

    .line 47
    const/16 p0, 0x8

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final t()V
    .locals 6

    .line 1
    iget-object v0, p0, La/c8e0;->u:La/iab;

    .line 2
    .line 3
    iget-object v1, v0, La/iab;->c:Landroid/view/View;

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
    iget-object v3, v0, La/iab;->h:Landroid/view/View;

    .line 13
    .line 14
    check-cast v3, Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, v0, La/iab;->d:Landroid/view/ViewGroup;

    .line 20
    .line 21
    check-cast v2, Landroid/widget/LinearLayout;

    .line 22
    .line 23
    const v4, 0x800013

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 27
    .line 28
    .line 29
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 30
    .line 31
    iget-object p0, p0, La/xhe0;->a:Landroid/view/View;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    const v4, 0x7f040b0b

    .line 41
    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-static {v2, v4, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v4, v5}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    invoke-virtual {v3, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 63
    .line 64
    .line 65
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 66
    .line 67
    iget-object p0, v0, La/iab;->b:Landroid/view/View;

    .line 68
    .line 69
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 70
    .line 71
    invoke-static {p0}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v0, La/iab;->g:Landroid/view/View;

    .line 75
    .line 76
    check-cast v1, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 77
    .line 78
    invoke-static {v1}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, v0, La/iab;->e:Landroid/view/View;

    .line 82
    .line 83
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 84
    .line 85
    invoke-static {v2}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, La/iab;->f:Landroid/view/View;

    .line 89
    .line 90
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 91
    .line 92
    invoke-static {v0}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 93
    .line 94
    .line 95
    const/4 v3, 0x0

    .line 96
    invoke-virtual {p0, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    iget-object p0, p0, La/c8e0;->u:La/iab;

    .line 2
    .line 3
    iget-object v0, p0, La/iab;->g:Landroid/view/View;

    .line 4
    .line 5
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/iab;->f:Landroid/view/View;

    .line 13
    .line 14
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, La/iab;->h:Landroid/view/View;

    .line 20
    .line 21
    check-cast p0, Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
