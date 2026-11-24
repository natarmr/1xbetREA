.class public final synthetic La/qbg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:La/mie0;

.field public final synthetic b:La/hie0;

.field public final synthetic c:La/jie0;

.field public final synthetic d:La/fhl;

.field public final synthetic e:F

.field public final synthetic f:J

.field public final synthetic g:F

.field public final synthetic h:La/jie0;


# direct methods
.method public synthetic constructor <init>(La/mie0;La/hie0;La/jie0;La/fhl;FJFLa/jie0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qbg;->a:La/mie0;

    iput-object p2, p0, La/qbg;->b:La/hie0;

    iput-object p3, p0, La/qbg;->c:La/jie0;

    iput-object p4, p0, La/qbg;->d:La/fhl;

    iput p5, p0, La/qbg;->e:F

    iput-wide p6, p0, La/qbg;->f:J

    iput p8, p0, La/qbg;->g:F

    iput-object p9, p0, La/qbg;->h:La/jie0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/qbg;->a:La/mie0;

    .line 4
    .line 5
    iget-object v1, v1, La/mie0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object v1, v0, La/qbg;->b:La/hie0;

    .line 10
    .line 11
    iget-boolean v1, v1, La/hie0;->a:Z

    .line 12
    .line 13
    iget-object v2, v0, La/qbg;->d:La/fhl;

    .line 14
    .line 15
    iget v3, v0, La/qbg;->e:F

    .line 16
    .line 17
    const-wide v4, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v1, v0, La/qbg;->c:La/jie0;

    .line 25
    .line 26
    iget v1, v1, La/jie0;->a:F

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {v2}, La/fhl;->d()J

    .line 30
    .line 31
    .line 32
    move-result-wide v6

    .line 33
    and-long/2addr v6, v4

    .line 34
    long-to-int v1, v6

    .line 35
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-float/2addr v1, v3

    .line 40
    :goto_0
    iget-object v6, v0, La/qbg;->h:La/jie0;

    .line 41
    .line 42
    iget v7, v6, La/jie0;->a:F

    .line 43
    .line 44
    iget v8, v0, La/qbg;->g:F

    .line 45
    .line 46
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 47
    .line 48
    .line 49
    move-result v9

    .line 50
    int-to-long v9, v9

    .line 51
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    int-to-long v11, v7

    .line 56
    const/16 v7, 0x20

    .line 57
    .line 58
    shl-long/2addr v9, v7

    .line 59
    and-long/2addr v11, v4

    .line 60
    or-long/2addr v9, v11

    .line 61
    invoke-interface {v2}, La/fhl;->d()J

    .line 62
    .line 63
    .line 64
    move-result-wide v11

    .line 65
    shr-long/2addr v11, v7

    .line 66
    long-to-int v11, v11

    .line 67
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v11

    .line 71
    const/high16 v12, 0x40000000    # 2.0f

    .line 72
    .line 73
    mul-float/2addr v8, v12

    .line 74
    sub-float/2addr v11, v8

    .line 75
    iget v6, v6, La/jie0;->a:F

    .line 76
    .line 77
    sub-float/2addr v1, v6

    .line 78
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    int-to-long v11, v6

    .line 83
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    int-to-long v13, v1

    .line 88
    shl-long/2addr v11, v7

    .line 89
    and-long/2addr v13, v4

    .line 90
    or-long/2addr v11, v13

    .line 91
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    int-to-long v13, v1

    .line 96
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    move-wide v15, v4

    .line 101
    int-to-long v4, v1

    .line 102
    shl-long v6, v13, v7

    .line 103
    .line 104
    and-long v3, v4, v15

    .line 105
    .line 106
    or-long/2addr v3, v6

    .line 107
    move-wide v7, v11

    .line 108
    const/4 v11, 0x0

    .line 109
    const/16 v12, 0xf0

    .line 110
    .line 111
    iget-wide v0, v0, La/qbg;->f:J

    .line 112
    .line 113
    move-wide v5, v9

    .line 114
    move-wide v9, v3

    .line 115
    move-wide v3, v0

    .line 116
    invoke-static/range {v2 .. v12}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 117
    .line 118
    .line 119
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object v0
.end method
