.class public final La/d8k0;
.super La/muu0;
.source "SourceFile"


# static fields
.field public static final m1:Landroid/view/animation/DecelerateInterpolator;

.field public static final n1:Landroid/view/animation/AccelerateInterpolator;

.field public static final o1:La/a8k0;

.field public static final p1:La/a8k0;

.field public static final q1:La/b8k0;

.field public static final r1:La/a8k0;

.field public static final s1:La/a8k0;

.field public static final t1:La/b8k0;


# instance fields
.field public l1:La/c8k0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/d8k0;->m1:Landroid/view/animation/DecelerateInterpolator;

    .line 7
    .line 8
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/d8k0;->n1:Landroid/view/animation/AccelerateInterpolator;

    .line 14
    .line 15
    new-instance v0, La/a8k0;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, La/a8k0;-><init>(B)V

    .line 19
    .line 20
    .line 21
    sput-object v0, La/d8k0;->o1:La/a8k0;

    .line 22
    .line 23
    new-instance v0, La/a8k0;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, v1}, La/a8k0;-><init>(B)V

    .line 27
    .line 28
    .line 29
    sput-object v0, La/d8k0;->p1:La/a8k0;

    .line 30
    .line 31
    new-instance v0, La/b8k0;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-direct {v0, v1}, La/b8k0;-><init>(B)V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/d8k0;->q1:La/b8k0;

    .line 38
    .line 39
    new-instance v0, La/a8k0;

    .line 40
    .line 41
    const/4 v1, 0x2

    .line 42
    invoke-direct {v0, v1}, La/a8k0;-><init>(B)V

    .line 43
    .line 44
    .line 45
    sput-object v0, La/d8k0;->r1:La/a8k0;

    .line 46
    .line 47
    new-instance v0, La/a8k0;

    .line 48
    .line 49
    const/4 v1, 0x3

    .line 50
    invoke-direct {v0, v1}, La/a8k0;-><init>(B)V

    .line 51
    .line 52
    .line 53
    sput-object v0, La/d8k0;->s1:La/a8k0;

    .line 54
    .line 55
    new-instance v0, La/b8k0;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-direct {v0, v1}, La/b8k0;-><init>(B)V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/d8k0;->t1:La/b8k0;

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final W(Landroid/view/ViewGroup;Landroid/view/View;La/mns0;La/mns0;)Landroid/animation/ObjectAnimator;
    .locals 10

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget-object p3, p4, La/mns0;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    const-string v0, "android:slide:screenPosition"

    .line 8
    .line 9
    invoke-virtual {p3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    check-cast p3, [I

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    iget-object v0, p0, La/d8k0;->l1:La/c8k0;

    .line 24
    .line 25
    invoke-interface {v0, p2, p1}, La/c8k0;->a(Landroid/view/View;Landroid/view/ViewGroup;)F

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget-object v0, p0, La/d8k0;->l1:La/c8k0;

    .line 30
    .line 31
    invoke-interface {v0, p2, p1}, La/c8k0;->b(Landroid/view/View;Landroid/view/ViewGroup;)F

    .line 32
    .line 33
    .line 34
    move-result v5

    .line 35
    const/4 p1, 0x0

    .line 36
    aget v2, p3, p1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    aget v3, p3, p1

    .line 40
    .line 41
    sget-object v8, La/d8k0;->m1:Landroid/view/animation/DecelerateInterpolator;

    .line 42
    .line 43
    move-object v9, p0

    .line 44
    move-object v0, p2

    .line 45
    move-object v1, p4

    .line 46
    invoke-static/range {v0 .. v9}, La/tnq0;->k(Landroid/view/View;La/mns0;IIFFFFLandroid/animation/TimeInterpolator;La/muu0;)Landroid/animation/ObjectAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public final X(Landroid/view/ViewGroup;Landroid/view/View;La/mns0;La/mns0;)Landroid/animation/ObjectAnimator;
    .locals 10

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    iget-object p4, p3, La/mns0;->a:Ljava/util/HashMap;

    .line 6
    .line 7
    const-string v0, "android:slide:screenPosition"

    .line 8
    .line 9
    invoke-virtual {p4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    check-cast p4, [I

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getTranslationY()F

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    iget-object v0, p0, La/d8k0;->l1:La/c8k0;

    .line 24
    .line 25
    invoke-interface {v0, p2, p1}, La/c8k0;->a(Landroid/view/View;Landroid/view/ViewGroup;)F

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    iget-object v0, p0, La/d8k0;->l1:La/c8k0;

    .line 30
    .line 31
    invoke-interface {v0, p2, p1}, La/c8k0;->b(Landroid/view/View;Landroid/view/ViewGroup;)F

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    const/4 p1, 0x0

    .line 36
    aget v2, p4, p1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    aget v3, p4, p1

    .line 40
    .line 41
    sget-object v8, La/d8k0;->n1:Landroid/view/animation/AccelerateInterpolator;

    .line 42
    .line 43
    move-object v9, p0

    .line 44
    move-object v0, p2

    .line 45
    move-object v1, p3

    .line 46
    invoke-static/range {v0 .. v9}, La/tnq0;->k(Landroid/view/View;La/mns0;IIFFFFLandroid/animation/TimeInterpolator;La/muu0;)Landroid/animation/ObjectAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public final f(La/mns0;)V
    .locals 1

    .line 1
    invoke-static {p1}, La/muu0;->U(La/mns0;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, La/mns0;->b:Landroid/view/View;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p1, La/mns0;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    const-string p1, "android:slide:screenPosition"

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final i(La/mns0;)V
    .locals 1

    .line 1
    invoke-static {p1}, La/muu0;->U(La/mns0;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p1, La/mns0;->b:Landroid/view/View;

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p1, La/mns0;->a:Ljava/util/HashMap;

    .line 13
    .line 14
    const-string p1, "android:slide:screenPosition"

    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method
