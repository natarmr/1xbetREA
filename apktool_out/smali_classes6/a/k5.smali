.class public abstract La/k5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p5d;

.field public final b:La/rhg0;

.field public final c:La/aab;

.field public d:Ljava/util/List;

.field public e:Ljava/util/List;

.field public f:Ljava/util/List;

.field public final g:Ljava/util/ArrayList;

.field public h:Landroid/view/View;

.field public i:La/y8b;

.field public final j:Landroid/graphics/Paint;

.field public final k:I


# direct methods
.method public constructor <init>(La/nmo0;ZI)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/iun;->a:La/iun;

    .line 8
    .line 9
    iput-object v0, p0, La/k5;->d:Ljava/util/List;

    .line 10
    .line 11
    iput-object v0, p0, La/k5;->e:Ljava/util/List;

    .line 12
    .line 13
    iput-object v0, p0, La/k5;->f:Ljava/util/List;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/k5;->g:Ljava/util/ArrayList;

    .line 21
    .line 22
    new-instance v0, Landroid/graphics/Paint;

    .line 23
    .line 24
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, La/nmo0;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1, p3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 36
    .line 37
    .line 38
    move-result p3

    .line 39
    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, La/nmo0;->getContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    const v1, 0x7f090003

    .line 47
    .line 48
    .line 49
    invoke-static {v1, p3}, La/itf0;->a(ILandroid/content/Context;)Landroid/graphics/Typeface;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, La/k5;->j:Landroid/graphics/Paint;

    .line 57
    .line 58
    invoke-interface {p1}, La/nmo0;->getContext()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    const v0, 0x7f070634

    .line 67
    .line 68
    .line 69
    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    iput p3, p0, La/k5;->k:I

    .line 74
    .line 75
    invoke-interface {p1}, La/nmo0;->getContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    new-instance v0, La/p5d;

    .line 80
    .line 81
    iget-object v1, p0, La/k5;->d:Ljava/util/List;

    .line 82
    .line 83
    invoke-direct {v0, p3, v1, p0}, La/p5d;-><init>(Landroid/content/Context;Ljava/util/List;La/k5;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, La/k5;->a:La/p5d;

    .line 87
    .line 88
    new-instance v0, La/rhg0;

    .line 89
    .line 90
    iget-object v1, p0, La/k5;->e:Ljava/util/List;

    .line 91
    .line 92
    invoke-direct {v0, p3, v1, p0, p2}, La/rhg0;-><init>(Landroid/content/Context;Ljava/util/List;La/k5;Z)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, La/k5;->b:La/rhg0;

    .line 96
    .line 97
    iget-object v0, p0, La/k5;->f:Ljava/util/List;

    .line 98
    .line 99
    new-instance v1, La/aab;

    .line 100
    .line 101
    invoke-direct {v1, v0, p3, p1, p2}, La/aab;-><init>(Ljava/util/List;Landroid/content/Context;La/nmo0;Z)V

    .line 102
    .line 103
    .line 104
    iput-object v1, p0, La/k5;->c:La/aab;

    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final a(II)La/y8b;
    .locals 1

    .line 1
    iget-object v0, p0, La/k5;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, La/k5;->f:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ge p2, v0, :cond_1

    .line 18
    .line 19
    if-ltz p2, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, La/k5;->f:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-lt p1, v0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object p0, p0, La/k5;->f:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/y8b;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 52
    return-object p0
.end method

.method public b(II)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final c(I)La/y8b;
    .locals 1

    .line 1
    iget-object v0, p0, La/k5;->d:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, La/k5;->d:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lt p1, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p0, p0, La/k5;->d:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, La/y8b;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public d(I)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final e(I)La/y8b;
    .locals 1

    .line 1
    iget-object v0, p0, La/k5;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, La/k5;->e:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-lt p1, v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p0, p0, La/k5;->e:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, La/y8b;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 30
    return-object p0
.end method

.method public f(I)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public abstract g()La/nmo0;
.end method

.method public final h(La/y8b;Ljava/util/HashMap;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    instance-of v1, p1, La/w8b;

    .line 6
    .line 7
    if-eqz v1, :cond_3

    .line 8
    .line 9
    check-cast p1, La/w8b;

    .line 10
    .line 11
    iget-object v0, p1, La/w8b;->a:La/h9b;

    .line 12
    .line 13
    invoke-virtual {p0, v0, p2}, La/k5;->i(La/i9b;Ljava/util/HashMap;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    iget-object p2, p1, La/w8b;->b:Ljava/lang/Integer;

    .line 18
    .line 19
    iget-object p1, p1, La/w8b;->c:Ljava/lang/Integer;

    .line 20
    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-lt p0, v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :cond_1
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-gt p0, p2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    :cond_2
    return p0

    .line 47
    :cond_3
    instance-of v1, p1, La/v8b;

    .line 48
    .line 49
    if-eqz v1, :cond_6

    .line 50
    .line 51
    check-cast p1, La/v8b;

    .line 52
    .line 53
    iget-object v1, p1, La/v8b;->a:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, La/i9b;

    .line 70
    .line 71
    invoke-virtual {p0, v2, p2}, La/k5;->i(La/i9b;Ljava/util/HashMap;)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    add-int/2addr v0, v2

    .line 76
    goto :goto_0

    .line 77
    :cond_4
    iget-object p0, p1, La/v8b;->b:Ljava/lang/Integer;

    .line 78
    .line 79
    iget-object p1, p1, La/v8b;->c:Ljava/lang/Integer;

    .line 80
    .line 81
    if-eqz p0, :cond_5

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    if-lt v0, p2, :cond_5

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    return p0

    .line 94
    :cond_5
    if-eqz p1, :cond_6

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    if-gt v0, p0, :cond_6

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    return p0

    .line 107
    :cond_6
    :goto_1
    return v0
.end method

.method public final i(La/i9b;Ljava/util/HashMap;)I
    .locals 2

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    instance-of v0, p1, La/f9b;

    .line 4
    .line 5
    iget v1, p0, La/k5;->k:I

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p1, La/f9b;

    .line 10
    .line 11
    iget p0, p1, La/f9b;->a:I

    .line 12
    .line 13
    mul-int/lit8 v1, v1, 0x2

    .line 14
    .line 15
    add-int/2addr v1, p0

    .line 16
    return v1

    .line 17
    :cond_0
    instance-of v0, p1, La/g9b;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p1, La/g9b;

    .line 22
    .line 23
    iget p0, p1, La/g9b;->a:I

    .line 24
    .line 25
    return p0

    .line 26
    :cond_1
    instance-of v0, p1, La/h9b;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    check-cast p1, La/h9b;

    .line 31
    .line 32
    iget-object p1, p1, La/h9b;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    iget-object p0, p0, La/k5;->j:Landroid/graphics/Paint;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    mul-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    int-to-float v0, v1

    .line 49
    add-float/2addr p0, v0

    .line 50
    float-to-int p0, p0

    .line 51
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_2
    check-cast v0, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    return p0

    .line 65
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    return p0
.end method

.method public j(La/w5;La/y8b;)V
    .locals 0

    .line 1
    instance-of p0, p1, La/gaq0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    instance-of p0, p2, La/wwh;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p1, La/gaq0;

    .line 10
    .line 11
    check-cast p2, La/wwh;

    .line 12
    .line 13
    iget-object p0, p1, La/gaq0;->u:La/d5e0;

    .line 14
    .line 15
    iget-object p0, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 16
    .line 17
    iget-object p1, p2, La/wwh;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public k(La/w5;La/y8b;)V
    .locals 0

    .line 1
    instance-of p0, p1, La/mow;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    instance-of p0, p2, La/znw;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p1, La/mow;

    .line 10
    .line 11
    check-cast p2, La/znw;

    .line 12
    .line 13
    iget-object p0, p1, La/mow;->u:La/d5e0;

    .line 14
    .line 15
    iget-object p0, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 16
    .line 17
    iget-object p1, p2, La/znw;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public l(La/w5;La/y8b;)V
    .locals 0

    .line 1
    return-void
.end method

.method public m(Landroid/view/ViewGroup;I)La/w5;
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    const v2, 0x7f0a10d6

    .line 12
    .line 13
    .line 14
    const-string v3, "Missing required view with ID: "

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    if-eq p2, v0, :cond_7

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    if-eq p2, v0, :cond_5

    .line 21
    .line 22
    const/4 v0, 0x3

    .line 23
    const/4 v2, 0x4

    .line 24
    if-eq p2, v0, :cond_3

    .line 25
    .line 26
    if-eq p2, v2, :cond_1

    .line 27
    .line 28
    const/16 v0, 0xa

    .line 29
    .line 30
    if-eq p2, v0, :cond_0

    .line 31
    .line 32
    new-instance p2, La/sun;

    .line 33
    .line 34
    invoke-static {p0, p1}, La/auh;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/auh;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    iget-object p0, p0, La/auh;->b:Landroid/widget/FrameLayout;

    .line 39
    .line 40
    invoke-direct {p2, p0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    return-object p2

    .line 44
    :cond_0
    new-instance p2, La/ttq;

    .line 45
    .line 46
    invoke-static {p0, p1}, La/d5e0;->e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/d5e0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-direct {p2, p0}, La/ttq;-><init>(La/d5e0;)V

    .line 51
    .line 52
    .line 53
    return-object p2

    .line 54
    :cond_1
    new-instance p2, La/itq;

    .line 55
    .line 56
    const v0, 0x7f0d0635

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    check-cast p0, Landroid/widget/FrameLayout;

    .line 66
    .line 67
    invoke-direct {p2, p0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 68
    .line 69
    .line 70
    return-object p2

    .line 71
    :cond_2
    const-string p0, "rootView"

    .line 72
    .line 73
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    new-instance p2, La/c5p0;

    .line 78
    .line 79
    const v0, 0x7f0d0675

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v0, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const p1, 0x7f0a08ca

    .line 87
    .line 88
    .line 89
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Landroid/widget/ImageView;

    .line 94
    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    const p1, 0x7f0a1243

    .line 98
    .line 99
    .line 100
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    check-cast v4, Landroid/widget/TextView;

    .line 105
    .line 106
    if-eqz v4, :cond_4

    .line 107
    .line 108
    new-instance p1, La/jk30;

    .line 109
    .line 110
    check-cast p0, Landroid/widget/LinearLayout;

    .line 111
    .line 112
    invoke-direct {p1, p0, v0, v4, v2}, La/jk30;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;B)V

    .line 113
    .line 114
    .line 115
    invoke-direct {p2, p1}, La/c5p0;-><init>(La/jk30;)V

    .line 116
    .line 117
    .line 118
    return-object p2

    .line 119
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-object v1

    .line 135
    :cond_5
    new-instance p2, La/vzr0;

    .line 136
    .line 137
    const v0, 0x7f0d067d

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v0, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    check-cast p1, Landroid/widget/TextView;

    .line 149
    .line 150
    if-eqz p1, :cond_6

    .line 151
    .line 152
    new-instance v0, La/bdu0;

    .line 153
    .line 154
    check-cast p0, Landroid/widget/FrameLayout;

    .line 155
    .line 156
    const/4 v1, 0x7

    .line 157
    invoke-direct {v0, p0, p1, v1}, La/bdu0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 158
    .line 159
    .line 160
    invoke-direct {p2, v0}, La/vzr0;-><init>(La/bdu0;)V

    .line 161
    .line 162
    .line 163
    return-object p2

    .line 164
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    return-object v1

    .line 180
    :cond_7
    new-instance p2, La/i2u0;

    .line 181
    .line 182
    const v0, 0x7f0d067e

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, v0, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-static {p0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    check-cast p1, Landroid/widget/TextView;

    .line 194
    .line 195
    if-eqz p1, :cond_8

    .line 196
    .line 197
    new-instance v0, La/bdu0;

    .line 198
    .line 199
    check-cast p0, Landroid/widget/FrameLayout;

    .line 200
    .line 201
    const/16 v1, 0x8

    .line 202
    .line 203
    invoke-direct {v0, p0, p1, v1}, La/bdu0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 204
    .line 205
    .line 206
    invoke-direct {p2, v0}, La/i2u0;-><init>(La/bdu0;)V

    .line 207
    .line 208
    .line 209
    return-object p2

    .line 210
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-object v1
.end method

.method public n(Landroid/view/ViewGroup;I)La/w5;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x6

    .line 10
    if-eq p2, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x7

    .line 13
    if-eq p2, v0, :cond_0

    .line 14
    .line 15
    new-instance p2, La/sun;

    .line 16
    .line 17
    invoke-static {p0, p1}, La/auh;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/auh;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, La/auh;->b:Landroid/widget/FrameLayout;

    .line 22
    .line 23
    invoke-direct {p2, p0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    return-object p2

    .line 27
    :cond_0
    new-instance p2, La/aww;

    .line 28
    .line 29
    invoke-static {p0, p1}, La/nq8;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/nq8;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {p2, p0}, La/aww;-><init>(La/nq8;)V

    .line 34
    .line 35
    .line 36
    return-object p2

    .line 37
    :cond_1
    new-instance p2, La/mrq0;

    .line 38
    .line 39
    invoke-static {p0, p1}, La/bdu0;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/bdu0;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {p2, p0}, La/mrq0;-><init>(La/bdu0;)V

    .line 44
    .line 45
    .line 46
    return-object p2
.end method

.method public o(Landroid/view/ViewGroup;La/y8b;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const p2, 0x7f0d0630

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 24
    .line 25
    const v1, 0x7f07071e

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v1}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-direct {p2, v0, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method

.method public p(Landroid/view/ViewGroup;I)La/w5;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    if-eq p2, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x9

    .line 14
    .line 15
    if-eq p2, v0, :cond_0

    .line 16
    .line 17
    new-instance p2, La/sun;

    .line 18
    .line 19
    invoke-static {p0, p1}, La/auh;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/auh;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p0, p0, La/auh;->b:Landroid/widget/FrameLayout;

    .line 24
    .line 25
    invoke-direct {p2, p0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    return-object p2

    .line 29
    :cond_0
    new-instance p2, La/ogr0;

    .line 30
    .line 31
    invoke-static {p0, p1}, La/bdu0;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/bdu0;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {p2, p0}, La/ogr0;-><init>(La/bdu0;)V

    .line 36
    .line 37
    .line 38
    return-object p2

    .line 39
    :cond_1
    new-instance p2, La/zih0;

    .line 40
    .line 41
    const v0, 0x7f0d066f

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const p1, 0x7f0a0fce

    .line 50
    .line 51
    .line 52
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Landroid/widget/TextView;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    new-instance p1, La/bdu0;

    .line 61
    .line 62
    check-cast p0, Landroid/widget/FrameLayout;

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    invoke-direct {p1, p0, v0, v1}, La/bdu0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p2, p1}, La/zih0;-><init>(La/bdu0;)V

    .line 69
    .line 70
    .line 71
    return-object p2

    .line 72
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const-string p1, "Missing required view with ID: "

    .line 81
    .line 82
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    return-object p0
.end method

.method public final q(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/y8b;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/k5;->f:Ljava/util/List;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, La/k5;->e:Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    iget-object v0, p0, La/k5;->d:Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {p3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p4, v0}, La/k5;->h(La/y8b;Ljava/util/HashMap;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, La/y8b;

    .line 62
    .line 63
    invoke-virtual {p0, v3, v0}, La/k5;->h(La/y8b;Ljava/util/HashMap;)I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-static {v1, v3}, Ljava/lang/Integer;->max(II)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    goto :goto_0

    .line 72
    :cond_1
    iget-object v2, p0, La/k5;->h:Landroid/view/View;

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    iget-object v4, p0, La/k5;->i:La/y8b;

    .line 78
    .line 79
    invoke-virtual {p4, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {p0}, La/k5;->g()La/nmo0;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    check-cast v4, Landroid/view/ViewGroup;

    .line 94
    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {p0, v4, p4}, La/k5;->o(Landroid/view/ViewGroup;La/y8b;)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2, v3, v3}, Landroid/view/View;->measure(II)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    invoke-virtual {v4, v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 112
    .line 113
    .line 114
    iput-object v2, p0, La/k5;->h:Landroid/view/View;

    .line 115
    .line 116
    iput-object p4, p0, La/k5;->i:La/y8b;

    .line 117
    .line 118
    :goto_1
    invoke-virtual {p0}, La/k5;->g()La/nmo0;

    .line 119
    .line 120
    .line 121
    move-result-object p4

    .line 122
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    invoke-static {v1, v4}, Ljava/lang/Integer;->max(II)I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    invoke-interface {p4, v1}, La/nmo0;->setRowHeaderWidth(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 134
    .line 135
    .line 136
    move-result-object p4

    .line 137
    if-eqz p4, :cond_18

    .line 138
    .line 139
    invoke-virtual {p0}, La/k5;->g()La/nmo0;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-interface {v1}, La/nmo0;->getRowHeaderWidth()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    iput v1, p4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 148
    .line 149
    invoke-virtual {v2, p4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, La/k5;->g()La/nmo0;

    .line 153
    .line 154
    .line 155
    move-result-object p4

    .line 156
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    if-eqz v1, :cond_4

    .line 161
    .line 162
    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_4
    move v1, v3

    .line 166
    :goto_2
    invoke-interface {p4, v1}, La/nmo0;->setColumnHeaderHeight(I)V

    .line 167
    .line 168
    .line 169
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 170
    .line 171
    .line 172
    move-result p4

    .line 173
    if-nez p4, :cond_14

    .line 174
    .line 175
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result p4

    .line 179
    if-eqz p4, :cond_5

    .line 180
    .line 181
    goto/16 :goto_9

    .line 182
    .line 183
    :cond_5
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 184
    .line 185
    .line 186
    move-result p4

    .line 187
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-eqz v2, :cond_13

    .line 196
    .line 197
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    check-cast v2, Ljava/util/List;

    .line 202
    .line 203
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    if-eqz v4, :cond_7

    .line 212
    .line 213
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    check-cast v4, Ljava/util/List;

    .line 218
    .line 219
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    if-le v2, v4, :cond_6

    .line 224
    .line 225
    move v2, v4

    .line 226
    goto :goto_3

    .line 227
    :cond_7
    if-eq v2, p4, :cond_8

    .line 228
    .line 229
    goto/16 :goto_9

    .line 230
    .line 231
    :cond_8
    new-array v1, p4, [I

    .line 232
    .line 233
    move v2, v3

    .line 234
    :goto_4
    if-ge v2, p4, :cond_9

    .line 235
    .line 236
    invoke-interface {p3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    check-cast v4, La/y8b;

    .line 241
    .line 242
    invoke-virtual {p0, v4, v0}, La/k5;->h(La/y8b;Ljava/util/HashMap;)I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    aput v4, v1, v2

    .line 247
    .line 248
    add-int/lit8 v2, v2, 0x1

    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_9
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    :cond_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    if-eqz v4, :cond_c

    .line 260
    .line 261
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    check-cast v4, Ljava/util/List;

    .line 266
    .line 267
    move v5, v3

    .line 268
    :goto_5
    if-ge v5, p4, :cond_a

    .line 269
    .line 270
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    check-cast v6, La/y8b;

    .line 275
    .line 276
    invoke-virtual {p0, v6, v0}, La/k5;->h(La/y8b;Ljava/util/HashMap;)I

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    aget v7, v1, v5

    .line 281
    .line 282
    if-le v6, v7, :cond_b

    .line 283
    .line 284
    aput v6, v1, v5

    .line 285
    .line 286
    :cond_b
    add-int/lit8 v5, v5, 0x1

    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_c
    invoke-virtual {p0}, La/k5;->g()La/nmo0;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-interface {v0}, La/nmo0;->getColumnHeaderLayoutManager()Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnHeaderLayoutManager;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    move v2, v3

    .line 298
    move v4, v2

    .line 299
    :goto_6
    const/4 v5, -0x1

    .line 300
    if-ge v2, p4, :cond_e

    .line 301
    .line 302
    aget v6, v1, v2

    .line 303
    .line 304
    add-int/lit8 v7, v4, 0x1

    .line 305
    .line 306
    iget-object v8, v0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnHeaderLayoutManager;->g1:Landroid/util/SparseIntArray;

    .line 307
    .line 308
    invoke-virtual {v8, v4, v5}, Landroid/util/SparseIntArray;->get(II)I

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    if-ge v5, v6, :cond_d

    .line 313
    .line 314
    invoke-virtual {v8, v4, v6}, Landroid/util/SparseIntArray;->put(II)V

    .line 315
    .line 316
    .line 317
    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 318
    .line 319
    move v4, v7

    .line 320
    goto :goto_6

    .line 321
    :cond_e
    invoke-virtual {p0}, La/k5;->g()La/nmo0;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-interface {v0}, La/nmo0;->getContext()Landroid/content/Context;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 338
    .line 339
    invoke-virtual {p0}, La/k5;->g()La/nmo0;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-interface {v2}, La/nmo0;->getRowHeaderWidth()I

    .line 344
    .line 345
    .line 346
    move-result v2

    .line 347
    sub-int/2addr v0, v2

    .line 348
    move v2, v3

    .line 349
    move v4, v2

    .line 350
    :goto_7
    if-ge v2, p4, :cond_f

    .line 351
    .line 352
    aget v6, v1, v2

    .line 353
    .line 354
    add-int/2addr v4, v6

    .line 355
    add-int/lit8 v2, v2, 0x1

    .line 356
    .line 357
    goto :goto_7

    .line 358
    :cond_f
    if-ge v4, v0, :cond_14

    .line 359
    .line 360
    invoke-virtual {p0}, La/k5;->g()La/nmo0;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 365
    .line 366
    invoke-virtual {v2, v3, v3}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->b(ZZ)V

    .line 367
    .line 368
    .line 369
    sub-int/2addr v0, v4

    .line 370
    if-nez p4, :cond_10

    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_10
    if-gtz v0, :cond_11

    .line 374
    .line 375
    goto :goto_9

    .line 376
    :cond_11
    div-int/2addr v0, p4

    .line 377
    invoke-virtual {p0}, La/k5;->g()La/nmo0;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    invoke-interface {v2}, La/nmo0;->getColumnHeaderLayoutManager()Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnHeaderLayoutManager;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    move v4, v3

    .line 386
    :goto_8
    if-ge v3, p4, :cond_14

    .line 387
    .line 388
    aget v6, v1, v3

    .line 389
    .line 390
    add-int/lit8 v7, v4, 0x1

    .line 391
    .line 392
    add-int/2addr v6, v0

    .line 393
    iget-object v8, v2, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/layout_manager/ColumnHeaderLayoutManager;->g1:Landroid/util/SparseIntArray;

    .line 394
    .line 395
    invoke-virtual {v8, v4, v5}, Landroid/util/SparseIntArray;->get(II)I

    .line 396
    .line 397
    .line 398
    move-result v9

    .line 399
    if-ge v9, v6, :cond_12

    .line 400
    .line 401
    invoke-virtual {v8, v4, v6}, Landroid/util/SparseIntArray;->put(II)V

    .line 402
    .line 403
    .line 404
    :cond_12
    add-int/lit8 v3, v3, 0x1

    .line 405
    .line 406
    move v4, v7

    .line 407
    goto :goto_8

    .line 408
    :cond_13
    invoke-static {}, La/itt0;->a()V

    .line 409
    .line 410
    .line 411
    return-void

    .line 412
    :cond_14
    :goto_9
    iput-object p3, p0, La/k5;->d:Ljava/util/List;

    .line 413
    .line 414
    iget-object p4, p0, La/k5;->a:La/p5d;

    .line 415
    .line 416
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    iput-object p3, p4, La/q4;->e:Ljava/lang/Object;

    .line 420
    .line 421
    invoke-virtual {p4}, La/yge0;->g()V

    .line 422
    .line 423
    .line 424
    iget-object p3, p0, La/k5;->g:Ljava/util/ArrayList;

    .line 425
    .line 426
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 427
    .line 428
    .line 429
    move-result-object p4

    .line 430
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 431
    .line 432
    .line 433
    move-result v0

    .line 434
    if-nez v0, :cond_17

    .line 435
    .line 436
    iput-object p2, p0, La/k5;->e:Ljava/util/List;

    .line 437
    .line 438
    iget-object p4, p0, La/k5;->b:La/rhg0;

    .line 439
    .line 440
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    iput-object p2, p4, La/q4;->e:Ljava/lang/Object;

    .line 444
    .line 445
    invoke-virtual {p4}, La/yge0;->g()V

    .line 446
    .line 447
    .line 448
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object p2

    .line 452
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 453
    .line 454
    .line 455
    move-result p4

    .line 456
    if-nez p4, :cond_16

    .line 457
    .line 458
    iput-object p1, p0, La/k5;->f:Ljava/util/List;

    .line 459
    .line 460
    iget-object p2, p0, La/k5;->c:La/aab;

    .line 461
    .line 462
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    iput-object p1, p2, La/q4;->e:Ljava/lang/Object;

    .line 466
    .line 467
    invoke-virtual {p2}, La/yge0;->g()V

    .line 468
    .line 469
    .line 470
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 475
    .line 476
    .line 477
    move-result p2

    .line 478
    if-nez p2, :cond_15

    .line 479
    .line 480
    invoke-virtual {p0}, La/k5;->g()La/nmo0;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 485
    .line 486
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->getColumnHeaderRecyclerView()La/y9b;

    .line 487
    .line 488
    .line 489
    move-result-object p1

    .line 490
    new-instance p2, La/apj0;

    .line 491
    .line 492
    const/16 p3, 0xb

    .line 493
    .line 494
    invoke-direct {p2, p0, p3}, La/apj0;-><init>(Ljava/lang/Object;B)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {p1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 498
    .line 499
    .line 500
    return-void

    .line 501
    :cond_15
    invoke-static {p1}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    throw p0

    .line 506
    :cond_16
    invoke-static {p2}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 507
    .line 508
    .line 509
    move-result-object p0

    .line 510
    throw p0

    .line 511
    :cond_17
    invoke-static {p4}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 512
    .line 513
    .line 514
    move-result-object p0

    .line 515
    throw p0

    .line 516
    :cond_18
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 517
    .line 518
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    return-void
.end method

.method public abstract r(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V
.end method
