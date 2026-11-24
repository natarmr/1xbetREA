.class public final La/zbu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:La/kmq;

.field public final synthetic b:La/mie0;

.field public final synthetic c:La/hie0;

.field public final synthetic d:La/v7i;

.field public final synthetic e:Ljava/util/List;

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(La/kmq;La/mie0;La/hie0;La/v7i;Ljava/util/List;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zbu;->a:La/kmq;

    .line 5
    .line 6
    iput-object p2, p0, La/zbu;->b:La/mie0;

    .line 7
    .line 8
    iput-object p3, p0, La/zbu;->c:La/hie0;

    .line 9
    .line 10
    iput-object p4, p0, La/zbu;->d:La/v7i;

    .line 11
    .line 12
    iput-object p5, p0, La/zbu;->e:Ljava/util/List;

    .line 13
    .line 14
    iput-boolean p6, p0, La/zbu;->f:Z

    .line 15
    .line 16
    iput-boolean p7, p0, La/zbu;->g:Z

    .line 17
    .line 18
    iput-boolean p8, p0, La/zbu;->h:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, La/ybu;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/ybu;

    .line 11
    .line 12
    iget v3, v2, La/ybu;->j:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/ybu;->j:I

    .line 22
    .line 23
    :goto_0
    move-object v11, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/ybu;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/ybu;-><init>(La/zbu;La/yje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v11, La/ybu;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v2, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v3, v11, La/ybu;->j:I

    .line 36
    .line 37
    iget-object v12, v0, La/zbu;->c:La/hie0;

    .line 38
    .line 39
    iget-object v13, v0, La/zbu;->b:La/mie0;

    .line 40
    .line 41
    const/4 v14, 0x2

    .line 42
    const/4 v4, 0x1

    .line 43
    const/4 v15, 0x0

    .line 44
    if-eqz v3, :cond_3

    .line 45
    .line 46
    if-eq v3, v4, :cond_2

    .line 47
    .line 48
    if-ne v3, v14, :cond_1

    .line 49
    .line 50
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_5

    .line 54
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v15

    .line 60
    :cond_2
    iget-object v0, v11, La/ybu;->m:La/mie0;

    .line 61
    .line 62
    iget-object v3, v11, La/ybu;->k:La/kmq;

    .line 63
    .line 64
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    move-object/from16 v5, p1

    .line 72
    .line 73
    check-cast v5, La/z9s;

    .line 74
    .line 75
    iget-boolean v6, v12, La/hie0;->a:Z

    .line 76
    .line 77
    iget-object v1, v0, La/zbu;->a:La/kmq;

    .line 78
    .line 79
    if-eqz v6, :cond_5

    .line 80
    .line 81
    iget-object v7, v5, La/z9s;->f:Ljava/util/List;

    .line 82
    .line 83
    iput-object v1, v11, La/ybu;->k:La/kmq;

    .line 84
    .line 85
    iput-object v13, v11, La/ybu;->m:La/mie0;

    .line 86
    .line 87
    iput v4, v11, La/ybu;->j:I

    .line 88
    .line 89
    iget-object v3, v0, La/zbu;->d:La/v7i;

    .line 90
    .line 91
    iget-object v4, v0, La/zbu;->e:Ljava/util/List;

    .line 92
    .line 93
    iget-boolean v8, v0, La/zbu;->f:Z

    .line 94
    .line 95
    iget-boolean v9, v0, La/zbu;->g:Z

    .line 96
    .line 97
    iget-boolean v10, v0, La/zbu;->h:Z

    .line 98
    .line 99
    invoke-virtual/range {v3 .. v11}, La/v7i;->c(Ljava/util/List;La/z9s;ZLjava/util/List;ZZZLa/zje;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-ne v0, v2, :cond_4

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_4
    move-object v3, v1

    .line 107
    move-object v1, v0

    .line 108
    move-object v0, v13

    .line 109
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    iget-object v0, v13, La/mie0;->a:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Ljava/util/List;

    .line 115
    .line 116
    invoke-static {v0, v5}, La/uzb;->M0(Ljava/util/List;La/z9s;)Ljava/util/ArrayList;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    move-object v3, v1

    .line 121
    move-object v1, v0

    .line 122
    move-object v0, v13

    .line 123
    :goto_3
    iput-object v1, v0, La/mie0;->a:Ljava/lang/Object;

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    iput-boolean v0, v12, La/hie0;->a:Z

    .line 127
    .line 128
    iget-object v0, v13, La/mie0;->a:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v15, v11, La/ybu;->k:La/kmq;

    .line 131
    .line 132
    iput-object v15, v11, La/ybu;->m:La/mie0;

    .line 133
    .line 134
    iput v14, v11, La/ybu;->j:I

    .line 135
    .line 136
    invoke-interface {v3, v0, v11}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    if-ne v0, v2, :cond_6

    .line 141
    .line 142
    :goto_4
    return-object v2

    .line 143
    :cond_6
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object v0
.end method
