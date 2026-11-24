.class public final La/x2d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final g:La/v0h0;


# instance fields
.field public final a:F

.field public final b:F

.field public final c:F

.field public final d:La/agk0;

.field public final e:La/agk0;

.field public final f:La/agk0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/sfc;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/sfc;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/e6c;

    .line 9
    .line 10
    const/16 v2, 0x1d

    .line 11
    .line 12
    invoke-direct {v1, v2}, La/e6c;-><init>(B)V

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v0}, La/qxw;->L(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/v0h0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, La/x2d;->g:La/v0h0;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(FFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/x2d;->a:F

    .line 5
    .line 6
    iput p2, p0, La/x2d;->b:F

    .line 7
    .line 8
    iput p3, p0, La/x2d;->c:F

    .line 9
    .line 10
    invoke-static {p1}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, La/x2d;->d:La/agk0;

    .line 15
    .line 16
    invoke-static {p3}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/x2d;->e:La/agk0;

    .line 21
    .line 22
    invoke-static {p2}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, La/x2d;->f:La/agk0;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 3

    .line 1
    iget-object v0, p0, La/x2d;->d:La/agk0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/agk0;->l()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    cmpg-float v1, v1, v2

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    iget-object p0, p0, La/x2d;->f:La/agk0;

    .line 14
    .line 15
    invoke-virtual {p0}, La/agk0;->l()F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-virtual {v0}, La/agk0;->l()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    div-float/2addr p0, v0

    .line 24
    return p0
.end method

.method public final b(F)V
    .locals 2

    .line 1
    iget-object v0, p0, La/x2d;->d:La/agk0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/agk0;->l()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p1, v0, v1}, La/l1e0;->c(FFF)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget-object p0, p0, La/x2d;->f:La/agk0;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/agk0;->m(F)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final c(F)V
    .locals 0

    .line 1
    iget-object p0, p0, La/x2d;->d:La/agk0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/agk0;->m(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/x2d;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/x2d;

    .line 12
    .line 13
    iget v1, p0, La/x2d;->a:F

    .line 14
    .line 15
    iget v3, p1, La/x2d;->a:F

    .line 16
    .line 17
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget v1, p0, La/x2d;->b:F

    .line 25
    .line 26
    iget v3, p1, La/x2d;->b:F

    .line 27
    .line 28
    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget p0, p0, La/x2d;->c:F

    .line 36
    .line 37
    iget p1, p1, La/x2d;->c:F

    .line 38
    .line 39
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/x2d;->a:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, La/x2d;->b:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget p0, p0, La/x2d;->c:F

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", initialHeightOffset="

    .line 2
    .line 3
    const-string v1, ", initialContentOffset="

    .line 4
    .line 5
    iget v2, p0, La/x2d;->a:F

    .line 6
    .line 7
    iget v3, p0, La/x2d;->b:F

    .line 8
    .line 9
    const-string v4, "CollapsingToolbarScrollState(initialHeightOffsetLimit="

    .line 10
    .line 11
    invoke-static {v2, v3, v4, v0, v1}, La/dw9;->s(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ")"

    .line 16
    .line 17
    iget p0, p0, La/x2d;->c:F

    .line 18
    .line 19
    invoke-static {v0, p0, v1}, La/kng0;->o(Ljava/lang/StringBuilder;FLjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
