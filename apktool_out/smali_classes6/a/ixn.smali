.class public final synthetic La/ixn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/c0d;

.field public final synthetic b:La/k43;

.field public final synthetic c:La/wz40;

.field public final synthetic d:I

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:La/wz40;


# direct methods
.method public synthetic constructor <init>(La/c0d;La/k43;La/wz40;IZZLa/wz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ixn;->a:La/c0d;

    iput-object p2, p0, La/ixn;->b:La/k43;

    iput-object p3, p0, La/ixn;->c:La/wz40;

    iput p4, p0, La/ixn;->d:I

    iput-boolean p5, p0, La/ixn;->e:Z

    iput-boolean p6, p0, La/ixn;->f:Z

    iput-object p7, p0, La/ixn;->g:La/wz40;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v1, p1

    .line 2
    check-cast v1, La/o43;

    .line 3
    .line 4
    move-object v6, p2

    .line 5
    check-cast v6, La/fet;

    .line 6
    .line 7
    move-object/from16 p1, p3

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    and-int/lit8 v0, p1, 0x6

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const/4 v0, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x2

    .line 31
    :goto_0
    or-int/2addr p1, v0

    .line 32
    :cond_1
    and-int/lit8 v0, p1, 0x13

    .line 33
    .line 34
    const/16 v2, 0x12

    .line 35
    .line 36
    if-eq v0, v2, :cond_2

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v0, 0x0

    .line 41
    :goto_1
    and-int/lit8 v2, p1, 0x1

    .line 42
    .line 43
    invoke-virtual {v6, v2, v0}, La/fet;->U(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    iget-object v0, p0, La/ixn;->a:La/c0d;

    .line 50
    .line 51
    iget-object v2, p0, La/ixn;->b:La/k43;

    .line 52
    .line 53
    invoke-static {v0, v2, v6}, La/wha0;->N(La/c0d;La/k43;La/fet;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v11

    .line 57
    iget-boolean v8, p0, La/ixn;->e:Z

    .line 58
    .line 59
    invoke-virtual {v6, v8}, La/fet;->h(Z)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-boolean v9, p0, La/ixn;->f:Z

    .line 64
    .line 65
    invoke-virtual {v6, v9}, La/fet;->h(Z)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    or-int/2addr v0, v3

    .line 70
    invoke-virtual {v6, v11, v12}, La/fet;->f(J)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    or-int/2addr v0, v3

    .line 75
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    if-nez v0, :cond_3

    .line 80
    .line 81
    sget-object v0, La/ukd;->a:La/cl5;

    .line 82
    .line 83
    if-ne v3, v0, :cond_4

    .line 84
    .line 85
    :cond_3
    new-instance v7, La/kxn;

    .line 86
    .line 87
    iget-object v10, p0, La/ixn;->g:La/wz40;

    .line 88
    .line 89
    invoke-direct/range {v7 .. v12}, La/kxn;-><init>(ZZLa/wz40;J)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v6, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    move-object v3, v7

    .line 96
    :cond_4
    move-object v5, v3

    .line 97
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 98
    .line 99
    shl-int/lit8 p1, p1, 0x3

    .line 100
    .line 101
    and-int/lit8 p1, p1, 0x70

    .line 102
    .line 103
    or-int/lit16 v7, p1, 0xc00

    .line 104
    .line 105
    const/4 v0, 0x0

    .line 106
    iget-object v3, p0, La/ixn;->c:La/wz40;

    .line 107
    .line 108
    iget v4, p0, La/ixn;->d:I

    .line 109
    .line 110
    invoke-static/range {v0 .. v7}, La/kkb;->d(La/mm40;La/o43;La/k43;La/wz40;ILkotlin/jvm/functions/Function0;La/fet;I)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    invoke-virtual {v6}, La/fet;->X()V

    .line 115
    .line 116
    .line 117
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0
.end method
