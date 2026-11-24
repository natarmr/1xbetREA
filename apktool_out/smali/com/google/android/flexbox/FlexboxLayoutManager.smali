.class public Lcom/google/android/flexbox/FlexboxLayoutManager;
.super Landroidx/recyclerview/widget/b;
.source "SourceFile"

# interfaces
.implements La/ekq;
.implements La/rhe0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;,
        Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;
    }
.end annotation


# static fields
.field public static final o1:Landroid/graphics/Rect;


# instance fields
.field public final A:La/hkq;

.field public B:La/pa80;

.field public Y:La/pa80;

.field public Z:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

.field public f1:I

.field public g1:I

.field public h1:I

.field public i1:I

.field public final j1:Landroid/util/SparseArray;

.field public final k1:Landroid/content/Context;

.field public l1:Landroid/view/View;

.field public m1:I

.field public final n1:La/tyj;

.field public p:B

.field public final q:Z

.field public final r:B

.field public final s:I

.field public t:Z

.field public u:Z

.field public v:Ljava/util/List;

.field public final w:Lcom/google/android/flexbox/b;

.field public x:La/msj;

.field public y:La/the0;

.field public z:La/ikq;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->o1:Landroid/graphics/Rect;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/b;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->s:I

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 13
    .line 14
    new-instance v1, Lcom/google/android/flexbox/b;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Lcom/google/android/flexbox/b;-><init>(La/ekq;)V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 20
    .line 21
    new-instance v1, La/hkq;

    .line 22
    .line 23
    invoke-direct {v1, p0}, La/hkq;-><init>(Lcom/google/android/flexbox/FlexboxLayoutManager;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:La/hkq;

    .line 27
    .line 28
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 29
    .line 30
    const/high16 v2, -0x80000000

    .line 31
    .line 32
    iput v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1:I

    .line 33
    .line 34
    iput v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h1:I

    .line 35
    .line 36
    iput v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i1:I

    .line 37
    .line 38
    new-instance v2, Landroid/util/SparseArray;

    .line 39
    .line 40
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->j1:Landroid/util/SparseArray;

    .line 44
    .line 45
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m1:I

    .line 46
    .line 47
    new-instance v0, La/tyj;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n1:La/tyj;

    .line 53
    .line 54
    invoke-static {p1, p2, p3, p4}, Landroidx/recyclerview/widget/b;->U(Landroid/content/Context;Landroid/util/AttributeSet;II)La/ghe0;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    iget p3, p2, La/ghe0;->a:I

    .line 59
    .line 60
    const/4 p4, 0x0

    .line 61
    const/4 v0, 0x1

    .line 62
    if-eqz p3, :cond_2

    .line 63
    .line 64
    if-eq p3, v0, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    iget-boolean p2, p2, La/ghe0;->c:Z

    .line 68
    .line 69
    if-eqz p2, :cond_1

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k1(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const/4 p2, 0x2

    .line 77
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k1(I)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    iget-boolean p2, p2, La/ghe0;->c:Z

    .line 82
    .line 83
    if-eqz p2, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k1(I)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    invoke-virtual {p0, p4}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k1(I)V

    .line 90
    .line 91
    .line 92
    :goto_0
    iget-boolean p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:Z

    .line 93
    .line 94
    if-eq p2, v0, :cond_5

    .line 95
    .line 96
    if-eqz p2, :cond_4

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->z0()V

    .line 100
    .line 101
    .line 102
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 103
    .line 104
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, La/hkq;->b()V

    .line 108
    .line 109
    .line 110
    iput p4, v1, La/hkq;->d:I

    .line 111
    .line 112
    :goto_1
    iput-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:Z

    .line 113
    .line 114
    const/4 p2, 0x0

    .line 115
    iput-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 116
    .line 117
    iput-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y:La/pa80;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->F0()V

    .line 120
    .line 121
    .line 122
    :cond_5
    iget-byte p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:B

    .line 123
    .line 124
    const/4 p3, 0x4

    .line 125
    if-eq p2, p3, :cond_6

    .line 126
    .line 127
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->z0()V

    .line 128
    .line 129
    .line 130
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 131
    .line 132
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, La/hkq;->b()V

    .line 136
    .line 137
    .line 138
    iput p4, v1, La/hkq;->d:I

    .line 139
    .line 140
    iput-byte p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:B

    .line 141
    .line 142
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->F0()V

    .line 143
    .line 144
    .line 145
    :cond_6
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k1:Landroid/content/Context;

    .line 146
    .line 147
    return-void
.end method

.method public static Z(III)Z
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-lez p2, :cond_0

    .line 11
    .line 12
    if-eq p0, p2, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    const/high16 p2, -0x80000000

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, p2, :cond_4

    .line 19
    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    const/high16 p2, 0x40000000    # 2.0f

    .line 23
    .line 24
    if-eq v0, p2, :cond_1

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    if-ne p1, p0, :cond_2

    .line 28
    .line 29
    return v2

    .line 30
    :cond_2
    return v1

    .line 31
    :cond_3
    return v2

    .line 32
    :cond_4
    if-lt p1, p0, :cond_5

    .line 33
    .line 34
    return v2

    .line 35
    :cond_5
    return v1
.end method


# virtual methods
.method public final A(La/the0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->V0(La/the0;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final B(La/the0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->W0(La/the0;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final E()La/hhe0;
    .locals 1

    .line 1
    new-instance p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 2
    .line 3
    const/4 v0, -0x2

    .line 4
    invoke-direct {p0, v0, v0}, La/hhe0;-><init>(II)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->e:F

    .line 9
    .line 10
    const/high16 v0, 0x3f800000    # 1.0f

    .line 11
    .line 12
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->f:F

    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->g:I

    .line 16
    .line 17
    const/high16 v0, -0x40800000    # -1.0f

    .line 18
    .line 19
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->h:F

    .line 20
    .line 21
    const v0, 0xffffff

    .line 22
    .line 23
    .line 24
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->k:I

    .line 25
    .line 26
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->l:I

    .line 27
    .line 28
    return-object p0
.end method

.method public final F(Landroid/content/Context;Landroid/util/AttributeSet;)La/hhe0;
    .locals 0

    .line 1
    new-instance p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, La/hhe0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->e:F

    .line 8
    .line 9
    const/high16 p1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->f:F

    .line 12
    .line 13
    const/4 p1, -0x1

    .line 14
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->g:I

    .line 15
    .line 16
    const/high16 p1, -0x40800000    # -1.0f

    .line 17
    .line 18
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->h:F

    .line 19
    .line 20
    const p1, 0xffffff

    .line 21
    .line 22
    .line 23
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->k:I

    .line 24
    .line 25
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;->l:I

    .line 26
    .line 27
    return-object p0
.end method

.method public final G0(ILa/msj;La/the0;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i1(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:La/hkq;

    .line 17
    .line 18
    iget p3, p2, La/hkq;->d:I

    .line 19
    .line 20
    add-int/2addr p3, p1

    .line 21
    iput p3, p2, La/hkq;->d:I

    .line 22
    .line 23
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y:La/pa80;

    .line 24
    .line 25
    neg-int p2, p1

    .line 26
    invoke-virtual {p0, p2}, La/pa80;->r(I)V

    .line 27
    .line 28
    .line 29
    return p1

    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->h1(ILa/msj;La/the0;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->j1:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/util/SparseArray;->clear()V

    .line 37
    .line 38
    .line 39
    return p1
.end method

.method public final H0(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 2
    .line 3
    const/high16 p1, -0x80000000

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1:I

    .line 6
    .line 7
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    iput v0, p1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->F0()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final I0(ILa/msj;La/the0;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->i1(I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:La/hkq;

    .line 23
    .line 24
    iget p3, p2, La/hkq;->d:I

    .line 25
    .line 26
    add-int/2addr p3, p1

    .line 27
    iput p3, p2, La/hkq;->d:I

    .line 28
    .line 29
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y:La/pa80;

    .line 30
    .line 31
    neg-int p2, p1

    .line 32
    invoke-virtual {p0, p2}, La/pa80;->r(I)V

    .line 33
    .line 34
    .line 35
    return p1

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->h1(ILa/msj;La/the0;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->j1:Landroid/util/SparseArray;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/util/SparseArray;->clear()V

    .line 43
    .line 44
    .line 45
    return p1
.end method

.method public final R0(Landroidx/recyclerview/widget/RecyclerView;La/the0;I)V
    .locals 0

    .line 1
    new-instance p2, La/l900;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p2, p1}, La/l900;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput p3, p2, La/she0;->a:I

    .line 11
    .line 12
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/b;->S0(La/she0;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final U0(La/the0;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, La/the0;->b()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->X0()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p1}, La/the0;->b()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 35
    .line 36
    invoke-virtual {p1, v0}, La/pa80;->d(Landroid/view/View;)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, La/pa80;->g(Landroid/view/View;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    sub-int/2addr p1, v0

    .line 47
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 48
    .line 49
    invoke-virtual {p0}, La/pa80;->n()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    return p0

    .line 58
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 59
    return p0
.end method

.method public final V0(La/the0;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, La/the0;->b()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1}, La/the0;->b()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-static {v1}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-static {v0}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 40
    .line 41
    invoke-virtual {v3, v0}, La/pa80;->d(Landroid/view/View;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 46
    .line 47
    invoke-virtual {v3, v1}, La/pa80;->g(Landroid/view/View;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    sub-int/2addr v0, v3

    .line 52
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 57
    .line 58
    iget-object v3, v3, Lcom/google/android/flexbox/b;->c:[I

    .line 59
    .line 60
    aget p1, v3, p1

    .line 61
    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    const/4 v4, -0x1

    .line 65
    if-ne p1, v4, :cond_2

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    aget v2, v3, v2

    .line 69
    .line 70
    sub-int/2addr v2, p1

    .line 71
    add-int/lit8 v2, v2, 0x1

    .line 72
    .line 73
    int-to-float v0, v0

    .line 74
    int-to-float v2, v2

    .line 75
    div-float/2addr v0, v2

    .line 76
    int-to-float p1, p1

    .line 77
    mul-float/2addr p1, v0

    .line 78
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 79
    .line 80
    invoke-virtual {v0}, La/pa80;->m()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 85
    .line 86
    invoke-virtual {p0, v1}, La/pa80;->g(Landroid/view/View;)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    sub-int/2addr v0, p0

    .line 91
    int-to-float p0, v0

    .line 92
    add-float/2addr p1, p0

    .line 93
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    return p0

    .line 98
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 99
    return p0
.end method

.method public final W0(La/the0;)I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    invoke-virtual {p1}, La/the0;->b()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {p0, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, La/the0;->b()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_4

    .line 26
    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {p0, v1, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(II)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v3, -0x1

    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    move v1, v3

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    invoke-static {v1}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    add-int/lit8 v4, v4, -0x1

    .line 54
    .line 55
    invoke-virtual {p0, v4, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(II)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    invoke-static {v4}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    :goto_1
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 67
    .line 68
    invoke-virtual {v4, v0}, La/pa80;->d(Landroid/view/View;)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 73
    .line 74
    invoke-virtual {p0, v2}, La/pa80;->g(Landroid/view/View;)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    sub-int/2addr v0, p0

    .line 79
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    sub-int/2addr v3, v1

    .line 84
    add-int/lit8 v3, v3, 0x1

    .line 85
    .line 86
    int-to-float p0, p0

    .line 87
    int-to-float v0, v3

    .line 88
    div-float/2addr p0, v0

    .line 89
    invoke-virtual {p1}, La/the0;->b()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    int-to-float p1, p1

    .line 94
    mul-float/2addr p0, p1

    .line 95
    float-to-int p0, p0

    .line 96
    return p0

    .line 97
    :cond_4
    :goto_2
    return v1
.end method

.method public final X()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method

.method public final X0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-boolean v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:Z

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    new-instance v0, La/oa80;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, v1}, La/oa80;-><init>(Landroidx/recyclerview/widget/b;B)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 23
    .line 24
    new-instance v0, La/oa80;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, La/oa80;-><init>(Landroidx/recyclerview/widget/b;B)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y:La/pa80;

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    new-instance v0, La/oa80;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, p0, v1}, La/oa80;-><init>(Landroidx/recyclerview/widget/b;B)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 40
    .line 41
    new-instance v0, La/oa80;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {v0, p0, v1}, La/oa80;-><init>(Landroidx/recyclerview/widget/b;B)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y:La/pa80;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    if-nez v1, :cond_3

    .line 51
    .line 52
    new-instance v0, La/oa80;

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    invoke-direct {v0, p0, v1}, La/oa80;-><init>(Landroidx/recyclerview/widget/b;B)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 59
    .line 60
    new-instance v0, La/oa80;

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-direct {v0, p0, v1}, La/oa80;-><init>(Landroidx/recyclerview/widget/b;B)V

    .line 64
    .line 65
    .line 66
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y:La/pa80;

    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    new-instance v0, La/oa80;

    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    invoke-direct {v0, p0, v1}, La/oa80;-><init>(Landroidx/recyclerview/widget/b;B)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 76
    .line 77
    new-instance v0, La/oa80;

    .line 78
    .line 79
    const/4 v1, 0x1

    .line 80
    invoke-direct {v0, p0, v1}, La/oa80;-><init>(Landroidx/recyclerview/widget/b;B)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y:La/pa80;

    .line 84
    .line 85
    return-void
.end method

.method public final Y0(La/msj;La/the0;La/ikq;)I
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    iget v3, v2, La/ikq;->f:I

    .line 8
    .line 9
    const/high16 v4, -0x80000000

    .line 10
    .line 11
    if-eq v3, v4, :cond_1

    .line 12
    .line 13
    iget v5, v2, La/ikq;->a:I

    .line 14
    .line 15
    if-gez v5, :cond_0

    .line 16
    .line 17
    add-int/2addr v3, v5

    .line 18
    iput v3, v2, La/ikq;->f:I

    .line 19
    .line 20
    :cond_0
    invoke-virtual {v0, v1, v2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j1(La/msj;La/ikq;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iget v3, v2, La/ikq;->a:I

    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    move v7, v3

    .line 30
    const/4 v8, 0x0

    .line 31
    :goto_0
    if-gtz v7, :cond_3

    .line 32
    .line 33
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 34
    .line 35
    iget-boolean v9, v9, La/ikq;->b:Z

    .line 36
    .line 37
    if-eqz v9, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    move/from16 v21, v3

    .line 41
    .line 42
    goto/16 :goto_f

    .line 43
    .line 44
    :cond_3
    :goto_1
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 45
    .line 46
    iget v10, v2, La/ikq;->d:I

    .line 47
    .line 48
    if-ltz v10, :cond_2

    .line 49
    .line 50
    invoke-virtual/range {p2 .. p2}, La/the0;->b()I

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    if-ge v10, v11, :cond_2

    .line 55
    .line 56
    iget v10, v2, La/ikq;->c:I

    .line 57
    .line 58
    if-ltz v10, :cond_2

    .line 59
    .line 60
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-ge v10, v9, :cond_2

    .line 65
    .line 66
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 67
    .line 68
    iget v10, v2, La/ikq;->c:I

    .line 69
    .line 70
    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v9

    .line 74
    move-object v12, v9

    .line 75
    check-cast v12, Lcom/google/android/flexbox/a;

    .line 76
    .line 77
    iget v9, v12, Lcom/google/android/flexbox/a;->o:I

    .line 78
    .line 79
    iput v9, v2, La/ikq;->d:I

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    const/16 v18, 0x20

    .line 86
    .line 87
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:La/hkq;

    .line 88
    .line 89
    const/4 v11, -0x1

    .line 90
    sget-object v15, Lcom/google/android/flexbox/FlexboxLayoutManager;->o1:Landroid/graphics/Rect;

    .line 91
    .line 92
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 93
    .line 94
    if-eqz v9, :cond_a

    .line 95
    .line 96
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->getPaddingLeft()I

    .line 97
    .line 98
    .line 99
    move-result v9

    .line 100
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->getPaddingRight()I

    .line 101
    .line 102
    .line 103
    move-result v16

    .line 104
    iget v6, v0, Landroidx/recyclerview/widget/b;->n:I

    .line 105
    .line 106
    iget v13, v2, La/ikq;->e:I

    .line 107
    .line 108
    iget v14, v2, La/ikq;->h:I

    .line 109
    .line 110
    if-ne v14, v11, :cond_4

    .line 111
    .line 112
    iget v11, v12, Lcom/google/android/flexbox/a;->g:I

    .line 113
    .line 114
    sub-int/2addr v13, v11

    .line 115
    :cond_4
    move/from16 v20, v13

    .line 116
    .line 117
    iget v11, v2, La/ikq;->d:I

    .line 118
    .line 119
    int-to-float v9, v9

    .line 120
    sub-int v6, v6, v16

    .line 121
    .line 122
    int-to-float v6, v6

    .line 123
    iget v10, v10, La/hkq;->d:I

    .line 124
    .line 125
    int-to-float v10, v10

    .line 126
    sub-float/2addr v9, v10

    .line 127
    sub-float/2addr v6, v10

    .line 128
    const/4 v10, 0x0

    .line 129
    invoke-static {v10, v10}, Ljava/lang/Math;->max(FF)F

    .line 130
    .line 131
    .line 132
    move-result v19

    .line 133
    iget v10, v12, Lcom/google/android/flexbox/a;->h:I

    .line 134
    .line 135
    move/from16 v21, v3

    .line 136
    .line 137
    move v13, v11

    .line 138
    const/4 v14, 0x0

    .line 139
    :goto_2
    add-int v3, v11, v10

    .line 140
    .line 141
    if-ge v13, v3, :cond_9

    .line 142
    .line 143
    move v3, v11

    .line 144
    invoke-virtual {v0, v13}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d(I)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    if-nez v11, :cond_5

    .line 149
    .line 150
    move/from16 v25, v3

    .line 151
    .line 152
    move/from16 v22, v5

    .line 153
    .line 154
    move/from16 v24, v10

    .line 155
    .line 156
    move/from16 v23, v13

    .line 157
    .line 158
    move-object/from16 v27, v15

    .line 159
    .line 160
    const/4 v3, 0x1

    .line 161
    goto/16 :goto_6

    .line 162
    .line 163
    :cond_5
    move/from16 v16, v3

    .line 164
    .line 165
    iget v3, v2, La/ikq;->h:I

    .line 166
    .line 167
    move/from16 v22, v5

    .line 168
    .line 169
    const/4 v5, 0x1

    .line 170
    if-ne v3, v5, :cond_6

    .line 171
    .line 172
    invoke-virtual {v0, v15, v11}, Landroidx/recyclerview/widget/b;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/b;->l(Landroid/view/View;)V

    .line 176
    .line 177
    .line 178
    :goto_3
    move v3, v14

    .line 179
    goto :goto_4

    .line 180
    :cond_6
    invoke-virtual {v0, v15, v11}, Landroidx/recyclerview/widget/b;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 181
    .line 182
    .line 183
    const/4 v3, 0x0

    .line 184
    invoke-virtual {v0, v11, v14, v3}, Landroidx/recyclerview/widget/b;->m(Landroid/view/View;IZ)V

    .line 185
    .line 186
    .line 187
    add-int/lit8 v14, v14, 0x1

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :goto_4
    iget-object v14, v4, Lcom/google/android/flexbox/b;->d:[J

    .line 191
    .line 192
    move/from16 v17, v6

    .line 193
    .line 194
    aget-wide v5, v14, v13

    .line 195
    .line 196
    long-to-int v14, v5

    .line 197
    shr-long v5, v5, v18

    .line 198
    .line 199
    long-to-int v5, v5

    .line 200
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    check-cast v6, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 205
    .line 206
    invoke-virtual {v0, v11, v14, v5, v6}, Lcom/google/android/flexbox/FlexboxLayoutManager;->l1(Landroid/view/View;IILcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;)Z

    .line 207
    .line 208
    .line 209
    move-result v24

    .line 210
    if-eqz v24, :cond_7

    .line 211
    .line 212
    invoke-virtual {v11, v14, v5}, Landroid/view/View;->measure(II)V

    .line 213
    .line 214
    .line 215
    :cond_7
    iget v5, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 216
    .line 217
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 218
    .line 219
    .line 220
    move-result-object v14

    .line 221
    check-cast v14, La/hhe0;

    .line 222
    .line 223
    iget-object v14, v14, La/hhe0;->b:Landroid/graphics/Rect;

    .line 224
    .line 225
    iget v14, v14, Landroid/graphics/Rect;->left:I

    .line 226
    .line 227
    add-int/2addr v5, v14

    .line 228
    int-to-float v5, v5

    .line 229
    add-float/2addr v9, v5

    .line 230
    iget v5, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 231
    .line 232
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 233
    .line 234
    .line 235
    move-result-object v14

    .line 236
    check-cast v14, La/hhe0;

    .line 237
    .line 238
    iget-object v14, v14, La/hhe0;->b:Landroid/graphics/Rect;

    .line 239
    .line 240
    iget v14, v14, Landroid/graphics/Rect;->right:I

    .line 241
    .line 242
    add-int/2addr v5, v14

    .line 243
    int-to-float v5, v5

    .line 244
    sub-float v5, v17, v5

    .line 245
    .line 246
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 247
    .line 248
    .line 249
    move-result-object v14

    .line 250
    check-cast v14, La/hhe0;

    .line 251
    .line 252
    iget-object v14, v14, La/hhe0;->b:Landroid/graphics/Rect;

    .line 253
    .line 254
    iget v14, v14, Landroid/graphics/Rect;->top:I

    .line 255
    .line 256
    add-int v14, v20, v14

    .line 257
    .line 258
    move/from16 v17, v3

    .line 259
    .line 260
    iget-boolean v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 261
    .line 262
    move/from16 v24, v10

    .line 263
    .line 264
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 265
    .line 266
    if-eqz v3, :cond_8

    .line 267
    .line 268
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 273
    .line 274
    .line 275
    move-result v25

    .line 276
    sub-int v3, v3, v25

    .line 277
    .line 278
    move-object/from16 v25, v15

    .line 279
    .line 280
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 281
    .line 282
    .line 283
    move-result v15

    .line 284
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 285
    .line 286
    .line 287
    move-result v26

    .line 288
    add-int v26, v26, v14

    .line 289
    .line 290
    move/from16 v23, v13

    .line 291
    .line 292
    move-object/from16 v27, v25

    .line 293
    .line 294
    move v13, v3

    .line 295
    move/from16 v25, v16

    .line 296
    .line 297
    move/from16 v16, v26

    .line 298
    .line 299
    const/4 v3, 0x1

    .line 300
    invoke-virtual/range {v10 .. v16}, Lcom/google/android/flexbox/b;->o(Landroid/view/View;Lcom/google/android/flexbox/a;IIII)V

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_8
    move/from16 v23, v13

    .line 305
    .line 306
    move-object/from16 v27, v15

    .line 307
    .line 308
    move/from16 v25, v16

    .line 309
    .line 310
    const/4 v3, 0x1

    .line 311
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 312
    .line 313
    .line 314
    move-result v13

    .line 315
    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    .line 316
    .line 317
    .line 318
    move-result v15

    .line 319
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 320
    .line 321
    .line 322
    move-result v16

    .line 323
    add-int v15, v16, v15

    .line 324
    .line 325
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 326
    .line 327
    .line 328
    move-result v16

    .line 329
    add-int v16, v16, v14

    .line 330
    .line 331
    invoke-virtual/range {v10 .. v16}, Lcom/google/android/flexbox/b;->o(Landroid/view/View;Lcom/google/android/flexbox/a;IIII)V

    .line 332
    .line 333
    .line 334
    :goto_5
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 335
    .line 336
    .line 337
    move-result v10

    .line 338
    iget v13, v6, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 339
    .line 340
    add-int/2addr v10, v13

    .line 341
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 342
    .line 343
    .line 344
    move-result-object v13

    .line 345
    check-cast v13, La/hhe0;

    .line 346
    .line 347
    iget-object v13, v13, La/hhe0;->b:Landroid/graphics/Rect;

    .line 348
    .line 349
    iget v13, v13, Landroid/graphics/Rect;->right:I

    .line 350
    .line 351
    add-int/2addr v10, v13

    .line 352
    int-to-float v10, v10

    .line 353
    add-float v10, v10, v19

    .line 354
    .line 355
    add-float/2addr v10, v9

    .line 356
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 357
    .line 358
    .line 359
    move-result v9

    .line 360
    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 361
    .line 362
    add-int/2addr v9, v6

    .line 363
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 364
    .line 365
    .line 366
    move-result-object v6

    .line 367
    check-cast v6, La/hhe0;

    .line 368
    .line 369
    iget-object v6, v6, La/hhe0;->b:Landroid/graphics/Rect;

    .line 370
    .line 371
    iget v6, v6, Landroid/graphics/Rect;->left:I

    .line 372
    .line 373
    add-int/2addr v9, v6

    .line 374
    int-to-float v6, v9

    .line 375
    add-float v6, v6, v19

    .line 376
    .line 377
    sub-float/2addr v5, v6

    .line 378
    move v6, v5

    .line 379
    move v9, v10

    .line 380
    move/from16 v14, v17

    .line 381
    .line 382
    :goto_6
    add-int/lit8 v13, v23, 0x1

    .line 383
    .line 384
    move/from16 v5, v22

    .line 385
    .line 386
    move/from16 v10, v24

    .line 387
    .line 388
    move/from16 v11, v25

    .line 389
    .line 390
    move-object/from16 v15, v27

    .line 391
    .line 392
    goto/16 :goto_2

    .line 393
    .line 394
    :cond_9
    move/from16 v22, v5

    .line 395
    .line 396
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 397
    .line 398
    iget v3, v3, La/ikq;->h:I

    .line 399
    .line 400
    iget v4, v2, La/ikq;->c:I

    .line 401
    .line 402
    add-int/2addr v4, v3

    .line 403
    iput v4, v2, La/ikq;->c:I

    .line 404
    .line 405
    iget v3, v12, Lcom/google/android/flexbox/a;->g:I

    .line 406
    .line 407
    move/from16 v24, v7

    .line 408
    .line 409
    :goto_7
    move v4, v3

    .line 410
    goto/16 :goto_d

    .line 411
    .line 412
    :cond_a
    move/from16 v21, v3

    .line 413
    .line 414
    move/from16 v22, v5

    .line 415
    .line 416
    move-object/from16 v27, v15

    .line 417
    .line 418
    const/4 v3, 0x1

    .line 419
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->getPaddingTop()I

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->getPaddingBottom()I

    .line 424
    .line 425
    .line 426
    move-result v6

    .line 427
    iget v9, v0, Landroidx/recyclerview/widget/b;->o:I

    .line 428
    .line 429
    iget v13, v2, La/ikq;->e:I

    .line 430
    .line 431
    iget v14, v2, La/ikq;->h:I

    .line 432
    .line 433
    if-ne v14, v11, :cond_b

    .line 434
    .line 435
    iget v11, v12, Lcom/google/android/flexbox/a;->g:I

    .line 436
    .line 437
    sub-int v14, v13, v11

    .line 438
    .line 439
    add-int/2addr v13, v11

    .line 440
    move/from16 v23, v13

    .line 441
    .line 442
    move/from16 v20, v14

    .line 443
    .line 444
    goto :goto_8

    .line 445
    :cond_b
    move/from16 v20, v13

    .line 446
    .line 447
    move/from16 v23, v20

    .line 448
    .line 449
    :goto_8
    iget v11, v2, La/ikq;->d:I

    .line 450
    .line 451
    int-to-float v5, v5

    .line 452
    sub-int/2addr v9, v6

    .line 453
    int-to-float v6, v9

    .line 454
    iget v9, v10, La/hkq;->d:I

    .line 455
    .line 456
    int-to-float v9, v9

    .line 457
    sub-float/2addr v5, v9

    .line 458
    sub-float/2addr v6, v9

    .line 459
    const/4 v10, 0x0

    .line 460
    invoke-static {v10, v10}, Ljava/lang/Math;->max(FF)F

    .line 461
    .line 462
    .line 463
    move-result v9

    .line 464
    iget v10, v12, Lcom/google/android/flexbox/a;->h:I

    .line 465
    .line 466
    move v13, v6

    .line 467
    move v14, v11

    .line 468
    move v6, v5

    .line 469
    const/4 v5, 0x0

    .line 470
    :goto_9
    add-int v15, v11, v10

    .line 471
    .line 472
    if-ge v14, v15, :cond_12

    .line 473
    .line 474
    move v15, v11

    .line 475
    invoke-virtual {v0, v14}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d(I)Landroid/view/View;

    .line 476
    .line 477
    .line 478
    move-result-object v11

    .line 479
    if-nez v11, :cond_c

    .line 480
    .line 481
    move/from16 v24, v7

    .line 482
    .line 483
    move/from16 v26, v10

    .line 484
    .line 485
    move/from16 v28, v15

    .line 486
    .line 487
    move-object/from16 v29, v27

    .line 488
    .line 489
    move/from16 v27, v14

    .line 490
    .line 491
    goto/16 :goto_c

    .line 492
    .line 493
    :cond_c
    iget-object v3, v4, Lcom/google/android/flexbox/b;->d:[J

    .line 494
    .line 495
    move/from16 v16, v6

    .line 496
    .line 497
    move/from16 v24, v7

    .line 498
    .line 499
    aget-wide v6, v3, v14

    .line 500
    .line 501
    long-to-int v3, v6

    .line 502
    shr-long v6, v6, v18

    .line 503
    .line 504
    long-to-int v6, v6

    .line 505
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 506
    .line 507
    .line 508
    move-result-object v7

    .line 509
    check-cast v7, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 510
    .line 511
    invoke-virtual {v0, v11, v3, v6, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->l1(Landroid/view/View;IILcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;)Z

    .line 512
    .line 513
    .line 514
    move-result v17

    .line 515
    if-eqz v17, :cond_d

    .line 516
    .line 517
    invoke-virtual {v11, v3, v6}, Landroid/view/View;->measure(II)V

    .line 518
    .line 519
    .line 520
    :cond_d
    iget v3, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 521
    .line 522
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 523
    .line 524
    .line 525
    move-result-object v6

    .line 526
    check-cast v6, La/hhe0;

    .line 527
    .line 528
    iget-object v6, v6, La/hhe0;->b:Landroid/graphics/Rect;

    .line 529
    .line 530
    iget v6, v6, Landroid/graphics/Rect;->top:I

    .line 531
    .line 532
    add-int/2addr v3, v6

    .line 533
    int-to-float v3, v3

    .line 534
    add-float v6, v16, v3

    .line 535
    .line 536
    iget v3, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 537
    .line 538
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 539
    .line 540
    .line 541
    move-result-object v16

    .line 542
    move/from16 v17, v3

    .line 543
    .line 544
    move-object/from16 v3, v16

    .line 545
    .line 546
    check-cast v3, La/hhe0;

    .line 547
    .line 548
    iget-object v3, v3, La/hhe0;->b:Landroid/graphics/Rect;

    .line 549
    .line 550
    iget v3, v3, Landroid/graphics/Rect;->bottom:I

    .line 551
    .line 552
    add-int v3, v17, v3

    .line 553
    .line 554
    int-to-float v3, v3

    .line 555
    sub-float v3, v13, v3

    .line 556
    .line 557
    iget v13, v2, La/ikq;->h:I

    .line 558
    .line 559
    move/from16 v25, v3

    .line 560
    .line 561
    const/4 v3, 0x1

    .line 562
    if-ne v13, v3, :cond_e

    .line 563
    .line 564
    move-object/from16 v13, v27

    .line 565
    .line 566
    invoke-virtual {v0, v13, v11}, Landroidx/recyclerview/widget/b;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v0, v11}, Landroidx/recyclerview/widget/b;->l(Landroid/view/View;)V

    .line 570
    .line 571
    .line 572
    const/4 v3, 0x0

    .line 573
    goto :goto_a

    .line 574
    :cond_e
    move-object/from16 v13, v27

    .line 575
    .line 576
    invoke-virtual {v0, v13, v11}, Landroidx/recyclerview/widget/b;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 577
    .line 578
    .line 579
    const/4 v3, 0x0

    .line 580
    invoke-virtual {v0, v11, v5, v3}, Landroidx/recyclerview/widget/b;->m(Landroid/view/View;IZ)V

    .line 581
    .line 582
    .line 583
    add-int/lit8 v5, v5, 0x1

    .line 584
    .line 585
    :goto_a
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 586
    .line 587
    .line 588
    move-result-object v16

    .line 589
    move-object/from16 v3, v16

    .line 590
    .line 591
    check-cast v3, La/hhe0;

    .line 592
    .line 593
    iget-object v3, v3, La/hhe0;->b:Landroid/graphics/Rect;

    .line 594
    .line 595
    iget v3, v3, Landroid/graphics/Rect;->left:I

    .line 596
    .line 597
    add-int v3, v20, v3

    .line 598
    .line 599
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 600
    .line 601
    .line 602
    move-result-object v16

    .line 603
    move/from16 v17, v3

    .line 604
    .line 605
    move-object/from16 v3, v16

    .line 606
    .line 607
    check-cast v3, La/hhe0;

    .line 608
    .line 609
    iget-object v3, v3, La/hhe0;->b:Landroid/graphics/Rect;

    .line 610
    .line 611
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 612
    .line 613
    sub-int v16, v23, v3

    .line 614
    .line 615
    move-object/from16 v27, v13

    .line 616
    .line 617
    iget-boolean v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 618
    .line 619
    iget-boolean v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 620
    .line 621
    move/from16 v26, v10

    .line 622
    .line 623
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 624
    .line 625
    if-eqz v13, :cond_10

    .line 626
    .line 627
    if-eqz v3, :cond_f

    .line 628
    .line 629
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 630
    .line 631
    .line 632
    move-result v3

    .line 633
    sub-int v3, v16, v3

    .line 634
    .line 635
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->round(F)I

    .line 636
    .line 637
    .line 638
    move-result v17

    .line 639
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 640
    .line 641
    .line 642
    move-result v28

    .line 643
    sub-int v17, v17, v28

    .line 644
    .line 645
    move/from16 v28, v15

    .line 646
    .line 647
    move/from16 v15, v17

    .line 648
    .line 649
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->round(F)I

    .line 650
    .line 651
    .line 652
    move-result v17

    .line 653
    move-object/from16 v29, v27

    .line 654
    .line 655
    move/from16 v27, v14

    .line 656
    .line 657
    move v14, v3

    .line 658
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->p(Landroid/view/View;Lcom/google/android/flexbox/a;ZIIII)V

    .line 659
    .line 660
    .line 661
    goto :goto_b

    .line 662
    :cond_f
    move/from16 v28, v15

    .line 663
    .line 664
    move-object/from16 v29, v27

    .line 665
    .line 666
    move/from16 v27, v14

    .line 667
    .line 668
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 669
    .line 670
    .line 671
    move-result v3

    .line 672
    sub-int v14, v16, v3

    .line 673
    .line 674
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 675
    .line 676
    .line 677
    move-result v15

    .line 678
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 679
    .line 680
    .line 681
    move-result v3

    .line 682
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 683
    .line 684
    .line 685
    move-result v17

    .line 686
    add-int v17, v17, v3

    .line 687
    .line 688
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->p(Landroid/view/View;Lcom/google/android/flexbox/a;ZIIII)V

    .line 689
    .line 690
    .line 691
    goto :goto_b

    .line 692
    :cond_10
    move/from16 v28, v15

    .line 693
    .line 694
    move-object/from16 v29, v27

    .line 695
    .line 696
    move/from16 v27, v14

    .line 697
    .line 698
    if-eqz v3, :cond_11

    .line 699
    .line 700
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->round(F)I

    .line 701
    .line 702
    .line 703
    move-result v3

    .line 704
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 705
    .line 706
    .line 707
    move-result v14

    .line 708
    sub-int v15, v3, v14

    .line 709
    .line 710
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 711
    .line 712
    .line 713
    move-result v3

    .line 714
    add-int v16, v3, v17

    .line 715
    .line 716
    move/from16 v14, v17

    .line 717
    .line 718
    invoke-static/range {v25 .. v25}, Ljava/lang/Math;->round(F)I

    .line 719
    .line 720
    .line 721
    move-result v17

    .line 722
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->p(Landroid/view/View;Lcom/google/android/flexbox/a;ZIIII)V

    .line 723
    .line 724
    .line 725
    goto :goto_b

    .line 726
    :cond_11
    move/from16 v14, v17

    .line 727
    .line 728
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 729
    .line 730
    .line 731
    move-result v15

    .line 732
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 733
    .line 734
    .line 735
    move-result v3

    .line 736
    add-int v16, v3, v14

    .line 737
    .line 738
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 739
    .line 740
    .line 741
    move-result v3

    .line 742
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 743
    .line 744
    .line 745
    move-result v17

    .line 746
    add-int v17, v17, v3

    .line 747
    .line 748
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->p(Landroid/view/View;Lcom/google/android/flexbox/a;ZIIII)V

    .line 749
    .line 750
    .line 751
    :goto_b
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 752
    .line 753
    .line 754
    move-result v3

    .line 755
    iget v10, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 756
    .line 757
    add-int/2addr v3, v10

    .line 758
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 759
    .line 760
    .line 761
    move-result-object v10

    .line 762
    check-cast v10, La/hhe0;

    .line 763
    .line 764
    iget-object v10, v10, La/hhe0;->b:Landroid/graphics/Rect;

    .line 765
    .line 766
    iget v10, v10, Landroid/graphics/Rect;->bottom:I

    .line 767
    .line 768
    add-int/2addr v3, v10

    .line 769
    int-to-float v3, v3

    .line 770
    add-float/2addr v3, v9

    .line 771
    add-float/2addr v3, v6

    .line 772
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 773
    .line 774
    .line 775
    move-result v6

    .line 776
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 777
    .line 778
    add-int/2addr v6, v7

    .line 779
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 780
    .line 781
    .line 782
    move-result-object v7

    .line 783
    check-cast v7, La/hhe0;

    .line 784
    .line 785
    iget-object v7, v7, La/hhe0;->b:Landroid/graphics/Rect;

    .line 786
    .line 787
    iget v7, v7, Landroid/graphics/Rect;->top:I

    .line 788
    .line 789
    add-int/2addr v6, v7

    .line 790
    int-to-float v6, v6

    .line 791
    add-float/2addr v6, v9

    .line 792
    sub-float v6, v25, v6

    .line 793
    .line 794
    move v13, v6

    .line 795
    move v6, v3

    .line 796
    :goto_c
    add-int/lit8 v14, v27, 0x1

    .line 797
    .line 798
    move/from16 v7, v24

    .line 799
    .line 800
    move/from16 v10, v26

    .line 801
    .line 802
    move/from16 v11, v28

    .line 803
    .line 804
    move-object/from16 v27, v29

    .line 805
    .line 806
    const/4 v3, 0x1

    .line 807
    goto/16 :goto_9

    .line 808
    .line 809
    :cond_12
    move/from16 v24, v7

    .line 810
    .line 811
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 812
    .line 813
    iget v3, v3, La/ikq;->h:I

    .line 814
    .line 815
    iget v4, v2, La/ikq;->c:I

    .line 816
    .line 817
    add-int/2addr v4, v3

    .line 818
    iput v4, v2, La/ikq;->c:I

    .line 819
    .line 820
    iget v3, v12, Lcom/google/android/flexbox/a;->g:I

    .line 821
    .line 822
    goto/16 :goto_7

    .line 823
    .line 824
    :goto_d
    add-int/2addr v8, v3

    .line 825
    if-nez v22, :cond_13

    .line 826
    .line 827
    iget-boolean v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 828
    .line 829
    if-eqz v3, :cond_13

    .line 830
    .line 831
    iget v3, v2, La/ikq;->h:I

    .line 832
    .line 833
    mul-int/2addr v3, v4

    .line 834
    iget v5, v2, La/ikq;->e:I

    .line 835
    .line 836
    sub-int/2addr v5, v3

    .line 837
    iput v5, v2, La/ikq;->e:I

    .line 838
    .line 839
    goto :goto_e

    .line 840
    :cond_13
    iget v3, v2, La/ikq;->h:I

    .line 841
    .line 842
    mul-int/2addr v3, v4

    .line 843
    iget v5, v2, La/ikq;->e:I

    .line 844
    .line 845
    add-int/2addr v5, v3

    .line 846
    iput v5, v2, La/ikq;->e:I

    .line 847
    .line 848
    :goto_e
    sub-int v7, v24, v4

    .line 849
    .line 850
    move/from16 v3, v21

    .line 851
    .line 852
    move/from16 v5, v22

    .line 853
    .line 854
    const/high16 v4, -0x80000000

    .line 855
    .line 856
    goto/16 :goto_0

    .line 857
    .line 858
    :goto_f
    iget v3, v2, La/ikq;->a:I

    .line 859
    .line 860
    sub-int/2addr v3, v8

    .line 861
    iput v3, v2, La/ikq;->a:I

    .line 862
    .line 863
    iget v4, v2, La/ikq;->f:I

    .line 864
    .line 865
    const/high16 v5, -0x80000000

    .line 866
    .line 867
    if-eq v4, v5, :cond_15

    .line 868
    .line 869
    add-int/2addr v4, v8

    .line 870
    iput v4, v2, La/ikq;->f:I

    .line 871
    .line 872
    if-gez v3, :cond_14

    .line 873
    .line 874
    add-int/2addr v4, v3

    .line 875
    iput v4, v2, La/ikq;->f:I

    .line 876
    .line 877
    :cond_14
    invoke-virtual {v0, v1, v2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->j1(La/msj;La/ikq;)V

    .line 878
    .line 879
    .line 880
    :cond_15
    iget v0, v2, La/ikq;->a:I

    .line 881
    .line 882
    sub-int v3, v21, v0

    .line 883
    .line 884
    return v3
.end method

.method public final Z0(I)Landroid/view/View;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->e1(III)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p1}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/google/android/flexbox/b;->c:[I

    .line 20
    .line 21
    aget v0, v1, v0

    .line 22
    .line 23
    const/4 v1, -0x1

    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    :goto_0
    const/4 p0, 0x0

    .line 27
    return-object p0

    .line 28
    :cond_1
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/google/android/flexbox/a;

    .line 35
    .line 36
    invoke-virtual {p0, p1, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->a1(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public final a(I)Landroid/graphics/PointF;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    :goto_0
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_1
    invoke-static {v0}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ge p1, v0, :cond_2

    .line 22
    .line 23
    const/4 p1, -0x1

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const/4 p1, 0x1

    .line 26
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const/4 v0, 0x0

    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    new-instance p0, Landroid/graphics/PointF;

    .line 34
    .line 35
    int-to-float p1, p1

    .line 36
    invoke-direct {p0, v0, p1}, Landroid/graphics/PointF;-><init>(FF)V

    .line 37
    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_3
    new-instance p0, Landroid/graphics/PointF;

    .line 41
    .line 42
    int-to-float p1, p1

    .line 43
    invoke-direct {p0, p1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 44
    .line 45
    .line 46
    return-object p0
.end method

.method public final a1(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget p2, p2, Lcom/google/android/flexbox/a;->h:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    :goto_0
    if-ge v1, p2, :cond_3

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/16 v4, 0x8

    .line 21
    .line 22
    if-ne v3, v4, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    iget-boolean v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 32
    .line 33
    invoke-virtual {v3, p1}, La/pa80;->d(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 38
    .line 39
    invoke-virtual {v4, v2}, La/pa80;->d(Landroid/view/View;)I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-ge v3, v4, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 47
    .line 48
    invoke-virtual {v3, p1}, La/pa80;->g(Landroid/view/View;)I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 53
    .line 54
    invoke-virtual {v4, v2}, La/pa80;->g(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-le v3, v4, :cond_2

    .line 59
    .line 60
    :goto_1
    move-object p1, v2

    .line 61
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return-object p1
.end method

.method public final b(Landroid/view/View;IILcom/google/android/flexbox/a;)V
    .locals 0

    .line 1
    sget-object p2, Lcom/google/android/flexbox/FlexboxLayoutManager;->o1:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/b;->p(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/hhe0;

    .line 17
    .line 18
    iget-object p0, p0, La/hhe0;->b:Landroid/graphics/Rect;

    .line 19
    .line 20
    iget p0, p0, Landroid/graphics/Rect;->left:I

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, La/hhe0;

    .line 27
    .line 28
    iget-object p1, p1, La/hhe0;->b:Landroid/graphics/Rect;

    .line 29
    .line 30
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 31
    .line 32
    add-int/2addr p0, p1

    .line 33
    iget p1, p4, Lcom/google/android/flexbox/a;->e:I

    .line 34
    .line 35
    add-int/2addr p1, p0

    .line 36
    iput p1, p4, Lcom/google/android/flexbox/a;->e:I

    .line 37
    .line 38
    iget p1, p4, Lcom/google/android/flexbox/a;->f:I

    .line 39
    .line 40
    add-int/2addr p1, p0

    .line 41
    iput p1, p4, Lcom/google/android/flexbox/a;->f:I

    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/hhe0;

    .line 49
    .line 50
    iget-object p0, p0, La/hhe0;->b:Landroid/graphics/Rect;

    .line 51
    .line 52
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, La/hhe0;

    .line 59
    .line 60
    iget-object p1, p1, La/hhe0;->b:Landroid/graphics/Rect;

    .line 61
    .line 62
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 63
    .line 64
    add-int/2addr p0, p1

    .line 65
    iget p1, p4, Lcom/google/android/flexbox/a;->e:I

    .line 66
    .line 67
    add-int/2addr p1, p0

    .line 68
    iput p1, p4, Lcom/google/android/flexbox/a;->e:I

    .line 69
    .line 70
    iget p1, p4, Lcom/google/android/flexbox/a;->f:I

    .line 71
    .line 72
    add-int/2addr p1, p0

    .line 73
    iput p1, p4, Lcom/google/android/flexbox/a;->f:I

    .line 74
    .line 75
    return-void
.end method

.method public final b1(I)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-virtual {p0, v0, v1, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->e1(III)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-static {p1}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 21
    .line 22
    iget-object v1, v1, Lcom/google/android/flexbox/b;->c:[I

    .line 23
    .line 24
    aget v0, v1, v0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/google/android/flexbox/a;

    .line 33
    .line 34
    invoke-virtual {p0, p1, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->c1(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method public final c(III)I
    .locals 1

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/b;->n:I

    .line 2
    .line 3
    iget v0, p0, Landroidx/recyclerview/widget/b;->l:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->q()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p0, p1, v0, p2, p3}, Landroidx/recyclerview/widget/b;->J(ZIIII)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final c1(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x2

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    iget p2, p2, Lcom/google/android/flexbox/a;->h:I

    .line 16
    .line 17
    sub-int/2addr v2, p2

    .line 18
    add-int/lit8 v2, v2, -0x1

    .line 19
    .line 20
    :goto_0
    if-le v1, v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const/16 v4, 0x8

    .line 33
    .line 34
    if-ne v3, v4, :cond_0

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    iget-boolean v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 44
    .line 45
    invoke-virtual {v3, p1}, La/pa80;->g(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 50
    .line 51
    invoke-virtual {v4, p2}, La/pa80;->g(Landroid/view/View;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-le v3, v4, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 59
    .line 60
    invoke-virtual {v3, p1}, La/pa80;->d(Landroid/view/View;)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 65
    .line 66
    invoke-virtual {v4, p2}, La/pa80;->d(Landroid/view/View;)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-ge v3, v4, :cond_2

    .line 71
    .line 72
    :goto_1
    move-object p1, p2

    .line 73
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, -0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    return-object p1
.end method

.method public final d(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->j1:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/view/View;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:La/msj;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/msj;->e(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final d1(II)Landroid/view/View;
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    if-le p2, p1, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, -0x1

    .line 7
    :goto_0
    if-eq p1, p2, :cond_6

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingLeft()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingTop()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    iget v5, p0, Landroidx/recyclerview/widget/b;->n:I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingRight()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    sub-int/2addr v5, v6

    .line 28
    iget v6, p0, Landroidx/recyclerview/widget/b;->o:I

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingBottom()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    sub-int/2addr v6, v7

    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    check-cast v7, La/hhe0;

    .line 40
    .line 41
    invoke-static {v2}, Landroidx/recyclerview/widget/b;->N(Landroid/view/View;)I

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 46
    .line 47
    sub-int/2addr v8, v7

    .line 48
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, La/hhe0;

    .line 53
    .line 54
    invoke-static {v2}, Landroidx/recyclerview/widget/b;->R(Landroid/view/View;)I

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 59
    .line 60
    sub-int/2addr v9, v7

    .line 61
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    check-cast v7, La/hhe0;

    .line 66
    .line 67
    invoke-static {v2}, Landroidx/recyclerview/widget/b;->Q(Landroid/view/View;)I

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 72
    .line 73
    add-int/2addr v10, v7

    .line 74
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    check-cast v7, La/hhe0;

    .line 79
    .line 80
    invoke-static {v2}, Landroidx/recyclerview/widget/b;->L(Landroid/view/View;)I

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    iget v7, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 85
    .line 86
    add-int/2addr v11, v7

    .line 87
    const/4 v7, 0x0

    .line 88
    if-ge v8, v5, :cond_2

    .line 89
    .line 90
    if-lt v10, v3, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    move v3, v7

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    :goto_1
    move v3, v0

    .line 96
    :goto_2
    if-ge v9, v6, :cond_3

    .line 97
    .line 98
    if-lt v11, v4, :cond_4

    .line 99
    .line 100
    :cond_3
    move v7, v0

    .line 101
    :cond_4
    if-eqz v3, :cond_5

    .line 102
    .line 103
    if-eqz v7, :cond_5

    .line 104
    .line 105
    return-object v2

    .line 106
    :cond_5
    add-int/2addr p1, v1

    .line 107
    goto :goto_0

    .line 108
    :cond_6
    const/4 p0, 0x0

    .line 109
    return-object p0
.end method

.method public final e(III)I
    .locals 1

    .line 1
    iget p1, p0, Landroidx/recyclerview/widget/b;->o:I

    .line 2
    .line 3
    iget v0, p0, Landroidx/recyclerview/widget/b;->m:I

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->r()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p0, p1, v0, p2, p3}, Landroidx/recyclerview/widget/b;->J(ZIIII)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final e0(La/yge0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final e1(III)Landroid/view/View;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->X0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, La/ikq;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput v1, v0, La/ikq;->h:I

    .line 15
    .line 16
    iput-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 19
    .line 20
    invoke-virtual {v0}, La/pa80;->m()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 25
    .line 26
    invoke-virtual {v2}, La/pa80;->i()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-le p2, p1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, -0x1

    .line 34
    :goto_0
    const/4 v3, 0x0

    .line 35
    move-object v4, v3

    .line 36
    :goto_1
    if-eq p1, p2, :cond_7

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-nez v5, :cond_2

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_2
    invoke-static {v5}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-ltz v6, :cond_6

    .line 50
    .line 51
    if-ge v6, p3, :cond_6

    .line 52
    .line 53
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    check-cast v6, La/hhe0;

    .line 58
    .line 59
    iget-object v6, v6, La/hhe0;->a:La/xhe0;

    .line 60
    .line 61
    invoke-virtual {v6}, La/xhe0;->k()Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    if-eqz v6, :cond_3

    .line 66
    .line 67
    if-nez v4, :cond_6

    .line 68
    .line 69
    move-object v4, v5

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    iget-object v6, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 72
    .line 73
    invoke-virtual {v6, v5}, La/pa80;->g(Landroid/view/View;)I

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-lt v6, v0, :cond_5

    .line 78
    .line 79
    iget-object v6, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 80
    .line 81
    invoke-virtual {v6, v5}, La/pa80;->d(Landroid/view/View;)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-le v6, v2, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    return-object v5

    .line 89
    :cond_5
    :goto_2
    if-nez v3, :cond_6

    .line 90
    .line 91
    move-object v3, v5

    .line 92
    :cond_6
    :goto_3
    add-int/2addr p1, v1

    .line 93
    goto :goto_1

    .line 94
    :cond_7
    if-eqz v3, :cond_8

    .line 95
    .line 96
    return-object v3

    .line 97
    :cond_8
    return-object v4
.end method

.method public final f(Landroid/view/View;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->j1:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l1:Landroid/view/View;

    .line 8
    .line 9
    return-void
.end method

.method public final f1(ILa/msj;La/the0;Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 12
    .line 13
    invoke-virtual {v0}, La/pa80;->m()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sub-int v0, p1, v0

    .line 18
    .line 19
    if-lez v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v0, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->h1(ILa/msj;La/the0;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 27
    .line 28
    invoke-virtual {v0}, La/pa80;->i()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int/2addr v0, p1

    .line 33
    if-lez v0, :cond_2

    .line 34
    .line 35
    neg-int v0, v0

    .line 36
    invoke-virtual {p0, v0, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->h1(ILa/msj;La/the0;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    neg-int p2, p2

    .line 41
    :goto_0
    add-int/2addr p1, p2

    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 45
    .line 46
    invoke-virtual {p3}, La/pa80;->i()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    sub-int/2addr p3, p1

    .line 51
    if-lez p3, :cond_1

    .line 52
    .line 53
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 54
    .line 55
    invoke-virtual {p0, p3}, La/pa80;->r(I)V

    .line 56
    .line 57
    .line 58
    add-int/2addr p3, p2

    .line 59
    return p3

    .line 60
    :cond_1
    return p2

    .line 61
    :cond_2
    const/4 p0, 0x0

    .line 62
    return p0
.end method

.method public final g(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/hhe0;

    .line 12
    .line 13
    iget-object p0, p0, La/hhe0;->b:Landroid/graphics/Rect;

    .line 14
    .line 15
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, La/hhe0;

    .line 22
    .line 23
    iget-object p1, p1, La/hhe0;->b:Landroid/graphics/Rect;

    .line 24
    .line 25
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 26
    .line 27
    :goto_0
    add-int/2addr p0, p1

    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, La/hhe0;

    .line 34
    .line 35
    iget-object p0, p0, La/hhe0;->b:Landroid/graphics/Rect;

    .line 36
    .line 37
    iget p0, p0, Landroid/graphics/Rect;->left:I

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, La/hhe0;

    .line 44
    .line 45
    iget-object p1, p1, La/hhe0;->b:Landroid/graphics/Rect;

    .line 46
    .line 47
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 48
    .line 49
    goto :goto_0
.end method

.method public final g0(Landroidx/recyclerview/widget/RecyclerView;La/msj;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g1(ILa/msj;La/the0;Z)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 12
    .line 13
    invoke-virtual {v0}, La/pa80;->i()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sub-int/2addr v0, p1

    .line 18
    if-lez v0, :cond_2

    .line 19
    .line 20
    neg-int v0, v0

    .line 21
    invoke-virtual {p0, v0, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->h1(ILa/msj;La/the0;)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 27
    .line 28
    invoke-virtual {v0}, La/pa80;->m()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    sub-int v0, p1, v0

    .line 33
    .line 34
    if-lez v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0, v0, p2, p3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->h1(ILa/msj;La/the0;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    neg-int p2, p2

    .line 41
    :goto_0
    add-int/2addr p1, p2

    .line 42
    if-eqz p4, :cond_1

    .line 43
    .line 44
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 45
    .line 46
    invoke-virtual {p3}, La/pa80;->m()I

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    sub-int/2addr p1, p3

    .line 51
    if-lez p1, :cond_1

    .line 52
    .line 53
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 54
    .line 55
    neg-int p3, p1

    .line 56
    invoke-virtual {p0, p3}, La/pa80;->r(I)V

    .line 57
    .line 58
    .line 59
    sub-int/2addr p2, p1

    .line 60
    :cond_1
    return p2

    .line 61
    :cond_2
    const/4 p0, 0x0

    .line 62
    return p0
.end method

.method public final getAlignContent()I
    .locals 0

    const/4 p0, 0x5

    return p0
.end method

.method public final getAlignItems()I
    .locals 0

    .line 1
    iget-byte p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->r:B

    .line 2
    .line 3
    return p0
.end method

.method public final getFlexDirection()I
    .locals 0

    .line 1
    iget-byte p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:B

    .line 2
    .line 3
    return p0
.end method

.method public final getFlexItemCount()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:La/the0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/the0;->b()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getFlexLinesInternal()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFlexWrap()I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getLargestMainSize()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/high16 v2, -0x80000000

    .line 18
    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Lcom/google/android/flexbox/a;

    .line 28
    .line 29
    iget v3, v3, Lcom/google/android/flexbox/a;->e:I

    .line 30
    .line 31
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return v2
.end method

.method public final getMaxLine()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->s:I

    .line 2
    .line 3
    return p0
.end method

.method public final getSumOfCrossSize()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    if-ge v1, v0, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lcom/google/android/flexbox/a;

    .line 18
    .line 19
    iget v3, v3, Lcom/google/android/flexbox/a;->g:I

    .line 20
    .line 21
    add-int/2addr v2, v3

    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return v2
.end method

.method public final h(Lcom/google/android/flexbox/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final h1(ILa/msj;La/the0;)I
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->I()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_14

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_c

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->X0()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    iput-boolean v3, v1, La/ikq;->i:Z

    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-boolean v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    move v1, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move v1, v2

    .line 35
    :goto_0
    const/4 v4, -0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-gez p1, :cond_2

    .line 39
    .line 40
    :goto_1
    move v5, v3

    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move v5, v4

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    if-lez p1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :goto_2
    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(I)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 52
    .line 53
    iput v5, v7, La/ikq;->h:I

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    iget v8, v0, Landroidx/recyclerview/widget/b;->n:I

    .line 60
    .line 61
    iget v9, v0, Landroidx/recyclerview/widget/b;->l:I

    .line 62
    .line 63
    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    iget v8, v0, Landroidx/recyclerview/widget/b;->o:I

    .line 68
    .line 69
    iget v9, v0, Landroidx/recyclerview/widget/b;->m:I

    .line 70
    .line 71
    invoke-static {v8, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 72
    .line 73
    .line 74
    move-result v13

    .line 75
    if-nez v7, :cond_4

    .line 76
    .line 77
    iget-boolean v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 78
    .line 79
    if-eqz v8, :cond_4

    .line 80
    .line 81
    move v8, v3

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    move v8, v2

    .line 84
    :goto_3
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 85
    .line 86
    if-ne v5, v3, :cond_a

    .line 87
    .line 88
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->I()I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    sub-int/2addr v10, v3

    .line 93
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    if-nez v10, :cond_5

    .line 98
    .line 99
    goto/16 :goto_a

    .line 100
    .line 101
    :cond_5
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 102
    .line 103
    iget-object v14, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 104
    .line 105
    invoke-virtual {v14, v10}, La/pa80;->d(Landroid/view/View;)I

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    iput v14, v11, La/ikq;->e:I

    .line 110
    .line 111
    invoke-static {v10}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    iget-object v14, v9, Lcom/google/android/flexbox/b;->c:[I

    .line 116
    .line 117
    aget v14, v14, v11

    .line 118
    .line 119
    iget-object v15, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v15, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v14

    .line 125
    check-cast v14, Lcom/google/android/flexbox/a;

    .line 126
    .line 127
    invoke-virtual {v0, v10, v14}, Lcom/google/android/flexbox/FlexboxLayoutManager;->c1(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v10

    .line 131
    iget-object v14, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 132
    .line 133
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    add-int/2addr v11, v3

    .line 137
    iput v11, v14, La/ikq;->d:I

    .line 138
    .line 139
    iget-object v15, v9, Lcom/google/android/flexbox/b;->c:[I

    .line 140
    .line 141
    move/from16 v16, v3

    .line 142
    .line 143
    array-length v3, v15

    .line 144
    if-gt v3, v11, :cond_6

    .line 145
    .line 146
    iput v4, v14, La/ikq;->c:I

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_6
    aget v3, v15, v11

    .line 150
    .line 151
    iput v3, v14, La/ikq;->c:I

    .line 152
    .line 153
    :goto_4
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 154
    .line 155
    if-eqz v8, :cond_7

    .line 156
    .line 157
    invoke-virtual {v3, v10}, La/pa80;->g(Landroid/view/View;)I

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    iput v3, v14, La/ikq;->e:I

    .line 162
    .line 163
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 164
    .line 165
    iget-object v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 166
    .line 167
    invoke-virtual {v8, v10}, La/pa80;->g(Landroid/view/View;)I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    neg-int v8, v8

    .line 172
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 173
    .line 174
    invoke-virtual {v10}, La/pa80;->m()I

    .line 175
    .line 176
    .line 177
    move-result v10

    .line 178
    add-int/2addr v10, v8

    .line 179
    iput v10, v3, La/ikq;->f:I

    .line 180
    .line 181
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 182
    .line 183
    iget v8, v3, La/ikq;->f:I

    .line 184
    .line 185
    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    .line 186
    .line 187
    .line 188
    move-result v8

    .line 189
    iput v8, v3, La/ikq;->f:I

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_7
    invoke-virtual {v3, v10}, La/pa80;->d(Landroid/view/View;)I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    iput v3, v14, La/ikq;->e:I

    .line 197
    .line 198
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 199
    .line 200
    iget-object v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 201
    .line 202
    invoke-virtual {v8, v10}, La/pa80;->d(Landroid/view/View;)I

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 207
    .line 208
    invoke-virtual {v10}, La/pa80;->i()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    sub-int/2addr v8, v10

    .line 213
    iput v8, v3, La/ikq;->f:I

    .line 214
    .line 215
    :goto_5
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 216
    .line 217
    iget v3, v3, La/ikq;->c:I

    .line 218
    .line 219
    if-eq v3, v4, :cond_8

    .line 220
    .line 221
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 222
    .line 223
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    add-int/lit8 v4, v4, -0x1

    .line 228
    .line 229
    if-le v3, v4, :cond_10

    .line 230
    .line 231
    :cond_8
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 232
    .line 233
    iget v3, v3, La/ikq;->d:I

    .line 234
    .line 235
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:La/the0;

    .line 236
    .line 237
    invoke-virtual {v4}, La/the0;->b()I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-gt v3, v4, :cond_10

    .line 242
    .line 243
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 244
    .line 245
    iget v4, v3, La/ikq;->f:I

    .line 246
    .line 247
    sub-int v14, v6, v4

    .line 248
    .line 249
    const/4 v4, 0x0

    .line 250
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n1:La/tyj;

    .line 251
    .line 252
    iput-object v4, v11, La/tyj;->a:Ljava/util/List;

    .line 253
    .line 254
    iput v2, v11, La/tyj;->b:I

    .line 255
    .line 256
    if-lez v14, :cond_10

    .line 257
    .line 258
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 259
    .line 260
    if-eqz v7, :cond_9

    .line 261
    .line 262
    iget v15, v3, La/ikq;->d:I

    .line 263
    .line 264
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 265
    .line 266
    const/16 v16, -0x1

    .line 267
    .line 268
    move-object/from16 v17, v3

    .line 269
    .line 270
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->b(La/tyj;IIIIILjava/util/List;)V

    .line 271
    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_9
    iget v15, v3, La/ikq;->d:I

    .line 275
    .line 276
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 277
    .line 278
    const/16 v16, -0x1

    .line 279
    .line 280
    move/from16 v17, v13

    .line 281
    .line 282
    move v13, v12

    .line 283
    move/from16 v12, v17

    .line 284
    .line 285
    move-object/from16 v17, v3

    .line 286
    .line 287
    invoke-virtual/range {v10 .. v17}, Lcom/google/android/flexbox/b;->b(La/tyj;IIIIILjava/util/List;)V

    .line 288
    .line 289
    .line 290
    move/from16 v18, v13

    .line 291
    .line 292
    move v13, v12

    .line 293
    move/from16 v12, v18

    .line 294
    .line 295
    :goto_6
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 296
    .line 297
    iget v3, v3, La/ikq;->d:I

    .line 298
    .line 299
    invoke-virtual {v9, v12, v13, v3}, Lcom/google/android/flexbox/b;->h(III)V

    .line 300
    .line 301
    .line 302
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 303
    .line 304
    iget v3, v3, La/ikq;->d:I

    .line 305
    .line 306
    invoke-virtual {v9, v3}, Lcom/google/android/flexbox/b;->u(I)V

    .line 307
    .line 308
    .line 309
    goto/16 :goto_9

    .line 310
    .line 311
    :cond_a
    move/from16 v16, v3

    .line 312
    .line 313
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    if-nez v3, :cond_b

    .line 318
    .line 319
    goto/16 :goto_a

    .line 320
    .line 321
    :cond_b
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 322
    .line 323
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 324
    .line 325
    invoke-virtual {v10, v3}, La/pa80;->g(Landroid/view/View;)I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    iput v10, v7, La/ikq;->e:I

    .line 330
    .line 331
    invoke-static {v3}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 332
    .line 333
    .line 334
    move-result v7

    .line 335
    iget-object v10, v9, Lcom/google/android/flexbox/b;->c:[I

    .line 336
    .line 337
    aget v10, v10, v7

    .line 338
    .line 339
    iget-object v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 340
    .line 341
    invoke-interface {v11, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v10

    .line 345
    check-cast v10, Lcom/google/android/flexbox/a;

    .line 346
    .line 347
    invoke-virtual {v0, v3, v10}, Lcom/google/android/flexbox/FlexboxLayoutManager;->a1(Landroid/view/View;Lcom/google/android/flexbox/a;)Landroid/view/View;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 352
    .line 353
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    iget-object v9, v9, Lcom/google/android/flexbox/b;->c:[I

    .line 357
    .line 358
    aget v9, v9, v7

    .line 359
    .line 360
    if-ne v9, v4, :cond_c

    .line 361
    .line 362
    move v9, v2

    .line 363
    :cond_c
    if-lez v9, :cond_d

    .line 364
    .line 365
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 366
    .line 367
    add-int/lit8 v10, v9, -0x1

    .line 368
    .line 369
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    check-cast v4, Lcom/google/android/flexbox/a;

    .line 374
    .line 375
    iget-object v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 376
    .line 377
    iget v4, v4, Lcom/google/android/flexbox/a;->h:I

    .line 378
    .line 379
    sub-int/2addr v7, v4

    .line 380
    iput v7, v10, La/ikq;->d:I

    .line 381
    .line 382
    goto :goto_7

    .line 383
    :cond_d
    iput v4, v10, La/ikq;->d:I

    .line 384
    .line 385
    :goto_7
    if-lez v9, :cond_e

    .line 386
    .line 387
    add-int/lit8 v9, v9, -0x1

    .line 388
    .line 389
    goto :goto_8

    .line 390
    :cond_e
    move v9, v2

    .line 391
    :goto_8
    iput v9, v10, La/ikq;->c:I

    .line 392
    .line 393
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 394
    .line 395
    if-eqz v8, :cond_f

    .line 396
    .line 397
    invoke-virtual {v4, v3}, La/pa80;->d(Landroid/view/View;)I

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    iput v4, v10, La/ikq;->e:I

    .line 402
    .line 403
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 404
    .line 405
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 406
    .line 407
    invoke-virtual {v7, v3}, La/pa80;->d(Landroid/view/View;)I

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 412
    .line 413
    invoke-virtual {v7}, La/pa80;->i()I

    .line 414
    .line 415
    .line 416
    move-result v7

    .line 417
    sub-int/2addr v3, v7

    .line 418
    iput v3, v4, La/ikq;->f:I

    .line 419
    .line 420
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 421
    .line 422
    iget v4, v3, La/ikq;->f:I

    .line 423
    .line 424
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    .line 425
    .line 426
    .line 427
    move-result v4

    .line 428
    iput v4, v3, La/ikq;->f:I

    .line 429
    .line 430
    goto :goto_9

    .line 431
    :cond_f
    invoke-virtual {v4, v3}, La/pa80;->g(Landroid/view/View;)I

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    iput v4, v10, La/ikq;->e:I

    .line 436
    .line 437
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 438
    .line 439
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 440
    .line 441
    invoke-virtual {v7, v3}, La/pa80;->g(Landroid/view/View;)I

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    neg-int v3, v3

    .line 446
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 447
    .line 448
    invoke-virtual {v7}, La/pa80;->m()I

    .line 449
    .line 450
    .line 451
    move-result v7

    .line 452
    add-int/2addr v7, v3

    .line 453
    iput v7, v4, La/ikq;->f:I

    .line 454
    .line 455
    :cond_10
    :goto_9
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 456
    .line 457
    iget v4, v3, La/ikq;->f:I

    .line 458
    .line 459
    sub-int v4, v6, v4

    .line 460
    .line 461
    iput v4, v3, La/ikq;->a:I

    .line 462
    .line 463
    :goto_a
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 464
    .line 465
    iget v4, v3, La/ikq;->f:I

    .line 466
    .line 467
    move-object/from16 v7, p2

    .line 468
    .line 469
    move-object/from16 v8, p3

    .line 470
    .line 471
    invoke-virtual {v0, v7, v8, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y0(La/msj;La/the0;La/ikq;)I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    add-int/2addr v3, v4

    .line 476
    if-gez v3, :cond_11

    .line 477
    .line 478
    goto :goto_c

    .line 479
    :cond_11
    if-eqz v1, :cond_13

    .line 480
    .line 481
    if-le v6, v3, :cond_12

    .line 482
    .line 483
    neg-int v1, v5

    .line 484
    mul-int/2addr v1, v3

    .line 485
    goto :goto_b

    .line 486
    :cond_12
    move/from16 v1, p1

    .line 487
    .line 488
    goto :goto_b

    .line 489
    :cond_13
    if-le v6, v3, :cond_12

    .line 490
    .line 491
    mul-int v1, v5, v3

    .line 492
    .line 493
    :goto_b
    iget-object v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 494
    .line 495
    neg-int v3, v1

    .line 496
    invoke-virtual {v2, v3}, La/pa80;->r(I)V

    .line 497
    .line 498
    .line 499
    iget-object v0, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 500
    .line 501
    iput v1, v0, La/ikq;->g:I

    .line 502
    .line 503
    return v1

    .line 504
    :cond_14
    :goto_c
    return v2
.end method

.method public final i(I)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final i1(I)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_8

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->X0()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l1:Landroid/view/View;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    :goto_0
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget v0, p0, Landroidx/recyclerview/widget/b;->n:I

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    iget v0, p0, Landroidx/recyclerview/widget/b;->o:I

    .line 36
    .line 37
    :goto_1
    iget-object v2, p0, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x1

    .line 44
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:La/hkq;

    .line 45
    .line 46
    if-ne v2, v3, :cond_4

    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-gez p1, :cond_3

    .line 53
    .line 54
    iget p0, p0, La/hkq;->d:I

    .line 55
    .line 56
    add-int/2addr v0, p0

    .line 57
    sub-int/2addr v0, v1

    .line 58
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    neg-int p0, p0

    .line 63
    return p0

    .line 64
    :cond_3
    iget p0, p0, La/hkq;->d:I

    .line 65
    .line 66
    add-int v0, p0, p1

    .line 67
    .line 68
    if-lez v0, :cond_6

    .line 69
    .line 70
    neg-int p0, p0

    .line 71
    return p0

    .line 72
    :cond_4
    if-lez p1, :cond_5

    .line 73
    .line 74
    iget p0, p0, La/hkq;->d:I

    .line 75
    .line 76
    sub-int/2addr v0, p0

    .line 77
    sub-int/2addr v0, v1

    .line 78
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    return p0

    .line 83
    :cond_5
    iget p0, p0, La/hkq;->d:I

    .line 84
    .line 85
    add-int v0, p0, p1

    .line 86
    .line 87
    if-ltz v0, :cond_7

    .line 88
    .line 89
    :cond_6
    return p1

    .line 90
    :cond_7
    neg-int p0, p0

    .line 91
    return p0

    .line 92
    :cond_8
    :goto_2
    const/4 p0, 0x0

    .line 93
    return p0
.end method

.method public final j(Landroid/view/View;II)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/hhe0;

    .line 12
    .line 13
    iget-object p0, p0, La/hhe0;->b:Landroid/graphics/Rect;

    .line 14
    .line 15
    iget p0, p0, Landroid/graphics/Rect;->left:I

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, La/hhe0;

    .line 22
    .line 23
    iget-object p1, p1, La/hhe0;->b:Landroid/graphics/Rect;

    .line 24
    .line 25
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 26
    .line 27
    :goto_0
    add-int/2addr p0, p1

    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, La/hhe0;

    .line 34
    .line 35
    iget-object p0, p0, La/hhe0;->b:Landroid/graphics/Rect;

    .line 36
    .line 37
    iget p0, p0, Landroid/graphics/Rect;->top:I

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    check-cast p1, La/hhe0;

    .line 44
    .line 45
    iget-object p1, p1, La/hhe0;->b:Landroid/graphics/Rect;

    .line 46
    .line 47
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 48
    .line 49
    goto :goto_0
.end method

.method public final j1(La/msj;La/ikq;)V
    .locals 9

    .line 1
    iget-boolean v0, p2, La/ikq;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_8

    .line 6
    .line 7
    :cond_0
    iget v0, p2, La/ikq;->h:I

    .line 8
    .line 9
    iget v1, p2, La/ikq;->f:I

    .line 10
    .line 11
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    if-ne v0, v3, :cond_b

    .line 15
    .line 16
    if-gez v1, :cond_1

    .line 17
    .line 18
    goto/16 :goto_8

    .line 19
    .line 20
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    goto/16 :goto_8

    .line 27
    .line 28
    :cond_2
    add-int/lit8 v1, v0, -0x1

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-nez v4, :cond_3

    .line 35
    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :cond_3
    iget-object v2, v2, Lcom/google/android/flexbox/b;->c:[I

    .line 39
    .line 40
    invoke-static {v4}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    aget v2, v2, v4

    .line 45
    .line 46
    if-ne v2, v3, :cond_4

    .line 47
    .line 48
    goto/16 :goto_8

    .line 49
    .line 50
    :cond_4
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Lcom/google/android/flexbox/a;

    .line 57
    .line 58
    move v4, v1

    .line 59
    :goto_0
    if-ltz v4, :cond_9

    .line 60
    .line 61
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    if-nez v5, :cond_5

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_5
    iget v6, p2, La/ikq;->f:I

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-nez v7, :cond_6

    .line 75
    .line 76
    iget-boolean v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 77
    .line 78
    if-eqz v7, :cond_6

    .line 79
    .line 80
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 81
    .line 82
    invoke-virtual {v7, v5}, La/pa80;->d(Landroid/view/View;)I

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-gt v7, v6, :cond_9

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_6
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 90
    .line 91
    invoke-virtual {v7, v5}, La/pa80;->g(Landroid/view/View;)I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    iget-object v8, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 96
    .line 97
    invoke-virtual {v8}, La/pa80;->h()I

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    sub-int/2addr v8, v6

    .line 102
    if-lt v7, v8, :cond_9

    .line 103
    .line 104
    :goto_1
    iget v6, v3, Lcom/google/android/flexbox/a;->o:I

    .line 105
    .line 106
    invoke-static {v5}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-ne v6, v5, :cond_8

    .line 111
    .line 112
    if-gtz v2, :cond_7

    .line 113
    .line 114
    move v0, v4

    .line 115
    goto :goto_3

    .line 116
    :cond_7
    iget v0, p2, La/ikq;->h:I

    .line 117
    .line 118
    add-int/2addr v2, v0

    .line 119
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Lcom/google/android/flexbox/a;

    .line 126
    .line 127
    move-object v3, v0

    .line 128
    move v0, v4

    .line 129
    :cond_8
    :goto_2
    add-int/lit8 v4, v4, -0x1

    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_9
    :goto_3
    if-lt v1, v0, :cond_16

    .line 133
    .line 134
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-eqz v2, :cond_a

    .line 143
    .line 144
    iget-object v2, p0, Landroidx/recyclerview/widget/b;->a:La/iac;

    .line 145
    .line 146
    invoke-virtual {v2, v1}, La/iac;->k(I)V

    .line 147
    .line 148
    .line 149
    :cond_a
    invoke-virtual {p1, p2}, La/msj;->k(Landroid/view/View;)V

    .line 150
    .line 151
    .line 152
    add-int/lit8 v1, v1, -0x1

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_b
    if-gez v1, :cond_c

    .line 156
    .line 157
    goto/16 :goto_8

    .line 158
    .line 159
    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-nez v0, :cond_d

    .line 164
    .line 165
    goto/16 :goto_8

    .line 166
    .line 167
    :cond_d
    const/4 v1, 0x0

    .line 168
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    if-nez v4, :cond_e

    .line 173
    .line 174
    goto/16 :goto_8

    .line 175
    .line 176
    :cond_e
    iget-object v2, v2, Lcom/google/android/flexbox/b;->c:[I

    .line 177
    .line 178
    invoke-static {v4}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    aget v2, v2, v4

    .line 183
    .line 184
    if-ne v2, v3, :cond_f

    .line 185
    .line 186
    goto/16 :goto_8

    .line 187
    .line 188
    :cond_f
    iget-object v4, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 189
    .line 190
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v4

    .line 194
    check-cast v4, Lcom/google/android/flexbox/a;

    .line 195
    .line 196
    :goto_4
    if-ge v1, v0, :cond_14

    .line 197
    .line 198
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 199
    .line 200
    .line 201
    move-result-object v5

    .line 202
    if-nez v5, :cond_10

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_10
    iget v6, p2, La/ikq;->f:I

    .line 206
    .line 207
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 208
    .line 209
    .line 210
    move-result v7

    .line 211
    if-nez v7, :cond_11

    .line 212
    .line 213
    iget-boolean v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 214
    .line 215
    if-eqz v7, :cond_11

    .line 216
    .line 217
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 218
    .line 219
    invoke-virtual {v7}, La/pa80;->h()I

    .line 220
    .line 221
    .line 222
    move-result v7

    .line 223
    iget-object v8, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 224
    .line 225
    invoke-virtual {v8, v5}, La/pa80;->g(Landroid/view/View;)I

    .line 226
    .line 227
    .line 228
    move-result v8

    .line 229
    sub-int/2addr v7, v8

    .line 230
    if-gt v7, v6, :cond_14

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_11
    iget-object v7, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 234
    .line 235
    invoke-virtual {v7, v5}, La/pa80;->d(Landroid/view/View;)I

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    if-gt v7, v6, :cond_14

    .line 240
    .line 241
    :goto_5
    iget v6, v4, Lcom/google/android/flexbox/a;->p:I

    .line 242
    .line 243
    invoke-static {v5}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    if-ne v6, v5, :cond_13

    .line 248
    .line 249
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 250
    .line 251
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    add-int/lit8 v3, v3, -0x1

    .line 256
    .line 257
    if-lt v2, v3, :cond_12

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_12
    iget v3, p2, La/ikq;->h:I

    .line 261
    .line 262
    add-int/2addr v2, v3

    .line 263
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 264
    .line 265
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    check-cast v3, Lcom/google/android/flexbox/a;

    .line 270
    .line 271
    move-object v4, v3

    .line 272
    move v3, v1

    .line 273
    :cond_13
    :goto_6
    add-int/lit8 v1, v1, 0x1

    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_14
    move v1, v3

    .line 277
    :goto_7
    if-ltz v1, :cond_16

    .line 278
    .line 279
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 280
    .line 281
    .line 282
    move-result-object p2

    .line 283
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    if-eqz v0, :cond_15

    .line 288
    .line 289
    iget-object v0, p0, Landroidx/recyclerview/widget/b;->a:La/iac;

    .line 290
    .line 291
    invoke-virtual {v0, v1}, La/iac;->k(I)V

    .line 292
    .line 293
    .line 294
    :cond_15
    invoke-virtual {p1, p2}, La/msj;->k(Landroid/view/View;)V

    .line 295
    .line 296
    .line 297
    add-int/lit8 v1, v1, -0x1

    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_16
    :goto_8
    return-void
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-byte p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    if-ne p0, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    :goto_0
    return v0
.end method

.method public final k1(I)V
    .locals 1

    .line 1
    iget-byte v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:B

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->z0()V

    .line 6
    .line 7
    .line 8
    iput-byte p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:B

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y:La/pa80;

    .line 14
    .line 15
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:La/hkq;

    .line 21
    .line 22
    invoke-virtual {p1}, La/hkq;->b()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, p1, La/hkq;->d:I

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->F0()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public final l1(Landroid/view/View;IILcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p0, p0, Landroidx/recyclerview/widget/b;->h:Z

    .line 8
    .line 9
    if-eqz p0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    iget v0, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 16
    .line 17
    invoke-static {p0, p2, v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z(III)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    iget p1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 28
    .line 29
    invoke-static {p0, p3, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z(III)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 39
    return p0
.end method

.method public final m0(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->m1(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final m1(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    invoke-virtual {p0, v0, v1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->d1(II)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    :goto_0
    if-lt p1, v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, Lcom/google/android/flexbox/b;->j(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Lcom/google/android/flexbox/b;->k(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Lcom/google/android/flexbox/b;->i(I)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v1, Lcom/google/android/flexbox/b;->c:[I

    .line 38
    .line 39
    array-length v0, v0

    .line 40
    if-lt p1, v0, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m1:I

    .line 44
    .line 45
    const/4 p1, 0x0

    .line 46
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-nez p1, :cond_3

    .line 51
    .line 52
    :goto_1
    return-void

    .line 53
    :cond_3
    invoke-static {p1}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_4

    .line 64
    .line 65
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 66
    .line 67
    if-eqz v0, :cond_4

    .line 68
    .line 69
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, La/pa80;->d(Landroid/view/View;)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 76
    .line 77
    invoke-virtual {v0}, La/pa80;->j()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    add-int/2addr v0, p1

    .line 82
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1:I

    .line 83
    .line 84
    return-void

    .line 85
    :cond_4
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, La/pa80;->g(Landroid/view/View;)I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 92
    .line 93
    invoke-virtual {v0}, La/pa80;->m()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    sub-int/2addr p1, v0

    .line 98
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1:I

    .line 99
    .line 100
    return-void
.end method

.method public final n1(La/hkq;ZZ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, -0x80000000

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz p3, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    iget p3, p0, Landroidx/recyclerview/widget/b;->m:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget p3, p0, Landroidx/recyclerview/widget/b;->l:I

    .line 17
    .line 18
    :goto_0
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    if-ne p3, v1, :cond_2

    .line 23
    .line 24
    :cond_1
    move v0, v2

    .line 25
    :cond_2
    iput-boolean v0, v3, La/ikq;->b:Z

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_3
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 29
    .line 30
    iput-boolean v0, p3, La/ikq;->b:Z

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-nez p3, :cond_4

    .line 37
    .line 38
    iget-boolean p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 39
    .line 40
    if-eqz p3, :cond_4

    .line 41
    .line 42
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 43
    .line 44
    iget v0, p1, La/hkq;->c:I

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->getPaddingRight()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    sub-int/2addr v0, v3

    .line 51
    iput v0, p3, La/ikq;->a:I

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_4
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 55
    .line 56
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 57
    .line 58
    invoke-virtual {v0}, La/pa80;->i()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget v3, p1, La/hkq;->c:I

    .line 63
    .line 64
    sub-int/2addr v0, v3

    .line 65
    iput v0, p3, La/ikq;->a:I

    .line 66
    .line 67
    :goto_2
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 68
    .line 69
    iget v0, p1, La/hkq;->a:I

    .line 70
    .line 71
    iput v0, p3, La/ikq;->d:I

    .line 72
    .line 73
    iput v2, p3, La/ikq;->h:I

    .line 74
    .line 75
    iget v0, p1, La/hkq;->c:I

    .line 76
    .line 77
    iput v0, p3, La/ikq;->e:I

    .line 78
    .line 79
    iput v1, p3, La/ikq;->f:I

    .line 80
    .line 81
    iget v0, p1, La/hkq;->b:I

    .line 82
    .line 83
    iput v0, p3, La/ikq;->c:I

    .line 84
    .line 85
    if-eqz p2, :cond_5

    .line 86
    .line 87
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 88
    .line 89
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-le p2, v2, :cond_5

    .line 94
    .line 95
    iget p2, p1, La/hkq;->b:I

    .line 96
    .line 97
    if-ltz p2, :cond_5

    .line 98
    .line 99
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    sub-int/2addr p3, v2

    .line 106
    if-ge p2, p3, :cond_5

    .line 107
    .line 108
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 109
    .line 110
    iget p1, p1, La/hkq;->b:I

    .line 111
    .line 112
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    check-cast p1, Lcom/google/android/flexbox/a;

    .line 117
    .line 118
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 119
    .line 120
    iget p2, p0, La/ikq;->c:I

    .line 121
    .line 122
    add-int/2addr p2, v2

    .line 123
    iput p2, p0, La/ikq;->c:I

    .line 124
    .line 125
    iget p1, p1, Lcom/google/android/flexbox/a;->h:I

    .line 126
    .line 127
    iget p2, p0, La/ikq;->d:I

    .line 128
    .line 129
    add-int/2addr p2, p1

    .line 130
    iput p2, p0, La/ikq;->d:I

    .line 131
    .line 132
    :cond_5
    return-void
.end method

.method public final o0(II)V
    .locals 0

    .line 1
    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->m1(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final o1(La/hkq;ZZ)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, -0x80000000

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz p3, :cond_3

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-eqz p3, :cond_0

    .line 12
    .line 13
    iget p3, p0, Landroidx/recyclerview/widget/b;->m:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget p3, p0, Landroidx/recyclerview/widget/b;->l:I

    .line 17
    .line 18
    :goto_0
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 19
    .line 20
    if-eqz p3, :cond_1

    .line 21
    .line 22
    if-ne p3, v1, :cond_2

    .line 23
    .line 24
    :cond_1
    move v0, v2

    .line 25
    :cond_2
    iput-boolean v0, v3, La/ikq;->b:Z

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_3
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 29
    .line 30
    iput-boolean v0, p3, La/ikq;->b:Z

    .line 31
    .line 32
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-nez p3, :cond_4

    .line 37
    .line 38
    iget-boolean p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 39
    .line 40
    if-eqz p3, :cond_4

    .line 41
    .line 42
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l1:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget v3, p1, La/hkq;->c:I

    .line 51
    .line 52
    sub-int/2addr v0, v3

    .line 53
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 54
    .line 55
    invoke-virtual {v3}, La/pa80;->m()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    sub-int/2addr v0, v3

    .line 60
    iput v0, p3, La/ikq;->a:I

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 64
    .line 65
    iget v0, p1, La/hkq;->c:I

    .line 66
    .line 67
    iget-object v3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 68
    .line 69
    invoke-virtual {v3}, La/pa80;->m()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    sub-int/2addr v0, v3

    .line 74
    iput v0, p3, La/ikq;->a:I

    .line 75
    .line 76
    :goto_2
    iget-object p3, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 77
    .line 78
    iget v0, p1, La/hkq;->a:I

    .line 79
    .line 80
    iput v0, p3, La/ikq;->d:I

    .line 81
    .line 82
    const/4 v0, -0x1

    .line 83
    iput v0, p3, La/ikq;->h:I

    .line 84
    .line 85
    iget v0, p1, La/hkq;->c:I

    .line 86
    .line 87
    iput v0, p3, La/ikq;->e:I

    .line 88
    .line 89
    iput v1, p3, La/ikq;->f:I

    .line 90
    .line 91
    iget v0, p1, La/hkq;->b:I

    .line 92
    .line 93
    iput v0, p3, La/ikq;->c:I

    .line 94
    .line 95
    if-eqz p2, :cond_5

    .line 96
    .line 97
    if-lez v0, :cond_5

    .line 98
    .line 99
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 100
    .line 101
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iget p1, p1, La/hkq;->b:I

    .line 106
    .line 107
    if-le p2, p1, :cond_5

    .line 108
    .line 109
    iget-object p2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 110
    .line 111
    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast p1, Lcom/google/android/flexbox/a;

    .line 116
    .line 117
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 118
    .line 119
    iget p2, p0, La/ikq;->c:I

    .line 120
    .line 121
    sub-int/2addr p2, v2

    .line 122
    iput p2, p0, La/ikq;->c:I

    .line 123
    .line 124
    iget p1, p1, Lcom/google/android/flexbox/a;->h:I

    .line 125
    .line 126
    iget p2, p0, La/ikq;->d:I

    .line 127
    .line 128
    sub-int/2addr p2, p1

    .line 129
    iput p2, p0, La/ikq;->d:I

    .line 130
    .line 131
    :cond_5
    return-void
.end method

.method public final p0(II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->m1(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final q()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    iget v0, p0, Landroidx/recyclerview/widget/b;->n:I

    .line 17
    .line 18
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l1:Landroid/view/View;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move p0, v1

    .line 29
    :goto_0
    if-le v0, p0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    return v1

    .line 33
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 34
    return p0
.end method

.method public final q0(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->m1(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final r()Z
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    xor-int/2addr p0, v1

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    iget v0, p0, Landroidx/recyclerview/widget/b;->o:I

    .line 19
    .line 20
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->l1:Landroid/view/View;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move p0, v2

    .line 31
    :goto_0
    if-le v0, p0, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    return v2

    .line 35
    :cond_3
    :goto_1
    return v1
.end method

.method public final r0(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->m1(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Lcom/google/android/flexbox/FlexboxLayoutManager;->m1(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final s(La/hhe0;)Z
    .locals 0

    .line 1
    instance-of p0, p1, Lcom/google/android/flexbox/FlexboxLayoutManager$LayoutParams;

    .line 2
    .line 3
    return p0
.end method

.method public final s0(La/msj;La/the0;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iput-object v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->x:La/msj;

    .line 8
    .line 9
    iput-object v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->y:La/the0;

    .line 10
    .line 11
    invoke-virtual {v2}, La/the0;->b()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    iget-boolean v4, v2, La/the0;->g:Z

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    goto/16 :goto_1b

    .line 22
    .line 23
    :cond_0
    iget-object v4, v0, Landroidx/recyclerview/widget/b;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 24
    .line 25
    invoke-virtual {v4}, Landroid/view/View;->getLayoutDirection()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget-byte v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->p:B

    .line 30
    .line 31
    iget-boolean v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:Z

    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    const/4 v8, 0x0

    .line 35
    const/4 v9, 0x2

    .line 36
    if-eqz v5, :cond_a

    .line 37
    .line 38
    if-eq v5, v7, :cond_7

    .line 39
    .line 40
    if-eq v5, v9, :cond_4

    .line 41
    .line 42
    const/4 v10, 0x3

    .line 43
    if-eq v5, v10, :cond_1

    .line 44
    .line 45
    iput-boolean v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 46
    .line 47
    iput-boolean v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 48
    .line 49
    goto :goto_6

    .line 50
    :cond_1
    if-ne v4, v7, :cond_2

    .line 51
    .line 52
    move v4, v7

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move v4, v8

    .line 55
    :goto_0
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 56
    .line 57
    if-ne v6, v9, :cond_3

    .line 58
    .line 59
    xor-int/2addr v4, v7

    .line 60
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 61
    .line 62
    :cond_3
    iput-boolean v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 63
    .line 64
    goto :goto_6

    .line 65
    :cond_4
    if-ne v4, v7, :cond_5

    .line 66
    .line 67
    move v4, v7

    .line 68
    goto :goto_1

    .line 69
    :cond_5
    move v4, v8

    .line 70
    :goto_1
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 71
    .line 72
    if-ne v6, v9, :cond_6

    .line 73
    .line 74
    xor-int/2addr v4, v7

    .line 75
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 76
    .line 77
    :cond_6
    iput-boolean v8, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_7
    if-eq v4, v7, :cond_8

    .line 81
    .line 82
    move v4, v7

    .line 83
    goto :goto_2

    .line 84
    :cond_8
    move v4, v8

    .line 85
    :goto_2
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 86
    .line 87
    if-ne v6, v9, :cond_9

    .line 88
    .line 89
    move v4, v7

    .line 90
    goto :goto_3

    .line 91
    :cond_9
    move v4, v8

    .line 92
    :goto_3
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 93
    .line 94
    goto :goto_6

    .line 95
    :cond_a
    if-ne v4, v7, :cond_b

    .line 96
    .line 97
    move v4, v7

    .line 98
    goto :goto_4

    .line 99
    :cond_b
    move v4, v8

    .line 100
    :goto_4
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 101
    .line 102
    if-ne v6, v9, :cond_c

    .line 103
    .line 104
    move v4, v7

    .line 105
    goto :goto_5

    .line 106
    :cond_c
    move v4, v8

    .line 107
    :goto_5
    iput-boolean v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->u:Z

    .line 108
    .line 109
    :goto_6
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->X0()V

    .line 110
    .line 111
    .line 112
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 113
    .line 114
    if-nez v4, :cond_d

    .line 115
    .line 116
    new-instance v4, La/ikq;

    .line 117
    .line 118
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 119
    .line 120
    .line 121
    iput v7, v4, La/ikq;->h:I

    .line 122
    .line 123
    iput-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 124
    .line 125
    :cond_d
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 126
    .line 127
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/b;->j(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/b;->k(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/b;->i(I)V

    .line 134
    .line 135
    .line 136
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 137
    .line 138
    iput-boolean v8, v5, La/ikq;->i:Z

    .line 139
    .line 140
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 141
    .line 142
    if-eqz v5, :cond_e

    .line 143
    .line 144
    iget v6, v5, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 145
    .line 146
    if-ltz v6, :cond_e

    .line 147
    .line 148
    if-ge v6, v3, :cond_e

    .line 149
    .line 150
    iput v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 151
    .line 152
    :cond_e
    iget-object v6, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:La/hkq;

    .line 153
    .line 154
    iget-boolean v9, v6, La/hkq;->f:Z

    .line 155
    .line 156
    const/high16 v10, -0x80000000

    .line 157
    .line 158
    const/4 v11, -0x1

    .line 159
    if-eqz v9, :cond_f

    .line 160
    .line 161
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 162
    .line 163
    if-ne v9, v11, :cond_f

    .line 164
    .line 165
    if-eqz v5, :cond_28

    .line 166
    .line 167
    :cond_f
    invoke-virtual {v6}, La/hkq;->b()V

    .line 168
    .line 169
    .line 170
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 171
    .line 172
    iget-boolean v9, v2, La/the0;->g:Z

    .line 173
    .line 174
    if-nez v9, :cond_1d

    .line 175
    .line 176
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 177
    .line 178
    if-ne v9, v11, :cond_10

    .line 179
    .line 180
    goto/16 :goto_a

    .line 181
    .line 182
    :cond_10
    if-ltz v9, :cond_1c

    .line 183
    .line 184
    invoke-virtual {v2}, La/the0;->b()I

    .line 185
    .line 186
    .line 187
    move-result v12

    .line 188
    if-lt v9, v12, :cond_11

    .line 189
    .line 190
    goto/16 :goto_9

    .line 191
    .line 192
    :cond_11
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 193
    .line 194
    iput v9, v6, La/hkq;->a:I

    .line 195
    .line 196
    iget-object v12, v4, Lcom/google/android/flexbox/b;->c:[I

    .line 197
    .line 198
    aget v9, v12, v9

    .line 199
    .line 200
    iput v9, v6, La/hkq;->b:I

    .line 201
    .line 202
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 203
    .line 204
    if-eqz v9, :cond_12

    .line 205
    .line 206
    invoke-virtual {v2}, La/the0;->b()I

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    iget v9, v9, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 211
    .line 212
    if-ltz v9, :cond_12

    .line 213
    .line 214
    if-ge v9, v12, :cond_12

    .line 215
    .line 216
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 217
    .line 218
    invoke-virtual {v9}, La/pa80;->m()I

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    iget v5, v5, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->b:I

    .line 223
    .line 224
    add-int/2addr v9, v5

    .line 225
    iput v9, v6, La/hkq;->c:I

    .line 226
    .line 227
    iput-boolean v7, v6, La/hkq;->g:Z

    .line 228
    .line 229
    iput v11, v6, La/hkq;->b:I

    .line 230
    .line 231
    goto/16 :goto_11

    .line 232
    .line 233
    :cond_12
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1:I

    .line 234
    .line 235
    if-ne v5, v10, :cond_1a

    .line 236
    .line 237
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 238
    .line 239
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/b;->D(I)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    if-eqz v5, :cond_17

    .line 244
    .line 245
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 246
    .line 247
    invoke-virtual {v9, v5}, La/pa80;->e(Landroid/view/View;)I

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 252
    .line 253
    invoke-virtual {v12}, La/pa80;->n()I

    .line 254
    .line 255
    .line 256
    move-result v12

    .line 257
    if-le v9, v12, :cond_13

    .line 258
    .line 259
    invoke-virtual {v6}, La/hkq;->a()V

    .line 260
    .line 261
    .line 262
    goto/16 :goto_11

    .line 263
    .line 264
    :cond_13
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 265
    .line 266
    invoke-virtual {v9, v5}, La/pa80;->g(Landroid/view/View;)I

    .line 267
    .line 268
    .line 269
    move-result v9

    .line 270
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 271
    .line 272
    invoke-virtual {v12}, La/pa80;->m()I

    .line 273
    .line 274
    .line 275
    move-result v12

    .line 276
    sub-int/2addr v9, v12

    .line 277
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 278
    .line 279
    if-gez v9, :cond_14

    .line 280
    .line 281
    invoke-virtual {v12}, La/pa80;->m()I

    .line 282
    .line 283
    .line 284
    move-result v5

    .line 285
    iput v5, v6, La/hkq;->c:I

    .line 286
    .line 287
    iput-boolean v8, v6, La/hkq;->e:Z

    .line 288
    .line 289
    goto/16 :goto_11

    .line 290
    .line 291
    :cond_14
    invoke-virtual {v12}, La/pa80;->i()I

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 296
    .line 297
    invoke-virtual {v12, v5}, La/pa80;->d(Landroid/view/View;)I

    .line 298
    .line 299
    .line 300
    move-result v12

    .line 301
    sub-int/2addr v9, v12

    .line 302
    if-gez v9, :cond_15

    .line 303
    .line 304
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 305
    .line 306
    invoke-virtual {v5}, La/pa80;->i()I

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    iput v5, v6, La/hkq;->c:I

    .line 311
    .line 312
    iput-boolean v7, v6, La/hkq;->e:Z

    .line 313
    .line 314
    goto/16 :goto_11

    .line 315
    .line 316
    :cond_15
    iget-boolean v9, v6, La/hkq;->e:Z

    .line 317
    .line 318
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 319
    .line 320
    if-eqz v9, :cond_16

    .line 321
    .line 322
    invoke-virtual {v12, v5}, La/pa80;->d(Landroid/view/View;)I

    .line 323
    .line 324
    .line 325
    move-result v5

    .line 326
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 327
    .line 328
    invoke-virtual {v9}, La/pa80;->o()I

    .line 329
    .line 330
    .line 331
    move-result v9

    .line 332
    add-int/2addr v9, v5

    .line 333
    goto :goto_7

    .line 334
    :cond_16
    invoke-virtual {v12, v5}, La/pa80;->g(Landroid/view/View;)I

    .line 335
    .line 336
    .line 337
    move-result v9

    .line 338
    :goto_7
    iput v9, v6, La/hkq;->c:I

    .line 339
    .line 340
    goto/16 :goto_11

    .line 341
    .line 342
    :cond_17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->I()I

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    if-lez v5, :cond_19

    .line 347
    .line 348
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 349
    .line 350
    .line 351
    move-result-object v5

    .line 352
    if-eqz v5, :cond_19

    .line 353
    .line 354
    invoke-static {v5}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 355
    .line 356
    .line 357
    move-result v5

    .line 358
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 359
    .line 360
    if-ge v9, v5, :cond_18

    .line 361
    .line 362
    move v5, v7

    .line 363
    goto :goto_8

    .line 364
    :cond_18
    move v5, v8

    .line 365
    :goto_8
    iput-boolean v5, v6, La/hkq;->e:Z

    .line 366
    .line 367
    :cond_19
    invoke-virtual {v6}, La/hkq;->a()V

    .line 368
    .line 369
    .line 370
    goto/16 :goto_11

    .line 371
    .line 372
    :cond_1a
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 373
    .line 374
    .line 375
    move-result v5

    .line 376
    if-nez v5, :cond_1b

    .line 377
    .line 378
    iget-boolean v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 379
    .line 380
    if-eqz v5, :cond_1b

    .line 381
    .line 382
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1:I

    .line 383
    .line 384
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 385
    .line 386
    invoke-virtual {v9}, La/pa80;->j()I

    .line 387
    .line 388
    .line 389
    move-result v9

    .line 390
    sub-int/2addr v5, v9

    .line 391
    iput v5, v6, La/hkq;->c:I

    .line 392
    .line 393
    goto/16 :goto_11

    .line 394
    .line 395
    :cond_1b
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 396
    .line 397
    invoke-virtual {v5}, La/pa80;->m()I

    .line 398
    .line 399
    .line 400
    move-result v5

    .line 401
    iget v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1:I

    .line 402
    .line 403
    add-int/2addr v5, v9

    .line 404
    iput v5, v6, La/hkq;->c:I

    .line 405
    .line 406
    goto/16 :goto_11

    .line 407
    .line 408
    :cond_1c
    :goto_9
    iput v11, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 409
    .line 410
    iput v10, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1:I

    .line 411
    .line 412
    :cond_1d
    :goto_a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->I()I

    .line 413
    .line 414
    .line 415
    move-result v5

    .line 416
    if-nez v5, :cond_1e

    .line 417
    .line 418
    goto/16 :goto_10

    .line 419
    .line 420
    :cond_1e
    iget-boolean v5, v6, La/hkq;->e:Z

    .line 421
    .line 422
    if-eqz v5, :cond_1f

    .line 423
    .line 424
    invoke-virtual {v2}, La/the0;->b()I

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    invoke-virtual {v0, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->b1(I)Landroid/view/View;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    goto :goto_b

    .line 433
    :cond_1f
    invoke-virtual {v2}, La/the0;->b()I

    .line 434
    .line 435
    .line 436
    move-result v5

    .line 437
    invoke-virtual {v0, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z0(I)Landroid/view/View;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    :goto_b
    if-eqz v5, :cond_26

    .line 442
    .line 443
    iget-object v9, v6, La/hkq;->h:Lcom/google/android/flexbox/FlexboxLayoutManager;

    .line 444
    .line 445
    iget-boolean v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->q:Z

    .line 446
    .line 447
    if-nez v12, :cond_20

    .line 448
    .line 449
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y:La/pa80;

    .line 450
    .line 451
    goto :goto_c

    .line 452
    :cond_20
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 453
    .line 454
    :goto_c
    invoke-virtual {v9}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 455
    .line 456
    .line 457
    move-result v13

    .line 458
    if-nez v13, :cond_22

    .line 459
    .line 460
    iget-boolean v13, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->t:Z

    .line 461
    .line 462
    if-eqz v13, :cond_22

    .line 463
    .line 464
    iget-boolean v13, v6, La/hkq;->e:Z

    .line 465
    .line 466
    if-eqz v13, :cond_21

    .line 467
    .line 468
    invoke-virtual {v12, v5}, La/pa80;->g(Landroid/view/View;)I

    .line 469
    .line 470
    .line 471
    move-result v13

    .line 472
    invoke-virtual {v12}, La/pa80;->o()I

    .line 473
    .line 474
    .line 475
    move-result v12

    .line 476
    add-int/2addr v12, v13

    .line 477
    iput v12, v6, La/hkq;->c:I

    .line 478
    .line 479
    goto :goto_d

    .line 480
    :cond_21
    invoke-virtual {v12, v5}, La/pa80;->d(Landroid/view/View;)I

    .line 481
    .line 482
    .line 483
    move-result v12

    .line 484
    iput v12, v6, La/hkq;->c:I

    .line 485
    .line 486
    goto :goto_d

    .line 487
    :cond_22
    iget-boolean v13, v6, La/hkq;->e:Z

    .line 488
    .line 489
    if-eqz v13, :cond_23

    .line 490
    .line 491
    invoke-virtual {v12, v5}, La/pa80;->d(Landroid/view/View;)I

    .line 492
    .line 493
    .line 494
    move-result v13

    .line 495
    invoke-virtual {v12}, La/pa80;->o()I

    .line 496
    .line 497
    .line 498
    move-result v12

    .line 499
    add-int/2addr v12, v13

    .line 500
    iput v12, v6, La/hkq;->c:I

    .line 501
    .line 502
    goto :goto_d

    .line 503
    :cond_23
    invoke-virtual {v12, v5}, La/pa80;->g(Landroid/view/View;)I

    .line 504
    .line 505
    .line 506
    move-result v12

    .line 507
    iput v12, v6, La/hkq;->c:I

    .line 508
    .line 509
    :goto_d
    invoke-static {v5}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 510
    .line 511
    .line 512
    move-result v5

    .line 513
    iput v5, v6, La/hkq;->a:I

    .line 514
    .line 515
    iput-boolean v8, v6, La/hkq;->g:Z

    .line 516
    .line 517
    iget-object v12, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 518
    .line 519
    iget-object v12, v12, Lcom/google/android/flexbox/b;->c:[I

    .line 520
    .line 521
    if-eq v5, v11, :cond_24

    .line 522
    .line 523
    goto :goto_e

    .line 524
    :cond_24
    move v5, v8

    .line 525
    :goto_e
    aget v5, v12, v5

    .line 526
    .line 527
    if-eq v5, v11, :cond_25

    .line 528
    .line 529
    goto :goto_f

    .line 530
    :cond_25
    move v5, v8

    .line 531
    :goto_f
    iput v5, v6, La/hkq;->b:I

    .line 532
    .line 533
    iget-object v5, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 534
    .line 535
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 536
    .line 537
    .line 538
    move-result v5

    .line 539
    iget v12, v6, La/hkq;->b:I

    .line 540
    .line 541
    if-le v5, v12, :cond_27

    .line 542
    .line 543
    iget-object v5, v9, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 544
    .line 545
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v5

    .line 549
    check-cast v5, Lcom/google/android/flexbox/a;

    .line 550
    .line 551
    iget v5, v5, Lcom/google/android/flexbox/a;->o:I

    .line 552
    .line 553
    iput v5, v6, La/hkq;->a:I

    .line 554
    .line 555
    goto :goto_11

    .line 556
    :cond_26
    :goto_10
    invoke-virtual {v6}, La/hkq;->a()V

    .line 557
    .line 558
    .line 559
    iput v8, v6, La/hkq;->a:I

    .line 560
    .line 561
    iput v8, v6, La/hkq;->b:I

    .line 562
    .line 563
    :cond_27
    :goto_11
    iput-boolean v7, v6, La/hkq;->f:Z

    .line 564
    .line 565
    :cond_28
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/b;->C(La/msj;)V

    .line 566
    .line 567
    .line 568
    iget-boolean v5, v6, La/hkq;->e:Z

    .line 569
    .line 570
    if-eqz v5, :cond_29

    .line 571
    .line 572
    invoke-virtual {v0, v6, v8, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->o1(La/hkq;ZZ)V

    .line 573
    .line 574
    .line 575
    goto :goto_12

    .line 576
    :cond_29
    invoke-virtual {v0, v6, v8, v7}, Lcom/google/android/flexbox/FlexboxLayoutManager;->n1(La/hkq;ZZ)V

    .line 577
    .line 578
    .line 579
    :goto_12
    iget v5, v0, Landroidx/recyclerview/widget/b;->n:I

    .line 580
    .line 581
    iget v9, v0, Landroidx/recyclerview/widget/b;->l:I

    .line 582
    .line 583
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 584
    .line 585
    .line 586
    move-result v14

    .line 587
    iget v5, v0, Landroidx/recyclerview/widget/b;->o:I

    .line 588
    .line 589
    iget v9, v0, Landroidx/recyclerview/widget/b;->m:I

    .line 590
    .line 591
    invoke-static {v5, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 592
    .line 593
    .line 594
    move-result v15

    .line 595
    iget v5, v0, Landroidx/recyclerview/widget/b;->n:I

    .line 596
    .line 597
    iget v9, v0, Landroidx/recyclerview/widget/b;->o:I

    .line 598
    .line 599
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 600
    .line 601
    .line 602
    move-result v12

    .line 603
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->k1:Landroid/content/Context;

    .line 604
    .line 605
    if-eqz v12, :cond_2c

    .line 606
    .line 607
    iget v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h1:I

    .line 608
    .line 609
    if-eq v12, v10, :cond_2a

    .line 610
    .line 611
    if-eq v12, v5, :cond_2a

    .line 612
    .line 613
    move v10, v7

    .line 614
    goto :goto_13

    .line 615
    :cond_2a
    move v10, v8

    .line 616
    :goto_13
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 617
    .line 618
    iget-boolean v7, v12, La/ikq;->b:Z

    .line 619
    .line 620
    if-eqz v7, :cond_2b

    .line 621
    .line 622
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 623
    .line 624
    .line 625
    move-result-object v7

    .line 626
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 627
    .line 628
    .line 629
    move-result-object v7

    .line 630
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 631
    .line 632
    goto :goto_14

    .line 633
    :cond_2b
    iget v7, v12, La/ikq;->a:I

    .line 634
    .line 635
    :goto_14
    move/from16 v16, v7

    .line 636
    .line 637
    goto :goto_16

    .line 638
    :cond_2c
    iget v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i1:I

    .line 639
    .line 640
    if-eq v7, v10, :cond_2d

    .line 641
    .line 642
    if-eq v7, v9, :cond_2d

    .line 643
    .line 644
    const/4 v10, 0x1

    .line 645
    goto :goto_15

    .line 646
    :cond_2d
    move v10, v8

    .line 647
    :goto_15
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 648
    .line 649
    iget-boolean v12, v7, La/ikq;->b:Z

    .line 650
    .line 651
    if-eqz v12, :cond_2e

    .line 652
    .line 653
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 654
    .line 655
    .line 656
    move-result-object v7

    .line 657
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 658
    .line 659
    .line 660
    move-result-object v7

    .line 661
    iget v7, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 662
    .line 663
    goto :goto_14

    .line 664
    :cond_2e
    iget v7, v7, La/ikq;->a:I

    .line 665
    .line 666
    goto :goto_14

    .line 667
    :goto_16
    iput v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->h1:I

    .line 668
    .line 669
    iput v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->i1:I

    .line 670
    .line 671
    iget v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m1:I

    .line 672
    .line 673
    const/4 v7, 0x0

    .line 674
    iget-object v9, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n1:La/tyj;

    .line 675
    .line 676
    if-ne v5, v11, :cond_32

    .line 677
    .line 678
    iget v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 679
    .line 680
    if-ne v12, v11, :cond_2f

    .line 681
    .line 682
    if-eqz v10, :cond_32

    .line 683
    .line 684
    :cond_2f
    iget-boolean v3, v6, La/hkq;->e:Z

    .line 685
    .line 686
    if-eqz v3, :cond_30

    .line 687
    .line 688
    goto/16 :goto_19

    .line 689
    .line 690
    :cond_30
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 691
    .line 692
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 693
    .line 694
    .line 695
    iput-object v7, v9, La/tyj;->a:Ljava/util/List;

    .line 696
    .line 697
    iput v8, v9, La/tyj;->b:I

    .line 698
    .line 699
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 700
    .line 701
    .line 702
    move-result v3

    .line 703
    iget v5, v6, La/hkq;->a:I

    .line 704
    .line 705
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 706
    .line 707
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n1:La/tyj;

    .line 708
    .line 709
    if-eqz v3, :cond_31

    .line 710
    .line 711
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 712
    .line 713
    const/16 v17, 0x0

    .line 714
    .line 715
    move-object/from16 v19, v3

    .line 716
    .line 717
    move/from16 v18, v5

    .line 718
    .line 719
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(La/tyj;IIIIILjava/util/List;)V

    .line 720
    .line 721
    .line 722
    goto :goto_17

    .line 723
    :cond_31
    move/from16 v18, v5

    .line 724
    .line 725
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 726
    .line 727
    const/16 v17, 0x0

    .line 728
    .line 729
    move/from16 v19, v15

    .line 730
    .line 731
    move v15, v14

    .line 732
    move/from16 v14, v19

    .line 733
    .line 734
    move-object/from16 v19, v3

    .line 735
    .line 736
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(La/tyj;IIIIILjava/util/List;)V

    .line 737
    .line 738
    .line 739
    move/from16 v20, v15

    .line 740
    .line 741
    move v15, v14

    .line 742
    move/from16 v14, v20

    .line 743
    .line 744
    :goto_17
    iget-object v3, v9, La/tyj;->a:Ljava/util/List;

    .line 745
    .line 746
    iput-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 747
    .line 748
    invoke-virtual {v4, v14, v15, v8}, Lcom/google/android/flexbox/b;->h(III)V

    .line 749
    .line 750
    .line 751
    invoke-virtual {v4, v8}, Lcom/google/android/flexbox/b;->u(I)V

    .line 752
    .line 753
    .line 754
    iget-object v3, v4, Lcom/google/android/flexbox/b;->c:[I

    .line 755
    .line 756
    iget v4, v6, La/hkq;->a:I

    .line 757
    .line 758
    aget v3, v3, v4

    .line 759
    .line 760
    iput v3, v6, La/hkq;->b:I

    .line 761
    .line 762
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 763
    .line 764
    iput v3, v4, La/ikq;->c:I

    .line 765
    .line 766
    goto/16 :goto_19

    .line 767
    .line 768
    :cond_32
    iget v10, v6, La/hkq;->a:I

    .line 769
    .line 770
    if-eq v5, v11, :cond_33

    .line 771
    .line 772
    invoke-static {v5, v10}, Ljava/lang/Math;->min(II)I

    .line 773
    .line 774
    .line 775
    move-result v10

    .line 776
    :cond_33
    iput-object v7, v9, La/tyj;->a:Ljava/util/List;

    .line 777
    .line 778
    iput v8, v9, La/tyj;->b:I

    .line 779
    .line 780
    invoke-virtual {v0}, Lcom/google/android/flexbox/FlexboxLayoutManager;->k()Z

    .line 781
    .line 782
    .line 783
    move-result v5

    .line 784
    iget-object v7, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 785
    .line 786
    if-eqz v5, :cond_35

    .line 787
    .line 788
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 789
    .line 790
    .line 791
    move-result v5

    .line 792
    if-lez v5, :cond_34

    .line 793
    .line 794
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 795
    .line 796
    invoke-virtual {v4, v10, v3}, Lcom/google/android/flexbox/b;->d(ILjava/util/List;)V

    .line 797
    .line 798
    .line 799
    iget v3, v6, La/hkq;->a:I

    .line 800
    .line 801
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 802
    .line 803
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 804
    .line 805
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n1:La/tyj;

    .line 806
    .line 807
    move/from16 v18, v3

    .line 808
    .line 809
    move-object/from16 v19, v5

    .line 810
    .line 811
    move/from16 v17, v10

    .line 812
    .line 813
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(La/tyj;IIIIILjava/util/List;)V

    .line 814
    .line 815
    .line 816
    goto :goto_18

    .line 817
    :cond_34
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/b;->i(I)V

    .line 818
    .line 819
    .line 820
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 821
    .line 822
    const/16 v18, -0x1

    .line 823
    .line 824
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 825
    .line 826
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n1:La/tyj;

    .line 827
    .line 828
    const/16 v17, 0x0

    .line 829
    .line 830
    move-object/from16 v19, v3

    .line 831
    .line 832
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(La/tyj;IIIIILjava/util/List;)V

    .line 833
    .line 834
    .line 835
    goto :goto_18

    .line 836
    :cond_35
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 837
    .line 838
    .line 839
    move-result v5

    .line 840
    if-lez v5, :cond_36

    .line 841
    .line 842
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 843
    .line 844
    invoke-virtual {v4, v10, v3}, Lcom/google/android/flexbox/b;->d(ILjava/util/List;)V

    .line 845
    .line 846
    .line 847
    iget v3, v6, La/hkq;->a:I

    .line 848
    .line 849
    iget-object v5, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 850
    .line 851
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 852
    .line 853
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n1:La/tyj;

    .line 854
    .line 855
    move/from16 v17, v15

    .line 856
    .line 857
    move v15, v14

    .line 858
    move/from16 v14, v17

    .line 859
    .line 860
    move/from16 v18, v3

    .line 861
    .line 862
    move-object/from16 v19, v5

    .line 863
    .line 864
    move/from16 v17, v10

    .line 865
    .line 866
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(La/tyj;IIIIILjava/util/List;)V

    .line 867
    .line 868
    .line 869
    move v10, v15

    .line 870
    move v15, v14

    .line 871
    move v14, v10

    .line 872
    move/from16 v10, v17

    .line 873
    .line 874
    goto :goto_18

    .line 875
    :cond_36
    invoke-virtual {v4, v3}, Lcom/google/android/flexbox/b;->i(I)V

    .line 876
    .line 877
    .line 878
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 879
    .line 880
    const/16 v18, -0x1

    .line 881
    .line 882
    iget-object v12, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->w:Lcom/google/android/flexbox/b;

    .line 883
    .line 884
    iget-object v13, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->n1:La/tyj;

    .line 885
    .line 886
    const/16 v17, 0x0

    .line 887
    .line 888
    move/from16 v19, v15

    .line 889
    .line 890
    move v15, v14

    .line 891
    move/from16 v14, v19

    .line 892
    .line 893
    move-object/from16 v19, v3

    .line 894
    .line 895
    invoke-virtual/range {v12 .. v19}, Lcom/google/android/flexbox/b;->b(La/tyj;IIIIILjava/util/List;)V

    .line 896
    .line 897
    .line 898
    move/from16 v20, v15

    .line 899
    .line 900
    move v15, v14

    .line 901
    move/from16 v14, v20

    .line 902
    .line 903
    :goto_18
    iget-object v3, v9, La/tyj;->a:Ljava/util/List;

    .line 904
    .line 905
    iput-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 906
    .line 907
    invoke-virtual {v4, v14, v15, v10}, Lcom/google/android/flexbox/b;->h(III)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v4, v10}, Lcom/google/android/flexbox/b;->u(I)V

    .line 911
    .line 912
    .line 913
    :goto_19
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 914
    .line 915
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y0(La/msj;La/the0;La/ikq;)I

    .line 916
    .line 917
    .line 918
    iget-boolean v3, v6, La/hkq;->e:Z

    .line 919
    .line 920
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 921
    .line 922
    if-eqz v3, :cond_37

    .line 923
    .line 924
    iget v3, v4, La/ikq;->e:I

    .line 925
    .line 926
    const/4 v5, 0x1

    .line 927
    invoke-virtual {v0, v6, v5, v8}, Lcom/google/android/flexbox/FlexboxLayoutManager;->n1(La/hkq;ZZ)V

    .line 928
    .line 929
    .line 930
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 931
    .line 932
    invoke-virtual {v0, v1, v2, v4}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y0(La/msj;La/the0;La/ikq;)I

    .line 933
    .line 934
    .line 935
    iget-object v4, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 936
    .line 937
    iget v4, v4, La/ikq;->e:I

    .line 938
    .line 939
    goto :goto_1a

    .line 940
    :cond_37
    const/4 v5, 0x1

    .line 941
    iget v4, v4, La/ikq;->e:I

    .line 942
    .line 943
    invoke-virtual {v0, v6, v5, v8}, Lcom/google/android/flexbox/FlexboxLayoutManager;->o1(La/hkq;ZZ)V

    .line 944
    .line 945
    .line 946
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 947
    .line 948
    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/flexbox/FlexboxLayoutManager;->Y0(La/msj;La/the0;La/ikq;)I

    .line 949
    .line 950
    .line 951
    iget-object v3, v0, Lcom/google/android/flexbox/FlexboxLayoutManager;->z:La/ikq;

    .line 952
    .line 953
    iget v3, v3, La/ikq;->e:I

    .line 954
    .line 955
    :goto_1a
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->I()I

    .line 956
    .line 957
    .line 958
    move-result v7

    .line 959
    if-lez v7, :cond_39

    .line 960
    .line 961
    iget-boolean v6, v6, La/hkq;->e:Z

    .line 962
    .line 963
    if-eqz v6, :cond_38

    .line 964
    .line 965
    invoke-virtual {v0, v4, v1, v2, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1(ILa/msj;La/the0;Z)I

    .line 966
    .line 967
    .line 968
    move-result v4

    .line 969
    add-int/2addr v4, v3

    .line 970
    invoke-virtual {v0, v4, v1, v2, v8}, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1(ILa/msj;La/the0;Z)I

    .line 971
    .line 972
    .line 973
    return-void

    .line 974
    :cond_38
    invoke-virtual {v0, v3, v1, v2, v5}, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1(ILa/msj;La/the0;Z)I

    .line 975
    .line 976
    .line 977
    move-result v3

    .line 978
    add-int/2addr v3, v4

    .line 979
    invoke-virtual {v0, v3, v1, v2, v8}, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1(ILa/msj;La/the0;Z)I

    .line 980
    .line 981
    .line 982
    :cond_39
    :goto_1b
    return-void
.end method

.method public final setFlexLines(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->v:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final t0(La/the0;)V
    .locals 1

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 3
    .line 4
    const/4 p1, -0x1

    .line 5
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->f1:I

    .line 6
    .line 7
    const/high16 v0, -0x80000000

    .line 8
    .line 9
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->g1:I

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->m1:I

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->A:La/hkq;

    .line 14
    .line 15
    invoke-virtual {p1}, La/hkq;->b()V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->j1:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/util/SparseArray;->clear()V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final u0(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->F0()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final v0()Landroid/os/Parcelable;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->Z:Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iget v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 11
    .line 12
    iput v1, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 13
    .line 14
    iget v0, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->b:I

    .line 15
    .line 16
    iput v0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->b:I

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    new-instance v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/b;->I()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-lez v1, :cond_1

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/b;->H(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Landroidx/recyclerview/widget/b;->T(Landroid/view/View;)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    iput v2, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 40
    .line 41
    iget-object v2, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 42
    .line 43
    invoke-virtual {v2, v1}, La/pa80;->g(Landroid/view/View;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object p0, p0, Lcom/google/android/flexbox/FlexboxLayoutManager;->B:La/pa80;

    .line 48
    .line 49
    invoke-virtual {p0}, La/pa80;->m()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    sub-int/2addr v1, p0

    .line 54
    iput v1, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->b:I

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_1
    const/4 p0, -0x1

    .line 58
    iput p0, v0, Lcom/google/android/flexbox/FlexboxLayoutManager$SavedState;->a:I

    .line 59
    .line 60
    return-object v0
.end method

.method public final w(La/the0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->U0(La/the0;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final x(La/the0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->V0(La/the0;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final y(La/the0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->W0(La/the0;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final z(La/the0;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/flexbox/FlexboxLayoutManager;->U0(La/the0;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
