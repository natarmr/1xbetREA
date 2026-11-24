.class public abstract La/wa5;
.super La/cgd;
.source "SourceFile"


# instance fields
.field public f:La/psj;

.field public g:I

.field public h:F

.field public i:[F

.field public j:I

.field public k:I

.field public l:I

.field public m:Z

.field public n:Z

.field public o:Landroid/graphics/DashPathEffect;

.field public final p:Ljava/util/ArrayList;

.field public q:Z

.field public r:Z

.field public s:F

.field public t:F

.field public u:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/cgd;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, -0x777778

    .line 5
    .line 6
    .line 7
    iput v0, p0, La/wa5;->g:I

    .line 8
    .line 9
    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    .line 11
    iput v0, p0, La/wa5;->h:F

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    new-array v1, v0, [F

    .line 15
    .line 16
    iput-object v1, p0, La/wa5;->i:[F

    .line 17
    .line 18
    const/4 v1, 0x6

    .line 19
    iput v1, p0, La/wa5;->l:I

    .line 20
    .line 21
    iput-boolean v0, p0, La/wa5;->m:Z

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    iput-boolean v1, p0, La/wa5;->n:Z

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-object v1, p0, La/wa5;->o:Landroid/graphics/DashPathEffect;

    .line 28
    .line 29
    iput-boolean v0, p0, La/wa5;->q:Z

    .line 30
    .line 31
    iput-boolean v0, p0, La/wa5;->r:Z

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    iput v0, p0, La/wa5;->s:F

    .line 35
    .line 36
    iput v0, p0, La/wa5;->t:F

    .line 37
    .line 38
    iput v0, p0, La/wa5;->u:F

    .line 39
    .line 40
    const/high16 v0, 0x41200000    # 10.0f

    .line 41
    .line 42
    invoke-static {v0}, La/dut0;->c(F)F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iput v0, p0, La/cgd;->d:F

    .line 47
    .line 48
    const/high16 v0, 0x40a00000    # 5.0f

    .line 49
    .line 50
    invoke-static {v0}, La/dut0;->c(F)F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iput v1, p0, La/cgd;->b:F

    .line 55
    .line 56
    invoke-static {v0}, La/dut0;->c(F)F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput v0, p0, La/cgd;->c:F

    .line 61
    .line 62
    new-instance v0, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, La/wa5;->p:Ljava/util/ArrayList;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public a(FF)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La/wa5;->q:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget p1, p0, La/wa5;->t:F

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sub-float/2addr p1, v1

    .line 10
    :goto_0
    iget-boolean v0, p0, La/wa5;->r:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget p2, p0, La/wa5;->s:F

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    add-float/2addr p2, v1

    .line 18
    :goto_1
    sub-float v0, p2, p1

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    cmpl-float v0, v0, v1

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    const/high16 v0, 0x3f800000    # 1.0f

    .line 29
    .line 30
    add-float/2addr p2, v0

    .line 31
    sub-float/2addr p1, v0

    .line 32
    :cond_2
    iput p1, p0, La/wa5;->t:F

    .line 33
    .line 34
    iput p2, p0, La/wa5;->s:F

    .line 35
    .line 36
    sub-float/2addr p2, p1

    .line 37
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iput p1, p0, La/wa5;->u:F

    .line 42
    .line 43
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move-object v2, v0

    .line 5
    :goto_0
    iget-object v3, p0, La/wa5;->i:[F

    .line 6
    .line 7
    array-length v4, v3

    .line 8
    if-ge v1, v4, :cond_3

    .line 9
    .line 10
    if-ltz v1, :cond_1

    .line 11
    .line 12
    array-length v3, v3

    .line 13
    if-lt v1, v3, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p0}, La/wa5;->c()La/e3u0;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    iget-object v4, p0, La/wa5;->i:[F

    .line 21
    .line 22
    aget v4, v4, v1

    .line 23
    .line 24
    invoke-virtual {v3, v4}, La/e3u0;->a(F)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    goto :goto_2

    .line 29
    :cond_1
    :goto_1
    move-object v3, v0

    .line 30
    :goto_2
    if-eqz v3, :cond_2

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-ge v4, v5, :cond_2

    .line 41
    .line 42
    move-object v2, v3

    .line 43
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    return-object v2
.end method

.method public final c()La/e3u0;
    .locals 5

    .line 1
    iget-object v0, p0, La/wa5;->f:La/psj;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, v0, La/psj;->b:I

    .line 6
    .line 7
    iget v2, p0, La/wa5;->k:I

    .line 8
    .line 9
    if-eq v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    :cond_1
    :goto_0
    new-instance v0, La/psj;

    .line 14
    .line 15
    iget v1, p0, La/wa5;->k:I

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput v1, v0, La/psj;->b:I

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuffer;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_1
    if-ge v3, v1, :cond_3

    .line 29
    .line 30
    if-nez v3, :cond_2

    .line 31
    .line 32
    const-string v4, "."

    .line 33
    .line 34
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 35
    .line 36
    .line 37
    :cond_2
    const-string v4, "0"

    .line 38
    .line 39
    invoke-virtual {v2, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 40
    .line 41
    .line 42
    add-int/lit8 v3, v3, 0x1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_3
    new-instance v1, Ljava/text/DecimalFormat;

    .line 46
    .line 47
    new-instance v3, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v4, "###,###,###,##0"

    .line 50
    .line 51
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iput-object v1, v0, La/psj;->a:Ljava/text/DecimalFormat;

    .line 69
    .line 70
    iput-object v0, p0, La/wa5;->f:La/psj;

    .line 71
    .line 72
    return-object v0
.end method
