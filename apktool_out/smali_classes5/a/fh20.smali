.class public final synthetic La/fh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/cit0;

.field public final synthetic b:D

.field public final synthetic c:Z

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(La/cit0;DZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fh20;->a:La/cit0;

    iput-wide p2, p0, La/fh20;->b:D

    iput-boolean p4, p0, La/fh20;->c:Z

    iput-boolean p5, p0, La/fh20;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/oyg0;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, La/b820;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, v2, La/b820;->d:La/rvj0;

    .line 18
    .line 19
    iget-object v1, v3, La/rvj0;->a:La/dx6;

    .line 20
    .line 21
    iget-object v4, v1, La/dx6;->b:La/vw6;

    .line 22
    .line 23
    iget-object v5, v0, La/fh20;->a:La/cit0;

    .line 24
    .line 25
    iget-wide v9, v5, La/cit0;->C:D

    .line 26
    .line 27
    iget-wide v11, v5, La/cit0;->E:D

    .line 28
    .line 29
    iget-object v6, v2, La/b820;->c:La/an5;

    .line 30
    .line 31
    iget-object v6, v6, La/an5;->c:La/ql5;

    .line 32
    .line 33
    iget-object v15, v6, La/ql5;->f:Ljava/lang/String;

    .line 34
    .line 35
    iget-boolean v5, v5, La/cit0;->M:Z

    .line 36
    .line 37
    new-instance v6, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 38
    .line 39
    iget-wide v13, v0, La/fh20;->b:D

    .line 40
    .line 41
    iget-boolean v7, v0, La/fh20;->c:Z

    .line 42
    .line 43
    invoke-direct {v6, v13, v14, v7}, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;-><init>(DZ)V

    .line 44
    .line 45
    .line 46
    const-wide/16 v7, 0x0

    .line 47
    .line 48
    cmpg-double v7, v9, v7

    .line 49
    .line 50
    const/4 v8, 0x1

    .line 51
    if-nez v7, :cond_0

    .line 52
    .line 53
    move v7, v8

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v7, 0x0

    .line 56
    :goto_0
    xor-int/lit8 v19, v7, 0x1

    .line 57
    .line 58
    const/16 v22, 0x0

    .line 59
    .line 60
    const v23, 0xc083

    .line 61
    .line 62
    .line 63
    move/from16 v16, v5

    .line 64
    .line 65
    move-object/from16 v18, v6

    .line 66
    .line 67
    const-wide/16 v5, 0x0

    .line 68
    .line 69
    move/from16 v17, v8

    .line 70
    .line 71
    const-wide/16 v7, 0x0

    .line 72
    .line 73
    move/from16 v20, v17

    .line 74
    .line 75
    const/16 v17, 0x0

    .line 76
    .line 77
    iget-boolean v0, v0, La/fh20;->d:Z

    .line 78
    .line 79
    const/16 v21, 0x0

    .line 80
    .line 81
    move/from16 v24, v20

    .line 82
    .line 83
    move/from16 v20, v0

    .line 84
    .line 85
    move/from16 v0, v24

    .line 86
    .line 87
    invoke-static/range {v4 .. v23}, La/vw6;->a(La/vw6;DDDDDLjava/lang/String;ZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZZZI)La/vw6;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    const/4 v5, 0x0

    .line 92
    invoke-static {v1, v5, v4, v0}, La/dx6;->a(La/dx6;La/a8q0;La/vw6;I)La/dx6;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    const/4 v8, 0x0

    .line 97
    const/16 v9, 0x1e

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    const/4 v7, 0x0

    .line 101
    invoke-static/range {v3 .. v9}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    const/4 v14, 0x0

    .line 106
    const/16 v15, 0x1ff7

    .line 107
    .line 108
    const/4 v3, 0x0

    .line 109
    const/4 v4, 0x0

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x0

    .line 112
    const/4 v11, 0x0

    .line 113
    const/4 v12, 0x0

    .line 114
    const/4 v13, 0x0

    .line 115
    invoke-static/range {v2 .. v15}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    return-object v0
.end method
