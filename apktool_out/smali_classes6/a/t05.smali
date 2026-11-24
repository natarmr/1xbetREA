.class public final synthetic La/t05;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/lr8;

.field public final synthetic b:La/j83;

.field public final synthetic c:La/y9q0;

.field public final synthetic d:Z

.field public final synthetic e:F

.field public final synthetic f:I

.field public final synthetic g:La/k6z;

.field public final synthetic h:Z

.field public final synthetic i:La/w6k;

.field public final synthetic j:La/mrq;

.field public final synthetic k:La/g9q0;


# direct methods
.method public synthetic constructor <init>(La/lr8;La/j83;La/y9q0;ZFILa/k6z;ZLa/w6k;La/mrq;La/g9q0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/t05;->a:La/lr8;

    iput-object p2, p0, La/t05;->b:La/j83;

    iput-object p3, p0, La/t05;->c:La/y9q0;

    iput-boolean p4, p0, La/t05;->d:Z

    iput p5, p0, La/t05;->e:F

    iput p6, p0, La/t05;->f:I

    iput-object p7, p0, La/t05;->g:La/k6z;

    iput-boolean p8, p0, La/t05;->h:Z

    iput-object p9, p0, La/t05;->i:La/w6k;

    iput-object p10, p0, La/t05;->j:La/mrq;

    iput-object p11, p0, La/t05;->k:La/g9q0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/daq0;

    .line 6
    .line 7
    iget-wide v5, v1, La/daq0;->a:J

    .line 8
    .line 9
    iget-object v2, v0, La/t05;->c:La/y9q0;

    .line 10
    .line 11
    iget-boolean v1, v0, La/t05;->d:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, v2, La/y9q0;->b:La/eo80;

    .line 16
    .line 17
    iget-wide v3, v1, La/eo80;->c:J

    .line 18
    .line 19
    :goto_0
    move-wide/from16 v16, v3

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-static {v5, v6}, La/idm0;->m(J)V

    .line 23
    .line 24
    .line 25
    const-wide v3, 0xff00000000L

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    and-long/2addr v3, v5

    .line 31
    invoke-static {v5, v6}, La/daq0;->c(J)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget v7, v0, La/t05;->e:F

    .line 36
    .line 37
    mul-float/2addr v1, v7

    .line 38
    invoke-static {v1, v3, v4}, La/idm0;->v(FJ)J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    goto :goto_0

    .line 43
    :goto_1
    const/16 v19, 0x0

    .line 44
    .line 45
    const v20, 0xfdfffd

    .line 46
    .line 47
    .line 48
    const-wide/16 v3, 0x0

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x0

    .line 52
    const/4 v9, 0x0

    .line 53
    const-wide/16 v10, 0x0

    .line 54
    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    const/4 v14, 0x0

    .line 58
    const/4 v15, 0x0

    .line 59
    const/16 v18, 0x0

    .line 60
    .line 61
    invoke-static/range {v2 .. v20}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 62
    .line 63
    .line 64
    move-result-object v23

    .line 65
    iget-object v1, v0, La/t05;->a:La/lr8;

    .line 66
    .line 67
    iget-wide v1, v1, La/lr8;->b:J

    .line 68
    .line 69
    const/16 v32, 0x420

    .line 70
    .line 71
    iget-object v3, v0, La/t05;->k:La/g9q0;

    .line 72
    .line 73
    iget-object v4, v0, La/t05;->b:La/j83;

    .line 74
    .line 75
    const/16 v24, 0x1

    .line 76
    .line 77
    iget-boolean v5, v0, La/t05;->h:Z

    .line 78
    .line 79
    iget v6, v0, La/t05;->f:I

    .line 80
    .line 81
    iget-object v7, v0, La/t05;->g:La/k6z;

    .line 82
    .line 83
    iget-object v8, v0, La/t05;->i:La/w6k;

    .line 84
    .line 85
    iget-object v0, v0, La/t05;->j:La/mrq;

    .line 86
    .line 87
    move-object/from16 v31, v0

    .line 88
    .line 89
    move-wide/from16 v27, v1

    .line 90
    .line 91
    move-object/from16 v21, v3

    .line 92
    .line 93
    move-object/from16 v22, v4

    .line 94
    .line 95
    move/from16 v25, v5

    .line 96
    .line 97
    move/from16 v26, v6

    .line 98
    .line 99
    move-object/from16 v29, v7

    .line 100
    .line 101
    move-object/from16 v30, v8

    .line 102
    .line 103
    invoke-static/range {v21 .. v32}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, La/a9q0;->f()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    return-object v0
.end method
