.class public final La/sp8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/bq8;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:La/ugd;

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:Z

.field public final synthetic g:La/yjj0;

.field public final synthetic h:J

.field public final synthetic i:J

.field public final synthetic j:F

.field public final synthetic k:Lkotlin/jvm/functions/Function2;

.field public final synthetic l:La/ugd;

.field public final synthetic m:La/xdr;


# direct methods
.method public constructor <init>(La/bq8;Lkotlin/jvm/functions/Function2;La/ugd;FFZLa/yjj0;JJFLkotlin/jvm/functions/Function2;La/ugd;La/xdr;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sp8;->a:La/bq8;

    .line 5
    .line 6
    iput-object p2, p0, La/sp8;->b:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    iput-object p3, p0, La/sp8;->c:La/ugd;

    .line 9
    .line 10
    iput p4, p0, La/sp8;->d:F

    .line 11
    .line 12
    iput p5, p0, La/sp8;->e:F

    .line 13
    .line 14
    iput-boolean p6, p0, La/sp8;->f:Z

    .line 15
    .line 16
    iput-object p7, p0, La/sp8;->g:La/yjj0;

    .line 17
    .line 18
    iput-wide p8, p0, La/sp8;->h:J

    .line 19
    .line 20
    iput-wide p10, p0, La/sp8;->i:J

    .line 21
    .line 22
    iput p12, p0, La/sp8;->j:F

    .line 23
    .line 24
    iput-object p13, p0, La/sp8;->k:Lkotlin/jvm/functions/Function2;

    .line 25
    .line 26
    iput-object p14, p0, La/sp8;->l:La/ugd;

    .line 27
    .line 28
    iput-object p15, p0, La/sp8;->m:La/xdr;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    check-cast v6, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x1

    .line 19
    if-eq v2, v3, :cond_0

    .line 20
    .line 21
    move v2, v4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v2, 0x0

    .line 24
    :goto_0
    and-int/2addr v1, v4

    .line 25
    invoke-virtual {v6, v1, v2}, La/fet;->U(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iget-object v1, v0, La/sp8;->a:La/bq8;

    .line 32
    .line 33
    iget-object v5, v1, La/bq8;->a:La/xpj0;

    .line 34
    .line 35
    new-instance v2, La/qp8;

    .line 36
    .line 37
    iget-object v3, v0, La/sp8;->c:La/ugd;

    .line 38
    .line 39
    iget v4, v0, La/sp8;->d:F

    .line 40
    .line 41
    invoke-direct {v2, v3, v4}, La/qp8;-><init>(La/ugd;F)V

    .line 42
    .line 43
    .line 44
    const v3, -0x1ef8305a

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v2, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    new-instance v7, La/rp8;

    .line 52
    .line 53
    iget-object v3, v0, La/sp8;->k:Lkotlin/jvm/functions/Function2;

    .line 54
    .line 55
    iget-object v4, v0, La/sp8;->l:La/ugd;

    .line 56
    .line 57
    iget-object v8, v0, La/sp8;->a:La/bq8;

    .line 58
    .line 59
    iget v9, v0, La/sp8;->d:F

    .line 60
    .line 61
    iget v10, v0, La/sp8;->e:F

    .line 62
    .line 63
    iget-boolean v11, v0, La/sp8;->f:Z

    .line 64
    .line 65
    iget-object v12, v0, La/sp8;->g:La/yjj0;

    .line 66
    .line 67
    iget-wide v13, v0, La/sp8;->h:J

    .line 68
    .line 69
    move-object/from16 p1, v2

    .line 70
    .line 71
    move-object/from16 v18, v3

    .line 72
    .line 73
    iget-wide v2, v0, La/sp8;->i:J

    .line 74
    .line 75
    iget v15, v0, La/sp8;->j:F

    .line 76
    .line 77
    move-object/from16 v19, v4

    .line 78
    .line 79
    move/from16 v17, v15

    .line 80
    .line 81
    move-wide v15, v2

    .line 82
    invoke-direct/range {v7 .. v19}, La/rp8;-><init>(La/bq8;FFZLa/yjj0;JJFLkotlin/jvm/functions/Function2;La/ugd;)V

    .line 83
    .line 84
    .line 85
    const v2, -0x309d717b

    .line 86
    .line 87
    .line 88
    invoke-static {v2, v7, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    new-instance v3, La/a8;

    .line 93
    .line 94
    iget-object v4, v0, La/sp8;->m:La/xdr;

    .line 95
    .line 96
    const/4 v7, 0x6

    .line 97
    invoke-direct {v3, v4, v1, v7}, La/a8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 98
    .line 99
    .line 100
    const v4, -0x4242b29c

    .line 101
    .line 102
    .line 103
    invoke-static {v4, v3, v6}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    if-nez v4, :cond_1

    .line 116
    .line 117
    sget-object v4, La/ukd;->a:La/cl5;

    .line 118
    .line 119
    if-ne v8, v4, :cond_2

    .line 120
    .line 121
    :cond_1
    new-instance v8, La/vb8;

    .line 122
    .line 123
    invoke-direct {v8, v1, v7}, La/vb8;-><init>(Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_2
    move-object v4, v8

    .line 130
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 131
    .line 132
    const/16 v7, 0xdb0

    .line 133
    .line 134
    iget-object v0, v0, La/sp8;->b:Lkotlin/jvm/functions/Function2;

    .line 135
    .line 136
    move-object/from16 v1, p1

    .line 137
    .line 138
    invoke-static/range {v0 .. v7}, La/epv0;->h(Lkotlin/jvm/functions/Function2;La/ugd;La/ugd;La/ugd;Lkotlin/jvm/functions/Function0;La/xpj0;La/fet;I)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    invoke-virtual {v6}, La/fet;->X()V

    .line 143
    .line 144
    .line 145
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object v0
.end method
