.class public final La/ag80;
.super La/f3k;
.source "SourceFile"

# interfaces
.implements La/vj50;
.implements La/v6z;


# instance fields
.field public q:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

.field public final r:La/agk0;

.field public final s:La/ek50;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/f3k;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ag80;->q:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-static {p1}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, La/ag80;->r:La/agk0;

    .line 15
    .line 16
    new-instance p1, La/ek50;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-direct {p1, p0, v0}, La/ek50;-><init>(La/vj50;La/yj50;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/ag80;->s:La/ek50;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final C(IJ)J
    .locals 3

    .line 1
    const-wide v0, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr p2, v0

    .line 7
    long-to-int p2, p2

    .line 8
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 p3, 0x1

    .line 13
    if-ne p1, p3, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, La/ag80;->q:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-lez p1, :cond_1

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    cmpl-float p3, p2, p1

    .line 25
    .line 26
    if-lez p3, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, La/ag80;->r:La/agk0;

    .line 29
    .line 30
    invoke-virtual {p0}, La/agk0;->l()F

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    cmpl-float p3, p3, p1

    .line 35
    .line 36
    if-lez p3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, La/agk0;->l()F

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    cmpl-float v2, p3, p2

    .line 43
    .line 44
    if-lez v2, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move p2, p3

    .line 48
    :goto_0
    invoke-virtual {p0}, La/agk0;->l()F

    .line 49
    .line 50
    .line 51
    move-result p3

    .line 52
    sub-float/2addr p3, p2

    .line 53
    invoke-virtual {p0, p3}, La/agk0;->m(F)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    int-to-long p0, p0

    .line 61
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    int-to-long p2, p2

    .line 66
    const/16 v2, 0x20

    .line 67
    .line 68
    shl-long/2addr p0, v2

    .line 69
    and-long/2addr p2, v0

    .line 70
    or-long/2addr p0, p2

    .line 71
    return-wide p0

    .line 72
    :cond_1
    const-wide/16 p0, 0x0

    .line 73
    .line 74
    return-wide p0
.end method

.method public final R0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/ag80;->s:La/ek50;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final S(IJJ)J
    .locals 1

    .line 1
    const-wide p2, 0xffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    and-long/2addr p4, p2

    .line 7
    long-to-int p4, p4

    .line 8
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result p4

    .line 12
    const/4 p5, 0x1

    .line 13
    if-ne p1, p5, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, La/ag80;->q:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->G()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-lez p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    cmpg-float p5, p4, p1

    .line 25
    .line 26
    if-gez p5, :cond_0

    .line 27
    .line 28
    iget-object p5, p0, La/ag80;->q:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 29
    .line 30
    iget p5, p5, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 31
    .line 32
    const/4 v0, 0x3

    .line 33
    if-ne p5, v0, :cond_0

    .line 34
    .line 35
    iget-object p0, p0, La/ag80;->r:La/agk0;

    .line 36
    .line 37
    invoke-virtual {p0}, La/agk0;->l()F

    .line 38
    .line 39
    .line 40
    move-result p5

    .line 41
    const v0, 0x3e4ccccd    # 0.2f

    .line 42
    .line 43
    .line 44
    mul-float/2addr v0, p4

    .line 45
    sub-float/2addr p5, v0

    .line 46
    invoke-virtual {p0, p5}, La/agk0;->m(F)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    int-to-long p0, p0

    .line 54
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 55
    .line 56
    .line 57
    move-result p4

    .line 58
    int-to-long p4, p4

    .line 59
    const/16 v0, 0x20

    .line 60
    .line 61
    shl-long/2addr p0, v0

    .line 62
    and-long/2addr p2, p4

    .line 63
    or-long/2addr p0, p2

    .line 64
    return-wide p0

    .line 65
    :cond_0
    const-wide/16 p0, 0x0

    .line 66
    .line 67
    return-wide p0
.end method

.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/ag80;->r:La/agk0;

    .line 5
    .line 6
    invoke-virtual {p0}, La/agk0;->l()F

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    invoke-static {p0}, La/si30;->b(F)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    neg-int v0, p0

    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-static {v1, v0, p3, p4}, La/r4e;->i(IIJ)J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iget v0, p2, La/pu90;->a:I

    .line 25
    .line 26
    invoke-static {v0, p3, p4}, La/r4e;->g(IJ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v1, p2, La/pu90;->b:I

    .line 31
    .line 32
    add-int/2addr v1, p0

    .line 33
    invoke-static {v1, p3, p4}, La/r4e;->f(IJ)I

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    new-instance p3, La/cam;

    .line 38
    .line 39
    const/16 p4, 0xf

    .line 40
    .line 41
    invoke-direct {p3, p2, p4}, La/cam;-><init>(La/pu90;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v0, p0, p3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method

.method public final g(JJLa/zje;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p1, p0, La/ag80;->r:La/agk0;

    .line 2
    .line 3
    invoke-virtual {p1}, La/agk0;->l()F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 p2, 0x0

    .line 8
    cmpg-float p1, p1, p2

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    new-instance p0, La/g6u0;

    .line 13
    .line 14
    const-wide/16 p1, 0x0

    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, La/g6u0;-><init>(J)V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    new-instance p2, La/c670;

    .line 25
    .line 26
    const/4 p5, 0x7

    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-direct {p2, p0, v0, p5}, La/c670;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x3

    .line 32
    invoke-static {p1, v0, v0, p2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 33
    .line 34
    .line 35
    new-instance p0, La/g6u0;

    .line 36
    .line 37
    invoke-direct {p0, p3, p4}, La/g6u0;-><init>(J)V

    .line 38
    .line 39
    .line 40
    return-object p0
.end method
