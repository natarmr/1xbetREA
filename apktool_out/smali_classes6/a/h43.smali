.class public final synthetic La/h43;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La/k43;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:La/g9q0;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(ZLa/k43;Ljava/lang/String;IILjava/lang/String;La/g9q0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/h43;->a:Z

    iput-object p2, p0, La/h43;->b:La/k43;

    iput-object p3, p0, La/h43;->c:Ljava/lang/String;

    iput p4, p0, La/h43;->d:I

    iput p5, p0, La/h43;->e:I

    iput-object p6, p0, La/h43;->f:Ljava/lang/String;

    iput-object p7, p0, La/h43;->g:La/g9q0;

    iput p8, p0, La/h43;->h:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

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
    iget-boolean v2, v0, La/h43;->a:Z

    .line 8
    .line 9
    iget-object v3, v0, La/h43;->b:La/k43;

    .line 10
    .line 11
    iget-object v4, v0, La/h43;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget v5, v0, La/h43;->d:I

    .line 14
    .line 15
    iget-object v11, v0, La/h43;->g:La/g9q0;

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {v3}, La/k43;->b()La/y9q0;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    iget-wide v9, v1, La/daq0;->a:J

    .line 24
    .line 25
    iget v6, v0, La/h43;->e:I

    .line 26
    .line 27
    iget-object v7, v0, La/h43;->f:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static/range {v4 .. v11}, La/wha0;->R(Ljava/lang/String;IILjava/lang/String;La/y9q0;JLa/g9q0;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v2, v5

    .line 35
    invoke-interface {v3}, La/k43;->b()La/y9q0;

    .line 36
    .line 37
    .line 38
    move-result-object v12

    .line 39
    iget-wide v5, v1, La/daq0;->a:J

    .line 40
    .line 41
    const/16 v29, 0x0

    .line 42
    .line 43
    const v30, 0xfffffd

    .line 44
    .line 45
    .line 46
    const-wide/16 v13, 0x0

    .line 47
    .line 48
    const/16 v17, 0x0

    .line 49
    .line 50
    const/16 v18, 0x0

    .line 51
    .line 52
    const/16 v19, 0x0

    .line 53
    .line 54
    const-wide/16 v20, 0x0

    .line 55
    .line 56
    const/16 v22, 0x0

    .line 57
    .line 58
    const/16 v23, 0x0

    .line 59
    .line 60
    const/16 v24, 0x0

    .line 61
    .line 62
    const/16 v25, 0x0

    .line 63
    .line 64
    const-wide/16 v26, 0x0

    .line 65
    .line 66
    const/16 v28, 0x0

    .line 67
    .line 68
    move-wide v15, v5

    .line 69
    invoke-static/range {v12 .. v30}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    move-object v5, v4

    .line 74
    move-object v4, v11

    .line 75
    const/4 v11, 0x0

    .line 76
    const/16 v12, 0x3ec

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    const/4 v8, 0x1

    .line 80
    const-wide/16 v9, 0x0

    .line 81
    .line 82
    invoke-static/range {v4 .. v12}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    iget-wide v3, v1, La/a9q0;->c:J

    .line 87
    .line 88
    const/16 v1, 0x20

    .line 89
    .line 90
    shr-long/2addr v3, v1

    .line 91
    long-to-int v1, v3

    .line 92
    add-int/2addr v1, v2

    .line 93
    :goto_0
    iget v0, v0, La/h43;->h:I

    .line 94
    .line 95
    if-le v1, v0, :cond_1

    .line 96
    .line 97
    const/4 v0, 0x1

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    const/4 v0, 0x0

    .line 100
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    return-object v0
.end method
