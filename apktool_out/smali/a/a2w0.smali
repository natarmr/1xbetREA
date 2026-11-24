.class public final La/a2w0;
.super La/wa5;
.source "SourceFile"


# instance fields
.field public final v:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/wa5;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/a2w0;->v:I

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput p1, p0, La/cgd;->c:F

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(FF)V
    .locals 4

    .line 1
    sub-float v0, p2, p1

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/high16 v0, 0x3f800000    # 1.0f

    .line 13
    .line 14
    add-float/2addr p2, v0

    .line 15
    sub-float/2addr p1, v0

    .line 16
    :cond_0
    sub-float v0, p2, p1

    .line 17
    .line 18
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v1, p0, La/wa5;->q:Z

    .line 23
    .line 24
    const/high16 v2, 0x41200000    # 10.0f

    .line 25
    .line 26
    const/high16 v3, 0x42c80000    # 100.0f

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget p1, p0, La/wa5;->t:F

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    div-float v1, v0, v3

    .line 34
    .line 35
    mul-float/2addr v1, v2

    .line 36
    sub-float/2addr p1, v1

    .line 37
    :goto_0
    iput p1, p0, La/wa5;->t:F

    .line 38
    .line 39
    iget-boolean v1, p0, La/wa5;->r:Z

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    iget p2, p0, La/wa5;->s:F

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    div-float/2addr v0, v3

    .line 47
    mul-float/2addr v0, v2

    .line 48
    add-float/2addr p2, v0

    .line 49
    :goto_1
    iput p2, p0, La/wa5;->s:F

    .line 50
    .line 51
    sub-float/2addr p1, p2

    .line 52
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iput p1, p0, La/wa5;->u:F

    .line 57
    .line 58
    return-void
.end method

.method public final d(Landroid/graphics/Paint;)F
    .locals 2

    .line 1
    iget v0, p0, La/cgd;->d:F

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/wa5;->b()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, La/dut0;->a:Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    float-to-int p1, p1

    .line 17
    int-to-float p1, p1

    .line 18
    iget p0, p0, La/cgd;->b:F

    .line 19
    .line 20
    const/high16 v0, 0x40000000    # 2.0f

    .line 21
    .line 22
    mul-float/2addr p0, v0

    .line 23
    add-float/2addr p0, p1

    .line 24
    const/high16 p1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 25
    .line 26
    invoke-static {p0, p1}, Ljava/lang/Math;->min(FF)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-static {p1, p0}, Ljava/lang/Math;->max(FF)F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method
